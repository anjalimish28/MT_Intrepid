/**
 */
package ucof.assignments.database;

import org.eclipse.emf.common.util.EList;

import ucof.assignments.SuperAssignmentSetType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payload To Target Assignment Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.assignments.database.PayloadToTargetAssignmentSet#getPayloadToTargetAssignment <em>Payload To Target Assignment</em>}</li>
 * </ul>
 *
 * @see ucof.assignments.database.DatabasePackage#getPayloadToTargetAssignmentSet()
 * @model
 * @generated
 */
public interface PayloadToTargetAssignmentSet extends SuperAssignmentSetType {
	/**
	 * Returns the value of the '<em><b>Payload To Target Assignment</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.assignments.database.PayloadToTargetAssignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payload To Target Assignment</em>' containment reference list.
	 * @see ucof.assignments.database.DatabasePackage#getPayloadToTargetAssignmentSet_PayloadToTargetAssignment()
	 * @model containment="true"
	 * @generated
	 */
	EList<PayloadToTargetAssignment> getPayloadToTargetAssignment();

} // PayloadToTargetAssignmentSet
