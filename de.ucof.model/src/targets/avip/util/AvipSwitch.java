/**
 */
package targets.avip.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import targets.SuperAssignmentSpecificationType;
import targets.SuperClassExtensionType;
import targets.SuperTargetType;
import targets.avip.*;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see targets.avip.AvipPackage
 * @generated
 */
public class AvipSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AvipPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvipSwitch() {
		if (modelPackage == null) {
			modelPackage = AvipPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AvipPackage.AVIONICS_VIRTUAL_DEVICE: {
				AvionicsVirtualDevice avionicsVirtualDevice = (AvionicsVirtualDevice)theEObject;
				T result = caseAvionicsVirtualDevice(avionicsVirtualDevice);
				if (result == null) result = caseSuperTargetType(avionicsVirtualDevice);
				if (result == null) result = caseSuperIdentifierType(avionicsVirtualDevice);
				if (result == null) result = caseSuperTrackingType(avionicsVirtualDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvipPackage.AVD_PORTS: {
				AVDPorts avdPorts = (AVDPorts)theEObject;
				T result = caseAVDPorts(avdPorts);
				if (result == null) result = caseSuperIdentifierType(avdPorts);
				if (result == null) result = caseSuperTrackingType(avdPorts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvipPackage.SUPER_AVD_PORT_TYPE: {
				SuperAVDPortType superAVDPortType = (SuperAVDPortType)theEObject;
				T result = caseSuperAVDPortType(superAVDPortType);
				if (result == null) result = caseSuperIdentifierType(superAVDPortType);
				if (result == null) result = caseSuperTrackingType(superAVDPortType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvipPackage.FUNCTIONAL_DATA: {
				FunctionalData functionalData = (FunctionalData)theEObject;
				T result = caseFunctionalData(functionalData);
				if (result == null) result = caseSuperIdentifierType(functionalData);
				if (result == null) result = caseSuperTrackingType(functionalData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvipPackage.SUPER_WIRED_PORT_TYPE: {
				SuperWiredPortType superWiredPortType = (SuperWiredPortType)theEObject;
				T result = caseSuperWiredPortType(superWiredPortType);
				if (result == null) result = caseSuperAVDPortType(superWiredPortType);
				if (result == null) result = caseSuperIdentifierType(superWiredPortType);
				if (result == null) result = caseSuperTrackingType(superWiredPortType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvipPackage.SUPER_ANALOGUE_PORT_TYPE: {
				SuperAnaloguePortType superAnaloguePortType = (SuperAnaloguePortType)theEObject;
				T result = caseSuperAnaloguePortType(superAnaloguePortType);
				if (result == null) result = caseSuperWiredPortType(superAnaloguePortType);
				if (result == null) result = caseSuperAVDPortType(superAnaloguePortType);
				if (result == null) result = caseSuperIdentifierType(superAnaloguePortType);
				if (result == null) result = caseSuperTrackingType(superAnaloguePortType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvipPackage.ANALOGUE_INPUT: {
				AnalogueInput analogueInput = (AnalogueInput)theEObject;
				T result = caseAnalogueInput(analogueInput);
				if (result == null) result = caseSuperAnaloguePortType(analogueInput);
				if (result == null) result = caseSuperWiredPortType(analogueInput);
				if (result == null) result = caseSuperAVDPortType(analogueInput);
				if (result == null) result = caseSuperIdentifierType(analogueInput);
				if (result == null) result = caseSuperTrackingType(analogueInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvipPackage.ANALOGUE_OUTPUT: {
				AnalogueOutput analogueOutput = (AnalogueOutput)theEObject;
				T result = caseAnalogueOutput(analogueOutput);
				if (result == null) result = caseSuperAnaloguePortType(analogueOutput);
				if (result == null) result = caseSuperWiredPortType(analogueOutput);
				if (result == null) result = caseSuperAVDPortType(analogueOutput);
				if (result == null) result = caseSuperIdentifierType(analogueOutput);
				if (result == null) result = caseSuperTrackingType(analogueOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvipPackage.DISCRETE_INPUT: {
				DiscreteInput discreteInput = (DiscreteInput)theEObject;
				T result = caseDiscreteInput(discreteInput);
				if (result == null) result = caseSuperWiredPortType(discreteInput);
				if (result == null) result = caseSuperAVDPortType(discreteInput);
				if (result == null) result = caseSuperIdentifierType(discreteInput);
				if (result == null) result = caseSuperTrackingType(discreteInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvipPackage.DISCRETE_OUTPUT: {
				DiscreteOutput discreteOutput = (DiscreteOutput)theEObject;
				T result = caseDiscreteOutput(discreteOutput);
				if (result == null) result = caseSuperWiredPortType(discreteOutput);
				if (result == null) result = caseSuperAVDPortType(discreteOutput);
				if (result == null) result = caseSuperIdentifierType(discreteOutput);
				if (result == null) result = caseSuperTrackingType(discreteOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvipPackage.XTALK: {
				XTalk xTalk = (XTalk)theEObject;
				T result = caseXTalk(xTalk);
				if (result == null) result = caseSuperAVDPortType(xTalk);
				if (result == null) result = caseSuperIdentifierType(xTalk);
				if (result == null) result = caseSuperTrackingType(xTalk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvipPackage.A429: {
				A429 a429 = (A429)theEObject;
				T result = caseA429(a429);
				if (result == null) result = caseSuperAVDPortType(a429);
				if (result == null) result = caseSuperIdentifierType(a429);
				if (result == null) result = caseSuperTrackingType(a429);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvipPackage.A664: {
				A664 a664 = (A664)theEObject;
				T result = caseA664(a664);
				if (result == null) result = caseSuperAVDPortType(a664);
				if (result == null) result = caseSuperIdentifierType(a664);
				if (result == null) result = caseSuperTrackingType(a664);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvipPackage.CAN: {
				CAN can = (CAN)theEObject;
				T result = caseCAN(can);
				if (result == null) result = caseSuperAVDPortType(can);
				if (result == null) result = caseSuperIdentifierType(can);
				if (result == null) result = caseSuperTrackingType(can);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvipPackage.MEM: {
				MEM mem = (MEM)theEObject;
				T result = caseMEM(mem);
				if (result == null) result = caseSuperAVDPortType(mem);
				if (result == null) result = caseSuperIdentifierType(mem);
				if (result == null) result = caseSuperTrackingType(mem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvipPackage.VRTD: {
				V_RTD v_RTD = (V_RTD)theEObject;
				T result = caseV_RTD(v_RTD);
				if (result == null) result = caseSuperAVDPortType(v_RTD);
				if (result == null) result = caseSuperIdentifierType(v_RTD);
				if (result == null) result = caseSuperTrackingType(v_RTD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvipPackage.PORT_USER_CONFIGURATION: {
				PortUserConfiguration portUserConfiguration = (PortUserConfiguration)theEObject;
				T result = casePortUserConfiguration(portUserConfiguration);
				if (result == null) result = caseSuperIdentifierType(portUserConfiguration);
				if (result == null) result = caseSuperTrackingType(portUserConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvipPackage.AVD_SCHEDULER_EXTENSION: {
				AVDSchedulerExtension avdSchedulerExtension = (AVDSchedulerExtension)theEObject;
				T result = caseAVDSchedulerExtension(avdSchedulerExtension);
				if (result == null) result = caseSuperIdentifierType(avdSchedulerExtension);
				if (result == null) result = caseSuperTrackingType(avdSchedulerExtension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvipPackage.SIGNAL_EXTENSIONS: {
				SignalExtensions signalExtensions = (SignalExtensions)theEObject;
				T result = caseSignalExtensions(signalExtensions);
				if (result == null) result = caseSuperIdentifierType(signalExtensions);
				if (result == null) result = caseSuperTrackingType(signalExtensions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvipPackage.SIGNAL_EXTENSION: {
				SignalExtension signalExtension = (SignalExtension)theEObject;
				T result = caseSignalExtension(signalExtension);
				if (result == null) result = caseSuperClassExtensionType(signalExtension);
				if (result == null) result = caseSuperIdentifierType(signalExtension);
				if (result == null) result = caseSuperTrackingType(signalExtension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AvipPackage.MEM_PORT_ID_EXTENSION: {
				MEMPortIDExtension memPortIDExtension = (MEMPortIDExtension)theEObject;
				T result = caseMEMPortIDExtension(memPortIDExtension);
				if (result == null) result = caseSuperAssignmentSpecificationType(memPortIDExtension);
				if (result == null) result = caseSuperIdentifierType(memPortIDExtension);
				if (result == null) result = caseSuperTrackingType(memPortIDExtension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avionics Virtual Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avionics Virtual Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvionicsVirtualDevice(AvionicsVirtualDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AVD Ports</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AVD Ports</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAVDPorts(AVDPorts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super AVD Port Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super AVD Port Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperAVDPortType(SuperAVDPortType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalData(FunctionalData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Wired Port Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Wired Port Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperWiredPortType(SuperWiredPortType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Analogue Port Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Analogue Port Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperAnaloguePortType(SuperAnaloguePortType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analogue Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analogue Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalogueInput(AnalogueInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analogue Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analogue Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalogueOutput(AnalogueOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteInput(DiscreteInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteOutput(DiscreteOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XTalk</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XTalk</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXTalk(XTalk object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>A429</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>A429</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseA429(A429 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>A664</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>A664</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseA664(A664 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CAN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CAN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCAN(CAN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MEM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MEM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMEM(MEM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VRTD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VRTD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseV_RTD(V_RTD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port User Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port User Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortUserConfiguration(PortUserConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AVD Scheduler Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AVD Scheduler Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAVDSchedulerExtension(AVDSchedulerExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Extensions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Extensions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalExtensions(SignalExtensions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalExtension(SignalExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MEM Port ID Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MEM Port ID Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMEMPortIDExtension(MEMPortIDExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Identifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Identifier Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperIdentifierType(SuperIdentifierType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Tracking Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Tracking Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperTrackingType(SuperTrackingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Target Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Target Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperTargetType(SuperTargetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Class Extension Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Class Extension Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperClassExtensionType(SuperClassExtensionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Assignment Specification Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Assignment Specification Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperAssignmentSpecificationType(SuperAssignmentSpecificationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AvipSwitch
