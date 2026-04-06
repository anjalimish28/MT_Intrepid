/**
 */
package ucof.devices.functions.routing;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

import ucof.communication.Signal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Routing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.functions.routing.SignalRouting#getInSignal <em>In Signal</em>}</li>
 *   <li>{@link ucof.devices.functions.routing.SignalRouting#getOutSignal <em>Out Signal</em>}</li>
 * </ul>
 *
 * @see ucof.devices.functions.routing.RoutingPackage#getSignalRouting()
 * @model
 * @generated
 */
public interface SignalRouting extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>In Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Signal</em>' reference.
	 * @see #setInSignal(Signal)
	 * @see ucof.devices.functions.routing.RoutingPackage#getSignalRouting_InSignal()
	 * @model required="true" transient="true"
	 * @generated
	 */
	Signal getInSignal();

	/**
	 * Sets the value of the '{@link ucof.devices.functions.routing.SignalRouting#getInSignal <em>In Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Signal</em>' reference.
	 * @see #getInSignal()
	 * @generated
	 */
	void setInSignal(Signal value);

	/**
	 * Returns the value of the '<em><b>Out Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Signal</em>' reference.
	 * @see #setOutSignal(Signal)
	 * @see ucof.devices.functions.routing.RoutingPackage#getSignalRouting_OutSignal()
	 * @model required="true" transient="true"
	 * @generated
	 */
	Signal getOutSignal();

	/**
	 * Sets the value of the '{@link ucof.devices.functions.routing.SignalRouting#getOutSignal <em>Out Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Signal</em>' reference.
	 * @see #getOutSignal()
	 * @generated
	 */
	void setOutSignal(Signal value);

} // SignalRouting
