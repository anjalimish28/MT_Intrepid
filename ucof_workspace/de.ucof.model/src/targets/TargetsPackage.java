/**
 */
package targets;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see targets.TargetsFactory
 * @model kind="package"
 * @generated
 */
public interface TargetsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "targets";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://gitlab.com/ucof/ucof.de/model/v001/ucof/targets";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ucof.model.targets";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TargetsPackage eINSTANCE = targets.impl.TargetsPackageImpl.init();

	/**
	 * The meta object id for the '{@link targets.impl.TargetsImpl <em>Targets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.impl.TargetsImpl
	 * @see targets.impl.TargetsPackageImpl#getTargets()
	 * @generated
	 */
	int TARGETS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETS__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETS__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETS__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETS__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETS__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETS__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETS__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETS__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETS__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Target Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETS__TARGET_CONFIGURATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Targets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETS_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Targets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETS_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.impl.SuperTargetTypeImpl <em>Super Target Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.impl.SuperTargetTypeImpl
	 * @see targets.impl.TargetsPackageImpl#getSuperTargetType()
	 * @generated
	 */
	int SUPER_TARGET_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_TARGET_TYPE__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_TARGET_TYPE__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_TARGET_TYPE__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_TARGET_TYPE__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_TARGET_TYPE__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_TARGET_TYPE__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_TARGET_TYPE__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_TARGET_TYPE__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_TARGET_TYPE__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_TARGET_TYPE__PROJECT_NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Super Target Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_TARGET_TYPE_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Super Target Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_TARGET_TYPE_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.impl.SuperIOHardwareTypeImpl <em>Super IO Hardware Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.impl.SuperIOHardwareTypeImpl
	 * @see targets.impl.TargetsPackageImpl#getSuperIOHardwareType()
	 * @generated
	 */
	int SUPER_IO_HARDWARE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_IO_HARDWARE_TYPE__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_IO_HARDWARE_TYPE__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_IO_HARDWARE_TYPE__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_IO_HARDWARE_TYPE__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_IO_HARDWARE_TYPE__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_IO_HARDWARE_TYPE__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_IO_HARDWARE_TYPE__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_IO_HARDWARE_TYPE__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_IO_HARDWARE_TYPE__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Assignment Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_IO_HARDWARE_TYPE__ASSIGNMENT_SPECIFICATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Super IO Hardware Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_IO_HARDWARE_TYPE_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Super IO Hardware Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_IO_HARDWARE_TYPE_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.impl.SuperClassExtensionTypeImpl <em>Super Class Extension Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.impl.SuperClassExtensionTypeImpl
	 * @see targets.impl.TargetsPackageImpl#getSuperClassExtensionType()
	 * @generated
	 */
	int SUPER_CLASS_EXTENSION_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CLASS_EXTENSION_TYPE__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CLASS_EXTENSION_TYPE__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CLASS_EXTENSION_TYPE__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CLASS_EXTENSION_TYPE__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CLASS_EXTENSION_TYPE__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CLASS_EXTENSION_TYPE__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CLASS_EXTENSION_TYPE__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CLASS_EXTENSION_TYPE__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CLASS_EXTENSION_TYPE__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Extended Class ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CLASS_EXTENSION_TYPE__EXTENDED_CLASS_ID = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Super Class Extension Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CLASS_EXTENSION_TYPE_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Super Class Extension Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CLASS_EXTENSION_TYPE_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.impl.SuperAssignmentSpecificationTypeImpl <em>Super Assignment Specification Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.impl.SuperAssignmentSpecificationTypeImpl
	 * @see targets.impl.TargetsPackageImpl#getSuperAssignmentSpecificationType()
	 * @generated
	 */
	int SUPER_ASSIGNMENT_SPECIFICATION_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ASSIGNMENT_SPECIFICATION_TYPE__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ASSIGNMENT_SPECIFICATION_TYPE__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ASSIGNMENT_SPECIFICATION_TYPE__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ASSIGNMENT_SPECIFICATION_TYPE__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ASSIGNMENT_SPECIFICATION_TYPE__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ASSIGNMENT_SPECIFICATION_TYPE__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ASSIGNMENT_SPECIFICATION_TYPE__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ASSIGNMENT_SPECIFICATION_TYPE__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ASSIGNMENT_SPECIFICATION_TYPE__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Referenced Assignment ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ASSIGNMENT_SPECIFICATION_TYPE__REFERENCED_ASSIGNMENT_ID = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Super Assignment Specification Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ASSIGNMENT_SPECIFICATION_TYPE_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Super Assignment Specification Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ASSIGNMENT_SPECIFICATION_TYPE_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.impl.AttributeDatatypeConversionImpl <em>Attribute Datatype Conversion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.impl.AttributeDatatypeConversionImpl
	 * @see targets.impl.TargetsPackageImpl#getAttributeDatatypeConversion()
	 * @generated
	 */
	int ATTRIBUTE_DATATYPE_CONVERSION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DATATYPE_CONVERSION__ID = SUPER_ASSIGNMENT_SPECIFICATION_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DATATYPE_CONVERSION__NAME = SUPER_ASSIGNMENT_SPECIFICATION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DATATYPE_CONVERSION__DOCUMENTATION = SUPER_ASSIGNMENT_SPECIFICATION_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DATATYPE_CONVERSION__MODIFIED = SUPER_ASSIGNMENT_SPECIFICATION_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DATATYPE_CONVERSION__MODIFIER = SUPER_ASSIGNMENT_SPECIFICATION_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DATATYPE_CONVERSION__TRACE_LINK = SUPER_ASSIGNMENT_SPECIFICATION_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DATATYPE_CONVERSION__CREATED = SUPER_ASSIGNMENT_SPECIFICATION_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DATATYPE_CONVERSION__CREATOR = SUPER_ASSIGNMENT_SPECIFICATION_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DATATYPE_CONVERSION__VERSION = SUPER_ASSIGNMENT_SPECIFICATION_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Referenced Assignment ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DATATYPE_CONVERSION__REFERENCED_ASSIGNMENT_ID = SUPER_ASSIGNMENT_SPECIFICATION_TYPE__REFERENCED_ASSIGNMENT_ID;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DATATYPE_CONVERSION__ATTRIBUTE_NAME = SUPER_ASSIGNMENT_SPECIFICATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DATATYPE_CONVERSION__TARGET_DATA_TYPE = SUPER_ASSIGNMENT_SPECIFICATION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DATATYPE_CONVERSION__VALUE_PREFIX = SUPER_ASSIGNMENT_SPECIFICATION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value Postfix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DATATYPE_CONVERSION__VALUE_POSTFIX = SUPER_ASSIGNMENT_SPECIFICATION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Attribute Datatype Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DATATYPE_CONVERSION_FEATURE_COUNT = SUPER_ASSIGNMENT_SPECIFICATION_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Attribute Datatype Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DATATYPE_CONVERSION_OPERATION_COUNT = SUPER_ASSIGNMENT_SPECIFICATION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.impl.ResistorInfoImpl <em>Resistor Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.impl.ResistorInfoImpl
	 * @see targets.impl.TargetsPackageImpl#getResistorInfo()
	 * @generated
	 */
	int RESISTOR_INFO = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR_INFO__ID = SUPER_ASSIGNMENT_SPECIFICATION_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR_INFO__NAME = SUPER_ASSIGNMENT_SPECIFICATION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR_INFO__DOCUMENTATION = SUPER_ASSIGNMENT_SPECIFICATION_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR_INFO__MODIFIED = SUPER_ASSIGNMENT_SPECIFICATION_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR_INFO__MODIFIER = SUPER_ASSIGNMENT_SPECIFICATION_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR_INFO__TRACE_LINK = SUPER_ASSIGNMENT_SPECIFICATION_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR_INFO__CREATED = SUPER_ASSIGNMENT_SPECIFICATION_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR_INFO__CREATOR = SUPER_ASSIGNMENT_SPECIFICATION_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR_INFO__VERSION = SUPER_ASSIGNMENT_SPECIFICATION_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Referenced Assignment ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR_INFO__REFERENCED_ASSIGNMENT_ID = SUPER_ASSIGNMENT_SPECIFICATION_TYPE__REFERENCED_ASSIGNMENT_ID;

	/**
	 * The feature id for the '<em><b>Resistance Ohm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR_INFO__RESISTANCE_OHM = SUPER_ASSIGNMENT_SPECIFICATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resistor Part Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR_INFO__RESISTOR_PART_NUMBER = SUPER_ASSIGNMENT_SPECIFICATION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mount Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR_INFO__MOUNT_LOCATION = SUPER_ASSIGNMENT_SPECIFICATION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resistor Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR_INFO_FEATURE_COUNT = SUPER_ASSIGNMENT_SPECIFICATION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Resistor Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESISTOR_INFO_OPERATION_COUNT = SUPER_ASSIGNMENT_SPECIFICATION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.impl.HardwareInformationImpl <em>Hardware Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.impl.HardwareInformationImpl
	 * @see targets.impl.TargetsPackageImpl#getHardwareInformation()
	 * @generated
	 */
	int HARDWARE_INFORMATION = 7;

	/**
	 * The feature id for the '<em><b>Hardware Topology Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INFORMATION__HARDWARE_TOPOLOGY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Name Of Hardware System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INFORMATION__NAME_OF_HARDWARE_SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>IP Address Of Hardware System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INFORMATION__IP_ADDRESS_OF_HARDWARE_SYSTEM = 2;

	/**
	 * The number of structural features of the '<em>Hardware Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INFORMATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Hardware Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_INFORMATION_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link targets.impl.SuperHardwarePortTypeImpl <em>Super Hardware Port Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.impl.SuperHardwarePortTypeImpl
	 * @see targets.impl.TargetsPackageImpl#getSuperHardwarePortType()
	 * @generated
	 */
	int SUPER_HARDWARE_PORT_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_HARDWARE_PORT_TYPE__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_HARDWARE_PORT_TYPE__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_HARDWARE_PORT_TYPE__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_HARDWARE_PORT_TYPE__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_HARDWARE_PORT_TYPE__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_HARDWARE_PORT_TYPE__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_HARDWARE_PORT_TYPE__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_HARDWARE_PORT_TYPE__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_HARDWARE_PORT_TYPE__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Super Hardware Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_HARDWARE_PORT_TYPE_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Super Hardware Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_HARDWARE_PORT_TYPE_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link targets.Targets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Targets</em>'.
	 * @see targets.Targets
	 * @generated
	 */
	EClass getTargets();

	/**
	 * Returns the meta object for the containment reference list '{@link targets.Targets#getTargetConfiguration <em>Target Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Configuration</em>'.
	 * @see targets.Targets#getTargetConfiguration()
	 * @see #getTargets()
	 * @generated
	 */
	EReference getTargets_TargetConfiguration();

	/**
	 * Returns the meta object for class '{@link targets.SuperTargetType <em>Super Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Target Type</em>'.
	 * @see targets.SuperTargetType
	 * @generated
	 */
	EClass getSuperTargetType();

	/**
	 * Returns the meta object for the attribute '{@link targets.SuperTargetType#getProjectName <em>Project Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Name</em>'.
	 * @see targets.SuperTargetType#getProjectName()
	 * @see #getSuperTargetType()
	 * @generated
	 */
	EAttribute getSuperTargetType_ProjectName();

	/**
	 * Returns the meta object for class '{@link targets.SuperIOHardwareType <em>Super IO Hardware Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super IO Hardware Type</em>'.
	 * @see targets.SuperIOHardwareType
	 * @generated
	 */
	EClass getSuperIOHardwareType();

	/**
	 * Returns the meta object for the containment reference list '{@link targets.SuperIOHardwareType#getAssignmentSpecification <em>Assignment Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assignment Specification</em>'.
	 * @see targets.SuperIOHardwareType#getAssignmentSpecification()
	 * @see #getSuperIOHardwareType()
	 * @generated
	 */
	EReference getSuperIOHardwareType_AssignmentSpecification();

	/**
	 * Returns the meta object for class '{@link targets.SuperClassExtensionType <em>Super Class Extension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Class Extension Type</em>'.
	 * @see targets.SuperClassExtensionType
	 * @generated
	 */
	EClass getSuperClassExtensionType();

	/**
	 * Returns the meta object for the attribute '{@link targets.SuperClassExtensionType#getExtendedClassID <em>Extended Class ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extended Class ID</em>'.
	 * @see targets.SuperClassExtensionType#getExtendedClassID()
	 * @see #getSuperClassExtensionType()
	 * @generated
	 */
	EAttribute getSuperClassExtensionType_ExtendedClassID();

	/**
	 * Returns the meta object for class '{@link targets.SuperAssignmentSpecificationType <em>Super Assignment Specification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Assignment Specification Type</em>'.
	 * @see targets.SuperAssignmentSpecificationType
	 * @generated
	 */
	EClass getSuperAssignmentSpecificationType();

	/**
	 * Returns the meta object for the attribute '{@link targets.SuperAssignmentSpecificationType#getReferencedAssignmentID <em>Referenced Assignment ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Assignment ID</em>'.
	 * @see targets.SuperAssignmentSpecificationType#getReferencedAssignmentID()
	 * @see #getSuperAssignmentSpecificationType()
	 * @generated
	 */
	EAttribute getSuperAssignmentSpecificationType_ReferencedAssignmentID();

	/**
	 * Returns the meta object for class '{@link targets.AttributeDatatypeConversion <em>Attribute Datatype Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Datatype Conversion</em>'.
	 * @see targets.AttributeDatatypeConversion
	 * @generated
	 */
	EClass getAttributeDatatypeConversion();

	/**
	 * Returns the meta object for the attribute '{@link targets.AttributeDatatypeConversion#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Name</em>'.
	 * @see targets.AttributeDatatypeConversion#getAttributeName()
	 * @see #getAttributeDatatypeConversion()
	 * @generated
	 */
	EAttribute getAttributeDatatypeConversion_AttributeName();

	/**
	 * Returns the meta object for the attribute '{@link targets.AttributeDatatypeConversion#getTargetDataType <em>Target Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Data Type</em>'.
	 * @see targets.AttributeDatatypeConversion#getTargetDataType()
	 * @see #getAttributeDatatypeConversion()
	 * @generated
	 */
	EAttribute getAttributeDatatypeConversion_TargetDataType();

	/**
	 * Returns the meta object for the attribute '{@link targets.AttributeDatatypeConversion#getValuePrefix <em>Value Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Prefix</em>'.
	 * @see targets.AttributeDatatypeConversion#getValuePrefix()
	 * @see #getAttributeDatatypeConversion()
	 * @generated
	 */
	EAttribute getAttributeDatatypeConversion_ValuePrefix();

	/**
	 * Returns the meta object for the attribute '{@link targets.AttributeDatatypeConversion#getValuePostfix <em>Value Postfix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Postfix</em>'.
	 * @see targets.AttributeDatatypeConversion#getValuePostfix()
	 * @see #getAttributeDatatypeConversion()
	 * @generated
	 */
	EAttribute getAttributeDatatypeConversion_ValuePostfix();

	/**
	 * Returns the meta object for class '{@link targets.ResistorInfo <em>Resistor Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resistor Info</em>'.
	 * @see targets.ResistorInfo
	 * @generated
	 */
	EClass getResistorInfo();

	/**
	 * Returns the meta object for the attribute '{@link targets.ResistorInfo#getResistanceOhm <em>Resistance Ohm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resistance Ohm</em>'.
	 * @see targets.ResistorInfo#getResistanceOhm()
	 * @see #getResistorInfo()
	 * @generated
	 */
	EAttribute getResistorInfo_ResistanceOhm();

	/**
	 * Returns the meta object for the attribute '{@link targets.ResistorInfo#getResistorPartNumber <em>Resistor Part Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resistor Part Number</em>'.
	 * @see targets.ResistorInfo#getResistorPartNumber()
	 * @see #getResistorInfo()
	 * @generated
	 */
	EAttribute getResistorInfo_ResistorPartNumber();

	/**
	 * Returns the meta object for the attribute '{@link targets.ResistorInfo#getMountLocation <em>Mount Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mount Location</em>'.
	 * @see targets.ResistorInfo#getMountLocation()
	 * @see #getResistorInfo()
	 * @generated
	 */
	EAttribute getResistorInfo_MountLocation();

	/**
	 * Returns the meta object for class '{@link targets.HardwareInformation <em>Hardware Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Information</em>'.
	 * @see targets.HardwareInformation
	 * @generated
	 */
	EClass getHardwareInformation();

	/**
	 * Returns the meta object for the attribute '{@link targets.HardwareInformation#getHardwareTopologyName <em>Hardware Topology Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hardware Topology Name</em>'.
	 * @see targets.HardwareInformation#getHardwareTopologyName()
	 * @see #getHardwareInformation()
	 * @generated
	 */
	EAttribute getHardwareInformation_HardwareTopologyName();

	/**
	 * Returns the meta object for the attribute '{@link targets.HardwareInformation#getNameOfHardwareSystem <em>Name Of Hardware System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Of Hardware System</em>'.
	 * @see targets.HardwareInformation#getNameOfHardwareSystem()
	 * @see #getHardwareInformation()
	 * @generated
	 */
	EAttribute getHardwareInformation_NameOfHardwareSystem();

	/**
	 * Returns the meta object for the attribute '{@link targets.HardwareInformation#getIPAddressOfHardwareSystem <em>IP Address Of Hardware System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IP Address Of Hardware System</em>'.
	 * @see targets.HardwareInformation#getIPAddressOfHardwareSystem()
	 * @see #getHardwareInformation()
	 * @generated
	 */
	EAttribute getHardwareInformation_IPAddressOfHardwareSystem();

	/**
	 * Returns the meta object for class '{@link targets.SuperHardwarePortType <em>Super Hardware Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Hardware Port Type</em>'.
	 * @see targets.SuperHardwarePortType
	 * @generated
	 */
	EClass getSuperHardwarePortType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TargetsFactory getTargetsFactory();

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
		 * The meta object literal for the '{@link targets.impl.TargetsImpl <em>Targets</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.impl.TargetsImpl
		 * @see targets.impl.TargetsPackageImpl#getTargets()
		 * @generated
		 */
		EClass TARGETS = eINSTANCE.getTargets();

		/**
		 * The meta object literal for the '<em><b>Target Configuration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGETS__TARGET_CONFIGURATION = eINSTANCE.getTargets_TargetConfiguration();

		/**
		 * The meta object literal for the '{@link targets.impl.SuperTargetTypeImpl <em>Super Target Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.impl.SuperTargetTypeImpl
		 * @see targets.impl.TargetsPackageImpl#getSuperTargetType()
		 * @generated
		 */
		EClass SUPER_TARGET_TYPE = eINSTANCE.getSuperTargetType();

		/**
		 * The meta object literal for the '<em><b>Project Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_TARGET_TYPE__PROJECT_NAME = eINSTANCE.getSuperTargetType_ProjectName();

		/**
		 * The meta object literal for the '{@link targets.impl.SuperIOHardwareTypeImpl <em>Super IO Hardware Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.impl.SuperIOHardwareTypeImpl
		 * @see targets.impl.TargetsPackageImpl#getSuperIOHardwareType()
		 * @generated
		 */
		EClass SUPER_IO_HARDWARE_TYPE = eINSTANCE.getSuperIOHardwareType();

		/**
		 * The meta object literal for the '<em><b>Assignment Specification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_IO_HARDWARE_TYPE__ASSIGNMENT_SPECIFICATION = eINSTANCE.getSuperIOHardwareType_AssignmentSpecification();

		/**
		 * The meta object literal for the '{@link targets.impl.SuperClassExtensionTypeImpl <em>Super Class Extension Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.impl.SuperClassExtensionTypeImpl
		 * @see targets.impl.TargetsPackageImpl#getSuperClassExtensionType()
		 * @generated
		 */
		EClass SUPER_CLASS_EXTENSION_TYPE = eINSTANCE.getSuperClassExtensionType();

		/**
		 * The meta object literal for the '<em><b>Extended Class ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_CLASS_EXTENSION_TYPE__EXTENDED_CLASS_ID = eINSTANCE.getSuperClassExtensionType_ExtendedClassID();

		/**
		 * The meta object literal for the '{@link targets.impl.SuperAssignmentSpecificationTypeImpl <em>Super Assignment Specification Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.impl.SuperAssignmentSpecificationTypeImpl
		 * @see targets.impl.TargetsPackageImpl#getSuperAssignmentSpecificationType()
		 * @generated
		 */
		EClass SUPER_ASSIGNMENT_SPECIFICATION_TYPE = eINSTANCE.getSuperAssignmentSpecificationType();

		/**
		 * The meta object literal for the '<em><b>Referenced Assignment ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_ASSIGNMENT_SPECIFICATION_TYPE__REFERENCED_ASSIGNMENT_ID = eINSTANCE.getSuperAssignmentSpecificationType_ReferencedAssignmentID();

		/**
		 * The meta object literal for the '{@link targets.impl.AttributeDatatypeConversionImpl <em>Attribute Datatype Conversion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.impl.AttributeDatatypeConversionImpl
		 * @see targets.impl.TargetsPackageImpl#getAttributeDatatypeConversion()
		 * @generated
		 */
		EClass ATTRIBUTE_DATATYPE_CONVERSION = eINSTANCE.getAttributeDatatypeConversion();

		/**
		 * The meta object literal for the '<em><b>Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DATATYPE_CONVERSION__ATTRIBUTE_NAME = eINSTANCE.getAttributeDatatypeConversion_AttributeName();

		/**
		 * The meta object literal for the '<em><b>Target Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DATATYPE_CONVERSION__TARGET_DATA_TYPE = eINSTANCE.getAttributeDatatypeConversion_TargetDataType();

		/**
		 * The meta object literal for the '<em><b>Value Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DATATYPE_CONVERSION__VALUE_PREFIX = eINSTANCE.getAttributeDatatypeConversion_ValuePrefix();

		/**
		 * The meta object literal for the '<em><b>Value Postfix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DATATYPE_CONVERSION__VALUE_POSTFIX = eINSTANCE.getAttributeDatatypeConversion_ValuePostfix();

		/**
		 * The meta object literal for the '{@link targets.impl.ResistorInfoImpl <em>Resistor Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.impl.ResistorInfoImpl
		 * @see targets.impl.TargetsPackageImpl#getResistorInfo()
		 * @generated
		 */
		EClass RESISTOR_INFO = eINSTANCE.getResistorInfo();

		/**
		 * The meta object literal for the '<em><b>Resistance Ohm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESISTOR_INFO__RESISTANCE_OHM = eINSTANCE.getResistorInfo_ResistanceOhm();

		/**
		 * The meta object literal for the '<em><b>Resistor Part Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESISTOR_INFO__RESISTOR_PART_NUMBER = eINSTANCE.getResistorInfo_ResistorPartNumber();

		/**
		 * The meta object literal for the '<em><b>Mount Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESISTOR_INFO__MOUNT_LOCATION = eINSTANCE.getResistorInfo_MountLocation();

		/**
		 * The meta object literal for the '{@link targets.impl.HardwareInformationImpl <em>Hardware Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.impl.HardwareInformationImpl
		 * @see targets.impl.TargetsPackageImpl#getHardwareInformation()
		 * @generated
		 */
		EClass HARDWARE_INFORMATION = eINSTANCE.getHardwareInformation();

		/**
		 * The meta object literal for the '<em><b>Hardware Topology Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_INFORMATION__HARDWARE_TOPOLOGY_NAME = eINSTANCE.getHardwareInformation_HardwareTopologyName();

		/**
		 * The meta object literal for the '<em><b>Name Of Hardware System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_INFORMATION__NAME_OF_HARDWARE_SYSTEM = eINSTANCE.getHardwareInformation_NameOfHardwareSystem();

		/**
		 * The meta object literal for the '<em><b>IP Address Of Hardware System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE_INFORMATION__IP_ADDRESS_OF_HARDWARE_SYSTEM = eINSTANCE.getHardwareInformation_IPAddressOfHardwareSystem();

		/**
		 * The meta object literal for the '{@link targets.impl.SuperHardwarePortTypeImpl <em>Super Hardware Port Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.impl.SuperHardwarePortTypeImpl
		 * @see targets.impl.TargetsPackageImpl#getSuperHardwarePortType()
		 * @generated
		 */
		EClass SUPER_HARDWARE_PORT_TYPE = eINSTANCE.getSuperHardwarePortType();

	}

} //TargetsPackage
