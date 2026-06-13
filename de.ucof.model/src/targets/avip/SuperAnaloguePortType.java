/**
 */
package targets.avip;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super Analogue Port Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.avip.SuperAnaloguePortType#getMin_rev_v <em>Min rev v</em>}</li>
 * </ul>
 *
 * @see targets.avip.AvipPackage#getSuperAnaloguePortType()
 * @model abstract="true"
 * @generated
 */
public interface SuperAnaloguePortType extends SuperWiredPortType {
	/**
	 * Returns the value of the '<em><b>Min rev v</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min rev v</em>' attribute.
	 * @see #setMin_rev_v(float)
	 * @see targets.avip.AvipPackage#getSuperAnaloguePortType_Min_rev_v()
	 * @model
	 * @generated
	 */
	float getMin_rev_v();

	/**
	 * Sets the value of the '{@link targets.avip.SuperAnaloguePortType#getMin_rev_v <em>Min rev v</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min rev v</em>' attribute.
	 * @see #getMin_rev_v()
	 * @generated
	 */
	void setMin_rev_v(float value);

} // SuperAnaloguePortType
