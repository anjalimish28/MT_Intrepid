/**
 */
package targets.configdesk.ethernet.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import targets.configdesk.ethernet.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EthernetFactoryImpl extends EFactoryImpl implements EthernetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EthernetFactory init() {
		try {
			EthernetFactory theEthernetFactory = (EthernetFactory)EPackage.Registry.INSTANCE.getEFactory(EthernetPackage.eNS_URI);
			if (theEthernetFactory != null) {
				return theEthernetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EthernetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EthernetFactoryImpl() {
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
			case EthernetPackage.ETH_SETUP: return createETHSetup();
			case EthernetPackage.UDPTX: return createUDPTX();
			case EthernetPackage.UDPRX: return createUDPRX();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETHSetup createETHSetup() {
		ETHSetupImpl ethSetup = new ETHSetupImpl();
		return ethSetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UDPTX createUDPTX() {
		UDPTXImpl udptx = new UDPTXImpl();
		return udptx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UDPRX createUDPRX() {
		UDPRXImpl udprx = new UDPRXImpl();
		return udprx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EthernetPackage getEthernetPackage() {
		return (EthernetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EthernetPackage getPackage() {
		return EthernetPackage.eINSTANCE;
	}

} //EthernetFactoryImpl
