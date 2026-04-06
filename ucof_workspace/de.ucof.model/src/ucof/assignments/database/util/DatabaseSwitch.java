/**
 */
package ucof.assignments.database.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ucof.assignments.SuperAssignmentSetType;
import ucof.assignments.SuperAssignmentType;

import ucof.assignments.database.*;

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
 * @see ucof.assignments.database.DatabasePackage
 * @generated
 */
public class DatabaseSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DatabasePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseSwitch() {
		if (modelPackage == null) {
			modelPackage = DatabasePackage.eINSTANCE;
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
			case DatabasePackage.SIGNAL_TO_TARGET_ASSIGNMENT_SET: {
				SignalToTargetAssignmentSet signalToTargetAssignmentSet = (SignalToTargetAssignmentSet)theEObject;
				T result = caseSignalToTargetAssignmentSet(signalToTargetAssignmentSet);
				if (result == null) result = caseSuperAssignmentSetType(signalToTargetAssignmentSet);
				if (result == null) result = caseSuperSetType(signalToTargetAssignmentSet);
				if (result == null) result = caseSuperIdentifierType(signalToTargetAssignmentSet);
				if (result == null) result = caseSuperTrackingType(signalToTargetAssignmentSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatabasePackage.SIGNAL_TO_TARGET_ASSIGNMENT: {
				SignalToTargetAssignment signalToTargetAssignment = (SignalToTargetAssignment)theEObject;
				T result = caseSignalToTargetAssignment(signalToTargetAssignment);
				if (result == null) result = caseSuperAssignmentType(signalToTargetAssignment);
				if (result == null) result = caseSuperIdentifierType(signalToTargetAssignment);
				if (result == null) result = caseSuperTrackingType(signalToTargetAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatabasePackage.PAYLOAD_TO_TARGET_ASSIGNMENT_SET: {
				PayloadToTargetAssignmentSet payloadToTargetAssignmentSet = (PayloadToTargetAssignmentSet)theEObject;
				T result = casePayloadToTargetAssignmentSet(payloadToTargetAssignmentSet);
				if (result == null) result = caseSuperAssignmentSetType(payloadToTargetAssignmentSet);
				if (result == null) result = caseSuperSetType(payloadToTargetAssignmentSet);
				if (result == null) result = caseSuperIdentifierType(payloadToTargetAssignmentSet);
				if (result == null) result = caseSuperTrackingType(payloadToTargetAssignmentSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatabasePackage.PAYLOAD_TO_TARGET_ASSIGNMENT: {
				PayloadToTargetAssignment payloadToTargetAssignment = (PayloadToTargetAssignment)theEObject;
				T result = casePayloadToTargetAssignment(payloadToTargetAssignment);
				if (result == null) result = caseSuperAssignmentType(payloadToTargetAssignment);
				if (result == null) result = caseSuperIdentifierType(payloadToTargetAssignment);
				if (result == null) result = caseSuperTrackingType(payloadToTargetAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatabasePackage.MESSAGE_TO_TARGET_ASSIGNMENT_SET: {
				MessageToTargetAssignmentSet messageToTargetAssignmentSet = (MessageToTargetAssignmentSet)theEObject;
				T result = caseMessageToTargetAssignmentSet(messageToTargetAssignmentSet);
				if (result == null) result = caseSuperAssignmentSetType(messageToTargetAssignmentSet);
				if (result == null) result = caseSuperSetType(messageToTargetAssignmentSet);
				if (result == null) result = caseSuperIdentifierType(messageToTargetAssignmentSet);
				if (result == null) result = caseSuperTrackingType(messageToTargetAssignmentSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatabasePackage.MESSAGE_TO_TARGET_ASSIGNMENT: {
				MessageToTargetAssignment messageToTargetAssignment = (MessageToTargetAssignment)theEObject;
				T result = caseMessageToTargetAssignment(messageToTargetAssignment);
				if (result == null) result = caseSuperAssignmentType(messageToTargetAssignment);
				if (result == null) result = caseSuperIdentifierType(messageToTargetAssignment);
				if (result == null) result = caseSuperTrackingType(messageToTargetAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal To Target Assignment Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal To Target Assignment Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalToTargetAssignmentSet(SignalToTargetAssignmentSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal To Target Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal To Target Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalToTargetAssignment(SignalToTargetAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payload To Target Assignment Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payload To Target Assignment Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePayloadToTargetAssignmentSet(PayloadToTargetAssignmentSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payload To Target Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payload To Target Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePayloadToTargetAssignment(PayloadToTargetAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message To Target Assignment Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message To Target Assignment Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageToTargetAssignmentSet(MessageToTargetAssignmentSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message To Target Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message To Target Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageToTargetAssignment(MessageToTargetAssignment object) {
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

} //DatabaseSwitch
