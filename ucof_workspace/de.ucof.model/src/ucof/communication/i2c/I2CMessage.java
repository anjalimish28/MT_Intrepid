/**
 */
package ucof.communication.i2c;

import ucof.common.enums.SingleDirectionType;
import ucof.common.enums.booleanType;

import ucof.communication.SuperMessageType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>I2C Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * One I2C transaction: [START][target address + R/W bit][data bytes][STOP]. UM10204 Rev.7.0, Section 3.1.10, Figure 9. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.i2c.I2CMessage#getTargetAddress <em>Target Address</em>}</li>
 *   <li>{@link ucof.communication.i2c.I2CMessage#getDirection <em>Direction</em>}</li>
 *   <li>{@link ucof.communication.i2c.I2CMessage#getDataLengthBytes <em>Data Length Bytes</em>}</li>
 *   <li>{@link ucof.communication.i2c.I2CMessage#getRepeatedStart <em>Repeated Start</em>}</li>
 *   <li>{@link ucof.communication.i2c.I2CMessage#getRegisterPointerByte <em>Register Pointer Byte</em>}</li>
 *   <li>{@link ucof.communication.i2c.I2CMessage#getRegisterSpecification <em>Register Specification</em>}</li>
 * </ul>
 *
 * @see ucof.communication.i2c.I2cPackage#getI2CMessage()
 * @model
 * @generated
 */
public interface I2CMessage extends SuperMessageType {
	/**
	 * Returns the value of the '<em><b>Target Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * I2C target (slave) address. UM10204 Section 3.1.10.  For 7-bit mode: values 0x00-0x7F (0000 XXX and 1111 XXX are reserved).  For 10-bit mode: first byte prefix is 1111 0XX.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Address</em>' attribute.
	 * @see #setTargetAddress(String)
	 * @see ucof.communication.i2c.I2cPackage#getI2CMessage_TargetAddress()
	 * @model dataType="ucof.common.edata.IdentifierValueType"
	 * @generated
	 */
	String getTargetAddress();

	/**
	 * Sets the value of the '{@link ucof.communication.i2c.I2CMessage#getTargetAddress <em>Target Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Address</em>' attribute.
	 * @see #getTargetAddress()
	 * @generated
	 */
	void setTargetAddress(String value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.SingleDirectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transaction direction (R/W bit). UM10204 Section 3.1.10.  Out (WRITE, R/W=0): controller sends data bytes to target. In  (READ,  R/W=1): controller receives data bytes from target. In UltraFast mode: ONLY Out is valid (unidirectional bus, Section 3.2). 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see ucof.common.enums.SingleDirectionType
	 * @see #setDirection(SingleDirectionType)
	 * @see ucof.communication.i2c.I2cPackage#getI2CMessage_Direction()
	 * @model
	 * @generated
	 */
	SingleDirectionType getDirection();

	/**
	 * Sets the value of the '{@link ucof.communication.i2c.I2CMessage#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see ucof.common.enums.SingleDirectionType
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(SingleDirectionType value);

	/**
	 * Returns the value of the '<em><b>Data Length Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of data bytes in the data phase of this transaction. UM10204 Section 3.1.5: unrestricted number of bytes,  each followed by an ACK/NACK bit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Length Bytes</em>' attribute.
	 * @see #setDataLengthBytes(Integer)
	 * @see ucof.communication.i2c.I2cPackage#getI2CMessage_DataLengthBytes()
	 * @model dataType="ucof.common.edata.PositiveIntType"
	 * @generated
	 */
	Integer getDataLengthBytes();

	/**
	 * Sets the value of the '{@link ucof.communication.i2c.I2CMessage#getDataLengthBytes <em>Data Length Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Length Bytes</em>' attribute.
	 * @see #getDataLengthBytes()
	 * @generated
	 */
	void setDataLengthBytes(Integer value);

	/**
	 * Returns the value of the '<em><b>Repeated Start</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.booleanType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether this transaction uses a Repeated START (Sr) condition.  UM10204 Section 3.1.10, Figure 13 (Combined format). When true: transaction is [S][addr+W][register pointer][Sr][addr+R][data][P].  This models a combined write-pointer-then-read, which is the standard method for reading a specific register from an I2C target.  When false: transaction ends with a STOP condition after the data phase. Not applicable to UltraFast mode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repeated Start</em>' attribute.
	 * @see ucof.common.enums.booleanType
	 * @see #setRepeatedStart(booleanType)
	 * @see ucof.communication.i2c.I2cPackage#getI2CMessage_RepeatedStart()
	 * @model
	 * @generated
	 */
	booleanType getRepeatedStart();

	/**
	 * Sets the value of the '{@link ucof.communication.i2c.I2CMessage#getRepeatedStart <em>Repeated Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeated Start</em>' attribute.
	 * @see ucof.common.enums.booleanType
	 * @see #getRepeatedStart()
	 * @generated
	 */
	void setRepeatedStart(booleanType value);

	/**
	 * Returns the value of the '<em><b>Register Pointer Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Internal register pointer byte written to the target before a repeated START.  Only relevant when repeatedStart=true. UM10204 Figure 13: in a combined format transaction, the controller  first writes this byte (the register sub-address) then issues Sr and reads the register content. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Register Pointer Byte</em>' attribute.
	 * @see #setRegisterPointerByte(String)
	 * @see ucof.communication.i2c.I2cPackage#getI2CMessage_RegisterPointerByte()
	 * @model dataType="ucof.common.edata.DecOrHexValueType"
	 * @generated
	 */
	String getRegisterPointerByte();

	/**
	 * Sets the value of the '{@link ucof.communication.i2c.I2CMessage#getRegisterPointerByte <em>Register Pointer Byte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register Pointer Byte</em>' attribute.
	 * @see #getRegisterPointerByte()
	 * @generated
	 */
	void setRegisterPointerByte(String value);

	/**
	 * Returns the value of the '<em><b>Register Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional register-level specification for the target register  accessed by this transaction. Used for driver code generation and documentation. Contains register name, width, default value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Register Specification</em>' containment reference.
	 * @see #setRegisterSpecification(I2CRegisterSpecification)
	 * @see ucof.communication.i2c.I2cPackage#getI2CMessage_RegisterSpecification()
	 * @model containment="true"
	 * @generated
	 */
	I2CRegisterSpecification getRegisterSpecification();

	/**
	 * Sets the value of the '{@link ucof.communication.i2c.I2CMessage#getRegisterSpecification <em>Register Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register Specification</em>' containment reference.
	 * @see #getRegisterSpecification()
	 * @generated
	 */
	void setRegisterSpecification(I2CRegisterSpecification value);

} // I2CMessage
