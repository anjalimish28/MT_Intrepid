/**
 */
package targets.a653capabletarget;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super A653 Capable Target Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.a653capabletarget.SuperA653CapableTargetType#getOperatingSytem <em>Operating Sytem</em>}</li>
 * </ul>
 *
 * @see targets.a653capabletarget.A653capabletargetPackage#getSuperA653CapableTargetType()
 * @model abstract="true"
 * @generated
 */
public interface SuperA653CapableTargetType extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Operating Sytem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operating Sytem</em>' containment reference.
	 * @see #setOperatingSytem(OperatingSystem)
	 * @see targets.a653capabletarget.A653capabletargetPackage#getSuperA653CapableTargetType_OperatingSytem()
	 * @model containment="true"
	 * @generated
	 */
	OperatingSystem getOperatingSytem();

	/**
	 * Sets the value of the '{@link targets.a653capabletarget.SuperA653CapableTargetType#getOperatingSytem <em>Operating Sytem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operating Sytem</em>' containment reference.
	 * @see #getOperatingSytem()
	 * @generated
	 */
	void setOperatingSytem(OperatingSystem value);

} // SuperA653CapableTargetType
