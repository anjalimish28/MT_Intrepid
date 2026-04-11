/**
 */
package targets.Sheild;

import targets.SuperIOHardwareType;
import targets.SuperTargetType;
import targets.powergrid.SuperPowerType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>arduinosheild</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.Sheild.arduinosheild#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see targets.Sheild.SheildPackage#getarduinosheild()
 * @model
 * @generated
 */
public interface arduinosheild extends SuperTargetType, SuperIOHardwareType, SuperPowerType {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference.
	 * @see #setPorts(sheildPorts)
	 * @see targets.Sheild.SheildPackage#getarduinosheild_Ports()
	 * @model containment="true"
	 * @generated
	 */
	sheildPorts getPorts();

	/**
	 * Sets the value of the '{@link targets.Sheild.arduinosheild#getPorts <em>Ports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ports</em>' containment reference.
	 * @see #getPorts()
	 * @generated
	 */
	void setPorts(sheildPorts value);

} // arduinosheild
