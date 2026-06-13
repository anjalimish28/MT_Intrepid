/**
 */
package ucof.devices.devicetypes.a653components.healthmanagement;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Health Management</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Parent Class for Health Management on Module Level. Not Necessary for Partition level
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.HealthManagement#getModuleTable <em>Module Table</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.HealthManagement#getMultiPartitionTables <em>Multi Partition Tables</em>}</li>
 * </ul>
 *
 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage#getHealthManagement()
 * @model
 * @generated
 */
public interface HealthManagement extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Module Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Table</em>' containment reference.
	 * @see #setModuleTable(ModuleTable)
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage#getHealthManagement_ModuleTable()
	 * @model containment="true"
	 * @generated
	 */
	ModuleTable getModuleTable();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.healthmanagement.HealthManagement#getModuleTable <em>Module Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Table</em>' containment reference.
	 * @see #getModuleTable()
	 * @generated
	 */
	void setModuleTable(ModuleTable value);

	/**
	 * Returns the value of the '<em><b>Multi Partition Tables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Partition Tables</em>' containment reference.
	 * @see #setMultiPartitionTables(MultiPartitionTables)
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage#getHealthManagement_MultiPartitionTables()
	 * @model containment="true"
	 * @generated
	 */
	MultiPartitionTables getMultiPartitionTables();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.healthmanagement.HealthManagement#getMultiPartitionTables <em>Multi Partition Tables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Partition Tables</em>' containment reference.
	 * @see #getMultiPartitionTables()
	 * @generated
	 */
	void setMultiPartitionTables(MultiPartitionTables value);

} // HealthManagement
