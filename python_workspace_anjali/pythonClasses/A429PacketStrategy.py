import xml.etree.ElementTree as ET  
from pathlib import Path
import xml.dom.minidom
#import super types
from SuperPacketStrategyType import SuperPacketStrategyType

#import children classes
from Gap import Gap

from TriggerWords import TriggerWords


# -------------------------------------------------------------------
# Automatically generated class from ecore model!! A429PacketStrategy.
# Don't change here, change in source ecore model
# Code generator by Philipp Chrysalidis in 2025
# ======================================================================

class A429PacketStrategy(SuperPacketStrategyType):
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
    self.PeriodNs = None
    self.Direction = None
    #children (references)
    self.Gap = None  #Initialize as a single child (None by default)
    #Check if it's a collection (i.e., upperBound <> 1)
    self.TriggerWords_list = list()  #Initialize as an empty list for multiple children
    self.parent = None #default is no parent, but can be set for every element
	
    #Check if it's a collection (i.e., upperBound <> 1)
  def add_TriggerWords(self, TriggerWords): #function for adding child
    self.TriggerWords_list.append(TriggerWords)
    TriggerWords.parent = self #link child to parent

  def to_xml(self, reference_name = None):
    element = ET.Element(reference_name)
    if not reference_name == "packageStrategyTypes" and not reference_name.lower() == "a429packetstrategy":
      element.set("xsi:type", "de.ucof.model.communication.configECIC.packageStrategyTypes:A429PacketStrategy")  
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
    if self.PeriodNs is not None:
      element.set("PeriodNs", str(self.PeriodNs))  
    if self.Direction is not None:
      element.set("Direction", str(self.Direction))  
    # Convert children to nested XML elements
  # Single child
    if self.Gap is not None:
      element.append(self.Gap.to_xml("Gap"))  
  # Multiple children
    for child in self.TriggerWords_list:  
      element.append(child.to_xml("TriggerWords"))  
    return element

  def from_xml(self, xml_element):
    # Instantiate an object of type A429PacketStrategy
    obj = A429PacketStrategy()  
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
    if "PeriodNs" in xml_element.attrib:
        obj.PeriodNs = xml_element.get("PeriodNs")
    if "Direction" in xml_element.attrib:
        obj.Direction = xml_element.get("Direction")
    # Process children (references)
    # Reference with a single value: find the child element and set the field if it exists
    child_element = xml_element.find("Gap")
    if child_element is not None:  
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if (not xsi_type) or (xsi_type.split(":", 1)[ 1 ].lower() == "gap"):
        child = Gap.from_xml(self, child_element)
        child.parent = obj
        obj.Gap = child        
      
    # Reference with multiplicity: initialize a list and append each child object
    obj.TriggerWords_list = list()
    for child_element in xml_element.findall("TriggerWords"):
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if not xsi_type:
        child = TriggerWords.from_xml(self, child_element)
        child.parent = obj
        obj.TriggerWords_list.append(child)
      
    return obj
    
  def save_xml(self, filename):
    self_xml = self.to_xml(None)
    xml_string = ET.tostring(self_xml, encoding="utf-8").decode("utf-8")
    dom = xml.dom.minidom.parseString(xml_string)
    with open(filename, 'w') as f:
       f.write(dom.toprettyxml(indent="  "))
