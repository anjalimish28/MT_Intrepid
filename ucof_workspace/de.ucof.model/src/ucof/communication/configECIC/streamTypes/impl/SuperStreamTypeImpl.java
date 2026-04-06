/**
 */
package ucof.communication.configECIC.streamTypes.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.SuperTrackingType;

import ucof.common.etypes.impl.SuperIdentifierTypeImpl;

import ucof.communication.configECIC.streamTypes.DataTimestamp;
import ucof.communication.configECIC.streamTypes.StreamTypesPackage;
import ucof.communication.configECIC.streamTypes.SuperStreamType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Super Stream Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.streamTypes.impl.SuperStreamTypeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link ucof.communication.configECIC.streamTypes.impl.SuperStreamTypeImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link ucof.communication.configECIC.streamTypes.impl.SuperStreamTypeImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link ucof.communication.configECIC.streamTypes.impl.SuperStreamTypeImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link ucof.communication.configECIC.streamTypes.impl.SuperStreamTypeImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link ucof.communication.configECIC.streamTypes.impl.SuperStreamTypeImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link ucof.communication.configECIC.streamTypes.impl.SuperStreamTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link ucof.communication.configECIC.streamTypes.impl.SuperStreamTypeImpl#getSampleMaxNumber <em>Sample Max Number</em>}</li>
 *   <li>{@link ucof.communication.configECIC.streamTypes.impl.SuperStreamTypeImpl#getIcd <em>Icd</em>}</li>
 *   <li>{@link ucof.communication.configECIC.streamTypes.impl.SuperStreamTypeImpl#getDataTimestamp <em>Data Timestamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SuperStreamTypeImpl extends SuperIdentifierTypeImpl implements SuperStreamType {
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
	 * The default value of the '{@link #getSampleMaxNumber() <em>Sample Max Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleMaxNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SAMPLE_MAX_NUMBER_EDEFAULT = new Integer(1);

	/**
	 * The cached value of the '{@link #getSampleMaxNumber() <em>Sample Max Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleMaxNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer sampleMaxNumber = SAMPLE_MAX_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getIcd() <em>Icd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcd()
	 * @generated
	 * @ordered
	 */
	protected static final String ICD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIcd() <em>Icd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcd()
	 * @generated
	 * @ordered
	 */
	protected String icd = ICD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataTimestamp() <em>Data Timestamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTimestamp()
	 * @generated
	 * @ordered
	 */
	protected DataTimestamp dataTimestamp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperStreamTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StreamTypesPackage.Literals.SUPER_STREAM_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamTypesPackage.SUPER_STREAM_TYPE__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamTypesPackage.SUPER_STREAM_TYPE__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamTypesPackage.SUPER_STREAM_TYPE__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamTypesPackage.SUPER_STREAM_TYPE__TRACE_LINK, oldTraceLink, traceLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamTypesPackage.SUPER_STREAM_TYPE__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamTypesPackage.SUPER_STREAM_TYPE__CREATOR, oldCreator, creator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamTypesPackage.SUPER_STREAM_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSampleMaxNumber() {
		return sampleMaxNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSampleMaxNumber(Integer newSampleMaxNumber) {
		Integer oldSampleMaxNumber = sampleMaxNumber;
		sampleMaxNumber = newSampleMaxNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamTypesPackage.SUPER_STREAM_TYPE__SAMPLE_MAX_NUMBER, oldSampleMaxNumber, sampleMaxNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIcd() {
		return icd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcd(String newIcd) {
		String oldIcd = icd;
		icd = newIcd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamTypesPackage.SUPER_STREAM_TYPE__ICD, oldIcd, icd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTimestamp getDataTimestamp() {
		return dataTimestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataTimestamp(DataTimestamp newDataTimestamp, NotificationChain msgs) {
		DataTimestamp oldDataTimestamp = dataTimestamp;
		dataTimestamp = newDataTimestamp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StreamTypesPackage.SUPER_STREAM_TYPE__DATA_TIMESTAMP, oldDataTimestamp, newDataTimestamp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataTimestamp(DataTimestamp newDataTimestamp) {
		if (newDataTimestamp != dataTimestamp) {
			NotificationChain msgs = null;
			if (dataTimestamp != null)
				msgs = ((InternalEObject)dataTimestamp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StreamTypesPackage.SUPER_STREAM_TYPE__DATA_TIMESTAMP, null, msgs);
			if (newDataTimestamp != null)
				msgs = ((InternalEObject)newDataTimestamp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StreamTypesPackage.SUPER_STREAM_TYPE__DATA_TIMESTAMP, null, msgs);
			msgs = basicSetDataTimestamp(newDataTimestamp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamTypesPackage.SUPER_STREAM_TYPE__DATA_TIMESTAMP, newDataTimestamp, newDataTimestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StreamTypesPackage.SUPER_STREAM_TYPE__DATA_TIMESTAMP:
				return basicSetDataTimestamp(null, msgs);
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
			case StreamTypesPackage.SUPER_STREAM_TYPE__DOCUMENTATION:
				return getDocumentation();
			case StreamTypesPackage.SUPER_STREAM_TYPE__MODIFIED:
				return getModified();
			case StreamTypesPackage.SUPER_STREAM_TYPE__MODIFIER:
				return getModifier();
			case StreamTypesPackage.SUPER_STREAM_TYPE__TRACE_LINK:
				return getTraceLink();
			case StreamTypesPackage.SUPER_STREAM_TYPE__CREATED:
				return getCreated();
			case StreamTypesPackage.SUPER_STREAM_TYPE__CREATOR:
				return getCreator();
			case StreamTypesPackage.SUPER_STREAM_TYPE__VERSION:
				return getVersion();
			case StreamTypesPackage.SUPER_STREAM_TYPE__SAMPLE_MAX_NUMBER:
				return getSampleMaxNumber();
			case StreamTypesPackage.SUPER_STREAM_TYPE__ICD:
				return getIcd();
			case StreamTypesPackage.SUPER_STREAM_TYPE__DATA_TIMESTAMP:
				return getDataTimestamp();
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
			case StreamTypesPackage.SUPER_STREAM_TYPE__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case StreamTypesPackage.SUPER_STREAM_TYPE__MODIFIED:
				setModified((Date)newValue);
				return;
			case StreamTypesPackage.SUPER_STREAM_TYPE__MODIFIER:
				setModifier((String)newValue);
				return;
			case StreamTypesPackage.SUPER_STREAM_TYPE__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case StreamTypesPackage.SUPER_STREAM_TYPE__CREATED:
				setCreated((Date)newValue);
				return;
			case StreamTypesPackage.SUPER_STREAM_TYPE__CREATOR:
				setCreator((String)newValue);
				return;
			case StreamTypesPackage.SUPER_STREAM_TYPE__VERSION:
				setVersion((Float)newValue);
				return;
			case StreamTypesPackage.SUPER_STREAM_TYPE__SAMPLE_MAX_NUMBER:
				setSampleMaxNumber((Integer)newValue);
				return;
			case StreamTypesPackage.SUPER_STREAM_TYPE__ICD:
				setIcd((String)newValue);
				return;
			case StreamTypesPackage.SUPER_STREAM_TYPE__DATA_TIMESTAMP:
				setDataTimestamp((DataTimestamp)newValue);
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
			case StreamTypesPackage.SUPER_STREAM_TYPE__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case StreamTypesPackage.SUPER_STREAM_TYPE__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case StreamTypesPackage.SUPER_STREAM_TYPE__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case StreamTypesPackage.SUPER_STREAM_TYPE__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case StreamTypesPackage.SUPER_STREAM_TYPE__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case StreamTypesPackage.SUPER_STREAM_TYPE__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case StreamTypesPackage.SUPER_STREAM_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case StreamTypesPackage.SUPER_STREAM_TYPE__SAMPLE_MAX_NUMBER:
				setSampleMaxNumber(SAMPLE_MAX_NUMBER_EDEFAULT);
				return;
			case StreamTypesPackage.SUPER_STREAM_TYPE__ICD:
				setIcd(ICD_EDEFAULT);
				return;
			case StreamTypesPackage.SUPER_STREAM_TYPE__DATA_TIMESTAMP:
				setDataTimestamp((DataTimestamp)null);
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
			case StreamTypesPackage.SUPER_STREAM_TYPE__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case StreamTypesPackage.SUPER_STREAM_TYPE__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case StreamTypesPackage.SUPER_STREAM_TYPE__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case StreamTypesPackage.SUPER_STREAM_TYPE__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case StreamTypesPackage.SUPER_STREAM_TYPE__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case StreamTypesPackage.SUPER_STREAM_TYPE__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case StreamTypesPackage.SUPER_STREAM_TYPE__VERSION:
				return version != VERSION_EDEFAULT;
			case StreamTypesPackage.SUPER_STREAM_TYPE__SAMPLE_MAX_NUMBER:
				return SAMPLE_MAX_NUMBER_EDEFAULT == null ? sampleMaxNumber != null : !SAMPLE_MAX_NUMBER_EDEFAULT.equals(sampleMaxNumber);
			case StreamTypesPackage.SUPER_STREAM_TYPE__ICD:
				return ICD_EDEFAULT == null ? icd != null : !ICD_EDEFAULT.equals(icd);
			case StreamTypesPackage.SUPER_STREAM_TYPE__DATA_TIMESTAMP:
				return dataTimestamp != null;
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
				case StreamTypesPackage.SUPER_STREAM_TYPE__DOCUMENTATION: return EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;
				case StreamTypesPackage.SUPER_STREAM_TYPE__MODIFIED: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;
				case StreamTypesPackage.SUPER_STREAM_TYPE__MODIFIER: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;
				case StreamTypesPackage.SUPER_STREAM_TYPE__TRACE_LINK: return EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;
				case StreamTypesPackage.SUPER_STREAM_TYPE__CREATED: return EtypesPackage.SUPER_TRACKING_TYPE__CREATED;
				case StreamTypesPackage.SUPER_STREAM_TYPE__CREATOR: return EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;
				case StreamTypesPackage.SUPER_STREAM_TYPE__VERSION: return EtypesPackage.SUPER_TRACKING_TYPE__VERSION;
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
				case EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION: return StreamTypesPackage.SUPER_STREAM_TYPE__DOCUMENTATION;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED: return StreamTypesPackage.SUPER_STREAM_TYPE__MODIFIED;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER: return StreamTypesPackage.SUPER_STREAM_TYPE__MODIFIER;
				case EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK: return StreamTypesPackage.SUPER_STREAM_TYPE__TRACE_LINK;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATED: return StreamTypesPackage.SUPER_STREAM_TYPE__CREATED;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATOR: return StreamTypesPackage.SUPER_STREAM_TYPE__CREATOR;
				case EtypesPackage.SUPER_TRACKING_TYPE__VERSION: return StreamTypesPackage.SUPER_STREAM_TYPE__VERSION;
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
		result.append(", sampleMaxNumber: ");
		result.append(sampleMaxNumber);
		result.append(", icd: ");
		result.append(icd);
		result.append(')');
		return result.toString();
	}

} //SuperStreamTypeImpl
