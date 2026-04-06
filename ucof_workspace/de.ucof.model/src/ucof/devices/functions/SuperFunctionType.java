/**
 */
package ucof.devices.functions;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super Function Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.functions.SuperFunctionType#getFunctionLink <em>Function Link</em>}</li>
 * </ul>
 *
 * @see ucof.devices.functions.FunctionsPackage#getSuperFunctionType()
 * @model abstract="true"
 * @generated
 */
public interface SuperFunctionType extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Function Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Link</em>' containment reference.
	 * @see #setFunctionLink(FunctionLink)
	 * @see ucof.devices.functions.FunctionsPackage#getSuperFunctionType_FunctionLink()
	 * @model containment="true"
	 * @generated
	 */
	FunctionLink getFunctionLink();

	/**
	 * Sets the value of the '{@link ucof.devices.functions.SuperFunctionType#getFunctionLink <em>Function Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Link</em>' containment reference.
	 * @see #getFunctionLink()
	 * @generated
	 */
	void setFunctionLink(FunctionLink value);

} // SuperFunctionType
