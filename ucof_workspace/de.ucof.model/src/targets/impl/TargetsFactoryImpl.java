/**
 */
package targets.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import targets.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TargetsFactoryImpl extends EFactoryImpl implements TargetsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TargetsFactory init() {
		try {
			TargetsFactory theTargetsFactory = (TargetsFactory)EPackage.Registry.INSTANCE.getEFactory(TargetsPackage.eNS_URI);
			if (theTargetsFactory != null) {
				return theTargetsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TargetsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetsFactoryImpl() {
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
			case TargetsPackage.TARGETS: return createTargets();
			case TargetsPackage.ATTRIBUTE_DATATYPE_CONVERSION: return createAttributeDatatypeConversion();
			case TargetsPackage.RESISTOR_INFO: return createResistorInfo();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Targets createTargets() {
		TargetsImpl targets = new TargetsImpl();
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDatatypeConversion createAttributeDatatypeConversion() {
		AttributeDatatypeConversionImpl attributeDatatypeConversion = new AttributeDatatypeConversionImpl();
		return attributeDatatypeConversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResistorInfo createResistorInfo() {
		ResistorInfoImpl resistorInfo = new ResistorInfoImpl();
		return resistorInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetsPackage getTargetsPackage() {
		return (TargetsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TargetsPackage getPackage() {
		return TargetsPackage.eINSTANCE;
	}

} //TargetsFactoryImpl
