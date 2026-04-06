/**
 */
package ucof.assignments.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ucof.assignments.*;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperSetType;
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
 * @see ucof.assignments.AssignmentsPackage
 * @generated
 */
public class AssignmentsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AssignmentsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentsSwitch() {
		if (modelPackage == null) {
			modelPackage = AssignmentsPackage.eINSTANCE;
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
			case AssignmentsPackage.ASSIGNMENTS: {
				Assignments assignments = (Assignments)theEObject;
				T result = caseAssignments(assignments);
				if (result == null) result = caseSuperIdentifierType(assignments);
				if (result == null) result = caseSuperTrackingType(assignments);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignmentsPackage.SUPER_ASSIGNMENT_SET_TYPE: {
				SuperAssignmentSetType superAssignmentSetType = (SuperAssignmentSetType)theEObject;
				T result = caseSuperAssignmentSetType(superAssignmentSetType);
				if (result == null) result = caseSuperSetType(superAssignmentSetType);
				if (result == null) result = caseSuperIdentifierType(superAssignmentSetType);
				if (result == null) result = caseSuperTrackingType(superAssignmentSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignmentsPackage.SUPER_ASSIGNMENT_TYPE: {
				SuperAssignmentType superAssignmentType = (SuperAssignmentType)theEObject;
				T result = caseSuperAssignmentType(superAssignmentType);
				if (result == null) result = caseSuperIdentifierType(superAssignmentType);
				if (result == null) result = caseSuperTrackingType(superAssignmentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignmentsPackage.INTERFACE_TO_PORT2_PORT_ASSIGNMENT_SET: {
				InterfaceToPort2PortAssignmentSet interfaceToPort2PortAssignmentSet = (InterfaceToPort2PortAssignmentSet)theEObject;
				T result = caseInterfaceToPort2PortAssignmentSet(interfaceToPort2PortAssignmentSet);
				if (result == null) result = caseSuperAssignmentSetType(interfaceToPort2PortAssignmentSet);
				if (result == null) result = caseSuperSetType(interfaceToPort2PortAssignmentSet);
				if (result == null) result = caseSuperIdentifierType(interfaceToPort2PortAssignmentSet);
				if (result == null) result = caseSuperTrackingType(interfaceToPort2PortAssignmentSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignmentsPackage.INTERFACE_TO_PORT2_PORT_ASSIGNMENT: {
				InterfaceToPort2PortAssignment interfaceToPort2PortAssignment = (InterfaceToPort2PortAssignment)theEObject;
				T result = caseInterfaceToPort2PortAssignment(interfaceToPort2PortAssignment);
				if (result == null) result = caseSuperAssignmentType(interfaceToPort2PortAssignment);
				if (result == null) result = caseSuperIdentifierType(interfaceToPort2PortAssignment);
				if (result == null) result = caseSuperTrackingType(interfaceToPort2PortAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignmentsPackage.DEVICE_TO_IMPLEMENTATION_ASSIGNMENT_SET: {
				DeviceToImplementationAssignmentSet deviceToImplementationAssignmentSet = (DeviceToImplementationAssignmentSet)theEObject;
				T result = caseDeviceToImplementationAssignmentSet(deviceToImplementationAssignmentSet);
				if (result == null) result = caseSuperAssignmentSetType(deviceToImplementationAssignmentSet);
				if (result == null) result = caseSuperSetType(deviceToImplementationAssignmentSet);
				if (result == null) result = caseSuperIdentifierType(deviceToImplementationAssignmentSet);
				if (result == null) result = caseSuperTrackingType(deviceToImplementationAssignmentSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignmentsPackage.DEVICE_TO_IMPLEMENTATION_ASSIGNMENT: {
				DeviceToImplementationAssignment deviceToImplementationAssignment = (DeviceToImplementationAssignment)theEObject;
				T result = caseDeviceToImplementationAssignment(deviceToImplementationAssignment);
				if (result == null) result = caseSuperAssignmentType(deviceToImplementationAssignment);
				if (result == null) result = caseSuperIdentifierType(deviceToImplementationAssignment);
				if (result == null) result = caseSuperTrackingType(deviceToImplementationAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignmentsPackage.INTERFACE_TO_HARDWARE_ASSIGNMENT_SET: {
				InterfaceToHardwareAssignmentSet interfaceToHardwareAssignmentSet = (InterfaceToHardwareAssignmentSet)theEObject;
				T result = caseInterfaceToHardwareAssignmentSet(interfaceToHardwareAssignmentSet);
				if (result == null) result = caseSuperAssignmentSetType(interfaceToHardwareAssignmentSet);
				if (result == null) result = caseSuperSetType(interfaceToHardwareAssignmentSet);
				if (result == null) result = caseSuperIdentifierType(interfaceToHardwareAssignmentSet);
				if (result == null) result = caseSuperTrackingType(interfaceToHardwareAssignmentSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignmentsPackage.INTERFACE_TO_HARDWARE_ASSIGNMENT: {
				InterfaceToHardwareAssignment interfaceToHardwareAssignment = (InterfaceToHardwareAssignment)theEObject;
				T result = caseInterfaceToHardwareAssignment(interfaceToHardwareAssignment);
				if (result == null) result = caseSuperAssignmentType(interfaceToHardwareAssignment);
				if (result == null) result = caseSuperIdentifierType(interfaceToHardwareAssignment);
				if (result == null) result = caseSuperTrackingType(interfaceToHardwareAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignmentsPackage.PORT_TO_PORT_ASSIGNMENT_SET: {
				PortToPortAssignmentSet portToPortAssignmentSet = (PortToPortAssignmentSet)theEObject;
				T result = casePortToPortAssignmentSet(portToPortAssignmentSet);
				if (result == null) result = caseSuperAssignmentSetType(portToPortAssignmentSet);
				if (result == null) result = caseSuperSetType(portToPortAssignmentSet);
				if (result == null) result = caseSuperIdentifierType(portToPortAssignmentSet);
				if (result == null) result = caseSuperTrackingType(portToPortAssignmentSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignmentsPackage.PORT_TO_PORT_ASSIGNMENT: {
				PortToPortAssignment portToPortAssignment = (PortToPortAssignment)theEObject;
				T result = casePortToPortAssignment(portToPortAssignment);
				if (result == null) result = caseSuperAssignmentType(portToPortAssignment);
				if (result == null) result = caseSuperIdentifierType(portToPortAssignment);
				if (result == null) result = caseSuperTrackingType(portToPortAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignmentsPackage.ED247_ASSIGNMENT_SET: {
				ED247AssignmentSet ed247AssignmentSet = (ED247AssignmentSet)theEObject;
				T result = caseED247AssignmentSet(ed247AssignmentSet);
				if (result == null) result = caseSuperAssignmentSetType(ed247AssignmentSet);
				if (result == null) result = caseSuperSetType(ed247AssignmentSet);
				if (result == null) result = caseSuperIdentifierType(ed247AssignmentSet);
				if (result == null) result = caseSuperTrackingType(ed247AssignmentSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignmentsPackage.ED247_ASSIGNMENT: {
				ED247Assignment ed247Assignment = (ED247Assignment)theEObject;
				T result = caseED247Assignment(ed247Assignment);
				if (result == null) result = caseSuperAssignmentType(ed247Assignment);
				if (result == null) result = caseSuperIdentifierType(ed247Assignment);
				if (result == null) result = caseSuperTrackingType(ed247Assignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignmentsPackage.UDP_SOCKET_EXTENSION: {
				UDPSocketExtension udpSocketExtension = (UDPSocketExtension)theEObject;
				T result = caseUDPSocketExtension(udpSocketExtension);
				if (result == null) result = caseSuperIdentifierType(udpSocketExtension);
				if (result == null) result = caseSuperTrackingType(udpSocketExtension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignmentsPackage.SW_PORT_TO_HW_PORT_ASSIGNMENT_SET: {
				SWPortToHWPortAssignmentSet swPortToHWPortAssignmentSet = (SWPortToHWPortAssignmentSet)theEObject;
				T result = caseSWPortToHWPortAssignmentSet(swPortToHWPortAssignmentSet);
				if (result == null) result = caseSuperAssignmentSetType(swPortToHWPortAssignmentSet);
				if (result == null) result = caseSuperSetType(swPortToHWPortAssignmentSet);
				if (result == null) result = caseSuperIdentifierType(swPortToHWPortAssignmentSet);
				if (result == null) result = caseSuperTrackingType(swPortToHWPortAssignmentSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AssignmentsPackage.SW_PORT_TO_HW_PORT_ASSIGNMENT: {
				SWPortToHWPortAssignment swPortToHWPortAssignment = (SWPortToHWPortAssignment)theEObject;
				T result = caseSWPortToHWPortAssignment(swPortToHWPortAssignment);
				if (result == null) result = caseSuperAssignmentType(swPortToHWPortAssignment);
				if (result == null) result = caseSuperIdentifierType(swPortToHWPortAssignment);
				if (result == null) result = caseSuperTrackingType(swPortToHWPortAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignments</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignments</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignments(Assignments object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Assignment Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Assignment Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperAssignmentSetType(SuperAssignmentSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Assignment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Assignment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperAssignmentType(SuperAssignmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface To Port2 Port Assignment Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface To Port2 Port Assignment Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceToPort2PortAssignmentSet(InterfaceToPort2PortAssignmentSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface To Port2 Port Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface To Port2 Port Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceToPort2PortAssignment(InterfaceToPort2PortAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device To Implementation Assignment Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device To Implementation Assignment Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceToImplementationAssignmentSet(DeviceToImplementationAssignmentSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device To Implementation Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device To Implementation Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceToImplementationAssignment(DeviceToImplementationAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface To Hardware Assignment Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface To Hardware Assignment Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceToHardwareAssignmentSet(InterfaceToHardwareAssignmentSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface To Hardware Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface To Hardware Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceToHardwareAssignment(InterfaceToHardwareAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port To Port Assignment Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port To Port Assignment Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortToPortAssignmentSet(PortToPortAssignmentSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port To Port Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port To Port Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortToPortAssignment(PortToPortAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ED247 Assignment Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ED247 Assignment Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseED247AssignmentSet(ED247AssignmentSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ED247 Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ED247 Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseED247Assignment(ED247Assignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UDP Socket Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UDP Socket Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUDPSocketExtension(UDPSocketExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SW Port To HW Port Assignment Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SW Port To HW Port Assignment Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSWPortToHWPortAssignmentSet(SWPortToHWPortAssignmentSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SW Port To HW Port Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SW Port To HW Port Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSWPortToHWPortAssignment(SWPortToHWPortAssignment object) {
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

} //AssignmentsSwitch
