/**
 */
package ucof.communication.basedonethernet.arinc664.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.communication.basedonethernet.arinc664.A664Message;
import ucof.communication.basedonethernet.arinc664.Arinc664Package;

import ucof.communication.impl.SuperMessageTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>A664 Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.impl.A664MessageImpl#getDestinationMAC <em>Destination MAC</em>}</li>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.impl.A664MessageImpl#getSourceMAC <em>Source MAC</em>}</li>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.impl.A664MessageImpl#getEtherType <em>Ether Type</em>}</li>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.impl.A664MessageImpl#getSourceIP <em>Source IP</em>}</li>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.impl.A664MessageImpl#getDestinationIP <em>Destination IP</em>}</li>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.impl.A664MessageImpl#getDestinationPort <em>Destination Port</em>}</li>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.impl.A664MessageImpl#getSourcePort <em>Source Port</em>}</li>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.impl.A664MessageImpl#getTTL <em>TTL</em>}</li>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.impl.A664MessageImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.impl.A664MessageImpl#getEthernetIdentification <em>Ethernet Identification</em>}</li>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.impl.A664MessageImpl#getFlagsAndFragmentOffset <em>Flags And Fragment Offset</em>}</li>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.impl.A664MessageImpl#getVersionAndIHL <em>Version And IHL</em>}</li>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.impl.A664MessageImpl#getTypeOfService <em>Type Of Service</em>}</li>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.impl.A664MessageImpl#getVirtualLink <em>Virtual Link</em>}</li>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.impl.A664MessageImpl#getVirtualLinkOffset <em>Virtual Link Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class A664MessageImpl extends SuperMessageTypeImpl implements A664Message {
	/**
	 * The default value of the '{@link #getDestinationMAC() <em>Destination MAC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationMAC()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_MAC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestinationMAC() <em>Destination MAC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationMAC()
	 * @generated
	 * @ordered
	 */
	protected String destinationMAC = DESTINATION_MAC_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceMAC() <em>Source MAC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMAC()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_MAC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceMAC() <em>Source MAC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMAC()
	 * @generated
	 * @ordered
	 */
	protected String sourceMAC = SOURCE_MAC_EDEFAULT;

	/**
	 * The default value of the '{@link #getEtherType() <em>Ether Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtherType()
	 * @generated
	 * @ordered
	 */
	protected static final String ETHER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEtherType() <em>Ether Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtherType()
	 * @generated
	 * @ordered
	 */
	protected String etherType = ETHER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceIP() <em>Source IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceIP()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceIP() <em>Source IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceIP()
	 * @generated
	 * @ordered
	 */
	protected String sourceIP = SOURCE_IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestinationIP() <em>Destination IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationIP()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestinationIP() <em>Destination IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationIP()
	 * @generated
	 * @ordered
	 */
	protected String destinationIP = DESTINATION_IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestinationPort() <em>Destination Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationPort()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DESTINATION_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestinationPort() <em>Destination Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationPort()
	 * @generated
	 * @ordered
	 */
	protected Integer destinationPort = DESTINATION_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourcePort() <em>Source Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePort()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SOURCE_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourcePort() <em>Source Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePort()
	 * @generated
	 * @ordered
	 */
	protected Integer sourcePort = SOURCE_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTTL() <em>TTL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTTL()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TTL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTTL() <em>TTL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTTL()
	 * @generated
	 * @ordered
	 */
	protected Integer ttl = TTL_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected Integer protocol = PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getEthernetIdentification() <em>Ethernet Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEthernetIdentification()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ETHERNET_IDENTIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEthernetIdentification() <em>Ethernet Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEthernetIdentification()
	 * @generated
	 * @ordered
	 */
	protected Integer ethernetIdentification = ETHERNET_IDENTIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlagsAndFragmentOffset() <em>Flags And Fragment Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlagsAndFragmentOffset()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FLAGS_AND_FRAGMENT_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlagsAndFragmentOffset() <em>Flags And Fragment Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlagsAndFragmentOffset()
	 * @generated
	 * @ordered
	 */
	protected Integer flagsAndFragmentOffset = FLAGS_AND_FRAGMENT_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersionAndIHL() <em>Version And IHL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionAndIHL()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VERSION_AND_IHL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionAndIHL() <em>Version And IHL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionAndIHL()
	 * @generated
	 * @ordered
	 */
	protected Integer versionAndIHL = VERSION_AND_IHL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeOfService() <em>Type Of Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfService()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TYPE_OF_SERVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeOfService() <em>Type Of Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfService()
	 * @generated
	 * @ordered
	 */
	protected Integer typeOfService = TYPE_OF_SERVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVirtualLink() <em>Virtual Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualLink()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VIRTUAL_LINK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVirtualLink() <em>Virtual Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualLink()
	 * @generated
	 * @ordered
	 */
	protected Integer virtualLink = VIRTUAL_LINK_EDEFAULT;

	/**
	 * The default value of the '{@link #getVirtualLinkOffset() <em>Virtual Link Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualLinkOffset()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VIRTUAL_LINK_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVirtualLinkOffset() <em>Virtual Link Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualLinkOffset()
	 * @generated
	 * @ordered
	 */
	protected Integer virtualLinkOffset = VIRTUAL_LINK_OFFSET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected A664MessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Arinc664Package.Literals.A664_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestinationMAC() {
		return destinationMAC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationMAC(String newDestinationMAC) {
		String oldDestinationMAC = destinationMAC;
		destinationMAC = newDestinationMAC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Arinc664Package.A664_MESSAGE__DESTINATION_MAC, oldDestinationMAC, destinationMAC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceMAC() {
		return sourceMAC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceMAC(String newSourceMAC) {
		String oldSourceMAC = sourceMAC;
		sourceMAC = newSourceMAC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Arinc664Package.A664_MESSAGE__SOURCE_MAC, oldSourceMAC, sourceMAC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtherType() {
		return etherType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtherType(String newEtherType) {
		String oldEtherType = etherType;
		etherType = newEtherType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Arinc664Package.A664_MESSAGE__ETHER_TYPE, oldEtherType, etherType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceIP() {
		return sourceIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceIP(String newSourceIP) {
		String oldSourceIP = sourceIP;
		sourceIP = newSourceIP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Arinc664Package.A664_MESSAGE__SOURCE_IP, oldSourceIP, sourceIP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestinationIP() {
		return destinationIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationIP(String newDestinationIP) {
		String oldDestinationIP = destinationIP;
		destinationIP = newDestinationIP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Arinc664Package.A664_MESSAGE__DESTINATION_IP, oldDestinationIP, destinationIP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDestinationPort() {
		return destinationPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationPort(Integer newDestinationPort) {
		Integer oldDestinationPort = destinationPort;
		destinationPort = newDestinationPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Arinc664Package.A664_MESSAGE__DESTINATION_PORT, oldDestinationPort, destinationPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSourcePort() {
		return sourcePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcePort(Integer newSourcePort) {
		Integer oldSourcePort = sourcePort;
		sourcePort = newSourcePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Arinc664Package.A664_MESSAGE__SOURCE_PORT, oldSourcePort, sourcePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTTL() {
		return ttl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTTL(Integer newTTL) {
		Integer oldTTL = ttl;
		ttl = newTTL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Arinc664Package.A664_MESSAGE__TTL, oldTTL, ttl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(Integer newProtocol) {
		Integer oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Arinc664Package.A664_MESSAGE__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getEthernetIdentification() {
		return ethernetIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEthernetIdentification(Integer newEthernetIdentification) {
		Integer oldEthernetIdentification = ethernetIdentification;
		ethernetIdentification = newEthernetIdentification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Arinc664Package.A664_MESSAGE__ETHERNET_IDENTIFICATION, oldEthernetIdentification, ethernetIdentification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getFlagsAndFragmentOffset() {
		return flagsAndFragmentOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlagsAndFragmentOffset(Integer newFlagsAndFragmentOffset) {
		Integer oldFlagsAndFragmentOffset = flagsAndFragmentOffset;
		flagsAndFragmentOffset = newFlagsAndFragmentOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Arinc664Package.A664_MESSAGE__FLAGS_AND_FRAGMENT_OFFSET, oldFlagsAndFragmentOffset, flagsAndFragmentOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getVersionAndIHL() {
		return versionAndIHL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionAndIHL(Integer newVersionAndIHL) {
		Integer oldVersionAndIHL = versionAndIHL;
		versionAndIHL = newVersionAndIHL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Arinc664Package.A664_MESSAGE__VERSION_AND_IHL, oldVersionAndIHL, versionAndIHL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTypeOfService() {
		return typeOfService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeOfService(Integer newTypeOfService) {
		Integer oldTypeOfService = typeOfService;
		typeOfService = newTypeOfService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Arinc664Package.A664_MESSAGE__TYPE_OF_SERVICE, oldTypeOfService, typeOfService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getVirtualLink() {
		return virtualLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtualLink(Integer newVirtualLink) {
		Integer oldVirtualLink = virtualLink;
		virtualLink = newVirtualLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Arinc664Package.A664_MESSAGE__VIRTUAL_LINK, oldVirtualLink, virtualLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getVirtualLinkOffset() {
		return virtualLinkOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtualLinkOffset(Integer newVirtualLinkOffset) {
		Integer oldVirtualLinkOffset = virtualLinkOffset;
		virtualLinkOffset = newVirtualLinkOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Arinc664Package.A664_MESSAGE__VIRTUAL_LINK_OFFSET, oldVirtualLinkOffset, virtualLinkOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Arinc664Package.A664_MESSAGE__DESTINATION_MAC:
				return getDestinationMAC();
			case Arinc664Package.A664_MESSAGE__SOURCE_MAC:
				return getSourceMAC();
			case Arinc664Package.A664_MESSAGE__ETHER_TYPE:
				return getEtherType();
			case Arinc664Package.A664_MESSAGE__SOURCE_IP:
				return getSourceIP();
			case Arinc664Package.A664_MESSAGE__DESTINATION_IP:
				return getDestinationIP();
			case Arinc664Package.A664_MESSAGE__DESTINATION_PORT:
				return getDestinationPort();
			case Arinc664Package.A664_MESSAGE__SOURCE_PORT:
				return getSourcePort();
			case Arinc664Package.A664_MESSAGE__TTL:
				return getTTL();
			case Arinc664Package.A664_MESSAGE__PROTOCOL:
				return getProtocol();
			case Arinc664Package.A664_MESSAGE__ETHERNET_IDENTIFICATION:
				return getEthernetIdentification();
			case Arinc664Package.A664_MESSAGE__FLAGS_AND_FRAGMENT_OFFSET:
				return getFlagsAndFragmentOffset();
			case Arinc664Package.A664_MESSAGE__VERSION_AND_IHL:
				return getVersionAndIHL();
			case Arinc664Package.A664_MESSAGE__TYPE_OF_SERVICE:
				return getTypeOfService();
			case Arinc664Package.A664_MESSAGE__VIRTUAL_LINK:
				return getVirtualLink();
			case Arinc664Package.A664_MESSAGE__VIRTUAL_LINK_OFFSET:
				return getVirtualLinkOffset();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Arinc664Package.A664_MESSAGE__DESTINATION_MAC:
				setDestinationMAC((String)newValue);
				return;
			case Arinc664Package.A664_MESSAGE__SOURCE_MAC:
				setSourceMAC((String)newValue);
				return;
			case Arinc664Package.A664_MESSAGE__ETHER_TYPE:
				setEtherType((String)newValue);
				return;
			case Arinc664Package.A664_MESSAGE__SOURCE_IP:
				setSourceIP((String)newValue);
				return;
			case Arinc664Package.A664_MESSAGE__DESTINATION_IP:
				setDestinationIP((String)newValue);
				return;
			case Arinc664Package.A664_MESSAGE__DESTINATION_PORT:
				setDestinationPort((Integer)newValue);
				return;
			case Arinc664Package.A664_MESSAGE__SOURCE_PORT:
				setSourcePort((Integer)newValue);
				return;
			case Arinc664Package.A664_MESSAGE__TTL:
				setTTL((Integer)newValue);
				return;
			case Arinc664Package.A664_MESSAGE__PROTOCOL:
				setProtocol((Integer)newValue);
				return;
			case Arinc664Package.A664_MESSAGE__ETHERNET_IDENTIFICATION:
				setEthernetIdentification((Integer)newValue);
				return;
			case Arinc664Package.A664_MESSAGE__FLAGS_AND_FRAGMENT_OFFSET:
				setFlagsAndFragmentOffset((Integer)newValue);
				return;
			case Arinc664Package.A664_MESSAGE__VERSION_AND_IHL:
				setVersionAndIHL((Integer)newValue);
				return;
			case Arinc664Package.A664_MESSAGE__TYPE_OF_SERVICE:
				setTypeOfService((Integer)newValue);
				return;
			case Arinc664Package.A664_MESSAGE__VIRTUAL_LINK:
				setVirtualLink((Integer)newValue);
				return;
			case Arinc664Package.A664_MESSAGE__VIRTUAL_LINK_OFFSET:
				setVirtualLinkOffset((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Arinc664Package.A664_MESSAGE__DESTINATION_MAC:
				setDestinationMAC(DESTINATION_MAC_EDEFAULT);
				return;
			case Arinc664Package.A664_MESSAGE__SOURCE_MAC:
				setSourceMAC(SOURCE_MAC_EDEFAULT);
				return;
			case Arinc664Package.A664_MESSAGE__ETHER_TYPE:
				setEtherType(ETHER_TYPE_EDEFAULT);
				return;
			case Arinc664Package.A664_MESSAGE__SOURCE_IP:
				setSourceIP(SOURCE_IP_EDEFAULT);
				return;
			case Arinc664Package.A664_MESSAGE__DESTINATION_IP:
				setDestinationIP(DESTINATION_IP_EDEFAULT);
				return;
			case Arinc664Package.A664_MESSAGE__DESTINATION_PORT:
				setDestinationPort(DESTINATION_PORT_EDEFAULT);
				return;
			case Arinc664Package.A664_MESSAGE__SOURCE_PORT:
				setSourcePort(SOURCE_PORT_EDEFAULT);
				return;
			case Arinc664Package.A664_MESSAGE__TTL:
				setTTL(TTL_EDEFAULT);
				return;
			case Arinc664Package.A664_MESSAGE__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case Arinc664Package.A664_MESSAGE__ETHERNET_IDENTIFICATION:
				setEthernetIdentification(ETHERNET_IDENTIFICATION_EDEFAULT);
				return;
			case Arinc664Package.A664_MESSAGE__FLAGS_AND_FRAGMENT_OFFSET:
				setFlagsAndFragmentOffset(FLAGS_AND_FRAGMENT_OFFSET_EDEFAULT);
				return;
			case Arinc664Package.A664_MESSAGE__VERSION_AND_IHL:
				setVersionAndIHL(VERSION_AND_IHL_EDEFAULT);
				return;
			case Arinc664Package.A664_MESSAGE__TYPE_OF_SERVICE:
				setTypeOfService(TYPE_OF_SERVICE_EDEFAULT);
				return;
			case Arinc664Package.A664_MESSAGE__VIRTUAL_LINK:
				setVirtualLink(VIRTUAL_LINK_EDEFAULT);
				return;
			case Arinc664Package.A664_MESSAGE__VIRTUAL_LINK_OFFSET:
				setVirtualLinkOffset(VIRTUAL_LINK_OFFSET_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Arinc664Package.A664_MESSAGE__DESTINATION_MAC:
				return DESTINATION_MAC_EDEFAULT == null ? destinationMAC != null : !DESTINATION_MAC_EDEFAULT.equals(destinationMAC);
			case Arinc664Package.A664_MESSAGE__SOURCE_MAC:
				return SOURCE_MAC_EDEFAULT == null ? sourceMAC != null : !SOURCE_MAC_EDEFAULT.equals(sourceMAC);
			case Arinc664Package.A664_MESSAGE__ETHER_TYPE:
				return ETHER_TYPE_EDEFAULT == null ? etherType != null : !ETHER_TYPE_EDEFAULT.equals(etherType);
			case Arinc664Package.A664_MESSAGE__SOURCE_IP:
				return SOURCE_IP_EDEFAULT == null ? sourceIP != null : !SOURCE_IP_EDEFAULT.equals(sourceIP);
			case Arinc664Package.A664_MESSAGE__DESTINATION_IP:
				return DESTINATION_IP_EDEFAULT == null ? destinationIP != null : !DESTINATION_IP_EDEFAULT.equals(destinationIP);
			case Arinc664Package.A664_MESSAGE__DESTINATION_PORT:
				return DESTINATION_PORT_EDEFAULT == null ? destinationPort != null : !DESTINATION_PORT_EDEFAULT.equals(destinationPort);
			case Arinc664Package.A664_MESSAGE__SOURCE_PORT:
				return SOURCE_PORT_EDEFAULT == null ? sourcePort != null : !SOURCE_PORT_EDEFAULT.equals(sourcePort);
			case Arinc664Package.A664_MESSAGE__TTL:
				return TTL_EDEFAULT == null ? ttl != null : !TTL_EDEFAULT.equals(ttl);
			case Arinc664Package.A664_MESSAGE__PROTOCOL:
				return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
			case Arinc664Package.A664_MESSAGE__ETHERNET_IDENTIFICATION:
				return ETHERNET_IDENTIFICATION_EDEFAULT == null ? ethernetIdentification != null : !ETHERNET_IDENTIFICATION_EDEFAULT.equals(ethernetIdentification);
			case Arinc664Package.A664_MESSAGE__FLAGS_AND_FRAGMENT_OFFSET:
				return FLAGS_AND_FRAGMENT_OFFSET_EDEFAULT == null ? flagsAndFragmentOffset != null : !FLAGS_AND_FRAGMENT_OFFSET_EDEFAULT.equals(flagsAndFragmentOffset);
			case Arinc664Package.A664_MESSAGE__VERSION_AND_IHL:
				return VERSION_AND_IHL_EDEFAULT == null ? versionAndIHL != null : !VERSION_AND_IHL_EDEFAULT.equals(versionAndIHL);
			case Arinc664Package.A664_MESSAGE__TYPE_OF_SERVICE:
				return TYPE_OF_SERVICE_EDEFAULT == null ? typeOfService != null : !TYPE_OF_SERVICE_EDEFAULT.equals(typeOfService);
			case Arinc664Package.A664_MESSAGE__VIRTUAL_LINK:
				return VIRTUAL_LINK_EDEFAULT == null ? virtualLink != null : !VIRTUAL_LINK_EDEFAULT.equals(virtualLink);
			case Arinc664Package.A664_MESSAGE__VIRTUAL_LINK_OFFSET:
				return VIRTUAL_LINK_OFFSET_EDEFAULT == null ? virtualLinkOffset != null : !VIRTUAL_LINK_OFFSET_EDEFAULT.equals(virtualLinkOffset);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (destinationMAC: ");
		result.append(destinationMAC);
		result.append(", sourceMAC: ");
		result.append(sourceMAC);
		result.append(", etherType: ");
		result.append(etherType);
		result.append(", sourceIP: ");
		result.append(sourceIP);
		result.append(", destinationIP: ");
		result.append(destinationIP);
		result.append(", destinationPort: ");
		result.append(destinationPort);
		result.append(", sourcePort: ");
		result.append(sourcePort);
		result.append(", TTL: ");
		result.append(ttl);
		result.append(", Protocol: ");
		result.append(protocol);
		result.append(", ethernetIdentification: ");
		result.append(ethernetIdentification);
		result.append(", flagsAndFragmentOffset: ");
		result.append(flagsAndFragmentOffset);
		result.append(", versionAndIHL: ");
		result.append(versionAndIHL);
		result.append(", typeOfService: ");
		result.append(typeOfService);
		result.append(", virtualLink: ");
		result.append(virtualLink);
		result.append(", virtualLinkOffset: ");
		result.append(virtualLinkOffset);
		result.append(')');
		return result.toString();
	}

} //A664MessageImpl
