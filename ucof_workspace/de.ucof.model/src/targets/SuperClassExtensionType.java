/**
 */
package targets;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super Class Extension Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.SuperClassExtensionType#getExtendedClassID <em>Extended Class ID</em>}</li>
 * </ul>
 *
 * @see targets.TargetsPackage#getSuperClassExtensionType()
 * @model abstract="true"
 * @generated
 */
public interface SuperClassExtensionType extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Extended Class ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Class ID</em>' attribute.
	 * @see #setExtendedClassID(String)
	 * @see targets.TargetsPackage#getSuperClassExtensionType_ExtendedClassID()
	 * @model dataType="ucof.common.edata.UUIDType"
	 * @generated
	 */
	String getExtendedClassID();

	/**
	 * Sets the value of the '{@link targets.SuperClassExtensionType#getExtendedClassID <em>Extended Class ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Class ID</em>' attribute.
	 * @see #getExtendedClassID()
	 * @generated
	 */
	void setExtendedClassID(String value);

} // SuperClassExtensionType
