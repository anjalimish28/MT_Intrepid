/**
 */
package ucof.devices.devicetypes.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ucof.common.etypes.SuperDeviceType;
import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

import ucof.devices.SuperPlatformDeviceType;

import ucof.devices.devicetypes.*;

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
 * @see ucof.devices.devicetypes.DevicetypesPackage
 * @generated
 */
public class DevicetypesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DevicetypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevicetypesSwitch() {
		if (modelPackage == null) {
			modelPackage = DevicetypesPackage.eINSTANCE;
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
			case DevicetypesPackage.SUPER_A653_MODULE_TYPE: {
				SuperA653ModuleType superA653ModuleType = (SuperA653ModuleType)theEObject;
				T result = caseSuperA653ModuleType(superA653ModuleType);
				if (result == null) result = caseSuperPlatformDeviceType(superA653ModuleType);
				if (result == null) result = caseSuperDeviceType(superA653ModuleType);
				if (result == null) result = caseSuperIdentifierType(superA653ModuleType);
				if (result == null) result = caseSuperTrackingType(superA653ModuleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevicetypesPackage.A653P1_MODULE: {
				A653P1Module a653P1Module = (A653P1Module)theEObject;
				T result = caseA653P1Module(a653P1Module);
				if (result == null) result = caseSuperA653ModuleType(a653P1Module);
				if (result == null) result = caseSuperPlatformDeviceType(a653P1Module);
				if (result == null) result = caseSuperDeviceType(a653P1Module);
				if (result == null) result = caseSuperIdentifierType(a653P1Module);
				if (result == null) result = caseSuperTrackingType(a653P1Module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevicetypesPackage.A653P4_MODULE: {
				A653P4Module a653P4Module = (A653P4Module)theEObject;
				T result = caseA653P4Module(a653P4Module);
				if (result == null) result = caseSuperA653ModuleType(a653P4Module);
				if (result == null) result = caseSuperPlatformDeviceType(a653P4Module);
				if (result == null) result = caseSuperDeviceType(a653P4Module);
				if (result == null) result = caseSuperIdentifierType(a653P4Module);
				if (result == null) result = caseSuperTrackingType(a653P4Module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevicetypesPackage.IO_MODULE: {
				IOModule ioModule = (IOModule)theEObject;
				T result = caseIOModule(ioModule);
				if (result == null) result = caseSuperA653ModuleType(ioModule);
				if (result == null) result = caseSuperPlatformDeviceType(ioModule);
				if (result == null) result = caseSuperDeviceType(ioModule);
				if (result == null) result = caseSuperIdentifierType(ioModule);
				if (result == null) result = caseSuperTrackingType(ioModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevicetypesPackage.PERIPHERAL: {
				Peripheral peripheral = (Peripheral)theEObject;
				T result = casePeripheral(peripheral);
				if (result == null) result = caseSuperA653ModuleType(peripheral);
				if (result == null) result = caseSuperPlatformDeviceType(peripheral);
				if (result == null) result = caseSuperDeviceType(peripheral);
				if (result == null) result = caseSuperIdentifierType(peripheral);
				if (result == null) result = caseSuperTrackingType(peripheral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevicetypesPackage.SUPER_SWITCH_TYPE: {
				SuperSwitchType superSwitchType = (SuperSwitchType)theEObject;
				T result = caseSuperSwitchType(superSwitchType);
				if (result == null) result = caseSuperA653ModuleType(superSwitchType);
				if (result == null) result = caseSuperPlatformDeviceType(superSwitchType);
				if (result == null) result = caseSuperDeviceType(superSwitchType);
				if (result == null) result = caseSuperIdentifierType(superSwitchType);
				if (result == null) result = caseSuperTrackingType(superSwitchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevicetypesPackage.A664_SWITCH: {
				A664Switch a664Switch = (A664Switch)theEObject;
				T result = caseA664Switch(a664Switch);
				if (result == null) result = caseSuperSwitchType(a664Switch);
				if (result == null) result = caseSuperA653ModuleType(a664Switch);
				if (result == null) result = caseSuperPlatformDeviceType(a664Switch);
				if (result == null) result = caseSuperDeviceType(a664Switch);
				if (result == null) result = caseSuperIdentifierType(a664Switch);
				if (result == null) result = caseSuperTrackingType(a664Switch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevicetypesPackage.COMPUTING_MODULE: {
				ComputingModule computingModule = (ComputingModule)theEObject;
				T result = caseComputingModule(computingModule);
				if (result == null) result = caseSuperPlatformDeviceType(computingModule);
				if (result == null) result = caseSuperDeviceType(computingModule);
				if (result == null) result = caseSuperIdentifierType(computingModule);
				if (result == null) result = caseSuperTrackingType(computingModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevicetypesPackage.POWER_RAIL: {
				PowerRail powerRail = (PowerRail)theEObject;
				T result = casePowerRail(powerRail);
				if (result == null) result = caseSuperPlatformDeviceType(powerRail);
				if (result == null) result = caseSuperDeviceType(powerRail);
				if (result == null) result = caseSuperIdentifierType(powerRail);
				if (result == null) result = caseSuperTrackingType(powerRail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super A653 Module Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super A653 Module Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperA653ModuleType(SuperA653ModuleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>A653P1 Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>A653P1 Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseA653P1Module(A653P1Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>A653P4 Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>A653P4 Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseA653P4Module(A653P4Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IO Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IO Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIOModule(IOModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Peripheral</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Peripheral</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeripheral(Peripheral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Switch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Switch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperSwitchType(SuperSwitchType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>A664 Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>A664 Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseA664Switch(A664Switch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computing Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computing Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputingModule(ComputingModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Rail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Rail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerRail(PowerRail object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Super Platform Device Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Platform Device Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperPlatformDeviceType(SuperPlatformDeviceType object) {
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

} //DevicetypesSwitch
