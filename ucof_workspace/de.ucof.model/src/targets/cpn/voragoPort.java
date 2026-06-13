/**
 */
package targets.cpn;

import targets.SuperHardwarePortType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>vorago Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.cpn.voragoPort#getPinName <em>Pin Name</em>}</li>
 *   <li>{@link targets.cpn.voragoPort#getPinNumber <em>Pin Number</em>}</li>
 * </ul>
 *
 * @see targets.cpn.CpnPackage#getvoragoPort()
 * @model
 * @generated
 */
public interface voragoPort extends SuperHardwarePortType {
	/**
	 * Returns the value of the '<em><b>Pin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin Name</em>' attribute.
	 * @see #setPinName(String)
	 * @see targets.cpn.CpnPackage#getvoragoPort_PinName()
	 * @model
	 * @generated
	 */
	String getPinName();

	/**
	 * Sets the value of the '{@link targets.cpn.voragoPort#getPinName <em>Pin Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin Name</em>' attribute.
	 * @see #getPinName()
	 * @generated
	 */
	void setPinName(String value);

	/**
	 * Returns the value of the '<em><b>Pin Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin Number</em>' attribute.
	 * @see #setPinNumber(int)
	 * @see targets.cpn.CpnPackage#getvoragoPort_PinNumber()
	 * @model
	 * @generated
	 */
	int getPinNumber();

	/**
	 * Sets the value of the '{@link targets.cpn.voragoPort#getPinNumber <em>Pin Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin Number</em>' attribute.
	 * @see #getPinNumber()
	 * @generated
	 */
	void setPinNumber(int value);

} // voragoPort
