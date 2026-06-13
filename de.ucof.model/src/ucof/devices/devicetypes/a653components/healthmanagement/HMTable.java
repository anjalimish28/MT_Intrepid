/**
 */
package ucof.devices.devicetypes.a653components.healthmanagement;

import org.eclipse.emf.common.util.EList;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HM Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Error inside partition, local behavior of partition, error level definition, one table per partition
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.HMTable#getTableIdentifier <em>Table Identifier</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.HMTable#getTableName <em>Table Name</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.HMTable#getMultiPartitionHMTableNameRef <em>Multi Partition HM Table Name Ref</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.HMTable#getErrorInfo <em>Error Info</em>}</li>
 * </ul>
 *
 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage#getHMTable()
 * @model
 * @generated
 */
public interface HMTable extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Table Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional identifier of the table. May be used to reference this table from a partition configuration element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Table Identifier</em>' attribute.
	 * @see #setTableIdentifier(String)
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage#getHMTable_TableIdentifier()
	 * @model
	 * @generated
	 */
	String getTableIdentifier();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.healthmanagement.HMTable#getTableIdentifier <em>Table Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Identifier</em>' attribute.
	 * @see #getTableIdentifier()
	 * @generated
	 */
	void setTableIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the table. May be used to reference this table from a partition configuration element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Table Name</em>' attribute.
	 * @see #setTableName(String)
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage#getHMTable_TableName()
	 * @model
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.healthmanagement.HMTable#getTableName <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' attribute.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(String value);

	/**
	 * Returns the value of the '<em><b>Multi Partition HM Table Name Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the multi-partition HM table name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multi Partition HM Table Name Ref</em>' reference.
	 * @see #setMultiPartitionHMTableNameRef(MultiPartitionTable)
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage#getHMTable_MultiPartitionHMTableNameRef()
	 * @model
	 * @generated
	 */
	MultiPartitionTable getMultiPartitionHMTableNameRef();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.healthmanagement.HMTable#getMultiPartitionHMTableNameRef <em>Multi Partition HM Table Name Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Partition HM Table Name Ref</em>' reference.
	 * @see #getMultiPartitionHMTableNameRef()
	 * @generated
	 */
	void setMultiPartitionHMTableNameRef(MultiPartitionTable value);

	/**
	 * Returns the value of the '<em><b>Error Info</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.devices.devicetypes.a653components.healthmanagement.ErroInfoPartition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Info</em>' containment reference list.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage#getHMTable_ErrorInfo()
	 * @model containment="true"
	 * @generated
	 */
	EList<ErroInfoPartition> getErrorInfo();

} // HMTable
