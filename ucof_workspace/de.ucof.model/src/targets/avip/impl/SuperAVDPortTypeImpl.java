/**
 */
package targets.avip.impl;

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
import targets.avip.AvipPackage;
import targets.avip.FunctionalData;
import targets.avip.PortUserConfiguration;
import targets.avip.SignalExtensions;
import targets.avip.SuperAVDPortType;

import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.SuperTrackingType;

import ucof.common.etypes.impl.SuperIdentifierTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Super AVD Port Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.avip.impl.SuperAVDPortTypeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link targets.avip.impl.SuperAVDPortTypeImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link targets.avip.impl.SuperAVDPortTypeImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link targets.avip.impl.SuperAVDPortTypeImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link targets.avip.impl.SuperAVDPortTypeImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link targets.avip.impl.SuperAVDPortTypeImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link targets.avip.impl.SuperAVDPortTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link targets.avip.impl.SuperAVDPortTypeImpl#getConnectorName <em>Connector Name</em>}</li>
 *   <li>{@link targets.avip.impl.SuperAVDPortTypeImpl#getConnectorPinName <em>Connector Pin Name</em>}</li>
 *   <li>{@link targets.avip.impl.SuperAVDPortTypeImpl#getIf_id <em>If id</em>}</li>
 *   <li>{@link targets.avip.impl.SuperAVDPortTypeImpl#getFunctionalData <em>Functional Data</em>}</li>
 *   <li>{@link targets.avip.impl.SuperAVDPortTypeImpl#getPortUserConfiguration <em>Port User Configuration</em>}</li>
 *   <li>{@link targets.avip.impl.SuperAVDPortTypeImpl#getSignalExtensions <em>Signal Extensions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SuperAVDPortTypeImpl extends SuperIdentifierTypeImpl implements SuperAVDPortType {
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
	 * The default value of the '{@link #getConnectorName() <em>Connector Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECTOR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectorName() <em>Connector Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorName()
	 * @generated
	 * @ordered
	 */
	protected String connectorName = CONNECTOR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnectorPinName() <em>Connector Pin Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorPinName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECTOR_PIN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectorPinName() <em>Connector Pin Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorPinName()
	 * @generated
	 * @ordered
	 */
	protected String connectorPinName = CONNECTOR_PIN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIf_id() <em>If id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf_id()
	 * @generated
	 * @ordered
	 */
	protected static final int IF_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIf_id() <em>If id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf_id()
	 * @generated
	 * @ordered
	 */
	protected int if_id = IF_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFunctionalData() <em>Functional Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalData()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalData> functionalData;

	/**
	 * The cached value of the '{@link #getPortUserConfiguration() <em>Port User Configuration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortUserConfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<PortUserConfiguration> portUserConfiguration;

	/**
	 * The cached value of the '{@link #getSignalExtensions() <em>Signal Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalExtensions()
	 * @generated
	 * @ordered
	 */
	protected SignalExtensions signalExtensions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperAVDPortTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AvipPackage.Literals.SUPER_AVD_PORT_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.SUPER_AVD_PORT_TYPE__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.SUPER_AVD_PORT_TYPE__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.SUPER_AVD_PORT_TYPE__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.SUPER_AVD_PORT_TYPE__TRACE_LINK, oldTraceLink, traceLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.SUPER_AVD_PORT_TYPE__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.SUPER_AVD_PORT_TYPE__CREATOR, oldCreator, creator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.SUPER_AVD_PORT_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConnectorName() {
		return connectorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectorName(String newConnectorName) {
		String oldConnectorName = connectorName;
		connectorName = newConnectorName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.SUPER_AVD_PORT_TYPE__CONNECTOR_NAME, oldConnectorName, connectorName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConnectorPinName() {
		return connectorPinName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectorPinName(String newConnectorPinName) {
		String oldConnectorPinName = connectorPinName;
		connectorPinName = newConnectorPinName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.SUPER_AVD_PORT_TYPE__CONNECTOR_PIN_NAME, oldConnectorPinName, connectorPinName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIf_id() {
		return if_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIf_id(int newIf_id) {
		int oldIf_id = if_id;
		if_id = newIf_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.SUPER_AVD_PORT_TYPE__IF_ID, oldIf_id, if_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalData> getFunctionalData() {
		if (functionalData == null) {
			functionalData = new EObjectContainmentEList<FunctionalData>(FunctionalData.class, this, AvipPackage.SUPER_AVD_PORT_TYPE__FUNCTIONAL_DATA);
		}
		return functionalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortUserConfiguration> getPortUserConfiguration() {
		if (portUserConfiguration == null) {
			portUserConfiguration = new EObjectContainmentEList<PortUserConfiguration>(PortUserConfiguration.class, this, AvipPackage.SUPER_AVD_PORT_TYPE__PORT_USER_CONFIGURATION);
		}
		return portUserConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalExtensions getSignalExtensions() {
		return signalExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignalExtensions(SignalExtensions newSignalExtensions, NotificationChain msgs) {
		SignalExtensions oldSignalExtensions = signalExtensions;
		signalExtensions = newSignalExtensions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AvipPackage.SUPER_AVD_PORT_TYPE__SIGNAL_EXTENSIONS, oldSignalExtensions, newSignalExtensions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignalExtensions(SignalExtensions newSignalExtensions) {
		if (newSignalExtensions != signalExtensions) {
			NotificationChain msgs = null;
			if (signalExtensions != null)
				msgs = ((InternalEObject)signalExtensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AvipPackage.SUPER_AVD_PORT_TYPE__SIGNAL_EXTENSIONS, null, msgs);
			if (newSignalExtensions != null)
				msgs = ((InternalEObject)newSignalExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AvipPackage.SUPER_AVD_PORT_TYPE__SIGNAL_EXTENSIONS, null, msgs);
			msgs = basicSetSignalExtensions(newSignalExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.SUPER_AVD_PORT_TYPE__SIGNAL_EXTENSIONS, newSignalExtensions, newSignalExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AvipPackage.SUPER_AVD_PORT_TYPE__FUNCTIONAL_DATA:
				return ((InternalEList<?>)getFunctionalData()).basicRemove(otherEnd, msgs);
			case AvipPackage.SUPER_AVD_PORT_TYPE__PORT_USER_CONFIGURATION:
				return ((InternalEList<?>)getPortUserConfiguration()).basicRemove(otherEnd, msgs);
			case AvipPackage.SUPER_AVD_PORT_TYPE__SIGNAL_EXTENSIONS:
				return basicSetSignalExtensions(null, msgs);
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
			case AvipPackage.SUPER_AVD_PORT_TYPE__DOCUMENTATION:
				return getDocumentation();
			case AvipPackage.SUPER_AVD_PORT_TYPE__MODIFIED:
				return getModified();
			case AvipPackage.SUPER_AVD_PORT_TYPE__MODIFIER:
				return getModifier();
			case AvipPackage.SUPER_AVD_PORT_TYPE__TRACE_LINK:
				return getTraceLink();
			case AvipPackage.SUPER_AVD_PORT_TYPE__CREATED:
				return getCreated();
			case AvipPackage.SUPER_AVD_PORT_TYPE__CREATOR:
				return getCreator();
			case AvipPackage.SUPER_AVD_PORT_TYPE__VERSION:
				return getVersion();
			case AvipPackage.SUPER_AVD_PORT_TYPE__CONNECTOR_NAME:
				return getConnectorName();
			case AvipPackage.SUPER_AVD_PORT_TYPE__CONNECTOR_PIN_NAME:
				return getConnectorPinName();
			case AvipPackage.SUPER_AVD_PORT_TYPE__IF_ID:
				return getIf_id();
			case AvipPackage.SUPER_AVD_PORT_TYPE__FUNCTIONAL_DATA:
				return getFunctionalData();
			case AvipPackage.SUPER_AVD_PORT_TYPE__PORT_USER_CONFIGURATION:
				return getPortUserConfiguration();
			case AvipPackage.SUPER_AVD_PORT_TYPE__SIGNAL_EXTENSIONS:
				return getSignalExtensions();
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
			case AvipPackage.SUPER_AVD_PORT_TYPE__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case AvipPackage.SUPER_AVD_PORT_TYPE__MODIFIED:
				setModified((Date)newValue);
				return;
			case AvipPackage.SUPER_AVD_PORT_TYPE__MODIFIER:
				setModifier((String)newValue);
				return;
			case AvipPackage.SUPER_AVD_PORT_TYPE__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case AvipPackage.SUPER_AVD_PORT_TYPE__CREATED:
				setCreated((Date)newValue);
				return;
			case AvipPackage.SUPER_AVD_PORT_TYPE__CREATOR:
				setCreator((String)newValue);
				return;
			case AvipPackage.SUPER_AVD_PORT_TYPE__VERSION:
				setVersion((Float)newValue);
				return;
			case AvipPackage.SUPER_AVD_PORT_TYPE__CONNECTOR_NAME:
				setConnectorName((String)newValue);
				return;
			case AvipPackage.SUPER_AVD_PORT_TYPE__CONNECTOR_PIN_NAME:
				setConnectorPinName((String)newValue);
				return;
			case AvipPackage.SUPER_AVD_PORT_TYPE__IF_ID:
				setIf_id((Integer)newValue);
				return;
			case AvipPackage.SUPER_AVD_PORT_TYPE__FUNCTIONAL_DATA:
				getFunctionalData().clear();
				getFunctionalData().addAll((Collection<? extends FunctionalData>)newValue);
				return;
			case AvipPackage.SUPER_AVD_PORT_TYPE__PORT_USER_CONFIGURATION:
				getPortUserConfiguration().clear();
				getPortUserConfiguration().addAll((Collection<? extends PortUserConfiguration>)newValue);
				return;
			case AvipPackage.SUPER_AVD_PORT_TYPE__SIGNAL_EXTENSIONS:
				setSignalExtensions((SignalExtensions)newValue);
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
			case AvipPackage.SUPER_AVD_PORT_TYPE__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case AvipPackage.SUPER_AVD_PORT_TYPE__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case AvipPackage.SUPER_AVD_PORT_TYPE__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case AvipPackage.SUPER_AVD_PORT_TYPE__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case AvipPackage.SUPER_AVD_PORT_TYPE__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case AvipPackage.SUPER_AVD_PORT_TYPE__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case AvipPackage.SUPER_AVD_PORT_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case AvipPackage.SUPER_AVD_PORT_TYPE__CONNECTOR_NAME:
				setConnectorName(CONNECTOR_NAME_EDEFAULT);
				return;
			case AvipPackage.SUPER_AVD_PORT_TYPE__CONNECTOR_PIN_NAME:
				setConnectorPinName(CONNECTOR_PIN_NAME_EDEFAULT);
				return;
			case AvipPackage.SUPER_AVD_PORT_TYPE__IF_ID:
				setIf_id(IF_ID_EDEFAULT);
				return;
			case AvipPackage.SUPER_AVD_PORT_TYPE__FUNCTIONAL_DATA:
				getFunctionalData().clear();
				return;
			case AvipPackage.SUPER_AVD_PORT_TYPE__PORT_USER_CONFIGURATION:
				getPortUserConfiguration().clear();
				return;
			case AvipPackage.SUPER_AVD_PORT_TYPE__SIGNAL_EXTENSIONS:
				setSignalExtensions((SignalExtensions)null);
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
			case AvipPackage.SUPER_AVD_PORT_TYPE__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case AvipPackage.SUPER_AVD_PORT_TYPE__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case AvipPackage.SUPER_AVD_PORT_TYPE__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case AvipPackage.SUPER_AVD_PORT_TYPE__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case AvipPackage.SUPER_AVD_PORT_TYPE__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case AvipPackage.SUPER_AVD_PORT_TYPE__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case AvipPackage.SUPER_AVD_PORT_TYPE__VERSION:
				return version != VERSION_EDEFAULT;
			case AvipPackage.SUPER_AVD_PORT_TYPE__CONNECTOR_NAME:
				return CONNECTOR_NAME_EDEFAULT == null ? connectorName != null : !CONNECTOR_NAME_EDEFAULT.equals(connectorName);
			case AvipPackage.SUPER_AVD_PORT_TYPE__CONNECTOR_PIN_NAME:
				return CONNECTOR_PIN_NAME_EDEFAULT == null ? connectorPinName != null : !CONNECTOR_PIN_NAME_EDEFAULT.equals(connectorPinName);
			case AvipPackage.SUPER_AVD_PORT_TYPE__IF_ID:
				return if_id != IF_ID_EDEFAULT;
			case AvipPackage.SUPER_AVD_PORT_TYPE__FUNCTIONAL_DATA:
				return functionalData != null && !functionalData.isEmpty();
			case AvipPackage.SUPER_AVD_PORT_TYPE__PORT_USER_CONFIGURATION:
				return portUserConfiguration != null && !portUserConfiguration.isEmpty();
			case AvipPackage.SUPER_AVD_PORT_TYPE__SIGNAL_EXTENSIONS:
				return signalExtensions != null;
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
				case AvipPackage.SUPER_AVD_PORT_TYPE__DOCUMENTATION: return EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;
				case AvipPackage.SUPER_AVD_PORT_TYPE__MODIFIED: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;
				case AvipPackage.SUPER_AVD_PORT_TYPE__MODIFIER: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;
				case AvipPackage.SUPER_AVD_PORT_TYPE__TRACE_LINK: return EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;
				case AvipPackage.SUPER_AVD_PORT_TYPE__CREATED: return EtypesPackage.SUPER_TRACKING_TYPE__CREATED;
				case AvipPackage.SUPER_AVD_PORT_TYPE__CREATOR: return EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;
				case AvipPackage.SUPER_AVD_PORT_TYPE__VERSION: return EtypesPackage.SUPER_TRACKING_TYPE__VERSION;
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
				case EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION: return AvipPackage.SUPER_AVD_PORT_TYPE__DOCUMENTATION;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED: return AvipPackage.SUPER_AVD_PORT_TYPE__MODIFIED;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER: return AvipPackage.SUPER_AVD_PORT_TYPE__MODIFIER;
				case EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK: return AvipPackage.SUPER_AVD_PORT_TYPE__TRACE_LINK;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATED: return AvipPackage.SUPER_AVD_PORT_TYPE__CREATED;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATOR: return AvipPackage.SUPER_AVD_PORT_TYPE__CREATOR;
				case EtypesPackage.SUPER_TRACKING_TYPE__VERSION: return AvipPackage.SUPER_AVD_PORT_TYPE__VERSION;
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
		result.append(", ConnectorName: ");
		result.append(connectorName);
		result.append(", ConnectorPinName: ");
		result.append(connectorPinName);
		result.append(", if_id: ");
		result.append(if_id);
		result.append(')');
		return result.toString();
	}

} //SuperAVDPortTypeImpl
