import xml.etree.ElementTree as ET  
from pathlib import Path
import xml.dom.minidom
#import super types
from SuperSetType import SuperSetType

#import children classes
from Channels import Channels

from FileProducer import FileProducer


# -------------------------------------------------------------------
# Automatically generated class from ecore model!! ED247Configuration.
# Don't change here, change in source ecore model
# Code generator by Philipp Chrysalidis in 2025
# ======================================================================

class ED247Configuration(SuperSetType):
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
    self.standardRevision = None
    self.componentVersion = None
    self.componentType = None
    #children (references)
    self.channels = None  #Initialize as a single child (None by default)
    self.fileProducer = None  #Initialize as a single child (None by default)
    self.parent = None #default is no parent, but can be set for every element
	

  def to_xml(self, reference_name = None):
    element = ET.Element(reference_name)
    if not reference_name == "configECIC" and not reference_name.lower() == "ed247configuration":
      element.set("xsi:type", "de.ucof.model.communication.configECIC:ED247Configuration")  
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
    if self.standardRevision is not None:
      element.set("standardRevision", str(self.standardRevision))  
    if self.componentVersion is not None:
      element.set("componentVersion", str(self.componentVersion))  
    if self.componentType is not None:
      element.set("componentType", str(self.componentType))  
    # Convert children to nested XML elements
  # Single child
    if self.channels is not None:
      element.append(self.channels.to_xml("channels"))  
  # Single child
    if self.fileProducer is not None:
      element.append(self.fileProducer.to_xml("fileProducer"))  
    return element

  def from_xml(self, xml_element):
    # Instantiate an object of type ED247Configuration
    obj = ED247Configuration()  
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
    if "standardRevision" in xml_element.attrib:
        obj.standardRevision = xml_element.get("standardRevision")
    if "componentVersion" in xml_element.attrib:
        obj.componentVersion = xml_element.get("componentVersion")
    if "componentType" in xml_element.attrib:
        obj.componentType = xml_element.get("componentType")
    # Process children (references)
    # Reference with a single value: find the child element and set the field if it exists
    child_element = xml_element.find("channels")
    if child_element is not None:  
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if (not xsi_type) or (xsi_type.split(":", 1)[ 1 ].lower() == "channels"):
        child = Channels.from_xml(self, child_element)
        child.parent = obj
        obj.channels = child        
      
    # Reference with a single value: find the child element and set the field if it exists
    child_element = xml_element.find("fileProducer")
    if child_element is not None:  
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if (not xsi_type) or (xsi_type.split(":", 1)[ 1 ].lower() == "fileproducer"):
        child = FileProducer.from_xml(self, child_element)
        child.parent = obj
        obj.fileProducer = child        
      
    return obj
    
  def save_xml(self, filename):
    self_xml = self.to_xml(None)
    xml_string = ET.tostring(self_xml, encoding="utf-8").decode("utf-8")
    dom = xml.dom.minidom.parseString(xml_string)
    with open(filename, 'w') as f:
       f.write(dom.toprettyxml(indent="  "))
