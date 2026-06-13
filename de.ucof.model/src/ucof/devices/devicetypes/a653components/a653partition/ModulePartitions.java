/**
 */
package ucof.devices.devicetypes.a653components.a653partition;

import org.eclipse.emf.common.util.EList;

import ucof.common.etypes.SuperIdentifierType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Partitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container for the partitions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.ModulePartitions#getPartition <em>Partition</em>}</li>
 * </ul>
 *
 * @see ucof.devices.devicetypes.a653components.a653partition.A653partitionPackage#getModulePartitions()
 * @model
 * @generated
 */
public interface ModulePartitions extends SuperIdentifierType {
	/**
	 * Returns the value of the '<em><b>Partition</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.devices.devicetypes.a653components.a653partition.Partition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partition</em>' containment reference list.
	 * @see ucof.devices.devicetypes.a653components.a653partition.A653partitionPackage#getModulePartitions_Partition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Partition> getPartition();

} // ModulePartitions
