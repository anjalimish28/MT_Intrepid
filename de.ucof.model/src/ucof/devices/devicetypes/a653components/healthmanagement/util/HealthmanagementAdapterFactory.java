/**
 */
package ucof.devices.devicetypes.a653components.healthmanagement.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

import ucof.devices.devicetypes.a653components.healthmanagement.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage
 * @generated
 */
public class HealthmanagementAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HealthmanagementPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthmanagementAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HealthmanagementPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthmanagementSwitch<Adapter> modelSwitch =
		new HealthmanagementSwitch<Adapter>() {
			@Override
			public Adapter caseHealthManagement(HealthManagement object) {
				return createHealthManagementAdapter();
			}
			@Override
			public Adapter caseModuleTable(ModuleTable object) {
				return createModuleTableAdapter();
			}
			@Override
			public Adapter caseMultiPartitionTables(MultiPartitionTables object) {
				return createMultiPartitionTablesAdapter();
			}
			@Override
			public Adapter caseMultiPartitionTable(MultiPartitionTable object) {
				return createMultiPartitionTableAdapter();
			}
			@Override
			public Adapter caseHMTable(HMTable object) {
				return createHMTableAdapter();
			}
			@Override
			public Adapter caseErrorInfoSuper(ErrorInfoSuper object) {
				return createErrorInfoSuperAdapter();
			}
			@Override
			public Adapter caseErrorInfoModule(ErrorInfoModule object) {
				return createErrorInfoModuleAdapter();
			}
			@Override
			public Adapter caseErroInfoPartition(ErroInfoPartition object) {
				return createErroInfoPartitionAdapter();
			}
			@Override
			public Adapter caseErrorInfoMultiPartition(ErrorInfoMultiPartition object) {
				return createErrorInfoMultiPartitionAdapter();
			}
			@Override
			public Adapter caseModulePartitionLevelAction(ModulePartitionLevelAction object) {
				return createModulePartitionLevelActionAdapter();
			}
			@Override
			public Adapter casePartitionProcessLevelAction(PartitionProcessLevelAction object) {
				return createPartitionProcessLevelActionAdapter();
			}
			@Override
			public Adapter caseModuleRecoveryAction(ModuleRecoveryAction object) {
				return createModuleRecoveryActionAdapter();
			}
			@Override
			public Adapter casePartitionRecoveryAction(PartitionRecoveryAction object) {
				return createPartitionRecoveryActionAdapter();
			}
			@Override
			public Adapter caseProcessRevoceryAction(ProcessRevoceryAction object) {
				return createProcessRevoceryActionAdapter();
			}
			@Override
			public Adapter caseSuperIdentifierType(SuperIdentifierType object) {
				return createSuperIdentifierTypeAdapter();
			}
			@Override
			public Adapter caseSuperTrackingType(SuperTrackingType object) {
				return createSuperTrackingTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ucof.devices.devicetypes.a653components.healthmanagement.HealthManagement <em>Health Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthManagement
	 * @generated
	 */
	public Adapter createHealthManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.devices.devicetypes.a653components.healthmanagement.ModuleTable <em>Module Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ModuleTable
	 * @generated
	 */
	public Adapter createModuleTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.devices.devicetypes.a653components.healthmanagement.MultiPartitionTables <em>Multi Partition Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.MultiPartitionTables
	 * @generated
	 */
	public Adapter createMultiPartitionTablesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.devices.devicetypes.a653components.healthmanagement.MultiPartitionTable <em>Multi Partition Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.MultiPartitionTable
	 * @generated
	 */
	public Adapter createMultiPartitionTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.devices.devicetypes.a653components.healthmanagement.HMTable <em>HM Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.HMTable
	 * @generated
	 */
	public Adapter createHMTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.devices.devicetypes.a653components.healthmanagement.ErrorInfoSuper <em>Error Info Super</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ErrorInfoSuper
	 * @generated
	 */
	public Adapter createErrorInfoSuperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.devices.devicetypes.a653components.healthmanagement.ErrorInfoModule <em>Error Info Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ErrorInfoModule
	 * @generated
	 */
	public Adapter createErrorInfoModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.devices.devicetypes.a653components.healthmanagement.ErroInfoPartition <em>Erro Info Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ErroInfoPartition
	 * @generated
	 */
	public Adapter createErroInfoPartitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.devices.devicetypes.a653components.healthmanagement.ErrorInfoMultiPartition <em>Error Info Multi Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ErrorInfoMultiPartition
	 * @generated
	 */
	public Adapter createErrorInfoMultiPartitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.devices.devicetypes.a653components.healthmanagement.ModulePartitionLevelAction <em>Module Partition Level Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ModulePartitionLevelAction
	 * @generated
	 */
	public Adapter createModulePartitionLevelActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.devices.devicetypes.a653components.healthmanagement.PartitionProcessLevelAction <em>Partition Process Level Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.PartitionProcessLevelAction
	 * @generated
	 */
	public Adapter createPartitionProcessLevelActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.devices.devicetypes.a653components.healthmanagement.ModuleRecoveryAction <em>Module Recovery Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ModuleRecoveryAction
	 * @generated
	 */
	public Adapter createModuleRecoveryActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.devices.devicetypes.a653components.healthmanagement.PartitionRecoveryAction <em>Partition Recovery Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.PartitionRecoveryAction
	 * @generated
	 */
	public Adapter createPartitionRecoveryActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.devices.devicetypes.a653components.healthmanagement.ProcessRevoceryAction <em>Process Revocery Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ProcessRevoceryAction
	 * @generated
	 */
	public Adapter createProcessRevoceryActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.common.etypes.SuperIdentifierType <em>Super Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.common.etypes.SuperIdentifierType
	 * @generated
	 */
	public Adapter createSuperIdentifierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.common.etypes.SuperTrackingType <em>Super Tracking Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.common.etypes.SuperTrackingType
	 * @generated
	 */
	public Adapter createSuperTrackingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //HealthmanagementAdapterFactory
