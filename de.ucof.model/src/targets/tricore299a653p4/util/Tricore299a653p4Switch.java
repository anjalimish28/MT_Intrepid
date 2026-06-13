/**
 */
package targets.tricore299a653p4.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import targets.HardwareInformation;
import targets.SuperAssignmentSpecificationType;
import targets.SuperIOHardwareType;
import targets.SuperTargetType;

import targets.a653capabletarget.SuperA653CapableTargetType;

import targets.tricore299a653p4.*;
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
 * @see targets.tricore299a653p4.Tricore299a653p4Package
 * @generated
 */
public class Tricore299a653p4Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Tricore299a653p4Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tricore299a653p4Switch() {
		if (modelPackage == null) {
			modelPackage = Tricore299a653p4Package.eINSTANCE;
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
			case Tricore299a653p4Package.TRI_CORE299: {
				TriCore299 triCore299 = (TriCore299)theEObject;
				T result = caseTriCore299(triCore299);
				if (result == null) result = caseHardwareInformation(triCore299);
				if (result == null) result = caseSuperA653CapableTargetType(triCore299);
				if (result == null) result = caseSuperTargetType(triCore299);
				if (result == null) result = caseSuperIdentifierType(triCore299);
				if (result == null) result = caseSuperTrackingType(triCore299);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tricore299a653p4Package.SUPER_TRI_CORE299_IO_HARDWARE_TYPE: {
				SuperTriCore299IOHardwareType superTriCore299IOHardwareType = (SuperTriCore299IOHardwareType)theEObject;
				T result = caseSuperTriCore299IOHardwareType(superTriCore299IOHardwareType);
				if (result == null) result = caseSuperIOHardwareType(superTriCore299IOHardwareType);
				if (result == null) result = caseSuperIdentifierType(superTriCore299IOHardwareType);
				if (result == null) result = caseSuperTrackingType(superTriCore299IOHardwareType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tricore299a653p4Package.A825_DRIVER_CONFIGURATION: {
				A825DriverConfiguration a825DriverConfiguration = (A825DriverConfiguration)theEObject;
				T result = caseA825DriverConfiguration(a825DriverConfiguration);
				if (result == null) result = caseSuperTriCore299IOHardwareType(a825DriverConfiguration);
				if (result == null) result = caseSuperIOHardwareType(a825DriverConfiguration);
				if (result == null) result = caseSuperIdentifierType(a825DriverConfiguration);
				if (result == null) result = caseSuperTrackingType(a825DriverConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tricore299a653p4Package.MESSAGE_POST_BOX_SPECIFIER: {
				MessagePostBoxSpecifier messagePostBoxSpecifier = (MessagePostBoxSpecifier)theEObject;
				T result = caseMessagePostBoxSpecifier(messagePostBoxSpecifier);
				if (result == null) result = caseSuperAssignmentSpecificationType(messagePostBoxSpecifier);
				if (result == null) result = caseSuperIdentifierType(messagePostBoxSpecifier);
				if (result == null) result = caseSuperTrackingType(messagePostBoxSpecifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tri Core299</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tri Core299</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriCore299(TriCore299 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Tri Core299 IO Hardware Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Tri Core299 IO Hardware Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperTriCore299IOHardwareType(SuperTriCore299IOHardwareType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>A825 Driver Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>A825 Driver Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseA825DriverConfiguration(A825DriverConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Post Box Specifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Post Box Specifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessagePostBoxSpecifier(MessagePostBoxSpecifier object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Super A653 Capable Target Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super A653 Capable Target Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperA653CapableTargetType(SuperA653CapableTargetType object) {
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

} //Tricore299a653p4Switch
