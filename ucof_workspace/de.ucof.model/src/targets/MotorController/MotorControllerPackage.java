/**
 */
package targets.MotorController;

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
 * @see targets.MotorController.MotorControllerFactory
 * @model kind="package"
 * @generated
 */
public interface MotorControllerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MotorController";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://gitlab.com/ucof/ucof.de/model/v001/ucof/targets/motorcontroller";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ucof.model.targets.motorcontroller";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MotorControllerPackage eINSTANCE = targets.MotorController.impl.MotorControllerPackageImpl.init();

	/**
	 * The meta object id for the '{@link targets.MotorController.impl.escon409510Impl <em>escon409510</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.MotorController.impl.escon409510Impl
	 * @see targets.MotorController.impl.MotorControllerPackageImpl#getescon409510()
	 * @generated
	 */
	int ESCON409510 = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCON409510__ID = TargetsPackage.SUPER_TARGET_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCON409510__NAME = TargetsPackage.SUPER_TARGET_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCON409510__DOCUMENTATION = TargetsPackage.SUPER_TARGET_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCON409510__MODIFIED = TargetsPackage.SUPER_TARGET_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCON409510__MODIFIER = TargetsPackage.SUPER_TARGET_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCON409510__TRACE_LINK = TargetsPackage.SUPER_TARGET_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCON409510__CREATED = TargetsPackage.SUPER_TARGET_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCON409510__CREATOR = TargetsPackage.SUPER_TARGET_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCON409510__VERSION = TargetsPackage.SUPER_TARGET_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCON409510__PROJECT_NAME = TargetsPackage.SUPER_TARGET_TYPE__PROJECT_NAME;

	/**
	 * The feature id for the '<em><b>Electrical Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCON409510__ELECTRICAL_INTERFACES = TargetsPackage.SUPER_TARGET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCON409510__PORTS = TargetsPackage.SUPER_TARGET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>escon409510</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCON409510_FEATURE_COUNT = TargetsPackage.SUPER_TARGET_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>escon409510</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCON409510_OPERATION_COUNT = TargetsPackage.SUPER_TARGET_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.MotorController.impl.esconPortsImpl <em>escon Ports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.MotorController.impl.esconPortsImpl
	 * @see targets.MotorController.impl.MotorControllerPackageImpl#getesconPorts()
	 * @generated
	 */
	int ESCON_PORTS = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCON_PORTS__DOCUMENTATION = EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCON_PORTS__MODIFIED = EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCON_PORTS__MODIFIER = EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCON_PORTS__TRACE_LINK = EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCON_PORTS__CREATED = EtypesPackage.SUPER_TRACKING_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCON_PORTS__CREATOR = EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCON_PORTS__VERSION = EtypesPackage.SUPER_TRACKING_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCON_PORTS__ID = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCON_PORTS__NAME = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCON_PORTS__PORT = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>escon Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCON_PORTS_FEATURE_COUNT = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>escon Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCON_PORTS_OPERATION_COUNT = EtypesPackage.SUPER_TRACKING_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.MotorController.impl.esconPortImpl <em>escon Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.MotorController.impl.esconPortImpl
	 * @see targets.MotorController.impl.MotorControllerPackageImpl#getesconPort()
	 * @generated
	 */
	int ESCON_PORT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCON_PORT__ID = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCON_PORT__NAME = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCON_PORT__DOCUMENTATION = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCON_PORT__MODIFIED = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCON_PORT__MODIFIER = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCON_PORT__TRACE_LINK = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCON_PORT__CREATED = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCON_PORT__CREATOR = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCON_PORT__VERSION = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Pin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCON_PORT__PIN_NAME = TargetsPackage.SUPER_HARDWARE_PORT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>escon Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCON_PORT_FEATURE_COUNT = TargetsPackage.SUPER_HARDWARE_PORT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>escon Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCON_PORT_OPERATION_COUNT = TargetsPackage.SUPER_HARDWARE_PORT_TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link targets.MotorController.escon409510 <em>escon409510</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>escon409510</em>'.
	 * @see targets.MotorController.escon409510
	 * @generated
	 */
	EClass getescon409510();

	/**
	 * Returns the meta object for the containment reference '{@link targets.MotorController.escon409510#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ports</em>'.
	 * @see targets.MotorController.escon409510#getPorts()
	 * @see #getescon409510()
	 * @generated
	 */
	EReference getescon409510_Ports();

	/**
	 * Returns the meta object for class '{@link targets.MotorController.esconPorts <em>escon Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>escon Ports</em>'.
	 * @see targets.MotorController.esconPorts
	 * @generated
	 */
	EClass getesconPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link targets.MotorController.esconPorts#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see targets.MotorController.esconPorts#getPort()
	 * @see #getesconPorts()
	 * @generated
	 */
	EReference getesconPorts_Port();

	/**
	 * Returns the meta object for class '{@link targets.MotorController.esconPort <em>escon Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>escon Port</em>'.
	 * @see targets.MotorController.esconPort
	 * @generated
	 */
	EClass getesconPort();

	/**
	 * Returns the meta object for the attribute '{@link targets.MotorController.esconPort#getPinName <em>Pin Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin Name</em>'.
	 * @see targets.MotorController.esconPort#getPinName()
	 * @see #getesconPort()
	 * @generated
	 */
	EAttribute getesconPort_PinName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MotorControllerFactory getMotorControllerFactory();

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
		 * The meta object literal for the '{@link targets.MotorController.impl.escon409510Impl <em>escon409510</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.MotorController.impl.escon409510Impl
		 * @see targets.MotorController.impl.MotorControllerPackageImpl#getescon409510()
		 * @generated
		 */
		EClass ESCON409510 = eINSTANCE.getescon409510();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESCON409510__PORTS = eINSTANCE.getescon409510_Ports();

		/**
		 * The meta object literal for the '{@link targets.MotorController.impl.esconPortsImpl <em>escon Ports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.MotorController.impl.esconPortsImpl
		 * @see targets.MotorController.impl.MotorControllerPackageImpl#getesconPorts()
		 * @generated
		 */
		EClass ESCON_PORTS = eINSTANCE.getesconPorts();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESCON_PORTS__PORT = eINSTANCE.getesconPorts_Port();

		/**
		 * The meta object literal for the '{@link targets.MotorController.impl.esconPortImpl <em>escon Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.MotorController.impl.esconPortImpl
		 * @see targets.MotorController.impl.MotorControllerPackageImpl#getesconPort()
		 * @generated
		 */
		EClass ESCON_PORT = eINSTANCE.getesconPort();

		/**
		 * The meta object literal for the '<em><b>Pin Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESCON_PORT__PIN_NAME = eINSTANCE.getesconPort_PinName();

	}

} //MotorControllerPackage
