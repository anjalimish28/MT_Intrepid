/**
 */
package targets.intrepidgateway;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Can Mailbox Address Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.intrepidgateway.CanMailboxAddressFilter#getAddressSymbol <em>Address Symbol</em>}</li>
 *   <li>{@link targets.intrepidgateway.CanMailboxAddressFilter#getAddressValue <em>Address Value</em>}</li>
 * </ul>
 *
 * @see targets.intrepidgateway.IntrepidgatewayPackage#getCanMailboxAddressFilter()
 * @model
 * @generated
 */
public interface CanMailboxAddressFilter extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Address Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Symbol</em>' attribute.
	 * @see #setAddressSymbol(String)
	 * @see targets.intrepidgateway.IntrepidgatewayPackage#getCanMailboxAddressFilter_AddressSymbol()
	 * @model
	 * @generated
	 */
	String getAddressSymbol();

	/**
	 * Sets the value of the '{@link targets.intrepidgateway.CanMailboxAddressFilter#getAddressSymbol <em>Address Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Symbol</em>' attribute.
	 * @see #getAddressSymbol()
	 * @generated
	 */
	void setAddressSymbol(String value);

	/**
	 * Returns the value of the '<em><b>Address Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Value</em>' attribute.
	 * @see #setAddressValue(int)
	 * @see targets.intrepidgateway.IntrepidgatewayPackage#getCanMailboxAddressFilter_AddressValue()
	 * @model
	 * @generated
	 */
	int getAddressValue();

	/**
	 * Sets the value of the '{@link targets.intrepidgateway.CanMailboxAddressFilter#getAddressValue <em>Address Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Value</em>' attribute.
	 * @see #getAddressValue()
	 * @generated
	 */
	void setAddressValue(int value);

} // CanMailboxAddressFilter
