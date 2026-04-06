/**
 */
package ucof.communication.basedonethernet;

import ucof.communication.SuperCommunicationInterfaceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ethernet Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.basedonethernet.EthernetPort#getIPAddress <em>IP Address</em>}</li>
 *   <li>{@link ucof.communication.basedonethernet.EthernetPort#getSubnetMask <em>Subnet Mask</em>}</li>
 * </ul>
 *
 * @see ucof.communication.basedonethernet.BasedonethernetPackage#getEthernetPort()
 * @model
 * @generated
 */
public interface EthernetPort extends SuperCommunicationInterfaceType {
	/**
	 * Returns the value of the '<em><b>IP Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IP Address</em>' attribute.
	 * @see #setIPAddress(String)
	 * @see ucof.communication.basedonethernet.BasedonethernetPackage#getEthernetPort_IPAddress()
	 * @model
	 * @generated
	 */
	String getIPAddress();

	/**
	 * Sets the value of the '{@link ucof.communication.basedonethernet.EthernetPort#getIPAddress <em>IP Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IP Address</em>' attribute.
	 * @see #getIPAddress()
	 * @generated
	 */
	void setIPAddress(String value);

	/**
	 * Returns the value of the '<em><b>Subnet Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnet Mask</em>' attribute.
	 * @see #setSubnetMask(String)
	 * @see ucof.communication.basedonethernet.BasedonethernetPackage#getEthernetPort_SubnetMask()
	 * @model
	 * @generated
	 */
	String getSubnetMask();

	/**
	 * Sets the value of the '{@link ucof.communication.basedonethernet.EthernetPort#getSubnetMask <em>Subnet Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subnet Mask</em>' attribute.
	 * @see #getSubnetMask()
	 * @generated
	 */
	void setSubnetMask(String value);

} // EthernetPort
