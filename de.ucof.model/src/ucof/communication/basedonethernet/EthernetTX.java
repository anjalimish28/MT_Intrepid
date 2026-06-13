/**
 */
package ucof.communication.basedonethernet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ethernet TX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.basedonethernet.EthernetTX#getDestinationIP <em>Destination IP</em>}</li>
 *   <li>{@link ucof.communication.basedonethernet.EthernetTX#getDestinationPort <em>Destination Port</em>}</li>
 * </ul>
 *
 * @see ucof.communication.basedonethernet.BasedonethernetPackage#getEthernetTX()
 * @model
 * @generated
 */
public interface EthernetTX extends SuperEthernetMessageType {
	/**
	 * Returns the value of the '<em><b>Destination IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination IP</em>' attribute.
	 * @see #setDestinationIP(String)
	 * @see ucof.communication.basedonethernet.BasedonethernetPackage#getEthernetTX_DestinationIP()
	 * @model dataType="ucof.common.edata.IPAddressType"
	 * @generated
	 */
	String getDestinationIP();

	/**
	 * Sets the value of the '{@link ucof.communication.basedonethernet.EthernetTX#getDestinationIP <em>Destination IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination IP</em>' attribute.
	 * @see #getDestinationIP()
	 * @generated
	 */
	void setDestinationIP(String value);

	/**
	 * Returns the value of the '<em><b>Destination Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Port</em>' attribute.
	 * @see #setDestinationPort(Integer)
	 * @see ucof.communication.basedonethernet.BasedonethernetPackage#getEthernetTX_DestinationPort()
	 * @model dataType="ucof.common.edata.PortType"
	 * @generated
	 */
	Integer getDestinationPort();

	/**
	 * Sets the value of the '{@link ucof.communication.basedonethernet.EthernetTX#getDestinationPort <em>Destination Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Port</em>' attribute.
	 * @see #getDestinationPort()
	 * @generated
	 */
	void setDestinationPort(Integer value);

} // EthernetTX
