/**
 */
package ucof.devices.devicetypes;

import ucof.devices.SuperDeviceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Periphery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.devicetypes.Periphery#getPeripheryType <em>Periphery Type</em>}</li>
 * </ul>
 *
 * @see ucof.devices.devicetypes.DevicetypesPackage#getPeriphery()
 * @model
 * @generated
 */
public interface Periphery extends SuperDeviceType {
	/**
	 * Returns the value of the '<em><b>Periphery Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Periphery Type</em>' attribute.
	 * @see #setPeripheryType(String)
	 * @see ucof.devices.devicetypes.DevicetypesPackage#getPeriphery_PeripheryType()
	 * @model
	 * @generated
	 */
	String getPeripheryType();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.Periphery#getPeripheryType <em>Periphery Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Periphery Type</em>' attribute.
	 * @see #getPeripheryType()
	 * @generated
	 */
	void setPeripheryType(String value);

} // Periphery
