import xml.etree.ElementTree as ET  
from pathlib import Path
import xml.dom.minidom
#import super types
from SuperFunctionType import SuperFunctionType

#import children classes
from FunctionLink import FunctionLink

from PayloadRouting import PayloadRouting

from SignalRouting import SignalRouting


# -------------------------------------------------------------------
# Automatically generated class from ecore model!! Routing.
# Don't change here, change in source ecore model
# Code generator by Philipp Chrysalidis in 2025
# ======================================================================

class Routing(SuperFunctionType):
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
    self.functionLink = None  #Initialize as a single child (None by default)
    #Check if it's a collection (i.e., upperBound <> 1)
    self.payloadRouting_list = list()  #Initialize as an empty list for multiple children
    #Check if it's a collection (i.e., upperBound <> 1)
    self.signalRouting_list = list()  #Initialize as an empty list for multiple children
    self.parent = None #default is no parent, but can be set for every element
	
    #Check if it's a collection (i.e., upperBound <> 1)
  def add_payloadRouting(self, payloadRouting): #function for adding child
    self.payloadRouting_list.append(payloadRouting)
    payloadRouting.parent = self #link child to parent
    #Check if it's a collection (i.e., upperBound <> 1)
  def add_signalRouting(self, signalRouting): #function for adding child
    self.signalRouting_list.append(signalRouting)
    signalRouting.parent = self #link child to parent

  def to_xml(self, reference_name = None):
    element = ET.Element(reference_name)
    if not reference_name == "routing" and not reference_name.lower() == "routing":
      element.set("xsi:type", "de.ucof.model.devices.functions.routing:Routing")  
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
  # Single child
    if self.functionLink is not None:
      element.append(self.functionLink.to_xml("functionLink"))  
  # Multiple children
    for child in self.payloadRouting_list:  
      element.append(child.to_xml("payloadRouting"))  
  # Multiple children
    for child in self.signalRouting_list:  
      element.append(child.to_xml("signalRouting"))  
    return element

  def from_xml(self, xml_element):
    # Instantiate an object of type Routing
    obj = Routing()  
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
    # Reference with a single value: find the child element and set the field if it exists
    child_element = xml_element.find("functionLink")
    if child_element is not None:  
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if (not xsi_type) or (xsi_type.split(":", 1)[ 1 ].lower() == "functionlink"):
        child = FunctionLink.from_xml(self, child_element)
        child.parent = obj
        obj.functionLink = child        
      
    # Reference with multiplicity: initialize a list and append each child object
    obj.payloadRouting_list = list()
    for child_element in xml_element.findall("payloadRouting"):
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if not xsi_type:
        child = PayloadRouting.from_xml(self, child_element)
        child.parent = obj
        obj.payloadRouting_list.append(child)
      
    # Reference with multiplicity: initialize a list and append each child object
    obj.signalRouting_list = list()
    for child_element in xml_element.findall("signalRouting"):
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if not xsi_type:
        child = SignalRouting.from_xml(self, child_element)
        child.parent = obj
        obj.signalRouting_list.append(child)
      
    return obj
    
  def save_xml(self, filename):
    self_xml = self.to_xml(None)
    xml_string = ET.tostring(self_xml, encoding="utf-8").decode("utf-8")
    dom = xml.dom.minidom.parseString(xml_string)
    with open(filename, 'w') as f:
       f.write(dom.toprettyxml(indent="  "))
