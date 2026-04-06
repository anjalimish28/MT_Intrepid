/**
 */
package ucof.devices.functions.routing;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

import ucof.communication.Payload;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payload Routing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.functions.routing.PayloadRouting#getInPayload <em>In Payload</em>}</li>
 *   <li>{@link ucof.devices.functions.routing.PayloadRouting#getOutPayload <em>Out Payload</em>}</li>
 * </ul>
 *
 * @see ucof.devices.functions.routing.RoutingPackage#getPayloadRouting()
 * @model
 * @generated
 */
public interface PayloadRouting extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>In Payload</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Payload</em>' reference.
	 * @see #setInPayload(Payload)
	 * @see ucof.devices.functions.routing.RoutingPackage#getPayloadRouting_InPayload()
	 * @model required="true" transient="true"
	 * @generated
	 */
	Payload getInPayload();

	/**
	 * Sets the value of the '{@link ucof.devices.functions.routing.PayloadRouting#getInPayload <em>In Payload</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Payload</em>' reference.
	 * @see #getInPayload()
	 * @generated
	 */
	void setInPayload(Payload value);

	/**
	 * Returns the value of the '<em><b>Out Payload</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Payload</em>' reference.
	 * @see #setOutPayload(Payload)
	 * @see ucof.devices.functions.routing.RoutingPackage#getPayloadRouting_OutPayload()
	 * @model required="true" transient="true"
	 * @generated
	 */
	Payload getOutPayload();

	/**
	 * Sets the value of the '{@link ucof.devices.functions.routing.PayloadRouting#getOutPayload <em>Out Payload</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Payload</em>' reference.
	 * @see #getOutPayload()
	 * @generated
	 */
	void setOutPayload(Payload value);

} // PayloadRouting
