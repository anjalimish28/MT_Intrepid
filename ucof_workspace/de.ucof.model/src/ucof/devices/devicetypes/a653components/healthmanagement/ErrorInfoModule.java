/**
 */
package ucof.devices.devicetypes.a653components.healthmanagement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Info Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ARINC 653 Module HM table Type
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.ErrorInfoModule#getModuleRecoveryAction <em>Module Recovery Action</em>}</li>
 * </ul>
 *
 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage#getErrorInfoModule()
 * @model
 * @generated
 */
public interface ErrorInfoModule extends ErrorInfoSuper {
	/**
	 * Returns the value of the '<em><b>Module Recovery Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Recovery Action</em>' containment reference.
	 * @see #setModuleRecoveryAction(ModuleRecoveryAction)
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage#getErrorInfoModule_ModuleRecoveryAction()
	 * @model containment="true"
	 * @generated
	 */
	ModuleRecoveryAction getModuleRecoveryAction();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.healthmanagement.ErrorInfoModule#getModuleRecoveryAction <em>Module Recovery Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Recovery Action</em>' containment reference.
	 * @see #getModuleRecoveryAction()
	 * @generated
	 */
	void setModuleRecoveryAction(ModuleRecoveryAction value);

} // ErrorInfoModule
