/**
 */
package ucof.communication.configECIC;

import org.eclipse.emf.common.util.EList;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UDP Sockets</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.UDPSockets#getUdpSocket <em>Udp Socket</em>}</li>
 * </ul>
 *
 * @see ucof.communication.configECIC.ConfigECICPackage#getUDPSockets()
 * @model
 * @generated
 */
public interface UDPSockets extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Udp Socket</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.communication.configECIC.UDPSocket}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Udp Socket</em>' containment reference list.
	 * @see ucof.communication.configECIC.ConfigECICPackage#getUDPSockets_UdpSocket()
	 * @model containment="true"
	 * @generated
	 */
	EList<UDPSocket> getUdpSocket();

} // UDPSockets
