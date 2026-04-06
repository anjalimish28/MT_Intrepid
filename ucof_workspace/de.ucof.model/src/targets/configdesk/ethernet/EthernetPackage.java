/**
 */
package targets.configdesk.ethernet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import targets.configdesk.ConfigdeskPackage;
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
 * @see targets.configdesk.ethernet.EthernetFactory
 * @model kind="package"
 * @generated
 */
public interface EthernetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ethernet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://gitlab.com/ucof/ucof.de/model/v001/ucof/targets/configdesk/ethernet";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ucof.model.targets.configdesk.ethernet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EthernetPackage eINSTANCE = targets.configdesk.ethernet.impl.EthernetPackageImpl.init();

	/**
	 * The meta object id for the '{@link targets.configdesk.ethernet.impl.ETHSetupImpl <em>ETH Setup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.configdesk.ethernet.impl.ETHSetupImpl
	 * @see targets.configdesk.ethernet.impl.EthernetPackageImpl#getETHSetup()
	 * @generated
	 */
	int ETH_SETUP = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_SETUP__ID = ConfigdeskPackage.SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_SETUP__NAME = ConfigdeskPackage.SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_SETUP__DOCUMENTATION = ConfigdeskPackage.SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_SETUP__MODIFIED = ConfigdeskPackage.SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_SETUP__MODIFIER = ConfigdeskPackage.SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_SETUP__TRACE_LINK = ConfigdeskPackage.SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_SETUP__CREATED = ConfigdeskPackage.SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_SETUP__CREATOR = ConfigdeskPackage.SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_SETUP__VERSION = ConfigdeskPackage.SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Assignment Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_SETUP__ASSIGNMENT_SPECIFICATION = ConfigdeskPackage.SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE__ASSIGNMENT_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Channel Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_SETUP__CHANNEL_SET = ConfigdeskPackage.SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_SETUP__CHANNEL = ConfigdeskPackage.SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model Accessible Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_SETUP__MODEL_ACCESSIBLE_PORTS = ConfigdeskPackage.SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ethernet Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_SETUP__ETHERNET_PORT = ConfigdeskPackage.SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>UDP Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_SETUP__UDP_CONNECTION = ConfigdeskPackage.SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>ETH Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_SETUP_FEATURE_COUNT = ConfigdeskPackage.SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>ETH Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_SETUP_OPERATION_COUNT = ConfigdeskPackage.SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.configdesk.ethernet.impl.UDPConnectionImpl <em>UDP Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.configdesk.ethernet.impl.UDPConnectionImpl
	 * @see targets.configdesk.ethernet.impl.EthernetPackageImpl#getUDPConnection()
	 * @generated
	 */
	int UDP_CONNECTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_CONNECTION__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_CONNECTION__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_CONNECTION__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_CONNECTION__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_CONNECTION__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_CONNECTION__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_CONNECTION__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_CONNECTION__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_CONNECTION__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Max Vector Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_CONNECTION__MAX_VECTOR_SIZE = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>UDP Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_CONNECTION_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>UDP Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_CONNECTION_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.configdesk.ethernet.impl.UDPTXImpl <em>UDPTX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.configdesk.ethernet.impl.UDPTXImpl
	 * @see targets.configdesk.ethernet.impl.EthernetPackageImpl#getUDPTX()
	 * @generated
	 */
	int UDPTX = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDPTX__ID = UDP_CONNECTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDPTX__NAME = UDP_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDPTX__DOCUMENTATION = UDP_CONNECTION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDPTX__MODIFIED = UDP_CONNECTION__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDPTX__MODIFIER = UDP_CONNECTION__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDPTX__TRACE_LINK = UDP_CONNECTION__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDPTX__CREATED = UDP_CONNECTION__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDPTX__CREATOR = UDP_CONNECTION__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDPTX__VERSION = UDP_CONNECTION__VERSION;

	/**
	 * The feature id for the '<em><b>Max Vector Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDPTX__MAX_VECTOR_SIZE = UDP_CONNECTION__MAX_VECTOR_SIZE;

	/**
	 * The feature id for the '<em><b>Model Accessible Ports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDPTX__MODEL_ACCESSIBLE_PORTS = UDP_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable Vector Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDPTX__VARIABLE_VECTOR_SIZE = UDP_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>UDPTX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDPTX_FEATURE_COUNT = UDP_CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>UDPTX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDPTX_OPERATION_COUNT = UDP_CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.configdesk.ethernet.impl.UDPRXImpl <em>UDPRX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.configdesk.ethernet.impl.UDPRXImpl
	 * @see targets.configdesk.ethernet.impl.EthernetPackageImpl#getUDPRX()
	 * @generated
	 */
	int UDPRX = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDPRX__ID = UDP_CONNECTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDPRX__NAME = UDP_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDPRX__DOCUMENTATION = UDP_CONNECTION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDPRX__MODIFIED = UDP_CONNECTION__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDPRX__MODIFIER = UDP_CONNECTION__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDPRX__TRACE_LINK = UDP_CONNECTION__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDPRX__CREATED = UDP_CONNECTION__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDPRX__CREATOR = UDP_CONNECTION__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDPRX__VERSION = UDP_CONNECTION__VERSION;

	/**
	 * The feature id for the '<em><b>Max Vector Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDPRX__MAX_VECTOR_SIZE = UDP_CONNECTION__MAX_VECTOR_SIZE;

	/**
	 * The feature id for the '<em><b>Model Accessible Ports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDPRX__MODEL_ACCESSIBLE_PORTS = UDP_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UDPRX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDPRX_FEATURE_COUNT = UDP_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>UDPRX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDPRX_OPERATION_COUNT = UDP_CONNECTION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link targets.configdesk.ethernet.ETHSetup <em>ETH Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ETH Setup</em>'.
	 * @see targets.configdesk.ethernet.ETHSetup
	 * @generated
	 */
	EClass getETHSetup();

	/**
	 * Returns the meta object for the attribute '{@link targets.configdesk.ethernet.ETHSetup#getChannelSet <em>Channel Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel Set</em>'.
	 * @see targets.configdesk.ethernet.ETHSetup#getChannelSet()
	 * @see #getETHSetup()
	 * @generated
	 */
	EAttribute getETHSetup_ChannelSet();

	/**
	 * Returns the meta object for the attribute '{@link targets.configdesk.ethernet.ETHSetup#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel</em>'.
	 * @see targets.configdesk.ethernet.ETHSetup#getChannel()
	 * @see #getETHSetup()
	 * @generated
	 */
	EAttribute getETHSetup_Channel();

	/**
	 * Returns the meta object for the attribute '{@link targets.configdesk.ethernet.ETHSetup#getModelAccessiblePorts <em>Model Accessible Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Accessible Ports</em>'.
	 * @see targets.configdesk.ethernet.ETHSetup#getModelAccessiblePorts()
	 * @see #getETHSetup()
	 * @generated
	 */
	EAttribute getETHSetup_ModelAccessiblePorts();

	/**
	 * Returns the meta object for the reference '{@link targets.configdesk.ethernet.ETHSetup#getEthernetPort <em>Ethernet Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ethernet Port</em>'.
	 * @see targets.configdesk.ethernet.ETHSetup#getEthernetPort()
	 * @see #getETHSetup()
	 * @generated
	 */
	EReference getETHSetup_EthernetPort();

	/**
	 * Returns the meta object for the containment reference list '{@link targets.configdesk.ethernet.ETHSetup#getUDPConnection <em>UDP Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>UDP Connection</em>'.
	 * @see targets.configdesk.ethernet.ETHSetup#getUDPConnection()
	 * @see #getETHSetup()
	 * @generated
	 */
	EReference getETHSetup_UDPConnection();

	/**
	 * Returns the meta object for class '{@link targets.configdesk.ethernet.UDPConnection <em>UDP Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UDP Connection</em>'.
	 * @see targets.configdesk.ethernet.UDPConnection
	 * @generated
	 */
	EClass getUDPConnection();

	/**
	 * Returns the meta object for the attribute '{@link targets.configdesk.ethernet.UDPConnection#getMaxVectorSize <em>Max Vector Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Vector Size</em>'.
	 * @see targets.configdesk.ethernet.UDPConnection#getMaxVectorSize()
	 * @see #getUDPConnection()
	 * @generated
	 */
	EAttribute getUDPConnection_MaxVectorSize();

	/**
	 * Returns the meta object for class '{@link targets.configdesk.ethernet.UDPTX <em>UDPTX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UDPTX</em>'.
	 * @see targets.configdesk.ethernet.UDPTX
	 * @generated
	 */
	EClass getUDPTX();

	/**
	 * Returns the meta object for the attribute list '{@link targets.configdesk.ethernet.UDPTX#getModelAccessiblePorts <em>Model Accessible Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Model Accessible Ports</em>'.
	 * @see targets.configdesk.ethernet.UDPTX#getModelAccessiblePorts()
	 * @see #getUDPTX()
	 * @generated
	 */
	EAttribute getUDPTX_ModelAccessiblePorts();

	/**
	 * Returns the meta object for the attribute '{@link targets.configdesk.ethernet.UDPTX#getVariableVectorSize <em>Variable Vector Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Vector Size</em>'.
	 * @see targets.configdesk.ethernet.UDPTX#getVariableVectorSize()
	 * @see #getUDPTX()
	 * @generated
	 */
	EAttribute getUDPTX_VariableVectorSize();

	/**
	 * Returns the meta object for class '{@link targets.configdesk.ethernet.UDPRX <em>UDPRX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UDPRX</em>'.
	 * @see targets.configdesk.ethernet.UDPRX
	 * @generated
	 */
	EClass getUDPRX();

	/**
	 * Returns the meta object for the attribute list '{@link targets.configdesk.ethernet.UDPRX#getModelAccessiblePorts <em>Model Accessible Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Model Accessible Ports</em>'.
	 * @see targets.configdesk.ethernet.UDPRX#getModelAccessiblePorts()
	 * @see #getUDPRX()
	 * @generated
	 */
	EAttribute getUDPRX_ModelAccessiblePorts();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EthernetFactory getEthernetFactory();

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
		 * The meta object literal for the '{@link targets.configdesk.ethernet.impl.ETHSetupImpl <em>ETH Setup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.configdesk.ethernet.impl.ETHSetupImpl
		 * @see targets.configdesk.ethernet.impl.EthernetPackageImpl#getETHSetup()
		 * @generated
		 */
		EClass ETH_SETUP = eINSTANCE.getETHSetup();

		/**
		 * The meta object literal for the '<em><b>Channel Set</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETH_SETUP__CHANNEL_SET = eINSTANCE.getETHSetup_ChannelSet();

		/**
		 * The meta object literal for the '<em><b>Channel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETH_SETUP__CHANNEL = eINSTANCE.getETHSetup_Channel();

		/**
		 * The meta object literal for the '<em><b>Model Accessible Ports</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETH_SETUP__MODEL_ACCESSIBLE_PORTS = eINSTANCE.getETHSetup_ModelAccessiblePorts();

		/**
		 * The meta object literal for the '<em><b>Ethernet Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETH_SETUP__ETHERNET_PORT = eINSTANCE.getETHSetup_EthernetPort();

		/**
		 * The meta object literal for the '<em><b>UDP Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETH_SETUP__UDP_CONNECTION = eINSTANCE.getETHSetup_UDPConnection();

		/**
		 * The meta object literal for the '{@link targets.configdesk.ethernet.impl.UDPConnectionImpl <em>UDP Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.configdesk.ethernet.impl.UDPConnectionImpl
		 * @see targets.configdesk.ethernet.impl.EthernetPackageImpl#getUDPConnection()
		 * @generated
		 */
		EClass UDP_CONNECTION = eINSTANCE.getUDPConnection();

		/**
		 * The meta object literal for the '<em><b>Max Vector Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UDP_CONNECTION__MAX_VECTOR_SIZE = eINSTANCE.getUDPConnection_MaxVectorSize();

		/**
		 * The meta object literal for the '{@link targets.configdesk.ethernet.impl.UDPTXImpl <em>UDPTX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.configdesk.ethernet.impl.UDPTXImpl
		 * @see targets.configdesk.ethernet.impl.EthernetPackageImpl#getUDPTX()
		 * @generated
		 */
		EClass UDPTX = eINSTANCE.getUDPTX();

		/**
		 * The meta object literal for the '<em><b>Model Accessible Ports</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UDPTX__MODEL_ACCESSIBLE_PORTS = eINSTANCE.getUDPTX_ModelAccessiblePorts();

		/**
		 * The meta object literal for the '<em><b>Variable Vector Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UDPTX__VARIABLE_VECTOR_SIZE = eINSTANCE.getUDPTX_VariableVectorSize();

		/**
		 * The meta object literal for the '{@link targets.configdesk.ethernet.impl.UDPRXImpl <em>UDPRX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.configdesk.ethernet.impl.UDPRXImpl
		 * @see targets.configdesk.ethernet.impl.EthernetPackageImpl#getUDPRX()
		 * @generated
		 */
		EClass UDPRX = eINSTANCE.getUDPRX();

		/**
		 * The meta object literal for the '<em><b>Model Accessible Ports</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UDPRX__MODEL_ACCESSIBLE_PORTS = eINSTANCE.getUDPRX_ModelAccessiblePorts();

	}

} //EthernetPackage
