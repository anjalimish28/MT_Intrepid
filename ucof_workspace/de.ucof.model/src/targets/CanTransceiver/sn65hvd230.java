/**
 */
package targets.CanTransceiver;

import targets.SuperTargetType;
import targets.powergrid.SuperPowerType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>sn65hvd230</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.CanTransceiver.sn65hvd230#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see targets.CanTransceiver.CanTransceiverPackage#getsn65hvd230()
 * @model
 * @generated
 */
public interface sn65hvd230 extends SuperTargetType, SuperPowerType {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference.
	 * @see #setPorts(canTransceiverPorts)
	 * @see targets.CanTransceiver.CanTransceiverPackage#getsn65hvd230_Ports()
	 * @model containment="true"
	 * @generated
	 */
	canTransceiverPorts getPorts();

	/**
	 * Sets the value of the '{@link targets.CanTransceiver.sn65hvd230#getPorts <em>Ports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ports</em>' containment reference.
	 * @see #getPorts()
	 * @generated
	 */
	void setPorts(canTransceiverPorts value);

} // sn65hvd230
