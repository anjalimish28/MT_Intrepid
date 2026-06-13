import xml.etree.ElementTree as ET  
from pathlib import Path
import xml.dom.minidom
#import super types
from SuperIdentifierType import SuperIdentifierType
from SuperTrackingType import SuperTrackingType

#import children classes
from Devices import Devices

from Communication import Communication

from Assignments import Assignments

from Targets import Targets


# -------------------------------------------------------------------
# Automatically generated class from ecore model!! Platform.
# Don't change here, change in source ecore model
# Code generator by Philipp Chrysalidis in 2025
# ======================================================================

class Platform(SuperIdentifierType, SuperTrackingType):
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
    #children (references)
    self.devices = None  #Initialize as a single child (None by default)
    self.communication = None  #Initialize as a single child (None by default)
    self.assignments = None  #Initialize as a single child (None by default)
    self.targets = None  #Initialize as a single child (None by default)
    self.parent = None #default is no parent, but can be set for every element
	

  def to_xml(self, reference_name = None):
    ET.register_namespace("xmi", "http://www.omg.org/XMI")
    ET.register_namespace("xsi", "http://www.w3.org/2001/XMLSchema-instance")
    ET.register_namespace('de.ucof.model', 'https://gitlab.com/ucof/ucof.de/model/v001/ucof')
    ET.register_namespace('de.ucof.model.common', 'https://gitlab.com/ucof/ucof.de/model/v001/ucof/common')
    ET.register_namespace('de.ucof.model.common.enums', 'https://gitlab.com/ucof/ucof.de/model/v001/ucof/common/enums')
    ET.register_namespace('de.ucof.model.common.etypes', 'https://gitlab.com/ucof/ucof.de/model/v001/ucof/common/etypes')
    ET.register_namespace('de.ucof.model.common.edata', 'https://gitlab.com/ucof/ucof.de/model/v001/ucof/common/edata')
    ET.register_namespace('de.ucof.model.devices', 'https://gitlab.com/ucof/ucof.de/model/v001/ucof/devices')
    ET.register_namespace('de.ucof.model.devices.devicetypes', 'https://gitlab.com/ucof/ucof.de/model/v001/ucof/devices/devicetypes')
    ET.register_namespace('de.ucof.model.a653components', 'https://gitlab.com/ucof/ucof.de/model/v001/ucof/devices/devicetypes/a653components')
    ET.register_namespace('de.ucof.model.a653partition', 'https://gitlab.com/ucof/ucof.de/model/v001/ucof/devices/devicetypes/a653components/a653partition')
    ET.register_namespace('de.ucof.model.healthmanagement', 'https://gitlab.com/ucof/ucof.de/model/v001/ucof/devices/devicetypes/a653components/Hhalthmanagement')
    ET.register_namespace('de.ucof.model.devices.functions', 'https://gitlab.com/ucof/ucof.de/model/v001/ucof/devices/functions')
    ET.register_namespace('de.ucof.model.devices.functions.routing', 'https://gitlab.com/ucof/ucof.de/model/v001/ucof/Functions/Routing')
    ET.register_namespace('de.ucof.model.devices.ports', 'https://gitlab.com/ucof/ucof.de/model/v001/ucof/devices/ports')
    ET.register_namespace('de.ucof.model.communication', 'https://gitlab.com/ucof/ucof.de/model/v001/ucof/communication')
    ET.register_namespace('de.ucof.model.communication.arinc429', 'https://gitlab.com/ucof/ucof.de/model/v001/ucof/communication/arinc429')
    ET.register_namespace('de.ucof.model.communication.arinc825', 'https://gitlab.com/ucof/ucof.de/model/v001/ucof/communication/arinc825')
    ET.register_namespace('de.ucof.model.communication.basedonethernet', 'https://gitlab.com/ucof/ucof.de/model/v001/ucof/communication/basedonethernet')
    ET.register_namespace('de.ucof.model.communication.basedonethernet.arinc664', 'https://gitlab.com/ucof/ucof.de/model/v001/ucof/communication/basedonethernet/arinc664')
    ET.register_namespace('de.ucof.model.communication.basedonwired', 'https://gitlab.com/ucof/ucof.de/model/v001/ucof/communication/basedonwired')
    ET.register_namespace('de.ucof.model.communication.connectors', 'https://gitlab.com/ucof/ucof.de/model/v001/ucof/communication/connectors')
    ET.register_namespace('de.ucof.model.communication.configECIC', 'https://gitlab.com/ucof/ucof.de/model/v001/ucof/communication/configECIC')
    ET.register_namespace('de.ucof.model.communication.configECIC.streamTypes', 'https://gitlab.com/ucof/ucof.de/model/v001/ucof/communication/configECIC/streamTypes')
    ET.register_namespace('de.ucof.model.communication.configECIC.packageStrategyTypes', 'https://gitlab.com/ucof/ucof.de/model/v001/ucof/communication/configECIC/packageStrategyTypes')
    ET.register_namespace('de.ucof.model.communication.comDevices', 'https://gitlab.com/ucof/ucof.de/model/v001/ucof/communication/comDevices')
    ET.register_namespace('de.ucof.model.communication.i2c', 'https://gitlab.com/ucof/ucof.de/model/v001/ucof/communication/i2c')
    ET.register_namespace('de.ucof.model.assignments', 'https://gitlab.com/ucof/ucof.de/model/v001/ucof/assignments')
    ET.register_namespace('de.ucof.model.assignments.database', 'https://gitlab.com/ucof/ucof.de/model/v001/ucof/assignments/database')
    ET.register_namespace('de.ucof.model.targets', 'https://gitlab.com/ucof/ucof.de/model/v001/ucof/targets')
    ET.register_namespace('de.ucof.model.targets.powergrid', 'https://gitlab.com/ucof/ucof.de/model/v001/ucof/targets/powergrid')
    ET.register_namespace('de.ucof.model.targets.rdc', 'https://gitlab.com/ucof/ucof.de/model/v001/ucof/targets/rdc')
    ET.register_namespace('de.ucof.model.targets.adc', 'https://gitlab.com/ucof/ucof.de/model/v001/ucof/targets/adc')
    ET.register_namespace('de.ucof.model.targets.sheild', 'https://gitlab.com/ucof/ucof.de/model/v001/ucof/targets/sheild')
    ET.register_namespace('de.ucof.model.targets.motorcontroller', 'https://gitlab.com/ucof/ucof.de/model/v001/ucof/targets/motorcontroller')
    ET.register_namespace('de.ucof.model.targets.cantransceiver', 'https://gitlab.com/ucof/ucof.de/model/v001/ucof/targets/cantransceiver')
    ET.register_namespace('de.ucof.model.targets.hallsensor', 'https://gitlab.com/ucof/ucof.de/model/v001/ucof/targets/hallsensor')
    ET.register_namespace('de.ucof.model.targets.cpn', 'https://gitlab.com/ucof/ucof.de/model/v001/ucof/targets/cpn')
    ET.register_namespace('de.ucof.model.targets.intrepidpowergrid', 'https://gitlab.com/ucof/ucof.de/model/v001/ucof/targets/intrepidpowergrid')
    ET.register_namespace('de.ucof.model.targets.intrepidgateway', 'https://gitlab.com/ucof/ucof.de/model/v001/ucof/targets/intrepidgateway')
    
    element = ET.Element("ucof:Platform", { 
      "xmlns:xsi": "http://www.w3.org/2001/XMLSchema-instance",
      "xmlns:xmi": "http://www.omg.org/XMI",
      "xmlns:ucof": "https://gitlab.com/ucof/ucof.de/model/v001/ucof",
      "xmlns:de.ucof.model": "https://gitlab.com/ucof/ucof.de/model/v001/ucof",
      "xmlns:de.ucof.model.common": "https://gitlab.com/ucof/ucof.de/model/v001/ucof/common",
      "xmlns:de.ucof.model.common.enums": "https://gitlab.com/ucof/ucof.de/model/v001/ucof/common/enums",
      "xmlns:de.ucof.model.common.etypes": "https://gitlab.com/ucof/ucof.de/model/v001/ucof/common/etypes",
      "xmlns:de.ucof.model.common.edata": "https://gitlab.com/ucof/ucof.de/model/v001/ucof/common/edata",
      "xmlns:de.ucof.model.devices": "https://gitlab.com/ucof/ucof.de/model/v001/ucof/devices",
      "xmlns:de.ucof.model.devices.devicetypes": "https://gitlab.com/ucof/ucof.de/model/v001/ucof/devices/devicetypes",
      "xmlns:de.ucof.model.a653components": "https://gitlab.com/ucof/ucof.de/model/v001/ucof/devices/devicetypes/a653components",
      "xmlns:de.ucof.model.a653partition": "https://gitlab.com/ucof/ucof.de/model/v001/ucof/devices/devicetypes/a653components/a653partition",
      "xmlns:de.ucof.model.healthmanagement": "https://gitlab.com/ucof/ucof.de/model/v001/ucof/devices/devicetypes/a653components/Hhalthmanagement",
      "xmlns:de.ucof.model.devices.functions": "https://gitlab.com/ucof/ucof.de/model/v001/ucof/devices/functions",
      "xmlns:de.ucof.model.devices.functions.routing": "https://gitlab.com/ucof/ucof.de/model/v001/ucof/Functions/Routing",
      "xmlns:de.ucof.model.devices.ports": "https://gitlab.com/ucof/ucof.de/model/v001/ucof/devices/ports",
      "xmlns:de.ucof.model.communication": "https://gitlab.com/ucof/ucof.de/model/v001/ucof/communication",
      "xmlns:de.ucof.model.communication.arinc429": "https://gitlab.com/ucof/ucof.de/model/v001/ucof/communication/arinc429",
      "xmlns:de.ucof.model.communication.arinc825": "https://gitlab.com/ucof/ucof.de/model/v001/ucof/communication/arinc825",
      "xmlns:de.ucof.model.communication.basedonethernet": "https://gitlab.com/ucof/ucof.de/model/v001/ucof/communication/basedonethernet",
      "xmlns:de.ucof.model.communication.basedonethernet.arinc664": "https://gitlab.com/ucof/ucof.de/model/v001/ucof/communication/basedonethernet/arinc664",
      "xmlns:de.ucof.model.communication.basedonwired": "https://gitlab.com/ucof/ucof.de/model/v001/ucof/communication/basedonwired",
      "xmlns:de.ucof.model.communication.connectors": "https://gitlab.com/ucof/ucof.de/model/v001/ucof/communication/connectors",
      "xmlns:de.ucof.model.communication.configECIC": "https://gitlab.com/ucof/ucof.de/model/v001/ucof/communication/configECIC",
      "xmlns:de.ucof.model.communication.configECIC.streamTypes": "https://gitlab.com/ucof/ucof.de/model/v001/ucof/communication/configECIC/streamTypes",
      "xmlns:de.ucof.model.communication.configECIC.packageStrategyTypes": "https://gitlab.com/ucof/ucof.de/model/v001/ucof/communication/configECIC/packageStrategyTypes",
      "xmlns:de.ucof.model.communication.comDevices": "https://gitlab.com/ucof/ucof.de/model/v001/ucof/communication/comDevices",
      "xmlns:de.ucof.model.communication.i2c": "https://gitlab.com/ucof/ucof.de/model/v001/ucof/communication/i2c",
      "xmlns:de.ucof.model.assignments": "https://gitlab.com/ucof/ucof.de/model/v001/ucof/assignments",
      "xmlns:de.ucof.model.assignments.database": "https://gitlab.com/ucof/ucof.de/model/v001/ucof/assignments/database",
      "xmlns:de.ucof.model.targets": "https://gitlab.com/ucof/ucof.de/model/v001/ucof/targets",
      "xmlns:de.ucof.model.targets.powergrid": "https://gitlab.com/ucof/ucof.de/model/v001/ucof/targets/powergrid",
      "xmlns:de.ucof.model.targets.rdc": "https://gitlab.com/ucof/ucof.de/model/v001/ucof/targets/rdc",
      "xmlns:de.ucof.model.targets.adc": "https://gitlab.com/ucof/ucof.de/model/v001/ucof/targets/adc",
      "xmlns:de.ucof.model.targets.sheild": "https://gitlab.com/ucof/ucof.de/model/v001/ucof/targets/sheild",
      "xmlns:de.ucof.model.targets.motorcontroller": "https://gitlab.com/ucof/ucof.de/model/v001/ucof/targets/motorcontroller",
      "xmlns:de.ucof.model.targets.cantransceiver": "https://gitlab.com/ucof/ucof.de/model/v001/ucof/targets/cantransceiver",
      "xmlns:de.ucof.model.targets.hallsensor": "https://gitlab.com/ucof/ucof.de/model/v001/ucof/targets/hallsensor",
      "xmlns:de.ucof.model.targets.cpn": "https://gitlab.com/ucof/ucof.de/model/v001/ucof/targets/cpn",
      "xmlns:de.ucof.model.targets.intrepidpowergrid": "https://gitlab.com/ucof/ucof.de/model/v001/ucof/targets/intrepidpowergrid",
      "xmlns:de.ucof.model.targets.intrepidgateway": "https://gitlab.com/ucof/ucof.de/model/v001/ucof/targets/intrepidgateway",
      
    })
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
    # Convert children to nested XML elements
  # Single child
    if self.devices is not None:
      element.append(self.devices.to_xml("devices"))  
  # Single child
    if self.communication is not None:
      element.append(self.communication.to_xml("communication"))  
  # Single child
    if self.assignments is not None:
      element.append(self.assignments.to_xml("assignments"))  
  # Single child
    if self.targets is not None:
      element.append(self.targets.to_xml("targets"))  
    return element

  def from_xml(self, xml_element):
    # Instantiate an object of type Platform
    obj = Platform()  
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
    # Process children (references)
    # Reference with a single value: find the child element and set the field if it exists
    child_element = xml_element.find("devices")
    if child_element is not None:  
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if (not xsi_type) or (xsi_type.split(":", 1)[ 1 ].lower() == "devices"):
        child = Devices.from_xml(self, child_element)
        child.parent = obj
        obj.devices = child        
      
    # Reference with a single value: find the child element and set the field if it exists
    child_element = xml_element.find("communication")
    if child_element is not None:  
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if (not xsi_type) or (xsi_type.split(":", 1)[ 1 ].lower() == "communication"):
        child = Communication.from_xml(self, child_element)
        child.parent = obj
        obj.communication = child        
      
    # Reference with a single value: find the child element and set the field if it exists
    child_element = xml_element.find("assignments")
    if child_element is not None:  
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if (not xsi_type) or (xsi_type.split(":", 1)[ 1 ].lower() == "assignments"):
        child = Assignments.from_xml(self, child_element)
        child.parent = obj
        obj.assignments = child        
      
    # Reference with a single value: find the child element and set the field if it exists
    child_element = xml_element.find("targets")
    if child_element is not None:  
      xsi_type = child_element.get("{http://www.w3.org/2001/XMLSchema-instance}type")
      if (not xsi_type) or (xsi_type.split(":", 1)[ 1 ].lower() == "targets"):
        child = Targets.from_xml(self, child_element)
        child.parent = obj
        obj.targets = child        
      
    return obj
    
  def save_xml(self, filename):
    self_xml = self.to_xml(None)
    xml_string = ET.tostring(self_xml, encoding="utf-8").decode("utf-8")
    dom = xml.dom.minidom.parseString(xml_string)
    with open(filename, 'w') as f:
       f.write(dom.toprettyxml(indent="  "))
