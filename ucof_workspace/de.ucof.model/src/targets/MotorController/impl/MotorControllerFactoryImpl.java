/**
 */
package targets.motorcontroller.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import targets.motorcontroller.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MotorcontrollerFactoryImpl extends EFactoryImpl implements MotorcontrollerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MotorcontrollerFactory init() {
		try {
			MotorcontrollerFactory theMotorcontrollerFactory = (MotorcontrollerFactory)EPackage.Registry.INSTANCE.getEFactory(MotorcontrollerPackage.eNS_URI);
			if (theMotorcontrollerFactory != null) {
				return theMotorcontrollerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MotorcontrollerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotorcontrollerFactoryImpl() {
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
			case MotorcontrollerPackage.ESCON409510: return createescon409510();
			case MotorcontrollerPackage.ESCON_PORTS: return createesconPorts();
			case MotorcontrollerPackage.ESCON_PORT: return createesconPort();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public escon409510 createescon409510() {
		escon409510Impl escon409510 = new escon409510Impl();
		return escon409510;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public esconPorts createesconPorts() {
		esconPortsImpl esconPorts = new esconPortsImpl();
		return esconPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public esconPort createesconPort() {
		esconPortImpl esconPort = new esconPortImpl();
		return esconPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotorcontrollerPackage getMotorcontrollerPackage() {
		return (MotorcontrollerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MotorcontrollerPackage getPackage() {
		return MotorcontrollerPackage.eINSTANCE;
	}

} //MotorcontrollerFactoryImpl
