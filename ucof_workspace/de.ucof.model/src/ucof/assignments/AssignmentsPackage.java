/**
 */
package ucof.assignments;

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
 * <!-- begin-model-doc -->
 * Container, including all assingment elements, i.e. assignments are class based relationships. These help in keeping the model flexible, because relationships are more dynamic
 * <!-- end-model-doc -->
 * @see ucof.assignments.AssignmentsFactory
 * @model kind="package"
 * @generated
 */
public interface AssignmentsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "assignments";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://gitlab.com/ucof/ucof.de/model/v001/ucof/assignments";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ucof.model.assignments";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AssignmentsPackage eINSTANCE = ucof.assignments.impl.AssignmentsPackageImpl.init();

	/**
	 * The meta object id for the '{@link ucof.assignments.impl.AssignmentsImpl <em>Assignments</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.assignments.impl.AssignmentsImpl
	 * @see ucof.assignments.impl.AssignmentsPackageImpl#getAssignments()
	 * @generated
	 */
	int ASSIGNMENTS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENTS__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENTS__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENTS__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENTS__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENTS__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENTS__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENTS__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENTS__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENTS__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Assignment Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENTS__ASSIGNMENT_SET = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Assignments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENTS_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Assignments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENTS_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.assignments.impl.SuperAssignmentSetTypeImpl <em>Super Assignment Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.assignments.impl.SuperAssignmentSetTypeImpl
	 * @see ucof.assignments.impl.AssignmentsPackageImpl#getSuperAssignmentSetType()
	 * @generated
	 */
	int SUPER_ASSIGNMENT_SET_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ASSIGNMENT_SET_TYPE__ID = EtypesPackage.SUPER_SET_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ASSIGNMENT_SET_TYPE__NAME = EtypesPackage.SUPER_SET_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ASSIGNMENT_SET_TYPE__DOCUMENTATION = EtypesPackage.SUPER_SET_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ASSIGNMENT_SET_TYPE__MODIFIED = EtypesPackage.SUPER_SET_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ASSIGNMENT_SET_TYPE__MODIFIER = EtypesPackage.SUPER_SET_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ASSIGNMENT_SET_TYPE__TRACE_LINK = EtypesPackage.SUPER_SET_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ASSIGNMENT_SET_TYPE__CREATED = EtypesPackage.SUPER_SET_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ASSIGNMENT_SET_TYPE__CREATOR = EtypesPackage.SUPER_SET_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ASSIGNMENT_SET_TYPE__VERSION = EtypesPackage.SUPER_SET_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Setname</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ASSIGNMENT_SET_TYPE__SETNAME = EtypesPackage.SUPER_SET_TYPE__SETNAME;

	/**
	 * The number of structural features of the '<em>Super Assignment Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ASSIGNMENT_SET_TYPE_FEATURE_COUNT = EtypesPackage.SUPER_SET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Super Assignment Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ASSIGNMENT_SET_TYPE_OPERATION_COUNT = EtypesPackage.SUPER_SET_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.assignments.impl.SuperAssignmentTypeImpl <em>Super Assignment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.assignments.impl.SuperAssignmentTypeImpl
	 * @see ucof.assignments.impl.AssignmentsPackageImpl#getSuperAssignmentType()
	 * @generated
	 */
	int SUPER_ASSIGNMENT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ASSIGNMENT_TYPE__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ASSIGNMENT_TYPE__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ASSIGNMENT_TYPE__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ASSIGNMENT_TYPE__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ASSIGNMENT_TYPE__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ASSIGNMENT_TYPE__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ASSIGNMENT_TYPE__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ASSIGNMENT_TYPE__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ASSIGNMENT_TYPE__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ASSIGNMENT_TYPE__SOURCE_ID = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ASSIGNMENT_TYPE__TARGET_ID = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Super Assignment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ASSIGNMENT_TYPE_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Super Assignment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ASSIGNMENT_TYPE_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.assignments.impl.InterfaceToPort2PortAssignmentSetImpl <em>Interface To Port2 Port Assignment Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.assignments.impl.InterfaceToPort2PortAssignmentSetImpl
	 * @see ucof.assignments.impl.AssignmentsPackageImpl#getInterfaceToPort2PortAssignmentSet()
	 * @generated
	 */
	int INTERFACE_TO_PORT2_PORT_ASSIGNMENT_SET = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_PORT2_PORT_ASSIGNMENT_SET__ID = SUPER_ASSIGNMENT_SET_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_PORT2_PORT_ASSIGNMENT_SET__NAME = SUPER_ASSIGNMENT_SET_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_PORT2_PORT_ASSIGNMENT_SET__DOCUMENTATION = SUPER_ASSIGNMENT_SET_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_PORT2_PORT_ASSIGNMENT_SET__MODIFIED = SUPER_ASSIGNMENT_SET_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_PORT2_PORT_ASSIGNMENT_SET__MODIFIER = SUPER_ASSIGNMENT_SET_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_PORT2_PORT_ASSIGNMENT_SET__TRACE_LINK = SUPER_ASSIGNMENT_SET_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_PORT2_PORT_ASSIGNMENT_SET__CREATED = SUPER_ASSIGNMENT_SET_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_PORT2_PORT_ASSIGNMENT_SET__CREATOR = SUPER_ASSIGNMENT_SET_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_PORT2_PORT_ASSIGNMENT_SET__VERSION = SUPER_ASSIGNMENT_SET_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Setname</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_PORT2_PORT_ASSIGNMENT_SET__SETNAME = SUPER_ASSIGNMENT_SET_TYPE__SETNAME;

	/**
	 * The feature id for the '<em><b>Interface To Port Assignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_PORT2_PORT_ASSIGNMENT_SET__INTERFACE_TO_PORT_ASSIGNMENT = SUPER_ASSIGNMENT_SET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface To Port2 Port Assignment Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_PORT2_PORT_ASSIGNMENT_SET_FEATURE_COUNT = SUPER_ASSIGNMENT_SET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interface To Port2 Port Assignment Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_PORT2_PORT_ASSIGNMENT_SET_OPERATION_COUNT = SUPER_ASSIGNMENT_SET_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.assignments.impl.InterfaceToPort2PortAssignmentImpl <em>Interface To Port2 Port Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.assignments.impl.InterfaceToPort2PortAssignmentImpl
	 * @see ucof.assignments.impl.AssignmentsPackageImpl#getInterfaceToPort2PortAssignment()
	 * @generated
	 */
	int INTERFACE_TO_PORT2_PORT_ASSIGNMENT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_PORT2_PORT_ASSIGNMENT__ID = SUPER_ASSIGNMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_PORT2_PORT_ASSIGNMENT__NAME = SUPER_ASSIGNMENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_PORT2_PORT_ASSIGNMENT__DOCUMENTATION = SUPER_ASSIGNMENT_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_PORT2_PORT_ASSIGNMENT__MODIFIED = SUPER_ASSIGNMENT_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_PORT2_PORT_ASSIGNMENT__MODIFIER = SUPER_ASSIGNMENT_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_PORT2_PORT_ASSIGNMENT__TRACE_LINK = SUPER_ASSIGNMENT_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_PORT2_PORT_ASSIGNMENT__CREATED = SUPER_ASSIGNMENT_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_PORT2_PORT_ASSIGNMENT__CREATOR = SUPER_ASSIGNMENT_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_PORT2_PORT_ASSIGNMENT__VERSION = SUPER_ASSIGNMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_PORT2_PORT_ASSIGNMENT__SOURCE_ID = SUPER_ASSIGNMENT_TYPE__SOURCE_ID;

	/**
	 * The feature id for the '<em><b>Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_PORT2_PORT_ASSIGNMENT__TARGET_ID = SUPER_ASSIGNMENT_TYPE__TARGET_ID;

	/**
	 * The number of structural features of the '<em>Interface To Port2 Port Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_PORT2_PORT_ASSIGNMENT_FEATURE_COUNT = SUPER_ASSIGNMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interface To Port2 Port Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_PORT2_PORT_ASSIGNMENT_OPERATION_COUNT = SUPER_ASSIGNMENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.assignments.impl.DeviceToImplementationAssignmentSetImpl <em>Device To Implementation Assignment Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.assignments.impl.DeviceToImplementationAssignmentSetImpl
	 * @see ucof.assignments.impl.AssignmentsPackageImpl#getDeviceToImplementationAssignmentSet()
	 * @generated
	 */
	int DEVICE_TO_IMPLEMENTATION_ASSIGNMENT_SET = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TO_IMPLEMENTATION_ASSIGNMENT_SET__ID = SUPER_ASSIGNMENT_SET_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TO_IMPLEMENTATION_ASSIGNMENT_SET__NAME = SUPER_ASSIGNMENT_SET_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TO_IMPLEMENTATION_ASSIGNMENT_SET__DOCUMENTATION = SUPER_ASSIGNMENT_SET_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TO_IMPLEMENTATION_ASSIGNMENT_SET__MODIFIED = SUPER_ASSIGNMENT_SET_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TO_IMPLEMENTATION_ASSIGNMENT_SET__MODIFIER = SUPER_ASSIGNMENT_SET_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TO_IMPLEMENTATION_ASSIGNMENT_SET__TRACE_LINK = SUPER_ASSIGNMENT_SET_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TO_IMPLEMENTATION_ASSIGNMENT_SET__CREATED = SUPER_ASSIGNMENT_SET_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TO_IMPLEMENTATION_ASSIGNMENT_SET__CREATOR = SUPER_ASSIGNMENT_SET_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TO_IMPLEMENTATION_ASSIGNMENT_SET__VERSION = SUPER_ASSIGNMENT_SET_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Setname</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TO_IMPLEMENTATION_ASSIGNMENT_SET__SETNAME = SUPER_ASSIGNMENT_SET_TYPE__SETNAME;

	/**
	 * The feature id for the '<em><b>Device To Implementation Assignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TO_IMPLEMENTATION_ASSIGNMENT_SET__DEVICE_TO_IMPLEMENTATION_ASSIGNMENT = SUPER_ASSIGNMENT_SET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Device To Implementation Assignment Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TO_IMPLEMENTATION_ASSIGNMENT_SET_FEATURE_COUNT = SUPER_ASSIGNMENT_SET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Device To Implementation Assignment Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TO_IMPLEMENTATION_ASSIGNMENT_SET_OPERATION_COUNT = SUPER_ASSIGNMENT_SET_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.assignments.impl.DeviceToImplementationAssignmentImpl <em>Device To Implementation Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.assignments.impl.DeviceToImplementationAssignmentImpl
	 * @see ucof.assignments.impl.AssignmentsPackageImpl#getDeviceToImplementationAssignment()
	 * @generated
	 */
	int DEVICE_TO_IMPLEMENTATION_ASSIGNMENT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TO_IMPLEMENTATION_ASSIGNMENT__ID = SUPER_ASSIGNMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TO_IMPLEMENTATION_ASSIGNMENT__NAME = SUPER_ASSIGNMENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TO_IMPLEMENTATION_ASSIGNMENT__DOCUMENTATION = SUPER_ASSIGNMENT_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TO_IMPLEMENTATION_ASSIGNMENT__MODIFIED = SUPER_ASSIGNMENT_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TO_IMPLEMENTATION_ASSIGNMENT__MODIFIER = SUPER_ASSIGNMENT_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TO_IMPLEMENTATION_ASSIGNMENT__TRACE_LINK = SUPER_ASSIGNMENT_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TO_IMPLEMENTATION_ASSIGNMENT__CREATED = SUPER_ASSIGNMENT_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TO_IMPLEMENTATION_ASSIGNMENT__CREATOR = SUPER_ASSIGNMENT_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TO_IMPLEMENTATION_ASSIGNMENT__VERSION = SUPER_ASSIGNMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TO_IMPLEMENTATION_ASSIGNMENT__SOURCE_ID = SUPER_ASSIGNMENT_TYPE__SOURCE_ID;

	/**
	 * The feature id for the '<em><b>Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TO_IMPLEMENTATION_ASSIGNMENT__TARGET_ID = SUPER_ASSIGNMENT_TYPE__TARGET_ID;

	/**
	 * The number of structural features of the '<em>Device To Implementation Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TO_IMPLEMENTATION_ASSIGNMENT_FEATURE_COUNT = SUPER_ASSIGNMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Device To Implementation Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TO_IMPLEMENTATION_ASSIGNMENT_OPERATION_COUNT = SUPER_ASSIGNMENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.assignments.impl.InterfaceToHardwareAssignmentSetImpl <em>Interface To Hardware Assignment Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.assignments.impl.InterfaceToHardwareAssignmentSetImpl
	 * @see ucof.assignments.impl.AssignmentsPackageImpl#getInterfaceToHardwareAssignmentSet()
	 * @generated
	 */
	int INTERFACE_TO_HARDWARE_ASSIGNMENT_SET = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_HARDWARE_ASSIGNMENT_SET__ID = SUPER_ASSIGNMENT_SET_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_HARDWARE_ASSIGNMENT_SET__NAME = SUPER_ASSIGNMENT_SET_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_HARDWARE_ASSIGNMENT_SET__DOCUMENTATION = SUPER_ASSIGNMENT_SET_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_HARDWARE_ASSIGNMENT_SET__MODIFIED = SUPER_ASSIGNMENT_SET_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_HARDWARE_ASSIGNMENT_SET__MODIFIER = SUPER_ASSIGNMENT_SET_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_HARDWARE_ASSIGNMENT_SET__TRACE_LINK = SUPER_ASSIGNMENT_SET_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_HARDWARE_ASSIGNMENT_SET__CREATED = SUPER_ASSIGNMENT_SET_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_HARDWARE_ASSIGNMENT_SET__CREATOR = SUPER_ASSIGNMENT_SET_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_HARDWARE_ASSIGNMENT_SET__VERSION = SUPER_ASSIGNMENT_SET_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Setname</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_HARDWARE_ASSIGNMENT_SET__SETNAME = SUPER_ASSIGNMENT_SET_TYPE__SETNAME;

	/**
	 * The feature id for the '<em><b>Interface To Hardware Assignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_HARDWARE_ASSIGNMENT_SET__INTERFACE_TO_HARDWARE_ASSIGNMENT = SUPER_ASSIGNMENT_SET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface To Hardware Assignment Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_HARDWARE_ASSIGNMENT_SET_FEATURE_COUNT = SUPER_ASSIGNMENT_SET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interface To Hardware Assignment Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_HARDWARE_ASSIGNMENT_SET_OPERATION_COUNT = SUPER_ASSIGNMENT_SET_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.assignments.impl.InterfaceToHardwareAssignmentImpl <em>Interface To Hardware Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.assignments.impl.InterfaceToHardwareAssignmentImpl
	 * @see ucof.assignments.impl.AssignmentsPackageImpl#getInterfaceToHardwareAssignment()
	 * @generated
	 */
	int INTERFACE_TO_HARDWARE_ASSIGNMENT = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_HARDWARE_ASSIGNMENT__ID = SUPER_ASSIGNMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_HARDWARE_ASSIGNMENT__NAME = SUPER_ASSIGNMENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_HARDWARE_ASSIGNMENT__DOCUMENTATION = SUPER_ASSIGNMENT_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_HARDWARE_ASSIGNMENT__MODIFIED = SUPER_ASSIGNMENT_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_HARDWARE_ASSIGNMENT__MODIFIER = SUPER_ASSIGNMENT_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_HARDWARE_ASSIGNMENT__TRACE_LINK = SUPER_ASSIGNMENT_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_HARDWARE_ASSIGNMENT__CREATED = SUPER_ASSIGNMENT_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_HARDWARE_ASSIGNMENT__CREATOR = SUPER_ASSIGNMENT_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_HARDWARE_ASSIGNMENT__VERSION = SUPER_ASSIGNMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_HARDWARE_ASSIGNMENT__SOURCE_ID = SUPER_ASSIGNMENT_TYPE__SOURCE_ID;

	/**
	 * The feature id for the '<em><b>Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_HARDWARE_ASSIGNMENT__TARGET_ID = SUPER_ASSIGNMENT_TYPE__TARGET_ID;

	/**
	 * The number of structural features of the '<em>Interface To Hardware Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_HARDWARE_ASSIGNMENT_FEATURE_COUNT = SUPER_ASSIGNMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interface To Hardware Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TO_HARDWARE_ASSIGNMENT_OPERATION_COUNT = SUPER_ASSIGNMENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.assignments.impl.PortToPortAssignmentSetImpl <em>Port To Port Assignment Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.assignments.impl.PortToPortAssignmentSetImpl
	 * @see ucof.assignments.impl.AssignmentsPackageImpl#getPortToPortAssignmentSet()
	 * @generated
	 */
	int PORT_TO_PORT_ASSIGNMENT_SET = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TO_PORT_ASSIGNMENT_SET__ID = SUPER_ASSIGNMENT_SET_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TO_PORT_ASSIGNMENT_SET__NAME = SUPER_ASSIGNMENT_SET_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TO_PORT_ASSIGNMENT_SET__DOCUMENTATION = SUPER_ASSIGNMENT_SET_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TO_PORT_ASSIGNMENT_SET__MODIFIED = SUPER_ASSIGNMENT_SET_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TO_PORT_ASSIGNMENT_SET__MODIFIER = SUPER_ASSIGNMENT_SET_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TO_PORT_ASSIGNMENT_SET__TRACE_LINK = SUPER_ASSIGNMENT_SET_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TO_PORT_ASSIGNMENT_SET__CREATED = SUPER_ASSIGNMENT_SET_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TO_PORT_ASSIGNMENT_SET__CREATOR = SUPER_ASSIGNMENT_SET_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TO_PORT_ASSIGNMENT_SET__VERSION = SUPER_ASSIGNMENT_SET_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Setname</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TO_PORT_ASSIGNMENT_SET__SETNAME = SUPER_ASSIGNMENT_SET_TYPE__SETNAME;

	/**
	 * The feature id for the '<em><b>Port To Port Assignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TO_PORT_ASSIGNMENT_SET__PORT_TO_PORT_ASSIGNMENT = SUPER_ASSIGNMENT_SET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port To Port Assignment Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TO_PORT_ASSIGNMENT_SET_FEATURE_COUNT = SUPER_ASSIGNMENT_SET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port To Port Assignment Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TO_PORT_ASSIGNMENT_SET_OPERATION_COUNT = SUPER_ASSIGNMENT_SET_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.assignments.impl.PortToPortAssignmentImpl <em>Port To Port Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.assignments.impl.PortToPortAssignmentImpl
	 * @see ucof.assignments.impl.AssignmentsPackageImpl#getPortToPortAssignment()
	 * @generated
	 */
	int PORT_TO_PORT_ASSIGNMENT = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TO_PORT_ASSIGNMENT__ID = SUPER_ASSIGNMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TO_PORT_ASSIGNMENT__NAME = SUPER_ASSIGNMENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TO_PORT_ASSIGNMENT__DOCUMENTATION = SUPER_ASSIGNMENT_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TO_PORT_ASSIGNMENT__MODIFIED = SUPER_ASSIGNMENT_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TO_PORT_ASSIGNMENT__MODIFIER = SUPER_ASSIGNMENT_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TO_PORT_ASSIGNMENT__TRACE_LINK = SUPER_ASSIGNMENT_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TO_PORT_ASSIGNMENT__CREATED = SUPER_ASSIGNMENT_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TO_PORT_ASSIGNMENT__CREATOR = SUPER_ASSIGNMENT_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TO_PORT_ASSIGNMENT__VERSION = SUPER_ASSIGNMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TO_PORT_ASSIGNMENT__SOURCE_ID = SUPER_ASSIGNMENT_TYPE__SOURCE_ID;

	/**
	 * The feature id for the '<em><b>Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TO_PORT_ASSIGNMENT__TARGET_ID = SUPER_ASSIGNMENT_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Transmission Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TO_PORT_ASSIGNMENT__TRANSMISSION_RATE = SUPER_ASSIGNMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refresh Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TO_PORT_ASSIGNMENT__REFRESH_RATE = SUPER_ASSIGNMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Port To Port Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TO_PORT_ASSIGNMENT_FEATURE_COUNT = SUPER_ASSIGNMENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Port To Port Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TO_PORT_ASSIGNMENT_OPERATION_COUNT = SUPER_ASSIGNMENT_TYPE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link ucof.assignments.impl.ED247AssignmentSetImpl <em>ED247 Assignment Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.assignments.impl.ED247AssignmentSetImpl
	 * @see ucof.assignments.impl.AssignmentsPackageImpl#getED247AssignmentSet()
	 * @generated
	 */
	int ED247_ASSIGNMENT_SET = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_ASSIGNMENT_SET__ID = SUPER_ASSIGNMENT_SET_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_ASSIGNMENT_SET__NAME = SUPER_ASSIGNMENT_SET_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_ASSIGNMENT_SET__DOCUMENTATION = SUPER_ASSIGNMENT_SET_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_ASSIGNMENT_SET__MODIFIED = SUPER_ASSIGNMENT_SET_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_ASSIGNMENT_SET__MODIFIER = SUPER_ASSIGNMENT_SET_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_ASSIGNMENT_SET__TRACE_LINK = SUPER_ASSIGNMENT_SET_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_ASSIGNMENT_SET__CREATED = SUPER_ASSIGNMENT_SET_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_ASSIGNMENT_SET__CREATOR = SUPER_ASSIGNMENT_SET_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_ASSIGNMENT_SET__VERSION = SUPER_ASSIGNMENT_SET_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Setname</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_ASSIGNMENT_SET__SETNAME = SUPER_ASSIGNMENT_SET_TYPE__SETNAME;

	/**
	 * The feature id for the '<em><b>Ed247 Assignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_ASSIGNMENT_SET__ED247_ASSIGNMENT = SUPER_ASSIGNMENT_SET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ED247 Assignment Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_ASSIGNMENT_SET_FEATURE_COUNT = SUPER_ASSIGNMENT_SET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>ED247 Assignment Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_ASSIGNMENT_SET_OPERATION_COUNT = SUPER_ASSIGNMENT_SET_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.assignments.impl.ED247AssignmentImpl <em>ED247 Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.assignments.impl.ED247AssignmentImpl
	 * @see ucof.assignments.impl.AssignmentsPackageImpl#getED247Assignment()
	 * @generated
	 */
	int ED247_ASSIGNMENT = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_ASSIGNMENT__ID = SUPER_ASSIGNMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_ASSIGNMENT__NAME = SUPER_ASSIGNMENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_ASSIGNMENT__DOCUMENTATION = SUPER_ASSIGNMENT_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_ASSIGNMENT__MODIFIED = SUPER_ASSIGNMENT_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_ASSIGNMENT__MODIFIER = SUPER_ASSIGNMENT_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_ASSIGNMENT__TRACE_LINK = SUPER_ASSIGNMENT_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_ASSIGNMENT__CREATED = SUPER_ASSIGNMENT_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_ASSIGNMENT__CREATOR = SUPER_ASSIGNMENT_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_ASSIGNMENT__VERSION = SUPER_ASSIGNMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_ASSIGNMENT__SOURCE_ID = SUPER_ASSIGNMENT_TYPE__SOURCE_ID;

	/**
	 * The feature id for the '<em><b>Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_ASSIGNMENT__TARGET_ID = SUPER_ASSIGNMENT_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Udp Socket Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_ASSIGNMENT__UDP_SOCKET_EXTENSION = SUPER_ASSIGNMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ED247 Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_ASSIGNMENT_FEATURE_COUNT = SUPER_ASSIGNMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>ED247 Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_ASSIGNMENT_OPERATION_COUNT = SUPER_ASSIGNMENT_TYPE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link ucof.assignments.impl.UDPSocketExtensionImpl <em>UDP Socket Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.assignments.impl.UDPSocketExtensionImpl
	 * @see ucof.assignments.impl.AssignmentsPackageImpl#getUDPSocketExtension()
	 * @generated
	 */
	int UDP_SOCKET_EXTENSION = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKET_EXTENSION__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKET_EXTENSION__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKET_EXTENSION__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKET_EXTENSION__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKET_EXTENSION__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKET_EXTENSION__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKET_EXTENSION__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKET_EXTENSION__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKET_EXTENSION__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Port Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKET_EXTENSION__PORT_SELECTION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Ip Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKET_EXTENSION__IP_ADRESS = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKET_EXTENSION__PORT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>UDP Socket Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKET_EXTENSION_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>UDP Socket Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKET_EXTENSION_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.assignments.impl.SWPortToHWPortAssignmentSetImpl <em>SW Port To HW Port Assignment Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.assignments.impl.SWPortToHWPortAssignmentSetImpl
	 * @see ucof.assignments.impl.AssignmentsPackageImpl#getSWPortToHWPortAssignmentSet()
	 * @generated
	 */
	int SW_PORT_TO_HW_PORT_ASSIGNMENT_SET = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_PORT_TO_HW_PORT_ASSIGNMENT_SET__ID = SUPER_ASSIGNMENT_SET_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_PORT_TO_HW_PORT_ASSIGNMENT_SET__NAME = SUPER_ASSIGNMENT_SET_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_PORT_TO_HW_PORT_ASSIGNMENT_SET__DOCUMENTATION = SUPER_ASSIGNMENT_SET_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_PORT_TO_HW_PORT_ASSIGNMENT_SET__MODIFIED = SUPER_ASSIGNMENT_SET_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_PORT_TO_HW_PORT_ASSIGNMENT_SET__MODIFIER = SUPER_ASSIGNMENT_SET_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_PORT_TO_HW_PORT_ASSIGNMENT_SET__TRACE_LINK = SUPER_ASSIGNMENT_SET_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_PORT_TO_HW_PORT_ASSIGNMENT_SET__CREATED = SUPER_ASSIGNMENT_SET_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_PORT_TO_HW_PORT_ASSIGNMENT_SET__CREATOR = SUPER_ASSIGNMENT_SET_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_PORT_TO_HW_PORT_ASSIGNMENT_SET__VERSION = SUPER_ASSIGNMENT_SET_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Setname</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_PORT_TO_HW_PORT_ASSIGNMENT_SET__SETNAME = SUPER_ASSIGNMENT_SET_TYPE__SETNAME;

	/**
	 * The feature id for the '<em><b>Sw Port To HW Port Assignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_PORT_TO_HW_PORT_ASSIGNMENT_SET__SW_PORT_TO_HW_PORT_ASSIGNMENT = SUPER_ASSIGNMENT_SET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SW Port To HW Port Assignment Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_PORT_TO_HW_PORT_ASSIGNMENT_SET_FEATURE_COUNT = SUPER_ASSIGNMENT_SET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SW Port To HW Port Assignment Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_PORT_TO_HW_PORT_ASSIGNMENT_SET_OPERATION_COUNT = SUPER_ASSIGNMENT_SET_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.assignments.impl.SWPortToHWPortAssignmentImpl <em>SW Port To HW Port Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.assignments.impl.SWPortToHWPortAssignmentImpl
	 * @see ucof.assignments.impl.AssignmentsPackageImpl#getSWPortToHWPortAssignment()
	 * @generated
	 */
	int SW_PORT_TO_HW_PORT_ASSIGNMENT = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_PORT_TO_HW_PORT_ASSIGNMENT__ID = SUPER_ASSIGNMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_PORT_TO_HW_PORT_ASSIGNMENT__NAME = SUPER_ASSIGNMENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_PORT_TO_HW_PORT_ASSIGNMENT__DOCUMENTATION = SUPER_ASSIGNMENT_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_PORT_TO_HW_PORT_ASSIGNMENT__MODIFIED = SUPER_ASSIGNMENT_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_PORT_TO_HW_PORT_ASSIGNMENT__MODIFIER = SUPER_ASSIGNMENT_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_PORT_TO_HW_PORT_ASSIGNMENT__TRACE_LINK = SUPER_ASSIGNMENT_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_PORT_TO_HW_PORT_ASSIGNMENT__CREATED = SUPER_ASSIGNMENT_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_PORT_TO_HW_PORT_ASSIGNMENT__CREATOR = SUPER_ASSIGNMENT_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_PORT_TO_HW_PORT_ASSIGNMENT__VERSION = SUPER_ASSIGNMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_PORT_TO_HW_PORT_ASSIGNMENT__SOURCE_ID = SUPER_ASSIGNMENT_TYPE__SOURCE_ID;

	/**
	 * The feature id for the '<em><b>Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_PORT_TO_HW_PORT_ASSIGNMENT__TARGET_ID = SUPER_ASSIGNMENT_TYPE__TARGET_ID;

	/**
	 * The number of structural features of the '<em>SW Port To HW Port Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_PORT_TO_HW_PORT_ASSIGNMENT_FEATURE_COUNT = SUPER_ASSIGNMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SW Port To HW Port Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_PORT_TO_HW_PORT_ASSIGNMENT_OPERATION_COUNT = SUPER_ASSIGNMENT_TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ucof.assignments.Assignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignments</em>'.
	 * @see ucof.assignments.Assignments
	 * @generated
	 */
	EClass getAssignments();

	/**
	 * Returns the meta object for the containment reference list '{@link ucof.assignments.Assignments#getAssignmentSet <em>Assignment Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assignment Set</em>'.
	 * @see ucof.assignments.Assignments#getAssignmentSet()
	 * @see #getAssignments()
	 * @generated
	 */
	EReference getAssignments_AssignmentSet();

	/**
	 * Returns the meta object for class '{@link ucof.assignments.SuperAssignmentSetType <em>Super Assignment Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Assignment Set Type</em>'.
	 * @see ucof.assignments.SuperAssignmentSetType
	 * @generated
	 */
	EClass getSuperAssignmentSetType();

	/**
	 * Returns the meta object for class '{@link ucof.assignments.SuperAssignmentType <em>Super Assignment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Assignment Type</em>'.
	 * @see ucof.assignments.SuperAssignmentType
	 * @generated
	 */
	EClass getSuperAssignmentType();

	/**
	 * Returns the meta object for the attribute '{@link ucof.assignments.SuperAssignmentType#getSourceID <em>Source ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source ID</em>'.
	 * @see ucof.assignments.SuperAssignmentType#getSourceID()
	 * @see #getSuperAssignmentType()
	 * @generated
	 */
	EAttribute getSuperAssignmentType_SourceID();

	/**
	 * Returns the meta object for the attribute '{@link ucof.assignments.SuperAssignmentType#getTargetID <em>Target ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target ID</em>'.
	 * @see ucof.assignments.SuperAssignmentType#getTargetID()
	 * @see #getSuperAssignmentType()
	 * @generated
	 */
	EAttribute getSuperAssignmentType_TargetID();

	/**
	 * Returns the meta object for class '{@link ucof.assignments.InterfaceToPort2PortAssignmentSet <em>Interface To Port2 Port Assignment Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface To Port2 Port Assignment Set</em>'.
	 * @see ucof.assignments.InterfaceToPort2PortAssignmentSet
	 * @generated
	 */
	EClass getInterfaceToPort2PortAssignmentSet();

	/**
	 * Returns the meta object for the containment reference list '{@link ucof.assignments.InterfaceToPort2PortAssignmentSet#getInterfaceToPortAssignment <em>Interface To Port Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface To Port Assignment</em>'.
	 * @see ucof.assignments.InterfaceToPort2PortAssignmentSet#getInterfaceToPortAssignment()
	 * @see #getInterfaceToPort2PortAssignmentSet()
	 * @generated
	 */
	EReference getInterfaceToPort2PortAssignmentSet_InterfaceToPortAssignment();

	/**
	 * Returns the meta object for class '{@link ucof.assignments.InterfaceToPort2PortAssignment <em>Interface To Port2 Port Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface To Port2 Port Assignment</em>'.
	 * @see ucof.assignments.InterfaceToPort2PortAssignment
	 * @generated
	 */
	EClass getInterfaceToPort2PortAssignment();

	/**
	 * Returns the meta object for class '{@link ucof.assignments.DeviceToImplementationAssignmentSet <em>Device To Implementation Assignment Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device To Implementation Assignment Set</em>'.
	 * @see ucof.assignments.DeviceToImplementationAssignmentSet
	 * @generated
	 */
	EClass getDeviceToImplementationAssignmentSet();

	/**
	 * Returns the meta object for the containment reference list '{@link ucof.assignments.DeviceToImplementationAssignmentSet#getDeviceToImplementationAssignment <em>Device To Implementation Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Device To Implementation Assignment</em>'.
	 * @see ucof.assignments.DeviceToImplementationAssignmentSet#getDeviceToImplementationAssignment()
	 * @see #getDeviceToImplementationAssignmentSet()
	 * @generated
	 */
	EReference getDeviceToImplementationAssignmentSet_DeviceToImplementationAssignment();

	/**
	 * Returns the meta object for class '{@link ucof.assignments.DeviceToImplementationAssignment <em>Device To Implementation Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device To Implementation Assignment</em>'.
	 * @see ucof.assignments.DeviceToImplementationAssignment
	 * @generated
	 */
	EClass getDeviceToImplementationAssignment();

	/**
	 * Returns the meta object for class '{@link ucof.assignments.InterfaceToHardwareAssignmentSet <em>Interface To Hardware Assignment Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface To Hardware Assignment Set</em>'.
	 * @see ucof.assignments.InterfaceToHardwareAssignmentSet
	 * @generated
	 */
	EClass getInterfaceToHardwareAssignmentSet();

	/**
	 * Returns the meta object for the containment reference list '{@link ucof.assignments.InterfaceToHardwareAssignmentSet#getInterfaceToHardwareAssignment <em>Interface To Hardware Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface To Hardware Assignment</em>'.
	 * @see ucof.assignments.InterfaceToHardwareAssignmentSet#getInterfaceToHardwareAssignment()
	 * @see #getInterfaceToHardwareAssignmentSet()
	 * @generated
	 */
	EReference getInterfaceToHardwareAssignmentSet_InterfaceToHardwareAssignment();

	/**
	 * Returns the meta object for class '{@link ucof.assignments.InterfaceToHardwareAssignment <em>Interface To Hardware Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface To Hardware Assignment</em>'.
	 * @see ucof.assignments.InterfaceToHardwareAssignment
	 * @generated
	 */
	EClass getInterfaceToHardwareAssignment();

	/**
	 * Returns the meta object for class '{@link ucof.assignments.PortToPortAssignmentSet <em>Port To Port Assignment Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port To Port Assignment Set</em>'.
	 * @see ucof.assignments.PortToPortAssignmentSet
	 * @generated
	 */
	EClass getPortToPortAssignmentSet();

	/**
	 * Returns the meta object for the containment reference list '{@link ucof.assignments.PortToPortAssignmentSet#getPortToPortAssignment <em>Port To Port Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port To Port Assignment</em>'.
	 * @see ucof.assignments.PortToPortAssignmentSet#getPortToPortAssignment()
	 * @see #getPortToPortAssignmentSet()
	 * @generated
	 */
	EReference getPortToPortAssignmentSet_PortToPortAssignment();

	/**
	 * Returns the meta object for class '{@link ucof.assignments.PortToPortAssignment <em>Port To Port Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port To Port Assignment</em>'.
	 * @see ucof.assignments.PortToPortAssignment
	 * @generated
	 */
	EClass getPortToPortAssignment();

	/**
	 * Returns the meta object for the attribute '{@link ucof.assignments.PortToPortAssignment#getTransmissionRate <em>Transmission Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transmission Rate</em>'.
	 * @see ucof.assignments.PortToPortAssignment#getTransmissionRate()
	 * @see #getPortToPortAssignment()
	 * @generated
	 */
	EAttribute getPortToPortAssignment_TransmissionRate();

	/**
	 * Returns the meta object for the attribute '{@link ucof.assignments.PortToPortAssignment#getRefreshRate <em>Refresh Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refresh Rate</em>'.
	 * @see ucof.assignments.PortToPortAssignment#getRefreshRate()
	 * @see #getPortToPortAssignment()
	 * @generated
	 */
	EAttribute getPortToPortAssignment_RefreshRate();

	/**
	 * Returns the meta object for class '{@link ucof.assignments.ED247AssignmentSet <em>ED247 Assignment Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ED247 Assignment Set</em>'.
	 * @see ucof.assignments.ED247AssignmentSet
	 * @generated
	 */
	EClass getED247AssignmentSet();

	/**
	 * Returns the meta object for the containment reference list '{@link ucof.assignments.ED247AssignmentSet#getEd247Assignment <em>Ed247 Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ed247 Assignment</em>'.
	 * @see ucof.assignments.ED247AssignmentSet#getEd247Assignment()
	 * @see #getED247AssignmentSet()
	 * @generated
	 */
	EReference getED247AssignmentSet_Ed247Assignment();

	/**
	 * Returns the meta object for class '{@link ucof.assignments.ED247Assignment <em>ED247 Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ED247 Assignment</em>'.
	 * @see ucof.assignments.ED247Assignment
	 * @generated
	 */
	EClass getED247Assignment();

	/**
	 * Returns the meta object for the containment reference list '{@link ucof.assignments.ED247Assignment#getUdpSocketExtension <em>Udp Socket Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Udp Socket Extension</em>'.
	 * @see ucof.assignments.ED247Assignment#getUdpSocketExtension()
	 * @see #getED247Assignment()
	 * @generated
	 */
	EReference getED247Assignment_UdpSocketExtension();

	/**
	 * Returns the meta object for class '{@link ucof.assignments.UDPSocketExtension <em>UDP Socket Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UDP Socket Extension</em>'.
	 * @see ucof.assignments.UDPSocketExtension
	 * @generated
	 */
	EClass getUDPSocketExtension();

	/**
	 * Returns the meta object for the attribute '{@link ucof.assignments.UDPSocketExtension#getPortSelection <em>Port Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Selection</em>'.
	 * @see ucof.assignments.UDPSocketExtension#getPortSelection()
	 * @see #getUDPSocketExtension()
	 * @generated
	 */
	EAttribute getUDPSocketExtension_PortSelection();

	/**
	 * Returns the meta object for the attribute '{@link ucof.assignments.UDPSocketExtension#getIpAdress <em>Ip Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip Adress</em>'.
	 * @see ucof.assignments.UDPSocketExtension#getIpAdress()
	 * @see #getUDPSocketExtension()
	 * @generated
	 */
	EAttribute getUDPSocketExtension_IpAdress();

	/**
	 * Returns the meta object for the attribute '{@link ucof.assignments.UDPSocketExtension#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see ucof.assignments.UDPSocketExtension#getPort()
	 * @see #getUDPSocketExtension()
	 * @generated
	 */
	EAttribute getUDPSocketExtension_Port();

	/**
	 * Returns the meta object for class '{@link ucof.assignments.SWPortToHWPortAssignmentSet <em>SW Port To HW Port Assignment Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SW Port To HW Port Assignment Set</em>'.
	 * @see ucof.assignments.SWPortToHWPortAssignmentSet
	 * @generated
	 */
	EClass getSWPortToHWPortAssignmentSet();

	/**
	 * Returns the meta object for the containment reference list '{@link ucof.assignments.SWPortToHWPortAssignmentSet#getSwPortToHWPortAssignment <em>Sw Port To HW Port Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sw Port To HW Port Assignment</em>'.
	 * @see ucof.assignments.SWPortToHWPortAssignmentSet#getSwPortToHWPortAssignment()
	 * @see #getSWPortToHWPortAssignmentSet()
	 * @generated
	 */
	EReference getSWPortToHWPortAssignmentSet_SwPortToHWPortAssignment();

	/**
	 * Returns the meta object for class '{@link ucof.assignments.SWPortToHWPortAssignment <em>SW Port To HW Port Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SW Port To HW Port Assignment</em>'.
	 * @see ucof.assignments.SWPortToHWPortAssignment
	 * @generated
	 */
	EClass getSWPortToHWPortAssignment();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AssignmentsFactory getAssignmentsFactory();

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
		 * The meta object literal for the '{@link ucof.assignments.impl.AssignmentsImpl <em>Assignments</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.assignments.impl.AssignmentsImpl
		 * @see ucof.assignments.impl.AssignmentsPackageImpl#getAssignments()
		 * @generated
		 */
		EClass ASSIGNMENTS = eINSTANCE.getAssignments();

		/**
		 * The meta object literal for the '<em><b>Assignment Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENTS__ASSIGNMENT_SET = eINSTANCE.getAssignments_AssignmentSet();

		/**
		 * The meta object literal for the '{@link ucof.assignments.impl.SuperAssignmentSetTypeImpl <em>Super Assignment Set Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.assignments.impl.SuperAssignmentSetTypeImpl
		 * @see ucof.assignments.impl.AssignmentsPackageImpl#getSuperAssignmentSetType()
		 * @generated
		 */
		EClass SUPER_ASSIGNMENT_SET_TYPE = eINSTANCE.getSuperAssignmentSetType();

		/**
		 * The meta object literal for the '{@link ucof.assignments.impl.SuperAssignmentTypeImpl <em>Super Assignment Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.assignments.impl.SuperAssignmentTypeImpl
		 * @see ucof.assignments.impl.AssignmentsPackageImpl#getSuperAssignmentType()
		 * @generated
		 */
		EClass SUPER_ASSIGNMENT_TYPE = eINSTANCE.getSuperAssignmentType();

		/**
		 * The meta object literal for the '<em><b>Source ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_ASSIGNMENT_TYPE__SOURCE_ID = eINSTANCE.getSuperAssignmentType_SourceID();

		/**
		 * The meta object literal for the '<em><b>Target ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_ASSIGNMENT_TYPE__TARGET_ID = eINSTANCE.getSuperAssignmentType_TargetID();

		/**
		 * The meta object literal for the '{@link ucof.assignments.impl.InterfaceToPort2PortAssignmentSetImpl <em>Interface To Port2 Port Assignment Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.assignments.impl.InterfaceToPort2PortAssignmentSetImpl
		 * @see ucof.assignments.impl.AssignmentsPackageImpl#getInterfaceToPort2PortAssignmentSet()
		 * @generated
		 */
		EClass INTERFACE_TO_PORT2_PORT_ASSIGNMENT_SET = eINSTANCE.getInterfaceToPort2PortAssignmentSet();

		/**
		 * The meta object literal for the '<em><b>Interface To Port Assignment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_TO_PORT2_PORT_ASSIGNMENT_SET__INTERFACE_TO_PORT_ASSIGNMENT = eINSTANCE.getInterfaceToPort2PortAssignmentSet_InterfaceToPortAssignment();

		/**
		 * The meta object literal for the '{@link ucof.assignments.impl.InterfaceToPort2PortAssignmentImpl <em>Interface To Port2 Port Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.assignments.impl.InterfaceToPort2PortAssignmentImpl
		 * @see ucof.assignments.impl.AssignmentsPackageImpl#getInterfaceToPort2PortAssignment()
		 * @generated
		 */
		EClass INTERFACE_TO_PORT2_PORT_ASSIGNMENT = eINSTANCE.getInterfaceToPort2PortAssignment();

		/**
		 * The meta object literal for the '{@link ucof.assignments.impl.DeviceToImplementationAssignmentSetImpl <em>Device To Implementation Assignment Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.assignments.impl.DeviceToImplementationAssignmentSetImpl
		 * @see ucof.assignments.impl.AssignmentsPackageImpl#getDeviceToImplementationAssignmentSet()
		 * @generated
		 */
		EClass DEVICE_TO_IMPLEMENTATION_ASSIGNMENT_SET = eINSTANCE.getDeviceToImplementationAssignmentSet();

		/**
		 * The meta object literal for the '<em><b>Device To Implementation Assignment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_TO_IMPLEMENTATION_ASSIGNMENT_SET__DEVICE_TO_IMPLEMENTATION_ASSIGNMENT = eINSTANCE.getDeviceToImplementationAssignmentSet_DeviceToImplementationAssignment();

		/**
		 * The meta object literal for the '{@link ucof.assignments.impl.DeviceToImplementationAssignmentImpl <em>Device To Implementation Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.assignments.impl.DeviceToImplementationAssignmentImpl
		 * @see ucof.assignments.impl.AssignmentsPackageImpl#getDeviceToImplementationAssignment()
		 * @generated
		 */
		EClass DEVICE_TO_IMPLEMENTATION_ASSIGNMENT = eINSTANCE.getDeviceToImplementationAssignment();

		/**
		 * The meta object literal for the '{@link ucof.assignments.impl.InterfaceToHardwareAssignmentSetImpl <em>Interface To Hardware Assignment Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.assignments.impl.InterfaceToHardwareAssignmentSetImpl
		 * @see ucof.assignments.impl.AssignmentsPackageImpl#getInterfaceToHardwareAssignmentSet()
		 * @generated
		 */
		EClass INTERFACE_TO_HARDWARE_ASSIGNMENT_SET = eINSTANCE.getInterfaceToHardwareAssignmentSet();

		/**
		 * The meta object literal for the '<em><b>Interface To Hardware Assignment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_TO_HARDWARE_ASSIGNMENT_SET__INTERFACE_TO_HARDWARE_ASSIGNMENT = eINSTANCE.getInterfaceToHardwareAssignmentSet_InterfaceToHardwareAssignment();

		/**
		 * The meta object literal for the '{@link ucof.assignments.impl.InterfaceToHardwareAssignmentImpl <em>Interface To Hardware Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.assignments.impl.InterfaceToHardwareAssignmentImpl
		 * @see ucof.assignments.impl.AssignmentsPackageImpl#getInterfaceToHardwareAssignment()
		 * @generated
		 */
		EClass INTERFACE_TO_HARDWARE_ASSIGNMENT = eINSTANCE.getInterfaceToHardwareAssignment();

		/**
		 * The meta object literal for the '{@link ucof.assignments.impl.PortToPortAssignmentSetImpl <em>Port To Port Assignment Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.assignments.impl.PortToPortAssignmentSetImpl
		 * @see ucof.assignments.impl.AssignmentsPackageImpl#getPortToPortAssignmentSet()
		 * @generated
		 */
		EClass PORT_TO_PORT_ASSIGNMENT_SET = eINSTANCE.getPortToPortAssignmentSet();

		/**
		 * The meta object literal for the '<em><b>Port To Port Assignment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_TO_PORT_ASSIGNMENT_SET__PORT_TO_PORT_ASSIGNMENT = eINSTANCE.getPortToPortAssignmentSet_PortToPortAssignment();

		/**
		 * The meta object literal for the '{@link ucof.assignments.impl.PortToPortAssignmentImpl <em>Port To Port Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.assignments.impl.PortToPortAssignmentImpl
		 * @see ucof.assignments.impl.AssignmentsPackageImpl#getPortToPortAssignment()
		 * @generated
		 */
		EClass PORT_TO_PORT_ASSIGNMENT = eINSTANCE.getPortToPortAssignment();

		/**
		 * The meta object literal for the '<em><b>Transmission Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_TO_PORT_ASSIGNMENT__TRANSMISSION_RATE = eINSTANCE.getPortToPortAssignment_TransmissionRate();

		/**
		 * The meta object literal for the '<em><b>Refresh Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_TO_PORT_ASSIGNMENT__REFRESH_RATE = eINSTANCE.getPortToPortAssignment_RefreshRate();

		/**
		 * The meta object literal for the '{@link ucof.assignments.impl.ED247AssignmentSetImpl <em>ED247 Assignment Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.assignments.impl.ED247AssignmentSetImpl
		 * @see ucof.assignments.impl.AssignmentsPackageImpl#getED247AssignmentSet()
		 * @generated
		 */
		EClass ED247_ASSIGNMENT_SET = eINSTANCE.getED247AssignmentSet();

		/**
		 * The meta object literal for the '<em><b>Ed247 Assignment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ED247_ASSIGNMENT_SET__ED247_ASSIGNMENT = eINSTANCE.getED247AssignmentSet_Ed247Assignment();

		/**
		 * The meta object literal for the '{@link ucof.assignments.impl.ED247AssignmentImpl <em>ED247 Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.assignments.impl.ED247AssignmentImpl
		 * @see ucof.assignments.impl.AssignmentsPackageImpl#getED247Assignment()
		 * @generated
		 */
		EClass ED247_ASSIGNMENT = eINSTANCE.getED247Assignment();

		/**
		 * The meta object literal for the '<em><b>Udp Socket Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ED247_ASSIGNMENT__UDP_SOCKET_EXTENSION = eINSTANCE.getED247Assignment_UdpSocketExtension();

		/**
		 * The meta object literal for the '{@link ucof.assignments.impl.UDPSocketExtensionImpl <em>UDP Socket Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.assignments.impl.UDPSocketExtensionImpl
		 * @see ucof.assignments.impl.AssignmentsPackageImpl#getUDPSocketExtension()
		 * @generated
		 */
		EClass UDP_SOCKET_EXTENSION = eINSTANCE.getUDPSocketExtension();

		/**
		 * The meta object literal for the '<em><b>Port Selection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UDP_SOCKET_EXTENSION__PORT_SELECTION = eINSTANCE.getUDPSocketExtension_PortSelection();

		/**
		 * The meta object literal for the '<em><b>Ip Adress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UDP_SOCKET_EXTENSION__IP_ADRESS = eINSTANCE.getUDPSocketExtension_IpAdress();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UDP_SOCKET_EXTENSION__PORT = eINSTANCE.getUDPSocketExtension_Port();

		/**
		 * The meta object literal for the '{@link ucof.assignments.impl.SWPortToHWPortAssignmentSetImpl <em>SW Port To HW Port Assignment Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.assignments.impl.SWPortToHWPortAssignmentSetImpl
		 * @see ucof.assignments.impl.AssignmentsPackageImpl#getSWPortToHWPortAssignmentSet()
		 * @generated
		 */
		EClass SW_PORT_TO_HW_PORT_ASSIGNMENT_SET = eINSTANCE.getSWPortToHWPortAssignmentSet();

		/**
		 * The meta object literal for the '<em><b>Sw Port To HW Port Assignment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SW_PORT_TO_HW_PORT_ASSIGNMENT_SET__SW_PORT_TO_HW_PORT_ASSIGNMENT = eINSTANCE.getSWPortToHWPortAssignmentSet_SwPortToHWPortAssignment();

		/**
		 * The meta object literal for the '{@link ucof.assignments.impl.SWPortToHWPortAssignmentImpl <em>SW Port To HW Port Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.assignments.impl.SWPortToHWPortAssignmentImpl
		 * @see ucof.assignments.impl.AssignmentsPackageImpl#getSWPortToHWPortAssignment()
		 * @generated
		 */
		EClass SW_PORT_TO_HW_PORT_ASSIGNMENT = eINSTANCE.getSWPortToHWPortAssignment();

	}

} //AssignmentsPackage
