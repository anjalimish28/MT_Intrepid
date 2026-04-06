/**
 */
package targets.CCDPU.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import targets.CCDPU.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CCDPUFactoryImpl extends EFactoryImpl implements CCDPUFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CCDPUFactory init() {
		try {
			CCDPUFactory theCCDPUFactory = (CCDPUFactory)EPackage.Registry.INSTANCE.getEFactory(CCDPUPackage.eNS_URI);
			if (theCCDPUFactory != null) {
				return theCCDPUFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CCDPUFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CCDPUFactoryImpl() {
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
			case CCDPUPackage.VA41620PEB1: return createva41620peb1();
			case CCDPUPackage.VORAGO_PORTS: return createvoragoPorts();
			case CCDPUPackage.VORAGO_PORT: return createvoragoPort();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public va41620peb1 createva41620peb1() {
		va41620peb1Impl va41620peb1 = new va41620peb1Impl();
		return va41620peb1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public voragoPorts createvoragoPorts() {
		voragoPortsImpl voragoPorts = new voragoPortsImpl();
		return voragoPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public voragoPort createvoragoPort() {
		voragoPortImpl voragoPort = new voragoPortImpl();
		return voragoPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CCDPUPackage getCCDPUPackage() {
		return (CCDPUPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CCDPUPackage getPackage() {
		return CCDPUPackage.eINSTANCE;
	}

} //CCDPUFactoryImpl
