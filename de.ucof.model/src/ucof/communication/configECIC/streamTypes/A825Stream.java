/**
 */
package ucof.communication.configECIC.streamTypes;

import ucof.common.enums.YesNoType;

import ucof.communication.configECIC.packageStrategyTypes.A825PacketStrategy;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>A825 Stream</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.streamTypes.A825Stream#getA825PacketStrategy <em>A825 Packet Strategy</em>}</li>
 *   <li>{@link ucof.communication.configECIC.streamTypes.A825Stream#getErrors <em>Errors</em>}</li>
 * </ul>
 *
 * @see ucof.communication.configECIC.streamTypes.StreamTypesPackage#getA825Stream()
 * @model
 * @generated
 */
public interface A825Stream extends SuperStreamType {
	/**
	 * Returns the value of the '<em><b>A825 Packet Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A825 Packet Strategy</em>' containment reference.
	 * @see #setA825PacketStrategy(A825PacketStrategy)
	 * @see ucof.communication.configECIC.streamTypes.StreamTypesPackage#getA825Stream_A825PacketStrategy()
	 * @model containment="true"
	 * @generated
	 */
	A825PacketStrategy getA825PacketStrategy();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.streamTypes.A825Stream#getA825PacketStrategy <em>A825 Packet Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A825 Packet Strategy</em>' containment reference.
	 * @see #getA825PacketStrategy()
	 * @generated
	 */
	void setA825PacketStrategy(A825PacketStrategy value);

	/**
	 * Returns the value of the '<em><b>Errors</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.YesNoType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Errors</em>' attribute.
	 * @see ucof.common.enums.YesNoType
	 * @see #setErrors(YesNoType)
	 * @see ucof.communication.configECIC.streamTypes.StreamTypesPackage#getA825Stream_Errors()
	 * @model
	 * @generated
	 */
	YesNoType getErrors();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.streamTypes.A825Stream#getErrors <em>Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Errors</em>' attribute.
	 * @see ucof.common.enums.YesNoType
	 * @see #getErrors()
	 * @generated
	 */
	void setErrors(YesNoType value);

} // A825Stream
