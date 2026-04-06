/**
 */
package ucof.common.etypes.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ucof.common.etypes.*;

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
 * @see ucof.common.etypes.EtypesPackage
 * @generated
 */
public class EtypesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EtypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtypesSwitch() {
		if (modelPackage == null) {
			modelPackage = EtypesPackage.eINSTANCE;
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
			case EtypesPackage.SUPER_IDENTIFIER_TYPE: {
				SuperIdentifierType superIdentifierType = (SuperIdentifierType)theEObject;
				T result = caseSuperIdentifierType(superIdentifierType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtypesPackage.SUPER_TRACKING_TYPE: {
				SuperTrackingType superTrackingType = (SuperTrackingType)theEObject;
				T result = caseSuperTrackingType(superTrackingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtypesPackage.SUPER_SET_TYPE: {
				SuperSetType superSetType = (SuperSetType)theEObject;
				T result = caseSuperSetType(superSetType);
				if (result == null) result = caseSuperIdentifierType(superSetType);
				if (result == null) result = caseSuperTrackingType(superSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtypesPackage.MEMORY: {
				Memory memory = (Memory)theEObject;
				T result = caseMemory(memory);
				if (result == null) result = caseSuperIdentifierType(memory);
				if (result == null) result = caseSuperTrackingType(memory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtypesPackage.MEMORY_REQUIREMENT: {
				MemoryRequirement memoryRequirement = (MemoryRequirement)theEObject;
				T result = caseMemoryRequirement(memoryRequirement);
				if (result == null) result = caseSuperIdentifierType(memoryRequirement);
				if (result == null) result = caseSuperTrackingType(memoryRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtypesPackage.SUPER_DEVICE_TYPE: {
				SuperDeviceType superDeviceType = (SuperDeviceType)theEObject;
				T result = caseSuperDeviceType(superDeviceType);
				if (result == null) result = caseSuperIdentifierType(superDeviceType);
				if (result == null) result = caseSuperTrackingType(superDeviceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtypesPackage.SUPER_PORT_TYPE: {
				SuperPortType superPortType = (SuperPortType)theEObject;
				T result = caseSuperPortType(superPortType);
				if (result == null) result = caseSuperIdentifierType(superPortType);
				if (result == null) result = caseSuperTrackingType(superPortType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtypesPackage.DEVICE_PORTS: {
				DevicePorts devicePorts = (DevicePorts)theEObject;
				T result = caseDevicePorts(devicePorts);
				if (result == null) result = caseSuperTrackingType(devicePorts);
				if (result == null) result = caseSuperIdentifierType(devicePorts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtypesPackage.SUPER_INTER_COMMUNICATION_PORT_TYPE: {
				SuperInterCommunicationPortType superInterCommunicationPortType = (SuperInterCommunicationPortType)theEObject;
				T result = caseSuperInterCommunicationPortType(superInterCommunicationPortType);
				if (result == null) result = caseSuperPortType(superInterCommunicationPortType);
				if (result == null) result = caseSuperIdentifierType(superInterCommunicationPortType);
				if (result == null) result = caseSuperTrackingType(superInterCommunicationPortType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtypesPackage.SAMPLING_PORT: {
				SamplingPort samplingPort = (SamplingPort)theEObject;
				T result = caseSamplingPort(samplingPort);
				if (result == null) result = caseSuperInterCommunicationPortType(samplingPort);
				if (result == null) result = caseSuperPortType(samplingPort);
				if (result == null) result = caseSuperIdentifierType(samplingPort);
				if (result == null) result = caseSuperTrackingType(samplingPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtypesPackage.QUEUING_PORT: {
				QueuingPort queuingPort = (QueuingPort)theEObject;
				T result = caseQueuingPort(queuingPort);
				if (result == null) result = caseSuperInterCommunicationPortType(queuingPort);
				if (result == null) result = caseSuperPortType(queuingPort);
				if (result == null) result = caseSuperIdentifierType(queuingPort);
				if (result == null) result = caseSuperTrackingType(queuingPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Super Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperSetType(SuperSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemory(Memory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryRequirement(MemoryRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Device Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Device Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperDeviceType(SuperDeviceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Port Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Port Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperPortType(SuperPortType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Ports</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Ports</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevicePorts(DevicePorts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Inter Communication Port Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Inter Communication Port Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperInterCommunicationPortType(SuperInterCommunicationPortType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sampling Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sampling Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSamplingPort(SamplingPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Queuing Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Queuing Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueuingPort(QueuingPort object) {
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

} //EtypesSwitch
