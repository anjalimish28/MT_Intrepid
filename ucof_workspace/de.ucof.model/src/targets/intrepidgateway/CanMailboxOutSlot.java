/**
 */
package targets.intrepidgateway;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Can Mailbox Out Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.intrepidgateway.CanMailboxOutSlot#getPortId <em>Port Id</em>}</li>
 *   <li>{@link targets.intrepidgateway.CanMailboxOutSlot#getSourceAddressSymbol <em>Source Address Symbol</em>}</li>
 *   <li>{@link targets.intrepidgateway.CanMailboxOutSlot#getSourceAddressValue <em>Source Address Value</em>}</li>
 *   <li>{@link targets.intrepidgateway.CanMailboxOutSlot#getDestinationAddressSymbol <em>Destination Address Symbol</em>}</li>
 *   <li>{@link targets.intrepidgateway.CanMailboxOutSlot#getDestinationAddressValue <em>Destination Address Value</em>}</li>
 *   <li>{@link targets.intrepidgateway.CanMailboxOutSlot#isMulticast <em>Multicast</em>}</li>
 * </ul>
 *
 * @see targets.intrepidgateway.IntrepidgatewayPackage#getCanMailboxOutSlot()
 * @model
 * @generated
 */
public interface CanMailboxOutSlot extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Port Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Id</em>' attribute.
	 * @see #setPortId(String)
	 * @see targets.intrepidgateway.IntrepidgatewayPackage#getCanMailboxOutSlot_PortId()
	 * @model
	 * @generated
	 */
	String getPortId();

	/**
	 * Sets the value of the '{@link targets.intrepidgateway.CanMailboxOutSlot#getPortId <em>Port Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Id</em>' attribute.
	 * @see #getPortId()
	 * @generated
	 */
	void setPortId(String value);

	/**
	 * Returns the value of the '<em><b>Source Address Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Address Symbol</em>' attribute.
	 * @see #setSourceAddressSymbol(String)
	 * @see targets.intrepidgateway.IntrepidgatewayPackage#getCanMailboxOutSlot_SourceAddressSymbol()
	 * @model
	 * @generated
	 */
	String getSourceAddressSymbol();

	/**
	 * Sets the value of the '{@link targets.intrepidgateway.CanMailboxOutSlot#getSourceAddressSymbol <em>Source Address Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Address Symbol</em>' attribute.
	 * @see #getSourceAddressSymbol()
	 * @generated
	 */
	void setSourceAddressSymbol(String value);

	/**
	 * Returns the value of the '<em><b>Source Address Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Address Value</em>' attribute.
	 * @see #setSourceAddressValue(int)
	 * @see targets.intrepidgateway.IntrepidgatewayPackage#getCanMailboxOutSlot_SourceAddressValue()
	 * @model
	 * @generated
	 */
	int getSourceAddressValue();

	/**
	 * Sets the value of the '{@link targets.intrepidgateway.CanMailboxOutSlot#getSourceAddressValue <em>Source Address Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Address Value</em>' attribute.
	 * @see #getSourceAddressValue()
	 * @generated
	 */
	void setSourceAddressValue(int value);

	/**
	 * Returns the value of the '<em><b>Destination Address Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Address Symbol</em>' attribute.
	 * @see #setDestinationAddressSymbol(String)
	 * @see targets.intrepidgateway.IntrepidgatewayPackage#getCanMailboxOutSlot_DestinationAddressSymbol()
	 * @model
	 * @generated
	 */
	String getDestinationAddressSymbol();

	/**
	 * Sets the value of the '{@link targets.intrepidgateway.CanMailboxOutSlot#getDestinationAddressSymbol <em>Destination Address Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Address Symbol</em>' attribute.
	 * @see #getDestinationAddressSymbol()
	 * @generated
	 */
	void setDestinationAddressSymbol(String value);

	/**
	 * Returns the value of the '<em><b>Destination Address Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Address Value</em>' attribute.
	 * @see #setDestinationAddressValue(int)
	 * @see targets.intrepidgateway.IntrepidgatewayPackage#getCanMailboxOutSlot_DestinationAddressValue()
	 * @model
	 * @generated
	 */
	int getDestinationAddressValue();

	/**
	 * Sets the value of the '{@link targets.intrepidgateway.CanMailboxOutSlot#getDestinationAddressValue <em>Destination Address Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Address Value</em>' attribute.
	 * @see #getDestinationAddressValue()
	 * @generated
	 */
	void setDestinationAddressValue(int value);

	/**
	 * Returns the value of the '<em><b>Multicast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multicast</em>' attribute.
	 * @see #setMulticast(boolean)
	 * @see targets.intrepidgateway.IntrepidgatewayPackage#getCanMailboxOutSlot_Multicast()
	 * @model
	 * @generated
	 */
	boolean isMulticast();

	/**
	 * Sets the value of the '{@link targets.intrepidgateway.CanMailboxOutSlot#isMulticast <em>Multicast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multicast</em>' attribute.
	 * @see #isMulticast()
	 * @generated
	 */
	void setMulticast(boolean value);

} // CanMailboxOutSlot
