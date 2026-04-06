/**
 */
package ucof.devices.ports;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Queuing Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Queuing Port with First in First Out principle. Can hold as many messages as specified in attribute MaxNumberOfMessages
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.ports.QueuingPort#getMaxNumberOfMessages <em>Max Number Of Messages</em>}</li>
 * </ul>
 *
 * @see ucof.devices.ports.PortsPackage#getQueuingPort()
 * @model
 * @generated
 */
public interface QueuingPort extends SuperInterCommunicationPortType {
	/**
	 * Returns the value of the '<em><b>Max Number Of Messages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How many messages can be stored in Port
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Number Of Messages</em>' attribute.
	 * @see #setMaxNumberOfMessages(String)
	 * @see ucof.devices.ports.PortsPackage#getQueuingPort_MaxNumberOfMessages()
	 * @model dataType="ucof.common.edata.DecOrHexValueType"
	 * @generated
	 */
	String getMaxNumberOfMessages();

	/**
	 * Sets the value of the '{@link ucof.devices.ports.QueuingPort#getMaxNumberOfMessages <em>Max Number Of Messages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Number Of Messages</em>' attribute.
	 * @see #getMaxNumberOfMessages()
	 * @generated
	 */
	void setMaxNumberOfMessages(String value);

} // QueuingPort
