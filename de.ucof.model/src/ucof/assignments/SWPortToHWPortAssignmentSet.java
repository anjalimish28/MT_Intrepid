/**
 */
package ucof.assignments;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SW Port To HW Port Assignment Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.assignments.SWPortToHWPortAssignmentSet#getSwPortToHWPortAssignment <em>Sw Port To HW Port Assignment</em>}</li>
 * </ul>
 *
 * @see ucof.assignments.AssignmentsPackage#getSWPortToHWPortAssignmentSet()
 * @model
 * @generated
 */
public interface SWPortToHWPortAssignmentSet extends SuperAssignmentSetType {
	/**
	 * Returns the value of the '<em><b>Sw Port To HW Port Assignment</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.assignments.SWPortToHWPortAssignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sw Port To HW Port Assignment</em>' containment reference list.
	 * @see ucof.assignments.AssignmentsPackage#getSWPortToHWPortAssignmentSet_SwPortToHWPortAssignment()
	 * @model containment="true"
	 * @generated
	 */
	EList<SWPortToHWPortAssignment> getSwPortToHWPortAssignment();

} // SWPortToHWPortAssignmentSet
