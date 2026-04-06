/**
 */
package ucof.devices.devicetypes.a653components.a653partition;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;
import ucof.devices.ports.ProcessPorts;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Process as per the ARINC 653 definition
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.Process#getEntryPoint <em>Entry Point</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.Process#getStackSize <em>Stack Size</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.Process#getBasePriority <em>Base Priority</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.Process#getPeriod <em>Period</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.Process#getTimeCapacity <em>Time Capacity</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.Process#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.Process#getSynchronicity <em>Synchronicity</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.Process#getDuration <em>Duration</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.Process#getProcessPorts <em>Process Ports</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.a653partition.Process#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @see ucof.devices.devicetypes.a653components.a653partition.A653partitionPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Entry Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Point</em>' attribute.
	 * @see #setEntryPoint(String)
	 * @see ucof.devices.devicetypes.a653components.a653partition.A653partitionPackage#getProcess_EntryPoint()
	 * @model dataType="ucof.common.edata.DecOrHexValueType"
	 * @generated
	 */
	String getEntryPoint();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.a653partition.Process#getEntryPoint <em>Entry Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Point</em>' attribute.
	 * @see #getEntryPoint()
	 * @generated
	 */
	void setEntryPoint(String value);

	/**
	 * Returns the value of the '<em><b>Stack Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stack Size</em>' attribute.
	 * @see #setStackSize(String)
	 * @see ucof.devices.devicetypes.a653components.a653partition.A653partitionPackage#getProcess_StackSize()
	 * @model dataType="ucof.common.edata.DecOrHexValueType"
	 * @generated
	 */
	String getStackSize();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.a653partition.Process#getStackSize <em>Stack Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stack Size</em>' attribute.
	 * @see #getStackSize()
	 * @generated
	 */
	void setStackSize(String value);

	/**
	 * Returns the value of the '<em><b>Base Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Priority</em>' attribute.
	 * @see #setBasePriority(int)
	 * @see ucof.devices.devicetypes.a653components.a653partition.A653partitionPackage#getProcess_BasePriority()
	 * @model
	 * @generated
	 */
	int getBasePriority();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.a653partition.Process#getBasePriority <em>Base Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Priority</em>' attribute.
	 * @see #getBasePriority()
	 * @generated
	 */
	void setBasePriority(int value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(String)
	 * @see ucof.devices.devicetypes.a653components.a653partition.A653partitionPackage#getProcess_Period()
	 * @model dataType="ucof.common.edata.DecOrHexValueType"
	 * @generated
	 */
	String getPeriod();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.a653partition.Process#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(String value);

	/**
	 * Returns the value of the '<em><b>Time Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Capacity</em>' attribute.
	 * @see #setTimeCapacity(int)
	 * @see ucof.devices.devicetypes.a653components.a653partition.A653partitionPackage#getProcess_TimeCapacity()
	 * @model
	 * @generated
	 */
	int getTimeCapacity();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.a653partition.Process#getTimeCapacity <em>Time Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Capacity</em>' attribute.
	 * @see #getTimeCapacity()
	 * @generated
	 */
	void setTimeCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Deadline</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.devices.devicetypes.a653components.a653partition.ProcessDeadlineDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadline</em>' attribute.
	 * @see ucof.devices.devicetypes.a653components.a653partition.ProcessDeadlineDefinition
	 * @see #setDeadline(ProcessDeadlineDefinition)
	 * @see ucof.devices.devicetypes.a653components.a653partition.A653partitionPackage#getProcess_Deadline()
	 * @model
	 * @generated
	 */
	ProcessDeadlineDefinition getDeadline();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.a653partition.Process#getDeadline <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadline</em>' attribute.
	 * @see ucof.devices.devicetypes.a653components.a653partition.ProcessDeadlineDefinition
	 * @see #getDeadline()
	 * @generated
	 */
	void setDeadline(ProcessDeadlineDefinition value);

	/**
	 * Returns the value of the '<em><b>Synchronicity</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.devices.devicetypes.a653components.a653partition.ProcessSynchronicity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronicity</em>' attribute.
	 * @see ucof.devices.devicetypes.a653components.a653partition.ProcessSynchronicity
	 * @see #setSynchronicity(ProcessSynchronicity)
	 * @see ucof.devices.devicetypes.a653components.a653partition.A653partitionPackage#getProcess_Synchronicity()
	 * @model
	 * @generated
	 */
	ProcessSynchronicity getSynchronicity();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.a653partition.Process#getSynchronicity <em>Synchronicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronicity</em>' attribute.
	 * @see ucof.devices.devicetypes.a653components.a653partition.ProcessSynchronicity
	 * @see #getSynchronicity()
	 * @generated
	 */
	void setSynchronicity(ProcessSynchronicity value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the duration of the window in nanoseconds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(String)
	 * @see ucof.devices.devicetypes.a653components.a653partition.A653partitionPackage#getProcess_Duration()
	 * @model dataType="ucof.common.edata.DecOrHexValueType"
	 * @generated
	 */
	String getDuration();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.a653partition.Process#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(String value);

	/**
	 * Returns the value of the '<em><b>Process Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Ports</em>' containment reference.
	 * @see #setProcessPorts(ProcessPorts)
	 * @see ucof.devices.devicetypes.a653components.a653partition.A653partitionPackage#getProcess_ProcessPorts()
	 * @model containment="true"
	 * @generated
	 */
	ProcessPorts getProcessPorts();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.a653partition.Process#getProcessPorts <em>Process Ports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Ports</em>' containment reference.
	 * @see #getProcessPorts()
	 * @generated
	 */
	void setProcessPorts(ProcessPorts value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(String)
	 * @see ucof.devices.devicetypes.a653components.a653partition.A653partitionPackage#getProcess_Offset()
	 * @model dataType="ucof.common.edata.DecOrHexValueType"
	 * @generated
	 */
	String getOffset();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.a653partition.Process#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(String value);

} // Process
