/**
 */
package ucof.communication.basedonwired;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * Container, including all elements for building a wire based interface, i.e., analogue and discrete
 * <!-- end-model-doc -->
 * @see ucof.communication.basedonwired.BasedonwiredFactory
 * @model kind="package"
 * @generated
 */
public interface BasedonwiredPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "basedonwired";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://gitlab.com/ucof/ucof.de/model/v001/ucof/communication/basedonwired";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ucof.model.communication.basedonwired";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasedonwiredPackage eINSTANCE = ucof.communication.basedonwired.impl.BasedonwiredPackageImpl.init();

	/**
	 * The meta object id for the '{@link ucof.communication.basedonwired.impl.WiredInterfacesImpl <em>Wired Interfaces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.basedonwired.impl.WiredInterfacesImpl
	 * @see ucof.communication.basedonwired.impl.BasedonwiredPackageImpl#getWiredInterfaces()
	 * @generated
	 */
	int WIRED_INTERFACES = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRED_INTERFACES__ID = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRED_INTERFACES__NAME = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRED_INTERFACES__DOCUMENTATION = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRED_INTERFACES__MODIFIED = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRED_INTERFACES__MODIFIER = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRED_INTERFACES__TRACE_LINK = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRED_INTERFACES__CREATED = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRED_INTERFACES__CREATOR = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRED_INTERFACES__VERSION = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Wired Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRED_INTERFACES__WIRED_INTERFACE = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wired Interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRED_INTERFACES_FEATURE_COUNT = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Wired Interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRED_INTERFACES_OPERATION_COUNT = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.basedonwired.impl.WiredSuperImpl <em>Wired Super</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.basedonwired.impl.WiredSuperImpl
	 * @see ucof.communication.basedonwired.impl.BasedonwiredPackageImpl#getWiredSuper()
	 * @generated
	 */
	int WIRED_SUPER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRED_SUPER__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRED_SUPER__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRED_SUPER__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRED_SUPER__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRED_SUPER__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRED_SUPER__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRED_SUPER__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRED_SUPER__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRED_SUPER__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRED_SUPER__CONNECTOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Wired Super</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRED_SUPER_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Wired Super</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRED_SUPER_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.basedonwired.impl.AnalogueImpl <em>Analogue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.basedonwired.impl.AnalogueImpl
	 * @see ucof.communication.basedonwired.impl.BasedonwiredPackageImpl#getAnalogue()
	 * @generated
	 */
	int ANALOGUE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE__ID = WIRED_SUPER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE__NAME = WIRED_SUPER__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE__DOCUMENTATION = WIRED_SUPER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE__MODIFIED = WIRED_SUPER__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE__MODIFIER = WIRED_SUPER__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE__TRACE_LINK = WIRED_SUPER__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE__CREATED = WIRED_SUPER__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE__CREATOR = WIRED_SUPER__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE__VERSION = WIRED_SUPER__VERSION;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE__CONNECTOR = WIRED_SUPER__CONNECTOR;

	/**
	 * The feature id for the '<em><b>Inc Count Step Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE__INC_COUNT_STEP_SIZE = WIRED_SUPER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dec Count Step Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE__DEC_COUNT_STEP_SIZE = WIRED_SUPER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Analogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_FEATURE_COUNT = WIRED_SUPER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Analogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_OPERATION_COUNT = WIRED_SUPER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.basedonwired.impl.DiscreteImpl <em>Discrete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.basedonwired.impl.DiscreteImpl
	 * @see ucof.communication.basedonwired.impl.BasedonwiredPackageImpl#getDiscrete()
	 * @generated
	 */
	int DISCRETE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__ID = WIRED_SUPER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__NAME = WIRED_SUPER__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__DOCUMENTATION = WIRED_SUPER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__MODIFIED = WIRED_SUPER__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__MODIFIER = WIRED_SUPER__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__TRACE_LINK = WIRED_SUPER__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__CREATED = WIRED_SUPER__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__CREATOR = WIRED_SUPER__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__VERSION = WIRED_SUPER__VERSION;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE__CONNECTOR = WIRED_SUPER__CONNECTOR;

	/**
	 * The number of structural features of the '<em>Discrete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_FEATURE_COUNT = WIRED_SUPER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Discrete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_OPERATION_COUNT = WIRED_SUPER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ucof.communication.basedonwired.WiredInterfaces <em>Wired Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wired Interfaces</em>'.
	 * @see ucof.communication.basedonwired.WiredInterfaces
	 * @generated
	 */
	EClass getWiredInterfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link ucof.communication.basedonwired.WiredInterfaces#getWiredInterface <em>Wired Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wired Interface</em>'.
	 * @see ucof.communication.basedonwired.WiredInterfaces#getWiredInterface()
	 * @see #getWiredInterfaces()
	 * @generated
	 */
	EReference getWiredInterfaces_WiredInterface();

	/**
	 * Returns the meta object for class '{@link ucof.communication.basedonwired.WiredSuper <em>Wired Super</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wired Super</em>'.
	 * @see ucof.communication.basedonwired.WiredSuper
	 * @generated
	 */
	EClass getWiredSuper();

	/**
	 * Returns the meta object for the reference '{@link ucof.communication.basedonwired.WiredSuper#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connector</em>'.
	 * @see ucof.communication.basedonwired.WiredSuper#getConnector()
	 * @see #getWiredSuper()
	 * @generated
	 */
	EReference getWiredSuper_Connector();

	/**
	 * Returns the meta object for class '{@link ucof.communication.basedonwired.Analogue <em>Analogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analogue</em>'.
	 * @see ucof.communication.basedonwired.Analogue
	 * @generated
	 */
	EClass getAnalogue();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.basedonwired.Analogue#getIncCountStepSize <em>Inc Count Step Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inc Count Step Size</em>'.
	 * @see ucof.communication.basedonwired.Analogue#getIncCountStepSize()
	 * @see #getAnalogue()
	 * @generated
	 */
	EAttribute getAnalogue_IncCountStepSize();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.basedonwired.Analogue#getDecCountStepSize <em>Dec Count Step Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dec Count Step Size</em>'.
	 * @see ucof.communication.basedonwired.Analogue#getDecCountStepSize()
	 * @see #getAnalogue()
	 * @generated
	 */
	EAttribute getAnalogue_DecCountStepSize();

	/**
	 * Returns the meta object for class '{@link ucof.communication.basedonwired.Discrete <em>Discrete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete</em>'.
	 * @see ucof.communication.basedonwired.Discrete
	 * @generated
	 */
	EClass getDiscrete();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BasedonwiredFactory getBasedonwiredFactory();

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
		 * The meta object literal for the '{@link ucof.communication.basedonwired.impl.WiredInterfacesImpl <em>Wired Interfaces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.basedonwired.impl.WiredInterfacesImpl
		 * @see ucof.communication.basedonwired.impl.BasedonwiredPackageImpl#getWiredInterfaces()
		 * @generated
		 */
		EClass WIRED_INTERFACES = eINSTANCE.getWiredInterfaces();

		/**
		 * The meta object literal for the '<em><b>Wired Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIRED_INTERFACES__WIRED_INTERFACE = eINSTANCE.getWiredInterfaces_WiredInterface();

		/**
		 * The meta object literal for the '{@link ucof.communication.basedonwired.impl.WiredSuperImpl <em>Wired Super</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.basedonwired.impl.WiredSuperImpl
		 * @see ucof.communication.basedonwired.impl.BasedonwiredPackageImpl#getWiredSuper()
		 * @generated
		 */
		EClass WIRED_SUPER = eINSTANCE.getWiredSuper();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIRED_SUPER__CONNECTOR = eINSTANCE.getWiredSuper_Connector();

		/**
		 * The meta object literal for the '{@link ucof.communication.basedonwired.impl.AnalogueImpl <em>Analogue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.basedonwired.impl.AnalogueImpl
		 * @see ucof.communication.basedonwired.impl.BasedonwiredPackageImpl#getAnalogue()
		 * @generated
		 */
		EClass ANALOGUE = eINSTANCE.getAnalogue();

		/**
		 * The meta object literal for the '<em><b>Inc Count Step Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALOGUE__INC_COUNT_STEP_SIZE = eINSTANCE.getAnalogue_IncCountStepSize();

		/**
		 * The meta object literal for the '<em><b>Dec Count Step Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALOGUE__DEC_COUNT_STEP_SIZE = eINSTANCE.getAnalogue_DecCountStepSize();

		/**
		 * The meta object literal for the '{@link ucof.communication.basedonwired.impl.DiscreteImpl <em>Discrete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.basedonwired.impl.DiscreteImpl
		 * @see ucof.communication.basedonwired.impl.BasedonwiredPackageImpl#getDiscrete()
		 * @generated
		 */
		EClass DISCRETE = eINSTANCE.getDiscrete();

	}

} //BasedonwiredPackage
