/**
 */
package targets.configdesk.dSpaceArinc825;

import ucof.common.enums.booleanType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Enable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.configdesk.dSpaceArinc825.FeatureEnable#getEnableModelAccess <em>Enable Model Access</em>}</li>
 * </ul>
 *
 * @see targets.configdesk.dSpaceArinc825.DSpaceArinc825Package#getFeatureEnable()
 * @model
 * @generated
 */
public interface FeatureEnable extends SuperFeatureType {
	/**
	 * Returns the value of the '<em><b>Enable Model Access</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.booleanType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Model Access</em>' attribute.
	 * @see ucof.common.enums.booleanType
	 * @see #setEnableModelAccess(booleanType)
	 * @see targets.configdesk.dSpaceArinc825.DSpaceArinc825Package#getFeatureEnable_EnableModelAccess()
	 * @model
	 * @generated
	 */
	booleanType getEnableModelAccess();

	/**
	 * Sets the value of the '{@link targets.configdesk.dSpaceArinc825.FeatureEnable#getEnableModelAccess <em>Enable Model Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Model Access</em>' attribute.
	 * @see ucof.common.enums.booleanType
	 * @see #getEnableModelAccess()
	 * @generated
	 */
	void setEnableModelAccess(booleanType value);

} // FeatureEnable
