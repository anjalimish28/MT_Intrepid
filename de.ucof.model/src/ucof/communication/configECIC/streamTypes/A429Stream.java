/**
 */
package ucof.communication.configECIC.streamTypes;

import ucof.common.enums.SingleDirectionType;
import ucof.common.enums.YesNoType;

import ucof.communication.configECIC.packageStrategyTypes.A429PacketStrategy;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>A429 Stream</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.streamTypes.A429Stream#getDirection <em>Direction</em>}</li>
 *   <li>{@link ucof.communication.configECIC.streamTypes.A429Stream#getA429PacketStrategy <em>A429 Packet Strategy</em>}</li>
 *   <li>{@link ucof.communication.configECIC.streamTypes.A429Stream#getErrors <em>Errors</em>}</li>
 * </ul>
 *
 * @see ucof.communication.configECIC.streamTypes.StreamTypesPackage#getA429Stream()
 * @model
 * @generated
 */
public interface A429Stream extends SuperStreamType {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.SingleDirectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see ucof.common.enums.SingleDirectionType
	 * @see #setDirection(SingleDirectionType)
	 * @see ucof.communication.configECIC.streamTypes.StreamTypesPackage#getA429Stream_Direction()
	 * @model
	 * @generated
	 */
	SingleDirectionType getDirection();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.streamTypes.A429Stream#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see ucof.common.enums.SingleDirectionType
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(SingleDirectionType value);

	/**
	 * Returns the value of the '<em><b>A429 Packet Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A429 Packet Strategy</em>' containment reference.
	 * @see #setA429PacketStrategy(A429PacketStrategy)
	 * @see ucof.communication.configECIC.streamTypes.StreamTypesPackage#getA429Stream_A429PacketStrategy()
	 * @model containment="true"
	 * @generated
	 */
	A429PacketStrategy getA429PacketStrategy();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.streamTypes.A429Stream#getA429PacketStrategy <em>A429 Packet Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A429 Packet Strategy</em>' containment reference.
	 * @see #getA429PacketStrategy()
	 * @generated
	 */
	void setA429PacketStrategy(A429PacketStrategy value);

	/**
	 * Returns the value of the '<em><b>Errors</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.YesNoType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Errors</em>' attribute.
	 * @see ucof.common.enums.YesNoType
	 * @see #setErrors(YesNoType)
	 * @see ucof.communication.configECIC.streamTypes.StreamTypesPackage#getA429Stream_Errors()
	 * @model
	 * @generated
	 */
	YesNoType getErrors();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.streamTypes.A429Stream#getErrors <em>Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Errors</em>' attribute.
	 * @see ucof.common.enums.YesNoType
	 * @see #getErrors()
	 * @generated
	 */
	void setErrors(YesNoType value);

} // A429Stream
