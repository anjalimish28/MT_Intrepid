/**
 */
package targets.configdesk.dSpaceArinc825;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import targets.TargetsPackage;

import targets.configdesk.ConfigdeskPackage;

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
 * @see targets.configdesk.dSpaceArinc825.DSpaceArinc825Factory
 * @model kind="package"
 * @generated
 */
public interface DSpaceArinc825Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dSpaceArinc825";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://gitlab.com/ucof/ucof.de/model/v001/ucof/targets/configdesk/dSpaceArinc825";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ucof.model.targets.configdesk.dSpaceArinc825";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DSpaceArinc825Package eINSTANCE = targets.configdesk.dSpaceArinc825.impl.DSpaceArinc825PackageImpl.init();

	/**
	 * The meta object id for the '{@link targets.configdesk.dSpaceArinc825.impl.A825ConfigurationImpl <em>A825 Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.configdesk.dSpaceArinc825.impl.A825ConfigurationImpl
	 * @see targets.configdesk.dSpaceArinc825.impl.DSpaceArinc825PackageImpl#getA825Configuration()
	 * @generated
	 */
	int A825_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_CONFIGURATION__ID = ConfigdeskPackage.SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_CONFIGURATION__NAME = ConfigdeskPackage.SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_CONFIGURATION__DOCUMENTATION = ConfigdeskPackage.SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_CONFIGURATION__MODIFIED = ConfigdeskPackage.SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_CONFIGURATION__MODIFIER = ConfigdeskPackage.SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_CONFIGURATION__TRACE_LINK = ConfigdeskPackage.SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_CONFIGURATION__CREATED = ConfigdeskPackage.SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_CONFIGURATION__CREATOR = ConfigdeskPackage.SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_CONFIGURATION__VERSION = ConfigdeskPackage.SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Assignment Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_CONFIGURATION__ASSIGNMENT_SPECIFICATION = ConfigdeskPackage.SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE__ASSIGNMENT_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Channel Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_CONFIGURATION__CHANNEL_NAME = ConfigdeskPackage.SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Terminated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_CONFIGURATION__TERMINATED = ConfigdeskPackage.SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assigned Channel Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_CONFIGURATION__ASSIGNED_CHANNEL_SET = ConfigdeskPackage.SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Can Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_CONFIGURATION__CAN_CHANNEL = ConfigdeskPackage.SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Model Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_CONFIGURATION__MODEL_ACCESS = ConfigdeskPackage.SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Model Port Block Structure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_CONFIGURATION__MODEL_PORT_BLOCK_STRUCTURE = ConfigdeskPackage.SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>ECU</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_CONFIGURATION__ECU = ConfigdeskPackage.SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Status Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_CONFIGURATION__STATUS_EXTENSION = ConfigdeskPackage.SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>A825 Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_CONFIGURATION_FEATURE_COUNT = ConfigdeskPackage.SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>A825 Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_CONFIGURATION_OPERATION_COUNT = ConfigdeskPackage.SUPER_CONFIGURATION_DESK_IO_HARDWARE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.configdesk.dSpaceArinc825.impl.SuperConfigurationDeskA825StatusExtensionTypeImpl <em>Super Configuration Desk A825 Status Extension Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.configdesk.dSpaceArinc825.impl.SuperConfigurationDeskA825StatusExtensionTypeImpl
	 * @see targets.configdesk.dSpaceArinc825.impl.DSpaceArinc825PackageImpl#getSuperConfigurationDeskA825StatusExtensionType()
	 * @generated
	 */
	int SUPER_CONFIGURATION_DESK_A825_STATUS_EXTENSION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONFIGURATION_DESK_A825_STATUS_EXTENSION_TYPE__ID = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONFIGURATION_DESK_A825_STATUS_EXTENSION_TYPE__NAME = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONFIGURATION_DESK_A825_STATUS_EXTENSION_TYPE__DOCUMENTATION = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONFIGURATION_DESK_A825_STATUS_EXTENSION_TYPE__MODIFIED = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONFIGURATION_DESK_A825_STATUS_EXTENSION_TYPE__MODIFIER = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONFIGURATION_DESK_A825_STATUS_EXTENSION_TYPE__TRACE_LINK = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONFIGURATION_DESK_A825_STATUS_EXTENSION_TYPE__CREATED = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONFIGURATION_DESK_A825_STATUS_EXTENSION_TYPE__CREATOR = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONFIGURATION_DESK_A825_STATUS_EXTENSION_TYPE__VERSION = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Extended Class ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONFIGURATION_DESK_A825_STATUS_EXTENSION_TYPE__EXTENDED_CLASS_ID = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE__EXTENDED_CLASS_ID;

	/**
	 * The number of structural features of the '<em>Super Configuration Desk A825 Status Extension Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONFIGURATION_DESK_A825_STATUS_EXTENSION_TYPE_FEATURE_COUNT = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Super Configuration Desk A825 Status Extension Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONFIGURATION_DESK_A825_STATUS_EXTENSION_TYPE_OPERATION_COUNT = TargetsPackage.SUPER_CLASS_EXTENSION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.configdesk.dSpaceArinc825.impl.SignalModelAccessStatusImpl <em>Signal Model Access Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.configdesk.dSpaceArinc825.impl.SignalModelAccessStatusImpl
	 * @see targets.configdesk.dSpaceArinc825.impl.DSpaceArinc825PackageImpl#getSignalModelAccessStatus()
	 * @generated
	 */
	int SIGNAL_MODEL_ACCESS_STATUS = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_MODEL_ACCESS_STATUS__ID = SUPER_CONFIGURATION_DESK_A825_STATUS_EXTENSION_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_MODEL_ACCESS_STATUS__NAME = SUPER_CONFIGURATION_DESK_A825_STATUS_EXTENSION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_MODEL_ACCESS_STATUS__DOCUMENTATION = SUPER_CONFIGURATION_DESK_A825_STATUS_EXTENSION_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_MODEL_ACCESS_STATUS__MODIFIED = SUPER_CONFIGURATION_DESK_A825_STATUS_EXTENSION_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_MODEL_ACCESS_STATUS__MODIFIER = SUPER_CONFIGURATION_DESK_A825_STATUS_EXTENSION_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_MODEL_ACCESS_STATUS__TRACE_LINK = SUPER_CONFIGURATION_DESK_A825_STATUS_EXTENSION_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_MODEL_ACCESS_STATUS__CREATED = SUPER_CONFIGURATION_DESK_A825_STATUS_EXTENSION_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_MODEL_ACCESS_STATUS__CREATOR = SUPER_CONFIGURATION_DESK_A825_STATUS_EXTENSION_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_MODEL_ACCESS_STATUS__VERSION = SUPER_CONFIGURATION_DESK_A825_STATUS_EXTENSION_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Extended Class ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_MODEL_ACCESS_STATUS__EXTENDED_CLASS_ID = SUPER_CONFIGURATION_DESK_A825_STATUS_EXTENSION_TYPE__EXTENDED_CLASS_ID;

	/**
	 * The feature id for the '<em><b>Model Access Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_MODEL_ACCESS_STATUS__MODEL_ACCESS_ENABLED = SUPER_CONFIGURATION_DESK_A825_STATUS_EXTENSION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Signal Model Access Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_MODEL_ACCESS_STATUS_FEATURE_COUNT = SUPER_CONFIGURATION_DESK_A825_STATUS_EXTENSION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Signal Model Access Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_MODEL_ACCESS_STATUS_OPERATION_COUNT = SUPER_CONFIGURATION_DESK_A825_STATUS_EXTENSION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.configdesk.dSpaceArinc825.impl.SuperFeatureTypeImpl <em>Super Feature Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.configdesk.dSpaceArinc825.impl.SuperFeatureTypeImpl
	 * @see targets.configdesk.dSpaceArinc825.impl.DSpaceArinc825PackageImpl#getSuperFeatureType()
	 * @generated
	 */
	int SUPER_FEATURE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_FEATURE_TYPE__ID = SUPER_CONFIGURATION_DESK_A825_STATUS_EXTENSION_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_FEATURE_TYPE__NAME = SUPER_CONFIGURATION_DESK_A825_STATUS_EXTENSION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_FEATURE_TYPE__DOCUMENTATION = SUPER_CONFIGURATION_DESK_A825_STATUS_EXTENSION_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_FEATURE_TYPE__MODIFIED = SUPER_CONFIGURATION_DESK_A825_STATUS_EXTENSION_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_FEATURE_TYPE__MODIFIER = SUPER_CONFIGURATION_DESK_A825_STATUS_EXTENSION_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_FEATURE_TYPE__TRACE_LINK = SUPER_CONFIGURATION_DESK_A825_STATUS_EXTENSION_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_FEATURE_TYPE__CREATED = SUPER_CONFIGURATION_DESK_A825_STATUS_EXTENSION_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_FEATURE_TYPE__CREATOR = SUPER_CONFIGURATION_DESK_A825_STATUS_EXTENSION_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_FEATURE_TYPE__VERSION = SUPER_CONFIGURATION_DESK_A825_STATUS_EXTENSION_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Extended Class ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_FEATURE_TYPE__EXTENDED_CLASS_ID = SUPER_CONFIGURATION_DESK_A825_STATUS_EXTENSION_TYPE__EXTENDED_CLASS_ID;

	/**
	 * The number of structural features of the '<em>Super Feature Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_FEATURE_TYPE_FEATURE_COUNT = SUPER_CONFIGURATION_DESK_A825_STATUS_EXTENSION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Super Feature Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_FEATURE_TYPE_OPERATION_COUNT = SUPER_CONFIGURATION_DESK_A825_STATUS_EXTENSION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.configdesk.dSpaceArinc825.impl.FeatureTriggerImpl <em>Feature Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.configdesk.dSpaceArinc825.impl.FeatureTriggerImpl
	 * @see targets.configdesk.dSpaceArinc825.impl.DSpaceArinc825PackageImpl#getFeatureTrigger()
	 * @generated
	 */
	int FEATURE_TRIGGER = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TRIGGER__ID = SUPER_FEATURE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TRIGGER__NAME = SUPER_FEATURE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TRIGGER__DOCUMENTATION = SUPER_FEATURE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TRIGGER__MODIFIED = SUPER_FEATURE_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TRIGGER__MODIFIER = SUPER_FEATURE_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TRIGGER__TRACE_LINK = SUPER_FEATURE_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TRIGGER__CREATED = SUPER_FEATURE_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TRIGGER__CREATOR = SUPER_FEATURE_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TRIGGER__VERSION = SUPER_FEATURE_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Extended Class ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TRIGGER__EXTENDED_CLASS_ID = SUPER_FEATURE_TYPE__EXTENDED_CLASS_ID;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TRIGGER__TRIGGER = SUPER_FEATURE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TRIGGER_FEATURE_COUNT = SUPER_FEATURE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Feature Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TRIGGER_OPERATION_COUNT = SUPER_FEATURE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.configdesk.dSpaceArinc825.impl.FeatureCyclicTimingControlImpl <em>Feature Cyclic Timing Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.configdesk.dSpaceArinc825.impl.FeatureCyclicTimingControlImpl
	 * @see targets.configdesk.dSpaceArinc825.impl.DSpaceArinc825PackageImpl#getFeatureCyclicTimingControl()
	 * @generated
	 */
	int FEATURE_CYCLIC_TIMING_CONTROL = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CYCLIC_TIMING_CONTROL__ID = SUPER_FEATURE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CYCLIC_TIMING_CONTROL__NAME = SUPER_FEATURE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CYCLIC_TIMING_CONTROL__DOCUMENTATION = SUPER_FEATURE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CYCLIC_TIMING_CONTROL__MODIFIED = SUPER_FEATURE_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CYCLIC_TIMING_CONTROL__MODIFIER = SUPER_FEATURE_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CYCLIC_TIMING_CONTROL__TRACE_LINK = SUPER_FEATURE_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CYCLIC_TIMING_CONTROL__CREATED = SUPER_FEATURE_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CYCLIC_TIMING_CONTROL__CREATOR = SUPER_FEATURE_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CYCLIC_TIMING_CONTROL__VERSION = SUPER_FEATURE_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Extended Class ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CYCLIC_TIMING_CONTROL__EXTENDED_CLASS_ID = SUPER_FEATURE_TYPE__EXTENDED_CLASS_ID;

	/**
	 * The feature id for the '<em><b>Control Period Model Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CYCLIC_TIMING_CONTROL__CONTROL_PERIOD_MODEL_ACCESS = SUPER_FEATURE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Control Offset Model Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CYCLIC_TIMING_CONTROL__CONTROL_OFFSET_MODEL_ACCESS = SUPER_FEATURE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature Cyclic Timing Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CYCLIC_TIMING_CONTROL_FEATURE_COUNT = SUPER_FEATURE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Feature Cyclic Timing Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CYCLIC_TIMING_CONTROL_OPERATION_COUNT = SUPER_FEATURE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.configdesk.dSpaceArinc825.impl.FeatureRawDataImpl <em>Feature Raw Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.configdesk.dSpaceArinc825.impl.FeatureRawDataImpl
	 * @see targets.configdesk.dSpaceArinc825.impl.DSpaceArinc825PackageImpl#getFeatureRawData()
	 * @generated
	 */
	int FEATURE_RAW_DATA = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_RAW_DATA__ID = SUPER_FEATURE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_RAW_DATA__NAME = SUPER_FEATURE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_RAW_DATA__DOCUMENTATION = SUPER_FEATURE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_RAW_DATA__MODIFIED = SUPER_FEATURE_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_RAW_DATA__MODIFIER = SUPER_FEATURE_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_RAW_DATA__TRACE_LINK = SUPER_FEATURE_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_RAW_DATA__CREATED = SUPER_FEATURE_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_RAW_DATA__CREATOR = SUPER_FEATURE_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_RAW_DATA__VERSION = SUPER_FEATURE_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Extended Class ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_RAW_DATA__EXTENDED_CLASS_ID = SUPER_FEATURE_TYPE__EXTENDED_CLASS_ID;

	/**
	 * The feature id for the '<em><b>Raw Data Model Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_RAW_DATA__RAW_DATA_MODEL_ACCESS = SUPER_FEATURE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Raw Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_RAW_DATA_FEATURE_COUNT = SUPER_FEATURE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Feature Raw Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_RAW_DATA_OPERATION_COUNT = SUPER_FEATURE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.configdesk.dSpaceArinc825.impl.FeatureEnableImpl <em>Feature Enable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.configdesk.dSpaceArinc825.impl.FeatureEnableImpl
	 * @see targets.configdesk.dSpaceArinc825.impl.DSpaceArinc825PackageImpl#getFeatureEnable()
	 * @generated
	 */
	int FEATURE_ENABLE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENABLE__ID = SUPER_FEATURE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENABLE__NAME = SUPER_FEATURE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENABLE__DOCUMENTATION = SUPER_FEATURE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENABLE__MODIFIED = SUPER_FEATURE_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENABLE__MODIFIER = SUPER_FEATURE_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENABLE__TRACE_LINK = SUPER_FEATURE_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENABLE__CREATED = SUPER_FEATURE_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENABLE__CREATOR = SUPER_FEATURE_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENABLE__VERSION = SUPER_FEATURE_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Extended Class ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENABLE__EXTENDED_CLASS_ID = SUPER_FEATURE_TYPE__EXTENDED_CLASS_ID;

	/**
	 * The feature id for the '<em><b>Enable Model Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENABLE__ENABLE_MODEL_ACCESS = SUPER_FEATURE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Enable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENABLE_FEATURE_COUNT = SUPER_FEATURE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Feature Enable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENABLE_OPERATION_COUNT = SUPER_FEATURE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.configdesk.dSpaceArinc825.impl.FeatureFrameAccessImpl <em>Feature Frame Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.configdesk.dSpaceArinc825.impl.FeatureFrameAccessImpl
	 * @see targets.configdesk.dSpaceArinc825.impl.DSpaceArinc825PackageImpl#getFeatureFrameAccess()
	 * @generated
	 */
	int FEATURE_FRAME_ACCESS = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FRAME_ACCESS__ID = SUPER_FEATURE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FRAME_ACCESS__NAME = SUPER_FEATURE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FRAME_ACCESS__DOCUMENTATION = SUPER_FEATURE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FRAME_ACCESS__MODIFIED = SUPER_FEATURE_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FRAME_ACCESS__MODIFIER = SUPER_FEATURE_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FRAME_ACCESS__TRACE_LINK = SUPER_FEATURE_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FRAME_ACCESS__CREATED = SUPER_FEATURE_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FRAME_ACCESS__CREATOR = SUPER_FEATURE_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FRAME_ACCESS__VERSION = SUPER_FEATURE_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Extended Class ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FRAME_ACCESS__EXTENDED_CLASS_ID = SUPER_FEATURE_TYPE__EXTENDED_CLASS_ID;

	/**
	 * The feature id for the '<em><b>Trigger Model Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FRAME_ACCESS__TRIGGER_MODEL_ACCESS = SUPER_FEATURE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Length Model Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FRAME_ACCESS__LENGTH_MODEL_ACCESS = SUPER_FEATURE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Raw Data Model Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FRAME_ACCESS__RAW_DATA_MODEL_ACCESS = SUPER_FEATURE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Identifier Model Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FRAME_ACCESS__IDENTIFIER_MODEL_ACCESS = SUPER_FEATURE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Extended Addressing Model Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FRAME_ACCESS__EXTENDED_ADDRESSING_MODEL_ACCESS = SUPER_FEATURE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Can FD Frame Support Model Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FRAME_ACCESS__CAN_FD_FRAME_SUPPORT_MODEL_ACCESS = SUPER_FEATURE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Bit Rate Switch Model Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FRAME_ACCESS__BIT_RATE_SWITCH_MODEL_ACCESS = SUPER_FEATURE_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Feature Frame Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FRAME_ACCESS_FEATURE_COUNT = SUPER_FEATURE_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Feature Frame Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FRAME_ACCESS_OPERATION_COUNT = SUPER_FEATURE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.configdesk.dSpaceArinc825.ModelAccess <em>Model Access</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.configdesk.dSpaceArinc825.ModelAccess
	 * @see targets.configdesk.dSpaceArinc825.impl.DSpaceArinc825PackageImpl#getModelAccess()
	 * @generated
	 */
	int MODEL_ACCESS = 9;

	/**
	 * The meta object id for the '{@link targets.configdesk.dSpaceArinc825.ModelAccessiblePortsRX <em>Model Accessible Ports RX</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.configdesk.dSpaceArinc825.ModelAccessiblePortsRX
	 * @see targets.configdesk.dSpaceArinc825.impl.DSpaceArinc825PackageImpl#getModelAccessiblePortsRX()
	 * @generated
	 */
	int MODEL_ACCESSIBLE_PORTS_RX = 10;

	/**
	 * The meta object id for the '{@link targets.configdesk.dSpaceArinc825.ModelAccessiblePortsTX <em>Model Accessible Ports TX</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.configdesk.dSpaceArinc825.ModelAccessiblePortsTX
	 * @see targets.configdesk.dSpaceArinc825.impl.DSpaceArinc825PackageImpl#getModelAccessiblePortsTX()
	 * @generated
	 */
	int MODEL_ACCESSIBLE_PORTS_TX = 11;

	/**
	 * The meta object id for the '{@link targets.configdesk.dSpaceArinc825.ModelPortBlockStructure <em>Model Port Block Structure</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.configdesk.dSpaceArinc825.ModelPortBlockStructure
	 * @see targets.configdesk.dSpaceArinc825.impl.DSpaceArinc825PackageImpl#getModelPortBlockStructure()
	 * @generated
	 */
	int MODEL_PORT_BLOCK_STRUCTURE = 12;


	/**
	 * Returns the meta object for class '{@link targets.configdesk.dSpaceArinc825.A825Configuration <em>A825 Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A825 Configuration</em>'.
	 * @see targets.configdesk.dSpaceArinc825.A825Configuration
	 * @generated
	 */
	EClass getA825Configuration();

	/**
	 * Returns the meta object for the attribute '{@link targets.configdesk.dSpaceArinc825.A825Configuration#getChannelName <em>Channel Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel Name</em>'.
	 * @see targets.configdesk.dSpaceArinc825.A825Configuration#getChannelName()
	 * @see #getA825Configuration()
	 * @generated
	 */
	EAttribute getA825Configuration_ChannelName();

	/**
	 * Returns the meta object for the attribute '{@link targets.configdesk.dSpaceArinc825.A825Configuration#getTerminated <em>Terminated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Terminated</em>'.
	 * @see targets.configdesk.dSpaceArinc825.A825Configuration#getTerminated()
	 * @see #getA825Configuration()
	 * @generated
	 */
	EAttribute getA825Configuration_Terminated();

	/**
	 * Returns the meta object for the attribute '{@link targets.configdesk.dSpaceArinc825.A825Configuration#getAssignedChannelSet <em>Assigned Channel Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assigned Channel Set</em>'.
	 * @see targets.configdesk.dSpaceArinc825.A825Configuration#getAssignedChannelSet()
	 * @see #getA825Configuration()
	 * @generated
	 */
	EAttribute getA825Configuration_AssignedChannelSet();

	/**
	 * Returns the meta object for the attribute '{@link targets.configdesk.dSpaceArinc825.A825Configuration#getCanChannel <em>Can Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Channel</em>'.
	 * @see targets.configdesk.dSpaceArinc825.A825Configuration#getCanChannel()
	 * @see #getA825Configuration()
	 * @generated
	 */
	EAttribute getA825Configuration_CanChannel();

	/**
	 * Returns the meta object for the attribute '{@link targets.configdesk.dSpaceArinc825.A825Configuration#getModelAccess <em>Model Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Access</em>'.
	 * @see targets.configdesk.dSpaceArinc825.A825Configuration#getModelAccess()
	 * @see #getA825Configuration()
	 * @generated
	 */
	EAttribute getA825Configuration_ModelAccess();

	/**
	 * Returns the meta object for the attribute '{@link targets.configdesk.dSpaceArinc825.A825Configuration#getModelPortBlockStructure <em>Model Port Block Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Port Block Structure</em>'.
	 * @see targets.configdesk.dSpaceArinc825.A825Configuration#getModelPortBlockStructure()
	 * @see #getA825Configuration()
	 * @generated
	 */
	EAttribute getA825Configuration_ModelPortBlockStructure();

	/**
	 * Returns the meta object for the attribute '{@link targets.configdesk.dSpaceArinc825.A825Configuration#getECU <em>ECU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ECU</em>'.
	 * @see targets.configdesk.dSpaceArinc825.A825Configuration#getECU()
	 * @see #getA825Configuration()
	 * @generated
	 */
	EAttribute getA825Configuration_ECU();

	/**
	 * Returns the meta object for the containment reference list '{@link targets.configdesk.dSpaceArinc825.A825Configuration#getStatusExtension <em>Status Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Status Extension</em>'.
	 * @see targets.configdesk.dSpaceArinc825.A825Configuration#getStatusExtension()
	 * @see #getA825Configuration()
	 * @generated
	 */
	EReference getA825Configuration_StatusExtension();

	/**
	 * Returns the meta object for class '{@link targets.configdesk.dSpaceArinc825.SuperConfigurationDeskA825StatusExtensionType <em>Super Configuration Desk A825 Status Extension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Configuration Desk A825 Status Extension Type</em>'.
	 * @see targets.configdesk.dSpaceArinc825.SuperConfigurationDeskA825StatusExtensionType
	 * @generated
	 */
	EClass getSuperConfigurationDeskA825StatusExtensionType();

	/**
	 * Returns the meta object for class '{@link targets.configdesk.dSpaceArinc825.SignalModelAccessStatus <em>Signal Model Access Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Model Access Status</em>'.
	 * @see targets.configdesk.dSpaceArinc825.SignalModelAccessStatus
	 * @generated
	 */
	EClass getSignalModelAccessStatus();

	/**
	 * Returns the meta object for the attribute '{@link targets.configdesk.dSpaceArinc825.SignalModelAccessStatus#getModelAccessEnabled <em>Model Access Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Access Enabled</em>'.
	 * @see targets.configdesk.dSpaceArinc825.SignalModelAccessStatus#getModelAccessEnabled()
	 * @see #getSignalModelAccessStatus()
	 * @generated
	 */
	EAttribute getSignalModelAccessStatus_ModelAccessEnabled();

	/**
	 * Returns the meta object for class '{@link targets.configdesk.dSpaceArinc825.SuperFeatureType <em>Super Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Feature Type</em>'.
	 * @see targets.configdesk.dSpaceArinc825.SuperFeatureType
	 * @generated
	 */
	EClass getSuperFeatureType();

	/**
	 * Returns the meta object for class '{@link targets.configdesk.dSpaceArinc825.FeatureTrigger <em>Feature Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Trigger</em>'.
	 * @see targets.configdesk.dSpaceArinc825.FeatureTrigger
	 * @generated
	 */
	EClass getFeatureTrigger();

	/**
	 * Returns the meta object for the attribute '{@link targets.configdesk.dSpaceArinc825.FeatureTrigger#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger</em>'.
	 * @see targets.configdesk.dSpaceArinc825.FeatureTrigger#getTrigger()
	 * @see #getFeatureTrigger()
	 * @generated
	 */
	EAttribute getFeatureTrigger_Trigger();

	/**
	 * Returns the meta object for class '{@link targets.configdesk.dSpaceArinc825.FeatureCyclicTimingControl <em>Feature Cyclic Timing Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Cyclic Timing Control</em>'.
	 * @see targets.configdesk.dSpaceArinc825.FeatureCyclicTimingControl
	 * @generated
	 */
	EClass getFeatureCyclicTimingControl();

	/**
	 * Returns the meta object for the attribute '{@link targets.configdesk.dSpaceArinc825.FeatureCyclicTimingControl#getControlPeriodModelAccess <em>Control Period Model Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Period Model Access</em>'.
	 * @see targets.configdesk.dSpaceArinc825.FeatureCyclicTimingControl#getControlPeriodModelAccess()
	 * @see #getFeatureCyclicTimingControl()
	 * @generated
	 */
	EAttribute getFeatureCyclicTimingControl_ControlPeriodModelAccess();

	/**
	 * Returns the meta object for the attribute '{@link targets.configdesk.dSpaceArinc825.FeatureCyclicTimingControl#getControlOffsetModelAccess <em>Control Offset Model Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Offset Model Access</em>'.
	 * @see targets.configdesk.dSpaceArinc825.FeatureCyclicTimingControl#getControlOffsetModelAccess()
	 * @see #getFeatureCyclicTimingControl()
	 * @generated
	 */
	EAttribute getFeatureCyclicTimingControl_ControlOffsetModelAccess();

	/**
	 * Returns the meta object for class '{@link targets.configdesk.dSpaceArinc825.FeatureRawData <em>Feature Raw Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Raw Data</em>'.
	 * @see targets.configdesk.dSpaceArinc825.FeatureRawData
	 * @generated
	 */
	EClass getFeatureRawData();

	/**
	 * Returns the meta object for the attribute '{@link targets.configdesk.dSpaceArinc825.FeatureRawData#getRawDataModelAccess <em>Raw Data Model Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raw Data Model Access</em>'.
	 * @see targets.configdesk.dSpaceArinc825.FeatureRawData#getRawDataModelAccess()
	 * @see #getFeatureRawData()
	 * @generated
	 */
	EAttribute getFeatureRawData_RawDataModelAccess();

	/**
	 * Returns the meta object for class '{@link targets.configdesk.dSpaceArinc825.FeatureEnable <em>Feature Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Enable</em>'.
	 * @see targets.configdesk.dSpaceArinc825.FeatureEnable
	 * @generated
	 */
	EClass getFeatureEnable();

	/**
	 * Returns the meta object for the attribute '{@link targets.configdesk.dSpaceArinc825.FeatureEnable#getEnableModelAccess <em>Enable Model Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Model Access</em>'.
	 * @see targets.configdesk.dSpaceArinc825.FeatureEnable#getEnableModelAccess()
	 * @see #getFeatureEnable()
	 * @generated
	 */
	EAttribute getFeatureEnable_EnableModelAccess();

	/**
	 * Returns the meta object for class '{@link targets.configdesk.dSpaceArinc825.FeatureFrameAccess <em>Feature Frame Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Frame Access</em>'.
	 * @see targets.configdesk.dSpaceArinc825.FeatureFrameAccess
	 * @generated
	 */
	EClass getFeatureFrameAccess();

	/**
	 * Returns the meta object for the attribute '{@link targets.configdesk.dSpaceArinc825.FeatureFrameAccess#getTriggerModelAccess <em>Trigger Model Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger Model Access</em>'.
	 * @see targets.configdesk.dSpaceArinc825.FeatureFrameAccess#getTriggerModelAccess()
	 * @see #getFeatureFrameAccess()
	 * @generated
	 */
	EAttribute getFeatureFrameAccess_TriggerModelAccess();

	/**
	 * Returns the meta object for the attribute '{@link targets.configdesk.dSpaceArinc825.FeatureFrameAccess#getLengthModelAccess <em>Length Model Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length Model Access</em>'.
	 * @see targets.configdesk.dSpaceArinc825.FeatureFrameAccess#getLengthModelAccess()
	 * @see #getFeatureFrameAccess()
	 * @generated
	 */
	EAttribute getFeatureFrameAccess_LengthModelAccess();

	/**
	 * Returns the meta object for the attribute '{@link targets.configdesk.dSpaceArinc825.FeatureFrameAccess#getRawDataModelAccess <em>Raw Data Model Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raw Data Model Access</em>'.
	 * @see targets.configdesk.dSpaceArinc825.FeatureFrameAccess#getRawDataModelAccess()
	 * @see #getFeatureFrameAccess()
	 * @generated
	 */
	EAttribute getFeatureFrameAccess_RawDataModelAccess();

	/**
	 * Returns the meta object for the attribute '{@link targets.configdesk.dSpaceArinc825.FeatureFrameAccess#getIdentifierModelAccess <em>Identifier Model Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier Model Access</em>'.
	 * @see targets.configdesk.dSpaceArinc825.FeatureFrameAccess#getIdentifierModelAccess()
	 * @see #getFeatureFrameAccess()
	 * @generated
	 */
	EAttribute getFeatureFrameAccess_IdentifierModelAccess();

	/**
	 * Returns the meta object for the attribute '{@link targets.configdesk.dSpaceArinc825.FeatureFrameAccess#getExtendedAddressingModelAccess <em>Extended Addressing Model Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extended Addressing Model Access</em>'.
	 * @see targets.configdesk.dSpaceArinc825.FeatureFrameAccess#getExtendedAddressingModelAccess()
	 * @see #getFeatureFrameAccess()
	 * @generated
	 */
	EAttribute getFeatureFrameAccess_ExtendedAddressingModelAccess();

	/**
	 * Returns the meta object for the attribute '{@link targets.configdesk.dSpaceArinc825.FeatureFrameAccess#getCanFDFrameSupportModelAccess <em>Can FD Frame Support Model Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can FD Frame Support Model Access</em>'.
	 * @see targets.configdesk.dSpaceArinc825.FeatureFrameAccess#getCanFDFrameSupportModelAccess()
	 * @see #getFeatureFrameAccess()
	 * @generated
	 */
	EAttribute getFeatureFrameAccess_CanFDFrameSupportModelAccess();

	/**
	 * Returns the meta object for the attribute '{@link targets.configdesk.dSpaceArinc825.FeatureFrameAccess#getBitRateSwitchModelAccess <em>Bit Rate Switch Model Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bit Rate Switch Model Access</em>'.
	 * @see targets.configdesk.dSpaceArinc825.FeatureFrameAccess#getBitRateSwitchModelAccess()
	 * @see #getFeatureFrameAccess()
	 * @generated
	 */
	EAttribute getFeatureFrameAccess_BitRateSwitchModelAccess();

	/**
	 * Returns the meta object for enum '{@link targets.configdesk.dSpaceArinc825.ModelAccess <em>Model Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Model Access</em>'.
	 * @see targets.configdesk.dSpaceArinc825.ModelAccess
	 * @generated
	 */
	EEnum getModelAccess();

	/**
	 * Returns the meta object for enum '{@link targets.configdesk.dSpaceArinc825.ModelAccessiblePortsRX <em>Model Accessible Ports RX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Model Accessible Ports RX</em>'.
	 * @see targets.configdesk.dSpaceArinc825.ModelAccessiblePortsRX
	 * @generated
	 */
	EEnum getModelAccessiblePortsRX();

	/**
	 * Returns the meta object for enum '{@link targets.configdesk.dSpaceArinc825.ModelAccessiblePortsTX <em>Model Accessible Ports TX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Model Accessible Ports TX</em>'.
	 * @see targets.configdesk.dSpaceArinc825.ModelAccessiblePortsTX
	 * @generated
	 */
	EEnum getModelAccessiblePortsTX();

	/**
	 * Returns the meta object for enum '{@link targets.configdesk.dSpaceArinc825.ModelPortBlockStructure <em>Model Port Block Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Model Port Block Structure</em>'.
	 * @see targets.configdesk.dSpaceArinc825.ModelPortBlockStructure
	 * @generated
	 */
	EEnum getModelPortBlockStructure();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DSpaceArinc825Factory getDSpaceArinc825Factory();

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
		 * The meta object literal for the '{@link targets.configdesk.dSpaceArinc825.impl.A825ConfigurationImpl <em>A825 Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.configdesk.dSpaceArinc825.impl.A825ConfigurationImpl
		 * @see targets.configdesk.dSpaceArinc825.impl.DSpaceArinc825PackageImpl#getA825Configuration()
		 * @generated
		 */
		EClass A825_CONFIGURATION = eINSTANCE.getA825Configuration();

		/**
		 * The meta object literal for the '<em><b>Channel Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A825_CONFIGURATION__CHANNEL_NAME = eINSTANCE.getA825Configuration_ChannelName();

		/**
		 * The meta object literal for the '<em><b>Terminated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A825_CONFIGURATION__TERMINATED = eINSTANCE.getA825Configuration_Terminated();

		/**
		 * The meta object literal for the '<em><b>Assigned Channel Set</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A825_CONFIGURATION__ASSIGNED_CHANNEL_SET = eINSTANCE.getA825Configuration_AssignedChannelSet();

		/**
		 * The meta object literal for the '<em><b>Can Channel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A825_CONFIGURATION__CAN_CHANNEL = eINSTANCE.getA825Configuration_CanChannel();

		/**
		 * The meta object literal for the '<em><b>Model Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A825_CONFIGURATION__MODEL_ACCESS = eINSTANCE.getA825Configuration_ModelAccess();

		/**
		 * The meta object literal for the '<em><b>Model Port Block Structure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A825_CONFIGURATION__MODEL_PORT_BLOCK_STRUCTURE = eINSTANCE.getA825Configuration_ModelPortBlockStructure();

		/**
		 * The meta object literal for the '<em><b>ECU</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A825_CONFIGURATION__ECU = eINSTANCE.getA825Configuration_ECU();

		/**
		 * The meta object literal for the '<em><b>Status Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference A825_CONFIGURATION__STATUS_EXTENSION = eINSTANCE.getA825Configuration_StatusExtension();

		/**
		 * The meta object literal for the '{@link targets.configdesk.dSpaceArinc825.impl.SuperConfigurationDeskA825StatusExtensionTypeImpl <em>Super Configuration Desk A825 Status Extension Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.configdesk.dSpaceArinc825.impl.SuperConfigurationDeskA825StatusExtensionTypeImpl
		 * @see targets.configdesk.dSpaceArinc825.impl.DSpaceArinc825PackageImpl#getSuperConfigurationDeskA825StatusExtensionType()
		 * @generated
		 */
		EClass SUPER_CONFIGURATION_DESK_A825_STATUS_EXTENSION_TYPE = eINSTANCE.getSuperConfigurationDeskA825StatusExtensionType();

		/**
		 * The meta object literal for the '{@link targets.configdesk.dSpaceArinc825.impl.SignalModelAccessStatusImpl <em>Signal Model Access Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.configdesk.dSpaceArinc825.impl.SignalModelAccessStatusImpl
		 * @see targets.configdesk.dSpaceArinc825.impl.DSpaceArinc825PackageImpl#getSignalModelAccessStatus()
		 * @generated
		 */
		EClass SIGNAL_MODEL_ACCESS_STATUS = eINSTANCE.getSignalModelAccessStatus();

		/**
		 * The meta object literal for the '<em><b>Model Access Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL_MODEL_ACCESS_STATUS__MODEL_ACCESS_ENABLED = eINSTANCE.getSignalModelAccessStatus_ModelAccessEnabled();

		/**
		 * The meta object literal for the '{@link targets.configdesk.dSpaceArinc825.impl.SuperFeatureTypeImpl <em>Super Feature Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.configdesk.dSpaceArinc825.impl.SuperFeatureTypeImpl
		 * @see targets.configdesk.dSpaceArinc825.impl.DSpaceArinc825PackageImpl#getSuperFeatureType()
		 * @generated
		 */
		EClass SUPER_FEATURE_TYPE = eINSTANCE.getSuperFeatureType();

		/**
		 * The meta object literal for the '{@link targets.configdesk.dSpaceArinc825.impl.FeatureTriggerImpl <em>Feature Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.configdesk.dSpaceArinc825.impl.FeatureTriggerImpl
		 * @see targets.configdesk.dSpaceArinc825.impl.DSpaceArinc825PackageImpl#getFeatureTrigger()
		 * @generated
		 */
		EClass FEATURE_TRIGGER = eINSTANCE.getFeatureTrigger();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_TRIGGER__TRIGGER = eINSTANCE.getFeatureTrigger_Trigger();

		/**
		 * The meta object literal for the '{@link targets.configdesk.dSpaceArinc825.impl.FeatureCyclicTimingControlImpl <em>Feature Cyclic Timing Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.configdesk.dSpaceArinc825.impl.FeatureCyclicTimingControlImpl
		 * @see targets.configdesk.dSpaceArinc825.impl.DSpaceArinc825PackageImpl#getFeatureCyclicTimingControl()
		 * @generated
		 */
		EClass FEATURE_CYCLIC_TIMING_CONTROL = eINSTANCE.getFeatureCyclicTimingControl();

		/**
		 * The meta object literal for the '<em><b>Control Period Model Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_CYCLIC_TIMING_CONTROL__CONTROL_PERIOD_MODEL_ACCESS = eINSTANCE.getFeatureCyclicTimingControl_ControlPeriodModelAccess();

		/**
		 * The meta object literal for the '<em><b>Control Offset Model Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_CYCLIC_TIMING_CONTROL__CONTROL_OFFSET_MODEL_ACCESS = eINSTANCE.getFeatureCyclicTimingControl_ControlOffsetModelAccess();

		/**
		 * The meta object literal for the '{@link targets.configdesk.dSpaceArinc825.impl.FeatureRawDataImpl <em>Feature Raw Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.configdesk.dSpaceArinc825.impl.FeatureRawDataImpl
		 * @see targets.configdesk.dSpaceArinc825.impl.DSpaceArinc825PackageImpl#getFeatureRawData()
		 * @generated
		 */
		EClass FEATURE_RAW_DATA = eINSTANCE.getFeatureRawData();

		/**
		 * The meta object literal for the '<em><b>Raw Data Model Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_RAW_DATA__RAW_DATA_MODEL_ACCESS = eINSTANCE.getFeatureRawData_RawDataModelAccess();

		/**
		 * The meta object literal for the '{@link targets.configdesk.dSpaceArinc825.impl.FeatureEnableImpl <em>Feature Enable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.configdesk.dSpaceArinc825.impl.FeatureEnableImpl
		 * @see targets.configdesk.dSpaceArinc825.impl.DSpaceArinc825PackageImpl#getFeatureEnable()
		 * @generated
		 */
		EClass FEATURE_ENABLE = eINSTANCE.getFeatureEnable();

		/**
		 * The meta object literal for the '<em><b>Enable Model Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_ENABLE__ENABLE_MODEL_ACCESS = eINSTANCE.getFeatureEnable_EnableModelAccess();

		/**
		 * The meta object literal for the '{@link targets.configdesk.dSpaceArinc825.impl.FeatureFrameAccessImpl <em>Feature Frame Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.configdesk.dSpaceArinc825.impl.FeatureFrameAccessImpl
		 * @see targets.configdesk.dSpaceArinc825.impl.DSpaceArinc825PackageImpl#getFeatureFrameAccess()
		 * @generated
		 */
		EClass FEATURE_FRAME_ACCESS = eINSTANCE.getFeatureFrameAccess();

		/**
		 * The meta object literal for the '<em><b>Trigger Model Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_FRAME_ACCESS__TRIGGER_MODEL_ACCESS = eINSTANCE.getFeatureFrameAccess_TriggerModelAccess();

		/**
		 * The meta object literal for the '<em><b>Length Model Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_FRAME_ACCESS__LENGTH_MODEL_ACCESS = eINSTANCE.getFeatureFrameAccess_LengthModelAccess();

		/**
		 * The meta object literal for the '<em><b>Raw Data Model Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_FRAME_ACCESS__RAW_DATA_MODEL_ACCESS = eINSTANCE.getFeatureFrameAccess_RawDataModelAccess();

		/**
		 * The meta object literal for the '<em><b>Identifier Model Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_FRAME_ACCESS__IDENTIFIER_MODEL_ACCESS = eINSTANCE.getFeatureFrameAccess_IdentifierModelAccess();

		/**
		 * The meta object literal for the '<em><b>Extended Addressing Model Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_FRAME_ACCESS__EXTENDED_ADDRESSING_MODEL_ACCESS = eINSTANCE.getFeatureFrameAccess_ExtendedAddressingModelAccess();

		/**
		 * The meta object literal for the '<em><b>Can FD Frame Support Model Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_FRAME_ACCESS__CAN_FD_FRAME_SUPPORT_MODEL_ACCESS = eINSTANCE.getFeatureFrameAccess_CanFDFrameSupportModelAccess();

		/**
		 * The meta object literal for the '<em><b>Bit Rate Switch Model Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_FRAME_ACCESS__BIT_RATE_SWITCH_MODEL_ACCESS = eINSTANCE.getFeatureFrameAccess_BitRateSwitchModelAccess();

		/**
		 * The meta object literal for the '{@link targets.configdesk.dSpaceArinc825.ModelAccess <em>Model Access</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.configdesk.dSpaceArinc825.ModelAccess
		 * @see targets.configdesk.dSpaceArinc825.impl.DSpaceArinc825PackageImpl#getModelAccess()
		 * @generated
		 */
		EEnum MODEL_ACCESS = eINSTANCE.getModelAccess();

		/**
		 * The meta object literal for the '{@link targets.configdesk.dSpaceArinc825.ModelAccessiblePortsRX <em>Model Accessible Ports RX</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.configdesk.dSpaceArinc825.ModelAccessiblePortsRX
		 * @see targets.configdesk.dSpaceArinc825.impl.DSpaceArinc825PackageImpl#getModelAccessiblePortsRX()
		 * @generated
		 */
		EEnum MODEL_ACCESSIBLE_PORTS_RX = eINSTANCE.getModelAccessiblePortsRX();

		/**
		 * The meta object literal for the '{@link targets.configdesk.dSpaceArinc825.ModelAccessiblePortsTX <em>Model Accessible Ports TX</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.configdesk.dSpaceArinc825.ModelAccessiblePortsTX
		 * @see targets.configdesk.dSpaceArinc825.impl.DSpaceArinc825PackageImpl#getModelAccessiblePortsTX()
		 * @generated
		 */
		EEnum MODEL_ACCESSIBLE_PORTS_TX = eINSTANCE.getModelAccessiblePortsTX();

		/**
		 * The meta object literal for the '{@link targets.configdesk.dSpaceArinc825.ModelPortBlockStructure <em>Model Port Block Structure</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.configdesk.dSpaceArinc825.ModelPortBlockStructure
		 * @see targets.configdesk.dSpaceArinc825.impl.DSpaceArinc825PackageImpl#getModelPortBlockStructure()
		 * @generated
		 */
		EEnum MODEL_PORT_BLOCK_STRUCTURE = eINSTANCE.getModelPortBlockStructure();

	}

} //DSpaceArinc825Package
