/**
 */
package targets.tricore299a653p4.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import targets.tricore299a653p4.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Tricore299a653p4FactoryImpl extends EFactoryImpl implements Tricore299a653p4Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Tricore299a653p4Factory init() {
		try {
			Tricore299a653p4Factory theTricore299a653p4Factory = (Tricore299a653p4Factory)EPackage.Registry.INSTANCE.getEFactory(Tricore299a653p4Package.eNS_URI);
			if (theTricore299a653p4Factory != null) {
				return theTricore299a653p4Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Tricore299a653p4FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tricore299a653p4FactoryImpl() {
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
			case Tricore299a653p4Package.TRI_CORE299: return createTriCore299();
			case Tricore299a653p4Package.A825_DRIVER_CONFIGURATION: return createA825DriverConfiguration();
			case Tricore299a653p4Package.MESSAGE_POST_BOX_SPECIFIER: return createMessagePostBoxSpecifier();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriCore299 createTriCore299() {
		TriCore299Impl triCore299 = new TriCore299Impl();
		return triCore299;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A825DriverConfiguration createA825DriverConfiguration() {
		A825DriverConfigurationImpl a825DriverConfiguration = new A825DriverConfigurationImpl();
		return a825DriverConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessagePostBoxSpecifier createMessagePostBoxSpecifier() {
		MessagePostBoxSpecifierImpl messagePostBoxSpecifier = new MessagePostBoxSpecifierImpl();
		return messagePostBoxSpecifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tricore299a653p4Package getTricore299a653p4Package() {
		return (Tricore299a653p4Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Tricore299a653p4Package getPackage() {
		return Tricore299a653p4Package.eINSTANCE;
	}

} //Tricore299a653p4FactoryImpl
