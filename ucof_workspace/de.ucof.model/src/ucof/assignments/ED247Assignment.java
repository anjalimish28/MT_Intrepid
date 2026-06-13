/**
 */
package ucof.assignments;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ED247 Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.assignments.ED247Assignment#getUdpSocketExtension <em>Udp Socket Extension</em>}</li>
 * </ul>
 *
 * @see ucof.assignments.AssignmentsPackage#getED247Assignment()
 * @model
 * @generated
 */
public interface ED247Assignment extends SuperAssignmentType {
	/**
	 * Returns the value of the '<em><b>Udp Socket Extension</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.assignments.UDPSocketExtension}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Udp Socket Extension</em>' containment reference list.
	 * @see ucof.assignments.AssignmentsPackage#getED247Assignment_UdpSocketExtension()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<UDPSocketExtension> getUdpSocketExtension();

} // ED247Assignment
