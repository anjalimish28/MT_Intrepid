/**
 */
package targets.CanTransceiver;

import targets.SuperHardwarePortType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>can Transceiver Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.CanTransceiver.canTransceiverPort#getPinName <em>Pin Name</em>}</li>
 *   <li>{@link targets.CanTransceiver.canTransceiverPort#getPinNumber <em>Pin Number</em>}</li>
 * </ul>
 *
 * @see targets.CanTransceiver.CanTransceiverPackage#getcanTransceiverPort()
 * @model
 * @generated
 */
public interface canTransceiverPort extends SuperHardwarePortType {
	/**
	 * Returns the value of the '<em><b>Pin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin Name</em>' attribute.
	 * @see #setPinName(String)
	 * @see targets.CanTransceiver.CanTransceiverPackage#getcanTransceiverPort_PinName()
	 * @model
	 * @generated
	 */
	String getPinName();

	/**
	 * Sets the value of the '{@link targets.CanTransceiver.canTransceiverPort#getPinName <em>Pin Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin Name</em>' attribute.
	 * @see #getPinName()
	 * @generated
	 */
	void setPinName(String value);

	/**
	 * Returns the value of the '<em><b>Pin Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin Number</em>' attribute.
	 * @see #setPinNumber(int)
	 * @see targets.CanTransceiver.CanTransceiverPackage#getcanTransceiverPort_PinNumber()
	 * @model
	 * @generated
	 */
	int getPinNumber();

	/**
	 * Sets the value of the '{@link targets.CanTransceiver.canTransceiverPort#getPinNumber <em>Pin Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin Number</em>' attribute.
	 * @see #getPinNumber()
	 * @generated
	 */
	void setPinNumber(int value);

} // canTransceiverPort
