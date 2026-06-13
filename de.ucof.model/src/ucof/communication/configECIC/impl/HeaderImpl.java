/**
 */
package ucof.communication.configECIC.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.common.enums.YesNoType;

import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.SuperTrackingType;

import ucof.common.etypes.impl.SuperIdentifierTypeImpl;

import ucof.communication.configECIC.ConfigECICPackage;
import ucof.communication.configECIC.Header;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.impl.HeaderImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link ucof.communication.configECIC.impl.HeaderImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link ucof.communication.configECIC.impl.HeaderImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link ucof.communication.configECIC.impl.HeaderImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link ucof.communication.configECIC.impl.HeaderImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link ucof.communication.configECIC.impl.HeaderImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link ucof.communication.configECIC.impl.HeaderImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link ucof.communication.configECIC.impl.HeaderImpl#getEnable <em>Enable</em>}</li>
 *   <li>{@link ucof.communication.configECIC.impl.HeaderImpl#getTransportTimestamp <em>Transport Timestamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HeaderImpl extends SuperIdentifierTypeImpl implements Header {
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
	 * The default value of the '{@link #getEnable() <em>Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnable()
	 * @generated
	 * @ordered
	 */
	protected static final YesNoType ENABLE_EDEFAULT = YesNoType.NOT_SET;

	/**
	 * The cached value of the '{@link #getEnable() <em>Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnable()
	 * @generated
	 * @ordered
	 */
	protected YesNoType enable = ENABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransportTimestamp() <em>Transport Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final YesNoType TRANSPORT_TIMESTAMP_EDEFAULT = YesNoType.NOT_SET;

	/**
	 * The cached value of the '{@link #getTransportTimestamp() <em>Transport Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportTimestamp()
	 * @generated
	 * @ordered
	 */
	protected YesNoType transportTimestamp = TRANSPORT_TIMESTAMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigECICPackage.Literals.HEADER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigECICPackage.HEADER__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigECICPackage.HEADER__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigECICPackage.HEADER__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigECICPackage.HEADER__TRACE_LINK, oldTraceLink, traceLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigECICPackage.HEADER__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigECICPackage.HEADER__CREATOR, oldCreator, creator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigECICPackage.HEADER__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YesNoType getEnable() {
		return enable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnable(YesNoType newEnable) {
		YesNoType oldEnable = enable;
		enable = newEnable == null ? ENABLE_EDEFAULT : newEnable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigECICPackage.HEADER__ENABLE, oldEnable, enable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YesNoType getTransportTimestamp() {
		return transportTimestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportTimestamp(YesNoType newTransportTimestamp) {
		YesNoType oldTransportTimestamp = transportTimestamp;
		transportTimestamp = newTransportTimestamp == null ? TRANSPORT_TIMESTAMP_EDEFAULT : newTransportTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigECICPackage.HEADER__TRANSPORT_TIMESTAMP, oldTransportTimestamp, transportTimestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigECICPackage.HEADER__DOCUMENTATION:
				return getDocumentation();
			case ConfigECICPackage.HEADER__MODIFIED:
				return getModified();
			case ConfigECICPackage.HEADER__MODIFIER:
				return getModifier();
			case ConfigECICPackage.HEADER__TRACE_LINK:
				return getTraceLink();
			case ConfigECICPackage.HEADER__CREATED:
				return getCreated();
			case ConfigECICPackage.HEADER__CREATOR:
				return getCreator();
			case ConfigECICPackage.HEADER__VERSION:
				return getVersion();
			case ConfigECICPackage.HEADER__ENABLE:
				return getEnable();
			case ConfigECICPackage.HEADER__TRANSPORT_TIMESTAMP:
				return getTransportTimestamp();
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
			case ConfigECICPackage.HEADER__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case ConfigECICPackage.HEADER__MODIFIED:
				setModified((Date)newValue);
				return;
			case ConfigECICPackage.HEADER__MODIFIER:
				setModifier((String)newValue);
				return;
			case ConfigECICPackage.HEADER__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case ConfigECICPackage.HEADER__CREATED:
				setCreated((Date)newValue);
				return;
			case ConfigECICPackage.HEADER__CREATOR:
				setCreator((String)newValue);
				return;
			case ConfigECICPackage.HEADER__VERSION:
				setVersion((Float)newValue);
				return;
			case ConfigECICPackage.HEADER__ENABLE:
				setEnable((YesNoType)newValue);
				return;
			case ConfigECICPackage.HEADER__TRANSPORT_TIMESTAMP:
				setTransportTimestamp((YesNoType)newValue);
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
			case ConfigECICPackage.HEADER__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case ConfigECICPackage.HEADER__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case ConfigECICPackage.HEADER__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case ConfigECICPackage.HEADER__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case ConfigECICPackage.HEADER__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case ConfigECICPackage.HEADER__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case ConfigECICPackage.HEADER__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ConfigECICPackage.HEADER__ENABLE:
				setEnable(ENABLE_EDEFAULT);
				return;
			case ConfigECICPackage.HEADER__TRANSPORT_TIMESTAMP:
				setTransportTimestamp(TRANSPORT_TIMESTAMP_EDEFAULT);
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
			case ConfigECICPackage.HEADER__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case ConfigECICPackage.HEADER__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case ConfigECICPackage.HEADER__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case ConfigECICPackage.HEADER__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case ConfigECICPackage.HEADER__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case ConfigECICPackage.HEADER__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case ConfigECICPackage.HEADER__VERSION:
				return version != VERSION_EDEFAULT;
			case ConfigECICPackage.HEADER__ENABLE:
				return enable != ENABLE_EDEFAULT;
			case ConfigECICPackage.HEADER__TRANSPORT_TIMESTAMP:
				return transportTimestamp != TRANSPORT_TIMESTAMP_EDEFAULT;
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
				case ConfigECICPackage.HEADER__DOCUMENTATION: return EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;
				case ConfigECICPackage.HEADER__MODIFIED: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;
				case ConfigECICPackage.HEADER__MODIFIER: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;
				case ConfigECICPackage.HEADER__TRACE_LINK: return EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;
				case ConfigECICPackage.HEADER__CREATED: return EtypesPackage.SUPER_TRACKING_TYPE__CREATED;
				case ConfigECICPackage.HEADER__CREATOR: return EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;
				case ConfigECICPackage.HEADER__VERSION: return EtypesPackage.SUPER_TRACKING_TYPE__VERSION;
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
				case EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION: return ConfigECICPackage.HEADER__DOCUMENTATION;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED: return ConfigECICPackage.HEADER__MODIFIED;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER: return ConfigECICPackage.HEADER__MODIFIER;
				case EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK: return ConfigECICPackage.HEADER__TRACE_LINK;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATED: return ConfigECICPackage.HEADER__CREATED;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATOR: return ConfigECICPackage.HEADER__CREATOR;
				case EtypesPackage.SUPER_TRACKING_TYPE__VERSION: return ConfigECICPackage.HEADER__VERSION;
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
		result.append(", enable: ");
		result.append(enable);
		result.append(", transportTimestamp: ");
		result.append(transportTimestamp);
		result.append(')');
		return result.toString();
	}

} //HeaderImpl
