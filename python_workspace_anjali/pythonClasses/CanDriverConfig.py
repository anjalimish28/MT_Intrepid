import xml.etree.ElementTree as ET  
from pathlib import Path
import xml.dom.minidom
#import super types
from SuperIdentifierType import SuperIdentifierType
from SuperTrackingType import SuperTrackingType

#import children classes

# -------------------------------------------------------------------
# Automatically generated class from ecore model!! CanDriverConfig.
# Don't change here, change in source ecore model
# Code generator by Philipp Chrysalidis in 2025
# ======================================================================

class CanDriverConfig(SuperIdentifierType, SuperTrackingType):
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
    self.interfaceID = None
    self.canPeripheralInstance = None
    self.operatingMode = None
    self.extendedIdEnabled = None
    self.ringBufferSize = None
    #children (references)
    self.parent = None #default is no parent, but can be set for every element
	

  def to_xml(self, reference_name = None):
    element = ET.Element(reference_name)
    if not reference_name == "cpn" and not reference_name.lower() == "candriverconfig":
      element.set("xsi:type", "de.ucof.model.targets.cpn:CanDriverConfig")  
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
    if self.interfaceID is not None:
      element.set("interfaceID", str(self.interfaceID))  
    if self.canPeripheralInstance is not None:
      element.set("canPeripheralInstance", str(self.canPeripheralInstance))  
    if self.operatingMode is not None:
      element.set("operatingMode", str(self.operatingMode))  
    if self.extendedIdEnabled is not None:
      element.set("extendedIdEnabled", str(self.extendedIdEnabled))  
    if self.ringBufferSize is not None:
      element.set("ringBufferSize", str(self.ringBufferSize))  
    # Convert children to nested XML elements
    return element

  def from_xml(self, xml_element):
    # Instantiate an object of type CanDriverConfig
    obj = CanDriverConfig()  
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
    if "interfaceID" in xml_element.attrib:
        obj.interfaceID = xml_element.get("interfaceID")
    if "canPeripheralInstance" in xml_element.attrib:
        obj.canPeripheralInstance = xml_element.get("canPeripheralInstance")
    if "operatingMode" in xml_element.attrib:
        obj.operatingMode = xml_element.get("operatingMode")
    if "extendedIdEnabled" in xml_element.attrib:
        obj.extendedIdEnabled = xml_element.get("extendedIdEnabled")
    if "ringBufferSize" in xml_element.attrib:
        obj.ringBufferSize = xml_element.get("ringBufferSize")
    # Process children (references)
    return obj
    
  def save_xml(self, filename):
    self_xml = self.to_xml(None)
    xml_string = ET.tostring(self_xml, encoding="utf-8").decode("utf-8")
    dom = xml.dom.minidom.parseString(xml_string)
    with open(filename, 'w') as f:
       f.write(dom.toprettyxml(indent="  "))
