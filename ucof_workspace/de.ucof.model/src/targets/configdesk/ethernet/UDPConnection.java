/**
 */
package targets.configdesk.ethernet;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UDP Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.configdesk.ethernet.UDPConnection#getMaxVectorSize <em>Max Vector Size</em>}</li>
 * </ul>
 *
 * @see targets.configdesk.ethernet.EthernetPackage#getUDPConnection()
 * @model abstract="true"
 * @generated
 */
public interface UDPConnection extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Max Vector Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Vector Size</em>' attribute.
	 * @see #setMaxVectorSize(int)
	 * @see targets.configdesk.ethernet.EthernetPackage#getUDPConnection_MaxVectorSize()
	 * @model
	 * @generated
	 */
	int getMaxVectorSize();

	/**
	 * Sets the value of the '{@link targets.configdesk.ethernet.UDPConnection#getMaxVectorSize <em>Max Vector Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Vector Size</em>' attribute.
	 * @see #getMaxVectorSize()
	 * @generated
	 */
	void setMaxVectorSize(int value);

} // UDPConnection
