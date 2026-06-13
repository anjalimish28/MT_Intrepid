/**
 */
package ucof.assignments.database;

import ucof.assignments.SuperAssignmentType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message To Target Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.assignments.database.MessageToTargetAssignment#getAssignmentTargetType <em>Assignment Target Type</em>}</li>
 * </ul>
 *
 * @see ucof.assignments.database.DatabasePackage#getMessageToTargetAssignment()
 * @model
 * @generated
 */
public interface MessageToTargetAssignment extends SuperAssignmentType {
	/**
	 * Returns the value of the '<em><b>Assignment Target Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.assignments.database.messageTargets}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment Target Type</em>' attribute.
	 * @see ucof.assignments.database.messageTargets
	 * @see #setAssignmentTargetType(messageTargets)
	 * @see ucof.assignments.database.DatabasePackage#getMessageToTargetAssignment_AssignmentTargetType()
	 * @model
	 * @generated
	 */
	messageTargets getAssignmentTargetType();

	/**
	 * Sets the value of the '{@link ucof.assignments.database.MessageToTargetAssignment#getAssignmentTargetType <em>Assignment Target Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignment Target Type</em>' attribute.
	 * @see ucof.assignments.database.messageTargets
	 * @see #getAssignmentTargetType()
	 * @generated
	 */
	void setAssignmentTargetType(messageTargets value);

} // MessageToTargetAssignment
