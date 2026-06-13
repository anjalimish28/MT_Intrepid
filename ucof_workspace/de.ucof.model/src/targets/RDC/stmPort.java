/**
 */
package targets.rdc;

import targets.SuperHardwarePortType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>stm Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.rdc.stmPort#getPinName <em>Pin Name</em>}</li>
 *   <li>{@link targets.rdc.stmPort#getPinNumber <em>Pin Number</em>}</li>
 *   <li>{@link targets.rdc.stmPort#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see targets.rdc.RdcPackage#getstmPort()
 * @model
 * @generated
 */
public interface stmPort extends SuperHardwarePortType {
	/**
	 * Returns the value of the '<em><b>Pin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin Name</em>' attribute.
	 * @see #setPinName(String)
	 * @see targets.rdc.RdcPackage#getstmPort_PinName()
	 * @model
	 * @generated
	 */
	String getPinName();

	/**
	 * Sets the value of the '{@link targets.rdc.stmPort#getPinName <em>Pin Name</em>}' attribute.
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
	 * @see targets.rdc.RdcPackage#getstmPort_PinNumber()
	 * @model
	 * @generated
	 */
	int getPinNumber();

	/**
	 * Sets the value of the '{@link targets.rdc.stmPort#getPinNumber <em>Pin Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin Number</em>' attribute.
	 * @see #getPinNumber()
	 * @generated
	 */
	void setPinNumber(int value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(String)
	 * @see targets.rdc.RdcPackage#getstmPort_Size()
	 * @model
	 * @generated
	 */
	String getSize();

	/**
	 * Sets the value of the '{@link targets.rdc.stmPort#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(String value);

} // stmPort
