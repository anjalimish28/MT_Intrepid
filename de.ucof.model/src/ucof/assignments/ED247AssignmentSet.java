/**
 */
package ucof.assignments;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ED247 Assignment Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.assignments.ED247AssignmentSet#getEd247Assignment <em>Ed247 Assignment</em>}</li>
 * </ul>
 *
 * @see ucof.assignments.AssignmentsPackage#getED247AssignmentSet()
 * @model
 * @generated
 */
public interface ED247AssignmentSet extends SuperAssignmentSetType {
	/**
	 * Returns the value of the '<em><b>Ed247 Assignment</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.assignments.ED247Assignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ed247 Assignment</em>' containment reference list.
	 * @see ucof.assignments.AssignmentsPackage#getED247AssignmentSet_Ed247Assignment()
	 * @model containment="true"
	 * @generated
	 */
	EList<ED247Assignment> getEd247Assignment();

} // ED247AssignmentSet
