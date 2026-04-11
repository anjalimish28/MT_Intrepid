/**
 */
package targets.powergrid;

import ucof.assignments.SuperAssignmentType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.powergrid.PowerConnection#getResistance <em>Resistance</em>}</li>
 * </ul>
 *
 * @see targets.powergrid.PowergridPackage#getPowerConnection()
 * @model
 * @generated
 */
public interface PowerConnection extends SuperAssignmentType {
	/**
	 * Returns the value of the '<em><b>Resistance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resistance</em>' attribute.
	 * @see #setResistance(double)
	 * @see targets.powergrid.PowergridPackage#getPowerConnection_Resistance()
	 * @model
	 * @generated
	 */
	double getResistance();

	/**
	 * Sets the value of the '{@link targets.powergrid.PowerConnection#getResistance <em>Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resistance</em>' attribute.
	 * @see #getResistance()
	 * @generated
	 */
	void setResistance(double value);

} // PowerConnection
