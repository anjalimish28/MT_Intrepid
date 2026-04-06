/**
 */
package ucof.communication.configECIC.packageStrategyTypes.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.common.enums.YesNoType;

import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.SuperTrackingType;

import ucof.common.etypes.impl.SuperIdentifierTypeImpl;

import ucof.communication.configECIC.packageStrategyTypes.LLC;
import ucof.communication.configECIC.packageStrategyTypes.LLCType;
import ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LLC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.impl.LLCImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.impl.LLCImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.impl.LLCImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.impl.LLCImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.impl.LLCImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.impl.LLCImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.impl.LLCImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.impl.LLCImpl#getLLC <em>LLC</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.impl.LLCImpl#getResetPeriodicTimer <em>Reset Periodic Timer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LLCImpl extends SuperIdentifierTypeImpl implements LLC {
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
	 * The default value of the '{@link #getLLC() <em>LLC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLLC()
	 * @generated
	 * @ordered
	 */
	protected static final LLCType LLC_EDEFAULT = LLCType.NOT_SET;

	/**
	 * The cached value of the '{@link #getLLC() <em>LLC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLLC()
	 * @generated
	 * @ordered
	 */
	protected LLCType llc = LLC_EDEFAULT;

	/**
	 * The default value of the '{@link #getResetPeriodicTimer() <em>Reset Periodic Timer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetPeriodicTimer()
	 * @generated
	 * @ordered
	 */
	protected static final YesNoType RESET_PERIODIC_TIMER_EDEFAULT = YesNoType.NOT_SET;

	/**
	 * The cached value of the '{@link #getResetPeriodicTimer() <em>Reset Periodic Timer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetPeriodicTimer()
	 * @generated
	 * @ordered
	 */
	protected YesNoType resetPeriodicTimer = RESET_PERIODIC_TIMER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LLCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PackageStrategyTypesPackage.Literals.LLC;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PackageStrategyTypesPackage.LLC__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PackageStrategyTypesPackage.LLC__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PackageStrategyTypesPackage.LLC__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PackageStrategyTypesPackage.LLC__TRACE_LINK, oldTraceLink, traceLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PackageStrategyTypesPackage.LLC__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PackageStrategyTypesPackage.LLC__CREATOR, oldCreator, creator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PackageStrategyTypesPackage.LLC__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LLCType getLLC() {
		return llc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLLC(LLCType newLLC) {
		LLCType oldLLC = llc;
		llc = newLLC == null ? LLC_EDEFAULT : newLLC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackageStrategyTypesPackage.LLC__LLC, oldLLC, llc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YesNoType getResetPeriodicTimer() {
		return resetPeriodicTimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResetPeriodicTimer(YesNoType newResetPeriodicTimer) {
		YesNoType oldResetPeriodicTimer = resetPeriodicTimer;
		resetPeriodicTimer = newResetPeriodicTimer == null ? RESET_PERIODIC_TIMER_EDEFAULT : newResetPeriodicTimer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackageStrategyTypesPackage.LLC__RESET_PERIODIC_TIMER, oldResetPeriodicTimer, resetPeriodicTimer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PackageStrategyTypesPackage.LLC__DOCUMENTATION:
				return getDocumentation();
			case PackageStrategyTypesPackage.LLC__MODIFIED:
				return getModified();
			case PackageStrategyTypesPackage.LLC__MODIFIER:
				return getModifier();
			case PackageStrategyTypesPackage.LLC__TRACE_LINK:
				return getTraceLink();
			case PackageStrategyTypesPackage.LLC__CREATED:
				return getCreated();
			case PackageStrategyTypesPackage.LLC__CREATOR:
				return getCreator();
			case PackageStrategyTypesPackage.LLC__VERSION:
				return getVersion();
			case PackageStrategyTypesPackage.LLC__LLC:
				return getLLC();
			case PackageStrategyTypesPackage.LLC__RESET_PERIODIC_TIMER:
				return getResetPeriodicTimer();
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
			case PackageStrategyTypesPackage.LLC__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case PackageStrategyTypesPackage.LLC__MODIFIED:
				setModified((Date)newValue);
				return;
			case PackageStrategyTypesPackage.LLC__MODIFIER:
				setModifier((String)newValue);
				return;
			case PackageStrategyTypesPackage.LLC__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case PackageStrategyTypesPackage.LLC__CREATED:
				setCreated((Date)newValue);
				return;
			case PackageStrategyTypesPackage.LLC__CREATOR:
				setCreator((String)newValue);
				return;
			case PackageStrategyTypesPackage.LLC__VERSION:
				setVersion((Float)newValue);
				return;
			case PackageStrategyTypesPackage.LLC__LLC:
				setLLC((LLCType)newValue);
				return;
			case PackageStrategyTypesPackage.LLC__RESET_PERIODIC_TIMER:
				setResetPeriodicTimer((YesNoType)newValue);
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
			case PackageStrategyTypesPackage.LLC__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case PackageStrategyTypesPackage.LLC__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case PackageStrategyTypesPackage.LLC__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case PackageStrategyTypesPackage.LLC__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case PackageStrategyTypesPackage.LLC__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case PackageStrategyTypesPackage.LLC__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case PackageStrategyTypesPackage.LLC__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case PackageStrategyTypesPackage.LLC__LLC:
				setLLC(LLC_EDEFAULT);
				return;
			case PackageStrategyTypesPackage.LLC__RESET_PERIODIC_TIMER:
				setResetPeriodicTimer(RESET_PERIODIC_TIMER_EDEFAULT);
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
			case PackageStrategyTypesPackage.LLC__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case PackageStrategyTypesPackage.LLC__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case PackageStrategyTypesPackage.LLC__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case PackageStrategyTypesPackage.LLC__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case PackageStrategyTypesPackage.LLC__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case PackageStrategyTypesPackage.LLC__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case PackageStrategyTypesPackage.LLC__VERSION:
				return version != VERSION_EDEFAULT;
			case PackageStrategyTypesPackage.LLC__LLC:
				return llc != LLC_EDEFAULT;
			case PackageStrategyTypesPackage.LLC__RESET_PERIODIC_TIMER:
				return resetPeriodicTimer != RESET_PERIODIC_TIMER_EDEFAULT;
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
				case PackageStrategyTypesPackage.LLC__DOCUMENTATION: return EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;
				case PackageStrategyTypesPackage.LLC__MODIFIED: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;
				case PackageStrategyTypesPackage.LLC__MODIFIER: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;
				case PackageStrategyTypesPackage.LLC__TRACE_LINK: return EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;
				case PackageStrategyTypesPackage.LLC__CREATED: return EtypesPackage.SUPER_TRACKING_TYPE__CREATED;
				case PackageStrategyTypesPackage.LLC__CREATOR: return EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;
				case PackageStrategyTypesPackage.LLC__VERSION: return EtypesPackage.SUPER_TRACKING_TYPE__VERSION;
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
				case EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION: return PackageStrategyTypesPackage.LLC__DOCUMENTATION;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED: return PackageStrategyTypesPackage.LLC__MODIFIED;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER: return PackageStrategyTypesPackage.LLC__MODIFIER;
				case EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK: return PackageStrategyTypesPackage.LLC__TRACE_LINK;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATED: return PackageStrategyTypesPackage.LLC__CREATED;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATOR: return PackageStrategyTypesPackage.LLC__CREATOR;
				case EtypesPackage.SUPER_TRACKING_TYPE__VERSION: return PackageStrategyTypesPackage.LLC__VERSION;
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
		result.append(", LLC: ");
		result.append(llc);
		result.append(", ResetPeriodicTimer: ");
		result.append(resetPeriodicTimer);
		result.append(')');
		return result.toString();
	}

} //LLCImpl
