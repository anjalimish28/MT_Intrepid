/**
 */
package ucof.devices;

import ucof.common.enums.ImplementationType;

import ucof.common.etypes.SuperDeviceType;

import ucof.devices.functions.DeviceFunctions;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super Platform Device Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract general device type
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.SuperPlatformDeviceType#getDeviceFunctions <em>Device Functions</em>}</li>
 *   <li>{@link ucof.devices.SuperPlatformDeviceType#getImplementationType <em>Implementation Type</em>}</li>
 * </ul>
 *
 * @see ucof.devices.DevicesPackage#getSuperPlatformDeviceType()
 * @model abstract="true"
 * @generated
 */
public interface SuperPlatformDeviceType extends SuperDeviceType {
	/**
	 * Returns the value of the '<em><b>Device Functions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference links to device functions, e.g. an application which can be integrated into device. Also can be used for creating simple routing functions
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Functions</em>' containment reference.
	 * @see #setDeviceFunctions(DeviceFunctions)
	 * @see ucof.devices.DevicesPackage#getSuperPlatformDeviceType_DeviceFunctions()
	 * @model containment="true"
	 * @generated
	 */
	DeviceFunctions getDeviceFunctions();

	/**
	 * Sets the value of the '{@link ucof.devices.SuperPlatformDeviceType#getDeviceFunctions <em>Device Functions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Functions</em>' containment reference.
	 * @see #getDeviceFunctions()
	 * @generated
	 */
	void setDeviceFunctions(DeviceFunctions value);

	/**
	 * Returns the value of the '<em><b>Implementation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.ImplementationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Type</em>' attribute.
	 * @see ucof.common.enums.ImplementationType
	 * @see #setImplementationType(ImplementationType)
	 * @see ucof.devices.DevicesPackage#getSuperPlatformDeviceType_ImplementationType()
	 * @model
	 * @generated
	 */
	ImplementationType getImplementationType();

	/**
	 * Sets the value of the '{@link ucof.devices.SuperPlatformDeviceType#getImplementationType <em>Implementation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Type</em>' attribute.
	 * @see ucof.common.enums.ImplementationType
	 * @see #getImplementationType()
	 * @generated
	 */
	void setImplementationType(ImplementationType value);

} // SuperPlatformDeviceType
