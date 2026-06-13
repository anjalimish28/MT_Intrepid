import xml.etree.ElementTree as ET  
from pathlib import Path
import xml.dom.minidom
#import super types
from SuperElectricalGridType import SuperElectricalGridType

#import children classes

# -------------------------------------------------------------------
# Automatically generated class from ecore model!! intrepidElectricalGrid.
# Don't change here, change in source ecore model
# Code generator by Philipp Chrysalidis in 2025
# ======================================================================

class intrepidElectricalGrid(SuperElectricalGridType):
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
    self.definedVoltage = None
    self.nominalVoltage = None
    #children (references)
    self.parent = None #default is no parent, but can be set for every element
	

  def to_xml(self, reference_name = None):
    element = ET.Element(reference_name)
    if not reference_name == "intrepidpowergrid" and not reference_name.lower() == "intrepidelectricalgrid":
      element.set("xsi:type", "de.ucof.model.targets.intrepidpowergrid:intrepidElectricalGrid")  
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
    if self.definedVoltage is not None:
      element.set("definedVoltage", str(self.definedVoltage))  
    if self.nominalVoltage is not None:
      element.set("nominalVoltage", str(self.nominalVoltage))  
    # Convert children to nested XML elements
    return element

  def from_xml(self, xml_element):
    # Instantiate an object of type intrepidElectricalGrid
    obj = intrepidElectricalGrid()  
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
    if "definedVoltage" in xml_element.attrib:
        obj.definedVoltage = xml_element.get("definedVoltage")
    if "nominalVoltage" in xml_element.attrib:
        obj.nominalVoltage = xml_element.get("nominalVoltage")
    # Process children (references)
    return obj
    
  def save_xml(self, filename):
    self_xml = self.to_xml(None)
    xml_string = ET.tostring(self_xml, encoding="utf-8").decode("utf-8")
    dom = xml.dom.minidom.parseString(xml_string)
    with open(filename, 'w') as f:
       f.write(dom.toprettyxml(indent="  "))
