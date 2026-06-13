import xml.etree.ElementTree as ET  
from pathlib import Path
import xml.dom.minidom
#import super types
from SuperIdentifierType import SuperIdentifierType

#import children classes
from Process import Process


# -------------------------------------------------------------------
# Automatically generated class from ecore model!! Processes.
# Don't change here, change in source ecore model
# Code generator by Philipp Chrysalidis in 2025
# ======================================================================

class Processes(SuperIdentifierType):
  def __init__(self):
    #attributes
    self.id = None
    self.name = None
    #children (references)
    #Check if it's a collection (i.e., upperBound <> 1)
    self.process_list = list()  #Initialize as an empty list for multiple children
    self.parent = None #default is no parent, but can be set for every element
	
    #Check if it's a collection (i.e., upperBound <> 1)
  def add_process(self, process): #function for adding child
    self.process_list.append(process)
    process.parent = self #link child to parent

  def to_xml(self, reference_name = None):
    element = ET.Element(reference_name)
    if not reference_name == "a653partition" and not reference_name.lower() == "processes":
      element.set("xsi:type", "de.ucof.model.a653partition:Processes")  
    # Convert attributes to XML attributes
    if self.id is not None:
      element.set("id", str(self.id))  
    if self.name is not None:
      element.set("name", str(self.name))  
    # Convert children to nested XML elements
  # Multiple children
    for child in self.process_list:  
      element.append(child.to_xml("process"))  
    return element

  def from_xml(self, xml_element):
    # Instantiate an object of type Processes
    obj = Processes()  
    # Convert XML attributes into object attributes
    if "id" in xml_element.attrib:
        obj.id = xml_element.get("id")
    if "name" in xml_element.attrib:
        obj.name = xml_element.get("name")
    # Process children (references)
    # Reference with multiplicity: initialize a list and append each child object
    obj.process_list = list()
    for child_element in xml_element.findall("process"):
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if not xsi_type:
        child = Process.from_xml(self, child_element)
        child.parent = obj
        obj.process_list.append(child)
      
    return obj
    
  def save_xml(self, filename):
    self_xml = self.to_xml(None)
    xml_string = ET.tostring(self_xml, encoding="utf-8").decode("utf-8")
    dom = xml.dom.minidom.parseString(xml_string)
    with open(filename, 'w') as f:
       f.write(dom.toprettyxml(indent="  "))
