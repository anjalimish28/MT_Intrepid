import xml.etree.ElementTree as ET  
from pathlib import Path
import xml.dom.minidom
#import super types
from SuperPowerType import SuperPowerType
from SuperTargetType import SuperTargetType

#import children classes
from EletrcialInterfaces import EletrcialInterfaces

from stmPorts import stmPorts

from stmTimingConfig import stmTimingConfig

from MsgBoxExtension import MsgBoxExtension


# -------------------------------------------------------------------
# Automatically generated class from ecore model!! stm32f446re.
# Don't change here, change in source ecore model
# Code generator by Philipp Chrysalidis in 2025
# ======================================================================

class stm32f446re(SuperPowerType, SuperTargetType):
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
    self.projectName = None
    self.size = None
    #children (references)
    self.electricalInterfaces = None  #Initialize as a single child (None by default)
    self.ports = None  #Initialize as a single child (None by default)
    self.stmTimingConfig = None  #Initialize as a single child (None by default)
    self.msgBoxExtension = None  #Initialize as a single child (None by default)
    self.parent = None #default is no parent, but can be set for every element
	

  def to_xml(self, reference_name = None):
    element = ET.Element(reference_name)
    if not reference_name == "rdc" and not reference_name.lower() == "stm32f446re":
      element.set("xsi:type", "de.ucof.model.targets.rdc:stm32f446re")  
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
    if self.projectName is not None:
      element.set("projectName", str(self.projectName))  
    if self.size is not None:
      element.set("size", str(self.size))  
    # Convert children to nested XML elements
  # Single child
    if self.electricalInterfaces is not None:
      element.append(self.electricalInterfaces.to_xml("electricalInterfaces"))  
  # Single child
    if self.ports is not None:
      element.append(self.ports.to_xml("ports"))  
  # Single child
    if self.stmTimingConfig is not None:
      element.append(self.stmTimingConfig.to_xml("stmTimingConfig"))  
  # Single child
    if self.msgBoxExtension is not None:
      element.append(self.msgBoxExtension.to_xml("msgBoxExtension"))  
    return element

  def from_xml(self, xml_element):
    # Instantiate an object of type stm32f446re
    obj = stm32f446re()  
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
    if "projectName" in xml_element.attrib:
        obj.projectName = xml_element.get("projectName")
    if "size" in xml_element.attrib:
        obj.size = xml_element.get("size")
    # Process children (references)
    # Reference with a single value: find the child element and set the field if it exists
    child_element = xml_element.find("electricalInterfaces")
    if child_element is not None:  
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if (not xsi_type) or (xsi_type.split(":", 1)[ 1 ].lower() == "eletrcialinterfaces"):
        child = EletrcialInterfaces.from_xml(self, child_element)
        child.parent = obj
        obj.electricalInterfaces = child        
      
    # Reference with a single value: find the child element and set the field if it exists
    child_element = xml_element.find("ports")
    if child_element is not None:  
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if (not xsi_type) or (xsi_type.split(":", 1)[ 1 ].lower() == "stmports"):
        child = stmPorts.from_xml(self, child_element)
        child.parent = obj
        obj.ports = child        
      
    # Reference with a single value: find the child element and set the field if it exists
    child_element = xml_element.find("stmTimingConfig")
    if child_element is not None:  
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if (not xsi_type) or (xsi_type.split(":", 1)[ 1 ].lower() == "stmtimingconfig"):
        child = stmTimingConfig.from_xml(self, child_element)
        child.parent = obj
        obj.stmTimingConfig = child        
      
    # Reference with a single value: find the child element and set the field if it exists
    child_element = xml_element.find("msgBoxExtension")
    if child_element is not None:  
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if (not xsi_type) or (xsi_type.split(":", 1)[ 1 ].lower() == "msgboxextension"):
        child = MsgBoxExtension.from_xml(self, child_element)
        child.parent = obj
        obj.msgBoxExtension = child        
      
    return obj
    
  def save_xml(self, filename):
    self_xml = self.to_xml(None)
    xml_string = ET.tostring(self_xml, encoding="utf-8").decode("utf-8")
    dom = xml.dom.minidom.parseString(xml_string)
    with open(filename, 'w') as f:
       f.write(dom.toprettyxml(indent="  "))
