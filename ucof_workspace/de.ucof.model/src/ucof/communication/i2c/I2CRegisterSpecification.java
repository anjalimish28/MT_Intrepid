/**
 */
package ucof.communication.i2c;

import ucof.common.enums.booleanType;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>I2C Register Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes an internal register of an I2C target device. 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.i2c.I2CRegisterSpecification#getRegisterName <em>Register Name</em>}</li>
 *   <li>{@link ucof.communication.i2c.I2CRegisterSpecification#getRegisterPointerAddress <em>Register Pointer Address</em>}</li>
 *   <li>{@link ucof.communication.i2c.I2CRegisterSpecification#getRegisterWidthBits <em>Register Width Bits</em>}</li>
 *   <li>{@link ucof.communication.i2c.I2CRegisterSpecification#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link ucof.communication.i2c.I2CRegisterSpecification#getReadOnly <em>Read Only</em>}</li>
 * </ul>
 *
 * @see ucof.communication.i2c.I2cPackage#getI2CRegisterSpecification()
 * @model
 * @generated
 */
public interface I2CRegisterSpecification extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Register Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human-readable name of the register as per the device datasheet. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Register Name</em>' attribute.
	 * @see #setRegisterName(String)
	 * @see ucof.communication.i2c.I2cPackage#getI2CRegisterSpecification_RegisterName()
	 * @model
	 * @generated
	 */
	String getRegisterName();

	/**
	 * Sets the value of the '{@link ucof.communication.i2c.I2CRegisterSpecification#getRegisterName <em>Register Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register Name</em>' attribute.
	 * @see #getRegisterName()
	 * @generated
	 */
	void setRegisterName(String value);

	/**
	 * Returns the value of the '<em><b>Register Pointer Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Internal register pointer address (the byte written to the target to select which register to read/write). 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Register Pointer Address</em>' attribute.
	 * @see #setRegisterPointerAddress(String)
	 * @see ucof.communication.i2c.I2cPackage#getI2CRegisterSpecification_RegisterPointerAddress()
	 * @model dataType="ucof.common.edata.DecOrHexValueType"
	 * @generated
	 */
	String getRegisterPointerAddress();

	/**
	 * Sets the value of the '{@link ucof.communication.i2c.I2CRegisterSpecification#getRegisterPointerAddress <em>Register Pointer Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register Pointer Address</em>' attribute.
	 * @see #getRegisterPointerAddress()
	 * @generated
	 */
	void setRegisterPointerAddress(String value);

	/**
	 * Returns the value of the '<em><b>Register Width Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Width of the register in bits. UM10204 Section 3.1.5: data is always transferred MSB first in 8-bit bytes. Multi-byte registers use consecutive byte transfers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Register Width Bits</em>' attribute.
	 * @see #setRegisterWidthBits(int)
	 * @see ucof.communication.i2c.I2cPackage#getI2CRegisterSpecification_RegisterWidthBits()
	 * @model
	 * @generated
	 */
	int getRegisterWidthBits();

	/**
	 * Sets the value of the '{@link ucof.communication.i2c.I2CRegisterSpecification#getRegisterWidthBits <em>Register Width Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register Width Bits</em>' attribute.
	 * @see #getRegisterWidthBits()
	 * @generated
	 */
	void setRegisterWidthBits(int value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Power-on reset / default value of the register.  From the I2C target device datasheet, not from UM10204.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see ucof.communication.i2c.I2cPackage#getI2CRegisterSpecification_DefaultValue()
	 * @model dataType="ucof.common.edata.DecOrHexValueType"
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link ucof.communication.i2c.I2CRegisterSpecification#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.booleanType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether this register is read-only from the controller's perspective. ADS1115 Conversion register (0x00): readOnly = true (ADC result).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see ucof.common.enums.booleanType
	 * @see #setReadOnly(booleanType)
	 * @see ucof.communication.i2c.I2cPackage#getI2CRegisterSpecification_ReadOnly()
	 * @model
	 * @generated
	 */
	booleanType getReadOnly();

	/**
	 * Sets the value of the '{@link ucof.communication.i2c.I2CRegisterSpecification#getReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' attribute.
	 * @see ucof.common.enums.booleanType
	 * @see #getReadOnly()
	 * @generated
	 */
	void setReadOnly(booleanType value);

} // I2CRegisterSpecification
