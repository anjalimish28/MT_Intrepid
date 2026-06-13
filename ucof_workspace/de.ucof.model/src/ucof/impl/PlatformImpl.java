/**
 */
package ucof.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import targets.Targets;

import ucof.Platform;
import ucof.UcofPackage;

import ucof.assignments.Assignments;

import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.SuperTrackingType;

import ucof.common.etypes.impl.SuperIdentifierTypeImpl;

import ucof.communication.Communication;

import ucof.devices.Devices;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.impl.PlatformImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link ucof.impl.PlatformImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link ucof.impl.PlatformImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link ucof.impl.PlatformImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link ucof.impl.PlatformImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link ucof.impl.PlatformImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link ucof.impl.PlatformImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link ucof.impl.PlatformImpl#getDevices <em>Devices</em>}</li>
 *   <li>{@link ucof.impl.PlatformImpl#getCommunication <em>Communication</em>}</li>
 *   <li>{@link ucof.impl.PlatformImpl#getAssignments <em>Assignments</em>}</li>
 *   <li>{@link ucof.impl.PlatformImpl#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlatformImpl extends SuperIdentifierTypeImpl implements Platform {
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
	 * The cached value of the '{@link #getDevices() <em>Devices</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevices()
	 * @generated
	 * @ordered
	 */
	protected Devices devices;

	/**
	 * The cached value of the '{@link #getCommunication() <em>Communication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunication()
	 * @generated
	 * @ordered
	 */
	protected Communication communication;

	/**
	 * The cached value of the '{@link #getAssignments() <em>Assignments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignments()
	 * @generated
	 * @ordered
	 */
	protected Assignments assignments;

	/**
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected Targets targets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UcofPackage.Literals.PLATFORM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UcofPackage.PLATFORM__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UcofPackage.PLATFORM__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UcofPackage.PLATFORM__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UcofPackage.PLATFORM__TRACE_LINK, oldTraceLink, traceLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UcofPackage.PLATFORM__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UcofPackage.PLATFORM__CREATOR, oldCreator, creator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UcofPackage.PLATFORM__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Devices getDevices() {
		return devices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevices(Devices newDevices, NotificationChain msgs) {
		Devices oldDevices = devices;
		devices = newDevices;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UcofPackage.PLATFORM__DEVICES, oldDevices, newDevices);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevices(Devices newDevices) {
		if (newDevices != devices) {
			NotificationChain msgs = null;
			if (devices != null)
				msgs = ((InternalEObject)devices).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UcofPackage.PLATFORM__DEVICES, null, msgs);
			if (newDevices != null)
				msgs = ((InternalEObject)newDevices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UcofPackage.PLATFORM__DEVICES, null, msgs);
			msgs = basicSetDevices(newDevices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UcofPackage.PLATFORM__DEVICES, newDevices, newDevices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Communication getCommunication() {
		return communication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommunication(Communication newCommunication, NotificationChain msgs) {
		Communication oldCommunication = communication;
		communication = newCommunication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UcofPackage.PLATFORM__COMMUNICATION, oldCommunication, newCommunication);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunication(Communication newCommunication) {
		if (newCommunication != communication) {
			NotificationChain msgs = null;
			if (communication != null)
				msgs = ((InternalEObject)communication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UcofPackage.PLATFORM__COMMUNICATION, null, msgs);
			if (newCommunication != null)
				msgs = ((InternalEObject)newCommunication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UcofPackage.PLATFORM__COMMUNICATION, null, msgs);
			msgs = basicSetCommunication(newCommunication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UcofPackage.PLATFORM__COMMUNICATION, newCommunication, newCommunication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignments getAssignments() {
		return assignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssignments(Assignments newAssignments, NotificationChain msgs) {
		Assignments oldAssignments = assignments;
		assignments = newAssignments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UcofPackage.PLATFORM__ASSIGNMENTS, oldAssignments, newAssignments);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignments(Assignments newAssignments) {
		if (newAssignments != assignments) {
			NotificationChain msgs = null;
			if (assignments != null)
				msgs = ((InternalEObject)assignments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UcofPackage.PLATFORM__ASSIGNMENTS, null, msgs);
			if (newAssignments != null)
				msgs = ((InternalEObject)newAssignments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UcofPackage.PLATFORM__ASSIGNMENTS, null, msgs);
			msgs = basicSetAssignments(newAssignments, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UcofPackage.PLATFORM__ASSIGNMENTS, newAssignments, newAssignments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Targets getTargets() {
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargets(Targets newTargets, NotificationChain msgs) {
		Targets oldTargets = targets;
		targets = newTargets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UcofPackage.PLATFORM__TARGETS, oldTargets, newTargets);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargets(Targets newTargets) {
		if (newTargets != targets) {
			NotificationChain msgs = null;
			if (targets != null)
				msgs = ((InternalEObject)targets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UcofPackage.PLATFORM__TARGETS, null, msgs);
			if (newTargets != null)
				msgs = ((InternalEObject)newTargets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UcofPackage.PLATFORM__TARGETS, null, msgs);
			msgs = basicSetTargets(newTargets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UcofPackage.PLATFORM__TARGETS, newTargets, newTargets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UcofPackage.PLATFORM__DEVICES:
				return basicSetDevices(null, msgs);
			case UcofPackage.PLATFORM__COMMUNICATION:
				return basicSetCommunication(null, msgs);
			case UcofPackage.PLATFORM__ASSIGNMENTS:
				return basicSetAssignments(null, msgs);
			case UcofPackage.PLATFORM__TARGETS:
				return basicSetTargets(null, msgs);
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
			case UcofPackage.PLATFORM__DOCUMENTATION:
				return getDocumentation();
			case UcofPackage.PLATFORM__MODIFIED:
				return getModified();
			case UcofPackage.PLATFORM__MODIFIER:
				return getModifier();
			case UcofPackage.PLATFORM__TRACE_LINK:
				return getTraceLink();
			case UcofPackage.PLATFORM__CREATED:
				return getCreated();
			case UcofPackage.PLATFORM__CREATOR:
				return getCreator();
			case UcofPackage.PLATFORM__VERSION:
				return getVersion();
			case UcofPackage.PLATFORM__DEVICES:
				return getDevices();
			case UcofPackage.PLATFORM__COMMUNICATION:
				return getCommunication();
			case UcofPackage.PLATFORM__ASSIGNMENTS:
				return getAssignments();
			case UcofPackage.PLATFORM__TARGETS:
				return getTargets();
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
			case UcofPackage.PLATFORM__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case UcofPackage.PLATFORM__MODIFIED:
				setModified((Date)newValue);
				return;
			case UcofPackage.PLATFORM__MODIFIER:
				setModifier((String)newValue);
				return;
			case UcofPackage.PLATFORM__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case UcofPackage.PLATFORM__CREATED:
				setCreated((Date)newValue);
				return;
			case UcofPackage.PLATFORM__CREATOR:
				setCreator((String)newValue);
				return;
			case UcofPackage.PLATFORM__VERSION:
				setVersion((Float)newValue);
				return;
			case UcofPackage.PLATFORM__DEVICES:
				setDevices((Devices)newValue);
				return;
			case UcofPackage.PLATFORM__COMMUNICATION:
				setCommunication((Communication)newValue);
				return;
			case UcofPackage.PLATFORM__ASSIGNMENTS:
				setAssignments((Assignments)newValue);
				return;
			case UcofPackage.PLATFORM__TARGETS:
				setTargets((Targets)newValue);
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
			case UcofPackage.PLATFORM__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case UcofPackage.PLATFORM__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case UcofPackage.PLATFORM__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case UcofPackage.PLATFORM__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case UcofPackage.PLATFORM__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case UcofPackage.PLATFORM__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case UcofPackage.PLATFORM__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case UcofPackage.PLATFORM__DEVICES:
				setDevices((Devices)null);
				return;
			case UcofPackage.PLATFORM__COMMUNICATION:
				setCommunication((Communication)null);
				return;
			case UcofPackage.PLATFORM__ASSIGNMENTS:
				setAssignments((Assignments)null);
				return;
			case UcofPackage.PLATFORM__TARGETS:
				setTargets((Targets)null);
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
			case UcofPackage.PLATFORM__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case UcofPackage.PLATFORM__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case UcofPackage.PLATFORM__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case UcofPackage.PLATFORM__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case UcofPackage.PLATFORM__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case UcofPackage.PLATFORM__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case UcofPackage.PLATFORM__VERSION:
				return version != VERSION_EDEFAULT;
			case UcofPackage.PLATFORM__DEVICES:
				return devices != null;
			case UcofPackage.PLATFORM__COMMUNICATION:
				return communication != null;
			case UcofPackage.PLATFORM__ASSIGNMENTS:
				return assignments != null;
			case UcofPackage.PLATFORM__TARGETS:
				return targets != null;
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
				case UcofPackage.PLATFORM__DOCUMENTATION: return EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;
				case UcofPackage.PLATFORM__MODIFIED: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;
				case UcofPackage.PLATFORM__MODIFIER: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;
				case UcofPackage.PLATFORM__TRACE_LINK: return EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;
				case UcofPackage.PLATFORM__CREATED: return EtypesPackage.SUPER_TRACKING_TYPE__CREATED;
				case UcofPackage.PLATFORM__CREATOR: return EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;
				case UcofPackage.PLATFORM__VERSION: return EtypesPackage.SUPER_TRACKING_TYPE__VERSION;
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
				case EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION: return UcofPackage.PLATFORM__DOCUMENTATION;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED: return UcofPackage.PLATFORM__MODIFIED;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER: return UcofPackage.PLATFORM__MODIFIER;
				case EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK: return UcofPackage.PLATFORM__TRACE_LINK;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATED: return UcofPackage.PLATFORM__CREATED;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATOR: return UcofPackage.PLATFORM__CREATOR;
				case EtypesPackage.SUPER_TRACKING_TYPE__VERSION: return UcofPackage.PLATFORM__VERSION;
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

} //PlatformImpl
