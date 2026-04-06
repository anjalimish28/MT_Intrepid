/**
 */
package targets.HallSensor.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import targets.HallSensor.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HallSensorFactoryImpl extends EFactoryImpl implements HallSensorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HallSensorFactory init() {
		try {
			HallSensorFactory theHallSensorFactory = (HallSensorFactory)EPackage.Registry.INSTANCE.getEFactory(HallSensorPackage.eNS_URI);
			if (theHallSensorFactory != null) {
				return theHallSensorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HallSensorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HallSensorFactoryImpl() {
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
			case HallSensorPackage.MTS360: return createmts360();
			case HallSensorPackage.HALL_PORTS: return createhallPorts();
			case HallSensorPackage.HALL_PORT: return createhallPort();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mts360 createmts360() {
		mts360Impl mts360 = new mts360Impl();
		return mts360;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public hallPorts createhallPorts() {
		hallPortsImpl hallPorts = new hallPortsImpl();
		return hallPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public hallPort createhallPort() {
		hallPortImpl hallPort = new hallPortImpl();
		return hallPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HallSensorPackage getHallSensorPackage() {
		return (HallSensorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HallSensorPackage getPackage() {
		return HallSensorPackage.eINSTANCE;
	}

} //HallSensorFactoryImpl
