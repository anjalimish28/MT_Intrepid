/**
 */
package targets;

import ucof.common.enums.TargetDataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Datatype Conversion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.AttributeDatatypeConversion#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link targets.AttributeDatatypeConversion#getTargetDataType <em>Target Data Type</em>}</li>
 *   <li>{@link targets.AttributeDatatypeConversion#getValuePrefix <em>Value Prefix</em>}</li>
 *   <li>{@link targets.AttributeDatatypeConversion#getValuePostfix <em>Value Postfix</em>}</li>
 * </ul>
 *
 * @see targets.TargetsPackage#getAttributeDatatypeConversion()
 * @model
 * @generated
 */
public interface AttributeDatatypeConversion extends SuperAssignmentSpecificationType {
	/**
	 * Returns the value of the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Name</em>' attribute.
	 * @see #setAttributeName(String)
	 * @see targets.TargetsPackage#getAttributeDatatypeConversion_AttributeName()
	 * @model
	 * @generated
	 */
	String getAttributeName();

	/**
	 * Sets the value of the '{@link targets.AttributeDatatypeConversion#getAttributeName <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Name</em>' attribute.
	 * @see #getAttributeName()
	 * @generated
	 */
	void setAttributeName(String value);

	/**
	 * Returns the value of the '<em><b>Target Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.TargetDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Data Type</em>' attribute.
	 * @see ucof.common.enums.TargetDataType
	 * @see #setTargetDataType(TargetDataType)
	 * @see targets.TargetsPackage#getAttributeDatatypeConversion_TargetDataType()
	 * @model
	 * @generated
	 */
	TargetDataType getTargetDataType();

	/**
	 * Sets the value of the '{@link targets.AttributeDatatypeConversion#getTargetDataType <em>Target Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Data Type</em>' attribute.
	 * @see ucof.common.enums.TargetDataType
	 * @see #getTargetDataType()
	 * @generated
	 */
	void setTargetDataType(TargetDataType value);

	/**
	 * Returns the value of the '<em><b>Value Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Prefix</em>' attribute.
	 * @see #setValuePrefix(String)
	 * @see targets.TargetsPackage#getAttributeDatatypeConversion_ValuePrefix()
	 * @model
	 * @generated
	 */
	String getValuePrefix();

	/**
	 * Sets the value of the '{@link targets.AttributeDatatypeConversion#getValuePrefix <em>Value Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Prefix</em>' attribute.
	 * @see #getValuePrefix()
	 * @generated
	 */
	void setValuePrefix(String value);

	/**
	 * Returns the value of the '<em><b>Value Postfix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Postfix</em>' attribute.
	 * @see #setValuePostfix(String)
	 * @see targets.TargetsPackage#getAttributeDatatypeConversion_ValuePostfix()
	 * @model
	 * @generated
	 */
	String getValuePostfix();

	/**
	 * Sets the value of the '{@link targets.AttributeDatatypeConversion#getValuePostfix <em>Value Postfix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Postfix</em>' attribute.
	 * @see #getValuePostfix()
	 * @generated
	 */
	void setValuePostfix(String value);

} // AttributeDatatypeConversion
