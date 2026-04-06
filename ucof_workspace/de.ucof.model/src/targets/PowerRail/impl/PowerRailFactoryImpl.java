/**
 */
package targets.PowerRail.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import targets.PowerRail.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PowerRailFactoryImpl extends EFactoryImpl implements PowerRailFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PowerRailFactory init() {
		try {
			PowerRailFactory thePowerRailFactory = (PowerRailFactory)EPackage.Registry.INSTANCE.getEFactory(PowerRailPackage.eNS_URI);
			if (thePowerRailFactory != null) {
				return thePowerRailFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PowerRailFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerRailFactoryImpl() {
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
			case PowerRailPackage.POWER_RAIL_TARGET: return createpowerRailTarget();
			case PowerRailPackage.POWER_RAIL_PORTS: return createpowerRailPorts();
			case PowerRailPackage.POWER_RAIL_PORT: return createpowerRailPort();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public powerRailTarget createpowerRailTarget() {
		powerRailTargetImpl powerRailTarget = new powerRailTargetImpl();
		return powerRailTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public powerRailPorts createpowerRailPorts() {
		powerRailPortsImpl powerRailPorts = new powerRailPortsImpl();
		return powerRailPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public powerRailPort createpowerRailPort() {
		powerRailPortImpl powerRailPort = new powerRailPortImpl();
		return powerRailPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerRailPackage getPowerRailPackage() {
		return (PowerRailPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PowerRailPackage getPackage() {
		return PowerRailPackage.eINSTANCE;
	}

} //PowerRailFactoryImpl
