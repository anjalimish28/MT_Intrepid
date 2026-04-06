/**
 */
package ucof.assignments.database;

import org.eclipse.emf.common.util.EList;

import ucof.assignments.SuperAssignmentSetType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal To Target Assignment Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.assignments.database.SignalToTargetAssignmentSet#getSignalToTargetAssignment <em>Signal To Target Assignment</em>}</li>
 * </ul>
 *
 * @see ucof.assignments.database.DatabasePackage#getSignalToTargetAssignmentSet()
 * @model
 * @generated
 */
public interface SignalToTargetAssignmentSet extends SuperAssignmentSetType {
	/**
	 * Returns the value of the '<em><b>Signal To Target Assignment</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.assignments.database.SignalToTargetAssignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal To Target Assignment</em>' containment reference list.
	 * @see ucof.assignments.database.DatabasePackage#getSignalToTargetAssignmentSet_SignalToTargetAssignment()
	 * @model containment="true"
	 * @generated
	 */
	EList<SignalToTargetAssignment> getSignalToTargetAssignment();

} // SignalToTargetAssignmentSet
