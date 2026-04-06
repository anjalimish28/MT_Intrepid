/**
 */
package targets.CCDPU;

import targets.SuperTargetType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>va41620peb1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.CCDPU.va41620peb1#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see targets.CCDPU.CCDPUPackage#getva41620peb1()
 * @model
 * @generated
 */
public interface va41620peb1 extends SuperTargetType {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference.
	 * @see #setPorts(voragoPorts)
	 * @see targets.CCDPU.CCDPUPackage#getva41620peb1_Ports()
	 * @model containment="true"
	 * @generated
	 */
	voragoPorts getPorts();

	/**
	 * Sets the value of the '{@link targets.CCDPU.va41620peb1#getPorts <em>Ports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ports</em>' containment reference.
	 * @see #getPorts()
	 * @generated
	 */
	void setPorts(voragoPorts value);

} // va41620peb1
