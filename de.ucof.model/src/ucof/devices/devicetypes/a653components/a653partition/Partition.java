/**
 */
package ucof.devices.devicetypes.a653components.a653partition;

import ucof.common.etypes.Memory;
import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

import ucof.devices.devicetypes.a653components.healthmanagement.HMTable;
import ucof.devices.ports.PartitionPorts;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Partition as per the ARINC 653 definition
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.Partition#getCriticality <em>Criticality</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.Partition#getEntryPoint <em>Entry Point</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.Partition#getPartitionPeriod <em>Partition Period</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.Partition#getMemory <em>Memory</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.Partition#getHmTable <em>Hm Table</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.Partition#getPartitionPorts <em>Partition Ports</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.Partition#getProcesses <em>Processes</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.Partition#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @see ucof.devices.devicetypes.a653components.a653partition.A653partitionPackage#getPartition()
 * @model
 * @generated
 */
public interface Partition extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Criticality</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.devices.devicetypes.a653components.a653partition.Criticality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criticality</em>' attribute.
	 * @see ucof.devices.devicetypes.a653components.a653partition.Criticality
	 * @see #setCriticality(Criticality)
	 * @see ucof.devices.devicetypes.a653components.a653partition.A653partitionPackage#getPartition_Criticality()
	 * @model
	 * @generated
	 */
	Criticality getCriticality();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.a653partition.Partition#getCriticality <em>Criticality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criticality</em>' attribute.
	 * @see ucof.devices.devicetypes.a653components.a653partition.Criticality
	 * @see #getCriticality()
	 * @generated
	 */
	void setCriticality(Criticality value);

	/**
	 * Returns the value of the '<em><b>Entry Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Point</em>' attribute.
	 * @see #setEntryPoint(String)
	 * @see ucof.devices.devicetypes.a653components.a653partition.A653partitionPackage#getPartition_EntryPoint()
	 * @model dataType="ucof.common.edata.DecOrHexValueType"
	 * @generated
	 */
	String getEntryPoint();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.a653partition.Partition#getEntryPoint <em>Entry Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Point</em>' attribute.
	 * @see #getEntryPoint()
	 * @generated
	 */
	void setEntryPoint(String value);

	/**
	 * Returns the value of the '<em><b>Partition Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partition Period</em>' attribute.
	 * @see #setPartitionPeriod(String)
	 * @see ucof.devices.devicetypes.a653components.a653partition.A653partitionPackage#getPartition_PartitionPeriod()
	 * @model dataType="ucof.common.edata.DecOrHexValueType"
	 * @generated
	 */
	String getPartitionPeriod();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.a653partition.Partition#getPartitionPeriod <em>Partition Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partition Period</em>' attribute.
	 * @see #getPartitionPeriod()
	 * @generated
	 */
	void setPartitionPeriod(String value);

	/**
	 * Returns the value of the '<em><b>Memory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory</em>' containment reference.
	 * @see #setMemory(Memory)
	 * @see ucof.devices.devicetypes.a653components.a653partition.A653partitionPackage#getPartition_Memory()
	 * @model containment="true"
	 * @generated
	 */
	Memory getMemory();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.a653partition.Partition#getMemory <em>Memory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory</em>' containment reference.
	 * @see #getMemory()
	 * @generated
	 */
	void setMemory(Memory value);

	/**
	 * Returns the value of the '<em><b>Hm Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hm Table</em>' containment reference.
	 * @see #setHmTable(HMTable)
	 * @see ucof.devices.devicetypes.a653components.a653partition.A653partitionPackage#getPartition_HmTable()
	 * @model containment="true"
	 * @generated
	 */
	HMTable getHmTable();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.a653partition.Partition#getHmTable <em>Hm Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hm Table</em>' containment reference.
	 * @see #getHmTable()
	 * @generated
	 */
	void setHmTable(HMTable value);

	/**
	 * Returns the value of the '<em><b>Partition Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partition Ports</em>' containment reference.
	 * @see #setPartitionPorts(PartitionPorts)
	 * @see ucof.devices.devicetypes.a653components.a653partition.A653partitionPackage#getPartition_PartitionPorts()
	 * @model containment="true"
	 * @generated
	 */
	PartitionPorts getPartitionPorts();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.a653partition.Partition#getPartitionPorts <em>Partition Ports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partition Ports</em>' containment reference.
	 * @see #getPartitionPorts()
	 * @generated
	 */
	void setPartitionPorts(PartitionPorts value);

	/**
	 * Returns the value of the '<em><b>Processes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processes</em>' containment reference.
	 * @see #setProcesses(Processes)
	 * @see ucof.devices.devicetypes.a653components.a653partition.A653partitionPackage#getPartition_Processes()
	 * @model containment="true"
	 * @generated
	 */
	Processes getProcesses();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.a653partition.Partition#getProcesses <em>Processes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processes</em>' containment reference.
	 * @see #getProcesses()
	 * @generated
	 */
	void setProcesses(Processes value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(String)
	 * @see ucof.devices.devicetypes.a653components.a653partition.A653partitionPackage#getPartition_Offset()
	 * @model dataType="ucof.common.edata.DecOrHexValueType"
	 * @generated
	 */
	String getOffset();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.a653partition.Partition#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(String value);

} // Partition
