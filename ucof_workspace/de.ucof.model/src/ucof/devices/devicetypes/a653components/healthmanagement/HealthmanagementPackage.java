/**
 */
package ucof.devices.devicetypes.a653components.healthmanagement;

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
 * <!-- begin-model-doc -->
 * Contains all elements necessary for the health management implementation as per ARINC 653. HM for every level >> module, partition and process
 * <!-- end-model-doc -->
 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementFactory
 * @model kind="package"
 * @generated
 */
public interface HealthmanagementPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "healthmanagement";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://gitlab.com/ucof/ucof.de/model/v001/ucof/devices/devicetypes/a653components/Hhalthmanagement";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ucof.model.healthmanagement";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HealthmanagementPackage eINSTANCE = ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl.init();

	/**
	 * The meta object id for the '{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthManagementImpl <em>Health Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthManagementImpl
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl#getHealthManagement()
	 * @generated
	 */
	int HEALTH_MANAGEMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_MANAGEMENT__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_MANAGEMENT__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_MANAGEMENT__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_MANAGEMENT__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_MANAGEMENT__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_MANAGEMENT__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_MANAGEMENT__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_MANAGEMENT__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_MANAGEMENT__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Module Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_MANAGEMENT__MODULE_TABLE = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Multi Partition Tables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_MANAGEMENT__MULTI_PARTITION_TABLES = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Health Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_MANAGEMENT_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Health Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_MANAGEMENT_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.ModuleTableImpl <em>Module Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.ModuleTableImpl
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl#getModuleTable()
	 * @generated
	 */
	int MODULE_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_TABLE__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_TABLE__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_TABLE__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_TABLE__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_TABLE__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_TABLE__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_TABLE__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_TABLE__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_TABLE__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>State Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_TABLE__STATE_DESCRIPTION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>State ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_TABLE__STATE_ID = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Error Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_TABLE__ERROR_INFO = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Module Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_TABLE_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Module Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_TABLE_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.MultiPartitionTablesImpl <em>Multi Partition Tables</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.MultiPartitionTablesImpl
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl#getMultiPartitionTables()
	 * @generated
	 */
	int MULTI_PARTITION_TABLES = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PARTITION_TABLES__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PARTITION_TABLES__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PARTITION_TABLES__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PARTITION_TABLES__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PARTITION_TABLES__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PARTITION_TABLES__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PARTITION_TABLES__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PARTITION_TABLES__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PARTITION_TABLES__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Multi Partition Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PARTITION_TABLES__MULTI_PARTITION_TABLE = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Multi Partition Tables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PARTITION_TABLES_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Multi Partition Tables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PARTITION_TABLES_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.MultiPartitionTableImpl <em>Multi Partition Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.MultiPartitionTableImpl
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl#getMultiPartitionTable()
	 * @generated
	 */
	int MULTI_PARTITION_TABLE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PARTITION_TABLE__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PARTITION_TABLE__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PARTITION_TABLE__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PARTITION_TABLE__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PARTITION_TABLE__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PARTITION_TABLE__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PARTITION_TABLE__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PARTITION_TABLE__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PARTITION_TABLE__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Table ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PARTITION_TABLE__TABLE_ID = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PARTITION_TABLE__TABLE_NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Error Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PARTITION_TABLE__ERROR_INFO = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Multi Partition Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PARTITION_TABLE_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Multi Partition Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PARTITION_TABLE_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.HMTableImpl <em>HM Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HMTableImpl
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl#getHMTable()
	 * @generated
	 */
	int HM_TABLE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HM_TABLE__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HM_TABLE__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HM_TABLE__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HM_TABLE__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HM_TABLE__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HM_TABLE__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HM_TABLE__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HM_TABLE__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HM_TABLE__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Table Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HM_TABLE__TABLE_IDENTIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HM_TABLE__TABLE_NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Multi Partition HM Table Name Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HM_TABLE__MULTI_PARTITION_HM_TABLE_NAME_REF = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Error Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HM_TABLE__ERROR_INFO = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>HM Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HM_TABLE_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>HM Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HM_TABLE_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.ErrorInfoSuperImpl <em>Error Info Super</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.ErrorInfoSuperImpl
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl#getErrorInfoSuper()
	 * @generated
	 */
	int ERROR_INFO_SUPER = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_SUPER__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_SUPER__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_SUPER__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_SUPER__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_SUPER__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_SUPER__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_SUPER__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_SUPER__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_SUPER__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Error Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_SUPER__ERROR_IDENTIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Error Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_SUPER__ERROR_DESCRIPTION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Error Info Super</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_SUPER_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Error Info Super</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_SUPER_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.ErrorInfoModuleImpl <em>Error Info Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.ErrorInfoModuleImpl
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl#getErrorInfoModule()
	 * @generated
	 */
	int ERROR_INFO_MODULE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_MODULE__ID = ERROR_INFO_SUPER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_MODULE__NAME = ERROR_INFO_SUPER__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_MODULE__DOCUMENTATION = ERROR_INFO_SUPER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_MODULE__MODIFIED = ERROR_INFO_SUPER__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_MODULE__MODIFIER = ERROR_INFO_SUPER__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_MODULE__TRACE_LINK = ERROR_INFO_SUPER__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_MODULE__CREATED = ERROR_INFO_SUPER__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_MODULE__CREATOR = ERROR_INFO_SUPER__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_MODULE__VERSION = ERROR_INFO_SUPER__VERSION;

	/**
	 * The feature id for the '<em><b>Error Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_MODULE__ERROR_IDENTIFIER = ERROR_INFO_SUPER__ERROR_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Error Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_MODULE__ERROR_DESCRIPTION = ERROR_INFO_SUPER__ERROR_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Module Recovery Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_MODULE__MODULE_RECOVERY_ACTION = ERROR_INFO_SUPER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Error Info Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_MODULE_FEATURE_COUNT = ERROR_INFO_SUPER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Error Info Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_MODULE_OPERATION_COUNT = ERROR_INFO_SUPER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.ErroInfoPartitionImpl <em>Erro Info Partition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.ErroInfoPartitionImpl
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl#getErroInfoPartition()
	 * @generated
	 */
	int ERRO_INFO_PARTITION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERRO_INFO_PARTITION__ID = ERROR_INFO_SUPER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERRO_INFO_PARTITION__NAME = ERROR_INFO_SUPER__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERRO_INFO_PARTITION__DOCUMENTATION = ERROR_INFO_SUPER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERRO_INFO_PARTITION__MODIFIED = ERROR_INFO_SUPER__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERRO_INFO_PARTITION__MODIFIER = ERROR_INFO_SUPER__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERRO_INFO_PARTITION__TRACE_LINK = ERROR_INFO_SUPER__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERRO_INFO_PARTITION__CREATED = ERROR_INFO_SUPER__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERRO_INFO_PARTITION__CREATOR = ERROR_INFO_SUPER__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERRO_INFO_PARTITION__VERSION = ERROR_INFO_SUPER__VERSION;

	/**
	 * The feature id for the '<em><b>Error Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERRO_INFO_PARTITION__ERROR_IDENTIFIER = ERROR_INFO_SUPER__ERROR_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Error Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERRO_INFO_PARTITION__ERROR_DESCRIPTION = ERROR_INFO_SUPER__ERROR_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Error Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERRO_INFO_PARTITION__ERROR_LEVEL = ERROR_INFO_SUPER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Recovery Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERRO_INFO_PARTITION__RECOVERY_ACTION = ERROR_INFO_SUPER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Erro Info Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERRO_INFO_PARTITION_FEATURE_COUNT = ERROR_INFO_SUPER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Erro Info Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERRO_INFO_PARTITION_OPERATION_COUNT = ERROR_INFO_SUPER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.ErrorInfoMultiPartitionImpl <em>Error Info Multi Partition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.ErrorInfoMultiPartitionImpl
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl#getErrorInfoMultiPartition()
	 * @generated
	 */
	int ERROR_INFO_MULTI_PARTITION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_MULTI_PARTITION__ID = ERROR_INFO_SUPER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_MULTI_PARTITION__NAME = ERROR_INFO_SUPER__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_MULTI_PARTITION__DOCUMENTATION = ERROR_INFO_SUPER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_MULTI_PARTITION__MODIFIED = ERROR_INFO_SUPER__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_MULTI_PARTITION__MODIFIER = ERROR_INFO_SUPER__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_MULTI_PARTITION__TRACE_LINK = ERROR_INFO_SUPER__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_MULTI_PARTITION__CREATED = ERROR_INFO_SUPER__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_MULTI_PARTITION__CREATOR = ERROR_INFO_SUPER__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_MULTI_PARTITION__VERSION = ERROR_INFO_SUPER__VERSION;

	/**
	 * The feature id for the '<em><b>Error Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_MULTI_PARTITION__ERROR_IDENTIFIER = ERROR_INFO_SUPER__ERROR_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Error Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_MULTI_PARTITION__ERROR_DESCRIPTION = ERROR_INFO_SUPER__ERROR_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Error Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_MULTI_PARTITION__ERROR_LEVEL = ERROR_INFO_SUPER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Recovery Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_MULTI_PARTITION__RECOVERY_ACTION = ERROR_INFO_SUPER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Error Info Multi Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_MULTI_PARTITION_FEATURE_COUNT = ERROR_INFO_SUPER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Error Info Multi Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_INFO_MULTI_PARTITION_OPERATION_COUNT = ERROR_INFO_SUPER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.ModulePartitionLevelActionImpl <em>Module Partition Level Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.ModulePartitionLevelActionImpl
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl#getModulePartitionLevelAction()
	 * @generated
	 */
	int MODULE_PARTITION_LEVEL_ACTION = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PARTITION_LEVEL_ACTION__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PARTITION_LEVEL_ACTION__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PARTITION_LEVEL_ACTION__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PARTITION_LEVEL_ACTION__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PARTITION_LEVEL_ACTION__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PARTITION_LEVEL_ACTION__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PARTITION_LEVEL_ACTION__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PARTITION_LEVEL_ACTION__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PARTITION_LEVEL_ACTION__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Module Partition Level Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PARTITION_LEVEL_ACTION_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Module Partition Level Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PARTITION_LEVEL_ACTION_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.PartitionProcessLevelActionImpl <em>Partition Process Level Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.PartitionProcessLevelActionImpl
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl#getPartitionProcessLevelAction()
	 * @generated
	 */
	int PARTITION_PROCESS_LEVEL_ACTION = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_PROCESS_LEVEL_ACTION__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_PROCESS_LEVEL_ACTION__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_PROCESS_LEVEL_ACTION__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_PROCESS_LEVEL_ACTION__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_PROCESS_LEVEL_ACTION__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_PROCESS_LEVEL_ACTION__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_PROCESS_LEVEL_ACTION__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_PROCESS_LEVEL_ACTION__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_PROCESS_LEVEL_ACTION__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Partition Process Level Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_PROCESS_LEVEL_ACTION_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Partition Process Level Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_PROCESS_LEVEL_ACTION_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.ModuleRecoveryActionImpl <em>Module Recovery Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.ModuleRecoveryActionImpl
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl#getModuleRecoveryAction()
	 * @generated
	 */
	int MODULE_RECOVERY_ACTION = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_RECOVERY_ACTION__ID = MODULE_PARTITION_LEVEL_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_RECOVERY_ACTION__NAME = MODULE_PARTITION_LEVEL_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_RECOVERY_ACTION__DOCUMENTATION = MODULE_PARTITION_LEVEL_ACTION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_RECOVERY_ACTION__MODIFIED = MODULE_PARTITION_LEVEL_ACTION__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_RECOVERY_ACTION__MODIFIER = MODULE_PARTITION_LEVEL_ACTION__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_RECOVERY_ACTION__TRACE_LINK = MODULE_PARTITION_LEVEL_ACTION__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_RECOVERY_ACTION__CREATED = MODULE_PARTITION_LEVEL_ACTION__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_RECOVERY_ACTION__CREATOR = MODULE_PARTITION_LEVEL_ACTION__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_RECOVERY_ACTION__VERSION = MODULE_PARTITION_LEVEL_ACTION__VERSION;

	/**
	 * The feature id for the '<em><b>Recovery Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_RECOVERY_ACTION__RECOVERY_ACTION = MODULE_PARTITION_LEVEL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module Recovery Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_RECOVERY_ACTION_FEATURE_COUNT = MODULE_PARTITION_LEVEL_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Module Recovery Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_RECOVERY_ACTION_OPERATION_COUNT = MODULE_PARTITION_LEVEL_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.PartitionRecoveryActionImpl <em>Partition Recovery Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.PartitionRecoveryActionImpl
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl#getPartitionRecoveryAction()
	 * @generated
	 */
	int PARTITION_RECOVERY_ACTION = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_RECOVERY_ACTION__ID = PARTITION_PROCESS_LEVEL_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_RECOVERY_ACTION__NAME = PARTITION_PROCESS_LEVEL_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_RECOVERY_ACTION__DOCUMENTATION = PARTITION_PROCESS_LEVEL_ACTION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_RECOVERY_ACTION__MODIFIED = PARTITION_PROCESS_LEVEL_ACTION__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_RECOVERY_ACTION__MODIFIER = PARTITION_PROCESS_LEVEL_ACTION__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_RECOVERY_ACTION__TRACE_LINK = PARTITION_PROCESS_LEVEL_ACTION__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_RECOVERY_ACTION__CREATED = PARTITION_PROCESS_LEVEL_ACTION__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_RECOVERY_ACTION__CREATOR = PARTITION_PROCESS_LEVEL_ACTION__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_RECOVERY_ACTION__VERSION = PARTITION_PROCESS_LEVEL_ACTION__VERSION;

	/**
	 * The feature id for the '<em><b>Recovery Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_RECOVERY_ACTION__RECOVERY_ACTION = PARTITION_PROCESS_LEVEL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Partition Recovery Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_RECOVERY_ACTION_FEATURE_COUNT = PARTITION_PROCESS_LEVEL_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Partition Recovery Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_RECOVERY_ACTION_OPERATION_COUNT = PARTITION_PROCESS_LEVEL_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.ProcessRevoceryActionImpl <em>Process Revocery Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.ProcessRevoceryActionImpl
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl#getProcessRevoceryAction()
	 * @generated
	 */
	int PROCESS_REVOCERY_ACTION = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REVOCERY_ACTION__ID = PARTITION_PROCESS_LEVEL_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REVOCERY_ACTION__NAME = PARTITION_PROCESS_LEVEL_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REVOCERY_ACTION__DOCUMENTATION = PARTITION_PROCESS_LEVEL_ACTION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REVOCERY_ACTION__MODIFIED = PARTITION_PROCESS_LEVEL_ACTION__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REVOCERY_ACTION__MODIFIER = PARTITION_PROCESS_LEVEL_ACTION__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REVOCERY_ACTION__TRACE_LINK = PARTITION_PROCESS_LEVEL_ACTION__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REVOCERY_ACTION__CREATED = PARTITION_PROCESS_LEVEL_ACTION__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REVOCERY_ACTION__CREATOR = PARTITION_PROCESS_LEVEL_ACTION__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REVOCERY_ACTION__VERSION = PARTITION_PROCESS_LEVEL_ACTION__VERSION;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REVOCERY_ACTION__ERROR_CODE = PARTITION_PROCESS_LEVEL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Recovery Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REVOCERY_ACTION__RECOVERY_ACTION = PARTITION_PROCESS_LEVEL_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Process Revocery Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REVOCERY_ACTION_FEATURE_COUNT = PARTITION_PROCESS_LEVEL_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Process Revocery Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REVOCERY_ACTION_OPERATION_COUNT = PARTITION_PROCESS_LEVEL_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.devices.devicetypes.a653components.healthmanagement.ErrorCode <em>Error Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ErrorCode
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl#getErrorCode()
	 * @generated
	 */
	int ERROR_CODE = 14;

	/**
	 * The meta object id for the '{@link ucof.devices.devicetypes.a653components.healthmanagement.ErrorLevelPartition <em>Error Level Partition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ErrorLevelPartition
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl#getErrorLevelPartition()
	 * @generated
	 */
	int ERROR_LEVEL_PARTITION = 15;

	/**
	 * The meta object id for the '{@link ucof.devices.devicetypes.a653components.healthmanagement.ErrorLevelModule <em>Error Level Module</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ErrorLevelModule
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl#getErrorLevelModule()
	 * @generated
	 */
	int ERROR_LEVEL_MODULE = 16;

	/**
	 * The meta object id for the '{@link ucof.devices.devicetypes.a653components.healthmanagement.ModuleRecoveryActions <em>Module Recovery Actions</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ModuleRecoveryActions
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl#getModuleRecoveryActions()
	 * @generated
	 */
	int MODULE_RECOVERY_ACTIONS = 17;

	/**
	 * The meta object id for the '{@link ucof.devices.devicetypes.a653components.healthmanagement.PartitionRecoveryActions <em>Partition Recovery Actions</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.PartitionRecoveryActions
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl#getPartitionRecoveryActions()
	 * @generated
	 */
	int PARTITION_RECOVERY_ACTIONS = 18;

	/**
	 * The meta object id for the '{@link ucof.devices.devicetypes.a653components.healthmanagement.ProcessRecoveryActions <em>Process Recovery Actions</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ProcessRecoveryActions
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl#getProcessRecoveryActions()
	 * @generated
	 */
	int PROCESS_RECOVERY_ACTIONS = 19;


	/**
	 * Returns the meta object for class '{@link ucof.devices.devicetypes.a653components.healthmanagement.HealthManagement <em>Health Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Health Management</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthManagement
	 * @generated
	 */
	EClass getHealthManagement();

	/**
	 * Returns the meta object for the containment reference '{@link ucof.devices.devicetypes.a653components.healthmanagement.HealthManagement#getModuleTable <em>Module Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Module Table</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthManagement#getModuleTable()
	 * @see #getHealthManagement()
	 * @generated
	 */
	EReference getHealthManagement_ModuleTable();

	/**
	 * Returns the meta object for the containment reference '{@link ucof.devices.devicetypes.a653components.healthmanagement.HealthManagement#getMultiPartitionTables <em>Multi Partition Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multi Partition Tables</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthManagement#getMultiPartitionTables()
	 * @see #getHealthManagement()
	 * @generated
	 */
	EReference getHealthManagement_MultiPartitionTables();

	/**
	 * Returns the meta object for class '{@link ucof.devices.devicetypes.a653components.healthmanagement.ModuleTable <em>Module Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Table</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ModuleTable
	 * @generated
	 */
	EClass getModuleTable();

	/**
	 * Returns the meta object for the attribute '{@link ucof.devices.devicetypes.a653components.healthmanagement.ModuleTable#getStateDescription <em>State Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Description</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ModuleTable#getStateDescription()
	 * @see #getModuleTable()
	 * @generated
	 */
	EAttribute getModuleTable_StateDescription();

	/**
	 * Returns the meta object for the attribute '{@link ucof.devices.devicetypes.a653components.healthmanagement.ModuleTable#getStateID <em>State ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State ID</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ModuleTable#getStateID()
	 * @see #getModuleTable()
	 * @generated
	 */
	EAttribute getModuleTable_StateID();

	/**
	 * Returns the meta object for the containment reference list '{@link ucof.devices.devicetypes.a653components.healthmanagement.ModuleTable#getErrorInfo <em>Error Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Error Info</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ModuleTable#getErrorInfo()
	 * @see #getModuleTable()
	 * @generated
	 */
	EReference getModuleTable_ErrorInfo();

	/**
	 * Returns the meta object for class '{@link ucof.devices.devicetypes.a653components.healthmanagement.MultiPartitionTables <em>Multi Partition Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Partition Tables</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.MultiPartitionTables
	 * @generated
	 */
	EClass getMultiPartitionTables();

	/**
	 * Returns the meta object for the containment reference list '{@link ucof.devices.devicetypes.a653components.healthmanagement.MultiPartitionTables#getMultiPartitionTable <em>Multi Partition Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Multi Partition Table</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.MultiPartitionTables#getMultiPartitionTable()
	 * @see #getMultiPartitionTables()
	 * @generated
	 */
	EReference getMultiPartitionTables_MultiPartitionTable();

	/**
	 * Returns the meta object for class '{@link ucof.devices.devicetypes.a653components.healthmanagement.MultiPartitionTable <em>Multi Partition Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Partition Table</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.MultiPartitionTable
	 * @generated
	 */
	EClass getMultiPartitionTable();

	/**
	 * Returns the meta object for the attribute '{@link ucof.devices.devicetypes.a653components.healthmanagement.MultiPartitionTable#getTableID <em>Table ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table ID</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.MultiPartitionTable#getTableID()
	 * @see #getMultiPartitionTable()
	 * @generated
	 */
	EAttribute getMultiPartitionTable_TableID();

	/**
	 * Returns the meta object for the attribute '{@link ucof.devices.devicetypes.a653components.healthmanagement.MultiPartitionTable#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.MultiPartitionTable#getTableName()
	 * @see #getMultiPartitionTable()
	 * @generated
	 */
	EAttribute getMultiPartitionTable_TableName();

	/**
	 * Returns the meta object for the containment reference list '{@link ucof.devices.devicetypes.a653components.healthmanagement.MultiPartitionTable#getErrorInfo <em>Error Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Error Info</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.MultiPartitionTable#getErrorInfo()
	 * @see #getMultiPartitionTable()
	 * @generated
	 */
	EReference getMultiPartitionTable_ErrorInfo();

	/**
	 * Returns the meta object for class '{@link ucof.devices.devicetypes.a653components.healthmanagement.HMTable <em>HM Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HM Table</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.HMTable
	 * @generated
	 */
	EClass getHMTable();

	/**
	 * Returns the meta object for the attribute '{@link ucof.devices.devicetypes.a653components.healthmanagement.HMTable#getTableIdentifier <em>Table Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Identifier</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.HMTable#getTableIdentifier()
	 * @see #getHMTable()
	 * @generated
	 */
	EAttribute getHMTable_TableIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link ucof.devices.devicetypes.a653components.healthmanagement.HMTable#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.HMTable#getTableName()
	 * @see #getHMTable()
	 * @generated
	 */
	EAttribute getHMTable_TableName();

	/**
	 * Returns the meta object for the reference '{@link ucof.devices.devicetypes.a653components.healthmanagement.HMTable#getMultiPartitionHMTableNameRef <em>Multi Partition HM Table Name Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Multi Partition HM Table Name Ref</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.HMTable#getMultiPartitionHMTableNameRef()
	 * @see #getHMTable()
	 * @generated
	 */
	EReference getHMTable_MultiPartitionHMTableNameRef();

	/**
	 * Returns the meta object for the containment reference list '{@link ucof.devices.devicetypes.a653components.healthmanagement.HMTable#getErrorInfo <em>Error Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Error Info</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.HMTable#getErrorInfo()
	 * @see #getHMTable()
	 * @generated
	 */
	EReference getHMTable_ErrorInfo();

	/**
	 * Returns the meta object for class '{@link ucof.devices.devicetypes.a653components.healthmanagement.ErrorInfoSuper <em>Error Info Super</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Info Super</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ErrorInfoSuper
	 * @generated
	 */
	EClass getErrorInfoSuper();

	/**
	 * Returns the meta object for the attribute '{@link ucof.devices.devicetypes.a653components.healthmanagement.ErrorInfoSuper#getErrorIdentifier <em>Error Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Identifier</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ErrorInfoSuper#getErrorIdentifier()
	 * @see #getErrorInfoSuper()
	 * @generated
	 */
	EAttribute getErrorInfoSuper_ErrorIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link ucof.devices.devicetypes.a653components.healthmanagement.ErrorInfoSuper#getErrorDescription <em>Error Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Description</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ErrorInfoSuper#getErrorDescription()
	 * @see #getErrorInfoSuper()
	 * @generated
	 */
	EAttribute getErrorInfoSuper_ErrorDescription();

	/**
	 * Returns the meta object for class '{@link ucof.devices.devicetypes.a653components.healthmanagement.ErrorInfoModule <em>Error Info Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Info Module</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ErrorInfoModule
	 * @generated
	 */
	EClass getErrorInfoModule();

	/**
	 * Returns the meta object for the containment reference '{@link ucof.devices.devicetypes.a653components.healthmanagement.ErrorInfoModule#getModuleRecoveryAction <em>Module Recovery Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Module Recovery Action</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ErrorInfoModule#getModuleRecoveryAction()
	 * @see #getErrorInfoModule()
	 * @generated
	 */
	EReference getErrorInfoModule_ModuleRecoveryAction();

	/**
	 * Returns the meta object for class '{@link ucof.devices.devicetypes.a653components.healthmanagement.ErroInfoPartition <em>Erro Info Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erro Info Partition</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ErroInfoPartition
	 * @generated
	 */
	EClass getErroInfoPartition();

	/**
	 * Returns the meta object for the attribute '{@link ucof.devices.devicetypes.a653components.healthmanagement.ErroInfoPartition#getErrorLevel <em>Error Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Level</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ErroInfoPartition#getErrorLevel()
	 * @see #getErroInfoPartition()
	 * @generated
	 */
	EAttribute getErroInfoPartition_ErrorLevel();

	/**
	 * Returns the meta object for the containment reference '{@link ucof.devices.devicetypes.a653components.healthmanagement.ErroInfoPartition#getRecoveryAction <em>Recovery Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Recovery Action</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ErroInfoPartition#getRecoveryAction()
	 * @see #getErroInfoPartition()
	 * @generated
	 */
	EReference getErroInfoPartition_RecoveryAction();

	/**
	 * Returns the meta object for class '{@link ucof.devices.devicetypes.a653components.healthmanagement.ErrorInfoMultiPartition <em>Error Info Multi Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Info Multi Partition</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ErrorInfoMultiPartition
	 * @generated
	 */
	EClass getErrorInfoMultiPartition();

	/**
	 * Returns the meta object for the attribute '{@link ucof.devices.devicetypes.a653components.healthmanagement.ErrorInfoMultiPartition#getErrorLevel <em>Error Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Level</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ErrorInfoMultiPartition#getErrorLevel()
	 * @see #getErrorInfoMultiPartition()
	 * @generated
	 */
	EAttribute getErrorInfoMultiPartition_ErrorLevel();

	/**
	 * Returns the meta object for the containment reference '{@link ucof.devices.devicetypes.a653components.healthmanagement.ErrorInfoMultiPartition#getRecoveryAction <em>Recovery Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Recovery Action</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ErrorInfoMultiPartition#getRecoveryAction()
	 * @see #getErrorInfoMultiPartition()
	 * @generated
	 */
	EReference getErrorInfoMultiPartition_RecoveryAction();

	/**
	 * Returns the meta object for class '{@link ucof.devices.devicetypes.a653components.healthmanagement.ModulePartitionLevelAction <em>Module Partition Level Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Partition Level Action</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ModulePartitionLevelAction
	 * @generated
	 */
	EClass getModulePartitionLevelAction();

	/**
	 * Returns the meta object for class '{@link ucof.devices.devicetypes.a653components.healthmanagement.PartitionProcessLevelAction <em>Partition Process Level Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partition Process Level Action</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.PartitionProcessLevelAction
	 * @generated
	 */
	EClass getPartitionProcessLevelAction();

	/**
	 * Returns the meta object for class '{@link ucof.devices.devicetypes.a653components.healthmanagement.ModuleRecoveryAction <em>Module Recovery Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Recovery Action</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ModuleRecoveryAction
	 * @generated
	 */
	EClass getModuleRecoveryAction();

	/**
	 * Returns the meta object for the attribute '{@link ucof.devices.devicetypes.a653components.healthmanagement.ModuleRecoveryAction#getRecoveryAction <em>Recovery Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recovery Action</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ModuleRecoveryAction#getRecoveryAction()
	 * @see #getModuleRecoveryAction()
	 * @generated
	 */
	EAttribute getModuleRecoveryAction_RecoveryAction();

	/**
	 * Returns the meta object for class '{@link ucof.devices.devicetypes.a653components.healthmanagement.PartitionRecoveryAction <em>Partition Recovery Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partition Recovery Action</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.PartitionRecoveryAction
	 * @generated
	 */
	EClass getPartitionRecoveryAction();

	/**
	 * Returns the meta object for the attribute '{@link ucof.devices.devicetypes.a653components.healthmanagement.PartitionRecoveryAction#getRecoveryAction <em>Recovery Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recovery Action</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.PartitionRecoveryAction#getRecoveryAction()
	 * @see #getPartitionRecoveryAction()
	 * @generated
	 */
	EAttribute getPartitionRecoveryAction_RecoveryAction();

	/**
	 * Returns the meta object for class '{@link ucof.devices.devicetypes.a653components.healthmanagement.ProcessRevoceryAction <em>Process Revocery Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Revocery Action</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ProcessRevoceryAction
	 * @generated
	 */
	EClass getProcessRevoceryAction();

	/**
	 * Returns the meta object for the attribute '{@link ucof.devices.devicetypes.a653components.healthmanagement.ProcessRevoceryAction#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ProcessRevoceryAction#getErrorCode()
	 * @see #getProcessRevoceryAction()
	 * @generated
	 */
	EAttribute getProcessRevoceryAction_ErrorCode();

	/**
	 * Returns the meta object for the attribute '{@link ucof.devices.devicetypes.a653components.healthmanagement.ProcessRevoceryAction#getRecoveryAction <em>Recovery Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recovery Action</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ProcessRevoceryAction#getRecoveryAction()
	 * @see #getProcessRevoceryAction()
	 * @generated
	 */
	EAttribute getProcessRevoceryAction_RecoveryAction();

	/**
	 * Returns the meta object for enum '{@link ucof.devices.devicetypes.a653components.healthmanagement.ErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Error Code</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ErrorCode
	 * @generated
	 */
	EEnum getErrorCode();

	/**
	 * Returns the meta object for enum '{@link ucof.devices.devicetypes.a653components.healthmanagement.ErrorLevelPartition <em>Error Level Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Error Level Partition</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ErrorLevelPartition
	 * @generated
	 */
	EEnum getErrorLevelPartition();

	/**
	 * Returns the meta object for enum '{@link ucof.devices.devicetypes.a653components.healthmanagement.ErrorLevelModule <em>Error Level Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Error Level Module</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ErrorLevelModule
	 * @generated
	 */
	EEnum getErrorLevelModule();

	/**
	 * Returns the meta object for enum '{@link ucof.devices.devicetypes.a653components.healthmanagement.ModuleRecoveryActions <em>Module Recovery Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Module Recovery Actions</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ModuleRecoveryActions
	 * @generated
	 */
	EEnum getModuleRecoveryActions();

	/**
	 * Returns the meta object for enum '{@link ucof.devices.devicetypes.a653components.healthmanagement.PartitionRecoveryActions <em>Partition Recovery Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Partition Recovery Actions</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.PartitionRecoveryActions
	 * @generated
	 */
	EEnum getPartitionRecoveryActions();

	/**
	 * Returns the meta object for enum '{@link ucof.devices.devicetypes.a653components.healthmanagement.ProcessRecoveryActions <em>Process Recovery Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Process Recovery Actions</em>'.
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.ProcessRecoveryActions
	 * @generated
	 */
	EEnum getProcessRecoveryActions();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HealthmanagementFactory getHealthmanagementFactory();

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
		 * The meta object literal for the '{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthManagementImpl <em>Health Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthManagementImpl
		 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl#getHealthManagement()
		 * @generated
		 */
		EClass HEALTH_MANAGEMENT = eINSTANCE.getHealthManagement();

		/**
		 * The meta object literal for the '<em><b>Module Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEALTH_MANAGEMENT__MODULE_TABLE = eINSTANCE.getHealthManagement_ModuleTable();

		/**
		 * The meta object literal for the '<em><b>Multi Partition Tables</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEALTH_MANAGEMENT__MULTI_PARTITION_TABLES = eINSTANCE.getHealthManagement_MultiPartitionTables();

		/**
		 * The meta object literal for the '{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.ModuleTableImpl <em>Module Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.ModuleTableImpl
		 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl#getModuleTable()
		 * @generated
		 */
		EClass MODULE_TABLE = eINSTANCE.getModuleTable();

		/**
		 * The meta object literal for the '<em><b>State Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_TABLE__STATE_DESCRIPTION = eINSTANCE.getModuleTable_StateDescription();

		/**
		 * The meta object literal for the '<em><b>State ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_TABLE__STATE_ID = eINSTANCE.getModuleTable_StateID();

		/**
		 * The meta object literal for the '<em><b>Error Info</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_TABLE__ERROR_INFO = eINSTANCE.getModuleTable_ErrorInfo();

		/**
		 * The meta object literal for the '{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.MultiPartitionTablesImpl <em>Multi Partition Tables</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.MultiPartitionTablesImpl
		 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl#getMultiPartitionTables()
		 * @generated
		 */
		EClass MULTI_PARTITION_TABLES = eINSTANCE.getMultiPartitionTables();

		/**
		 * The meta object literal for the '<em><b>Multi Partition Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_PARTITION_TABLES__MULTI_PARTITION_TABLE = eINSTANCE.getMultiPartitionTables_MultiPartitionTable();

		/**
		 * The meta object literal for the '{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.MultiPartitionTableImpl <em>Multi Partition Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.MultiPartitionTableImpl
		 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl#getMultiPartitionTable()
		 * @generated
		 */
		EClass MULTI_PARTITION_TABLE = eINSTANCE.getMultiPartitionTable();

		/**
		 * The meta object literal for the '<em><b>Table ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_PARTITION_TABLE__TABLE_ID = eINSTANCE.getMultiPartitionTable_TableID();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_PARTITION_TABLE__TABLE_NAME = eINSTANCE.getMultiPartitionTable_TableName();

		/**
		 * The meta object literal for the '<em><b>Error Info</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_PARTITION_TABLE__ERROR_INFO = eINSTANCE.getMultiPartitionTable_ErrorInfo();

		/**
		 * The meta object literal for the '{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.HMTableImpl <em>HM Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HMTableImpl
		 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl#getHMTable()
		 * @generated
		 */
		EClass HM_TABLE = eINSTANCE.getHMTable();

		/**
		 * The meta object literal for the '<em><b>Table Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HM_TABLE__TABLE_IDENTIFIER = eINSTANCE.getHMTable_TableIdentifier();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HM_TABLE__TABLE_NAME = eINSTANCE.getHMTable_TableName();

		/**
		 * The meta object literal for the '<em><b>Multi Partition HM Table Name Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HM_TABLE__MULTI_PARTITION_HM_TABLE_NAME_REF = eINSTANCE.getHMTable_MultiPartitionHMTableNameRef();

		/**
		 * The meta object literal for the '<em><b>Error Info</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HM_TABLE__ERROR_INFO = eINSTANCE.getHMTable_ErrorInfo();

		/**
		 * The meta object literal for the '{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.ErrorInfoSuperImpl <em>Error Info Super</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.ErrorInfoSuperImpl
		 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl#getErrorInfoSuper()
		 * @generated
		 */
		EClass ERROR_INFO_SUPER = eINSTANCE.getErrorInfoSuper();

		/**
		 * The meta object literal for the '<em><b>Error Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_INFO_SUPER__ERROR_IDENTIFIER = eINSTANCE.getErrorInfoSuper_ErrorIdentifier();

		/**
		 * The meta object literal for the '<em><b>Error Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_INFO_SUPER__ERROR_DESCRIPTION = eINSTANCE.getErrorInfoSuper_ErrorDescription();

		/**
		 * The meta object literal for the '{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.ErrorInfoModuleImpl <em>Error Info Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.ErrorInfoModuleImpl
		 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl#getErrorInfoModule()
		 * @generated
		 */
		EClass ERROR_INFO_MODULE = eINSTANCE.getErrorInfoModule();

		/**
		 * The meta object literal for the '<em><b>Module Recovery Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_INFO_MODULE__MODULE_RECOVERY_ACTION = eINSTANCE.getErrorInfoModule_ModuleRecoveryAction();

		/**
		 * The meta object literal for the '{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.ErroInfoPartitionImpl <em>Erro Info Partition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.ErroInfoPartitionImpl
		 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl#getErroInfoPartition()
		 * @generated
		 */
		EClass ERRO_INFO_PARTITION = eINSTANCE.getErroInfoPartition();

		/**
		 * The meta object literal for the '<em><b>Error Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERRO_INFO_PARTITION__ERROR_LEVEL = eINSTANCE.getErroInfoPartition_ErrorLevel();

		/**
		 * The meta object literal for the '<em><b>Recovery Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERRO_INFO_PARTITION__RECOVERY_ACTION = eINSTANCE.getErroInfoPartition_RecoveryAction();

		/**
		 * The meta object literal for the '{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.ErrorInfoMultiPartitionImpl <em>Error Info Multi Partition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.ErrorInfoMultiPartitionImpl
		 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl#getErrorInfoMultiPartition()
		 * @generated
		 */
		EClass ERROR_INFO_MULTI_PARTITION = eINSTANCE.getErrorInfoMultiPartition();

		/**
		 * The meta object literal for the '<em><b>Error Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_INFO_MULTI_PARTITION__ERROR_LEVEL = eINSTANCE.getErrorInfoMultiPartition_ErrorLevel();

		/**
		 * The meta object literal for the '<em><b>Recovery Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_INFO_MULTI_PARTITION__RECOVERY_ACTION = eINSTANCE.getErrorInfoMultiPartition_RecoveryAction();

		/**
		 * The meta object literal for the '{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.ModulePartitionLevelActionImpl <em>Module Partition Level Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.ModulePartitionLevelActionImpl
		 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl#getModulePartitionLevelAction()
		 * @generated
		 */
		EClass MODULE_PARTITION_LEVEL_ACTION = eINSTANCE.getModulePartitionLevelAction();

		/**
		 * The meta object literal for the '{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.PartitionProcessLevelActionImpl <em>Partition Process Level Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.PartitionProcessLevelActionImpl
		 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl#getPartitionProcessLevelAction()
		 * @generated
		 */
		EClass PARTITION_PROCESS_LEVEL_ACTION = eINSTANCE.getPartitionProcessLevelAction();

		/**
		 * The meta object literal for the '{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.ModuleRecoveryActionImpl <em>Module Recovery Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.ModuleRecoveryActionImpl
		 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl#getModuleRecoveryAction()
		 * @generated
		 */
		EClass MODULE_RECOVERY_ACTION = eINSTANCE.getModuleRecoveryAction();

		/**
		 * The meta object literal for the '<em><b>Recovery Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_RECOVERY_ACTION__RECOVERY_ACTION = eINSTANCE.getModuleRecoveryAction_RecoveryAction();

		/**
		 * The meta object literal for the '{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.PartitionRecoveryActionImpl <em>Partition Recovery Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.PartitionRecoveryActionImpl
		 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl#getPartitionRecoveryAction()
		 * @generated
		 */
		EClass PARTITION_RECOVERY_ACTION = eINSTANCE.getPartitionRecoveryAction();

		/**
		 * The meta object literal for the '<em><b>Recovery Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTITION_RECOVERY_ACTION__RECOVERY_ACTION = eINSTANCE.getPartitionRecoveryAction_RecoveryAction();

		/**
		 * The meta object literal for the '{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.ProcessRevoceryActionImpl <em>Process Revocery Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.ProcessRevoceryActionImpl
		 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl#getProcessRevoceryAction()
		 * @generated
		 */
		EClass PROCESS_REVOCERY_ACTION = eINSTANCE.getProcessRevoceryAction();

		/**
		 * The meta object literal for the '<em><b>Error Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_REVOCERY_ACTION__ERROR_CODE = eINSTANCE.getProcessRevoceryAction_ErrorCode();

		/**
		 * The meta object literal for the '<em><b>Recovery Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_REVOCERY_ACTION__RECOVERY_ACTION = eINSTANCE.getProcessRevoceryAction_RecoveryAction();

		/**
		 * The meta object literal for the '{@link ucof.devices.devicetypes.a653components.healthmanagement.ErrorCode <em>Error Code</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.devicetypes.a653components.healthmanagement.ErrorCode
		 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl#getErrorCode()
		 * @generated
		 */
		EEnum ERROR_CODE = eINSTANCE.getErrorCode();

		/**
		 * The meta object literal for the '{@link ucof.devices.devicetypes.a653components.healthmanagement.ErrorLevelPartition <em>Error Level Partition</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.devicetypes.a653components.healthmanagement.ErrorLevelPartition
		 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl#getErrorLevelPartition()
		 * @generated
		 */
		EEnum ERROR_LEVEL_PARTITION = eINSTANCE.getErrorLevelPartition();

		/**
		 * The meta object literal for the '{@link ucof.devices.devicetypes.a653components.healthmanagement.ErrorLevelModule <em>Error Level Module</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.devicetypes.a653components.healthmanagement.ErrorLevelModule
		 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl#getErrorLevelModule()
		 * @generated
		 */
		EEnum ERROR_LEVEL_MODULE = eINSTANCE.getErrorLevelModule();

		/**
		 * The meta object literal for the '{@link ucof.devices.devicetypes.a653components.healthmanagement.ModuleRecoveryActions <em>Module Recovery Actions</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.devicetypes.a653components.healthmanagement.ModuleRecoveryActions
		 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl#getModuleRecoveryActions()
		 * @generated
		 */
		EEnum MODULE_RECOVERY_ACTIONS = eINSTANCE.getModuleRecoveryActions();

		/**
		 * The meta object literal for the '{@link ucof.devices.devicetypes.a653components.healthmanagement.PartitionRecoveryActions <em>Partition Recovery Actions</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.devicetypes.a653components.healthmanagement.PartitionRecoveryActions
		 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl#getPartitionRecoveryActions()
		 * @generated
		 */
		EEnum PARTITION_RECOVERY_ACTIONS = eINSTANCE.getPartitionRecoveryActions();

		/**
		 * The meta object literal for the '{@link ucof.devices.devicetypes.a653components.healthmanagement.ProcessRecoveryActions <em>Process Recovery Actions</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.devicetypes.a653components.healthmanagement.ProcessRecoveryActions
		 * @see ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl#getProcessRecoveryActions()
		 * @generated
		 */
		EEnum PROCESS_RECOVERY_ACTIONS = eINSTANCE.getProcessRecoveryActions();

	}

} //HealthmanagementPackage
