/**
 */
package targets.avip.impl;

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import targets.avip.AVDSchedulerExtension;
import targets.avip.AvipPackage;
import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.SuperTrackingType;
import ucof.common.etypes.impl.SuperIdentifierTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AVD Scheduler Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.avip.impl.AVDSchedulerExtensionImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link targets.avip.impl.AVDSchedulerExtensionImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link targets.avip.impl.AVDSchedulerExtensionImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link targets.avip.impl.AVDSchedulerExtensionImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link targets.avip.impl.AVDSchedulerExtensionImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link targets.avip.impl.AVDSchedulerExtensionImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link targets.avip.impl.AVDSchedulerExtensionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link targets.avip.impl.AVDSchedulerExtensionImpl#getMif_duration <em>Mif duration</em>}</li>
 *   <li>{@link targets.avip.impl.AVDSchedulerExtensionImpl#getMaf_duration <em>Maf duration</em>}</li>
 *   <li>{@link targets.avip.impl.AVDSchedulerExtensionImpl#getScheduler_id <em>Scheduler id</em>}</li>
 *   <li>{@link targets.avip.impl.AVDSchedulerExtensionImpl#getScheduler_name <em>Scheduler name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AVDSchedulerExtensionImpl extends SuperIdentifierTypeImpl implements AVDSchedulerExtension {
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
	 * The default value of the '{@link #getMif_duration() <em>Mif duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMif_duration()
	 * @generated
	 * @ordered
	 */
	protected static final int MIF_DURATION_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getMif_duration() <em>Mif duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMif_duration()
	 * @generated
	 * @ordered
	 */
	protected int mif_duration = MIF_DURATION_EDEFAULT;
	/**
	 * The default value of the '{@link #getMaf_duration() <em>Maf duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaf_duration()
	 * @generated
	 * @ordered
	 */
	protected static final int MAF_DURATION_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getMaf_duration() <em>Maf duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaf_duration()
	 * @generated
	 * @ordered
	 */
	protected int maf_duration = MAF_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getScheduler_id() <em>Scheduler id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduler_id()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEDULER_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getScheduler_id() <em>Scheduler id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduler_id()
	 * @generated
	 * @ordered
	 */
	protected String scheduler_id = SCHEDULER_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getScheduler_name() <em>Scheduler name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduler_name()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEDULER_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getScheduler_name() <em>Scheduler name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduler_name()
	 * @generated
	 * @ordered
	 */
	protected String scheduler_name = SCHEDULER_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AVDSchedulerExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AvipPackage.Literals.AVD_SCHEDULER_EXTENSION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.AVD_SCHEDULER_EXTENSION__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.AVD_SCHEDULER_EXTENSION__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.AVD_SCHEDULER_EXTENSION__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.AVD_SCHEDULER_EXTENSION__TRACE_LINK, oldTraceLink, traceLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.AVD_SCHEDULER_EXTENSION__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.AVD_SCHEDULER_EXTENSION__CREATOR, oldCreator, creator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.AVD_SCHEDULER_EXTENSION__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMif_duration() {
		return mif_duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMif_duration(int newMif_duration) {
		int oldMif_duration = mif_duration;
		mif_duration = newMif_duration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.AVD_SCHEDULER_EXTENSION__MIF_DURATION, oldMif_duration, mif_duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaf_duration() {
		return maf_duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaf_duration(int newMaf_duration) {
		int oldMaf_duration = maf_duration;
		maf_duration = newMaf_duration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.AVD_SCHEDULER_EXTENSION__MAF_DURATION, oldMaf_duration, maf_duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScheduler_id() {
		return scheduler_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduler_id(String newScheduler_id) {
		String oldScheduler_id = scheduler_id;
		scheduler_id = newScheduler_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.AVD_SCHEDULER_EXTENSION__SCHEDULER_ID, oldScheduler_id, scheduler_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScheduler_name() {
		return scheduler_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduler_name(String newScheduler_name) {
		String oldScheduler_name = scheduler_name;
		scheduler_name = newScheduler_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.AVD_SCHEDULER_EXTENSION__SCHEDULER_NAME, oldScheduler_name, scheduler_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AvipPackage.AVD_SCHEDULER_EXTENSION__DOCUMENTATION:
				return getDocumentation();
			case AvipPackage.AVD_SCHEDULER_EXTENSION__MODIFIED:
				return getModified();
			case AvipPackage.AVD_SCHEDULER_EXTENSION__MODIFIER:
				return getModifier();
			case AvipPackage.AVD_SCHEDULER_EXTENSION__TRACE_LINK:
				return getTraceLink();
			case AvipPackage.AVD_SCHEDULER_EXTENSION__CREATED:
				return getCreated();
			case AvipPackage.AVD_SCHEDULER_EXTENSION__CREATOR:
				return getCreator();
			case AvipPackage.AVD_SCHEDULER_EXTENSION__VERSION:
				return getVersion();
			case AvipPackage.AVD_SCHEDULER_EXTENSION__MIF_DURATION:
				return getMif_duration();
			case AvipPackage.AVD_SCHEDULER_EXTENSION__MAF_DURATION:
				return getMaf_duration();
			case AvipPackage.AVD_SCHEDULER_EXTENSION__SCHEDULER_ID:
				return getScheduler_id();
			case AvipPackage.AVD_SCHEDULER_EXTENSION__SCHEDULER_NAME:
				return getScheduler_name();
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
			case AvipPackage.AVD_SCHEDULER_EXTENSION__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case AvipPackage.AVD_SCHEDULER_EXTENSION__MODIFIED:
				setModified((Date)newValue);
				return;
			case AvipPackage.AVD_SCHEDULER_EXTENSION__MODIFIER:
				setModifier((String)newValue);
				return;
			case AvipPackage.AVD_SCHEDULER_EXTENSION__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case AvipPackage.AVD_SCHEDULER_EXTENSION__CREATED:
				setCreated((Date)newValue);
				return;
			case AvipPackage.AVD_SCHEDULER_EXTENSION__CREATOR:
				setCreator((String)newValue);
				return;
			case AvipPackage.AVD_SCHEDULER_EXTENSION__VERSION:
				setVersion((Float)newValue);
				return;
			case AvipPackage.AVD_SCHEDULER_EXTENSION__MIF_DURATION:
				setMif_duration((Integer)newValue);
				return;
			case AvipPackage.AVD_SCHEDULER_EXTENSION__MAF_DURATION:
				setMaf_duration((Integer)newValue);
				return;
			case AvipPackage.AVD_SCHEDULER_EXTENSION__SCHEDULER_ID:
				setScheduler_id((String)newValue);
				return;
			case AvipPackage.AVD_SCHEDULER_EXTENSION__SCHEDULER_NAME:
				setScheduler_name((String)newValue);
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
			case AvipPackage.AVD_SCHEDULER_EXTENSION__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case AvipPackage.AVD_SCHEDULER_EXTENSION__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case AvipPackage.AVD_SCHEDULER_EXTENSION__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case AvipPackage.AVD_SCHEDULER_EXTENSION__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case AvipPackage.AVD_SCHEDULER_EXTENSION__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case AvipPackage.AVD_SCHEDULER_EXTENSION__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case AvipPackage.AVD_SCHEDULER_EXTENSION__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case AvipPackage.AVD_SCHEDULER_EXTENSION__MIF_DURATION:
				setMif_duration(MIF_DURATION_EDEFAULT);
				return;
			case AvipPackage.AVD_SCHEDULER_EXTENSION__MAF_DURATION:
				setMaf_duration(MAF_DURATION_EDEFAULT);
				return;
			case AvipPackage.AVD_SCHEDULER_EXTENSION__SCHEDULER_ID:
				setScheduler_id(SCHEDULER_ID_EDEFAULT);
				return;
			case AvipPackage.AVD_SCHEDULER_EXTENSION__SCHEDULER_NAME:
				setScheduler_name(SCHEDULER_NAME_EDEFAULT);
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
			case AvipPackage.AVD_SCHEDULER_EXTENSION__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case AvipPackage.AVD_SCHEDULER_EXTENSION__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case AvipPackage.AVD_SCHEDULER_EXTENSION__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case AvipPackage.AVD_SCHEDULER_EXTENSION__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case AvipPackage.AVD_SCHEDULER_EXTENSION__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case AvipPackage.AVD_SCHEDULER_EXTENSION__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case AvipPackage.AVD_SCHEDULER_EXTENSION__VERSION:
				return version != VERSION_EDEFAULT;
			case AvipPackage.AVD_SCHEDULER_EXTENSION__MIF_DURATION:
				return mif_duration != MIF_DURATION_EDEFAULT;
			case AvipPackage.AVD_SCHEDULER_EXTENSION__MAF_DURATION:
				return maf_duration != MAF_DURATION_EDEFAULT;
			case AvipPackage.AVD_SCHEDULER_EXTENSION__SCHEDULER_ID:
				return SCHEDULER_ID_EDEFAULT == null ? scheduler_id != null : !SCHEDULER_ID_EDEFAULT.equals(scheduler_id);
			case AvipPackage.AVD_SCHEDULER_EXTENSION__SCHEDULER_NAME:
				return SCHEDULER_NAME_EDEFAULT == null ? scheduler_name != null : !SCHEDULER_NAME_EDEFAULT.equals(scheduler_name);
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
				case AvipPackage.AVD_SCHEDULER_EXTENSION__DOCUMENTATION: return EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;
				case AvipPackage.AVD_SCHEDULER_EXTENSION__MODIFIED: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;
				case AvipPackage.AVD_SCHEDULER_EXTENSION__MODIFIER: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;
				case AvipPackage.AVD_SCHEDULER_EXTENSION__TRACE_LINK: return EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;
				case AvipPackage.AVD_SCHEDULER_EXTENSION__CREATED: return EtypesPackage.SUPER_TRACKING_TYPE__CREATED;
				case AvipPackage.AVD_SCHEDULER_EXTENSION__CREATOR: return EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;
				case AvipPackage.AVD_SCHEDULER_EXTENSION__VERSION: return EtypesPackage.SUPER_TRACKING_TYPE__VERSION;
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
				case EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION: return AvipPackage.AVD_SCHEDULER_EXTENSION__DOCUMENTATION;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED: return AvipPackage.AVD_SCHEDULER_EXTENSION__MODIFIED;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER: return AvipPackage.AVD_SCHEDULER_EXTENSION__MODIFIER;
				case EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK: return AvipPackage.AVD_SCHEDULER_EXTENSION__TRACE_LINK;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATED: return AvipPackage.AVD_SCHEDULER_EXTENSION__CREATED;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATOR: return AvipPackage.AVD_SCHEDULER_EXTENSION__CREATOR;
				case EtypesPackage.SUPER_TRACKING_TYPE__VERSION: return AvipPackage.AVD_SCHEDULER_EXTENSION__VERSION;
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
		result.append(", mif_duration: ");
		result.append(mif_duration);
		result.append(", maf_duration: ");
		result.append(maf_duration);
		result.append(", scheduler_id: ");
		result.append(scheduler_id);
		result.append(", scheduler_name: ");
		result.append(scheduler_name);
		result.append(')');
		return result.toString();
	}

} //AVDSchedulerExtensionImpl
