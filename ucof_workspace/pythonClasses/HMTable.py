import xml.etree.ElementTree as ET  
from pathlib import Path
import xml.dom.minidom
#import super types
from SuperIdentifierType import SuperIdentifierType
from SuperTrackingType import SuperTrackingType

#import children classes
from MultiPartitionTable import MultiPartitionTable

from ErroInfoPartition import ErroInfoPartition


# -------------------------------------------------------------------
# Automatically generated class from ecore model!! HMTable.
# Don't change here, change in source ecore model
# Code generator by Philipp Chrysalidis in 2025
# ======================================================================

class HMTable(SuperIdentifierType, SuperTrackingType):
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
    self.tableIdentifier = None
    self.tableName = None
    #children (references)
    self.multiPartitionHMTableNameRef = None  #Initialize as a single child (None by default)
    #Check if it's a collection (i.e., upperBound <> 1)
    self.errorInfo_list = list()  #Initialize as an empty list for multiple children
    self.parent = None #default is no parent, but can be set for every element
	
    #Check if it's a collection (i.e., upperBound <> 1)
  def add_errorInfo(self, errorInfo): #function for adding child
    self.errorInfo_list.append(errorInfo)
    errorInfo.parent = self #link child to parent

  def to_xml(self, reference_name = None):
    element = ET.Element(reference_name)
    if not reference_name == "healthmanagement" and not reference_name.lower() == "hmtable":
      element.set("xsi:type", "de.ucof.model.healthmanagement:HMTable")  
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
    if self.tableIdentifier is not None:
      element.set("tableIdentifier", str(self.tableIdentifier))  
    if self.tableName is not None:
      element.set("tableName", str(self.tableName))  
    # Convert children to nested XML elements
  # Single child
    if self.multiPartitionHMTableNameRef is not None:
      element.append(self.multiPartitionHMTableNameRef.to_xml("multiPartitionHMTableNameRef"))  
  # Multiple children
    for child in self.errorInfo_list:  
      element.append(child.to_xml("errorInfo"))  
    return element

  def from_xml(self, xml_element):
    # Instantiate an object of type HMTable
    obj = HMTable()  
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
    if "tableIdentifier" in xml_element.attrib:
        obj.tableIdentifier = xml_element.get("tableIdentifier")
    if "tableName" in xml_element.attrib:
        obj.tableName = xml_element.get("tableName")
    # Process children (references)
    # Reference with a single value: find the child element and set the field if it exists
    child_element = xml_element.find("multiPartitionHMTableNameRef")
    if child_element is not None:  
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if (not xsi_type) or (xsi_type.split(":", 1)[ 1 ].lower() == "multipartitiontable"):
        child = MultiPartitionTable.from_xml(self, child_element)
        child.parent = obj
        obj.multiPartitionHMTableNameRef = child        
      
    # Reference with multiplicity: initialize a list and append each child object
    obj.errorInfo_list = list()
    for child_element in xml_element.findall("errorInfo"):
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if not xsi_type:
        child = ErroInfoPartition.from_xml(self, child_element)
        child.parent = obj
        obj.errorInfo_list.append(child)
      
    return obj
    
  def save_xml(self, filename):
    self_xml = self.to_xml(None)
    xml_string = ET.tostring(self_xml, encoding="utf-8").decode("utf-8")
    dom = xml.dom.minidom.parseString(xml_string)
    with open(filename, 'w') as f:
       f.write(dom.toprettyxml(indent="  "))
