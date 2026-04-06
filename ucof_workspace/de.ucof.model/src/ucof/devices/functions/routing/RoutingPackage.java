/**
 */
package ucof.devices.functions.routing;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import ucof.common.etypes.EtypesPackage;

import ucof.devices.functions.FunctionsPackage;

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
 * Container for routing function implementation >> easy to implement logic that can be transformed to code during integration
 * <!-- end-model-doc -->
 * @see ucof.devices.functions.routing.RoutingFactory
 * @model kind="package"
 * @generated
 */
public interface RoutingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "routing";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://gitlab.com/ucof/ucof.de/model/v001/ucof/Functions/Routing";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ucof.model.devices.functions.routing";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RoutingPackage eINSTANCE = ucof.devices.functions.routing.impl.RoutingPackageImpl.init();

	/**
	 * The meta object id for the '{@link ucof.devices.functions.routing.impl.RoutingImpl <em>Routing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.functions.routing.impl.RoutingImpl
	 * @see ucof.devices.functions.routing.impl.RoutingPackageImpl#getRouting()
	 * @generated
	 */
	int ROUTING = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING__ID = FunctionsPackage.SUPER_FUNCTION_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING__NAME = FunctionsPackage.SUPER_FUNCTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING__DOCUMENTATION = FunctionsPackage.SUPER_FUNCTION_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING__MODIFIED = FunctionsPackage.SUPER_FUNCTION_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING__MODIFIER = FunctionsPackage.SUPER_FUNCTION_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING__TRACE_LINK = FunctionsPackage.SUPER_FUNCTION_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING__CREATED = FunctionsPackage.SUPER_FUNCTION_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING__CREATOR = FunctionsPackage.SUPER_FUNCTION_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING__VERSION = FunctionsPackage.SUPER_FUNCTION_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Function Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING__FUNCTION_LINK = FunctionsPackage.SUPER_FUNCTION_TYPE__FUNCTION_LINK;

	/**
	 * The feature id for the '<em><b>Payload Routing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING__PAYLOAD_ROUTING = FunctionsPackage.SUPER_FUNCTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signal Routing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING__SIGNAL_ROUTING = FunctionsPackage.SUPER_FUNCTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Routing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_FEATURE_COUNT = FunctionsPackage.SUPER_FUNCTION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Routing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_OPERATION_COUNT = FunctionsPackage.SUPER_FUNCTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.devices.functions.routing.impl.PayloadRoutingImpl <em>Payload Routing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.functions.routing.impl.PayloadRoutingImpl
	 * @see ucof.devices.functions.routing.impl.RoutingPackageImpl#getPayloadRouting()
	 * @generated
	 */
	int PAYLOAD_ROUTING = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_ROUTING__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_ROUTING__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_ROUTING__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_ROUTING__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_ROUTING__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_ROUTING__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_ROUTING__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_ROUTING__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_ROUTING__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>In Payload</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_ROUTING__IN_PAYLOAD = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Out Payload</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_ROUTING__OUT_PAYLOAD = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Payload Routing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_ROUTING_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Payload Routing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_ROUTING_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.devices.functions.routing.impl.SignalRoutingImpl <em>Signal Routing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.functions.routing.impl.SignalRoutingImpl
	 * @see ucof.devices.functions.routing.impl.RoutingPackageImpl#getSignalRouting()
	 * @generated
	 */
	int SIGNAL_ROUTING = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ROUTING__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ROUTING__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ROUTING__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ROUTING__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ROUTING__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ROUTING__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ROUTING__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ROUTING__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ROUTING__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>In Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ROUTING__IN_SIGNAL = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Out Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ROUTING__OUT_SIGNAL = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Signal Routing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ROUTING_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Signal Routing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ROUTING_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ucof.devices.functions.routing.Routing <em>Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Routing</em>'.
	 * @see ucof.devices.functions.routing.Routing
	 * @generated
	 */
	EClass getRouting();

	/**
	 * Returns the meta object for the containment reference list '{@link ucof.devices.functions.routing.Routing#getPayloadRouting <em>Payload Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Payload Routing</em>'.
	 * @see ucof.devices.functions.routing.Routing#getPayloadRouting()
	 * @see #getRouting()
	 * @generated
	 */
	EReference getRouting_PayloadRouting();

	/**
	 * Returns the meta object for the containment reference list '{@link ucof.devices.functions.routing.Routing#getSignalRouting <em>Signal Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signal Routing</em>'.
	 * @see ucof.devices.functions.routing.Routing#getSignalRouting()
	 * @see #getRouting()
	 * @generated
	 */
	EReference getRouting_SignalRouting();

	/**
	 * Returns the meta object for class '{@link ucof.devices.functions.routing.PayloadRouting <em>Payload Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payload Routing</em>'.
	 * @see ucof.devices.functions.routing.PayloadRouting
	 * @generated
	 */
	EClass getPayloadRouting();

	/**
	 * Returns the meta object for the reference '{@link ucof.devices.functions.routing.PayloadRouting#getInPayload <em>In Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Payload</em>'.
	 * @see ucof.devices.functions.routing.PayloadRouting#getInPayload()
	 * @see #getPayloadRouting()
	 * @generated
	 */
	EReference getPayloadRouting_InPayload();

	/**
	 * Returns the meta object for the reference '{@link ucof.devices.functions.routing.PayloadRouting#getOutPayload <em>Out Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Out Payload</em>'.
	 * @see ucof.devices.functions.routing.PayloadRouting#getOutPayload()
	 * @see #getPayloadRouting()
	 * @generated
	 */
	EReference getPayloadRouting_OutPayload();

	/**
	 * Returns the meta object for class '{@link ucof.devices.functions.routing.SignalRouting <em>Signal Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Routing</em>'.
	 * @see ucof.devices.functions.routing.SignalRouting
	 * @generated
	 */
	EClass getSignalRouting();

	/**
	 * Returns the meta object for the reference '{@link ucof.devices.functions.routing.SignalRouting#getInSignal <em>In Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Signal</em>'.
	 * @see ucof.devices.functions.routing.SignalRouting#getInSignal()
	 * @see #getSignalRouting()
	 * @generated
	 */
	EReference getSignalRouting_InSignal();

	/**
	 * Returns the meta object for the reference '{@link ucof.devices.functions.routing.SignalRouting#getOutSignal <em>Out Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Out Signal</em>'.
	 * @see ucof.devices.functions.routing.SignalRouting#getOutSignal()
	 * @see #getSignalRouting()
	 * @generated
	 */
	EReference getSignalRouting_OutSignal();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RoutingFactory getRoutingFactory();

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
		 * The meta object literal for the '{@link ucof.devices.functions.routing.impl.RoutingImpl <em>Routing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.functions.routing.impl.RoutingImpl
		 * @see ucof.devices.functions.routing.impl.RoutingPackageImpl#getRouting()
		 * @generated
		 */
		EClass ROUTING = eINSTANCE.getRouting();

		/**
		 * The meta object literal for the '<em><b>Payload Routing</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTING__PAYLOAD_ROUTING = eINSTANCE.getRouting_PayloadRouting();

		/**
		 * The meta object literal for the '<em><b>Signal Routing</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTING__SIGNAL_ROUTING = eINSTANCE.getRouting_SignalRouting();

		/**
		 * The meta object literal for the '{@link ucof.devices.functions.routing.impl.PayloadRoutingImpl <em>Payload Routing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.functions.routing.impl.PayloadRoutingImpl
		 * @see ucof.devices.functions.routing.impl.RoutingPackageImpl#getPayloadRouting()
		 * @generated
		 */
		EClass PAYLOAD_ROUTING = eINSTANCE.getPayloadRouting();

		/**
		 * The meta object literal for the '<em><b>In Payload</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYLOAD_ROUTING__IN_PAYLOAD = eINSTANCE.getPayloadRouting_InPayload();

		/**
		 * The meta object literal for the '<em><b>Out Payload</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYLOAD_ROUTING__OUT_PAYLOAD = eINSTANCE.getPayloadRouting_OutPayload();

		/**
		 * The meta object literal for the '{@link ucof.devices.functions.routing.impl.SignalRoutingImpl <em>Signal Routing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.functions.routing.impl.SignalRoutingImpl
		 * @see ucof.devices.functions.routing.impl.RoutingPackageImpl#getSignalRouting()
		 * @generated
		 */
		EClass SIGNAL_ROUTING = eINSTANCE.getSignalRouting();

		/**
		 * The meta object literal for the '<em><b>In Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_ROUTING__IN_SIGNAL = eINSTANCE.getSignalRouting_InSignal();

		/**
		 * The meta object literal for the '<em><b>Out Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_ROUTING__OUT_SIGNAL = eINSTANCE.getSignalRouting_OutSignal();

	}

} //RoutingPackage
