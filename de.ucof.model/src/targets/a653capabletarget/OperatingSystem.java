/**
 */
package targets.a653capabletarget;

import ucof.common.etypes.Memory;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;
import ucof.devices.devicetypes.a653components.a653partition.Processes;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operating System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.a653capabletarget.OperatingSystem#getMemory <em>Memory</em>}</li>
 *   <li>{@link targets.a653capabletarget.OperatingSystem#getProcesses <em>Processes</em>}</li>
 * </ul>
 *
 * @see targets.a653capabletarget.A653capabletargetPackage#getOperatingSystem()
 * @model
 * @generated
 */
public interface OperatingSystem extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Memory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory</em>' containment reference.
	 * @see #setMemory(Memory)
	 * @see targets.a653capabletarget.A653capabletargetPackage#getOperatingSystem_Memory()
	 * @model containment="true"
	 * @generated
	 */
	Memory getMemory();

	/**
	 * Sets the value of the '{@link targets.a653capabletarget.OperatingSystem#getMemory <em>Memory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory</em>' containment reference.
	 * @see #getMemory()
	 * @generated
	 */
	void setMemory(Memory value);

	/**
	 * Returns the value of the '<em><b>Processes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processes</em>' containment reference.
	 * @see #setProcesses(Processes)
	 * @see targets.a653capabletarget.A653capabletargetPackage#getOperatingSystem_Processes()
	 * @model containment="true"
	 * @generated
	 */
	Processes getProcesses();

	/**
	 * Sets the value of the '{@link targets.a653capabletarget.OperatingSystem#getProcesses <em>Processes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processes</em>' containment reference.
	 * @see #getProcesses()
	 * @generated
	 */
	void setProcesses(Processes value);

} // OperatingSystem
