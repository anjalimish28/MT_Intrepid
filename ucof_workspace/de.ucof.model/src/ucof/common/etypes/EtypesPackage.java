/**
 */
package ucof.common.etypes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * Container, including commonly used eTypes
 * <!-- end-model-doc -->
 * @see ucof.common.etypes.EtypesFactory
 * @model kind="package"
 * @generated
 */
public interface EtypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "etypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://gitlab.com/ucof/ucof.de/model/v001/ucof/common/etypes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ucof.model.common.etypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EtypesPackage eINSTANCE = ucof.common.etypes.impl.EtypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link ucof.common.etypes.impl.SuperIdentifierTypeImpl <em>Super Identifier Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.common.etypes.impl.SuperIdentifierTypeImpl
	 * @see ucof.common.etypes.impl.EtypesPackageImpl#getSuperIdentifierType()
	 * @generated
	 */
	int SUPER_IDENTIFIER_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_IDENTIFIER_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_IDENTIFIER_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Super Identifier Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_IDENTIFIER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Super Identifier Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_IDENTIFIER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ucof.common.etypes.impl.SuperTrackingTypeImpl <em>Super Tracking Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.common.etypes.impl.SuperTrackingTypeImpl
	 * @see ucof.common.etypes.impl.EtypesPackageImpl#getSuperTrackingType()
	 * @generated
	 */
	int SUPER_TRACKING_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_TRACKING_TYPE__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_TRACKING_TYPE__MODIFIED = 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_TRACKING_TYPE__MODIFIER = 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_TRACKING_TYPE__TRACE_LINK = 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_TRACKING_TYPE__CREATED = 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_TRACKING_TYPE__CREATOR = 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_TRACKING_TYPE__VERSION = 6;

	/**
	 * The number of structural features of the '<em>Super Tracking Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_TRACKING_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Super Tracking Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_TRACKING_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ucof.common.etypes.impl.SuperSetTypeImpl <em>Super Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.common.etypes.impl.SuperSetTypeImpl
	 * @see ucof.common.etypes.impl.EtypesPackageImpl#getSuperSetType()
	 * @generated
	 */
	int SUPER_SET_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_SET_TYPE__ID = SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_SET_TYPE__NAME = SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_SET_TYPE__DOCUMENTATION = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_SET_TYPE__MODIFIED = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_SET_TYPE__MODIFIER = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_SET_TYPE__TRACE_LINK = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_SET_TYPE__CREATED = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_SET_TYPE__CREATOR = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_SET_TYPE__VERSION = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Setname</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_SET_TYPE__SETNAME = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Super Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_SET_TYPE_FEATURE_COUNT = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Super Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_SET_TYPE_OPERATION_COUNT = SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.common.etypes.impl.MemoryImpl <em>Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.common.etypes.impl.MemoryImpl
	 * @see ucof.common.etypes.impl.EtypesPackageImpl#getMemory()
	 * @generated
	 */
	int MEMORY = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__ID = SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__NAME = SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__DOCUMENTATION = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__MODIFIED = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__MODIFIER = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__TRACE_LINK = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__CREATED = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__CREATOR = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__VERSION = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Memory Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__MEMORY_REQUIREMENTS = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_FEATURE_COUNT = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_OPERATION_COUNT = SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.common.etypes.impl.MemoryRequirementImpl <em>Memory Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.common.etypes.impl.MemoryRequirementImpl
	 * @see ucof.common.etypes.impl.EtypesPackageImpl#getMemoryRequirement()
	 * @generated
	 */
	int MEMORY_REQUIREMENT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_REQUIREMENT__ID = SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_REQUIREMENT__NAME = SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_REQUIREMENT__DOCUMENTATION = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_REQUIREMENT__MODIFIED = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_REQUIREMENT__MODIFIER = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_REQUIREMENT__TRACE_LINK = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_REQUIREMENT__CREATED = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_REQUIREMENT__CREATOR = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_REQUIREMENT__VERSION = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_REQUIREMENT__ACCESS = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Memory Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_REQUIREMENT__MEMORY_TYPE = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_REQUIREMENT__SIZE = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_REQUIREMENT__ADDRESS = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Memory Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_REQUIREMENT_FEATURE_COUNT = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Memory Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_REQUIREMENT_OPERATION_COUNT = SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.common.etypes.impl.SuperDeviceTypeImpl <em>Super Device Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.common.etypes.impl.SuperDeviceTypeImpl
	 * @see ucof.common.etypes.impl.EtypesPackageImpl#getSuperDeviceType()
	 * @generated
	 */
	int SUPER_DEVICE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_DEVICE_TYPE__ID = SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_DEVICE_TYPE__NAME = SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_DEVICE_TYPE__DOCUMENTATION = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_DEVICE_TYPE__MODIFIED = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_DEVICE_TYPE__MODIFIER = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_DEVICE_TYPE__TRACE_LINK = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_DEVICE_TYPE__CREATED = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_DEVICE_TYPE__CREATOR = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_DEVICE_TYPE__VERSION = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Configuration Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_DEVICE_TYPE__CONFIGURATION_LINK = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_DEVICE_TYPE__PORTS = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Super Device Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_DEVICE_TYPE_FEATURE_COUNT = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Super Device Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_DEVICE_TYPE_OPERATION_COUNT = SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.common.etypes.impl.SuperPortTypeImpl <em>Super Port Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.common.etypes.impl.SuperPortTypeImpl
	 * @see ucof.common.etypes.impl.EtypesPackageImpl#getSuperPortType()
	 * @generated
	 */
	int SUPER_PORT_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PORT_TYPE__ID = SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PORT_TYPE__NAME = SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PORT_TYPE__DOCUMENTATION = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PORT_TYPE__MODIFIED = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PORT_TYPE__MODIFIER = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PORT_TYPE__TRACE_LINK = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PORT_TYPE__CREATED = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PORT_TYPE__CREATOR = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PORT_TYPE__VERSION = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Max Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PORT_TYPE__MAX_MESSAGE_SIZE = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Port Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PORT_TYPE__PORT_DIRECTION = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Super Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PORT_TYPE_FEATURE_COUNT = SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Super Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PORT_TYPE_OPERATION_COUNT = SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.common.etypes.impl.DevicePortsImpl <em>Device Ports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.common.etypes.impl.DevicePortsImpl
	 * @see ucof.common.etypes.impl.EtypesPackageImpl#getDevicePorts()
	 * @generated
	 */
	int DEVICE_PORTS = 7;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_PORTS__DOCUMENTATION = SUPER_TRACKING_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_PORTS__MODIFIED = SUPER_TRACKING_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_PORTS__MODIFIER = SUPER_TRACKING_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_PORTS__TRACE_LINK = SUPER_TRACKING_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_PORTS__CREATED = SUPER_TRACKING_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_PORTS__CREATOR = SUPER_TRACKING_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_PORTS__VERSION = SUPER_TRACKING_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_PORTS__ID = SUPER_TRACKING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_PORTS__NAME = SUPER_TRACKING_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_PORTS__PORT = SUPER_TRACKING_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Device Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_PORTS_FEATURE_COUNT = SUPER_TRACKING_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Device Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_PORTS_OPERATION_COUNT = SUPER_TRACKING_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.common.etypes.impl.SuperInterCommunicationPortTypeImpl <em>Super Inter Communication Port Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.common.etypes.impl.SuperInterCommunicationPortTypeImpl
	 * @see ucof.common.etypes.impl.EtypesPackageImpl#getSuperInterCommunicationPortType()
	 * @generated
	 */
	int SUPER_INTER_COMMUNICATION_PORT_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_INTER_COMMUNICATION_PORT_TYPE__ID = SUPER_PORT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_INTER_COMMUNICATION_PORT_TYPE__NAME = SUPER_PORT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_INTER_COMMUNICATION_PORT_TYPE__DOCUMENTATION = SUPER_PORT_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_INTER_COMMUNICATION_PORT_TYPE__MODIFIED = SUPER_PORT_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_INTER_COMMUNICATION_PORT_TYPE__MODIFIER = SUPER_PORT_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_INTER_COMMUNICATION_PORT_TYPE__TRACE_LINK = SUPER_PORT_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_INTER_COMMUNICATION_PORT_TYPE__CREATED = SUPER_PORT_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_INTER_COMMUNICATION_PORT_TYPE__CREATOR = SUPER_PORT_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_INTER_COMMUNICATION_PORT_TYPE__VERSION = SUPER_PORT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Max Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_INTER_COMMUNICATION_PORT_TYPE__MAX_MESSAGE_SIZE = SUPER_PORT_TYPE__MAX_MESSAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Port Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_INTER_COMMUNICATION_PORT_TYPE__PORT_DIRECTION = SUPER_PORT_TYPE__PORT_DIRECTION;

	/**
	 * The number of structural features of the '<em>Super Inter Communication Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_INTER_COMMUNICATION_PORT_TYPE_FEATURE_COUNT = SUPER_PORT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Super Inter Communication Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_INTER_COMMUNICATION_PORT_TYPE_OPERATION_COUNT = SUPER_PORT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.common.etypes.impl.SamplingPortImpl <em>Sampling Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.common.etypes.impl.SamplingPortImpl
	 * @see ucof.common.etypes.impl.EtypesPackageImpl#getSamplingPort()
	 * @generated
	 */
	int SAMPLING_PORT = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLING_PORT__ID = SUPER_INTER_COMMUNICATION_PORT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLING_PORT__NAME = SUPER_INTER_COMMUNICATION_PORT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLING_PORT__DOCUMENTATION = SUPER_INTER_COMMUNICATION_PORT_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLING_PORT__MODIFIED = SUPER_INTER_COMMUNICATION_PORT_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLING_PORT__MODIFIER = SUPER_INTER_COMMUNICATION_PORT_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLING_PORT__TRACE_LINK = SUPER_INTER_COMMUNICATION_PORT_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLING_PORT__CREATED = SUPER_INTER_COMMUNICATION_PORT_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLING_PORT__CREATOR = SUPER_INTER_COMMUNICATION_PORT_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLING_PORT__VERSION = SUPER_INTER_COMMUNICATION_PORT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Max Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLING_PORT__MAX_MESSAGE_SIZE = SUPER_INTER_COMMUNICATION_PORT_TYPE__MAX_MESSAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Port Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLING_PORT__PORT_DIRECTION = SUPER_INTER_COMMUNICATION_PORT_TYPE__PORT_DIRECTION;

	/**
	 * The feature id for the '<em><b>Refresh Period OR Transmission Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLING_PORT__REFRESH_PERIOD_OR_TRANSMISSION_RATE = SUPER_INTER_COMMUNICATION_PORT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sampling Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLING_PORT_FEATURE_COUNT = SUPER_INTER_COMMUNICATION_PORT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sampling Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLING_PORT_OPERATION_COUNT = SUPER_INTER_COMMUNICATION_PORT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.common.etypes.impl.QueuingPortImpl <em>Queuing Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.common.etypes.impl.QueuingPortImpl
	 * @see ucof.common.etypes.impl.EtypesPackageImpl#getQueuingPort()
	 * @generated
	 */
	int QUEUING_PORT = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUING_PORT__ID = SUPER_INTER_COMMUNICATION_PORT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUING_PORT__NAME = SUPER_INTER_COMMUNICATION_PORT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUING_PORT__DOCUMENTATION = SUPER_INTER_COMMUNICATION_PORT_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUING_PORT__MODIFIED = SUPER_INTER_COMMUNICATION_PORT_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUING_PORT__MODIFIER = SUPER_INTER_COMMUNICATION_PORT_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUING_PORT__TRACE_LINK = SUPER_INTER_COMMUNICATION_PORT_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUING_PORT__CREATED = SUPER_INTER_COMMUNICATION_PORT_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUING_PORT__CREATOR = SUPER_INTER_COMMUNICATION_PORT_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUING_PORT__VERSION = SUPER_INTER_COMMUNICATION_PORT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Max Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUING_PORT__MAX_MESSAGE_SIZE = SUPER_INTER_COMMUNICATION_PORT_TYPE__MAX_MESSAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Port Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUING_PORT__PORT_DIRECTION = SUPER_INTER_COMMUNICATION_PORT_TYPE__PORT_DIRECTION;

	/**
	 * The feature id for the '<em><b>Max Number Of Messages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUING_PORT__MAX_NUMBER_OF_MESSAGES = SUPER_INTER_COMMUNICATION_PORT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Queuing Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUING_PORT_FEATURE_COUNT = SUPER_INTER_COMMUNICATION_PORT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Queuing Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUING_PORT_OPERATION_COUNT = SUPER_INTER_COMMUNICATION_PORT_TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ucof.common.etypes.SuperIdentifierType <em>Super Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Identifier Type</em>'.
	 * @see ucof.common.etypes.SuperIdentifierType
	 * @generated
	 */
	EClass getSuperIdentifierType();

	/**
	 * Returns the meta object for the attribute '{@link ucof.common.etypes.SuperIdentifierType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ucof.common.etypes.SuperIdentifierType#getId()
	 * @see #getSuperIdentifierType()
	 * @generated
	 */
	EAttribute getSuperIdentifierType_Id();

	/**
	 * Returns the meta object for the attribute '{@link ucof.common.etypes.SuperIdentifierType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ucof.common.etypes.SuperIdentifierType#getName()
	 * @see #getSuperIdentifierType()
	 * @generated
	 */
	EAttribute getSuperIdentifierType_Name();

	/**
	 * Returns the meta object for class '{@link ucof.common.etypes.SuperTrackingType <em>Super Tracking Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Tracking Type</em>'.
	 * @see ucof.common.etypes.SuperTrackingType
	 * @generated
	 */
	EClass getSuperTrackingType();

	/**
	 * Returns the meta object for the attribute '{@link ucof.common.etypes.SuperTrackingType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see ucof.common.etypes.SuperTrackingType#getDocumentation()
	 * @see #getSuperTrackingType()
	 * @generated
	 */
	EAttribute getSuperTrackingType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link ucof.common.etypes.SuperTrackingType#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see ucof.common.etypes.SuperTrackingType#getModified()
	 * @see #getSuperTrackingType()
	 * @generated
	 */
	EAttribute getSuperTrackingType_Modified();

	/**
	 * Returns the meta object for the attribute '{@link ucof.common.etypes.SuperTrackingType#getModifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modifier</em>'.
	 * @see ucof.common.etypes.SuperTrackingType#getModifier()
	 * @see #getSuperTrackingType()
	 * @generated
	 */
	EAttribute getSuperTrackingType_Modifier();

	/**
	 * Returns the meta object for the attribute '{@link ucof.common.etypes.SuperTrackingType#getTraceLink <em>Trace Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trace Link</em>'.
	 * @see ucof.common.etypes.SuperTrackingType#getTraceLink()
	 * @see #getSuperTrackingType()
	 * @generated
	 */
	EAttribute getSuperTrackingType_TraceLink();

	/**
	 * Returns the meta object for the attribute '{@link ucof.common.etypes.SuperTrackingType#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see ucof.common.etypes.SuperTrackingType#getCreated()
	 * @see #getSuperTrackingType()
	 * @generated
	 */
	EAttribute getSuperTrackingType_Created();

	/**
	 * Returns the meta object for the attribute '{@link ucof.common.etypes.SuperTrackingType#getCreator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creator</em>'.
	 * @see ucof.common.etypes.SuperTrackingType#getCreator()
	 * @see #getSuperTrackingType()
	 * @generated
	 */
	EAttribute getSuperTrackingType_Creator();

	/**
	 * Returns the meta object for the attribute '{@link ucof.common.etypes.SuperTrackingType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see ucof.common.etypes.SuperTrackingType#getVersion()
	 * @see #getSuperTrackingType()
	 * @generated
	 */
	EAttribute getSuperTrackingType_Version();

	/**
	 * Returns the meta object for class '{@link ucof.common.etypes.SuperSetType <em>Super Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Set Type</em>'.
	 * @see ucof.common.etypes.SuperSetType
	 * @generated
	 */
	EClass getSuperSetType();

	/**
	 * Returns the meta object for the attribute list '{@link ucof.common.etypes.SuperSetType#getSetname <em>Setname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Setname</em>'.
	 * @see ucof.common.etypes.SuperSetType#getSetname()
	 * @see #getSuperSetType()
	 * @generated
	 */
	EAttribute getSuperSetType_Setname();

	/**
	 * Returns the meta object for class '{@link ucof.common.etypes.Memory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory</em>'.
	 * @see ucof.common.etypes.Memory
	 * @generated
	 */
	EClass getMemory();

	/**
	 * Returns the meta object for the containment reference list '{@link ucof.common.etypes.Memory#getMemoryRequirements <em>Memory Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Memory Requirements</em>'.
	 * @see ucof.common.etypes.Memory#getMemoryRequirements()
	 * @see #getMemory()
	 * @generated
	 */
	EReference getMemory_MemoryRequirements();

	/**
	 * Returns the meta object for class '{@link ucof.common.etypes.MemoryRequirement <em>Memory Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Requirement</em>'.
	 * @see ucof.common.etypes.MemoryRequirement
	 * @generated
	 */
	EClass getMemoryRequirement();

	/**
	 * Returns the meta object for the attribute '{@link ucof.common.etypes.MemoryRequirement#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see ucof.common.etypes.MemoryRequirement#getAccess()
	 * @see #getMemoryRequirement()
	 * @generated
	 */
	EAttribute getMemoryRequirement_Access();

	/**
	 * Returns the meta object for the attribute '{@link ucof.common.etypes.MemoryRequirement#getMemoryType <em>Memory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Type</em>'.
	 * @see ucof.common.etypes.MemoryRequirement#getMemoryType()
	 * @see #getMemoryRequirement()
	 * @generated
	 */
	EAttribute getMemoryRequirement_MemoryType();

	/**
	 * Returns the meta object for the attribute '{@link ucof.common.etypes.MemoryRequirement#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see ucof.common.etypes.MemoryRequirement#getSize()
	 * @see #getMemoryRequirement()
	 * @generated
	 */
	EAttribute getMemoryRequirement_Size();

	/**
	 * Returns the meta object for the attribute '{@link ucof.common.etypes.MemoryRequirement#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see ucof.common.etypes.MemoryRequirement#getAddress()
	 * @see #getMemoryRequirement()
	 * @generated
	 */
	EAttribute getMemoryRequirement_Address();

	/**
	 * Returns the meta object for class '{@link ucof.common.etypes.SuperDeviceType <em>Super Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Device Type</em>'.
	 * @see ucof.common.etypes.SuperDeviceType
	 * @generated
	 */
	EClass getSuperDeviceType();

	/**
	 * Returns the meta object for the attribute '{@link ucof.common.etypes.SuperDeviceType#getConfigurationLink <em>Configuration Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Link</em>'.
	 * @see ucof.common.etypes.SuperDeviceType#getConfigurationLink()
	 * @see #getSuperDeviceType()
	 * @generated
	 */
	EAttribute getSuperDeviceType_ConfigurationLink();

	/**
	 * Returns the meta object for the containment reference '{@link ucof.common.etypes.SuperDeviceType#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ports</em>'.
	 * @see ucof.common.etypes.SuperDeviceType#getPorts()
	 * @see #getSuperDeviceType()
	 * @generated
	 */
	EReference getSuperDeviceType_Ports();

	/**
	 * Returns the meta object for class '{@link ucof.common.etypes.SuperPortType <em>Super Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Port Type</em>'.
	 * @see ucof.common.etypes.SuperPortType
	 * @generated
	 */
	EClass getSuperPortType();

	/**
	 * Returns the meta object for the attribute '{@link ucof.common.etypes.SuperPortType#getMaxMessageSize <em>Max Message Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Message Size</em>'.
	 * @see ucof.common.etypes.SuperPortType#getMaxMessageSize()
	 * @see #getSuperPortType()
	 * @generated
	 */
	EAttribute getSuperPortType_MaxMessageSize();

	/**
	 * Returns the meta object for the attribute '{@link ucof.common.etypes.SuperPortType#getPortDirection <em>Port Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Direction</em>'.
	 * @see ucof.common.etypes.SuperPortType#getPortDirection()
	 * @see #getSuperPortType()
	 * @generated
	 */
	EAttribute getSuperPortType_PortDirection();

	/**
	 * Returns the meta object for class '{@link ucof.common.etypes.DevicePorts <em>Device Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Ports</em>'.
	 * @see ucof.common.etypes.DevicePorts
	 * @generated
	 */
	EClass getDevicePorts();

	/**
	 * Returns the meta object for the containment reference list '{@link ucof.common.etypes.DevicePorts#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see ucof.common.etypes.DevicePorts#getPort()
	 * @see #getDevicePorts()
	 * @generated
	 */
	EReference getDevicePorts_Port();

	/**
	 * Returns the meta object for class '{@link ucof.common.etypes.SuperInterCommunicationPortType <em>Super Inter Communication Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Inter Communication Port Type</em>'.
	 * @see ucof.common.etypes.SuperInterCommunicationPortType
	 * @generated
	 */
	EClass getSuperInterCommunicationPortType();

	/**
	 * Returns the meta object for class '{@link ucof.common.etypes.SamplingPort <em>Sampling Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sampling Port</em>'.
	 * @see ucof.common.etypes.SamplingPort
	 * @generated
	 */
	EClass getSamplingPort();

	/**
	 * Returns the meta object for the attribute '{@link ucof.common.etypes.SamplingPort#getRefreshPeriodORTransmissionRate <em>Refresh Period OR Transmission Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refresh Period OR Transmission Rate</em>'.
	 * @see ucof.common.etypes.SamplingPort#getRefreshPeriodORTransmissionRate()
	 * @see #getSamplingPort()
	 * @generated
	 */
	EAttribute getSamplingPort_RefreshPeriodORTransmissionRate();

	/**
	 * Returns the meta object for class '{@link ucof.common.etypes.QueuingPort <em>Queuing Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Queuing Port</em>'.
	 * @see ucof.common.etypes.QueuingPort
	 * @generated
	 */
	EClass getQueuingPort();

	/**
	 * Returns the meta object for the attribute '{@link ucof.common.etypes.QueuingPort#getMaxNumberOfMessages <em>Max Number Of Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Number Of Messages</em>'.
	 * @see ucof.common.etypes.QueuingPort#getMaxNumberOfMessages()
	 * @see #getQueuingPort()
	 * @generated
	 */
	EAttribute getQueuingPort_MaxNumberOfMessages();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EtypesFactory getEtypesFactory();

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
		 * The meta object literal for the '{@link ucof.common.etypes.impl.SuperIdentifierTypeImpl <em>Super Identifier Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.common.etypes.impl.SuperIdentifierTypeImpl
		 * @see ucof.common.etypes.impl.EtypesPackageImpl#getSuperIdentifierType()
		 * @generated
		 */
		EClass SUPER_IDENTIFIER_TYPE = eINSTANCE.getSuperIdentifierType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_IDENTIFIER_TYPE__ID = eINSTANCE.getSuperIdentifierType_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_IDENTIFIER_TYPE__NAME = eINSTANCE.getSuperIdentifierType_Name();

		/**
		 * The meta object literal for the '{@link ucof.common.etypes.impl.SuperTrackingTypeImpl <em>Super Tracking Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.common.etypes.impl.SuperTrackingTypeImpl
		 * @see ucof.common.etypes.impl.EtypesPackageImpl#getSuperTrackingType()
		 * @generated
		 */
		EClass SUPER_TRACKING_TYPE = eINSTANCE.getSuperTrackingType();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_TRACKING_TYPE__DOCUMENTATION = eINSTANCE.getSuperTrackingType_Documentation();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_TRACKING_TYPE__MODIFIED = eINSTANCE.getSuperTrackingType_Modified();

		/**
		 * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_TRACKING_TYPE__MODIFIER = eINSTANCE.getSuperTrackingType_Modifier();

		/**
		 * The meta object literal for the '<em><b>Trace Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_TRACKING_TYPE__TRACE_LINK = eINSTANCE.getSuperTrackingType_TraceLink();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_TRACKING_TYPE__CREATED = eINSTANCE.getSuperTrackingType_Created();

		/**
		 * The meta object literal for the '<em><b>Creator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_TRACKING_TYPE__CREATOR = eINSTANCE.getSuperTrackingType_Creator();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_TRACKING_TYPE__VERSION = eINSTANCE.getSuperTrackingType_Version();

		/**
		 * The meta object literal for the '{@link ucof.common.etypes.impl.SuperSetTypeImpl <em>Super Set Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.common.etypes.impl.SuperSetTypeImpl
		 * @see ucof.common.etypes.impl.EtypesPackageImpl#getSuperSetType()
		 * @generated
		 */
		EClass SUPER_SET_TYPE = eINSTANCE.getSuperSetType();

		/**
		 * The meta object literal for the '<em><b>Setname</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_SET_TYPE__SETNAME = eINSTANCE.getSuperSetType_Setname();

		/**
		 * The meta object literal for the '{@link ucof.common.etypes.impl.MemoryImpl <em>Memory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.common.etypes.impl.MemoryImpl
		 * @see ucof.common.etypes.impl.EtypesPackageImpl#getMemory()
		 * @generated
		 */
		EClass MEMORY = eINSTANCE.getMemory();

		/**
		 * The meta object literal for the '<em><b>Memory Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY__MEMORY_REQUIREMENTS = eINSTANCE.getMemory_MemoryRequirements();

		/**
		 * The meta object literal for the '{@link ucof.common.etypes.impl.MemoryRequirementImpl <em>Memory Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.common.etypes.impl.MemoryRequirementImpl
		 * @see ucof.common.etypes.impl.EtypesPackageImpl#getMemoryRequirement()
		 * @generated
		 */
		EClass MEMORY_REQUIREMENT = eINSTANCE.getMemoryRequirement();

		/**
		 * The meta object literal for the '<em><b>Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_REQUIREMENT__ACCESS = eINSTANCE.getMemoryRequirement_Access();

		/**
		 * The meta object literal for the '<em><b>Memory Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_REQUIREMENT__MEMORY_TYPE = eINSTANCE.getMemoryRequirement_MemoryType();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_REQUIREMENT__SIZE = eINSTANCE.getMemoryRequirement_Size();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_REQUIREMENT__ADDRESS = eINSTANCE.getMemoryRequirement_Address();

		/**
		 * The meta object literal for the '{@link ucof.common.etypes.impl.SuperDeviceTypeImpl <em>Super Device Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.common.etypes.impl.SuperDeviceTypeImpl
		 * @see ucof.common.etypes.impl.EtypesPackageImpl#getSuperDeviceType()
		 * @generated
		 */
		EClass SUPER_DEVICE_TYPE = eINSTANCE.getSuperDeviceType();

		/**
		 * The meta object literal for the '<em><b>Configuration Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_DEVICE_TYPE__CONFIGURATION_LINK = eINSTANCE.getSuperDeviceType_ConfigurationLink();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_DEVICE_TYPE__PORTS = eINSTANCE.getSuperDeviceType_Ports();

		/**
		 * The meta object literal for the '{@link ucof.common.etypes.impl.SuperPortTypeImpl <em>Super Port Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.common.etypes.impl.SuperPortTypeImpl
		 * @see ucof.common.etypes.impl.EtypesPackageImpl#getSuperPortType()
		 * @generated
		 */
		EClass SUPER_PORT_TYPE = eINSTANCE.getSuperPortType();

		/**
		 * The meta object literal for the '<em><b>Max Message Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_PORT_TYPE__MAX_MESSAGE_SIZE = eINSTANCE.getSuperPortType_MaxMessageSize();

		/**
		 * The meta object literal for the '<em><b>Port Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_PORT_TYPE__PORT_DIRECTION = eINSTANCE.getSuperPortType_PortDirection();

		/**
		 * The meta object literal for the '{@link ucof.common.etypes.impl.DevicePortsImpl <em>Device Ports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.common.etypes.impl.DevicePortsImpl
		 * @see ucof.common.etypes.impl.EtypesPackageImpl#getDevicePorts()
		 * @generated
		 */
		EClass DEVICE_PORTS = eINSTANCE.getDevicePorts();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_PORTS__PORT = eINSTANCE.getDevicePorts_Port();

		/**
		 * The meta object literal for the '{@link ucof.common.etypes.impl.SuperInterCommunicationPortTypeImpl <em>Super Inter Communication Port Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.common.etypes.impl.SuperInterCommunicationPortTypeImpl
		 * @see ucof.common.etypes.impl.EtypesPackageImpl#getSuperInterCommunicationPortType()
		 * @generated
		 */
		EClass SUPER_INTER_COMMUNICATION_PORT_TYPE = eINSTANCE.getSuperInterCommunicationPortType();

		/**
		 * The meta object literal for the '{@link ucof.common.etypes.impl.SamplingPortImpl <em>Sampling Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.common.etypes.impl.SamplingPortImpl
		 * @see ucof.common.etypes.impl.EtypesPackageImpl#getSamplingPort()
		 * @generated
		 */
		EClass SAMPLING_PORT = eINSTANCE.getSamplingPort();

		/**
		 * The meta object literal for the '<em><b>Refresh Period OR Transmission Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLING_PORT__REFRESH_PERIOD_OR_TRANSMISSION_RATE = eINSTANCE.getSamplingPort_RefreshPeriodORTransmissionRate();

		/**
		 * The meta object literal for the '{@link ucof.common.etypes.impl.QueuingPortImpl <em>Queuing Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.common.etypes.impl.QueuingPortImpl
		 * @see ucof.common.etypes.impl.EtypesPackageImpl#getQueuingPort()
		 * @generated
		 */
		EClass QUEUING_PORT = eINSTANCE.getQueuingPort();

		/**
		 * The meta object literal for the '<em><b>Max Number Of Messages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUEUING_PORT__MAX_NUMBER_OF_MESSAGES = eINSTANCE.getQueuingPort_MaxNumberOfMessages();

	}

} //EtypesPackage
