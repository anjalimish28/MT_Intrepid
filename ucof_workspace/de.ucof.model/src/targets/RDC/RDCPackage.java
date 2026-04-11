/**
 */
package targets.RDC;

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
 * @see targets.RDC.RDCFactory
 * @model kind="package"
 * @generated
 */
public interface RDCPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "RDC";

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
	RDCPackage eINSTANCE = targets.RDC.impl.RDCPackageImpl.init();

	/**
	 * The meta object id for the '{@link targets.RDC.impl.stm32f446reImpl <em>stm32f446re</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.RDC.impl.stm32f446reImpl
	 * @see targets.RDC.impl.RDCPackageImpl#getstm32f446re()
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
	int STM32F446RE__ID = TargetsPackage.SUPER_TARGET_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM32F446RE__NAME = TargetsPackage.SUPER_TARGET_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM32F446RE__DOCUMENTATION = TargetsPackage.SUPER_TARGET_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM32F446RE__MODIFIED = TargetsPackage.SUPER_TARGET_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM32F446RE__MODIFIER = TargetsPackage.SUPER_TARGET_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM32F446RE__TRACE_LINK = TargetsPackage.SUPER_TARGET_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM32F446RE__CREATED = TargetsPackage.SUPER_TARGET_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM32F446RE__CREATOR = TargetsPackage.SUPER_TARGET_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM32F446RE__VERSION = TargetsPackage.SUPER_TARGET_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM32F446RE__PROJECT_NAME = TargetsPackage.SUPER_TARGET_TYPE__PROJECT_NAME;

	/**
	 * The feature id for the '<em><b>Electrical Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM32F446RE__ELECTRICAL_INTERFACES = TargetsPackage.SUPER_TARGET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM32F446RE__PORTS = TargetsPackage.SUPER_TARGET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>stm32f446re</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM32F446RE_FEATURE_COUNT = TargetsPackage.SUPER_TARGET_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>stm32f446re</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM32F446RE_OPERATION_COUNT = TargetsPackage.SUPER_TARGET_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.RDC.impl.stmPortsImpl <em>stm Ports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.RDC.impl.stmPortsImpl
	 * @see targets.RDC.impl.RDCPackageImpl#getstmPorts()
	 * @generated
	 */
	int STM_PORTS = 1;

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
	 * The meta object id for the '{@link targets.RDC.impl.stmPortImpl <em>stm Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.RDC.impl.stmPortImpl
	 * @see targets.RDC.impl.RDCPackageImpl#getstmPort()
	 * @generated
	 */
	int STM_PORT = 2;

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
	 * The number of structural features of the '<em>stm Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_PORT_FEATURE_COUNT = TargetsPackage.SUPER_HARDWARE_PORT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>stm Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STM_PORT_OPERATION_COUNT = TargetsPackage.SUPER_HARDWARE_PORT_TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link targets.RDC.stm32f446re <em>stm32f446re</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>stm32f446re</em>'.
	 * @see targets.RDC.stm32f446re
	 * @generated
	 */
	EClass getstm32f446re();

	/**
	 * Returns the meta object for the containment reference '{@link targets.RDC.stm32f446re#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ports</em>'.
	 * @see targets.RDC.stm32f446re#getPorts()
	 * @see #getstm32f446re()
	 * @generated
	 */
	EReference getstm32f446re_Ports();

	/**
	 * Returns the meta object for class '{@link targets.RDC.stmPorts <em>stm Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>stm Ports</em>'.
	 * @see targets.RDC.stmPorts
	 * @generated
	 */
	EClass getstmPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link targets.RDC.stmPorts#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see targets.RDC.stmPorts#getPort()
	 * @see #getstmPorts()
	 * @generated
	 */
	EReference getstmPorts_Port();

	/**
	 * Returns the meta object for class '{@link targets.RDC.stmPort <em>stm Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>stm Port</em>'.
	 * @see targets.RDC.stmPort
	 * @generated
	 */
	EClass getstmPort();

	/**
	 * Returns the meta object for the attribute '{@link targets.RDC.stmPort#getPinName <em>Pin Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin Name</em>'.
	 * @see targets.RDC.stmPort#getPinName()
	 * @see #getstmPort()
	 * @generated
	 */
	EAttribute getstmPort_PinName();

	/**
	 * Returns the meta object for the attribute '{@link targets.RDC.stmPort#getPinNumber <em>Pin Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin Number</em>'.
	 * @see targets.RDC.stmPort#getPinNumber()
	 * @see #getstmPort()
	 * @generated
	 */
	EAttribute getstmPort_PinNumber();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RDCFactory getRDCFactory();

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
		 * The meta object literal for the '{@link targets.RDC.impl.stm32f446reImpl <em>stm32f446re</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.RDC.impl.stm32f446reImpl
		 * @see targets.RDC.impl.RDCPackageImpl#getstm32f446re()
		 * @generated
		 */
		EClass STM32F446RE = eINSTANCE.getstm32f446re();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STM32F446RE__PORTS = eINSTANCE.getstm32f446re_Ports();

		/**
		 * The meta object literal for the '{@link targets.RDC.impl.stmPortsImpl <em>stm Ports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.RDC.impl.stmPortsImpl
		 * @see targets.RDC.impl.RDCPackageImpl#getstmPorts()
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
		 * The meta object literal for the '{@link targets.RDC.impl.stmPortImpl <em>stm Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.RDC.impl.stmPortImpl
		 * @see targets.RDC.impl.RDCPackageImpl#getstmPort()
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

	}

} //RDCPackage
