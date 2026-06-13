/**
 */
package targets.tricore299a653p4;

import targets.HardwareInformation;
import targets.SuperTargetType;

import targets.a653capabletarget.SuperA653CapableTargetType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tri Core299</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.tricore299a653p4.TriCore299#getIODriver <em>IO Driver</em>}</li>
 * </ul>
 *
 * @see targets.tricore299a653p4.Tricore299a653p4Package#getTriCore299()
 * @model
 * @generated
 */
public interface TriCore299 extends HardwareInformation, SuperA653CapableTargetType, SuperTargetType {
	/**
	 * Returns the value of the '<em><b>IO Driver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IO Driver</em>' containment reference.
	 * @see #setIODriver(SuperTriCore299IOHardwareType)
	 * @see targets.tricore299a653p4.Tricore299a653p4Package#getTriCore299_IODriver()
	 * @model containment="true"
	 * @generated
	 */
	SuperTriCore299IOHardwareType getIODriver();

	/**
	 * Sets the value of the '{@link targets.tricore299a653p4.TriCore299#getIODriver <em>IO Driver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IO Driver</em>' containment reference.
	 * @see #getIODriver()
	 * @generated
	 */
	void setIODriver(SuperTriCore299IOHardwareType value);

} // TriCore299
