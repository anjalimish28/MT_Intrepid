/**
 */
package ucof.devices.devicetypes.a653components.healthmanagement;

import org.eclipse.emf.common.util.EList;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * For error detection outside a partitione time window, defining recovery action, setting action according to the detected error and the system state, only one table per module
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.ModuleTable#getStateDescription <em>State Description</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.ModuleTable#getStateID <em>State ID</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.ModuleTable#getErrorInfo <em>Error Info</em>}</li>
 * </ul>
 *
 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage#getModuleTable()
 * @model
 * @generated
 */
public interface ModuleTable extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>State Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Module state identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State Description</em>' attribute.
	 * @see #setStateDescription(String)
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage#getModuleTable_StateDescription()
	 * @model
	 * @generated
	 */
	String getStateDescription();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.healthmanagement.ModuleTable#getStateDescription <em>State Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Description</em>' attribute.
	 * @see #getStateDescription()
	 * @generated
	 */
	void setStateDescription(String value);

	/**
	 * Returns the value of the '<em><b>State ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State ID</em>' attribute.
	 * @see #setStateID(String)
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage#getModuleTable_StateID()
	 * @model
	 * @generated
	 */
	String getStateID();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.healthmanagement.ModuleTable#getStateID <em>State ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State ID</em>' attribute.
	 * @see #getStateID()
	 * @generated
	 */
	void setStateID(String value);

	/**
	 * Returns the value of the '<em><b>Error Info</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.devices.devicetypes.a653components.healthmanagement.ErrorInfoModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Info</em>' containment reference list.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage#getModuleTable_ErrorInfo()
	 * @model containment="true"
	 * @generated
	 */
	EList<ErrorInfoModule> getErrorInfo();

} // ModuleTable
