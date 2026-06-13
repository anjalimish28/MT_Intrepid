/**
 */
package ucof.communication.configECIC;

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
 * Container, including all elements necessary for creating an ECIC for ED-247 standard, see https://www.eurocae.net/working-group/wg-97/
 * <!-- end-model-doc -->
 * @see ucof.communication.configECIC.ConfigECICFactory
 * @model kind="package"
 * @generated
 */
public interface ConfigECICPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "configECIC";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://gitlab.com/ucof/ucof.de/model/v001/ucof/communication/configECIC";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ucof.model.communication.configECIC";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigECICPackage eINSTANCE = ucof.communication.configECIC.impl.ConfigECICPackageImpl.init();

	/**
	 * The meta object id for the '{@link ucof.communication.configECIC.impl.ED247ConfigurationsImpl <em>ED247 Configurations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.configECIC.impl.ED247ConfigurationsImpl
	 * @see ucof.communication.configECIC.impl.ConfigECICPackageImpl#getED247Configurations()
	 * @generated
	 */
	int ED247_CONFIGURATIONS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_CONFIGURATIONS__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_CONFIGURATIONS__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_CONFIGURATIONS__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_CONFIGURATIONS__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_CONFIGURATIONS__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_CONFIGURATIONS__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_CONFIGURATIONS__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_CONFIGURATIONS__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_CONFIGURATIONS__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Ed247 Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_CONFIGURATIONS__ED247_CONFIGURATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>ED247 Configurations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_CONFIGURATIONS_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>ED247 Configurations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_CONFIGURATIONS_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.configECIC.impl.ED247ConfigurationImpl <em>ED247 Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.configECIC.impl.ED247ConfigurationImpl
	 * @see ucof.communication.configECIC.impl.ConfigECICPackageImpl#getED247Configuration()
	 * @generated
	 */
	int ED247_CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_CONFIGURATION__ID = EtypesPackage.SUPER_SET_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_CONFIGURATION__NAME = EtypesPackage.SUPER_SET_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_CONFIGURATION__DOCUMENTATION = EtypesPackage.SUPER_SET_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_CONFIGURATION__MODIFIED = EtypesPackage.SUPER_SET_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_CONFIGURATION__MODIFIER = EtypesPackage.SUPER_SET_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_CONFIGURATION__TRACE_LINK = EtypesPackage.SUPER_SET_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_CONFIGURATION__CREATED = EtypesPackage.SUPER_SET_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_CONFIGURATION__CREATOR = EtypesPackage.SUPER_SET_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_CONFIGURATION__VERSION = EtypesPackage.SUPER_SET_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Setname</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_CONFIGURATION__SETNAME = EtypesPackage.SUPER_SET_TYPE__SETNAME;

	/**
	 * The feature id for the '<em><b>Standard Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_CONFIGURATION__STANDARD_REVISION = EtypesPackage.SUPER_SET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_CONFIGURATION__COMPONENT_VERSION = EtypesPackage.SUPER_SET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_CONFIGURATION__COMPONENT_TYPE = EtypesPackage.SUPER_SET_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Channels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_CONFIGURATION__CHANNELS = EtypesPackage.SUPER_SET_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>File Producer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_CONFIGURATION__FILE_PRODUCER = EtypesPackage.SUPER_SET_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>ED247 Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_CONFIGURATION_FEATURE_COUNT = EtypesPackage.SUPER_SET_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>ED247 Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_CONFIGURATION_OPERATION_COUNT = EtypesPackage.SUPER_SET_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.configECIC.impl.FileProducerImpl <em>File Producer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.configECIC.impl.FileProducerImpl
	 * @see ucof.communication.configECIC.impl.ConfigECICPackageImpl#getFileProducer()
	 * @generated
	 */
	int FILE_PRODUCER = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PRODUCER__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PRODUCER__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PRODUCER__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PRODUCER__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PRODUCER__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PRODUCER__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PRODUCER__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PRODUCER__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PRODUCER__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>File Producer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PRODUCER_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>File Producer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PRODUCER_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.configECIC.impl.ChannelsImpl <em>Channels</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.configECIC.impl.ChannelsImpl
	 * @see ucof.communication.configECIC.impl.ConfigECICPackageImpl#getChannels()
	 * @generated
	 */
	int CHANNELS = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELS__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELS__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELS__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELS__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELS__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELS__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELS__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELS__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELS__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELS__CHANNEL = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Channels</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELS_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Channels</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELS_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.configECIC.impl.ChannelImpl <em>Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.configECIC.impl.ChannelImpl
	 * @see ucof.communication.configECIC.impl.ConfigECICPackageImpl#getChannel()
	 * @generated
	 */
	int CHANNEL = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Frame Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__FRAME_FORMAT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Com Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__COM_INTERFACE = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__HEADER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Stream</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__STREAM = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.configECIC.impl.ComInterfaceImpl <em>Com Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.configECIC.impl.ComInterfaceImpl
	 * @see ucof.communication.configECIC.impl.ConfigECICPackageImpl#getComInterface()
	 * @generated
	 */
	int COM_INTERFACE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_INTERFACE__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_INTERFACE__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_INTERFACE__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_INTERFACE__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_INTERFACE__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_INTERFACE__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_INTERFACE__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_INTERFACE__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_INTERFACE__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Udp Sockets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_INTERFACE__UDP_SOCKETS = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Com Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_INTERFACE_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Com Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_INTERFACE_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.configECIC.impl.UDPSocketsImpl <em>UDP Sockets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.configECIC.impl.UDPSocketsImpl
	 * @see ucof.communication.configECIC.impl.ConfigECICPackageImpl#getUDPSockets()
	 * @generated
	 */
	int UDP_SOCKETS = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKETS__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKETS__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKETS__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKETS__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKETS__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKETS__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKETS__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKETS__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKETS__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Udp Socket</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKETS__UDP_SOCKET = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>UDP Sockets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKETS_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>UDP Sockets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKETS_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.configECIC.impl.UDPSocketImpl <em>UDP Socket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.configECIC.impl.UDPSocketImpl
	 * @see ucof.communication.configECIC.impl.ConfigECICPackageImpl#getUDPSocket()
	 * @generated
	 */
	int UDP_SOCKET = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKET__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKET__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKET__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKET__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKET__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKET__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKET__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKET__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKET__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Multicast Interface IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKET__MULTICAST_INTERFACE_IP = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Multicast TTL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKET__MULTICAST_TTL = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Src Direction Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKET__SRC_DIRECTION_EXTENSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKET__DIRECTION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Ip Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKET__IP_ADRESS = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKET__PORT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>UDP Socket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKET_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>UDP Socket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_SOCKET_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.configECIC.impl.srcDirectionExtensionImpl <em>src Direction Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.configECIC.impl.srcDirectionExtensionImpl
	 * @see ucof.communication.configECIC.impl.ConfigECICPackageImpl#getsrcDirectionExtension()
	 * @generated
	 */
	int SRC_DIRECTION_EXTENSION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_DIRECTION_EXTENSION__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_DIRECTION_EXTENSION__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_DIRECTION_EXTENSION__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_DIRECTION_EXTENSION__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_DIRECTION_EXTENSION__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_DIRECTION_EXTENSION__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_DIRECTION_EXTENSION__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_DIRECTION_EXTENSION__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_DIRECTION_EXTENSION__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Ip Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_DIRECTION_EXTENSION__IP_ADRESS = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_DIRECTION_EXTENSION__PORT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>src Direction Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_DIRECTION_EXTENSION_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>src Direction Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_DIRECTION_EXTENSION_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.configECIC.impl.HeaderImpl <em>Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.configECIC.impl.HeaderImpl
	 * @see ucof.communication.configECIC.impl.ConfigECICPackageImpl#getHeader()
	 * @generated
	 */
	int HEADER = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__ENABLE = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Transport Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__TRANSPORT_TIMESTAMP = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.configECIC.StandardRevisionType <em>Standard Revision Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.configECIC.StandardRevisionType
	 * @see ucof.communication.configECIC.impl.ConfigECICPackageImpl#getStandardRevisionType()
	 * @generated
	 */
	int STANDARD_REVISION_TYPE = 10;

	/**
	 * The meta object id for the '{@link ucof.communication.configECIC.ComponentTypeType <em>Component Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.configECIC.ComponentTypeType
	 * @see ucof.communication.configECIC.impl.ConfigECICPackageImpl#getComponentTypeType()
	 * @generated
	 */
	int COMPONENT_TYPE_TYPE = 11;


	/**
	 * Returns the meta object for class '{@link ucof.communication.configECIC.ED247Configurations <em>ED247 Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ED247 Configurations</em>'.
	 * @see ucof.communication.configECIC.ED247Configurations
	 * @generated
	 */
	EClass getED247Configurations();

	/**
	 * Returns the meta object for the containment reference list '{@link ucof.communication.configECIC.ED247Configurations#getEd247Configuration <em>Ed247 Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ed247 Configuration</em>'.
	 * @see ucof.communication.configECIC.ED247Configurations#getEd247Configuration()
	 * @see #getED247Configurations()
	 * @generated
	 */
	EReference getED247Configurations_Ed247Configuration();

	/**
	 * Returns the meta object for class '{@link ucof.communication.configECIC.ED247Configuration <em>ED247 Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ED247 Configuration</em>'.
	 * @see ucof.communication.configECIC.ED247Configuration
	 * @generated
	 */
	EClass getED247Configuration();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.ED247Configuration#getStandardRevision <em>Standard Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Revision</em>'.
	 * @see ucof.communication.configECIC.ED247Configuration#getStandardRevision()
	 * @see #getED247Configuration()
	 * @generated
	 */
	EAttribute getED247Configuration_StandardRevision();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.ED247Configuration#getComponentVersion <em>Component Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Version</em>'.
	 * @see ucof.communication.configECIC.ED247Configuration#getComponentVersion()
	 * @see #getED247Configuration()
	 * @generated
	 */
	EAttribute getED247Configuration_ComponentVersion();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.ED247Configuration#getComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Type</em>'.
	 * @see ucof.communication.configECIC.ED247Configuration#getComponentType()
	 * @see #getED247Configuration()
	 * @generated
	 */
	EAttribute getED247Configuration_ComponentType();

	/**
	 * Returns the meta object for the containment reference '{@link ucof.communication.configECIC.ED247Configuration#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Channels</em>'.
	 * @see ucof.communication.configECIC.ED247Configuration#getChannels()
	 * @see #getED247Configuration()
	 * @generated
	 */
	EReference getED247Configuration_Channels();

	/**
	 * Returns the meta object for the containment reference '{@link ucof.communication.configECIC.ED247Configuration#getFileProducer <em>File Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File Producer</em>'.
	 * @see ucof.communication.configECIC.ED247Configuration#getFileProducer()
	 * @see #getED247Configuration()
	 * @generated
	 */
	EReference getED247Configuration_FileProducer();

	/**
	 * Returns the meta object for class '{@link ucof.communication.configECIC.FileProducer <em>File Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Producer</em>'.
	 * @see ucof.communication.configECIC.FileProducer
	 * @generated
	 */
	EClass getFileProducer();

	/**
	 * Returns the meta object for class '{@link ucof.communication.configECIC.Channels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channels</em>'.
	 * @see ucof.communication.configECIC.Channels
	 * @generated
	 */
	EClass getChannels();

	/**
	 * Returns the meta object for the containment reference list '{@link ucof.communication.configECIC.Channels#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Channel</em>'.
	 * @see ucof.communication.configECIC.Channels#getChannel()
	 * @see #getChannels()
	 * @generated
	 */
	EReference getChannels_Channel();

	/**
	 * Returns the meta object for class '{@link ucof.communication.configECIC.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel</em>'.
	 * @see ucof.communication.configECIC.Channel
	 * @generated
	 */
	EClass getChannel();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.Channel#getFrameFormat <em>Frame Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frame Format</em>'.
	 * @see ucof.communication.configECIC.Channel#getFrameFormat()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_FrameFormat();

	/**
	 * Returns the meta object for the containment reference '{@link ucof.communication.configECIC.Channel#getComInterface <em>Com Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Com Interface</em>'.
	 * @see ucof.communication.configECIC.Channel#getComInterface()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_ComInterface();

	/**
	 * Returns the meta object for the containment reference '{@link ucof.communication.configECIC.Channel#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see ucof.communication.configECIC.Channel#getHeader()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Header();

	/**
	 * Returns the meta object for the containment reference list '{@link ucof.communication.configECIC.Channel#getStream <em>Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stream</em>'.
	 * @see ucof.communication.configECIC.Channel#getStream()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Stream();

	/**
	 * Returns the meta object for class '{@link ucof.communication.configECIC.ComInterface <em>Com Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Interface</em>'.
	 * @see ucof.communication.configECIC.ComInterface
	 * @generated
	 */
	EClass getComInterface();

	/**
	 * Returns the meta object for the containment reference '{@link ucof.communication.configECIC.ComInterface#getUdpSockets <em>Udp Sockets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Udp Sockets</em>'.
	 * @see ucof.communication.configECIC.ComInterface#getUdpSockets()
	 * @see #getComInterface()
	 * @generated
	 */
	EReference getComInterface_UdpSockets();

	/**
	 * Returns the meta object for class '{@link ucof.communication.configECIC.UDPSockets <em>UDP Sockets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UDP Sockets</em>'.
	 * @see ucof.communication.configECIC.UDPSockets
	 * @generated
	 */
	EClass getUDPSockets();

	/**
	 * Returns the meta object for the containment reference list '{@link ucof.communication.configECIC.UDPSockets#getUdpSocket <em>Udp Socket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Udp Socket</em>'.
	 * @see ucof.communication.configECIC.UDPSockets#getUdpSocket()
	 * @see #getUDPSockets()
	 * @generated
	 */
	EReference getUDPSockets_UdpSocket();

	/**
	 * Returns the meta object for class '{@link ucof.communication.configECIC.UDPSocket <em>UDP Socket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UDP Socket</em>'.
	 * @see ucof.communication.configECIC.UDPSocket
	 * @generated
	 */
	EClass getUDPSocket();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.UDPSocket#getMulticastInterfaceIP <em>Multicast Interface IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multicast Interface IP</em>'.
	 * @see ucof.communication.configECIC.UDPSocket#getMulticastInterfaceIP()
	 * @see #getUDPSocket()
	 * @generated
	 */
	EAttribute getUDPSocket_MulticastInterfaceIP();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.UDPSocket#getMulticastTTL <em>Multicast TTL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multicast TTL</em>'.
	 * @see ucof.communication.configECIC.UDPSocket#getMulticastTTL()
	 * @see #getUDPSocket()
	 * @generated
	 */
	EAttribute getUDPSocket_MulticastTTL();

	/**
	 * Returns the meta object for the containment reference list '{@link ucof.communication.configECIC.UDPSocket#getSrcDirectionExtension <em>Src Direction Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Src Direction Extension</em>'.
	 * @see ucof.communication.configECIC.UDPSocket#getSrcDirectionExtension()
	 * @see #getUDPSocket()
	 * @generated
	 */
	EReference getUDPSocket_SrcDirectionExtension();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.UDPSocket#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see ucof.communication.configECIC.UDPSocket#getDirection()
	 * @see #getUDPSocket()
	 * @generated
	 */
	EAttribute getUDPSocket_Direction();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.UDPSocket#getIpAdress <em>Ip Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip Adress</em>'.
	 * @see ucof.communication.configECIC.UDPSocket#getIpAdress()
	 * @see #getUDPSocket()
	 * @generated
	 */
	EAttribute getUDPSocket_IpAdress();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.UDPSocket#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see ucof.communication.configECIC.UDPSocket#getPort()
	 * @see #getUDPSocket()
	 * @generated
	 */
	EAttribute getUDPSocket_Port();

	/**
	 * Returns the meta object for class '{@link ucof.communication.configECIC.srcDirectionExtension <em>src Direction Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>src Direction Extension</em>'.
	 * @see ucof.communication.configECIC.srcDirectionExtension
	 * @generated
	 */
	EClass getsrcDirectionExtension();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.srcDirectionExtension#getIpAdress <em>Ip Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip Adress</em>'.
	 * @see ucof.communication.configECIC.srcDirectionExtension#getIpAdress()
	 * @see #getsrcDirectionExtension()
	 * @generated
	 */
	EAttribute getsrcDirectionExtension_IpAdress();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.srcDirectionExtension#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see ucof.communication.configECIC.srcDirectionExtension#getPort()
	 * @see #getsrcDirectionExtension()
	 * @generated
	 */
	EAttribute getsrcDirectionExtension_Port();

	/**
	 * Returns the meta object for class '{@link ucof.communication.configECIC.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header</em>'.
	 * @see ucof.communication.configECIC.Header
	 * @generated
	 */
	EClass getHeader();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.Header#getEnable <em>Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable</em>'.
	 * @see ucof.communication.configECIC.Header#getEnable()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Enable();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.Header#getTransportTimestamp <em>Transport Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transport Timestamp</em>'.
	 * @see ucof.communication.configECIC.Header#getTransportTimestamp()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_TransportTimestamp();

	/**
	 * Returns the meta object for enum '{@link ucof.communication.configECIC.StandardRevisionType <em>Standard Revision Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Standard Revision Type</em>'.
	 * @see ucof.communication.configECIC.StandardRevisionType
	 * @generated
	 */
	EEnum getStandardRevisionType();

	/**
	 * Returns the meta object for enum '{@link ucof.communication.configECIC.ComponentTypeType <em>Component Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Component Type Type</em>'.
	 * @see ucof.communication.configECIC.ComponentTypeType
	 * @generated
	 */
	EEnum getComponentTypeType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfigECICFactory getConfigECICFactory();

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
		 * The meta object literal for the '{@link ucof.communication.configECIC.impl.ED247ConfigurationsImpl <em>ED247 Configurations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.configECIC.impl.ED247ConfigurationsImpl
		 * @see ucof.communication.configECIC.impl.ConfigECICPackageImpl#getED247Configurations()
		 * @generated
		 */
		EClass ED247_CONFIGURATIONS = eINSTANCE.getED247Configurations();

		/**
		 * The meta object literal for the '<em><b>Ed247 Configuration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ED247_CONFIGURATIONS__ED247_CONFIGURATION = eINSTANCE.getED247Configurations_Ed247Configuration();

		/**
		 * The meta object literal for the '{@link ucof.communication.configECIC.impl.ED247ConfigurationImpl <em>ED247 Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.configECIC.impl.ED247ConfigurationImpl
		 * @see ucof.communication.configECIC.impl.ConfigECICPackageImpl#getED247Configuration()
		 * @generated
		 */
		EClass ED247_CONFIGURATION = eINSTANCE.getED247Configuration();

		/**
		 * The meta object literal for the '<em><b>Standard Revision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ED247_CONFIGURATION__STANDARD_REVISION = eINSTANCE.getED247Configuration_StandardRevision();

		/**
		 * The meta object literal for the '<em><b>Component Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ED247_CONFIGURATION__COMPONENT_VERSION = eINSTANCE.getED247Configuration_ComponentVersion();

		/**
		 * The meta object literal for the '<em><b>Component Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ED247_CONFIGURATION__COMPONENT_TYPE = eINSTANCE.getED247Configuration_ComponentType();

		/**
		 * The meta object literal for the '<em><b>Channels</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ED247_CONFIGURATION__CHANNELS = eINSTANCE.getED247Configuration_Channels();

		/**
		 * The meta object literal for the '<em><b>File Producer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ED247_CONFIGURATION__FILE_PRODUCER = eINSTANCE.getED247Configuration_FileProducer();

		/**
		 * The meta object literal for the '{@link ucof.communication.configECIC.impl.FileProducerImpl <em>File Producer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.configECIC.impl.FileProducerImpl
		 * @see ucof.communication.configECIC.impl.ConfigECICPackageImpl#getFileProducer()
		 * @generated
		 */
		EClass FILE_PRODUCER = eINSTANCE.getFileProducer();

		/**
		 * The meta object literal for the '{@link ucof.communication.configECIC.impl.ChannelsImpl <em>Channels</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.configECIC.impl.ChannelsImpl
		 * @see ucof.communication.configECIC.impl.ConfigECICPackageImpl#getChannels()
		 * @generated
		 */
		EClass CHANNELS = eINSTANCE.getChannels();

		/**
		 * The meta object literal for the '<em><b>Channel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNELS__CHANNEL = eINSTANCE.getChannels_Channel();

		/**
		 * The meta object literal for the '{@link ucof.communication.configECIC.impl.ChannelImpl <em>Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.configECIC.impl.ChannelImpl
		 * @see ucof.communication.configECIC.impl.ConfigECICPackageImpl#getChannel()
		 * @generated
		 */
		EClass CHANNEL = eINSTANCE.getChannel();

		/**
		 * The meta object literal for the '<em><b>Frame Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL__FRAME_FORMAT = eINSTANCE.getChannel_FrameFormat();

		/**
		 * The meta object literal for the '<em><b>Com Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__COM_INTERFACE = eINSTANCE.getChannel_ComInterface();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__HEADER = eINSTANCE.getChannel_Header();

		/**
		 * The meta object literal for the '<em><b>Stream</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__STREAM = eINSTANCE.getChannel_Stream();

		/**
		 * The meta object literal for the '{@link ucof.communication.configECIC.impl.ComInterfaceImpl <em>Com Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.configECIC.impl.ComInterfaceImpl
		 * @see ucof.communication.configECIC.impl.ConfigECICPackageImpl#getComInterface()
		 * @generated
		 */
		EClass COM_INTERFACE = eINSTANCE.getComInterface();

		/**
		 * The meta object literal for the '<em><b>Udp Sockets</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_INTERFACE__UDP_SOCKETS = eINSTANCE.getComInterface_UdpSockets();

		/**
		 * The meta object literal for the '{@link ucof.communication.configECIC.impl.UDPSocketsImpl <em>UDP Sockets</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.configECIC.impl.UDPSocketsImpl
		 * @see ucof.communication.configECIC.impl.ConfigECICPackageImpl#getUDPSockets()
		 * @generated
		 */
		EClass UDP_SOCKETS = eINSTANCE.getUDPSockets();

		/**
		 * The meta object literal for the '<em><b>Udp Socket</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UDP_SOCKETS__UDP_SOCKET = eINSTANCE.getUDPSockets_UdpSocket();

		/**
		 * The meta object literal for the '{@link ucof.communication.configECIC.impl.UDPSocketImpl <em>UDP Socket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.configECIC.impl.UDPSocketImpl
		 * @see ucof.communication.configECIC.impl.ConfigECICPackageImpl#getUDPSocket()
		 * @generated
		 */
		EClass UDP_SOCKET = eINSTANCE.getUDPSocket();

		/**
		 * The meta object literal for the '<em><b>Multicast Interface IP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UDP_SOCKET__MULTICAST_INTERFACE_IP = eINSTANCE.getUDPSocket_MulticastInterfaceIP();

		/**
		 * The meta object literal for the '<em><b>Multicast TTL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UDP_SOCKET__MULTICAST_TTL = eINSTANCE.getUDPSocket_MulticastTTL();

		/**
		 * The meta object literal for the '<em><b>Src Direction Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UDP_SOCKET__SRC_DIRECTION_EXTENSION = eINSTANCE.getUDPSocket_SrcDirectionExtension();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UDP_SOCKET__DIRECTION = eINSTANCE.getUDPSocket_Direction();

		/**
		 * The meta object literal for the '<em><b>Ip Adress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UDP_SOCKET__IP_ADRESS = eINSTANCE.getUDPSocket_IpAdress();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UDP_SOCKET__PORT = eINSTANCE.getUDPSocket_Port();

		/**
		 * The meta object literal for the '{@link ucof.communication.configECIC.impl.srcDirectionExtensionImpl <em>src Direction Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.configECIC.impl.srcDirectionExtensionImpl
		 * @see ucof.communication.configECIC.impl.ConfigECICPackageImpl#getsrcDirectionExtension()
		 * @generated
		 */
		EClass SRC_DIRECTION_EXTENSION = eINSTANCE.getsrcDirectionExtension();

		/**
		 * The meta object literal for the '<em><b>Ip Adress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_DIRECTION_EXTENSION__IP_ADRESS = eINSTANCE.getsrcDirectionExtension_IpAdress();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_DIRECTION_EXTENSION__PORT = eINSTANCE.getsrcDirectionExtension_Port();

		/**
		 * The meta object literal for the '{@link ucof.communication.configECIC.impl.HeaderImpl <em>Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.configECIC.impl.HeaderImpl
		 * @see ucof.communication.configECIC.impl.ConfigECICPackageImpl#getHeader()
		 * @generated
		 */
		EClass HEADER = eINSTANCE.getHeader();

		/**
		 * The meta object literal for the '<em><b>Enable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__ENABLE = eINSTANCE.getHeader_Enable();

		/**
		 * The meta object literal for the '<em><b>Transport Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__TRANSPORT_TIMESTAMP = eINSTANCE.getHeader_TransportTimestamp();

		/**
		 * The meta object literal for the '{@link ucof.communication.configECIC.StandardRevisionType <em>Standard Revision Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.configECIC.StandardRevisionType
		 * @see ucof.communication.configECIC.impl.ConfigECICPackageImpl#getStandardRevisionType()
		 * @generated
		 */
		EEnum STANDARD_REVISION_TYPE = eINSTANCE.getStandardRevisionType();

		/**
		 * The meta object literal for the '{@link ucof.communication.configECIC.ComponentTypeType <em>Component Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.configECIC.ComponentTypeType
		 * @see ucof.communication.configECIC.impl.ConfigECICPackageImpl#getComponentTypeType()
		 * @generated
		 */
		EEnum COMPONENT_TYPE_TYPE = eINSTANCE.getComponentTypeType();

	}

} //ConfigECICPackage
