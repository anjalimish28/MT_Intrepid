/**
 */
package ucof.devices.ports;

import org.eclipse.emf.common.util.EList;

import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intrapartition Ports</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.ports.IntrapartitionPorts#getIntrapartitionCommunication <em>Intrapartition Communication</em>}</li>
 * </ul>
 *
 * @see ucof.devices.ports.PortsPackage#getIntrapartitionPorts()
 * @model
 * @generated
 */
public interface IntrapartitionPorts extends SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Intrapartition Communication</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.devices.ports.SuperIntrapartitionCommunicationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intrapartition Communication</em>' containment reference list.
	 * @see ucof.devices.ports.PortsPackage#getIntrapartitionPorts_IntrapartitionCommunication()
	 * @model containment="true"
	 * @generated
	 */
	EList<SuperIntrapartitionCommunicationType> getIntrapartitionCommunication();

} // IntrapartitionPorts
