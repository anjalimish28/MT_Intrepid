/**
 */
package ucof.devices.devicetypes.a653components.a653partition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import ucof.common.etypes.EtypesPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ucof.devices.devicetypes.a653components.a653partition.A653partitionFactory
 * @model kind="package"
 * @generated
 */
public interface A653partitionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "a653partition";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://gitlab.com/ucof/ucof.de/model/v001/ucof/devices/devicetypes/a653components/a653partition";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ucof.model.a653partition";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	A653partitionPackage eINSTANCE = ucof.devices.devicetypes.a653components.a653partition.impl.A653partitionPackageImpl.init();

	/**
	 * The meta object id for the '{@link ucof.devices.devicetypes.a653components.a653partition.impl.ModulePartitionsImpl <em>Module Partitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.devicetypes.a653components.a653partition.impl.ModulePartitionsImpl
	 * @see ucof.devices.devicetypes.a653components.a653partition.impl.A653partitionPackageImpl#getModulePartitions()
	 * @generated
	 */
	int MODULE_PARTITIONS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PARTITIONS__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PARTITIONS__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Partition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PARTITIONS__PARTITION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module Partitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PARTITIONS_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Module Partitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PARTITIONS_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.devices.devicetypes.a653components.a653partition.impl.PartitionImpl <em>Partition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.devicetypes.a653components.a653partition.impl.PartitionImpl
	 * @see ucof.devices.devicetypes.a653components.a653partition.impl.A653partitionPackageImpl#getPartition()
	 * @generated
	 */
	int PARTITION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__CRITICALITY = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Entry Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__ENTRY_POINT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Partition Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__PARTITION_PERIOD = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__MEMORY = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Hm Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__HM_TABLE = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Partition Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__PARTITION_PORTS = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__PROCESSES = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__OFFSET = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.devices.devicetypes.a653components.a653partition.impl.ProcessesImpl <em>Processes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.devicetypes.a653components.a653partition.impl.ProcessesImpl
	 * @see ucof.devices.devicetypes.a653components.a653partition.impl.A653partitionPackageImpl#getProcesses()
	 * @generated
	 */
	int PROCESSES = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSES__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSES__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSES__PROCESS = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Processes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSES_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Processes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSES_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.devices.devicetypes.a653components.a653partition.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.devicetypes.a653components.a653partition.impl.ProcessImpl
	 * @see ucof.devices.devicetypes.a653components.a653partition.impl.A653partitionPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Entry Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ENTRY_POINT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Stack Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__STACK_SIZE = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Base Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__BASE_PRIORITY = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PERIOD = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Time Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__TIME_CAPACITY = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DEADLINE = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Synchronicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__SYNCHRONICITY = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DURATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Process Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PROCESS_PORTS = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__OFFSET = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 17;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.devices.devicetypes.a653components.a653partition.ProcessDeadlineDefinition <em>Process Deadline Definition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.devicetypes.a653components.a653partition.ProcessDeadlineDefinition
	 * @see ucof.devices.devicetypes.a653components.a653partition.impl.A653partitionPackageImpl#getProcessDeadlineDefinition()
	 * @generated
	 */
	int PROCESS_DEADLINE_DEFINITION = 4;

	/**
	 * The meta object id for the '{@link ucof.devices.devicetypes.a653components.a653partition.ProcessSynchronicity <em>Process Synchronicity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.devicetypes.a653components.a653partition.ProcessSynchronicity
	 * @see ucof.devices.devicetypes.a653components.a653partition.impl.A653partitionPackageImpl#getProcessSynchronicity()
	 * @generated
	 */
	int PROCESS_SYNCHRONICITY = 5;

	/**
	 * The meta object id for the '{@link ucof.devices.devicetypes.a653components.a653partition.Criticality <em>Criticality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.devicetypes.a653components.a653partition.Criticality
	 * @see ucof.devices.devicetypes.a653components.a653partition.impl.A653partitionPackageImpl#getCriticality()
	 * @generated
	 */
	int CRITICALITY = 6;


	/**
	 * Returns the meta object for class '{@link ucof.devices.devicetypes.a653components.a653partition.ModulePartitions <em>Module Partitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Partitions</em>'.
	 * @see ucof.devices.devicetypes.a653components.a653partition.ModulePartitions
	 * @generated
	 */
	EClass getModulePartitions();

	/**
	 * Returns the meta object for the containment reference list '{@link ucof.devices.devicetypes.a653components.a653partition.ModulePartitions#getPartition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Partition</em>'.
	 * @see ucof.devices.devicetypes.a653components.a653partition.ModulePartitions#getPartition()
	 * @see #getModulePartitions()
	 * @generated
	 */
	EReference getModulePartitions_Partition();

	/**
	 * Returns the meta object for class '{@link ucof.devices.devicetypes.a653components.a653partition.Partition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partition</em>'.
	 * @see ucof.devices.devicetypes.a653components.a653partition.Partition
	 * @generated
	 */
	EClass getPartition();

	/**
	 * Returns the meta object for the attribute '{@link ucof.devices.devicetypes.a653components.a653partition.Partition#getCriticality <em>Criticality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Criticality</em>'.
	 * @see ucof.devices.devicetypes.a653components.a653partition.Partition#getCriticality()
	 * @see #getPartition()
	 * @generated
	 */
	EAttribute getPartition_Criticality();

	/**
	 * Returns the meta object for the attribute '{@link ucof.devices.devicetypes.a653components.a653partition.Partition#getEntryPoint <em>Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry Point</em>'.
	 * @see ucof.devices.devicetypes.a653components.a653partition.Partition#getEntryPoint()
	 * @see #getPartition()
	 * @generated
	 */
	EAttribute getPartition_EntryPoint();

	/**
	 * Returns the meta object for the attribute '{@link ucof.devices.devicetypes.a653components.a653partition.Partition#getPartitionPeriod <em>Partition Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partition Period</em>'.
	 * @see ucof.devices.devicetypes.a653components.a653partition.Partition#getPartitionPeriod()
	 * @see #getPartition()
	 * @generated
	 */
	EAttribute getPartition_PartitionPeriod();

	/**
	 * Returns the meta object for the containment reference '{@link ucof.devices.devicetypes.a653components.a653partition.Partition#getMemory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Memory</em>'.
	 * @see ucof.devices.devicetypes.a653components.a653partition.Partition#getMemory()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_Memory();

	/**
	 * Returns the meta object for the containment reference '{@link ucof.devices.devicetypes.a653components.a653partition.Partition#getHmTable <em>Hm Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hm Table</em>'.
	 * @see ucof.devices.devicetypes.a653components.a653partition.Partition#getHmTable()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_HmTable();

	/**
	 * Returns the meta object for the containment reference '{@link ucof.devices.devicetypes.a653components.a653partition.Partition#getPartitionPorts <em>Partition Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Partition Ports</em>'.
	 * @see ucof.devices.devicetypes.a653components.a653partition.Partition#getPartitionPorts()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_PartitionPorts();

	/**
	 * Returns the meta object for the containment reference '{@link ucof.devices.devicetypes.a653components.a653partition.Partition#getProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Processes</em>'.
	 * @see ucof.devices.devicetypes.a653components.a653partition.Partition#getProcesses()
	 * @see #getPartition()
	 * @generated
	 */
	EReference getPartition_Processes();

	/**
	 * Returns the meta object for the attribute '{@link ucof.devices.devicetypes.a653components.a653partition.Partition#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see ucof.devices.devicetypes.a653components.a653partition.Partition#getOffset()
	 * @see #getPartition()
	 * @generated
	 */
	EAttribute getPartition_Offset();

	/**
	 * Returns the meta object for class '{@link ucof.devices.devicetypes.a653components.a653partition.Processes <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processes</em>'.
	 * @see ucof.devices.devicetypes.a653components.a653partition.Processes
	 * @generated
	 */
	EClass getProcesses();

	/**
	 * Returns the meta object for the containment reference list '{@link ucof.devices.devicetypes.a653components.a653partition.Processes#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process</em>'.
	 * @see ucof.devices.devicetypes.a653components.a653partition.Processes#getProcess()
	 * @see #getProcesses()
	 * @generated
	 */
	EReference getProcesses_Process();

	/**
	 * Returns the meta object for class '{@link ucof.devices.devicetypes.a653components.a653partition.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see ucof.devices.devicetypes.a653components.a653partition.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the attribute '{@link ucof.devices.devicetypes.a653components.a653partition.Process#getEntryPoint <em>Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry Point</em>'.
	 * @see ucof.devices.devicetypes.a653components.a653partition.Process#getEntryPoint()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_EntryPoint();

	/**
	 * Returns the meta object for the attribute '{@link ucof.devices.devicetypes.a653components.a653partition.Process#getStackSize <em>Stack Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stack Size</em>'.
	 * @see ucof.devices.devicetypes.a653components.a653partition.Process#getStackSize()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_StackSize();

	/**
	 * Returns the meta object for the attribute '{@link ucof.devices.devicetypes.a653components.a653partition.Process#getBasePriority <em>Base Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Priority</em>'.
	 * @see ucof.devices.devicetypes.a653components.a653partition.Process#getBasePriority()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_BasePriority();

	/**
	 * Returns the meta object for the attribute '{@link ucof.devices.devicetypes.a653components.a653partition.Process#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see ucof.devices.devicetypes.a653components.a653partition.Process#getPeriod()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Period();

	/**
	 * Returns the meta object for the attribute '{@link ucof.devices.devicetypes.a653components.a653partition.Process#getTimeCapacity <em>Time Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Capacity</em>'.
	 * @see ucof.devices.devicetypes.a653components.a653partition.Process#getTimeCapacity()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_TimeCapacity();

	/**
	 * Returns the meta object for the attribute '{@link ucof.devices.devicetypes.a653components.a653partition.Process#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deadline</em>'.
	 * @see ucof.devices.devicetypes.a653components.a653partition.Process#getDeadline()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Deadline();

	/**
	 * Returns the meta object for the attribute '{@link ucof.devices.devicetypes.a653components.a653partition.Process#getSynchronicity <em>Synchronicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synchronicity</em>'.
	 * @see ucof.devices.devicetypes.a653components.a653partition.Process#getSynchronicity()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Synchronicity();

	/**
	 * Returns the meta object for the attribute '{@link ucof.devices.devicetypes.a653components.a653partition.Process#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see ucof.devices.devicetypes.a653components.a653partition.Process#getDuration()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Duration();

	/**
	 * Returns the meta object for the containment reference '{@link ucof.devices.devicetypes.a653components.a653partition.Process#getProcessPorts <em>Process Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Process Ports</em>'.
	 * @see ucof.devices.devicetypes.a653components.a653partition.Process#getProcessPorts()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_ProcessPorts();

	/**
	 * Returns the meta object for the attribute '{@link ucof.devices.devicetypes.a653components.a653partition.Process#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see ucof.devices.devicetypes.a653components.a653partition.Process#getOffset()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Offset();

	/**
	 * Returns the meta object for enum '{@link ucof.devices.devicetypes.a653components.a653partition.ProcessDeadlineDefinition <em>Process Deadline Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Process Deadline Definition</em>'.
	 * @see ucof.devices.devicetypes.a653components.a653partition.ProcessDeadlineDefinition
	 * @generated
	 */
	EEnum getProcessDeadlineDefinition();

	/**
	 * Returns the meta object for enum '{@link ucof.devices.devicetypes.a653components.a653partition.ProcessSynchronicity <em>Process Synchronicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Process Synchronicity</em>'.
	 * @see ucof.devices.devicetypes.a653components.a653partition.ProcessSynchronicity
	 * @generated
	 */
	EEnum getProcessSynchronicity();

	/**
	 * Returns the meta object for enum '{@link ucof.devices.devicetypes.a653components.a653partition.Criticality <em>Criticality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Criticality</em>'.
	 * @see ucof.devices.devicetypes.a653components.a653partition.Criticality
	 * @generated
	 */
	EEnum getCriticality();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	A653partitionFactory getA653partitionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ucof.devices.devicetypes.a653components.a653partition.impl.ModulePartitionsImpl <em>Module Partitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.devicetypes.a653components.a653partition.impl.ModulePartitionsImpl
		 * @see ucof.devices.devicetypes.a653components.a653partition.impl.A653partitionPackageImpl#getModulePartitions()
		 * @generated
		 */
		EClass MODULE_PARTITIONS = eINSTANCE.getModulePartitions();

		/**
		 * The meta object literal for the '<em><b>Partition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_PARTITIONS__PARTITION = eINSTANCE.getModulePartitions_Partition();

		/**
		 * The meta object literal for the '{@link ucof.devices.devicetypes.a653components.a653partition.impl.PartitionImpl <em>Partition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.devicetypes.a653components.a653partition.impl.PartitionImpl
		 * @see ucof.devices.devicetypes.a653components.a653partition.impl.A653partitionPackageImpl#getPartition()
		 * @generated
		 */
		EClass PARTITION = eINSTANCE.getPartition();

		/**
		 * The meta object literal for the '<em><b>Criticality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTITION__CRITICALITY = eINSTANCE.getPartition_Criticality();

		/**
		 * The meta object literal for the '<em><b>Entry Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTITION__ENTRY_POINT = eINSTANCE.getPartition_EntryPoint();

		/**
		 * The meta object literal for the '<em><b>Partition Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTITION__PARTITION_PERIOD = eINSTANCE.getPartition_PartitionPeriod();

		/**
		 * The meta object literal for the '<em><b>Memory</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__MEMORY = eINSTANCE.getPartition_Memory();

		/**
		 * The meta object literal for the '<em><b>Hm Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__HM_TABLE = eINSTANCE.getPartition_HmTable();

		/**
		 * The meta object literal for the '<em><b>Partition Ports</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__PARTITION_PORTS = eINSTANCE.getPartition_PartitionPorts();

		/**
		 * The meta object literal for the '<em><b>Processes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTITION__PROCESSES = eINSTANCE.getPartition_Processes();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTITION__OFFSET = eINSTANCE.getPartition_Offset();

		/**
		 * The meta object literal for the '{@link ucof.devices.devicetypes.a653components.a653partition.impl.ProcessesImpl <em>Processes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.devicetypes.a653components.a653partition.impl.ProcessesImpl
		 * @see ucof.devices.devicetypes.a653components.a653partition.impl.A653partitionPackageImpl#getProcesses()
		 * @generated
		 */
		EClass PROCESSES = eINSTANCE.getProcesses();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSES__PROCESS = eINSTANCE.getProcesses_Process();

		/**
		 * The meta object literal for the '{@link ucof.devices.devicetypes.a653components.a653partition.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.devicetypes.a653components.a653partition.impl.ProcessImpl
		 * @see ucof.devices.devicetypes.a653components.a653partition.impl.A653partitionPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Entry Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__ENTRY_POINT = eINSTANCE.getProcess_EntryPoint();

		/**
		 * The meta object literal for the '<em><b>Stack Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__STACK_SIZE = eINSTANCE.getProcess_StackSize();

		/**
		 * The meta object literal for the '<em><b>Base Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__BASE_PRIORITY = eINSTANCE.getProcess_BasePriority();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__PERIOD = eINSTANCE.getProcess_Period();

		/**
		 * The meta object literal for the '<em><b>Time Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__TIME_CAPACITY = eINSTANCE.getProcess_TimeCapacity();

		/**
		 * The meta object literal for the '<em><b>Deadline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__DEADLINE = eINSTANCE.getProcess_Deadline();

		/**
		 * The meta object literal for the '<em><b>Synchronicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__SYNCHRONICITY = eINSTANCE.getProcess_Synchronicity();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__DURATION = eINSTANCE.getProcess_Duration();

		/**
		 * The meta object literal for the '<em><b>Process Ports</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__PROCESS_PORTS = eINSTANCE.getProcess_ProcessPorts();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__OFFSET = eINSTANCE.getProcess_Offset();

		/**
		 * The meta object literal for the '{@link ucof.devices.devicetypes.a653components.a653partition.ProcessDeadlineDefinition <em>Process Deadline Definition</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.devicetypes.a653components.a653partition.ProcessDeadlineDefinition
		 * @see ucof.devices.devicetypes.a653components.a653partition.impl.A653partitionPackageImpl#getProcessDeadlineDefinition()
		 * @generated
		 */
		EEnum PROCESS_DEADLINE_DEFINITION = eINSTANCE.getProcessDeadlineDefinition();

		/**
		 * The meta object literal for the '{@link ucof.devices.devicetypes.a653components.a653partition.ProcessSynchronicity <em>Process Synchronicity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.devicetypes.a653components.a653partition.ProcessSynchronicity
		 * @see ucof.devices.devicetypes.a653components.a653partition.impl.A653partitionPackageImpl#getProcessSynchronicity()
		 * @generated
		 */
		EEnum PROCESS_SYNCHRONICITY = eINSTANCE.getProcessSynchronicity();

		/**
		 * The meta object literal for the '{@link ucof.devices.devicetypes.a653components.a653partition.Criticality <em>Criticality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.devicetypes.a653components.a653partition.Criticality
		 * @see ucof.devices.devicetypes.a653components.a653partition.impl.A653partitionPackageImpl#getCriticality()
		 * @generated
		 */
		EEnum CRITICALITY = eINSTANCE.getCriticality();

	}

} //A653partitionPackage
