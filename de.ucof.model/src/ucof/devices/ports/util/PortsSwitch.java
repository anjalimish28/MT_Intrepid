/**
 */
package ucof.devices.ports.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperPortType;
import ucof.common.etypes.SuperTrackingType;

import ucof.devices.ports.*;

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
 * @see ucof.devices.ports.PortsPackage
 * @generated
 */
public class PortsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PortsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortsSwitch() {
		if (modelPackage == null) {
			modelPackage = PortsPackage.eINSTANCE;
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
			case PortsPackage.PARTITION_PORTS: {
				PartitionPorts partitionPorts = (PartitionPorts)theEObject;
				T result = casePartitionPorts(partitionPorts);
				if (result == null) result = caseSuperTrackingType(partitionPorts);
				if (result == null) result = caseSuperIdentifierType(partitionPorts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PortsPackage.PROCESS_PORTS: {
				ProcessPorts processPorts = (ProcessPorts)theEObject;
				T result = caseProcessPorts(processPorts);
				if (result == null) result = caseSuperTrackingType(processPorts);
				if (result == null) result = caseSuperIdentifierType(processPorts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PortsPackage.SUPER_INTRA_COMMUNICATION_PORT_TYPE: {
				SuperIntraCommunicationPortType superIntraCommunicationPortType = (SuperIntraCommunicationPortType)theEObject;
				T result = caseSuperIntraCommunicationPortType(superIntraCommunicationPortType);
				if (result == null) result = caseSuperPortType(superIntraCommunicationPortType);
				if (result == null) result = caseSuperIdentifierType(superIntraCommunicationPortType);
				if (result == null) result = caseSuperTrackingType(superIntraCommunicationPortType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PortsPackage.BLACKBOARD: {
				Blackboard blackboard = (Blackboard)theEObject;
				T result = caseBlackboard(blackboard);
				if (result == null) result = caseSuperIntraCommunicationPortType(blackboard);
				if (result == null) result = caseSuperPortType(blackboard);
				if (result == null) result = caseSuperIdentifierType(blackboard);
				if (result == null) result = caseSuperTrackingType(blackboard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PortsPackage.BUFFER: {
				Buffer buffer = (Buffer)theEObject;
				T result = caseBuffer(buffer);
				if (result == null) result = caseSuperIntraCommunicationPortType(buffer);
				if (result == null) result = caseSuperPortType(buffer);
				if (result == null) result = caseSuperIdentifierType(buffer);
				if (result == null) result = caseSuperTrackingType(buffer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partition Ports</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partition Ports</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartitionPorts(PartitionPorts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Ports</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Ports</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessPorts(ProcessPorts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Intra Communication Port Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Intra Communication Port Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperIntraCommunicationPortType(SuperIntraCommunicationPortType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blackboard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blackboard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlackboard(Blackboard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Buffer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuffer(Buffer object) {
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

} //PortsSwitch
