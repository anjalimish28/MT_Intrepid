/**
 */
package ucof.communication.basedonethernet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import ucof.communication.CommunicationPackage;

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
 * Container, including all elements for building an ethernet based interface, e.g. A664, TSN, etc.
 * <!-- end-model-doc -->
 * @see ucof.communication.basedonethernet.BasedonethernetFactory
 * @model kind="package"
 * @generated
 */
public interface BasedonethernetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "basedonethernet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://gitlab.com/ucof/ucof.de/model/v001/ucof/communication/basedonethernet";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ucof.model.communication.basedonethernet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasedonethernetPackage eINSTANCE = ucof.communication.basedonethernet.impl.BasedonethernetPackageImpl.init();

	/**
	 * The meta object id for the '{@link ucof.communication.basedonethernet.impl.EthernetPortImpl <em>Ethernet Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.basedonethernet.impl.EthernetPortImpl
	 * @see ucof.communication.basedonethernet.impl.BasedonethernetPackageImpl#getEthernetPort()
	 * @generated
	 */
	int ETHERNET_PORT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_PORT__ID = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_PORT__NAME = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_PORT__DOCUMENTATION = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_PORT__MODIFIED = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_PORT__MODIFIER = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_PORT__TRACE_LINK = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_PORT__CREATED = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_PORT__CREATOR = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_PORT__VERSION = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>IP Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_PORT__IP_ADDRESS = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subnet Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_PORT__SUBNET_MASK = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ethernet Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_PORT_FEATURE_COUNT = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ethernet Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_PORT_OPERATION_COUNT = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.basedonethernet.impl.SuperEthernetMessageTypeImpl <em>Super Ethernet Message Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.basedonethernet.impl.SuperEthernetMessageTypeImpl
	 * @see ucof.communication.basedonethernet.impl.BasedonethernetPackageImpl#getSuperEthernetMessageType()
	 * @generated
	 */
	int SUPER_ETHERNET_MESSAGE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ETHERNET_MESSAGE_TYPE__ID = CommunicationPackage.SUPER_MESSAGE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ETHERNET_MESSAGE_TYPE__NAME = CommunicationPackage.SUPER_MESSAGE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ETHERNET_MESSAGE_TYPE__DOCUMENTATION = CommunicationPackage.SUPER_MESSAGE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ETHERNET_MESSAGE_TYPE__MODIFIED = CommunicationPackage.SUPER_MESSAGE_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ETHERNET_MESSAGE_TYPE__MODIFIER = CommunicationPackage.SUPER_MESSAGE_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ETHERNET_MESSAGE_TYPE__TRACE_LINK = CommunicationPackage.SUPER_MESSAGE_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ETHERNET_MESSAGE_TYPE__CREATED = CommunicationPackage.SUPER_MESSAGE_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ETHERNET_MESSAGE_TYPE__CREATOR = CommunicationPackage.SUPER_MESSAGE_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ETHERNET_MESSAGE_TYPE__VERSION = CommunicationPackage.SUPER_MESSAGE_TYPE__VERSION;

	/**
	 * The number of structural features of the '<em>Super Ethernet Message Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ETHERNET_MESSAGE_TYPE_FEATURE_COUNT = CommunicationPackage.SUPER_MESSAGE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Super Ethernet Message Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ETHERNET_MESSAGE_TYPE_OPERATION_COUNT = CommunicationPackage.SUPER_MESSAGE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.basedonethernet.impl.EthernetTXImpl <em>Ethernet TX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.basedonethernet.impl.EthernetTXImpl
	 * @see ucof.communication.basedonethernet.impl.BasedonethernetPackageImpl#getEthernetTX()
	 * @generated
	 */
	int ETHERNET_TX = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_TX__ID = SUPER_ETHERNET_MESSAGE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_TX__NAME = SUPER_ETHERNET_MESSAGE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_TX__DOCUMENTATION = SUPER_ETHERNET_MESSAGE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_TX__MODIFIED = SUPER_ETHERNET_MESSAGE_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_TX__MODIFIER = SUPER_ETHERNET_MESSAGE_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_TX__TRACE_LINK = SUPER_ETHERNET_MESSAGE_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_TX__CREATED = SUPER_ETHERNET_MESSAGE_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_TX__CREATOR = SUPER_ETHERNET_MESSAGE_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_TX__VERSION = SUPER_ETHERNET_MESSAGE_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Destination IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_TX__DESTINATION_IP = SUPER_ETHERNET_MESSAGE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destination Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_TX__DESTINATION_PORT = SUPER_ETHERNET_MESSAGE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ethernet TX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_TX_FEATURE_COUNT = SUPER_ETHERNET_MESSAGE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ethernet TX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_TX_OPERATION_COUNT = SUPER_ETHERNET_MESSAGE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.basedonethernet.impl.EthernetRXImpl <em>Ethernet RX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.basedonethernet.impl.EthernetRXImpl
	 * @see ucof.communication.basedonethernet.impl.BasedonethernetPackageImpl#getEthernetRX()
	 * @generated
	 */
	int ETHERNET_RX = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_RX__ID = SUPER_ETHERNET_MESSAGE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_RX__NAME = SUPER_ETHERNET_MESSAGE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_RX__DOCUMENTATION = SUPER_ETHERNET_MESSAGE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_RX__MODIFIED = SUPER_ETHERNET_MESSAGE_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_RX__MODIFIER = SUPER_ETHERNET_MESSAGE_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_RX__TRACE_LINK = SUPER_ETHERNET_MESSAGE_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_RX__CREATED = SUPER_ETHERNET_MESSAGE_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_RX__CREATOR = SUPER_ETHERNET_MESSAGE_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_RX__VERSION = SUPER_ETHERNET_MESSAGE_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Source Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_RX__SOURCE_PORT = SUPER_ETHERNET_MESSAGE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_RX__SOURCE_IP = SUPER_ETHERNET_MESSAGE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ethernet RX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_RX_FEATURE_COUNT = SUPER_ETHERNET_MESSAGE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ethernet RX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETHERNET_RX_OPERATION_COUNT = SUPER_ETHERNET_MESSAGE_TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ucof.communication.basedonethernet.EthernetPort <em>Ethernet Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ethernet Port</em>'.
	 * @see ucof.communication.basedonethernet.EthernetPort
	 * @generated
	 */
	EClass getEthernetPort();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.basedonethernet.EthernetPort#getIPAddress <em>IP Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IP Address</em>'.
	 * @see ucof.communication.basedonethernet.EthernetPort#getIPAddress()
	 * @see #getEthernetPort()
	 * @generated
	 */
	EAttribute getEthernetPort_IPAddress();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.basedonethernet.EthernetPort#getSubnetMask <em>Subnet Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet Mask</em>'.
	 * @see ucof.communication.basedonethernet.EthernetPort#getSubnetMask()
	 * @see #getEthernetPort()
	 * @generated
	 */
	EAttribute getEthernetPort_SubnetMask();

	/**
	 * Returns the meta object for class '{@link ucof.communication.basedonethernet.SuperEthernetMessageType <em>Super Ethernet Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Ethernet Message Type</em>'.
	 * @see ucof.communication.basedonethernet.SuperEthernetMessageType
	 * @generated
	 */
	EClass getSuperEthernetMessageType();

	/**
	 * Returns the meta object for class '{@link ucof.communication.basedonethernet.EthernetTX <em>Ethernet TX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ethernet TX</em>'.
	 * @see ucof.communication.basedonethernet.EthernetTX
	 * @generated
	 */
	EClass getEthernetTX();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.basedonethernet.EthernetTX#getDestinationIP <em>Destination IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination IP</em>'.
	 * @see ucof.communication.basedonethernet.EthernetTX#getDestinationIP()
	 * @see #getEthernetTX()
	 * @generated
	 */
	EAttribute getEthernetTX_DestinationIP();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.basedonethernet.EthernetTX#getDestinationPort <em>Destination Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination Port</em>'.
	 * @see ucof.communication.basedonethernet.EthernetTX#getDestinationPort()
	 * @see #getEthernetTX()
	 * @generated
	 */
	EAttribute getEthernetTX_DestinationPort();

	/**
	 * Returns the meta object for class '{@link ucof.communication.basedonethernet.EthernetRX <em>Ethernet RX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ethernet RX</em>'.
	 * @see ucof.communication.basedonethernet.EthernetRX
	 * @generated
	 */
	EClass getEthernetRX();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.basedonethernet.EthernetRX#getSourcePort <em>Source Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Port</em>'.
	 * @see ucof.communication.basedonethernet.EthernetRX#getSourcePort()
	 * @see #getEthernetRX()
	 * @generated
	 */
	EAttribute getEthernetRX_SourcePort();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.basedonethernet.EthernetRX#getSourceIP <em>Source IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source IP</em>'.
	 * @see ucof.communication.basedonethernet.EthernetRX#getSourceIP()
	 * @see #getEthernetRX()
	 * @generated
	 */
	EAttribute getEthernetRX_SourceIP();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BasedonethernetFactory getBasedonethernetFactory();

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
		 * The meta object literal for the '{@link ucof.communication.basedonethernet.impl.EthernetPortImpl <em>Ethernet Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.basedonethernet.impl.EthernetPortImpl
		 * @see ucof.communication.basedonethernet.impl.BasedonethernetPackageImpl#getEthernetPort()
		 * @generated
		 */
		EClass ETHERNET_PORT = eINSTANCE.getEthernetPort();

		/**
		 * The meta object literal for the '<em><b>IP Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETHERNET_PORT__IP_ADDRESS = eINSTANCE.getEthernetPort_IPAddress();

		/**
		 * The meta object literal for the '<em><b>Subnet Mask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETHERNET_PORT__SUBNET_MASK = eINSTANCE.getEthernetPort_SubnetMask();

		/**
		 * The meta object literal for the '{@link ucof.communication.basedonethernet.impl.SuperEthernetMessageTypeImpl <em>Super Ethernet Message Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.basedonethernet.impl.SuperEthernetMessageTypeImpl
		 * @see ucof.communication.basedonethernet.impl.BasedonethernetPackageImpl#getSuperEthernetMessageType()
		 * @generated
		 */
		EClass SUPER_ETHERNET_MESSAGE_TYPE = eINSTANCE.getSuperEthernetMessageType();

		/**
		 * The meta object literal for the '{@link ucof.communication.basedonethernet.impl.EthernetTXImpl <em>Ethernet TX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.basedonethernet.impl.EthernetTXImpl
		 * @see ucof.communication.basedonethernet.impl.BasedonethernetPackageImpl#getEthernetTX()
		 * @generated
		 */
		EClass ETHERNET_TX = eINSTANCE.getEthernetTX();

		/**
		 * The meta object literal for the '<em><b>Destination IP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETHERNET_TX__DESTINATION_IP = eINSTANCE.getEthernetTX_DestinationIP();

		/**
		 * The meta object literal for the '<em><b>Destination Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETHERNET_TX__DESTINATION_PORT = eINSTANCE.getEthernetTX_DestinationPort();

		/**
		 * The meta object literal for the '{@link ucof.communication.basedonethernet.impl.EthernetRXImpl <em>Ethernet RX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.basedonethernet.impl.EthernetRXImpl
		 * @see ucof.communication.basedonethernet.impl.BasedonethernetPackageImpl#getEthernetRX()
		 * @generated
		 */
		EClass ETHERNET_RX = eINSTANCE.getEthernetRX();

		/**
		 * The meta object literal for the '<em><b>Source Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETHERNET_RX__SOURCE_PORT = eINSTANCE.getEthernetRX_SourcePort();

		/**
		 * The meta object literal for the '<em><b>Source IP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETHERNET_RX__SOURCE_IP = eINSTANCE.getEthernetRX_SourceIP();

	}

} //BasedonethernetPackage
