/**
 */
package ucof.assignments;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface To Hardware Assignment Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.assignments.InterfaceToHardwareAssignmentSet#getInterfaceToHardwareAssignment <em>Interface To Hardware Assignment</em>}</li>
 * </ul>
 *
 * @see ucof.assignments.AssignmentsPackage#getInterfaceToHardwareAssignmentSet()
 * @model
 * @generated
 */
public interface InterfaceToHardwareAssignmentSet extends SuperAssignmentSetType {
	/**
	 * Returns the value of the '<em><b>Interface To Hardware Assignment</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.assignments.InterfaceToHardwareAssignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface To Hardware Assignment</em>' containment reference list.
	 * @see ucof.assignments.AssignmentsPackage#getInterfaceToHardwareAssignmentSet_InterfaceToHardwareAssignment()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceToHardwareAssignment> getInterfaceToHardwareAssignment();

} // InterfaceToHardwareAssignmentSet
