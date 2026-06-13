/**
 */
package ucof.communication.configECIC.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.common.etypes.impl.SuperSetTypeImpl;

import ucof.communication.configECIC.Channels;
import ucof.communication.configECIC.ComponentTypeType;
import ucof.communication.configECIC.ConfigECICPackage;
import ucof.communication.configECIC.ED247Configuration;
import ucof.communication.configECIC.FileProducer;
import ucof.communication.configECIC.StandardRevisionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ED247 Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.impl.ED247ConfigurationImpl#getStandardRevision <em>Standard Revision</em>}</li>
 *   <li>{@link ucof.communication.configECIC.impl.ED247ConfigurationImpl#getComponentVersion <em>Component Version</em>}</li>
 *   <li>{@link ucof.communication.configECIC.impl.ED247ConfigurationImpl#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link ucof.communication.configECIC.impl.ED247ConfigurationImpl#getChannels <em>Channels</em>}</li>
 *   <li>{@link ucof.communication.configECIC.impl.ED247ConfigurationImpl#getFileProducer <em>File Producer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ED247ConfigurationImpl extends SuperSetTypeImpl implements ED247Configuration {
	/**
	 * The default value of the '{@link #getStandardRevision() <em>Standard Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardRevision()
	 * @generated
	 * @ordered
	 */
	protected static final StandardRevisionType STANDARD_REVISION_EDEFAULT = StandardRevisionType.NOT_SET;

	/**
	 * The cached value of the '{@link #getStandardRevision() <em>Standard Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardRevision()
	 * @generated
	 * @ordered
	 */
	protected StandardRevisionType standardRevision = STANDARD_REVISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getComponentVersion() <em>Component Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentVersion() <em>Component Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentVersion()
	 * @generated
	 * @ordered
	 */
	protected String componentVersion = COMPONENT_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getComponentType() <em>Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentType()
	 * @generated
	 * @ordered
	 */
	protected static final ComponentTypeType COMPONENT_TYPE_EDEFAULT = ComponentTypeType.NOT_SET;

	/**
	 * The cached value of the '{@link #getComponentType() <em>Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentType()
	 * @generated
	 * @ordered
	 */
	protected ComponentTypeType componentType = COMPONENT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChannels() <em>Channels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannels()
	 * @generated
	 * @ordered
	 */
	protected Channels channels;

	/**
	 * The cached value of the '{@link #getFileProducer() <em>File Producer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileProducer()
	 * @generated
	 * @ordered
	 */
	protected FileProducer fileProducer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ED247ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigECICPackage.Literals.ED247_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardRevisionType getStandardRevision() {
		return standardRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardRevision(StandardRevisionType newStandardRevision) {
		StandardRevisionType oldStandardRevision = standardRevision;
		standardRevision = newStandardRevision == null ? STANDARD_REVISION_EDEFAULT : newStandardRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigECICPackage.ED247_CONFIGURATION__STANDARD_REVISION, oldStandardRevision, standardRevision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComponentVersion() {
		return componentVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentVersion(String newComponentVersion) {
		String oldComponentVersion = componentVersion;
		componentVersion = newComponentVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigECICPackage.ED247_CONFIGURATION__COMPONENT_VERSION, oldComponentVersion, componentVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentTypeType getComponentType() {
		return componentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentType(ComponentTypeType newComponentType) {
		ComponentTypeType oldComponentType = componentType;
		componentType = newComponentType == null ? COMPONENT_TYPE_EDEFAULT : newComponentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigECICPackage.ED247_CONFIGURATION__COMPONENT_TYPE, oldComponentType, componentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channels getChannels() {
		return channels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChannels(Channels newChannels, NotificationChain msgs) {
		Channels oldChannels = channels;
		channels = newChannels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigECICPackage.ED247_CONFIGURATION__CHANNELS, oldChannels, newChannels);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannels(Channels newChannels) {
		if (newChannels != channels) {
			NotificationChain msgs = null;
			if (channels != null)
				msgs = ((InternalEObject)channels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigECICPackage.ED247_CONFIGURATION__CHANNELS, null, msgs);
			if (newChannels != null)
				msgs = ((InternalEObject)newChannels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigECICPackage.ED247_CONFIGURATION__CHANNELS, null, msgs);
			msgs = basicSetChannels(newChannels, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigECICPackage.ED247_CONFIGURATION__CHANNELS, newChannels, newChannels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileProducer getFileProducer() {
		return fileProducer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFileProducer(FileProducer newFileProducer, NotificationChain msgs) {
		FileProducer oldFileProducer = fileProducer;
		fileProducer = newFileProducer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigECICPackage.ED247_CONFIGURATION__FILE_PRODUCER, oldFileProducer, newFileProducer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileProducer(FileProducer newFileProducer) {
		if (newFileProducer != fileProducer) {
			NotificationChain msgs = null;
			if (fileProducer != null)
				msgs = ((InternalEObject)fileProducer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigECICPackage.ED247_CONFIGURATION__FILE_PRODUCER, null, msgs);
			if (newFileProducer != null)
				msgs = ((InternalEObject)newFileProducer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigECICPackage.ED247_CONFIGURATION__FILE_PRODUCER, null, msgs);
			msgs = basicSetFileProducer(newFileProducer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigECICPackage.ED247_CONFIGURATION__FILE_PRODUCER, newFileProducer, newFileProducer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigECICPackage.ED247_CONFIGURATION__CHANNELS:
				return basicSetChannels(null, msgs);
			case ConfigECICPackage.ED247_CONFIGURATION__FILE_PRODUCER:
				return basicSetFileProducer(null, msgs);
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
			case ConfigECICPackage.ED247_CONFIGURATION__STANDARD_REVISION:
				return getStandardRevision();
			case ConfigECICPackage.ED247_CONFIGURATION__COMPONENT_VERSION:
				return getComponentVersion();
			case ConfigECICPackage.ED247_CONFIGURATION__COMPONENT_TYPE:
				return getComponentType();
			case ConfigECICPackage.ED247_CONFIGURATION__CHANNELS:
				return getChannels();
			case ConfigECICPackage.ED247_CONFIGURATION__FILE_PRODUCER:
				return getFileProducer();
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
			case ConfigECICPackage.ED247_CONFIGURATION__STANDARD_REVISION:
				setStandardRevision((StandardRevisionType)newValue);
				return;
			case ConfigECICPackage.ED247_CONFIGURATION__COMPONENT_VERSION:
				setComponentVersion((String)newValue);
				return;
			case ConfigECICPackage.ED247_CONFIGURATION__COMPONENT_TYPE:
				setComponentType((ComponentTypeType)newValue);
				return;
			case ConfigECICPackage.ED247_CONFIGURATION__CHANNELS:
				setChannels((Channels)newValue);
				return;
			case ConfigECICPackage.ED247_CONFIGURATION__FILE_PRODUCER:
				setFileProducer((FileProducer)newValue);
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
			case ConfigECICPackage.ED247_CONFIGURATION__STANDARD_REVISION:
				setStandardRevision(STANDARD_REVISION_EDEFAULT);
				return;
			case ConfigECICPackage.ED247_CONFIGURATION__COMPONENT_VERSION:
				setComponentVersion(COMPONENT_VERSION_EDEFAULT);
				return;
			case ConfigECICPackage.ED247_CONFIGURATION__COMPONENT_TYPE:
				setComponentType(COMPONENT_TYPE_EDEFAULT);
				return;
			case ConfigECICPackage.ED247_CONFIGURATION__CHANNELS:
				setChannels((Channels)null);
				return;
			case ConfigECICPackage.ED247_CONFIGURATION__FILE_PRODUCER:
				setFileProducer((FileProducer)null);
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
			case ConfigECICPackage.ED247_CONFIGURATION__STANDARD_REVISION:
				return standardRevision != STANDARD_REVISION_EDEFAULT;
			case ConfigECICPackage.ED247_CONFIGURATION__COMPONENT_VERSION:
				return COMPONENT_VERSION_EDEFAULT == null ? componentVersion != null : !COMPONENT_VERSION_EDEFAULT.equals(componentVersion);
			case ConfigECICPackage.ED247_CONFIGURATION__COMPONENT_TYPE:
				return componentType != COMPONENT_TYPE_EDEFAULT;
			case ConfigECICPackage.ED247_CONFIGURATION__CHANNELS:
				return channels != null;
			case ConfigECICPackage.ED247_CONFIGURATION__FILE_PRODUCER:
				return fileProducer != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (standardRevision: ");
		result.append(standardRevision);
		result.append(", componentVersion: ");
		result.append(componentVersion);
		result.append(", componentType: ");
		result.append(componentType);
		result.append(')');
		return result.toString();
	}

} //ED247ConfigurationImpl
