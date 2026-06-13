/**
 */
package targets.configdesk.dSpaceArinc825;

import ucof.common.enums.booleanType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Model Access Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.configdesk.dSpaceArinc825.SignalModelAccessStatus#getModelAccessEnabled <em>Model Access Enabled</em>}</li>
 * </ul>
 *
 * @see targets.configdesk.dSpaceArinc825.DSpaceArinc825Package#getSignalModelAccessStatus()
 * @model
 * @generated
 */
public interface SignalModelAccessStatus extends SuperConfigurationDeskA825StatusExtensionType {
	/**
	 * Returns the value of the '<em><b>Model Access Enabled</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.booleanType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Access Enabled</em>' attribute.
	 * @see ucof.common.enums.booleanType
	 * @see #setModelAccessEnabled(booleanType)
	 * @see targets.configdesk.dSpaceArinc825.DSpaceArinc825Package#getSignalModelAccessStatus_ModelAccessEnabled()
	 * @model
	 * @generated
	 */
	booleanType getModelAccessEnabled();

	/**
	 * Sets the value of the '{@link targets.configdesk.dSpaceArinc825.SignalModelAccessStatus#getModelAccessEnabled <em>Model Access Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Access Enabled</em>' attribute.
	 * @see ucof.common.enums.booleanType
	 * @see #getModelAccessEnabled()
	 * @generated
	 */
	void setModelAccessEnabled(booleanType value);

} // SignalModelAccessStatus
