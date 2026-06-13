import xml.etree.ElementTree as ET  
from pathlib import Path
import xml.dom.minidom
#import super types
from SuperA653ModuleType import SuperA653ModuleType

#import children classes
from DevicePorts import DevicePorts

from DeviceFunctions import DeviceFunctions

from HealthManagement import HealthManagement

from ModuleSchedule import ModuleSchedule

from ModulePartitions import ModulePartitions


# -------------------------------------------------------------------
# Automatically generated class from ecore model!! A653P4Module.
# Don't change here, change in source ecore model
# Code generator by Philipp Chrysalidis in 2025
# ======================================================================

class A653P4Module(SuperA653ModuleType):
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
    self.configurationLink = None
    self.implementationType = None
    #children (references)
    self.ports = None  #Initialize as a single child (None by default)
    self.deviceFunctions = None  #Initialize as a single child (None by default)
    self.healthManagement = None  #Initialize as a single child (None by default)
    self.moduleSchedule = None  #Initialize as a single child (None by default)
    self.partitions = None  #Initialize as a single child (None by default)
    self.parent = None #default is no parent, but can be set for every element
	

  def to_xml(self, reference_name = None):
    element = ET.Element(reference_name)
    if not reference_name == "devicetypes" and not reference_name.lower() == "a653p4module":
      element.set("xsi:type", "de.ucof.model.devices.devicetypes:A653P4Module")  
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
    if self.configurationLink is not None:
      element.set("configurationLink", str(self.configurationLink))  
    if self.implementationType is not None:
      element.set("implementationType", str(self.implementationType))  
    # Convert children to nested XML elements
  # Single child
    if self.ports is not None:
      element.append(self.ports.to_xml("ports"))  
  # Single child
    if self.deviceFunctions is not None:
      element.append(self.deviceFunctions.to_xml("deviceFunctions"))  
  # Single child
    if self.healthManagement is not None:
      element.append(self.healthManagement.to_xml("healthManagement"))  
  # Single child
    if self.moduleSchedule is not None:
      element.append(self.moduleSchedule.to_xml("moduleSchedule"))  
  # Single child
    if self.partitions is not None:
      element.append(self.partitions.to_xml("partitions"))  
    return element

  def from_xml(self, xml_element):
    # Instantiate an object of type A653P4Module
    obj = A653P4Module()  
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
    if "configurationLink" in xml_element.attrib:
        obj.configurationLink = xml_element.get("configurationLink")
    if "implementationType" in xml_element.attrib:
        obj.implementationType = xml_element.get("implementationType")
    # Process children (references)
    # Reference with a single value: find the child element and set the field if it exists
    child_element = xml_element.find("ports")
    if child_element is not None:  
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if (not xsi_type) or (xsi_type.split(":", 1)[ 1 ].lower() == "deviceports"):
        child = DevicePorts.from_xml(self, child_element)
        child.parent = obj
        obj.ports = child        
      
    # Reference with a single value: find the child element and set the field if it exists
    child_element = xml_element.find("deviceFunctions")
    if child_element is not None:  
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if (not xsi_type) or (xsi_type.split(":", 1)[ 1 ].lower() == "devicefunctions"):
        child = DeviceFunctions.from_xml(self, child_element)
        child.parent = obj
        obj.deviceFunctions = child        
      
    # Reference with a single value: find the child element and set the field if it exists
    child_element = xml_element.find("healthManagement")
    if child_element is not None:  
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if (not xsi_type) or (xsi_type.split(":", 1)[ 1 ].lower() == "healthmanagement"):
        child = HealthManagement.from_xml(self, child_element)
        child.parent = obj
        obj.healthManagement = child        
      
    # Reference with a single value: find the child element and set the field if it exists
    child_element = xml_element.find("moduleSchedule")
    if child_element is not None:  
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if (not xsi_type) or (xsi_type.split(":", 1)[ 1 ].lower() == "moduleschedule"):
        child = ModuleSchedule.from_xml(self, child_element)
        child.parent = obj
        obj.moduleSchedule = child        
      
    # Reference with a single value: find the child element and set the field if it exists
    child_element = xml_element.find("partitions")
    if child_element is not None:  
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if (not xsi_type) or (xsi_type.split(":", 1)[ 1 ].lower() == "modulepartitions"):
        child = ModulePartitions.from_xml(self, child_element)
        child.parent = obj
        obj.partitions = child        
      
    return obj
    
  def save_xml(self, filename):
    self_xml = self.to_xml(None)
    xml_string = ET.tostring(self_xml, encoding="utf-8").decode("utf-8")
    dom = xml.dom.minidom.parseString(xml_string)
    with open(filename, 'w') as f:
       f.write(dom.toprettyxml(indent="  "))
