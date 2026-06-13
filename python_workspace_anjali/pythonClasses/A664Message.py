import xml.etree.ElementTree as ET  
from pathlib import Path
import xml.dom.minidom
#import super types
from SuperMessageType import SuperMessageType

#import children classes

# -------------------------------------------------------------------
# Automatically generated class from ecore model!! A664Message.
# Don't change here, change in source ecore model
# Code generator by Philipp Chrysalidis in 2025
# ======================================================================

class A664Message(SuperMessageType):
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
    self.destinationMAC = None
    self.sourceMAC = None
    self.etherType = None
    self.sourceIP = None
    self.destinationIP = None
    self.destinationPort = None
    self.sourcePort = None
    self.TTL = None
    self.Protocol = None
    self.ethernetIdentification = None
    self.flagsAndFragmentOffset = None
    self.versionAndIHL = None
    self.typeOfService = None
    self.virtualLink = None
    self.virtualLinkOffset = None
    #children (references)
    self.parent = None #default is no parent, but can be set for every element
	

  def to_xml(self, reference_name = None):
    element = ET.Element(reference_name)
    if not reference_name == "arinc664" and not reference_name.lower() == "a664message":
      element.set("xsi:type", "de.ucof.model.communication.basedonethernet.arinc664:A664Message")  
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
    if self.destinationMAC is not None:
      element.set("destinationMAC", str(self.destinationMAC))  
    if self.sourceMAC is not None:
      element.set("sourceMAC", str(self.sourceMAC))  
    if self.etherType is not None:
      element.set("etherType", str(self.etherType))  
    if self.sourceIP is not None:
      element.set("sourceIP", str(self.sourceIP))  
    if self.destinationIP is not None:
      element.set("destinationIP", str(self.destinationIP))  
    if self.destinationPort is not None:
      element.set("destinationPort", str(self.destinationPort))  
    if self.sourcePort is not None:
      element.set("sourcePort", str(self.sourcePort))  
    if self.TTL is not None:
      element.set("TTL", str(self.TTL))  
    if self.Protocol is not None:
      element.set("Protocol", str(self.Protocol))  
    if self.ethernetIdentification is not None:
      element.set("ethernetIdentification", str(self.ethernetIdentification))  
    if self.flagsAndFragmentOffset is not None:
      element.set("flagsAndFragmentOffset", str(self.flagsAndFragmentOffset))  
    if self.versionAndIHL is not None:
      element.set("versionAndIHL", str(self.versionAndIHL))  
    if self.typeOfService is not None:
      element.set("typeOfService", str(self.typeOfService))  
    if self.virtualLink is not None:
      element.set("virtualLink", str(self.virtualLink))  
    if self.virtualLinkOffset is not None:
      element.set("virtualLinkOffset", str(self.virtualLinkOffset))  
    # Convert children to nested XML elements
    return element

  def from_xml(self, xml_element):
    # Instantiate an object of type A664Message
    obj = A664Message()  
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
    if "destinationMAC" in xml_element.attrib:
        obj.destinationMAC = xml_element.get("destinationMAC")
    if "sourceMAC" in xml_element.attrib:
        obj.sourceMAC = xml_element.get("sourceMAC")
    if "etherType" in xml_element.attrib:
        obj.etherType = xml_element.get("etherType")
    if "sourceIP" in xml_element.attrib:
        obj.sourceIP = xml_element.get("sourceIP")
    if "destinationIP" in xml_element.attrib:
        obj.destinationIP = xml_element.get("destinationIP")
    if "destinationPort" in xml_element.attrib:
        obj.destinationPort = xml_element.get("destinationPort")
    if "sourcePort" in xml_element.attrib:
        obj.sourcePort = xml_element.get("sourcePort")
    if "TTL" in xml_element.attrib:
        obj.TTL = xml_element.get("TTL")
    if "Protocol" in xml_element.attrib:
        obj.Protocol = xml_element.get("Protocol")
    if "ethernetIdentification" in xml_element.attrib:
        obj.ethernetIdentification = xml_element.get("ethernetIdentification")
    if "flagsAndFragmentOffset" in xml_element.attrib:
        obj.flagsAndFragmentOffset = xml_element.get("flagsAndFragmentOffset")
    if "versionAndIHL" in xml_element.attrib:
        obj.versionAndIHL = xml_element.get("versionAndIHL")
    if "typeOfService" in xml_element.attrib:
        obj.typeOfService = xml_element.get("typeOfService")
    if "virtualLink" in xml_element.attrib:
        obj.virtualLink = xml_element.get("virtualLink")
    if "virtualLinkOffset" in xml_element.attrib:
        obj.virtualLinkOffset = xml_element.get("virtualLinkOffset")
    # Process children (references)
    return obj
    
  def save_xml(self, filename):
    self_xml = self.to_xml(None)
    xml_string = ET.tostring(self_xml, encoding="utf-8").decode("utf-8")
    dom = xml.dom.minidom.parseString(xml_string)
    with open(filename, 'w') as f:
       f.write(dom.toprettyxml(indent="  "))
