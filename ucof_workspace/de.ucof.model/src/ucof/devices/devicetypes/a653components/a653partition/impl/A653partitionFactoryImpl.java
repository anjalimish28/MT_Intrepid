/**
 */
package ucof.devices.devicetypes.a653components.a653partition.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ucof.devices.devicetypes.a653components.a653partition.A653partitionFactory;
import ucof.devices.devicetypes.a653components.a653partition.A653partitionPackage;
import ucof.devices.devicetypes.a653components.a653partition.Criticality;
import ucof.devices.devicetypes.a653components.a653partition.ModulePartitions;
import ucof.devices.devicetypes.a653components.a653partition.Partition;
import ucof.devices.devicetypes.a653components.a653partition.ProcessDeadlineDefinition;
import ucof.devices.devicetypes.a653components.a653partition.ProcessSynchronicity;
import ucof.devices.devicetypes.a653components.a653partition.Processes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class A653partitionFactoryImpl extends EFactoryImpl implements A653partitionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static A653partitionFactory init() {
		try {
			A653partitionFactory theA653partitionFactory = (A653partitionFactory)EPackage.Registry.INSTANCE.getEFactory(A653partitionPackage.eNS_URI);
			if (theA653partitionFactory != null) {
				return theA653partitionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new A653partitionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A653partitionFactoryImpl() {
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
			case A653partitionPackage.MODULE_PARTITIONS: return createModulePartitions();
			case A653partitionPackage.PARTITION: return createPartition();
			case A653partitionPackage.PROCESSES: return createProcesses();
			case A653partitionPackage.PROCESS: return createProcess();
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
			case A653partitionPackage.PROCESS_DEADLINE_DEFINITION:
				return createProcessDeadlineDefinitionFromString(eDataType, initialValue);
			case A653partitionPackage.PROCESS_SYNCHRONICITY:
				return createProcessSynchronicityFromString(eDataType, initialValue);
			case A653partitionPackage.CRITICALITY:
				return createCriticalityFromString(eDataType, initialValue);
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
			case A653partitionPackage.PROCESS_DEADLINE_DEFINITION:
				return convertProcessDeadlineDefinitionToString(eDataType, instanceValue);
			case A653partitionPackage.PROCESS_SYNCHRONICITY:
				return convertProcessSynchronicityToString(eDataType, instanceValue);
			case A653partitionPackage.CRITICALITY:
				return convertCriticalityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModulePartitions createModulePartitions() {
		ModulePartitionsImpl modulePartitions = new ModulePartitionsImpl();
		return modulePartitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Partition createPartition() {
		PartitionImpl partition = new PartitionImpl();
		return partition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processes createProcesses() {
		ProcessesImpl processes = new ProcessesImpl();
		return processes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ucof.devices.devicetypes.a653components.a653partition.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessDeadlineDefinition createProcessDeadlineDefinitionFromString(EDataType eDataType, String initialValue) {
		ProcessDeadlineDefinition result = ProcessDeadlineDefinition.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessDeadlineDefinitionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessSynchronicity createProcessSynchronicityFromString(EDataType eDataType, String initialValue) {
		ProcessSynchronicity result = ProcessSynchronicity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessSynchronicityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Criticality createCriticalityFromString(EDataType eDataType, String initialValue) {
		Criticality result = Criticality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCriticalityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A653partitionPackage getA653partitionPackage() {
		return (A653partitionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static A653partitionPackage getPackage() {
		return A653partitionPackage.eINSTANCE;
	}

} //A653partitionFactoryImpl
