/**
 */
package ucof.devices.devicetypes.a653components.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.SuperTrackingType;

import ucof.common.etypes.impl.SuperIdentifierTypeImpl;

import ucof.devices.devicetypes.a653components.A653componentsPackage;
import ucof.devices.devicetypes.a653components.MemoryRegion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.devicetypes.a653components.impl.MemoryRegionImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.impl.MemoryRegionImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.impl.MemoryRegionImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.impl.MemoryRegionImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.impl.MemoryRegionImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.impl.MemoryRegionImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.impl.MemoryRegionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.impl.MemoryRegionImpl#getSize <em>Size</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.impl.MemoryRegionImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.impl.MemoryRegionImpl#getAccessRights <em>Access Rights</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemoryRegionImpl extends SuperIdentifierTypeImpl implements MemoryRegion {
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
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final String SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected String size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessRights() <em>Access Rights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessRights()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_RIGHTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessRights() <em>Access Rights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessRights()
	 * @generated
	 * @ordered
	 */
	protected String accessRights = ACCESS_RIGHTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryRegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A653componentsPackage.Literals.MEMORY_REGION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, A653componentsPackage.MEMORY_REGION__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, A653componentsPackage.MEMORY_REGION__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, A653componentsPackage.MEMORY_REGION__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, A653componentsPackage.MEMORY_REGION__TRACE_LINK, oldTraceLink, traceLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, A653componentsPackage.MEMORY_REGION__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, A653componentsPackage.MEMORY_REGION__CREATOR, oldCreator, creator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, A653componentsPackage.MEMORY_REGION__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(String newSize) {
		String oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A653componentsPackage.MEMORY_REGION__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A653componentsPackage.MEMORY_REGION__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccessRights() {
		return accessRights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessRights(String newAccessRights) {
		String oldAccessRights = accessRights;
		accessRights = newAccessRights;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A653componentsPackage.MEMORY_REGION__ACCESS_RIGHTS, oldAccessRights, accessRights));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case A653componentsPackage.MEMORY_REGION__DOCUMENTATION:
				return getDocumentation();
			case A653componentsPackage.MEMORY_REGION__MODIFIED:
				return getModified();
			case A653componentsPackage.MEMORY_REGION__MODIFIER:
				return getModifier();
			case A653componentsPackage.MEMORY_REGION__TRACE_LINK:
				return getTraceLink();
			case A653componentsPackage.MEMORY_REGION__CREATED:
				return getCreated();
			case A653componentsPackage.MEMORY_REGION__CREATOR:
				return getCreator();
			case A653componentsPackage.MEMORY_REGION__VERSION:
				return getVersion();
			case A653componentsPackage.MEMORY_REGION__SIZE:
				return getSize();
			case A653componentsPackage.MEMORY_REGION__ADDRESS:
				return getAddress();
			case A653componentsPackage.MEMORY_REGION__ACCESS_RIGHTS:
				return getAccessRights();
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
			case A653componentsPackage.MEMORY_REGION__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case A653componentsPackage.MEMORY_REGION__MODIFIED:
				setModified((Date)newValue);
				return;
			case A653componentsPackage.MEMORY_REGION__MODIFIER:
				setModifier((String)newValue);
				return;
			case A653componentsPackage.MEMORY_REGION__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case A653componentsPackage.MEMORY_REGION__CREATED:
				setCreated((Date)newValue);
				return;
			case A653componentsPackage.MEMORY_REGION__CREATOR:
				setCreator((String)newValue);
				return;
			case A653componentsPackage.MEMORY_REGION__VERSION:
				setVersion((Float)newValue);
				return;
			case A653componentsPackage.MEMORY_REGION__SIZE:
				setSize((String)newValue);
				return;
			case A653componentsPackage.MEMORY_REGION__ADDRESS:
				setAddress((String)newValue);
				return;
			case A653componentsPackage.MEMORY_REGION__ACCESS_RIGHTS:
				setAccessRights((String)newValue);
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
			case A653componentsPackage.MEMORY_REGION__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case A653componentsPackage.MEMORY_REGION__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case A653componentsPackage.MEMORY_REGION__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case A653componentsPackage.MEMORY_REGION__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case A653componentsPackage.MEMORY_REGION__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case A653componentsPackage.MEMORY_REGION__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case A653componentsPackage.MEMORY_REGION__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case A653componentsPackage.MEMORY_REGION__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case A653componentsPackage.MEMORY_REGION__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case A653componentsPackage.MEMORY_REGION__ACCESS_RIGHTS:
				setAccessRights(ACCESS_RIGHTS_EDEFAULT);
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
			case A653componentsPackage.MEMORY_REGION__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case A653componentsPackage.MEMORY_REGION__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case A653componentsPackage.MEMORY_REGION__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case A653componentsPackage.MEMORY_REGION__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case A653componentsPackage.MEMORY_REGION__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case A653componentsPackage.MEMORY_REGION__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case A653componentsPackage.MEMORY_REGION__VERSION:
				return version != VERSION_EDEFAULT;
			case A653componentsPackage.MEMORY_REGION__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
			case A653componentsPackage.MEMORY_REGION__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case A653componentsPackage.MEMORY_REGION__ACCESS_RIGHTS:
				return ACCESS_RIGHTS_EDEFAULT == null ? accessRights != null : !ACCESS_RIGHTS_EDEFAULT.equals(accessRights);
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
				case A653componentsPackage.MEMORY_REGION__DOCUMENTATION: return EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;
				case A653componentsPackage.MEMORY_REGION__MODIFIED: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;
				case A653componentsPackage.MEMORY_REGION__MODIFIER: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;
				case A653componentsPackage.MEMORY_REGION__TRACE_LINK: return EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;
				case A653componentsPackage.MEMORY_REGION__CREATED: return EtypesPackage.SUPER_TRACKING_TYPE__CREATED;
				case A653componentsPackage.MEMORY_REGION__CREATOR: return EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;
				case A653componentsPackage.MEMORY_REGION__VERSION: return EtypesPackage.SUPER_TRACKING_TYPE__VERSION;
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
				case EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION: return A653componentsPackage.MEMORY_REGION__DOCUMENTATION;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED: return A653componentsPackage.MEMORY_REGION__MODIFIED;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER: return A653componentsPackage.MEMORY_REGION__MODIFIER;
				case EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK: return A653componentsPackage.MEMORY_REGION__TRACE_LINK;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATED: return A653componentsPackage.MEMORY_REGION__CREATED;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATOR: return A653componentsPackage.MEMORY_REGION__CREATOR;
				case EtypesPackage.SUPER_TRACKING_TYPE__VERSION: return A653componentsPackage.MEMORY_REGION__VERSION;
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
		result.append(", size: ");
		result.append(size);
		result.append(", address: ");
		result.append(address);
		result.append(", accessRights: ");
		result.append(accessRights);
		result.append(')');
		return result.toString();
	}

} //MemoryRegionImpl
