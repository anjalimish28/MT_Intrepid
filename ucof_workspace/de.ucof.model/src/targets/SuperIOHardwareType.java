/**
 */
package targets;

import org.eclipse.emf.common.util.EList;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super IO Hardware Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.SuperIOHardwareType#getAssignmentSpecification <em>Assignment Specification</em>}</li>
 * </ul>
 *
 * @see targets.TargetsPackage#getSuperIOHardwareType()
 * @model abstract="true"
 * @generated
 */
public interface SuperIOHardwareType extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Assignment Specification</b></em>' containment reference list.
	 * The list contents are of type {@link targets.SuperAssignmentSpecificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment Specification</em>' containment reference list.
	 * @see targets.TargetsPackage#getSuperIOHardwareType_AssignmentSpecification()
	 * @model containment="true"
	 * @generated
	 */
	EList<SuperAssignmentSpecificationType> getAssignmentSpecification();

} // SuperIOHardwareType
