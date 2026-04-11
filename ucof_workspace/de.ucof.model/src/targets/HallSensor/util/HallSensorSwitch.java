/**
 */
package targets.HallSensor.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import targets.HallSensor.*;

import targets.SuperHardwarePortType;
import targets.SuperTargetType;

import targets.powergrid.SuperPowerType;
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
 * @see targets.HallSensor.HallSensorPackage
 * @generated
 */
public class HallSensorSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HallSensorPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HallSensorSwitch() {
		if (modelPackage == null) {
			modelPackage = HallSensorPackage.eINSTANCE;
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
			case HallSensorPackage.MTS360: {
				mts360 mts360 = (mts360)theEObject;
				T result = casemts360(mts360);
				if (result == null) result = caseSuperTargetType(mts360);
				if (result == null) result = caseSuperPowerType(mts360);
				if (result == null) result = caseSuperIdentifierType(mts360);
				if (result == null) result = caseSuperTrackingType(mts360);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HallSensorPackage.HALL_PORTS: {
				hallPorts hallPorts = (hallPorts)theEObject;
				T result = casehallPorts(hallPorts);
				if (result == null) result = caseSuperTrackingType(hallPorts);
				if (result == null) result = caseSuperIdentifierType(hallPorts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HallSensorPackage.HALL_PORT: {
				hallPort hallPort = (hallPort)theEObject;
				T result = casehallPort(hallPort);
				if (result == null) result = caseSuperHardwarePortType(hallPort);
				if (result == null) result = caseSuperIdentifierType(hallPort);
				if (result == null) result = caseSuperTrackingType(hallPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>mts360</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>mts360</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemts360(mts360 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>hall Ports</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>hall Ports</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casehallPorts(hallPorts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>hall Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>hall Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casehallPort(hallPort object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Super Power Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Power Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperPowerType(SuperPowerType object) {
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

} //HallSensorSwitch
