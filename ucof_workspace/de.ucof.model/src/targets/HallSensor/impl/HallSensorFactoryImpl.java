/**
 */
package targets.hallsensor.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import targets.hallsensor.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HallsensorFactoryImpl extends EFactoryImpl implements HallsensorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HallsensorFactory init() {
		try {
			HallsensorFactory theHallsensorFactory = (HallsensorFactory)EPackage.Registry.INSTANCE.getEFactory(HallsensorPackage.eNS_URI);
			if (theHallsensorFactory != null) {
				return theHallsensorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HallsensorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HallsensorFactoryImpl() {
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
			case HallsensorPackage.MTS360: return createmts360();
			case HallsensorPackage.HALL_PORTS: return createhallPorts();
			case HallsensorPackage.HALL_PORT: return createhallPort();
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
	public HallsensorPackage getHallsensorPackage() {
		return (HallsensorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HallsensorPackage getPackage() {
		return HallsensorPackage.eINSTANCE;
	}

} //HallsensorFactoryImpl
