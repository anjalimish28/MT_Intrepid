/**
 */
package targets.cpn;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see targets.cpn.CpnFactory
 * @model kind="package"
 * @generated
 */
public interface CpnPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cpn";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://gitlab.com/ucof/ucof.de/model/v001/ucof/targets/cpn";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ucof.model.targets.cpn";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CpnPackage eINSTANCE = targets.cpn.impl.CpnPackageImpl.init();

	/**
	 * The meta object id for the '{@link targets.cpn.impl.va41620peb1Impl <em>va41620peb1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.cpn.impl.va41620peb1Impl
	 * @see targets.cpn.impl.CpnPackageImpl#getva41620peb1()
	 * @generated
	 */
	int VA41620PEB1 = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VA41620PEB1__ID = TargetsPackage.SUPER_TARGET_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VA41620PEB1__NAME = TargetsPackage.SUPER_TARGET_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VA41620PEB1__DOCUMENTATION = TargetsPackage.SUPER_TARGET_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VA41620PEB1__MODIFIED = TargetsPackage.SUPER_TARGET_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VA41620PEB1__MODIFIER = TargetsPackage.SUPER_TARGET_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VA41620PEB1__TRACE_LINK = TargetsPackage.SUPER_TARGET_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VA41620PEB1__CREATED = TargetsPackage.SUPER_TARGET_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VA41620PEB1__CREATOR = TargetsPackage.SUPER_TARGET_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VA41620PEB1__VERSION = TargetsPackage.SUPER_TARGET_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VA41620PEB1__PROJECT_NAME = TargetsPackage.SUPER_TARGET_TYPE__PROJECT_NAME;

	/**
	 * The feature id for the '<em><b>Electrical Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VA41620PEB1__ELECTRICAL_INTERFACES = TargetsPackage.SUPER_TARGET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VA41620PEB1__PORTS = TargetsPackage.SUPER_TARGET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Msg Box Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VA41620PEB1__MSG_BOX_EXTENSION = TargetsPackage.SUPER_TARGET_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Can Driver Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VA41620PEB1__CAN_DRIVER_CONFIG = TargetsPackage.SUPER_TARGET_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>va41620peb1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VA41620PEB1_FEATURE_COUNT = TargetsPackage.SUPER_TARGET_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>va41620peb1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VA41620PEB1_OPERATION_COUNT = TargetsPackage.SUPER_TARGET_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.cpn.impl.voragoPortsImpl <em>vorago Ports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.cpn.impl.voragoPortsImpl
	 * @see targets.cpn.impl.CpnPackageImpl#getvoragoPorts()
	 * @generated
	 */
	int VORAGO_PORTS = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORAGO_PORTS__DOCUMENTATION = EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORAGO_PORTS__MODIFIED = EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORAGO_PORTS__MODIFIER = EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORAGO_PORTS__TRACE_LINK = EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORAGO_PORTS__CREATED = EtypesPackage.SUPER_TRACKING_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORAGO_PORTS__CREATOR = EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORAGO_PORTS__VERSION = EtypesPackage.SUPER_TRACKING_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORAGO_PORTS__ID = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORAGO_PORTS__NAME = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORAGO_PORTS__PORT = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>vorago Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORAGO_PORTS_FEATURE_COUNT = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>vorago Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORAGO_PORTS_OPERATION_COUNT = EtypesPackage.SUPER_TRACKING_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.cpn.impl.voragoPortImpl <em>vorago Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.cpn.impl.voragoPortImpl
	 * @see targets.cpn.impl.CpnPackageImpl#getvoragoPort()
	 * @generated
	 */
	int VORAGO_PORT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORAGO_PORT__ID = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORAGO_PORT__NAME = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORAGO_PORT__DOCUMENTATION = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORAGO_PORT__MODIFIED = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORAGO_PORT__MODIFIER = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORAGO_PORT__TRACE_LINK = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORAGO_PORT__CREATED = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORAGO_PORT__CREATOR = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORAGO_PORT__VERSION = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Pin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORAGO_PORT__PIN_NAME = TargetsPackage.SUPER_HARDWARE_PORT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pin Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORAGO_PORT__PIN_NUMBER = TargetsPackage.SUPER_HARDWARE_PORT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>vorago Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORAGO_PORT_FEATURE_COUNT = TargetsPackage.SUPER_HARDWARE_PORT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>vorago Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORAGO_PORT_OPERATION_COUNT = TargetsPackage.SUPER_HARDWARE_PORT_TYPE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link targets.cpn.impl.CanDriverConfigImpl <em>Can Driver Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.cpn.impl.CanDriverConfigImpl
	 * @see targets.cpn.impl.CpnPackageImpl#getCanDriverConfig()
	 * @generated
	 */
	int CAN_DRIVER_CONFIG = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_DRIVER_CONFIG__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_DRIVER_CONFIG__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_DRIVER_CONFIG__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_DRIVER_CONFIG__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_DRIVER_CONFIG__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_DRIVER_CONFIG__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_DRIVER_CONFIG__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_DRIVER_CONFIG__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_DRIVER_CONFIG__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Interface ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_DRIVER_CONFIG__INTERFACE_ID = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Can Peripheral Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_DRIVER_CONFIG__CAN_PERIPHERAL_INSTANCE = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Operating Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_DRIVER_CONFIG__OPERATING_MODE = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Extended Id Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_DRIVER_CONFIG__EXTENDED_ID_ENABLED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Ring Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_DRIVER_CONFIG__RING_BUFFER_SIZE = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Can Driver Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_DRIVER_CONFIG_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Can Driver Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_DRIVER_CONFIG_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.cpn.CanOperatingMode <em>Can Operating Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.cpn.CanOperatingMode
	 * @see targets.cpn.impl.CpnPackageImpl#getCanOperatingMode()
	 * @generated
	 */
	int CAN_OPERATING_MODE = 4;


	/**
	 * Returns the meta object for class '{@link targets.cpn.va41620peb1 <em>va41620peb1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>va41620peb1</em>'.
	 * @see targets.cpn.va41620peb1
	 * @generated
	 */
	EClass getva41620peb1();

	/**
	 * Returns the meta object for the containment reference '{@link targets.cpn.va41620peb1#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ports</em>'.
	 * @see targets.cpn.va41620peb1#getPorts()
	 * @see #getva41620peb1()
	 * @generated
	 */
	EReference getva41620peb1_Ports();

	/**
	 * Returns the meta object for the containment reference '{@link targets.cpn.va41620peb1#getMsgBoxExtension <em>Msg Box Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Msg Box Extension</em>'.
	 * @see targets.cpn.va41620peb1#getMsgBoxExtension()
	 * @see #getva41620peb1()
	 * @generated
	 */
	EReference getva41620peb1_MsgBoxExtension();

	/**
	 * Returns the meta object for the containment reference '{@link targets.cpn.va41620peb1#getCanDriverConfig <em>Can Driver Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Can Driver Config</em>'.
	 * @see targets.cpn.va41620peb1#getCanDriverConfig()
	 * @see #getva41620peb1()
	 * @generated
	 */
	EReference getva41620peb1_CanDriverConfig();

	/**
	 * Returns the meta object for class '{@link targets.cpn.voragoPorts <em>vorago Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>vorago Ports</em>'.
	 * @see targets.cpn.voragoPorts
	 * @generated
	 */
	EClass getvoragoPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link targets.cpn.voragoPorts#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see targets.cpn.voragoPorts#getPort()
	 * @see #getvoragoPorts()
	 * @generated
	 */
	EReference getvoragoPorts_Port();

	/**
	 * Returns the meta object for class '{@link targets.cpn.voragoPort <em>vorago Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>vorago Port</em>'.
	 * @see targets.cpn.voragoPort
	 * @generated
	 */
	EClass getvoragoPort();

	/**
	 * Returns the meta object for the attribute '{@link targets.cpn.voragoPort#getPinName <em>Pin Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin Name</em>'.
	 * @see targets.cpn.voragoPort#getPinName()
	 * @see #getvoragoPort()
	 * @generated
	 */
	EAttribute getvoragoPort_PinName();

	/**
	 * Returns the meta object for the attribute '{@link targets.cpn.voragoPort#getPinNumber <em>Pin Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin Number</em>'.
	 * @see targets.cpn.voragoPort#getPinNumber()
	 * @see #getvoragoPort()
	 * @generated
	 */
	EAttribute getvoragoPort_PinNumber();

	/**
	 * Returns the meta object for class '{@link targets.cpn.CanDriverConfig <em>Can Driver Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Can Driver Config</em>'.
	 * @see targets.cpn.CanDriverConfig
	 * @generated
	 */
	EClass getCanDriverConfig();

	/**
	 * Returns the meta object for the attribute '{@link targets.cpn.CanDriverConfig#getInterfaceID <em>Interface ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface ID</em>'.
	 * @see targets.cpn.CanDriverConfig#getInterfaceID()
	 * @see #getCanDriverConfig()
	 * @generated
	 */
	EAttribute getCanDriverConfig_InterfaceID();

	/**
	 * Returns the meta object for the attribute '{@link targets.cpn.CanDriverConfig#getCanPeripheralInstance <em>Can Peripheral Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Peripheral Instance</em>'.
	 * @see targets.cpn.CanDriverConfig#getCanPeripheralInstance()
	 * @see #getCanDriverConfig()
	 * @generated
	 */
	EAttribute getCanDriverConfig_CanPeripheralInstance();

	/**
	 * Returns the meta object for the attribute '{@link targets.cpn.CanDriverConfig#getOperatingMode <em>Operating Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operating Mode</em>'.
	 * @see targets.cpn.CanDriverConfig#getOperatingMode()
	 * @see #getCanDriverConfig()
	 * @generated
	 */
	EAttribute getCanDriverConfig_OperatingMode();

	/**
	 * Returns the meta object for the attribute '{@link targets.cpn.CanDriverConfig#isExtendedIdEnabled <em>Extended Id Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extended Id Enabled</em>'.
	 * @see targets.cpn.CanDriverConfig#isExtendedIdEnabled()
	 * @see #getCanDriverConfig()
	 * @generated
	 */
	EAttribute getCanDriverConfig_ExtendedIdEnabled();

	/**
	 * Returns the meta object for the attribute '{@link targets.cpn.CanDriverConfig#getRingBufferSize <em>Ring Buffer Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ring Buffer Size</em>'.
	 * @see targets.cpn.CanDriverConfig#getRingBufferSize()
	 * @see #getCanDriverConfig()
	 * @generated
	 */
	EAttribute getCanDriverConfig_RingBufferSize();

	/**
	 * Returns the meta object for enum '{@link targets.cpn.CanOperatingMode <em>Can Operating Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Can Operating Mode</em>'.
	 * @see targets.cpn.CanOperatingMode
	 * @generated
	 */
	EEnum getCanOperatingMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CpnFactory getCpnFactory();

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
		 * The meta object literal for the '{@link targets.cpn.impl.va41620peb1Impl <em>va41620peb1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.cpn.impl.va41620peb1Impl
		 * @see targets.cpn.impl.CpnPackageImpl#getva41620peb1()
		 * @generated
		 */
		EClass VA41620PEB1 = eINSTANCE.getva41620peb1();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VA41620PEB1__PORTS = eINSTANCE.getva41620peb1_Ports();

		/**
		 * The meta object literal for the '<em><b>Msg Box Extension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VA41620PEB1__MSG_BOX_EXTENSION = eINSTANCE.getva41620peb1_MsgBoxExtension();

		/**
		 * The meta object literal for the '<em><b>Can Driver Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VA41620PEB1__CAN_DRIVER_CONFIG = eINSTANCE.getva41620peb1_CanDriverConfig();

		/**
		 * The meta object literal for the '{@link targets.cpn.impl.voragoPortsImpl <em>vorago Ports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.cpn.impl.voragoPortsImpl
		 * @see targets.cpn.impl.CpnPackageImpl#getvoragoPorts()
		 * @generated
		 */
		EClass VORAGO_PORTS = eINSTANCE.getvoragoPorts();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VORAGO_PORTS__PORT = eINSTANCE.getvoragoPorts_Port();

		/**
		 * The meta object literal for the '{@link targets.cpn.impl.voragoPortImpl <em>vorago Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.cpn.impl.voragoPortImpl
		 * @see targets.cpn.impl.CpnPackageImpl#getvoragoPort()
		 * @generated
		 */
		EClass VORAGO_PORT = eINSTANCE.getvoragoPort();

		/**
		 * The meta object literal for the '<em><b>Pin Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VORAGO_PORT__PIN_NAME = eINSTANCE.getvoragoPort_PinName();

		/**
		 * The meta object literal for the '<em><b>Pin Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VORAGO_PORT__PIN_NUMBER = eINSTANCE.getvoragoPort_PinNumber();

		/**
		 * The meta object literal for the '{@link targets.cpn.impl.CanDriverConfigImpl <em>Can Driver Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.cpn.impl.CanDriverConfigImpl
		 * @see targets.cpn.impl.CpnPackageImpl#getCanDriverConfig()
		 * @generated
		 */
		EClass CAN_DRIVER_CONFIG = eINSTANCE.getCanDriverConfig();

		/**
		 * The meta object literal for the '<em><b>Interface ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAN_DRIVER_CONFIG__INTERFACE_ID = eINSTANCE.getCanDriverConfig_InterfaceID();

		/**
		 * The meta object literal for the '<em><b>Can Peripheral Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAN_DRIVER_CONFIG__CAN_PERIPHERAL_INSTANCE = eINSTANCE.getCanDriverConfig_CanPeripheralInstance();

		/**
		 * The meta object literal for the '<em><b>Operating Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAN_DRIVER_CONFIG__OPERATING_MODE = eINSTANCE.getCanDriverConfig_OperatingMode();

		/**
		 * The meta object literal for the '<em><b>Extended Id Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAN_DRIVER_CONFIG__EXTENDED_ID_ENABLED = eINSTANCE.getCanDriverConfig_ExtendedIdEnabled();

		/**
		 * The meta object literal for the '<em><b>Ring Buffer Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAN_DRIVER_CONFIG__RING_BUFFER_SIZE = eINSTANCE.getCanDriverConfig_RingBufferSize();

		/**
		 * The meta object literal for the '{@link targets.cpn.CanOperatingMode <em>Can Operating Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.cpn.CanOperatingMode
		 * @see targets.cpn.impl.CpnPackageImpl#getCanOperatingMode()
		 * @generated
		 */
		EEnum CAN_OPERATING_MODE = eINSTANCE.getCanOperatingMode();

	}

} //CpnPackage
