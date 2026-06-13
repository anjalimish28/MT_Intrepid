/**
 */
package targets.sheild.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import targets.sheild.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SheildFactoryImpl extends EFactoryImpl implements SheildFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SheildFactory init() {
		try {
			SheildFactory theSheildFactory = (SheildFactory)EPackage.Registry.INSTANCE.getEFactory(SheildPackage.eNS_URI);
			if (theSheildFactory != null) {
				return theSheildFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SheildFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SheildFactoryImpl() {
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
			case SheildPackage.ARDUINOSHEILD: return createarduinosheild();
			case SheildPackage.SHEILD_PORTS: return createsheildPorts();
			case SheildPackage.SHEILD_PORT: return createsheildPort();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public arduinosheild createarduinosheild() {
		arduinosheildImpl arduinosheild = new arduinosheildImpl();
		return arduinosheild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sheildPorts createsheildPorts() {
		sheildPortsImpl sheildPorts = new sheildPortsImpl();
		return sheildPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sheildPort createsheildPort() {
		sheildPortImpl sheildPort = new sheildPortImpl();
		return sheildPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SheildPackage getSheildPackage() {
		return (SheildPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SheildPackage getPackage() {
		return SheildPackage.eINSTANCE;
	}

} //SheildFactoryImpl
