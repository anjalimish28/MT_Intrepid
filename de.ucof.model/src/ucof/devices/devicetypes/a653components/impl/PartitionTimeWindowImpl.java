/**
 */
package ucof.devices.devicetypes.a653components.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ucof.common.enums.booleanType;
import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.SuperTrackingType;

import ucof.common.etypes.impl.SuperIdentifierTypeImpl;

import ucof.devices.devicetypes.a653components.A653componentsPackage;
import ucof.devices.devicetypes.a653components.PartitionTimeWindow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partition Time Window</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.devicetypes.a653components.impl.PartitionTimeWindowImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.impl.PartitionTimeWindowImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.impl.PartitionTimeWindowImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.impl.PartitionTimeWindowImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.impl.PartitionTimeWindowImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.impl.PartitionTimeWindowImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.impl.PartitionTimeWindowImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.impl.PartitionTimeWindowImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.impl.PartitionTimeWindowImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.impl.PartitionTimeWindowImpl#getPeriodicProcessingStart <em>Periodic Processing Start</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.impl.PartitionTimeWindowImpl#getPartitionOrPortID <em>Partition Or Port ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartitionTimeWindowImpl extends SuperIdentifierTypeImpl implements PartitionTimeWindow {
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
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final String DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected String duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final String OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected String offset = OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriodicProcessingStart() <em>Periodic Processing Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodicProcessingStart()
	 * @generated
	 * @ordered
	 */
	protected static final booleanType PERIODIC_PROCESSING_START_EDEFAULT = booleanType.NOT_SET;

	/**
	 * The cached value of the '{@link #getPeriodicProcessingStart() <em>Periodic Processing Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodicProcessingStart()
	 * @generated
	 * @ordered
	 */
	protected booleanType periodicProcessingStart = PERIODIC_PROCESSING_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartitionOrPortID() <em>Partition Or Port ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionOrPortID()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTITION_OR_PORT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartitionOrPortID() <em>Partition Or Port ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionOrPortID()
	 * @generated
	 * @ordered
	 */
	protected String partitionOrPortID = PARTITION_OR_PORT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartitionTimeWindowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A653componentsPackage.Literals.PARTITION_TIME_WINDOW;
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
			eNotify(new ENotificationImpl(this, Notification.SET, A653componentsPackage.PARTITION_TIME_WINDOW__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, A653componentsPackage.PARTITION_TIME_WINDOW__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, A653componentsPackage.PARTITION_TIME_WINDOW__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, A653componentsPackage.PARTITION_TIME_WINDOW__TRACE_LINK, oldTraceLink, traceLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, A653componentsPackage.PARTITION_TIME_WINDOW__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, A653componentsPackage.PARTITION_TIME_WINDOW__CREATOR, oldCreator, creator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, A653componentsPackage.PARTITION_TIME_WINDOW__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(String newDuration) {
		String oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A653componentsPackage.PARTITION_TIME_WINDOW__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(String newOffset) {
		String oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A653componentsPackage.PARTITION_TIME_WINDOW__OFFSET, oldOffset, offset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public booleanType getPeriodicProcessingStart() {
		return periodicProcessingStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriodicProcessingStart(booleanType newPeriodicProcessingStart) {
		booleanType oldPeriodicProcessingStart = periodicProcessingStart;
		periodicProcessingStart = newPeriodicProcessingStart == null ? PERIODIC_PROCESSING_START_EDEFAULT : newPeriodicProcessingStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A653componentsPackage.PARTITION_TIME_WINDOW__PERIODIC_PROCESSING_START, oldPeriodicProcessingStart, periodicProcessingStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPartitionOrPortID() {
		return partitionOrPortID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartitionOrPortID(String newPartitionOrPortID) {
		String oldPartitionOrPortID = partitionOrPortID;
		partitionOrPortID = newPartitionOrPortID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A653componentsPackage.PARTITION_TIME_WINDOW__PARTITION_OR_PORT_ID, oldPartitionOrPortID, partitionOrPortID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case A653componentsPackage.PARTITION_TIME_WINDOW__DOCUMENTATION:
				return getDocumentation();
			case A653componentsPackage.PARTITION_TIME_WINDOW__MODIFIED:
				return getModified();
			case A653componentsPackage.PARTITION_TIME_WINDOW__MODIFIER:
				return getModifier();
			case A653componentsPackage.PARTITION_TIME_WINDOW__TRACE_LINK:
				return getTraceLink();
			case A653componentsPackage.PARTITION_TIME_WINDOW__CREATED:
				return getCreated();
			case A653componentsPackage.PARTITION_TIME_WINDOW__CREATOR:
				return getCreator();
			case A653componentsPackage.PARTITION_TIME_WINDOW__VERSION:
				return getVersion();
			case A653componentsPackage.PARTITION_TIME_WINDOW__DURATION:
				return getDuration();
			case A653componentsPackage.PARTITION_TIME_WINDOW__OFFSET:
				return getOffset();
			case A653componentsPackage.PARTITION_TIME_WINDOW__PERIODIC_PROCESSING_START:
				return getPeriodicProcessingStart();
			case A653componentsPackage.PARTITION_TIME_WINDOW__PARTITION_OR_PORT_ID:
				return getPartitionOrPortID();
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
			case A653componentsPackage.PARTITION_TIME_WINDOW__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case A653componentsPackage.PARTITION_TIME_WINDOW__MODIFIED:
				setModified((Date)newValue);
				return;
			case A653componentsPackage.PARTITION_TIME_WINDOW__MODIFIER:
				setModifier((String)newValue);
				return;
			case A653componentsPackage.PARTITION_TIME_WINDOW__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case A653componentsPackage.PARTITION_TIME_WINDOW__CREATED:
				setCreated((Date)newValue);
				return;
			case A653componentsPackage.PARTITION_TIME_WINDOW__CREATOR:
				setCreator((String)newValue);
				return;
			case A653componentsPackage.PARTITION_TIME_WINDOW__VERSION:
				setVersion((Float)newValue);
				return;
			case A653componentsPackage.PARTITION_TIME_WINDOW__DURATION:
				setDuration((String)newValue);
				return;
			case A653componentsPackage.PARTITION_TIME_WINDOW__OFFSET:
				setOffset((String)newValue);
				return;
			case A653componentsPackage.PARTITION_TIME_WINDOW__PERIODIC_PROCESSING_START:
				setPeriodicProcessingStart((booleanType)newValue);
				return;
			case A653componentsPackage.PARTITION_TIME_WINDOW__PARTITION_OR_PORT_ID:
				setPartitionOrPortID((String)newValue);
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
			case A653componentsPackage.PARTITION_TIME_WINDOW__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case A653componentsPackage.PARTITION_TIME_WINDOW__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case A653componentsPackage.PARTITION_TIME_WINDOW__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case A653componentsPackage.PARTITION_TIME_WINDOW__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case A653componentsPackage.PARTITION_TIME_WINDOW__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case A653componentsPackage.PARTITION_TIME_WINDOW__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case A653componentsPackage.PARTITION_TIME_WINDOW__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case A653componentsPackage.PARTITION_TIME_WINDOW__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case A653componentsPackage.PARTITION_TIME_WINDOW__OFFSET:
				setOffset(OFFSET_EDEFAULT);
				return;
			case A653componentsPackage.PARTITION_TIME_WINDOW__PERIODIC_PROCESSING_START:
				setPeriodicProcessingStart(PERIODIC_PROCESSING_START_EDEFAULT);
				return;
			case A653componentsPackage.PARTITION_TIME_WINDOW__PARTITION_OR_PORT_ID:
				setPartitionOrPortID(PARTITION_OR_PORT_ID_EDEFAULT);
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
			case A653componentsPackage.PARTITION_TIME_WINDOW__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case A653componentsPackage.PARTITION_TIME_WINDOW__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case A653componentsPackage.PARTITION_TIME_WINDOW__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case A653componentsPackage.PARTITION_TIME_WINDOW__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case A653componentsPackage.PARTITION_TIME_WINDOW__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case A653componentsPackage.PARTITION_TIME_WINDOW__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case A653componentsPackage.PARTITION_TIME_WINDOW__VERSION:
				return version != VERSION_EDEFAULT;
			case A653componentsPackage.PARTITION_TIME_WINDOW__DURATION:
				return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
			case A653componentsPackage.PARTITION_TIME_WINDOW__OFFSET:
				return OFFSET_EDEFAULT == null ? offset != null : !OFFSET_EDEFAULT.equals(offset);
			case A653componentsPackage.PARTITION_TIME_WINDOW__PERIODIC_PROCESSING_START:
				return periodicProcessingStart != PERIODIC_PROCESSING_START_EDEFAULT;
			case A653componentsPackage.PARTITION_TIME_WINDOW__PARTITION_OR_PORT_ID:
				return PARTITION_OR_PORT_ID_EDEFAULT == null ? partitionOrPortID != null : !PARTITION_OR_PORT_ID_EDEFAULT.equals(partitionOrPortID);
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
				case A653componentsPackage.PARTITION_TIME_WINDOW__DOCUMENTATION: return EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;
				case A653componentsPackage.PARTITION_TIME_WINDOW__MODIFIED: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;
				case A653componentsPackage.PARTITION_TIME_WINDOW__MODIFIER: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;
				case A653componentsPackage.PARTITION_TIME_WINDOW__TRACE_LINK: return EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;
				case A653componentsPackage.PARTITION_TIME_WINDOW__CREATED: return EtypesPackage.SUPER_TRACKING_TYPE__CREATED;
				case A653componentsPackage.PARTITION_TIME_WINDOW__CREATOR: return EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;
				case A653componentsPackage.PARTITION_TIME_WINDOW__VERSION: return EtypesPackage.SUPER_TRACKING_TYPE__VERSION;
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
				case EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION: return A653componentsPackage.PARTITION_TIME_WINDOW__DOCUMENTATION;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED: return A653componentsPackage.PARTITION_TIME_WINDOW__MODIFIED;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER: return A653componentsPackage.PARTITION_TIME_WINDOW__MODIFIER;
				case EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK: return A653componentsPackage.PARTITION_TIME_WINDOW__TRACE_LINK;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATED: return A653componentsPackage.PARTITION_TIME_WINDOW__CREATED;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATOR: return A653componentsPackage.PARTITION_TIME_WINDOW__CREATOR;
				case EtypesPackage.SUPER_TRACKING_TYPE__VERSION: return A653componentsPackage.PARTITION_TIME_WINDOW__VERSION;
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
		result.append(", duration: ");
		result.append(duration);
		result.append(", offset: ");
		result.append(offset);
		result.append(", periodicProcessingStart: ");
		result.append(periodicProcessingStart);
		result.append(", partitionOrPortID: ");
		result.append(partitionOrPortID);
		result.append(')');
		return result.toString();
	}

} //PartitionTimeWindowImpl
