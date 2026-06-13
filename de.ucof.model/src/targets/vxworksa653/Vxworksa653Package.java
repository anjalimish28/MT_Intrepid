/**
 */
package targets.vxworksa653;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import targets.TargetsPackage;

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
 * @see targets.vxworksa653.Vxworksa653Factory
 * @model kind="package"
 * @generated
 */
public interface Vxworksa653Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vxworksa653";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://gitlab.com/ucof/ucof.de/model/v001/ucof/targets/vxworksa653";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ucof.model.targets.vxworksa653";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Vxworksa653Package eINSTANCE = targets.vxworksa653.impl.Vxworksa653PackageImpl.init();

	/**
	 * The meta object id for the '{@link targets.vxworksa653.impl.VxWorksA653Impl <em>Vx Works A653</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.vxworksa653.impl.VxWorksA653Impl
	 * @see targets.vxworksa653.impl.Vxworksa653PackageImpl#getVxWorksA653()
	 * @generated
	 */
	int VX_WORKS_A653 = 0;

	/**
	 * The feature id for the '<em><b>Hardware Topology Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VX_WORKS_A653__HARDWARE_TOPOLOGY_NAME = TargetsPackage.HARDWARE_INFORMATION__HARDWARE_TOPOLOGY_NAME;

	/**
	 * The feature id for the '<em><b>Name Of Hardware System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VX_WORKS_A653__NAME_OF_HARDWARE_SYSTEM = TargetsPackage.HARDWARE_INFORMATION__NAME_OF_HARDWARE_SYSTEM;

	/**
	 * The feature id for the '<em><b>IP Address Of Hardware System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VX_WORKS_A653__IP_ADDRESS_OF_HARDWARE_SYSTEM = TargetsPackage.HARDWARE_INFORMATION__IP_ADDRESS_OF_HARDWARE_SYSTEM;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VX_WORKS_A653__ID = TargetsPackage.HARDWARE_INFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VX_WORKS_A653__NAME = TargetsPackage.HARDWARE_INFORMATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VX_WORKS_A653__DOCUMENTATION = TargetsPackage.HARDWARE_INFORMATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VX_WORKS_A653__MODIFIED = TargetsPackage.HARDWARE_INFORMATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VX_WORKS_A653__MODIFIER = TargetsPackage.HARDWARE_INFORMATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VX_WORKS_A653__TRACE_LINK = TargetsPackage.HARDWARE_INFORMATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VX_WORKS_A653__CREATED = TargetsPackage.HARDWARE_INFORMATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VX_WORKS_A653__CREATOR = TargetsPackage.HARDWARE_INFORMATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VX_WORKS_A653__VERSION = TargetsPackage.HARDWARE_INFORMATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Operating Sytem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VX_WORKS_A653__OPERATING_SYTEM = TargetsPackage.HARDWARE_INFORMATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VX_WORKS_A653__PROJECT_NAME = TargetsPackage.HARDWARE_INFORMATION_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Vx Works A653</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VX_WORKS_A653_FEATURE_COUNT = TargetsPackage.HARDWARE_INFORMATION_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Vx Works A653</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VX_WORKS_A653_OPERATION_COUNT = TargetsPackage.HARDWARE_INFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.vxworksa653.impl.SuperVxWorksAssignmentSpecificationTypeImpl <em>Super Vx Works Assignment Specification Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.vxworksa653.impl.SuperVxWorksAssignmentSpecificationTypeImpl
	 * @see targets.vxworksa653.impl.Vxworksa653PackageImpl#getSuperVxWorksAssignmentSpecificationType()
	 * @generated
	 */
	int SUPER_VX_WORKS_ASSIGNMENT_SPECIFICATION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_VX_WORKS_ASSIGNMENT_SPECIFICATION_TYPE__ID = TargetsPackage.SUPER_ASSIGNMENT_SPECIFICATION_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_VX_WORKS_ASSIGNMENT_SPECIFICATION_TYPE__NAME = TargetsPackage.SUPER_ASSIGNMENT_SPECIFICATION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_VX_WORKS_ASSIGNMENT_SPECIFICATION_TYPE__DOCUMENTATION = TargetsPackage.SUPER_ASSIGNMENT_SPECIFICATION_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_VX_WORKS_ASSIGNMENT_SPECIFICATION_TYPE__MODIFIED = TargetsPackage.SUPER_ASSIGNMENT_SPECIFICATION_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_VX_WORKS_ASSIGNMENT_SPECIFICATION_TYPE__MODIFIER = TargetsPackage.SUPER_ASSIGNMENT_SPECIFICATION_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_VX_WORKS_ASSIGNMENT_SPECIFICATION_TYPE__TRACE_LINK = TargetsPackage.SUPER_ASSIGNMENT_SPECIFICATION_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_VX_WORKS_ASSIGNMENT_SPECIFICATION_TYPE__CREATED = TargetsPackage.SUPER_ASSIGNMENT_SPECIFICATION_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_VX_WORKS_ASSIGNMENT_SPECIFICATION_TYPE__CREATOR = TargetsPackage.SUPER_ASSIGNMENT_SPECIFICATION_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_VX_WORKS_ASSIGNMENT_SPECIFICATION_TYPE__VERSION = TargetsPackage.SUPER_ASSIGNMENT_SPECIFICATION_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Referenced Assignment ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_VX_WORKS_ASSIGNMENT_SPECIFICATION_TYPE__REFERENCED_ASSIGNMENT_ID = TargetsPackage.SUPER_ASSIGNMENT_SPECIFICATION_TYPE__REFERENCED_ASSIGNMENT_ID;

	/**
	 * The number of structural features of the '<em>Super Vx Works Assignment Specification Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_VX_WORKS_ASSIGNMENT_SPECIFICATION_TYPE_FEATURE_COUNT = TargetsPackage.SUPER_ASSIGNMENT_SPECIFICATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Super Vx Works Assignment Specification Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_VX_WORKS_ASSIGNMENT_SPECIFICATION_TYPE_OPERATION_COUNT = TargetsPackage.SUPER_ASSIGNMENT_SPECIFICATION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.vxworksa653.impl.SimulatedDevicesImpl <em>Simulated Devices</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.vxworksa653.impl.SimulatedDevicesImpl
	 * @see targets.vxworksa653.impl.Vxworksa653PackageImpl#getSimulatedDevices()
	 * @generated
	 */
	int SIMULATED_DEVICES = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_DEVICES__ID = SUPER_VX_WORKS_ASSIGNMENT_SPECIFICATION_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_DEVICES__NAME = SUPER_VX_WORKS_ASSIGNMENT_SPECIFICATION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_DEVICES__DOCUMENTATION = SUPER_VX_WORKS_ASSIGNMENT_SPECIFICATION_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_DEVICES__MODIFIED = SUPER_VX_WORKS_ASSIGNMENT_SPECIFICATION_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_DEVICES__MODIFIER = SUPER_VX_WORKS_ASSIGNMENT_SPECIFICATION_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_DEVICES__TRACE_LINK = SUPER_VX_WORKS_ASSIGNMENT_SPECIFICATION_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_DEVICES__CREATED = SUPER_VX_WORKS_ASSIGNMENT_SPECIFICATION_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_DEVICES__CREATOR = SUPER_VX_WORKS_ASSIGNMENT_SPECIFICATION_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_DEVICES__VERSION = SUPER_VX_WORKS_ASSIGNMENT_SPECIFICATION_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Referenced Assignment ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_DEVICES__REFERENCED_ASSIGNMENT_ID = SUPER_VX_WORKS_ASSIGNMENT_SPECIFICATION_TYPE__REFERENCED_ASSIGNMENT_ID;

	/**
	 * The feature id for the '<em><b>Simulated Devices</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_DEVICES__SIMULATED_DEVICES = SUPER_VX_WORKS_ASSIGNMENT_SPECIFICATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simulated Devices</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_DEVICES_FEATURE_COUNT = SUPER_VX_WORKS_ASSIGNMENT_SPECIFICATION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simulated Devices</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATED_DEVICES_OPERATION_COUNT = SUPER_VX_WORKS_ASSIGNMENT_SPECIFICATION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.vxworksa653.SimulatedDevicesList <em>Simulated Devices List</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.vxworksa653.SimulatedDevicesList
	 * @see targets.vxworksa653.impl.Vxworksa653PackageImpl#getSimulatedDevicesList()
	 * @generated
	 */
	int SIMULATED_DEVICES_LIST = 3;


	/**
	 * Returns the meta object for class '{@link targets.vxworksa653.VxWorksA653 <em>Vx Works A653</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vx Works A653</em>'.
	 * @see targets.vxworksa653.VxWorksA653
	 * @generated
	 */
	EClass getVxWorksA653();

	/**
	 * Returns the meta object for class '{@link targets.vxworksa653.SuperVxWorksAssignmentSpecificationType <em>Super Vx Works Assignment Specification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Vx Works Assignment Specification Type</em>'.
	 * @see targets.vxworksa653.SuperVxWorksAssignmentSpecificationType
	 * @generated
	 */
	EClass getSuperVxWorksAssignmentSpecificationType();

	/**
	 * Returns the meta object for class '{@link targets.vxworksa653.SimulatedDevices <em>Simulated Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulated Devices</em>'.
	 * @see targets.vxworksa653.SimulatedDevices
	 * @generated
	 */
	EClass getSimulatedDevices();

	/**
	 * Returns the meta object for the attribute list '{@link targets.vxworksa653.SimulatedDevices#getSimulatedDevices <em>Simulated Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Simulated Devices</em>'.
	 * @see targets.vxworksa653.SimulatedDevices#getSimulatedDevices()
	 * @see #getSimulatedDevices()
	 * @generated
	 */
	EAttribute getSimulatedDevices_SimulatedDevices();

	/**
	 * Returns the meta object for enum '{@link targets.vxworksa653.SimulatedDevicesList <em>Simulated Devices List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Simulated Devices List</em>'.
	 * @see targets.vxworksa653.SimulatedDevicesList
	 * @generated
	 */
	EEnum getSimulatedDevicesList();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Vxworksa653Factory getVxworksa653Factory();

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
		 * The meta object literal for the '{@link targets.vxworksa653.impl.VxWorksA653Impl <em>Vx Works A653</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.vxworksa653.impl.VxWorksA653Impl
		 * @see targets.vxworksa653.impl.Vxworksa653PackageImpl#getVxWorksA653()
		 * @generated
		 */
		EClass VX_WORKS_A653 = eINSTANCE.getVxWorksA653();

		/**
		 * The meta object literal for the '{@link targets.vxworksa653.impl.SuperVxWorksAssignmentSpecificationTypeImpl <em>Super Vx Works Assignment Specification Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.vxworksa653.impl.SuperVxWorksAssignmentSpecificationTypeImpl
		 * @see targets.vxworksa653.impl.Vxworksa653PackageImpl#getSuperVxWorksAssignmentSpecificationType()
		 * @generated
		 */
		EClass SUPER_VX_WORKS_ASSIGNMENT_SPECIFICATION_TYPE = eINSTANCE.getSuperVxWorksAssignmentSpecificationType();

		/**
		 * The meta object literal for the '{@link targets.vxworksa653.impl.SimulatedDevicesImpl <em>Simulated Devices</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.vxworksa653.impl.SimulatedDevicesImpl
		 * @see targets.vxworksa653.impl.Vxworksa653PackageImpl#getSimulatedDevices()
		 * @generated
		 */
		EClass SIMULATED_DEVICES = eINSTANCE.getSimulatedDevices();

		/**
		 * The meta object literal for the '<em><b>Simulated Devices</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATED_DEVICES__SIMULATED_DEVICES = eINSTANCE.getSimulatedDevices_SimulatedDevices();

		/**
		 * The meta object literal for the '{@link targets.vxworksa653.SimulatedDevicesList <em>Simulated Devices List</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.vxworksa653.SimulatedDevicesList
		 * @see targets.vxworksa653.impl.Vxworksa653PackageImpl#getSimulatedDevicesList()
		 * @generated
		 */
		EEnum SIMULATED_DEVICES_LIST = eINSTANCE.getSimulatedDevicesList();

	}

} //Vxworksa653Package
