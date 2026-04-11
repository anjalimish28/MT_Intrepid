/**
 */
package targets.HallSensor;

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
 * @see targets.HallSensor.HallSensorFactory
 * @model kind="package"
 * @generated
 */
public interface HallSensorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "HallSensor";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://gitlab.com/ucof/ucof.de/model/v001/ucof/targets/hallsensor";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ucof.model.targets.hallsensor";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HallSensorPackage eINSTANCE = targets.HallSensor.impl.HallSensorPackageImpl.init();

	/**
	 * The meta object id for the '{@link targets.HallSensor.impl.mts360Impl <em>mts360</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.HallSensor.impl.mts360Impl
	 * @see targets.HallSensor.impl.HallSensorPackageImpl#getmts360()
	 * @generated
	 */
	int MTS360 = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTS360__ID = TargetsPackage.SUPER_TARGET_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTS360__NAME = TargetsPackage.SUPER_TARGET_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTS360__DOCUMENTATION = TargetsPackage.SUPER_TARGET_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTS360__MODIFIED = TargetsPackage.SUPER_TARGET_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTS360__MODIFIER = TargetsPackage.SUPER_TARGET_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTS360__TRACE_LINK = TargetsPackage.SUPER_TARGET_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTS360__CREATED = TargetsPackage.SUPER_TARGET_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTS360__CREATOR = TargetsPackage.SUPER_TARGET_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTS360__VERSION = TargetsPackage.SUPER_TARGET_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTS360__PROJECT_NAME = TargetsPackage.SUPER_TARGET_TYPE__PROJECT_NAME;

	/**
	 * The feature id for the '<em><b>Electrical Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTS360__ELECTRICAL_INTERFACES = TargetsPackage.SUPER_TARGET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTS360__PORTS = TargetsPackage.SUPER_TARGET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>mts360</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTS360_FEATURE_COUNT = TargetsPackage.SUPER_TARGET_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>mts360</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTS360_OPERATION_COUNT = TargetsPackage.SUPER_TARGET_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.HallSensor.impl.hallPortsImpl <em>hall Ports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.HallSensor.impl.hallPortsImpl
	 * @see targets.HallSensor.impl.HallSensorPackageImpl#gethallPorts()
	 * @generated
	 */
	int HALL_PORTS = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALL_PORTS__DOCUMENTATION = EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALL_PORTS__MODIFIED = EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALL_PORTS__MODIFIER = EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALL_PORTS__TRACE_LINK = EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALL_PORTS__CREATED = EtypesPackage.SUPER_TRACKING_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALL_PORTS__CREATOR = EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALL_PORTS__VERSION = EtypesPackage.SUPER_TRACKING_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALL_PORTS__ID = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALL_PORTS__NAME = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALL_PORTS__PORT = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>hall Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALL_PORTS_FEATURE_COUNT = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>hall Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALL_PORTS_OPERATION_COUNT = EtypesPackage.SUPER_TRACKING_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.HallSensor.impl.hallPortImpl <em>hall Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.HallSensor.impl.hallPortImpl
	 * @see targets.HallSensor.impl.HallSensorPackageImpl#gethallPort()
	 * @generated
	 */
	int HALL_PORT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALL_PORT__ID = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALL_PORT__NAME = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALL_PORT__DOCUMENTATION = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALL_PORT__MODIFIED = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALL_PORT__MODIFIER = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALL_PORT__TRACE_LINK = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALL_PORT__CREATED = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALL_PORT__CREATOR = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALL_PORT__VERSION = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Pin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALL_PORT__PIN_NAME = TargetsPackage.SUPER_HARDWARE_PORT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pin Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALL_PORT__PIN_NUMBER = TargetsPackage.SUPER_HARDWARE_PORT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>hall Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALL_PORT_FEATURE_COUNT = TargetsPackage.SUPER_HARDWARE_PORT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>hall Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALL_PORT_OPERATION_COUNT = TargetsPackage.SUPER_HARDWARE_PORT_TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link targets.HallSensor.mts360 <em>mts360</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>mts360</em>'.
	 * @see targets.HallSensor.mts360
	 * @generated
	 */
	EClass getmts360();

	/**
	 * Returns the meta object for the containment reference '{@link targets.HallSensor.mts360#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ports</em>'.
	 * @see targets.HallSensor.mts360#getPorts()
	 * @see #getmts360()
	 * @generated
	 */
	EReference getmts360_Ports();

	/**
	 * Returns the meta object for class '{@link targets.HallSensor.hallPorts <em>hall Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>hall Ports</em>'.
	 * @see targets.HallSensor.hallPorts
	 * @generated
	 */
	EClass gethallPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link targets.HallSensor.hallPorts#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see targets.HallSensor.hallPorts#getPort()
	 * @see #gethallPorts()
	 * @generated
	 */
	EReference gethallPorts_Port();

	/**
	 * Returns the meta object for class '{@link targets.HallSensor.hallPort <em>hall Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>hall Port</em>'.
	 * @see targets.HallSensor.hallPort
	 * @generated
	 */
	EClass gethallPort();

	/**
	 * Returns the meta object for the attribute '{@link targets.HallSensor.hallPort#getPinName <em>Pin Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin Name</em>'.
	 * @see targets.HallSensor.hallPort#getPinName()
	 * @see #gethallPort()
	 * @generated
	 */
	EAttribute gethallPort_PinName();

	/**
	 * Returns the meta object for the attribute '{@link targets.HallSensor.hallPort#getPinNumber <em>Pin Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin Number</em>'.
	 * @see targets.HallSensor.hallPort#getPinNumber()
	 * @see #gethallPort()
	 * @generated
	 */
	EAttribute gethallPort_PinNumber();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HallSensorFactory getHallSensorFactory();

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
		 * The meta object literal for the '{@link targets.HallSensor.impl.mts360Impl <em>mts360</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.HallSensor.impl.mts360Impl
		 * @see targets.HallSensor.impl.HallSensorPackageImpl#getmts360()
		 * @generated
		 */
		EClass MTS360 = eINSTANCE.getmts360();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MTS360__PORTS = eINSTANCE.getmts360_Ports();

		/**
		 * The meta object literal for the '{@link targets.HallSensor.impl.hallPortsImpl <em>hall Ports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.HallSensor.impl.hallPortsImpl
		 * @see targets.HallSensor.impl.HallSensorPackageImpl#gethallPorts()
		 * @generated
		 */
		EClass HALL_PORTS = eINSTANCE.gethallPorts();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HALL_PORTS__PORT = eINSTANCE.gethallPorts_Port();

		/**
		 * The meta object literal for the '{@link targets.HallSensor.impl.hallPortImpl <em>hall Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.HallSensor.impl.hallPortImpl
		 * @see targets.HallSensor.impl.HallSensorPackageImpl#gethallPort()
		 * @generated
		 */
		EClass HALL_PORT = eINSTANCE.gethallPort();

		/**
		 * The meta object literal for the '<em><b>Pin Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HALL_PORT__PIN_NAME = eINSTANCE.gethallPort_PinName();

		/**
		 * The meta object literal for the '<em><b>Pin Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HALL_PORT__PIN_NUMBER = eINSTANCE.gethallPort_PinNumber();

	}

} //HallSensorPackage
