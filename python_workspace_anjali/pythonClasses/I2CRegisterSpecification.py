import xml.etree.ElementTree as ET  
from pathlib import Path
import xml.dom.minidom
#import super types
from SuperIdentifierType import SuperIdentifierType
from SuperTrackingType import SuperTrackingType

#import children classes

# -------------------------------------------------------------------
# Automatically generated class from ecore model!! I2CRegisterSpecification.
# Don't change here, change in source ecore model
# Code generator by Philipp Chrysalidis in 2025
# ======================================================================

class I2CRegisterSpecification(SuperIdentifierType, SuperTrackingType):
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
    self.registerName = None
    self.registerPointerAddress = None
    self.registerWidthBits = None
    self.defaultValue = None
    self.readOnly = None
    #children (references)
    self.parent = None #default is no parent, but can be set for every element
	

  def to_xml(self, reference_name = None):
    element = ET.Element(reference_name)
    if not reference_name == "i2c" and not reference_name.lower() == "i2cregisterspecification":
      element.set("xsi:type", "de.ucof.model.communication.i2c:I2CRegisterSpecification")  
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
    if self.registerName is not None:
      element.set("registerName", str(self.registerName))  
    if self.registerPointerAddress is not None:
      element.set("registerPointerAddress", str(self.registerPointerAddress))  
    if self.registerWidthBits is not None:
      element.set("registerWidthBits", str(self.registerWidthBits))  
    if self.defaultValue is not None:
      element.set("defaultValue", str(self.defaultValue))  
    if self.readOnly is not None:
      element.set("readOnly", str(self.readOnly))  
    # Convert children to nested XML elements
    return element

  def from_xml(self, xml_element):
    # Instantiate an object of type I2CRegisterSpecification
    obj = I2CRegisterSpecification()  
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
    if "registerName" in xml_element.attrib:
        obj.registerName = xml_element.get("registerName")
    if "registerPointerAddress" in xml_element.attrib:
        obj.registerPointerAddress = xml_element.get("registerPointerAddress")
    if "registerWidthBits" in xml_element.attrib:
        obj.registerWidthBits = xml_element.get("registerWidthBits")
    if "defaultValue" in xml_element.attrib:
        obj.defaultValue = xml_element.get("defaultValue")
    if "readOnly" in xml_element.attrib:
        obj.readOnly = xml_element.get("readOnly")
    # Process children (references)
    return obj
    
  def save_xml(self, filename):
    self_xml = self.to_xml(None)
    xml_string = ET.tostring(self_xml, encoding="utf-8").decode("utf-8")
    dom = xml.dom.minidom.parseString(xml_string)
    with open(filename, 'w') as f:
       f.write(dom.toprettyxml(indent="  "))
