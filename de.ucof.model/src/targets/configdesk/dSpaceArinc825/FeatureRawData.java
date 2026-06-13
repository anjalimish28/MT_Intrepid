/**
 */
package targets.configdesk.dSpaceArinc825;

import ucof.common.enums.booleanType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Raw Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.configdesk.dSpaceArinc825.FeatureRawData#getRawDataModelAccess <em>Raw Data Model Access</em>}</li>
 * </ul>
 *
 * @see targets.configdesk.dSpaceArinc825.DSpaceArinc825Package#getFeatureRawData()
 * @model
 * @generated
 */
public interface FeatureRawData extends SuperFeatureType {
	/**
	 * Returns the value of the '<em><b>Raw Data Model Access</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.booleanType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raw Data Model Access</em>' attribute.
	 * @see ucof.common.enums.booleanType
	 * @see #setRawDataModelAccess(booleanType)
	 * @see targets.configdesk.dSpaceArinc825.DSpaceArinc825Package#getFeatureRawData_RawDataModelAccess()
	 * @model
	 * @generated
	 */
	booleanType getRawDataModelAccess();

	/**
	 * Sets the value of the '{@link targets.configdesk.dSpaceArinc825.FeatureRawData#getRawDataModelAccess <em>Raw Data Model Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raw Data Model Access</em>' attribute.
	 * @see ucof.common.enums.booleanType
	 * @see #getRawDataModelAccess()
	 * @generated
	 */
	void setRawDataModelAccess(booleanType value);

} // FeatureRawData
