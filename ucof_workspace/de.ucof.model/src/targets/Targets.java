/**
 */
package targets;

import org.eclipse.emf.common.util.EList;

import targets.powergrid.ElectricalPowerGridSet;
import targets.powergrid.PowerConnectionSet;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Targets</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.Targets#getTargetConfiguration <em>Target Configuration</em>}</li>
 *   <li>{@link targets.Targets#getPowerConnectionSet <em>Power Connection Set</em>}</li>
 *   <li>{@link targets.Targets#getElectricalPowerGridSet <em>Electrical Power Grid Set</em>}</li>
 * </ul>
 *
 * @see targets.TargetsPackage#getTargets()
 * @model
 * @generated
 */
public interface Targets extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Target Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link targets.SuperTargetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Configuration</em>' containment reference list.
	 * @see targets.TargetsPackage#getTargets_TargetConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	EList<SuperTargetType> getTargetConfiguration();

	/**
	 * Returns the value of the '<em><b>Power Connection Set</b></em>' containment reference list.
	 * The list contents are of type {@link targets.powergrid.PowerConnectionSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Connection Set</em>' containment reference list.
	 * @see targets.TargetsPackage#getTargets_PowerConnectionSet()
	 * @model containment="true"
	 * @generated
	 */
	EList<PowerConnectionSet> getPowerConnectionSet();

	/**
	 * Returns the value of the '<em><b>Electrical Power Grid Set</b></em>' containment reference list.
	 * The list contents are of type {@link targets.powergrid.ElectricalPowerGridSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electrical Power Grid Set</em>' containment reference list.
	 * @see targets.TargetsPackage#getTargets_ElectricalPowerGridSet()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElectricalPowerGridSet> getElectricalPowerGridSet();

} // Targets
