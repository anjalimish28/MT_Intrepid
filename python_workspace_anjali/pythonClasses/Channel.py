import xml.etree.ElementTree as ET  
from pathlib import Path
import xml.dom.minidom
#import super types
from SuperIdentifierType import SuperIdentifierType
from SuperTrackingType import SuperTrackingType

#import children classes
from ComInterface import ComInterface

from Header import Header

from SuperStreamType import SuperStreamType
from A429Stream import A429Stream

from A825Stream import A825Stream

from A664Stream import A664Stream

from ETHStream import ETHStream

from DISStream import DISStream

from ANAStream import ANAStream

from NADStream import NADStream

# -------------------------------------------------------------------
# Automatically generated class from ecore model!! Channel.
# Don't change here, change in source ecore model
# Code generator by Philipp Chrysalidis in 2025
# ======================================================================

class Channel(SuperIdentifierType, SuperTrackingType):
  def __init__(self):
    #attributes
    self.id = None
    self.name = None
    self.documentation = None
    self.modified = None
    self.modifier = None
    self.traceLink = None
    self.created = None
    self.creator = None
    self.version = None
    self.frameFormat = None
    #children (references)
    self.comInterface = None  #Initialize as a single child (None by default)
    self.header = None  #Initialize as a single child (None by default)
    #Check if it's a collection (i.e., upperBound <> 1)
    self.stream_list = list()  #Initialize as an empty list for multiple children
    self.parent = None #default is no parent, but can be set for every element
	
    #Check if it's a collection (i.e., upperBound <> 1)
  def add_stream(self, stream): #function for adding child
    self.stream_list.append(stream)
    stream.parent = self #link child to parent

  def to_xml(self, reference_name = None):
    element = ET.Element(reference_name)
    if not reference_name == "configECIC" and not reference_name.lower() == "channel":
      element.set("xsi:type", "de.ucof.model.communication.configECIC:Channel")  
    # Convert attributes to XML attributes
    if self.id is not None:
      element.set("id", str(self.id))  
    if self.name is not None:
      element.set("name", str(self.name))  
    if self.documentation is not None:
      element.set("documentation", str(self.documentation))  
    if self.modified is not None:
      element.set("modified", str(self.modified))  
    if self.modifier is not None:
      element.set("modifier", str(self.modifier))  
    if self.traceLink is not None:
      element.set("traceLink", str(self.traceLink))  
    if self.created is not None:
      element.set("created", str(self.created))  
    if self.creator is not None:
      element.set("creator", str(self.creator))  
    if self.version is not None:
      element.set("version", str(self.version))  
    if self.frameFormat is not None:
      element.set("frameFormat", str(self.frameFormat))  
    # Convert children to nested XML elements
  # Single child
    if self.comInterface is not None:
      element.append(self.comInterface.to_xml("comInterface"))  
  # Single child
    if self.header is not None:
      element.append(self.header.to_xml("header"))  
  # Multiple children
    for child in self.stream_list:  
      element.append(child.to_xml("stream"))  
    return element

  def from_xml(self, xml_element):
    # Instantiate an object of type Channel
    obj = Channel()  
    # Convert XML attributes into object attributes
    if "id" in xml_element.attrib:
        obj.id = xml_element.get("id")
    if "name" in xml_element.attrib:
        obj.name = xml_element.get("name")
    if "documentation" in xml_element.attrib:
        obj.documentation = xml_element.get("documentation")
    if "modified" in xml_element.attrib:
        obj.modified = xml_element.get("modified")
    if "modifier" in xml_element.attrib:
        obj.modifier = xml_element.get("modifier")
    if "traceLink" in xml_element.attrib:
        obj.traceLink = xml_element.get("traceLink")
    if "created" in xml_element.attrib:
        obj.created = xml_element.get("created")
    if "creator" in xml_element.attrib:
        obj.creator = xml_element.get("creator")
    if "version" in xml_element.attrib:
        obj.version = xml_element.get("version")
    if "frameFormat" in xml_element.attrib:
        obj.frameFormat = xml_element.get("frameFormat")
    # Process children (references)
    # Reference with a single value: find the child element and set the field if it exists
    child_element = xml_element.find("comInterface")
    if child_element is not None:  
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if (not xsi_type) or (xsi_type.split(":", 1)[ 1 ].lower() == "cominterface"):
        child = ComInterface.from_xml(self, child_element)
        child.parent = obj
        obj.comInterface = child        
      
    # Reference with a single value: find the child element and set the field if it exists
    child_element = xml_element.find("header")
    if child_element is not None:  
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if (not xsi_type) or (xsi_type.split(":", 1)[ 1 ].lower() == "header"):
        child = Header.from_xml(self, child_element)
        child.parent = obj
        obj.header = child        
      
    # Reference with multiplicity: initialize a list and append each child object
    obj.stream_list = list()
    for child_element in xml_element.findall("stream"):
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if not xsi_type:
        child = SuperStreamType.from_xml(self, child_element)
        child.parent = obj
        obj.stream_list.append(child)
      elif xsi_type.split(":", 1)[ 1 ].lower() == "a429stream":
        child = A429Stream.from_xml(self, child_element)
        child.parent = obj
        obj.stream_list.append(child)
      
      elif xsi_type.split(":", 1)[ 1 ].lower() == "a825stream":
        child = A825Stream.from_xml(self, child_element)
        child.parent = obj
        obj.stream_list.append(child)
      
      elif xsi_type.split(":", 1)[ 1 ].lower() == "a664stream":
        child = A664Stream.from_xml(self, child_element)
        child.parent = obj
        obj.stream_list.append(child)
      
      elif xsi_type.split(":", 1)[ 1 ].lower() == "ethstream":
        child = ETHStream.from_xml(self, child_element)
        child.parent = obj
        obj.stream_list.append(child)
      
      elif xsi_type.split(":", 1)[ 1 ].lower() == "disstream":
        child = DISStream.from_xml(self, child_element)
        child.parent = obj
        obj.stream_list.append(child)
      
      elif xsi_type.split(":", 1)[ 1 ].lower() == "anastream":
        child = ANAStream.from_xml(self, child_element)
        child.parent = obj
        obj.stream_list.append(child)
      
      elif xsi_type.split(":", 1)[ 1 ].lower() == "nadstream":
        child = NADStream.from_xml(self, child_element)
        child.parent = obj
        obj.stream_list.append(child)
    return obj
    
  def save_xml(self, filename):
    self_xml = self.to_xml(None)
    xml_string = ET.tostring(self_xml, encoding="utf-8").decode("utf-8")
    dom = xml.dom.minidom.parseString(xml_string)
    with open(filename, 'w') as f:
       f.write(dom.toprettyxml(indent="  "))
