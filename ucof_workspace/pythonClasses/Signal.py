import xml.etree.ElementTree as ET  
from pathlib import Path
import xml.dom.minidom
#import super types
from SuperIdentifierType import SuperIdentifierType
from SuperTrackingType import SuperTrackingType

#import children classes
from A429SignalSpecification import A429SignalSpecification


# -------------------------------------------------------------------
# Automatically generated class from ecore model!! Signal.
# Don't change here, change in source ecore model
# Code generator by Philipp Chrysalidis in 2025
# ======================================================================

class Signal(SuperIdentifierType, SuperTrackingType):
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
    self.dataType = None
    self.signedness = None
    self.bitLength = None
    self.factor = None
    self.offset = None
    self.minValue = None
    self.maxValue = None
    self.unit = None
    self.byteOrder = None
    #children (references)
    self.a429Specification = None  #Initialize as a single child (None by default)
    self.parent = None #default is no parent, but can be set for every element
	

  def to_xml(self, reference_name = None):
    element = ET.Element(reference_name)
    if not reference_name == "communication" and not reference_name.lower() == "signal":
      element.set("xsi:type", "de.ucof.model.communication:Signal")  
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
    if self.dataType is not None:
      element.set("dataType", str(self.dataType))  
    if self.signedness is not None:
      element.set("signedness", str(self.signedness))  
    if self.bitLength is not None:
      element.set("bitLength", str(self.bitLength))  
    if self.factor is not None:
      element.set("factor", str(self.factor))  
    if self.offset is not None:
      element.set("offset", str(self.offset))  
    if self.minValue is not None:
      element.set("minValue", str(self.minValue))  
    if self.maxValue is not None:
      element.set("maxValue", str(self.maxValue))  
    if self.unit is not None:
      element.set("unit", str(self.unit))  
    if self.byteOrder is not None:
      element.set("byteOrder", str(self.byteOrder))  
    # Convert children to nested XML elements
  # Single child
    if self.a429Specification is not None:
      element.append(self.a429Specification.to_xml("a429Specification"))  
    return element

  def from_xml(self, xml_element):
    # Instantiate an object of type Signal
    obj = Signal()  
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
    if "dataType" in xml_element.attrib:
        obj.dataType = xml_element.get("dataType")
    if "signedness" in xml_element.attrib:
        obj.signedness = xml_element.get("signedness")
    if "bitLength" in xml_element.attrib:
        obj.bitLength = xml_element.get("bitLength")
    if "factor" in xml_element.attrib:
        obj.factor = xml_element.get("factor")
    if "offset" in xml_element.attrib:
        obj.offset = xml_element.get("offset")
    if "minValue" in xml_element.attrib:
        obj.minValue = xml_element.get("minValue")
    if "maxValue" in xml_element.attrib:
        obj.maxValue = xml_element.get("maxValue")
    if "unit" in xml_element.attrib:
        obj.unit = xml_element.get("unit")
    if "byteOrder" in xml_element.attrib:
        obj.byteOrder = xml_element.get("byteOrder")
    # Process children (references)
    # Reference with a single value: find the child element and set the field if it exists
    child_element = xml_element.find("a429Specification")
    if child_element is not None:  
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if (not xsi_type) or (xsi_type.split(":", 1)[ 1 ].lower() == "a429signalspecification"):
        child = A429SignalSpecification.from_xml(self, child_element)
        child.parent = obj
        obj.a429Specification = child        
      
    return obj
    
  def save_xml(self, filename):
    self_xml = self.to_xml(None)
    xml_string = ET.tostring(self_xml, encoding="utf-8").decode("utf-8")
    dom = xml.dom.minidom.parseString(xml_string)
    with open(filename, 'w') as f:
       f.write(dom.toprettyxml(indent="  "))
