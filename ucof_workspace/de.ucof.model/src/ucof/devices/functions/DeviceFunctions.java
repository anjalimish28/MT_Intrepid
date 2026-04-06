/**
 */
package ucof.devices.functions;

import org.eclipse.emf.common.util.EList;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Functions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.functions.DeviceFunctions#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see ucof.devices.functions.FunctionsPackage#getDeviceFunctions()
 * @model
 * @generated
 */
public interface DeviceFunctions extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.devices.functions.SuperFunctionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference list.
	 * @see ucof.devices.functions.FunctionsPackage#getDeviceFunctions_Function()
	 * @model containment="true"
	 * @generated
	 */
	EList<SuperFunctionType> getFunction();

} // DeviceFunctions
