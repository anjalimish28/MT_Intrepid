/**
 */
package ucof.communication.comDevices;

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
 * @see ucof.communication.comDevices.ComDevicesFactory
 * @model kind="package"
 * @generated
 */
public interface ComDevicesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "comDevices";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://gitlab.com/ucof/ucof.de/model/v001/ucof/communication/comDevices";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ucof.model.communication.comDevices";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComDevicesPackage eINSTANCE = ucof.communication.comDevices.impl.ComDevicesPackageImpl.init();

	/**
	 * The meta object id for the '{@link ucof.communication.comDevices.impl.CommunicationDevicesImpl <em>Communication Devices</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.comDevices.impl.CommunicationDevicesImpl
	 * @see ucof.communication.comDevices.impl.ComDevicesPackageImpl#getCommunicationDevices()
	 * @generated
	 */
	int COMMUNICATION_DEVICES = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_DEVICES__ID = EtypesPackage.SUPER_SET_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_DEVICES__NAME = EtypesPackage.SUPER_SET_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_DEVICES__DOCUMENTATION = EtypesPackage.SUPER_SET_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_DEVICES__MODIFIED = EtypesPackage.SUPER_SET_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_DEVICES__MODIFIER = EtypesPackage.SUPER_SET_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_DEVICES__TRACE_LINK = EtypesPackage.SUPER_SET_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_DEVICES__CREATED = EtypesPackage.SUPER_SET_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_DEVICES__CREATOR = EtypesPackage.SUPER_SET_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_DEVICES__VERSION = EtypesPackage.SUPER_SET_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Setname</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_DEVICES__SETNAME = EtypesPackage.SUPER_SET_TYPE__SETNAME;

	/**
	 * The feature id for the '<em><b>Communication Device</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_DEVICES__COMMUNICATION_DEVICE = EtypesPackage.SUPER_SET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Communication Devices</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_DEVICES_FEATURE_COUNT = EtypesPackage.SUPER_SET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Communication Devices</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_DEVICES_OPERATION_COUNT = EtypesPackage.SUPER_SET_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.comDevices.impl.SuperCommunicationDeviceTypeImpl <em>Super Communication Device Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.comDevices.impl.SuperCommunicationDeviceTypeImpl
	 * @see ucof.communication.comDevices.impl.ComDevicesPackageImpl#getSuperCommunicationDeviceType()
	 * @generated
	 */
	int SUPER_COMMUNICATION_DEVICE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_COMMUNICATION_DEVICE_TYPE__ID = EtypesPackage.SUPER_DEVICE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_COMMUNICATION_DEVICE_TYPE__NAME = EtypesPackage.SUPER_DEVICE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_COMMUNICATION_DEVICE_TYPE__DOCUMENTATION = EtypesPackage.SUPER_DEVICE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_COMMUNICATION_DEVICE_TYPE__MODIFIED = EtypesPackage.SUPER_DEVICE_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_COMMUNICATION_DEVICE_TYPE__MODIFIER = EtypesPackage.SUPER_DEVICE_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_COMMUNICATION_DEVICE_TYPE__TRACE_LINK = EtypesPackage.SUPER_DEVICE_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_COMMUNICATION_DEVICE_TYPE__CREATED = EtypesPackage.SUPER_DEVICE_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_COMMUNICATION_DEVICE_TYPE__CREATOR = EtypesPackage.SUPER_DEVICE_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_COMMUNICATION_DEVICE_TYPE__VERSION = EtypesPackage.SUPER_DEVICE_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Configuration Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_COMMUNICATION_DEVICE_TYPE__CONFIGURATION_LINK = EtypesPackage.SUPER_DEVICE_TYPE__CONFIGURATION_LINK;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_COMMUNICATION_DEVICE_TYPE__PORTS = EtypesPackage.SUPER_DEVICE_TYPE__PORTS;

	/**
	 * The number of structural features of the '<em>Super Communication Device Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_COMMUNICATION_DEVICE_TYPE_FEATURE_COUNT = EtypesPackage.SUPER_DEVICE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Super Communication Device Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_COMMUNICATION_DEVICE_TYPE_OPERATION_COUNT = EtypesPackage.SUPER_DEVICE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.comDevices.impl.ED247GatewayImpl <em>ED247 Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.comDevices.impl.ED247GatewayImpl
	 * @see ucof.communication.comDevices.impl.ComDevicesPackageImpl#getED247Gateway()
	 * @generated
	 */
	int ED247_GATEWAY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_GATEWAY__ID = SUPER_COMMUNICATION_DEVICE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_GATEWAY__NAME = SUPER_COMMUNICATION_DEVICE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_GATEWAY__DOCUMENTATION = SUPER_COMMUNICATION_DEVICE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_GATEWAY__MODIFIED = SUPER_COMMUNICATION_DEVICE_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_GATEWAY__MODIFIER = SUPER_COMMUNICATION_DEVICE_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_GATEWAY__TRACE_LINK = SUPER_COMMUNICATION_DEVICE_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_GATEWAY__CREATED = SUPER_COMMUNICATION_DEVICE_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_GATEWAY__CREATOR = SUPER_COMMUNICATION_DEVICE_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_GATEWAY__VERSION = SUPER_COMMUNICATION_DEVICE_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Configuration Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_GATEWAY__CONFIGURATION_LINK = SUPER_COMMUNICATION_DEVICE_TYPE__CONFIGURATION_LINK;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_GATEWAY__PORTS = SUPER_COMMUNICATION_DEVICE_TYPE__PORTS;

	/**
	 * The number of structural features of the '<em>ED247 Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_GATEWAY_FEATURE_COUNT = SUPER_COMMUNICATION_DEVICE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ED247 Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ED247_GATEWAY_OPERATION_COUNT = SUPER_COMMUNICATION_DEVICE_TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ucof.communication.comDevices.CommunicationDevices <em>Communication Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Devices</em>'.
	 * @see ucof.communication.comDevices.CommunicationDevices
	 * @generated
	 */
	EClass getCommunicationDevices();

	/**
	 * Returns the meta object for the containment reference list '{@link ucof.communication.comDevices.CommunicationDevices#getCommunicationDevice <em>Communication Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Communication Device</em>'.
	 * @see ucof.communication.comDevices.CommunicationDevices#getCommunicationDevice()
	 * @see #getCommunicationDevices()
	 * @generated
	 */
	EReference getCommunicationDevices_CommunicationDevice();

	/**
	 * Returns the meta object for class '{@link ucof.communication.comDevices.SuperCommunicationDeviceType <em>Super Communication Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Communication Device Type</em>'.
	 * @see ucof.communication.comDevices.SuperCommunicationDeviceType
	 * @generated
	 */
	EClass getSuperCommunicationDeviceType();

	/**
	 * Returns the meta object for class '{@link ucof.communication.comDevices.ED247Gateway <em>ED247 Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ED247 Gateway</em>'.
	 * @see ucof.communication.comDevices.ED247Gateway
	 * @generated
	 */
	EClass getED247Gateway();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComDevicesFactory getComDevicesFactory();

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
		 * The meta object literal for the '{@link ucof.communication.comDevices.impl.CommunicationDevicesImpl <em>Communication Devices</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.comDevices.impl.CommunicationDevicesImpl
		 * @see ucof.communication.comDevices.impl.ComDevicesPackageImpl#getCommunicationDevices()
		 * @generated
		 */
		EClass COMMUNICATION_DEVICES = eINSTANCE.getCommunicationDevices();

		/**
		 * The meta object literal for the '<em><b>Communication Device</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_DEVICES__COMMUNICATION_DEVICE = eINSTANCE.getCommunicationDevices_CommunicationDevice();

		/**
		 * The meta object literal for the '{@link ucof.communication.comDevices.impl.SuperCommunicationDeviceTypeImpl <em>Super Communication Device Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.comDevices.impl.SuperCommunicationDeviceTypeImpl
		 * @see ucof.communication.comDevices.impl.ComDevicesPackageImpl#getSuperCommunicationDeviceType()
		 * @generated
		 */
		EClass SUPER_COMMUNICATION_DEVICE_TYPE = eINSTANCE.getSuperCommunicationDeviceType();

		/**
		 * The meta object literal for the '{@link ucof.communication.comDevices.impl.ED247GatewayImpl <em>ED247 Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.comDevices.impl.ED247GatewayImpl
		 * @see ucof.communication.comDevices.impl.ComDevicesPackageImpl#getED247Gateway()
		 * @generated
		 */
		EClass ED247_GATEWAY = eINSTANCE.getED247Gateway();

	}

} //ComDevicesPackage
