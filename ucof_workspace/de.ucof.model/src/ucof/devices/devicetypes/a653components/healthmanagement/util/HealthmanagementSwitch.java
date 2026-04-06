/**
 */
package ucof.devices.devicetypes.a653components.healthmanagement.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

import ucof.devices.devicetypes.a653components.healthmanagement.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage
 * @generated
 */
public class HealthmanagementSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HealthmanagementPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthmanagementSwitch() {
		if (modelPackage == null) {
			modelPackage = HealthmanagementPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case HealthmanagementPackage.HEALTH_MANAGEMENT: {
				HealthManagement healthManagement = (HealthManagement)theEObject;
				T result = caseHealthManagement(healthManagement);
				if (result == null) result = caseSuperIdentifierType(healthManagement);
				if (result == null) result = caseSuperTrackingType(healthManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HealthmanagementPackage.MODULE_TABLE: {
				ModuleTable moduleTable = (ModuleTable)theEObject;
				T result = caseModuleTable(moduleTable);
				if (result == null) result = caseSuperIdentifierType(moduleTable);
				if (result == null) result = caseSuperTrackingType(moduleTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HealthmanagementPackage.MULTI_PARTITION_TABLES: {
				MultiPartitionTables multiPartitionTables = (MultiPartitionTables)theEObject;
				T result = caseMultiPartitionTables(multiPartitionTables);
				if (result == null) result = caseSuperIdentifierType(multiPartitionTables);
				if (result == null) result = caseSuperTrackingType(multiPartitionTables);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HealthmanagementPackage.MULTI_PARTITION_TABLE: {
				MultiPartitionTable multiPartitionTable = (MultiPartitionTable)theEObject;
				T result = caseMultiPartitionTable(multiPartitionTable);
				if (result == null) result = caseSuperIdentifierType(multiPartitionTable);
				if (result == null) result = caseSuperTrackingType(multiPartitionTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HealthmanagementPackage.HM_TABLE: {
				HMTable hmTable = (HMTable)theEObject;
				T result = caseHMTable(hmTable);
				if (result == null) result = caseSuperIdentifierType(hmTable);
				if (result == null) result = caseSuperTrackingType(hmTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HealthmanagementPackage.ERROR_INFO_SUPER: {
				ErrorInfoSuper errorInfoSuper = (ErrorInfoSuper)theEObject;
				T result = caseErrorInfoSuper(errorInfoSuper);
				if (result == null) result = caseSuperIdentifierType(errorInfoSuper);
				if (result == null) result = caseSuperTrackingType(errorInfoSuper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HealthmanagementPackage.ERROR_INFO_MODULE: {
				ErrorInfoModule errorInfoModule = (ErrorInfoModule)theEObject;
				T result = caseErrorInfoModule(errorInfoModule);
				if (result == null) result = caseErrorInfoSuper(errorInfoModule);
				if (result == null) result = caseSuperIdentifierType(errorInfoModule);
				if (result == null) result = caseSuperTrackingType(errorInfoModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HealthmanagementPackage.ERRO_INFO_PARTITION: {
				ErroInfoPartition erroInfoPartition = (ErroInfoPartition)theEObject;
				T result = caseErroInfoPartition(erroInfoPartition);
				if (result == null) result = caseErrorInfoSuper(erroInfoPartition);
				if (result == null) result = caseSuperIdentifierType(erroInfoPartition);
				if (result == null) result = caseSuperTrackingType(erroInfoPartition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HealthmanagementPackage.ERROR_INFO_MULTI_PARTITION: {
				ErrorInfoMultiPartition errorInfoMultiPartition = (ErrorInfoMultiPartition)theEObject;
				T result = caseErrorInfoMultiPartition(errorInfoMultiPartition);
				if (result == null) result = caseErrorInfoSuper(errorInfoMultiPartition);
				if (result == null) result = caseSuperIdentifierType(errorInfoMultiPartition);
				if (result == null) result = caseSuperTrackingType(errorInfoMultiPartition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HealthmanagementPackage.MODULE_PARTITION_LEVEL_ACTION: {
				ModulePartitionLevelAction modulePartitionLevelAction = (ModulePartitionLevelAction)theEObject;
				T result = caseModulePartitionLevelAction(modulePartitionLevelAction);
				if (result == null) result = caseSuperIdentifierType(modulePartitionLevelAction);
				if (result == null) result = caseSuperTrackingType(modulePartitionLevelAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION: {
				PartitionProcessLevelAction partitionProcessLevelAction = (PartitionProcessLevelAction)theEObject;
				T result = casePartitionProcessLevelAction(partitionProcessLevelAction);
				if (result == null) result = caseSuperIdentifierType(partitionProcessLevelAction);
				if (result == null) result = caseSuperTrackingType(partitionProcessLevelAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HealthmanagementPackage.MODULE_RECOVERY_ACTION: {
				ModuleRecoveryAction moduleRecoveryAction = (ModuleRecoveryAction)theEObject;
				T result = caseModuleRecoveryAction(moduleRecoveryAction);
				if (result == null) result = caseModulePartitionLevelAction(moduleRecoveryAction);
				if (result == null) result = caseSuperIdentifierType(moduleRecoveryAction);
				if (result == null) result = caseSuperTrackingType(moduleRecoveryAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HealthmanagementPackage.PARTITION_RECOVERY_ACTION: {
				PartitionRecoveryAction partitionRecoveryAction = (PartitionRecoveryAction)theEObject;
				T result = casePartitionRecoveryAction(partitionRecoveryAction);
				if (result == null) result = casePartitionProcessLevelAction(partitionRecoveryAction);
				if (result == null) result = caseModulePartitionLevelAction(partitionRecoveryAction);
				if (result == null) result = caseSuperIdentifierType(partitionRecoveryAction);
				if (result == null) result = caseSuperTrackingType(partitionRecoveryAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HealthmanagementPackage.PROCESS_REVOCERY_ACTION: {
				ProcessRevoceryAction processRevoceryAction = (ProcessRevoceryAction)theEObject;
				T result = caseProcessRevoceryAction(processRevoceryAction);
				if (result == null) result = casePartitionProcessLevelAction(processRevoceryAction);
				if (result == null) result = caseSuperIdentifierType(processRevoceryAction);
				if (result == null) result = caseSuperTrackingType(processRevoceryAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Health Management</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Health Management</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHealthManagement(HealthManagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleTable(ModuleTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Partition Tables</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Partition Tables</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiPartitionTables(MultiPartitionTables object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Partition Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Partition Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiPartitionTable(MultiPartitionTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HM Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HM Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHMTable(HMTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Info Super</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Info Super</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorInfoSuper(ErrorInfoSuper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Info Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Info Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorInfoModule(ErrorInfoModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erro Info Partition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erro Info Partition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErroInfoPartition(ErroInfoPartition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Info Multi Partition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Info Multi Partition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorInfoMultiPartition(ErrorInfoMultiPartition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Partition Level Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Partition Level Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModulePartitionLevelAction(ModulePartitionLevelAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partition Process Level Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partition Process Level Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartitionProcessLevelAction(PartitionProcessLevelAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Recovery Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Recovery Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleRecoveryAction(ModuleRecoveryAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partition Recovery Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partition Recovery Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartitionRecoveryAction(PartitionRecoveryAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Revocery Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Revocery Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessRevoceryAction(ProcessRevoceryAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Identifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Identifier Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperIdentifierType(SuperIdentifierType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Tracking Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Tracking Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperTrackingType(SuperTrackingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //HealthmanagementSwitch
