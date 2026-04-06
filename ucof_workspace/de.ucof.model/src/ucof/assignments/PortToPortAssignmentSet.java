/**
 */
package ucof.assignments;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port To Port Assignment Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.assignments.PortToPortAssignmentSet#getPortToPortAssignment <em>Port To Port Assignment</em>}</li>
 * </ul>
 *
 * @see ucof.assignments.AssignmentsPackage#getPortToPortAssignmentSet()
 * @model
 * @generated
 */
public interface PortToPortAssignmentSet extends SuperAssignmentSetType {
	/**
	 * Returns the value of the '<em><b>Port To Port Assignment</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.assignments.PortToPortAssignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port To Port Assignment</em>' containment reference list.
	 * @see ucof.assignments.AssignmentsPackage#getPortToPortAssignmentSet_PortToPortAssignment()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortToPortAssignment> getPortToPortAssignment();

} // PortToPortAssignmentSet
