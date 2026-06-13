import sys
from pathlib import Path

from general_utils import init_log, print_with_time, find_by_attr, find_by_class_name, select_from_list  # type: ignore
from ucof_utils import import_ucof_platform_from_file  # type: ignore

sys.path.append(str(Path(__file__).parent / "PythonClasses"))


MAILBOX_ATTR_TO_FPP_CONSTANT = {
    "numOfOutgoingMailboxes": "NumOfOutgoingMailboxes",
    "numOfIncomingMailboxes": "NumOfIncomingMailboxes",
    "smallBufferSize": "CanMailboxSmallBufferSize",
    "smallBufferCount": "CanMailboxSmallBufferCount",
    "mediumBufferSize": "CanMailboxMediumBufferSize",
    "mediumBufferCount": "CanMailboxMediumBufferCount",
    "bigBufferSize": "CanMailboxBigBufferSize",
    "bigBufferCount": "CanMailboxBigBufferCount",
}


def get_required_attr(obj, attr_name):
    value = getattr(obj, attr_name, None)
    if value is None or value == "":
        obj_name = getattr(obj, "name", obj.__class__.__name__)
        raise ValueError(
            f"Missing required attribute '{attr_name}' on '{obj_name}' "
            f"({obj.__class__.__name__})"
        )
    return value


def get_target_implementation(ucof_platform, device_id):
    target_implementation = None
    impl_assignment = find_by_attr(
        ucof_platform,
        "sourceID",
        device_id,
        False,
        "DeviceToImplementationAssignment"
    )
    if impl_assignment:
        target_implementation = find_by_attr(
            ucof_platform,
            "id",
            impl_assignment.targetID,
            False
        )
    return target_implementation


def get_msg_box_extension(target_implementation):
    if not target_implementation:
        return None
    return getattr(target_implementation, "msgBoxExtension", None)


def get_device_mailbox_configs(ucof_platform):
    """
    Find mailbox configurations through the explicit model relation:

      device -> DeviceToImplementationAssignment -> target implementation -> msgBoxExtension

    This keeps the script aligned with the RDC template style.
    """
    mailbox_entries = []
    device_list = ucof_platform.devices.device_list

    for ucof_device in device_list:
        device_id = ucof_device.id
        device_name = getattr(ucof_device, "name", "<unnamed>")
        print_with_time(
            f"Checking if device with id: {device_id} has a mailbox implementation..."
        )
        target_implementation = get_target_implementation(ucof_platform, device_id)
        if target_implementation:
            target_class = target_implementation.__class__.__name__
            target_name = getattr(target_implementation, "name", "<unnamed>")
            print_with_time(
                f"... implementation found: {target_class} with name: {target_name}"
            )
            msg_box = get_msg_box_extension(target_implementation)
            if msg_box:
                print_with_time(
                    f"... mailbox confirmed: {getattr(msg_box, 'name', '<unnamed>')}"
                )
                mailbox_entries.append({
                    "device": ucof_device,
                    "target": target_implementation,
                    "msgBoxExtension": msg_box,
                })
            else:
                print_with_time("... implementation has no msgBoxExtension")
        else:
            print_with_time("... no DeviceToImplementationAssignment found")

    if not mailbox_entries:
        raise RuntimeError(
            "No msgBoxExtension found through DeviceToImplementationAssignment."
        )
    return mailbox_entries


def extract_mailbox_values(msg_box):
    values = {}
    for model_attr, fpp_constant in MAILBOX_ATTR_TO_FPP_CONSTANT.items():
        values[fpp_constant] = get_required_attr(msg_box, model_attr)
    return values


def verify_all_mailbox_configs_equal(mailbox_value_sets):
    """
    CanMailboxCfg.fpp is a global F Prime constants file.
    Therefore all modeled node mailbox capacities and buffer sizes must match
    for this proof-of-concept generator.
    """
    if not mailbox_value_sets:
        raise RuntimeError("No mailbox values found.")

    reference_name, reference_values = mailbox_value_sets[0]
    for current_name, current_values in mailbox_value_sets[1:]:
        if current_values != reference_values:
            raise ValueError(
                "Mailbox configurations are inconsistent.\n"
                f"Reference config: {reference_name} = {reference_values}\n"
                f"Different config:  {current_name} = {current_values}\n"
                "For CanMailboxCfg.fpp generation, all msgBoxExtension objects "
                "must currently use the same mailbox capacity and buffer values."
            )
    print_with_time("All msgBoxExtension objects use consistent mailbox values.")
    return reference_values


def get_can_mailbox_cfg_header():
    return """# ======================================================================
# CAN Mailbox configuration
# ======================================================================

module CandoSvc {

  module CanMailboxCfg {

    # Less than 256 to fit in U8
"""


def get_can_mailbox_cfg_footer():
    return """
  }

}
"""


def write_can_mailbox_cfg_fpp(values, output_path="CanMailboxCfg.fpp"):
    header = get_can_mailbox_cfg_header()
    footer = get_can_mailbox_cfg_footer()
    main = ""
    main += f"    constant NumOfOutgoingMailboxes = {values['NumOfOutgoingMailboxes']}\n"
    main += f"    constant NumOfIncomingMailboxes = {values['NumOfIncomingMailboxes']}\n\n"
    main += f"    constant CanMailboxSmallBufferSize = {values['CanMailboxSmallBufferSize']}\n"
    main += f"    constant CanMailboxSmallBufferCount = {values['CanMailboxSmallBufferCount']}\n"
    main += f"    constant CanMailboxMediumBufferSize = {values['CanMailboxMediumBufferSize']}\n"
    main += f"    constant CanMailboxMediumBufferCount = {values['CanMailboxMediumBufferCount']}\n"
    main += f"    constant CanMailboxBigBufferSize = {values['CanMailboxBigBufferSize']}\n"
    main += f"    constant CanMailboxBigBufferCount = {values['CanMailboxBigBufferCount']}\n"

    print_with_time(f"Writing CanMailboxCfg into file: {output_path}")
    with open(output_path, "w", encoding="utf-8") as f:
        f.write(header)
        f.write(main)
        f.write(footer)


init_log()
ucof_file_path_string = "intrepid.ucof"
ucof_platform = import_ucof_platform_from_file(ucof_file_path_string)
mailbox_entries = get_device_mailbox_configs(ucof_platform)
mailbox_value_sets = []
for entry in mailbox_entries:
    device = entry["device"]
    msg_box = entry["msgBoxExtension"]
    device_name = getattr(device, "name", "<unnamed>")
    msg_box_name = getattr(msg_box, "name", "<unnamed>")
    print_with_time(
        f"Extracting mailbox values from device '{device_name}', "
        f"mailbox config '{msg_box_name}'"
    )
    values = extract_mailbox_values(msg_box)
    mailbox_value_sets.append((msg_box_name, values))
common_values = verify_all_mailbox_configs_equal(mailbox_value_sets)
write_can_mailbox_cfg_fpp(common_values)