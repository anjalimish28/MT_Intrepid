/**
 */
package targets.intrepidpowergrid;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import targets.powergrid.PowergridPackage;

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
 * @see targets.intrepidpowergrid.IntrepidpowergridFactory
 * @model kind="package"
 * @generated
 */
public interface IntrepidpowergridPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "intrepidpowergrid";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://gitlab.com/ucof/ucof.de/model/v001/ucof/targets/intrepidpowergrid";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ucof.model.targets.intrepidpowergrid";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntrepidpowergridPackage eINSTANCE = targets.intrepidpowergrid.impl.IntrepidpowergridPackageImpl.init();

	/**
	 * The meta object id for the '{@link targets.intrepidpowergrid.impl.intrepidElectricalGridImpl <em>intrepid Electrical Grid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.intrepidpowergrid.impl.intrepidElectricalGridImpl
	 * @see targets.intrepidpowergrid.impl.IntrepidpowergridPackageImpl#getintrepidElectricalGrid()
	 * @generated
	 */
	int INTREPID_ELECTRICAL_GRID = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTREPID_ELECTRICAL_GRID__ID = PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTREPID_ELECTRICAL_GRID__NAME = PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTREPID_ELECTRICAL_GRID__DOCUMENTATION = PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTREPID_ELECTRICAL_GRID__MODIFIED = PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTREPID_ELECTRICAL_GRID__MODIFIER = PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTREPID_ELECTRICAL_GRID__TRACE_LINK = PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTREPID_ELECTRICAL_GRID__CREATED = PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTREPID_ELECTRICAL_GRID__CREATOR = PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTREPID_ELECTRICAL_GRID__VERSION = PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Defined Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTREPID_ELECTRICAL_GRID__DEFINED_VOLTAGE = PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__DEFINED_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Nominal Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTREPID_ELECTRICAL_GRID__NOMINAL_VOLTAGE = PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE__NOMINAL_VOLTAGE;

	/**
	 * The number of structural features of the '<em>intrepid Electrical Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTREPID_ELECTRICAL_GRID_FEATURE_COUNT = PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>intrepid Electrical Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTREPID_ELECTRICAL_GRID_OPERATION_COUNT = PowergridPackage.SUPER_ELECTRICAL_GRID_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.intrepidpowergrid.impl.intrepidElectricalInterfaceImpl <em>intrepid Electrical Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.intrepidpowergrid.impl.intrepidElectricalInterfaceImpl
	 * @see targets.intrepidpowergrid.impl.IntrepidpowergridPackageImpl#getintrepidElectricalInterface()
	 * @generated
	 */
	int INTREPID_ELECTRICAL_INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTREPID_ELECTRICAL_INTERFACE__ID = PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTREPID_ELECTRICAL_INTERFACE__NAME = PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTREPID_ELECTRICAL_INTERFACE__DOCUMENTATION = PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTREPID_ELECTRICAL_INTERFACE__MODIFIED = PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTREPID_ELECTRICAL_INTERFACE__MODIFIER = PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTREPID_ELECTRICAL_INTERFACE__TRACE_LINK = PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTREPID_ELECTRICAL_INTERFACE__CREATED = PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTREPID_ELECTRICAL_INTERFACE__CREATOR = PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTREPID_ELECTRICAL_INTERFACE__VERSION = PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Min Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTREPID_ELECTRICAL_INTERFACE__MIN_VOLTAGE = PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__MIN_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Max Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTREPID_ELECTRICAL_INTERFACE__MAX_VOLTAGE = PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__MAX_VOLTAGE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTREPID_ELECTRICAL_INTERFACE__TYPE = PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__TYPE;

	/**
	 * The number of structural features of the '<em>intrepid Electrical Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTREPID_ELECTRICAL_INTERFACE_FEATURE_COUNT = PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>intrepid Electrical Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTREPID_ELECTRICAL_INTERFACE_OPERATION_COUNT = PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link targets.intrepidpowergrid.intrepidElectricalGrid <em>intrepid Electrical Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>intrepid Electrical Grid</em>'.
	 * @see targets.intrepidpowergrid.intrepidElectricalGrid
	 * @generated
	 */
	EClass getintrepidElectricalGrid();

	/**
	 * Returns the meta object for class '{@link targets.intrepidpowergrid.intrepidElectricalInterface <em>intrepid Electrical Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>intrepid Electrical Interface</em>'.
	 * @see targets.intrepidpowergrid.intrepidElectricalInterface
	 * @generated
	 */
	EClass getintrepidElectricalInterface();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IntrepidpowergridFactory getIntrepidpowergridFactory();

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
		 * The meta object literal for the '{@link targets.intrepidpowergrid.impl.intrepidElectricalGridImpl <em>intrepid Electrical Grid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.intrepidpowergrid.impl.intrepidElectricalGridImpl
		 * @see targets.intrepidpowergrid.impl.IntrepidpowergridPackageImpl#getintrepidElectricalGrid()
		 * @generated
		 */
		EClass INTREPID_ELECTRICAL_GRID = eINSTANCE.getintrepidElectricalGrid();

		/**
		 * The meta object literal for the '{@link targets.intrepidpowergrid.impl.intrepidElectricalInterfaceImpl <em>intrepid Electrical Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.intrepidpowergrid.impl.intrepidElectricalInterfaceImpl
		 * @see targets.intrepidpowergrid.impl.IntrepidpowergridPackageImpl#getintrepidElectricalInterface()
		 * @generated
		 */
		EClass INTREPID_ELECTRICAL_INTERFACE = eINSTANCE.getintrepidElectricalInterface();

	}

} //IntrepidpowergridPackage
