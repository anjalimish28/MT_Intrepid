/**
 */
package ucof.communication.configECIC.streamTypes.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.common.enums.YesNoType;

import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.SuperTrackingType;

import ucof.common.etypes.impl.SuperIdentifierTypeImpl;

import ucof.communication.configECIC.streamTypes.DataTimestamp;
import ucof.communication.configECIC.streamTypes.StreamTypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Timestamp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.streamTypes.impl.DataTimestampImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link ucof.communication.configECIC.streamTypes.impl.DataTimestampImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link ucof.communication.configECIC.streamTypes.impl.DataTimestampImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link ucof.communication.configECIC.streamTypes.impl.DataTimestampImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link ucof.communication.configECIC.streamTypes.impl.DataTimestampImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link ucof.communication.configECIC.streamTypes.impl.DataTimestampImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link ucof.communication.configECIC.streamTypes.impl.DataTimestampImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link ucof.communication.configECIC.streamTypes.impl.DataTimestampImpl#getEnable <em>Enable</em>}</li>
 *   <li>{@link ucof.communication.configECIC.streamTypes.impl.DataTimestampImpl#getSampleDataTimestampOffset <em>Sample Data Timestamp Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTimestampImpl extends SuperIdentifierTypeImpl implements DataTimestamp {
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
	 * The default value of the '{@link #getSampleDataTimestampOffset() <em>Sample Data Timestamp Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleDataTimestampOffset()
	 * @generated
	 * @ordered
	 */
	protected static final YesNoType SAMPLE_DATA_TIMESTAMP_OFFSET_EDEFAULT = YesNoType.NOT_SET;

	/**
	 * The cached value of the '{@link #getSampleDataTimestampOffset() <em>Sample Data Timestamp Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleDataTimestampOffset()
	 * @generated
	 * @ordered
	 */
	protected YesNoType sampleDataTimestampOffset = SAMPLE_DATA_TIMESTAMP_OFFSET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTimestampImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StreamTypesPackage.Literals.DATA_TIMESTAMP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamTypesPackage.DATA_TIMESTAMP__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamTypesPackage.DATA_TIMESTAMP__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamTypesPackage.DATA_TIMESTAMP__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamTypesPackage.DATA_TIMESTAMP__TRACE_LINK, oldTraceLink, traceLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamTypesPackage.DATA_TIMESTAMP__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamTypesPackage.DATA_TIMESTAMP__CREATOR, oldCreator, creator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamTypesPackage.DATA_TIMESTAMP__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamTypesPackage.DATA_TIMESTAMP__ENABLE, oldEnable, enable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YesNoType getSampleDataTimestampOffset() {
		return sampleDataTimestampOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSampleDataTimestampOffset(YesNoType newSampleDataTimestampOffset) {
		YesNoType oldSampleDataTimestampOffset = sampleDataTimestampOffset;
		sampleDataTimestampOffset = newSampleDataTimestampOffset == null ? SAMPLE_DATA_TIMESTAMP_OFFSET_EDEFAULT : newSampleDataTimestampOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamTypesPackage.DATA_TIMESTAMP__SAMPLE_DATA_TIMESTAMP_OFFSET, oldSampleDataTimestampOffset, sampleDataTimestampOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StreamTypesPackage.DATA_TIMESTAMP__DOCUMENTATION:
				return getDocumentation();
			case StreamTypesPackage.DATA_TIMESTAMP__MODIFIED:
				return getModified();
			case StreamTypesPackage.DATA_TIMESTAMP__MODIFIER:
				return getModifier();
			case StreamTypesPackage.DATA_TIMESTAMP__TRACE_LINK:
				return getTraceLink();
			case StreamTypesPackage.DATA_TIMESTAMP__CREATED:
				return getCreated();
			case StreamTypesPackage.DATA_TIMESTAMP__CREATOR:
				return getCreator();
			case StreamTypesPackage.DATA_TIMESTAMP__VERSION:
				return getVersion();
			case StreamTypesPackage.DATA_TIMESTAMP__ENABLE:
				return getEnable();
			case StreamTypesPackage.DATA_TIMESTAMP__SAMPLE_DATA_TIMESTAMP_OFFSET:
				return getSampleDataTimestampOffset();
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
			case StreamTypesPackage.DATA_TIMESTAMP__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case StreamTypesPackage.DATA_TIMESTAMP__MODIFIED:
				setModified((Date)newValue);
				return;
			case StreamTypesPackage.DATA_TIMESTAMP__MODIFIER:
				setModifier((String)newValue);
				return;
			case StreamTypesPackage.DATA_TIMESTAMP__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case StreamTypesPackage.DATA_TIMESTAMP__CREATED:
				setCreated((Date)newValue);
				return;
			case StreamTypesPackage.DATA_TIMESTAMP__CREATOR:
				setCreator((String)newValue);
				return;
			case StreamTypesPackage.DATA_TIMESTAMP__VERSION:
				setVersion((Float)newValue);
				return;
			case StreamTypesPackage.DATA_TIMESTAMP__ENABLE:
				setEnable((YesNoType)newValue);
				return;
			case StreamTypesPackage.DATA_TIMESTAMP__SAMPLE_DATA_TIMESTAMP_OFFSET:
				setSampleDataTimestampOffset((YesNoType)newValue);
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
			case StreamTypesPackage.DATA_TIMESTAMP__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case StreamTypesPackage.DATA_TIMESTAMP__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case StreamTypesPackage.DATA_TIMESTAMP__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case StreamTypesPackage.DATA_TIMESTAMP__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case StreamTypesPackage.DATA_TIMESTAMP__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case StreamTypesPackage.DATA_TIMESTAMP__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case StreamTypesPackage.DATA_TIMESTAMP__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case StreamTypesPackage.DATA_TIMESTAMP__ENABLE:
				setEnable(ENABLE_EDEFAULT);
				return;
			case StreamTypesPackage.DATA_TIMESTAMP__SAMPLE_DATA_TIMESTAMP_OFFSET:
				setSampleDataTimestampOffset(SAMPLE_DATA_TIMESTAMP_OFFSET_EDEFAULT);
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
			case StreamTypesPackage.DATA_TIMESTAMP__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case StreamTypesPackage.DATA_TIMESTAMP__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case StreamTypesPackage.DATA_TIMESTAMP__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case StreamTypesPackage.DATA_TIMESTAMP__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case StreamTypesPackage.DATA_TIMESTAMP__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case StreamTypesPackage.DATA_TIMESTAMP__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case StreamTypesPackage.DATA_TIMESTAMP__VERSION:
				return version != VERSION_EDEFAULT;
			case StreamTypesPackage.DATA_TIMESTAMP__ENABLE:
				return enable != ENABLE_EDEFAULT;
			case StreamTypesPackage.DATA_TIMESTAMP__SAMPLE_DATA_TIMESTAMP_OFFSET:
				return sampleDataTimestampOffset != SAMPLE_DATA_TIMESTAMP_OFFSET_EDEFAULT;
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
				case StreamTypesPackage.DATA_TIMESTAMP__DOCUMENTATION: return EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;
				case StreamTypesPackage.DATA_TIMESTAMP__MODIFIED: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;
				case StreamTypesPackage.DATA_TIMESTAMP__MODIFIER: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;
				case StreamTypesPackage.DATA_TIMESTAMP__TRACE_LINK: return EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;
				case StreamTypesPackage.DATA_TIMESTAMP__CREATED: return EtypesPackage.SUPER_TRACKING_TYPE__CREATED;
				case StreamTypesPackage.DATA_TIMESTAMP__CREATOR: return EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;
				case StreamTypesPackage.DATA_TIMESTAMP__VERSION: return EtypesPackage.SUPER_TRACKING_TYPE__VERSION;
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
				case EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION: return StreamTypesPackage.DATA_TIMESTAMP__DOCUMENTATION;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED: return StreamTypesPackage.DATA_TIMESTAMP__MODIFIED;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER: return StreamTypesPackage.DATA_TIMESTAMP__MODIFIER;
				case EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK: return StreamTypesPackage.DATA_TIMESTAMP__TRACE_LINK;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATED: return StreamTypesPackage.DATA_TIMESTAMP__CREATED;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATOR: return StreamTypesPackage.DATA_TIMESTAMP__CREATOR;
				case EtypesPackage.SUPER_TRACKING_TYPE__VERSION: return StreamTypesPackage.DATA_TIMESTAMP__VERSION;
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
		result.append(", sampleDataTimestampOffset: ");
		result.append(sampleDataTimestampOffset);
		result.append(')');
		return result.toString();
	}

} //DataTimestampImpl
