/**
 */
package ucof.communication.configECIC.streamTypes;

import ucof.common.enums.SingleDirectionType;

import ucof.communication.configECIC.packageStrategyTypes.DISPacketStrategy;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DIS Stream</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.streamTypes.DISStream#getDirection <em>Direction</em>}</li>
 *   <li>{@link ucof.communication.configECIC.streamTypes.DISStream#getSampleMaxSizeBytes <em>Sample Max Size Bytes</em>}</li>
 *   <li>{@link ucof.communication.configECIC.streamTypes.DISStream#getDisPacketStrategy <em>Dis Packet Strategy</em>}</li>
 * </ul>
 *
 * @see ucof.communication.configECIC.streamTypes.StreamTypesPackage#getDISStream()
 * @model
 * @generated
 */
public interface DISStream extends SuperStreamType {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.SingleDirectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see ucof.common.enums.SingleDirectionType
	 * @see #setDirection(SingleDirectionType)
	 * @see ucof.communication.configECIC.streamTypes.StreamTypesPackage#getDISStream_Direction()
	 * @model
	 * @generated
	 */
	SingleDirectionType getDirection();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.streamTypes.DISStream#getDirection <em>Direction</em>}' attribute.
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
	 * @see ucof.communication.configECIC.streamTypes.StreamTypesPackage#getDISStream_SampleMaxSizeBytes()
	 * @model default="0" dataType="ucof.common.edata.PositiveIntType"
	 * @generated
	 */
	Integer getSampleMaxSizeBytes();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.streamTypes.DISStream#getSampleMaxSizeBytes <em>Sample Max Size Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sample Max Size Bytes</em>' attribute.
	 * @see #getSampleMaxSizeBytes()
	 * @generated
	 */
	void setSampleMaxSizeBytes(Integer value);

	/**
	 * Returns the value of the '<em><b>Dis Packet Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dis Packet Strategy</em>' containment reference.
	 * @see #setDisPacketStrategy(DISPacketStrategy)
	 * @see ucof.communication.configECIC.streamTypes.StreamTypesPackage#getDISStream_DisPacketStrategy()
	 * @model containment="true"
	 * @generated
	 */
	DISPacketStrategy getDisPacketStrategy();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.streamTypes.DISStream#getDisPacketStrategy <em>Dis Packet Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dis Packet Strategy</em>' containment reference.
	 * @see #getDisPacketStrategy()
	 * @generated
	 */
	void setDisPacketStrategy(DISPacketStrategy value);

} // DISStream
