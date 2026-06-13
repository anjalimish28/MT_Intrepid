/**
 */
package ucof.devices.functions.routing;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ucof.devices.functions.routing.RoutingPackage
 * @generated
 */
public interface RoutingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RoutingFactory eINSTANCE = ucof.devices.functions.routing.impl.RoutingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Routing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Routing</em>'.
	 * @generated
	 */
	Routing createRouting();

	/**
	 * Returns a new object of class '<em>Payload Routing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payload Routing</em>'.
	 * @generated
	 */
	PayloadRouting createPayloadRouting();

	/**
	 * Returns a new object of class '<em>Signal Routing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal Routing</em>'.
	 * @generated
	 */
	SignalRouting createSignalRouting();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RoutingPackage getRoutingPackage();

} //RoutingFactory
