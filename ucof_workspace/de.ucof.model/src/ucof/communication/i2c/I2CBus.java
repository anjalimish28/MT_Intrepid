/**
 */
package ucof.communication.i2c;

import ucof.common.enums.booleanType;

import ucof.communication.SuperCommunicationInterfaceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>I2C Bus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * I2C bus interface. Two wires: SDA (serial data) and SCL (serial clock). Open-drain bidirectional (except UltraFast which is push-pull).  All connected devices share the same SDA and SCL lines. UM10204 Rev.7.0 Section 3.1.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.i2c.I2CBus#getBusMode <em>Bus Mode</em>}</li>
 *   <li>{@link ucof.communication.i2c.I2CBus#getAddressMode <em>Address Mode</em>}</li>
 *   <li>{@link ucof.communication.i2c.I2CBus#getPullUpResistanceOhm <em>Pull Up Resistance Ohm</em>}</li>
 *   <li>{@link ucof.communication.i2c.I2CBus#getClockStretchingEnabled <em>Clock Stretching Enabled</em>}</li>
 *   <li>{@link ucof.communication.i2c.I2CBus#getMultiControllerEnabled <em>Multi Controller Enabled</em>}</li>
 * </ul>
 *
 * @see ucof.communication.i2c.I2cPackage#getI2CBus()
 * @model
 * @generated
 */
public interface I2CBus extends SuperCommunicationInterfaceType {
	/**
	 * Returns the value of the '<em><b>Bus Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.communication.i2c.I2CBusMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Operating speed mode of the bus. UM10204 Section 5.  Standard (100k), Fast (400k), FastModePlus (1M), HighSpeed (3.4M), UltraFast (5M, write-only).  ADS1115 maximum: FastMode (400 kbps).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bus Mode</em>' attribute.
	 * @see ucof.communication.i2c.I2CBusMode
	 * @see #setBusMode(I2CBusMode)
	 * @see ucof.communication.i2c.I2cPackage#getI2CBus_BusMode()
	 * @model
	 * @generated
	 */
	I2CBusMode getBusMode();

	/**
	 * Sets the value of the '{@link ucof.communication.i2c.I2CBus#getBusMode <em>Bus Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Mode</em>' attribute.
	 * @see ucof.communication.i2c.I2CBusMode
	 * @see #getBusMode()
	 * @generated
	 */
	void setBusMode(I2CBusMode value);

	/**
	 * Returns the value of the '<em><b>Address Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.communication.i2c.I2CAddressMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target address width on this bus. UM10204 Sections 3.1.10-3.1.11.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Mode</em>' attribute.
	 * @see ucof.communication.i2c.I2CAddressMode
	 * @see #setAddressMode(I2CAddressMode)
	 * @see ucof.communication.i2c.I2cPackage#getI2CBus_AddressMode()
	 * @model
	 * @generated
	 */
	I2CAddressMode getAddressMode();

	/**
	 * Sets the value of the '{@link ucof.communication.i2c.I2CBus#getAddressMode <em>Address Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Mode</em>' attribute.
	 * @see ucof.communication.i2c.I2CAddressMode
	 * @see #getAddressMode()
	 * @generated
	 */
	void setAddressMode(I2CAddressMode value);

	/**
	 * Returns the value of the '<em><b>Pull Up Resistance Ohm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pull-up resistor value in Ohms for SDA and SCL lines. UM10204 Section 3.1.1: both SDA and SCL require one pull-up resistor per line (not per device) connected to VDD. Typical values: 1000-10000 Ohms.  Higher resistance: slower rise time, lower max speed. Lower resistance: faster communication, higher power consumption. For FastMode (400kbps): recommend 2200-4700 Ohms.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pull Up Resistance Ohm</em>' attribute.
	 * @see #setPullUpResistanceOhm(Integer)
	 * @see ucof.communication.i2c.I2cPackage#getI2CBus_PullUpResistanceOhm()
	 * @model dataType="ucof.common.edata.PositiveIntType"
	 * @generated
	 */
	Integer getPullUpResistanceOhm();

	/**
	 * Sets the value of the '{@link ucof.communication.i2c.I2CBus#getPullUpResistanceOhm <em>Pull Up Resistance Ohm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pull Up Resistance Ohm</em>' attribute.
	 * @see #getPullUpResistanceOhm()
	 * @generated
	 */
	void setPullUpResistanceOhm(Integer value);

	/**
	 * Returns the value of the '<em><b>Clock Stretching Enabled</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.booleanType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether clock stretching is used on this bus. UM10204 Section 3.1.9: a target may hold SCL LOW to force the controller into a wait state until the target is ready. This is optional; not all targets implement it. Not possible in UltraFast mode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clock Stretching Enabled</em>' attribute.
	 * @see ucof.common.enums.booleanType
	 * @see #setClockStretchingEnabled(booleanType)
	 * @see ucof.communication.i2c.I2cPackage#getI2CBus_ClockStretchingEnabled()
	 * @model
	 * @generated
	 */
	booleanType getClockStretchingEnabled();

	/**
	 * Sets the value of the '{@link ucof.communication.i2c.I2CBus#getClockStretchingEnabled <em>Clock Stretching Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Stretching Enabled</em>' attribute.
	 * @see ucof.common.enums.booleanType
	 * @see #getClockStretchingEnabled()
	 * @generated
	 */
	void setClockStretchingEnabled(booleanType value);

	/**
	 * Returns the value of the '<em><b>Multi Controller Enabled</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.booleanType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether multiple controllers share this bus. UM10204 Section 3.1.8: arbitration procedure prevents data corruption when two controllers simultaneously try to control the bus. Must be false for UltraFast mode (Section 3.2, p.22): push-pull outputs cause bus contention with multiple controllers. Typical embedded use (single MCU as controller): false.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multi Controller Enabled</em>' attribute.
	 * @see ucof.common.enums.booleanType
	 * @see #setMultiControllerEnabled(booleanType)
	 * @see ucof.communication.i2c.I2cPackage#getI2CBus_MultiControllerEnabled()
	 * @model
	 * @generated
	 */
	booleanType getMultiControllerEnabled();

	/**
	 * Sets the value of the '{@link ucof.communication.i2c.I2CBus#getMultiControllerEnabled <em>Multi Controller Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Controller Enabled</em>' attribute.
	 * @see ucof.common.enums.booleanType
	 * @see #getMultiControllerEnabled()
	 * @generated
	 */
	void setMultiControllerEnabled(booleanType value);

} // I2CBus
