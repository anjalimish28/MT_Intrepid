/**
 */
package ucof.assignments;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port To Port Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Central assignment. Essentially is the connection between two ports. Signals/Payload/Messages can be assigned to this connection for information on which data is transmitted
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.assignments.PortToPortAssignment#getTransmissionRate <em>Transmission Rate</em>}</li>
 *   <li>{@link ucof.assignments.PortToPortAssignment#getRefreshRate <em>Refresh Rate</em>}</li>
 * </ul>
 *
 * @see ucof.assignments.AssignmentsPackage#getPortToPortAssignment()
 * @model
 * @generated
 */
public interface PortToPortAssignment extends SuperAssignmentType {

	/**
	 * Returns the value of the '<em><b>Transmission Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission Rate</em>' attribute.
	 * @see #setTransmissionRate(float)
	 * @see ucof.assignments.AssignmentsPackage#getPortToPortAssignment_TransmissionRate()
	 * @model
	 * @generated
	 */
	float getTransmissionRate();

	/**
	 * Sets the value of the '{@link ucof.assignments.PortToPortAssignment#getTransmissionRate <em>Transmission Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmission Rate</em>' attribute.
	 * @see #getTransmissionRate()
	 * @generated
	 */
	void setTransmissionRate(float value);

	/**
	 * Returns the value of the '<em><b>Refresh Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refresh Rate</em>' attribute.
	 * @see #setRefreshRate(float)
	 * @see ucof.assignments.AssignmentsPackage#getPortToPortAssignment_RefreshRate()
	 * @model
	 * @generated
	 */
	float getRefreshRate();

	/**
	 * Sets the value of the '{@link ucof.assignments.PortToPortAssignment#getRefreshRate <em>Refresh Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refresh Rate</em>' attribute.
	 * @see #getRefreshRate()
	 * @generated
	 */
	void setRefreshRate(float value);
} // PortToPortAssignment
