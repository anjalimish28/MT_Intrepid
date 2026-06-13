/**
 */
package ucof.devices.devicetypes.a653components;

import org.eclipse.emf.common.util.EList;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container for the schedule elements
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.devicetypes.a653components.ModuleSchedule#getPartitionTimeWindow <em>Partition Time Window</em>}</li>
 * </ul>
 *
 * @see ucof.devices.devicetypes.a653components.A653componentsPackage#getModuleSchedule()
 * @model
 * @generated
 */
public interface ModuleSchedule extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Partition Time Window</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.devices.devicetypes.a653components.PartitionTimeWindow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partition Time Window</em>' containment reference list.
	 * @see ucof.devices.devicetypes.a653components.A653componentsPackage#getModuleSchedule_PartitionTimeWindow()
	 * @model containment="true"
	 * @generated
	 */
	EList<PartitionTimeWindow> getPartitionTimeWindow();

} // ModuleSchedule
