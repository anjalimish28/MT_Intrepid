import xml.etree.ElementTree as ET  
from pathlib import Path
import xml.dom.minidom
#import super types
from SuperStreamType import SuperStreamType

#import children classes
from DataTimestamp import DataTimestamp

from A429PacketStrategy import A429PacketStrategy


# -------------------------------------------------------------------
# Automatically generated class from ecore model!! A429Stream.
# Don't change here, change in source ecore model
# Code generator by Philipp Chrysalidis in 2025
# ======================================================================

class A429Stream(SuperStreamType):
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
    self.sampleMaxNumber = None
    self.icd = None
    self.direction = None
    self.errors = None
    #children (references)
    self.dataTimestamp = None  #Initialize as a single child (None by default)
    self.a429PacketStrategy = None  #Initialize as a single child (None by default)
    self.parent = None #default is no parent, but can be set for every element
	

  def to_xml(self, reference_name = None):
    element = ET.Element(reference_name)
    if not reference_name == "streamTypes" and not reference_name.lower() == "a429stream":
      element.set("xsi:type", "de.ucof.model.communication.configECIC.streamTypes:A429Stream")  
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
    if self.sampleMaxNumber is not None:
      element.set("sampleMaxNumber", str(self.sampleMaxNumber))  
    if self.icd is not None:
      element.set("icd", str(self.icd))  
    if self.direction is not None:
      element.set("direction", str(self.direction))  
    if self.errors is not None:
      element.set("errors", str(self.errors))  
    # Convert children to nested XML elements
  # Single child
    if self.dataTimestamp is not None:
      element.append(self.dataTimestamp.to_xml("dataTimestamp"))  
  # Single child
    if self.a429PacketStrategy is not None:
      element.append(self.a429PacketStrategy.to_xml("a429PacketStrategy"))  
    return element

  def from_xml(self, xml_element):
    # Instantiate an object of type A429Stream
    obj = A429Stream()  
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
    if "sampleMaxNumber" in xml_element.attrib:
        obj.sampleMaxNumber = xml_element.get("sampleMaxNumber")
    if "icd" in xml_element.attrib:
        obj.icd = xml_element.get("icd")
    if "direction" in xml_element.attrib:
        obj.direction = xml_element.get("direction")
    if "errors" in xml_element.attrib:
        obj.errors = xml_element.get("errors")
    # Process children (references)
    # Reference with a single value: find the child element and set the field if it exists
    child_element = xml_element.find("dataTimestamp")
    if child_element is not None:  
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if (not xsi_type) or (xsi_type.split(":", 1)[ 1 ].lower() == "datatimestamp"):
        child = DataTimestamp.from_xml(self, child_element)
        child.parent = obj
        obj.dataTimestamp = child        
      
    # Reference with a single value: find the child element and set the field if it exists
    child_element = xml_element.find("a429PacketStrategy")
    if child_element is not None:  
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if (not xsi_type) or (xsi_type.split(":", 1)[ 1 ].lower() == "a429packetstrategy"):
        child = A429PacketStrategy.from_xml(self, child_element)
        child.parent = obj
        obj.a429PacketStrategy = child        
      
    return obj
    
  def save_xml(self, filename):
    self_xml = self.to_xml(None)
    xml_string = ET.tostring(self_xml, encoding="utf-8").decode("utf-8")
    dom = xml.dom.minidom.parseString(xml_string)
    with open(filename, 'w') as f:
       f.write(dom.toprettyxml(indent="  "))
