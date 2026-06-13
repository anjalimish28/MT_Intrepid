import xml.etree.ElementTree as ET  
from pathlib import Path
import xml.dom.minidom
#import super types
from SuperTargetType import SuperTargetType
from SuperIOHardwareType import SuperIOHardwareType
from SuperPowerType import SuperPowerType

#import children classes
from SuperAssignmentSpecificationType import SuperAssignmentSpecificationType
from AttributeDatatypeConversion import AttributeDatatypeConversion

from ResistorInfo import ResistorInfo
from EletrcialInterfaces import EletrcialInterfaces

from sheildPorts import sheildPorts


# -------------------------------------------------------------------
# Automatically generated class from ecore model!! arduinosheild.
# Don't change here, change in source ecore model
# Code generator by Philipp Chrysalidis in 2025
# ======================================================================

class arduinosheild(SuperTargetType, SuperIOHardwareType, SuperPowerType):
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
    #children (references)
    #Check if it's a collection (i.e., upperBound <> 1)
    self.assignmentSpecification_list = list()  #Initialize as an empty list for multiple children
    self.electricalInterfaces = None  #Initialize as a single child (None by default)
    self.ports = None  #Initialize as a single child (None by default)
    self.parent = None #default is no parent, but can be set for every element
	
    #Check if it's a collection (i.e., upperBound <> 1)
  def add_assignmentSpecification(self, assignmentSpecification): #function for adding child
    self.assignmentSpecification_list.append(assignmentSpecification)
    assignmentSpecification.parent = self #link child to parent

  def to_xml(self, reference_name = None):
    element = ET.Element(reference_name)
    if not reference_name == "sheild" and not reference_name.lower() == "arduinosheild":
      element.set("xsi:type", "de.ucof.model.targets.sheild:arduinosheild")  
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
    # Convert children to nested XML elements
  # Multiple children
    for child in self.assignmentSpecification_list:  
      element.append(child.to_xml("assignmentSpecification"))  
  # Single child
    if self.electricalInterfaces is not None:
      element.append(self.electricalInterfaces.to_xml("electricalInterfaces"))  
  # Single child
    if self.ports is not None:
      element.append(self.ports.to_xml("ports"))  
    return element

  def from_xml(self, xml_element):
    # Instantiate an object of type arduinosheild
    obj = arduinosheild()  
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
    # Process children (references)
    # Reference with multiplicity: initialize a list and append each child object
    obj.assignmentSpecification_list = list()
    for child_element in xml_element.findall("assignmentSpecification"):
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if not xsi_type:
        child = SuperAssignmentSpecificationType.from_xml(self, child_element)
        child.parent = obj
        obj.assignmentSpecification_list.append(child)
      elif xsi_type.split(":", 1)[ 1 ].lower() == "attributedatatypeconversion":
        child = AttributeDatatypeConversion.from_xml(self, child_element)
        child.parent = obj
        obj.assignmentSpecification_list.append(child)
      
      elif xsi_type.split(":", 1)[ 1 ].lower() == "resistorinfo":
        child = ResistorInfo.from_xml(self, child_element)
        child.parent = obj
        obj.assignmentSpecification_list.append(child)
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
      if (not xsi_type) or (xsi_type.split(":", 1)[ 1 ].lower() == "sheildports"):
        child = sheildPorts.from_xml(self, child_element)
        child.parent = obj
        obj.ports = child        
      
    return obj
    
  def save_xml(self, filename):
    self_xml = self.to_xml(None)
    xml_string = ET.tostring(self_xml, encoding="utf-8").decode("utf-8")
    dom = xml.dom.minidom.parseString(xml_string)
    with open(filename, 'w') as f:
       f.write(dom.toprettyxml(indent="  "))
