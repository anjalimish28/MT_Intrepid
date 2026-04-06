/**
 */
package ucof.devices.devicetypes.a653components.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ucof.devices.devicetypes.a653components.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class A653componentsFactoryImpl extends EFactoryImpl implements A653componentsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static A653componentsFactory init() {
		try {
			A653componentsFactory theA653componentsFactory = (A653componentsFactory)EPackage.Registry.INSTANCE.getEFactory(A653componentsPackage.eNS_URI);
			if (theA653componentsFactory != null) {
				return theA653componentsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new A653componentsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A653componentsFactoryImpl() {
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
			case A653componentsPackage.MODULE_SCHEDULE: return createModuleSchedule();
			case A653componentsPackage.MEMORY_REGION: return createMemoryRegion();
			case A653componentsPackage.PARTITION_TIME_WINDOW: return createPartitionTimeWindow();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleSchedule createModuleSchedule() {
		ModuleScheduleImpl moduleSchedule = new ModuleScheduleImpl();
		return moduleSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryRegion createMemoryRegion() {
		MemoryRegionImpl memoryRegion = new MemoryRegionImpl();
		return memoryRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionTimeWindow createPartitionTimeWindow() {
		PartitionTimeWindowImpl partitionTimeWindow = new PartitionTimeWindowImpl();
		return partitionTimeWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A653componentsPackage getA653componentsPackage() {
		return (A653componentsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static A653componentsPackage getPackage() {
		return A653componentsPackage.eINSTANCE;
	}

} //A653componentsFactoryImpl
