import xml.etree.ElementTree as ET  
from pathlib import Path
import xml.dom.minidom
#import super types
from SuperClassExtensionType import SuperClassExtensionType

#import children classes
from CanMailboxAddressFilter import CanMailboxAddressFilter

from CanMailboxAddressFilter import CanMailboxAddressFilter

from CanMailboxOutSlot import CanMailboxOutSlot


# -------------------------------------------------------------------
# Automatically generated class from ecore model!! MsgBoxExtension.
# Don't change here, change in source ecore model
# Code generator by Philipp Chrysalidis in 2025
# ======================================================================

class MsgBoxExtension(SuperClassExtensionType):
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
    self.extendedClassID = None
    self.numOfOutgoingMailboxes = None
    self.numOfIncomingMailboxes = None
    self.smallBufferSize = None
    self.smallBufferCount = None
    self.mediumBufferSize = None
    self.mediumBufferCount = None
    self.bigBufferSize = None
    self.bigBufferCount = None
    self.nodeAddr = None
    self.nodeAddressSymbol = None
    #children (references)
    #Check if it's a collection (i.e., upperBound <> 1)
    self.incomingDestinationFilter_list = list()  #Initialize as an empty list for multiple children
    #Check if it's a collection (i.e., upperBound <> 1)
    self.senderSourceFilter_list = list()  #Initialize as an empty list for multiple children
    #Check if it's a collection (i.e., upperBound <> 1)
    self.outgoingMailboxSlot_list = list()  #Initialize as an empty list for multiple children
    self.parent = None #default is no parent, but can be set for every element
	
    #Check if it's a collection (i.e., upperBound <> 1)
  def add_incomingDestinationFilter(self, incomingDestinationFilter): #function for adding child
    self.incomingDestinationFilter_list.append(incomingDestinationFilter)
    incomingDestinationFilter.parent = self #link child to parent
    #Check if it's a collection (i.e., upperBound <> 1)
  def add_senderSourceFilter(self, senderSourceFilter): #function for adding child
    self.senderSourceFilter_list.append(senderSourceFilter)
    senderSourceFilter.parent = self #link child to parent
    #Check if it's a collection (i.e., upperBound <> 1)
  def add_outgoingMailboxSlot(self, outgoingMailboxSlot): #function for adding child
    self.outgoingMailboxSlot_list.append(outgoingMailboxSlot)
    outgoingMailboxSlot.parent = self #link child to parent

  def to_xml(self, reference_name = None):
    element = ET.Element(reference_name)
    if not reference_name == "intrepidgateway" and not reference_name.lower() == "msgboxextension":
      element.set("xsi:type", "de.ucof.model.targets.intrepidgateway:MsgBoxExtension")  
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
    if self.extendedClassID is not None:
      element.set("extendedClassID", str(self.extendedClassID))  
    if self.numOfOutgoingMailboxes is not None:
      element.set("numOfOutgoingMailboxes", str(self.numOfOutgoingMailboxes))  
    if self.numOfIncomingMailboxes is not None:
      element.set("numOfIncomingMailboxes", str(self.numOfIncomingMailboxes))  
    if self.smallBufferSize is not None:
      element.set("smallBufferSize", str(self.smallBufferSize))  
    if self.smallBufferCount is not None:
      element.set("smallBufferCount", str(self.smallBufferCount))  
    if self.mediumBufferSize is not None:
      element.set("mediumBufferSize", str(self.mediumBufferSize))  
    if self.mediumBufferCount is not None:
      element.set("mediumBufferCount", str(self.mediumBufferCount))  
    if self.bigBufferSize is not None:
      element.set("bigBufferSize", str(self.bigBufferSize))  
    if self.bigBufferCount is not None:
      element.set("bigBufferCount", str(self.bigBufferCount))  
    if self.nodeAddr is not None:
      element.set("nodeAddr", str(self.nodeAddr))  
    if self.nodeAddressSymbol is not None:
      element.set("nodeAddressSymbol", str(self.nodeAddressSymbol))  
    # Convert children to nested XML elements
  # Multiple children
    for child in self.incomingDestinationFilter_list:  
      element.append(child.to_xml("incomingDestinationFilter"))  
  # Multiple children
    for child in self.senderSourceFilter_list:  
      element.append(child.to_xml("senderSourceFilter"))  
  # Multiple children
    for child in self.outgoingMailboxSlot_list:  
      element.append(child.to_xml("outgoingMailboxSlot"))  
    return element

  def from_xml(self, xml_element):
    # Instantiate an object of type MsgBoxExtension
    obj = MsgBoxExtension()  
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
    if "extendedClassID" in xml_element.attrib:
        obj.extendedClassID = xml_element.get("extendedClassID")
    if "numOfOutgoingMailboxes" in xml_element.attrib:
        obj.numOfOutgoingMailboxes = xml_element.get("numOfOutgoingMailboxes")
    if "numOfIncomingMailboxes" in xml_element.attrib:
        obj.numOfIncomingMailboxes = xml_element.get("numOfIncomingMailboxes")
    if "smallBufferSize" in xml_element.attrib:
        obj.smallBufferSize = xml_element.get("smallBufferSize")
    if "smallBufferCount" in xml_element.attrib:
        obj.smallBufferCount = xml_element.get("smallBufferCount")
    if "mediumBufferSize" in xml_element.attrib:
        obj.mediumBufferSize = xml_element.get("mediumBufferSize")
    if "mediumBufferCount" in xml_element.attrib:
        obj.mediumBufferCount = xml_element.get("mediumBufferCount")
    if "bigBufferSize" in xml_element.attrib:
        obj.bigBufferSize = xml_element.get("bigBufferSize")
    if "bigBufferCount" in xml_element.attrib:
        obj.bigBufferCount = xml_element.get("bigBufferCount")
    if "nodeAddr" in xml_element.attrib:
        obj.nodeAddr = xml_element.get("nodeAddr")
    if "nodeAddressSymbol" in xml_element.attrib:
        obj.nodeAddressSymbol = xml_element.get("nodeAddressSymbol")
    # Process children (references)
    # Reference with multiplicity: initialize a list and append each child object
    obj.incomingDestinationFilter_list = list()
    for child_element in xml_element.findall("incomingDestinationFilter"):
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if not xsi_type:
        child = CanMailboxAddressFilter.from_xml(self, child_element)
        child.parent = obj
        obj.incomingDestinationFilter_list.append(child)
      
    # Reference with multiplicity: initialize a list and append each child object
    obj.senderSourceFilter_list = list()
    for child_element in xml_element.findall("senderSourceFilter"):
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if not xsi_type:
        child = CanMailboxAddressFilter.from_xml(self, child_element)
        child.parent = obj
        obj.senderSourceFilter_list.append(child)
      
    # Reference with multiplicity: initialize a list and append each child object
    obj.outgoingMailboxSlot_list = list()
    for child_element in xml_element.findall("outgoingMailboxSlot"):
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if not xsi_type:
        child = CanMailboxOutSlot.from_xml(self, child_element)
        child.parent = obj
        obj.outgoingMailboxSlot_list.append(child)
      
    return obj
    
  def save_xml(self, filename):
    self_xml = self.to_xml(None)
    xml_string = ET.tostring(self_xml, encoding="utf-8").decode("utf-8")
    dom = xml.dom.minidom.parseString(xml_string)
    with open(filename, 'w') as f:
       f.write(dom.toprettyxml(indent="  "))
