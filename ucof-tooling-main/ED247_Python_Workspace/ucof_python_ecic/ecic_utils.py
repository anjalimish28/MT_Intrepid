import xml.etree.ElementTree as ET
import sys
import os

#------------ucof general functions---------------------
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..', 'ucof_python_general')))
from general_utils import print_with_time #type:ignore

def create_root(channels, comment='', identifier = 0, name = "Component", standard_revision = "A", component_version='', component_type='Virtual', file_producer=None):
  #create the root element
  root_el = ET.Element("ED247ComponentInstanceConfiguration", {
    'Name': name,
    'StandardRevision': standard_revision,
    'ComponentVersion': component_version,
    'ComponentType': component_type,
    'Comment': comment,
    'Identifier': str(identifier)
  })
  if file_producer is not None:
    root_el.append(file_producer)
  #create the channels container
  channels_el = ET.SubElement(root_el, "Channels")
  #append all exsiting channels
  if isinstance(channels, list):
    for channel in channels:
      channels_el.append(channel)
  else:
    channels_el.append(channels)
  return root_el

def create_file_producer(identifier='', comment=''): #currently not used 
  """Creates an XML element representing a FileProducer with attributes."""
  file_producer_el = ET.Element("FileProducer", {
    'Identifier': identifier,
    'Comment': comment
  })
  return file_producer_el

def create_channel(udp_sockets, stream, name='', comment='', header_enable = None, header_trans_ts = None, frame_format= "A"):
  #create a channel element >> main element containing the ECIC information
  channel_el = ET.Element("Channel", {
    'Name': name,
    'Comment': comment
  })
  #define the frame format
  frame_format_el = ET.SubElement(channel_el, "FrameFormat")
  frame_format_el.set('StandardRevision', frame_format)
  #com interface only contains udp sockets
  com_interface_el = ET.SubElement(channel_el, "ComInterface")
  #parent for all udp sockets
  udp_sockets_el = ET.SubElement(com_interface_el, "UDP_Sockets")
  #all udp_sockets, are added to the structure
  print(udp_sockets)
  if isinstance(udp_sockets, list):
    for udp_socket in udp_sockets:
      udp_sockets_el.append(udp_socket) #add the pre defined socket elements
  else:
    udp_sockets_el.append(udp_sockets)
  #set the header, if input for it is given (e.g. a664 has no header)
  if header_enable is not None and header_trans_ts is not None:
    header_el = ET.SubElement(channel_el, "Header")
    header_el.set('Enable', header_enable)
    header_el.set('TransportTimestamp', header_trans_ts)
  #add the pre definedstream element, mandatory for information contain
  stream_el = ET.SubElement(channel_el, "Stream")
  stream_el.append(stream)

  return channel_el

def create_udp_socket(dst_ip, dst_port, direction = None, src_ip = None , src_port = None, multicast_interface_ip = None, multicast_ttl = None):
  #creates the udp socket xml element
  #multicast not used and therefore currently ignored
  udp_socket_el = ET.Element("UDP_Socket")
  if not direction or direction == "In" or direction == "Out":
    #dstip is always default, indendent of in/out
    udp_socket_el.set("DstIP", dst_ip)
    udp_socket_el.set("DstPort", dst_port)
  elif direction == "InOut":
    #srcip/port only become relevent when direction is in/out
    udp_socket_el.set("DstIP", dst_ip)
    udp_socket_el.set("DstPort", dst_port)
    udp_socket_el.set("SrcIP", src_ip)
    udp_socket_el.set("SrcPort", src_port)
  else:
    print_with_time(f"Direction input: {direction} doesn't match required direction types for ECIC", True)
  if direction:
    udp_socket_el.set("Direction", direction)
  return udp_socket_el

def create_data_timestamp(enable='No', sample_data_timestamp_offset='No'):
  #create data timestamp element
  data_timestamp_el = ET.Element("DataTimestamp")
  data_timestamp_el.set('Enable', enable)
  data_timestamp_el.set('SampleDataTimestampOffset', sample_data_timestamp_offset)
  return data_timestamp_el

def create_packet_strategy_periodic(period_ns):
  #create 
  periodic_el = ET.Element("Periodic")
  periodic_el.set('PeriodNs', str(period_ns))
  return periodic_el

def create_trigger_word(label, sdi, reset_periodic_timer):
  trigger_word_el = ET.Element("TriggerWord")
  trigger_word_el.set('Label', label)
  trigger_word_el.set('SDI', sdi)
  trigger_word_el.set('ResetPeriodicTimer', reset_periodic_timer)
  return trigger_word_el

def create_frame_element(identifier, reset_periodic_timer):
  frame_el = ET.Element("Frame")
  frame_el.set('Identifier', identifier)
  frame_el.set('ResetPeriodicTimer', reset_periodic_timer)

def create_ecic_signal(name, byte_offeset = 0, data_type = None):
  signal_el = ET.Element("Signal")
  signal_el.set('Name', name)
  signal_el.set('ByteOffset', byte_offeset)
  if data_type:
     signal_el.set('Type', data_type)
  return signal_el

# Packet strategy creators
def create_a429_packet_strategy(period_ns=None, gap_duration_ns=None, gap_reset_periodic_timer='Yes', trigger_words=None, ):
  #a429 packet strategy creator
  packet_strategy_el = ET.Element("PacketStrategy") 
  if period_ns is not None: #child element only if given
    packet_strategy_el.append(create_packet_strategy_periodic(period_ns))
  if gap_duration_ns is not None:
      gap_el = ET.SubElement(packet_strategy_el, "Gap")
      gap_el.set('DurationNs', str(gap_duration_ns))
      gap_el.set('ResetPeriodicTimer', gap_reset_periodic_timer)
  if trigger_words is not None:
      trigger_words_el = ET.SubElement(packet_strategy_el, "TriggerWords")
      if isinstance(trigger_words, list):
        for tirgger_word in trigger_words:
          trigger_words_el.append(tirgger_word)
      else:
        trigger_words_el.append(trigger_words)
  return packet_strategy_el

def create_a825_packet_strategy(period_ns=None, frames=None):
  #a825 package strategy creator
  packet_strategy_el = ET.Element("PacketStrategy")
  if period_ns is not None:
    packet_strategy_el.append(create_packet_strategy_periodic(period_ns))
  if frames is not None:
    frames_el = ET.SubElement(packet_strategy_el, "Frames")
    if isinstance(frames, list):
      for frame in frames:
        frames_el.append(frame)
    else:
      frames_el.append(frames)
  return packet_strategy_el

def create_a664_packet_strategy(period_ns=None):
  #a664 packet strategy creator
  packet_strategy_el = ET.Element("PacketStrategy")
  if period_ns is not None:
    packet_strategy_el.append(create_packet_strategy_periodic(period_ns))
  return packet_strategy_el
  
def create_dis_packet_strategy(period_ns=None, on_transition_reset_periodic_timer=None):
#dis packetstrategy creator
  packet_strategy_el = ET.Element("PacketStrategy")
  if period_ns is not None:
    packet_strategy_el.append(create_packet_strategy_periodic(period_ns))
  if on_transition_reset_periodic_timer:
    on_transition_el = ET.SubElement(packet_strategy_el, "OnTransition")
    on_transition_el.set('ResetPeriodicTimer', on_transition_reset_periodic_timer)
  return packet_strategy_el

def create_ana_packet_strategy(period_ns=None):
  #ana packet strategy creator
  packet_strategy_el = ET.Element("PacketStrategy")
  if period_ns is not None:
    packet_strategy_el.append(create_packet_strategy_periodic(period_ns))
  return packet_strategy_el

def create_nad_packet_strategy(period_ns=None):
#nad package strategy creator
  packet_strategy_el = ET.Element("PacketStrategy")
  if period_ns is not None:
    packet_strategy_el.append(create_packet_strategy_periodic(period_ns))
  return packet_strategy_el

def create_package_strategy(element_type, **kwargs):
  #creates stream depending on the element type >>> switch case basically
  if element_type == 'a429':
    return create_a429_packet_strategy(**kwargs)
  elif element_type == 'a825':
    return create_a825_packet_strategy(**kwargs)
  elif element_type == 'a664':
    return create_a664_packet_strategy(**kwargs)
  elif element_type == 'dis':
    return create_dis_packet_strategy(**kwargs)
  elif element_type == 'ana':
    return create_ana_packet_strategy(**kwargs)
  elif element_type == 'nad':
    return create_nad_packet_strategy(**kwargs)
  else:
    print_with_time(f"Unknown stream type: {element_type}", True)
  
#Stream creators
def create_a429_stream(name, direction, sample_max_number=1, data_timestamp=None, packet_strategy=None, icd='', comment=''):
  #a429 stream creator
  attrs = {
    "Name": name,
    "Direction": direction,
  }
  if sample_max_number is not None:
      attrs["SampleMaxNumber"] = str(sample_max_number)
  if icd:
      attrs["ICD"] = icd
  if comment:
      attrs["Comment"] = comment
  stream_el = ET.Element("A429_Stream", attrs)
  #input the data_timestamp element if exist
  if data_timestamp is not None:
    stream_el.append(data_timestamp)
  #input the packet_strategy element if exist
  if packet_strategy is not None:
    stream_el.append(packet_strategy)
  return stream_el

def create_a825_stream(name, packet_strategy=None, sample_max_number=1, icd='', comment='', data_timestamp=None):
  #a825 stream creator
  attrs = {
    "Name": name,
  }
  if sample_max_number is not None:
      attrs["SampleMaxNumber"] = str(sample_max_number)
  if icd:
      attrs["ICD"] = icd
  if comment:
      attrs["Comment"] = comment
  stream_el = ET.Element("A825_Stream", attrs)
  if data_timestamp is not None:
      stream_el.append(data_timestamp)
  if packet_strategy is not None:
      stream_el.append(packet_strategy)
  return stream_el

def create_a664_stream(name, direction, sample_max_number=1, sample_max_size_bytes=1471, data_timestamp=None, packet_strategy=None, icd='', comment='', message_size_enable=None):
  #a664 stream creator
  attrs = {
    "Name": name,
    "Direction": direction,
  }
  if sample_max_number is not None:
      attrs["SampleMaxNumber"] = str(sample_max_number)
  if sample_max_size_bytes is not None:
      attrs["SampleMaxSizeBytes"] = str(sample_max_size_bytes)
  if icd:
      attrs["ICD"] = icd
  if comment:
      attrs["Comment"] = comment
  stream_el = ET.Element("A664_Stream", attrs)
  if data_timestamp is not None:
    stream_el.append(data_timestamp)
  if packet_strategy is not None:
    stream_el.append(packet_strategy)
  if message_size_enable is not None:
    message_size_elem = ET.SubElement(stream_el, "MessageSize")
    message_size_elem.set('Enable', message_size_enable)
  return stream_el

def create_eth_stream(name, sample_max_number=1, sample_max_size_bytes=1500, data_timestamp=None, packet_strategy=None, icd='', comment='', layer=None):
  #eth stream creator
  attrs = {
    "Name": name,
  }
  if sample_max_number is not None:
      attrs["SampleMaxNumber"] = str(sample_max_number)
  if sample_max_size_bytes is not None:
      attrs["SampleMaxSizeBytes"] = str(sample_max_size_bytes)
  if icd:
      attrs["ICD"] = icd
  if comment:
      attrs["Comment"] = comment
  stream_el = ET.Element("ETH_Stream", attrs)
  if data_timestamp is not None:
    stream_el.append(data_timestamp)
  if packet_strategy is not None:
    stream_el.append(packet_strategy)
  if layer is not None:
    frame_el = ET.SubElement(stream_el, "Frame")
    frame_el.set('Layer', layer)
  return stream_el

def create_dis_stream(name, direction, sample_max_number=1, sample_max_size_bytes=1, packet_strategy=None, signals=None, icd='', comment='', data_timestamp=None):
  #dis stream creator
  attrs = {
    "Name": name,
    "Direction": direction,
  }
  if sample_max_number is not None:
      attrs["SampleMaxNumber"] = str(sample_max_number)
  if sample_max_size_bytes is not None:
      attrs["SampleMaxSizeBytes"] = str(sample_max_size_bytes)
  if icd:
      attrs["ICD"] = icd
  if comment:
      attrs["Comment"] = comment
  stream_el = ET.Element("DIS_Stream", attrs)
  if data_timestamp is not None:
    stream_el.append(data_timestamp)
  if packet_strategy is not None:
    stream_el.append(packet_strategy)
  if signals is not None:
    signals_el = ET.SubElement(stream_el, "Signals")
    if isinstance(signals, list):
      for signal in signals:
        signals_el.append(signal)
    else:
      signals_el.append(signals)
  return stream_el

def create_ana_stream(name, direction, sample_max_number=1, sample_max_size_bytes=1, packet_strategy=None, signals=None, icd='', comment='', data_timestamp=None):
  #ana stream creator
  attrs = {
    "Name": name,
    "Direction": direction,
  }
  if sample_max_number is not None:
      attrs["SampleMaxNumber"] = str(sample_max_number)
  if sample_max_size_bytes is not None:
      attrs["SampleMaxSizeBytes"] = str(sample_max_size_bytes)
  if icd:
      attrs["ICD"] = icd
  if comment:
      attrs["Comment"] = comment
  stream_el = ET.Element("ANA_Stream", attrs)
  if data_timestamp is not None:
    stream_el.append(data_timestamp)
  if packet_strategy is not None:
    stream_el.append(packet_strategy)
  if signals is not None:
    signals_el = ET.SubElement(stream_el, "Signals")
    if isinstance(signals, list):
      for signal in signals:
        signals_el.append(signal)
    else:
      signals_el.append(signals)
  return stream_el

def create_nad_stream(name, direction, sample_max_number=1, sample_max_size_bytes=1, packet_strategy=None, signals=None, icd='', comment='', data_timestamp=None):
  #Creates a NAD_Stream element
  attrs = {
    "Name": name,
    "Direction": direction,
  }
  if sample_max_number is not None:
      attrs["SampleMaxNumber"] = str(sample_max_number)
  if sample_max_size_bytes is not None:
      attrs["SampleMaxSizeBytes"] = str(sample_max_size_bytes)
  if icd:
      attrs["ICD"] = icd
  if comment:
      attrs["Comment"] = comment
  stream_el = ET.Element("NAD_Stream", attrs)
  if data_timestamp is not None:
    stream_el.append(data_timestamp)
  if packet_strategy is not None:
    stream_el.append(packet_strategy)
  if signals is not None:
    signals_el = ET.SubElement(stream_el, "Signals")
    if isinstance(signals, list):
      for signal in signals:
        signals_el.append(signal)
    else:
      signals_el.append(signals)
  return stream_el

def create_stream(element_type, **kwargs):
  #creates stream depending on the element type >>> switch case basically
  if element_type == 'A429_Stream':
    return create_a429_stream(**kwargs)
  elif element_type == 'A825_Stream':
    return create_a825_stream(**kwargs)
  elif element_type == 'A664_Stream':
    return create_a664_stream(**kwargs)
  elif element_type == 'ETH_Stream':
    return create_eth_stream(**kwargs)
  elif element_type == 'DIS_Stream':
    return create_dis_stream(**kwargs)
  elif element_type == 'ANA_Stream':
    return create_ana_stream(**kwargs)
  elif element_type == 'NAD_Stream':
    return create_nad_stream(**kwargs)
  else:
    print_with_time(f"Unknown stream type: {element_type}", True)

def add_stream_signals(target_stream_element, stream_signal_list):
  offset = 0
  signal_list_element = ET.SubElement(target_stream_element, "Signals")
  for stream_signal in stream_signal_list:
    signal_name = stream_signal[3]
    signal_datatype = stream_signal[4]
    signal_offset = offset
    offset = offset + stream_signal[7]
    signal_element = create_ecic_signal(signal_name, signal_offset, signal_datatype)
    signal_list_element.append(signal_element) 
  return target_stream_element