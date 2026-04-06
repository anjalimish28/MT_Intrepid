/**
 */
package targets.configdesk.impl;

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

import targets.SuperTargetType;
import targets.TargetsPackage;

import targets.configdesk.ConfigdeskPackage;
import targets.configdesk.ConfigurationDesk;
import targets.configdesk.SuperConfigurationDeskIOHardwareType;

import targets.impl.HardwareInformationImpl;
import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Desk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.configdesk.impl.ConfigurationDeskImpl#getId <em>Id</em>}</li>
 *   <li>{@link targets.configdesk.impl.ConfigurationDeskImpl#getName <em>Name</em>}</li>
 *   <li>{@link targets.configdesk.impl.ConfigurationDeskImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link targets.configdesk.impl.ConfigurationDeskImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link targets.configdesk.impl.ConfigurationDeskImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link targets.configdesk.impl.ConfigurationDeskImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link targets.configdesk.impl.ConfigurationDeskImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link targets.configdesk.impl.ConfigurationDeskImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link targets.configdesk.impl.ConfigurationDeskImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link targets.configdesk.impl.ConfigurationDeskImpl#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link targets.configdesk.impl.ConfigurationDeskImpl#getConfigurationDeskIOHardware <em>Configuration Desk IO Hardware</em>}</li>
 *   <li>{@link targets.configdesk.impl.ConfigurationDeskImpl#getModelTopologyName <em>Model Topology Name</em>}</li>
 *   <li>{@link targets.configdesk.impl.ConfigurationDeskImpl#getApplicationName <em>Application Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationDeskImpl extends HardwareInformationImpl implements ConfigurationDesk {
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
	 * The cached value of the '{@link #getConfigurationDeskIOHardware() <em>Configuration Desk IO Hardware</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationDeskIOHardware()
	 * @generated
	 * @ordered
	 */
	protected EList<SuperConfigurationDeskIOHardwareType> configurationDeskIOHardware;

	/**
	 * The default value of the '{@link #getModelTopologyName() <em>Model Topology Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelTopologyName()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_TOPOLOGY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelTopologyName() <em>Model Topology Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelTopologyName()
	 * @generated
	 * @ordered
	 */
	protected String modelTopologyName = MODEL_TOPOLOGY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getApplicationName() <em>Application Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationName()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplicationName() <em>Application Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationName()
	 * @generated
	 * @ordered
	 */
	protected String applicationName = APPLICATION_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationDeskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigdeskPackage.Literals.CONFIGURATION_DESK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigdeskPackage.CONFIGURATION_DESK__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigdeskPackage.CONFIGURATION_DESK__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigdeskPackage.CONFIGURATION_DESK__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigdeskPackage.CONFIGURATION_DESK__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigdeskPackage.CONFIGURATION_DESK__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigdeskPackage.CONFIGURATION_DESK__TRACE_LINK, oldTraceLink, traceLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigdeskPackage.CONFIGURATION_DESK__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigdeskPackage.CONFIGURATION_DESK__CREATOR, oldCreator, creator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigdeskPackage.CONFIGURATION_DESK__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigdeskPackage.CONFIGURATION_DESK__PROJECT_NAME, oldProjectName, projectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SuperConfigurationDeskIOHardwareType> getConfigurationDeskIOHardware() {
		if (configurationDeskIOHardware == null) {
			configurationDeskIOHardware = new EObjectContainmentEList<SuperConfigurationDeskIOHardwareType>(SuperConfigurationDeskIOHardwareType.class, this, ConfigdeskPackage.CONFIGURATION_DESK__CONFIGURATION_DESK_IO_HARDWARE);
		}
		return configurationDeskIOHardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelTopologyName() {
		return modelTopologyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelTopologyName(String newModelTopologyName) {
		String oldModelTopologyName = modelTopologyName;
		modelTopologyName = newModelTopologyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigdeskPackage.CONFIGURATION_DESK__MODEL_TOPOLOGY_NAME, oldModelTopologyName, modelTopologyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplicationName() {
		return applicationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationName(String newApplicationName) {
		String oldApplicationName = applicationName;
		applicationName = newApplicationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigdeskPackage.CONFIGURATION_DESK__APPLICATION_NAME, oldApplicationName, applicationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigdeskPackage.CONFIGURATION_DESK__CONFIGURATION_DESK_IO_HARDWARE:
				return ((InternalEList<?>)getConfigurationDeskIOHardware()).basicRemove(otherEnd, msgs);
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
			case ConfigdeskPackage.CONFIGURATION_DESK__ID:
				return getId();
			case ConfigdeskPackage.CONFIGURATION_DESK__NAME:
				return getName();
			case ConfigdeskPackage.CONFIGURATION_DESK__DOCUMENTATION:
				return getDocumentation();
			case ConfigdeskPackage.CONFIGURATION_DESK__MODIFIED:
				return getModified();
			case ConfigdeskPackage.CONFIGURATION_DESK__MODIFIER:
				return getModifier();
			case ConfigdeskPackage.CONFIGURATION_DESK__TRACE_LINK:
				return getTraceLink();
			case ConfigdeskPackage.CONFIGURATION_DESK__CREATED:
				return getCreated();
			case ConfigdeskPackage.CONFIGURATION_DESK__CREATOR:
				return getCreator();
			case ConfigdeskPackage.CONFIGURATION_DESK__VERSION:
				return getVersion();
			case ConfigdeskPackage.CONFIGURATION_DESK__PROJECT_NAME:
				return getProjectName();
			case ConfigdeskPackage.CONFIGURATION_DESK__CONFIGURATION_DESK_IO_HARDWARE:
				return getConfigurationDeskIOHardware();
			case ConfigdeskPackage.CONFIGURATION_DESK__MODEL_TOPOLOGY_NAME:
				return getModelTopologyName();
			case ConfigdeskPackage.CONFIGURATION_DESK__APPLICATION_NAME:
				return getApplicationName();
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
			case ConfigdeskPackage.CONFIGURATION_DESK__ID:
				setId((String)newValue);
				return;
			case ConfigdeskPackage.CONFIGURATION_DESK__NAME:
				setName((String)newValue);
				return;
			case ConfigdeskPackage.CONFIGURATION_DESK__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case ConfigdeskPackage.CONFIGURATION_DESK__MODIFIED:
				setModified((Date)newValue);
				return;
			case ConfigdeskPackage.CONFIGURATION_DESK__MODIFIER:
				setModifier((String)newValue);
				return;
			case ConfigdeskPackage.CONFIGURATION_DESK__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case ConfigdeskPackage.CONFIGURATION_DESK__CREATED:
				setCreated((Date)newValue);
				return;
			case ConfigdeskPackage.CONFIGURATION_DESK__CREATOR:
				setCreator((String)newValue);
				return;
			case ConfigdeskPackage.CONFIGURATION_DESK__VERSION:
				setVersion((Float)newValue);
				return;
			case ConfigdeskPackage.CONFIGURATION_DESK__PROJECT_NAME:
				setProjectName((String)newValue);
				return;
			case ConfigdeskPackage.CONFIGURATION_DESK__CONFIGURATION_DESK_IO_HARDWARE:
				getConfigurationDeskIOHardware().clear();
				getConfigurationDeskIOHardware().addAll((Collection<? extends SuperConfigurationDeskIOHardwareType>)newValue);
				return;
			case ConfigdeskPackage.CONFIGURATION_DESK__MODEL_TOPOLOGY_NAME:
				setModelTopologyName((String)newValue);
				return;
			case ConfigdeskPackage.CONFIGURATION_DESK__APPLICATION_NAME:
				setApplicationName((String)newValue);
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
			case ConfigdeskPackage.CONFIGURATION_DESK__ID:
				setId(ID_EDEFAULT);
				return;
			case ConfigdeskPackage.CONFIGURATION_DESK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConfigdeskPackage.CONFIGURATION_DESK__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case ConfigdeskPackage.CONFIGURATION_DESK__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case ConfigdeskPackage.CONFIGURATION_DESK__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case ConfigdeskPackage.CONFIGURATION_DESK__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case ConfigdeskPackage.CONFIGURATION_DESK__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case ConfigdeskPackage.CONFIGURATION_DESK__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case ConfigdeskPackage.CONFIGURATION_DESK__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ConfigdeskPackage.CONFIGURATION_DESK__PROJECT_NAME:
				setProjectName(PROJECT_NAME_EDEFAULT);
				return;
			case ConfigdeskPackage.CONFIGURATION_DESK__CONFIGURATION_DESK_IO_HARDWARE:
				getConfigurationDeskIOHardware().clear();
				return;
			case ConfigdeskPackage.CONFIGURATION_DESK__MODEL_TOPOLOGY_NAME:
				setModelTopologyName(MODEL_TOPOLOGY_NAME_EDEFAULT);
				return;
			case ConfigdeskPackage.CONFIGURATION_DESK__APPLICATION_NAME:
				setApplicationName(APPLICATION_NAME_EDEFAULT);
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
			case ConfigdeskPackage.CONFIGURATION_DESK__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ConfigdeskPackage.CONFIGURATION_DESK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConfigdeskPackage.CONFIGURATION_DESK__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case ConfigdeskPackage.CONFIGURATION_DESK__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case ConfigdeskPackage.CONFIGURATION_DESK__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case ConfigdeskPackage.CONFIGURATION_DESK__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case ConfigdeskPackage.CONFIGURATION_DESK__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case ConfigdeskPackage.CONFIGURATION_DESK__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case ConfigdeskPackage.CONFIGURATION_DESK__VERSION:
				return version != VERSION_EDEFAULT;
			case ConfigdeskPackage.CONFIGURATION_DESK__PROJECT_NAME:
				return PROJECT_NAME_EDEFAULT == null ? projectName != null : !PROJECT_NAME_EDEFAULT.equals(projectName);
			case ConfigdeskPackage.CONFIGURATION_DESK__CONFIGURATION_DESK_IO_HARDWARE:
				return configurationDeskIOHardware != null && !configurationDeskIOHardware.isEmpty();
			case ConfigdeskPackage.CONFIGURATION_DESK__MODEL_TOPOLOGY_NAME:
				return MODEL_TOPOLOGY_NAME_EDEFAULT == null ? modelTopologyName != null : !MODEL_TOPOLOGY_NAME_EDEFAULT.equals(modelTopologyName);
			case ConfigdeskPackage.CONFIGURATION_DESK__APPLICATION_NAME:
				return APPLICATION_NAME_EDEFAULT == null ? applicationName != null : !APPLICATION_NAME_EDEFAULT.equals(applicationName);
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
				case ConfigdeskPackage.CONFIGURATION_DESK__ID: return EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;
				case ConfigdeskPackage.CONFIGURATION_DESK__NAME: return EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;
				default: return -1;
			}
		}
		if (baseClass == SuperTrackingType.class) {
			switch (derivedFeatureID) {
				case ConfigdeskPackage.CONFIGURATION_DESK__DOCUMENTATION: return EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;
				case ConfigdeskPackage.CONFIGURATION_DESK__MODIFIED: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;
				case ConfigdeskPackage.CONFIGURATION_DESK__MODIFIER: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;
				case ConfigdeskPackage.CONFIGURATION_DESK__TRACE_LINK: return EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;
				case ConfigdeskPackage.CONFIGURATION_DESK__CREATED: return EtypesPackage.SUPER_TRACKING_TYPE__CREATED;
				case ConfigdeskPackage.CONFIGURATION_DESK__CREATOR: return EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;
				case ConfigdeskPackage.CONFIGURATION_DESK__VERSION: return EtypesPackage.SUPER_TRACKING_TYPE__VERSION;
				default: return -1;
			}
		}
		if (baseClass == SuperTargetType.class) {
			switch (derivedFeatureID) {
				case ConfigdeskPackage.CONFIGURATION_DESK__PROJECT_NAME: return TargetsPackage.SUPER_TARGET_TYPE__PROJECT_NAME;
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
				case EtypesPackage.SUPER_IDENTIFIER_TYPE__ID: return ConfigdeskPackage.CONFIGURATION_DESK__ID;
				case EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME: return ConfigdeskPackage.CONFIGURATION_DESK__NAME;
				default: return -1;
			}
		}
		if (baseClass == SuperTrackingType.class) {
			switch (baseFeatureID) {
				case EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION: return ConfigdeskPackage.CONFIGURATION_DESK__DOCUMENTATION;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED: return ConfigdeskPackage.CONFIGURATION_DESK__MODIFIED;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER: return ConfigdeskPackage.CONFIGURATION_DESK__MODIFIER;
				case EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK: return ConfigdeskPackage.CONFIGURATION_DESK__TRACE_LINK;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATED: return ConfigdeskPackage.CONFIGURATION_DESK__CREATED;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATOR: return ConfigdeskPackage.CONFIGURATION_DESK__CREATOR;
				case EtypesPackage.SUPER_TRACKING_TYPE__VERSION: return ConfigdeskPackage.CONFIGURATION_DESK__VERSION;
				default: return -1;
			}
		}
		if (baseClass == SuperTargetType.class) {
			switch (baseFeatureID) {
				case TargetsPackage.SUPER_TARGET_TYPE__PROJECT_NAME: return ConfigdeskPackage.CONFIGURATION_DESK__PROJECT_NAME;
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
		result.append(", modelTopologyName: ");
		result.append(modelTopologyName);
		result.append(", applicationName: ");
		result.append(applicationName);
		result.append(')');
		return result.toString();
	}

} //ConfigurationDeskImpl
