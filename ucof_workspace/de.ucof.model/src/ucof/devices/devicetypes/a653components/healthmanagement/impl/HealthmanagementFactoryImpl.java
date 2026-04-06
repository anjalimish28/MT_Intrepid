/**
 */
package ucof.devices.devicetypes.a653components.healthmanagement.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ucof.devices.devicetypes.a653components.healthmanagement.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HealthmanagementFactoryImpl extends EFactoryImpl implements HealthmanagementFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HealthmanagementFactory init() {
		try {
			HealthmanagementFactory theHealthmanagementFactory = (HealthmanagementFactory)EPackage.Registry.INSTANCE.getEFactory(HealthmanagementPackage.eNS_URI);
			if (theHealthmanagementFactory != null) {
				return theHealthmanagementFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HealthmanagementFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthmanagementFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HealthmanagementPackage.HEALTH_MANAGEMENT: return createHealthManagement();
			case HealthmanagementPackage.MODULE_TABLE: return createModuleTable();
			case HealthmanagementPackage.MULTI_PARTITION_TABLES: return createMultiPartitionTables();
			case HealthmanagementPackage.MULTI_PARTITION_TABLE: return createMultiPartitionTable();
			case HealthmanagementPackage.HM_TABLE: return createHMTable();
			case HealthmanagementPackage.ERROR_INFO_SUPER: return createErrorInfoSuper();
			case HealthmanagementPackage.ERROR_INFO_MODULE: return createErrorInfoModule();
			case HealthmanagementPackage.ERRO_INFO_PARTITION: return createErroInfoPartition();
			case HealthmanagementPackage.ERROR_INFO_MULTI_PARTITION: return createErrorInfoMultiPartition();
			case HealthmanagementPackage.MODULE_RECOVERY_ACTION: return createModuleRecoveryAction();
			case HealthmanagementPackage.PARTITION_RECOVERY_ACTION: return createPartitionRecoveryAction();
			case HealthmanagementPackage.PROCESS_REVOCERY_ACTION: return createProcessRevoceryAction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case HealthmanagementPackage.ERROR_CODE:
				return createErrorCodeFromString(eDataType, initialValue);
			case HealthmanagementPackage.ERROR_LEVEL_PARTITION:
				return createErrorLevelPartitionFromString(eDataType, initialValue);
			case HealthmanagementPackage.ERROR_LEVEL_MODULE:
				return createErrorLevelModuleFromString(eDataType, initialValue);
			case HealthmanagementPackage.MODULE_RECOVERY_ACTIONS:
				return createModuleRecoveryActionsFromString(eDataType, initialValue);
			case HealthmanagementPackage.PARTITION_RECOVERY_ACTIONS:
				return createPartitionRecoveryActionsFromString(eDataType, initialValue);
			case HealthmanagementPackage.PROCESS_RECOVERY_ACTIONS:
				return createProcessRecoveryActionsFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case HealthmanagementPackage.ERROR_CODE:
				return convertErrorCodeToString(eDataType, instanceValue);
			case HealthmanagementPackage.ERROR_LEVEL_PARTITION:
				return convertErrorLevelPartitionToString(eDataType, instanceValue);
			case HealthmanagementPackage.ERROR_LEVEL_MODULE:
				return convertErrorLevelModuleToString(eDataType, instanceValue);
			case HealthmanagementPackage.MODULE_RECOVERY_ACTIONS:
				return convertModuleRecoveryActionsToString(eDataType, instanceValue);
			case HealthmanagementPackage.PARTITION_RECOVERY_ACTIONS:
				return convertPartitionRecoveryActionsToString(eDataType, instanceValue);
			case HealthmanagementPackage.PROCESS_RECOVERY_ACTIONS:
				return convertProcessRecoveryActionsToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthManagement createHealthManagement() {
		HealthManagementImpl healthManagement = new HealthManagementImpl();
		return healthManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleTable createModuleTable() {
		ModuleTableImpl moduleTable = new ModuleTableImpl();
		return moduleTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiPartitionTables createMultiPartitionTables() {
		MultiPartitionTablesImpl multiPartitionTables = new MultiPartitionTablesImpl();
		return multiPartitionTables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiPartitionTable createMultiPartitionTable() {
		MultiPartitionTableImpl multiPartitionTable = new MultiPartitionTableImpl();
		return multiPartitionTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMTable createHMTable() {
		HMTableImpl hmTable = new HMTableImpl();
		return hmTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorInfoSuper createErrorInfoSuper() {
		ErrorInfoSuperImpl errorInfoSuper = new ErrorInfoSuperImpl();
		return errorInfoSuper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorInfoModule createErrorInfoModule() {
		ErrorInfoModuleImpl errorInfoModule = new ErrorInfoModuleImpl();
		return errorInfoModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErroInfoPartition createErroInfoPartition() {
		ErroInfoPartitionImpl erroInfoPartition = new ErroInfoPartitionImpl();
		return erroInfoPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorInfoMultiPartition createErrorInfoMultiPartition() {
		ErrorInfoMultiPartitionImpl errorInfoMultiPartition = new ErrorInfoMultiPartitionImpl();
		return errorInfoMultiPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleRecoveryAction createModuleRecoveryAction() {
		ModuleRecoveryActionImpl moduleRecoveryAction = new ModuleRecoveryActionImpl();
		return moduleRecoveryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionRecoveryAction createPartitionRecoveryAction() {
		PartitionRecoveryActionImpl partitionRecoveryAction = new PartitionRecoveryActionImpl();
		return partitionRecoveryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessRevoceryAction createProcessRevoceryAction() {
		ProcessRevoceryActionImpl processRevoceryAction = new ProcessRevoceryActionImpl();
		return processRevoceryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorCode createErrorCodeFromString(EDataType eDataType, String initialValue) {
		ErrorCode result = ErrorCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertErrorCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorLevelPartition createErrorLevelPartitionFromString(EDataType eDataType, String initialValue) {
		ErrorLevelPartition result = ErrorLevelPartition.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertErrorLevelPartitionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorLevelModule createErrorLevelModuleFromString(EDataType eDataType, String initialValue) {
		ErrorLevelModule result = ErrorLevelModule.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertErrorLevelModuleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleRecoveryActions createModuleRecoveryActionsFromString(EDataType eDataType, String initialValue) {
		ModuleRecoveryActions result = ModuleRecoveryActions.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModuleRecoveryActionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionRecoveryActions createPartitionRecoveryActionsFromString(EDataType eDataType, String initialValue) {
		PartitionRecoveryActions result = PartitionRecoveryActions.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPartitionRecoveryActionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessRecoveryActions createProcessRecoveryActionsFromString(EDataType eDataType, String initialValue) {
		ProcessRecoveryActions result = ProcessRecoveryActions.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessRecoveryActionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthmanagementPackage getHealthmanagementPackage() {
		return (HealthmanagementPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HealthmanagementPackage getPackage() {
		return HealthmanagementPackage.eINSTANCE;
	}

} //HealthmanagementFactoryImpl
