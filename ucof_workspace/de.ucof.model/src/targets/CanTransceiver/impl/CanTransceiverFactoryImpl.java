/**
 */
package targets.cantransceiver.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import targets.cantransceiver.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CantransceiverFactoryImpl extends EFactoryImpl implements CantransceiverFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CantransceiverFactory init() {
		try {
			CantransceiverFactory theCantransceiverFactory = (CantransceiverFactory)EPackage.Registry.INSTANCE.getEFactory(CantransceiverPackage.eNS_URI);
			if (theCantransceiverFactory != null) {
				return theCantransceiverFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CantransceiverFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CantransceiverFactoryImpl() {
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
			case CantransceiverPackage.SN65HVD230: return createsn65hvd230();
			case CantransceiverPackage.CAN_TRANSCEIVER_PORTS: return createcanTransceiverPorts();
			case CantransceiverPackage.CAN_TRANSCEIVER_PORT: return createcanTransceiverPort();
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
	public CantransceiverPackage getCantransceiverPackage() {
		return (CantransceiverPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CantransceiverPackage getPackage() {
		return CantransceiverPackage.eINSTANCE;
	}

} //CantransceiverFactoryImpl
