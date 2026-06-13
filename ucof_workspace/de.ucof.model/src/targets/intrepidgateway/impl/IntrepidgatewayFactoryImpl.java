/**
 */
package targets.intrepidgateway.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import targets.intrepidgateway.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntrepidgatewayFactoryImpl extends EFactoryImpl implements IntrepidgatewayFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntrepidgatewayFactory init() {
		try {
			IntrepidgatewayFactory theIntrepidgatewayFactory = (IntrepidgatewayFactory)EPackage.Registry.INSTANCE.getEFactory(IntrepidgatewayPackage.eNS_URI);
			if (theIntrepidgatewayFactory != null) {
				return theIntrepidgatewayFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntrepidgatewayFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntrepidgatewayFactoryImpl() {
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
			case IntrepidgatewayPackage.MSG_BOX_EXTENSION: return createMsgBoxExtension();
			case IntrepidgatewayPackage.CAN_MAILBOX_ADDRESS_FILTER: return createCanMailboxAddressFilter();
			case IntrepidgatewayPackage.CAN_MAILBOX_OUT_SLOT: return createCanMailboxOutSlot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MsgBoxExtension createMsgBoxExtension() {
		MsgBoxExtensionImpl msgBoxExtension = new MsgBoxExtensionImpl();
		return msgBoxExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanMailboxAddressFilter createCanMailboxAddressFilter() {
		CanMailboxAddressFilterImpl canMailboxAddressFilter = new CanMailboxAddressFilterImpl();
		return canMailboxAddressFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanMailboxOutSlot createCanMailboxOutSlot() {
		CanMailboxOutSlotImpl canMailboxOutSlot = new CanMailboxOutSlotImpl();
		return canMailboxOutSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntrepidgatewayPackage getIntrepidgatewayPackage() {
		return (IntrepidgatewayPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IntrepidgatewayPackage getPackage() {
		return IntrepidgatewayPackage.eINSTANCE;
	}

} //IntrepidgatewayFactoryImpl
