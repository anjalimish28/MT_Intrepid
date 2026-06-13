/**
 */
package targets.powergrid;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import ucof.assignments.AssignmentsPackage;

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
 * @see targets.powergrid.PowergridFactory
 * @model kind="package"
 * @generated
 */
public interface PowergridPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "powergrid";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://gitlab.com/ucof/ucof.de/model/v001/ucof/targets/powergrid";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ucof.model.targets.powergrid";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PowergridPackage eINSTANCE = targets.powergrid.impl.PowergridPackageImpl.init();

	/**
	 * The meta object id for the '{@link targets.powergrid.impl.SuperPowerTypeImpl <em>Super Power Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.powergrid.impl.SuperPowerTypeImpl
	 * @see targets.powergrid.impl.PowergridPackageImpl#getSuperPowerType()
	 * @generated
	 */
	int SUPER_POWER_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_POWER_TYPE__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_POWER_TYPE__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_POWER_TYPE__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_POWER_TYPE__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_POWER_TYPE__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_POWER_TYPE__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_POWER_TYPE__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_POWER_TYPE__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_POWER_TYPE__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Electrical Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_POWER_TYPE__ELECTRICAL_INTERFACES = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Super Power Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_POWER_TYPE_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Super Power Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_POWER_TYPE_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.powergrid.impl.EletrcialInterfacesImpl <em>Eletrcial Interfaces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.powergrid.impl.EletrcialInterfacesImpl
	 * @see targets.powergrid.impl.PowergridPackageImpl#getEletrcialInterfaces()
	 * @generated
	 */
	int ELETRCIAL_INTERFACES = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELETRCIAL_INTERFACES__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELETRCIAL_INTERFACES__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELETRCIAL_INTERFACES__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELETRCIAL_INTERFACES__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELETRCIAL_INTERFACES__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELETRCIAL_INTERFACES__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELETRCIAL_INTERFACES__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELETRCIAL_INTERFACES__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELETRCIAL_INTERFACES__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Electrical Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELETRCIAL_INTERFACES__ELECTRICAL_INTERFACE = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Eletrcial Interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELETRCIAL_INTERFACES_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Eletrcial Interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELETRCIAL_INTERFACES_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.powergrid.impl.SuperElectricalInterfaceTypeImpl <em>Super Electrical Interface Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.powergrid.impl.SuperElectricalInterfaceTypeImpl
	 * @see targets.powergrid.impl.PowergridPackageImpl#getSuperElectricalInterfaceType()
	 * @generated
	 */
	int SUPER_ELECTRICAL_INTERFACE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ELECTRICAL_INTERFACE_TYPE__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ELECTRICAL_INTERFACE_TYPE__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ELECTRICAL_INTERFACE_TYPE__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ELECTRICAL_INTERFACE_TYPE__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ELECTRICAL_INTERFACE_TYPE__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ELECTRICAL_INTERFACE_TYPE__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ELECTRICAL_INTERFACE_TYPE__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ELECTRICAL_INTERFACE_TYPE__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ELECTRICAL_INTERFACE_TYPE__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Min Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ELECTRICAL_INTERFACE_TYPE__MIN_VOLTAGE = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Max Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ELECTRICAL_INTERFACE_TYPE__MAX_VOLTAGE = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ELECTRICAL_INTERFACE_TYPE__TYPE = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Super Electrical Interface Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ELECTRICAL_INTERFACE_TYPE_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Super Electrical Interface Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ELECTRICAL_INTERFACE_TYPE_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.powergrid.impl.SuperElectricalGridTypeImpl <em>Super Electrical Grid Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.powergrid.impl.SuperElectricalGridTypeImpl
	 * @see targets.powergrid.impl.PowergridPackageImpl#getSuperElectricalGridType()
	 * @generated
	 */
	int SUPER_ELECTRICAL_GRID_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ELECTRICAL_GRID_TYPE__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ELECTRICAL_GRID_TYPE__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ELECTRICAL_GRID_TYPE__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ELECTRICAL_GRID_TYPE__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ELECTRICAL_GRID_TYPE__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ELECTRICAL_GRID_TYPE__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ELECTRICAL_GRID_TYPE__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ELECTRICAL_GRID_TYPE__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ELECTRICAL_GRID_TYPE__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Defined Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ELECTRICAL_GRID_TYPE__DEFINED_VOLTAGE = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Nominal Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ELECTRICAL_GRID_TYPE__NOMINAL_VOLTAGE = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Super Electrical Grid Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ELECTRICAL_GRID_TYPE_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Super Electrical Grid Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ELECTRICAL_GRID_TYPE_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.powergrid.impl.PowerConnectionSetImpl <em>Power Connection Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.powergrid.impl.PowerConnectionSetImpl
	 * @see targets.powergrid.impl.PowergridPackageImpl#getPowerConnectionSet()
	 * @generated
	 */
	int POWER_CONNECTION_SET = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONNECTION_SET__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONNECTION_SET__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONNECTION_SET__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONNECTION_SET__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONNECTION_SET__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONNECTION_SET__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONNECTION_SET__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONNECTION_SET__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONNECTION_SET__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Power Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONNECTION_SET__POWER_CONNECTION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Power Connection Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONNECTION_SET_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Power Connection Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONNECTION_SET_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.powergrid.impl.PowerConnectionImpl <em>Power Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.powergrid.impl.PowerConnectionImpl
	 * @see targets.powergrid.impl.PowergridPackageImpl#getPowerConnection()
	 * @generated
	 */
	int POWER_CONNECTION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONNECTION__ID = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONNECTION__NAME = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONNECTION__DOCUMENTATION = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONNECTION__MODIFIED = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONNECTION__MODIFIER = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONNECTION__TRACE_LINK = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONNECTION__CREATED = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONNECTION__CREATOR = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONNECTION__VERSION = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONNECTION__SOURCE_ID = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__SOURCE_ID;

	/**
	 * The feature id for the '<em><b>Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONNECTION__TARGET_ID = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Resistance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONNECTION__RESISTANCE = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Power Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONNECTION_FEATURE_COUNT = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Power Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONNECTION_OPERATION_COUNT = AssignmentsPackage.SUPER_ASSIGNMENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.powergrid.impl.ElectricalPowerGridSetImpl <em>Electrical Power Grid Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.powergrid.impl.ElectricalPowerGridSetImpl
	 * @see targets.powergrid.impl.PowergridPackageImpl#getElectricalPowerGridSet()
	 * @generated
	 */
	int ELECTRICAL_POWER_GRID_SET = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_POWER_GRID_SET__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_POWER_GRID_SET__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_POWER_GRID_SET__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_POWER_GRID_SET__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_POWER_GRID_SET__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_POWER_GRID_SET__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_POWER_GRID_SET__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_POWER_GRID_SET__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_POWER_GRID_SET__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Electrical Grid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_POWER_GRID_SET__ELECTRICAL_GRID = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Electrical Power Grid Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_POWER_GRID_SET_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Electrical Power Grid Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_POWER_GRID_SET_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.powergrid.interfaceType <em>interface Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.powergrid.interfaceType
	 * @see targets.powergrid.impl.PowergridPackageImpl#getinterfaceType()
	 * @generated
	 */
	int INTERFACE_TYPE = 7;

	/**
	 * The meta object id for the '{@link targets.powergrid.gridType <em>grid Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.powergrid.gridType
	 * @see targets.powergrid.impl.PowergridPackageImpl#getgridType()
	 * @generated
	 */
	int GRID_TYPE = 8;


	/**
	 * Returns the meta object for class '{@link targets.powergrid.SuperPowerType <em>Super Power Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Power Type</em>'.
	 * @see targets.powergrid.SuperPowerType
	 * @generated
	 */
	EClass getSuperPowerType();

	/**
	 * Returns the meta object for the containment reference '{@link targets.powergrid.SuperPowerType#getElectricalInterfaces <em>Electrical Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Electrical Interfaces</em>'.
	 * @see targets.powergrid.SuperPowerType#getElectricalInterfaces()
	 * @see #getSuperPowerType()
	 * @generated
	 */
	EReference getSuperPowerType_ElectricalInterfaces();

	/**
	 * Returns the meta object for class '{@link targets.powergrid.EletrcialInterfaces <em>Eletrcial Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eletrcial Interfaces</em>'.
	 * @see targets.powergrid.EletrcialInterfaces
	 * @generated
	 */
	EClass getEletrcialInterfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link targets.powergrid.EletrcialInterfaces#getElectricalInterface <em>Electrical Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Electrical Interface</em>'.
	 * @see targets.powergrid.EletrcialInterfaces#getElectricalInterface()
	 * @see #getEletrcialInterfaces()
	 * @generated
	 */
	EReference getEletrcialInterfaces_ElectricalInterface();

	/**
	 * Returns the meta object for class '{@link targets.powergrid.SuperElectricalInterfaceType <em>Super Electrical Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Electrical Interface Type</em>'.
	 * @see targets.powergrid.SuperElectricalInterfaceType
	 * @generated
	 */
	EClass getSuperElectricalInterfaceType();

	/**
	 * Returns the meta object for the attribute '{@link targets.powergrid.SuperElectricalInterfaceType#getMinVoltage <em>Min Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Voltage</em>'.
	 * @see targets.powergrid.SuperElectricalInterfaceType#getMinVoltage()
	 * @see #getSuperElectricalInterfaceType()
	 * @generated
	 */
	EAttribute getSuperElectricalInterfaceType_MinVoltage();

	/**
	 * Returns the meta object for the attribute '{@link targets.powergrid.SuperElectricalInterfaceType#getMaxVoltage <em>Max Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Voltage</em>'.
	 * @see targets.powergrid.SuperElectricalInterfaceType#getMaxVoltage()
	 * @see #getSuperElectricalInterfaceType()
	 * @generated
	 */
	EAttribute getSuperElectricalInterfaceType_MaxVoltage();

	/**
	 * Returns the meta object for the attribute '{@link targets.powergrid.SuperElectricalInterfaceType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see targets.powergrid.SuperElectricalInterfaceType#getType()
	 * @see #getSuperElectricalInterfaceType()
	 * @generated
	 */
	EAttribute getSuperElectricalInterfaceType_Type();

	/**
	 * Returns the meta object for class '{@link targets.powergrid.SuperElectricalGridType <em>Super Electrical Grid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Electrical Grid Type</em>'.
	 * @see targets.powergrid.SuperElectricalGridType
	 * @generated
	 */
	EClass getSuperElectricalGridType();

	/**
	 * Returns the meta object for the attribute '{@link targets.powergrid.SuperElectricalGridType#getDefinedVoltage <em>Defined Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Defined Voltage</em>'.
	 * @see targets.powergrid.SuperElectricalGridType#getDefinedVoltage()
	 * @see #getSuperElectricalGridType()
	 * @generated
	 */
	EAttribute getSuperElectricalGridType_DefinedVoltage();

	/**
	 * Returns the meta object for the attribute '{@link targets.powergrid.SuperElectricalGridType#getNominalVoltage <em>Nominal Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nominal Voltage</em>'.
	 * @see targets.powergrid.SuperElectricalGridType#getNominalVoltage()
	 * @see #getSuperElectricalGridType()
	 * @generated
	 */
	EAttribute getSuperElectricalGridType_NominalVoltage();

	/**
	 * Returns the meta object for class '{@link targets.powergrid.PowerConnectionSet <em>Power Connection Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Connection Set</em>'.
	 * @see targets.powergrid.PowerConnectionSet
	 * @generated
	 */
	EClass getPowerConnectionSet();

	/**
	 * Returns the meta object for the containment reference list '{@link targets.powergrid.PowerConnectionSet#getPowerConnection <em>Power Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Power Connection</em>'.
	 * @see targets.powergrid.PowerConnectionSet#getPowerConnection()
	 * @see #getPowerConnectionSet()
	 * @generated
	 */
	EReference getPowerConnectionSet_PowerConnection();

	/**
	 * Returns the meta object for class '{@link targets.powergrid.PowerConnection <em>Power Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Connection</em>'.
	 * @see targets.powergrid.PowerConnection
	 * @generated
	 */
	EClass getPowerConnection();

	/**
	 * Returns the meta object for the attribute '{@link targets.powergrid.PowerConnection#getResistance <em>Resistance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resistance</em>'.
	 * @see targets.powergrid.PowerConnection#getResistance()
	 * @see #getPowerConnection()
	 * @generated
	 */
	EAttribute getPowerConnection_Resistance();

	/**
	 * Returns the meta object for class '{@link targets.powergrid.ElectricalPowerGridSet <em>Electrical Power Grid Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Electrical Power Grid Set</em>'.
	 * @see targets.powergrid.ElectricalPowerGridSet
	 * @generated
	 */
	EClass getElectricalPowerGridSet();

	/**
	 * Returns the meta object for the containment reference list '{@link targets.powergrid.ElectricalPowerGridSet#getElectricalGrid <em>Electrical Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Electrical Grid</em>'.
	 * @see targets.powergrid.ElectricalPowerGridSet#getElectricalGrid()
	 * @see #getElectricalPowerGridSet()
	 * @generated
	 */
	EReference getElectricalPowerGridSet_ElectricalGrid();

	/**
	 * Returns the meta object for enum '{@link targets.powergrid.interfaceType <em>interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>interface Type</em>'.
	 * @see targets.powergrid.interfaceType
	 * @generated
	 */
	EEnum getinterfaceType();

	/**
	 * Returns the meta object for enum '{@link targets.powergrid.gridType <em>grid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>grid Type</em>'.
	 * @see targets.powergrid.gridType
	 * @generated
	 */
	EEnum getgridType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PowergridFactory getPowergridFactory();

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
		 * The meta object literal for the '{@link targets.powergrid.impl.SuperPowerTypeImpl <em>Super Power Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.powergrid.impl.SuperPowerTypeImpl
		 * @see targets.powergrid.impl.PowergridPackageImpl#getSuperPowerType()
		 * @generated
		 */
		EClass SUPER_POWER_TYPE = eINSTANCE.getSuperPowerType();

		/**
		 * The meta object literal for the '<em><b>Electrical Interfaces</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_POWER_TYPE__ELECTRICAL_INTERFACES = eINSTANCE.getSuperPowerType_ElectricalInterfaces();

		/**
		 * The meta object literal for the '{@link targets.powergrid.impl.EletrcialInterfacesImpl <em>Eletrcial Interfaces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.powergrid.impl.EletrcialInterfacesImpl
		 * @see targets.powergrid.impl.PowergridPackageImpl#getEletrcialInterfaces()
		 * @generated
		 */
		EClass ELETRCIAL_INTERFACES = eINSTANCE.getEletrcialInterfaces();

		/**
		 * The meta object literal for the '<em><b>Electrical Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELETRCIAL_INTERFACES__ELECTRICAL_INTERFACE = eINSTANCE.getEletrcialInterfaces_ElectricalInterface();

		/**
		 * The meta object literal for the '{@link targets.powergrid.impl.SuperElectricalInterfaceTypeImpl <em>Super Electrical Interface Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.powergrid.impl.SuperElectricalInterfaceTypeImpl
		 * @see targets.powergrid.impl.PowergridPackageImpl#getSuperElectricalInterfaceType()
		 * @generated
		 */
		EClass SUPER_ELECTRICAL_INTERFACE_TYPE = eINSTANCE.getSuperElectricalInterfaceType();

		/**
		 * The meta object literal for the '<em><b>Min Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_ELECTRICAL_INTERFACE_TYPE__MIN_VOLTAGE = eINSTANCE.getSuperElectricalInterfaceType_MinVoltage();

		/**
		 * The meta object literal for the '<em><b>Max Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_ELECTRICAL_INTERFACE_TYPE__MAX_VOLTAGE = eINSTANCE.getSuperElectricalInterfaceType_MaxVoltage();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_ELECTRICAL_INTERFACE_TYPE__TYPE = eINSTANCE.getSuperElectricalInterfaceType_Type();

		/**
		 * The meta object literal for the '{@link targets.powergrid.impl.SuperElectricalGridTypeImpl <em>Super Electrical Grid Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.powergrid.impl.SuperElectricalGridTypeImpl
		 * @see targets.powergrid.impl.PowergridPackageImpl#getSuperElectricalGridType()
		 * @generated
		 */
		EClass SUPER_ELECTRICAL_GRID_TYPE = eINSTANCE.getSuperElectricalGridType();

		/**
		 * The meta object literal for the '<em><b>Defined Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_ELECTRICAL_GRID_TYPE__DEFINED_VOLTAGE = eINSTANCE.getSuperElectricalGridType_DefinedVoltage();

		/**
		 * The meta object literal for the '<em><b>Nominal Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_ELECTRICAL_GRID_TYPE__NOMINAL_VOLTAGE = eINSTANCE.getSuperElectricalGridType_NominalVoltage();

		/**
		 * The meta object literal for the '{@link targets.powergrid.impl.PowerConnectionSetImpl <em>Power Connection Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.powergrid.impl.PowerConnectionSetImpl
		 * @see targets.powergrid.impl.PowergridPackageImpl#getPowerConnectionSet()
		 * @generated
		 */
		EClass POWER_CONNECTION_SET = eINSTANCE.getPowerConnectionSet();

		/**
		 * The meta object literal for the '<em><b>Power Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_CONNECTION_SET__POWER_CONNECTION = eINSTANCE.getPowerConnectionSet_PowerConnection();

		/**
		 * The meta object literal for the '{@link targets.powergrid.impl.PowerConnectionImpl <em>Power Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.powergrid.impl.PowerConnectionImpl
		 * @see targets.powergrid.impl.PowergridPackageImpl#getPowerConnection()
		 * @generated
		 */
		EClass POWER_CONNECTION = eINSTANCE.getPowerConnection();

		/**
		 * The meta object literal for the '<em><b>Resistance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWER_CONNECTION__RESISTANCE = eINSTANCE.getPowerConnection_Resistance();

		/**
		 * The meta object literal for the '{@link targets.powergrid.impl.ElectricalPowerGridSetImpl <em>Electrical Power Grid Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.powergrid.impl.ElectricalPowerGridSetImpl
		 * @see targets.powergrid.impl.PowergridPackageImpl#getElectricalPowerGridSet()
		 * @generated
		 */
		EClass ELECTRICAL_POWER_GRID_SET = eINSTANCE.getElectricalPowerGridSet();

		/**
		 * The meta object literal for the '<em><b>Electrical Grid</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELECTRICAL_POWER_GRID_SET__ELECTRICAL_GRID = eINSTANCE.getElectricalPowerGridSet_ElectricalGrid();

		/**
		 * The meta object literal for the '{@link targets.powergrid.interfaceType <em>interface Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.powergrid.interfaceType
		 * @see targets.powergrid.impl.PowergridPackageImpl#getinterfaceType()
		 * @generated
		 */
		EEnum INTERFACE_TYPE = eINSTANCE.getinterfaceType();

		/**
		 * The meta object literal for the '{@link targets.powergrid.gridType <em>grid Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.powergrid.gridType
		 * @see targets.powergrid.impl.PowergridPackageImpl#getgridType()
		 * @generated
		 */
		EEnum GRID_TYPE = eINSTANCE.getgridType();

	}

} //PowergridPackage
