/**
 */
package ucof.devices.functions.routing;

import org.eclipse.emf.common.util.EList;
import ucof.devices.functions.SuperFunctionType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Routing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.functions.routing.Routing#getPayloadRouting <em>Payload Routing</em>}</li>
 *   <li>{@link ucof.devices.functions.routing.Routing#getSignalRouting <em>Signal Routing</em>}</li>
 * </ul>
 *
 * @see ucof.devices.functions.routing.RoutingPackage#getRouting()
 * @model
 * @generated
 */
public interface Routing extends SuperFunctionType {
	/**
	 * Returns the value of the '<em><b>Payload Routing</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.devices.functions.routing.PayloadRouting}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payload Routing</em>' containment reference list.
	 * @see ucof.devices.functions.routing.RoutingPackage#getRouting_PayloadRouting()
	 * @model containment="true"
	 * @generated
	 */
	EList<PayloadRouting> getPayloadRouting();

	/**
	 * Returns the value of the '<em><b>Signal Routing</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.devices.functions.routing.SignalRouting}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Routing</em>' containment reference list.
	 * @see ucof.devices.functions.routing.RoutingPackage#getRouting_SignalRouting()
	 * @model containment="true"
	 * @generated
	 */
	EList<SignalRouting> getSignalRouting();

} // Routing
