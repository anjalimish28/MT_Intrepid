/**
 */
package ucof.communication.comDevices;

import org.eclipse.emf.common.util.EList;

import ucof.common.etypes.SuperSetType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Devices</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.comDevices.CommunicationDevices#getCommunicationDevice <em>Communication Device</em>}</li>
 * </ul>
 *
 * @see ucof.communication.comDevices.ComDevicesPackage#getCommunicationDevices()
 * @model
 * @generated
 */
public interface CommunicationDevices extends SuperSetType {
	/**
	 * Returns the value of the '<em><b>Communication Device</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.communication.comDevices.SuperCommunicationDeviceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Device</em>' containment reference list.
	 * @see ucof.communication.comDevices.ComDevicesPackage#getCommunicationDevices_CommunicationDevice()
	 * @model containment="true"
	 * @generated
	 */
	EList<SuperCommunicationDeviceType> getCommunicationDevice();

} // CommunicationDevices
