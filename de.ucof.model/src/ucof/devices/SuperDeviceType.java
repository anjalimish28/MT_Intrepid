/**
 */
package ucof.devices;

import ucof.common.enums.ImplementationType;
import ucof.common.etypes.DevicePorts;
import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

import ucof.devices.functions.DeviceFunctions;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super Device Type</b></em>'.
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
 *   <li>{@link ucof.devices.SuperDeviceType#getConfigurationLink <em>Configuration Link</em>}</li>
 *   <li>{@link ucof.devices.SuperDeviceType#getDeviceFunctions <em>Device Functions</em>}</li>
 *   <li>{@link ucof.devices.SuperDeviceType#getPorts <em>Ports</em>}</li>
 *   <li>{@link ucof.devices.SuperDeviceType#getImplementationType <em>Implementation Type</em>}</li>
 * </ul>
 *
 * @see ucof.devices.DevicesPackage#getSuperDeviceType()
 * @model abstract="true"
 * @generated
 */
public interface SuperDeviceType extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Configuration Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Externally linked configuration possible, should be avoided though
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Configuration Link</em>' attribute.
	 * @see #setConfigurationLink(String)
	 * @see ucof.devices.DevicesPackage#getSuperDeviceType_ConfigurationLink()
	 * @model
	 * @generated
	 */
	String getConfigurationLink();

	/**
	 * Sets the value of the '{@link ucof.devices.SuperDeviceType#getConfigurationLink <em>Configuration Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Link</em>' attribute.
	 * @see #getConfigurationLink()
	 * @generated
	 */
	void setConfigurationLink(String value);

	/**
	 * Returns the value of the '<em><b>Device Functions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference links to device functions, e.g. an application which can be integrated into device. Also can be used for creating simple routing functions
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Functions</em>' containment reference.
	 * @see #setDeviceFunctions(DeviceFunctions)
	 * @see ucof.devices.DevicesPackage#getSuperDeviceType_DeviceFunctions()
	 * @model containment="true"
	 * @generated
	 */
	DeviceFunctions getDeviceFunctions();

	/**
	 * Sets the value of the '{@link ucof.devices.SuperDeviceType#getDeviceFunctions <em>Device Functions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Functions</em>' containment reference.
	 * @see #getDeviceFunctions()
	 * @generated
	 */
	void setDeviceFunctions(DeviceFunctions value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * I/O with which device communicates with other devices
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference.
	 * @see #setPorts(DevicePorts)
	 * @see ucof.devices.DevicesPackage#getSuperDeviceType_Ports()
	 * @model containment="true"
	 * @generated
	 */
	DevicePorts getPorts();

	/**
	 * Sets the value of the '{@link ucof.devices.SuperDeviceType#getPorts <em>Ports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ports</em>' containment reference.
	 * @see #getPorts()
	 * @generated
	 */
	void setPorts(DevicePorts value);

	/**
	 * Returns the value of the '<em><b>Implementation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.ImplementationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Type</em>' attribute.
	 * @see ucof.common.enums.ImplementationType
	 * @see #setImplementationType(ImplementationType)
	 * @see ucof.devices.DevicesPackage#getSuperDeviceType_ImplementationType()
	 * @model
	 * @generated
	 */
	ImplementationType getImplementationType();

	/**
	 * Sets the value of the '{@link ucof.devices.SuperDeviceType#getImplementationType <em>Implementation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Type</em>' attribute.
	 * @see ucof.common.enums.ImplementationType
	 * @see #getImplementationType()
	 * @generated
	 */
	void setImplementationType(ImplementationType value);

} // SuperDeviceType
