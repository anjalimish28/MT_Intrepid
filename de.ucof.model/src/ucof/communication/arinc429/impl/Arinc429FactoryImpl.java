/**
 */
package ucof.communication.arinc429.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ucof.communication.arinc429.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Arinc429FactoryImpl extends EFactoryImpl implements Arinc429Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Arinc429Factory init() {
		try {
			Arinc429Factory theArinc429Factory = (Arinc429Factory)EPackage.Registry.INSTANCE.getEFactory(Arinc429Package.eNS_URI);
			if (theArinc429Factory != null) {
				return theArinc429Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Arinc429FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arinc429FactoryImpl() {
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
			case Arinc429Package.A429_BUS: return createA429Bus();
			case Arinc429Package.A429_MESSAGE: return createA429Message();
			case Arinc429Package.A429_SIGNAL_SPECIFICATION: return createA429SignalSpecification();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Arinc429Package.PARITY_TYPES:
				return createParityTypesFromString(eDataType, initialValue);
			case Arinc429Package.CODING_TYPES:
				return createCodingTypesFromString(eDataType, initialValue);
			case Arinc429Package.SSM_TYPES:
				return createSSMTypesFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Arinc429Package.PARITY_TYPES:
				return convertParityTypesToString(eDataType, instanceValue);
			case Arinc429Package.CODING_TYPES:
				return convertCodingTypesToString(eDataType, instanceValue);
			case Arinc429Package.SSM_TYPES:
				return convertSSMTypesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A429Bus createA429Bus() {
		A429BusImpl a429Bus = new A429BusImpl();
		return a429Bus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A429Message createA429Message() {
		A429MessageImpl a429Message = new A429MessageImpl();
		return a429Message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A429SignalSpecification createA429SignalSpecification() {
		A429SignalSpecificationImpl a429SignalSpecification = new A429SignalSpecificationImpl();
		return a429SignalSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParityTypes createParityTypesFromString(EDataType eDataType, String initialValue) {
		ParityTypes result = ParityTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParityTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodingTypes createCodingTypesFromString(EDataType eDataType, String initialValue) {
		CodingTypes result = CodingTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodingTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSMTypes createSSMTypesFromString(EDataType eDataType, String initialValue) {
		SSMTypes result = SSMTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSSMTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arinc429Package getArinc429Package() {
		return (Arinc429Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Arinc429Package getPackage() {
		return Arinc429Package.eINSTANCE;
	}

} //Arinc429FactoryImpl
