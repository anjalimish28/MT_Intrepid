import sys
from pathlib import Path

from general_utils import init_log, print_with_time, find_by_attr  # type: ignore
from ucof_utils import import_ucof_platform_from_file  # type: ignore

sys.path.append(str(Path(__file__).parent / "PythonClasses"))


# ----------------------------------------------------------------------
# Export mappings
# ----------------------------------------------------------------------
# These mappings only define the output constant names.
# The values and C++ datatype sizes are read from intrepid.ucof.

TIMING_EXPORT_MAP = {
    "rateDriverFrequencyHz": "RD_FRQ_HZ",
    "rateGroupDivisor1": "RG_DIV_1",
    "rateGroupDivisor2": "RG_DIV_2",
    "rateGroupDivisor3": "RG_DIV_3",
    "rateGroupDefaultOffset": "RG_DIV_DEF_OFFSET",
    "pwmResolutionBits": "PWM_RES",
}


PIN_EXPORT_MAP = {
    "Balance_Engine_0_Enable": "IO_PIN_MBS_EN",
    "Balance_Engine_0_Speed_PWM": "PWM_PIN_MBS",
    "Balance_Engine_0_Direction": "IO_PIN_MBS_DIR",
    "Gimbal_Engine_1_Enable": "IO_PIN_GIM_EN",
    "Gimbal_Engine_1_Speed_PWM": "PWM_PIN_GIM",
    "Gimbal_Engine_1_Direction": "IO_PIN_GIM_DIR",
    "Spindal_Engine_2_Enable": "IO_PIN_FLY_EN",
    "Spindal_Engine_2_Speed_PWM": "PWM_PIN_FLY",
    "Spindal_Engine_2_Direction": "IO_PIN_FLY_DIR",
}


COMMENT_MAP = {
    "RD_FRQ_HZ": "//!< Rate Driver frequency in Hz",
    "RG_DIV_1": "//!< Rate Group 1 divisor",
    "RG_DIV_2": "//!< Rate Group 2 divisor",
    "RG_DIV_3": "//!< Rate Group 3 divisor",
}


CONSTANT_ORDER = [
    "RD_FRQ_HZ",
    None,
    "RG_DIV_1",
    "RG_DIV_2",
    "RG_DIV_3",
    None,
    "RG_DIV_DEF_OFFSET",
    None,
    "PWM_RES",
    "PWM_PIN_MBS",
    "PWM_PIN_GIM",
    "PWM_PIN_FLY",
    None,
    "IO_PIN_MBS_EN",
    "IO_PIN_MBS_DIR",
    "IO_PIN_GIM_EN",
    "IO_PIN_GIM_DIR",
    "IO_PIN_FLY_EN",
    "IO_PIN_FLY_DIR",
]


COMMENT_COLUMN = 29


def get_target_implementation(ucof_platform, device_id):
    impl_assignment = find_by_attr(
        ucof_platform,
        "sourceID",
        device_id,
        False,
        "DeviceToImplementationAssignment",
    )

    if not impl_assignment:
        return None

    return find_by_attr(
        ucof_platform,
        "id",
        impl_assignment.targetID,
        False,
    )


def get_hw_rdc(ucof_platform, device_id):
    implementation = get_target_implementation(ucof_platform, device_id)

    if not implementation:
        return None

    implementation_class = implementation.__class__.__name__

    if "stm32f446re" in implementation_class:
        return implementation

    return None


def extract_timing_config(hw_rdc):
    extracted = {}

    stm_timing = getattr(hw_rdc, "stmTimingConfig", None)

    if stm_timing is None:
        print_with_time("WARNING: No stmTimingConfig found on RDC target.")
        return extracted

    for model_attr, const_name in TIMING_EXPORT_MAP.items():
        value = getattr(stm_timing, model_attr, None)
        size_attr = f"{model_attr}Size"
        size = getattr(stm_timing, size_attr, None)

        if value is None or value == "":
            print_with_time(
                f"WARNING: Missing value '{model_attr}' in stmTimingConfig; "
                f"skipping {const_name}."
            )
            continue

        if size is None or size == "":
            print_with_time(
                f"WARNING: Missing size '{size_attr}' in stmTimingConfig; "
                f"skipping {const_name}."
            )
            continue

        extracted[const_name] = {
            "value": value,
            "size": size,
        }

        print_with_time(
            f"Extracted timing config: {model_attr} -> "
            f"{const_name} = {value}, size = {size}"
        )

    return extracted


def extract_pin_config(hw_rdc):
    extracted = {}

    ports_container = getattr(hw_rdc, "ports", None)

    if not ports_container:
        print_with_time("WARNING: No ports container found on RDC target.")
        return extracted

    port_list = getattr(ports_container, "port_list", [])

    for port in port_list:
        port_name = getattr(port, "name", None)

        if port_name not in PIN_EXPORT_MAP:
            continue

        const_name = PIN_EXPORT_MAP[port_name]
        pin_value = getattr(port, "pinName", None)
        size = getattr(port, "size", None)

        if pin_value is None or pin_value == "":
            print_with_time(
                f"WARNING: Missing pinName for port '{port_name}'; "
                f"skipping {const_name}."
            )
            continue

        if size is None or size == "":
            print_with_time(
                f"WARNING: Missing size for port '{port_name}'; "
                f"skipping {const_name}."
            )
            continue

        extracted[const_name] = {
            "value": pin_value,
            "size": size,
        }

        print_with_time(
            f"Extracted pin config: {port_name} -> "
            f"{const_name} = {pin_value}, size = {size}"
        )

    return extracted


def render_constant(const_name, constant_data):
    value = constant_data["value"]
    size = constant_data["size"]
    comment = COMMENT_MAP.get(const_name)

    code = f"constexpr {size} {const_name} = {value};"

    if comment is None:
        return code + "\n"

    if len(code) < COMMENT_COLUMN:
        return code + " " * (COMMENT_COLUMN - len(code)) + comment + "\n"

    return code + " " + comment + "\n"


def get_rdc_config_header():
    return """#ifndef RDC_CONFIG_HPP_
#define RDC_CONFIG_HPP_

#include <Fw/FPrimeBasicTypes.hpp>

namespace RdcConfig
{

"""


def get_rdc_config_footer():
    return """
} // namespace RdcConfig

#endif /* RDC_CONFIG_HPP_ */
"""


def build_rdc_config_body(extracted):
    body = ""

    for const_name in CONSTANT_ORDER:
        if const_name is None:
            body += "\n"
            continue

        constant_data = extracted.get(const_name)

        if constant_data is None:
            print_with_time(
                f"WARNING: No model-derived data found for {const_name}; "
                f"skipping line."
            )
            continue

        body += render_constant(const_name, constant_data)

    return body


def write_rdc_config_into_file(extracted, output_path="RdcConfig.hpp"):
    print_with_time(f"Writing RdcConfig into file: {output_path}")

    with open(output_path, "w", encoding="utf-8") as output_file:
        output_file.write(get_rdc_config_header())
        output_file.write(build_rdc_config_body(extracted))
        output_file.write(get_rdc_config_footer())


def main():
    init_log()

    ucof_file_path_string = "intrepid.ucof"
    ucof_platform = import_ucof_platform_from_file(ucof_file_path_string)

    device_list = ucof_platform.devices.device_list

    for ucof_device in device_list:
        device_id = ucof_device.id
        device_name = getattr(ucof_device, "name", "<unnamed>")

        print_with_time(
            f"Checking if device '{device_name}' with id '{device_id}' is RDC..."
        )

        hw_rdc = get_hw_rdc(ucof_platform, device_id)

        if not hw_rdc:
            print_with_time("... NOT RDC")
            continue

        print_with_time("... confirmed")

        extracted_config = {}
        extracted_config.update(extract_timing_config(hw_rdc))
        extracted_config.update(extract_pin_config(hw_rdc))

        write_rdc_config_into_file(extracted_config)


if __name__ == "__main__":
    main()