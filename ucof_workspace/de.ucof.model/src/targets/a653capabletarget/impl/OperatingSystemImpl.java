/**
 */
package targets.a653capabletarget.impl;

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import targets.a653capabletarget.A653capabletargetPackage;
import targets.a653capabletarget.OperatingSystem;

import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.Memory;

import ucof.common.etypes.SuperTrackingType;
import ucof.common.etypes.impl.SuperIdentifierTypeImpl;
import ucof.devices.devicetypes.a653components.a653partition.Processes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operating System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.a653capabletarget.impl.OperatingSystemImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link targets.a653capabletarget.impl.OperatingSystemImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link targets.a653capabletarget.impl.OperatingSystemImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link targets.a653capabletarget.impl.OperatingSystemImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link targets.a653capabletarget.impl.OperatingSystemImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link targets.a653capabletarget.impl.OperatingSystemImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link targets.a653capabletarget.impl.OperatingSystemImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link targets.a653capabletarget.impl.OperatingSystemImpl#getMemory <em>Memory</em>}</li>
 *   <li>{@link targets.a653capabletarget.impl.OperatingSystemImpl#getProcesses <em>Processes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperatingSystemImpl extends SuperIdentifierTypeImpl implements OperatingSystem {
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
	 * The cached value of the '{@link #getMemory() <em>Memory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected Memory memory;

	/**
	 * The cached value of the '{@link #getProcesses() <em>Processes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcesses()
	 * @generated
	 * @ordered
	 */
	protected Processes processes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatingSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A653capabletargetPackage.Literals.OPERATING_SYSTEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, A653capabletargetPackage.OPERATING_SYSTEM__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, A653capabletargetPackage.OPERATING_SYSTEM__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, A653capabletargetPackage.OPERATING_SYSTEM__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, A653capabletargetPackage.OPERATING_SYSTEM__TRACE_LINK, oldTraceLink, traceLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, A653capabletargetPackage.OPERATING_SYSTEM__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, A653capabletargetPackage.OPERATING_SYSTEM__CREATOR, oldCreator, creator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, A653capabletargetPackage.OPERATING_SYSTEM__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Memory getMemory() {
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemory(Memory newMemory, NotificationChain msgs) {
		Memory oldMemory = memory;
		memory = newMemory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, A653capabletargetPackage.OPERATING_SYSTEM__MEMORY, oldMemory, newMemory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemory(Memory newMemory) {
		if (newMemory != memory) {
			NotificationChain msgs = null;
			if (memory != null)
				msgs = ((InternalEObject)memory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - A653capabletargetPackage.OPERATING_SYSTEM__MEMORY, null, msgs);
			if (newMemory != null)
				msgs = ((InternalEObject)newMemory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - A653capabletargetPackage.OPERATING_SYSTEM__MEMORY, null, msgs);
			msgs = basicSetMemory(newMemory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A653capabletargetPackage.OPERATING_SYSTEM__MEMORY, newMemory, newMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processes getProcesses() {
		return processes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcesses(Processes newProcesses, NotificationChain msgs) {
		Processes oldProcesses = processes;
		processes = newProcesses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, A653capabletargetPackage.OPERATING_SYSTEM__PROCESSES, oldProcesses, newProcesses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcesses(Processes newProcesses) {
		if (newProcesses != processes) {
			NotificationChain msgs = null;
			if (processes != null)
				msgs = ((InternalEObject)processes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - A653capabletargetPackage.OPERATING_SYSTEM__PROCESSES, null, msgs);
			if (newProcesses != null)
				msgs = ((InternalEObject)newProcesses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - A653capabletargetPackage.OPERATING_SYSTEM__PROCESSES, null, msgs);
			msgs = basicSetProcesses(newProcesses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A653capabletargetPackage.OPERATING_SYSTEM__PROCESSES, newProcesses, newProcesses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case A653capabletargetPackage.OPERATING_SYSTEM__MEMORY:
				return basicSetMemory(null, msgs);
			case A653capabletargetPackage.OPERATING_SYSTEM__PROCESSES:
				return basicSetProcesses(null, msgs);
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
			case A653capabletargetPackage.OPERATING_SYSTEM__DOCUMENTATION:
				return getDocumentation();
			case A653capabletargetPackage.OPERATING_SYSTEM__MODIFIED:
				return getModified();
			case A653capabletargetPackage.OPERATING_SYSTEM__MODIFIER:
				return getModifier();
			case A653capabletargetPackage.OPERATING_SYSTEM__TRACE_LINK:
				return getTraceLink();
			case A653capabletargetPackage.OPERATING_SYSTEM__CREATED:
				return getCreated();
			case A653capabletargetPackage.OPERATING_SYSTEM__CREATOR:
				return getCreator();
			case A653capabletargetPackage.OPERATING_SYSTEM__VERSION:
				return getVersion();
			case A653capabletargetPackage.OPERATING_SYSTEM__MEMORY:
				return getMemory();
			case A653capabletargetPackage.OPERATING_SYSTEM__PROCESSES:
				return getProcesses();
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
			case A653capabletargetPackage.OPERATING_SYSTEM__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case A653capabletargetPackage.OPERATING_SYSTEM__MODIFIED:
				setModified((Date)newValue);
				return;
			case A653capabletargetPackage.OPERATING_SYSTEM__MODIFIER:
				setModifier((String)newValue);
				return;
			case A653capabletargetPackage.OPERATING_SYSTEM__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case A653capabletargetPackage.OPERATING_SYSTEM__CREATED:
				setCreated((Date)newValue);
				return;
			case A653capabletargetPackage.OPERATING_SYSTEM__CREATOR:
				setCreator((String)newValue);
				return;
			case A653capabletargetPackage.OPERATING_SYSTEM__VERSION:
				setVersion((Float)newValue);
				return;
			case A653capabletargetPackage.OPERATING_SYSTEM__MEMORY:
				setMemory((Memory)newValue);
				return;
			case A653capabletargetPackage.OPERATING_SYSTEM__PROCESSES:
				setProcesses((Processes)newValue);
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
			case A653capabletargetPackage.OPERATING_SYSTEM__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case A653capabletargetPackage.OPERATING_SYSTEM__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case A653capabletargetPackage.OPERATING_SYSTEM__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case A653capabletargetPackage.OPERATING_SYSTEM__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case A653capabletargetPackage.OPERATING_SYSTEM__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case A653capabletargetPackage.OPERATING_SYSTEM__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case A653capabletargetPackage.OPERATING_SYSTEM__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case A653capabletargetPackage.OPERATING_SYSTEM__MEMORY:
				setMemory((Memory)null);
				return;
			case A653capabletargetPackage.OPERATING_SYSTEM__PROCESSES:
				setProcesses((Processes)null);
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
			case A653capabletargetPackage.OPERATING_SYSTEM__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case A653capabletargetPackage.OPERATING_SYSTEM__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case A653capabletargetPackage.OPERATING_SYSTEM__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case A653capabletargetPackage.OPERATING_SYSTEM__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case A653capabletargetPackage.OPERATING_SYSTEM__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case A653capabletargetPackage.OPERATING_SYSTEM__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case A653capabletargetPackage.OPERATING_SYSTEM__VERSION:
				return version != VERSION_EDEFAULT;
			case A653capabletargetPackage.OPERATING_SYSTEM__MEMORY:
				return memory != null;
			case A653capabletargetPackage.OPERATING_SYSTEM__PROCESSES:
				return processes != null;
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
				case A653capabletargetPackage.OPERATING_SYSTEM__DOCUMENTATION: return EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;
				case A653capabletargetPackage.OPERATING_SYSTEM__MODIFIED: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;
				case A653capabletargetPackage.OPERATING_SYSTEM__MODIFIER: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;
				case A653capabletargetPackage.OPERATING_SYSTEM__TRACE_LINK: return EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;
				case A653capabletargetPackage.OPERATING_SYSTEM__CREATED: return EtypesPackage.SUPER_TRACKING_TYPE__CREATED;
				case A653capabletargetPackage.OPERATING_SYSTEM__CREATOR: return EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;
				case A653capabletargetPackage.OPERATING_SYSTEM__VERSION: return EtypesPackage.SUPER_TRACKING_TYPE__VERSION;
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
				case EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION: return A653capabletargetPackage.OPERATING_SYSTEM__DOCUMENTATION;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED: return A653capabletargetPackage.OPERATING_SYSTEM__MODIFIED;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER: return A653capabletargetPackage.OPERATING_SYSTEM__MODIFIER;
				case EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK: return A653capabletargetPackage.OPERATING_SYSTEM__TRACE_LINK;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATED: return A653capabletargetPackage.OPERATING_SYSTEM__CREATED;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATOR: return A653capabletargetPackage.OPERATING_SYSTEM__CREATOR;
				case EtypesPackage.SUPER_TRACKING_TYPE__VERSION: return A653capabletargetPackage.OPERATING_SYSTEM__VERSION;
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

} //OperatingSystemImpl
