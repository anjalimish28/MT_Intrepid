/**
 */
package targets.PowerRail;

import targets.SuperTargetType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>power Rail Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.PowerRail.powerRailTarget#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see targets.PowerRail.PowerRailPackage#getpowerRailTarget()
 * @model
 * @generated
 */
public interface powerRailTarget extends SuperTargetType {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference.
	 * @see #setPorts(powerRailPorts)
	 * @see targets.PowerRail.PowerRailPackage#getpowerRailTarget_Ports()
	 * @model containment="true"
	 * @generated
	 */
	powerRailPorts getPorts();

	/**
	 * Sets the value of the '{@link targets.PowerRail.powerRailTarget#getPorts <em>Ports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ports</em>' containment reference.
	 * @see #getPorts()
	 * @generated
	 */
	void setPorts(powerRailPorts value);

} // powerRailTarget
