/**
 */
package ucof.common.etypes.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ucof.common.enums.MemoryAccessType;
import ucof.common.enums.MemoryType;

import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.MemoryRequirement;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.common.etypes.impl.MemoryRequirementImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link ucof.common.etypes.impl.MemoryRequirementImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link ucof.common.etypes.impl.MemoryRequirementImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link ucof.common.etypes.impl.MemoryRequirementImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link ucof.common.etypes.impl.MemoryRequirementImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link ucof.common.etypes.impl.MemoryRequirementImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link ucof.common.etypes.impl.MemoryRequirementImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link ucof.common.etypes.impl.MemoryRequirementImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link ucof.common.etypes.impl.MemoryRequirementImpl#getMemoryType <em>Memory Type</em>}</li>
 *   <li>{@link ucof.common.etypes.impl.MemoryRequirementImpl#getSize <em>Size</em>}</li>
 *   <li>{@link ucof.common.etypes.impl.MemoryRequirementImpl#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemoryRequirementImpl extends SuperIdentifierTypeImpl implements MemoryRequirement {
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
	 * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected static final MemoryAccessType ACCESS_EDEFAULT = MemoryAccessType.NOT_SET;

	/**
	 * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected MemoryAccessType access = ACCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemoryType() <em>Memory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryType()
	 * @generated
	 * @ordered
	 */
	protected static final MemoryType MEMORY_TYPE_EDEFAULT = MemoryType.NOT_SET;

	/**
	 * The cached value of the '{@link #getMemoryType() <em>Memory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryType()
	 * @generated
	 * @ordered
	 */
	protected MemoryType memoryType = MEMORY_TYPE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EtypesPackage.Literals.MEMORY_REQUIREMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EtypesPackage.MEMORY_REQUIREMENT__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EtypesPackage.MEMORY_REQUIREMENT__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EtypesPackage.MEMORY_REQUIREMENT__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EtypesPackage.MEMORY_REQUIREMENT__TRACE_LINK, oldTraceLink, traceLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EtypesPackage.MEMORY_REQUIREMENT__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EtypesPackage.MEMORY_REQUIREMENT__CREATOR, oldCreator, creator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EtypesPackage.MEMORY_REQUIREMENT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryAccessType getAccess() {
		return access;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccess(MemoryAccessType newAccess) {
		MemoryAccessType oldAccess = access;
		access = newAccess == null ? ACCESS_EDEFAULT : newAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtypesPackage.MEMORY_REQUIREMENT__ACCESS, oldAccess, access));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryType getMemoryType() {
		return memoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryType(MemoryType newMemoryType) {
		MemoryType oldMemoryType = memoryType;
		memoryType = newMemoryType == null ? MEMORY_TYPE_EDEFAULT : newMemoryType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtypesPackage.MEMORY_REQUIREMENT__MEMORY_TYPE, oldMemoryType, memoryType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EtypesPackage.MEMORY_REQUIREMENT__SIZE, oldSize, size));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EtypesPackage.MEMORY_REQUIREMENT__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EtypesPackage.MEMORY_REQUIREMENT__DOCUMENTATION:
				return getDocumentation();
			case EtypesPackage.MEMORY_REQUIREMENT__MODIFIED:
				return getModified();
			case EtypesPackage.MEMORY_REQUIREMENT__MODIFIER:
				return getModifier();
			case EtypesPackage.MEMORY_REQUIREMENT__TRACE_LINK:
				return getTraceLink();
			case EtypesPackage.MEMORY_REQUIREMENT__CREATED:
				return getCreated();
			case EtypesPackage.MEMORY_REQUIREMENT__CREATOR:
				return getCreator();
			case EtypesPackage.MEMORY_REQUIREMENT__VERSION:
				return getVersion();
			case EtypesPackage.MEMORY_REQUIREMENT__ACCESS:
				return getAccess();
			case EtypesPackage.MEMORY_REQUIREMENT__MEMORY_TYPE:
				return getMemoryType();
			case EtypesPackage.MEMORY_REQUIREMENT__SIZE:
				return getSize();
			case EtypesPackage.MEMORY_REQUIREMENT__ADDRESS:
				return getAddress();
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
			case EtypesPackage.MEMORY_REQUIREMENT__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case EtypesPackage.MEMORY_REQUIREMENT__MODIFIED:
				setModified((Date)newValue);
				return;
			case EtypesPackage.MEMORY_REQUIREMENT__MODIFIER:
				setModifier((String)newValue);
				return;
			case EtypesPackage.MEMORY_REQUIREMENT__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case EtypesPackage.MEMORY_REQUIREMENT__CREATED:
				setCreated((Date)newValue);
				return;
			case EtypesPackage.MEMORY_REQUIREMENT__CREATOR:
				setCreator((String)newValue);
				return;
			case EtypesPackage.MEMORY_REQUIREMENT__VERSION:
				setVersion((Float)newValue);
				return;
			case EtypesPackage.MEMORY_REQUIREMENT__ACCESS:
				setAccess((MemoryAccessType)newValue);
				return;
			case EtypesPackage.MEMORY_REQUIREMENT__MEMORY_TYPE:
				setMemoryType((MemoryType)newValue);
				return;
			case EtypesPackage.MEMORY_REQUIREMENT__SIZE:
				setSize((String)newValue);
				return;
			case EtypesPackage.MEMORY_REQUIREMENT__ADDRESS:
				setAddress((String)newValue);
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
			case EtypesPackage.MEMORY_REQUIREMENT__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case EtypesPackage.MEMORY_REQUIREMENT__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case EtypesPackage.MEMORY_REQUIREMENT__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case EtypesPackage.MEMORY_REQUIREMENT__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case EtypesPackage.MEMORY_REQUIREMENT__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case EtypesPackage.MEMORY_REQUIREMENT__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case EtypesPackage.MEMORY_REQUIREMENT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case EtypesPackage.MEMORY_REQUIREMENT__ACCESS:
				setAccess(ACCESS_EDEFAULT);
				return;
			case EtypesPackage.MEMORY_REQUIREMENT__MEMORY_TYPE:
				setMemoryType(MEMORY_TYPE_EDEFAULT);
				return;
			case EtypesPackage.MEMORY_REQUIREMENT__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case EtypesPackage.MEMORY_REQUIREMENT__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
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
			case EtypesPackage.MEMORY_REQUIREMENT__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case EtypesPackage.MEMORY_REQUIREMENT__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case EtypesPackage.MEMORY_REQUIREMENT__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case EtypesPackage.MEMORY_REQUIREMENT__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case EtypesPackage.MEMORY_REQUIREMENT__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case EtypesPackage.MEMORY_REQUIREMENT__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case EtypesPackage.MEMORY_REQUIREMENT__VERSION:
				return version != VERSION_EDEFAULT;
			case EtypesPackage.MEMORY_REQUIREMENT__ACCESS:
				return access != ACCESS_EDEFAULT;
			case EtypesPackage.MEMORY_REQUIREMENT__MEMORY_TYPE:
				return memoryType != MEMORY_TYPE_EDEFAULT;
			case EtypesPackage.MEMORY_REQUIREMENT__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
			case EtypesPackage.MEMORY_REQUIREMENT__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
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
				case EtypesPackage.MEMORY_REQUIREMENT__DOCUMENTATION: return EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;
				case EtypesPackage.MEMORY_REQUIREMENT__MODIFIED: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;
				case EtypesPackage.MEMORY_REQUIREMENT__MODIFIER: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;
				case EtypesPackage.MEMORY_REQUIREMENT__TRACE_LINK: return EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;
				case EtypesPackage.MEMORY_REQUIREMENT__CREATED: return EtypesPackage.SUPER_TRACKING_TYPE__CREATED;
				case EtypesPackage.MEMORY_REQUIREMENT__CREATOR: return EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;
				case EtypesPackage.MEMORY_REQUIREMENT__VERSION: return EtypesPackage.SUPER_TRACKING_TYPE__VERSION;
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
				case EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION: return EtypesPackage.MEMORY_REQUIREMENT__DOCUMENTATION;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED: return EtypesPackage.MEMORY_REQUIREMENT__MODIFIED;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER: return EtypesPackage.MEMORY_REQUIREMENT__MODIFIER;
				case EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK: return EtypesPackage.MEMORY_REQUIREMENT__TRACE_LINK;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATED: return EtypesPackage.MEMORY_REQUIREMENT__CREATED;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATOR: return EtypesPackage.MEMORY_REQUIREMENT__CREATOR;
				case EtypesPackage.SUPER_TRACKING_TYPE__VERSION: return EtypesPackage.MEMORY_REQUIREMENT__VERSION;
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
		result.append(", access: ");
		result.append(access);
		result.append(", memoryType: ");
		result.append(memoryType);
		result.append(", size: ");
		result.append(size);
		result.append(", address: ");
		result.append(address);
		result.append(')');
		return result.toString();
	}

} //MemoryRequirementImpl
