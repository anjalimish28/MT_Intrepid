/**
 */
package ucof.devices.devicetypes.a653components.a653partition;

import org.eclipse.emf.common.util.EList;
import ucof.common.etypes.SuperIdentifierType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container for the processes integrated into a partition
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.Processes#getProcess <em>Process</em>}</li>
 * </ul>
 *
 * @see ucof.devices.devicetypes.a653components.a653partition.A653partitionPackage#getProcesses()
 * @model
 * @generated
 */
public interface Processes extends SuperIdentifierType {
	/**
	 * Returns the value of the '<em><b>Process</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.devices.devicetypes.a653components.a653partition.Process}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' containment reference list.
	 * @see ucof.devices.devicetypes.a653components.a653partition.A653partitionPackage#getProcesses_Process()
	 * @model containment="true"
	 * @generated
	 */
	EList<ucof.devices.devicetypes.a653components.a653partition.Process> getProcess();

} // Processes
