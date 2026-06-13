/**
 */
package targets.rdc.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import targets.rdc.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RdcFactoryImpl extends EFactoryImpl implements RdcFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RdcFactory init() {
		try {
			RdcFactory theRdcFactory = (RdcFactory)EPackage.Registry.INSTANCE.getEFactory(RdcPackage.eNS_URI);
			if (theRdcFactory != null) {
				return theRdcFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RdcFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdcFactoryImpl() {
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
			case RdcPackage.STM32F446RE: return createstm32f446re();
			case RdcPackage.STM_TIMING_CONFIG: return createstmTimingConfig();
			case RdcPackage.STM_PORTS: return createstmPorts();
			case RdcPackage.STM_PORT: return createstmPort();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public stm32f446re createstm32f446re() {
		stm32f446reImpl stm32f446re = new stm32f446reImpl();
		return stm32f446re;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public stmTimingConfig createstmTimingConfig() {
		stmTimingConfigImpl stmTimingConfig = new stmTimingConfigImpl();
		return stmTimingConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public stmPorts createstmPorts() {
		stmPortsImpl stmPorts = new stmPortsImpl();
		return stmPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public stmPort createstmPort() {
		stmPortImpl stmPort = new stmPortImpl();
		return stmPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdcPackage getRdcPackage() {
		return (RdcPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RdcPackage getPackage() {
		return RdcPackage.eINSTANCE;
	}

} //RdcFactoryImpl
