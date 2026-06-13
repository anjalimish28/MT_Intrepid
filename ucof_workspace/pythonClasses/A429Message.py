import xml.etree.ElementTree as ET  
from pathlib import Path
import xml.dom.minidom
#import super types
from SuperMessageType import SuperMessageType

#import children classes

# -------------------------------------------------------------------
# Automatically generated class from ecore model!! A429Message.
# Don't change here, change in source ecore model
# Code generator by Philipp Chrysalidis in 2025
# ======================================================================

class A429Message(SuperMessageType):
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
    self.sdi = None
    self.a429Label = None
    self.a429SSM = None
    self.labelNumber = None
    #children (references)
    self.parent = None #default is no parent, but can be set for every element
	

  def to_xml(self, reference_name = None):
    element = ET.Element(reference_name)
    if not reference_name == "arinc429" and not reference_name.lower() == "a429message":
      element.set("xsi:type", "de.ucof.model.communication.arinc429:A429Message")  
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
    if self.sdi is not None:
      element.set("sdi", str(self.sdi))  
    if self.a429Label is not None:
      element.set("a429Label", str(self.a429Label))  
    if self.a429SSM is not None:
      element.set("a429SSM", str(self.a429SSM))  
    if self.labelNumber is not None:
      element.set("labelNumber", str(self.labelNumber))  
    # Convert children to nested XML elements
    return element

  def from_xml(self, xml_element):
    # Instantiate an object of type A429Message
    obj = A429Message()  
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
    if "sdi" in xml_element.attrib:
        obj.sdi = xml_element.get("sdi")
    if "a429Label" in xml_element.attrib:
        obj.a429Label = xml_element.get("a429Label")
    if "a429SSM" in xml_element.attrib:
        obj.a429SSM = xml_element.get("a429SSM")
    if "labelNumber" in xml_element.attrib:
        obj.labelNumber = xml_element.get("labelNumber")
    # Process children (references)
    return obj
    
  def save_xml(self, filename):
    self_xml = self.to_xml(None)
    xml_string = ET.tostring(self_xml, encoding="utf-8").decode("utf-8")
    dom = xml.dom.minidom.parseString(xml_string)
    with open(filename, 'w') as f:
       f.write(dom.toprettyxml(indent="  "))
