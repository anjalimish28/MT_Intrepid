import xml.etree.ElementTree as ET  
from pathlib import Path
import xml.dom.minidom
#import super types
from SuperIdentifierType import SuperIdentifierType
from SuperTrackingType import SuperTrackingType

#import children classes
from Memory import Memory

from HMTable import HMTable

from PartitionPorts import PartitionPorts

from Processes import Processes


# -------------------------------------------------------------------
# Automatically generated class from ecore model!! Partition.
# Don't change here, change in source ecore model
# Code generator by Philipp Chrysalidis in 2025
# ======================================================================

class Partition(SuperIdentifierType, SuperTrackingType):
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
    self.criticality = None
    self.entryPoint = None
    self.partitionPeriod = None
    self.offset = None
    #children (references)
    self.memory = None  #Initialize as a single child (None by default)
    self.hmTable = None  #Initialize as a single child (None by default)
    self.partitionPorts = None  #Initialize as a single child (None by default)
    self.processes = None  #Initialize as a single child (None by default)
    self.parent = None #default is no parent, but can be set for every element
	

  def to_xml(self, reference_name = None):
    element = ET.Element(reference_name)
    if not reference_name == "a653partition" and not reference_name.lower() == "partition":
      element.set("xsi:type", "de.ucof.model.a653partition:Partition")  
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
    if self.criticality is not None:
      element.set("criticality", str(self.criticality))  
    if self.entryPoint is not None:
      element.set("entryPoint", str(self.entryPoint))  
    if self.partitionPeriod is not None:
      element.set("partitionPeriod", str(self.partitionPeriod))  
    if self.offset is not None:
      element.set("offset", str(self.offset))  
    # Convert children to nested XML elements
  # Single child
    if self.memory is not None:
      element.append(self.memory.to_xml("memory"))  
  # Single child
    if self.hmTable is not None:
      element.append(self.hmTable.to_xml("hmTable"))  
  # Single child
    if self.partitionPorts is not None:
      element.append(self.partitionPorts.to_xml("partitionPorts"))  
  # Single child
    if self.processes is not None:
      element.append(self.processes.to_xml("processes"))  
    return element

  def from_xml(self, xml_element):
    # Instantiate an object of type Partition
    obj = Partition()  
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
    if "criticality" in xml_element.attrib:
        obj.criticality = xml_element.get("criticality")
    if "entryPoint" in xml_element.attrib:
        obj.entryPoint = xml_element.get("entryPoint")
    if "partitionPeriod" in xml_element.attrib:
        obj.partitionPeriod = xml_element.get("partitionPeriod")
    if "offset" in xml_element.attrib:
        obj.offset = xml_element.get("offset")
    # Process children (references)
    # Reference with a single value: find the child element and set the field if it exists
    child_element = xml_element.find("memory")
    if child_element is not None:  
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if (not xsi_type) or (xsi_type.split(":", 1)[ 1 ].lower() == "memory"):
        child = Memory.from_xml(self, child_element)
        child.parent = obj
        obj.memory = child        
      
    # Reference with a single value: find the child element and set the field if it exists
    child_element = xml_element.find("hmTable")
    if child_element is not None:  
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if (not xsi_type) or (xsi_type.split(":", 1)[ 1 ].lower() == "hmtable"):
        child = HMTable.from_xml(self, child_element)
        child.parent = obj
        obj.hmTable = child        
      
    # Reference with a single value: find the child element and set the field if it exists
    child_element = xml_element.find("partitionPorts")
    if child_element is not None:  
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if (not xsi_type) or (xsi_type.split(":", 1)[ 1 ].lower() == "partitionports"):
        child = PartitionPorts.from_xml(self, child_element)
        child.parent = obj
        obj.partitionPorts = child        
      
    # Reference with a single value: find the child element and set the field if it exists
    child_element = xml_element.find("processes")
    if child_element is not None:  
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if (not xsi_type) or (xsi_type.split(":", 1)[ 1 ].lower() == "processes"):
        child = Processes.from_xml(self, child_element)
        child.parent = obj
        obj.processes = child        
      
    return obj
    
  def save_xml(self, filename):
    self_xml = self.to_xml(None)
    xml_string = ET.tostring(self_xml, encoding="utf-8").decode("utf-8")
    dom = xml.dom.minidom.parseString(xml_string)
    with open(filename, 'w') as f:
       f.write(dom.toprettyxml(indent="  "))
