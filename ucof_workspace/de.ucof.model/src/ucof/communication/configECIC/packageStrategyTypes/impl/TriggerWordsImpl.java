/**
 */
package ucof.communication.configECIC.packageStrategyTypes.impl;

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

import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.SuperTrackingType;

import ucof.common.etypes.impl.SuperIdentifierTypeImpl;

import ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesPackage;
import ucof.communication.configECIC.packageStrategyTypes.TriggerWord;
import ucof.communication.configECIC.packageStrategyTypes.TriggerWords;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger Words</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.impl.TriggerWordsImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.impl.TriggerWordsImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.impl.TriggerWordsImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.impl.TriggerWordsImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.impl.TriggerWordsImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.impl.TriggerWordsImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.impl.TriggerWordsImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.impl.TriggerWordsImpl#getTriggerWord <em>Trigger Word</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriggerWordsImpl extends SuperIdentifierTypeImpl implements TriggerWords {
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
	 * The cached value of the '{@link #getTriggerWord() <em>Trigger Word</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerWord()
	 * @generated
	 * @ordered
	 */
	protected EList<TriggerWord> triggerWord;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerWordsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PackageStrategyTypesPackage.Literals.TRIGGER_WORDS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PackageStrategyTypesPackage.TRIGGER_WORDS__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PackageStrategyTypesPackage.TRIGGER_WORDS__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PackageStrategyTypesPackage.TRIGGER_WORDS__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PackageStrategyTypesPackage.TRIGGER_WORDS__TRACE_LINK, oldTraceLink, traceLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PackageStrategyTypesPackage.TRIGGER_WORDS__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PackageStrategyTypesPackage.TRIGGER_WORDS__CREATOR, oldCreator, creator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PackageStrategyTypesPackage.TRIGGER_WORDS__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TriggerWord> getTriggerWord() {
		if (triggerWord == null) {
			triggerWord = new EObjectContainmentEList<TriggerWord>(TriggerWord.class, this, PackageStrategyTypesPackage.TRIGGER_WORDS__TRIGGER_WORD);
		}
		return triggerWord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PackageStrategyTypesPackage.TRIGGER_WORDS__TRIGGER_WORD:
				return ((InternalEList<?>)getTriggerWord()).basicRemove(otherEnd, msgs);
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
			case PackageStrategyTypesPackage.TRIGGER_WORDS__DOCUMENTATION:
				return getDocumentation();
			case PackageStrategyTypesPackage.TRIGGER_WORDS__MODIFIED:
				return getModified();
			case PackageStrategyTypesPackage.TRIGGER_WORDS__MODIFIER:
				return getModifier();
			case PackageStrategyTypesPackage.TRIGGER_WORDS__TRACE_LINK:
				return getTraceLink();
			case PackageStrategyTypesPackage.TRIGGER_WORDS__CREATED:
				return getCreated();
			case PackageStrategyTypesPackage.TRIGGER_WORDS__CREATOR:
				return getCreator();
			case PackageStrategyTypesPackage.TRIGGER_WORDS__VERSION:
				return getVersion();
			case PackageStrategyTypesPackage.TRIGGER_WORDS__TRIGGER_WORD:
				return getTriggerWord();
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
			case PackageStrategyTypesPackage.TRIGGER_WORDS__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case PackageStrategyTypesPackage.TRIGGER_WORDS__MODIFIED:
				setModified((Date)newValue);
				return;
			case PackageStrategyTypesPackage.TRIGGER_WORDS__MODIFIER:
				setModifier((String)newValue);
				return;
			case PackageStrategyTypesPackage.TRIGGER_WORDS__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case PackageStrategyTypesPackage.TRIGGER_WORDS__CREATED:
				setCreated((Date)newValue);
				return;
			case PackageStrategyTypesPackage.TRIGGER_WORDS__CREATOR:
				setCreator((String)newValue);
				return;
			case PackageStrategyTypesPackage.TRIGGER_WORDS__VERSION:
				setVersion((Float)newValue);
				return;
			case PackageStrategyTypesPackage.TRIGGER_WORDS__TRIGGER_WORD:
				getTriggerWord().clear();
				getTriggerWord().addAll((Collection<? extends TriggerWord>)newValue);
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
			case PackageStrategyTypesPackage.TRIGGER_WORDS__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case PackageStrategyTypesPackage.TRIGGER_WORDS__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case PackageStrategyTypesPackage.TRIGGER_WORDS__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case PackageStrategyTypesPackage.TRIGGER_WORDS__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case PackageStrategyTypesPackage.TRIGGER_WORDS__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case PackageStrategyTypesPackage.TRIGGER_WORDS__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case PackageStrategyTypesPackage.TRIGGER_WORDS__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case PackageStrategyTypesPackage.TRIGGER_WORDS__TRIGGER_WORD:
				getTriggerWord().clear();
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
			case PackageStrategyTypesPackage.TRIGGER_WORDS__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case PackageStrategyTypesPackage.TRIGGER_WORDS__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case PackageStrategyTypesPackage.TRIGGER_WORDS__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case PackageStrategyTypesPackage.TRIGGER_WORDS__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case PackageStrategyTypesPackage.TRIGGER_WORDS__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case PackageStrategyTypesPackage.TRIGGER_WORDS__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case PackageStrategyTypesPackage.TRIGGER_WORDS__VERSION:
				return version != VERSION_EDEFAULT;
			case PackageStrategyTypesPackage.TRIGGER_WORDS__TRIGGER_WORD:
				return triggerWord != null && !triggerWord.isEmpty();
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
				case PackageStrategyTypesPackage.TRIGGER_WORDS__DOCUMENTATION: return EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;
				case PackageStrategyTypesPackage.TRIGGER_WORDS__MODIFIED: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;
				case PackageStrategyTypesPackage.TRIGGER_WORDS__MODIFIER: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;
				case PackageStrategyTypesPackage.TRIGGER_WORDS__TRACE_LINK: return EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;
				case PackageStrategyTypesPackage.TRIGGER_WORDS__CREATED: return EtypesPackage.SUPER_TRACKING_TYPE__CREATED;
				case PackageStrategyTypesPackage.TRIGGER_WORDS__CREATOR: return EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;
				case PackageStrategyTypesPackage.TRIGGER_WORDS__VERSION: return EtypesPackage.SUPER_TRACKING_TYPE__VERSION;
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
				case EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION: return PackageStrategyTypesPackage.TRIGGER_WORDS__DOCUMENTATION;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED: return PackageStrategyTypesPackage.TRIGGER_WORDS__MODIFIED;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER: return PackageStrategyTypesPackage.TRIGGER_WORDS__MODIFIER;
				case EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK: return PackageStrategyTypesPackage.TRIGGER_WORDS__TRACE_LINK;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATED: return PackageStrategyTypesPackage.TRIGGER_WORDS__CREATED;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATOR: return PackageStrategyTypesPackage.TRIGGER_WORDS__CREATOR;
				case EtypesPackage.SUPER_TRACKING_TYPE__VERSION: return PackageStrategyTypesPackage.TRIGGER_WORDS__VERSION;
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

} //TriggerWordsImpl
