/**
 */
package ucof.devices.devicetypes.a653components.healthmanagement;

import org.eclipse.emf.common.util.EList;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Partition Tables</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Parent class for MultiPartitionTable (one or multiple)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.MultiPartitionTables#getMultiPartitionTable <em>Multi Partition Table</em>}</li>
 * </ul>
 *
 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage#getMultiPartitionTables()
 * @model
 * @generated
 */
public interface MultiPartitionTables extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Multi Partition Table</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.devices.devicetypes.a653components.healthmanagement.MultiPartitionTable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Partition Table</em>' containment reference list.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage#getMultiPartitionTables_MultiPartitionTable()
	 * @model containment="true"
	 * @generated
	 */
	EList<MultiPartitionTable> getMultiPartitionTable();

} // MultiPartitionTables
