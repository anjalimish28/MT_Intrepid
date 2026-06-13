/**
 */
package ucof.devices.devicetypes.a653components.healthmanagement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partition Recovery Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container for Partition Recovery Action
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.PartitionRecoveryAction#getRecoveryAction <em>Recovery Action</em>}</li>
 * </ul>
 *
 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage#getPartitionRecoveryAction()
 * @model
 * @generated
 */
public interface PartitionRecoveryAction extends PartitionProcessLevelAction, ModulePartitionLevelAction {
	/**
	 * Returns the value of the '<em><b>Recovery Action</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.devices.devicetypes.a653components.healthmanagement.PartitionRecoveryActions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Recovery action to take when error level is PARTITION or when Error Handler is not created (IGNORE, IDLE, WARM_RESTART, COLD_RESTART).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recovery Action</em>' attribute.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.PartitionRecoveryActions
	 * @see #setRecoveryAction(PartitionRecoveryActions)
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage#getPartitionRecoveryAction_RecoveryAction()
	 * @model
	 * @generated
	 */
	PartitionRecoveryActions getRecoveryAction();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.healthmanagement.PartitionRecoveryAction#getRecoveryAction <em>Recovery Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recovery Action</em>' attribute.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.PartitionRecoveryActions
	 * @see #getRecoveryAction()
	 * @generated
	 */
	void setRecoveryAction(PartitionRecoveryActions value);

} // PartitionRecoveryAction
