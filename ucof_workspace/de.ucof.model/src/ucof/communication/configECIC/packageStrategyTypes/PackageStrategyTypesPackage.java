/**
 */
package ucof.communication.configECIC.packageStrategyTypes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * <!-- begin-model-doc -->
 * Container, including all elements necessary for creating packet strategies in ECIC
 * <!-- end-model-doc -->
 * @see ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesFactory
 * @model kind="package"
 * @generated
 */
public interface PackageStrategyTypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "packageStrategyTypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://gitlab.com/ucof/ucof.de/model/v001/ucof/communication/configECIC/packageStrategyTypes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ucof.model.communication.configECIC.packageStrategyTypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PackageStrategyTypesPackage eINSTANCE = ucof.communication.configECIC.packageStrategyTypes.impl.PackageStrategyTypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link ucof.communication.configECIC.packageStrategyTypes.impl.SuperPacketStrategyTypeImpl <em>Super Packet Strategy Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.configECIC.packageStrategyTypes.impl.SuperPacketStrategyTypeImpl
	 * @see ucof.communication.configECIC.packageStrategyTypes.impl.PackageStrategyTypesPackageImpl#getSuperPacketStrategyType()
	 * @generated
	 */
	int SUPER_PACKET_STRATEGY_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PACKET_STRATEGY_TYPE__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PACKET_STRATEGY_TYPE__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PACKET_STRATEGY_TYPE__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PACKET_STRATEGY_TYPE__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PACKET_STRATEGY_TYPE__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PACKET_STRATEGY_TYPE__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PACKET_STRATEGY_TYPE__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PACKET_STRATEGY_TYPE__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PACKET_STRATEGY_TYPE__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Period Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PACKET_STRATEGY_TYPE__PERIOD_NS = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Super Packet Strategy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PACKET_STRATEGY_TYPE_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Super Packet Strategy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_PACKET_STRATEGY_TYPE_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.configECIC.packageStrategyTypes.impl.A429PacketStrategyImpl <em>A429 Packet Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.configECIC.packageStrategyTypes.impl.A429PacketStrategyImpl
	 * @see ucof.communication.configECIC.packageStrategyTypes.impl.PackageStrategyTypesPackageImpl#getA429PacketStrategy()
	 * @generated
	 */
	int A429_PACKET_STRATEGY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_PACKET_STRATEGY__ID = SUPER_PACKET_STRATEGY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_PACKET_STRATEGY__NAME = SUPER_PACKET_STRATEGY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_PACKET_STRATEGY__DOCUMENTATION = SUPER_PACKET_STRATEGY_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_PACKET_STRATEGY__MODIFIED = SUPER_PACKET_STRATEGY_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_PACKET_STRATEGY__MODIFIER = SUPER_PACKET_STRATEGY_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_PACKET_STRATEGY__TRACE_LINK = SUPER_PACKET_STRATEGY_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_PACKET_STRATEGY__CREATED = SUPER_PACKET_STRATEGY_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_PACKET_STRATEGY__CREATOR = SUPER_PACKET_STRATEGY_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_PACKET_STRATEGY__VERSION = SUPER_PACKET_STRATEGY_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Period Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_PACKET_STRATEGY__PERIOD_NS = SUPER_PACKET_STRATEGY_TYPE__PERIOD_NS;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_PACKET_STRATEGY__DIRECTION = SUPER_PACKET_STRATEGY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_PACKET_STRATEGY__GAP = SUPER_PACKET_STRATEGY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Trigger Words</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_PACKET_STRATEGY__TRIGGER_WORDS = SUPER_PACKET_STRATEGY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>A429 Packet Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_PACKET_STRATEGY_FEATURE_COUNT = SUPER_PACKET_STRATEGY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>A429 Packet Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_PACKET_STRATEGY_OPERATION_COUNT = SUPER_PACKET_STRATEGY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.configECIC.packageStrategyTypes.impl.A825PacketStrategyImpl <em>A825 Packet Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.configECIC.packageStrategyTypes.impl.A825PacketStrategyImpl
	 * @see ucof.communication.configECIC.packageStrategyTypes.impl.PackageStrategyTypesPackageImpl#getA825PacketStrategy()
	 * @generated
	 */
	int A825_PACKET_STRATEGY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_PACKET_STRATEGY__ID = SUPER_PACKET_STRATEGY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_PACKET_STRATEGY__NAME = SUPER_PACKET_STRATEGY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_PACKET_STRATEGY__DOCUMENTATION = SUPER_PACKET_STRATEGY_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_PACKET_STRATEGY__MODIFIED = SUPER_PACKET_STRATEGY_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_PACKET_STRATEGY__MODIFIER = SUPER_PACKET_STRATEGY_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_PACKET_STRATEGY__TRACE_LINK = SUPER_PACKET_STRATEGY_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_PACKET_STRATEGY__CREATED = SUPER_PACKET_STRATEGY_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_PACKET_STRATEGY__CREATOR = SUPER_PACKET_STRATEGY_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_PACKET_STRATEGY__VERSION = SUPER_PACKET_STRATEGY_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Period Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_PACKET_STRATEGY__PERIOD_NS = SUPER_PACKET_STRATEGY_TYPE__PERIOD_NS;

	/**
	 * The feature id for the '<em><b>Frames</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_PACKET_STRATEGY__FRAMES = SUPER_PACKET_STRATEGY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>A825 Packet Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_PACKET_STRATEGY_FEATURE_COUNT = SUPER_PACKET_STRATEGY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>A825 Packet Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_PACKET_STRATEGY_OPERATION_COUNT = SUPER_PACKET_STRATEGY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.configECIC.packageStrategyTypes.impl.A664PacketStrategyImpl <em>A664 Packet Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.configECIC.packageStrategyTypes.impl.A664PacketStrategyImpl
	 * @see ucof.communication.configECIC.packageStrategyTypes.impl.PackageStrategyTypesPackageImpl#getA664PacketStrategy()
	 * @generated
	 */
	int A664_PACKET_STRATEGY = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_PACKET_STRATEGY__ID = SUPER_PACKET_STRATEGY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_PACKET_STRATEGY__NAME = SUPER_PACKET_STRATEGY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_PACKET_STRATEGY__DOCUMENTATION = SUPER_PACKET_STRATEGY_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_PACKET_STRATEGY__MODIFIED = SUPER_PACKET_STRATEGY_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_PACKET_STRATEGY__MODIFIER = SUPER_PACKET_STRATEGY_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_PACKET_STRATEGY__TRACE_LINK = SUPER_PACKET_STRATEGY_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_PACKET_STRATEGY__CREATED = SUPER_PACKET_STRATEGY_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_PACKET_STRATEGY__CREATOR = SUPER_PACKET_STRATEGY_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_PACKET_STRATEGY__VERSION = SUPER_PACKET_STRATEGY_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Period Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_PACKET_STRATEGY__PERIOD_NS = SUPER_PACKET_STRATEGY_TYPE__PERIOD_NS;

	/**
	 * The number of structural features of the '<em>A664 Packet Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_PACKET_STRATEGY_FEATURE_COUNT = SUPER_PACKET_STRATEGY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>A664 Packet Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_PACKET_STRATEGY_OPERATION_COUNT = SUPER_PACKET_STRATEGY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.configECIC.packageStrategyTypes.impl.ETHPacketStrategyImpl <em>ETH Packet Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.configECIC.packageStrategyTypes.impl.ETHPacketStrategyImpl
	 * @see ucof.communication.configECIC.packageStrategyTypes.impl.PackageStrategyTypesPackageImpl#getETHPacketStrategy()
	 * @generated
	 */
	int ETH_PACKET_STRATEGY = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_PACKET_STRATEGY__ID = SUPER_PACKET_STRATEGY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_PACKET_STRATEGY__NAME = SUPER_PACKET_STRATEGY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_PACKET_STRATEGY__DOCUMENTATION = SUPER_PACKET_STRATEGY_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_PACKET_STRATEGY__MODIFIED = SUPER_PACKET_STRATEGY_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_PACKET_STRATEGY__MODIFIER = SUPER_PACKET_STRATEGY_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_PACKET_STRATEGY__TRACE_LINK = SUPER_PACKET_STRATEGY_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_PACKET_STRATEGY__CREATED = SUPER_PACKET_STRATEGY_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_PACKET_STRATEGY__CREATOR = SUPER_PACKET_STRATEGY_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_PACKET_STRATEGY__VERSION = SUPER_PACKET_STRATEGY_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Period Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_PACKET_STRATEGY__PERIOD_NS = SUPER_PACKET_STRATEGY_TYPE__PERIOD_NS;

	/**
	 * The number of structural features of the '<em>ETH Packet Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_PACKET_STRATEGY_FEATURE_COUNT = SUPER_PACKET_STRATEGY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ETH Packet Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_PACKET_STRATEGY_OPERATION_COUNT = SUPER_PACKET_STRATEGY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.configECIC.packageStrategyTypes.impl.DISPacketStrategyImpl <em>DIS Packet Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.configECIC.packageStrategyTypes.impl.DISPacketStrategyImpl
	 * @see ucof.communication.configECIC.packageStrategyTypes.impl.PackageStrategyTypesPackageImpl#getDISPacketStrategy()
	 * @generated
	 */
	int DIS_PACKET_STRATEGY = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIS_PACKET_STRATEGY__ID = SUPER_PACKET_STRATEGY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIS_PACKET_STRATEGY__NAME = SUPER_PACKET_STRATEGY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIS_PACKET_STRATEGY__DOCUMENTATION = SUPER_PACKET_STRATEGY_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIS_PACKET_STRATEGY__MODIFIED = SUPER_PACKET_STRATEGY_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIS_PACKET_STRATEGY__MODIFIER = SUPER_PACKET_STRATEGY_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIS_PACKET_STRATEGY__TRACE_LINK = SUPER_PACKET_STRATEGY_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIS_PACKET_STRATEGY__CREATED = SUPER_PACKET_STRATEGY_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIS_PACKET_STRATEGY__CREATOR = SUPER_PACKET_STRATEGY_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIS_PACKET_STRATEGY__VERSION = SUPER_PACKET_STRATEGY_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Period Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIS_PACKET_STRATEGY__PERIOD_NS = SUPER_PACKET_STRATEGY_TYPE__PERIOD_NS;

	/**
	 * The feature id for the '<em><b>Reset Periodic Timer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIS_PACKET_STRATEGY__RESET_PERIODIC_TIMER = SUPER_PACKET_STRATEGY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DIS Packet Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIS_PACKET_STRATEGY_FEATURE_COUNT = SUPER_PACKET_STRATEGY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DIS Packet Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIS_PACKET_STRATEGY_OPERATION_COUNT = SUPER_PACKET_STRATEGY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.configECIC.packageStrategyTypes.impl.ANAPacketStrategyImpl <em>ANA Packet Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.configECIC.packageStrategyTypes.impl.ANAPacketStrategyImpl
	 * @see ucof.communication.configECIC.packageStrategyTypes.impl.PackageStrategyTypesPackageImpl#getANAPacketStrategy()
	 * @generated
	 */
	int ANA_PACKET_STRATEGY = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANA_PACKET_STRATEGY__ID = SUPER_PACKET_STRATEGY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANA_PACKET_STRATEGY__NAME = SUPER_PACKET_STRATEGY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANA_PACKET_STRATEGY__DOCUMENTATION = SUPER_PACKET_STRATEGY_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANA_PACKET_STRATEGY__MODIFIED = SUPER_PACKET_STRATEGY_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANA_PACKET_STRATEGY__MODIFIER = SUPER_PACKET_STRATEGY_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANA_PACKET_STRATEGY__TRACE_LINK = SUPER_PACKET_STRATEGY_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANA_PACKET_STRATEGY__CREATED = SUPER_PACKET_STRATEGY_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANA_PACKET_STRATEGY__CREATOR = SUPER_PACKET_STRATEGY_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANA_PACKET_STRATEGY__VERSION = SUPER_PACKET_STRATEGY_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Period Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANA_PACKET_STRATEGY__PERIOD_NS = SUPER_PACKET_STRATEGY_TYPE__PERIOD_NS;

	/**
	 * The number of structural features of the '<em>ANA Packet Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANA_PACKET_STRATEGY_FEATURE_COUNT = SUPER_PACKET_STRATEGY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ANA Packet Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANA_PACKET_STRATEGY_OPERATION_COUNT = SUPER_PACKET_STRATEGY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.configECIC.packageStrategyTypes.impl.NADPacketStrategyImpl <em>NAD Packet Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.configECIC.packageStrategyTypes.impl.NADPacketStrategyImpl
	 * @see ucof.communication.configECIC.packageStrategyTypes.impl.PackageStrategyTypesPackageImpl#getNADPacketStrategy()
	 * @generated
	 */
	int NAD_PACKET_STRATEGY = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAD_PACKET_STRATEGY__ID = SUPER_PACKET_STRATEGY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAD_PACKET_STRATEGY__NAME = SUPER_PACKET_STRATEGY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAD_PACKET_STRATEGY__DOCUMENTATION = SUPER_PACKET_STRATEGY_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAD_PACKET_STRATEGY__MODIFIED = SUPER_PACKET_STRATEGY_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAD_PACKET_STRATEGY__MODIFIER = SUPER_PACKET_STRATEGY_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAD_PACKET_STRATEGY__TRACE_LINK = SUPER_PACKET_STRATEGY_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAD_PACKET_STRATEGY__CREATED = SUPER_PACKET_STRATEGY_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAD_PACKET_STRATEGY__CREATOR = SUPER_PACKET_STRATEGY_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAD_PACKET_STRATEGY__VERSION = SUPER_PACKET_STRATEGY_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Period Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAD_PACKET_STRATEGY__PERIOD_NS = SUPER_PACKET_STRATEGY_TYPE__PERIOD_NS;

	/**
	 * The number of structural features of the '<em>NAD Packet Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAD_PACKET_STRATEGY_FEATURE_COUNT = SUPER_PACKET_STRATEGY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>NAD Packet Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAD_PACKET_STRATEGY_OPERATION_COUNT = SUPER_PACKET_STRATEGY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.configECIC.packageStrategyTypes.impl.GapImpl <em>Gap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.configECIC.packageStrategyTypes.impl.GapImpl
	 * @see ucof.communication.configECIC.packageStrategyTypes.impl.PackageStrategyTypesPackageImpl#getGap()
	 * @generated
	 */
	int GAP = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Duration Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP__DURATION_NS = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Reset Periodic Timer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP__RESET_PERIODIC_TIMER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Gap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Gap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.configECIC.packageStrategyTypes.impl.TriggerWordsImpl <em>Trigger Words</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.configECIC.packageStrategyTypes.impl.TriggerWordsImpl
	 * @see ucof.communication.configECIC.packageStrategyTypes.impl.PackageStrategyTypesPackageImpl#getTriggerWords()
	 * @generated
	 */
	int TRIGGER_WORDS = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_WORDS__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_WORDS__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_WORDS__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_WORDS__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_WORDS__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_WORDS__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_WORDS__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_WORDS__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_WORDS__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trigger Word</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_WORDS__TRIGGER_WORD = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Trigger Words</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_WORDS_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Trigger Words</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_WORDS_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.configECIC.packageStrategyTypes.impl.TriggerWordImpl <em>Trigger Word</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.configECIC.packageStrategyTypes.impl.TriggerWordImpl
	 * @see ucof.communication.configECIC.packageStrategyTypes.impl.PackageStrategyTypesPackageImpl#getTriggerWord()
	 * @generated
	 */
	int TRIGGER_WORD = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_WORD__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_WORD__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_WORD__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_WORD__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_WORD__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_WORD__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_WORD__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_WORD__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_WORD__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_WORD__LABEL = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>SDI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_WORD__SDI = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Reset Periodic Timer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_WORD__RESET_PERIODIC_TIMER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Trigger Word</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_WORD_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Trigger Word</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_WORD_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.configECIC.packageStrategyTypes.impl.FrameImpl <em>Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.configECIC.packageStrategyTypes.impl.FrameImpl
	 * @see ucof.communication.configECIC.packageStrategyTypes.impl.PackageStrategyTypesPackageImpl#getFrame()
	 * @generated
	 */
	int FRAME = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>A825ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__A825ID = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Reset Periodic Timer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__RESET_PERIODIC_TIMER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.configECIC.packageStrategyTypes.impl.LLCImpl <em>LLC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.configECIC.packageStrategyTypes.impl.LLCImpl
	 * @see ucof.communication.configECIC.packageStrategyTypes.impl.PackageStrategyTypesPackageImpl#getLLC()
	 * @generated
	 */
	int LLC = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLC__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLC__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLC__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLC__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLC__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLC__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLC__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLC__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLC__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>LLC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLC__LLC = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Reset Periodic Timer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLC__RESET_PERIODIC_TIMER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>LLC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLC_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>LLC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLC_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.configECIC.packageStrategyTypes.impl.FramesImpl <em>Frames</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.configECIC.packageStrategyTypes.impl.FramesImpl
	 * @see ucof.communication.configECIC.packageStrategyTypes.impl.PackageStrategyTypesPackageImpl#getFrames()
	 * @generated
	 */
	int FRAMES = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMES__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMES__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMES__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMES__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMES__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMES__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMES__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMES__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMES__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMES__FRAME = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>LLC</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMES__LLC = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Frames</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMES_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Frames</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMES_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.configECIC.packageStrategyTypes.LLCType <em>LLC Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.configECIC.packageStrategyTypes.LLCType
	 * @see ucof.communication.configECIC.packageStrategyTypes.impl.PackageStrategyTypesPackageImpl#getLLCType()
	 * @generated
	 */
	int LLC_TYPE = 14;


	/**
	 * Returns the meta object for class '{@link ucof.communication.configECIC.packageStrategyTypes.SuperPacketStrategyType <em>Super Packet Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Packet Strategy Type</em>'.
	 * @see ucof.communication.configECIC.packageStrategyTypes.SuperPacketStrategyType
	 * @generated
	 */
	EClass getSuperPacketStrategyType();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.packageStrategyTypes.SuperPacketStrategyType#getPeriodNs <em>Period Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period Ns</em>'.
	 * @see ucof.communication.configECIC.packageStrategyTypes.SuperPacketStrategyType#getPeriodNs()
	 * @see #getSuperPacketStrategyType()
	 * @generated
	 */
	EAttribute getSuperPacketStrategyType_PeriodNs();

	/**
	 * Returns the meta object for class '{@link ucof.communication.configECIC.packageStrategyTypes.A429PacketStrategy <em>A429 Packet Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A429 Packet Strategy</em>'.
	 * @see ucof.communication.configECIC.packageStrategyTypes.A429PacketStrategy
	 * @generated
	 */
	EClass getA429PacketStrategy();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.packageStrategyTypes.A429PacketStrategy#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see ucof.communication.configECIC.packageStrategyTypes.A429PacketStrategy#getDirection()
	 * @see #getA429PacketStrategy()
	 * @generated
	 */
	EAttribute getA429PacketStrategy_Direction();

	/**
	 * Returns the meta object for the containment reference '{@link ucof.communication.configECIC.packageStrategyTypes.A429PacketStrategy#getGap <em>Gap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gap</em>'.
	 * @see ucof.communication.configECIC.packageStrategyTypes.A429PacketStrategy#getGap()
	 * @see #getA429PacketStrategy()
	 * @generated
	 */
	EReference getA429PacketStrategy_Gap();

	/**
	 * Returns the meta object for the containment reference list '{@link ucof.communication.configECIC.packageStrategyTypes.A429PacketStrategy#getTriggerWords <em>Trigger Words</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trigger Words</em>'.
	 * @see ucof.communication.configECIC.packageStrategyTypes.A429PacketStrategy#getTriggerWords()
	 * @see #getA429PacketStrategy()
	 * @generated
	 */
	EReference getA429PacketStrategy_TriggerWords();

	/**
	 * Returns the meta object for class '{@link ucof.communication.configECIC.packageStrategyTypes.A825PacketStrategy <em>A825 Packet Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A825 Packet Strategy</em>'.
	 * @see ucof.communication.configECIC.packageStrategyTypes.A825PacketStrategy
	 * @generated
	 */
	EClass getA825PacketStrategy();

	/**
	 * Returns the meta object for the containment reference '{@link ucof.communication.configECIC.packageStrategyTypes.A825PacketStrategy#getFrames <em>Frames</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Frames</em>'.
	 * @see ucof.communication.configECIC.packageStrategyTypes.A825PacketStrategy#getFrames()
	 * @see #getA825PacketStrategy()
	 * @generated
	 */
	EReference getA825PacketStrategy_Frames();

	/**
	 * Returns the meta object for class '{@link ucof.communication.configECIC.packageStrategyTypes.A664PacketStrategy <em>A664 Packet Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A664 Packet Strategy</em>'.
	 * @see ucof.communication.configECIC.packageStrategyTypes.A664PacketStrategy
	 * @generated
	 */
	EClass getA664PacketStrategy();

	/**
	 * Returns the meta object for class '{@link ucof.communication.configECIC.packageStrategyTypes.ETHPacketStrategy <em>ETH Packet Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ETH Packet Strategy</em>'.
	 * @see ucof.communication.configECIC.packageStrategyTypes.ETHPacketStrategy
	 * @generated
	 */
	EClass getETHPacketStrategy();

	/**
	 * Returns the meta object for class '{@link ucof.communication.configECIC.packageStrategyTypes.DISPacketStrategy <em>DIS Packet Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DIS Packet Strategy</em>'.
	 * @see ucof.communication.configECIC.packageStrategyTypes.DISPacketStrategy
	 * @generated
	 */
	EClass getDISPacketStrategy();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.packageStrategyTypes.DISPacketStrategy#getResetPeriodicTimer <em>Reset Periodic Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reset Periodic Timer</em>'.
	 * @see ucof.communication.configECIC.packageStrategyTypes.DISPacketStrategy#getResetPeriodicTimer()
	 * @see #getDISPacketStrategy()
	 * @generated
	 */
	EAttribute getDISPacketStrategy_ResetPeriodicTimer();

	/**
	 * Returns the meta object for class '{@link ucof.communication.configECIC.packageStrategyTypes.ANAPacketStrategy <em>ANA Packet Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ANA Packet Strategy</em>'.
	 * @see ucof.communication.configECIC.packageStrategyTypes.ANAPacketStrategy
	 * @generated
	 */
	EClass getANAPacketStrategy();

	/**
	 * Returns the meta object for class '{@link ucof.communication.configECIC.packageStrategyTypes.NADPacketStrategy <em>NAD Packet Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NAD Packet Strategy</em>'.
	 * @see ucof.communication.configECIC.packageStrategyTypes.NADPacketStrategy
	 * @generated
	 */
	EClass getNADPacketStrategy();

	/**
	 * Returns the meta object for class '{@link ucof.communication.configECIC.packageStrategyTypes.Gap <em>Gap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gap</em>'.
	 * @see ucof.communication.configECIC.packageStrategyTypes.Gap
	 * @generated
	 */
	EClass getGap();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.packageStrategyTypes.Gap#getDurationNs <em>Duration Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration Ns</em>'.
	 * @see ucof.communication.configECIC.packageStrategyTypes.Gap#getDurationNs()
	 * @see #getGap()
	 * @generated
	 */
	EAttribute getGap_DurationNs();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.packageStrategyTypes.Gap#getResetPeriodicTimer <em>Reset Periodic Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reset Periodic Timer</em>'.
	 * @see ucof.communication.configECIC.packageStrategyTypes.Gap#getResetPeriodicTimer()
	 * @see #getGap()
	 * @generated
	 */
	EAttribute getGap_ResetPeriodicTimer();

	/**
	 * Returns the meta object for class '{@link ucof.communication.configECIC.packageStrategyTypes.TriggerWords <em>Trigger Words</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger Words</em>'.
	 * @see ucof.communication.configECIC.packageStrategyTypes.TriggerWords
	 * @generated
	 */
	EClass getTriggerWords();

	/**
	 * Returns the meta object for the containment reference list '{@link ucof.communication.configECIC.packageStrategyTypes.TriggerWords#getTriggerWord <em>Trigger Word</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trigger Word</em>'.
	 * @see ucof.communication.configECIC.packageStrategyTypes.TriggerWords#getTriggerWord()
	 * @see #getTriggerWords()
	 * @generated
	 */
	EReference getTriggerWords_TriggerWord();

	/**
	 * Returns the meta object for class '{@link ucof.communication.configECIC.packageStrategyTypes.TriggerWord <em>Trigger Word</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger Word</em>'.
	 * @see ucof.communication.configECIC.packageStrategyTypes.TriggerWord
	 * @generated
	 */
	EClass getTriggerWord();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.packageStrategyTypes.TriggerWord#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see ucof.communication.configECIC.packageStrategyTypes.TriggerWord#getLabel()
	 * @see #getTriggerWord()
	 * @generated
	 */
	EAttribute getTriggerWord_Label();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.packageStrategyTypes.TriggerWord#getSDI <em>SDI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SDI</em>'.
	 * @see ucof.communication.configECIC.packageStrategyTypes.TriggerWord#getSDI()
	 * @see #getTriggerWord()
	 * @generated
	 */
	EAttribute getTriggerWord_SDI();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.packageStrategyTypes.TriggerWord#getResetPeriodicTimer <em>Reset Periodic Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reset Periodic Timer</em>'.
	 * @see ucof.communication.configECIC.packageStrategyTypes.TriggerWord#getResetPeriodicTimer()
	 * @see #getTriggerWord()
	 * @generated
	 */
	EAttribute getTriggerWord_ResetPeriodicTimer();

	/**
	 * Returns the meta object for class '{@link ucof.communication.configECIC.packageStrategyTypes.Frame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frame</em>'.
	 * @see ucof.communication.configECIC.packageStrategyTypes.Frame
	 * @generated
	 */
	EClass getFrame();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.packageStrategyTypes.Frame#getA825ID <em>A825ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>A825ID</em>'.
	 * @see ucof.communication.configECIC.packageStrategyTypes.Frame#getA825ID()
	 * @see #getFrame()
	 * @generated
	 */
	EAttribute getFrame_A825ID();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.packageStrategyTypes.Frame#getResetPeriodicTimer <em>Reset Periodic Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reset Periodic Timer</em>'.
	 * @see ucof.communication.configECIC.packageStrategyTypes.Frame#getResetPeriodicTimer()
	 * @see #getFrame()
	 * @generated
	 */
	EAttribute getFrame_ResetPeriodicTimer();

	/**
	 * Returns the meta object for class '{@link ucof.communication.configECIC.packageStrategyTypes.LLC <em>LLC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LLC</em>'.
	 * @see ucof.communication.configECIC.packageStrategyTypes.LLC
	 * @generated
	 */
	EClass getLLC();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.packageStrategyTypes.LLC#getLLC <em>LLC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LLC</em>'.
	 * @see ucof.communication.configECIC.packageStrategyTypes.LLC#getLLC()
	 * @see #getLLC()
	 * @generated
	 */
	EAttribute getLLC_LLC();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.packageStrategyTypes.LLC#getResetPeriodicTimer <em>Reset Periodic Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reset Periodic Timer</em>'.
	 * @see ucof.communication.configECIC.packageStrategyTypes.LLC#getResetPeriodicTimer()
	 * @see #getLLC()
	 * @generated
	 */
	EAttribute getLLC_ResetPeriodicTimer();

	/**
	 * Returns the meta object for class '{@link ucof.communication.configECIC.packageStrategyTypes.Frames <em>Frames</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frames</em>'.
	 * @see ucof.communication.configECIC.packageStrategyTypes.Frames
	 * @generated
	 */
	EClass getFrames();

	/**
	 * Returns the meta object for the containment reference '{@link ucof.communication.configECIC.packageStrategyTypes.Frames#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Frame</em>'.
	 * @see ucof.communication.configECIC.packageStrategyTypes.Frames#getFrame()
	 * @see #getFrames()
	 * @generated
	 */
	EReference getFrames_Frame();

	/**
	 * Returns the meta object for the containment reference '{@link ucof.communication.configECIC.packageStrategyTypes.Frames#getLLC <em>LLC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>LLC</em>'.
	 * @see ucof.communication.configECIC.packageStrategyTypes.Frames#getLLC()
	 * @see #getFrames()
	 * @generated
	 */
	EReference getFrames_LLC();

	/**
	 * Returns the meta object for enum '{@link ucof.communication.configECIC.packageStrategyTypes.LLCType <em>LLC Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>LLC Type</em>'.
	 * @see ucof.communication.configECIC.packageStrategyTypes.LLCType
	 * @generated
	 */
	EEnum getLLCType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PackageStrategyTypesFactory getPackageStrategyTypesFactory();

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
		 * The meta object literal for the '{@link ucof.communication.configECIC.packageStrategyTypes.impl.SuperPacketStrategyTypeImpl <em>Super Packet Strategy Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.configECIC.packageStrategyTypes.impl.SuperPacketStrategyTypeImpl
		 * @see ucof.communication.configECIC.packageStrategyTypes.impl.PackageStrategyTypesPackageImpl#getSuperPacketStrategyType()
		 * @generated
		 */
		EClass SUPER_PACKET_STRATEGY_TYPE = eINSTANCE.getSuperPacketStrategyType();

		/**
		 * The meta object literal for the '<em><b>Period Ns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_PACKET_STRATEGY_TYPE__PERIOD_NS = eINSTANCE.getSuperPacketStrategyType_PeriodNs();

		/**
		 * The meta object literal for the '{@link ucof.communication.configECIC.packageStrategyTypes.impl.A429PacketStrategyImpl <em>A429 Packet Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.configECIC.packageStrategyTypes.impl.A429PacketStrategyImpl
		 * @see ucof.communication.configECIC.packageStrategyTypes.impl.PackageStrategyTypesPackageImpl#getA429PacketStrategy()
		 * @generated
		 */
		EClass A429_PACKET_STRATEGY = eINSTANCE.getA429PacketStrategy();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A429_PACKET_STRATEGY__DIRECTION = eINSTANCE.getA429PacketStrategy_Direction();

		/**
		 * The meta object literal for the '<em><b>Gap</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference A429_PACKET_STRATEGY__GAP = eINSTANCE.getA429PacketStrategy_Gap();

		/**
		 * The meta object literal for the '<em><b>Trigger Words</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference A429_PACKET_STRATEGY__TRIGGER_WORDS = eINSTANCE.getA429PacketStrategy_TriggerWords();

		/**
		 * The meta object literal for the '{@link ucof.communication.configECIC.packageStrategyTypes.impl.A825PacketStrategyImpl <em>A825 Packet Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.configECIC.packageStrategyTypes.impl.A825PacketStrategyImpl
		 * @see ucof.communication.configECIC.packageStrategyTypes.impl.PackageStrategyTypesPackageImpl#getA825PacketStrategy()
		 * @generated
		 */
		EClass A825_PACKET_STRATEGY = eINSTANCE.getA825PacketStrategy();

		/**
		 * The meta object literal for the '<em><b>Frames</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference A825_PACKET_STRATEGY__FRAMES = eINSTANCE.getA825PacketStrategy_Frames();

		/**
		 * The meta object literal for the '{@link ucof.communication.configECIC.packageStrategyTypes.impl.A664PacketStrategyImpl <em>A664 Packet Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.configECIC.packageStrategyTypes.impl.A664PacketStrategyImpl
		 * @see ucof.communication.configECIC.packageStrategyTypes.impl.PackageStrategyTypesPackageImpl#getA664PacketStrategy()
		 * @generated
		 */
		EClass A664_PACKET_STRATEGY = eINSTANCE.getA664PacketStrategy();

		/**
		 * The meta object literal for the '{@link ucof.communication.configECIC.packageStrategyTypes.impl.ETHPacketStrategyImpl <em>ETH Packet Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.configECIC.packageStrategyTypes.impl.ETHPacketStrategyImpl
		 * @see ucof.communication.configECIC.packageStrategyTypes.impl.PackageStrategyTypesPackageImpl#getETHPacketStrategy()
		 * @generated
		 */
		EClass ETH_PACKET_STRATEGY = eINSTANCE.getETHPacketStrategy();

		/**
		 * The meta object literal for the '{@link ucof.communication.configECIC.packageStrategyTypes.impl.DISPacketStrategyImpl <em>DIS Packet Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.configECIC.packageStrategyTypes.impl.DISPacketStrategyImpl
		 * @see ucof.communication.configECIC.packageStrategyTypes.impl.PackageStrategyTypesPackageImpl#getDISPacketStrategy()
		 * @generated
		 */
		EClass DIS_PACKET_STRATEGY = eINSTANCE.getDISPacketStrategy();

		/**
		 * The meta object literal for the '<em><b>Reset Periodic Timer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIS_PACKET_STRATEGY__RESET_PERIODIC_TIMER = eINSTANCE.getDISPacketStrategy_ResetPeriodicTimer();

		/**
		 * The meta object literal for the '{@link ucof.communication.configECIC.packageStrategyTypes.impl.ANAPacketStrategyImpl <em>ANA Packet Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.configECIC.packageStrategyTypes.impl.ANAPacketStrategyImpl
		 * @see ucof.communication.configECIC.packageStrategyTypes.impl.PackageStrategyTypesPackageImpl#getANAPacketStrategy()
		 * @generated
		 */
		EClass ANA_PACKET_STRATEGY = eINSTANCE.getANAPacketStrategy();

		/**
		 * The meta object literal for the '{@link ucof.communication.configECIC.packageStrategyTypes.impl.NADPacketStrategyImpl <em>NAD Packet Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.configECIC.packageStrategyTypes.impl.NADPacketStrategyImpl
		 * @see ucof.communication.configECIC.packageStrategyTypes.impl.PackageStrategyTypesPackageImpl#getNADPacketStrategy()
		 * @generated
		 */
		EClass NAD_PACKET_STRATEGY = eINSTANCE.getNADPacketStrategy();

		/**
		 * The meta object literal for the '{@link ucof.communication.configECIC.packageStrategyTypes.impl.GapImpl <em>Gap</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.configECIC.packageStrategyTypes.impl.GapImpl
		 * @see ucof.communication.configECIC.packageStrategyTypes.impl.PackageStrategyTypesPackageImpl#getGap()
		 * @generated
		 */
		EClass GAP = eINSTANCE.getGap();

		/**
		 * The meta object literal for the '<em><b>Duration Ns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAP__DURATION_NS = eINSTANCE.getGap_DurationNs();

		/**
		 * The meta object literal for the '<em><b>Reset Periodic Timer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAP__RESET_PERIODIC_TIMER = eINSTANCE.getGap_ResetPeriodicTimer();

		/**
		 * The meta object literal for the '{@link ucof.communication.configECIC.packageStrategyTypes.impl.TriggerWordsImpl <em>Trigger Words</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.configECIC.packageStrategyTypes.impl.TriggerWordsImpl
		 * @see ucof.communication.configECIC.packageStrategyTypes.impl.PackageStrategyTypesPackageImpl#getTriggerWords()
		 * @generated
		 */
		EClass TRIGGER_WORDS = eINSTANCE.getTriggerWords();

		/**
		 * The meta object literal for the '<em><b>Trigger Word</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER_WORDS__TRIGGER_WORD = eINSTANCE.getTriggerWords_TriggerWord();

		/**
		 * The meta object literal for the '{@link ucof.communication.configECIC.packageStrategyTypes.impl.TriggerWordImpl <em>Trigger Word</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.configECIC.packageStrategyTypes.impl.TriggerWordImpl
		 * @see ucof.communication.configECIC.packageStrategyTypes.impl.PackageStrategyTypesPackageImpl#getTriggerWord()
		 * @generated
		 */
		EClass TRIGGER_WORD = eINSTANCE.getTriggerWord();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER_WORD__LABEL = eINSTANCE.getTriggerWord_Label();

		/**
		 * The meta object literal for the '<em><b>SDI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER_WORD__SDI = eINSTANCE.getTriggerWord_SDI();

		/**
		 * The meta object literal for the '<em><b>Reset Periodic Timer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER_WORD__RESET_PERIODIC_TIMER = eINSTANCE.getTriggerWord_ResetPeriodicTimer();

		/**
		 * The meta object literal for the '{@link ucof.communication.configECIC.packageStrategyTypes.impl.FrameImpl <em>Frame</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.configECIC.packageStrategyTypes.impl.FrameImpl
		 * @see ucof.communication.configECIC.packageStrategyTypes.impl.PackageStrategyTypesPackageImpl#getFrame()
		 * @generated
		 */
		EClass FRAME = eINSTANCE.getFrame();

		/**
		 * The meta object literal for the '<em><b>A825ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAME__A825ID = eINSTANCE.getFrame_A825ID();

		/**
		 * The meta object literal for the '<em><b>Reset Periodic Timer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAME__RESET_PERIODIC_TIMER = eINSTANCE.getFrame_ResetPeriodicTimer();

		/**
		 * The meta object literal for the '{@link ucof.communication.configECIC.packageStrategyTypes.impl.LLCImpl <em>LLC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.configECIC.packageStrategyTypes.impl.LLCImpl
		 * @see ucof.communication.configECIC.packageStrategyTypes.impl.PackageStrategyTypesPackageImpl#getLLC()
		 * @generated
		 */
		EClass LLC = eINSTANCE.getLLC();

		/**
		 * The meta object literal for the '<em><b>LLC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LLC__LLC = eINSTANCE.getLLC_LLC();

		/**
		 * The meta object literal for the '<em><b>Reset Periodic Timer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LLC__RESET_PERIODIC_TIMER = eINSTANCE.getLLC_ResetPeriodicTimer();

		/**
		 * The meta object literal for the '{@link ucof.communication.configECIC.packageStrategyTypes.impl.FramesImpl <em>Frames</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.configECIC.packageStrategyTypes.impl.FramesImpl
		 * @see ucof.communication.configECIC.packageStrategyTypes.impl.PackageStrategyTypesPackageImpl#getFrames()
		 * @generated
		 */
		EClass FRAMES = eINSTANCE.getFrames();

		/**
		 * The meta object literal for the '<em><b>Frame</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAMES__FRAME = eINSTANCE.getFrames_Frame();

		/**
		 * The meta object literal for the '<em><b>LLC</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAMES__LLC = eINSTANCE.getFrames_LLC();

		/**
		 * The meta object literal for the '{@link ucof.communication.configECIC.packageStrategyTypes.LLCType <em>LLC Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.configECIC.packageStrategyTypes.LLCType
		 * @see ucof.communication.configECIC.packageStrategyTypes.impl.PackageStrategyTypesPackageImpl#getLLCType()
		 * @generated
		 */
		EEnum LLC_TYPE = eINSTANCE.getLLCType();

	}

} //PackageStrategyTypesPackage
