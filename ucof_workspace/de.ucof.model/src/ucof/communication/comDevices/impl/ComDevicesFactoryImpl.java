/**
 */
package ucof.communication.comDevices.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ucof.communication.comDevices.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComDevicesFactoryImpl extends EFactoryImpl implements ComDevicesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComDevicesFactory init() {
		try {
			ComDevicesFactory theComDevicesFactory = (ComDevicesFactory)EPackage.Registry.INSTANCE.getEFactory(ComDevicesPackage.eNS_URI);
			if (theComDevicesFactory != null) {
				return theComDevicesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComDevicesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComDevicesFactoryImpl() {
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
			case ComDevicesPackage.COMMUNICATION_DEVICES: return createCommunicationDevices();
			case ComDevicesPackage.ED247_GATEWAY: return createED247Gateway();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationDevices createCommunicationDevices() {
		CommunicationDevicesImpl communicationDevices = new CommunicationDevicesImpl();
		return communicationDevices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ED247Gateway createED247Gateway() {
		ED247GatewayImpl ed247Gateway = new ED247GatewayImpl();
		return ed247Gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComDevicesPackage getComDevicesPackage() {
		return (ComDevicesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComDevicesPackage getPackage() {
		return ComDevicesPackage.eINSTANCE;
	}

} //ComDevicesFactoryImpl
