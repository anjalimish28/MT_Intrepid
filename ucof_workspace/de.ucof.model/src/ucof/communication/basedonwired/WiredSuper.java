/**
 */
package ucof.communication.basedonwired;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

import ucof.communication.connectors.Connector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wired Super</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.basedonwired.WiredSuper#getConnector <em>Connector</em>}</li>
 * </ul>
 *
 * @see ucof.communication.basedonwired.BasedonwiredPackage#getWiredSuper()
 * @model abstract="true"
 * @generated
 */
public interface WiredSuper extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' reference.
	 * @see #setConnector(Connector)
	 * @see ucof.communication.basedonwired.BasedonwiredPackage#getWiredSuper_Connector()
	 * @model
	 * @generated
	 */
	Connector getConnector();

	/**
	 * Sets the value of the '{@link ucof.communication.basedonwired.WiredSuper#getConnector <em>Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' reference.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(Connector value);

} // WiredSuper
