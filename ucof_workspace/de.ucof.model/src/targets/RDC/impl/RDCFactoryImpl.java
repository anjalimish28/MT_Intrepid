/**
 */
package targets.RDC.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import targets.RDC.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RDCFactoryImpl extends EFactoryImpl implements RDCFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RDCFactory init() {
		try {
			RDCFactory theRDCFactory = (RDCFactory)EPackage.Registry.INSTANCE.getEFactory(RDCPackage.eNS_URI);
			if (theRDCFactory != null) {
				return theRDCFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RDCFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDCFactoryImpl() {
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
			case RDCPackage.STM32F446RE: return createstm32f446re();
			case RDCPackage.STM_PORTS: return createstmPorts();
			case RDCPackage.STM_PORT: return createstmPort();
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
	public RDCPackage getRDCPackage() {
		return (RDCPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RDCPackage getPackage() {
		return RDCPackage.eINSTANCE;
	}

} //RDCFactoryImpl
