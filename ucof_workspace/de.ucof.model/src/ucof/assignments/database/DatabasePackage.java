/**
 */
package ucof.assignments.database;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import ucof.assignments.AssignmentsPackage;

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
 * Cointainer, includes all assignments specific to the database >> i.e. how signal, paylaods, messages and interfaces are connected >> all database elements can be assigned to the port2port assignments >> this is the data connection between the 2 ports
 * <!-- end-model-doc -->
 * @see ucof.assignments.database.DatabaseFactory
 * @model kind="package"
 * @generated
 */
public interface DatabasePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "database";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://gitlab.com/ucof/ucof.de/model/v001/ucof/assignments/database";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ucof.model.assignments.database";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatabasePackage eINSTANCE = ucof.assignments.database.impl.DatabasePackageImpl.init();

	/**
	 * The meta object id for the '{@link ucof.assignments.database.impl.SignalToTargetAssignmentSetImpl <em>Signal To Target Assignment Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.assignments.database.impl.SignalToTargetAssignmentSetImpl
	 * @see ucof.assignments.database.impl.DatabasePackageImpl#getSignalToTargetAssignmentSet()
	 * @generated
	 */
	int SIGNAL_TO_TARGET_ASSIGNMENT_SET = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TO_TARGET_ASSIGNMENT_SET__ID = AssignmentsPackage.SUPER_ASSIGNMENT_SET_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TO_TARGET_ASSIGNMENT_SET__NAME = AssignmentsPackage.SUPER_ASSIGNMENT_SET_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TO_TARGET_ASSIGNMENT_SET__DOCUMENTATION = AssignmentsPackage.SUPER_ASSIGNMENT_SET_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TO_TARGET_ASSIGNMENT_SET__MODIFIED = AssignmentsPackage.SUPER_ASSIGNMENT_SET_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TO_TARGET_ASSIGNMENT_SET__MODIFIER = AssignmentsPackage.SUPER_ASSIGNMENT_SET_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TO_TARGET_ASSIGNMENT_SET__TRACE_LINK = AssignmentsPackage.SUPER_ASSIGNMENT_SET_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TO_TARGET_ASSIGNMENT_SET__CREATED = AssignmentsPackage.SUPER_ASSIGNMENT_SET_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TO_TARGET_ASSIGNMENT_SET__CREATOR = AssignmentsPackage.SUPER_ASSIGNMENT_SET_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TO_TARGET_ASSIGNMENT_SET__VERSION = AssignmentsPackage.SUPER_ASSIGNMENT_SET_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Setname</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TO_TARGET_ASSIGNMENT_SET__SETNAME = AssignmentsPackage.SUPER_ASSIGNMENT_SET_TYPE__SETNAME;

	/**
	 * The feature id for the '<em><b>Signal To Target Assignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TO_TARGET_ASSIGNMENT_SET__SIGNAL_TO_TARGET_ASSIGNMENT = AssignmentsPackage.SUPER_ASSIGNMENT_SET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Signal To Target Assignment Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TO_TARGET_ASSIGNMENT_SET_FEATURE_COUNT = AssignmentsPackage.SUPER_ASSIGNMENT_SET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Signal To Target Assignment Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TO_TARGET_ASSIGNMENT_SET_OPERATION_COUNT = AssignmentsPackage.SUPER_ASSIGNMENT_SET_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.assignments.database.impl.SignalToTargetAssignmentImpl <em>Signal To Target Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.assignments.database.impl.SignalToTargetAssignmentImpl
	 * @see ucof.assignments.database.impl.DatabasePackageImpl#getSignalToTargetAssignment()
	 * @generated
	 */
	int SIGNAL_TO_TARGET_ASSIGNMENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TO_TARGET_ASSIGNMENT__ID = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TO_TARGET_ASSIGNMENT__NAME = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TO_TARGET_ASSIGNMENT__DOCUMENTATION = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TO_TARGET_ASSIGNMENT__MODIFIED = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TO_TARGET_ASSIGNMENT__MODIFIER = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TO_TARGET_ASSIGNMENT__TRACE_LINK = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TO_TARGET_ASSIGNMENT__CREATED = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TO_TARGET_ASSIGNMENT__CREATOR = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TO_TARGET_ASSIGNMENT__VERSION = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TO_TARGET_ASSIGNMENT__SOURCE_ID = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__SOURCE_ID;

	/**
	 * The feature id for the '<em><b>Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TO_TARGET_ASSIGNMENT__TARGET_ID = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Start Bit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TO_TARGET_ASSIGNMENT__START_BIT = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assignment Target Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TO_TARGET_ASSIGNMENT__ASSIGNMENT_TARGET_TYPE = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TO_TARGET_ASSIGNMENT__INITIAL_VALUE = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Signal To Target Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TO_TARGET_ASSIGNMENT_FEATURE_COUNT = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Signal To Target Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_TO_TARGET_ASSIGNMENT_OPERATION_COUNT = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.assignments.database.impl.PayloadToTargetAssignmentSetImpl <em>Payload To Target Assignment Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.assignments.database.impl.PayloadToTargetAssignmentSetImpl
	 * @see ucof.assignments.database.impl.DatabasePackageImpl#getPayloadToTargetAssignmentSet()
	 * @generated
	 */
	int PAYLOAD_TO_TARGET_ASSIGNMENT_SET = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_TO_TARGET_ASSIGNMENT_SET__ID = AssignmentsPackage.SUPER_ASSIGNMENT_SET_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_TO_TARGET_ASSIGNMENT_SET__NAME = AssignmentsPackage.SUPER_ASSIGNMENT_SET_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_TO_TARGET_ASSIGNMENT_SET__DOCUMENTATION = AssignmentsPackage.SUPER_ASSIGNMENT_SET_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_TO_TARGET_ASSIGNMENT_SET__MODIFIED = AssignmentsPackage.SUPER_ASSIGNMENT_SET_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_TO_TARGET_ASSIGNMENT_SET__MODIFIER = AssignmentsPackage.SUPER_ASSIGNMENT_SET_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_TO_TARGET_ASSIGNMENT_SET__TRACE_LINK = AssignmentsPackage.SUPER_ASSIGNMENT_SET_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_TO_TARGET_ASSIGNMENT_SET__CREATED = AssignmentsPackage.SUPER_ASSIGNMENT_SET_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_TO_TARGET_ASSIGNMENT_SET__CREATOR = AssignmentsPackage.SUPER_ASSIGNMENT_SET_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_TO_TARGET_ASSIGNMENT_SET__VERSION = AssignmentsPackage.SUPER_ASSIGNMENT_SET_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Setname</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_TO_TARGET_ASSIGNMENT_SET__SETNAME = AssignmentsPackage.SUPER_ASSIGNMENT_SET_TYPE__SETNAME;

	/**
	 * The feature id for the '<em><b>Payload To Target Assignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_TO_TARGET_ASSIGNMENT_SET__PAYLOAD_TO_TARGET_ASSIGNMENT = AssignmentsPackage.SUPER_ASSIGNMENT_SET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Payload To Target Assignment Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_TO_TARGET_ASSIGNMENT_SET_FEATURE_COUNT = AssignmentsPackage.SUPER_ASSIGNMENT_SET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Payload To Target Assignment Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_TO_TARGET_ASSIGNMENT_SET_OPERATION_COUNT = AssignmentsPackage.SUPER_ASSIGNMENT_SET_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.assignments.database.impl.PayloadToTargetAssignmentImpl <em>Payload To Target Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.assignments.database.impl.PayloadToTargetAssignmentImpl
	 * @see ucof.assignments.database.impl.DatabasePackageImpl#getPayloadToTargetAssignment()
	 * @generated
	 */
	int PAYLOAD_TO_TARGET_ASSIGNMENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_TO_TARGET_ASSIGNMENT__ID = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_TO_TARGET_ASSIGNMENT__NAME = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_TO_TARGET_ASSIGNMENT__DOCUMENTATION = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_TO_TARGET_ASSIGNMENT__MODIFIED = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_TO_TARGET_ASSIGNMENT__MODIFIER = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_TO_TARGET_ASSIGNMENT__TRACE_LINK = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_TO_TARGET_ASSIGNMENT__CREATED = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_TO_TARGET_ASSIGNMENT__CREATOR = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_TO_TARGET_ASSIGNMENT__VERSION = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_TO_TARGET_ASSIGNMENT__SOURCE_ID = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__SOURCE_ID;

	/**
	 * The feature id for the '<em><b>Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_TO_TARGET_ASSIGNMENT__TARGET_ID = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Assignment Target Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_TO_TARGET_ASSIGNMENT__ASSIGNMENT_TARGET_TYPE = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Payload To Target Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_TO_TARGET_ASSIGNMENT_FEATURE_COUNT = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Payload To Target Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_TO_TARGET_ASSIGNMENT_OPERATION_COUNT = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.assignments.database.impl.MessageToTargetAssignmentSetImpl <em>Message To Target Assignment Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.assignments.database.impl.MessageToTargetAssignmentSetImpl
	 * @see ucof.assignments.database.impl.DatabasePackageImpl#getMessageToTargetAssignmentSet()
	 * @generated
	 */
	int MESSAGE_TO_TARGET_ASSIGNMENT_SET = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TO_TARGET_ASSIGNMENT_SET__ID = AssignmentsPackage.SUPER_ASSIGNMENT_SET_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TO_TARGET_ASSIGNMENT_SET__NAME = AssignmentsPackage.SUPER_ASSIGNMENT_SET_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TO_TARGET_ASSIGNMENT_SET__DOCUMENTATION = AssignmentsPackage.SUPER_ASSIGNMENT_SET_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TO_TARGET_ASSIGNMENT_SET__MODIFIED = AssignmentsPackage.SUPER_ASSIGNMENT_SET_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TO_TARGET_ASSIGNMENT_SET__MODIFIER = AssignmentsPackage.SUPER_ASSIGNMENT_SET_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TO_TARGET_ASSIGNMENT_SET__TRACE_LINK = AssignmentsPackage.SUPER_ASSIGNMENT_SET_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TO_TARGET_ASSIGNMENT_SET__CREATED = AssignmentsPackage.SUPER_ASSIGNMENT_SET_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TO_TARGET_ASSIGNMENT_SET__CREATOR = AssignmentsPackage.SUPER_ASSIGNMENT_SET_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TO_TARGET_ASSIGNMENT_SET__VERSION = AssignmentsPackage.SUPER_ASSIGNMENT_SET_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Setname</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TO_TARGET_ASSIGNMENT_SET__SETNAME = AssignmentsPackage.SUPER_ASSIGNMENT_SET_TYPE__SETNAME;

	/**
	 * The feature id for the '<em><b>Message To Target Assignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TO_TARGET_ASSIGNMENT_SET__MESSAGE_TO_TARGET_ASSIGNMENT = AssignmentsPackage.SUPER_ASSIGNMENT_SET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message To Target Assignment Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TO_TARGET_ASSIGNMENT_SET_FEATURE_COUNT = AssignmentsPackage.SUPER_ASSIGNMENT_SET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Message To Target Assignment Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TO_TARGET_ASSIGNMENT_SET_OPERATION_COUNT = AssignmentsPackage.SUPER_ASSIGNMENT_SET_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.assignments.database.impl.MessageToTargetAssignmentImpl <em>Message To Target Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.assignments.database.impl.MessageToTargetAssignmentImpl
	 * @see ucof.assignments.database.impl.DatabasePackageImpl#getMessageToTargetAssignment()
	 * @generated
	 */
	int MESSAGE_TO_TARGET_ASSIGNMENT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TO_TARGET_ASSIGNMENT__ID = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TO_TARGET_ASSIGNMENT__NAME = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TO_TARGET_ASSIGNMENT__DOCUMENTATION = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TO_TARGET_ASSIGNMENT__MODIFIED = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TO_TARGET_ASSIGNMENT__MODIFIER = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TO_TARGET_ASSIGNMENT__TRACE_LINK = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TO_TARGET_ASSIGNMENT__CREATED = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TO_TARGET_ASSIGNMENT__CREATOR = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TO_TARGET_ASSIGNMENT__VERSION = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TO_TARGET_ASSIGNMENT__SOURCE_ID = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__SOURCE_ID;

	/**
	 * The feature id for the '<em><b>Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TO_TARGET_ASSIGNMENT__TARGET_ID = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Assignment Target Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TO_TARGET_ASSIGNMENT__ASSIGNMENT_TARGET_TYPE = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message To Target Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TO_TARGET_ASSIGNMENT_FEATURE_COUNT = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Message To Target Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TO_TARGET_ASSIGNMENT_OPERATION_COUNT = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.assignments.database.signalTargets <em>signal Targets</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.assignments.database.signalTargets
	 * @see ucof.assignments.database.impl.DatabasePackageImpl#getsignalTargets()
	 * @generated
	 */
	int SIGNAL_TARGETS = 6;

	/**
	 * The meta object id for the '{@link ucof.assignments.database.payloadTargets <em>payload Targets</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.assignments.database.payloadTargets
	 * @see ucof.assignments.database.impl.DatabasePackageImpl#getpayloadTargets()
	 * @generated
	 */
	int PAYLOAD_TARGETS = 7;

	/**
	 * The meta object id for the '{@link ucof.assignments.database.messageTargets <em>message Targets</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.assignments.database.messageTargets
	 * @see ucof.assignments.database.impl.DatabasePackageImpl#getmessageTargets()
	 * @generated
	 */
	int MESSAGE_TARGETS = 8;


	/**
	 * Returns the meta object for class '{@link ucof.assignments.database.SignalToTargetAssignmentSet <em>Signal To Target Assignment Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal To Target Assignment Set</em>'.
	 * @see ucof.assignments.database.SignalToTargetAssignmentSet
	 * @generated
	 */
	EClass getSignalToTargetAssignmentSet();

	/**
	 * Returns the meta object for the containment reference list '{@link ucof.assignments.database.SignalToTargetAssignmentSet#getSignalToTargetAssignment <em>Signal To Target Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signal To Target Assignment</em>'.
	 * @see ucof.assignments.database.SignalToTargetAssignmentSet#getSignalToTargetAssignment()
	 * @see #getSignalToTargetAssignmentSet()
	 * @generated
	 */
	EReference getSignalToTargetAssignmentSet_SignalToTargetAssignment();

	/**
	 * Returns the meta object for class '{@link ucof.assignments.database.SignalToTargetAssignment <em>Signal To Target Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal To Target Assignment</em>'.
	 * @see ucof.assignments.database.SignalToTargetAssignment
	 * @generated
	 */
	EClass getSignalToTargetAssignment();

	/**
	 * Returns the meta object for the attribute '{@link ucof.assignments.database.SignalToTargetAssignment#getStartBit <em>Start Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Bit</em>'.
	 * @see ucof.assignments.database.SignalToTargetAssignment#getStartBit()
	 * @see #getSignalToTargetAssignment()
	 * @generated
	 */
	EAttribute getSignalToTargetAssignment_StartBit();

	/**
	 * Returns the meta object for the attribute '{@link ucof.assignments.database.SignalToTargetAssignment#getAssignmentTargetType <em>Assignment Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assignment Target Type</em>'.
	 * @see ucof.assignments.database.SignalToTargetAssignment#getAssignmentTargetType()
	 * @see #getSignalToTargetAssignment()
	 * @generated
	 */
	EAttribute getSignalToTargetAssignment_AssignmentTargetType();

	/**
	 * Returns the meta object for the attribute '{@link ucof.assignments.database.SignalToTargetAssignment#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see ucof.assignments.database.SignalToTargetAssignment#getInitialValue()
	 * @see #getSignalToTargetAssignment()
	 * @generated
	 */
	EAttribute getSignalToTargetAssignment_InitialValue();

	/**
	 * Returns the meta object for class '{@link ucof.assignments.database.PayloadToTargetAssignmentSet <em>Payload To Target Assignment Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payload To Target Assignment Set</em>'.
	 * @see ucof.assignments.database.PayloadToTargetAssignmentSet
	 * @generated
	 */
	EClass getPayloadToTargetAssignmentSet();

	/**
	 * Returns the meta object for the containment reference list '{@link ucof.assignments.database.PayloadToTargetAssignmentSet#getPayloadToTargetAssignment <em>Payload To Target Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Payload To Target Assignment</em>'.
	 * @see ucof.assignments.database.PayloadToTargetAssignmentSet#getPayloadToTargetAssignment()
	 * @see #getPayloadToTargetAssignmentSet()
	 * @generated
	 */
	EReference getPayloadToTargetAssignmentSet_PayloadToTargetAssignment();

	/**
	 * Returns the meta object for class '{@link ucof.assignments.database.PayloadToTargetAssignment <em>Payload To Target Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payload To Target Assignment</em>'.
	 * @see ucof.assignments.database.PayloadToTargetAssignment
	 * @generated
	 */
	EClass getPayloadToTargetAssignment();

	/**
	 * Returns the meta object for the attribute '{@link ucof.assignments.database.PayloadToTargetAssignment#getAssignmentTargetType <em>Assignment Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assignment Target Type</em>'.
	 * @see ucof.assignments.database.PayloadToTargetAssignment#getAssignmentTargetType()
	 * @see #getPayloadToTargetAssignment()
	 * @generated
	 */
	EAttribute getPayloadToTargetAssignment_AssignmentTargetType();

	/**
	 * Returns the meta object for class '{@link ucof.assignments.database.MessageToTargetAssignmentSet <em>Message To Target Assignment Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message To Target Assignment Set</em>'.
	 * @see ucof.assignments.database.MessageToTargetAssignmentSet
	 * @generated
	 */
	EClass getMessageToTargetAssignmentSet();

	/**
	 * Returns the meta object for the containment reference list '{@link ucof.assignments.database.MessageToTargetAssignmentSet#getMessageToTargetAssignment <em>Message To Target Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message To Target Assignment</em>'.
	 * @see ucof.assignments.database.MessageToTargetAssignmentSet#getMessageToTargetAssignment()
	 * @see #getMessageToTargetAssignmentSet()
	 * @generated
	 */
	EReference getMessageToTargetAssignmentSet_MessageToTargetAssignment();

	/**
	 * Returns the meta object for class '{@link ucof.assignments.database.MessageToTargetAssignment <em>Message To Target Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message To Target Assignment</em>'.
	 * @see ucof.assignments.database.MessageToTargetAssignment
	 * @generated
	 */
	EClass getMessageToTargetAssignment();

	/**
	 * Returns the meta object for the attribute '{@link ucof.assignments.database.MessageToTargetAssignment#getAssignmentTargetType <em>Assignment Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assignment Target Type</em>'.
	 * @see ucof.assignments.database.MessageToTargetAssignment#getAssignmentTargetType()
	 * @see #getMessageToTargetAssignment()
	 * @generated
	 */
	EAttribute getMessageToTargetAssignment_AssignmentTargetType();

	/**
	 * Returns the meta object for enum '{@link ucof.assignments.database.signalTargets <em>signal Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>signal Targets</em>'.
	 * @see ucof.assignments.database.signalTargets
	 * @generated
	 */
	EEnum getsignalTargets();

	/**
	 * Returns the meta object for enum '{@link ucof.assignments.database.payloadTargets <em>payload Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>payload Targets</em>'.
	 * @see ucof.assignments.database.payloadTargets
	 * @generated
	 */
	EEnum getpayloadTargets();

	/**
	 * Returns the meta object for enum '{@link ucof.assignments.database.messageTargets <em>message Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>message Targets</em>'.
	 * @see ucof.assignments.database.messageTargets
	 * @generated
	 */
	EEnum getmessageTargets();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatabaseFactory getDatabaseFactory();

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
		 * The meta object literal for the '{@link ucof.assignments.database.impl.SignalToTargetAssignmentSetImpl <em>Signal To Target Assignment Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.assignments.database.impl.SignalToTargetAssignmentSetImpl
		 * @see ucof.assignments.database.impl.DatabasePackageImpl#getSignalToTargetAssignmentSet()
		 * @generated
		 */
		EClass SIGNAL_TO_TARGET_ASSIGNMENT_SET = eINSTANCE.getSignalToTargetAssignmentSet();

		/**
		 * The meta object literal for the '<em><b>Signal To Target Assignment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_TO_TARGET_ASSIGNMENT_SET__SIGNAL_TO_TARGET_ASSIGNMENT = eINSTANCE.getSignalToTargetAssignmentSet_SignalToTargetAssignment();

		/**
		 * The meta object literal for the '{@link ucof.assignments.database.impl.SignalToTargetAssignmentImpl <em>Signal To Target Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.assignments.database.impl.SignalToTargetAssignmentImpl
		 * @see ucof.assignments.database.impl.DatabasePackageImpl#getSignalToTargetAssignment()
		 * @generated
		 */
		EClass SIGNAL_TO_TARGET_ASSIGNMENT = eINSTANCE.getSignalToTargetAssignment();

		/**
		 * The meta object literal for the '<em><b>Start Bit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL_TO_TARGET_ASSIGNMENT__START_BIT = eINSTANCE.getSignalToTargetAssignment_StartBit();

		/**
		 * The meta object literal for the '<em><b>Assignment Target Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL_TO_TARGET_ASSIGNMENT__ASSIGNMENT_TARGET_TYPE = eINSTANCE.getSignalToTargetAssignment_AssignmentTargetType();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL_TO_TARGET_ASSIGNMENT__INITIAL_VALUE = eINSTANCE.getSignalToTargetAssignment_InitialValue();

		/**
		 * The meta object literal for the '{@link ucof.assignments.database.impl.PayloadToTargetAssignmentSetImpl <em>Payload To Target Assignment Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.assignments.database.impl.PayloadToTargetAssignmentSetImpl
		 * @see ucof.assignments.database.impl.DatabasePackageImpl#getPayloadToTargetAssignmentSet()
		 * @generated
		 */
		EClass PAYLOAD_TO_TARGET_ASSIGNMENT_SET = eINSTANCE.getPayloadToTargetAssignmentSet();

		/**
		 * The meta object literal for the '<em><b>Payload To Target Assignment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYLOAD_TO_TARGET_ASSIGNMENT_SET__PAYLOAD_TO_TARGET_ASSIGNMENT = eINSTANCE.getPayloadToTargetAssignmentSet_PayloadToTargetAssignment();

		/**
		 * The meta object literal for the '{@link ucof.assignments.database.impl.PayloadToTargetAssignmentImpl <em>Payload To Target Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.assignments.database.impl.PayloadToTargetAssignmentImpl
		 * @see ucof.assignments.database.impl.DatabasePackageImpl#getPayloadToTargetAssignment()
		 * @generated
		 */
		EClass PAYLOAD_TO_TARGET_ASSIGNMENT = eINSTANCE.getPayloadToTargetAssignment();

		/**
		 * The meta object literal for the '<em><b>Assignment Target Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYLOAD_TO_TARGET_ASSIGNMENT__ASSIGNMENT_TARGET_TYPE = eINSTANCE.getPayloadToTargetAssignment_AssignmentTargetType();

		/**
		 * The meta object literal for the '{@link ucof.assignments.database.impl.MessageToTargetAssignmentSetImpl <em>Message To Target Assignment Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.assignments.database.impl.MessageToTargetAssignmentSetImpl
		 * @see ucof.assignments.database.impl.DatabasePackageImpl#getMessageToTargetAssignmentSet()
		 * @generated
		 */
		EClass MESSAGE_TO_TARGET_ASSIGNMENT_SET = eINSTANCE.getMessageToTargetAssignmentSet();

		/**
		 * The meta object literal for the '<em><b>Message To Target Assignment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_TO_TARGET_ASSIGNMENT_SET__MESSAGE_TO_TARGET_ASSIGNMENT = eINSTANCE.getMessageToTargetAssignmentSet_MessageToTargetAssignment();

		/**
		 * The meta object literal for the '{@link ucof.assignments.database.impl.MessageToTargetAssignmentImpl <em>Message To Target Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.assignments.database.impl.MessageToTargetAssignmentImpl
		 * @see ucof.assignments.database.impl.DatabasePackageImpl#getMessageToTargetAssignment()
		 * @generated
		 */
		EClass MESSAGE_TO_TARGET_ASSIGNMENT = eINSTANCE.getMessageToTargetAssignment();

		/**
		 * The meta object literal for the '<em><b>Assignment Target Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_TO_TARGET_ASSIGNMENT__ASSIGNMENT_TARGET_TYPE = eINSTANCE.getMessageToTargetAssignment_AssignmentTargetType();

		/**
		 * The meta object literal for the '{@link ucof.assignments.database.signalTargets <em>signal Targets</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.assignments.database.signalTargets
		 * @see ucof.assignments.database.impl.DatabasePackageImpl#getsignalTargets()
		 * @generated
		 */
		EEnum SIGNAL_TARGETS = eINSTANCE.getsignalTargets();

		/**
		 * The meta object literal for the '{@link ucof.assignments.database.payloadTargets <em>payload Targets</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.assignments.database.payloadTargets
		 * @see ucof.assignments.database.impl.DatabasePackageImpl#getpayloadTargets()
		 * @generated
		 */
		EEnum PAYLOAD_TARGETS = eINSTANCE.getpayloadTargets();

		/**
		 * The meta object literal for the '{@link ucof.assignments.database.messageTargets <em>message Targets</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.assignments.database.messageTargets
		 * @see ucof.assignments.database.impl.DatabasePackageImpl#getmessageTargets()
		 * @generated
		 */
		EEnum MESSAGE_TARGETS = eINSTANCE.getmessageTargets();

	}

} //DatabasePackage
