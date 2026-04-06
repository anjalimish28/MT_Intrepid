/**
 */
package ucof.assignments.database;

import org.eclipse.emf.common.util.EList;

import ucof.assignments.SuperAssignmentSetType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message To Target Assignment Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.assignments.database.MessageToTargetAssignmentSet#getMessageToTargetAssignment <em>Message To Target Assignment</em>}</li>
 * </ul>
 *
 * @see ucof.assignments.database.DatabasePackage#getMessageToTargetAssignmentSet()
 * @model
 * @generated
 */
public interface MessageToTargetAssignmentSet extends SuperAssignmentSetType {
	/**
	 * Returns the value of the '<em><b>Message To Target Assignment</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.assignments.database.MessageToTargetAssignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message To Target Assignment</em>' containment reference list.
	 * @see ucof.assignments.database.DatabasePackage#getMessageToTargetAssignmentSet_MessageToTargetAssignment()
	 * @model containment="true"
	 * @generated
	 */
	EList<MessageToTargetAssignment> getMessageToTargetAssignment();

} // MessageToTargetAssignmentSet
