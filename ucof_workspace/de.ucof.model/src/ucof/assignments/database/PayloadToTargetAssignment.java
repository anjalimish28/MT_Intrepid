/**
 */
package ucof.assignments.database;

import ucof.assignments.SuperAssignmentType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payload To Target Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.assignments.database.PayloadToTargetAssignment#getAssignmentTargetType <em>Assignment Target Type</em>}</li>
 * </ul>
 *
 * @see ucof.assignments.database.DatabasePackage#getPayloadToTargetAssignment()
 * @model
 * @generated
 */
public interface PayloadToTargetAssignment extends SuperAssignmentType {
	/**
	 * Returns the value of the '<em><b>Assignment Target Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.assignments.database.payloadTargets}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment Target Type</em>' attribute.
	 * @see ucof.assignments.database.payloadTargets
	 * @see #setAssignmentTargetType(payloadTargets)
	 * @see ucof.assignments.database.DatabasePackage#getPayloadToTargetAssignment_AssignmentTargetType()
	 * @model
	 * @generated
	 */
	payloadTargets getAssignmentTargetType();

	/**
	 * Sets the value of the '{@link ucof.assignments.database.PayloadToTargetAssignment#getAssignmentTargetType <em>Assignment Target Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignment Target Type</em>' attribute.
	 * @see ucof.assignments.database.payloadTargets
	 * @see #getAssignmentTargetType()
	 * @generated
	 */
	void setAssignmentTargetType(payloadTargets value);

} // PayloadToTargetAssignment
