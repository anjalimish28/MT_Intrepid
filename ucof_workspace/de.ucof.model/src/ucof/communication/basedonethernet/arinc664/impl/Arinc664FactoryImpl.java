/**
 */
package ucof.communication.basedonethernet.arinc664.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ucof.communication.basedonethernet.arinc664.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Arinc664FactoryImpl extends EFactoryImpl implements Arinc664Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Arinc664Factory init() {
		try {
			Arinc664Factory theArinc664Factory = (Arinc664Factory)EPackage.Registry.INSTANCE.getEFactory(Arinc664Package.eNS_URI);
			if (theArinc664Factory != null) {
				return theArinc664Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Arinc664FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arinc664FactoryImpl() {
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
			case Arinc664Package.A664_BUS: return createA664Bus();
			case Arinc664Package.A664_VIRTUAL_LINK_IN: return createA664VirtualLinkIn();
			case Arinc664Package.A664_VIRTUAL_LINK_OUT: return createA664VirtualLinkOut();
			case Arinc664Package.A664_MESSAGE: return createA664Message();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A664Bus createA664Bus() {
		A664BusImpl a664Bus = new A664BusImpl();
		return a664Bus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A664VirtualLinkIn createA664VirtualLinkIn() {
		A664VirtualLinkInImpl a664VirtualLinkIn = new A664VirtualLinkInImpl();
		return a664VirtualLinkIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A664VirtualLinkOut createA664VirtualLinkOut() {
		A664VirtualLinkOutImpl a664VirtualLinkOut = new A664VirtualLinkOutImpl();
		return a664VirtualLinkOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A664Message createA664Message() {
		A664MessageImpl a664Message = new A664MessageImpl();
		return a664Message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arinc664Package getArinc664Package() {
		return (Arinc664Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Arinc664Package getPackage() {
		return Arinc664Package.eINSTANCE;
	}

} //Arinc664FactoryImpl
