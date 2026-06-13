/**
 */
package targets.vxworksa653.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import targets.vxworksa653.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Vxworksa653FactoryImpl extends EFactoryImpl implements Vxworksa653Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Vxworksa653Factory init() {
		try {
			Vxworksa653Factory theVxworksa653Factory = (Vxworksa653Factory)EPackage.Registry.INSTANCE.getEFactory(Vxworksa653Package.eNS_URI);
			if (theVxworksa653Factory != null) {
				return theVxworksa653Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Vxworksa653FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vxworksa653FactoryImpl() {
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
			case Vxworksa653Package.VX_WORKS_A653: return createVxWorksA653();
			case Vxworksa653Package.SIMULATED_DEVICES: return createSimulatedDevices();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Vxworksa653Package.SIMULATED_DEVICES_LIST:
				return createSimulatedDevicesListFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Vxworksa653Package.SIMULATED_DEVICES_LIST:
				return convertSimulatedDevicesListToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VxWorksA653 createVxWorksA653() {
		VxWorksA653Impl vxWorksA653 = new VxWorksA653Impl();
		return vxWorksA653;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulatedDevices createSimulatedDevices() {
		SimulatedDevicesImpl simulatedDevices = new SimulatedDevicesImpl();
		return simulatedDevices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulatedDevicesList createSimulatedDevicesListFromString(EDataType eDataType, String initialValue) {
		SimulatedDevicesList result = SimulatedDevicesList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSimulatedDevicesListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vxworksa653Package getVxworksa653Package() {
		return (Vxworksa653Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Vxworksa653Package getPackage() {
		return Vxworksa653Package.eINSTANCE;
	}

} //Vxworksa653FactoryImpl
