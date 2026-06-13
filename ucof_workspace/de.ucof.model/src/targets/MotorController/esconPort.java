/**
 */
package targets.motorcontroller;

import targets.SuperHardwarePortType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>escon Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.motorcontroller.esconPort#getPinName <em>Pin Name</em>}</li>
 * </ul>
 *
 * @see targets.motorcontroller.MotorcontrollerPackage#getesconPort()
 * @model
 * @generated
 */
public interface esconPort extends SuperHardwarePortType {
	/**
	 * Returns the value of the '<em><b>Pin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin Name</em>' attribute.
	 * @see #setPinName(String)
	 * @see targets.motorcontroller.MotorcontrollerPackage#getesconPort_PinName()
	 * @model
	 * @generated
	 */
	String getPinName();

	/**
	 * Sets the value of the '{@link targets.motorcontroller.esconPort#getPinName <em>Pin Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin Name</em>' attribute.
	 * @see #getPinName()
	 * @generated
	 */
	void setPinName(String value);

} // esconPort
