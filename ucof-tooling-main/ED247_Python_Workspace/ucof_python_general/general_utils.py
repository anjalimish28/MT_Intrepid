import sys
from datetime import datetime
import xml.etree.ElementTree as ET
import xml.dom.minidom
import csv
from pathlib import Path 

def init_log(full_log_file_Path = "botLog.txt"):
  with open(full_log_file_Path, "w", encoding="utf-8") as file: #log file for tracing mistakes
      file.write("Init Logfile" + "\n")
  return None

def print_with_time(message_to_print, sys_exit = False, full_log_file_Path = "botLog.txt"): #for better logging and tracing mistakes
  currentTime = datetime.now().strftime("%Y-%m-%d %H:%M:%S")
  message_with_time = f"{currentTime}: {message_to_print}"
  print(message_with_time)
  with open(full_log_file_Path, "a", encoding="utf-8") as file: #log file for tracing mistakes
    file.write(message_with_time + "\n")
  if sys_exit:
    sys.exit('Function aborted due to error')

def verify_file_type(filepath, target_suffix):
  target_suffix = "." + target_suffix
  filepath_suffix = filepath.suffix.lower()
  if filepath_suffix == target_suffix: #check if file is actually ucof
    print_with_time(f"{filepath} was succesfully imported as {target_suffix} file")
    return filepath
  else:
    print_with_time(f"{filepath} is not a {target_suffix} file!", True)
  
def get_XML_root(filepath):
  try:
    xml_file = ET.parse(filepath)
    file_root = xml_file.getroot()
    print_with_time(f"{filepath} file imported scuessfully as XML")
  except Exception as e:
    print_with_time(f"{filepath} could not be interpreted as an XML-file: {e}", True)  
  return file_root
  
def write_xml_into_file(xml_root, filename):
  sanitize_xml(xml_root)
  xml_string = ET.tostring(xml_root, encoding="utf-8").decode("utf-8")
  dom = xml.dom.minidom.parseString(xml_string)
  with open(filename, 'w') as f:
     f.write(dom.toprettyxml(indent="  "))
     print_with_time(f"XML was written into file: {filename}")

def find_by_attr(obj, attr_name, target_value, find_all=False, class_name=None):
  results = []
  def _search(item):
    nonlocal results
    if isinstance(item, dict):
      if item.get(attr_name) == target_value:
        if class_name is None or item.__class__.__name__ == class_name:
          results.append(item)
          if not find_all:
            return True
      for value in item.values():
        if _search(value) and not find_all:
          return True
    elif isinstance(item, list):
      for subitem in item:
        if _search(subitem) and not find_all:
          return True
    elif hasattr(item, '__dict__'):
      if getattr(item, attr_name, None) == target_value:
        if class_name is None or item.__class__.__name__ == class_name:
          results.append(item)
          if not find_all:
            return True
      for name, value in vars(item).items():
        if name == "parent":
            continue
        if _search(value) and not find_all:
            return True
    return False
  _search(obj)
  return results if find_all else results[0] if results else None

def find_by_class_name(obj, class_name, find_all=False, include_superclasses=False):
    results = []
    def _matches(item):
        cls = item.__class__
        if include_superclasses:
            return any(base.__name__ == class_name for base in cls.__mro__)
        return cls.__name__ == class_name
    def _search(item):
        nonlocal results
        if hasattr(item, "__class__") and _matches(item):
            results.append(item)
            if not find_all:
                return True
        if isinstance(item, dict):
            for v in item.values():
                if _search(v) and not find_all:
                    return True
        elif isinstance(item, (list, tuple, set)):
            for v in item:
                if _search(v) and not find_all:
                    return True
        elif hasattr(item, "__dict__"):
            for name, v in vars(item).items():
                if name == "parent":
                    continue
                if _search(v) and not find_all:
                    return True
        return False
    _search(obj)
    return results if find_all else results[0] if results else None

    
def sanitize_xml(root):
  for elem in root.iter():
    # Fix attributes
    for key, value in list(elem.attrib.items()):
      if value is None:
        del elem.attrib[key]  # or: elem.set(key, "")
      else:
        elem.set(key, str(value))
      # Fix text
      if elem.text is None:
        elem.text = ""
      # Fix tail (whitespace between tags)
      if elem.tail is None:
        elem.tail = ""

def write_list_into_csv(header, rows, delimiter, filename):
    with open(filename, "w", newline="", encoding="utf-8") as f:
        writer = csv.writer(f, delimiter=delimiter)
        writer.writerow(header)
        writer.writerows(rows)

def write_dics_to_csv(file_path: str, rows: list[dict], delimiter: str = ";"):
    if not rows:
        return
    fieldnames = rows[0].keys()
    with open(file_path, "w", newline="", encoding="utf-8") as f:
        writer = csv.DictWriter(f, fieldnames=fieldnames, delimiter=delimiter)
        writer.writeheader()
        writer.writerows(rows)

def csv_into_dic(csv_file_path_str, delimiter_string):
  csv_file_path = Path(csv_file_path_str)
  full_filepath = verify_file_type(csv_file_path, "csv")
  with open(full_filepath, 'r') as f:
    dict_reader = csv.DictReader(f, delimiter=delimiter_string)
    list_of_dic = list(dict_reader)
  return list_of_dic

def find_csv_rows(rows: list[dict], search: dict) -> list[dict]:
    return [
        row for row in rows
        if all(row.get(k) == v for k, v in search.items())
    ]

def xml_children_to_dict(element):
    attrib_dic = {}
    for child in element:
        text = (child.text or "").strip()
        if child.tag in attrib_dic:
            # If the tag already exists, convert to list or append
            if isinstance(attrib_dic[child.tag], list):
                attrib_dic[child.tag].append(text)
            else:
                attrib_dic[child.tag] = [attrib_dic[child.tag], text]
        else:
            attrib_dic[child.tag] = text
    return attrib_dic

def select_from_list(list_object): 
  while True:
      for i, item in enumerate(list_object, 1):
          print(f"{i}. {item}")
      try:
          choice = int(input("Enter number: "))
          if 1 <= choice <= len(list_object):
              selected_obj = list_object[choice - 1]
              selected_dic = {"index": choice, "element": selected_obj}
              break
          else:
              print("Out of range.")
      except ValueError:
          print("Please enter a number.")
  return selected_dic      