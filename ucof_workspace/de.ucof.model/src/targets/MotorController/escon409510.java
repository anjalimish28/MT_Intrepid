/**
 */
package targets.MotorController;

import targets.SuperTargetType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>escon409510</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.MotorController.escon409510#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see targets.MotorController.MotorControllerPackage#getescon409510()
 * @model
 * @generated
 */
public interface escon409510 extends SuperTargetType {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference.
	 * @see #setPorts(esconPorts)
	 * @see targets.MotorController.MotorControllerPackage#getescon409510_Ports()
	 * @model containment="true"
	 * @generated
	 */
	esconPorts getPorts();

	/**
	 * Sets the value of the '{@link targets.MotorController.escon409510#getPorts <em>Ports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ports</em>' containment reference.
	 * @see #getPorts()
	 * @generated
	 */
	void setPorts(esconPorts value);

} // escon409510
