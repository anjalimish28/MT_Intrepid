/**
 */
package ucof.devices.functions;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Functions can be linked externally and fetched during integration on device, i.e. link to a specific file with integratable code 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.functions.FunctionLink#getFunctionFile <em>Function File</em>}</li>
 * </ul>
 *
 * @see ucof.devices.functions.FunctionsPackage#getFunctionLink()
 * @model
 * @generated
 */
public interface FunctionLink extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Function File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function File</em>' attribute.
	 * @see #setFunctionFile(String)
	 * @see ucof.devices.functions.FunctionsPackage#getFunctionLink_FunctionFile()
	 * @model
	 * @generated
	 */
	String getFunctionFile();

	/**
	 * Sets the value of the '{@link ucof.devices.functions.FunctionLink#getFunctionFile <em>Function File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function File</em>' attribute.
	 * @see #getFunctionFile()
	 * @generated
	 */
	void setFunctionFile(String value);

} // FunctionLink
