/**
 */
package ucof.devices.functions.routing.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ucof.devices.functions.routing.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoutingFactoryImpl extends EFactoryImpl implements RoutingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RoutingFactory init() {
		try {
			RoutingFactory theRoutingFactory = (RoutingFactory)EPackage.Registry.INSTANCE.getEFactory(RoutingPackage.eNS_URI);
			if (theRoutingFactory != null) {
				return theRoutingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RoutingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoutingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RoutingPackage.ROUTING: return createRouting();
			case RoutingPackage.PAYLOAD_ROUTING: return createPayloadRouting();
			case RoutingPackage.SIGNAL_ROUTING: return createSignalRouting();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Routing createRouting() {
		RoutingImpl routing = new RoutingImpl();
		return routing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayloadRouting createPayloadRouting() {
		PayloadRoutingImpl payloadRouting = new PayloadRoutingImpl();
		return payloadRouting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalRouting createSignalRouting() {
		SignalRoutingImpl signalRouting = new SignalRoutingImpl();
		return signalRouting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoutingPackage getRoutingPackage() {
		return (RoutingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RoutingPackage getPackage() {
		return RoutingPackage.eINSTANCE;
	}

} //RoutingFactoryImpl
