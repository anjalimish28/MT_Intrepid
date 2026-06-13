import xml.etree.ElementTree as ET  
from pathlib import Path
import xml.dom.minidom
#import super types
from SuperMessageType import SuperMessageType

#import children classes
from I2CRegisterSpecification import I2CRegisterSpecification


# -------------------------------------------------------------------
# Automatically generated class from ecore model!! I2CMessage.
# Don't change here, change in source ecore model
# Code generator by Philipp Chrysalidis in 2025
# ======================================================================

class I2CMessage(SuperMessageType):
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
    self.targetAddress = None
    self.direction = None
    self.dataLengthBytes = None
    self.repeatedStart = None
    self.registerPointerByte = None
    #children (references)
    self.registerSpecification = None  #Initialize as a single child (None by default)
    self.parent = None #default is no parent, but can be set for every element
	

  def to_xml(self, reference_name = None):
    element = ET.Element(reference_name)
    if not reference_name == "i2c" and not reference_name.lower() == "i2cmessage":
      element.set("xsi:type", "de.ucof.model.communication.i2c:I2CMessage")  
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
    if self.targetAddress is not None:
      element.set("targetAddress", str(self.targetAddress))  
    if self.direction is not None:
      element.set("direction", str(self.direction))  
    if self.dataLengthBytes is not None:
      element.set("dataLengthBytes", str(self.dataLengthBytes))  
    if self.repeatedStart is not None:
      element.set("repeatedStart", str(self.repeatedStart))  
    if self.registerPointerByte is not None:
      element.set("registerPointerByte", str(self.registerPointerByte))  
    # Convert children to nested XML elements
  # Single child
    if self.registerSpecification is not None:
      element.append(self.registerSpecification.to_xml("registerSpecification"))  
    return element

  def from_xml(self, xml_element):
    # Instantiate an object of type I2CMessage
    obj = I2CMessage()  
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
    if "targetAddress" in xml_element.attrib:
        obj.targetAddress = xml_element.get("targetAddress")
    if "direction" in xml_element.attrib:
        obj.direction = xml_element.get("direction")
    if "dataLengthBytes" in xml_element.attrib:
        obj.dataLengthBytes = xml_element.get("dataLengthBytes")
    if "repeatedStart" in xml_element.attrib:
        obj.repeatedStart = xml_element.get("repeatedStart")
    if "registerPointerByte" in xml_element.attrib:
        obj.registerPointerByte = xml_element.get("registerPointerByte")
    # Process children (references)
    # Reference with a single value: find the child element and set the field if it exists
    child_element = xml_element.find("registerSpecification")
    if child_element is not None:  
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if (not xsi_type) or (xsi_type.split(":", 1)[ 1 ].lower() == "i2cregisterspecification"):
        child = I2CRegisterSpecification.from_xml(self, child_element)
        child.parent = obj
        obj.registerSpecification = child        
      
    return obj
    
  def save_xml(self, filename):
    self_xml = self.to_xml(None)
    xml_string = ET.tostring(self_xml, encoding="utf-8").decode("utf-8")
    dom = xml.dom.minidom.parseString(xml_string)
    with open(filename, 'w') as f:
       f.write(dom.toprettyxml(indent="  "))
