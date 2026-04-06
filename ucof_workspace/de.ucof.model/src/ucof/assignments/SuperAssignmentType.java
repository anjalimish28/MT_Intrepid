/**
 */
package ucof.assignments;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super Assignment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Super type for each assignment >> Has the core sourceID and targetID attribute. The sourceID is assigned to the targetID
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.assignments.SuperAssignmentType#getSourceID <em>Source ID</em>}</li>
 *   <li>{@link ucof.assignments.SuperAssignmentType#getTargetID <em>Target ID</em>}</li>
 * </ul>
 *
 * @see ucof.assignments.AssignmentsPackage#getSuperAssignmentType()
 * @model abstract="true"
 * @generated
 */
public interface SuperAssignmentType extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source ID</em>' attribute.
	 * @see #setSourceID(String)
	 * @see ucof.assignments.AssignmentsPackage#getSuperAssignmentType_SourceID()
	 * @model dataType="ucof.common.edata.UUIDType"
	 * @generated
	 */
	String getSourceID();

	/**
	 * Sets the value of the '{@link ucof.assignments.SuperAssignmentType#getSourceID <em>Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source ID</em>' attribute.
	 * @see #getSourceID()
	 * @generated
	 */
	void setSourceID(String value);

	/**
	 * Returns the value of the '<em><b>Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target ID</em>' attribute.
	 * @see #setTargetID(String)
	 * @see ucof.assignments.AssignmentsPackage#getSuperAssignmentType_TargetID()
	 * @model dataType="ucof.common.edata.UUIDType"
	 * @generated
	 */
	String getTargetID();

	/**
	 * Sets the value of the '{@link ucof.assignments.SuperAssignmentType#getTargetID <em>Target ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target ID</em>' attribute.
	 * @see #getTargetID()
	 * @generated
	 */
	void setTargetID(String value);

} // SuperAssignmentType
