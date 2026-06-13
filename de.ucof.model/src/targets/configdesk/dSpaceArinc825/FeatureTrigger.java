/**
 */
package targets.configdesk.dSpaceArinc825;

import ucof.common.enums.booleanType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.configdesk.dSpaceArinc825.FeatureTrigger#getTrigger <em>Trigger</em>}</li>
 * </ul>
 *
 * @see targets.configdesk.dSpaceArinc825.DSpaceArinc825Package#getFeatureTrigger()
 * @model
 * @generated
 */
public interface FeatureTrigger extends SuperFeatureType {
	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.booleanType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' attribute.
	 * @see ucof.common.enums.booleanType
	 * @see #setTrigger(booleanType)
	 * @see targets.configdesk.dSpaceArinc825.DSpaceArinc825Package#getFeatureTrigger_Trigger()
	 * @model
	 * @generated
	 */
	booleanType getTrigger();

	/**
	 * Sets the value of the '{@link targets.configdesk.dSpaceArinc825.FeatureTrigger#getTrigger <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' attribute.
	 * @see ucof.common.enums.booleanType
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(booleanType value);

} // FeatureTrigger
