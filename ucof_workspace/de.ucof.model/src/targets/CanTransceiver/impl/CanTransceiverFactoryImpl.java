/**
 */
package targets.CanTransceiver.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import targets.CanTransceiver.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CanTransceiverFactoryImpl extends EFactoryImpl implements CanTransceiverFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CanTransceiverFactory init() {
		try {
			CanTransceiverFactory theCanTransceiverFactory = (CanTransceiverFactory)EPackage.Registry.INSTANCE.getEFactory(CanTransceiverPackage.eNS_URI);
			if (theCanTransceiverFactory != null) {
				return theCanTransceiverFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CanTransceiverFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanTransceiverFactoryImpl() {
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
			case CanTransceiverPackage.SN65HVD230: return createsn65hvd230();
			case CanTransceiverPackage.CAN_TRANSCEIVER_PORTS: return createcanTransceiverPorts();
			case CanTransceiverPackage.CAN_TRANSCEIVER_PORT: return createcanTransceiverPort();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sn65hvd230 createsn65hvd230() {
		sn65hvd230Impl sn65hvd230 = new sn65hvd230Impl();
		return sn65hvd230;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public canTransceiverPorts createcanTransceiverPorts() {
		canTransceiverPortsImpl canTransceiverPorts = new canTransceiverPortsImpl();
		return canTransceiverPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public canTransceiverPort createcanTransceiverPort() {
		canTransceiverPortImpl canTransceiverPort = new canTransceiverPortImpl();
		return canTransceiverPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanTransceiverPackage getCanTransceiverPackage() {
		return (CanTransceiverPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CanTransceiverPackage getPackage() {
		return CanTransceiverPackage.eINSTANCE;
	}

} //CanTransceiverFactoryImpl
