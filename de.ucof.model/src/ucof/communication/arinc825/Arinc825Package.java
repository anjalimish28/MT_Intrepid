/**
 */
package ucof.communication.arinc825;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * Container, including all elements for building an ARINC 825 interface, see https://www.sae.org/standards/content/arinc825-4/
 * <!-- end-model-doc -->
 * @see ucof.communication.arinc825.Arinc825Factory
 * @model kind="package"
 * @generated
 */
public interface Arinc825Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "arinc825";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://gitlab.com/ucof/ucof.de/model/v001/ucof/communication/arinc825";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ucof.model.communication.arinc825";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Arinc825Package eINSTANCE = ucof.communication.arinc825.impl.Arinc825PackageImpl.init();

	/**
	 * The meta object id for the '{@link ucof.communication.arinc825.impl.A825BusImpl <em>A825 Bus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.arinc825.impl.A825BusImpl
	 * @see ucof.communication.arinc825.impl.Arinc825PackageImpl#getA825Bus()
	 * @generated
	 */
	int A825_BUS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_BUS__ID = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_BUS__NAME = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_BUS__DOCUMENTATION = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_BUS__MODIFIED = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_BUS__MODIFIER = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_BUS__TRACE_LINK = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_BUS__CREATED = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_BUS__CREATOR = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_BUS__VERSION = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Baud Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_BUS__BAUD_RATE = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>A825 Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_BUS_FEATURE_COUNT = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>A825 Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_BUS_OPERATION_COUNT = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.arinc825.impl.A825MessageImpl <em>A825 Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.arinc825.impl.A825MessageImpl
	 * @see ucof.communication.arinc825.impl.Arinc825PackageImpl#getA825Message()
	 * @generated
	 */
	int A825_MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_MESSAGE__ID = CommunicationPackage.SUPER_MESSAGE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_MESSAGE__NAME = CommunicationPackage.SUPER_MESSAGE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_MESSAGE__DOCUMENTATION = CommunicationPackage.SUPER_MESSAGE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_MESSAGE__MODIFIED = CommunicationPackage.SUPER_MESSAGE_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_MESSAGE__MODIFIER = CommunicationPackage.SUPER_MESSAGE_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_MESSAGE__TRACE_LINK = CommunicationPackage.SUPER_MESSAGE_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_MESSAGE__CREATED = CommunicationPackage.SUPER_MESSAGE_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_MESSAGE__CREATOR = CommunicationPackage.SUPER_MESSAGE_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_MESSAGE__VERSION = CommunicationPackage.SUPER_MESSAGE_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>DLC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_MESSAGE__DLC = CommunicationPackage.SUPER_MESSAGE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Can ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_MESSAGE__CAN_ID = CommunicationPackage.SUPER_MESSAGE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Can FD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_MESSAGE__CAN_FD = CommunicationPackage.SUPER_MESSAGE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>A825 Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_MESSAGE_FEATURE_COUNT = CommunicationPackage.SUPER_MESSAGE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>A825 Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A825_MESSAGE_OPERATION_COUNT = CommunicationPackage.SUPER_MESSAGE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.arinc825.DLC <em>DLC</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.arinc825.DLC
	 * @see ucof.communication.arinc825.impl.Arinc825PackageImpl#getDLC()
	 * @generated
	 */
	int DLC = 2;


	/**
	 * Returns the meta object for class '{@link ucof.communication.arinc825.A825Bus <em>A825 Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A825 Bus</em>'.
	 * @see ucof.communication.arinc825.A825Bus
	 * @generated
	 */
	EClass getA825Bus();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.arinc825.A825Bus#getBaudRate <em>Baud Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Baud Rate</em>'.
	 * @see ucof.communication.arinc825.A825Bus#getBaudRate()
	 * @see #getA825Bus()
	 * @generated
	 */
	EAttribute getA825Bus_BaudRate();

	/**
	 * Returns the meta object for class '{@link ucof.communication.arinc825.A825Message <em>A825 Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>A825 Message</em>'.
	 * @see ucof.communication.arinc825.A825Message
	 * @generated
	 */
	EClass getA825Message();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.arinc825.A825Message#getDLC <em>DLC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DLC</em>'.
	 * @see ucof.communication.arinc825.A825Message#getDLC()
	 * @see #getA825Message()
	 * @generated
	 */
	EAttribute getA825Message_DLC();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.arinc825.A825Message#getCanID <em>Can ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can ID</em>'.
	 * @see ucof.communication.arinc825.A825Message#getCanID()
	 * @see #getA825Message()
	 * @generated
	 */
	EAttribute getA825Message_CanID();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.arinc825.A825Message#getCanFD <em>Can FD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can FD</em>'.
	 * @see ucof.communication.arinc825.A825Message#getCanFD()
	 * @see #getA825Message()
	 * @generated
	 */
	EAttribute getA825Message_CanFD();

	/**
	 * Returns the meta object for enum '{@link ucof.communication.arinc825.DLC <em>DLC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DLC</em>'.
	 * @see ucof.communication.arinc825.DLC
	 * @generated
	 */
	EEnum getDLC();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Arinc825Factory getArinc825Factory();

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
		 * The meta object literal for the '{@link ucof.communication.arinc825.impl.A825BusImpl <em>A825 Bus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.arinc825.impl.A825BusImpl
		 * @see ucof.communication.arinc825.impl.Arinc825PackageImpl#getA825Bus()
		 * @generated
		 */
		EClass A825_BUS = eINSTANCE.getA825Bus();

		/**
		 * The meta object literal for the '<em><b>Baud Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A825_BUS__BAUD_RATE = eINSTANCE.getA825Bus_BaudRate();

		/**
		 * The meta object literal for the '{@link ucof.communication.arinc825.impl.A825MessageImpl <em>A825 Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.arinc825.impl.A825MessageImpl
		 * @see ucof.communication.arinc825.impl.Arinc825PackageImpl#getA825Message()
		 * @generated
		 */
		EClass A825_MESSAGE = eINSTANCE.getA825Message();

		/**
		 * The meta object literal for the '<em><b>DLC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A825_MESSAGE__DLC = eINSTANCE.getA825Message_DLC();

		/**
		 * The meta object literal for the '<em><b>Can ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A825_MESSAGE__CAN_ID = eINSTANCE.getA825Message_CanID();

		/**
		 * The meta object literal for the '<em><b>Can FD</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute A825_MESSAGE__CAN_FD = eINSTANCE.getA825Message_CanFD();

		/**
		 * The meta object literal for the '{@link ucof.communication.arinc825.DLC <em>DLC</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.arinc825.DLC
		 * @see ucof.communication.arinc825.impl.Arinc825PackageImpl#getDLC()
		 * @generated
		 */
		EEnum DLC = eINSTANCE.getDLC();

	}

} //Arinc825Package
