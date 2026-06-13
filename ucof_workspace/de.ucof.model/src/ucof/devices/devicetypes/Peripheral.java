/**
 */
package ucof.devices.devicetypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Peripheral</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Any non-standardized peripheral device in an avionics platform, something like a 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.devicetypes.Peripheral#getPeripheralType <em>Peripheral Type</em>}</li>
 * </ul>
 *
 * @see ucof.devices.devicetypes.DevicetypesPackage#getPeripheral()
 * @model
 * @generated
 */
public interface Peripheral extends SuperA653ModuleType {
	/**
	 * Returns the value of the '<em><b>Peripheral Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peripheral Type</em>' attribute.
	 * @see #setPeripheralType(String)
	 * @see ucof.devices.devicetypes.DevicetypesPackage#getPeripheral_PeripheralType()
	 * @model
	 * @generated
	 */
	String getPeripheralType();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.Peripheral#getPeripheralType <em>Peripheral Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peripheral Type</em>' attribute.
	 * @see #getPeripheralType()
	 * @generated
	 */
	void setPeripheralType(String value);

} // Peripheral
