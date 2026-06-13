/**
 */
package targets.powergrid.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import targets.powergrid.*;

import ucof.assignments.SuperAssignmentType;

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
 * @see targets.powergrid.PowergridPackage
 * @generated
 */
public class PowergridSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PowergridPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowergridSwitch() {
		if (modelPackage == null) {
			modelPackage = PowergridPackage.eINSTANCE;
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
			case PowergridPackage.SUPER_POWER_TYPE: {
				SuperPowerType superPowerType = (SuperPowerType)theEObject;
				T result = caseSuperPowerType(superPowerType);
				if (result == null) result = caseSuperIdentifierType(superPowerType);
				if (result == null) result = caseSuperTrackingType(superPowerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PowergridPackage.ELETRCIAL_INTERFACES: {
				EletrcialInterfaces eletrcialInterfaces = (EletrcialInterfaces)theEObject;
				T result = caseEletrcialInterfaces(eletrcialInterfaces);
				if (result == null) result = caseSuperIdentifierType(eletrcialInterfaces);
				if (result == null) result = caseSuperTrackingType(eletrcialInterfaces);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE: {
				SuperElectricalInterfaceType superElectricalInterfaceType = (SuperElectricalInterfaceType)theEObject;
				T result = caseSuperElectricalInterfaceType(superElectricalInterfaceType);
				if (result == null) result = caseSuperIdentifierType(superElectricalInterfaceType);
				if (result == null) result = caseSuperTrackingType(superElectricalInterfaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE: {
				SuperElectricalGridType superElectricalGridType = (SuperElectricalGridType)theEObject;
				T result = caseSuperElectricalGridType(superElectricalGridType);
				if (result == null) result = caseSuperIdentifierType(superElectricalGridType);
				if (result == null) result = caseSuperTrackingType(superElectricalGridType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PowergridPackage.POWER_CONNECTION_SET: {
				PowerConnectionSet powerConnectionSet = (PowerConnectionSet)theEObject;
				T result = casePowerConnectionSet(powerConnectionSet);
				if (result == null) result = caseSuperIdentifierType(powerConnectionSet);
				if (result == null) result = caseSuperTrackingType(powerConnectionSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PowergridPackage.POWER_CONNECTION: {
				PowerConnection powerConnection = (PowerConnection)theEObject;
				T result = casePowerConnection(powerConnection);
				if (result == null) result = caseSuperAssignmentType(powerConnection);
				if (result == null) result = caseSuperIdentifierType(powerConnection);
				if (result == null) result = caseSuperTrackingType(powerConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PowergridPackage.ELECTRICAL_POWER_GRID_SET: {
				ElectricalPowerGridSet electricalPowerGridSet = (ElectricalPowerGridSet)theEObject;
				T result = caseElectricalPowerGridSet(electricalPowerGridSet);
				if (result == null) result = caseSuperIdentifierType(electricalPowerGridSet);
				if (result == null) result = caseSuperTrackingType(electricalPowerGridSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Eletrcial Interfaces</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eletrcial Interfaces</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEletrcialInterfaces(EletrcialInterfaces object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Electrical Interface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Electrical Interface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperElectricalInterfaceType(SuperElectricalInterfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Electrical Grid Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Electrical Grid Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperElectricalGridType(SuperElectricalGridType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Connection Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Connection Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerConnectionSet(PowerConnectionSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerConnection(PowerConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Electrical Power Grid Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Electrical Power Grid Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElectricalPowerGridSet(ElectricalPowerGridSet object) {
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

} //PowergridSwitch
