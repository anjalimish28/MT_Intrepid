/**
 */
package targets.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import targets.*;

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
 * @see targets.TargetsPackage
 * @generated
 */
public class TargetsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TargetsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetsSwitch() {
		if (modelPackage == null) {
			modelPackage = TargetsPackage.eINSTANCE;
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
			case TargetsPackage.TARGETS: {
				Targets targets = (Targets)theEObject;
				T result = caseTargets(targets);
				if (result == null) result = caseSuperIdentifierType(targets);
				if (result == null) result = caseSuperTrackingType(targets);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetsPackage.SUPER_TARGET_TYPE: {
				SuperTargetType superTargetType = (SuperTargetType)theEObject;
				T result = caseSuperTargetType(superTargetType);
				if (result == null) result = caseSuperIdentifierType(superTargetType);
				if (result == null) result = caseSuperTrackingType(superTargetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetsPackage.SUPER_IO_HARDWARE_TYPE: {
				SuperIOHardwareType superIOHardwareType = (SuperIOHardwareType)theEObject;
				T result = caseSuperIOHardwareType(superIOHardwareType);
				if (result == null) result = caseSuperIdentifierType(superIOHardwareType);
				if (result == null) result = caseSuperTrackingType(superIOHardwareType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetsPackage.SUPER_CLASS_EXTENSION_TYPE: {
				SuperClassExtensionType superClassExtensionType = (SuperClassExtensionType)theEObject;
				T result = caseSuperClassExtensionType(superClassExtensionType);
				if (result == null) result = caseSuperIdentifierType(superClassExtensionType);
				if (result == null) result = caseSuperTrackingType(superClassExtensionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetsPackage.SUPER_ASSIGNMENT_SPECIFICATION_TYPE: {
				SuperAssignmentSpecificationType superAssignmentSpecificationType = (SuperAssignmentSpecificationType)theEObject;
				T result = caseSuperAssignmentSpecificationType(superAssignmentSpecificationType);
				if (result == null) result = caseSuperIdentifierType(superAssignmentSpecificationType);
				if (result == null) result = caseSuperTrackingType(superAssignmentSpecificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetsPackage.ATTRIBUTE_DATATYPE_CONVERSION: {
				AttributeDatatypeConversion attributeDatatypeConversion = (AttributeDatatypeConversion)theEObject;
				T result = caseAttributeDatatypeConversion(attributeDatatypeConversion);
				if (result == null) result = caseSuperAssignmentSpecificationType(attributeDatatypeConversion);
				if (result == null) result = caseSuperIdentifierType(attributeDatatypeConversion);
				if (result == null) result = caseSuperTrackingType(attributeDatatypeConversion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetsPackage.RESISTOR_INFO: {
				ResistorInfo resistorInfo = (ResistorInfo)theEObject;
				T result = caseResistorInfo(resistorInfo);
				if (result == null) result = caseSuperAssignmentSpecificationType(resistorInfo);
				if (result == null) result = caseSuperIdentifierType(resistorInfo);
				if (result == null) result = caseSuperTrackingType(resistorInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetsPackage.HARDWARE_INFORMATION: {
				HardwareInformation hardwareInformation = (HardwareInformation)theEObject;
				T result = caseHardwareInformation(hardwareInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TargetsPackage.SUPER_HARDWARE_PORT_TYPE: {
				SuperHardwarePortType superHardwarePortType = (SuperHardwarePortType)theEObject;
				T result = caseSuperHardwarePortType(superHardwarePortType);
				if (result == null) result = caseSuperIdentifierType(superHardwarePortType);
				if (result == null) result = caseSuperTrackingType(superHardwarePortType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Targets</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Targets</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargets(Targets object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Super IO Hardware Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super IO Hardware Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperIOHardwareType(SuperIOHardwareType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Datatype Conversion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Datatype Conversion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDatatypeConversion(AttributeDatatypeConversion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resistor Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resistor Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResistorInfo(ResistorInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareInformation(HardwareInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Hardware Port Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Hardware Port Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperHardwarePortType(SuperHardwarePortType object) {
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

} //TargetsSwitch
