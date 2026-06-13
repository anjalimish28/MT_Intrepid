/**
 */
package ucof.communication.basedonethernet.arinc664;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import ucof.common.etypes.EtypesPackage;

import ucof.communication.CommunicationPackage;

import ucof.communication.basedonethernet.BasedonethernetPackage;

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
 * Container, including all elements for building an A664 interface, see https://www.sae.org/standards/content/arinc664p5/
 * <!-- end-model-doc -->
 * @see ucof.communication.basedonethernet.arinc664.Arinc664Factory
 * @model kind="package"
 * @generated
 */
public interface Arinc664Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "arinc664";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://gitlab.com/ucof/ucof.de/model/v001/ucof/communication/basedonethernet/arinc664";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ucof.model.communication.basedonethernet.arinc664";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Arinc664Package eINSTANCE = ucof.communication.basedonethernet.arinc664.impl.Arinc664PackageImpl.init();

	/**
	 * The meta object id for the '{@link ucof.communication.basedonethernet.arinc664.impl.A664BusImpl <em>A664 Bus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.basedonethernet.arinc664.impl.A664BusImpl
	 * @see ucof.communication.basedonethernet.arinc664.impl.Arinc664PackageImpl#getA664Bus()
	 * @generated
	 */
	int A664_BUS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_BUS__ID = BasedonethernetPackage.ETHERNET_PORT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_BUS__NAME = BasedonethernetPackage.ETHERNET_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_BUS__DOCUMENTATION = BasedonethernetPackage.ETHERNET_PORT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_BUS__MODIFIED = BasedonethernetPackage.ETHERNET_PORT__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_BUS__MODIFIER = BasedonethernetPackage.ETHERNET_PORT__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_BUS__TRACE_LINK = BasedonethernetPackage.ETHERNET_PORT__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_BUS__CREATED = BasedonethernetPackage.ETHERNET_PORT__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_BUS__CREATOR = BasedonethernetPackage.ETHERNET_PORT__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_BUS__VERSION = BasedonethernetPackage.ETHERNET_PORT__VERSION;

	/**
	 * The feature id for the '<em><b>IP Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_BUS__IP_ADDRESS = BasedonethernetPackage.ETHERNET_PORT__IP_ADDRESS;

	/**
	 * The feature id for the '<em><b>Subnet Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_BUS__SUBNET_MASK = BasedonethernetPackage.ETHERNET_PORT__SUBNET_MASK;

	/**
	 * The feature id for the '<em><b>Virtual Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_BUS__VIRTUAL_LINK = BasedonethernetPackage.ETHERNET_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>A664 Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_BUS_FEATURE_COUNT = BasedonethernetPackage.ETHERNET_PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>A664 Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_BUS_OPERATION_COUNT = BasedonethernetPackage.ETHERNET_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.basedonethernet.arinc664.impl.A664VirtualLinkSuperImpl <em>A664 Virtual Link Super</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.basedonethernet.arinc664.impl.A664VirtualLinkSuperImpl
	 * @see ucof.communication.basedonethernet.arinc664.impl.Arinc664PackageImpl#getA664VirtualLinkSuper()
	 * @generated
	 */
	int A664_VIRTUAL_LINK_SUPER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_VIRTUAL_LINK_SUPER__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_VIRTUAL_LINK_SUPER__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_VIRTUAL_LINK_SUPER__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_VIRTUAL_LINK_SUPER__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_VIRTUAL_LINK_SUPER__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_VIRTUAL_LINK_SUPER__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_VIRTUAL_LINK_SUPER__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_VIRTUAL_LINK_SUPER__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_VIRTUAL_LINK_SUPER__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>A664 Virtual Link Super</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_VIRTUAL_LINK_SUPER_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>A664 Virtual Link Super</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_VIRTUAL_LINK_SUPER_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.basedonethernet.arinc664.impl.A664VirtualLinkInImpl <em>A664 Virtual Link In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.basedonethernet.arinc664.impl.A664VirtualLinkInImpl
	 * @see ucof.communication.basedonethernet.arinc664.impl.Arinc664PackageImpl#getA664VirtualLinkIn()
	 * @generated
	 */
	int A664_VIRTUAL_LINK_IN = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_VIRTUAL_LINK_IN__ID = A664_VIRTUAL_LINK_SUPER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_VIRTUAL_LINK_IN__NAME = A664_VIRTUAL_LINK_SUPER__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_VIRTUAL_LINK_IN__DOCUMENTATION = A664_VIRTUAL_LINK_SUPER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_VIRTUAL_LINK_IN__MODIFIED = A664_VIRTUAL_LINK_SUPER__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_VIRTUAL_LINK_IN__MODIFIER = A664_VIRTUAL_LINK_SUPER__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_VIRTUAL_LINK_IN__TRACE_LINK = A664_VIRTUAL_LINK_SUPER__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_VIRTUAL_LINK_IN__CREATED = A664_VIRTUAL_LINK_SUPER__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_VIRTUAL_LINK_IN__CREATOR = A664_VIRTUAL_LINK_SUPER__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_VIRTUAL_LINK_IN__VERSION = A664_VIRTUAL_LINK_SUPER__VERSION;

	/**
	 * The feature id for the '<em><b>Max Skew</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_VIRTUAL_LINK_IN__MAX_SKEW = A664_VIRTUAL_LINK_SUPER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>A664 Virtual Link In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_VIRTUAL_LINK_IN_FEATURE_COUNT = A664_VIRTUAL_LINK_SUPER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>A664 Virtual Link In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_VIRTUAL_LINK_IN_OPERATION_COUNT = A664_VIRTUAL_LINK_SUPER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.basedonethernet.arinc664.impl.A664VirtualLinkOutImpl <em>A664 Virtual Link Out</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.basedonethernet.arinc664.impl.A664VirtualLinkOutImpl
	 * @see ucof.communication.basedonethernet.arinc664.impl.Arinc664PackageImpl#getA664VirtualLinkOut()
	 * @generated
	 */
	int A664_VIRTUAL_LINK_OUT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_VIRTUAL_LINK_OUT__ID = A664_VIRTUAL_LINK_SUPER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_VIRTUAL_LINK_OUT__NAME = A664_VIRTUAL_LINK_SUPER__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_VIRTUAL_LINK_OUT__DOCUMENTATION = A664_VIRTUAL_LINK_SUPER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_VIRTUAL_LINK_OUT__MODIFIED = A664_VIRTUAL_LINK_SUPER__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_VIRTUAL_LINK_OUT__MODIFIER = A664_VIRTUAL_LINK_SUPER__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_VIRTUAL_LINK_OUT__TRACE_LINK = A664_VIRTUAL_LINK_SUPER__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_VIRTUAL_LINK_OUT__CREATED = A664_VIRTUAL_LINK_SUPER__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_VIRTUAL_LINK_OUT__CREATOR = A664_VIRTUAL_LINK_SUPER__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_VIRTUAL_LINK_OUT__VERSION = A664_VIRTUAL_LINK_SUPER__VERSION;

	/**
	 * The feature id for the '<em><b>BAG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_VIRTUAL_LINK_OUT__BAG = A664_VIRTUAL_LINK_SUPER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Frame Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_VIRTUAL_LINK_OUT__MAX_FRAME_SIZE = A664_VIRTUAL_LINK_SUPER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Over Sampling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_VIRTUAL_LINK_OUT__OVER_SAMPLING = A664_VIRTUAL_LINK_SUPER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_VIRTUAL_LINK_OUT__PHASE = A664_VIRTUAL_LINK_SUPER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>A664 Virtual Link Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_VIRTUAL_LINK_OUT_FEATURE_COUNT = A664_VIRTUAL_LINK_SUPER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>A664 Virtual Link Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_VIRTUAL_LINK_OUT_OPERATION_COUNT = A664_VIRTUAL_LINK_SUPER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.basedonethernet.arinc664.impl.A664MessageImpl <em>A664 Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.basedonethernet.arinc664.impl.A664MessageImpl
	 * @see ucof.communication.basedonethernet.arinc664.impl.Arinc664PackageImpl#getA664Message()
	 * @generated
	 */
	int A664_MESSAGE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_MESSAGE__ID = CommunicationPackage.SUPER_MESSAGE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_MESSAGE__NAME = CommunicationPackage.SUPER_MESSAGE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_MESSAGE__DOCUMENTATION = CommunicationPackage.SUPER_MESSAGE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_MESSAGE__MODIFIED = CommunicationPackage.SUPER_MESSAGE_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_MESSAGE__MODIFIER = CommunicationPackage.SUPER_MESSAGE_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_MESSAGE__TRACE_LINK = CommunicationPackage.SUPER_MESSAGE_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_MESSAGE__CREATED = CommunicationPackage.SUPER_MESSAGE_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_MESSAGE__CREATOR = CommunicationPackage.SUPER_MESSAGE_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_MESSAGE__VERSION = CommunicationPackage.SUPER_MESSAGE_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Destination MAC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_MESSAGE__DESTINATION_MAC = CommunicationPackage.SUPER_MESSAGE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source MAC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_MESSAGE__SOURCE_MAC = CommunicationPackage.SUPER_MESSAGE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ether Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_MESSAGE__ETHER_TYPE = CommunicationPackage.SUPER_MESSAGE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_MESSAGE__SOURCE_IP = CommunicationPackage.SUPER_MESSAGE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Destination IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_MESSAGE__DESTINATION_IP = CommunicationPackage.SUPER_MESSAGE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Destination Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_MESSAGE__DESTINATION_PORT = CommunicationPackage.SUPER_MESSAGE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Source Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_MESSAGE__SOURCE_PORT = CommunicationPackage.SUPER_MESSAGE_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>TTL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_MESSAGE__TTL = CommunicationPackage.SUPER_MESSAGE_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_MESSAGE__PROTOCOL = CommunicationPackage.SUPER_MESSAGE_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Ethernet Identification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_MESSAGE__ETHERNET_IDENTIFICATION = CommunicationPackage.SUPER_MESSAGE_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Flags And Fragment Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_MESSAGE__FLAGS_AND_FRAGMENT_OFFSET = CommunicationPackage.SUPER_MESSAGE_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Version And IHL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_MESSAGE__VERSION_AND_IHL = CommunicationPackage.SUPER_MESSAGE_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Type Of Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_MESSAGE__TYPE_OF_SERVICE = CommunicationPackage.SUPER_MESSAGE_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Virtual Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_MESSAGE__VIRTUAL_LINK = CommunicationPackage.SUPER_MESSAGE_TYPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Virtual Link Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_MESSAGE__VIRTUAL_LINK_OFFSET = CommunicationPackage.SUPER_MESSAGE_TYPE_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>A664 Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_MESSAGE_FEATURE_COUNT = CommunicationPackage.SUPER_MESSAGE_TYPE_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>A664 Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_MESSAGE_OPERATION_COUNT = CommunicationPackage.SUPER_MESSAGE_TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ucof.communication.basedonethernet.arinc664.A664Bus <em>A664 Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A664 Bus</em>'.
	 * @see ucof.communication.basedonethernet.arinc664.A664Bus
	 * @generated
	 */
	EClass getA664Bus();

	/**
	 * Returns the meta object for the containment reference '{@link ucof.communication.basedonethernet.arinc664.A664Bus#getVirtualLink <em>Virtual Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Virtual Link</em>'.
	 * @see ucof.communication.basedonethernet.arinc664.A664Bus#getVirtualLink()
	 * @see #getA664Bus()
	 * @generated
	 */
	EReference getA664Bus_VirtualLink();

	/**
	 * Returns the meta object for class '{@link ucof.communication.basedonethernet.arinc664.A664VirtualLinkSuper <em>A664 Virtual Link Super</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A664 Virtual Link Super</em>'.
	 * @see ucof.communication.basedonethernet.arinc664.A664VirtualLinkSuper
	 * @generated
	 */
	EClass getA664VirtualLinkSuper();

	/**
	 * Returns the meta object for class '{@link ucof.communication.basedonethernet.arinc664.A664VirtualLinkIn <em>A664 Virtual Link In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A664 Virtual Link In</em>'.
	 * @see ucof.communication.basedonethernet.arinc664.A664VirtualLinkIn
	 * @generated
	 */
	EClass getA664VirtualLinkIn();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.basedonethernet.arinc664.A664VirtualLinkIn#getMaxSkew <em>Max Skew</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Skew</em>'.
	 * @see ucof.communication.basedonethernet.arinc664.A664VirtualLinkIn#getMaxSkew()
	 * @see #getA664VirtualLinkIn()
	 * @generated
	 */
	EAttribute getA664VirtualLinkIn_MaxSkew();

	/**
	 * Returns the meta object for class '{@link ucof.communication.basedonethernet.arinc664.A664VirtualLinkOut <em>A664 Virtual Link Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A664 Virtual Link Out</em>'.
	 * @see ucof.communication.basedonethernet.arinc664.A664VirtualLinkOut
	 * @generated
	 */
	EClass getA664VirtualLinkOut();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.basedonethernet.arinc664.A664VirtualLinkOut#getBAG <em>BAG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BAG</em>'.
	 * @see ucof.communication.basedonethernet.arinc664.A664VirtualLinkOut#getBAG()
	 * @see #getA664VirtualLinkOut()
	 * @generated
	 */
	EAttribute getA664VirtualLinkOut_BAG();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.basedonethernet.arinc664.A664VirtualLinkOut#getMaxFrameSize <em>Max Frame Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Frame Size</em>'.
	 * @see ucof.communication.basedonethernet.arinc664.A664VirtualLinkOut#getMaxFrameSize()
	 * @see #getA664VirtualLinkOut()
	 * @generated
	 */
	EAttribute getA664VirtualLinkOut_MaxFrameSize();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.basedonethernet.arinc664.A664VirtualLinkOut#getOverSampling <em>Over Sampling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Over Sampling</em>'.
	 * @see ucof.communication.basedonethernet.arinc664.A664VirtualLinkOut#getOverSampling()
	 * @see #getA664VirtualLinkOut()
	 * @generated
	 */
	EAttribute getA664VirtualLinkOut_OverSampling();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.basedonethernet.arinc664.A664VirtualLinkOut#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase</em>'.
	 * @see ucof.communication.basedonethernet.arinc664.A664VirtualLinkOut#getPhase()
	 * @see #getA664VirtualLinkOut()
	 * @generated
	 */
	EAttribute getA664VirtualLinkOut_Phase();

	/**
	 * Returns the meta object for class '{@link ucof.communication.basedonethernet.arinc664.A664Message <em>A664 Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A664 Message</em>'.
	 * @see ucof.communication.basedonethernet.arinc664.A664Message
	 * @generated
	 */
	EClass getA664Message();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.basedonethernet.arinc664.A664Message#getDestinationMAC <em>Destination MAC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination MAC</em>'.
	 * @see ucof.communication.basedonethernet.arinc664.A664Message#getDestinationMAC()
	 * @see #getA664Message()
	 * @generated
	 */
	EAttribute getA664Message_DestinationMAC();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.basedonethernet.arinc664.A664Message#getSourceMAC <em>Source MAC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source MAC</em>'.
	 * @see ucof.communication.basedonethernet.arinc664.A664Message#getSourceMAC()
	 * @see #getA664Message()
	 * @generated
	 */
	EAttribute getA664Message_SourceMAC();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.basedonethernet.arinc664.A664Message#getEtherType <em>Ether Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ether Type</em>'.
	 * @see ucof.communication.basedonethernet.arinc664.A664Message#getEtherType()
	 * @see #getA664Message()
	 * @generated
	 */
	EAttribute getA664Message_EtherType();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.basedonethernet.arinc664.A664Message#getSourceIP <em>Source IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source IP</em>'.
	 * @see ucof.communication.basedonethernet.arinc664.A664Message#getSourceIP()
	 * @see #getA664Message()
	 * @generated
	 */
	EAttribute getA664Message_SourceIP();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.basedonethernet.arinc664.A664Message#getDestinationIP <em>Destination IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination IP</em>'.
	 * @see ucof.communication.basedonethernet.arinc664.A664Message#getDestinationIP()
	 * @see #getA664Message()
	 * @generated
	 */
	EAttribute getA664Message_DestinationIP();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.basedonethernet.arinc664.A664Message#getDestinationPort <em>Destination Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination Port</em>'.
	 * @see ucof.communication.basedonethernet.arinc664.A664Message#getDestinationPort()
	 * @see #getA664Message()
	 * @generated
	 */
	EAttribute getA664Message_DestinationPort();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.basedonethernet.arinc664.A664Message#getSourcePort <em>Source Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Port</em>'.
	 * @see ucof.communication.basedonethernet.arinc664.A664Message#getSourcePort()
	 * @see #getA664Message()
	 * @generated
	 */
	EAttribute getA664Message_SourcePort();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.basedonethernet.arinc664.A664Message#getTTL <em>TTL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TTL</em>'.
	 * @see ucof.communication.basedonethernet.arinc664.A664Message#getTTL()
	 * @see #getA664Message()
	 * @generated
	 */
	EAttribute getA664Message_TTL();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.basedonethernet.arinc664.A664Message#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see ucof.communication.basedonethernet.arinc664.A664Message#getProtocol()
	 * @see #getA664Message()
	 * @generated
	 */
	EAttribute getA664Message_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.basedonethernet.arinc664.A664Message#getEthernetIdentification <em>Ethernet Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ethernet Identification</em>'.
	 * @see ucof.communication.basedonethernet.arinc664.A664Message#getEthernetIdentification()
	 * @see #getA664Message()
	 * @generated
	 */
	EAttribute getA664Message_EthernetIdentification();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.basedonethernet.arinc664.A664Message#getFlagsAndFragmentOffset <em>Flags And Fragment Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flags And Fragment Offset</em>'.
	 * @see ucof.communication.basedonethernet.arinc664.A664Message#getFlagsAndFragmentOffset()
	 * @see #getA664Message()
	 * @generated
	 */
	EAttribute getA664Message_FlagsAndFragmentOffset();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.basedonethernet.arinc664.A664Message#getVersionAndIHL <em>Version And IHL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version And IHL</em>'.
	 * @see ucof.communication.basedonethernet.arinc664.A664Message#getVersionAndIHL()
	 * @see #getA664Message()
	 * @generated
	 */
	EAttribute getA664Message_VersionAndIHL();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.basedonethernet.arinc664.A664Message#getTypeOfService <em>Type Of Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Of Service</em>'.
	 * @see ucof.communication.basedonethernet.arinc664.A664Message#getTypeOfService()
	 * @see #getA664Message()
	 * @generated
	 */
	EAttribute getA664Message_TypeOfService();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.basedonethernet.arinc664.A664Message#getVirtualLink <em>Virtual Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Virtual Link</em>'.
	 * @see ucof.communication.basedonethernet.arinc664.A664Message#getVirtualLink()
	 * @see #getA664Message()
	 * @generated
	 */
	EAttribute getA664Message_VirtualLink();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.basedonethernet.arinc664.A664Message#getVirtualLinkOffset <em>Virtual Link Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Virtual Link Offset</em>'.
	 * @see ucof.communication.basedonethernet.arinc664.A664Message#getVirtualLinkOffset()
	 * @see #getA664Message()
	 * @generated
	 */
	EAttribute getA664Message_VirtualLinkOffset();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Arinc664Factory getArinc664Factory();

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
		 * The meta object literal for the '{@link ucof.communication.basedonethernet.arinc664.impl.A664BusImpl <em>A664 Bus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.basedonethernet.arinc664.impl.A664BusImpl
		 * @see ucof.communication.basedonethernet.arinc664.impl.Arinc664PackageImpl#getA664Bus()
		 * @generated
		 */
		EClass A664_BUS = eINSTANCE.getA664Bus();

		/**
		 * The meta object literal for the '<em><b>Virtual Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference A664_BUS__VIRTUAL_LINK = eINSTANCE.getA664Bus_VirtualLink();

		/**
		 * The meta object literal for the '{@link ucof.communication.basedonethernet.arinc664.impl.A664VirtualLinkSuperImpl <em>A664 Virtual Link Super</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.basedonethernet.arinc664.impl.A664VirtualLinkSuperImpl
		 * @see ucof.communication.basedonethernet.arinc664.impl.Arinc664PackageImpl#getA664VirtualLinkSuper()
		 * @generated
		 */
		EClass A664_VIRTUAL_LINK_SUPER = eINSTANCE.getA664VirtualLinkSuper();

		/**
		 * The meta object literal for the '{@link ucof.communication.basedonethernet.arinc664.impl.A664VirtualLinkInImpl <em>A664 Virtual Link In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.basedonethernet.arinc664.impl.A664VirtualLinkInImpl
		 * @see ucof.communication.basedonethernet.arinc664.impl.Arinc664PackageImpl#getA664VirtualLinkIn()
		 * @generated
		 */
		EClass A664_VIRTUAL_LINK_IN = eINSTANCE.getA664VirtualLinkIn();

		/**
		 * The meta object literal for the '<em><b>Max Skew</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A664_VIRTUAL_LINK_IN__MAX_SKEW = eINSTANCE.getA664VirtualLinkIn_MaxSkew();

		/**
		 * The meta object literal for the '{@link ucof.communication.basedonethernet.arinc664.impl.A664VirtualLinkOutImpl <em>A664 Virtual Link Out</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.basedonethernet.arinc664.impl.A664VirtualLinkOutImpl
		 * @see ucof.communication.basedonethernet.arinc664.impl.Arinc664PackageImpl#getA664VirtualLinkOut()
		 * @generated
		 */
		EClass A664_VIRTUAL_LINK_OUT = eINSTANCE.getA664VirtualLinkOut();

		/**
		 * The meta object literal for the '<em><b>BAG</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A664_VIRTUAL_LINK_OUT__BAG = eINSTANCE.getA664VirtualLinkOut_BAG();

		/**
		 * The meta object literal for the '<em><b>Max Frame Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A664_VIRTUAL_LINK_OUT__MAX_FRAME_SIZE = eINSTANCE.getA664VirtualLinkOut_MaxFrameSize();

		/**
		 * The meta object literal for the '<em><b>Over Sampling</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A664_VIRTUAL_LINK_OUT__OVER_SAMPLING = eINSTANCE.getA664VirtualLinkOut_OverSampling();

		/**
		 * The meta object literal for the '<em><b>Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A664_VIRTUAL_LINK_OUT__PHASE = eINSTANCE.getA664VirtualLinkOut_Phase();

		/**
		 * The meta object literal for the '{@link ucof.communication.basedonethernet.arinc664.impl.A664MessageImpl <em>A664 Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.basedonethernet.arinc664.impl.A664MessageImpl
		 * @see ucof.communication.basedonethernet.arinc664.impl.Arinc664PackageImpl#getA664Message()
		 * @generated
		 */
		EClass A664_MESSAGE = eINSTANCE.getA664Message();

		/**
		 * The meta object literal for the '<em><b>Destination MAC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A664_MESSAGE__DESTINATION_MAC = eINSTANCE.getA664Message_DestinationMAC();

		/**
		 * The meta object literal for the '<em><b>Source MAC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A664_MESSAGE__SOURCE_MAC = eINSTANCE.getA664Message_SourceMAC();

		/**
		 * The meta object literal for the '<em><b>Ether Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A664_MESSAGE__ETHER_TYPE = eINSTANCE.getA664Message_EtherType();

		/**
		 * The meta object literal for the '<em><b>Source IP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A664_MESSAGE__SOURCE_IP = eINSTANCE.getA664Message_SourceIP();

		/**
		 * The meta object literal for the '<em><b>Destination IP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A664_MESSAGE__DESTINATION_IP = eINSTANCE.getA664Message_DestinationIP();

		/**
		 * The meta object literal for the '<em><b>Destination Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A664_MESSAGE__DESTINATION_PORT = eINSTANCE.getA664Message_DestinationPort();

		/**
		 * The meta object literal for the '<em><b>Source Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A664_MESSAGE__SOURCE_PORT = eINSTANCE.getA664Message_SourcePort();

		/**
		 * The meta object literal for the '<em><b>TTL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A664_MESSAGE__TTL = eINSTANCE.getA664Message_TTL();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A664_MESSAGE__PROTOCOL = eINSTANCE.getA664Message_Protocol();

		/**
		 * The meta object literal for the '<em><b>Ethernet Identification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A664_MESSAGE__ETHERNET_IDENTIFICATION = eINSTANCE.getA664Message_EthernetIdentification();

		/**
		 * The meta object literal for the '<em><b>Flags And Fragment Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A664_MESSAGE__FLAGS_AND_FRAGMENT_OFFSET = eINSTANCE.getA664Message_FlagsAndFragmentOffset();

		/**
		 * The meta object literal for the '<em><b>Version And IHL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A664_MESSAGE__VERSION_AND_IHL = eINSTANCE.getA664Message_VersionAndIHL();

		/**
		 * The meta object literal for the '<em><b>Type Of Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A664_MESSAGE__TYPE_OF_SERVICE = eINSTANCE.getA664Message_TypeOfService();

		/**
		 * The meta object literal for the '<em><b>Virtual Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A664_MESSAGE__VIRTUAL_LINK = eINSTANCE.getA664Message_VirtualLink();

		/**
		 * The meta object literal for the '<em><b>Virtual Link Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A664_MESSAGE__VIRTUAL_LINK_OFFSET = eINSTANCE.getA664Message_VirtualLinkOffset();

	}

} //Arinc664Package
