/**
 */
package ucof.assignments.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.assignments.AssignmentsPackage;
import ucof.assignments.UDPSocketExtension;

import ucof.common.enums.SingleDirectionType;

import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.SuperTrackingType;

import ucof.common.etypes.impl.SuperIdentifierTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UDP Socket Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.assignments.impl.UDPSocketExtensionImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link ucof.assignments.impl.UDPSocketExtensionImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link ucof.assignments.impl.UDPSocketExtensionImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link ucof.assignments.impl.UDPSocketExtensionImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link ucof.assignments.impl.UDPSocketExtensionImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link ucof.assignments.impl.UDPSocketExtensionImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link ucof.assignments.impl.UDPSocketExtensionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link ucof.assignments.impl.UDPSocketExtensionImpl#getPortSelection <em>Port Selection</em>}</li>
 *   <li>{@link ucof.assignments.impl.UDPSocketExtensionImpl#getIpAdress <em>Ip Adress</em>}</li>
 *   <li>{@link ucof.assignments.impl.UDPSocketExtensionImpl#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UDPSocketExtensionImpl extends SuperIdentifierTypeImpl implements UDPSocketExtension {
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
	 * The default value of the '{@link #getPortSelection() <em>Port Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortSelection()
	 * @generated
	 * @ordered
	 */
	protected static final SingleDirectionType PORT_SELECTION_EDEFAULT = SingleDirectionType.NOT_SET;

	/**
	 * The cached value of the '{@link #getPortSelection() <em>Port Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortSelection()
	 * @generated
	 * @ordered
	 */
	protected SingleDirectionType portSelection = PORT_SELECTION_EDEFAULT;

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
	protected UDPSocketExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssignmentsPackage.Literals.UDP_SOCKET_EXTENSION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssignmentsPackage.UDP_SOCKET_EXTENSION__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssignmentsPackage.UDP_SOCKET_EXTENSION__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssignmentsPackage.UDP_SOCKET_EXTENSION__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssignmentsPackage.UDP_SOCKET_EXTENSION__TRACE_LINK, oldTraceLink, traceLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssignmentsPackage.UDP_SOCKET_EXTENSION__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssignmentsPackage.UDP_SOCKET_EXTENSION__CREATOR, oldCreator, creator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssignmentsPackage.UDP_SOCKET_EXTENSION__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleDirectionType getPortSelection() {
		return portSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortSelection(SingleDirectionType newPortSelection) {
		SingleDirectionType oldPortSelection = portSelection;
		portSelection = newPortSelection == null ? PORT_SELECTION_EDEFAULT : newPortSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssignmentsPackage.UDP_SOCKET_EXTENSION__PORT_SELECTION, oldPortSelection, portSelection));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssignmentsPackage.UDP_SOCKET_EXTENSION__IP_ADRESS, oldIpAdress, ipAdress));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssignmentsPackage.UDP_SOCKET_EXTENSION__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssignmentsPackage.UDP_SOCKET_EXTENSION__DOCUMENTATION:
				return getDocumentation();
			case AssignmentsPackage.UDP_SOCKET_EXTENSION__MODIFIED:
				return getModified();
			case AssignmentsPackage.UDP_SOCKET_EXTENSION__MODIFIER:
				return getModifier();
			case AssignmentsPackage.UDP_SOCKET_EXTENSION__TRACE_LINK:
				return getTraceLink();
			case AssignmentsPackage.UDP_SOCKET_EXTENSION__CREATED:
				return getCreated();
			case AssignmentsPackage.UDP_SOCKET_EXTENSION__CREATOR:
				return getCreator();
			case AssignmentsPackage.UDP_SOCKET_EXTENSION__VERSION:
				return getVersion();
			case AssignmentsPackage.UDP_SOCKET_EXTENSION__PORT_SELECTION:
				return getPortSelection();
			case AssignmentsPackage.UDP_SOCKET_EXTENSION__IP_ADRESS:
				return getIpAdress();
			case AssignmentsPackage.UDP_SOCKET_EXTENSION__PORT:
				return getPort();
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
			case AssignmentsPackage.UDP_SOCKET_EXTENSION__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case AssignmentsPackage.UDP_SOCKET_EXTENSION__MODIFIED:
				setModified((Date)newValue);
				return;
			case AssignmentsPackage.UDP_SOCKET_EXTENSION__MODIFIER:
				setModifier((String)newValue);
				return;
			case AssignmentsPackage.UDP_SOCKET_EXTENSION__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case AssignmentsPackage.UDP_SOCKET_EXTENSION__CREATED:
				setCreated((Date)newValue);
				return;
			case AssignmentsPackage.UDP_SOCKET_EXTENSION__CREATOR:
				setCreator((String)newValue);
				return;
			case AssignmentsPackage.UDP_SOCKET_EXTENSION__VERSION:
				setVersion((Float)newValue);
				return;
			case AssignmentsPackage.UDP_SOCKET_EXTENSION__PORT_SELECTION:
				setPortSelection((SingleDirectionType)newValue);
				return;
			case AssignmentsPackage.UDP_SOCKET_EXTENSION__IP_ADRESS:
				setIpAdress((String)newValue);
				return;
			case AssignmentsPackage.UDP_SOCKET_EXTENSION__PORT:
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
			case AssignmentsPackage.UDP_SOCKET_EXTENSION__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case AssignmentsPackage.UDP_SOCKET_EXTENSION__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case AssignmentsPackage.UDP_SOCKET_EXTENSION__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case AssignmentsPackage.UDP_SOCKET_EXTENSION__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case AssignmentsPackage.UDP_SOCKET_EXTENSION__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case AssignmentsPackage.UDP_SOCKET_EXTENSION__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case AssignmentsPackage.UDP_SOCKET_EXTENSION__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case AssignmentsPackage.UDP_SOCKET_EXTENSION__PORT_SELECTION:
				setPortSelection(PORT_SELECTION_EDEFAULT);
				return;
			case AssignmentsPackage.UDP_SOCKET_EXTENSION__IP_ADRESS:
				setIpAdress(IP_ADRESS_EDEFAULT);
				return;
			case AssignmentsPackage.UDP_SOCKET_EXTENSION__PORT:
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
			case AssignmentsPackage.UDP_SOCKET_EXTENSION__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case AssignmentsPackage.UDP_SOCKET_EXTENSION__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case AssignmentsPackage.UDP_SOCKET_EXTENSION__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case AssignmentsPackage.UDP_SOCKET_EXTENSION__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case AssignmentsPackage.UDP_SOCKET_EXTENSION__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case AssignmentsPackage.UDP_SOCKET_EXTENSION__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case AssignmentsPackage.UDP_SOCKET_EXTENSION__VERSION:
				return version != VERSION_EDEFAULT;
			case AssignmentsPackage.UDP_SOCKET_EXTENSION__PORT_SELECTION:
				return portSelection != PORT_SELECTION_EDEFAULT;
			case AssignmentsPackage.UDP_SOCKET_EXTENSION__IP_ADRESS:
				return IP_ADRESS_EDEFAULT == null ? ipAdress != null : !IP_ADRESS_EDEFAULT.equals(ipAdress);
			case AssignmentsPackage.UDP_SOCKET_EXTENSION__PORT:
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
				case AssignmentsPackage.UDP_SOCKET_EXTENSION__DOCUMENTATION: return EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;
				case AssignmentsPackage.UDP_SOCKET_EXTENSION__MODIFIED: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;
				case AssignmentsPackage.UDP_SOCKET_EXTENSION__MODIFIER: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;
				case AssignmentsPackage.UDP_SOCKET_EXTENSION__TRACE_LINK: return EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;
				case AssignmentsPackage.UDP_SOCKET_EXTENSION__CREATED: return EtypesPackage.SUPER_TRACKING_TYPE__CREATED;
				case AssignmentsPackage.UDP_SOCKET_EXTENSION__CREATOR: return EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;
				case AssignmentsPackage.UDP_SOCKET_EXTENSION__VERSION: return EtypesPackage.SUPER_TRACKING_TYPE__VERSION;
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
				case EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION: return AssignmentsPackage.UDP_SOCKET_EXTENSION__DOCUMENTATION;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED: return AssignmentsPackage.UDP_SOCKET_EXTENSION__MODIFIED;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER: return AssignmentsPackage.UDP_SOCKET_EXTENSION__MODIFIER;
				case EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK: return AssignmentsPackage.UDP_SOCKET_EXTENSION__TRACE_LINK;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATED: return AssignmentsPackage.UDP_SOCKET_EXTENSION__CREATED;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATOR: return AssignmentsPackage.UDP_SOCKET_EXTENSION__CREATOR;
				case EtypesPackage.SUPER_TRACKING_TYPE__VERSION: return AssignmentsPackage.UDP_SOCKET_EXTENSION__VERSION;
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
		result.append(", portSelection: ");
		result.append(portSelection);
		result.append(", ipAdress: ");
		result.append(ipAdress);
		result.append(", port: ");
		result.append(port);
		result.append(')');
		return result.toString();
	}

} //UDPSocketExtensionImpl
