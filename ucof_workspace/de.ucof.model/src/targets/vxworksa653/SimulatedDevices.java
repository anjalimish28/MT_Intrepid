/**
 */
package targets.vxworksa653;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simulated Devices</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.vxworksa653.SimulatedDevices#getSimulatedDevices <em>Simulated Devices</em>}</li>
 * </ul>
 *
 * @see targets.vxworksa653.Vxworksa653Package#getSimulatedDevices()
 * @model
 * @generated
 */
public interface SimulatedDevices extends SuperVxWorksAssignmentSpecificationType {
	/**
	 * Returns the value of the '<em><b>Simulated Devices</b></em>' attribute list.
	 * The list contents are of type {@link targets.vxworksa653.SimulatedDevicesList}.
	 * The literals are from the enumeration {@link targets.vxworksa653.SimulatedDevicesList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulated Devices</em>' attribute list.
	 * @see targets.vxworksa653.SimulatedDevicesList
	 * @see targets.vxworksa653.Vxworksa653Package#getSimulatedDevices_SimulatedDevices()
	 * @model dataType="targets.vxworksa653.SimulatedDevicesList"
	 * @generated
	 */
	EList<SimulatedDevicesList> getSimulatedDevices();

} // SimulatedDevices
