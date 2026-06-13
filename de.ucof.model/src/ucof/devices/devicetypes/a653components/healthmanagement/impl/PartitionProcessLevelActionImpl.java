/**
 */
package ucof.devices.devicetypes.a653components.healthmanagement.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.SuperTrackingType;

import ucof.common.etypes.impl.SuperIdentifierTypeImpl;

import ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage;
import ucof.devices.devicetypes.a653components.healthmanagement.PartitionProcessLevelAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partition Process Level Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.PartitionProcessLevelActionImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.PartitionProcessLevelActionImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.PartitionProcessLevelActionImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.PartitionProcessLevelActionImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.PartitionProcessLevelActionImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.PartitionProcessLevelActionImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.PartitionProcessLevelActionImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PartitionProcessLevelActionImpl extends SuperIdentifierTypeImpl implements PartitionProcessLevelAction {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartitionProcessLevelActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HealthmanagementPackage.Literals.PARTITION_PROCESS_LEVEL_ACTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__TRACE_LINK, oldTraceLink, traceLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__CREATOR, oldCreator, creator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__DOCUMENTATION:
				return getDocumentation();
			case HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__MODIFIED:
				return getModified();
			case HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__MODIFIER:
				return getModifier();
			case HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__TRACE_LINK:
				return getTraceLink();
			case HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__CREATED:
				return getCreated();
			case HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__CREATOR:
				return getCreator();
			case HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__VERSION:
				return getVersion();
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
			case HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__MODIFIED:
				setModified((Date)newValue);
				return;
			case HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__MODIFIER:
				setModifier((String)newValue);
				return;
			case HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__CREATED:
				setCreated((Date)newValue);
				return;
			case HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__CREATOR:
				setCreator((String)newValue);
				return;
			case HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__VERSION:
				setVersion((Float)newValue);
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
			case HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__VERSION:
				return version != VERSION_EDEFAULT;
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
				case HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__DOCUMENTATION: return EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;
				case HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__MODIFIED: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;
				case HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__MODIFIER: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;
				case HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__TRACE_LINK: return EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;
				case HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__CREATED: return EtypesPackage.SUPER_TRACKING_TYPE__CREATED;
				case HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__CREATOR: return EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;
				case HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__VERSION: return EtypesPackage.SUPER_TRACKING_TYPE__VERSION;
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
				case EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION: return HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__DOCUMENTATION;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED: return HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__MODIFIED;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER: return HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__MODIFIER;
				case EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK: return HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__TRACE_LINK;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATED: return HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__CREATED;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATOR: return HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__CREATOR;
				case EtypesPackage.SUPER_TRACKING_TYPE__VERSION: return HealthmanagementPackage.PARTITION_PROCESS_LEVEL_ACTION__VERSION;
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
		result.append(')');
		return result.toString();
	}

} //PartitionProcessLevelActionImpl
