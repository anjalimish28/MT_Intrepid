import xml.etree.ElementTree as ET  
from pathlib import Path
import xml.dom.minidom
#import super types
from EthernetPort import EthernetPort

#import children classes
from A664VirtualLinkSuper import A664VirtualLinkSuper
from A664VirtualLinkIn import A664VirtualLinkIn

from A664VirtualLinkOut import A664VirtualLinkOut

# -------------------------------------------------------------------
# Automatically generated class from ecore model!! A664Bus.
# Don't change here, change in source ecore model
# Code generator by Philipp Chrysalidis in 2025
# ======================================================================

class A664Bus(EthernetPort):
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
    self.iPAddress = None
    self.subnetMask = None
    #children (references)
    self.virtualLink = None  #Initialize as a single child (None by default)
    self.parent = None #default is no parent, but can be set for every element
	

  def to_xml(self, reference_name = None):
    element = ET.Element(reference_name)
    if not reference_name == "arinc664" and not reference_name.lower() == "a664bus":
      element.set("xsi:type", "de.ucof.model.communication.basedonethernet.arinc664:A664Bus")  
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
    if self.iPAddress is not None:
      element.set("iPAddress", str(self.iPAddress))  
    if self.subnetMask is not None:
      element.set("subnetMask", str(self.subnetMask))  
    # Convert children to nested XML elements
  # Single child
    if self.virtualLink is not None:
      element.append(self.virtualLink.to_xml("virtualLink"))  
    return element

  def from_xml(self, xml_element):
    # Instantiate an object of type A664Bus
    obj = A664Bus()  
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
    if "iPAddress" in xml_element.attrib:
        obj.iPAddress = xml_element.get("iPAddress")
    if "subnetMask" in xml_element.attrib:
        obj.subnetMask = xml_element.get("subnetMask")
    # Process children (references)
    # Reference with a single value: find the child element and set the field if it exists
    child_element = xml_element.find("virtualLink")
    if child_element is not None:  
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if (not xsi_type) or (xsi_type.split(":", 1)[ 1 ].lower() == "a664virtuallinksuper"):
        child = A664VirtualLinkSuper.from_xml(self, child_element)
        child.parent = obj
        obj.virtualLink = child        
      elif xsi_type.split(":", 1)[ 1 ].lower() == "a664virtuallinkin":
        child = A664VirtualLinkIn.from_xml(self, child_element)
        child.parent = obj
        obj.virtualLink = child
      
      elif xsi_type.split(":", 1)[ 1 ].lower() == "a664virtuallinkout":
        child = A664VirtualLinkOut.from_xml(self, child_element)
        child.parent = obj
        obj.virtualLink = child
    return obj
    
  def save_xml(self, filename):
    self_xml = self.to_xml(None)
    xml_string = ET.tostring(self_xml, encoding="utf-8").decode("utf-8")
    dom = xml.dom.minidom.parseString(xml_string)
    with open(filename, 'w') as f:
       f.write(dom.toprettyxml(indent="  "))
