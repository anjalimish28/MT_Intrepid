/**
 */
package ucof.devices.devicetypes;

import ucof.devices.SuperPlatformDeviceType;
import ucof.devices.devicetypes.a653components.ModuleSchedule;

import ucof.devices.devicetypes.a653components.a653partition.ModulePartitions;

import ucof.devices.devicetypes.a653components.healthmanagement.HealthManagement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super A653 Module Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract ARINC 653 module type, as P1 and P4 implementation share many similarities >> https://www.sae.org/standards/content/arinc653p1-5/
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.devicetypes.SuperA653ModuleType#getHealthManagement <em>Health Management</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.SuperA653ModuleType#getModuleSchedule <em>Module Schedule</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.SuperA653ModuleType#getPartitions <em>Partitions</em>}</li>
 * </ul>
 *
 * @see ucof.devices.devicetypes.DevicetypesPackage#getSuperA653ModuleType()
 * @model abstract="true"
 * @generated
 */
public interface SuperA653ModuleType extends SuperPlatformDeviceType {
	/**
	 * Returns the value of the '<em><b>Health Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Health Management</em>' containment reference.
	 * @see #setHealthManagement(HealthManagement)
	 * @see ucof.devices.devicetypes.DevicetypesPackage#getSuperA653ModuleType_HealthManagement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	HealthManagement getHealthManagement();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.SuperA653ModuleType#getHealthManagement <em>Health Management</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Health Management</em>' containment reference.
	 * @see #getHealthManagement()
	 * @generated
	 */
	void setHealthManagement(HealthManagement value);

	/**
	 * Returns the value of the '<em><b>Module Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Schedule</em>' containment reference.
	 * @see #setModuleSchedule(ModuleSchedule)
	 * @see ucof.devices.devicetypes.DevicetypesPackage#getSuperA653ModuleType_ModuleSchedule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ModuleSchedule getModuleSchedule();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.SuperA653ModuleType#getModuleSchedule <em>Module Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Schedule</em>' containment reference.
	 * @see #getModuleSchedule()
	 * @generated
	 */
	void setModuleSchedule(ModuleSchedule value);

	/**
	 * Returns the value of the '<em><b>Partitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partitions</em>' containment reference.
	 * @see #setPartitions(ModulePartitions)
	 * @see ucof.devices.devicetypes.DevicetypesPackage#getSuperA653ModuleType_Partitions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ModulePartitions getPartitions();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.SuperA653ModuleType#getPartitions <em>Partitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partitions</em>' containment reference.
	 * @see #getPartitions()
	 * @generated
	 */
	void setPartitions(ModulePartitions value);

} // SuperA653ModuleType
