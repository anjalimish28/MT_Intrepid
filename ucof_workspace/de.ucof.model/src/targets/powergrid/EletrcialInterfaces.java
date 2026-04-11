/**
 */
package targets.powergrid;

import org.eclipse.emf.common.util.EList;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eletrcial Interfaces</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.powergrid.EletrcialInterfaces#getElectricalInterface <em>Electrical Interface</em>}</li>
 * </ul>
 *
 * @see targets.powergrid.PowergridPackage#getEletrcialInterfaces()
 * @model
 * @generated
 */
public interface EletrcialInterfaces extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Electrical Interface</b></em>' containment reference list.
	 * The list contents are of type {@link targets.powergrid.SuperElectricalInterfaceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electrical Interface</em>' containment reference list.
	 * @see targets.powergrid.PowergridPackage#getEletrcialInterfaces_ElectricalInterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<SuperElectricalInterfaceType> getElectricalInterface();

} // EletrcialInterfaces
