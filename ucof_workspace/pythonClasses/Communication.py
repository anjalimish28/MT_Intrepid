import xml.etree.ElementTree as ET  
from pathlib import Path
import xml.dom.minidom
#import super types
from SuperTrackingType import SuperTrackingType
from SuperIdentifierType import SuperIdentifierType

#import children classes
from Database import Database

from Connectors import Connectors

from ED247Configurations import ED247Configurations

from CommunicationDevices import CommunicationDevices


# -------------------------------------------------------------------
# Automatically generated class from ecore model!! Communication.
# Don't change here, change in source ecore model
# Code generator by Philipp Chrysalidis in 2025
# ======================================================================

class Communication(SuperTrackingType, SuperIdentifierType):
  def __init__(self):
    #attributes
    self.documentation = None
    self.modified = None
    self.modifier = None
    self.traceLink = None
    self.created = None
    self.creator = None
    self.version = None
    self.id = None
    self.name = None
    #children (references)
    self.database = None  #Initialize as a single child (None by default)
    self.connectors = None  #Initialize as a single child (None by default)
    self.ed247Configurations = None  #Initialize as a single child (None by default)
    #Check if it's a collection (i.e., upperBound <> 1)
    self.communicationDevices_list = list()  #Initialize as an empty list for multiple children
    self.parent = None #default is no parent, but can be set for every element
	
    #Check if it's a collection (i.e., upperBound <> 1)
  def add_communicationDevices(self, communicationDevices): #function for adding child
    self.communicationDevices_list.append(communicationDevices)
    communicationDevices.parent = self #link child to parent

  def to_xml(self, reference_name = None):
    element = ET.Element(reference_name)
    if not reference_name == "communication" and not reference_name.lower() == "communication":
      element.set("xsi:type", "de.ucof.model.communication:Communication")  
    # Convert attributes to XML attributes
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
    if self.id is not None:
      element.set("id", str(self.id))  
    if self.name is not None:
      element.set("name", str(self.name))  
    # Convert children to nested XML elements
  # Single child
    if self.database is not None:
      element.append(self.database.to_xml("database"))  
  # Single child
    if self.connectors is not None:
      element.append(self.connectors.to_xml("connectors"))  
  # Single child
    if self.ed247Configurations is not None:
      element.append(self.ed247Configurations.to_xml("ed247Configurations"))  
  # Multiple children
    for child in self.communicationDevices_list:  
      element.append(child.to_xml("communicationDevices"))  
    return element

  def from_xml(self, xml_element):
    # Instantiate an object of type Communication
    obj = Communication()  
    # Convert XML attributes into object attributes
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
    if "id" in xml_element.attrib:
        obj.id = xml_element.get("id")
    if "name" in xml_element.attrib:
        obj.name = xml_element.get("name")
    # Process children (references)
    # Reference with a single value: find the child element and set the field if it exists
    child_element = xml_element.find("database")
    if child_element is not None:  
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if (not xsi_type) or (xsi_type.split(":", 1)[ 1 ].lower() == "database"):
        child = Database.from_xml(self, child_element)
        child.parent = obj
        obj.database = child        
      
    # Reference with a single value: find the child element and set the field if it exists
    child_element = xml_element.find("connectors")
    if child_element is not None:  
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if (not xsi_type) or (xsi_type.split(":", 1)[ 1 ].lower() == "connectors"):
        child = Connectors.from_xml(self, child_element)
        child.parent = obj
        obj.connectors = child        
      
    # Reference with a single value: find the child element and set the field if it exists
    child_element = xml_element.find("ed247Configurations")
    if child_element is not None:  
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if (not xsi_type) or (xsi_type.split(":", 1)[ 1 ].lower() == "ed247configurations"):
        child = ED247Configurations.from_xml(self, child_element)
        child.parent = obj
        obj.ed247Configurations = child        
      
    # Reference with multiplicity: initialize a list and append each child object
    obj.communicationDevices_list = list()
    for child_element in xml_element.findall("communicationDevices"):
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if not xsi_type:
        child = CommunicationDevices.from_xml(self, child_element)
        child.parent = obj
        obj.communicationDevices_list.append(child)
      
    return obj
    
  def save_xml(self, filename):
    self_xml = self.to_xml(None)
    xml_string = ET.tostring(self_xml, encoding="utf-8").decode("utf-8")
    dom = xml.dom.minidom.parseString(xml_string)
    with open(filename, 'w') as f:
       f.write(dom.toprettyxml(indent="  "))
