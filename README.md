# MT_Intrepid

UCoF-based modeling and hardware-software integration for the **INTREPID system**.

This repository contains:

* UCoF metamodel extensions
* Sirius-based graphical modeling
* A complete system model of INTREPID (hardware + software + connections)
* Visualizations derived from schematic-level design

---

## 🔧 Repository Structure

```
MT_Intrepid/
│
├── runtime-New_configuration/
│   └── MT_Intrepid/
│       ├── intrepid.ucof        # Main system model
│       ├── intrepid.aird        # Sirius representations
│       ├── newDiagrams.aird     # Additional diagram instances
│       └── .project / .settings # Eclipse runtime project
│
├── ucof_workspace/
│   ├── de.ucof.model           # Core metamodel
│   ├── de.ucof.model.edit      # EMF edit layer
│   ├── de.ucof.model.editor    # Generated editor
│   └── de.ucof.target.model    # Target/device definitions
│
├── ucof-tooling-main/
│   └── GUI_Sirius/
│       └── sirius.ucof.design  # Sirius viewpoint specification
│
├── intrepid.png
├── Intrepid_Visualization_new.png
├── RDC_Schematic.png
└── README.md
```

---

## 🎯 Project Overview

The goal of this work is to:

* Model a **real embedded system (INTREPID)** using UCoF
* Establish **clear port-to-port connectivity**
* Define **software-to-hardware mappings**
* Align the model with **UCoF architectural principles**
* Enable **model-driven system understanding and execution**

---

## ⚙️ Key Features

### 1. Device Modeling

* All physical components are modeled as **Devices**
* Each device is instantiated based on actual system occurrence

### 2. Target-Based Architecture

* Hardware types (e.g., STM32, ADC, ESCON, CAN transceiver) are defined once as **Targets**
* Devices reference these targets → avoids duplication and ensures consistency

### 3. Port-to-Port Connectivity

* Connections between:

  * RDC ↔ Shield
  * ADC ↔ Sensors
  * CAN Transceiver ↔ MCU
* Derived directly from the electrical schematic

### 4. Software-to-Hardware Assignment

* Software elements are mapped to hardware devices via:

  * **Assignments layer in UCoF**
* Ensures traceability between software logic and physical components

### 5. Electrical Representation (Current State)

* Power (VDD, GND) is currently modeled using:

  * Sampling ports (intermediate solution)
* Future improvement:

  * Dedicated **power grid modeling layer** (ongoing research direction)

---

## 🔌 System Components Modeled

* STM32 (RDC / computing module)
* Arduino Shield
* ADS1115 ADC (Left & Right)
* ESCON motor controllers
* CAN Transceiver (SN65HVD230)
* Hall Sensor (MTS360)
* Power supply (VDD/GND abstraction)

---

## 🧠 Modeling Approach

This model improves alignment with UCoF by:

* Separating:

  * **Structure (Devices)**
  * **Behavior (Software)**
  * **Deployment (Assignments)**
* Using:

  * Explicit port definitions
  * Direction-aware connections
* Avoiding:

  * Implicit wiring assumptions

---

## 🖼️ Visualizations

### System Model

* `Intrepid_Visualization_new.png`
  → Sirius-generated system diagram

### Reference Schematic

* `RDC_Schematic.png`
  → Electrical schematic used as ground truth

---

## 🚀 How to Run / Reproduce

### 1. Install Requirements

* Eclipse IDE
* EMF (Ecore tools)
* Sirius

---

### 2. Import Projects

Import the following into Eclipse:

* `ucof_workspace/` → as existing projects
* `ucof-tooling-main/GUI_Sirius/` → Sirius design project
* `runtime-New_configuration/MT_Intrepid/` → runtime model

---

### 3. Generate Metamodel Code (if needed)

From `ucof.genmodel`:

* Right-click → Generate Model Code
* Generate Edit Code
* Generate Editor Code

---

### 4. Run Sirius Runtime

* Launch Eclipse runtime instance
* Open `intrepid.aird`
* Navigate to:

  ```
  Devices Diagram → Intrepid_Visualization_new
  ```

---

## ⚠️ Known Issues

* Duplicate Sirius representations may exist in `.aird`
* Export errors may occur due to invalid representations
* Power modeling is currently not abstracted (treated as ports)

---

## 🔬 Research Contribution (Ongoing)

A key extension under development:

> **Modeling an abstract electrical power grid in UCoF**

Motivation:

* Power is fundamentally different from communication
* Should not be modeled using sampling ports
* Requires a separate modeling layer

---

## 📎 Reference

UCoF framework:
👉 https://gitlab.com/ucof/ucof

---

## 👩‍💻 Author

Anjali Mishra
Master’s Thesis – Embedded Systems / Model-Based Engineering

---

## 📌 Notes

This repository represents an **active development state**.
Further refinements (especially in power modeling and repository structure) are planned.
