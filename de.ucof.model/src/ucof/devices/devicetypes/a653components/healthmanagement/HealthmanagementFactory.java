/**
 */
package ucof.devices.devicetypes.a653components.healthmanagement;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage
 * @generated
 */
public interface HealthmanagementFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HealthmanagementFactory eINSTANCE = ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Health Management</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Health Management</em>'.
	 * @generated
	 */
	HealthManagement createHealthManagement();

	/**
	 * Returns a new object of class '<em>Module Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Table</em>'.
	 * @generated
	 */
	ModuleTable createModuleTable();

	/**
	 * Returns a new object of class '<em>Multi Partition Tables</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Partition Tables</em>'.
	 * @generated
	 */
	MultiPartitionTables createMultiPartitionTables();

	/**
	 * Returns a new object of class '<em>Multi Partition Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Partition Table</em>'.
	 * @generated
	 */
	MultiPartitionTable createMultiPartitionTable();

	/**
	 * Returns a new object of class '<em>HM Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HM Table</em>'.
	 * @generated
	 */
	HMTable createHMTable();

	/**
	 * Returns a new object of class '<em>Error Info Super</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Info Super</em>'.
	 * @generated
	 */
	ErrorInfoSuper createErrorInfoSuper();

	/**
	 * Returns a new object of class '<em>Error Info Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Info Module</em>'.
	 * @generated
	 */
	ErrorInfoModule createErrorInfoModule();

	/**
	 * Returns a new object of class '<em>Erro Info Partition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Erro Info Partition</em>'.
	 * @generated
	 */
	ErroInfoPartition createErroInfoPartition();

	/**
	 * Returns a new object of class '<em>Error Info Multi Partition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Info Multi Partition</em>'.
	 * @generated
	 */
	ErrorInfoMultiPartition createErrorInfoMultiPartition();

	/**
	 * Returns a new object of class '<em>Module Recovery Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Recovery Action</em>'.
	 * @generated
	 */
	ModuleRecoveryAction createModuleRecoveryAction();

	/**
	 * Returns a new object of class '<em>Partition Recovery Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partition Recovery Action</em>'.
	 * @generated
	 */
	PartitionRecoveryAction createPartitionRecoveryAction();

	/**
	 * Returns a new object of class '<em>Process Revocery Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Revocery Action</em>'.
	 * @generated
	 */
	ProcessRevoceryAction createProcessRevoceryAction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HealthmanagementPackage getHealthmanagementPackage();

} //HealthmanagementFactory
