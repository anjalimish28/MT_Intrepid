import xml.etree.ElementTree as ET  
from pathlib import Path
import xml.dom.minidom
#import super types
from SuperIdentifierType import SuperIdentifierType
from SuperTrackingType import SuperTrackingType

#import children classes
from srcDirectionExtension import srcDirectionExtension


# -------------------------------------------------------------------
# Automatically generated class from ecore model!! UDPSocket.
# Don't change here, change in source ecore model
# Code generator by Philipp Chrysalidis in 2025
# ======================================================================

class UDPSocket(SuperIdentifierType, SuperTrackingType):
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
    self.multicastInterfaceIP = None
    self.multicastTTL = None
    self.direction = None
    self.ipAdress = None
    self.port = None
    #children (references)
    #Check if it's a collection (i.e., upperBound <> 1)
    self.srcDirectionExtension_list = list()  #Initialize as an empty list for multiple children
    self.parent = None #default is no parent, but can be set for every element
	
    #Check if it's a collection (i.e., upperBound <> 1)
  def add_srcDirectionExtension(self, srcDirectionExtension): #function for adding child
    self.srcDirectionExtension_list.append(srcDirectionExtension)
    srcDirectionExtension.parent = self #link child to parent

  def to_xml(self, reference_name = None):
    element = ET.Element(reference_name)
    if not reference_name == "configECIC" and not reference_name.lower() == "udpsocket":
      element.set("xsi:type", "de.ucof.model.communication.configECIC:UDPSocket")  
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
    if self.multicastInterfaceIP is not None:
      element.set("multicastInterfaceIP", str(self.multicastInterfaceIP))  
    if self.multicastTTL is not None:
      element.set("multicastTTL", str(self.multicastTTL))  
    if self.direction is not None:
      element.set("direction", str(self.direction))  
    if self.ipAdress is not None:
      element.set("ipAdress", str(self.ipAdress))  
    if self.port is not None:
      element.set("port", str(self.port))  
    # Convert children to nested XML elements
  # Multiple children
    for child in self.srcDirectionExtension_list:  
      element.append(child.to_xml("srcDirectionExtension"))  
    return element

  def from_xml(self, xml_element):
    # Instantiate an object of type UDPSocket
    obj = UDPSocket()  
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
    if "multicastInterfaceIP" in xml_element.attrib:
        obj.multicastInterfaceIP = xml_element.get("multicastInterfaceIP")
    if "multicastTTL" in xml_element.attrib:
        obj.multicastTTL = xml_element.get("multicastTTL")
    if "direction" in xml_element.attrib:
        obj.direction = xml_element.get("direction")
    if "ipAdress" in xml_element.attrib:
        obj.ipAdress = xml_element.get("ipAdress")
    if "port" in xml_element.attrib:
        obj.port = xml_element.get("port")
    # Process children (references)
    # Reference with multiplicity: initialize a list and append each child object
    obj.srcDirectionExtension_list = list()
    for child_element in xml_element.findall("srcDirectionExtension"):
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if not xsi_type:
        child = srcDirectionExtension.from_xml(self, child_element)
        child.parent = obj
        obj.srcDirectionExtension_list.append(child)
      
    return obj
    
  def save_xml(self, filename):
    self_xml = self.to_xml(None)
    xml_string = ET.tostring(self_xml, encoding="utf-8").decode("utf-8")
    dom = xml.dom.minidom.parseString(xml_string)
    with open(filename, 'w') as f:
       f.write(dom.toprettyxml(indent="  "))
