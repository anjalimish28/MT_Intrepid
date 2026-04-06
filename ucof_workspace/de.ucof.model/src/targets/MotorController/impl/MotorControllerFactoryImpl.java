/**
 */
package targets.MotorController.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import targets.MotorController.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MotorControllerFactoryImpl extends EFactoryImpl implements MotorControllerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MotorControllerFactory init() {
		try {
			MotorControllerFactory theMotorControllerFactory = (MotorControllerFactory)EPackage.Registry.INSTANCE.getEFactory(MotorControllerPackage.eNS_URI);
			if (theMotorControllerFactory != null) {
				return theMotorControllerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MotorControllerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotorControllerFactoryImpl() {
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
			case MotorControllerPackage.ESCON409510: return createescon409510();
			case MotorControllerPackage.ESCON_PORTS: return createesconPorts();
			case MotorControllerPackage.ESCON_PORT: return createesconPort();
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
	public MotorControllerPackage getMotorControllerPackage() {
		return (MotorControllerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MotorControllerPackage getPackage() {
		return MotorControllerPackage.eINSTANCE;
	}

} //MotorControllerFactoryImpl
