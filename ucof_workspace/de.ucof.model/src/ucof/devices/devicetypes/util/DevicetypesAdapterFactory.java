/**
 */
package ucof.devices.devicetypes.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ucof.common.etypes.SuperDeviceType;
import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

import ucof.devices.SuperPlatformDeviceType;

import ucof.devices.devicetypes.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ucof.devices.devicetypes.DevicetypesPackage
 * @generated
 */
public class DevicetypesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DevicetypesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevicetypesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DevicetypesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevicetypesSwitch<Adapter> modelSwitch =
		new DevicetypesSwitch<Adapter>() {
			@Override
			public Adapter caseSuperA653ModuleType(SuperA653ModuleType object) {
				return createSuperA653ModuleTypeAdapter();
			}
			@Override
			public Adapter caseA653P1Module(A653P1Module object) {
				return createA653P1ModuleAdapter();
			}
			@Override
			public Adapter caseA653P4Module(A653P4Module object) {
				return createA653P4ModuleAdapter();
			}
			@Override
			public Adapter caseIOModule(IOModule object) {
				return createIOModuleAdapter();
			}
			@Override
			public Adapter casePeripheral(Peripheral object) {
				return createPeripheralAdapter();
			}
			@Override
			public Adapter caseSuperSwitchType(SuperSwitchType object) {
				return createSuperSwitchTypeAdapter();
			}
			@Override
			public Adapter caseA664Switch(A664Switch object) {
				return createA664SwitchAdapter();
			}
			@Override
			public Adapter caseComputingModule(ComputingModule object) {
				return createComputingModuleAdapter();
			}
			@Override
			public Adapter casePowerRail(PowerRail object) {
				return createPowerRailAdapter();
			}
			@Override
			public Adapter caseSuperIdentifierType(SuperIdentifierType object) {
				return createSuperIdentifierTypeAdapter();
			}
			@Override
			public Adapter caseSuperTrackingType(SuperTrackingType object) {
				return createSuperTrackingTypeAdapter();
			}
			@Override
			public Adapter caseSuperDeviceType(SuperDeviceType object) {
				return createSuperDeviceTypeAdapter();
			}
			@Override
			public Adapter caseSuperPlatformDeviceType(SuperPlatformDeviceType object) {
				return createSuperPlatformDeviceTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ucof.devices.devicetypes.SuperA653ModuleType <em>Super A653 Module Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.devices.devicetypes.SuperA653ModuleType
	 * @generated
	 */
	public Adapter createSuperA653ModuleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.devices.devicetypes.A653P1Module <em>A653P1 Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.devices.devicetypes.A653P1Module
	 * @generated
	 */
	public Adapter createA653P1ModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.devices.devicetypes.A653P4Module <em>A653P4 Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.devices.devicetypes.A653P4Module
	 * @generated
	 */
	public Adapter createA653P4ModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.devices.devicetypes.IOModule <em>IO Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.devices.devicetypes.IOModule
	 * @generated
	 */
	public Adapter createIOModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.devices.devicetypes.Peripheral <em>Peripheral</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.devices.devicetypes.Peripheral
	 * @generated
	 */
	public Adapter createPeripheralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.devices.devicetypes.SuperSwitchType <em>Super Switch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.devices.devicetypes.SuperSwitchType
	 * @generated
	 */
	public Adapter createSuperSwitchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.devices.devicetypes.A664Switch <em>A664 Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.devices.devicetypes.A664Switch
	 * @generated
	 */
	public Adapter createA664SwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.devices.devicetypes.ComputingModule <em>Computing Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.devices.devicetypes.ComputingModule
	 * @generated
	 */
	public Adapter createComputingModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.devices.devicetypes.PowerRail <em>Power Rail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.devices.devicetypes.PowerRail
	 * @generated
	 */
	public Adapter createPowerRailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.common.etypes.SuperIdentifierType <em>Super Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.common.etypes.SuperIdentifierType
	 * @generated
	 */
	public Adapter createSuperIdentifierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.common.etypes.SuperTrackingType <em>Super Tracking Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.common.etypes.SuperTrackingType
	 * @generated
	 */
	public Adapter createSuperTrackingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.common.etypes.SuperDeviceType <em>Super Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.common.etypes.SuperDeviceType
	 * @generated
	 */
	public Adapter createSuperDeviceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.devices.SuperPlatformDeviceType <em>Super Platform Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.devices.SuperPlatformDeviceType
	 * @generated
	 */
	public Adapter createSuperPlatformDeviceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DevicetypesAdapterFactory
