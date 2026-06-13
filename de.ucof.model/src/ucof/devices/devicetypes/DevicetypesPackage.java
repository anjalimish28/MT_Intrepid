/**
 */
package ucof.devices.devicetypes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import ucof.devices.DevicesPackage;

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
 * Container for all different devie types, e.g., A653 modules
 * <!-- end-model-doc -->
 * @see ucof.devices.devicetypes.DevicetypesFactory
 * @model kind="package"
 * @generated
 */
public interface DevicetypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "devicetypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://gitlab.com/ucof/ucof.de/model/v001/ucof/devices/devicetypes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ucof.model.devices.devicetypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DevicetypesPackage eINSTANCE = ucof.devices.devicetypes.impl.DevicetypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link ucof.devices.devicetypes.impl.SuperA653ModuleTypeImpl <em>Super A653 Module Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.devicetypes.impl.SuperA653ModuleTypeImpl
	 * @see ucof.devices.devicetypes.impl.DevicetypesPackageImpl#getSuperA653ModuleType()
	 * @generated
	 */
	int SUPER_A653_MODULE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_A653_MODULE_TYPE__ID = DevicesPackage.SUPER_PLATFORM_DEVICE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_A653_MODULE_TYPE__NAME = DevicesPackage.SUPER_PLATFORM_DEVICE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_A653_MODULE_TYPE__DOCUMENTATION = DevicesPackage.SUPER_PLATFORM_DEVICE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_A653_MODULE_TYPE__MODIFIED = DevicesPackage.SUPER_PLATFORM_DEVICE_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_A653_MODULE_TYPE__MODIFIER = DevicesPackage.SUPER_PLATFORM_DEVICE_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_A653_MODULE_TYPE__TRACE_LINK = DevicesPackage.SUPER_PLATFORM_DEVICE_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_A653_MODULE_TYPE__CREATED = DevicesPackage.SUPER_PLATFORM_DEVICE_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_A653_MODULE_TYPE__CREATOR = DevicesPackage.SUPER_PLATFORM_DEVICE_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_A653_MODULE_TYPE__VERSION = DevicesPackage.SUPER_PLATFORM_DEVICE_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Configuration Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_A653_MODULE_TYPE__CONFIGURATION_LINK = DevicesPackage.SUPER_PLATFORM_DEVICE_TYPE__CONFIGURATION_LINK;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_A653_MODULE_TYPE__PORTS = DevicesPackage.SUPER_PLATFORM_DEVICE_TYPE__PORTS;

	/**
	 * The feature id for the '<em><b>Device Functions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_A653_MODULE_TYPE__DEVICE_FUNCTIONS = DevicesPackage.SUPER_PLATFORM_DEVICE_TYPE__DEVICE_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Implementation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_A653_MODULE_TYPE__IMPLEMENTATION_TYPE = DevicesPackage.SUPER_PLATFORM_DEVICE_TYPE__IMPLEMENTATION_TYPE;

	/**
	 * The feature id for the '<em><b>Health Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_A653_MODULE_TYPE__HEALTH_MANAGEMENT = DevicesPackage.SUPER_PLATFORM_DEVICE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Module Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_A653_MODULE_TYPE__MODULE_SCHEDULE = DevicesPackage.SUPER_PLATFORM_DEVICE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Partitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_A653_MODULE_TYPE__PARTITIONS = DevicesPackage.SUPER_PLATFORM_DEVICE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Super A653 Module Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_A653_MODULE_TYPE_FEATURE_COUNT = DevicesPackage.SUPER_PLATFORM_DEVICE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Super A653 Module Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_A653_MODULE_TYPE_OPERATION_COUNT = DevicesPackage.SUPER_PLATFORM_DEVICE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.devices.devicetypes.impl.A653P1ModuleImpl <em>A653P1 Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.devicetypes.impl.A653P1ModuleImpl
	 * @see ucof.devices.devicetypes.impl.DevicetypesPackageImpl#getA653P1Module()
	 * @generated
	 */
	int A653P1_MODULE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A653P1_MODULE__ID = SUPER_A653_MODULE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A653P1_MODULE__NAME = SUPER_A653_MODULE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A653P1_MODULE__DOCUMENTATION = SUPER_A653_MODULE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A653P1_MODULE__MODIFIED = SUPER_A653_MODULE_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A653P1_MODULE__MODIFIER = SUPER_A653_MODULE_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A653P1_MODULE__TRACE_LINK = SUPER_A653_MODULE_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A653P1_MODULE__CREATED = SUPER_A653_MODULE_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A653P1_MODULE__CREATOR = SUPER_A653_MODULE_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A653P1_MODULE__VERSION = SUPER_A653_MODULE_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Configuration Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A653P1_MODULE__CONFIGURATION_LINK = SUPER_A653_MODULE_TYPE__CONFIGURATION_LINK;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A653P1_MODULE__PORTS = SUPER_A653_MODULE_TYPE__PORTS;

	/**
	 * The feature id for the '<em><b>Device Functions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A653P1_MODULE__DEVICE_FUNCTIONS = SUPER_A653_MODULE_TYPE__DEVICE_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Implementation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A653P1_MODULE__IMPLEMENTATION_TYPE = SUPER_A653_MODULE_TYPE__IMPLEMENTATION_TYPE;

	/**
	 * The feature id for the '<em><b>Health Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A653P1_MODULE__HEALTH_MANAGEMENT = SUPER_A653_MODULE_TYPE__HEALTH_MANAGEMENT;

	/**
	 * The feature id for the '<em><b>Module Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A653P1_MODULE__MODULE_SCHEDULE = SUPER_A653_MODULE_TYPE__MODULE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Partitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A653P1_MODULE__PARTITIONS = SUPER_A653_MODULE_TYPE__PARTITIONS;

	/**
	 * The number of structural features of the '<em>A653P1 Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A653P1_MODULE_FEATURE_COUNT = SUPER_A653_MODULE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>A653P1 Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A653P1_MODULE_OPERATION_COUNT = SUPER_A653_MODULE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.devices.devicetypes.impl.A653P4ModuleImpl <em>A653P4 Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.devicetypes.impl.A653P4ModuleImpl
	 * @see ucof.devices.devicetypes.impl.DevicetypesPackageImpl#getA653P4Module()
	 * @generated
	 */
	int A653P4_MODULE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A653P4_MODULE__ID = SUPER_A653_MODULE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A653P4_MODULE__NAME = SUPER_A653_MODULE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A653P4_MODULE__DOCUMENTATION = SUPER_A653_MODULE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A653P4_MODULE__MODIFIED = SUPER_A653_MODULE_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A653P4_MODULE__MODIFIER = SUPER_A653_MODULE_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A653P4_MODULE__TRACE_LINK = SUPER_A653_MODULE_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A653P4_MODULE__CREATED = SUPER_A653_MODULE_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A653P4_MODULE__CREATOR = SUPER_A653_MODULE_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A653P4_MODULE__VERSION = SUPER_A653_MODULE_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Configuration Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A653P4_MODULE__CONFIGURATION_LINK = SUPER_A653_MODULE_TYPE__CONFIGURATION_LINK;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A653P4_MODULE__PORTS = SUPER_A653_MODULE_TYPE__PORTS;

	/**
	 * The feature id for the '<em><b>Device Functions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A653P4_MODULE__DEVICE_FUNCTIONS = SUPER_A653_MODULE_TYPE__DEVICE_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Implementation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A653P4_MODULE__IMPLEMENTATION_TYPE = SUPER_A653_MODULE_TYPE__IMPLEMENTATION_TYPE;

	/**
	 * The feature id for the '<em><b>Health Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A653P4_MODULE__HEALTH_MANAGEMENT = SUPER_A653_MODULE_TYPE__HEALTH_MANAGEMENT;

	/**
	 * The feature id for the '<em><b>Module Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A653P4_MODULE__MODULE_SCHEDULE = SUPER_A653_MODULE_TYPE__MODULE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Partitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A653P4_MODULE__PARTITIONS = SUPER_A653_MODULE_TYPE__PARTITIONS;

	/**
	 * The number of structural features of the '<em>A653P4 Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A653P4_MODULE_FEATURE_COUNT = SUPER_A653_MODULE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>A653P4 Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A653P4_MODULE_OPERATION_COUNT = SUPER_A653_MODULE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.devices.devicetypes.impl.IOModuleImpl <em>IO Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.devicetypes.impl.IOModuleImpl
	 * @see ucof.devices.devicetypes.impl.DevicetypesPackageImpl#getIOModule()
	 * @generated
	 */
	int IO_MODULE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_MODULE__ID = SUPER_A653_MODULE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_MODULE__NAME = SUPER_A653_MODULE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_MODULE__DOCUMENTATION = SUPER_A653_MODULE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_MODULE__MODIFIED = SUPER_A653_MODULE_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_MODULE__MODIFIER = SUPER_A653_MODULE_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_MODULE__TRACE_LINK = SUPER_A653_MODULE_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_MODULE__CREATED = SUPER_A653_MODULE_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_MODULE__CREATOR = SUPER_A653_MODULE_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_MODULE__VERSION = SUPER_A653_MODULE_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Configuration Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_MODULE__CONFIGURATION_LINK = SUPER_A653_MODULE_TYPE__CONFIGURATION_LINK;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_MODULE__PORTS = SUPER_A653_MODULE_TYPE__PORTS;

	/**
	 * The feature id for the '<em><b>Device Functions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_MODULE__DEVICE_FUNCTIONS = SUPER_A653_MODULE_TYPE__DEVICE_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Implementation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_MODULE__IMPLEMENTATION_TYPE = SUPER_A653_MODULE_TYPE__IMPLEMENTATION_TYPE;

	/**
	 * The feature id for the '<em><b>Health Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_MODULE__HEALTH_MANAGEMENT = SUPER_A653_MODULE_TYPE__HEALTH_MANAGEMENT;

	/**
	 * The feature id for the '<em><b>Module Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_MODULE__MODULE_SCHEDULE = SUPER_A653_MODULE_TYPE__MODULE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Partitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_MODULE__PARTITIONS = SUPER_A653_MODULE_TYPE__PARTITIONS;

	/**
	 * The number of structural features of the '<em>IO Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_MODULE_FEATURE_COUNT = SUPER_A653_MODULE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IO Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_MODULE_OPERATION_COUNT = SUPER_A653_MODULE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.devices.devicetypes.impl.PeripheralImpl <em>Peripheral</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.devicetypes.impl.PeripheralImpl
	 * @see ucof.devices.devicetypes.impl.DevicetypesPackageImpl#getPeripheral()
	 * @generated
	 */
	int PERIPHERAL = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL__ID = SUPER_A653_MODULE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL__NAME = SUPER_A653_MODULE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL__DOCUMENTATION = SUPER_A653_MODULE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL__MODIFIED = SUPER_A653_MODULE_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL__MODIFIER = SUPER_A653_MODULE_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL__TRACE_LINK = SUPER_A653_MODULE_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL__CREATED = SUPER_A653_MODULE_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL__CREATOR = SUPER_A653_MODULE_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL__VERSION = SUPER_A653_MODULE_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Configuration Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL__CONFIGURATION_LINK = SUPER_A653_MODULE_TYPE__CONFIGURATION_LINK;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL__PORTS = SUPER_A653_MODULE_TYPE__PORTS;

	/**
	 * The feature id for the '<em><b>Device Functions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL__DEVICE_FUNCTIONS = SUPER_A653_MODULE_TYPE__DEVICE_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Implementation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL__IMPLEMENTATION_TYPE = SUPER_A653_MODULE_TYPE__IMPLEMENTATION_TYPE;

	/**
	 * The feature id for the '<em><b>Health Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL__HEALTH_MANAGEMENT = SUPER_A653_MODULE_TYPE__HEALTH_MANAGEMENT;

	/**
	 * The feature id for the '<em><b>Module Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL__MODULE_SCHEDULE = SUPER_A653_MODULE_TYPE__MODULE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Partitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL__PARTITIONS = SUPER_A653_MODULE_TYPE__PARTITIONS;

	/**
	 * The feature id for the '<em><b>Peripheral Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL__PERIPHERAL_TYPE = SUPER_A653_MODULE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Peripheral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL_FEATURE_COUNT = SUPER_A653_MODULE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Peripheral</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERAL_OPERATION_COUNT = SUPER_A653_MODULE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.devices.devicetypes.impl.SuperSwitchTypeImpl <em>Super Switch Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.devicetypes.impl.SuperSwitchTypeImpl
	 * @see ucof.devices.devicetypes.impl.DevicetypesPackageImpl#getSuperSwitchType()
	 * @generated
	 */
	int SUPER_SWITCH_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_SWITCH_TYPE__ID = SUPER_A653_MODULE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_SWITCH_TYPE__NAME = SUPER_A653_MODULE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_SWITCH_TYPE__DOCUMENTATION = SUPER_A653_MODULE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_SWITCH_TYPE__MODIFIED = SUPER_A653_MODULE_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_SWITCH_TYPE__MODIFIER = SUPER_A653_MODULE_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_SWITCH_TYPE__TRACE_LINK = SUPER_A653_MODULE_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_SWITCH_TYPE__CREATED = SUPER_A653_MODULE_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_SWITCH_TYPE__CREATOR = SUPER_A653_MODULE_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_SWITCH_TYPE__VERSION = SUPER_A653_MODULE_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Configuration Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_SWITCH_TYPE__CONFIGURATION_LINK = SUPER_A653_MODULE_TYPE__CONFIGURATION_LINK;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_SWITCH_TYPE__PORTS = SUPER_A653_MODULE_TYPE__PORTS;

	/**
	 * The feature id for the '<em><b>Device Functions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_SWITCH_TYPE__DEVICE_FUNCTIONS = SUPER_A653_MODULE_TYPE__DEVICE_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Implementation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_SWITCH_TYPE__IMPLEMENTATION_TYPE = SUPER_A653_MODULE_TYPE__IMPLEMENTATION_TYPE;

	/**
	 * The feature id for the '<em><b>Health Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_SWITCH_TYPE__HEALTH_MANAGEMENT = SUPER_A653_MODULE_TYPE__HEALTH_MANAGEMENT;

	/**
	 * The feature id for the '<em><b>Module Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_SWITCH_TYPE__MODULE_SCHEDULE = SUPER_A653_MODULE_TYPE__MODULE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Partitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_SWITCH_TYPE__PARTITIONS = SUPER_A653_MODULE_TYPE__PARTITIONS;

	/**
	 * The number of structural features of the '<em>Super Switch Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_SWITCH_TYPE_FEATURE_COUNT = SUPER_A653_MODULE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Super Switch Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_SWITCH_TYPE_OPERATION_COUNT = SUPER_A653_MODULE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.devices.devicetypes.impl.A664SwitchImpl <em>A664 Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.devicetypes.impl.A664SwitchImpl
	 * @see ucof.devices.devicetypes.impl.DevicetypesPackageImpl#getA664Switch()
	 * @generated
	 */
	int A664_SWITCH = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_SWITCH__ID = SUPER_SWITCH_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_SWITCH__NAME = SUPER_SWITCH_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_SWITCH__DOCUMENTATION = SUPER_SWITCH_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_SWITCH__MODIFIED = SUPER_SWITCH_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_SWITCH__MODIFIER = SUPER_SWITCH_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_SWITCH__TRACE_LINK = SUPER_SWITCH_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_SWITCH__CREATED = SUPER_SWITCH_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_SWITCH__CREATOR = SUPER_SWITCH_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_SWITCH__VERSION = SUPER_SWITCH_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Configuration Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_SWITCH__CONFIGURATION_LINK = SUPER_SWITCH_TYPE__CONFIGURATION_LINK;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_SWITCH__PORTS = SUPER_SWITCH_TYPE__PORTS;

	/**
	 * The feature id for the '<em><b>Device Functions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_SWITCH__DEVICE_FUNCTIONS = SUPER_SWITCH_TYPE__DEVICE_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>Implementation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_SWITCH__IMPLEMENTATION_TYPE = SUPER_SWITCH_TYPE__IMPLEMENTATION_TYPE;

	/**
	 * The feature id for the '<em><b>Health Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_SWITCH__HEALTH_MANAGEMENT = SUPER_SWITCH_TYPE__HEALTH_MANAGEMENT;

	/**
	 * The feature id for the '<em><b>Module Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_SWITCH__MODULE_SCHEDULE = SUPER_SWITCH_TYPE__MODULE_SCHEDULE;

	/**
	 * The feature id for the '<em><b>Partitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_SWITCH__PARTITIONS = SUPER_SWITCH_TYPE__PARTITIONS;

	/**
	 * The number of structural features of the '<em>A664 Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_SWITCH_FEATURE_COUNT = SUPER_SWITCH_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>A664 Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_SWITCH_OPERATION_COUNT = SUPER_SWITCH_TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ucof.devices.devicetypes.SuperA653ModuleType <em>Super A653 Module Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super A653 Module Type</em>'.
	 * @see ucof.devices.devicetypes.SuperA653ModuleType
	 * @generated
	 */
	EClass getSuperA653ModuleType();

	/**
	 * Returns the meta object for the containment reference '{@link ucof.devices.devicetypes.SuperA653ModuleType#getHealthManagement <em>Health Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Health Management</em>'.
	 * @see ucof.devices.devicetypes.SuperA653ModuleType#getHealthManagement()
	 * @see #getSuperA653ModuleType()
	 * @generated
	 */
	EReference getSuperA653ModuleType_HealthManagement();

	/**
	 * Returns the meta object for the containment reference '{@link ucof.devices.devicetypes.SuperA653ModuleType#getModuleSchedule <em>Module Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Module Schedule</em>'.
	 * @see ucof.devices.devicetypes.SuperA653ModuleType#getModuleSchedule()
	 * @see #getSuperA653ModuleType()
	 * @generated
	 */
	EReference getSuperA653ModuleType_ModuleSchedule();

	/**
	 * Returns the meta object for the containment reference '{@link ucof.devices.devicetypes.SuperA653ModuleType#getPartitions <em>Partitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Partitions</em>'.
	 * @see ucof.devices.devicetypes.SuperA653ModuleType#getPartitions()
	 * @see #getSuperA653ModuleType()
	 * @generated
	 */
	EReference getSuperA653ModuleType_Partitions();

	/**
	 * Returns the meta object for class '{@link ucof.devices.devicetypes.A653P1Module <em>A653P1 Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A653P1 Module</em>'.
	 * @see ucof.devices.devicetypes.A653P1Module
	 * @generated
	 */
	EClass getA653P1Module();

	/**
	 * Returns the meta object for class '{@link ucof.devices.devicetypes.A653P4Module <em>A653P4 Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A653P4 Module</em>'.
	 * @see ucof.devices.devicetypes.A653P4Module
	 * @generated
	 */
	EClass getA653P4Module();

	/**
	 * Returns the meta object for class '{@link ucof.devices.devicetypes.IOModule <em>IO Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IO Module</em>'.
	 * @see ucof.devices.devicetypes.IOModule
	 * @generated
	 */
	EClass getIOModule();

	/**
	 * Returns the meta object for class '{@link ucof.devices.devicetypes.Peripheral <em>Peripheral</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Peripheral</em>'.
	 * @see ucof.devices.devicetypes.Peripheral
	 * @generated
	 */
	EClass getPeripheral();

	/**
	 * Returns the meta object for the attribute '{@link ucof.devices.devicetypes.Peripheral#getPeripheralType <em>Peripheral Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Peripheral Type</em>'.
	 * @see ucof.devices.devicetypes.Peripheral#getPeripheralType()
	 * @see #getPeripheral()
	 * @generated
	 */
	EAttribute getPeripheral_PeripheralType();

	/**
	 * Returns the meta object for class '{@link ucof.devices.devicetypes.SuperSwitchType <em>Super Switch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Switch Type</em>'.
	 * @see ucof.devices.devicetypes.SuperSwitchType
	 * @generated
	 */
	EClass getSuperSwitchType();

	/**
	 * Returns the meta object for class '{@link ucof.devices.devicetypes.A664Switch <em>A664 Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A664 Switch</em>'.
	 * @see ucof.devices.devicetypes.A664Switch
	 * @generated
	 */
	EClass getA664Switch();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DevicetypesFactory getDevicetypesFactory();

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
		 * The meta object literal for the '{@link ucof.devices.devicetypes.impl.SuperA653ModuleTypeImpl <em>Super A653 Module Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.devicetypes.impl.SuperA653ModuleTypeImpl
		 * @see ucof.devices.devicetypes.impl.DevicetypesPackageImpl#getSuperA653ModuleType()
		 * @generated
		 */
		EClass SUPER_A653_MODULE_TYPE = eINSTANCE.getSuperA653ModuleType();

		/**
		 * The meta object literal for the '<em><b>Health Management</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_A653_MODULE_TYPE__HEALTH_MANAGEMENT = eINSTANCE.getSuperA653ModuleType_HealthManagement();

		/**
		 * The meta object literal for the '<em><b>Module Schedule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_A653_MODULE_TYPE__MODULE_SCHEDULE = eINSTANCE.getSuperA653ModuleType_ModuleSchedule();

		/**
		 * The meta object literal for the '<em><b>Partitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_A653_MODULE_TYPE__PARTITIONS = eINSTANCE.getSuperA653ModuleType_Partitions();

		/**
		 * The meta object literal for the '{@link ucof.devices.devicetypes.impl.A653P1ModuleImpl <em>A653P1 Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.devicetypes.impl.A653P1ModuleImpl
		 * @see ucof.devices.devicetypes.impl.DevicetypesPackageImpl#getA653P1Module()
		 * @generated
		 */
		EClass A653P1_MODULE = eINSTANCE.getA653P1Module();

		/**
		 * The meta object literal for the '{@link ucof.devices.devicetypes.impl.A653P4ModuleImpl <em>A653P4 Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.devicetypes.impl.A653P4ModuleImpl
		 * @see ucof.devices.devicetypes.impl.DevicetypesPackageImpl#getA653P4Module()
		 * @generated
		 */
		EClass A653P4_MODULE = eINSTANCE.getA653P4Module();

		/**
		 * The meta object literal for the '{@link ucof.devices.devicetypes.impl.IOModuleImpl <em>IO Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.devicetypes.impl.IOModuleImpl
		 * @see ucof.devices.devicetypes.impl.DevicetypesPackageImpl#getIOModule()
		 * @generated
		 */
		EClass IO_MODULE = eINSTANCE.getIOModule();

		/**
		 * The meta object literal for the '{@link ucof.devices.devicetypes.impl.PeripheralImpl <em>Peripheral</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.devicetypes.impl.PeripheralImpl
		 * @see ucof.devices.devicetypes.impl.DevicetypesPackageImpl#getPeripheral()
		 * @generated
		 */
		EClass PERIPHERAL = eINSTANCE.getPeripheral();

		/**
		 * The meta object literal for the '<em><b>Peripheral Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIPHERAL__PERIPHERAL_TYPE = eINSTANCE.getPeripheral_PeripheralType();

		/**
		 * The meta object literal for the '{@link ucof.devices.devicetypes.impl.SuperSwitchTypeImpl <em>Super Switch Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.devicetypes.impl.SuperSwitchTypeImpl
		 * @see ucof.devices.devicetypes.impl.DevicetypesPackageImpl#getSuperSwitchType()
		 * @generated
		 */
		EClass SUPER_SWITCH_TYPE = eINSTANCE.getSuperSwitchType();

		/**
		 * The meta object literal for the '{@link ucof.devices.devicetypes.impl.A664SwitchImpl <em>A664 Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.devicetypes.impl.A664SwitchImpl
		 * @see ucof.devices.devicetypes.impl.DevicetypesPackageImpl#getA664Switch()
		 * @generated
		 */
		EClass A664_SWITCH = eINSTANCE.getA664Switch();

	}

} //DevicetypesPackage
