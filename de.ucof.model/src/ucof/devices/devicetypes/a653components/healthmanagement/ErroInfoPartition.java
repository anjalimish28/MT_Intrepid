/**
 */
package ucof.devices.devicetypes.a653components.healthmanagement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Erro Info Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * List of errors and their corresponding recovery actions.</xs:documentation>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.ErroInfoPartition#getErrorLevel <em>Error Level</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.ErroInfoPartition#getRecoveryAction <em>Recovery Action</em>}</li>
 * </ul>
 *
 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage#getErroInfoPartition()
 * @model
 * @generated
 */
public interface ErroInfoPartition extends ErrorInfoSuper {
	/**
	 * Returns the value of the '<em><b>Error Level</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.devices.devicetypes.a653components.healthmanagement.ErrorLevelPartition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Level of the error (PARTITION or PROCESS)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Level</em>' attribute.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ErrorLevelPartition
	 * @see #setErrorLevel(ErrorLevelPartition)
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage#getErroInfoPartition_ErrorLevel()
	 * @model
	 * @generated
	 */
	ErrorLevelPartition getErrorLevel();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.healthmanagement.ErroInfoPartition#getErrorLevel <em>Error Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Level</em>' attribute.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ErrorLevelPartition
	 * @see #getErrorLevel()
	 * @generated
	 */
	void setErrorLevel(ErrorLevelPartition value);

	/**
	 * Returns the value of the '<em><b>Recovery Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recovery Action</em>' containment reference.
	 * @see #setRecoveryAction(PartitionProcessLevelAction)
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage#getErroInfoPartition_RecoveryAction()
	 * @model containment="true"
	 * @generated
	 */
	PartitionProcessLevelAction getRecoveryAction();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.healthmanagement.ErroInfoPartition#getRecoveryAction <em>Recovery Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recovery Action</em>' containment reference.
	 * @see #getRecoveryAction()
	 * @generated
	 */
	void setRecoveryAction(PartitionProcessLevelAction value);

} // ErroInfoPartition
