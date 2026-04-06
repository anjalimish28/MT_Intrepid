/**
 */
package targets.HallSensor;

import org.eclipse.emf.common.util.EList;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>hall Ports</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.HallSensor.hallPorts#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see targets.HallSensor.HallSensorPackage#gethallPorts()
 * @model
 * @generated
 */
public interface hallPorts extends SuperTrackingType, SuperIdentifierType {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link targets.HallSensor.hallPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see targets.HallSensor.HallSensorPackage#gethallPorts_Port()
	 * @model containment="true"
	 * @generated
	 */
	EList<hallPort> getPort();

} // hallPorts
