/**
 */
package ucof.assignments;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device To Implementation Assignment Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.assignments.DeviceToImplementationAssignmentSet#getDeviceToImplementationAssignment <em>Device To Implementation Assignment</em>}</li>
 * </ul>
 *
 * @see ucof.assignments.AssignmentsPackage#getDeviceToImplementationAssignmentSet()
 * @model
 * @generated
 */
public interface DeviceToImplementationAssignmentSet extends SuperAssignmentSetType {
	/**
	 * Returns the value of the '<em><b>Device To Implementation Assignment</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.assignments.DeviceToImplementationAssignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device To Implementation Assignment</em>' containment reference list.
	 * @see ucof.assignments.AssignmentsPackage#getDeviceToImplementationAssignmentSet_DeviceToImplementationAssignment()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeviceToImplementationAssignment> getDeviceToImplementationAssignment();

} // DeviceToImplementationAssignmentSet
