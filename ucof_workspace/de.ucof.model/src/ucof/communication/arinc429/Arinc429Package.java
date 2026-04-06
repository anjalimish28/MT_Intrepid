/**
 */
package ucof.communication.arinc429;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import ucof.common.etypes.EtypesPackage;

import ucof.communication.CommunicationPackage;

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
 * Container, including all elements for building an ARINC 429 interface, see https://www.sae.org/standards/content/arinc429p1-19/
 * <!-- end-model-doc -->
 * @see ucof.communication.arinc429.Arinc429Factory
 * @model kind="package"
 * @generated
 */
public interface Arinc429Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "arinc429";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://gitlab.com/ucof/ucof.de/model/v001/ucof/communication/arinc429";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ucof.model.communication.arinc429";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Arinc429Package eINSTANCE = ucof.communication.arinc429.impl.Arinc429PackageImpl.init();

	/**
	 * The meta object id for the '{@link ucof.communication.arinc429.impl.A429BusImpl <em>A429 Bus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.arinc429.impl.A429BusImpl
	 * @see ucof.communication.arinc429.impl.Arinc429PackageImpl#getA429Bus()
	 * @generated
	 */
	int A429_BUS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_BUS__ID = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_BUS__NAME = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_BUS__DOCUMENTATION = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_BUS__MODIFIED = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_BUS__MODIFIER = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_BUS__TRACE_LINK = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_BUS__CREATED = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_BUS__CREATOR = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_BUS__VERSION = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Parity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_BUS__PARITY_TYPE = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>A429 Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_BUS_FEATURE_COUNT = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>A429 Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_BUS_OPERATION_COUNT = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.arinc429.impl.A429MessageImpl <em>A429 Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.arinc429.impl.A429MessageImpl
	 * @see ucof.communication.arinc429.impl.Arinc429PackageImpl#getA429Message()
	 * @generated
	 */
	int A429_MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_MESSAGE__ID = CommunicationPackage.SUPER_MESSAGE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_MESSAGE__NAME = CommunicationPackage.SUPER_MESSAGE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_MESSAGE__DOCUMENTATION = CommunicationPackage.SUPER_MESSAGE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_MESSAGE__MODIFIED = CommunicationPackage.SUPER_MESSAGE_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_MESSAGE__MODIFIER = CommunicationPackage.SUPER_MESSAGE_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_MESSAGE__TRACE_LINK = CommunicationPackage.SUPER_MESSAGE_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_MESSAGE__CREATED = CommunicationPackage.SUPER_MESSAGE_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_MESSAGE__CREATOR = CommunicationPackage.SUPER_MESSAGE_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_MESSAGE__VERSION = CommunicationPackage.SUPER_MESSAGE_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Sdi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_MESSAGE__SDI = CommunicationPackage.SUPER_MESSAGE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>A429 Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_MESSAGE__A429_LABEL = CommunicationPackage.SUPER_MESSAGE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>A429SSM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_MESSAGE__A429_SSM = CommunicationPackage.SUPER_MESSAGE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Label Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_MESSAGE__LABEL_NUMBER = CommunicationPackage.SUPER_MESSAGE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>A429 Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_MESSAGE_FEATURE_COUNT = CommunicationPackage.SUPER_MESSAGE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>A429 Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_MESSAGE_OPERATION_COUNT = CommunicationPackage.SUPER_MESSAGE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.arinc429.impl.A429SignalSpecificationImpl <em>A429 Signal Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.arinc429.impl.A429SignalSpecificationImpl
	 * @see ucof.communication.arinc429.impl.Arinc429PackageImpl#getA429SignalSpecification()
	 * @generated
	 */
	int A429_SIGNAL_SPECIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_SIGNAL_SPECIFICATION__DOCUMENTATION = EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_SIGNAL_SPECIFICATION__MODIFIED = EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_SIGNAL_SPECIFICATION__MODIFIER = EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_SIGNAL_SPECIFICATION__TRACE_LINK = EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_SIGNAL_SPECIFICATION__CREATED = EtypesPackage.SUPER_TRACKING_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_SIGNAL_SPECIFICATION__CREATOR = EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_SIGNAL_SPECIFICATION__VERSION = EtypesPackage.SUPER_TRACKING_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_SIGNAL_SPECIFICATION__ID = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_SIGNAL_SPECIFICATION__NAME = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Coding Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_SIGNAL_SPECIFICATION__CODING_TYPE = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Field Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_SIGNAL_SPECIFICATION__FIELD_LENGTH = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>A429 Signal Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_SIGNAL_SPECIFICATION_FEATURE_COUNT = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>A429 Signal Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A429_SIGNAL_SPECIFICATION_OPERATION_COUNT = EtypesPackage.SUPER_TRACKING_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.arinc429.ParityTypes <em>Parity Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.arinc429.ParityTypes
	 * @see ucof.communication.arinc429.impl.Arinc429PackageImpl#getParityTypes()
	 * @generated
	 */
	int PARITY_TYPES = 3;

	/**
	 * The meta object id for the '{@link ucof.communication.arinc429.CodingTypes <em>Coding Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.arinc429.CodingTypes
	 * @see ucof.communication.arinc429.impl.Arinc429PackageImpl#getCodingTypes()
	 * @generated
	 */
	int CODING_TYPES = 4;

	/**
	 * The meta object id for the '{@link ucof.communication.arinc429.SSMTypes <em>SSM Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.arinc429.SSMTypes
	 * @see ucof.communication.arinc429.impl.Arinc429PackageImpl#getSSMTypes()
	 * @generated
	 */
	int SSM_TYPES = 5;


	/**
	 * Returns the meta object for class '{@link ucof.communication.arinc429.A429Bus <em>A429 Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A429 Bus</em>'.
	 * @see ucof.communication.arinc429.A429Bus
	 * @generated
	 */
	EClass getA429Bus();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.arinc429.A429Bus#getParityType <em>Parity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parity Type</em>'.
	 * @see ucof.communication.arinc429.A429Bus#getParityType()
	 * @see #getA429Bus()
	 * @generated
	 */
	EAttribute getA429Bus_ParityType();

	/**
	 * Returns the meta object for class '{@link ucof.communication.arinc429.A429Message <em>A429 Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A429 Message</em>'.
	 * @see ucof.communication.arinc429.A429Message
	 * @generated
	 */
	EClass getA429Message();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.arinc429.A429Message#getSdi <em>Sdi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sdi</em>'.
	 * @see ucof.communication.arinc429.A429Message#getSdi()
	 * @see #getA429Message()
	 * @generated
	 */
	EAttribute getA429Message_Sdi();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.arinc429.A429Message#getA429Label <em>A429 Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>A429 Label</em>'.
	 * @see ucof.communication.arinc429.A429Message#getA429Label()
	 * @see #getA429Message()
	 * @generated
	 */
	EAttribute getA429Message_A429Label();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.arinc429.A429Message#getA429SSM <em>A429SSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>A429SSM</em>'.
	 * @see ucof.communication.arinc429.A429Message#getA429SSM()
	 * @see #getA429Message()
	 * @generated
	 */
	EAttribute getA429Message_A429SSM();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.arinc429.A429Message#getLabelNumber <em>Label Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Number</em>'.
	 * @see ucof.communication.arinc429.A429Message#getLabelNumber()
	 * @see #getA429Message()
	 * @generated
	 */
	EAttribute getA429Message_LabelNumber();

	/**
	 * Returns the meta object for class '{@link ucof.communication.arinc429.A429SignalSpecification <em>A429 Signal Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A429 Signal Specification</em>'.
	 * @see ucof.communication.arinc429.A429SignalSpecification
	 * @generated
	 */
	EClass getA429SignalSpecification();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.arinc429.A429SignalSpecification#getCodingType <em>Coding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coding Type</em>'.
	 * @see ucof.communication.arinc429.A429SignalSpecification#getCodingType()
	 * @see #getA429SignalSpecification()
	 * @generated
	 */
	EAttribute getA429SignalSpecification_CodingType();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.arinc429.A429SignalSpecification#getFieldLength <em>Field Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Length</em>'.
	 * @see ucof.communication.arinc429.A429SignalSpecification#getFieldLength()
	 * @see #getA429SignalSpecification()
	 * @generated
	 */
	EAttribute getA429SignalSpecification_FieldLength();

	/**
	 * Returns the meta object for enum '{@link ucof.communication.arinc429.ParityTypes <em>Parity Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parity Types</em>'.
	 * @see ucof.communication.arinc429.ParityTypes
	 * @generated
	 */
	EEnum getParityTypes();

	/**
	 * Returns the meta object for enum '{@link ucof.communication.arinc429.CodingTypes <em>Coding Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Coding Types</em>'.
	 * @see ucof.communication.arinc429.CodingTypes
	 * @generated
	 */
	EEnum getCodingTypes();

	/**
	 * Returns the meta object for enum '{@link ucof.communication.arinc429.SSMTypes <em>SSM Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SSM Types</em>'.
	 * @see ucof.communication.arinc429.SSMTypes
	 * @generated
	 */
	EEnum getSSMTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Arinc429Factory getArinc429Factory();

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
		 * The meta object literal for the '{@link ucof.communication.arinc429.impl.A429BusImpl <em>A429 Bus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.arinc429.impl.A429BusImpl
		 * @see ucof.communication.arinc429.impl.Arinc429PackageImpl#getA429Bus()
		 * @generated
		 */
		EClass A429_BUS = eINSTANCE.getA429Bus();

		/**
		 * The meta object literal for the '<em><b>Parity Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A429_BUS__PARITY_TYPE = eINSTANCE.getA429Bus_ParityType();

		/**
		 * The meta object literal for the '{@link ucof.communication.arinc429.impl.A429MessageImpl <em>A429 Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.arinc429.impl.A429MessageImpl
		 * @see ucof.communication.arinc429.impl.Arinc429PackageImpl#getA429Message()
		 * @generated
		 */
		EClass A429_MESSAGE = eINSTANCE.getA429Message();

		/**
		 * The meta object literal for the '<em><b>Sdi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A429_MESSAGE__SDI = eINSTANCE.getA429Message_Sdi();

		/**
		 * The meta object literal for the '<em><b>A429 Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A429_MESSAGE__A429_LABEL = eINSTANCE.getA429Message_A429Label();

		/**
		 * The meta object literal for the '<em><b>A429SSM</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A429_MESSAGE__A429_SSM = eINSTANCE.getA429Message_A429SSM();

		/**
		 * The meta object literal for the '<em><b>Label Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A429_MESSAGE__LABEL_NUMBER = eINSTANCE.getA429Message_LabelNumber();

		/**
		 * The meta object literal for the '{@link ucof.communication.arinc429.impl.A429SignalSpecificationImpl <em>A429 Signal Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.arinc429.impl.A429SignalSpecificationImpl
		 * @see ucof.communication.arinc429.impl.Arinc429PackageImpl#getA429SignalSpecification()
		 * @generated
		 */
		EClass A429_SIGNAL_SPECIFICATION = eINSTANCE.getA429SignalSpecification();

		/**
		 * The meta object literal for the '<em><b>Coding Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A429_SIGNAL_SPECIFICATION__CODING_TYPE = eINSTANCE.getA429SignalSpecification_CodingType();

		/**
		 * The meta object literal for the '<em><b>Field Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A429_SIGNAL_SPECIFICATION__FIELD_LENGTH = eINSTANCE.getA429SignalSpecification_FieldLength();

		/**
		 * The meta object literal for the '{@link ucof.communication.arinc429.ParityTypes <em>Parity Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.arinc429.ParityTypes
		 * @see ucof.communication.arinc429.impl.Arinc429PackageImpl#getParityTypes()
		 * @generated
		 */
		EEnum PARITY_TYPES = eINSTANCE.getParityTypes();

		/**
		 * The meta object literal for the '{@link ucof.communication.arinc429.CodingTypes <em>Coding Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.arinc429.CodingTypes
		 * @see ucof.communication.arinc429.impl.Arinc429PackageImpl#getCodingTypes()
		 * @generated
		 */
		EEnum CODING_TYPES = eINSTANCE.getCodingTypes();

		/**
		 * The meta object literal for the '{@link ucof.communication.arinc429.SSMTypes <em>SSM Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.arinc429.SSMTypes
		 * @see ucof.communication.arinc429.impl.Arinc429PackageImpl#getSSMTypes()
		 * @generated
		 */
		EEnum SSM_TYPES = eINSTANCE.getSSMTypes();

	}

} //Arinc429Package
