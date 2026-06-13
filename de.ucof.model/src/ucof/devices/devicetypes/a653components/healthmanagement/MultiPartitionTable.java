/**
 */
package ucof.devices.devicetypes.a653components.healthmanagement;

import org.eclipse.emf.common.util.EList;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Partition Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Error inside partition time window, global behavior for a set of partitions, defines error level
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.MultiPartitionTable#getTableID <em>Table ID</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.MultiPartitionTable#getTableName <em>Table Name</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.MultiPartitionTable#getErrorInfo <em>Error Info</em>}</li>
 * </ul>
 *
 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage#getMultiPartitionTable()
 * @model
 * @generated
 */
public interface MultiPartitionTable extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Table ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional identifier of the table. May be used to reference this table from a partition configuration element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Table ID</em>' attribute.
	 * @see #setTableID(String)
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage#getMultiPartitionTable_TableID()
	 * @model
	 * @generated
	 */
	String getTableID();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.healthmanagement.MultiPartitionTable#getTableID <em>Table ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table ID</em>' attribute.
	 * @see #getTableID()
	 * @generated
	 */
	void setTableID(String value);

	/**
	 * Returns the value of the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the table. May be used to reference this table from a partition configuration element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Table Name</em>' attribute.
	 * @see #setTableName(String)
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage#getMultiPartitionTable_TableName()
	 * @model
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.healthmanagement.MultiPartitionTable#getTableName <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' attribute.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(String value);

	/**
	 * Returns the value of the '<em><b>Error Info</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.devices.devicetypes.a653components.healthmanagement.ErrorInfoMultiPartition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Info</em>' containment reference list.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage#getMultiPartitionTable_ErrorInfo()
	 * @model containment="true"
	 * @generated
	 */
	EList<ErrorInfoMultiPartition> getErrorInfo();

} // MultiPartitionTable
