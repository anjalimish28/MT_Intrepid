/**
 */
package ucof.devices;

import org.eclipse.emf.common.util.EList;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Devices</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container for devices
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.Devices#getDevice <em>Device</em>}</li>
 * </ul>
 *
 * @see ucof.devices.DevicesPackage#getDevices()
 * @model
 * @generated
 */
public interface Devices extends SuperTrackingType, SuperIdentifierType {
	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.devices.SuperPlatformDeviceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' containment reference list.
	 * @see ucof.devices.DevicesPackage#getDevices_Device()
	 * @model containment="true"
	 * @generated
	 */
	EList<SuperPlatformDeviceType> getDevice();

} // Devices
