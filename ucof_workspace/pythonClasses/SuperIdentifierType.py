import xml.etree.ElementTree as ET  
from pathlib import Path
import xml.dom.minidom
#import super types

#import children classes

# -------------------------------------------------------------------
# Automatically generated class from ecore model!! SuperIdentifierType.
# Don't change here, change in source ecore model
# Code generator by Philipp Chrysalidis in 2025
# ======================================================================

class SuperIdentifierType():
  def __init__(self):
    #attributes
    self.id = None
    self.name = None
    #children (references)
    self.parent = None #default is no parent, but can be set for every element
	

  def to_xml(self, reference_name = None):
    element = ET.Element(reference_name)
    if not reference_name == "etypes" and not reference_name.lower() == "superidentifiertype":
      element.set("xsi:type", "de.ucof.model.common.etypes:SuperIdentifierType")  
    # Convert attributes to XML attributes
    if self.id is not None:
      element.set("id", str(self.id))  
    if self.name is not None:
      element.set("name", str(self.name))  
    # Convert children to nested XML elements
    return element

  def from_xml(self, xml_element):
    # Instantiate an object of type SuperIdentifierType
    obj = SuperIdentifierType()  
    # Convert XML attributes into object attributes
    if "id" in xml_element.attrib:
        obj.id = xml_element.get("id")
    if "name" in xml_element.attrib:
        obj.name = xml_element.get("name")
    # Process children (references)
    return obj
    
  def save_xml(self, filename):
    self_xml = self.to_xml(None)
    xml_string = ET.tostring(self_xml, encoding="utf-8").decode("utf-8")
    dom = xml.dom.minidom.parseString(xml_string)
    with open(filename, 'w') as f:
       f.write(dom.toprettyxml(indent="  "))
