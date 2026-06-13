import xml.etree.ElementTree as ET  
from pathlib import Path
import xml.dom.minidom
#import super types
from SuperTrackingType import SuperTrackingType
from SuperIdentifierType import SuperIdentifierType

#import children classes

# -------------------------------------------------------------------
# Automatically generated class from ecore model!! stmTimingConfig.
# Don't change here, change in source ecore model
# Code generator by Philipp Chrysalidis in 2025
# ======================================================================

class stmTimingConfig(SuperTrackingType, SuperIdentifierType):
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
    self.rateDriverFrequencyHz = None
    self.rateGroupDivisor1 = None
    self.rateGroupDivisor2 = None
    self.rateGroupDivisor3 = None
    self.rateGroupDefaultOffset = None
    self.pwmResolutionBits = None
    self.rateDriverFrequencyHzSize = None
    self.rateGroupDivisor1Size = None
    self.rateGroupDivisor2Size = None
    self.rateGroupDivisor3Size = None
    self.rateGroupDefaultOffsetSize = None
    self.pwmResolutionBitsSize = None
    #children (references)
    self.parent = None #default is no parent, but can be set for every element
	

  def to_xml(self, reference_name = None):
    element = ET.Element(reference_name)
    if not reference_name == "rdc" and not reference_name.lower() == "stmtimingconfig":
      element.set("xsi:type", "de.ucof.model.targets.rdc:stmTimingConfig")  
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
    if self.rateDriverFrequencyHz is not None:
      element.set("rateDriverFrequencyHz", str(self.rateDriverFrequencyHz))  
    if self.rateGroupDivisor1 is not None:
      element.set("rateGroupDivisor1", str(self.rateGroupDivisor1))  
    if self.rateGroupDivisor2 is not None:
      element.set("rateGroupDivisor2", str(self.rateGroupDivisor2))  
    if self.rateGroupDivisor3 is not None:
      element.set("rateGroupDivisor3", str(self.rateGroupDivisor3))  
    if self.rateGroupDefaultOffset is not None:
      element.set("rateGroupDefaultOffset", str(self.rateGroupDefaultOffset))  
    if self.pwmResolutionBits is not None:
      element.set("pwmResolutionBits", str(self.pwmResolutionBits))  
    if self.rateDriverFrequencyHzSize is not None:
      element.set("rateDriverFrequencyHzSize", str(self.rateDriverFrequencyHzSize))  
    if self.rateGroupDivisor1Size is not None:
      element.set("rateGroupDivisor1Size", str(self.rateGroupDivisor1Size))  
    if self.rateGroupDivisor2Size is not None:
      element.set("rateGroupDivisor2Size", str(self.rateGroupDivisor2Size))  
    if self.rateGroupDivisor3Size is not None:
      element.set("rateGroupDivisor3Size", str(self.rateGroupDivisor3Size))  
    if self.rateGroupDefaultOffsetSize is not None:
      element.set("rateGroupDefaultOffsetSize", str(self.rateGroupDefaultOffsetSize))  
    if self.pwmResolutionBitsSize is not None:
      element.set("pwmResolutionBitsSize", str(self.pwmResolutionBitsSize))  
    # Convert children to nested XML elements
    return element

  def from_xml(self, xml_element):
    # Instantiate an object of type stmTimingConfig
    obj = stmTimingConfig()  
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
    if "rateDriverFrequencyHz" in xml_element.attrib:
        obj.rateDriverFrequencyHz = xml_element.get("rateDriverFrequencyHz")
    if "rateGroupDivisor1" in xml_element.attrib:
        obj.rateGroupDivisor1 = xml_element.get("rateGroupDivisor1")
    if "rateGroupDivisor2" in xml_element.attrib:
        obj.rateGroupDivisor2 = xml_element.get("rateGroupDivisor2")
    if "rateGroupDivisor3" in xml_element.attrib:
        obj.rateGroupDivisor3 = xml_element.get("rateGroupDivisor3")
    if "rateGroupDefaultOffset" in xml_element.attrib:
        obj.rateGroupDefaultOffset = xml_element.get("rateGroupDefaultOffset")
    if "pwmResolutionBits" in xml_element.attrib:
        obj.pwmResolutionBits = xml_element.get("pwmResolutionBits")
    if "rateDriverFrequencyHzSize" in xml_element.attrib:
        obj.rateDriverFrequencyHzSize = xml_element.get("rateDriverFrequencyHzSize")
    if "rateGroupDivisor1Size" in xml_element.attrib:
        obj.rateGroupDivisor1Size = xml_element.get("rateGroupDivisor1Size")
    if "rateGroupDivisor2Size" in xml_element.attrib:
        obj.rateGroupDivisor2Size = xml_element.get("rateGroupDivisor2Size")
    if "rateGroupDivisor3Size" in xml_element.attrib:
        obj.rateGroupDivisor3Size = xml_element.get("rateGroupDivisor3Size")
    if "rateGroupDefaultOffsetSize" in xml_element.attrib:
        obj.rateGroupDefaultOffsetSize = xml_element.get("rateGroupDefaultOffsetSize")
    if "pwmResolutionBitsSize" in xml_element.attrib:
        obj.pwmResolutionBitsSize = xml_element.get("pwmResolutionBitsSize")
    # Process children (references)
    return obj
    
  def save_xml(self, filename):
    self_xml = self.to_xml(None)
    xml_string = ET.tostring(self_xml, encoding="utf-8").decode("utf-8")
    dom = xml.dom.minidom.parseString(xml_string)
    with open(filename, 'w') as f:
       f.write(dom.toprettyxml(indent="  "))
