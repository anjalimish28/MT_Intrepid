/**
 */
package ucof.communication.configECIC;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Com Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.ComInterface#getUdpSockets <em>Udp Sockets</em>}</li>
 * </ul>
 *
 * @see ucof.communication.configECIC.ConfigECICPackage#getComInterface()
 * @model
 * @generated
 */
public interface ComInterface extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Udp Sockets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Udp Sockets</em>' containment reference.
	 * @see #setUdpSockets(UDPSockets)
	 * @see ucof.communication.configECIC.ConfigECICPackage#getComInterface_UdpSockets()
	 * @model containment="true"
	 * @generated
	 */
	UDPSockets getUdpSockets();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.ComInterface#getUdpSockets <em>Udp Sockets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Udp Sockets</em>' containment reference.
	 * @see #getUdpSockets()
	 * @generated
	 */
	void setUdpSockets(UDPSockets value);

} // ComInterface
