/**
 */
package ucof.communication.configECIC.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ucof.common.enums.PortDirectionType;

import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.SuperTrackingType;

import ucof.common.etypes.impl.SuperIdentifierTypeImpl;

import ucof.communication.configECIC.ConfigECICPackage;
import ucof.communication.configECIC.UDPSocket;
import ucof.communication.configECIC.srcDirectionExtension;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UDP Socket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.impl.UDPSocketImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link ucof.communication.configECIC.impl.UDPSocketImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link ucof.communication.configECIC.impl.UDPSocketImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link ucof.communication.configECIC.impl.UDPSocketImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link ucof.communication.configECIC.impl.UDPSocketImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link ucof.communication.configECIC.impl.UDPSocketImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link ucof.communication.configECIC.impl.UDPSocketImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link ucof.communication.configECIC.impl.UDPSocketImpl#getMulticastInterfaceIP <em>Multicast Interface IP</em>}</li>
 *   <li>{@link ucof.communication.configECIC.impl.UDPSocketImpl#getMulticastTTL <em>Multicast TTL</em>}</li>
 *   <li>{@link ucof.communication.configECIC.impl.UDPSocketImpl#getSrcDirectionExtension <em>Src Direction Extension</em>}</li>
 *   <li>{@link ucof.communication.configECIC.impl.UDPSocketImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link ucof.communication.configECIC.impl.UDPSocketImpl#getIpAdress <em>Ip Adress</em>}</li>
 *   <li>{@link ucof.communication.configECIC.impl.UDPSocketImpl#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UDPSocketImpl extends SuperIdentifierTypeImpl implements UDPSocket {
	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected static final Date MODIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected Date modified = MODIFIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getModifier() <em>Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected static final String MODIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModifier() <em>Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected String modifier = MODIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTraceLink() <em>Trace Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceLink()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACE_LINK_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTraceLink() <em>Trace Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceLink()
	 * @generated
	 * @ordered
	 */
	protected String traceLink = TRACE_LINK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected Date created = CREATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreator() <em>Creator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreator()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreator() <em>Creator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreator()
	 * @generated
	 * @ordered
	 */
	protected String creator = CREATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final float VERSION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected float version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMulticastInterfaceIP() <em>Multicast Interface IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMulticastInterfaceIP()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTICAST_INTERFACE_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMulticastInterfaceIP() <em>Multicast Interface IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMulticastInterfaceIP()
	 * @generated
	 * @ordered
	 */
	protected String multicastInterfaceIP = MULTICAST_INTERFACE_IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMulticastTTL() <em>Multicast TTL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMulticastTTL()
	 * @generated
	 * @ordered
	 */
	protected static final int MULTICAST_TTL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMulticastTTL() <em>Multicast TTL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMulticastTTL()
	 * @generated
	 * @ordered
	 */
	protected int multicastTTL = MULTICAST_TTL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSrcDirectionExtension() <em>Src Direction Extension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcDirectionExtension()
	 * @generated
	 * @ordered
	 */
	protected EList<srcDirectionExtension> srcDirectionExtension;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final PortDirectionType DIRECTION_EDEFAULT = PortDirectionType.NOT_SET;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected PortDirectionType direction = DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIpAdress() <em>Ip Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpAdress()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_ADRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIpAdress() <em>Ip Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpAdress()
	 * @generated
	 * @ordered
	 */
	protected String ipAdress = IP_ADRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected Integer port = PORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UDPSocketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigECICPackage.Literals.UDP_SOCKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigECICPackage.UDP_SOCKET__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getModified() {
		return modified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModified(Date newModified) {
		Date oldModified = modified;
		modified = newModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigECICPackage.UDP_SOCKET__MODIFIED, oldModified, modified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModifier() {
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifier(String newModifier) {
		String oldModifier = modifier;
		modifier = newModifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigECICPackage.UDP_SOCKET__MODIFIER, oldModifier, modifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTraceLink() {
		return traceLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceLink(String newTraceLink) {
		String oldTraceLink = traceLink;
		traceLink = newTraceLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigECICPackage.UDP_SOCKET__TRACE_LINK, oldTraceLink, traceLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(Date newCreated) {
		Date oldCreated = created;
		created = newCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigECICPackage.UDP_SOCKET__CREATED, oldCreated, created));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreator() {
		return creator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreator(String newCreator) {
		String oldCreator = creator;
		creator = newCreator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigECICPackage.UDP_SOCKET__CREATOR, oldCreator, creator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(float newVersion) {
		float oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigECICPackage.UDP_SOCKET__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMulticastInterfaceIP() {
		return multicastInterfaceIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMulticastInterfaceIP(String newMulticastInterfaceIP) {
		String oldMulticastInterfaceIP = multicastInterfaceIP;
		multicastInterfaceIP = newMulticastInterfaceIP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigECICPackage.UDP_SOCKET__MULTICAST_INTERFACE_IP, oldMulticastInterfaceIP, multicastInterfaceIP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMulticastTTL() {
		return multicastTTL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMulticastTTL(int newMulticastTTL) {
		int oldMulticastTTL = multicastTTL;
		multicastTTL = newMulticastTTL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigECICPackage.UDP_SOCKET__MULTICAST_TTL, oldMulticastTTL, multicastTTL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<srcDirectionExtension> getSrcDirectionExtension() {
		if (srcDirectionExtension == null) {
			srcDirectionExtension = new EObjectContainmentEList<srcDirectionExtension>(srcDirectionExtension.class, this, ConfigECICPackage.UDP_SOCKET__SRC_DIRECTION_EXTENSION);
		}
		return srcDirectionExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortDirectionType getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(PortDirectionType newDirection) {
		PortDirectionType oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigECICPackage.UDP_SOCKET__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIpAdress() {
		return ipAdress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIpAdress(String newIpAdress) {
		String oldIpAdress = ipAdress;
		ipAdress = newIpAdress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigECICPackage.UDP_SOCKET__IP_ADRESS, oldIpAdress, ipAdress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(Integer newPort) {
		Integer oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigECICPackage.UDP_SOCKET__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigECICPackage.UDP_SOCKET__SRC_DIRECTION_EXTENSION:
				return ((InternalEList<?>)getSrcDirectionExtension()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigECICPackage.UDP_SOCKET__DOCUMENTATION:
				return getDocumentation();
			case ConfigECICPackage.UDP_SOCKET__MODIFIED:
				return getModified();
			case ConfigECICPackage.UDP_SOCKET__MODIFIER:
				return getModifier();
			case ConfigECICPackage.UDP_SOCKET__TRACE_LINK:
				return getTraceLink();
			case ConfigECICPackage.UDP_SOCKET__CREATED:
				return getCreated();
			case ConfigECICPackage.UDP_SOCKET__CREATOR:
				return getCreator();
			case ConfigECICPackage.UDP_SOCKET__VERSION:
				return getVersion();
			case ConfigECICPackage.UDP_SOCKET__MULTICAST_INTERFACE_IP:
				return getMulticastInterfaceIP();
			case ConfigECICPackage.UDP_SOCKET__MULTICAST_TTL:
				return getMulticastTTL();
			case ConfigECICPackage.UDP_SOCKET__SRC_DIRECTION_EXTENSION:
				return getSrcDirectionExtension();
			case ConfigECICPackage.UDP_SOCKET__DIRECTION:
				return getDirection();
			case ConfigECICPackage.UDP_SOCKET__IP_ADRESS:
				return getIpAdress();
			case ConfigECICPackage.UDP_SOCKET__PORT:
				return getPort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConfigECICPackage.UDP_SOCKET__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case ConfigECICPackage.UDP_SOCKET__MODIFIED:
				setModified((Date)newValue);
				return;
			case ConfigECICPackage.UDP_SOCKET__MODIFIER:
				setModifier((String)newValue);
				return;
			case ConfigECICPackage.UDP_SOCKET__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case ConfigECICPackage.UDP_SOCKET__CREATED:
				setCreated((Date)newValue);
				return;
			case ConfigECICPackage.UDP_SOCKET__CREATOR:
				setCreator((String)newValue);
				return;
			case ConfigECICPackage.UDP_SOCKET__VERSION:
				setVersion((Float)newValue);
				return;
			case ConfigECICPackage.UDP_SOCKET__MULTICAST_INTERFACE_IP:
				setMulticastInterfaceIP((String)newValue);
				return;
			case ConfigECICPackage.UDP_SOCKET__MULTICAST_TTL:
				setMulticastTTL((Integer)newValue);
				return;
			case ConfigECICPackage.UDP_SOCKET__SRC_DIRECTION_EXTENSION:
				getSrcDirectionExtension().clear();
				getSrcDirectionExtension().addAll((Collection<? extends srcDirectionExtension>)newValue);
				return;
			case ConfigECICPackage.UDP_SOCKET__DIRECTION:
				setDirection((PortDirectionType)newValue);
				return;
			case ConfigECICPackage.UDP_SOCKET__IP_ADRESS:
				setIpAdress((String)newValue);
				return;
			case ConfigECICPackage.UDP_SOCKET__PORT:
				setPort((Integer)newValue);
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
			case ConfigECICPackage.UDP_SOCKET__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case ConfigECICPackage.UDP_SOCKET__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case ConfigECICPackage.UDP_SOCKET__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case ConfigECICPackage.UDP_SOCKET__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case ConfigECICPackage.UDP_SOCKET__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case ConfigECICPackage.UDP_SOCKET__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case ConfigECICPackage.UDP_SOCKET__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ConfigECICPackage.UDP_SOCKET__MULTICAST_INTERFACE_IP:
				setMulticastInterfaceIP(MULTICAST_INTERFACE_IP_EDEFAULT);
				return;
			case ConfigECICPackage.UDP_SOCKET__MULTICAST_TTL:
				setMulticastTTL(MULTICAST_TTL_EDEFAULT);
				return;
			case ConfigECICPackage.UDP_SOCKET__SRC_DIRECTION_EXTENSION:
				getSrcDirectionExtension().clear();
				return;
			case ConfigECICPackage.UDP_SOCKET__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case ConfigECICPackage.UDP_SOCKET__IP_ADRESS:
				setIpAdress(IP_ADRESS_EDEFAULT);
				return;
			case ConfigECICPackage.UDP_SOCKET__PORT:
				setPort(PORT_EDEFAULT);
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
			case ConfigECICPackage.UDP_SOCKET__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case ConfigECICPackage.UDP_SOCKET__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case ConfigECICPackage.UDP_SOCKET__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case ConfigECICPackage.UDP_SOCKET__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case ConfigECICPackage.UDP_SOCKET__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case ConfigECICPackage.UDP_SOCKET__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case ConfigECICPackage.UDP_SOCKET__VERSION:
				return version != VERSION_EDEFAULT;
			case ConfigECICPackage.UDP_SOCKET__MULTICAST_INTERFACE_IP:
				return MULTICAST_INTERFACE_IP_EDEFAULT == null ? multicastInterfaceIP != null : !MULTICAST_INTERFACE_IP_EDEFAULT.equals(multicastInterfaceIP);
			case ConfigECICPackage.UDP_SOCKET__MULTICAST_TTL:
				return multicastTTL != MULTICAST_TTL_EDEFAULT;
			case ConfigECICPackage.UDP_SOCKET__SRC_DIRECTION_EXTENSION:
				return srcDirectionExtension != null && !srcDirectionExtension.isEmpty();
			case ConfigECICPackage.UDP_SOCKET__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case ConfigECICPackage.UDP_SOCKET__IP_ADRESS:
				return IP_ADRESS_EDEFAULT == null ? ipAdress != null : !IP_ADRESS_EDEFAULT.equals(ipAdress);
			case ConfigECICPackage.UDP_SOCKET__PORT:
				return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SuperTrackingType.class) {
			switch (derivedFeatureID) {
				case ConfigECICPackage.UDP_SOCKET__DOCUMENTATION: return EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;
				case ConfigECICPackage.UDP_SOCKET__MODIFIED: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;
				case ConfigECICPackage.UDP_SOCKET__MODIFIER: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;
				case ConfigECICPackage.UDP_SOCKET__TRACE_LINK: return EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;
				case ConfigECICPackage.UDP_SOCKET__CREATED: return EtypesPackage.SUPER_TRACKING_TYPE__CREATED;
				case ConfigECICPackage.UDP_SOCKET__CREATOR: return EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;
				case ConfigECICPackage.UDP_SOCKET__VERSION: return EtypesPackage.SUPER_TRACKING_TYPE__VERSION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SuperTrackingType.class) {
			switch (baseFeatureID) {
				case EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION: return ConfigECICPackage.UDP_SOCKET__DOCUMENTATION;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED: return ConfigECICPackage.UDP_SOCKET__MODIFIED;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER: return ConfigECICPackage.UDP_SOCKET__MODIFIER;
				case EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK: return ConfigECICPackage.UDP_SOCKET__TRACE_LINK;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATED: return ConfigECICPackage.UDP_SOCKET__CREATED;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATOR: return ConfigECICPackage.UDP_SOCKET__CREATOR;
				case EtypesPackage.SUPER_TRACKING_TYPE__VERSION: return ConfigECICPackage.UDP_SOCKET__VERSION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (documentation: ");
		result.append(documentation);
		result.append(", modified: ");
		result.append(modified);
		result.append(", modifier: ");
		result.append(modifier);
		result.append(", traceLink: ");
		result.append(traceLink);
		result.append(", created: ");
		result.append(created);
		result.append(", creator: ");
		result.append(creator);
		result.append(", version: ");
		result.append(version);
		result.append(", multicastInterfaceIP: ");
		result.append(multicastInterfaceIP);
		result.append(", multicastTTL: ");
		result.append(multicastTTL);
		result.append(", direction: ");
		result.append(direction);
		result.append(", ipAdress: ");
		result.append(ipAdress);
		result.append(", port: ");
		result.append(port);
		result.append(')');
		return result.toString();
	}

} //UDPSocketImpl
