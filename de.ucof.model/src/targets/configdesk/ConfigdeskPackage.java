/**
 */
package targets.configdesk;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see targets.configdesk.ConfigdeskFactory
 * @model kind="package"
 * @generated
 */
public interface ConfigdeskPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "configdesk";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://gitlab.com/ucof/ucof.de/model/v001/ucof/targets/configdesk";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ucof.model.targets.configdesk";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigdeskPackage eINSTANCE = targets.configdesk.impl.ConfigdeskPackageImpl.init();

	/**
	 * The meta object id for the '{@link targets.configdesk.impl.ConfigurationDeskImpl <em>Configuration Desk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.configdesk.impl.ConfigurationDeskImpl
	 * @see targets.configdesk.impl.ConfigdeskPackageImpl#getConfigurationDesk()
	 * @generated
	 */
	int CONFIGURATION_DESK = 0;

	/**
	 * The feature id for the '<em><b>Hardware Topology Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_DESK__HARDWARE_TOPOLOGY_NAME = TargetsPackage.HARDWARE_INFORMATION__HARDWARE_TOPOLOGY_NAME;

	/**
	 * The feature id for the '<em><b>Name Of Hardware System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_DESK__NAME_OF_HARDWARE_SYSTEM = TargetsPackage.HARDWARE_INFORMATION__NAME_OF_HARDWARE_SYSTEM;

	/**
	 * The feature id for the '<em><b>IP Address Of Hardware System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_DESK__IP_ADDRESS_OF_HARDWARE_SYSTEM = TargetsPackage.HARDWARE_INFORMATION__IP_ADDRESS_OF_HARDWARE_SYSTEM;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_DESK__ID = TargetsPackage.HARDWARE_INFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_DESK__NAME = TargetsPackage.HARDWARE_INFORMATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_DESK__DOCUMENTATION = TargetsPackage.HARDWARE_INFORMATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_DESK__MODIFIED = TargetsPackage.HARDWARE_INFORMATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_DESK__MODIFIER = TargetsPackage.HARDWARE_INFORMATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_DESK__TRACE_LINK = TargetsPackage.HARDWARE_INFORMATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_DESK__CREATED = TargetsPackage.HARDWARE_INFORMATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_DESK__CREATOR = TargetsPackage.HARDWARE_INFORMATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_DESK__VERSION = TargetsPackage.HARDWARE_INFORMATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_DESK__PROJECT_NAME = TargetsPackage.HARDWARE_INFORMATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Configuration Desk IO Hardware</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_DESK__CONFIGURATION_DESK_IO_HARDWARE = TargetsPackage.HARDWARE_INFORMATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Model Topology Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_DESK__MODEL_TOPOLOGY_NAME = TargetsPackage.HARDWARE_INFORMATION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Application Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_DESK__APPLICATION_NAME = TargetsPackage.HARDWARE_INFORMATION_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Configuration Desk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_DESK_FEATURE_COUNT = TargetsPackage.HARDWARE_INFORMATION_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Configuration Desk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_DESK_OPERATION_COUNT = TargetsPackage.HARDWARE_INFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.configdesk.impl.SuperConfigurationDeskIOHardwareTypeImpl <em>Super Configuration Desk IO Hardware Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.configdesk.impl.SuperConfigurationDeskIOHardwareTypeImpl
	 * @see targets.configdesk.impl.ConfigdeskPackageImpl#getSuperConfigurationDeskIOHardwareType()
	 * @generated
	 */
	int SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE__ID = TargetsPackage.SUPER_IO_HARDWARE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE__NAME = TargetsPackage.SUPER_IO_HARDWARE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE__DOCUMENTATION = TargetsPackage.SUPER_IO_HARDWARE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE__MODIFIED = TargetsPackage.SUPER_IO_HARDWARE_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE__MODIFIER = TargetsPackage.SUPER_IO_HARDWARE_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE__TRACE_LINK = TargetsPackage.SUPER_IO_HARDWARE_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE__CREATED = TargetsPackage.SUPER_IO_HARDWARE_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE__CREATOR = TargetsPackage.SUPER_IO_HARDWARE_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE__VERSION = TargetsPackage.SUPER_IO_HARDWARE_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Assignment Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE__ASSIGNMENT_SPECIFICATION = TargetsPackage.SUPER_IO_HARDWARE_TYPE__ASSIGNMENT_SPECIFICATION;

	/**
	 * The number of structural features of the '<em>Super Configuration Desk IO Hardware Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE_FEATURE_COUNT = TargetsPackage.SUPER_IO_HARDWARE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Super Configuration Desk IO Hardware Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE_OPERATION_COUNT = TargetsPackage.SUPER_IO_HARDWARE_TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link targets.configdesk.ConfigurationDesk <em>Configuration Desk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Desk</em>'.
	 * @see targets.configdesk.ConfigurationDesk
	 * @generated
	 */
	EClass getConfigurationDesk();

	/**
	 * Returns the meta object for the containment reference list '{@link targets.configdesk.ConfigurationDesk#getConfigurationDeskIOHardware <em>Configuration Desk IO Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configuration Desk IO Hardware</em>'.
	 * @see targets.configdesk.ConfigurationDesk#getConfigurationDeskIOHardware()
	 * @see #getConfigurationDesk()
	 * @generated
	 */
	EReference getConfigurationDesk_ConfigurationDeskIOHardware();

	/**
	 * Returns the meta object for the attribute '{@link targets.configdesk.ConfigurationDesk#getModelTopologyName <em>Model Topology Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Topology Name</em>'.
	 * @see targets.configdesk.ConfigurationDesk#getModelTopologyName()
	 * @see #getConfigurationDesk()
	 * @generated
	 */
	EAttribute getConfigurationDesk_ModelTopologyName();

	/**
	 * Returns the meta object for the attribute '{@link targets.configdesk.ConfigurationDesk#getApplicationName <em>Application Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Name</em>'.
	 * @see targets.configdesk.ConfigurationDesk#getApplicationName()
	 * @see #getConfigurationDesk()
	 * @generated
	 */
	EAttribute getConfigurationDesk_ApplicationName();

	/**
	 * Returns the meta object for class '{@link targets.configdesk.SuperConfigurationDeskIOHardwareType <em>Super Configuration Desk IO Hardware Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Configuration Desk IO Hardware Type</em>'.
	 * @see targets.configdesk.SuperConfigurationDeskIOHardwareType
	 * @generated
	 */
	EClass getSuperConfigurationDeskIOHardwareType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfigdeskFactory getConfigdeskFactory();

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
		 * The meta object literal for the '{@link targets.configdesk.impl.ConfigurationDeskImpl <em>Configuration Desk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.configdesk.impl.ConfigurationDeskImpl
		 * @see targets.configdesk.impl.ConfigdeskPackageImpl#getConfigurationDesk()
		 * @generated
		 */
		EClass CONFIGURATION_DESK = eINSTANCE.getConfigurationDesk();

		/**
		 * The meta object literal for the '<em><b>Configuration Desk IO Hardware</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_DESK__CONFIGURATION_DESK_IO_HARDWARE = eINSTANCE.getConfigurationDesk_ConfigurationDeskIOHardware();

		/**
		 * The meta object literal for the '<em><b>Model Topology Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_DESK__MODEL_TOPOLOGY_NAME = eINSTANCE.getConfigurationDesk_ModelTopologyName();

		/**
		 * The meta object literal for the '<em><b>Application Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_DESK__APPLICATION_NAME = eINSTANCE.getConfigurationDesk_ApplicationName();

		/**
		 * The meta object literal for the '{@link targets.configdesk.impl.SuperConfigurationDeskIOHardwareTypeImpl <em>Super Configuration Desk IO Hardware Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.configdesk.impl.SuperConfigurationDeskIOHardwareTypeImpl
		 * @see targets.configdesk.impl.ConfigdeskPackageImpl#getSuperConfigurationDeskIOHardwareType()
		 * @generated
		 */
		EClass SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE = eINSTANCE.getSuperConfigurationDeskIOHardwareType();

	}

} //ConfigdeskPackage
