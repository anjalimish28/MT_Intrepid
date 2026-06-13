/**
 */
package targets.cantransceiver;

import org.eclipse.emf.common.util.EList;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>can Transceiver Ports</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.cantransceiver.canTransceiverPorts#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see targets.cantransceiver.CantransceiverPackage#getcanTransceiverPorts()
 * @model
 * @generated
 */
public interface canTransceiverPorts extends SuperTrackingType, SuperIdentifierType {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link targets.cantransceiver.canTransceiverPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see targets.cantransceiver.CantransceiverPackage#getcanTransceiverPorts_Port()
	 * @model containment="true"
	 * @generated
	 */
	EList<canTransceiverPort> getPort();

} // canTransceiverPorts
