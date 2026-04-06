/**
 */
package ucof.communication.connectors;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.connectors.ConnectionPin#getConnectionPinRole <em>Connection Pin Role</em>}</li>
 * </ul>
 *
 * @see ucof.communication.connectors.ConnectorsPackage#getConnectionPin()
 * @model
 * @generated
 */
public interface ConnectionPin extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Connection Pin Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Pin Role</em>' attribute.
	 * @see #setConnectionPinRole(String)
	 * @see ucof.communication.connectors.ConnectorsPackage#getConnectionPin_ConnectionPinRole()
	 * @model dataType="ucof.common.edata.DecOrHexValueType"
	 * @generated
	 */
	String getConnectionPinRole();

	/**
	 * Sets the value of the '{@link ucof.communication.connectors.ConnectionPin#getConnectionPinRole <em>Connection Pin Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Pin Role</em>' attribute.
	 * @see #getConnectionPinRole()
	 * @generated
	 */
	void setConnectionPinRole(String value);

} // ConnectionPin
