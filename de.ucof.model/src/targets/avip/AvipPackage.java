/**
 */
package targets.avip;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see targets.avip.AvipFactory
 * @model kind="package"
 * @generated
 */
public interface AvipPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "avip";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://gitlab.com/ucof/ucof.de/model/v001/ucof/targets/avip";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ucof.model.targets.avip";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AvipPackage eINSTANCE = targets.avip.impl.AvipPackageImpl.init();

	/**
	 * The meta object id for the '{@link targets.avip.impl.AvionicsVirtualDeviceImpl <em>Avionics Virtual Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.avip.impl.AvionicsVirtualDeviceImpl
	 * @see targets.avip.impl.AvipPackageImpl#getAvionicsVirtualDevice()
	 * @generated
	 */
	int AVIONICS_VIRTUAL_DEVICE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVIONICS_VIRTUAL_DEVICE__ID = TargetsPackage.SUPER_TARGET_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVIONICS_VIRTUAL_DEVICE__NAME = TargetsPackage.SUPER_TARGET_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVIONICS_VIRTUAL_DEVICE__DOCUMENTATION = TargetsPackage.SUPER_TARGET_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVIONICS_VIRTUAL_DEVICE__MODIFIED = TargetsPackage.SUPER_TARGET_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVIONICS_VIRTUAL_DEVICE__MODIFIER = TargetsPackage.SUPER_TARGET_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVIONICS_VIRTUAL_DEVICE__TRACE_LINK = TargetsPackage.SUPER_TARGET_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVIONICS_VIRTUAL_DEVICE__CREATED = TargetsPackage.SUPER_TARGET_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVIONICS_VIRTUAL_DEVICE__CREATOR = TargetsPackage.SUPER_TARGET_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVIONICS_VIRTUAL_DEVICE__VERSION = TargetsPackage.SUPER_TARGET_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVIONICS_VIRTUAL_DEVICE__PROJECT_NAME = TargetsPackage.SUPER_TARGET_TYPE__PROJECT_NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVIONICS_VIRTUAL_DEVICE__PORTS = TargetsPackage.SUPER_TARGET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schedule Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVIONICS_VIRTUAL_DEVICE__SCHEDULE_EXTENSION = TargetsPackage.SUPER_TARGET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Avionics Virtual Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVIONICS_VIRTUAL_DEVICE_FEATURE_COUNT = TargetsPackage.SUPER_TARGET_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Avionics Virtual Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVIONICS_VIRTUAL_DEVICE_OPERATION_COUNT = TargetsPackage.SUPER_TARGET_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.avip.impl.AVDPortsImpl <em>AVD Ports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.avip.impl.AVDPortsImpl
	 * @see targets.avip.impl.AvipPackageImpl#getAVDPorts()
	 * @generated
	 */
	int AVD_PORTS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVD_PORTS__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVD_PORTS__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVD_PORTS__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVD_PORTS__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVD_PORTS__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVD_PORTS__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVD_PORTS__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVD_PORTS__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVD_PORTS__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVD_PORTS__PORT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>AVD Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVD_PORTS_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>AVD Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVD_PORTS_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.avip.impl.SuperAVDPortTypeImpl <em>Super AVD Port Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.avip.impl.SuperAVDPortTypeImpl
	 * @see targets.avip.impl.AvipPackageImpl#getSuperAVDPortType()
	 * @generated
	 */
	int SUPER_AVD_PORT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_AVD_PORT_TYPE__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_AVD_PORT_TYPE__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_AVD_PORT_TYPE__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_AVD_PORT_TYPE__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_AVD_PORT_TYPE__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_AVD_PORT_TYPE__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_AVD_PORT_TYPE__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_AVD_PORT_TYPE__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_AVD_PORT_TYPE__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Connector Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_AVD_PORT_TYPE__CONNECTOR_NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Connector Pin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_AVD_PORT_TYPE__CONNECTOR_PIN_NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>If id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_AVD_PORT_TYPE__IF_ID = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Functional Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_AVD_PORT_TYPE__FUNCTIONAL_DATA = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Port User Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_AVD_PORT_TYPE__PORT_USER_CONFIGURATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Signal Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_AVD_PORT_TYPE__SIGNAL_EXTENSIONS = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Super AVD Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_AVD_PORT_TYPE_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Super AVD Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_AVD_PORT_TYPE_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.avip.impl.FunctionalDataImpl <em>Functional Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.avip.impl.FunctionalDataImpl
	 * @see targets.avip.impl.AvipPackageImpl#getFunctionalData()
	 * @generated
	 */
	int FUNCTIONAL_DATA = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DATA__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DATA__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DATA__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DATA__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DATA__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DATA__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DATA__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DATA__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DATA__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DATA__DIRECTION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>If signal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DATA__IF_SIGNAL = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Param type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DATA__PARAM_TYPE = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Param length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DATA__PARAM_LENGTH = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Functional Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DATA_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Functional Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DATA_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.avip.impl.SuperWiredPortTypeImpl <em>Super Wired Port Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.avip.impl.SuperWiredPortTypeImpl
	 * @see targets.avip.impl.AvipPackageImpl#getSuperWiredPortType()
	 * @generated
	 */
	int SUPER_WIRED_PORT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_WIRED_PORT_TYPE__ID = SUPER_AVD_PORT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_WIRED_PORT_TYPE__NAME = SUPER_AVD_PORT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_WIRED_PORT_TYPE__DOCUMENTATION = SUPER_AVD_PORT_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_WIRED_PORT_TYPE__MODIFIED = SUPER_AVD_PORT_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_WIRED_PORT_TYPE__MODIFIER = SUPER_AVD_PORT_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_WIRED_PORT_TYPE__TRACE_LINK = SUPER_AVD_PORT_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_WIRED_PORT_TYPE__CREATED = SUPER_AVD_PORT_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_WIRED_PORT_TYPE__CREATOR = SUPER_AVD_PORT_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_WIRED_PORT_TYPE__VERSION = SUPER_AVD_PORT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Connector Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_WIRED_PORT_TYPE__CONNECTOR_NAME = SUPER_AVD_PORT_TYPE__CONNECTOR_NAME;

	/**
	 * The feature id for the '<em><b>Connector Pin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_WIRED_PORT_TYPE__CONNECTOR_PIN_NAME = SUPER_AVD_PORT_TYPE__CONNECTOR_PIN_NAME;

	/**
	 * The feature id for the '<em><b>If id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_WIRED_PORT_TYPE__IF_ID = SUPER_AVD_PORT_TYPE__IF_ID;

	/**
	 * The feature id for the '<em><b>Functional Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_WIRED_PORT_TYPE__FUNCTIONAL_DATA = SUPER_AVD_PORT_TYPE__FUNCTIONAL_DATA;

	/**
	 * The feature id for the '<em><b>Port User Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_WIRED_PORT_TYPE__PORT_USER_CONFIGURATION = SUPER_AVD_PORT_TYPE__PORT_USER_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Signal Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_WIRED_PORT_TYPE__SIGNAL_EXTENSIONS = SUPER_AVD_PORT_TYPE__SIGNAL_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Max rev v</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_WIRED_PORT_TYPE__MAX_REV_V = SUPER_AVD_PORT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Super Wired Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_WIRED_PORT_TYPE_FEATURE_COUNT = SUPER_AVD_PORT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Super Wired Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_WIRED_PORT_TYPE_OPERATION_COUNT = SUPER_AVD_PORT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.avip.impl.SuperAnaloguePortTypeImpl <em>Super Analogue Port Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.avip.impl.SuperAnaloguePortTypeImpl
	 * @see targets.avip.impl.AvipPackageImpl#getSuperAnaloguePortType()
	 * @generated
	 */
	int SUPER_ANALOGUE_PORT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ANALOGUE_PORT_TYPE__ID = SUPER_WIRED_PORT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ANALOGUE_PORT_TYPE__NAME = SUPER_WIRED_PORT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ANALOGUE_PORT_TYPE__DOCUMENTATION = SUPER_WIRED_PORT_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ANALOGUE_PORT_TYPE__MODIFIED = SUPER_WIRED_PORT_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ANALOGUE_PORT_TYPE__MODIFIER = SUPER_WIRED_PORT_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ANALOGUE_PORT_TYPE__TRACE_LINK = SUPER_WIRED_PORT_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ANALOGUE_PORT_TYPE__CREATED = SUPER_WIRED_PORT_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ANALOGUE_PORT_TYPE__CREATOR = SUPER_WIRED_PORT_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ANALOGUE_PORT_TYPE__VERSION = SUPER_WIRED_PORT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Connector Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ANALOGUE_PORT_TYPE__CONNECTOR_NAME = SUPER_WIRED_PORT_TYPE__CONNECTOR_NAME;

	/**
	 * The feature id for the '<em><b>Connector Pin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ANALOGUE_PORT_TYPE__CONNECTOR_PIN_NAME = SUPER_WIRED_PORT_TYPE__CONNECTOR_PIN_NAME;

	/**
	 * The feature id for the '<em><b>If id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ANALOGUE_PORT_TYPE__IF_ID = SUPER_WIRED_PORT_TYPE__IF_ID;

	/**
	 * The feature id for the '<em><b>Functional Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ANALOGUE_PORT_TYPE__FUNCTIONAL_DATA = SUPER_WIRED_PORT_TYPE__FUNCTIONAL_DATA;

	/**
	 * The feature id for the '<em><b>Port User Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ANALOGUE_PORT_TYPE__PORT_USER_CONFIGURATION = SUPER_WIRED_PORT_TYPE__PORT_USER_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Signal Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ANALOGUE_PORT_TYPE__SIGNAL_EXTENSIONS = SUPER_WIRED_PORT_TYPE__SIGNAL_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Max rev v</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ANALOGUE_PORT_TYPE__MAX_REV_V = SUPER_WIRED_PORT_TYPE__MAX_REV_V;

	/**
	 * The feature id for the '<em><b>Min rev v</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ANALOGUE_PORT_TYPE__MIN_REV_V = SUPER_WIRED_PORT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Super Analogue Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ANALOGUE_PORT_TYPE_FEATURE_COUNT = SUPER_WIRED_PORT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Super Analogue Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ANALOGUE_PORT_TYPE_OPERATION_COUNT = SUPER_WIRED_PORT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.avip.impl.AnalogueInputImpl <em>Analogue Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.avip.impl.AnalogueInputImpl
	 * @see targets.avip.impl.AvipPackageImpl#getAnalogueInput()
	 * @generated
	 */
	int ANALOGUE_INPUT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_INPUT__ID = SUPER_ANALOGUE_PORT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_INPUT__NAME = SUPER_ANALOGUE_PORT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_INPUT__DOCUMENTATION = SUPER_ANALOGUE_PORT_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_INPUT__MODIFIED = SUPER_ANALOGUE_PORT_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_INPUT__MODIFIER = SUPER_ANALOGUE_PORT_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_INPUT__TRACE_LINK = SUPER_ANALOGUE_PORT_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_INPUT__CREATED = SUPER_ANALOGUE_PORT_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_INPUT__CREATOR = SUPER_ANALOGUE_PORT_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_INPUT__VERSION = SUPER_ANALOGUE_PORT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Connector Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_INPUT__CONNECTOR_NAME = SUPER_ANALOGUE_PORT_TYPE__CONNECTOR_NAME;

	/**
	 * The feature id for the '<em><b>Connector Pin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_INPUT__CONNECTOR_PIN_NAME = SUPER_ANALOGUE_PORT_TYPE__CONNECTOR_PIN_NAME;

	/**
	 * The feature id for the '<em><b>If id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_INPUT__IF_ID = SUPER_ANALOGUE_PORT_TYPE__IF_ID;

	/**
	 * The feature id for the '<em><b>Functional Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_INPUT__FUNCTIONAL_DATA = SUPER_ANALOGUE_PORT_TYPE__FUNCTIONAL_DATA;

	/**
	 * The feature id for the '<em><b>Port User Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_INPUT__PORT_USER_CONFIGURATION = SUPER_ANALOGUE_PORT_TYPE__PORT_USER_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Signal Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_INPUT__SIGNAL_EXTENSIONS = SUPER_ANALOGUE_PORT_TYPE__SIGNAL_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Max rev v</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_INPUT__MAX_REV_V = SUPER_ANALOGUE_PORT_TYPE__MAX_REV_V;

	/**
	 * The feature id for the '<em><b>Min rev v</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_INPUT__MIN_REV_V = SUPER_ANALOGUE_PORT_TYPE__MIN_REV_V;

	/**
	 * The feature id for the '<em><b>Ai voltage max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_INPUT__AI_VOLTAGE_MAX = SUPER_ANALOGUE_PORT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ai voltage max vac filtered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_INPUT__AI_VOLTAGE_MAX_VAC_FILTERED = SUPER_ANALOGUE_PORT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ai voltage max vdc filtered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_INPUT__AI_VOLTAGE_MAX_VDC_FILTERED = SUPER_ANALOGUE_PORT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ai voltage min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_INPUT__AI_VOLTAGE_MIN = SUPER_ANALOGUE_PORT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ai voltage min vdc filtered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_INPUT__AI_VOLTAGE_MIN_VDC_FILTERED = SUPER_ANALOGUE_PORT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min ai frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_INPUT__MIN_AI_FREQUENCY = SUPER_ANALOGUE_PORT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Analogue Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_INPUT_FEATURE_COUNT = SUPER_ANALOGUE_PORT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Analogue Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_INPUT_OPERATION_COUNT = SUPER_ANALOGUE_PORT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.avip.impl.AnalogueOutputImpl <em>Analogue Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.avip.impl.AnalogueOutputImpl
	 * @see targets.avip.impl.AvipPackageImpl#getAnalogueOutput()
	 * @generated
	 */
	int ANALOGUE_OUTPUT = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_OUTPUT__ID = SUPER_ANALOGUE_PORT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_OUTPUT__NAME = SUPER_ANALOGUE_PORT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_OUTPUT__DOCUMENTATION = SUPER_ANALOGUE_PORT_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_OUTPUT__MODIFIED = SUPER_ANALOGUE_PORT_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_OUTPUT__MODIFIER = SUPER_ANALOGUE_PORT_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_OUTPUT__TRACE_LINK = SUPER_ANALOGUE_PORT_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_OUTPUT__CREATED = SUPER_ANALOGUE_PORT_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_OUTPUT__CREATOR = SUPER_ANALOGUE_PORT_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_OUTPUT__VERSION = SUPER_ANALOGUE_PORT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Connector Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_OUTPUT__CONNECTOR_NAME = SUPER_ANALOGUE_PORT_TYPE__CONNECTOR_NAME;

	/**
	 * The feature id for the '<em><b>Connector Pin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_OUTPUT__CONNECTOR_PIN_NAME = SUPER_ANALOGUE_PORT_TYPE__CONNECTOR_PIN_NAME;

	/**
	 * The feature id for the '<em><b>If id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_OUTPUT__IF_ID = SUPER_ANALOGUE_PORT_TYPE__IF_ID;

	/**
	 * The feature id for the '<em><b>Functional Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_OUTPUT__FUNCTIONAL_DATA = SUPER_ANALOGUE_PORT_TYPE__FUNCTIONAL_DATA;

	/**
	 * The feature id for the '<em><b>Port User Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_OUTPUT__PORT_USER_CONFIGURATION = SUPER_ANALOGUE_PORT_TYPE__PORT_USER_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Signal Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_OUTPUT__SIGNAL_EXTENSIONS = SUPER_ANALOGUE_PORT_TYPE__SIGNAL_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Max rev v</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_OUTPUT__MAX_REV_V = SUPER_ANALOGUE_PORT_TYPE__MAX_REV_V;

	/**
	 * The feature id for the '<em><b>Min rev v</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_OUTPUT__MIN_REV_V = SUPER_ANALOGUE_PORT_TYPE__MIN_REV_V;

	/**
	 * The feature id for the '<em><b>Ao voltage cmd ac max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_AC_MAX = SUPER_ANALOGUE_PORT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ao voltage cmd ac min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_AC_MIN = SUPER_ANALOGUE_PORT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ao voltage cmd dc max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_DC_MAX = SUPER_ANALOGUE_PORT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ao voltage cmd dc min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_DC_MIN = SUPER_ANALOGUE_PORT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ao voltage cmd max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_MAX = SUPER_ANALOGUE_PORT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ao voltage cmd min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_MIN = SUPER_ANALOGUE_PORT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Over current threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_OUTPUT__OVER_CURRENT_THRESHOLD = SUPER_ANALOGUE_PORT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Analogue Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_OUTPUT_FEATURE_COUNT = SUPER_ANALOGUE_PORT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Analogue Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_OUTPUT_OPERATION_COUNT = SUPER_ANALOGUE_PORT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.avip.impl.DiscreteInputImpl <em>Discrete Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.avip.impl.DiscreteInputImpl
	 * @see targets.avip.impl.AvipPackageImpl#getDiscreteInput()
	 * @generated
	 */
	int DISCRETE_INPUT = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INPUT__ID = SUPER_WIRED_PORT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INPUT__NAME = SUPER_WIRED_PORT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INPUT__DOCUMENTATION = SUPER_WIRED_PORT_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INPUT__MODIFIED = SUPER_WIRED_PORT_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INPUT__MODIFIER = SUPER_WIRED_PORT_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INPUT__TRACE_LINK = SUPER_WIRED_PORT_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INPUT__CREATED = SUPER_WIRED_PORT_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INPUT__CREATOR = SUPER_WIRED_PORT_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INPUT__VERSION = SUPER_WIRED_PORT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Connector Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INPUT__CONNECTOR_NAME = SUPER_WIRED_PORT_TYPE__CONNECTOR_NAME;

	/**
	 * The feature id for the '<em><b>Connector Pin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INPUT__CONNECTOR_PIN_NAME = SUPER_WIRED_PORT_TYPE__CONNECTOR_PIN_NAME;

	/**
	 * The feature id for the '<em><b>If id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INPUT__IF_ID = SUPER_WIRED_PORT_TYPE__IF_ID;

	/**
	 * The feature id for the '<em><b>Functional Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INPUT__FUNCTIONAL_DATA = SUPER_WIRED_PORT_TYPE__FUNCTIONAL_DATA;

	/**
	 * The feature id for the '<em><b>Port User Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INPUT__PORT_USER_CONFIGURATION = SUPER_WIRED_PORT_TYPE__PORT_USER_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Signal Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INPUT__SIGNAL_EXTENSIONS = SUPER_WIRED_PORT_TYPE__SIGNAL_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Max rev v</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INPUT__MAX_REV_V = SUPER_WIRED_PORT_TYPE__MAX_REV_V;

	/**
	 * The feature id for the '<em><b>Hpp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INPUT__HPP = SUPER_WIRED_PORT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hpp port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INPUT__HPP_PORT = SUPER_WIRED_PORT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max polarisation voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INPUT__MAX_POLARISATION_VOLTAGE = SUPER_WIRED_PORT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max voltage gnd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INPUT__MAX_VOLTAGE_GND = SUPER_WIRED_PORT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Min voltage gnd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INPUT__MIN_VOLTAGE_GND = SUPER_WIRED_PORT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Max voltage opn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INPUT__MAX_VOLTAGE_OPN = SUPER_WIRED_PORT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Min voltage opn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INPUT__MIN_VOLTAGE_OPN = SUPER_WIRED_PORT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Polarisation failure dematuration duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INPUT__POLARISATION_FAILURE_DEMATURATION_DURATION = SUPER_WIRED_PORT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Polarisation failure maturation duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INPUT__POLARISATION_FAILURE_MATURATION_DURATION = SUPER_WIRED_PORT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Discrete Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INPUT_FEATURE_COUNT = SUPER_WIRED_PORT_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Discrete Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_INPUT_OPERATION_COUNT = SUPER_WIRED_PORT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.avip.impl.DiscreteOutputImpl <em>Discrete Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.avip.impl.DiscreteOutputImpl
	 * @see targets.avip.impl.AvipPackageImpl#getDiscreteOutput()
	 * @generated
	 */
	int DISCRETE_OUTPUT = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_OUTPUT__ID = SUPER_WIRED_PORT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_OUTPUT__NAME = SUPER_WIRED_PORT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_OUTPUT__DOCUMENTATION = SUPER_WIRED_PORT_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_OUTPUT__MODIFIED = SUPER_WIRED_PORT_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_OUTPUT__MODIFIER = SUPER_WIRED_PORT_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_OUTPUT__TRACE_LINK = SUPER_WIRED_PORT_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_OUTPUT__CREATED = SUPER_WIRED_PORT_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_OUTPUT__CREATOR = SUPER_WIRED_PORT_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_OUTPUT__VERSION = SUPER_WIRED_PORT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Connector Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_OUTPUT__CONNECTOR_NAME = SUPER_WIRED_PORT_TYPE__CONNECTOR_NAME;

	/**
	 * The feature id for the '<em><b>Connector Pin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_OUTPUT__CONNECTOR_PIN_NAME = SUPER_WIRED_PORT_TYPE__CONNECTOR_PIN_NAME;

	/**
	 * The feature id for the '<em><b>If id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_OUTPUT__IF_ID = SUPER_WIRED_PORT_TYPE__IF_ID;

	/**
	 * The feature id for the '<em><b>Functional Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_OUTPUT__FUNCTIONAL_DATA = SUPER_WIRED_PORT_TYPE__FUNCTIONAL_DATA;

	/**
	 * The feature id for the '<em><b>Port User Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_OUTPUT__PORT_USER_CONFIGURATION = SUPER_WIRED_PORT_TYPE__PORT_USER_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Signal Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_OUTPUT__SIGNAL_EXTENSIONS = SUPER_WIRED_PORT_TYPE__SIGNAL_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Max rev v</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_OUTPUT__MAX_REV_V = SUPER_WIRED_PORT_TYPE__MAX_REV_V;

	/**
	 * The feature id for the '<em><b>Close volt margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_OUTPUT__CLOSE_VOLT_MARGIN = SUPER_WIRED_PORT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Internal pull up voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_OUTPUT__INTERNAL_PULL_UP_VOLTAGE = SUPER_WIRED_PORT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max vcase gnd conn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_OUTPUT__MAX_VCASE_GND_CONN = SUPER_WIRED_PORT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Normal load resistance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_OUTPUT__NORMAL_LOAD_RESISTANCE = SUPER_WIRED_PORT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Normal load voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_OUTPUT__NORMAL_LOAD_VOLTAGE = SUPER_WIRED_PORT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Over current fault maturation duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_OUTPUT__OVER_CURRENT_FAULT_MATURATION_DURATION = SUPER_WIRED_PORT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Overload current threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_OUTPUT__OVERLOAD_CURRENT_THRESHOLD = SUPER_WIRED_PORT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Short circuit current threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_OUTPUT__SHORT_CIRCUIT_CURRENT_THRESHOLD = SUPER_WIRED_PORT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Soft over current fault maturation duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_OUTPUT__SOFT_OVER_CURRENT_FAULT_MATURATION_DURATION = SUPER_WIRED_PORT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Discrete Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_OUTPUT_FEATURE_COUNT = SUPER_WIRED_PORT_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Discrete Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_OUTPUT_OPERATION_COUNT = SUPER_WIRED_PORT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.avip.impl.XTalkImpl <em>XTalk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.avip.impl.XTalkImpl
	 * @see targets.avip.impl.AvipPackageImpl#getXTalk()
	 * @generated
	 */
	int XTALK = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTALK__ID = SUPER_AVD_PORT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTALK__NAME = SUPER_AVD_PORT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTALK__DOCUMENTATION = SUPER_AVD_PORT_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTALK__MODIFIED = SUPER_AVD_PORT_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTALK__MODIFIER = SUPER_AVD_PORT_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTALK__TRACE_LINK = SUPER_AVD_PORT_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTALK__CREATED = SUPER_AVD_PORT_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTALK__CREATOR = SUPER_AVD_PORT_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTALK__VERSION = SUPER_AVD_PORT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Connector Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTALK__CONNECTOR_NAME = SUPER_AVD_PORT_TYPE__CONNECTOR_NAME;

	/**
	 * The feature id for the '<em><b>Connector Pin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTALK__CONNECTOR_PIN_NAME = SUPER_AVD_PORT_TYPE__CONNECTOR_PIN_NAME;

	/**
	 * The feature id for the '<em><b>If id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTALK__IF_ID = SUPER_AVD_PORT_TYPE__IF_ID;

	/**
	 * The feature id for the '<em><b>Functional Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTALK__FUNCTIONAL_DATA = SUPER_AVD_PORT_TYPE__FUNCTIONAL_DATA;

	/**
	 * The feature id for the '<em><b>Port User Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTALK__PORT_USER_CONFIGURATION = SUPER_AVD_PORT_TYPE__PORT_USER_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Signal Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTALK__SIGNAL_EXTENSIONS = SUPER_AVD_PORT_TYPE__SIGNAL_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTALK__DIRECTION = SUPER_AVD_PORT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XTalk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTALK_FEATURE_COUNT = SUPER_AVD_PORT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XTalk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTALK_OPERATION_COUNT = SUPER_AVD_PORT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.avip.impl.A429Impl <em>A429</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.avip.impl.A429Impl
	 * @see targets.avip.impl.AvipPackageImpl#getA429()
	 * @generated
	 */
	int A429 = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429__ID = SUPER_AVD_PORT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429__NAME = SUPER_AVD_PORT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429__DOCUMENTATION = SUPER_AVD_PORT_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429__MODIFIED = SUPER_AVD_PORT_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429__MODIFIER = SUPER_AVD_PORT_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429__TRACE_LINK = SUPER_AVD_PORT_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429__CREATED = SUPER_AVD_PORT_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429__CREATOR = SUPER_AVD_PORT_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429__VERSION = SUPER_AVD_PORT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Connector Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429__CONNECTOR_NAME = SUPER_AVD_PORT_TYPE__CONNECTOR_NAME;

	/**
	 * The feature id for the '<em><b>Connector Pin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429__CONNECTOR_PIN_NAME = SUPER_AVD_PORT_TYPE__CONNECTOR_PIN_NAME;

	/**
	 * The feature id for the '<em><b>If id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429__IF_ID = SUPER_AVD_PORT_TYPE__IF_ID;

	/**
	 * The feature id for the '<em><b>Functional Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429__FUNCTIONAL_DATA = SUPER_AVD_PORT_TYPE__FUNCTIONAL_DATA;

	/**
	 * The feature id for the '<em><b>Port User Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429__PORT_USER_CONFIGURATION = SUPER_AVD_PORT_TYPE__PORT_USER_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Signal Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429__SIGNAL_EXTENSIONS = SUPER_AVD_PORT_TYPE__SIGNAL_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429__DIRECTION = SUPER_AVD_PORT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>A429</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_FEATURE_COUNT = SUPER_AVD_PORT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>A429</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_OPERATION_COUNT = SUPER_AVD_PORT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.avip.impl.A664Impl <em>A664</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.avip.impl.A664Impl
	 * @see targets.avip.impl.AvipPackageImpl#getA664()
	 * @generated
	 */
	int A664 = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664__ID = SUPER_AVD_PORT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664__NAME = SUPER_AVD_PORT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664__DOCUMENTATION = SUPER_AVD_PORT_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664__MODIFIED = SUPER_AVD_PORT_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664__MODIFIER = SUPER_AVD_PORT_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664__TRACE_LINK = SUPER_AVD_PORT_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664__CREATED = SUPER_AVD_PORT_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664__CREATOR = SUPER_AVD_PORT_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664__VERSION = SUPER_AVD_PORT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Connector Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664__CONNECTOR_NAME = SUPER_AVD_PORT_TYPE__CONNECTOR_NAME;

	/**
	 * The feature id for the '<em><b>Connector Pin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664__CONNECTOR_PIN_NAME = SUPER_AVD_PORT_TYPE__CONNECTOR_PIN_NAME;

	/**
	 * The feature id for the '<em><b>If id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664__IF_ID = SUPER_AVD_PORT_TYPE__IF_ID;

	/**
	 * The feature id for the '<em><b>Functional Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664__FUNCTIONAL_DATA = SUPER_AVD_PORT_TYPE__FUNCTIONAL_DATA;

	/**
	 * The feature id for the '<em><b>Port User Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664__PORT_USER_CONFIGURATION = SUPER_AVD_PORT_TYPE__PORT_USER_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Signal Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664__SIGNAL_EXTENSIONS = SUPER_AVD_PORT_TYPE__SIGNAL_EXTENSIONS;

	/**
	 * The number of structural features of the '<em>A664</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_FEATURE_COUNT = SUPER_AVD_PORT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>A664</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_OPERATION_COUNT = SUPER_AVD_PORT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.avip.impl.CANImpl <em>CAN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.avip.impl.CANImpl
	 * @see targets.avip.impl.AvipPackageImpl#getCAN()
	 * @generated
	 */
	int CAN = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN__ID = SUPER_AVD_PORT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN__NAME = SUPER_AVD_PORT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN__DOCUMENTATION = SUPER_AVD_PORT_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN__MODIFIED = SUPER_AVD_PORT_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN__MODIFIER = SUPER_AVD_PORT_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN__TRACE_LINK = SUPER_AVD_PORT_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN__CREATED = SUPER_AVD_PORT_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN__CREATOR = SUPER_AVD_PORT_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN__VERSION = SUPER_AVD_PORT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Connector Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN__CONNECTOR_NAME = SUPER_AVD_PORT_TYPE__CONNECTOR_NAME;

	/**
	 * The feature id for the '<em><b>Connector Pin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN__CONNECTOR_PIN_NAME = SUPER_AVD_PORT_TYPE__CONNECTOR_PIN_NAME;

	/**
	 * The feature id for the '<em><b>If id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN__IF_ID = SUPER_AVD_PORT_TYPE__IF_ID;

	/**
	 * The feature id for the '<em><b>Functional Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN__FUNCTIONAL_DATA = SUPER_AVD_PORT_TYPE__FUNCTIONAL_DATA;

	/**
	 * The feature id for the '<em><b>Port User Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN__PORT_USER_CONFIGURATION = SUPER_AVD_PORT_TYPE__PORT_USER_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Signal Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN__SIGNAL_EXTENSIONS = SUPER_AVD_PORT_TYPE__SIGNAL_EXTENSIONS;

	/**
	 * The number of structural features of the '<em>CAN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_FEATURE_COUNT = SUPER_AVD_PORT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CAN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_OPERATION_COUNT = SUPER_AVD_PORT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.avip.impl.MEMImpl <em>MEM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.avip.impl.MEMImpl
	 * @see targets.avip.impl.AvipPackageImpl#getMEM()
	 * @generated
	 */
	int MEM = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM__ID = SUPER_AVD_PORT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM__NAME = SUPER_AVD_PORT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM__DOCUMENTATION = SUPER_AVD_PORT_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM__MODIFIED = SUPER_AVD_PORT_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM__MODIFIER = SUPER_AVD_PORT_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM__TRACE_LINK = SUPER_AVD_PORT_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM__CREATED = SUPER_AVD_PORT_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM__CREATOR = SUPER_AVD_PORT_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM__VERSION = SUPER_AVD_PORT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Connector Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM__CONNECTOR_NAME = SUPER_AVD_PORT_TYPE__CONNECTOR_NAME;

	/**
	 * The feature id for the '<em><b>Connector Pin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM__CONNECTOR_PIN_NAME = SUPER_AVD_PORT_TYPE__CONNECTOR_PIN_NAME;

	/**
	 * The feature id for the '<em><b>If id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM__IF_ID = SUPER_AVD_PORT_TYPE__IF_ID;

	/**
	 * The feature id for the '<em><b>Functional Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM__FUNCTIONAL_DATA = SUPER_AVD_PORT_TYPE__FUNCTIONAL_DATA;

	/**
	 * The feature id for the '<em><b>Port User Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM__PORT_USER_CONFIGURATION = SUPER_AVD_PORT_TYPE__PORT_USER_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Signal Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM__SIGNAL_EXTENSIONS = SUPER_AVD_PORT_TYPE__SIGNAL_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Mem Port ID Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM__MEM_PORT_ID_EXTENSION = SUPER_AVD_PORT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MEM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_FEATURE_COUNT = SUPER_AVD_PORT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>MEM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_OPERATION_COUNT = SUPER_AVD_PORT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.avip.impl.V_RTDImpl <em>VRTD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.avip.impl.V_RTDImpl
	 * @see targets.avip.impl.AvipPackageImpl#getV_RTD()
	 * @generated
	 */
	int VRTD = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VRTD__ID = SUPER_AVD_PORT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VRTD__NAME = SUPER_AVD_PORT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VRTD__DOCUMENTATION = SUPER_AVD_PORT_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VRTD__MODIFIED = SUPER_AVD_PORT_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VRTD__MODIFIER = SUPER_AVD_PORT_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VRTD__TRACE_LINK = SUPER_AVD_PORT_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VRTD__CREATED = SUPER_AVD_PORT_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VRTD__CREATOR = SUPER_AVD_PORT_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VRTD__VERSION = SUPER_AVD_PORT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Connector Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VRTD__CONNECTOR_NAME = SUPER_AVD_PORT_TYPE__CONNECTOR_NAME;

	/**
	 * The feature id for the '<em><b>Connector Pin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VRTD__CONNECTOR_PIN_NAME = SUPER_AVD_PORT_TYPE__CONNECTOR_PIN_NAME;

	/**
	 * The feature id for the '<em><b>If id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VRTD__IF_ID = SUPER_AVD_PORT_TYPE__IF_ID;

	/**
	 * The feature id for the '<em><b>Functional Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VRTD__FUNCTIONAL_DATA = SUPER_AVD_PORT_TYPE__FUNCTIONAL_DATA;

	/**
	 * The feature id for the '<em><b>Port User Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VRTD__PORT_USER_CONFIGURATION = SUPER_AVD_PORT_TYPE__PORT_USER_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Signal Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VRTD__SIGNAL_EXTENSIONS = SUPER_AVD_PORT_TYPE__SIGNAL_EXTENSIONS;

	/**
	 * The number of structural features of the '<em>VRTD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VRTD_FEATURE_COUNT = SUPER_AVD_PORT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VRTD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VRTD_OPERATION_COUNT = SUPER_AVD_PORT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.avip.impl.PortUserConfigurationImpl <em>Port User Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.avip.impl.PortUserConfigurationImpl
	 * @see targets.avip.impl.AvipPackageImpl#getPortUserConfiguration()
	 * @generated
	 */
	int PORT_USER_CONFIGURATION = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_USER_CONFIGURATION__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_USER_CONFIGURATION__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_USER_CONFIGURATION__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_USER_CONFIGURATION__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_USER_CONFIGURATION__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_USER_CONFIGURATION__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_USER_CONFIGURATION__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_USER_CONFIGURATION__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_USER_CONFIGURATION__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Line function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_USER_CONFIGURATION__LINE_FUNCTION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Special param 1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_USER_CONFIGURATION__SPECIAL_PARAM_1 = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Special param 2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_USER_CONFIGURATION__SPECIAL_PARAM_2 = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Special param 3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_USER_CONFIGURATION__SPECIAL_PARAM_3 = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Special param 4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_USER_CONFIGURATION__SPECIAL_PARAM_4 = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Special param 5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_USER_CONFIGURATION__SPECIAL_PARAM_5 = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Init default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_USER_CONFIGURATION__INIT_DEFAULT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Loss of command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_USER_CONFIGURATION__LOSS_OF_COMMAND = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Nb allowed resets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_USER_CONFIGURATION__NB_ALLOWED_RESETS = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Reset wait time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_USER_CONFIGURATION__RESET_WAIT_TIME = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Port User Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_USER_CONFIGURATION_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 17;

	/**
	 * The number of operations of the '<em>Port User Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_USER_CONFIGURATION_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.avip.impl.AVDSchedulerExtensionImpl <em>AVD Scheduler Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.avip.impl.AVDSchedulerExtensionImpl
	 * @see targets.avip.impl.AvipPackageImpl#getAVDSchedulerExtension()
	 * @generated
	 */
	int AVD_SCHEDULER_EXTENSION = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVD_SCHEDULER_EXTENSION__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVD_SCHEDULER_EXTENSION__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVD_SCHEDULER_EXTENSION__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVD_SCHEDULER_EXTENSION__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVD_SCHEDULER_EXTENSION__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVD_SCHEDULER_EXTENSION__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVD_SCHEDULER_EXTENSION__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVD_SCHEDULER_EXTENSION__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVD_SCHEDULER_EXTENSION__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Mif duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVD_SCHEDULER_EXTENSION__MIF_DURATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Maf duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVD_SCHEDULER_EXTENSION__MAF_DURATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Scheduler id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVD_SCHEDULER_EXTENSION__SCHEDULER_ID = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Scheduler name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVD_SCHEDULER_EXTENSION__SCHEDULER_NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>AVD Scheduler Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVD_SCHEDULER_EXTENSION_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>AVD Scheduler Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVD_SCHEDULER_EXTENSION_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.avip.impl.SignalExtensionsImpl <em>Signal Extensions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.avip.impl.SignalExtensionsImpl
	 * @see targets.avip.impl.AvipPackageImpl#getSignalExtensions()
	 * @generated
	 */
	int SIGNAL_EXTENSIONS = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EXTENSIONS__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EXTENSIONS__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EXTENSIONS__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EXTENSIONS__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EXTENSIONS__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EXTENSIONS__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EXTENSIONS__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EXTENSIONS__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EXTENSIONS__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Signal Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EXTENSIONS__SIGNAL_EXTENSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Signal Extensions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EXTENSIONS_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Signal Extensions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EXTENSIONS_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.avip.impl.SignalExtensionImpl <em>Signal Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.avip.impl.SignalExtensionImpl
	 * @see targets.avip.impl.AvipPackageImpl#getSignalExtension()
	 * @generated
	 */
	int SIGNAL_EXTENSION = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EXTENSION__ID = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EXTENSION__NAME = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EXTENSION__DOCUMENTATION = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EXTENSION__MODIFIED = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EXTENSION__MODIFIER = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EXTENSION__TRACE_LINK = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EXTENSION__CREATED = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EXTENSION__CREATOR = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EXTENSION__VERSION = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Extended Class ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EXTENSION__EXTENDED_CLASS_ID = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE__EXTENDED_CLASS_ID;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EXTENSION__FUNCTION = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Associated Line Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EXTENSION__ASSOCIATED_LINE_NAME = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Signal Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EXTENSION_FEATURE_COUNT = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Signal Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EXTENSION_OPERATION_COUNT = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.avip.impl.MEMPortIDExtensionImpl <em>MEM Port ID Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.avip.impl.MEMPortIDExtensionImpl
	 * @see targets.avip.impl.AvipPackageImpl#getMEMPortIDExtension()
	 * @generated
	 */
	int MEM_PORT_ID_EXTENSION = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_PORT_ID_EXTENSION__ID = TargetsPackage.SUPER_ASSIGNMENT_SPECIFICATION_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_PORT_ID_EXTENSION__NAME = TargetsPackage.SUPER_ASSIGNMENT_SPECIFICATION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_PORT_ID_EXTENSION__DOCUMENTATION = TargetsPackage.SUPER_ASSIGNMENT_SPECIFICATION_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_PORT_ID_EXTENSION__MODIFIED = TargetsPackage.SUPER_ASSIGNMENT_SPECIFICATION_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_PORT_ID_EXTENSION__MODIFIER = TargetsPackage.SUPER_ASSIGNMENT_SPECIFICATION_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_PORT_ID_EXTENSION__TRACE_LINK = TargetsPackage.SUPER_ASSIGNMENT_SPECIFICATION_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_PORT_ID_EXTENSION__CREATED = TargetsPackage.SUPER_ASSIGNMENT_SPECIFICATION_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_PORT_ID_EXTENSION__CREATOR = TargetsPackage.SUPER_ASSIGNMENT_SPECIFICATION_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_PORT_ID_EXTENSION__VERSION = TargetsPackage.SUPER_ASSIGNMENT_SPECIFICATION_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Referenced Assignment ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_PORT_ID_EXTENSION__REFERENCED_ASSIGNMENT_ID = TargetsPackage.SUPER_ASSIGNMENT_SPECIFICATION_TYPE__REFERENCED_ASSIGNMENT_ID;

	/**
	 * The feature id for the '<em><b>Port ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_PORT_ID_EXTENSION__PORT_ID = TargetsPackage.SUPER_ASSIGNMENT_SPECIFICATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MEM Port ID Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_PORT_ID_EXTENSION_FEATURE_COUNT = TargetsPackage.SUPER_ASSIGNMENT_SPECIFICATION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>MEM Port ID Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_PORT_ID_EXTENSION_OPERATION_COUNT = TargetsPackage.SUPER_ASSIGNMENT_SPECIFICATION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Connector Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see targets.avip.impl.AvipPackageImpl#getConnectorNameType()
	 * @generated
	 */
	int CONNECTOR_NAME_TYPE = 21;

	/**
	 * The meta object id for the '<em>Connector Pin Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see targets.avip.impl.AvipPackageImpl#getConnectorPinNameType()
	 * @generated
	 */
	int CONNECTOR_PIN_NAME_TYPE = 22;


	/**
	 * Returns the meta object for class '{@link targets.avip.AvionicsVirtualDevice <em>Avionics Virtual Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avionics Virtual Device</em>'.
	 * @see targets.avip.AvionicsVirtualDevice
	 * @generated
	 */
	EClass getAvionicsVirtualDevice();

	/**
	 * Returns the meta object for the containment reference '{@link targets.avip.AvionicsVirtualDevice#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ports</em>'.
	 * @see targets.avip.AvionicsVirtualDevice#getPorts()
	 * @see #getAvionicsVirtualDevice()
	 * @generated
	 */
	EReference getAvionicsVirtualDevice_Ports();

	/**
	 * Returns the meta object for the containment reference '{@link targets.avip.AvionicsVirtualDevice#getScheduleExtension <em>Schedule Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schedule Extension</em>'.
	 * @see targets.avip.AvionicsVirtualDevice#getScheduleExtension()
	 * @see #getAvionicsVirtualDevice()
	 * @generated
	 */
	EReference getAvionicsVirtualDevice_ScheduleExtension();

	/**
	 * Returns the meta object for class '{@link targets.avip.AVDPorts <em>AVD Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AVD Ports</em>'.
	 * @see targets.avip.AVDPorts
	 * @generated
	 */
	EClass getAVDPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link targets.avip.AVDPorts#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see targets.avip.AVDPorts#getPort()
	 * @see #getAVDPorts()
	 * @generated
	 */
	EReference getAVDPorts_Port();

	/**
	 * Returns the meta object for class '{@link targets.avip.SuperAVDPortType <em>Super AVD Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super AVD Port Type</em>'.
	 * @see targets.avip.SuperAVDPortType
	 * @generated
	 */
	EClass getSuperAVDPortType();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.SuperAVDPortType#getConnectorName <em>Connector Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector Name</em>'.
	 * @see targets.avip.SuperAVDPortType#getConnectorName()
	 * @see #getSuperAVDPortType()
	 * @generated
	 */
	EAttribute getSuperAVDPortType_ConnectorName();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.SuperAVDPortType#getConnectorPinName <em>Connector Pin Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector Pin Name</em>'.
	 * @see targets.avip.SuperAVDPortType#getConnectorPinName()
	 * @see #getSuperAVDPortType()
	 * @generated
	 */
	EAttribute getSuperAVDPortType_ConnectorPinName();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.SuperAVDPortType#getIf_id <em>If id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If id</em>'.
	 * @see targets.avip.SuperAVDPortType#getIf_id()
	 * @see #getSuperAVDPortType()
	 * @generated
	 */
	EAttribute getSuperAVDPortType_If_id();

	/**
	 * Returns the meta object for the containment reference list '{@link targets.avip.SuperAVDPortType#getFunctionalData <em>Functional Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functional Data</em>'.
	 * @see targets.avip.SuperAVDPortType#getFunctionalData()
	 * @see #getSuperAVDPortType()
	 * @generated
	 */
	EReference getSuperAVDPortType_FunctionalData();

	/**
	 * Returns the meta object for the containment reference list '{@link targets.avip.SuperAVDPortType#getPortUserConfiguration <em>Port User Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port User Configuration</em>'.
	 * @see targets.avip.SuperAVDPortType#getPortUserConfiguration()
	 * @see #getSuperAVDPortType()
	 * @generated
	 */
	EReference getSuperAVDPortType_PortUserConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link targets.avip.SuperAVDPortType#getSignalExtensions <em>Signal Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signal Extensions</em>'.
	 * @see targets.avip.SuperAVDPortType#getSignalExtensions()
	 * @see #getSuperAVDPortType()
	 * @generated
	 */
	EReference getSuperAVDPortType_SignalExtensions();

	/**
	 * Returns the meta object for class '{@link targets.avip.FunctionalData <em>Functional Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Data</em>'.
	 * @see targets.avip.FunctionalData
	 * @generated
	 */
	EClass getFunctionalData();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.FunctionalData#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see targets.avip.FunctionalData#getDirection()
	 * @see #getFunctionalData()
	 * @generated
	 */
	EAttribute getFunctionalData_Direction();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.FunctionalData#getIf_signal <em>If signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If signal</em>'.
	 * @see targets.avip.FunctionalData#getIf_signal()
	 * @see #getFunctionalData()
	 * @generated
	 */
	EAttribute getFunctionalData_If_signal();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.FunctionalData#getParam_type <em>Param type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param type</em>'.
	 * @see targets.avip.FunctionalData#getParam_type()
	 * @see #getFunctionalData()
	 * @generated
	 */
	EAttribute getFunctionalData_Param_type();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.FunctionalData#getParam_length <em>Param length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param length</em>'.
	 * @see targets.avip.FunctionalData#getParam_length()
	 * @see #getFunctionalData()
	 * @generated
	 */
	EAttribute getFunctionalData_Param_length();

	/**
	 * Returns the meta object for class '{@link targets.avip.SuperWiredPortType <em>Super Wired Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Wired Port Type</em>'.
	 * @see targets.avip.SuperWiredPortType
	 * @generated
	 */
	EClass getSuperWiredPortType();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.SuperWiredPortType#getMax_rev_v <em>Max rev v</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max rev v</em>'.
	 * @see targets.avip.SuperWiredPortType#getMax_rev_v()
	 * @see #getSuperWiredPortType()
	 * @generated
	 */
	EAttribute getSuperWiredPortType_Max_rev_v();

	/**
	 * Returns the meta object for class '{@link targets.avip.SuperAnaloguePortType <em>Super Analogue Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Analogue Port Type</em>'.
	 * @see targets.avip.SuperAnaloguePortType
	 * @generated
	 */
	EClass getSuperAnaloguePortType();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.SuperAnaloguePortType#getMin_rev_v <em>Min rev v</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min rev v</em>'.
	 * @see targets.avip.SuperAnaloguePortType#getMin_rev_v()
	 * @see #getSuperAnaloguePortType()
	 * @generated
	 */
	EAttribute getSuperAnaloguePortType_Min_rev_v();

	/**
	 * Returns the meta object for class '{@link targets.avip.AnalogueInput <em>Analogue Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analogue Input</em>'.
	 * @see targets.avip.AnalogueInput
	 * @generated
	 */
	EClass getAnalogueInput();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.AnalogueInput#getAi_voltage_max <em>Ai voltage max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ai voltage max</em>'.
	 * @see targets.avip.AnalogueInput#getAi_voltage_max()
	 * @see #getAnalogueInput()
	 * @generated
	 */
	EAttribute getAnalogueInput_Ai_voltage_max();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.AnalogueInput#getAi_voltage_max_vac_filtered <em>Ai voltage max vac filtered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ai voltage max vac filtered</em>'.
	 * @see targets.avip.AnalogueInput#getAi_voltage_max_vac_filtered()
	 * @see #getAnalogueInput()
	 * @generated
	 */
	EAttribute getAnalogueInput_Ai_voltage_max_vac_filtered();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.AnalogueInput#getAi_voltage_max_vdc_filtered <em>Ai voltage max vdc filtered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ai voltage max vdc filtered</em>'.
	 * @see targets.avip.AnalogueInput#getAi_voltage_max_vdc_filtered()
	 * @see #getAnalogueInput()
	 * @generated
	 */
	EAttribute getAnalogueInput_Ai_voltage_max_vdc_filtered();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.AnalogueInput#getAi_voltage_min <em>Ai voltage min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ai voltage min</em>'.
	 * @see targets.avip.AnalogueInput#getAi_voltage_min()
	 * @see #getAnalogueInput()
	 * @generated
	 */
	EAttribute getAnalogueInput_Ai_voltage_min();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.AnalogueInput#getAi_voltage_min_vdc_filtered <em>Ai voltage min vdc filtered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ai voltage min vdc filtered</em>'.
	 * @see targets.avip.AnalogueInput#getAi_voltage_min_vdc_filtered()
	 * @see #getAnalogueInput()
	 * @generated
	 */
	EAttribute getAnalogueInput_Ai_voltage_min_vdc_filtered();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.AnalogueInput#getMin_ai_frequency <em>Min ai frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min ai frequency</em>'.
	 * @see targets.avip.AnalogueInput#getMin_ai_frequency()
	 * @see #getAnalogueInput()
	 * @generated
	 */
	EAttribute getAnalogueInput_Min_ai_frequency();

	/**
	 * Returns the meta object for class '{@link targets.avip.AnalogueOutput <em>Analogue Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analogue Output</em>'.
	 * @see targets.avip.AnalogueOutput
	 * @generated
	 */
	EClass getAnalogueOutput();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.AnalogueOutput#getAo_voltage_cmd_ac_max <em>Ao voltage cmd ac max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ao voltage cmd ac max</em>'.
	 * @see targets.avip.AnalogueOutput#getAo_voltage_cmd_ac_max()
	 * @see #getAnalogueOutput()
	 * @generated
	 */
	EAttribute getAnalogueOutput_Ao_voltage_cmd_ac_max();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.AnalogueOutput#getAo_voltage_cmd_ac_min <em>Ao voltage cmd ac min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ao voltage cmd ac min</em>'.
	 * @see targets.avip.AnalogueOutput#getAo_voltage_cmd_ac_min()
	 * @see #getAnalogueOutput()
	 * @generated
	 */
	EAttribute getAnalogueOutput_Ao_voltage_cmd_ac_min();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.AnalogueOutput#getAo_voltage_cmd_dc_max <em>Ao voltage cmd dc max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ao voltage cmd dc max</em>'.
	 * @see targets.avip.AnalogueOutput#getAo_voltage_cmd_dc_max()
	 * @see #getAnalogueOutput()
	 * @generated
	 */
	EAttribute getAnalogueOutput_Ao_voltage_cmd_dc_max();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.AnalogueOutput#getAo_voltage_cmd_dc_min <em>Ao voltage cmd dc min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ao voltage cmd dc min</em>'.
	 * @see targets.avip.AnalogueOutput#getAo_voltage_cmd_dc_min()
	 * @see #getAnalogueOutput()
	 * @generated
	 */
	EAttribute getAnalogueOutput_Ao_voltage_cmd_dc_min();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.AnalogueOutput#getAo_voltage_cmd_max <em>Ao voltage cmd max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ao voltage cmd max</em>'.
	 * @see targets.avip.AnalogueOutput#getAo_voltage_cmd_max()
	 * @see #getAnalogueOutput()
	 * @generated
	 */
	EAttribute getAnalogueOutput_Ao_voltage_cmd_max();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.AnalogueOutput#getAo_voltage_cmd_min <em>Ao voltage cmd min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ao voltage cmd min</em>'.
	 * @see targets.avip.AnalogueOutput#getAo_voltage_cmd_min()
	 * @see #getAnalogueOutput()
	 * @generated
	 */
	EAttribute getAnalogueOutput_Ao_voltage_cmd_min();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.AnalogueOutput#getOver_current_threshold <em>Over current threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Over current threshold</em>'.
	 * @see targets.avip.AnalogueOutput#getOver_current_threshold()
	 * @see #getAnalogueOutput()
	 * @generated
	 */
	EAttribute getAnalogueOutput_Over_current_threshold();

	/**
	 * Returns the meta object for class '{@link targets.avip.DiscreteInput <em>Discrete Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Input</em>'.
	 * @see targets.avip.DiscreteInput
	 * @generated
	 */
	EClass getDiscreteInput();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.DiscreteInput#getHpp <em>Hpp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hpp</em>'.
	 * @see targets.avip.DiscreteInput#getHpp()
	 * @see #getDiscreteInput()
	 * @generated
	 */
	EAttribute getDiscreteInput_Hpp();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.DiscreteInput#getHpp_port <em>Hpp port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hpp port</em>'.
	 * @see targets.avip.DiscreteInput#getHpp_port()
	 * @see #getDiscreteInput()
	 * @generated
	 */
	EAttribute getDiscreteInput_Hpp_port();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.DiscreteInput#getMax_polarisation_voltage <em>Max polarisation voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max polarisation voltage</em>'.
	 * @see targets.avip.DiscreteInput#getMax_polarisation_voltage()
	 * @see #getDiscreteInput()
	 * @generated
	 */
	EAttribute getDiscreteInput_Max_polarisation_voltage();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.DiscreteInput#getMax_voltage_gnd <em>Max voltage gnd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max voltage gnd</em>'.
	 * @see targets.avip.DiscreteInput#getMax_voltage_gnd()
	 * @see #getDiscreteInput()
	 * @generated
	 */
	EAttribute getDiscreteInput_Max_voltage_gnd();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.DiscreteInput#getMin_voltage_gnd <em>Min voltage gnd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min voltage gnd</em>'.
	 * @see targets.avip.DiscreteInput#getMin_voltage_gnd()
	 * @see #getDiscreteInput()
	 * @generated
	 */
	EAttribute getDiscreteInput_Min_voltage_gnd();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.DiscreteInput#getMax_voltage_opn <em>Max voltage opn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max voltage opn</em>'.
	 * @see targets.avip.DiscreteInput#getMax_voltage_opn()
	 * @see #getDiscreteInput()
	 * @generated
	 */
	EAttribute getDiscreteInput_Max_voltage_opn();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.DiscreteInput#getMin_voltage_opn <em>Min voltage opn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min voltage opn</em>'.
	 * @see targets.avip.DiscreteInput#getMin_voltage_opn()
	 * @see #getDiscreteInput()
	 * @generated
	 */
	EAttribute getDiscreteInput_Min_voltage_opn();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.DiscreteInput#getPolarisation_failure_dematuration_duration <em>Polarisation failure dematuration duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Polarisation failure dematuration duration</em>'.
	 * @see targets.avip.DiscreteInput#getPolarisation_failure_dematuration_duration()
	 * @see #getDiscreteInput()
	 * @generated
	 */
	EAttribute getDiscreteInput_Polarisation_failure_dematuration_duration();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.DiscreteInput#getPolarisation_failure_maturation_duration <em>Polarisation failure maturation duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Polarisation failure maturation duration</em>'.
	 * @see targets.avip.DiscreteInput#getPolarisation_failure_maturation_duration()
	 * @see #getDiscreteInput()
	 * @generated
	 */
	EAttribute getDiscreteInput_Polarisation_failure_maturation_duration();

	/**
	 * Returns the meta object for class '{@link targets.avip.DiscreteOutput <em>Discrete Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Output</em>'.
	 * @see targets.avip.DiscreteOutput
	 * @generated
	 */
	EClass getDiscreteOutput();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.DiscreteOutput#getClose_volt_margin <em>Close volt margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Close volt margin</em>'.
	 * @see targets.avip.DiscreteOutput#getClose_volt_margin()
	 * @see #getDiscreteOutput()
	 * @generated
	 */
	EAttribute getDiscreteOutput_Close_volt_margin();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.DiscreteOutput#getInternal_pull_up_voltage <em>Internal pull up voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal pull up voltage</em>'.
	 * @see targets.avip.DiscreteOutput#getInternal_pull_up_voltage()
	 * @see #getDiscreteOutput()
	 * @generated
	 */
	EAttribute getDiscreteOutput_Internal_pull_up_voltage();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.DiscreteOutput#getMax_v_case_gnd_conn <em>Max vcase gnd conn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max vcase gnd conn</em>'.
	 * @see targets.avip.DiscreteOutput#getMax_v_case_gnd_conn()
	 * @see #getDiscreteOutput()
	 * @generated
	 */
	EAttribute getDiscreteOutput_Max_v_case_gnd_conn();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.DiscreteOutput#getNormal_load_resistance <em>Normal load resistance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normal load resistance</em>'.
	 * @see targets.avip.DiscreteOutput#getNormal_load_resistance()
	 * @see #getDiscreteOutput()
	 * @generated
	 */
	EAttribute getDiscreteOutput_Normal_load_resistance();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.DiscreteOutput#getNormal_load_voltage <em>Normal load voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normal load voltage</em>'.
	 * @see targets.avip.DiscreteOutput#getNormal_load_voltage()
	 * @see #getDiscreteOutput()
	 * @generated
	 */
	EAttribute getDiscreteOutput_Normal_load_voltage();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.DiscreteOutput#getOver_current_fault_maturation_duration <em>Over current fault maturation duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Over current fault maturation duration</em>'.
	 * @see targets.avip.DiscreteOutput#getOver_current_fault_maturation_duration()
	 * @see #getDiscreteOutput()
	 * @generated
	 */
	EAttribute getDiscreteOutput_Over_current_fault_maturation_duration();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.DiscreteOutput#getOverload_current_threshold <em>Overload current threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overload current threshold</em>'.
	 * @see targets.avip.DiscreteOutput#getOverload_current_threshold()
	 * @see #getDiscreteOutput()
	 * @generated
	 */
	EAttribute getDiscreteOutput_Overload_current_threshold();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.DiscreteOutput#getShort_circuit_current_threshold <em>Short circuit current threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short circuit current threshold</em>'.
	 * @see targets.avip.DiscreteOutput#getShort_circuit_current_threshold()
	 * @see #getDiscreteOutput()
	 * @generated
	 */
	EAttribute getDiscreteOutput_Short_circuit_current_threshold();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.DiscreteOutput#getSoft_over_current_fault_maturation_duration <em>Soft over current fault maturation duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Soft over current fault maturation duration</em>'.
	 * @see targets.avip.DiscreteOutput#getSoft_over_current_fault_maturation_duration()
	 * @see #getDiscreteOutput()
	 * @generated
	 */
	EAttribute getDiscreteOutput_Soft_over_current_fault_maturation_duration();

	/**
	 * Returns the meta object for class '{@link targets.avip.XTalk <em>XTalk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XTalk</em>'.
	 * @see targets.avip.XTalk
	 * @generated
	 */
	EClass getXTalk();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.XTalk#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see targets.avip.XTalk#getDirection()
	 * @see #getXTalk()
	 * @generated
	 */
	EAttribute getXTalk_Direction();

	/**
	 * Returns the meta object for class '{@link targets.avip.A429 <em>A429</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A429</em>'.
	 * @see targets.avip.A429
	 * @generated
	 */
	EClass getA429();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.A429#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see targets.avip.A429#getDirection()
	 * @see #getA429()
	 * @generated
	 */
	EAttribute getA429_Direction();

	/**
	 * Returns the meta object for class '{@link targets.avip.A664 <em>A664</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A664</em>'.
	 * @see targets.avip.A664
	 * @generated
	 */
	EClass getA664();

	/**
	 * Returns the meta object for class '{@link targets.avip.CAN <em>CAN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CAN</em>'.
	 * @see targets.avip.CAN
	 * @generated
	 */
	EClass getCAN();

	/**
	 * Returns the meta object for class '{@link targets.avip.MEM <em>MEM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MEM</em>'.
	 * @see targets.avip.MEM
	 * @generated
	 */
	EClass getMEM();

	/**
	 * Returns the meta object for the containment reference list '{@link targets.avip.MEM#getMemPortIDExtension <em>Mem Port ID Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mem Port ID Extension</em>'.
	 * @see targets.avip.MEM#getMemPortIDExtension()
	 * @see #getMEM()
	 * @generated
	 */
	EReference getMEM_MemPortIDExtension();

	/**
	 * Returns the meta object for class '{@link targets.avip.V_RTD <em>VRTD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VRTD</em>'.
	 * @see targets.avip.V_RTD
	 * @generated
	 */
	EClass getV_RTD();

	/**
	 * Returns the meta object for class '{@link targets.avip.PortUserConfiguration <em>Port User Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port User Configuration</em>'.
	 * @see targets.avip.PortUserConfiguration
	 * @generated
	 */
	EClass getPortUserConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.PortUserConfiguration#getLine_function <em>Line function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line function</em>'.
	 * @see targets.avip.PortUserConfiguration#getLine_function()
	 * @see #getPortUserConfiguration()
	 * @generated
	 */
	EAttribute getPortUserConfiguration_Line_function();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.PortUserConfiguration#getSpecial_param_1 <em>Special param 1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Special param 1</em>'.
	 * @see targets.avip.PortUserConfiguration#getSpecial_param_1()
	 * @see #getPortUserConfiguration()
	 * @generated
	 */
	EAttribute getPortUserConfiguration_Special_param_1();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.PortUserConfiguration#getSpecial_param_2 <em>Special param 2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Special param 2</em>'.
	 * @see targets.avip.PortUserConfiguration#getSpecial_param_2()
	 * @see #getPortUserConfiguration()
	 * @generated
	 */
	EAttribute getPortUserConfiguration_Special_param_2();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.PortUserConfiguration#getSpecial_param_3 <em>Special param 3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Special param 3</em>'.
	 * @see targets.avip.PortUserConfiguration#getSpecial_param_3()
	 * @see #getPortUserConfiguration()
	 * @generated
	 */
	EAttribute getPortUserConfiguration_Special_param_3();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.PortUserConfiguration#getSpecial_param_4 <em>Special param 4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Special param 4</em>'.
	 * @see targets.avip.PortUserConfiguration#getSpecial_param_4()
	 * @see #getPortUserConfiguration()
	 * @generated
	 */
	EAttribute getPortUserConfiguration_Special_param_4();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.PortUserConfiguration#getSpecial_param_5 <em>Special param 5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Special param 5</em>'.
	 * @see targets.avip.PortUserConfiguration#getSpecial_param_5()
	 * @see #getPortUserConfiguration()
	 * @generated
	 */
	EAttribute getPortUserConfiguration_Special_param_5();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.PortUserConfiguration#getInit_default <em>Init default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init default</em>'.
	 * @see targets.avip.PortUserConfiguration#getInit_default()
	 * @see #getPortUserConfiguration()
	 * @generated
	 */
	EAttribute getPortUserConfiguration_Init_default();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.PortUserConfiguration#getLoss_of_command <em>Loss of command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loss of command</em>'.
	 * @see targets.avip.PortUserConfiguration#getLoss_of_command()
	 * @see #getPortUserConfiguration()
	 * @generated
	 */
	EAttribute getPortUserConfiguration_Loss_of_command();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.PortUserConfiguration#getNb_allowed_resets <em>Nb allowed resets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb allowed resets</em>'.
	 * @see targets.avip.PortUserConfiguration#getNb_allowed_resets()
	 * @see #getPortUserConfiguration()
	 * @generated
	 */
	EAttribute getPortUserConfiguration_Nb_allowed_resets();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.PortUserConfiguration#getReset_wait_time <em>Reset wait time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reset wait time</em>'.
	 * @see targets.avip.PortUserConfiguration#getReset_wait_time()
	 * @see #getPortUserConfiguration()
	 * @generated
	 */
	EAttribute getPortUserConfiguration_Reset_wait_time();

	/**
	 * Returns the meta object for class '{@link targets.avip.AVDSchedulerExtension <em>AVD Scheduler Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AVD Scheduler Extension</em>'.
	 * @see targets.avip.AVDSchedulerExtension
	 * @generated
	 */
	EClass getAVDSchedulerExtension();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.AVDSchedulerExtension#getMif_duration <em>Mif duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mif duration</em>'.
	 * @see targets.avip.AVDSchedulerExtension#getMif_duration()
	 * @see #getAVDSchedulerExtension()
	 * @generated
	 */
	EAttribute getAVDSchedulerExtension_Mif_duration();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.AVDSchedulerExtension#getMaf_duration <em>Maf duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maf duration</em>'.
	 * @see targets.avip.AVDSchedulerExtension#getMaf_duration()
	 * @see #getAVDSchedulerExtension()
	 * @generated
	 */
	EAttribute getAVDSchedulerExtension_Maf_duration();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.AVDSchedulerExtension#getScheduler_id <em>Scheduler id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduler id</em>'.
	 * @see targets.avip.AVDSchedulerExtension#getScheduler_id()
	 * @see #getAVDSchedulerExtension()
	 * @generated
	 */
	EAttribute getAVDSchedulerExtension_Scheduler_id();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.AVDSchedulerExtension#getScheduler_name <em>Scheduler name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduler name</em>'.
	 * @see targets.avip.AVDSchedulerExtension#getScheduler_name()
	 * @see #getAVDSchedulerExtension()
	 * @generated
	 */
	EAttribute getAVDSchedulerExtension_Scheduler_name();

	/**
	 * Returns the meta object for class '{@link targets.avip.SignalExtensions <em>Signal Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Extensions</em>'.
	 * @see targets.avip.SignalExtensions
	 * @generated
	 */
	EClass getSignalExtensions();

	/**
	 * Returns the meta object for the containment reference list '{@link targets.avip.SignalExtensions#getSignalExtension <em>Signal Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signal Extension</em>'.
	 * @see targets.avip.SignalExtensions#getSignalExtension()
	 * @see #getSignalExtensions()
	 * @generated
	 */
	EReference getSignalExtensions_SignalExtension();

	/**
	 * Returns the meta object for class '{@link targets.avip.SignalExtension <em>Signal Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Extension</em>'.
	 * @see targets.avip.SignalExtension
	 * @generated
	 */
	EClass getSignalExtension();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.SignalExtension#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see targets.avip.SignalExtension#getFunction()
	 * @see #getSignalExtension()
	 * @generated
	 */
	EAttribute getSignalExtension_Function();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.SignalExtension#getAssociatedLineName <em>Associated Line Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Associated Line Name</em>'.
	 * @see targets.avip.SignalExtension#getAssociatedLineName()
	 * @see #getSignalExtension()
	 * @generated
	 */
	EAttribute getSignalExtension_AssociatedLineName();

	/**
	 * Returns the meta object for class '{@link targets.avip.MEMPortIDExtension <em>MEM Port ID Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MEM Port ID Extension</em>'.
	 * @see targets.avip.MEMPortIDExtension
	 * @generated
	 */
	EClass getMEMPortIDExtension();

	/**
	 * Returns the meta object for the attribute '{@link targets.avip.MEMPortIDExtension#getPortID <em>Port ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port ID</em>'.
	 * @see targets.avip.MEMPortIDExtension#getPortID()
	 * @see #getMEMPortIDExtension()
	 * @generated
	 */
	EAttribute getMEMPortIDExtension_PortID();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Connector Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * for connector names
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Connector Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='CONNECTOR_NAME_TYPE' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='^[A-Z]{2}$\n'"
	 * @generated
	 */
	EDataType getConnectorNameType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Connector Pin Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * for connector pin names
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Connector Pin Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='CONNECTOR_PIN_NAME_TYPE' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='^[0-9]{2}$'"
	 * @generated
	 */
	EDataType getConnectorPinNameType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AvipFactory getAvipFactory();

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
		 * The meta object literal for the '{@link targets.avip.impl.AvionicsVirtualDeviceImpl <em>Avionics Virtual Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.avip.impl.AvionicsVirtualDeviceImpl
		 * @see targets.avip.impl.AvipPackageImpl#getAvionicsVirtualDevice()
		 * @generated
		 */
		EClass AVIONICS_VIRTUAL_DEVICE = eINSTANCE.getAvionicsVirtualDevice();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVIONICS_VIRTUAL_DEVICE__PORTS = eINSTANCE.getAvionicsVirtualDevice_Ports();

		/**
		 * The meta object literal for the '<em><b>Schedule Extension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVIONICS_VIRTUAL_DEVICE__SCHEDULE_EXTENSION = eINSTANCE.getAvionicsVirtualDevice_ScheduleExtension();

		/**
		 * The meta object literal for the '{@link targets.avip.impl.AVDPortsImpl <em>AVD Ports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.avip.impl.AVDPortsImpl
		 * @see targets.avip.impl.AvipPackageImpl#getAVDPorts()
		 * @generated
		 */
		EClass AVD_PORTS = eINSTANCE.getAVDPorts();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVD_PORTS__PORT = eINSTANCE.getAVDPorts_Port();

		/**
		 * The meta object literal for the '{@link targets.avip.impl.SuperAVDPortTypeImpl <em>Super AVD Port Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.avip.impl.SuperAVDPortTypeImpl
		 * @see targets.avip.impl.AvipPackageImpl#getSuperAVDPortType()
		 * @generated
		 */
		EClass SUPER_AVD_PORT_TYPE = eINSTANCE.getSuperAVDPortType();

		/**
		 * The meta object literal for the '<em><b>Connector Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_AVD_PORT_TYPE__CONNECTOR_NAME = eINSTANCE.getSuperAVDPortType_ConnectorName();

		/**
		 * The meta object literal for the '<em><b>Connector Pin Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_AVD_PORT_TYPE__CONNECTOR_PIN_NAME = eINSTANCE.getSuperAVDPortType_ConnectorPinName();

		/**
		 * The meta object literal for the '<em><b>If id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_AVD_PORT_TYPE__IF_ID = eINSTANCE.getSuperAVDPortType_If_id();

		/**
		 * The meta object literal for the '<em><b>Functional Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_AVD_PORT_TYPE__FUNCTIONAL_DATA = eINSTANCE.getSuperAVDPortType_FunctionalData();

		/**
		 * The meta object literal for the '<em><b>Port User Configuration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_AVD_PORT_TYPE__PORT_USER_CONFIGURATION = eINSTANCE.getSuperAVDPortType_PortUserConfiguration();

		/**
		 * The meta object literal for the '<em><b>Signal Extensions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_AVD_PORT_TYPE__SIGNAL_EXTENSIONS = eINSTANCE.getSuperAVDPortType_SignalExtensions();

		/**
		 * The meta object literal for the '{@link targets.avip.impl.FunctionalDataImpl <em>Functional Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.avip.impl.FunctionalDataImpl
		 * @see targets.avip.impl.AvipPackageImpl#getFunctionalData()
		 * @generated
		 */
		EClass FUNCTIONAL_DATA = eINSTANCE.getFunctionalData();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_DATA__DIRECTION = eINSTANCE.getFunctionalData_Direction();

		/**
		 * The meta object literal for the '<em><b>If signal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_DATA__IF_SIGNAL = eINSTANCE.getFunctionalData_If_signal();

		/**
		 * The meta object literal for the '<em><b>Param type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_DATA__PARAM_TYPE = eINSTANCE.getFunctionalData_Param_type();

		/**
		 * The meta object literal for the '<em><b>Param length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_DATA__PARAM_LENGTH = eINSTANCE.getFunctionalData_Param_length();

		/**
		 * The meta object literal for the '{@link targets.avip.impl.SuperWiredPortTypeImpl <em>Super Wired Port Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.avip.impl.SuperWiredPortTypeImpl
		 * @see targets.avip.impl.AvipPackageImpl#getSuperWiredPortType()
		 * @generated
		 */
		EClass SUPER_WIRED_PORT_TYPE = eINSTANCE.getSuperWiredPortType();

		/**
		 * The meta object literal for the '<em><b>Max rev v</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_WIRED_PORT_TYPE__MAX_REV_V = eINSTANCE.getSuperWiredPortType_Max_rev_v();

		/**
		 * The meta object literal for the '{@link targets.avip.impl.SuperAnaloguePortTypeImpl <em>Super Analogue Port Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.avip.impl.SuperAnaloguePortTypeImpl
		 * @see targets.avip.impl.AvipPackageImpl#getSuperAnaloguePortType()
		 * @generated
		 */
		EClass SUPER_ANALOGUE_PORT_TYPE = eINSTANCE.getSuperAnaloguePortType();

		/**
		 * The meta object literal for the '<em><b>Min rev v</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_ANALOGUE_PORT_TYPE__MIN_REV_V = eINSTANCE.getSuperAnaloguePortType_Min_rev_v();

		/**
		 * The meta object literal for the '{@link targets.avip.impl.AnalogueInputImpl <em>Analogue Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.avip.impl.AnalogueInputImpl
		 * @see targets.avip.impl.AvipPackageImpl#getAnalogueInput()
		 * @generated
		 */
		EClass ANALOGUE_INPUT = eINSTANCE.getAnalogueInput();

		/**
		 * The meta object literal for the '<em><b>Ai voltage max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALOGUE_INPUT__AI_VOLTAGE_MAX = eINSTANCE.getAnalogueInput_Ai_voltage_max();

		/**
		 * The meta object literal for the '<em><b>Ai voltage max vac filtered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALOGUE_INPUT__AI_VOLTAGE_MAX_VAC_FILTERED = eINSTANCE.getAnalogueInput_Ai_voltage_max_vac_filtered();

		/**
		 * The meta object literal for the '<em><b>Ai voltage max vdc filtered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALOGUE_INPUT__AI_VOLTAGE_MAX_VDC_FILTERED = eINSTANCE.getAnalogueInput_Ai_voltage_max_vdc_filtered();

		/**
		 * The meta object literal for the '<em><b>Ai voltage min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALOGUE_INPUT__AI_VOLTAGE_MIN = eINSTANCE.getAnalogueInput_Ai_voltage_min();

		/**
		 * The meta object literal for the '<em><b>Ai voltage min vdc filtered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALOGUE_INPUT__AI_VOLTAGE_MIN_VDC_FILTERED = eINSTANCE.getAnalogueInput_Ai_voltage_min_vdc_filtered();

		/**
		 * The meta object literal for the '<em><b>Min ai frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALOGUE_INPUT__MIN_AI_FREQUENCY = eINSTANCE.getAnalogueInput_Min_ai_frequency();

		/**
		 * The meta object literal for the '{@link targets.avip.impl.AnalogueOutputImpl <em>Analogue Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.avip.impl.AnalogueOutputImpl
		 * @see targets.avip.impl.AvipPackageImpl#getAnalogueOutput()
		 * @generated
		 */
		EClass ANALOGUE_OUTPUT = eINSTANCE.getAnalogueOutput();

		/**
		 * The meta object literal for the '<em><b>Ao voltage cmd ac max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_AC_MAX = eINSTANCE.getAnalogueOutput_Ao_voltage_cmd_ac_max();

		/**
		 * The meta object literal for the '<em><b>Ao voltage cmd ac min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_AC_MIN = eINSTANCE.getAnalogueOutput_Ao_voltage_cmd_ac_min();

		/**
		 * The meta object literal for the '<em><b>Ao voltage cmd dc max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_DC_MAX = eINSTANCE.getAnalogueOutput_Ao_voltage_cmd_dc_max();

		/**
		 * The meta object literal for the '<em><b>Ao voltage cmd dc min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_DC_MIN = eINSTANCE.getAnalogueOutput_Ao_voltage_cmd_dc_min();

		/**
		 * The meta object literal for the '<em><b>Ao voltage cmd max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_MAX = eINSTANCE.getAnalogueOutput_Ao_voltage_cmd_max();

		/**
		 * The meta object literal for the '<em><b>Ao voltage cmd min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_MIN = eINSTANCE.getAnalogueOutput_Ao_voltage_cmd_min();

		/**
		 * The meta object literal for the '<em><b>Over current threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALOGUE_OUTPUT__OVER_CURRENT_THRESHOLD = eINSTANCE.getAnalogueOutput_Over_current_threshold();

		/**
		 * The meta object literal for the '{@link targets.avip.impl.DiscreteInputImpl <em>Discrete Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.avip.impl.DiscreteInputImpl
		 * @see targets.avip.impl.AvipPackageImpl#getDiscreteInput()
		 * @generated
		 */
		EClass DISCRETE_INPUT = eINSTANCE.getDiscreteInput();

		/**
		 * The meta object literal for the '<em><b>Hpp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRETE_INPUT__HPP = eINSTANCE.getDiscreteInput_Hpp();

		/**
		 * The meta object literal for the '<em><b>Hpp port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRETE_INPUT__HPP_PORT = eINSTANCE.getDiscreteInput_Hpp_port();

		/**
		 * The meta object literal for the '<em><b>Max polarisation voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRETE_INPUT__MAX_POLARISATION_VOLTAGE = eINSTANCE.getDiscreteInput_Max_polarisation_voltage();

		/**
		 * The meta object literal for the '<em><b>Max voltage gnd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRETE_INPUT__MAX_VOLTAGE_GND = eINSTANCE.getDiscreteInput_Max_voltage_gnd();

		/**
		 * The meta object literal for the '<em><b>Min voltage gnd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRETE_INPUT__MIN_VOLTAGE_GND = eINSTANCE.getDiscreteInput_Min_voltage_gnd();

		/**
		 * The meta object literal for the '<em><b>Max voltage opn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRETE_INPUT__MAX_VOLTAGE_OPN = eINSTANCE.getDiscreteInput_Max_voltage_opn();

		/**
		 * The meta object literal for the '<em><b>Min voltage opn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRETE_INPUT__MIN_VOLTAGE_OPN = eINSTANCE.getDiscreteInput_Min_voltage_opn();

		/**
		 * The meta object literal for the '<em><b>Polarisation failure dematuration duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRETE_INPUT__POLARISATION_FAILURE_DEMATURATION_DURATION = eINSTANCE.getDiscreteInput_Polarisation_failure_dematuration_duration();

		/**
		 * The meta object literal for the '<em><b>Polarisation failure maturation duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRETE_INPUT__POLARISATION_FAILURE_MATURATION_DURATION = eINSTANCE.getDiscreteInput_Polarisation_failure_maturation_duration();

		/**
		 * The meta object literal for the '{@link targets.avip.impl.DiscreteOutputImpl <em>Discrete Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.avip.impl.DiscreteOutputImpl
		 * @see targets.avip.impl.AvipPackageImpl#getDiscreteOutput()
		 * @generated
		 */
		EClass DISCRETE_OUTPUT = eINSTANCE.getDiscreteOutput();

		/**
		 * The meta object literal for the '<em><b>Close volt margin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRETE_OUTPUT__CLOSE_VOLT_MARGIN = eINSTANCE.getDiscreteOutput_Close_volt_margin();

		/**
		 * The meta object literal for the '<em><b>Internal pull up voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRETE_OUTPUT__INTERNAL_PULL_UP_VOLTAGE = eINSTANCE.getDiscreteOutput_Internal_pull_up_voltage();

		/**
		 * The meta object literal for the '<em><b>Max vcase gnd conn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRETE_OUTPUT__MAX_VCASE_GND_CONN = eINSTANCE.getDiscreteOutput_Max_v_case_gnd_conn();

		/**
		 * The meta object literal for the '<em><b>Normal load resistance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRETE_OUTPUT__NORMAL_LOAD_RESISTANCE = eINSTANCE.getDiscreteOutput_Normal_load_resistance();

		/**
		 * The meta object literal for the '<em><b>Normal load voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRETE_OUTPUT__NORMAL_LOAD_VOLTAGE = eINSTANCE.getDiscreteOutput_Normal_load_voltage();

		/**
		 * The meta object literal for the '<em><b>Over current fault maturation duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRETE_OUTPUT__OVER_CURRENT_FAULT_MATURATION_DURATION = eINSTANCE.getDiscreteOutput_Over_current_fault_maturation_duration();

		/**
		 * The meta object literal for the '<em><b>Overload current threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRETE_OUTPUT__OVERLOAD_CURRENT_THRESHOLD = eINSTANCE.getDiscreteOutput_Overload_current_threshold();

		/**
		 * The meta object literal for the '<em><b>Short circuit current threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRETE_OUTPUT__SHORT_CIRCUIT_CURRENT_THRESHOLD = eINSTANCE.getDiscreteOutput_Short_circuit_current_threshold();

		/**
		 * The meta object literal for the '<em><b>Soft over current fault maturation duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRETE_OUTPUT__SOFT_OVER_CURRENT_FAULT_MATURATION_DURATION = eINSTANCE.getDiscreteOutput_Soft_over_current_fault_maturation_duration();

		/**
		 * The meta object literal for the '{@link targets.avip.impl.XTalkImpl <em>XTalk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.avip.impl.XTalkImpl
		 * @see targets.avip.impl.AvipPackageImpl#getXTalk()
		 * @generated
		 */
		EClass XTALK = eINSTANCE.getXTalk();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XTALK__DIRECTION = eINSTANCE.getXTalk_Direction();

		/**
		 * The meta object literal for the '{@link targets.avip.impl.A429Impl <em>A429</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.avip.impl.A429Impl
		 * @see targets.avip.impl.AvipPackageImpl#getA429()
		 * @generated
		 */
		EClass A429 = eINSTANCE.getA429();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A429__DIRECTION = eINSTANCE.getA429_Direction();

		/**
		 * The meta object literal for the '{@link targets.avip.impl.A664Impl <em>A664</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.avip.impl.A664Impl
		 * @see targets.avip.impl.AvipPackageImpl#getA664()
		 * @generated
		 */
		EClass A664 = eINSTANCE.getA664();

		/**
		 * The meta object literal for the '{@link targets.avip.impl.CANImpl <em>CAN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.avip.impl.CANImpl
		 * @see targets.avip.impl.AvipPackageImpl#getCAN()
		 * @generated
		 */
		EClass CAN = eINSTANCE.getCAN();

		/**
		 * The meta object literal for the '{@link targets.avip.impl.MEMImpl <em>MEM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.avip.impl.MEMImpl
		 * @see targets.avip.impl.AvipPackageImpl#getMEM()
		 * @generated
		 */
		EClass MEM = eINSTANCE.getMEM();

		/**
		 * The meta object literal for the '<em><b>Mem Port ID Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEM__MEM_PORT_ID_EXTENSION = eINSTANCE.getMEM_MemPortIDExtension();

		/**
		 * The meta object literal for the '{@link targets.avip.impl.V_RTDImpl <em>VRTD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.avip.impl.V_RTDImpl
		 * @see targets.avip.impl.AvipPackageImpl#getV_RTD()
		 * @generated
		 */
		EClass VRTD = eINSTANCE.getV_RTD();

		/**
		 * The meta object literal for the '{@link targets.avip.impl.PortUserConfigurationImpl <em>Port User Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.avip.impl.PortUserConfigurationImpl
		 * @see targets.avip.impl.AvipPackageImpl#getPortUserConfiguration()
		 * @generated
		 */
		EClass PORT_USER_CONFIGURATION = eINSTANCE.getPortUserConfiguration();

		/**
		 * The meta object literal for the '<em><b>Line function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_USER_CONFIGURATION__LINE_FUNCTION = eINSTANCE.getPortUserConfiguration_Line_function();

		/**
		 * The meta object literal for the '<em><b>Special param 1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_USER_CONFIGURATION__SPECIAL_PARAM_1 = eINSTANCE.getPortUserConfiguration_Special_param_1();

		/**
		 * The meta object literal for the '<em><b>Special param 2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_USER_CONFIGURATION__SPECIAL_PARAM_2 = eINSTANCE.getPortUserConfiguration_Special_param_2();

		/**
		 * The meta object literal for the '<em><b>Special param 3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_USER_CONFIGURATION__SPECIAL_PARAM_3 = eINSTANCE.getPortUserConfiguration_Special_param_3();

		/**
		 * The meta object literal for the '<em><b>Special param 4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_USER_CONFIGURATION__SPECIAL_PARAM_4 = eINSTANCE.getPortUserConfiguration_Special_param_4();

		/**
		 * The meta object literal for the '<em><b>Special param 5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_USER_CONFIGURATION__SPECIAL_PARAM_5 = eINSTANCE.getPortUserConfiguration_Special_param_5();

		/**
		 * The meta object literal for the '<em><b>Init default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_USER_CONFIGURATION__INIT_DEFAULT = eINSTANCE.getPortUserConfiguration_Init_default();

		/**
		 * The meta object literal for the '<em><b>Loss of command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_USER_CONFIGURATION__LOSS_OF_COMMAND = eINSTANCE.getPortUserConfiguration_Loss_of_command();

		/**
		 * The meta object literal for the '<em><b>Nb allowed resets</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_USER_CONFIGURATION__NB_ALLOWED_RESETS = eINSTANCE.getPortUserConfiguration_Nb_allowed_resets();

		/**
		 * The meta object literal for the '<em><b>Reset wait time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_USER_CONFIGURATION__RESET_WAIT_TIME = eINSTANCE.getPortUserConfiguration_Reset_wait_time();

		/**
		 * The meta object literal for the '{@link targets.avip.impl.AVDSchedulerExtensionImpl <em>AVD Scheduler Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.avip.impl.AVDSchedulerExtensionImpl
		 * @see targets.avip.impl.AvipPackageImpl#getAVDSchedulerExtension()
		 * @generated
		 */
		EClass AVD_SCHEDULER_EXTENSION = eINSTANCE.getAVDSchedulerExtension();

		/**
		 * The meta object literal for the '<em><b>Mif duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVD_SCHEDULER_EXTENSION__MIF_DURATION = eINSTANCE.getAVDSchedulerExtension_Mif_duration();

		/**
		 * The meta object literal for the '<em><b>Maf duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVD_SCHEDULER_EXTENSION__MAF_DURATION = eINSTANCE.getAVDSchedulerExtension_Maf_duration();

		/**
		 * The meta object literal for the '<em><b>Scheduler id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVD_SCHEDULER_EXTENSION__SCHEDULER_ID = eINSTANCE.getAVDSchedulerExtension_Scheduler_id();

		/**
		 * The meta object literal for the '<em><b>Scheduler name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVD_SCHEDULER_EXTENSION__SCHEDULER_NAME = eINSTANCE.getAVDSchedulerExtension_Scheduler_name();

		/**
		 * The meta object literal for the '{@link targets.avip.impl.SignalExtensionsImpl <em>Signal Extensions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.avip.impl.SignalExtensionsImpl
		 * @see targets.avip.impl.AvipPackageImpl#getSignalExtensions()
		 * @generated
		 */
		EClass SIGNAL_EXTENSIONS = eINSTANCE.getSignalExtensions();

		/**
		 * The meta object literal for the '<em><b>Signal Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_EXTENSIONS__SIGNAL_EXTENSION = eINSTANCE.getSignalExtensions_SignalExtension();

		/**
		 * The meta object literal for the '{@link targets.avip.impl.SignalExtensionImpl <em>Signal Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.avip.impl.SignalExtensionImpl
		 * @see targets.avip.impl.AvipPackageImpl#getSignalExtension()
		 * @generated
		 */
		EClass SIGNAL_EXTENSION = eINSTANCE.getSignalExtension();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL_EXTENSION__FUNCTION = eINSTANCE.getSignalExtension_Function();

		/**
		 * The meta object literal for the '<em><b>Associated Line Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL_EXTENSION__ASSOCIATED_LINE_NAME = eINSTANCE.getSignalExtension_AssociatedLineName();

		/**
		 * The meta object literal for the '{@link targets.avip.impl.MEMPortIDExtensionImpl <em>MEM Port ID Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.avip.impl.MEMPortIDExtensionImpl
		 * @see targets.avip.impl.AvipPackageImpl#getMEMPortIDExtension()
		 * @generated
		 */
		EClass MEM_PORT_ID_EXTENSION = eINSTANCE.getMEMPortIDExtension();

		/**
		 * The meta object literal for the '<em><b>Port ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEM_PORT_ID_EXTENSION__PORT_ID = eINSTANCE.getMEMPortIDExtension_PortID();

		/**
		 * The meta object literal for the '<em>Connector Name Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see targets.avip.impl.AvipPackageImpl#getConnectorNameType()
		 * @generated
		 */
		EDataType CONNECTOR_NAME_TYPE = eINSTANCE.getConnectorNameType();

		/**
		 * The meta object literal for the '<em>Connector Pin Name Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see targets.avip.impl.AvipPackageImpl#getConnectorPinNameType()
		 * @generated
		 */
		EDataType CONNECTOR_PIN_NAME_TYPE = eINSTANCE.getConnectorPinNameType();

	}

} //AvipPackage
