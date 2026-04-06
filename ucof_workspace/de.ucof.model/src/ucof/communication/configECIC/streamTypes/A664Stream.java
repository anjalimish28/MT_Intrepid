/**
 */
package ucof.communication.configECIC.streamTypes;

import ucof.common.enums.SingleDirectionType;
import ucof.common.enums.YesNoType;

import ucof.communication.configECIC.packageStrategyTypes.A664PacketStrategy;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>A664 Stream</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.streamTypes.A664Stream#getDirection <em>Direction</em>}</li>
 *   <li>{@link ucof.communication.configECIC.streamTypes.A664Stream#getSampleMaxSizeBytes <em>Sample Max Size Bytes</em>}</li>
 *   <li>{@link ucof.communication.configECIC.streamTypes.A664Stream#getA664PacketStrategy <em>A664 Packet Strategy</em>}</li>
 *   <li>{@link ucof.communication.configECIC.streamTypes.A664Stream#getErrors <em>Errors</em>}</li>
 * </ul>
 *
 * @see ucof.communication.configECIC.streamTypes.StreamTypesPackage#getA664Stream()
 * @model
 * @generated
 */
public interface A664Stream extends SuperStreamType {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.SingleDirectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see ucof.common.enums.SingleDirectionType
	 * @see #setDirection(SingleDirectionType)
	 * @see ucof.communication.configECIC.streamTypes.StreamTypesPackage#getA664Stream_Direction()
	 * @model
	 * @generated
	 */
	SingleDirectionType getDirection();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.streamTypes.A664Stream#getDirection <em>Direction</em>}' attribute.
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
	 * The default value is <code>"1471"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sample Max Size Bytes</em>' attribute.
	 * @see #setSampleMaxSizeBytes(Integer)
	 * @see ucof.communication.configECIC.streamTypes.StreamTypesPackage#getA664Stream_SampleMaxSizeBytes()
	 * @model default="1471" dataType="ucof.common.edata.PositiveIntType"
	 * @generated
	 */
	Integer getSampleMaxSizeBytes();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.streamTypes.A664Stream#getSampleMaxSizeBytes <em>Sample Max Size Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sample Max Size Bytes</em>' attribute.
	 * @see #getSampleMaxSizeBytes()
	 * @generated
	 */
	void setSampleMaxSizeBytes(Integer value);

	/**
	 * Returns the value of the '<em><b>A664 Packet Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A664 Packet Strategy</em>' containment reference.
	 * @see #setA664PacketStrategy(A664PacketStrategy)
	 * @see ucof.communication.configECIC.streamTypes.StreamTypesPackage#getA664Stream_A664PacketStrategy()
	 * @model containment="true"
	 * @generated
	 */
	A664PacketStrategy getA664PacketStrategy();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.streamTypes.A664Stream#getA664PacketStrategy <em>A664 Packet Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A664 Packet Strategy</em>' containment reference.
	 * @see #getA664PacketStrategy()
	 * @generated
	 */
	void setA664PacketStrategy(A664PacketStrategy value);

	/**
	 * Returns the value of the '<em><b>Errors</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.YesNoType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Errors</em>' attribute.
	 * @see ucof.common.enums.YesNoType
	 * @see #setErrors(YesNoType)
	 * @see ucof.communication.configECIC.streamTypes.StreamTypesPackage#getA664Stream_Errors()
	 * @model
	 * @generated
	 */
	YesNoType getErrors();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.streamTypes.A664Stream#getErrors <em>Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Errors</em>' attribute.
	 * @see ucof.common.enums.YesNoType
	 * @see #getErrors()
	 * @generated
	 */
	void setErrors(YesNoType value);

} // A664Stream
