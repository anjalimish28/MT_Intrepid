/**
 */
package ucof.communication.configECIC.streamTypes;

import ucof.common.enums.SingleDirectionType;
import ucof.common.enums.YesNoType;

import ucof.communication.configECIC.packageStrategyTypes.ETHPacketStrategy;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ETH Stream</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.streamTypes.ETHStream#getDirection <em>Direction</em>}</li>
 *   <li>{@link ucof.communication.configECIC.streamTypes.ETHStream#getSampleMaxSizeBytes <em>Sample Max Size Bytes</em>}</li>
 *   <li>{@link ucof.communication.configECIC.streamTypes.ETHStream#getEthPacketStrategy <em>Eth Packet Strategy</em>}</li>
 *   <li>{@link ucof.communication.configECIC.streamTypes.ETHStream#getErrors <em>Errors</em>}</li>
 * </ul>
 *
 * @see ucof.communication.configECIC.streamTypes.StreamTypesPackage#getETHStream()
 * @model
 * @generated
 */
public interface ETHStream extends SuperStreamType {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.SingleDirectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see ucof.common.enums.SingleDirectionType
	 * @see #setDirection(SingleDirectionType)
	 * @see ucof.communication.configECIC.streamTypes.StreamTypesPackage#getETHStream_Direction()
	 * @model
	 * @generated
	 */
	SingleDirectionType getDirection();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.streamTypes.ETHStream#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see ucof.common.enums.SingleDirectionType
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(SingleDirectionType value);

	/**
	 * Returns the value of the '<em><b>Sample Max Size Bytes</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sample Max Size Bytes</em>' attribute.
	 * @see #setSampleMaxSizeBytes(Integer)
	 * @see ucof.communication.configECIC.streamTypes.StreamTypesPackage#getETHStream_SampleMaxSizeBytes()
	 * @model default="0" dataType="ucof.common.edata.PositiveIntType"
	 * @generated
	 */
	Integer getSampleMaxSizeBytes();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.streamTypes.ETHStream#getSampleMaxSizeBytes <em>Sample Max Size Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sample Max Size Bytes</em>' attribute.
	 * @see #getSampleMaxSizeBytes()
	 * @generated
	 */
	void setSampleMaxSizeBytes(Integer value);

	/**
	 * Returns the value of the '<em><b>Eth Packet Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eth Packet Strategy</em>' containment reference.
	 * @see #setEthPacketStrategy(ETHPacketStrategy)
	 * @see ucof.communication.configECIC.streamTypes.StreamTypesPackage#getETHStream_EthPacketStrategy()
	 * @model containment="true"
	 * @generated
	 */
	ETHPacketStrategy getEthPacketStrategy();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.streamTypes.ETHStream#getEthPacketStrategy <em>Eth Packet Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eth Packet Strategy</em>' containment reference.
	 * @see #getEthPacketStrategy()
	 * @generated
	 */
	void setEthPacketStrategy(ETHPacketStrategy value);

	/**
	 * Returns the value of the '<em><b>Errors</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.YesNoType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Errors</em>' attribute.
	 * @see ucof.common.enums.YesNoType
	 * @see #setErrors(YesNoType)
	 * @see ucof.communication.configECIC.streamTypes.StreamTypesPackage#getETHStream_Errors()
	 * @model
	 * @generated
	 */
	YesNoType getErrors();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.streamTypes.ETHStream#getErrors <em>Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Errors</em>' attribute.
	 * @see ucof.common.enums.YesNoType
	 * @see #getErrors()
	 * @generated
	 */
	void setErrors(YesNoType value);

} // ETHStream
