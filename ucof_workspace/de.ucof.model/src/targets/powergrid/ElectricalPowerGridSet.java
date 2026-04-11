/**
 */
package targets.powergrid;

import org.eclipse.emf.common.util.EList;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Electrical Power Grid Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.powergrid.ElectricalPowerGridSet#getElectricalGrid <em>Electrical Grid</em>}</li>
 * </ul>
 *
 * @see targets.powergrid.PowergridPackage#getElectricalPowerGridSet()
 * @model
 * @generated
 */
public interface ElectricalPowerGridSet extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Electrical Grid</b></em>' containment reference list.
	 * The list contents are of type {@link targets.powergrid.SuperElectricalGridType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electrical Grid</em>' containment reference list.
	 * @see targets.powergrid.PowergridPackage#getElectricalPowerGridSet_ElectricalGrid()
	 * @model containment="true"
	 * @generated
	 */
	EList<SuperElectricalGridType> getElectricalGrid();

} // ElectricalPowerGridSet
