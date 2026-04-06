/**
 */
package ucof.devices.ports;

import org.eclipse.emf.common.util.EList;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Ports</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.ports.CommunicationPorts#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see ucof.devices.ports.PortsPackage#getCommunicationPorts()
 * @model
 * @generated
 */
public interface CommunicationPorts extends SuperTrackingType, SuperIdentifierType {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.devices.ports.SuperInterCommunicationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see ucof.devices.ports.PortsPackage#getCommunicationPorts_Port()
	 * @model containment="true"
	 * @generated
	 */
	EList<SuperInterCommunicationType> getPort();

} // CommunicationPorts
