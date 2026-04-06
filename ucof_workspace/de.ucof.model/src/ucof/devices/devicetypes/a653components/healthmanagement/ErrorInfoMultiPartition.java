/**
 */
package ucof.devices.devicetypes.a653components.healthmanagement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Info Multi Partition</b></em>'.
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
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.ErrorInfoMultiPartition#getErrorLevel <em>Error Level</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.ErrorInfoMultiPartition#getRecoveryAction <em>Recovery Action</em>}</li>
 * </ul>
 *
 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage#getErrorInfoMultiPartition()
 * @model
 * @generated
 */
public interface ErrorInfoMultiPartition extends ErrorInfoSuper {
	/**
	 * Returns the value of the '<em><b>Error Level</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.devices.devicetypes.a653components.healthmanagement.ErrorLevelModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Level of the error (MODULE or PARTITION)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Level</em>' attribute.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ErrorLevelModule
	 * @see #setErrorLevel(ErrorLevelModule)
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage#getErrorInfoMultiPartition_ErrorLevel()
	 * @model
	 * @generated
	 */
	ErrorLevelModule getErrorLevel();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.healthmanagement.ErrorInfoMultiPartition#getErrorLevel <em>Error Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Level</em>' attribute.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ErrorLevelModule
	 * @see #getErrorLevel()
	 * @generated
	 */
	void setErrorLevel(ErrorLevelModule value);

	/**
	 * Returns the value of the '<em><b>Recovery Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recovery Action</em>' containment reference.
	 * @see #setRecoveryAction(ModulePartitionLevelAction)
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage#getErrorInfoMultiPartition_RecoveryAction()
	 * @model containment="true"
	 * @generated
	 */
	ModulePartitionLevelAction getRecoveryAction();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.healthmanagement.ErrorInfoMultiPartition#getRecoveryAction <em>Recovery Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recovery Action</em>' containment reference.
	 * @see #getRecoveryAction()
	 * @generated
	 */
	void setRecoveryAction(ModulePartitionLevelAction value);

} // ErrorInfoMultiPartition
