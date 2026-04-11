/**
 */
package targets.RDC;

import targets.SuperTargetType;
import targets.powergrid.SuperPowerType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>stm32f446re</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.RDC.stm32f446re#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see targets.RDC.RDCPackage#getstm32f446re()
 * @model
 * @generated
 */
public interface stm32f446re extends SuperTargetType, SuperPowerType {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference.
	 * @see #setPorts(stmPorts)
	 * @see targets.RDC.RDCPackage#getstm32f446re_Ports()
	 * @model containment="true"
	 * @generated
	 */
	stmPorts getPorts();

	/**
	 * Sets the value of the '{@link targets.RDC.stm32f446re#getPorts <em>Ports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ports</em>' containment reference.
	 * @see #getPorts()
	 * @generated
	 */
	void setPorts(stmPorts value);

} // stm32f446re
