import xml.etree.ElementTree as ET  
from pathlib import Path
import xml.dom.minidom
#import super types

#import children classes

# -------------------------------------------------------------------
# Automatically generated class from ecore model!! HardwareInformation.
# Don't change here, change in source ecore model
# Code generator by Philipp Chrysalidis in 2025
# ======================================================================

class HardwareInformation():
  def __init__(self):
    #attributes
    self.hardwareTopologyName = None
    self.nameOfHardwareSystem = None
    self.iPAddressOfHardwareSystem = None
    #children (references)
    self.parent = None #default is no parent, but can be set for every element
	

  def to_xml(self, reference_name = None):
    element = ET.Element(reference_name)
    if not reference_name == "targets" and not reference_name.lower() == "hardwareinformation":
      element.set("xsi:type", "de.ucof.model.targets:HardwareInformation")  
    # Convert attributes to XML attributes
    if self.hardwareTopologyName is not None:
      element.set("hardwareTopologyName", str(self.hardwareTopologyName))  
    if self.nameOfHardwareSystem is not None:
      element.set("nameOfHardwareSystem", str(self.nameOfHardwareSystem))  
    if self.iPAddressOfHardwareSystem is not None:
      element.set("iPAddressOfHardwareSystem", str(self.iPAddressOfHardwareSystem))  
    # Convert children to nested XML elements
    return element

  def from_xml(self, xml_element):
    # Instantiate an object of type HardwareInformation
    obj = HardwareInformation()  
    # Convert XML attributes into object attributes
    if "hardwareTopologyName" in xml_element.attrib:
        obj.hardwareTopologyName = xml_element.get("hardwareTopologyName")
    if "nameOfHardwareSystem" in xml_element.attrib:
        obj.nameOfHardwareSystem = xml_element.get("nameOfHardwareSystem")
    if "iPAddressOfHardwareSystem" in xml_element.attrib:
        obj.iPAddressOfHardwareSystem = xml_element.get("iPAddressOfHardwareSystem")
    # Process children (references)
    return obj
    
  def save_xml(self, filename):
    self_xml = self.to_xml(None)
    xml_string = ET.tostring(self_xml, encoding="utf-8").decode("utf-8")
    dom = xml.dom.minidom.parseString(xml_string)
    with open(filename, 'w') as f:
       f.write(dom.toprettyxml(indent="  "))
