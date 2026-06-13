import xml.etree.ElementTree as ET  
from pathlib import Path
import xml.dom.minidom
#import super types
from CommunicationSetType import CommunicationSetType

#import children classes
from SuperMessageType import SuperMessageType
from A429Message import A429Message

from A825Message import A825Message

from SuperEthernetMessageType import SuperEthernetMessageType
from EthernetTX import EthernetTX

from EthernetRX import EthernetRX
from A664Message import A664Message

from I2CMessage import I2CMessage

# -------------------------------------------------------------------
# Automatically generated class from ecore model!! MessageSet.
# Don't change here, change in source ecore model
# Code generator by Philipp Chrysalidis in 2025
# ======================================================================

class MessageSet(CommunicationSetType):
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
    self.setname = None
    #children (references)
    #Check if it's a collection (i.e., upperBound <> 1)
    self.message_list = list()  #Initialize as an empty list for multiple children
    self.parent = None #default is no parent, but can be set for every element
	
    #Check if it's a collection (i.e., upperBound <> 1)
  def add_message(self, message): #function for adding child
    self.message_list.append(message)
    message.parent = self #link child to parent

  def to_xml(self, reference_name = None):
    element = ET.Element(reference_name)
    if not reference_name == "communication" and not reference_name.lower() == "messageset":
      element.set("xsi:type", "de.ucof.model.communication:MessageSet")  
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
    if self.setname is not None:
      element.set("setname", str(self.setname))  
    # Convert children to nested XML elements
  # Multiple children
    for child in self.message_list:  
      element.append(child.to_xml("message"))  
    return element

  def from_xml(self, xml_element):
    # Instantiate an object of type MessageSet
    obj = MessageSet()  
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
    if "setname" in xml_element.attrib:
        obj.setname = xml_element.get("setname")
    # Process children (references)
    # Reference with multiplicity: initialize a list and append each child object
    obj.message_list = list()
    for child_element in xml_element.findall("message"):
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if not xsi_type:
        child = SuperMessageType.from_xml(self, child_element)
        child.parent = obj
        obj.message_list.append(child)
      elif xsi_type.split(":", 1)[ 1 ].lower() == "a429message":
        child = A429Message.from_xml(self, child_element)
        child.parent = obj
        obj.message_list.append(child)
      
      elif xsi_type.split(":", 1)[ 1 ].lower() == "a825message":
        child = A825Message.from_xml(self, child_element)
        child.parent = obj
        obj.message_list.append(child)
      
      elif xsi_type.split(":", 1)[ 1 ].lower() == "superethernetmessagetype":
        child = SuperEthernetMessageType.from_xml(self, child_element)
        child.parent = obj
        obj.message_list.append(child)
      elif xsi_type.split(":", 1)[ 1 ].lower() == "ethernettx":
        child = EthernetTX.from_xml(self, child_element)
        child.parent = obj
        obj.message_list.append(child)
      
      elif xsi_type.split(":", 1)[ 1 ].lower() == "ethernetrx":
        child = EthernetRX.from_xml(self, child_element)
        child.parent = obj
        obj.message_list.append(child)
      elif xsi_type.split(":", 1)[ 1 ].lower() == "a664message":
        child = A664Message.from_xml(self, child_element)
        child.parent = obj
        obj.message_list.append(child)
      
      elif xsi_type.split(":", 1)[ 1 ].lower() == "i2cmessage":
        child = I2CMessage.from_xml(self, child_element)
        child.parent = obj
        obj.message_list.append(child)
    return obj
    
  def save_xml(self, filename):
    self_xml = self.to_xml(None)
    xml_string = ET.tostring(self_xml, encoding="utf-8").decode("utf-8")
    dom = xml.dom.minidom.parseString(xml_string)
    with open(filename, 'w') as f:
       f.write(dom.toprettyxml(indent="  "))
