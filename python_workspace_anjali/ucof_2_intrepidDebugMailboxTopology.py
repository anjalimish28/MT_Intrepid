import sys
from pathlib import Path

from general_utils import init_log, print_with_time, find_by_attr  # type: ignore
from ucof_utils import import_ucof_platform_from_file  # type: ignore

sys.path.append(str(Path(__file__).parent / "PythonClasses"))


BAUD_RATE_TO_CPP = {
    125: "BAUD_125K",
    250: "BAUD_250K",
    500: "BAUD_500K",
    1000: "BAUD_1000K",
}


def get_target_implementation(ucof_platform, device_id):
    target_implementation = None

    impl_assignment = find_by_attr(
        ucof_platform,
        "sourceID",
        device_id,
        False,
        "DeviceToImplementationAssignment",
    )

    if impl_assignment:
        target_implementation = find_by_attr(
            ucof_platform,
            "id",
            impl_assignment.targetID,
            False,
        )

    return target_implementation


def get_msg_box_extension(target_implementation):
    if not target_implementation:
        return None
    return getattr(target_implementation, "msgBoxExtension", None)


def get_can_driver_config(target_implementation):
    if not target_implementation:
        return None
    return getattr(target_implementation, "canDriverConfig", None)


def get_ref_list(obj, ref_name):
    candidates = [ref_name, f"{ref_name}_list"]

    for candidate in candidates:
        if hasattr(obj, candidate):
            value = getattr(obj, candidate)

            if value is None:
                return []

            if isinstance(value, list):
                return value

            return [value]

    return []


def get_required_attr(obj, attr_name):
    value = getattr(obj, attr_name, None)

    if value is None or value == "":
        obj_name = getattr(obj, "name", obj.__class__.__name__)
        raise ValueError(
            f"Missing required attribute '{attr_name}' on '{obj_name}' "
            f"({obj.__class__.__name__})"
        )

    return value


def get_optional_attr(obj, attr_name, default_value):
    value = getattr(obj, attr_name, None)

    if value is None or value == "":
        return default_value

    return value


def to_bool(value):
    if isinstance(value, bool):
        return value

    if value is None:
        return False

    return str(value).strip().lower() in ["true", "1", "yes"]


def cpp_bool(value):
    return "true" if to_bool(value) else "false"


def cpp_address(address_symbol):
    address_symbol = str(address_symbol).strip()

    if address_symbol.startswith("CandoSvc::"):
        return address_symbol

    return f"CandoSvc::{address_symbol}"


def cpp_can_peripheral(can_peripheral_instance):
    can_peripheral_instance = str(can_peripheral_instance).strip()

    if can_peripheral_instance.startswith("Va416x0Mmio::"):
        return can_peripheral_instance

    return f"Va416x0Mmio::{can_peripheral_instance}"


def cpp_can_operating_mode(operating_mode):
    operating_mode = str(operating_mode).strip()

    # Handles strings like "CanOperatingMode.DIAGNOSTIC"
    if "." in operating_mode:
        operating_mode = operating_mode.split(".")[-1]

    if operating_mode.startswith("Va416x0Drv::CanDriver::"):
        return operating_mode

    return f"Va416x0Drv::CanDriver::{operating_mode}"


def cpp_can_baud_rate(baud_rate):
    try:
        baud_rate_int = int(baud_rate)
    except ValueError as exc:
        raise ValueError(f"Invalid CAN baudRate value: {baud_rate}") from exc

    if baud_rate_int not in BAUD_RATE_TO_CPP:
        raise ValueError(
            f"Unsupported CAN baudRate '{baud_rate_int}'. "
            f"Add it to BAUD_RATE_TO_CPP."
        )

    return f"Va416x0Drv::CanDriver::{BAUD_RATE_TO_CPP[baud_rate_int]}"


def get_all_communication_interfaces(ucof_platform):
    communication = getattr(ucof_platform, "communication", None)
    if not communication:
        return []

    database = getattr(communication, "database", None)
    if not database:
        return []

    communication_sets = get_ref_list(database, "communicationSet")

    interfaces = []

    for communication_set in communication_sets:
        interfaces.extend(get_ref_list(communication_set, "interface"))

    return interfaces


def get_interface_by_id(ucof_platform, interface_id):
    for interface in get_all_communication_interfaces(ucof_platform):
        if getattr(interface, "id", None) == interface_id:
            return interface

    raise RuntimeError(f"No communication interface found with id '{interface_id}'.")


def get_device_mailbox_configs(ucof_platform):
    mailbox_entries = []
    device_list = ucof_platform.devices.device_list

    for ucof_device in device_list:
        device_id = ucof_device.id
        print_with_time(
            f"Checking if device with id: {device_id} has mailbox topology data..."
        )

        target_implementation = get_target_implementation(ucof_platform, device_id)

        if target_implementation:
            target_class = target_implementation.__class__.__name__
            target_name = getattr(target_implementation, "name", "<unnamed>")

            print_with_time(
                f"... implementation found: {target_class} with name: {target_name}"
            )

            msg_box = get_msg_box_extension(target_implementation)
            can_driver_config = get_can_driver_config(target_implementation)

            if msg_box:
                print_with_time(
                    f"... mailbox confirmed: {getattr(msg_box, 'name', '<unnamed>')}"
                )

                mailbox_entries.append(
                    {
                        "device": ucof_device,
                        "target": target_implementation,
                        "msgBoxExtension": msg_box,
                        "canDriverConfig": can_driver_config,
                    }
                )
            else:
                print_with_time("... implementation has no msgBoxExtension")

        else:
            print_with_time("... no DeviceToImplementationAssignment found")

    if not mailbox_entries:
        raise RuntimeError(
            "No msgBoxExtension found through DeviceToImplementationAssignment."
        )

    return mailbox_entries


def get_mailbox_entry_by_node(mailbox_entries, node_name):
    aliases = {
        "CPN": "CAN_ADDR_CPN",
        "RDC": "CAN_ADDR_RDC_2",
        "RDC_2": "CAN_ADDR_RDC_2",
    }

    wanted_symbol = aliases.get(node_name, node_name)

    for entry in mailbox_entries:
        device = entry["device"]
        msg_box = entry["msgBoxExtension"]

        device_name = getattr(device, "name", "")
        msg_box_name = getattr(msg_box, "name", "")
        node_symbol = getattr(msg_box, "nodeAddressSymbol", "")

        if node_name == device_name:
            return entry

        if node_name == msg_box_name:
            return entry

        if wanted_symbol == node_symbol:
            return entry

    available = [
        f"{getattr(entry['device'], 'name', '<unnamed device>')} -> "
        f"{getattr(entry['msgBoxExtension'], 'name', '<unnamed mailbox>')} "
        f"({getattr(entry['msgBoxExtension'], 'nodeAddressSymbol', '<missing>')})"
        for entry in mailbox_entries
    ]

    raise RuntimeError(
        f"No mailbox entry found for node '{node_name}'. Available: {available}"
    )


def collect_address_symbols(msg_box, ref_name):
    filters = get_ref_list(msg_box, ref_name)
    return [get_required_attr(f, "addressSymbol") for f in filters]


def render_address_array(decl_type, var_name, address_symbols):
    if not address_symbols:
        raise RuntimeError(f"No address symbols for {var_name}.")

    inner = ", ".join(cpp_address(symbol) for symbol in address_symbols)

    return f"static CandoSvc::CanMailbox::{decl_type} {var_name}[] = {{{inner}}};\n"


def render_outgoing_mailbox_slots(msg_box):
    slots = get_ref_list(msg_box, "outgoingMailboxSlot")

    if not slots:
        raise RuntimeError(
            f"No outgoingMailboxSlot entries found for "
            f"{getattr(msg_box, 'name', '<unnamed>')}"
        )

    entries = []

    for slot in slots:
        port_id = get_required_attr(slot, "portId")
        source_cpp = cpp_address(get_required_attr(slot, "sourceAddressSymbol"))
        destination_cpp = cpp_address(get_required_attr(slot, "destinationAddressSymbol"))
        multicast = to_bool(get_optional_attr(slot, "multicast", False))

        if multicast:
            entries.append(
                f"    {{{port_id}, {source_cpp}, {destination_cpp}, "
                f"true /*Multicast out*/}}"
            )
        else:
            entries.append(f"    {{{port_id}, {source_cpp}, {destination_cpp}}}")

    body = ",\n".join(entries)

    return f"static CandoSvc::CanMailbox::MailboxOutConfig s_canMbOut[] = {{\n{body}}};\n"


def render_can_mailbox_setup():
    return """canMailbox.setup(s_canFilterList, FW_NUM_ARRAY_ELEMENTS(s_canFilterList),
                 s_canMbOut, FW_NUM_ARRAY_ELEMENTS(s_canMbOut),
                 s_canSenderFilterList, FW_NUM_ARRAY_ELEMENTS(s_canSenderFilterList));
"""


def render_can_driver_open(ucof_platform, can_driver_config):
    if not can_driver_config:
        raise RuntimeError(
            "No canDriverConfig found on this target implementation. "
            "Add canDriverConfig to intrepid.ucof or disable driver generation."
        )

    interface_id = get_required_attr(can_driver_config, "interfaceID")
    can_interface = get_interface_by_id(ucof_platform, interface_id)

    baud_rate = get_required_attr(can_interface, "baudRate")
    can_peripheral_instance = get_required_attr(
        can_driver_config,
        "canPeripheralInstance",
    )
    operating_mode = get_required_attr(can_driver_config, "operatingMode")
    extended_id_enabled = get_required_attr(
        can_driver_config,
        "extendedIdEnabled",
    )
    ring_buffer_size = get_required_attr(can_driver_config, "ringBufferSize")

    return (
        "canDriver.open("
        f"{cpp_can_peripheral(can_peripheral_instance)}, "
        f"{cpp_can_baud_rate(baud_rate)}, "
        f"{cpp_can_operating_mode(operating_mode)}, "
        f"{cpp_bool(extended_id_enabled)}, "
        f"{ring_buffer_size}"
        ");\n"
    )


def render_can_configuration_block(ucof_platform, can_driver_config):
    main = """
// Configure CAN Controller and CAN Mailbox
"""
    main += render_can_mailbox_setup()
    main += render_can_driver_open(ucof_platform, can_driver_config)
    return main


def write_intrepid_debug_topology_into_file(ucof_platform, mailbox_entry, output_path):
    device = mailbox_entry["device"]
    target = mailbox_entry["target"]
    msg_box = mailbox_entry["msgBoxExtension"]
    can_driver_config = mailbox_entry["canDriverConfig"]

    device_name = getattr(device, "name", "<unnamed>")
    target_name = getattr(target, "name", "<unnamed>")
    target_class = target.__class__.__name__
    msg_box_name = getattr(msg_box, "name", "<unnamed>")
    node_symbol = getattr(msg_box, "nodeAddressSymbol", "<missing>")

    dest_symbols = collect_address_symbols(msg_box, "incomingDestinationFilter")
    sender_symbols = collect_address_symbols(msg_box, "senderSourceFilter")

    main = f"""// ======================================================================
// Generated CAN Mailbox topology configuration
// Source model: intrepid.ucof
// Device: {device_name}
// Target implementation: {target_class} / {target_name}
// Mailbox config: {msg_box_name}
// Node address symbol: {node_symbol}
// ======================================================================

"""

    main += render_address_array("CDSP_DADR", "s_canFilterList", dest_symbols)
    main += render_outgoing_mailbox_slots(msg_box)
    main += render_address_array("CDSP_SADR", "s_canSenderFilterList", sender_symbols)

    if can_driver_config:
        main += render_can_configuration_block(ucof_platform, can_driver_config)
    else:
        print_with_time(
            "Warning: No canDriverConfig found. CAN driver open call will not be generated."
        )

    print_with_time(f"Writing IntrepidDebug mailbox topology into file: {output_path}")

    with open(output_path, "w", encoding="utf-8") as f:
        f.write(main)


init_log()

ucof_file_path_string = "intrepid.ucof"
ucof_platform = import_ucof_platform_from_file(ucof_file_path_string)

mailbox_entries = get_device_mailbox_configs(ucof_platform)

# Supported: "CPN", "RDC_2", "CAN_ADDR_CPN", "CAN_ADDR_RDC_2".
node_to_generate = "CPN"

selected_entry = get_mailbox_entry_by_node(mailbox_entries, node_to_generate)
selected_msg_box = selected_entry["msgBoxExtension"]

node_symbol = getattr(selected_msg_box, "nodeAddressSymbol", node_to_generate)
safe_node_name = str(node_symbol).replace("CAN_ADDR_", "").lower()

output_file_name = f"IntrepidDebugMailboxTopology_{safe_node_name}.hpp"

write_intrepid_debug_topology_into_file(
    ucof_platform,
    selected_entry,
    output_file_name,
)