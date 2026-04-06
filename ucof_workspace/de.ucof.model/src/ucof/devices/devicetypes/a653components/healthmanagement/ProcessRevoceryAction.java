/**
 */
package ucof.devices.devicetypes.a653components.healthmanagement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Revocery Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container for Process Recovery Action
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.ProcessRevoceryAction#getErrorCode <em>Error Code</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.ProcessRevoceryAction#getRecoveryAction <em>Recovery Action</em>}</li>
 * </ul>
 *
 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage#getProcessRevoceryAction()
 * @model
 * @generated
 */
public interface ProcessRevoceryAction extends PartitionProcessLevelAction {
	/**
	 * Returns the value of the '<em><b>Error Code</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.devices.devicetypes.a653components.healthmanagement.ErrorCode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Error code to be provided to Error Handler process (DEADLINE_MISSED, APPLICATION_ERROR, NUMERIC_ERROR, ILLEGAL_REQUEST, STACK_OVERFLOW, MEMORY_VIOLATION, HARDWARE_FAULT, POWER_FAIL)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Code</em>' attribute.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ErrorCode
	 * @see #setErrorCode(ErrorCode)
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage#getProcessRevoceryAction_ErrorCode()
	 * @model
	 * @generated
	 */
	ErrorCode getErrorCode();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.healthmanagement.ProcessRevoceryAction#getErrorCode <em>Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Code</em>' attribute.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ErrorCode
	 * @see #getErrorCode()
	 * @generated
	 */
	void setErrorCode(ErrorCode value);

	/**
	 * Returns the value of the '<em><b>Recovery Action</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.devices.devicetypes.a653components.healthmanagement.ProcessRecoveryActions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recovery Action</em>' attribute.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ProcessRecoveryActions
	 * @see #setRecoveryAction(ProcessRecoveryActions)
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage#getProcessRevoceryAction_RecoveryAction()
	 * @model
	 * @generated
	 */
	ProcessRecoveryActions getRecoveryAction();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.healthmanagement.ProcessRevoceryAction#getRecoveryAction <em>Recovery Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recovery Action</em>' attribute.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ProcessRecoveryActions
	 * @see #getRecoveryAction()
	 * @generated
	 */
	void setRecoveryAction(ProcessRecoveryActions value);

} // ProcessRevoceryAction
