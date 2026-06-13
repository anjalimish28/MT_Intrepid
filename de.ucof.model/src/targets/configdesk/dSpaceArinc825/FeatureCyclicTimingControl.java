/**
 */
package targets.configdesk.dSpaceArinc825;

import ucof.common.enums.booleanType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Cyclic Timing Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.configdesk.dSpaceArinc825.FeatureCyclicTimingControl#getControlPeriodModelAccess <em>Control Period Model Access</em>}</li>
 *   <li>{@link targets.configdesk.dSpaceArinc825.FeatureCyclicTimingControl#getControlOffsetModelAccess <em>Control Offset Model Access</em>}</li>
 * </ul>
 *
 * @see targets.configdesk.dSpaceArinc825.DSpaceArinc825Package#getFeatureCyclicTimingControl()
 * @model
 * @generated
 */
public interface FeatureCyclicTimingControl extends SuperFeatureType {
	/**
	 * Returns the value of the '<em><b>Control Period Model Access</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.booleanType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Period Model Access</em>' attribute.
	 * @see ucof.common.enums.booleanType
	 * @see #setControlPeriodModelAccess(booleanType)
	 * @see targets.configdesk.dSpaceArinc825.DSpaceArinc825Package#getFeatureCyclicTimingControl_ControlPeriodModelAccess()
	 * @model
	 * @generated
	 */
	booleanType getControlPeriodModelAccess();

	/**
	 * Sets the value of the '{@link targets.configdesk.dSpaceArinc825.FeatureCyclicTimingControl#getControlPeriodModelAccess <em>Control Period Model Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Period Model Access</em>' attribute.
	 * @see ucof.common.enums.booleanType
	 * @see #getControlPeriodModelAccess()
	 * @generated
	 */
	void setControlPeriodModelAccess(booleanType value);

	/**
	 * Returns the value of the '<em><b>Control Offset Model Access</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.booleanType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Offset Model Access</em>' attribute.
	 * @see ucof.common.enums.booleanType
	 * @see #setControlOffsetModelAccess(booleanType)
	 * @see targets.configdesk.dSpaceArinc825.DSpaceArinc825Package#getFeatureCyclicTimingControl_ControlOffsetModelAccess()
	 * @model
	 * @generated
	 */
	booleanType getControlOffsetModelAccess();

	/**
	 * Sets the value of the '{@link targets.configdesk.dSpaceArinc825.FeatureCyclicTimingControl#getControlOffsetModelAccess <em>Control Offset Model Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Offset Model Access</em>' attribute.
	 * @see ucof.common.enums.booleanType
	 * @see #getControlOffsetModelAccess()
	 * @generated
	 */
	void setControlOffsetModelAccess(booleanType value);

} // FeatureCyclicTimingControl
