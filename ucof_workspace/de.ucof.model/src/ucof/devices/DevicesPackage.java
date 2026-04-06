/**
 */
package ucof.devices;

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
 * Contains all information regarding device configuration. Implementation of this configuration can be either virtual or hardware-based, depending on target systems.
 * <!-- end-model-doc -->
 * @see ucof.devices.DevicesFactory
 * @model kind="package"
 * @generated
 */
public interface DevicesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "devices";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://gitlab.com/ucof/ucof.de/model/v001/ucof/devices";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ucof.model.devices";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DevicesPackage eINSTANCE = ucof.devices.impl.DevicesPackageImpl.init();

	/**
	 * The meta object id for the '{@link ucof.devices.impl.DevicesImpl <em>Devices</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.impl.DevicesImpl
	 * @see ucof.devices.impl.DevicesPackageImpl#getDevices()
	 * @generated
	 */
	int DEVICES = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICES__DOCUMENTATION = EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICES__MODIFIED = EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICES__MODIFIER = EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICES__TRACE_LINK = EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICES__CREATED = EtypesPackage.SUPER_TRACKING_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICES__CREATOR = EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICES__VERSION = EtypesPackage.SUPER_TRACKING_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICES__ID = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICES__NAME = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Device</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICES__DEVICE = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Devices</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICES_FEATURE_COUNT = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Devices</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICES_OPERATION_COUNT = EtypesPackage.SUPER_TRACKING_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.devices.impl.SuperPlatformDeviceTypeImpl <em>Super Platform Device Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.impl.SuperPlatformDeviceTypeImpl
	 * @see ucof.devices.impl.DevicesPackageImpl#getSuperPlatformDeviceType()
	 * @generated
	 */
	int SUPER_PLATFORM_DEVICE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PLATFORM_DEVICE_TYPE__ID = EtypesPackage.SUPER_DEVICE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PLATFORM_DEVICE_TYPE__NAME = EtypesPackage.SUPER_DEVICE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PLATFORM_DEVICE_TYPE__DOCUMENTATION = EtypesPackage.SUPER_DEVICE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PLATFORM_DEVICE_TYPE__MODIFIED = EtypesPackage.SUPER_DEVICE_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PLATFORM_DEVICE_TYPE__MODIFIER = EtypesPackage.SUPER_DEVICE_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PLATFORM_DEVICE_TYPE__TRACE_LINK = EtypesPackage.SUPER_DEVICE_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PLATFORM_DEVICE_TYPE__CREATED = EtypesPackage.SUPER_DEVICE_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PLATFORM_DEVICE_TYPE__CREATOR = EtypesPackage.SUPER_DEVICE_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PLATFORM_DEVICE_TYPE__VERSION = EtypesPackage.SUPER_DEVICE_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Configuration Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PLATFORM_DEVICE_TYPE__CONFIGURATION_LINK = EtypesPackage.SUPER_DEVICE_TYPE__CONFIGURATION_LINK;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PLATFORM_DEVICE_TYPE__PORTS = EtypesPackage.SUPER_DEVICE_TYPE__PORTS;

	/**
	 * The feature id for the '<em><b>Device Functions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PLATFORM_DEVICE_TYPE__DEVICE_FUNCTIONS = EtypesPackage.SUPER_DEVICE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implementation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PLATFORM_DEVICE_TYPE__IMPLEMENTATION_TYPE = EtypesPackage.SUPER_DEVICE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Super Platform Device Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PLATFORM_DEVICE_TYPE_FEATURE_COUNT = EtypesPackage.SUPER_DEVICE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Super Platform Device Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PLATFORM_DEVICE_TYPE_OPERATION_COUNT = EtypesPackage.SUPER_DEVICE_TYPE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link ucof.devices.Devices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Devices</em>'.
	 * @see ucof.devices.Devices
	 * @generated
	 */
	EClass getDevices();

	/**
	 * Returns the meta object for the containment reference list '{@link ucof.devices.Devices#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Device</em>'.
	 * @see ucof.devices.Devices#getDevice()
	 * @see #getDevices()
	 * @generated
	 */
	EReference getDevices_Device();

	/**
	 * Returns the meta object for class '{@link ucof.devices.SuperPlatformDeviceType <em>Super Platform Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Platform Device Type</em>'.
	 * @see ucof.devices.SuperPlatformDeviceType
	 * @generated
	 */
	EClass getSuperPlatformDeviceType();

	/**
	 * Returns the meta object for the containment reference '{@link ucof.devices.SuperPlatformDeviceType#getDeviceFunctions <em>Device Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Functions</em>'.
	 * @see ucof.devices.SuperPlatformDeviceType#getDeviceFunctions()
	 * @see #getSuperPlatformDeviceType()
	 * @generated
	 */
	EReference getSuperPlatformDeviceType_DeviceFunctions();

	/**
	 * Returns the meta object for the attribute '{@link ucof.devices.SuperPlatformDeviceType#getImplementationType <em>Implementation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation Type</em>'.
	 * @see ucof.devices.SuperPlatformDeviceType#getImplementationType()
	 * @see #getSuperPlatformDeviceType()
	 * @generated
	 */
	EAttribute getSuperPlatformDeviceType_ImplementationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DevicesFactory getDevicesFactory();

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
		 * The meta object literal for the '{@link ucof.devices.impl.DevicesImpl <em>Devices</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.impl.DevicesImpl
		 * @see ucof.devices.impl.DevicesPackageImpl#getDevices()
		 * @generated
		 */
		EClass DEVICES = eINSTANCE.getDevices();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICES__DEVICE = eINSTANCE.getDevices_Device();

		/**
		 * The meta object literal for the '{@link ucof.devices.impl.SuperPlatformDeviceTypeImpl <em>Super Platform Device Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.impl.SuperPlatformDeviceTypeImpl
		 * @see ucof.devices.impl.DevicesPackageImpl#getSuperPlatformDeviceType()
		 * @generated
		 */
		EClass SUPER_PLATFORM_DEVICE_TYPE = eINSTANCE.getSuperPlatformDeviceType();

		/**
		 * The meta object literal for the '<em><b>Device Functions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_PLATFORM_DEVICE_TYPE__DEVICE_FUNCTIONS = eINSTANCE.getSuperPlatformDeviceType_DeviceFunctions();

		/**
		 * The meta object literal for the '<em><b>Implementation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_PLATFORM_DEVICE_TYPE__IMPLEMENTATION_TYPE = eINSTANCE.getSuperPlatformDeviceType_ImplementationType();

	}

} //DevicesPackage
