/**
 */
package targets.tricore299a653p4;

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
 * @see targets.tricore299a653p4.Tricore299a653p4Factory
 * @model kind="package"
 * @generated
 */
public interface Tricore299a653p4Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tricore299a653p4";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://gitlab.com/ucof/ucof.de/model/v001/ucof/targets/tricore299a653p4";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ucof.model.targets.tricore299a653p4";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Tricore299a653p4Package eINSTANCE = targets.tricore299a653p4.impl.Tricore299a653p4PackageImpl.init();

	/**
	 * The meta object id for the '{@link targets.tricore299a653p4.impl.TriCore299Impl <em>Tri Core299</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.tricore299a653p4.impl.TriCore299Impl
	 * @see targets.tricore299a653p4.impl.Tricore299a653p4PackageImpl#getTriCore299()
	 * @generated
	 */
	int TRI_CORE299 = 0;

	/**
	 * The feature id for the '<em><b>Hardware Topology Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_CORE299__HARDWARE_TOPOLOGY_NAME = TargetsPackage.HARDWARE_INFORMATION__HARDWARE_TOPOLOGY_NAME;

	/**
	 * The feature id for the '<em><b>Name Of Hardware System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_CORE299__NAME_OF_HARDWARE_SYSTEM = TargetsPackage.HARDWARE_INFORMATION__NAME_OF_HARDWARE_SYSTEM;

	/**
	 * The feature id for the '<em><b>IP Address Of Hardware System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_CORE299__IP_ADDRESS_OF_HARDWARE_SYSTEM = TargetsPackage.HARDWARE_INFORMATION__IP_ADDRESS_OF_HARDWARE_SYSTEM;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_CORE299__ID = TargetsPackage.HARDWARE_INFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_CORE299__NAME = TargetsPackage.HARDWARE_INFORMATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_CORE299__DOCUMENTATION = TargetsPackage.HARDWARE_INFORMATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_CORE299__MODIFIED = TargetsPackage.HARDWARE_INFORMATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_CORE299__MODIFIER = TargetsPackage.HARDWARE_INFORMATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_CORE299__TRACE_LINK = TargetsPackage.HARDWARE_INFORMATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_CORE299__CREATED = TargetsPackage.HARDWARE_INFORMATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_CORE299__CREATOR = TargetsPackage.HARDWARE_INFORMATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_CORE299__VERSION = TargetsPackage.HARDWARE_INFORMATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Operating Sytem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_CORE299__OPERATING_SYTEM = TargetsPackage.HARDWARE_INFORMATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_CORE299__PROJECT_NAME = TargetsPackage.HARDWARE_INFORMATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>IO Driver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_CORE299__IO_DRIVER = TargetsPackage.HARDWARE_INFORMATION_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Tri Core299</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_CORE299_FEATURE_COUNT = TargetsPackage.HARDWARE_INFORMATION_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Tri Core299</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_CORE299_OPERATION_COUNT = TargetsPackage.HARDWARE_INFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.tricore299a653p4.impl.SuperTriCore299IOHardwareTypeImpl <em>Super Tri Core299 IO Hardware Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.tricore299a653p4.impl.SuperTriCore299IOHardwareTypeImpl
	 * @see targets.tricore299a653p4.impl.Tricore299a653p4PackageImpl#getSuperTriCore299IOHardwareType()
	 * @generated
	 */
	int SUPER_TRI_CORE299_IO_HARDWARE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_TRI_CORE299_IO_HARDWARE_TYPE__ID = TargetsPackage.SUPER_IO_HARDWARE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_TRI_CORE299_IO_HARDWARE_TYPE__NAME = TargetsPackage.SUPER_IO_HARDWARE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_TRI_CORE299_IO_HARDWARE_TYPE__DOCUMENTATION = TargetsPackage.SUPER_IO_HARDWARE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_TRI_CORE299_IO_HARDWARE_TYPE__MODIFIED = TargetsPackage.SUPER_IO_HARDWARE_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_TRI_CORE299_IO_HARDWARE_TYPE__MODIFIER = TargetsPackage.SUPER_IO_HARDWARE_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_TRI_CORE299_IO_HARDWARE_TYPE__TRACE_LINK = TargetsPackage.SUPER_IO_HARDWARE_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_TRI_CORE299_IO_HARDWARE_TYPE__CREATED = TargetsPackage.SUPER_IO_HARDWARE_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_TRI_CORE299_IO_HARDWARE_TYPE__CREATOR = TargetsPackage.SUPER_IO_HARDWARE_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_TRI_CORE299_IO_HARDWARE_TYPE__VERSION = TargetsPackage.SUPER_IO_HARDWARE_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Assignment Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_TRI_CORE299_IO_HARDWARE_TYPE__ASSIGNMENT_SPECIFICATION = TargetsPackage.SUPER_IO_HARDWARE_TYPE__ASSIGNMENT_SPECIFICATION;

	/**
	 * The number of structural features of the '<em>Super Tri Core299 IO Hardware Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_TRI_CORE299_IO_HARDWARE_TYPE_FEATURE_COUNT = TargetsPackage.SUPER_IO_HARDWARE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Super Tri Core299 IO Hardware Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_TRI_CORE299_IO_HARDWARE_TYPE_OPERATION_COUNT = TargetsPackage.SUPER_IO_HARDWARE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.tricore299a653p4.impl.A825DriverConfigurationImpl <em>A825 Driver Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.tricore299a653p4.impl.A825DriverConfigurationImpl
	 * @see targets.tricore299a653p4.impl.Tricore299a653p4PackageImpl#getA825DriverConfiguration()
	 * @generated
	 */
	int A825_DRIVER_CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_DRIVER_CONFIGURATION__ID = SUPER_TRI_CORE299_IO_HARDWARE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_DRIVER_CONFIGURATION__NAME = SUPER_TRI_CORE299_IO_HARDWARE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_DRIVER_CONFIGURATION__DOCUMENTATION = SUPER_TRI_CORE299_IO_HARDWARE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_DRIVER_CONFIGURATION__MODIFIED = SUPER_TRI_CORE299_IO_HARDWARE_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_DRIVER_CONFIGURATION__MODIFIER = SUPER_TRI_CORE299_IO_HARDWARE_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_DRIVER_CONFIGURATION__TRACE_LINK = SUPER_TRI_CORE299_IO_HARDWARE_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_DRIVER_CONFIGURATION__CREATED = SUPER_TRI_CORE299_IO_HARDWARE_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_DRIVER_CONFIGURATION__CREATOR = SUPER_TRI_CORE299_IO_HARDWARE_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_DRIVER_CONFIGURATION__VERSION = SUPER_TRI_CORE299_IO_HARDWARE_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Assignment Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_DRIVER_CONFIGURATION__ASSIGNMENT_SPECIFICATION = SUPER_TRI_CORE299_IO_HARDWARE_TYPE__ASSIGNMENT_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>First Msg Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_DRIVER_CONFIGURATION__FIRST_MSG_BOX = SUPER_TRI_CORE299_IO_HARDWARE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_DRIVER_CONFIGURATION__NODE = SUPER_TRI_CORE299_IO_HARDWARE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>RJW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_DRIVER_CONFIGURATION__RJW = SUPER_TRI_CORE299_IO_HARDWARE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>RXSEL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_DRIVER_CONFIGURATION__RXSEL = SUPER_TRI_CORE299_IO_HARDWARE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>A825 Driver Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_DRIVER_CONFIGURATION_FEATURE_COUNT = SUPER_TRI_CORE299_IO_HARDWARE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>A825 Driver Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_DRIVER_CONFIGURATION_OPERATION_COUNT = SUPER_TRI_CORE299_IO_HARDWARE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.tricore299a653p4.impl.MessagePostBoxSpecifierImpl <em>Message Post Box Specifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.tricore299a653p4.impl.MessagePostBoxSpecifierImpl
	 * @see targets.tricore299a653p4.impl.Tricore299a653p4PackageImpl#getMessagePostBoxSpecifier()
	 * @generated
	 */
	int MESSAGE_POST_BOX_SPECIFIER = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_POST_BOX_SPECIFIER__ID = TargetsPackage.SUPER_ASSIGNMENT_SPECIFICATION_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_POST_BOX_SPECIFIER__NAME = TargetsPackage.SUPER_ASSIGNMENT_SPECIFICATION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_POST_BOX_SPECIFIER__DOCUMENTATION = TargetsPackage.SUPER_ASSIGNMENT_SPECIFICATION_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_POST_BOX_SPECIFIER__MODIFIED = TargetsPackage.SUPER_ASSIGNMENT_SPECIFICATION_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_POST_BOX_SPECIFIER__MODIFIER = TargetsPackage.SUPER_ASSIGNMENT_SPECIFICATION_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_POST_BOX_SPECIFIER__TRACE_LINK = TargetsPackage.SUPER_ASSIGNMENT_SPECIFICATION_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_POST_BOX_SPECIFIER__CREATED = TargetsPackage.SUPER_ASSIGNMENT_SPECIFICATION_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_POST_BOX_SPECIFIER__CREATOR = TargetsPackage.SUPER_ASSIGNMENT_SPECIFICATION_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_POST_BOX_SPECIFIER__VERSION = TargetsPackage.SUPER_ASSIGNMENT_SPECIFICATION_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Referenced Assignment ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_POST_BOX_SPECIFIER__REFERENCED_ASSIGNMENT_ID = TargetsPackage.SUPER_ASSIGNMENT_SPECIFICATION_TYPE__REFERENCED_ASSIGNMENT_ID;

	/**
	 * The feature id for the '<em><b>Post Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_POST_BOX_SPECIFIER__POST_BOX = TargetsPackage.SUPER_ASSIGNMENT_SPECIFICATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message Post Box Specifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_POST_BOX_SPECIFIER_FEATURE_COUNT = TargetsPackage.SUPER_ASSIGNMENT_SPECIFICATION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Message Post Box Specifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_POST_BOX_SPECIFIER_OPERATION_COUNT = TargetsPackage.SUPER_ASSIGNMENT_SPECIFICATION_TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link targets.tricore299a653p4.TriCore299 <em>Tri Core299</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tri Core299</em>'.
	 * @see targets.tricore299a653p4.TriCore299
	 * @generated
	 */
	EClass getTriCore299();

	/**
	 * Returns the meta object for the containment reference '{@link targets.tricore299a653p4.TriCore299#getIODriver <em>IO Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IO Driver</em>'.
	 * @see targets.tricore299a653p4.TriCore299#getIODriver()
	 * @see #getTriCore299()
	 * @generated
	 */
	EReference getTriCore299_IODriver();

	/**
	 * Returns the meta object for class '{@link targets.tricore299a653p4.SuperTriCore299IOHardwareType <em>Super Tri Core299 IO Hardware Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Tri Core299 IO Hardware Type</em>'.
	 * @see targets.tricore299a653p4.SuperTriCore299IOHardwareType
	 * @generated
	 */
	EClass getSuperTriCore299IOHardwareType();

	/**
	 * Returns the meta object for class '{@link targets.tricore299a653p4.A825DriverConfiguration <em>A825 Driver Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A825 Driver Configuration</em>'.
	 * @see targets.tricore299a653p4.A825DriverConfiguration
	 * @generated
	 */
	EClass getA825DriverConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link targets.tricore299a653p4.A825DriverConfiguration#getFirstMsgBox <em>First Msg Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Msg Box</em>'.
	 * @see targets.tricore299a653p4.A825DriverConfiguration#getFirstMsgBox()
	 * @see #getA825DriverConfiguration()
	 * @generated
	 */
	EAttribute getA825DriverConfiguration_FirstMsgBox();

	/**
	 * Returns the meta object for the attribute '{@link targets.tricore299a653p4.A825DriverConfiguration#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see targets.tricore299a653p4.A825DriverConfiguration#getNode()
	 * @see #getA825DriverConfiguration()
	 * @generated
	 */
	EAttribute getA825DriverConfiguration_Node();

	/**
	 * Returns the meta object for the attribute '{@link targets.tricore299a653p4.A825DriverConfiguration#getRJW <em>RJW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RJW</em>'.
	 * @see targets.tricore299a653p4.A825DriverConfiguration#getRJW()
	 * @see #getA825DriverConfiguration()
	 * @generated
	 */
	EAttribute getA825DriverConfiguration_RJW();

	/**
	 * Returns the meta object for the attribute '{@link targets.tricore299a653p4.A825DriverConfiguration#getRXSEL <em>RXSEL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RXSEL</em>'.
	 * @see targets.tricore299a653p4.A825DriverConfiguration#getRXSEL()
	 * @see #getA825DriverConfiguration()
	 * @generated
	 */
	EAttribute getA825DriverConfiguration_RXSEL();

	/**
	 * Returns the meta object for class '{@link targets.tricore299a653p4.MessagePostBoxSpecifier <em>Message Post Box Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Post Box Specifier</em>'.
	 * @see targets.tricore299a653p4.MessagePostBoxSpecifier
	 * @generated
	 */
	EClass getMessagePostBoxSpecifier();

	/**
	 * Returns the meta object for the attribute '{@link targets.tricore299a653p4.MessagePostBoxSpecifier#getPostBox <em>Post Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Post Box</em>'.
	 * @see targets.tricore299a653p4.MessagePostBoxSpecifier#getPostBox()
	 * @see #getMessagePostBoxSpecifier()
	 * @generated
	 */
	EAttribute getMessagePostBoxSpecifier_PostBox();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Tricore299a653p4Factory getTricore299a653p4Factory();

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
		 * The meta object literal for the '{@link targets.tricore299a653p4.impl.TriCore299Impl <em>Tri Core299</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.tricore299a653p4.impl.TriCore299Impl
		 * @see targets.tricore299a653p4.impl.Tricore299a653p4PackageImpl#getTriCore299()
		 * @generated
		 */
		EClass TRI_CORE299 = eINSTANCE.getTriCore299();

		/**
		 * The meta object literal for the '<em><b>IO Driver</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRI_CORE299__IO_DRIVER = eINSTANCE.getTriCore299_IODriver();

		/**
		 * The meta object literal for the '{@link targets.tricore299a653p4.impl.SuperTriCore299IOHardwareTypeImpl <em>Super Tri Core299 IO Hardware Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.tricore299a653p4.impl.SuperTriCore299IOHardwareTypeImpl
		 * @see targets.tricore299a653p4.impl.Tricore299a653p4PackageImpl#getSuperTriCore299IOHardwareType()
		 * @generated
		 */
		EClass SUPER_TRI_CORE299_IO_HARDWARE_TYPE = eINSTANCE.getSuperTriCore299IOHardwareType();

		/**
		 * The meta object literal for the '{@link targets.tricore299a653p4.impl.A825DriverConfigurationImpl <em>A825 Driver Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.tricore299a653p4.impl.A825DriverConfigurationImpl
		 * @see targets.tricore299a653p4.impl.Tricore299a653p4PackageImpl#getA825DriverConfiguration()
		 * @generated
		 */
		EClass A825_DRIVER_CONFIGURATION = eINSTANCE.getA825DriverConfiguration();

		/**
		 * The meta object literal for the '<em><b>First Msg Box</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A825_DRIVER_CONFIGURATION__FIRST_MSG_BOX = eINSTANCE.getA825DriverConfiguration_FirstMsgBox();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A825_DRIVER_CONFIGURATION__NODE = eINSTANCE.getA825DriverConfiguration_Node();

		/**
		 * The meta object literal for the '<em><b>RJW</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A825_DRIVER_CONFIGURATION__RJW = eINSTANCE.getA825DriverConfiguration_RJW();

		/**
		 * The meta object literal for the '<em><b>RXSEL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A825_DRIVER_CONFIGURATION__RXSEL = eINSTANCE.getA825DriverConfiguration_RXSEL();

		/**
		 * The meta object literal for the '{@link targets.tricore299a653p4.impl.MessagePostBoxSpecifierImpl <em>Message Post Box Specifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.tricore299a653p4.impl.MessagePostBoxSpecifierImpl
		 * @see targets.tricore299a653p4.impl.Tricore299a653p4PackageImpl#getMessagePostBoxSpecifier()
		 * @generated
		 */
		EClass MESSAGE_POST_BOX_SPECIFIER = eINSTANCE.getMessagePostBoxSpecifier();

		/**
		 * The meta object literal for the '<em><b>Post Box</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_POST_BOX_SPECIFIER__POST_BOX = eINSTANCE.getMessagePostBoxSpecifier_PostBox();

	}

} //Tricore299a653p4Package
