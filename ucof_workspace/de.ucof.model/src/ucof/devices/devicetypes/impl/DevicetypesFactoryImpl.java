/**
 */
package ucof.devices.devicetypes.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ucof.devices.devicetypes.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DevicetypesFactoryImpl extends EFactoryImpl implements DevicetypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DevicetypesFactory init() {
		try {
			DevicetypesFactory theDevicetypesFactory = (DevicetypesFactory)EPackage.Registry.INSTANCE.getEFactory(DevicetypesPackage.eNS_URI);
			if (theDevicetypesFactory != null) {
				return theDevicetypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DevicetypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevicetypesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DevicetypesPackage.A653P1_MODULE: return createA653P1Module();
			case DevicetypesPackage.A653P4_MODULE: return createA653P4Module();
			case DevicetypesPackage.IO_MODULE: return createIOModule();
			case DevicetypesPackage.PERIPHERAL: return createPeripheral();
			case DevicetypesPackage.A664_SWITCH: return createA664Switch();
			case DevicetypesPackage.COMPUTING_MODULE: return createComputingModule();
			case DevicetypesPackage.POWER_RAIL: return createPowerRail();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A653P1Module createA653P1Module() {
		A653P1ModuleImpl a653P1Module = new A653P1ModuleImpl();
		return a653P1Module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A653P4Module createA653P4Module() {
		A653P4ModuleImpl a653P4Module = new A653P4ModuleImpl();
		return a653P4Module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOModule createIOModule() {
		IOModuleImpl ioModule = new IOModuleImpl();
		return ioModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Peripheral createPeripheral() {
		PeripheralImpl peripheral = new PeripheralImpl();
		return peripheral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A664Switch createA664Switch() {
		A664SwitchImpl a664Switch = new A664SwitchImpl();
		return a664Switch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputingModule createComputingModule() {
		ComputingModuleImpl computingModule = new ComputingModuleImpl();
		return computingModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerRail createPowerRail() {
		PowerRailImpl powerRail = new PowerRailImpl();
		return powerRail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevicetypesPackage getDevicetypesPackage() {
		return (DevicetypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DevicetypesPackage getPackage() {
		return DevicetypesPackage.eINSTANCE;
	}

} //DevicetypesFactoryImpl
