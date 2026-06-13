/**
 */
package targets.rdc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import targets.TargetsPackage;

import targets.powergrid.PowergridPackage;
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
 * @see targets.rdc.RdcFactory
 * @model kind="package"
 * @generated
 */
public interface RdcPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rdc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://gitlab.com/ucof/ucof.de/model/v001/ucof/targets/rdc";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ucof.model.targets.rdc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RdcPackage eINSTANCE = targets.rdc.impl.RdcPackageImpl.init();

	/**
	 * The meta object id for the '{@link targets.rdc.impl.stm32f446reImpl <em>stm32f446re</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.rdc.impl.stm32f446reImpl
	 * @see targets.rdc.impl.RdcPackageImpl#getstm32f446re()
	 * @generated
	 */
	int STM32F446RE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM32F446RE__ID = PowergridPackage.SUPER_POWER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM32F446RE__NAME = PowergridPackage.SUPER_POWER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM32F446RE__DOCUMENTATION = PowergridPackage.SUPER_POWER_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM32F446RE__MODIFIED = PowergridPackage.SUPER_POWER_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM32F446RE__MODIFIER = PowergridPackage.SUPER_POWER_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM32F446RE__TRACE_LINK = PowergridPackage.SUPER_POWER_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM32F446RE__CREATED = PowergridPackage.SUPER_POWER_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM32F446RE__CREATOR = PowergridPackage.SUPER_POWER_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM32F446RE__VERSION = PowergridPackage.SUPER_POWER_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Electrical Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM32F446RE__ELECTRICAL_INTERFACES = PowergridPackage.SUPER_POWER_TYPE__ELECTRICAL_INTERFACES;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM32F446RE__PROJECT_NAME = PowergridPackage.SUPER_POWER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM32F446RE__SIZE = PowergridPackage.SUPER_POWER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM32F446RE__PORTS = PowergridPackage.SUPER_POWER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Stm Timing Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM32F446RE__STM_TIMING_CONFIG = PowergridPackage.SUPER_POWER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Msg Box Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM32F446RE__MSG_BOX_EXTENSION = PowergridPackage.SUPER_POWER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>stm32f446re</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM32F446RE_FEATURE_COUNT = PowergridPackage.SUPER_POWER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>stm32f446re</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM32F446RE_OPERATION_COUNT = PowergridPackage.SUPER_POWER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.rdc.impl.stmTimingConfigImpl <em>stm Timing Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.rdc.impl.stmTimingConfigImpl
	 * @see targets.rdc.impl.RdcPackageImpl#getstmTimingConfig()
	 * @generated
	 */
	int STM_TIMING_CONFIG = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_TIMING_CONFIG__DOCUMENTATION = EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_TIMING_CONFIG__MODIFIED = EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_TIMING_CONFIG__MODIFIER = EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_TIMING_CONFIG__TRACE_LINK = EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_TIMING_CONFIG__CREATED = EtypesPackage.SUPER_TRACKING_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_TIMING_CONFIG__CREATOR = EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_TIMING_CONFIG__VERSION = EtypesPackage.SUPER_TRACKING_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_TIMING_CONFIG__ID = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_TIMING_CONFIG__NAME = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rate Driver Frequency Hz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_TIMING_CONFIG__RATE_DRIVER_FREQUENCY_HZ = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rate Group Divisor1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_TIMING_CONFIG__RATE_GROUP_DIVISOR1 = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rate Group Divisor2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_TIMING_CONFIG__RATE_GROUP_DIVISOR2 = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rate Group Divisor3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_TIMING_CONFIG__RATE_GROUP_DIVISOR3 = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Rate Group Default Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_TIMING_CONFIG__RATE_GROUP_DEFAULT_OFFSET = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Pwm Resolution Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_TIMING_CONFIG__PWM_RESOLUTION_BITS = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Rate Driver Frequency Hz Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_TIMING_CONFIG__RATE_DRIVER_FREQUENCY_HZ_SIZE = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Rate Group Divisor1 Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_TIMING_CONFIG__RATE_GROUP_DIVISOR1_SIZE = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Rate Group Divisor2 Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_TIMING_CONFIG__RATE_GROUP_DIVISOR2_SIZE = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Rate Group Divisor3 Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_TIMING_CONFIG__RATE_GROUP_DIVISOR3_SIZE = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Rate Group Default Offset Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_TIMING_CONFIG__RATE_GROUP_DEFAULT_OFFSET_SIZE = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Pwm Resolution Bits Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_TIMING_CONFIG__PWM_RESOLUTION_BITS_SIZE = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>stm Timing Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_TIMING_CONFIG_FEATURE_COUNT = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>stm Timing Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_TIMING_CONFIG_OPERATION_COUNT = EtypesPackage.SUPER_TRACKING_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.rdc.impl.stmPortsImpl <em>stm Ports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.rdc.impl.stmPortsImpl
	 * @see targets.rdc.impl.RdcPackageImpl#getstmPorts()
	 * @generated
	 */
	int STM_PORTS = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_PORTS__DOCUMENTATION = EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_PORTS__MODIFIED = EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_PORTS__MODIFIER = EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_PORTS__TRACE_LINK = EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_PORTS__CREATED = EtypesPackage.SUPER_TRACKING_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_PORTS__CREATOR = EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_PORTS__VERSION = EtypesPackage.SUPER_TRACKING_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_PORTS__ID = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_PORTS__NAME = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_PORTS__PORT = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>stm Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_PORTS_FEATURE_COUNT = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>stm Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_PORTS_OPERATION_COUNT = EtypesPackage.SUPER_TRACKING_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.rdc.impl.stmPortImpl <em>stm Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.rdc.impl.stmPortImpl
	 * @see targets.rdc.impl.RdcPackageImpl#getstmPort()
	 * @generated
	 */
	int STM_PORT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_PORT__ID = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_PORT__NAME = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_PORT__DOCUMENTATION = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_PORT__MODIFIED = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_PORT__MODIFIER = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_PORT__TRACE_LINK = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_PORT__CREATED = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_PORT__CREATOR = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_PORT__VERSION = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Pin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_PORT__PIN_NAME = TargetsPackage.SUPER_HARDWARE_PORT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pin Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_PORT__PIN_NUMBER = TargetsPackage.SUPER_HARDWARE_PORT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_PORT__SIZE = TargetsPackage.SUPER_HARDWARE_PORT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>stm Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_PORT_FEATURE_COUNT = TargetsPackage.SUPER_HARDWARE_PORT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>stm Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_PORT_OPERATION_COUNT = TargetsPackage.SUPER_HARDWARE_PORT_TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link targets.rdc.stm32f446re <em>stm32f446re</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>stm32f446re</em>'.
	 * @see targets.rdc.stm32f446re
	 * @generated
	 */
	EClass getstm32f446re();

	/**
	 * Returns the meta object for the attribute '{@link targets.rdc.stm32f446re#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see targets.rdc.stm32f446re#getSize()
	 * @see #getstm32f446re()
	 * @generated
	 */
	EAttribute getstm32f446re_Size();

	/**
	 * Returns the meta object for the containment reference '{@link targets.rdc.stm32f446re#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ports</em>'.
	 * @see targets.rdc.stm32f446re#getPorts()
	 * @see #getstm32f446re()
	 * @generated
	 */
	EReference getstm32f446re_Ports();

	/**
	 * Returns the meta object for the containment reference '{@link targets.rdc.stm32f446re#getStmTimingConfig <em>Stm Timing Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stm Timing Config</em>'.
	 * @see targets.rdc.stm32f446re#getStmTimingConfig()
	 * @see #getstm32f446re()
	 * @generated
	 */
	EReference getstm32f446re_StmTimingConfig();

	/**
	 * Returns the meta object for the containment reference '{@link targets.rdc.stm32f446re#getMsgBoxExtension <em>Msg Box Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Msg Box Extension</em>'.
	 * @see targets.rdc.stm32f446re#getMsgBoxExtension()
	 * @see #getstm32f446re()
	 * @generated
	 */
	EReference getstm32f446re_MsgBoxExtension();

	/**
	 * Returns the meta object for class '{@link targets.rdc.stmTimingConfig <em>stm Timing Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>stm Timing Config</em>'.
	 * @see targets.rdc.stmTimingConfig
	 * @generated
	 */
	EClass getstmTimingConfig();

	/**
	 * Returns the meta object for the attribute '{@link targets.rdc.stmTimingConfig#getRateDriverFrequencyHz <em>Rate Driver Frequency Hz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate Driver Frequency Hz</em>'.
	 * @see targets.rdc.stmTimingConfig#getRateDriverFrequencyHz()
	 * @see #getstmTimingConfig()
	 * @generated
	 */
	EAttribute getstmTimingConfig_RateDriverFrequencyHz();

	/**
	 * Returns the meta object for the attribute '{@link targets.rdc.stmTimingConfig#getRateGroupDivisor1 <em>Rate Group Divisor1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate Group Divisor1</em>'.
	 * @see targets.rdc.stmTimingConfig#getRateGroupDivisor1()
	 * @see #getstmTimingConfig()
	 * @generated
	 */
	EAttribute getstmTimingConfig_RateGroupDivisor1();

	/**
	 * Returns the meta object for the attribute '{@link targets.rdc.stmTimingConfig#getRateGroupDivisor2 <em>Rate Group Divisor2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate Group Divisor2</em>'.
	 * @see targets.rdc.stmTimingConfig#getRateGroupDivisor2()
	 * @see #getstmTimingConfig()
	 * @generated
	 */
	EAttribute getstmTimingConfig_RateGroupDivisor2();

	/**
	 * Returns the meta object for the attribute '{@link targets.rdc.stmTimingConfig#getRateGroupDivisor3 <em>Rate Group Divisor3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate Group Divisor3</em>'.
	 * @see targets.rdc.stmTimingConfig#getRateGroupDivisor3()
	 * @see #getstmTimingConfig()
	 * @generated
	 */
	EAttribute getstmTimingConfig_RateGroupDivisor3();

	/**
	 * Returns the meta object for the attribute '{@link targets.rdc.stmTimingConfig#getRateGroupDefaultOffset <em>Rate Group Default Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate Group Default Offset</em>'.
	 * @see targets.rdc.stmTimingConfig#getRateGroupDefaultOffset()
	 * @see #getstmTimingConfig()
	 * @generated
	 */
	EAttribute getstmTimingConfig_RateGroupDefaultOffset();

	/**
	 * Returns the meta object for the attribute '{@link targets.rdc.stmTimingConfig#getPwmResolutionBits <em>Pwm Resolution Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pwm Resolution Bits</em>'.
	 * @see targets.rdc.stmTimingConfig#getPwmResolutionBits()
	 * @see #getstmTimingConfig()
	 * @generated
	 */
	EAttribute getstmTimingConfig_PwmResolutionBits();

	/**
	 * Returns the meta object for the attribute '{@link targets.rdc.stmTimingConfig#getRateDriverFrequencyHzSize <em>Rate Driver Frequency Hz Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate Driver Frequency Hz Size</em>'.
	 * @see targets.rdc.stmTimingConfig#getRateDriverFrequencyHzSize()
	 * @see #getstmTimingConfig()
	 * @generated
	 */
	EAttribute getstmTimingConfig_RateDriverFrequencyHzSize();

	/**
	 * Returns the meta object for the attribute '{@link targets.rdc.stmTimingConfig#getRateGroupDivisor1Size <em>Rate Group Divisor1 Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate Group Divisor1 Size</em>'.
	 * @see targets.rdc.stmTimingConfig#getRateGroupDivisor1Size()
	 * @see #getstmTimingConfig()
	 * @generated
	 */
	EAttribute getstmTimingConfig_RateGroupDivisor1Size();

	/**
	 * Returns the meta object for the attribute '{@link targets.rdc.stmTimingConfig#getRateGroupDivisor2Size <em>Rate Group Divisor2 Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate Group Divisor2 Size</em>'.
	 * @see targets.rdc.stmTimingConfig#getRateGroupDivisor2Size()
	 * @see #getstmTimingConfig()
	 * @generated
	 */
	EAttribute getstmTimingConfig_RateGroupDivisor2Size();

	/**
	 * Returns the meta object for the attribute '{@link targets.rdc.stmTimingConfig#getRateGroupDivisor3Size <em>Rate Group Divisor3 Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate Group Divisor3 Size</em>'.
	 * @see targets.rdc.stmTimingConfig#getRateGroupDivisor3Size()
	 * @see #getstmTimingConfig()
	 * @generated
	 */
	EAttribute getstmTimingConfig_RateGroupDivisor3Size();

	/**
	 * Returns the meta object for the attribute '{@link targets.rdc.stmTimingConfig#getRateGroupDefaultOffsetSize <em>Rate Group Default Offset Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate Group Default Offset Size</em>'.
	 * @see targets.rdc.stmTimingConfig#getRateGroupDefaultOffsetSize()
	 * @see #getstmTimingConfig()
	 * @generated
	 */
	EAttribute getstmTimingConfig_RateGroupDefaultOffsetSize();

	/**
	 * Returns the meta object for the attribute '{@link targets.rdc.stmTimingConfig#getPwmResolutionBitsSize <em>Pwm Resolution Bits Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pwm Resolution Bits Size</em>'.
	 * @see targets.rdc.stmTimingConfig#getPwmResolutionBitsSize()
	 * @see #getstmTimingConfig()
	 * @generated
	 */
	EAttribute getstmTimingConfig_PwmResolutionBitsSize();

	/**
	 * Returns the meta object for class '{@link targets.rdc.stmPorts <em>stm Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>stm Ports</em>'.
	 * @see targets.rdc.stmPorts
	 * @generated
	 */
	EClass getstmPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link targets.rdc.stmPorts#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see targets.rdc.stmPorts#getPort()
	 * @see #getstmPorts()
	 * @generated
	 */
	EReference getstmPorts_Port();

	/**
	 * Returns the meta object for class '{@link targets.rdc.stmPort <em>stm Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>stm Port</em>'.
	 * @see targets.rdc.stmPort
	 * @generated
	 */
	EClass getstmPort();

	/**
	 * Returns the meta object for the attribute '{@link targets.rdc.stmPort#getPinName <em>Pin Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin Name</em>'.
	 * @see targets.rdc.stmPort#getPinName()
	 * @see #getstmPort()
	 * @generated
	 */
	EAttribute getstmPort_PinName();

	/**
	 * Returns the meta object for the attribute '{@link targets.rdc.stmPort#getPinNumber <em>Pin Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin Number</em>'.
	 * @see targets.rdc.stmPort#getPinNumber()
	 * @see #getstmPort()
	 * @generated
	 */
	EAttribute getstmPort_PinNumber();

	/**
	 * Returns the meta object for the attribute '{@link targets.rdc.stmPort#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see targets.rdc.stmPort#getSize()
	 * @see #getstmPort()
	 * @generated
	 */
	EAttribute getstmPort_Size();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RdcFactory getRdcFactory();

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
		 * The meta object literal for the '{@link targets.rdc.impl.stm32f446reImpl <em>stm32f446re</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.rdc.impl.stm32f446reImpl
		 * @see targets.rdc.impl.RdcPackageImpl#getstm32f446re()
		 * @generated
		 */
		EClass STM32F446RE = eINSTANCE.getstm32f446re();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STM32F446RE__SIZE = eINSTANCE.getstm32f446re_Size();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STM32F446RE__PORTS = eINSTANCE.getstm32f446re_Ports();

		/**
		 * The meta object literal for the '<em><b>Stm Timing Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STM32F446RE__STM_TIMING_CONFIG = eINSTANCE.getstm32f446re_StmTimingConfig();

		/**
		 * The meta object literal for the '<em><b>Msg Box Extension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STM32F446RE__MSG_BOX_EXTENSION = eINSTANCE.getstm32f446re_MsgBoxExtension();

		/**
		 * The meta object literal for the '{@link targets.rdc.impl.stmTimingConfigImpl <em>stm Timing Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.rdc.impl.stmTimingConfigImpl
		 * @see targets.rdc.impl.RdcPackageImpl#getstmTimingConfig()
		 * @generated
		 */
		EClass STM_TIMING_CONFIG = eINSTANCE.getstmTimingConfig();

		/**
		 * The meta object literal for the '<em><b>Rate Driver Frequency Hz</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STM_TIMING_CONFIG__RATE_DRIVER_FREQUENCY_HZ = eINSTANCE.getstmTimingConfig_RateDriverFrequencyHz();

		/**
		 * The meta object literal for the '<em><b>Rate Group Divisor1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STM_TIMING_CONFIG__RATE_GROUP_DIVISOR1 = eINSTANCE.getstmTimingConfig_RateGroupDivisor1();

		/**
		 * The meta object literal for the '<em><b>Rate Group Divisor2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STM_TIMING_CONFIG__RATE_GROUP_DIVISOR2 = eINSTANCE.getstmTimingConfig_RateGroupDivisor2();

		/**
		 * The meta object literal for the '<em><b>Rate Group Divisor3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STM_TIMING_CONFIG__RATE_GROUP_DIVISOR3 = eINSTANCE.getstmTimingConfig_RateGroupDivisor3();

		/**
		 * The meta object literal for the '<em><b>Rate Group Default Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STM_TIMING_CONFIG__RATE_GROUP_DEFAULT_OFFSET = eINSTANCE.getstmTimingConfig_RateGroupDefaultOffset();

		/**
		 * The meta object literal for the '<em><b>Pwm Resolution Bits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STM_TIMING_CONFIG__PWM_RESOLUTION_BITS = eINSTANCE.getstmTimingConfig_PwmResolutionBits();

		/**
		 * The meta object literal for the '<em><b>Rate Driver Frequency Hz Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STM_TIMING_CONFIG__RATE_DRIVER_FREQUENCY_HZ_SIZE = eINSTANCE.getstmTimingConfig_RateDriverFrequencyHzSize();

		/**
		 * The meta object literal for the '<em><b>Rate Group Divisor1 Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STM_TIMING_CONFIG__RATE_GROUP_DIVISOR1_SIZE = eINSTANCE.getstmTimingConfig_RateGroupDivisor1Size();

		/**
		 * The meta object literal for the '<em><b>Rate Group Divisor2 Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STM_TIMING_CONFIG__RATE_GROUP_DIVISOR2_SIZE = eINSTANCE.getstmTimingConfig_RateGroupDivisor2Size();

		/**
		 * The meta object literal for the '<em><b>Rate Group Divisor3 Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STM_TIMING_CONFIG__RATE_GROUP_DIVISOR3_SIZE = eINSTANCE.getstmTimingConfig_RateGroupDivisor3Size();

		/**
		 * The meta object literal for the '<em><b>Rate Group Default Offset Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STM_TIMING_CONFIG__RATE_GROUP_DEFAULT_OFFSET_SIZE = eINSTANCE.getstmTimingConfig_RateGroupDefaultOffsetSize();

		/**
		 * The meta object literal for the '<em><b>Pwm Resolution Bits Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STM_TIMING_CONFIG__PWM_RESOLUTION_BITS_SIZE = eINSTANCE.getstmTimingConfig_PwmResolutionBitsSize();

		/**
		 * The meta object literal for the '{@link targets.rdc.impl.stmPortsImpl <em>stm Ports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.rdc.impl.stmPortsImpl
		 * @see targets.rdc.impl.RdcPackageImpl#getstmPorts()
		 * @generated
		 */
		EClass STM_PORTS = eINSTANCE.getstmPorts();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STM_PORTS__PORT = eINSTANCE.getstmPorts_Port();

		/**
		 * The meta object literal for the '{@link targets.rdc.impl.stmPortImpl <em>stm Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.rdc.impl.stmPortImpl
		 * @see targets.rdc.impl.RdcPackageImpl#getstmPort()
		 * @generated
		 */
		EClass STM_PORT = eINSTANCE.getstmPort();

		/**
		 * The meta object literal for the '<em><b>Pin Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STM_PORT__PIN_NAME = eINSTANCE.getstmPort_PinName();

		/**
		 * The meta object literal for the '<em><b>Pin Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STM_PORT__PIN_NUMBER = eINSTANCE.getstmPort_PinNumber();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STM_PORT__SIZE = eINSTANCE.getstmPort_Size();

	}

} //RdcPackage
