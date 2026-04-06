/**
 */
package ucof.communication.basedonethernet.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ucof.communication.basedonethernet.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasedonethernetFactoryImpl extends EFactoryImpl implements BasedonethernetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasedonethernetFactory init() {
		try {
			BasedonethernetFactory theBasedonethernetFactory = (BasedonethernetFactory)EPackage.Registry.INSTANCE.getEFactory(BasedonethernetPackage.eNS_URI);
			if (theBasedonethernetFactory != null) {
				return theBasedonethernetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BasedonethernetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasedonethernetFactoryImpl() {
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
			case BasedonethernetPackage.ETHERNET_PORT: return createEthernetPort();
			case BasedonethernetPackage.ETHERNET_TX: return createEthernetTX();
			case BasedonethernetPackage.ETHERNET_RX: return createEthernetRX();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EthernetPort createEthernetPort() {
		EthernetPortImpl ethernetPort = new EthernetPortImpl();
		return ethernetPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EthernetTX createEthernetTX() {
		EthernetTXImpl ethernetTX = new EthernetTXImpl();
		return ethernetTX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EthernetRX createEthernetRX() {
		EthernetRXImpl ethernetRX = new EthernetRXImpl();
		return ethernetRX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasedonethernetPackage getBasedonethernetPackage() {
		return (BasedonethernetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BasedonethernetPackage getPackage() {
		return BasedonethernetPackage.eINSTANCE;
	}

} //BasedonethernetFactoryImpl
