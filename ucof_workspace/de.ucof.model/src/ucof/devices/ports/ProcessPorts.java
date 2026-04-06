/**
 */
package ucof.devices.ports;

import org.eclipse.emf.common.util.EList;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Ports</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.ports.ProcessPorts#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see ucof.devices.ports.PortsPackage#getProcessPorts()
 * @model
 * @generated
 */
public interface ProcessPorts extends SuperTrackingType, SuperIdentifierType {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.devices.ports.SuperIntraCommunicationPortType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see ucof.devices.ports.PortsPackage#getProcessPorts_Port()
	 * @model containment="true"
	 * @generated
	 */
	EList<SuperIntraCommunicationPortType> getPort();

} // ProcessPorts
