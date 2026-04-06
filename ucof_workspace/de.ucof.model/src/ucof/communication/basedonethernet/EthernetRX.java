/**
 */
package ucof.communication.basedonethernet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ethernet RX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.basedonethernet.EthernetRX#getSourcePort <em>Source Port</em>}</li>
 *   <li>{@link ucof.communication.basedonethernet.EthernetRX#getSourceIP <em>Source IP</em>}</li>
 * </ul>
 *
 * @see ucof.communication.basedonethernet.BasedonethernetPackage#getEthernetRX()
 * @model
 * @generated
 */
public interface EthernetRX extends SuperEthernetMessageType {
	/**
	 * Returns the value of the '<em><b>Source Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Port</em>' attribute.
	 * @see #setSourcePort(Integer)
	 * @see ucof.communication.basedonethernet.BasedonethernetPackage#getEthernetRX_SourcePort()
	 * @model dataType="ucof.common.edata.PortType"
	 * @generated
	 */
	Integer getSourcePort();

	/**
	 * Sets the value of the '{@link ucof.communication.basedonethernet.EthernetRX#getSourcePort <em>Source Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Port</em>' attribute.
	 * @see #getSourcePort()
	 * @generated
	 */
	void setSourcePort(Integer value);

	/**
	 * Returns the value of the '<em><b>Source IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source IP</em>' attribute.
	 * @see #setSourceIP(String)
	 * @see ucof.communication.basedonethernet.BasedonethernetPackage#getEthernetRX_SourceIP()
	 * @model dataType="ucof.common.edata.IPAddressType"
	 * @generated
	 */
	String getSourceIP();

	/**
	 * Sets the value of the '{@link ucof.communication.basedonethernet.EthernetRX#getSourceIP <em>Source IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source IP</em>' attribute.
	 * @see #getSourceIP()
	 * @generated
	 */
	void setSourceIP(String value);

} // EthernetRX
