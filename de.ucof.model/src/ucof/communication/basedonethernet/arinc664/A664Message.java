/**
 */
package ucof.communication.basedonethernet.arinc664;

import ucof.communication.SuperMessageType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>A664 Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.A664Message#getDestinationMAC <em>Destination MAC</em>}</li>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.A664Message#getSourceMAC <em>Source MAC</em>}</li>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.A664Message#getEtherType <em>Ether Type</em>}</li>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.A664Message#getSourceIP <em>Source IP</em>}</li>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.A664Message#getDestinationIP <em>Destination IP</em>}</li>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.A664Message#getDestinationPort <em>Destination Port</em>}</li>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.A664Message#getSourcePort <em>Source Port</em>}</li>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.A664Message#getTTL <em>TTL</em>}</li>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.A664Message#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.A664Message#getEthernetIdentification <em>Ethernet Identification</em>}</li>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.A664Message#getFlagsAndFragmentOffset <em>Flags And Fragment Offset</em>}</li>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.A664Message#getVersionAndIHL <em>Version And IHL</em>}</li>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.A664Message#getTypeOfService <em>Type Of Service</em>}</li>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.A664Message#getVirtualLink <em>Virtual Link</em>}</li>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.A664Message#getVirtualLinkOffset <em>Virtual Link Offset</em>}</li>
 * </ul>
 *
 * @see ucof.communication.basedonethernet.arinc664.Arinc664Package#getA664Message()
 * @model
 * @generated
 */
public interface A664Message extends SuperMessageType {
	/**
	 * Returns the value of the '<em><b>Destination MAC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination MAC</em>' attribute.
	 * @see #setDestinationMAC(String)
	 * @see ucof.communication.basedonethernet.arinc664.Arinc664Package#getA664Message_DestinationMAC()
	 * @model dataType="ucof.common.edata.MACAddressType"
	 * @generated
	 */
	String getDestinationMAC();

	/**
	 * Sets the value of the '{@link ucof.communication.basedonethernet.arinc664.A664Message#getDestinationMAC <em>Destination MAC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination MAC</em>' attribute.
	 * @see #getDestinationMAC()
	 * @generated
	 */
	void setDestinationMAC(String value);

	/**
	 * Returns the value of the '<em><b>Source MAC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source MAC</em>' attribute.
	 * @see #setSourceMAC(String)
	 * @see ucof.communication.basedonethernet.arinc664.Arinc664Package#getA664Message_SourceMAC()
	 * @model dataType="ucof.common.edata.MACAddressType"
	 * @generated
	 */
	String getSourceMAC();

	/**
	 * Sets the value of the '{@link ucof.communication.basedonethernet.arinc664.A664Message#getSourceMAC <em>Source MAC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source MAC</em>' attribute.
	 * @see #getSourceMAC()
	 * @generated
	 */
	void setSourceMAC(String value);

	/**
	 * Returns the value of the '<em><b>Ether Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ethertype defines the IPv4 or alternatives
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ether Type</em>' attribute.
	 * @see #setEtherType(String)
	 * @see ucof.communication.basedonethernet.arinc664.Arinc664Package#getA664Message_EtherType()
	 * @model dataType="ucof.common.edata.EtherType"
	 * @generated
	 */
	String getEtherType();

	/**
	 * Sets the value of the '{@link ucof.communication.basedonethernet.arinc664.A664Message#getEtherType <em>Ether Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ether Type</em>' attribute.
	 * @see #getEtherType()
	 * @generated
	 */
	void setEtherType(String value);

	/**
	 * Returns the value of the '<em><b>Source IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source IP</em>' attribute.
	 * @see #setSourceIP(String)
	 * @see ucof.communication.basedonethernet.arinc664.Arinc664Package#getA664Message_SourceIP()
	 * @model dataType="ucof.common.edata.IPAddressType"
	 * @generated
	 */
	String getSourceIP();

	/**
	 * Sets the value of the '{@link ucof.communication.basedonethernet.arinc664.A664Message#getSourceIP <em>Source IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source IP</em>' attribute.
	 * @see #getSourceIP()
	 * @generated
	 */
	void setSourceIP(String value);

	/**
	 * Returns the value of the '<em><b>Destination IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination IP</em>' attribute.
	 * @see #setDestinationIP(String)
	 * @see ucof.communication.basedonethernet.arinc664.Arinc664Package#getA664Message_DestinationIP()
	 * @model dataType="ucof.common.edata.IPAddressType"
	 * @generated
	 */
	String getDestinationIP();

	/**
	 * Sets the value of the '{@link ucof.communication.basedonethernet.arinc664.A664Message#getDestinationIP <em>Destination IP</em>}' attribute.
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
	 * @see ucof.communication.basedonethernet.arinc664.Arinc664Package#getA664Message_DestinationPort()
	 * @model dataType="ucof.common.edata.PortType"
	 * @generated
	 */
	Integer getDestinationPort();

	/**
	 * Sets the value of the '{@link ucof.communication.basedonethernet.arinc664.A664Message#getDestinationPort <em>Destination Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Port</em>' attribute.
	 * @see #getDestinationPort()
	 * @generated
	 */
	void setDestinationPort(Integer value);

	/**
	 * Returns the value of the '<em><b>Source Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Port</em>' attribute.
	 * @see #setSourcePort(Integer)
	 * @see ucof.communication.basedonethernet.arinc664.Arinc664Package#getA664Message_SourcePort()
	 * @model dataType="ucof.common.edata.PortType"
	 * @generated
	 */
	Integer getSourcePort();

	/**
	 * Sets the value of the '{@link ucof.communication.basedonethernet.arinc664.A664Message#getSourcePort <em>Source Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Port</em>' attribute.
	 * @see #getSourcePort()
	 * @generated
	 */
	void setSourcePort(Integer value);

	/**
	 * Returns the value of the '<em><b>TTL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TIme-to-Live, i.e. number of "hops" before invalidation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>TTL</em>' attribute.
	 * @see #setTTL(Integer)
	 * @see ucof.communication.basedonethernet.arinc664.Arinc664Package#getA664Message_TTL()
	 * @model dataType="ucof.common.edata.PositiveIntType"
	 * @generated
	 */
	Integer getTTL();

	/**
	 * Sets the value of the '{@link ucof.communication.basedonethernet.arinc664.A664Message#getTTL <em>TTL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TTL</em>' attribute.
	 * @see #getTTL()
	 * @generated
	 */
	void setTTL(Integer value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the base-line protocol (e.g. UDP with 17)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see #setProtocol(Integer)
	 * @see ucof.communication.basedonethernet.arinc664.Arinc664Package#getA664Message_Protocol()
	 * @model dataType="ucof.common.edata.PositiveIntType"
	 * @generated
	 */
	Integer getProtocol();

	/**
	 * Sets the value of the '{@link ucof.communication.basedonethernet.arinc664.A664Message#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(Integer value);

	/**
	 * Returns the value of the '<em><b>Ethernet Identification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IP header field for datagram tracking
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ethernet Identification</em>' attribute.
	 * @see #setEthernetIdentification(Integer)
	 * @see ucof.communication.basedonethernet.arinc664.Arinc664Package#getA664Message_EthernetIdentification()
	 * @model dataType="ucof.common.edata.PositiveIntType"
	 * @generated
	 */
	Integer getEthernetIdentification();

	/**
	 * Sets the value of the '{@link ucof.communication.basedonethernet.arinc664.A664Message#getEthernetIdentification <em>Ethernet Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ethernet Identification</em>' attribute.
	 * @see #getEthernetIdentification()
	 * @generated
	 */
	void setEthernetIdentification(Integer value);

	/**
	 * Returns the value of the '<em><b>Flags And Fragment Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For fragmentation in ethernet communication
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flags And Fragment Offset</em>' attribute.
	 * @see #setFlagsAndFragmentOffset(Integer)
	 * @see ucof.communication.basedonethernet.arinc664.Arinc664Package#getA664Message_FlagsAndFragmentOffset()
	 * @model dataType="ucof.common.edata.PositiveIntType"
	 * @generated
	 */
	Integer getFlagsAndFragmentOffset();

	/**
	 * Sets the value of the '{@link ucof.communication.basedonethernet.arinc664.A664Message#getFlagsAndFragmentOffset <em>Flags And Fragment Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flags And Fragment Offset</em>' attribute.
	 * @see #getFlagsAndFragmentOffset()
	 * @generated
	 */
	void setFlagsAndFragmentOffset(Integer value);

	/**
	 * Returns the value of the '<em><b>Version And IHL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IP version (4) and header length
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version And IHL</em>' attribute.
	 * @see #setVersionAndIHL(Integer)
	 * @see ucof.communication.basedonethernet.arinc664.Arinc664Package#getA664Message_VersionAndIHL()
	 * @model dataType="ucof.common.edata.PositiveIntType"
	 * @generated
	 */
	Integer getVersionAndIHL();

	/**
	 * Sets the value of the '{@link ucof.communication.basedonethernet.arinc664.A664Message#getVersionAndIHL <em>Version And IHL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version And IHL</em>' attribute.
	 * @see #getVersionAndIHL()
	 * @generated
	 */
	void setVersionAndIHL(Integer value);

	/**
	 * Returns the value of the '<em><b>Type Of Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IP QoS hint field
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Of Service</em>' attribute.
	 * @see #setTypeOfService(Integer)
	 * @see ucof.communication.basedonethernet.arinc664.Arinc664Package#getA664Message_TypeOfService()
	 * @model dataType="ucof.common.edata.PositiveIntType"
	 * @generated
	 */
	Integer getTypeOfService();

	/**
	 * Sets the value of the '{@link ucof.communication.basedonethernet.arinc664.A664Message#getTypeOfService <em>Type Of Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Of Service</em>' attribute.
	 * @see #getTypeOfService()
	 * @generated
	 */
	void setTypeOfService(Integer value);

	/**
	 * Returns the value of the '<em><b>Virtual Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Virtual Link ID
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Virtual Link</em>' attribute.
	 * @see #setVirtualLink(Integer)
	 * @see ucof.communication.basedonethernet.arinc664.Arinc664Package#getA664Message_VirtualLink()
	 * @model dataType="ucof.common.edata.PositiveIntType"
	 * @generated
	 */
	Integer getVirtualLink();

	/**
	 * Sets the value of the '{@link ucof.communication.basedonethernet.arinc664.A664Message#getVirtualLink <em>Virtual Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Link</em>' attribute.
	 * @see #getVirtualLink()
	 * @generated
	 */
	void setVirtualLink(Integer value);

	/**
	 * Returns the value of the '<em><b>Virtual Link Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Offset of virtual link id into payload
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Virtual Link Offset</em>' attribute.
	 * @see #setVirtualLinkOffset(Integer)
	 * @see ucof.communication.basedonethernet.arinc664.Arinc664Package#getA664Message_VirtualLinkOffset()
	 * @model dataType="ucof.common.edata.PositiveIntType"
	 * @generated
	 */
	Integer getVirtualLinkOffset();

	/**
	 * Sets the value of the '{@link ucof.communication.basedonethernet.arinc664.A664Message#getVirtualLinkOffset <em>Virtual Link Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Link Offset</em>' attribute.
	 * @see #getVirtualLinkOffset()
	 * @generated
	 */
	void setVirtualLinkOffset(Integer value);

} // A664Message
