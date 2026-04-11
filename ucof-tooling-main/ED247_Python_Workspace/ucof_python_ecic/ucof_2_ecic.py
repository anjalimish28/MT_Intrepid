from ecic_utils import create_root, create_channel, create_udp_socket, create_stream, add_stream_signals
import argparse 
import sys
import sys
import os
import re


#------------ucof general functions---------------------
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..', 'ucof_python_general')))
from general_utils import init_log, print_with_time, write_xml_into_file, write_list_into_csv, find_by_class_name, find_by_attr # type: ignore
from ucof_utils import import_ucof_platform_from_file, get_ecic_stream_param, get_ecic_stream_signal_list # type: ignore

#------------ucof python classes-----------------------
sys.path.append("D:/Devel/ucofWorkspace/PythonClasses")

def create_ecic_udp_socket_from_extension(udp_socket_extension, udp_socket_target_list):
    udp_socket_dest_ip = udp_socket_extension.ipAdress
    udp_socket_dest_port = udp_socket_extension.port
    udp_socket_target = create_udp_socket(udp_socket_dest_ip, udp_socket_dest_port)
    udp_socket_target_list.append(udp_socket_target)
    return udp_socket_target_list

def create_ecic_stream(ecic_stream, signal_data_list, direction_reversal):
    stream_type = type(ecic_stream).__name__
    stream_type_prefix = stream_type.split("Stream")[0].lower()
    stream_type = re.sub(r'(?<!_)Stream', r'_Stream', stream_type)
    kwargs = get_ecic_stream_param(ecic_stream, stream_type_prefix, direction_reversal)
    stream_signal_list = get_ecic_stream_signal_list(ecic_stream, platform)
    target_stream_element = create_stream(stream_type, **kwargs)
    if stream_signal_list:
        signal_data_list.append(stream_signal_list)
    #target_stream_element = add_stream_signals(target_stream_element, stream_signal_list)
    return target_stream_element, signal_data_list

def get_channel_info(channel):
    channel_name = channel.name
    print_with_time(f"Getting info for {channel_name}")
    channel_comment = channel.documentation
    channel_frame_format = channel.frameFormat
    #get header info (not all channels have headers)
    if channel.header:
      header_enable = channel.header.enable
      header_trans_ts = channel.header.transportTimestamp
    else:
      header_enable = None
      header_trans_ts = None
    return channel_name, channel_comment, header_enable, header_trans_ts

def set_a664_config(platform, target_folder_string):
    a664_message = find_by_class_name(platform, "A664Message", False)
    target_file_string = target_folder_string + "A664_Params_CSV.csv"
    a664_list = []
    if a664_message:
        message_assignment = find_by_attr(platform, "sourceID", a664_message.id, False)
        if message_assignment:
            a664_csv_header = ["destinationMAC","sourceMAC","type","sourceIP","destinationIP","TTL","Protocol","sourcePort","destinationPort","identification","flagsAndFragmentOffset","versionAndIHL","typeOfService","VL","VL_offset","NICName"]
            a664_intro = ["03:00:00:00:00:2B","02:00:00:00:03:20","0x0800","10.0.3.43","224.192.0.43","1","17","42","2010","30371","16384","69","0","42","2","Intel(R) Ethernet Connection I217-LM"]
            a664_list.append(a664_intro)
            write_list_into_csv(a664_csv_header, a664_list, ",", target_file_string)
    return None

# #--------------------main-----------------------
init_log()
parser = argparse.ArgumentParser(description="UCoF ECIC export")
parser.add_argument("filepath", help="Path to the .ucof file")
parser.add_argument("target_folder", help="Target output folder")
args = parser.parse_args()
filepath_string = args.filepath
target_folder_string = args.target_folder
platform = import_ucof_platform_from_file(filepath_string)
device_list = find_by_class_name(platform, "SuperDeviceType", True, True)
for device in device_list:
    device_name = device.name
    device_id = device.id
    ecic_name = device_name + "_ECIC"
    ecic_id = device_id
    print_with_time(f"Getting info from UCoF for device: {device_name} with {device_id}")
    target_channel_list = []
    signal_data_list = []
    port_list = find_by_class_name(device, "SuperPortType", True, True)
    for port in port_list:
        udp_socket_target_list = []
        port_id = port.id
        port_direction = port.portDirection
        port2port_assignment_list = find_by_attr(platform, "targetID", port_id, True, "PortToPortAssignment")
        port2port_assignment_list = port2port_assignment_list + find_by_attr(platform, "sourceID", port_id, True, "PortToPortAssignment")
        for port2port in port2port_assignment_list:
            port2port_id = port2port.id
            ed247_assignment = find_by_attr(platform, "targetID", port2port_id, False, "ED247Assignment")
            if ed247_assignment:
                ed247_stream_id = ed247_assignment.sourceID
                ed247_stream = find_by_attr(platform, "id", ed247_stream_id, False)
                try:
                    ed247_stream_direction = ed247_stream.direction
                except:
                    print_with_time(f"WARNING: ED247 Stream wird id: {ed247_stream_id} has no direction. InOut was assigned.")
                    ed247_stream_direction = "InOut"
            if not port_direction ==  ed247_stream_direction:
                direction_reversal = True
            else:
                direction_reversal = False
            udpSocketExtension = find_by_class_name(ed247_assignment, "UDPSocketExtension", False)
        if ed247_assignment:
            udp_socket_target_list = create_ecic_udp_socket_from_extension(udpSocketExtension, udp_socket_target_list)
            channel_name, channel_comment, header_enable, header_trans_ts = get_channel_info(ed247_stream.parent)
            target_stream_element, signal_data_list = create_ecic_stream(ed247_stream, signal_data_list, direction_reversal)
            target_channel = create_channel(udp_socket_target_list, target_stream_element, channel_name, channel_comment, header_enable, header_trans_ts)
            target_channel_list.append(target_channel)
    target_root = create_root(target_channel_list)
    write_xml_into_file(target_root, target_folder_string + ecic_name +".xml")
    if signal_data_list:
        signal_csv_header = ["Bus_Name", "Msg_No", "Signal_No", "Signal_Name", "Data_Type", "Target_Data_Type", "Data_Value", "Byte_Start", "Byte_End", "Bit_Position"]
        flattened_signal_list = [row for group in signal_data_list for row in group]
        file_name = target_folder_string + device_name + "_CSV"
        write_list_into_csv(signal_csv_header, flattened_signal_list, ";", file_name+".csv")
set_a664_config(platform, target_folder_string)