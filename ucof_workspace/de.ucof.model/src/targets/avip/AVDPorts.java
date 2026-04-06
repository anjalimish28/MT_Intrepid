/**
 */
package targets.avip;

import org.eclipse.emf.common.util.EList;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AVD Ports</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.avip.AVDPorts#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see targets.avip.AvipPackage#getAVDPorts()
 * @model
 * @generated
 */
public interface AVDPorts extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link targets.avip.SuperAVDPortType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see targets.avip.AvipPackage#getAVDPorts_Port()
	 * @model containment="true"
	 * @generated
	 */
	EList<SuperAVDPortType> getPort();

} // AVDPorts
