/**
 */
package targets.avip;

import ucof.common.enums.SingleDirectionType;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.avip.FunctionalData#getDirection <em>Direction</em>}</li>
 *   <li>{@link targets.avip.FunctionalData#getIf_signal <em>If signal</em>}</li>
 *   <li>{@link targets.avip.FunctionalData#getParam_type <em>Param type</em>}</li>
 *   <li>{@link targets.avip.FunctionalData#getParam_length <em>Param length</em>}</li>
 * </ul>
 *
 * @see targets.avip.AvipPackage#getFunctionalData()
 * @model
 * @generated
 */
public interface FunctionalData extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.SingleDirectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see ucof.common.enums.SingleDirectionType
	 * @see #setDirection(SingleDirectionType)
	 * @see targets.avip.AvipPackage#getFunctionalData_Direction()
	 * @model
	 * @generated
	 */
	SingleDirectionType getDirection();

	/**
	 * Sets the value of the '{@link targets.avip.FunctionalData#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see ucof.common.enums.SingleDirectionType
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(SingleDirectionType value);

	/**
	 * Returns the value of the '<em><b>If signal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If signal</em>' attribute.
	 * @see #setIf_signal(String)
	 * @see targets.avip.AvipPackage#getFunctionalData_If_signal()
	 * @model
	 * @generated
	 */
	String getIf_signal();

	/**
	 * Sets the value of the '{@link targets.avip.FunctionalData#getIf_signal <em>If signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If signal</em>' attribute.
	 * @see #getIf_signal()
	 * @generated
	 */
	void setIf_signal(String value);

	/**
	 * Returns the value of the '<em><b>Param type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param type</em>' attribute.
	 * @see #setParam_type(String)
	 * @see targets.avip.AvipPackage#getFunctionalData_Param_type()
	 * @model
	 * @generated
	 */
	String getParam_type();

	/**
	 * Sets the value of the '{@link targets.avip.FunctionalData#getParam_type <em>Param type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param type</em>' attribute.
	 * @see #getParam_type()
	 * @generated
	 */
	void setParam_type(String value);

	/**
	 * Returns the value of the '<em><b>Param length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param length</em>' attribute.
	 * @see #setParam_length(int)
	 * @see targets.avip.AvipPackage#getFunctionalData_Param_length()
	 * @model
	 * @generated
	 */
	int getParam_length();

	/**
	 * Sets the value of the '{@link targets.avip.FunctionalData#getParam_length <em>Param length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param length</em>' attribute.
	 * @see #getParam_length()
	 * @generated
	 */
	void setParam_length(int value);

} // FunctionalData
