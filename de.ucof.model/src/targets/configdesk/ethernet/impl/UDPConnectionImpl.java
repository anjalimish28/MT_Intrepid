/**
 */
package targets.configdesk.ethernet.impl;

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import targets.configdesk.ethernet.EthernetPackage;
import targets.configdesk.ethernet.UDPConnection;
import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.SuperTrackingType;
import ucof.common.etypes.impl.SuperIdentifierTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UDP Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.configdesk.ethernet.impl.UDPConnectionImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link targets.configdesk.ethernet.impl.UDPConnectionImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link targets.configdesk.ethernet.impl.UDPConnectionImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link targets.configdesk.ethernet.impl.UDPConnectionImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link targets.configdesk.ethernet.impl.UDPConnectionImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link targets.configdesk.ethernet.impl.UDPConnectionImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link targets.configdesk.ethernet.impl.UDPConnectionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link targets.configdesk.ethernet.impl.UDPConnectionImpl#getMaxVectorSize <em>Max Vector Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UDPConnectionImpl extends SuperIdentifierTypeImpl implements UDPConnection {
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
	 * The default value of the '{@link #getMaxVectorSize() <em>Max Vector Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxVectorSize()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_VECTOR_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxVectorSize() <em>Max Vector Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxVectorSize()
	 * @generated
	 * @ordered
	 */
	protected int maxVectorSize = MAX_VECTOR_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UDPConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EthernetPackage.Literals.UDP_CONNECTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EthernetPackage.UDP_CONNECTION__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EthernetPackage.UDP_CONNECTION__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EthernetPackage.UDP_CONNECTION__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EthernetPackage.UDP_CONNECTION__TRACE_LINK, oldTraceLink, traceLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EthernetPackage.UDP_CONNECTION__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EthernetPackage.UDP_CONNECTION__CREATOR, oldCreator, creator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EthernetPackage.UDP_CONNECTION__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxVectorSize() {
		return maxVectorSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxVectorSize(int newMaxVectorSize) {
		int oldMaxVectorSize = maxVectorSize;
		maxVectorSize = newMaxVectorSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EthernetPackage.UDP_CONNECTION__MAX_VECTOR_SIZE, oldMaxVectorSize, maxVectorSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EthernetPackage.UDP_CONNECTION__DOCUMENTATION:
				return getDocumentation();
			case EthernetPackage.UDP_CONNECTION__MODIFIED:
				return getModified();
			case EthernetPackage.UDP_CONNECTION__MODIFIER:
				return getModifier();
			case EthernetPackage.UDP_CONNECTION__TRACE_LINK:
				return getTraceLink();
			case EthernetPackage.UDP_CONNECTION__CREATED:
				return getCreated();
			case EthernetPackage.UDP_CONNECTION__CREATOR:
				return getCreator();
			case EthernetPackage.UDP_CONNECTION__VERSION:
				return getVersion();
			case EthernetPackage.UDP_CONNECTION__MAX_VECTOR_SIZE:
				return getMaxVectorSize();
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
			case EthernetPackage.UDP_CONNECTION__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case EthernetPackage.UDP_CONNECTION__MODIFIED:
				setModified((Date)newValue);
				return;
			case EthernetPackage.UDP_CONNECTION__MODIFIER:
				setModifier((String)newValue);
				return;
			case EthernetPackage.UDP_CONNECTION__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case EthernetPackage.UDP_CONNECTION__CREATED:
				setCreated((Date)newValue);
				return;
			case EthernetPackage.UDP_CONNECTION__CREATOR:
				setCreator((String)newValue);
				return;
			case EthernetPackage.UDP_CONNECTION__VERSION:
				setVersion((Float)newValue);
				return;
			case EthernetPackage.UDP_CONNECTION__MAX_VECTOR_SIZE:
				setMaxVectorSize((Integer)newValue);
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
			case EthernetPackage.UDP_CONNECTION__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case EthernetPackage.UDP_CONNECTION__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case EthernetPackage.UDP_CONNECTION__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case EthernetPackage.UDP_CONNECTION__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case EthernetPackage.UDP_CONNECTION__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case EthernetPackage.UDP_CONNECTION__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case EthernetPackage.UDP_CONNECTION__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case EthernetPackage.UDP_CONNECTION__MAX_VECTOR_SIZE:
				setMaxVectorSize(MAX_VECTOR_SIZE_EDEFAULT);
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
			case EthernetPackage.UDP_CONNECTION__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case EthernetPackage.UDP_CONNECTION__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case EthernetPackage.UDP_CONNECTION__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case EthernetPackage.UDP_CONNECTION__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case EthernetPackage.UDP_CONNECTION__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case EthernetPackage.UDP_CONNECTION__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case EthernetPackage.UDP_CONNECTION__VERSION:
				return version != VERSION_EDEFAULT;
			case EthernetPackage.UDP_CONNECTION__MAX_VECTOR_SIZE:
				return maxVectorSize != MAX_VECTOR_SIZE_EDEFAULT;
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
				case EthernetPackage.UDP_CONNECTION__DOCUMENTATION: return EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;
				case EthernetPackage.UDP_CONNECTION__MODIFIED: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;
				case EthernetPackage.UDP_CONNECTION__MODIFIER: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;
				case EthernetPackage.UDP_CONNECTION__TRACE_LINK: return EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;
				case EthernetPackage.UDP_CONNECTION__CREATED: return EtypesPackage.SUPER_TRACKING_TYPE__CREATED;
				case EthernetPackage.UDP_CONNECTION__CREATOR: return EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;
				case EthernetPackage.UDP_CONNECTION__VERSION: return EtypesPackage.SUPER_TRACKING_TYPE__VERSION;
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
				case EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION: return EthernetPackage.UDP_CONNECTION__DOCUMENTATION;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED: return EthernetPackage.UDP_CONNECTION__MODIFIED;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER: return EthernetPackage.UDP_CONNECTION__MODIFIER;
				case EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK: return EthernetPackage.UDP_CONNECTION__TRACE_LINK;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATED: return EthernetPackage.UDP_CONNECTION__CREATED;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATOR: return EthernetPackage.UDP_CONNECTION__CREATOR;
				case EtypesPackage.SUPER_TRACKING_TYPE__VERSION: return EthernetPackage.UDP_CONNECTION__VERSION;
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
		result.append(", maxVectorSize: ");
		result.append(maxVectorSize);
		result.append(')');
		return result.toString();
	}

} //UDPConnectionImpl
