/**
 */
package targets.avip;

import targets.SuperAssignmentSpecificationType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MEM Port ID Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.avip.MEMPortIDExtension#getPortID <em>Port ID</em>}</li>
 * </ul>
 *
 * @see targets.avip.AvipPackage#getMEMPortIDExtension()
 * @model
 * @generated
 */
public interface MEMPortIDExtension extends SuperAssignmentSpecificationType {
	/**
	 * Returns the value of the '<em><b>Port ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port ID</em>' attribute.
	 * @see #setPortID(int)
	 * @see targets.avip.AvipPackage#getMEMPortIDExtension_PortID()
	 * @model
	 * @generated
	 */
	int getPortID();

	/**
	 * Sets the value of the '{@link targets.avip.MEMPortIDExtension#getPortID <em>Port ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port ID</em>' attribute.
	 * @see #getPortID()
	 * @generated
	 */
	void setPortID(int value);

} // MEMPortIDExtension
