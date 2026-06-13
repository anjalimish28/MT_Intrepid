/**
 */
package targets.configdesk.wired.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import targets.configdesk.wired.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WiredFactoryImpl extends EFactoryImpl implements WiredFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WiredFactory init() {
		try {
			WiredFactory theWiredFactory = (WiredFactory)EPackage.Registry.INSTANCE.getEFactory(WiredPackage.eNS_URI);
			if (theWiredFactory != null) {
				return theWiredFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WiredFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiredFactoryImpl() {
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
			case WiredPackage.ANALOGUES: return createAnalogues();
			case WiredPackage.ANALOGUE: return createAnalogue();
			case WiredPackage.DIGITALS: return createDigitals();
			case WiredPackage.DIGITAL: return createDigital();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Analogues createAnalogues() {
		AnaloguesImpl analogues = new AnaloguesImpl();
		return analogues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Analogue createAnalogue() {
		AnalogueImpl analogue = new AnalogueImpl();
		return analogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Digitals createDigitals() {
		DigitalsImpl digitals = new DigitalsImpl();
		return digitals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Digital createDigital() {
		DigitalImpl digital = new DigitalImpl();
		return digital;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiredPackage getWiredPackage() {
		return (WiredPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WiredPackage getPackage() {
		return WiredPackage.eINSTANCE;
	}

} //WiredFactoryImpl
