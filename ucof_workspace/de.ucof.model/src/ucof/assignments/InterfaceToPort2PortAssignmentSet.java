/**
 */
package ucof.assignments;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface To Port2 Port Assignment Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.assignments.InterfaceToPort2PortAssignmentSet#getInterfaceToPortAssignment <em>Interface To Port Assignment</em>}</li>
 * </ul>
 *
 * @see ucof.assignments.AssignmentsPackage#getInterfaceToPort2PortAssignmentSet()
 * @model
 * @generated
 */
public interface InterfaceToPort2PortAssignmentSet extends SuperAssignmentSetType {
	/**
	 * Returns the value of the '<em><b>Interface To Port Assignment</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.assignments.InterfaceToPort2PortAssignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface To Port Assignment</em>' containment reference list.
	 * @see ucof.assignments.AssignmentsPackage#getInterfaceToPort2PortAssignmentSet_InterfaceToPortAssignment()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceToPort2PortAssignment> getInterfaceToPortAssignment();

} // InterfaceToPort2PortAssignmentSet
