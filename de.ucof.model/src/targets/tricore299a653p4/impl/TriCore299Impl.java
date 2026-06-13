/**
 */
package targets.tricore299a653p4.impl;

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import targets.SuperTargetType;
import targets.TargetsPackage;

import targets.a653capabletarget.A653capabletargetPackage;
import targets.a653capabletarget.OperatingSystem;
import targets.a653capabletarget.SuperA653CapableTargetType;

import targets.impl.HardwareInformationImpl;

import targets.tricore299a653p4.SuperTriCore299IOHardwareType;
import targets.tricore299a653p4.TriCore299;
import targets.tricore299a653p4.Tricore299a653p4Package;
import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tri Core299</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.tricore299a653p4.impl.TriCore299Impl#getId <em>Id</em>}</li>
 *   <li>{@link targets.tricore299a653p4.impl.TriCore299Impl#getName <em>Name</em>}</li>
 *   <li>{@link targets.tricore299a653p4.impl.TriCore299Impl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link targets.tricore299a653p4.impl.TriCore299Impl#getModified <em>Modified</em>}</li>
 *   <li>{@link targets.tricore299a653p4.impl.TriCore299Impl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link targets.tricore299a653p4.impl.TriCore299Impl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link targets.tricore299a653p4.impl.TriCore299Impl#getCreated <em>Created</em>}</li>
 *   <li>{@link targets.tricore299a653p4.impl.TriCore299Impl#getCreator <em>Creator</em>}</li>
 *   <li>{@link targets.tricore299a653p4.impl.TriCore299Impl#getVersion <em>Version</em>}</li>
 *   <li>{@link targets.tricore299a653p4.impl.TriCore299Impl#getOperatingSytem <em>Operating Sytem</em>}</li>
 *   <li>{@link targets.tricore299a653p4.impl.TriCore299Impl#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link targets.tricore299a653p4.impl.TriCore299Impl#getIODriver <em>IO Driver</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriCore299Impl extends HardwareInformationImpl implements TriCore299 {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getOperatingSytem() <em>Operating Sytem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingSytem()
	 * @generated
	 * @ordered
	 */
	protected OperatingSystem operatingSytem;

	/**
	 * The default value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected String projectName = PROJECT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIODriver() <em>IO Driver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIODriver()
	 * @generated
	 * @ordered
	 */
	protected SuperTriCore299IOHardwareType iODriver;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriCore299Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tricore299a653p4Package.Literals.TRI_CORE299;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tricore299a653p4Package.TRI_CORE299__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tricore299a653p4Package.TRI_CORE299__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Tricore299a653p4Package.TRI_CORE299__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Tricore299a653p4Package.TRI_CORE299__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Tricore299a653p4Package.TRI_CORE299__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Tricore299a653p4Package.TRI_CORE299__TRACE_LINK, oldTraceLink, traceLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Tricore299a653p4Package.TRI_CORE299__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Tricore299a653p4Package.TRI_CORE299__CREATOR, oldCreator, creator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Tricore299a653p4Package.TRI_CORE299__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingSystem getOperatingSytem() {
		return operatingSytem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperatingSytem(OperatingSystem newOperatingSytem, NotificationChain msgs) {
		OperatingSystem oldOperatingSytem = operatingSytem;
		operatingSytem = newOperatingSytem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tricore299a653p4Package.TRI_CORE299__OPERATING_SYTEM, oldOperatingSytem, newOperatingSytem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperatingSytem(OperatingSystem newOperatingSytem) {
		if (newOperatingSytem != operatingSytem) {
			NotificationChain msgs = null;
			if (operatingSytem != null)
				msgs = ((InternalEObject)operatingSytem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tricore299a653p4Package.TRI_CORE299__OPERATING_SYTEM, null, msgs);
			if (newOperatingSytem != null)
				msgs = ((InternalEObject)newOperatingSytem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tricore299a653p4Package.TRI_CORE299__OPERATING_SYTEM, null, msgs);
			msgs = basicSetOperatingSytem(newOperatingSytem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tricore299a653p4Package.TRI_CORE299__OPERATING_SYTEM, newOperatingSytem, newOperatingSytem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectName(String newProjectName) {
		String oldProjectName = projectName;
		projectName = newProjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tricore299a653p4Package.TRI_CORE299__PROJECT_NAME, oldProjectName, projectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperTriCore299IOHardwareType getIODriver() {
		return iODriver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIODriver(SuperTriCore299IOHardwareType newIODriver, NotificationChain msgs) {
		SuperTriCore299IOHardwareType oldIODriver = iODriver;
		iODriver = newIODriver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tricore299a653p4Package.TRI_CORE299__IO_DRIVER, oldIODriver, newIODriver);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIODriver(SuperTriCore299IOHardwareType newIODriver) {
		if (newIODriver != iODriver) {
			NotificationChain msgs = null;
			if (iODriver != null)
				msgs = ((InternalEObject)iODriver).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tricore299a653p4Package.TRI_CORE299__IO_DRIVER, null, msgs);
			if (newIODriver != null)
				msgs = ((InternalEObject)newIODriver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tricore299a653p4Package.TRI_CORE299__IO_DRIVER, null, msgs);
			msgs = basicSetIODriver(newIODriver, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tricore299a653p4Package.TRI_CORE299__IO_DRIVER, newIODriver, newIODriver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tricore299a653p4Package.TRI_CORE299__OPERATING_SYTEM:
				return basicSetOperatingSytem(null, msgs);
			case Tricore299a653p4Package.TRI_CORE299__IO_DRIVER:
				return basicSetIODriver(null, msgs);
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
			case Tricore299a653p4Package.TRI_CORE299__ID:
				return getId();
			case Tricore299a653p4Package.TRI_CORE299__NAME:
				return getName();
			case Tricore299a653p4Package.TRI_CORE299__DOCUMENTATION:
				return getDocumentation();
			case Tricore299a653p4Package.TRI_CORE299__MODIFIED:
				return getModified();
			case Tricore299a653p4Package.TRI_CORE299__MODIFIER:
				return getModifier();
			case Tricore299a653p4Package.TRI_CORE299__TRACE_LINK:
				return getTraceLink();
			case Tricore299a653p4Package.TRI_CORE299__CREATED:
				return getCreated();
			case Tricore299a653p4Package.TRI_CORE299__CREATOR:
				return getCreator();
			case Tricore299a653p4Package.TRI_CORE299__VERSION:
				return getVersion();
			case Tricore299a653p4Package.TRI_CORE299__OPERATING_SYTEM:
				return getOperatingSytem();
			case Tricore299a653p4Package.TRI_CORE299__PROJECT_NAME:
				return getProjectName();
			case Tricore299a653p4Package.TRI_CORE299__IO_DRIVER:
				return getIODriver();
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
			case Tricore299a653p4Package.TRI_CORE299__ID:
				setId((String)newValue);
				return;
			case Tricore299a653p4Package.TRI_CORE299__NAME:
				setName((String)newValue);
				return;
			case Tricore299a653p4Package.TRI_CORE299__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case Tricore299a653p4Package.TRI_CORE299__MODIFIED:
				setModified((Date)newValue);
				return;
			case Tricore299a653p4Package.TRI_CORE299__MODIFIER:
				setModifier((String)newValue);
				return;
			case Tricore299a653p4Package.TRI_CORE299__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case Tricore299a653p4Package.TRI_CORE299__CREATED:
				setCreated((Date)newValue);
				return;
			case Tricore299a653p4Package.TRI_CORE299__CREATOR:
				setCreator((String)newValue);
				return;
			case Tricore299a653p4Package.TRI_CORE299__VERSION:
				setVersion((Float)newValue);
				return;
			case Tricore299a653p4Package.TRI_CORE299__OPERATING_SYTEM:
				setOperatingSytem((OperatingSystem)newValue);
				return;
			case Tricore299a653p4Package.TRI_CORE299__PROJECT_NAME:
				setProjectName((String)newValue);
				return;
			case Tricore299a653p4Package.TRI_CORE299__IO_DRIVER:
				setIODriver((SuperTriCore299IOHardwareType)newValue);
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
			case Tricore299a653p4Package.TRI_CORE299__ID:
				setId(ID_EDEFAULT);
				return;
			case Tricore299a653p4Package.TRI_CORE299__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Tricore299a653p4Package.TRI_CORE299__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case Tricore299a653p4Package.TRI_CORE299__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case Tricore299a653p4Package.TRI_CORE299__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case Tricore299a653p4Package.TRI_CORE299__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case Tricore299a653p4Package.TRI_CORE299__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case Tricore299a653p4Package.TRI_CORE299__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case Tricore299a653p4Package.TRI_CORE299__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case Tricore299a653p4Package.TRI_CORE299__OPERATING_SYTEM:
				setOperatingSytem((OperatingSystem)null);
				return;
			case Tricore299a653p4Package.TRI_CORE299__PROJECT_NAME:
				setProjectName(PROJECT_NAME_EDEFAULT);
				return;
			case Tricore299a653p4Package.TRI_CORE299__IO_DRIVER:
				setIODriver((SuperTriCore299IOHardwareType)null);
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
			case Tricore299a653p4Package.TRI_CORE299__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Tricore299a653p4Package.TRI_CORE299__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Tricore299a653p4Package.TRI_CORE299__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case Tricore299a653p4Package.TRI_CORE299__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case Tricore299a653p4Package.TRI_CORE299__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case Tricore299a653p4Package.TRI_CORE299__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case Tricore299a653p4Package.TRI_CORE299__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case Tricore299a653p4Package.TRI_CORE299__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case Tricore299a653p4Package.TRI_CORE299__VERSION:
				return version != VERSION_EDEFAULT;
			case Tricore299a653p4Package.TRI_CORE299__OPERATING_SYTEM:
				return operatingSytem != null;
			case Tricore299a653p4Package.TRI_CORE299__PROJECT_NAME:
				return PROJECT_NAME_EDEFAULT == null ? projectName != null : !PROJECT_NAME_EDEFAULT.equals(projectName);
			case Tricore299a653p4Package.TRI_CORE299__IO_DRIVER:
				return iODriver != null;
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
		if (baseClass == SuperIdentifierType.class) {
			switch (derivedFeatureID) {
				case Tricore299a653p4Package.TRI_CORE299__ID: return EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;
				case Tricore299a653p4Package.TRI_CORE299__NAME: return EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;
				default: return -1;
			}
		}
		if (baseClass == SuperTrackingType.class) {
			switch (derivedFeatureID) {
				case Tricore299a653p4Package.TRI_CORE299__DOCUMENTATION: return EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;
				case Tricore299a653p4Package.TRI_CORE299__MODIFIED: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;
				case Tricore299a653p4Package.TRI_CORE299__MODIFIER: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;
				case Tricore299a653p4Package.TRI_CORE299__TRACE_LINK: return EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;
				case Tricore299a653p4Package.TRI_CORE299__CREATED: return EtypesPackage.SUPER_TRACKING_TYPE__CREATED;
				case Tricore299a653p4Package.TRI_CORE299__CREATOR: return EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;
				case Tricore299a653p4Package.TRI_CORE299__VERSION: return EtypesPackage.SUPER_TRACKING_TYPE__VERSION;
				default: return -1;
			}
		}
		if (baseClass == SuperA653CapableTargetType.class) {
			switch (derivedFeatureID) {
				case Tricore299a653p4Package.TRI_CORE299__OPERATING_SYTEM: return A653capabletargetPackage.SUPER_A653_CAPABLE_TARGET_TYPE__OPERATING_SYTEM;
				default: return -1;
			}
		}
		if (baseClass == SuperTargetType.class) {
			switch (derivedFeatureID) {
				case Tricore299a653p4Package.TRI_CORE299__PROJECT_NAME: return TargetsPackage.SUPER_TARGET_TYPE__PROJECT_NAME;
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
		if (baseClass == SuperIdentifierType.class) {
			switch (baseFeatureID) {
				case EtypesPackage.SUPER_IDENTIFIER_TYPE__ID: return Tricore299a653p4Package.TRI_CORE299__ID;
				case EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME: return Tricore299a653p4Package.TRI_CORE299__NAME;
				default: return -1;
			}
		}
		if (baseClass == SuperTrackingType.class) {
			switch (baseFeatureID) {
				case EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION: return Tricore299a653p4Package.TRI_CORE299__DOCUMENTATION;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED: return Tricore299a653p4Package.TRI_CORE299__MODIFIED;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER: return Tricore299a653p4Package.TRI_CORE299__MODIFIER;
				case EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK: return Tricore299a653p4Package.TRI_CORE299__TRACE_LINK;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATED: return Tricore299a653p4Package.TRI_CORE299__CREATED;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATOR: return Tricore299a653p4Package.TRI_CORE299__CREATOR;
				case EtypesPackage.SUPER_TRACKING_TYPE__VERSION: return Tricore299a653p4Package.TRI_CORE299__VERSION;
				default: return -1;
			}
		}
		if (baseClass == SuperA653CapableTargetType.class) {
			switch (baseFeatureID) {
				case A653capabletargetPackage.SUPER_A653_CAPABLE_TARGET_TYPE__OPERATING_SYTEM: return Tricore299a653p4Package.TRI_CORE299__OPERATING_SYTEM;
				default: return -1;
			}
		}
		if (baseClass == SuperTargetType.class) {
			switch (baseFeatureID) {
				case TargetsPackage.SUPER_TARGET_TYPE__PROJECT_NAME: return Tricore299a653p4Package.TRI_CORE299__PROJECT_NAME;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", documentation: ");
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
		result.append(", projectName: ");
		result.append(projectName);
		result.append(')');
		return result.toString();
	}

} //TriCore299Impl
