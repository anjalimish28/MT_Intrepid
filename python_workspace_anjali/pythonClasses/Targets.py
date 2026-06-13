import xml.etree.ElementTree as ET  
from pathlib import Path
import xml.dom.minidom
#import super types
from SuperIdentifierType import SuperIdentifierType
from SuperTrackingType import SuperTrackingType

#import children classes
from SuperTargetType import SuperTargetType
from stm32f446re import stm32f446re

from ads1115 import ads1115

from arduinosheild import arduinosheild

from escon409510 import escon409510

from sn65hvd230 import sn65hvd230

from mts360 import mts360

from va41620peb1 import va41620peb1
from PowerConnectionSet import PowerConnectionSet

from ElectricalPowerGridSet import ElectricalPowerGridSet


# -------------------------------------------------------------------
# Automatically generated class from ecore model!! Targets.
# Don't change here, change in source ecore model
# Code generator by Philipp Chrysalidis in 2025
# ======================================================================

class Targets(SuperIdentifierType, SuperTrackingType):
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
    #children (references)
    #Check if it's a collection (i.e., upperBound <> 1)
    self.targetConfiguration_list = list()  #Initialize as an empty list for multiple children
    #Check if it's a collection (i.e., upperBound <> 1)
    self.powerConnectionSet_list = list()  #Initialize as an empty list for multiple children
    #Check if it's a collection (i.e., upperBound <> 1)
    self.electricalPowerGridSet_list = list()  #Initialize as an empty list for multiple children
    self.parent = None #default is no parent, but can be set for every element
	
    #Check if it's a collection (i.e., upperBound <> 1)
  def add_targetConfiguration(self, targetConfiguration): #function for adding child
    self.targetConfiguration_list.append(targetConfiguration)
    targetConfiguration.parent = self #link child to parent
    #Check if it's a collection (i.e., upperBound <> 1)
  def add_powerConnectionSet(self, powerConnectionSet): #function for adding child
    self.powerConnectionSet_list.append(powerConnectionSet)
    powerConnectionSet.parent = self #link child to parent
    #Check if it's a collection (i.e., upperBound <> 1)
  def add_electricalPowerGridSet(self, electricalPowerGridSet): #function for adding child
    self.electricalPowerGridSet_list.append(electricalPowerGridSet)
    electricalPowerGridSet.parent = self #link child to parent

  def to_xml(self, reference_name = None):
    element = ET.Element(reference_name)
    if not reference_name == "targets" and not reference_name.lower() == "targets":
      element.set("xsi:type", "de.ucof.model.targets:Targets")  
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
    # Convert children to nested XML elements
  # Multiple children
    for child in self.targetConfiguration_list:  
      element.append(child.to_xml("targetConfiguration"))  
  # Multiple children
    for child in self.powerConnectionSet_list:  
      element.append(child.to_xml("powerConnectionSet"))  
  # Multiple children
    for child in self.electricalPowerGridSet_list:  
      element.append(child.to_xml("electricalPowerGridSet"))  
    return element

  def from_xml(self, xml_element):
    # Instantiate an object of type Targets
    obj = Targets()  
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
    # Process children (references)
    # Reference with multiplicity: initialize a list and append each child object
    obj.targetConfiguration_list = list()
    for child_element in xml_element.findall("targetConfiguration"):
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if not xsi_type:
        child = SuperTargetType.from_xml(self, child_element)
        child.parent = obj
        obj.targetConfiguration_list.append(child)
      elif xsi_type.split(":", 1)[ 1 ].lower() == "stm32f446re":
        child = stm32f446re.from_xml(self, child_element)
        child.parent = obj
        obj.targetConfiguration_list.append(child)
      
      elif xsi_type.split(":", 1)[ 1 ].lower() == "ads1115":
        child = ads1115.from_xml(self, child_element)
        child.parent = obj
        obj.targetConfiguration_list.append(child)
      
      elif xsi_type.split(":", 1)[ 1 ].lower() == "arduinosheild":
        child = arduinosheild.from_xml(self, child_element)
        child.parent = obj
        obj.targetConfiguration_list.append(child)
      
      elif xsi_type.split(":", 1)[ 1 ].lower() == "escon409510":
        child = escon409510.from_xml(self, child_element)
        child.parent = obj
        obj.targetConfiguration_list.append(child)
      
      elif xsi_type.split(":", 1)[ 1 ].lower() == "sn65hvd230":
        child = sn65hvd230.from_xml(self, child_element)
        child.parent = obj
        obj.targetConfiguration_list.append(child)
      
      elif xsi_type.split(":", 1)[ 1 ].lower() == "mts360":
        child = mts360.from_xml(self, child_element)
        child.parent = obj
        obj.targetConfiguration_list.append(child)
      
      elif xsi_type.split(":", 1)[ 1 ].lower() == "va41620peb1":
        child = va41620peb1.from_xml(self, child_element)
        child.parent = obj
        obj.targetConfiguration_list.append(child)
    # Reference with multiplicity: initialize a list and append each child object
    obj.powerConnectionSet_list = list()
    for child_element in xml_element.findall("powerConnectionSet"):
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if not xsi_type:
        child = PowerConnectionSet.from_xml(self, child_element)
        child.parent = obj
        obj.powerConnectionSet_list.append(child)
      
    # Reference with multiplicity: initialize a list and append each child object
    obj.electricalPowerGridSet_list = list()
    for child_element in xml_element.findall("electricalPowerGridSet"):
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if not xsi_type:
        child = ElectricalPowerGridSet.from_xml(self, child_element)
        child.parent = obj
        obj.electricalPowerGridSet_list.append(child)
      
    return obj
    
  def save_xml(self, filename):
    self_xml = self.to_xml(None)
    xml_string = ET.tostring(self_xml, encoding="utf-8").decode("utf-8")
    dom = xml.dom.minidom.parseString(xml_string)
    with open(filename, 'w') as f:
       f.write(dom.toprettyxml(indent="  "))
