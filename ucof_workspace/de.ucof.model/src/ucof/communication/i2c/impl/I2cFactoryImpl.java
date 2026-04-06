/**
 */
package ucof.communication.i2c.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ucof.communication.i2c.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class I2cFactoryImpl extends EFactoryImpl implements I2cFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static I2cFactory init() {
		try {
			I2cFactory theI2cFactory = (I2cFactory)EPackage.Registry.INSTANCE.getEFactory(I2cPackage.eNS_URI);
			if (theI2cFactory != null) {
				return theI2cFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new I2cFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public I2cFactoryImpl() {
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
			case I2cPackage.I2C_BUS: return createI2CBus();
			case I2cPackage.I2C_MESSAGE: return createI2CMessage();
			case I2cPackage.I2C_REGISTER_SPECIFICATION: return createI2CRegisterSpecification();
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
			case I2cPackage.I2C_BUS_MODE:
				return createI2CBusModeFromString(eDataType, initialValue);
			case I2cPackage.I2C_ADDRESS_MODE:
				return createI2CAddressModeFromString(eDataType, initialValue);
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
			case I2cPackage.I2C_BUS_MODE:
				return convertI2CBusModeToString(eDataType, instanceValue);
			case I2cPackage.I2C_ADDRESS_MODE:
				return convertI2CAddressModeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public I2CBus createI2CBus() {
		I2CBusImpl i2CBus = new I2CBusImpl();
		return i2CBus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public I2CMessage createI2CMessage() {
		I2CMessageImpl i2CMessage = new I2CMessageImpl();
		return i2CMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public I2CRegisterSpecification createI2CRegisterSpecification() {
		I2CRegisterSpecificationImpl i2CRegisterSpecification = new I2CRegisterSpecificationImpl();
		return i2CRegisterSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public I2CBusMode createI2CBusModeFromString(EDataType eDataType, String initialValue) {
		I2CBusMode result = I2CBusMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertI2CBusModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public I2CAddressMode createI2CAddressModeFromString(EDataType eDataType, String initialValue) {
		I2CAddressMode result = I2CAddressMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertI2CAddressModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public I2cPackage getI2cPackage() {
		return (I2cPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static I2cPackage getPackage() {
		return I2cPackage.eINSTANCE;
	}

} //I2cFactoryImpl
