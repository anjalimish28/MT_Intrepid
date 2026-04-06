/**
 */
package ucof.assignments;

import org.eclipse.emf.common.util.EList;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignments</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.assignments.Assignments#getAssignmentSet <em>Assignment Set</em>}</li>
 * </ul>
 *
 * @see ucof.assignments.AssignmentsPackage#getAssignments()
 * @model
 * @generated
 */
public interface Assignments extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Assignment Set</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.assignments.SuperAssignmentSetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment Set</em>' containment reference list.
	 * @see ucof.assignments.AssignmentsPackage#getAssignments_AssignmentSet()
	 * @model containment="true"
	 * @generated
	 */
	EList<SuperAssignmentSetType> getAssignmentSet();

} // Assignments
