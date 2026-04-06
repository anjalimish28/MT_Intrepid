/**
 */
package targets;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resistor Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.ResistorInfo#getResistanceOhm <em>Resistance Ohm</em>}</li>
 *   <li>{@link targets.ResistorInfo#getResistorPartNumber <em>Resistor Part Number</em>}</li>
 *   <li>{@link targets.ResistorInfo#getMountLocation <em>Mount Location</em>}</li>
 * </ul>
 *
 * @see targets.TargetsPackage#getResistorInfo()
 * @model
 * @generated
 */
public interface ResistorInfo extends SuperAssignmentSpecificationType {
	/**
	 * Returns the value of the '<em><b>Resistance Ohm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resistance Ohm</em>' attribute.
	 * @see #setResistanceOhm(int)
	 * @see targets.TargetsPackage#getResistorInfo_ResistanceOhm()
	 * @model
	 * @generated
	 */
	int getResistanceOhm();

	/**
	 * Sets the value of the '{@link targets.ResistorInfo#getResistanceOhm <em>Resistance Ohm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resistance Ohm</em>' attribute.
	 * @see #getResistanceOhm()
	 * @generated
	 */
	void setResistanceOhm(int value);

	/**
	 * Returns the value of the '<em><b>Resistor Part Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resistor Part Number</em>' attribute.
	 * @see #setResistorPartNumber(String)
	 * @see targets.TargetsPackage#getResistorInfo_ResistorPartNumber()
	 * @model
	 * @generated
	 */
	String getResistorPartNumber();

	/**
	 * Sets the value of the '{@link targets.ResistorInfo#getResistorPartNumber <em>Resistor Part Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resistor Part Number</em>' attribute.
	 * @see #getResistorPartNumber()
	 * @generated
	 */
	void setResistorPartNumber(String value);

	/**
	 * Returns the value of the '<em><b>Mount Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mount Location</em>' attribute.
	 * @see #setMountLocation(String)
	 * @see targets.TargetsPackage#getResistorInfo_MountLocation()
	 * @model
	 * @generated
	 */
	String getMountLocation();

	/**
	 * Sets the value of the '{@link targets.ResistorInfo#getMountLocation <em>Mount Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mount Location</em>' attribute.
	 * @see #getMountLocation()
	 * @generated
	 */
	void setMountLocation(String value);

} // ResistorInfo
