/**
 */
package targets.HallSensor;

import targets.SuperTargetType;
import targets.powergrid.SuperPowerType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>mts360</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.HallSensor.mts360#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see targets.HallSensor.HallSensorPackage#getmts360()
 * @model
 * @generated
 */
public interface mts360 extends SuperTargetType, SuperPowerType {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference.
	 * @see #setPorts(hallPorts)
	 * @see targets.HallSensor.HallSensorPackage#getmts360_Ports()
	 * @model containment="true"
	 * @generated
	 */
	hallPorts getPorts();

	/**
	 * Sets the value of the '{@link targets.HallSensor.mts360#getPorts <em>Ports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ports</em>' containment reference.
	 * @see #getPorts()
	 * @generated
	 */
	void setPorts(hallPorts value);

} // mts360
