import sys
import os
import uuid

from general_utils import print_with_time, find_by_attr, find_by_class_name, get_XML_root, verify_file_type
import xml.etree.ElementTree as ET
import math
from pathlib import Path

#------------ucof ecic functions---------------------
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..', 'ucof_python_ecic')))
from ecic_utils import create_package_strategy, create_data_timestamp # type: ignore

#------------ucof python classes-----------------------
sys.path.append("D:/Devel/ucofWorkspace/PythonClasses")
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

def get_ecic_stream_signal_list(ucof_ecic_stream_element, platform):
  signal_data = []
  ecic_stream_id = ucof_ecic_stream_element.id
  ecic_stream_name = ucof_ecic_stream_element.name
  ed247_assignment= find_by_attr(platform, "sourceID", ecic_stream_id, False, "ED247Assignment")
  print_with_time(f"Getting signals for {ecic_stream_id}")
  port2port_assignment_id = ed247_assignment.targetID #The target of the assignment is the respective port2portAssignment >> connection between ports
  print_with_time(f"Found ED247 Assignment with {ed247_assignment.id}")
  print_with_time(f"Looking for Signal Assignments")
  payload_assignments = find_by_attr(platform, "targetID", port2port_assignment_id, True, "PayloadToTargetAssignment") #Look for signalAssignments that point to the same connection
  #check if payload is connected, if not assume signal is connected
  if payload_assignments:
    msg_no = 1
    for payload_assignment in payload_assignments:
      print_with_time(f"Found Payload Assignment with {payload_assignment.id}")
      payload_id = payload_assignment.sourceID
      signal_assignments = find_by_attr(platform, "targetID", payload_id, True, "SignalToTargetAssignment") #Look for signalAssignments that are included in the payload
      signal_data = get_signal_data_from_assignments(ecic_stream_name, platform, signal_assignments, signal_data, msg_no, True)
      msg_no = msg_no + 1
  else:
    signal_assignments = find_by_attr(platform, "targetID", port2port_assignment_id, True, "SignalToTargetAssignment") #Look for signalAssignments that point to the same connection
    signal_data = get_signal_data_from_assignments(ecic_stream_name, platform, signal_assignments, signal_data)
  return signal_data

def get_signal_data_from_assignments(ecic_stream_name, platform, signal_assignments, signal_data, msg_no = 1, is_payload = False):
  signal_no = 1
  for signal_assignment in signal_assignments:
    print_with_time(f"Found Signal Assignment with {signal_assignment.id}")
    startBit = signal_assignment.startBit
    data_value = signal_assignment.initialValue
    if startBit:
      byte_start = math.ceil(int(startBit) / 8)
    else:
      byte_start = 0
    signal_id = signal_assignment.sourceID
    signal = find_by_attr(platform, "id", signal_id)
    if signal:
      print_with_time(f"Found Signal with {signal_id}")
      bit_length = signal.bitLength
      byte_end = math.ceil(byte_start + (int(bit_length) / 8)-1)
      signal_signedness = signal.signedness
      signal_datatype = signal.dataType.lower() + bit_length
      if signal_signedness:
        if "U" in signal_signedness:
          signal_datatype = "u"+ signal_datatype
      #signal_data =      Stream_Name,      Msg_No, Signal_No, Signal_Name,       Data_Type, Target_Data_type, Data_Value, Byte_Start, Byte_End, Bit_Position
      signal_data.append([ecic_stream_name, msg_no, signal_no, signal.name, signal_datatype,  signal_datatype, data_value, byte_start, byte_end,            0])
      if is_payload:
        signal_no = signal_no + 1
      else:
        msg_no = msg_no + 1
    else:
      print_with_time(f"No signal with {signal_id} was found", True)
  return signal_data
  
def get_ecic_stream_param(ucof_ecic_stream_element, stream_type_prefix, direction_reversal):
  kwargs = {}
  if hasattr(ucof_ecic_stream_element, "name"):
    kwargs["name"] = ucof_ecic_stream_element.name
  if hasattr(ucof_ecic_stream_element, "sampleMaxNumber"):
    kwargs["sample_max_number"] = ucof_ecic_stream_element.sampleMaxNumber
  if hasattr(ucof_ecic_stream_element, "direction"):
    kwargs["direction"] = get_direction_with_reversal(ucof_ecic_stream_element.direction, direction_reversal)
  if hasattr(ucof_ecic_stream_element, "sampleMaxSizeBytes"):
    kwargs["sample_max_size_bytes"] = ucof_ecic_stream_element.sampleMaxSizeBytes
  if hasattr(ucof_ecic_stream_element, "dataTimestamp"):
    ucof_data_timestamp = ucof_ecic_stream_element.dataTimestamp
    if ucof_data_timestamp:
      ucof_enable = ucof_data_timestamp.enable
      ucof_timeOffset = ucof_data_timestamp.sampleDataTimestampOffset
      if ucof_enable:
        ecic_enable = ucof_enable
      else:
        ecic_enable = "No"
      if ucof_timeOffset:
        ecic_timeOffset = ucof_timeOffset
      else:
        ecic_timeOffset = "No" 
      ecic_data_timestamp = create_data_timestamp(ecic_enable, ecic_timeOffset)
      kwargs["data_timestamp"] = ecic_data_timestamp
  if hasattr(ucof_ecic_stream_element, stream_type_prefix + "PacketStrategy"):
    kwargs_packet = {}
    packet_strategy = None
    if stream_type_prefix == 'a664':
      packet_strategy = ucof_ecic_stream_element.a664PacketStrategy
    if stream_type_prefix == 'a429':
      packet_strategy = ucof_ecic_stream_element.a429PacketStrategy
    elif stream_type_prefix == 'a825':
      packet_strategy = ucof_ecic_stream_element.a825PacketStrategy
    elif stream_type_prefix == 'dis':
      packet_strategy = ucof_ecic_stream_element.disPacketStrategy
    elif stream_type_prefix == 'ana':
      packet_strategy = ucof_ecic_stream_element.anaPacketStrategy
    elif stream_type_prefix == 'nad':
      packet_strategy = ucof_ecic_stream_element.nadPacketStrategy
    else:
      pass
    if packet_strategy and hasattr(packet_strategy, "PeriodNs"):
      kwargs_packet["period_ns"] = packet_strategy.PeriodNs
      target_packet_strategy = create_package_strategy(stream_type_prefix, **kwargs_packet)
      kwargs["packet_strategy"] = target_packet_strategy     
  return kwargs

def create_assignment(assignment_type, sourceID, targetID):
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
