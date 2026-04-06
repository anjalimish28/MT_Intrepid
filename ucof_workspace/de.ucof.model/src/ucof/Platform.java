/**
 */
package ucof;

import targets.Targets;
import ucof.assignments.Assignments;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

import ucof.communication.Communication;

import ucof.devices.Devices;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Top level object
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.Platform#getDevices <em>Devices</em>}</li>
 *   <li>{@link ucof.Platform#getCommunication <em>Communication</em>}</li>
 *   <li>{@link ucof.Platform#getAssignments <em>Assignments</em>}</li>
 *   <li>{@link ucof.Platform#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @see ucof.UcofPackage#getPlatform()
 * @model
 * @generated
 */
public interface Platform extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Devices</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container for all Devices/Modules (layer 2)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Devices</em>' containment reference.
	 * @see #setDevices(Devices)
	 * @see ucof.UcofPackage#getPlatform_Devices()
	 * @model containment="true"
	 * @generated
	 */
	Devices getDevices();

	/**
	 * Sets the value of the '{@link ucof.Platform#getDevices <em>Devices</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Devices</em>' containment reference.
	 * @see #getDevices()
	 * @generated
	 */
	void setDevices(Devices value);

	/**
	 * Returns the value of the '<em><b>Communication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container for Network Elements (layer 2)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Communication</em>' containment reference.
	 * @see #setCommunication(Communication)
	 * @see ucof.UcofPackage#getPlatform_Communication()
	 * @model containment="true"
	 * @generated
	 */
	Communication getCommunication();

	/**
	 * Sets the value of the '{@link ucof.Platform#getCommunication <em>Communication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication</em>' containment reference.
	 * @see #getCommunication()
	 * @generated
	 */
	void setCommunication(Communication value);

	/**
	 * Returns the value of the '<em><b>Assignments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container for Assignment Elements (layer 2)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assignments</em>' containment reference.
	 * @see #setAssignments(Assignments)
	 * @see ucof.UcofPackage#getPlatform_Assignments()
	 * @model containment="true"
	 * @generated
	 */
	Assignments getAssignments();

	/**
	 * Sets the value of the '{@link ucof.Platform#getAssignments <em>Assignments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignments</em>' containment reference.
	 * @see #getAssignments()
	 * @generated
	 */
	void setAssignments(Assignments value);

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' containment reference.
	 * @see #setTargets(Targets)
	 * @see ucof.UcofPackage#getPlatform_Targets()
	 * @model containment="true"
	 * @generated
	 */
	Targets getTargets();

	/**
	 * Sets the value of the '{@link ucof.Platform#getTargets <em>Targets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Targets</em>' containment reference.
	 * @see #getTargets()
	 * @generated
	 */
	void setTargets(Targets value);

} // Platform
