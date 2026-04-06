/**
 */
package ucof.devices.devicetypes.a653components.healthmanagement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Recovery Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container for Module Recovery Action
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.ModuleRecoveryAction#getRecoveryAction <em>Recovery Action</em>}</li>
 * </ul>
 *
 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage#getModuleRecoveryAction()
 * @model
 * @generated
 */
public interface ModuleRecoveryAction extends ModulePartitionLevelAction {
	/**
	 * Returns the value of the '<em><b>Recovery Action</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.devices.devicetypes.a653components.healthmanagement.ModuleRecoveryActions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recovery Action</em>' attribute.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ModuleRecoveryActions
	 * @see #setRecoveryAction(ModuleRecoveryActions)
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage#getModuleRecoveryAction_RecoveryAction()
	 * @model
	 * @generated
	 */
	ModuleRecoveryActions getRecoveryAction();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.healthmanagement.ModuleRecoveryAction#getRecoveryAction <em>Recovery Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recovery Action</em>' attribute.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ModuleRecoveryActions
	 * @see #getRecoveryAction()
	 * @generated
	 */
	void setRecoveryAction(ModuleRecoveryActions value);

} // ModuleRecoveryAction
