/**
 */
package targets;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super Assignment Specification Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.SuperAssignmentSpecificationType#getReferencedAssignmentID <em>Referenced Assignment ID</em>}</li>
 * </ul>
 *
 * @see targets.TargetsPackage#getSuperAssignmentSpecificationType()
 * @model abstract="true"
 * @generated
 */
public interface SuperAssignmentSpecificationType extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Referenced Assignment ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Assignment ID</em>' attribute.
	 * @see #setReferencedAssignmentID(String)
	 * @see targets.TargetsPackage#getSuperAssignmentSpecificationType_ReferencedAssignmentID()
	 * @model dataType="ucof.common.edata.UUIDType"
	 * @generated
	 */
	String getReferencedAssignmentID();

	/**
	 * Sets the value of the '{@link targets.SuperAssignmentSpecificationType#getReferencedAssignmentID <em>Referenced Assignment ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Assignment ID</em>' attribute.
	 * @see #getReferencedAssignmentID()
	 * @generated
	 */
	void setReferencedAssignmentID(String value);

} // SuperAssignmentSpecificationType
