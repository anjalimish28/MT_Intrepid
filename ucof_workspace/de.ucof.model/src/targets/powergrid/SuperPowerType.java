/**
 */
package targets.powergrid;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super Power Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.powergrid.SuperPowerType#getElectricalInterfaces <em>Electrical Interfaces</em>}</li>
 * </ul>
 *
 * @see targets.powergrid.PowergridPackage#getSuperPowerType()
 * @model abstract="true"
 * @generated
 */
public interface SuperPowerType extends EObject {
	/**
	 * Returns the value of the '<em><b>Electrical Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electrical Interfaces</em>' containment reference.
	 * @see #setElectricalInterfaces(EletrcialInterfaces)
	 * @see targets.powergrid.PowergridPackage#getSuperPowerType_ElectricalInterfaces()
	 * @model containment="true"
	 * @generated
	 */
	EletrcialInterfaces getElectricalInterfaces();

	/**
	 * Sets the value of the '{@link targets.powergrid.SuperPowerType#getElectricalInterfaces <em>Electrical Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Electrical Interfaces</em>' containment reference.
	 * @see #getElectricalInterfaces()
	 * @generated
	 */
	void setElectricalInterfaces(EletrcialInterfaces value);

} // SuperPowerType
