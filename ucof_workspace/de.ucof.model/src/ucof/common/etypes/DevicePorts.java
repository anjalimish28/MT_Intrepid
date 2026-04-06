/**
 */
package ucof.common.etypes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Ports</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.common.etypes.DevicePorts#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see ucof.common.etypes.EtypesPackage#getDevicePorts()
 * @model
 * @generated
 */
public interface DevicePorts extends SuperTrackingType, SuperIdentifierType {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.common.etypes.SuperInterCommunicationPortType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see ucof.common.etypes.EtypesPackage#getDevicePorts_Port()
	 * @model containment="true" upper="1024"
	 * @generated
	 */
	EList<SuperInterCommunicationPortType> getPort();

} // DevicePorts
