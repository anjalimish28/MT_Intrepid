/**
 */
package ucof.communication.configECIC.streamTypes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * Container, including all elements necessary for creating streams in ECIC
 * <!-- end-model-doc -->
 * @see ucof.communication.configECIC.streamTypes.StreamTypesFactory
 * @model kind="package"
 * @generated
 */
public interface StreamTypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "streamTypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://gitlab.com/ucof/ucof.de/model/v001/ucof/communication/configECIC/streamTypes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ucof.model.communication.configECIC.streamTypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StreamTypesPackage eINSTANCE = ucof.communication.configECIC.streamTypes.impl.StreamTypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link ucof.communication.configECIC.streamTypes.impl.SuperStreamTypeImpl <em>Super Stream Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.configECIC.streamTypes.impl.SuperStreamTypeImpl
	 * @see ucof.communication.configECIC.streamTypes.impl.StreamTypesPackageImpl#getSuperStreamType()
	 * @generated
	 */
	int SUPER_STREAM_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STREAM_TYPE__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STREAM_TYPE__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STREAM_TYPE__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STREAM_TYPE__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STREAM_TYPE__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STREAM_TYPE__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STREAM_TYPE__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STREAM_TYPE__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STREAM_TYPE__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Sample Max Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STREAM_TYPE__SAMPLE_MAX_NUMBER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Icd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STREAM_TYPE__ICD = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Data Timestamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STREAM_TYPE__DATA_TIMESTAMP = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Super Stream Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STREAM_TYPE_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Super Stream Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_STREAM_TYPE_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.configECIC.streamTypes.impl.A429StreamImpl <em>A429 Stream</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.configECIC.streamTypes.impl.A429StreamImpl
	 * @see ucof.communication.configECIC.streamTypes.impl.StreamTypesPackageImpl#getA429Stream()
	 * @generated
	 */
	int A429_STREAM = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_STREAM__ID = SUPER_STREAM_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_STREAM__NAME = SUPER_STREAM_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_STREAM__DOCUMENTATION = SUPER_STREAM_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_STREAM__MODIFIED = SUPER_STREAM_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_STREAM__MODIFIER = SUPER_STREAM_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_STREAM__TRACE_LINK = SUPER_STREAM_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_STREAM__CREATED = SUPER_STREAM_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_STREAM__CREATOR = SUPER_STREAM_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_STREAM__VERSION = SUPER_STREAM_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Sample Max Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_STREAM__SAMPLE_MAX_NUMBER = SUPER_STREAM_TYPE__SAMPLE_MAX_NUMBER;

	/**
	 * The feature id for the '<em><b>Icd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_STREAM__ICD = SUPER_STREAM_TYPE__ICD;

	/**
	 * The feature id for the '<em><b>Data Timestamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_STREAM__DATA_TIMESTAMP = SUPER_STREAM_TYPE__DATA_TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_STREAM__DIRECTION = SUPER_STREAM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>A429 Packet Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_STREAM__A429_PACKET_STRATEGY = SUPER_STREAM_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_STREAM__ERRORS = SUPER_STREAM_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>A429 Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_STREAM_FEATURE_COUNT = SUPER_STREAM_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>A429 Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_STREAM_OPERATION_COUNT = SUPER_STREAM_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.configECIC.streamTypes.impl.A825StreamImpl <em>A825 Stream</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.configECIC.streamTypes.impl.A825StreamImpl
	 * @see ucof.communication.configECIC.streamTypes.impl.StreamTypesPackageImpl#getA825Stream()
	 * @generated
	 */
	int A825_STREAM = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_STREAM__ID = SUPER_STREAM_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_STREAM__NAME = SUPER_STREAM_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_STREAM__DOCUMENTATION = SUPER_STREAM_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_STREAM__MODIFIED = SUPER_STREAM_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_STREAM__MODIFIER = SUPER_STREAM_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_STREAM__TRACE_LINK = SUPER_STREAM_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_STREAM__CREATED = SUPER_STREAM_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_STREAM__CREATOR = SUPER_STREAM_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_STREAM__VERSION = SUPER_STREAM_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Sample Max Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_STREAM__SAMPLE_MAX_NUMBER = SUPER_STREAM_TYPE__SAMPLE_MAX_NUMBER;

	/**
	 * The feature id for the '<em><b>Icd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_STREAM__ICD = SUPER_STREAM_TYPE__ICD;

	/**
	 * The feature id for the '<em><b>Data Timestamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_STREAM__DATA_TIMESTAMP = SUPER_STREAM_TYPE__DATA_TIMESTAMP;

	/**
	 * The feature id for the '<em><b>A825 Packet Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_STREAM__A825_PACKET_STRATEGY = SUPER_STREAM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_STREAM__ERRORS = SUPER_STREAM_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>A825 Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_STREAM_FEATURE_COUNT = SUPER_STREAM_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>A825 Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_STREAM_OPERATION_COUNT = SUPER_STREAM_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.configECIC.streamTypes.impl.A664StreamImpl <em>A664 Stream</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.configECIC.streamTypes.impl.A664StreamImpl
	 * @see ucof.communication.configECIC.streamTypes.impl.StreamTypesPackageImpl#getA664Stream()
	 * @generated
	 */
	int A664_STREAM = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_STREAM__ID = SUPER_STREAM_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_STREAM__NAME = SUPER_STREAM_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_STREAM__DOCUMENTATION = SUPER_STREAM_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_STREAM__MODIFIED = SUPER_STREAM_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_STREAM__MODIFIER = SUPER_STREAM_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_STREAM__TRACE_LINK = SUPER_STREAM_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_STREAM__CREATED = SUPER_STREAM_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_STREAM__CREATOR = SUPER_STREAM_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_STREAM__VERSION = SUPER_STREAM_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Sample Max Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_STREAM__SAMPLE_MAX_NUMBER = SUPER_STREAM_TYPE__SAMPLE_MAX_NUMBER;

	/**
	 * The feature id for the '<em><b>Icd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_STREAM__ICD = SUPER_STREAM_TYPE__ICD;

	/**
	 * The feature id for the '<em><b>Data Timestamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_STREAM__DATA_TIMESTAMP = SUPER_STREAM_TYPE__DATA_TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_STREAM__DIRECTION = SUPER_STREAM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sample Max Size Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_STREAM__SAMPLE_MAX_SIZE_BYTES = SUPER_STREAM_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>A664 Packet Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_STREAM__A664_PACKET_STRATEGY = SUPER_STREAM_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_STREAM__ERRORS = SUPER_STREAM_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>A664 Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_STREAM_FEATURE_COUNT = SUPER_STREAM_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>A664 Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A664_STREAM_OPERATION_COUNT = SUPER_STREAM_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.configECIC.streamTypes.impl.ETHStreamImpl <em>ETH Stream</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.configECIC.streamTypes.impl.ETHStreamImpl
	 * @see ucof.communication.configECIC.streamTypes.impl.StreamTypesPackageImpl#getETHStream()
	 * @generated
	 */
	int ETH_STREAM = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_STREAM__ID = SUPER_STREAM_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_STREAM__NAME = SUPER_STREAM_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_STREAM__DOCUMENTATION = SUPER_STREAM_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_STREAM__MODIFIED = SUPER_STREAM_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_STREAM__MODIFIER = SUPER_STREAM_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_STREAM__TRACE_LINK = SUPER_STREAM_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_STREAM__CREATED = SUPER_STREAM_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_STREAM__CREATOR = SUPER_STREAM_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_STREAM__VERSION = SUPER_STREAM_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Sample Max Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_STREAM__SAMPLE_MAX_NUMBER = SUPER_STREAM_TYPE__SAMPLE_MAX_NUMBER;

	/**
	 * The feature id for the '<em><b>Icd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_STREAM__ICD = SUPER_STREAM_TYPE__ICD;

	/**
	 * The feature id for the '<em><b>Data Timestamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_STREAM__DATA_TIMESTAMP = SUPER_STREAM_TYPE__DATA_TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_STREAM__DIRECTION = SUPER_STREAM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sample Max Size Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_STREAM__SAMPLE_MAX_SIZE_BYTES = SUPER_STREAM_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Eth Packet Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_STREAM__ETH_PACKET_STRATEGY = SUPER_STREAM_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_STREAM__ERRORS = SUPER_STREAM_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>ETH Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_STREAM_FEATURE_COUNT = SUPER_STREAM_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>ETH Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETH_STREAM_OPERATION_COUNT = SUPER_STREAM_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.configECIC.streamTypes.impl.DISStreamImpl <em>DIS Stream</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.configECIC.streamTypes.impl.DISStreamImpl
	 * @see ucof.communication.configECIC.streamTypes.impl.StreamTypesPackageImpl#getDISStream()
	 * @generated
	 */
	int DIS_STREAM = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIS_STREAM__ID = SUPER_STREAM_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIS_STREAM__NAME = SUPER_STREAM_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIS_STREAM__DOCUMENTATION = SUPER_STREAM_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIS_STREAM__MODIFIED = SUPER_STREAM_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIS_STREAM__MODIFIER = SUPER_STREAM_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIS_STREAM__TRACE_LINK = SUPER_STREAM_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIS_STREAM__CREATED = SUPER_STREAM_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIS_STREAM__CREATOR = SUPER_STREAM_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIS_STREAM__VERSION = SUPER_STREAM_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Sample Max Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIS_STREAM__SAMPLE_MAX_NUMBER = SUPER_STREAM_TYPE__SAMPLE_MAX_NUMBER;

	/**
	 * The feature id for the '<em><b>Icd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIS_STREAM__ICD = SUPER_STREAM_TYPE__ICD;

	/**
	 * The feature id for the '<em><b>Data Timestamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIS_STREAM__DATA_TIMESTAMP = SUPER_STREAM_TYPE__DATA_TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIS_STREAM__DIRECTION = SUPER_STREAM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sample Max Size Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIS_STREAM__SAMPLE_MAX_SIZE_BYTES = SUPER_STREAM_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dis Packet Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIS_STREAM__DIS_PACKET_STRATEGY = SUPER_STREAM_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>DIS Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIS_STREAM_FEATURE_COUNT = SUPER_STREAM_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>DIS Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIS_STREAM_OPERATION_COUNT = SUPER_STREAM_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.configECIC.streamTypes.impl.ANAStreamImpl <em>ANA Stream</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.configECIC.streamTypes.impl.ANAStreamImpl
	 * @see ucof.communication.configECIC.streamTypes.impl.StreamTypesPackageImpl#getANAStream()
	 * @generated
	 */
	int ANA_STREAM = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANA_STREAM__ID = SUPER_STREAM_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANA_STREAM__NAME = SUPER_STREAM_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANA_STREAM__DOCUMENTATION = SUPER_STREAM_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANA_STREAM__MODIFIED = SUPER_STREAM_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANA_STREAM__MODIFIER = SUPER_STREAM_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANA_STREAM__TRACE_LINK = SUPER_STREAM_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANA_STREAM__CREATED = SUPER_STREAM_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANA_STREAM__CREATOR = SUPER_STREAM_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANA_STREAM__VERSION = SUPER_STREAM_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Sample Max Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANA_STREAM__SAMPLE_MAX_NUMBER = SUPER_STREAM_TYPE__SAMPLE_MAX_NUMBER;

	/**
	 * The feature id for the '<em><b>Icd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANA_STREAM__ICD = SUPER_STREAM_TYPE__ICD;

	/**
	 * The feature id for the '<em><b>Data Timestamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANA_STREAM__DATA_TIMESTAMP = SUPER_STREAM_TYPE__DATA_TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANA_STREAM__DIRECTION = SUPER_STREAM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sample Max Size Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANA_STREAM__SAMPLE_MAX_SIZE_BYTES = SUPER_STREAM_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ana Packet Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANA_STREAM__ANA_PACKET_STRATEGY = SUPER_STREAM_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ANA Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANA_STREAM_FEATURE_COUNT = SUPER_STREAM_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>ANA Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANA_STREAM_OPERATION_COUNT = SUPER_STREAM_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.configECIC.streamTypes.impl.NADStreamImpl <em>NAD Stream</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.configECIC.streamTypes.impl.NADStreamImpl
	 * @see ucof.communication.configECIC.streamTypes.impl.StreamTypesPackageImpl#getNADStream()
	 * @generated
	 */
	int NAD_STREAM = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAD_STREAM__ID = SUPER_STREAM_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAD_STREAM__NAME = SUPER_STREAM_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAD_STREAM__DOCUMENTATION = SUPER_STREAM_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAD_STREAM__MODIFIED = SUPER_STREAM_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAD_STREAM__MODIFIER = SUPER_STREAM_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAD_STREAM__TRACE_LINK = SUPER_STREAM_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAD_STREAM__CREATED = SUPER_STREAM_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAD_STREAM__CREATOR = SUPER_STREAM_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAD_STREAM__VERSION = SUPER_STREAM_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Sample Max Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAD_STREAM__SAMPLE_MAX_NUMBER = SUPER_STREAM_TYPE__SAMPLE_MAX_NUMBER;

	/**
	 * The feature id for the '<em><b>Icd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAD_STREAM__ICD = SUPER_STREAM_TYPE__ICD;

	/**
	 * The feature id for the '<em><b>Data Timestamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAD_STREAM__DATA_TIMESTAMP = SUPER_STREAM_TYPE__DATA_TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAD_STREAM__DIRECTION = SUPER_STREAM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sample Max Size Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAD_STREAM__SAMPLE_MAX_SIZE_BYTES = SUPER_STREAM_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nad Packet Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAD_STREAM__NAD_PACKET_STRATEGY = SUPER_STREAM_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>NAD Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAD_STREAM_FEATURE_COUNT = SUPER_STREAM_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>NAD Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAD_STREAM_OPERATION_COUNT = SUPER_STREAM_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.configECIC.streamTypes.impl.DataTimestampImpl <em>Data Timestamp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.configECIC.streamTypes.impl.DataTimestampImpl
	 * @see ucof.communication.configECIC.streamTypes.impl.StreamTypesPackageImpl#getDataTimestamp()
	 * @generated
	 */
	int DATA_TIMESTAMP = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TIMESTAMP__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TIMESTAMP__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TIMESTAMP__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TIMESTAMP__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TIMESTAMP__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TIMESTAMP__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TIMESTAMP__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TIMESTAMP__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TIMESTAMP__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TIMESTAMP__ENABLE = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Sample Data Timestamp Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TIMESTAMP__SAMPLE_DATA_TIMESTAMP_OFFSET = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Data Timestamp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TIMESTAMP_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Data Timestamp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TIMESTAMP_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ucof.communication.configECIC.streamTypes.SuperStreamType <em>Super Stream Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Stream Type</em>'.
	 * @see ucof.communication.configECIC.streamTypes.SuperStreamType
	 * @generated
	 */
	EClass getSuperStreamType();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.streamTypes.SuperStreamType#getSampleMaxNumber <em>Sample Max Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sample Max Number</em>'.
	 * @see ucof.communication.configECIC.streamTypes.SuperStreamType#getSampleMaxNumber()
	 * @see #getSuperStreamType()
	 * @generated
	 */
	EAttribute getSuperStreamType_SampleMaxNumber();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.streamTypes.SuperStreamType#getIcd <em>Icd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icd</em>'.
	 * @see ucof.communication.configECIC.streamTypes.SuperStreamType#getIcd()
	 * @see #getSuperStreamType()
	 * @generated
	 */
	EAttribute getSuperStreamType_Icd();

	/**
	 * Returns the meta object for the containment reference '{@link ucof.communication.configECIC.streamTypes.SuperStreamType#getDataTimestamp <em>Data Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Timestamp</em>'.
	 * @see ucof.communication.configECIC.streamTypes.SuperStreamType#getDataTimestamp()
	 * @see #getSuperStreamType()
	 * @generated
	 */
	EReference getSuperStreamType_DataTimestamp();

	/**
	 * Returns the meta object for class '{@link ucof.communication.configECIC.streamTypes.A429Stream <em>A429 Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A429 Stream</em>'.
	 * @see ucof.communication.configECIC.streamTypes.A429Stream
	 * @generated
	 */
	EClass getA429Stream();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.streamTypes.A429Stream#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see ucof.communication.configECIC.streamTypes.A429Stream#getDirection()
	 * @see #getA429Stream()
	 * @generated
	 */
	EAttribute getA429Stream_Direction();

	/**
	 * Returns the meta object for the containment reference '{@link ucof.communication.configECIC.streamTypes.A429Stream#getA429PacketStrategy <em>A429 Packet Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>A429 Packet Strategy</em>'.
	 * @see ucof.communication.configECIC.streamTypes.A429Stream#getA429PacketStrategy()
	 * @see #getA429Stream()
	 * @generated
	 */
	EReference getA429Stream_A429PacketStrategy();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.streamTypes.A429Stream#getErrors <em>Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Errors</em>'.
	 * @see ucof.communication.configECIC.streamTypes.A429Stream#getErrors()
	 * @see #getA429Stream()
	 * @generated
	 */
	EAttribute getA429Stream_Errors();

	/**
	 * Returns the meta object for class '{@link ucof.communication.configECIC.streamTypes.A825Stream <em>A825 Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A825 Stream</em>'.
	 * @see ucof.communication.configECIC.streamTypes.A825Stream
	 * @generated
	 */
	EClass getA825Stream();

	/**
	 * Returns the meta object for the containment reference '{@link ucof.communication.configECIC.streamTypes.A825Stream#getA825PacketStrategy <em>A825 Packet Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>A825 Packet Strategy</em>'.
	 * @see ucof.communication.configECIC.streamTypes.A825Stream#getA825PacketStrategy()
	 * @see #getA825Stream()
	 * @generated
	 */
	EReference getA825Stream_A825PacketStrategy();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.streamTypes.A825Stream#getErrors <em>Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Errors</em>'.
	 * @see ucof.communication.configECIC.streamTypes.A825Stream#getErrors()
	 * @see #getA825Stream()
	 * @generated
	 */
	EAttribute getA825Stream_Errors();

	/**
	 * Returns the meta object for class '{@link ucof.communication.configECIC.streamTypes.A664Stream <em>A664 Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A664 Stream</em>'.
	 * @see ucof.communication.configECIC.streamTypes.A664Stream
	 * @generated
	 */
	EClass getA664Stream();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.streamTypes.A664Stream#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see ucof.communication.configECIC.streamTypes.A664Stream#getDirection()
	 * @see #getA664Stream()
	 * @generated
	 */
	EAttribute getA664Stream_Direction();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.streamTypes.A664Stream#getSampleMaxSizeBytes <em>Sample Max Size Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sample Max Size Bytes</em>'.
	 * @see ucof.communication.configECIC.streamTypes.A664Stream#getSampleMaxSizeBytes()
	 * @see #getA664Stream()
	 * @generated
	 */
	EAttribute getA664Stream_SampleMaxSizeBytes();

	/**
	 * Returns the meta object for the containment reference '{@link ucof.communication.configECIC.streamTypes.A664Stream#getA664PacketStrategy <em>A664 Packet Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>A664 Packet Strategy</em>'.
	 * @see ucof.communication.configECIC.streamTypes.A664Stream#getA664PacketStrategy()
	 * @see #getA664Stream()
	 * @generated
	 */
	EReference getA664Stream_A664PacketStrategy();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.streamTypes.A664Stream#getErrors <em>Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Errors</em>'.
	 * @see ucof.communication.configECIC.streamTypes.A664Stream#getErrors()
	 * @see #getA664Stream()
	 * @generated
	 */
	EAttribute getA664Stream_Errors();

	/**
	 * Returns the meta object for class '{@link ucof.communication.configECIC.streamTypes.ETHStream <em>ETH Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ETH Stream</em>'.
	 * @see ucof.communication.configECIC.streamTypes.ETHStream
	 * @generated
	 */
	EClass getETHStream();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.streamTypes.ETHStream#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see ucof.communication.configECIC.streamTypes.ETHStream#getDirection()
	 * @see #getETHStream()
	 * @generated
	 */
	EAttribute getETHStream_Direction();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.streamTypes.ETHStream#getSampleMaxSizeBytes <em>Sample Max Size Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sample Max Size Bytes</em>'.
	 * @see ucof.communication.configECIC.streamTypes.ETHStream#getSampleMaxSizeBytes()
	 * @see #getETHStream()
	 * @generated
	 */
	EAttribute getETHStream_SampleMaxSizeBytes();

	/**
	 * Returns the meta object for the containment reference '{@link ucof.communication.configECIC.streamTypes.ETHStream#getEthPacketStrategy <em>Eth Packet Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eth Packet Strategy</em>'.
	 * @see ucof.communication.configECIC.streamTypes.ETHStream#getEthPacketStrategy()
	 * @see #getETHStream()
	 * @generated
	 */
	EReference getETHStream_EthPacketStrategy();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.streamTypes.ETHStream#getErrors <em>Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Errors</em>'.
	 * @see ucof.communication.configECIC.streamTypes.ETHStream#getErrors()
	 * @see #getETHStream()
	 * @generated
	 */
	EAttribute getETHStream_Errors();

	/**
	 * Returns the meta object for class '{@link ucof.communication.configECIC.streamTypes.DISStream <em>DIS Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DIS Stream</em>'.
	 * @see ucof.communication.configECIC.streamTypes.DISStream
	 * @generated
	 */
	EClass getDISStream();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.streamTypes.DISStream#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see ucof.communication.configECIC.streamTypes.DISStream#getDirection()
	 * @see #getDISStream()
	 * @generated
	 */
	EAttribute getDISStream_Direction();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.streamTypes.DISStream#getSampleMaxSizeBytes <em>Sample Max Size Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sample Max Size Bytes</em>'.
	 * @see ucof.communication.configECIC.streamTypes.DISStream#getSampleMaxSizeBytes()
	 * @see #getDISStream()
	 * @generated
	 */
	EAttribute getDISStream_SampleMaxSizeBytes();

	/**
	 * Returns the meta object for the containment reference '{@link ucof.communication.configECIC.streamTypes.DISStream#getDisPacketStrategy <em>Dis Packet Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dis Packet Strategy</em>'.
	 * @see ucof.communication.configECIC.streamTypes.DISStream#getDisPacketStrategy()
	 * @see #getDISStream()
	 * @generated
	 */
	EReference getDISStream_DisPacketStrategy();

	/**
	 * Returns the meta object for class '{@link ucof.communication.configECIC.streamTypes.ANAStream <em>ANA Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ANA Stream</em>'.
	 * @see ucof.communication.configECIC.streamTypes.ANAStream
	 * @generated
	 */
	EClass getANAStream();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.streamTypes.ANAStream#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see ucof.communication.configECIC.streamTypes.ANAStream#getDirection()
	 * @see #getANAStream()
	 * @generated
	 */
	EAttribute getANAStream_Direction();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.streamTypes.ANAStream#getSampleMaxSizeBytes <em>Sample Max Size Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sample Max Size Bytes</em>'.
	 * @see ucof.communication.configECIC.streamTypes.ANAStream#getSampleMaxSizeBytes()
	 * @see #getANAStream()
	 * @generated
	 */
	EAttribute getANAStream_SampleMaxSizeBytes();

	/**
	 * Returns the meta object for the containment reference '{@link ucof.communication.configECIC.streamTypes.ANAStream#getAnaPacketStrategy <em>Ana Packet Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ana Packet Strategy</em>'.
	 * @see ucof.communication.configECIC.streamTypes.ANAStream#getAnaPacketStrategy()
	 * @see #getANAStream()
	 * @generated
	 */
	EReference getANAStream_AnaPacketStrategy();

	/**
	 * Returns the meta object for class '{@link ucof.communication.configECIC.streamTypes.NADStream <em>NAD Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NAD Stream</em>'.
	 * @see ucof.communication.configECIC.streamTypes.NADStream
	 * @generated
	 */
	EClass getNADStream();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.streamTypes.NADStream#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see ucof.communication.configECIC.streamTypes.NADStream#getDirection()
	 * @see #getNADStream()
	 * @generated
	 */
	EAttribute getNADStream_Direction();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.streamTypes.NADStream#getSampleMaxSizeBytes <em>Sample Max Size Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sample Max Size Bytes</em>'.
	 * @see ucof.communication.configECIC.streamTypes.NADStream#getSampleMaxSizeBytes()
	 * @see #getNADStream()
	 * @generated
	 */
	EAttribute getNADStream_SampleMaxSizeBytes();

	/**
	 * Returns the meta object for the containment reference '{@link ucof.communication.configECIC.streamTypes.NADStream#getNadPacketStrategy <em>Nad Packet Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nad Packet Strategy</em>'.
	 * @see ucof.communication.configECIC.streamTypes.NADStream#getNadPacketStrategy()
	 * @see #getNADStream()
	 * @generated
	 */
	EReference getNADStream_NadPacketStrategy();

	/**
	 * Returns the meta object for class '{@link ucof.communication.configECIC.streamTypes.DataTimestamp <em>Data Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Timestamp</em>'.
	 * @see ucof.communication.configECIC.streamTypes.DataTimestamp
	 * @generated
	 */
	EClass getDataTimestamp();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.streamTypes.DataTimestamp#getEnable <em>Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable</em>'.
	 * @see ucof.communication.configECIC.streamTypes.DataTimestamp#getEnable()
	 * @see #getDataTimestamp()
	 * @generated
	 */
	EAttribute getDataTimestamp_Enable();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.configECIC.streamTypes.DataTimestamp#getSampleDataTimestampOffset <em>Sample Data Timestamp Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sample Data Timestamp Offset</em>'.
	 * @see ucof.communication.configECIC.streamTypes.DataTimestamp#getSampleDataTimestampOffset()
	 * @see #getDataTimestamp()
	 * @generated
	 */
	EAttribute getDataTimestamp_SampleDataTimestampOffset();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StreamTypesFactory getStreamTypesFactory();

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
		 * The meta object literal for the '{@link ucof.communication.configECIC.streamTypes.impl.SuperStreamTypeImpl <em>Super Stream Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.configECIC.streamTypes.impl.SuperStreamTypeImpl
		 * @see ucof.communication.configECIC.streamTypes.impl.StreamTypesPackageImpl#getSuperStreamType()
		 * @generated
		 */
		EClass SUPER_STREAM_TYPE = eINSTANCE.getSuperStreamType();

		/**
		 * The meta object literal for the '<em><b>Sample Max Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_STREAM_TYPE__SAMPLE_MAX_NUMBER = eINSTANCE.getSuperStreamType_SampleMaxNumber();

		/**
		 * The meta object literal for the '<em><b>Icd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPER_STREAM_TYPE__ICD = eINSTANCE.getSuperStreamType_Icd();

		/**
		 * The meta object literal for the '<em><b>Data Timestamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_STREAM_TYPE__DATA_TIMESTAMP = eINSTANCE.getSuperStreamType_DataTimestamp();

		/**
		 * The meta object literal for the '{@link ucof.communication.configECIC.streamTypes.impl.A429StreamImpl <em>A429 Stream</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.configECIC.streamTypes.impl.A429StreamImpl
		 * @see ucof.communication.configECIC.streamTypes.impl.StreamTypesPackageImpl#getA429Stream()
		 * @generated
		 */
		EClass A429_STREAM = eINSTANCE.getA429Stream();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A429_STREAM__DIRECTION = eINSTANCE.getA429Stream_Direction();

		/**
		 * The meta object literal for the '<em><b>A429 Packet Strategy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference A429_STREAM__A429_PACKET_STRATEGY = eINSTANCE.getA429Stream_A429PacketStrategy();

		/**
		 * The meta object literal for the '<em><b>Errors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A429_STREAM__ERRORS = eINSTANCE.getA429Stream_Errors();

		/**
		 * The meta object literal for the '{@link ucof.communication.configECIC.streamTypes.impl.A825StreamImpl <em>A825 Stream</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.configECIC.streamTypes.impl.A825StreamImpl
		 * @see ucof.communication.configECIC.streamTypes.impl.StreamTypesPackageImpl#getA825Stream()
		 * @generated
		 */
		EClass A825_STREAM = eINSTANCE.getA825Stream();

		/**
		 * The meta object literal for the '<em><b>A825 Packet Strategy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference A825_STREAM__A825_PACKET_STRATEGY = eINSTANCE.getA825Stream_A825PacketStrategy();

		/**
		 * The meta object literal for the '<em><b>Errors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A825_STREAM__ERRORS = eINSTANCE.getA825Stream_Errors();

		/**
		 * The meta object literal for the '{@link ucof.communication.configECIC.streamTypes.impl.A664StreamImpl <em>A664 Stream</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.configECIC.streamTypes.impl.A664StreamImpl
		 * @see ucof.communication.configECIC.streamTypes.impl.StreamTypesPackageImpl#getA664Stream()
		 * @generated
		 */
		EClass A664_STREAM = eINSTANCE.getA664Stream();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A664_STREAM__DIRECTION = eINSTANCE.getA664Stream_Direction();

		/**
		 * The meta object literal for the '<em><b>Sample Max Size Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A664_STREAM__SAMPLE_MAX_SIZE_BYTES = eINSTANCE.getA664Stream_SampleMaxSizeBytes();

		/**
		 * The meta object literal for the '<em><b>A664 Packet Strategy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference A664_STREAM__A664_PACKET_STRATEGY = eINSTANCE.getA664Stream_A664PacketStrategy();

		/**
		 * The meta object literal for the '<em><b>Errors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A664_STREAM__ERRORS = eINSTANCE.getA664Stream_Errors();

		/**
		 * The meta object literal for the '{@link ucof.communication.configECIC.streamTypes.impl.ETHStreamImpl <em>ETH Stream</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.configECIC.streamTypes.impl.ETHStreamImpl
		 * @see ucof.communication.configECIC.streamTypes.impl.StreamTypesPackageImpl#getETHStream()
		 * @generated
		 */
		EClass ETH_STREAM = eINSTANCE.getETHStream();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETH_STREAM__DIRECTION = eINSTANCE.getETHStream_Direction();

		/**
		 * The meta object literal for the '<em><b>Sample Max Size Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETH_STREAM__SAMPLE_MAX_SIZE_BYTES = eINSTANCE.getETHStream_SampleMaxSizeBytes();

		/**
		 * The meta object literal for the '<em><b>Eth Packet Strategy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETH_STREAM__ETH_PACKET_STRATEGY = eINSTANCE.getETHStream_EthPacketStrategy();

		/**
		 * The meta object literal for the '<em><b>Errors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETH_STREAM__ERRORS = eINSTANCE.getETHStream_Errors();

		/**
		 * The meta object literal for the '{@link ucof.communication.configECIC.streamTypes.impl.DISStreamImpl <em>DIS Stream</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.configECIC.streamTypes.impl.DISStreamImpl
		 * @see ucof.communication.configECIC.streamTypes.impl.StreamTypesPackageImpl#getDISStream()
		 * @generated
		 */
		EClass DIS_STREAM = eINSTANCE.getDISStream();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIS_STREAM__DIRECTION = eINSTANCE.getDISStream_Direction();

		/**
		 * The meta object literal for the '<em><b>Sample Max Size Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIS_STREAM__SAMPLE_MAX_SIZE_BYTES = eINSTANCE.getDISStream_SampleMaxSizeBytes();

		/**
		 * The meta object literal for the '<em><b>Dis Packet Strategy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIS_STREAM__DIS_PACKET_STRATEGY = eINSTANCE.getDISStream_DisPacketStrategy();

		/**
		 * The meta object literal for the '{@link ucof.communication.configECIC.streamTypes.impl.ANAStreamImpl <em>ANA Stream</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.configECIC.streamTypes.impl.ANAStreamImpl
		 * @see ucof.communication.configECIC.streamTypes.impl.StreamTypesPackageImpl#getANAStream()
		 * @generated
		 */
		EClass ANA_STREAM = eINSTANCE.getANAStream();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANA_STREAM__DIRECTION = eINSTANCE.getANAStream_Direction();

		/**
		 * The meta object literal for the '<em><b>Sample Max Size Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANA_STREAM__SAMPLE_MAX_SIZE_BYTES = eINSTANCE.getANAStream_SampleMaxSizeBytes();

		/**
		 * The meta object literal for the '<em><b>Ana Packet Strategy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANA_STREAM__ANA_PACKET_STRATEGY = eINSTANCE.getANAStream_AnaPacketStrategy();

		/**
		 * The meta object literal for the '{@link ucof.communication.configECIC.streamTypes.impl.NADStreamImpl <em>NAD Stream</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.configECIC.streamTypes.impl.NADStreamImpl
		 * @see ucof.communication.configECIC.streamTypes.impl.StreamTypesPackageImpl#getNADStream()
		 * @generated
		 */
		EClass NAD_STREAM = eINSTANCE.getNADStream();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAD_STREAM__DIRECTION = eINSTANCE.getNADStream_Direction();

		/**
		 * The meta object literal for the '<em><b>Sample Max Size Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAD_STREAM__SAMPLE_MAX_SIZE_BYTES = eINSTANCE.getNADStream_SampleMaxSizeBytes();

		/**
		 * The meta object literal for the '<em><b>Nad Packet Strategy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAD_STREAM__NAD_PACKET_STRATEGY = eINSTANCE.getNADStream_NadPacketStrategy();

		/**
		 * The meta object literal for the '{@link ucof.communication.configECIC.streamTypes.impl.DataTimestampImpl <em>Data Timestamp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.configECIC.streamTypes.impl.DataTimestampImpl
		 * @see ucof.communication.configECIC.streamTypes.impl.StreamTypesPackageImpl#getDataTimestamp()
		 * @generated
		 */
		EClass DATA_TIMESTAMP = eINSTANCE.getDataTimestamp();

		/**
		 * The meta object literal for the '<em><b>Enable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TIMESTAMP__ENABLE = eINSTANCE.getDataTimestamp_Enable();

		/**
		 * The meta object literal for the '<em><b>Sample Data Timestamp Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TIMESTAMP__SAMPLE_DATA_TIMESTAMP_OFFSET = eINSTANCE.getDataTimestamp_SampleDataTimestampOffset();

	}

} //StreamTypesPackage
