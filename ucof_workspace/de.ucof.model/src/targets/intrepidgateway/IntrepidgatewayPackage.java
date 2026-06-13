/**
 */
package targets.intrepidgateway;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import targets.TargetsPackage;
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
 * @see targets.intrepidgateway.IntrepidgatewayFactory
 * @model kind="package"
 * @generated
 */
public interface IntrepidgatewayPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "intrepidgateway";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://gitlab.com/ucof/ucof.de/model/v001/ucof/targets/intrepidgateway";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ucof.model.targets.intrepidgateway";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntrepidgatewayPackage eINSTANCE = targets.intrepidgateway.impl.IntrepidgatewayPackageImpl.init();

	/**
	 * The meta object id for the '{@link targets.intrepidgateway.impl.MsgBoxExtensionImpl <em>Msg Box Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.intrepidgateway.impl.MsgBoxExtensionImpl
	 * @see targets.intrepidgateway.impl.IntrepidgatewayPackageImpl#getMsgBoxExtension()
	 * @generated
	 */
	int MSG_BOX_EXTENSION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_BOX_EXTENSION__ID = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_BOX_EXTENSION__NAME = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_BOX_EXTENSION__DOCUMENTATION = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_BOX_EXTENSION__MODIFIED = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_BOX_EXTENSION__MODIFIER = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_BOX_EXTENSION__TRACE_LINK = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_BOX_EXTENSION__CREATED = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_BOX_EXTENSION__CREATOR = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_BOX_EXTENSION__VERSION = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Extended Class ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_BOX_EXTENSION__EXTENDED_CLASS_ID = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE__EXTENDED_CLASS_ID;

	/**
	 * The feature id for the '<em><b>Num Of Outgoing Mailboxes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_BOX_EXTENSION__NUM_OF_OUTGOING_MAILBOXES = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Num Of Incoming Mailboxes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_BOX_EXTENSION__NUM_OF_INCOMING_MAILBOXES = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Small Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_BOX_EXTENSION__SMALL_BUFFER_SIZE = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Small Buffer Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_BOX_EXTENSION__SMALL_BUFFER_COUNT = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Medium Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_BOX_EXTENSION__MEDIUM_BUFFER_SIZE = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Medium Buffer Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_BOX_EXTENSION__MEDIUM_BUFFER_COUNT = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Big Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_BOX_EXTENSION__BIG_BUFFER_SIZE = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Big Buffer Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_BOX_EXTENSION__BIG_BUFFER_COUNT = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Node Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_BOX_EXTENSION__NODE_ADDR = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Node Address Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_BOX_EXTENSION__NODE_ADDRESS_SYMBOL = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Incoming Destination Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_BOX_EXTENSION__INCOMING_DESTINATION_FILTER = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Sender Source Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_BOX_EXTENSION__SENDER_SOURCE_FILTER = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Outgoing Mailbox Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_BOX_EXTENSION__OUTGOING_MAILBOX_SLOT = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Msg Box Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_BOX_EXTENSION_FEATURE_COUNT = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Msg Box Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSG_BOX_EXTENSION_OPERATION_COUNT = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link targets.intrepidgateway.impl.CanMailboxAddressFilterImpl <em>Can Mailbox Address Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.intrepidgateway.impl.CanMailboxAddressFilterImpl
	 * @see targets.intrepidgateway.impl.IntrepidgatewayPackageImpl#getCanMailboxAddressFilter()
	 * @generated
	 */
	int CAN_MAILBOX_ADDRESS_FILTER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MAILBOX_ADDRESS_FILTER__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MAILBOX_ADDRESS_FILTER__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MAILBOX_ADDRESS_FILTER__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MAILBOX_ADDRESS_FILTER__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MAILBOX_ADDRESS_FILTER__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MAILBOX_ADDRESS_FILTER__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MAILBOX_ADDRESS_FILTER__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MAILBOX_ADDRESS_FILTER__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MAILBOX_ADDRESS_FILTER__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Address Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MAILBOX_ADDRESS_FILTER__ADDRESS_SYMBOL = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Address Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MAILBOX_ADDRESS_FILTER__ADDRESS_VALUE = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Can Mailbox Address Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MAILBOX_ADDRESS_FILTER_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Can Mailbox Address Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MAILBOX_ADDRESS_FILTER_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.intrepidgateway.impl.CanMailboxOutSlotImpl <em>Can Mailbox Out Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.intrepidgateway.impl.CanMailboxOutSlotImpl
	 * @see targets.intrepidgateway.impl.IntrepidgatewayPackageImpl#getCanMailboxOutSlot()
	 * @generated
	 */
	int CAN_MAILBOX_OUT_SLOT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MAILBOX_OUT_SLOT__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MAILBOX_OUT_SLOT__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MAILBOX_OUT_SLOT__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MAILBOX_OUT_SLOT__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MAILBOX_OUT_SLOT__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MAILBOX_OUT_SLOT__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MAILBOX_OUT_SLOT__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MAILBOX_OUT_SLOT__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MAILBOX_OUT_SLOT__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Port Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MAILBOX_OUT_SLOT__PORT_ID = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Source Address Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MAILBOX_OUT_SLOT__SOURCE_ADDRESS_SYMBOL = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Source Address Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MAILBOX_OUT_SLOT__SOURCE_ADDRESS_VALUE = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Destination Address Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MAILBOX_OUT_SLOT__DESTINATION_ADDRESS_SYMBOL = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Destination Address Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MAILBOX_OUT_SLOT__DESTINATION_ADDRESS_VALUE = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Multicast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MAILBOX_OUT_SLOT__MULTICAST = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Can Mailbox Out Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MAILBOX_OUT_SLOT_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Can Mailbox Out Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_MAILBOX_OUT_SLOT_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link targets.intrepidgateway.MsgBoxExtension <em>Msg Box Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Msg Box Extension</em>'.
	 * @see targets.intrepidgateway.MsgBoxExtension
	 * @generated
	 */
	EClass getMsgBoxExtension();

	/**
	 * Returns the meta object for the attribute '{@link targets.intrepidgateway.MsgBoxExtension#getNumOfOutgoingMailboxes <em>Num Of Outgoing Mailboxes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Of Outgoing Mailboxes</em>'.
	 * @see targets.intrepidgateway.MsgBoxExtension#getNumOfOutgoingMailboxes()
	 * @see #getMsgBoxExtension()
	 * @generated
	 */
	EAttribute getMsgBoxExtension_NumOfOutgoingMailboxes();

	/**
	 * Returns the meta object for the attribute '{@link targets.intrepidgateway.MsgBoxExtension#getNumOfIncomingMailboxes <em>Num Of Incoming Mailboxes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Of Incoming Mailboxes</em>'.
	 * @see targets.intrepidgateway.MsgBoxExtension#getNumOfIncomingMailboxes()
	 * @see #getMsgBoxExtension()
	 * @generated
	 */
	EAttribute getMsgBoxExtension_NumOfIncomingMailboxes();

	/**
	 * Returns the meta object for the attribute '{@link targets.intrepidgateway.MsgBoxExtension#getSmallBufferSize <em>Small Buffer Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Small Buffer Size</em>'.
	 * @see targets.intrepidgateway.MsgBoxExtension#getSmallBufferSize()
	 * @see #getMsgBoxExtension()
	 * @generated
	 */
	EAttribute getMsgBoxExtension_SmallBufferSize();

	/**
	 * Returns the meta object for the attribute '{@link targets.intrepidgateway.MsgBoxExtension#getSmallBufferCount <em>Small Buffer Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Small Buffer Count</em>'.
	 * @see targets.intrepidgateway.MsgBoxExtension#getSmallBufferCount()
	 * @see #getMsgBoxExtension()
	 * @generated
	 */
	EAttribute getMsgBoxExtension_SmallBufferCount();

	/**
	 * Returns the meta object for the attribute '{@link targets.intrepidgateway.MsgBoxExtension#getMediumBufferSize <em>Medium Buffer Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Medium Buffer Size</em>'.
	 * @see targets.intrepidgateway.MsgBoxExtension#getMediumBufferSize()
	 * @see #getMsgBoxExtension()
	 * @generated
	 */
	EAttribute getMsgBoxExtension_MediumBufferSize();

	/**
	 * Returns the meta object for the attribute '{@link targets.intrepidgateway.MsgBoxExtension#getMediumBufferCount <em>Medium Buffer Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Medium Buffer Count</em>'.
	 * @see targets.intrepidgateway.MsgBoxExtension#getMediumBufferCount()
	 * @see #getMsgBoxExtension()
	 * @generated
	 */
	EAttribute getMsgBoxExtension_MediumBufferCount();

	/**
	 * Returns the meta object for the attribute '{@link targets.intrepidgateway.MsgBoxExtension#getBigBufferSize <em>Big Buffer Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Big Buffer Size</em>'.
	 * @see targets.intrepidgateway.MsgBoxExtension#getBigBufferSize()
	 * @see #getMsgBoxExtension()
	 * @generated
	 */
	EAttribute getMsgBoxExtension_BigBufferSize();

	/**
	 * Returns the meta object for the attribute '{@link targets.intrepidgateway.MsgBoxExtension#getBigBufferCount <em>Big Buffer Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Big Buffer Count</em>'.
	 * @see targets.intrepidgateway.MsgBoxExtension#getBigBufferCount()
	 * @see #getMsgBoxExtension()
	 * @generated
	 */
	EAttribute getMsgBoxExtension_BigBufferCount();

	/**
	 * Returns the meta object for the attribute '{@link targets.intrepidgateway.MsgBoxExtension#getNodeAddr <em>Node Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Addr</em>'.
	 * @see targets.intrepidgateway.MsgBoxExtension#getNodeAddr()
	 * @see #getMsgBoxExtension()
	 * @generated
	 */
	EAttribute getMsgBoxExtension_NodeAddr();

	/**
	 * Returns the meta object for the attribute '{@link targets.intrepidgateway.MsgBoxExtension#getNodeAddressSymbol <em>Node Address Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Address Symbol</em>'.
	 * @see targets.intrepidgateway.MsgBoxExtension#getNodeAddressSymbol()
	 * @see #getMsgBoxExtension()
	 * @generated
	 */
	EAttribute getMsgBoxExtension_NodeAddressSymbol();

	/**
	 * Returns the meta object for the containment reference list '{@link targets.intrepidgateway.MsgBoxExtension#getIncomingDestinationFilter <em>Incoming Destination Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Incoming Destination Filter</em>'.
	 * @see targets.intrepidgateway.MsgBoxExtension#getIncomingDestinationFilter()
	 * @see #getMsgBoxExtension()
	 * @generated
	 */
	EReference getMsgBoxExtension_IncomingDestinationFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link targets.intrepidgateway.MsgBoxExtension#getSenderSourceFilter <em>Sender Source Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sender Source Filter</em>'.
	 * @see targets.intrepidgateway.MsgBoxExtension#getSenderSourceFilter()
	 * @see #getMsgBoxExtension()
	 * @generated
	 */
	EReference getMsgBoxExtension_SenderSourceFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link targets.intrepidgateway.MsgBoxExtension#getOutgoingMailboxSlot <em>Outgoing Mailbox Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoing Mailbox Slot</em>'.
	 * @see targets.intrepidgateway.MsgBoxExtension#getOutgoingMailboxSlot()
	 * @see #getMsgBoxExtension()
	 * @generated
	 */
	EReference getMsgBoxExtension_OutgoingMailboxSlot();

	/**
	 * Returns the meta object for class '{@link targets.intrepidgateway.CanMailboxAddressFilter <em>Can Mailbox Address Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Can Mailbox Address Filter</em>'.
	 * @see targets.intrepidgateway.CanMailboxAddressFilter
	 * @generated
	 */
	EClass getCanMailboxAddressFilter();

	/**
	 * Returns the meta object for the attribute '{@link targets.intrepidgateway.CanMailboxAddressFilter#getAddressSymbol <em>Address Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address Symbol</em>'.
	 * @see targets.intrepidgateway.CanMailboxAddressFilter#getAddressSymbol()
	 * @see #getCanMailboxAddressFilter()
	 * @generated
	 */
	EAttribute getCanMailboxAddressFilter_AddressSymbol();

	/**
	 * Returns the meta object for the attribute '{@link targets.intrepidgateway.CanMailboxAddressFilter#getAddressValue <em>Address Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address Value</em>'.
	 * @see targets.intrepidgateway.CanMailboxAddressFilter#getAddressValue()
	 * @see #getCanMailboxAddressFilter()
	 * @generated
	 */
	EAttribute getCanMailboxAddressFilter_AddressValue();

	/**
	 * Returns the meta object for class '{@link targets.intrepidgateway.CanMailboxOutSlot <em>Can Mailbox Out Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Can Mailbox Out Slot</em>'.
	 * @see targets.intrepidgateway.CanMailboxOutSlot
	 * @generated
	 */
	EClass getCanMailboxOutSlot();

	/**
	 * Returns the meta object for the attribute '{@link targets.intrepidgateway.CanMailboxOutSlot#getPortId <em>Port Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Id</em>'.
	 * @see targets.intrepidgateway.CanMailboxOutSlot#getPortId()
	 * @see #getCanMailboxOutSlot()
	 * @generated
	 */
	EAttribute getCanMailboxOutSlot_PortId();

	/**
	 * Returns the meta object for the attribute '{@link targets.intrepidgateway.CanMailboxOutSlot#getSourceAddressSymbol <em>Source Address Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Address Symbol</em>'.
	 * @see targets.intrepidgateway.CanMailboxOutSlot#getSourceAddressSymbol()
	 * @see #getCanMailboxOutSlot()
	 * @generated
	 */
	EAttribute getCanMailboxOutSlot_SourceAddressSymbol();

	/**
	 * Returns the meta object for the attribute '{@link targets.intrepidgateway.CanMailboxOutSlot#getSourceAddressValue <em>Source Address Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Address Value</em>'.
	 * @see targets.intrepidgateway.CanMailboxOutSlot#getSourceAddressValue()
	 * @see #getCanMailboxOutSlot()
	 * @generated
	 */
	EAttribute getCanMailboxOutSlot_SourceAddressValue();

	/**
	 * Returns the meta object for the attribute '{@link targets.intrepidgateway.CanMailboxOutSlot#getDestinationAddressSymbol <em>Destination Address Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination Address Symbol</em>'.
	 * @see targets.intrepidgateway.CanMailboxOutSlot#getDestinationAddressSymbol()
	 * @see #getCanMailboxOutSlot()
	 * @generated
	 */
	EAttribute getCanMailboxOutSlot_DestinationAddressSymbol();

	/**
	 * Returns the meta object for the attribute '{@link targets.intrepidgateway.CanMailboxOutSlot#getDestinationAddressValue <em>Destination Address Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination Address Value</em>'.
	 * @see targets.intrepidgateway.CanMailboxOutSlot#getDestinationAddressValue()
	 * @see #getCanMailboxOutSlot()
	 * @generated
	 */
	EAttribute getCanMailboxOutSlot_DestinationAddressValue();

	/**
	 * Returns the meta object for the attribute '{@link targets.intrepidgateway.CanMailboxOutSlot#isMulticast <em>Multicast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multicast</em>'.
	 * @see targets.intrepidgateway.CanMailboxOutSlot#isMulticast()
	 * @see #getCanMailboxOutSlot()
	 * @generated
	 */
	EAttribute getCanMailboxOutSlot_Multicast();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IntrepidgatewayFactory getIntrepidgatewayFactory();

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
		 * The meta object literal for the '{@link targets.intrepidgateway.impl.MsgBoxExtensionImpl <em>Msg Box Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.intrepidgateway.impl.MsgBoxExtensionImpl
		 * @see targets.intrepidgateway.impl.IntrepidgatewayPackageImpl#getMsgBoxExtension()
		 * @generated
		 */
		EClass MSG_BOX_EXTENSION = eINSTANCE.getMsgBoxExtension();

		/**
		 * The meta object literal for the '<em><b>Num Of Outgoing Mailboxes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MSG_BOX_EXTENSION__NUM_OF_OUTGOING_MAILBOXES = eINSTANCE.getMsgBoxExtension_NumOfOutgoingMailboxes();

		/**
		 * The meta object literal for the '<em><b>Num Of Incoming Mailboxes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MSG_BOX_EXTENSION__NUM_OF_INCOMING_MAILBOXES = eINSTANCE.getMsgBoxExtension_NumOfIncomingMailboxes();

		/**
		 * The meta object literal for the '<em><b>Small Buffer Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MSG_BOX_EXTENSION__SMALL_BUFFER_SIZE = eINSTANCE.getMsgBoxExtension_SmallBufferSize();

		/**
		 * The meta object literal for the '<em><b>Small Buffer Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MSG_BOX_EXTENSION__SMALL_BUFFER_COUNT = eINSTANCE.getMsgBoxExtension_SmallBufferCount();

		/**
		 * The meta object literal for the '<em><b>Medium Buffer Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MSG_BOX_EXTENSION__MEDIUM_BUFFER_SIZE = eINSTANCE.getMsgBoxExtension_MediumBufferSize();

		/**
		 * The meta object literal for the '<em><b>Medium Buffer Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MSG_BOX_EXTENSION__MEDIUM_BUFFER_COUNT = eINSTANCE.getMsgBoxExtension_MediumBufferCount();

		/**
		 * The meta object literal for the '<em><b>Big Buffer Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MSG_BOX_EXTENSION__BIG_BUFFER_SIZE = eINSTANCE.getMsgBoxExtension_BigBufferSize();

		/**
		 * The meta object literal for the '<em><b>Big Buffer Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MSG_BOX_EXTENSION__BIG_BUFFER_COUNT = eINSTANCE.getMsgBoxExtension_BigBufferCount();

		/**
		 * The meta object literal for the '<em><b>Node Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MSG_BOX_EXTENSION__NODE_ADDR = eINSTANCE.getMsgBoxExtension_NodeAddr();

		/**
		 * The meta object literal for the '<em><b>Node Address Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MSG_BOX_EXTENSION__NODE_ADDRESS_SYMBOL = eINSTANCE.getMsgBoxExtension_NodeAddressSymbol();

		/**
		 * The meta object literal for the '<em><b>Incoming Destination Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSG_BOX_EXTENSION__INCOMING_DESTINATION_FILTER = eINSTANCE.getMsgBoxExtension_IncomingDestinationFilter();

		/**
		 * The meta object literal for the '<em><b>Sender Source Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSG_BOX_EXTENSION__SENDER_SOURCE_FILTER = eINSTANCE.getMsgBoxExtension_SenderSourceFilter();

		/**
		 * The meta object literal for the '<em><b>Outgoing Mailbox Slot</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MSG_BOX_EXTENSION__OUTGOING_MAILBOX_SLOT = eINSTANCE.getMsgBoxExtension_OutgoingMailboxSlot();

		/**
		 * The meta object literal for the '{@link targets.intrepidgateway.impl.CanMailboxAddressFilterImpl <em>Can Mailbox Address Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.intrepidgateway.impl.CanMailboxAddressFilterImpl
		 * @see targets.intrepidgateway.impl.IntrepidgatewayPackageImpl#getCanMailboxAddressFilter()
		 * @generated
		 */
		EClass CAN_MAILBOX_ADDRESS_FILTER = eINSTANCE.getCanMailboxAddressFilter();

		/**
		 * The meta object literal for the '<em><b>Address Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAN_MAILBOX_ADDRESS_FILTER__ADDRESS_SYMBOL = eINSTANCE.getCanMailboxAddressFilter_AddressSymbol();

		/**
		 * The meta object literal for the '<em><b>Address Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAN_MAILBOX_ADDRESS_FILTER__ADDRESS_VALUE = eINSTANCE.getCanMailboxAddressFilter_AddressValue();

		/**
		 * The meta object literal for the '{@link targets.intrepidgateway.impl.CanMailboxOutSlotImpl <em>Can Mailbox Out Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.intrepidgateway.impl.CanMailboxOutSlotImpl
		 * @see targets.intrepidgateway.impl.IntrepidgatewayPackageImpl#getCanMailboxOutSlot()
		 * @generated
		 */
		EClass CAN_MAILBOX_OUT_SLOT = eINSTANCE.getCanMailboxOutSlot();

		/**
		 * The meta object literal for the '<em><b>Port Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAN_MAILBOX_OUT_SLOT__PORT_ID = eINSTANCE.getCanMailboxOutSlot_PortId();

		/**
		 * The meta object literal for the '<em><b>Source Address Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAN_MAILBOX_OUT_SLOT__SOURCE_ADDRESS_SYMBOL = eINSTANCE.getCanMailboxOutSlot_SourceAddressSymbol();

		/**
		 * The meta object literal for the '<em><b>Source Address Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAN_MAILBOX_OUT_SLOT__SOURCE_ADDRESS_VALUE = eINSTANCE.getCanMailboxOutSlot_SourceAddressValue();

		/**
		 * The meta object literal for the '<em><b>Destination Address Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAN_MAILBOX_OUT_SLOT__DESTINATION_ADDRESS_SYMBOL = eINSTANCE.getCanMailboxOutSlot_DestinationAddressSymbol();

		/**
		 * The meta object literal for the '<em><b>Destination Address Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAN_MAILBOX_OUT_SLOT__DESTINATION_ADDRESS_VALUE = eINSTANCE.getCanMailboxOutSlot_DestinationAddressValue();

		/**
		 * The meta object literal for the '<em><b>Multicast</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAN_MAILBOX_OUT_SLOT__MULTICAST = eINSTANCE.getCanMailboxOutSlot_Multicast();

	}

} //IntrepidgatewayPackage
