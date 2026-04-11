/**
 */
package targets.IntrepidPowerGrid.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import targets.IntrepidPowerGrid.*;

import targets.powergrid.SuperElectricalGridType;
import targets.powergrid.SuperElectricalInterfaceType;

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
 * @see targets.IntrepidPowerGrid.IntrepidPowerGridPackage
 * @generated
 */
public class IntrepidPowerGridSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IntrepidPowerGridPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntrepidPowerGridSwitch() {
		if (modelPackage == null) {
			modelPackage = IntrepidPowerGridPackage.eINSTANCE;
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
			case IntrepidPowerGridPackage.INTREPID_ELECTRICAL_GRID: {
				intrepidElectricalGrid intrepidElectricalGrid = (intrepidElectricalGrid)theEObject;
				T result = caseintrepidElectricalGrid(intrepidElectricalGrid);
				if (result == null) result = caseSuperElectricalGridType(intrepidElectricalGrid);
				if (result == null) result = caseSuperIdentifierType(intrepidElectricalGrid);
				if (result == null) result = caseSuperTrackingType(intrepidElectricalGrid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IntrepidPowerGridPackage.INTREPID_ELECTRICAL_INTERFACE: {
				intrepidElectricalInterface intrepidElectricalInterface = (intrepidElectricalInterface)theEObject;
				T result = caseintrepidElectricalInterface(intrepidElectricalInterface);
				if (result == null) result = caseSuperElectricalInterfaceType(intrepidElectricalInterface);
				if (result == null) result = caseSuperIdentifierType(intrepidElectricalInterface);
				if (result == null) result = caseSuperTrackingType(intrepidElectricalInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>intrepid Electrical Grid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>intrepid Electrical Grid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseintrepidElectricalGrid(intrepidElectricalGrid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>intrepid Electrical Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>intrepid Electrical Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseintrepidElectricalInterface(intrepidElectricalInterface object) {
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

} //IntrepidPowerGridSwitch
