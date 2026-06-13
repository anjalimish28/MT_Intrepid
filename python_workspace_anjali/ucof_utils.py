import sys
import os
import uuid

from general_utils import print_with_time, find_by_attr, find_by_class_name, get_XML_root, verify_file_type, write_list_into_csv
import xml.etree.ElementTree as ET
import math
from pathlib import Path

#------------ucof python classes-----------------------
sys.path.append(str(Path(__file__).parent / "PythonClasses"))
from Platform import Platform # type: ignore
from SignalToTargetAssignment import SignalToTargetAssignment # type: ignore
from PayloadToTargetAssignment import PayloadToTargetAssignment # type: ignore
from MessageToTargetAssignment import MessageToTargetAssignment # type: ignore
from InterfaceToHardwareAssignment import InterfaceToHardwareAssignment # type: ignore
from PortToPortAssignment import PortToPortAssignment # type: ignore
from DeviceToImplementationAssignment import DeviceToImplementationAssignment # type: ignore
from InterfaceToPort2PortAssignment import InterfaceToPort2PortAssignment # type: ignore
from ED247Assignment import ED247Assignment # type: ignore
from SWPortToHWPortAssignment import SWPortToHWPortAssignment #type:ignore
from DevicePorts import DevicePorts #type:ignore
from SamplingPort import SamplingPort #type:ignore
from QueuingPort import QueuingPort #type:ignore


def verifiy_ucof_XML(file_root):
  if file_root.tag == "{https://gitlab.com/ucof/ucof.de/model/v001/ucof}Platform":
    ucof_root = file_root
    print_with_time(f"File has been verified as a UCoF XML")
  else:
    print_with_time(f"File is not a UCoF XML", False)
  return ucof_root

def check_for_ucof_platform(ucof_file_path=None):
    if not ucof_file_path:
      user_input = input("Please enter a ucof file path string (or press Enter to skip): ")
      if user_input == "":
          print_with_time(f"No input was given, new file will be created")
          ucof_platform = None
      else:
          print_with_time(f"Path {user_input} was given")
          ucof_platform = import_ucof_platform_from_file(user_input)
    else:
      ucof_platform = import_ucof_platform_from_file(ucof_file_path)
    return ucof_platform

def import_ucof_platform_from_file(ucof_file_path_string):
  filepath = Path(ucof_file_path_string)
  ucof_path = verify_file_type(filepath, "ucof")
  file_root = get_XML_root(ucof_path)
  ucof_root = verifiy_ucof_XML(file_root)
  platform = Platform()
  try:
    platform = platform.from_xml(ucof_root)
    print_with_time(f"Succesfully imported ucof as python classes")
    return platform
  except Exception as e:
    print_with_time(f"Couldn't import ucof into python classes, see: {e}", True)

def get_ecic_list(root_class):
  ecic_list = []
  root_class_name = root_class.__class__.__name__
  root_class_id = root_class.id
  print_with_time(f"Searching for ED247 ECICs in {root_class_name} with ID: {root_class_id}")
  i= 0
  ecic_list = root_class.communication.ed247Configurations.ed247Configuration_list
  ecic_amount = len(ecic_list)
  print_with_time(f"Found {ecic_amount} ECICs in {root_class_name} with ID: {root_class_id}")
  return ecic_list

def create_assignment(assignment_type, sourceID, targetID, name = ""):
  match assignment_type:
    case "SignalToTarget":
      assignment = SignalToTargetAssignment()
    case "PayloadToTarget":
      assignment = PayloadToTargetAssignment()
    case "MessageToTarget":
      assignment = MessageToTargetAssignment()
    case "InterfaceToHardware":
      assignment = InterfaceToHardwareAssignment()
    case "PortToPort":
      assignment = PortToPortAssignment()
    case "DeviceToImplementation":
      assignment = DeviceToImplementationAssignment()
    case "InterfaceToPort2Port":
      assignment = InterfaceToPort2PortAssignment()
    case "ED247":
      assignment = ED247Assignment()
    case "SWPortToHWPort":
      assignment = SWPortToHWPortAssignment()
    case _:
      print_with_time(f"Unknown assignment type:{assignment_type}. Exit Function!", True)
  assignment.id = uuid.uuid4()
  assignment.sourceID = sourceID
  assignment.targetID = targetID
  assignment.name = name
  return assignment

def get_payload_length(ucof_platform, target_element_id):
    signal_assignment_list = find_by_class_name(ucof_platform, "SignalToTargetAssignment", True)
    relevant_assignment_list = find_by_attr(signal_assignment_list, "targetID", target_element_id, True)
    start_bit = -1
    for signal_assignment in relevant_assignment_list:
        current_start_bit = int(signal_assignment.startBit)
        if current_start_bit > start_bit:
            start_bit = current_start_bit
            signal_id = signal_assignment.sourceID
    signal = find_by_attr(ucof_platform, "id", signal_id, False)
    payload_length = start_bit + int(signal.bitLength)
    return payload_length

def get_direction_with_reversal(ucof_direction, direction_reversal):
  direction = ucof_direction
  if direction_reversal:
    if ucof_direction == "Out":
      direction = "In"
    elif ucof_direction == "In":
      direction = "Out"
  return direction

def is_avd_device(ucof_platform, ucof_device):
    implementation_assignment = find_by_attr(ucof_platform, "sourceID", ucof_device.id, False, "DeviceToImplementationAssignment") #get the asignment
    if implementation_assignment:
        target_implementation = find_by_attr(ucof_platform, "id", implementation_assignment.targetID, False, "AvionicsVirtualDevice") #if target implementation not AVD, not found, equals false
        if target_implementation:
            return target_implementation
    return False

def add_ports(ucof_platform, device_id, port_type, port_amount, port_direction = "In"):
    device_list = find_by_class_name(ucof_platform, "SuperDeviceType", True, True)
    for ucof_device in device_list:
        if ucof_device.id == device_id:
            if not ucof_device.ports:
                ports = DevicePorts()
                ucof_device.ports= ports
            port_list = ucof_device.ports.port_list
            for idx in range(0,port_amount):
                if port_type == "Sampling":
                    ucof_port = SamplingPort()
                else:
                    ucof_port = QueuingPort()
                ucof_port.id = uuid.uuid4()
                ucof_port.portDirection = port_direction
                port_list.append(ucof_port)
            ucof_device.ports.port_list = port_list
    return ucof_platform

def build_signal_assignment_dic(ucof_platform, signal_assignment):
  signal_assignment_dic = {}
  signal_id = signal_assignment.sourceID
  signal = find_by_attr(ucof_platform, "id", signal_id)
  if signal:
    print_with_time(f"Found Signal with {signal_id}")
    functional_info = signal_assignment.functionalSignal
    if functional_info == 'true':
      is_virtual = 1
    else:
      is_virtual = 0
  else:
    print_with_time(f"No signal with {signal_id} was found", True)
  startBit = signal_assignment.startBit
  if startBit is None:
    startBit = 0
  signal_assignment_dic["Virtual"] = is_virtual
  signal_assignment_dic["Start Bit"] = int(startBit)
  signal_assignment_dic["Signal Assignment"] = signal_assignment
  signal_assignment_dic["Signal Name"] = signal.name
  signal_assignment_dic["Signal"] = signal
  return signal_assignment_dic

def get_signal_assignment_list(ucof_platform, ucof_elemment, port2port_assignment, signal_assignment_list = None):
  #first call is always ucof_platform, port2port_assignment, port2port_assignment >> then recurses to get data
  print_with_time(f"Recursive search for element with name: {ucof_elemment.name} and id: {ucof_elemment.id}")
  ucof_element_type = ucof_elemment.__class__.__name__
  if ucof_element_type == "SignalToTargetAssignment":
    if signal_assignment_list is None:
      signal_assignment_list = []
    signal_assignment_list.append(build_signal_assignment_dic(ucof_platform, ucof_elemment))
  else:
    if "PortToPortAssignment" in ucof_element_type:
      assigned_element_list = find_by_attr(ucof_platform, "targetID", ucof_elemment.id, True)
    else:
      assigned_element_list = find_by_attr(ucof_platform, "targetID", ucof_elemment.sourceID, True)
    for assigned_element in assigned_element_list:
      assigned_element_type = assigned_element.__class__.__name__
      if "Assignment" in assigned_element_type and not "ED247" in assigned_element_type:
        signal_assignment_list = get_signal_assignment_list(ucof_platform, assigned_element, port2port_assignment, signal_assignment_list)
  return signal_assignment_list

def get_signal_data_from_assignments(connection_name, signal_dic_name, signal, signal_assignment, signal_data_dic, port_to_port_assignment, msg_no = 1, sig_no = 1, startBit = 0, is_virtual = 0):
  #get output offset for functional payloads
  signal_data = []
  functional_payload_offset = 0
  if signal_data_dic:
    if signal_dic_name in signal_data_dic:
      signal_data = signal_data_dic[signal_dic_name]
      last_signal = signal_data[-1]
      last_signal_virtual = last_signal[12]
      if last_signal_virtual:
        functional_payload_offset = last_signal[8] + 1 #if virtual signal >> create virtual output offset
      else:
        functional_payload_offset = last_signal[13] #if not virtual signal >> copy offset >> no offset means no virtual signals   
  print_with_time(f"Found Signal Assignment with {signal_assignment.id}")
  data_value = signal_assignment.initialValue
  target_bit_length = signal_assignment.connectionTargetBitLength
  target_data_type = signal_assignment.connectionTargetBitDataType
  target_signedness = signal_assignment.connectionTargetSignedness
  target_bit_position = signal_assignment.connectionTargetBitPosition
  #start: set the bit position
  if target_bit_position:
    bit_pos = target_bit_position
  else:
    bit_pos = 0
  #end: set the bit position
  if not data_value:
    data_value = '0'
  if startBit:
    byte_start = math.ceil(int(startBit) / 8) - functional_payload_offset
  else:
    if (signal_data and not last_signal_virtual) or (signal_data and last_signal_virtual and is_virtual):
      byte_start = signal_data[-1][8]+1
    else:
      byte_start = 0
  swap_endian = signal_assignment.swapEndianness
  if swap_endian == "true":
    swap_endian_num = 1
  else:
    swap_endian_num = 0
  if target_bit_length:
    bit_length = target_bit_length
  else:
    bit_length = signal.bitLength
  byte_end = math.ceil(byte_start + (int(bit_length) / 8)-1)
  #normal signal datatype
  signal_signedness = signal.signedness
  signal_datatype_length = signal.dataType.lower() + signal.bitLength
  if signal_signedness:
    if "U" in signal_signedness:
      signal_datatype_length = "u"+ signal_datatype_length
  #if data type is transformed
  if target_data_type == "Bit":
    target_datatype_length = target_data_type.lower()
  elif target_data_type and target_bit_length:
    target_datatype_length = target_data_type.lower() + target_bit_length
  elif target_data_type and not target_bit_length:
    target_datatype_length = target_data_type.lower() + bit_length
  elif not target_data_type and target_bit_length:
    target_datatype_length = signal.dataType.lower() + target_bit_length
  else:
    target_datatype_length = signal_datatype_length
  if target_signedness:
    if "U" in target_signedness:
      target_datatype_length = "u"+ target_datatype_length
  if is_virtual:
    output_offset = 0
  else:
    output_offset = functional_payload_offset
  #get the port2portassignment for transmission rate
  if port_to_port_assignment.transmissionRate:
      trans_rate = int(float(port_to_port_assignment.transmissionRate))
  else:
    trans_rate = 0
  #signal_data =     Stream_Name, Msg_No, Sig_No, Signal_Name,              Data_Type,        Target_Data_type, Data_Value, Byte_Start, Byte_End, Bit_Position, Transmission_Rate, Swap_Endianness, Is_virtual, Output_Offset
  signal_row = [connection_name, msg_no, sig_no, signal.name, signal_datatype_length,  target_datatype_length, data_value, byte_start, byte_end,      bit_pos, trans_rate       , swap_endian_num, is_virtual, output_offset]
  signal_data.append(signal_row)
  signal_data_dic[signal_dic_name] = signal_data
  return signal_data_dic

def get_connection_signal_list(connection_name, platform, port2port_assignment, signal_data_dic, signal_dic_name, msg_no, connected_device_name):
    signal_assignment_dic_list = get_signal_assignment_list(platform, port2port_assignment, port2port_assignment)
    if signal_assignment_dic_list:
      sorted_signal_assignment_dic_list = sorted(signal_assignment_dic_list, key=lambda x: (-x["Virtual"], x["Start Bit"]))
      for sig_no, signal_assignment_dic in enumerate(sorted_signal_assignment_dic_list):
        signal_data_dic = get_signal_data_from_assignments(connection_name, signal_dic_name, signal_assignment_dic["Signal"], signal_assignment_dic["Signal Assignment"], signal_data_dic, port2port_assignment, msg_no, sig_no+1, signal_assignment_dic["Start Bit"], signal_assignment_dic["Virtual"])
    return signal_data_dic

def write_signal_data_dic(signal_data_dic, target_folder_string, device_name, multiple_files = False):
  signal_csv_header = ["Bus_Name", "Msg_No", "Signal_No", "Signal_Name", "Data_Type", "Target_Data_Type", "Data_Value", "Byte_Start", "Byte_End", "Bit_Position", "Transmission_Rate", "Swap_Endianness", "Is_Virtual", "Output_Offset"]
  signal_data_list = []
  if signal_data_dic:
    if not multiple_files:
      for entry in signal_data_dic:
        signal_data_list.append(signal_data_dic[entry])
      flattened_signal_list = [row for group in signal_data_list for row in group]
      file_name = target_folder_string + device_name
      write_list_into_csv(signal_csv_header, flattened_signal_list, ";", file_name +".csv")
    else:
      for entry in signal_data_dic:
        signal_data_list = signal_data_dic[entry]
        file_name = target_folder_string + device_name + "_" + entry
        write_list_into_csv(signal_csv_header, signal_data_list, ";", file_name +".csv")