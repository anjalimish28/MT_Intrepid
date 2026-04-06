/**
 */
package ucof.communication.configECIC.packageStrategyTypes.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.common.enums.SDITypes;
import ucof.common.enums.YesNoType;

import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.SuperTrackingType;

import ucof.common.etypes.impl.SuperIdentifierTypeImpl;

import ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesPackage;
import ucof.communication.configECIC.packageStrategyTypes.TriggerWord;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger Word</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.impl.TriggerWordImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.impl.TriggerWordImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.impl.TriggerWordImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.impl.TriggerWordImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.impl.TriggerWordImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.impl.TriggerWordImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.impl.TriggerWordImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.impl.TriggerWordImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.impl.TriggerWordImpl#getSDI <em>SDI</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.impl.TriggerWordImpl#getResetPeriodicTimer <em>Reset Periodic Timer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriggerWordImpl extends SuperIdentifierTypeImpl implements TriggerWord {
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
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSDI() <em>SDI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSDI()
	 * @generated
	 * @ordered
	 */
	protected static final SDITypes SDI_EDEFAULT = SDITypes.NOT_SET;

	/**
	 * The cached value of the '{@link #getSDI() <em>SDI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSDI()
	 * @generated
	 * @ordered
	 */
	protected SDITypes sdi = SDI_EDEFAULT;

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
	protected TriggerWordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PackageStrategyTypesPackage.Literals.TRIGGER_WORD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PackageStrategyTypesPackage.TRIGGER_WORD__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PackageStrategyTypesPackage.TRIGGER_WORD__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PackageStrategyTypesPackage.TRIGGER_WORD__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PackageStrategyTypesPackage.TRIGGER_WORD__TRACE_LINK, oldTraceLink, traceLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PackageStrategyTypesPackage.TRIGGER_WORD__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PackageStrategyTypesPackage.TRIGGER_WORD__CREATOR, oldCreator, creator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PackageStrategyTypesPackage.TRIGGER_WORD__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackageStrategyTypesPackage.TRIGGER_WORD__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDITypes getSDI() {
		return sdi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSDI(SDITypes newSDI) {
		SDITypes oldSDI = sdi;
		sdi = newSDI == null ? SDI_EDEFAULT : newSDI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackageStrategyTypesPackage.TRIGGER_WORD__SDI, oldSDI, sdi));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PackageStrategyTypesPackage.TRIGGER_WORD__RESET_PERIODIC_TIMER, oldResetPeriodicTimer, resetPeriodicTimer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PackageStrategyTypesPackage.TRIGGER_WORD__DOCUMENTATION:
				return getDocumentation();
			case PackageStrategyTypesPackage.TRIGGER_WORD__MODIFIED:
				return getModified();
			case PackageStrategyTypesPackage.TRIGGER_WORD__MODIFIER:
				return getModifier();
			case PackageStrategyTypesPackage.TRIGGER_WORD__TRACE_LINK:
				return getTraceLink();
			case PackageStrategyTypesPackage.TRIGGER_WORD__CREATED:
				return getCreated();
			case PackageStrategyTypesPackage.TRIGGER_WORD__CREATOR:
				return getCreator();
			case PackageStrategyTypesPackage.TRIGGER_WORD__VERSION:
				return getVersion();
			case PackageStrategyTypesPackage.TRIGGER_WORD__LABEL:
				return getLabel();
			case PackageStrategyTypesPackage.TRIGGER_WORD__SDI:
				return getSDI();
			case PackageStrategyTypesPackage.TRIGGER_WORD__RESET_PERIODIC_TIMER:
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
			case PackageStrategyTypesPackage.TRIGGER_WORD__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case PackageStrategyTypesPackage.TRIGGER_WORD__MODIFIED:
				setModified((Date)newValue);
				return;
			case PackageStrategyTypesPackage.TRIGGER_WORD__MODIFIER:
				setModifier((String)newValue);
				return;
			case PackageStrategyTypesPackage.TRIGGER_WORD__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case PackageStrategyTypesPackage.TRIGGER_WORD__CREATED:
				setCreated((Date)newValue);
				return;
			case PackageStrategyTypesPackage.TRIGGER_WORD__CREATOR:
				setCreator((String)newValue);
				return;
			case PackageStrategyTypesPackage.TRIGGER_WORD__VERSION:
				setVersion((Float)newValue);
				return;
			case PackageStrategyTypesPackage.TRIGGER_WORD__LABEL:
				setLabel((String)newValue);
				return;
			case PackageStrategyTypesPackage.TRIGGER_WORD__SDI:
				setSDI((SDITypes)newValue);
				return;
			case PackageStrategyTypesPackage.TRIGGER_WORD__RESET_PERIODIC_TIMER:
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
			case PackageStrategyTypesPackage.TRIGGER_WORD__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case PackageStrategyTypesPackage.TRIGGER_WORD__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case PackageStrategyTypesPackage.TRIGGER_WORD__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case PackageStrategyTypesPackage.TRIGGER_WORD__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case PackageStrategyTypesPackage.TRIGGER_WORD__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case PackageStrategyTypesPackage.TRIGGER_WORD__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case PackageStrategyTypesPackage.TRIGGER_WORD__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case PackageStrategyTypesPackage.TRIGGER_WORD__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case PackageStrategyTypesPackage.TRIGGER_WORD__SDI:
				setSDI(SDI_EDEFAULT);
				return;
			case PackageStrategyTypesPackage.TRIGGER_WORD__RESET_PERIODIC_TIMER:
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
			case PackageStrategyTypesPackage.TRIGGER_WORD__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case PackageStrategyTypesPackage.TRIGGER_WORD__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case PackageStrategyTypesPackage.TRIGGER_WORD__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case PackageStrategyTypesPackage.TRIGGER_WORD__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case PackageStrategyTypesPackage.TRIGGER_WORD__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case PackageStrategyTypesPackage.TRIGGER_WORD__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case PackageStrategyTypesPackage.TRIGGER_WORD__VERSION:
				return version != VERSION_EDEFAULT;
			case PackageStrategyTypesPackage.TRIGGER_WORD__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case PackageStrategyTypesPackage.TRIGGER_WORD__SDI:
				return sdi != SDI_EDEFAULT;
			case PackageStrategyTypesPackage.TRIGGER_WORD__RESET_PERIODIC_TIMER:
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
				case PackageStrategyTypesPackage.TRIGGER_WORD__DOCUMENTATION: return EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;
				case PackageStrategyTypesPackage.TRIGGER_WORD__MODIFIED: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;
				case PackageStrategyTypesPackage.TRIGGER_WORD__MODIFIER: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;
				case PackageStrategyTypesPackage.TRIGGER_WORD__TRACE_LINK: return EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;
				case PackageStrategyTypesPackage.TRIGGER_WORD__CREATED: return EtypesPackage.SUPER_TRACKING_TYPE__CREATED;
				case PackageStrategyTypesPackage.TRIGGER_WORD__CREATOR: return EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;
				case PackageStrategyTypesPackage.TRIGGER_WORD__VERSION: return EtypesPackage.SUPER_TRACKING_TYPE__VERSION;
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
				case EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION: return PackageStrategyTypesPackage.TRIGGER_WORD__DOCUMENTATION;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED: return PackageStrategyTypesPackage.TRIGGER_WORD__MODIFIED;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER: return PackageStrategyTypesPackage.TRIGGER_WORD__MODIFIER;
				case EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK: return PackageStrategyTypesPackage.TRIGGER_WORD__TRACE_LINK;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATED: return PackageStrategyTypesPackage.TRIGGER_WORD__CREATED;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATOR: return PackageStrategyTypesPackage.TRIGGER_WORD__CREATOR;
				case EtypesPackage.SUPER_TRACKING_TYPE__VERSION: return PackageStrategyTypesPackage.TRIGGER_WORD__VERSION;
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
		result.append(", Label: ");
		result.append(label);
		result.append(", SDI: ");
		result.append(sdi);
		result.append(", ResetPeriodicTimer: ");
		result.append(resetPeriodicTimer);
		result.append(')');
		return result.toString();
	}

} //TriggerWordImpl
