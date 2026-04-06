/**
 */
package ucof.communication.connectors.impl;

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

import ucof.communication.connectors.ConnectionPin;
import ucof.communication.connectors.Connector;
import ucof.communication.connectors.ConnectorsPackage;
import ucof.communication.connectors.LineType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.connectors.impl.ConnectorImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link ucof.communication.connectors.impl.ConnectorImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link ucof.communication.connectors.impl.ConnectorImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link ucof.communication.connectors.impl.ConnectorImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link ucof.communication.connectors.impl.ConnectorImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link ucof.communication.connectors.impl.ConnectorImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link ucof.communication.connectors.impl.ConnectorImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link ucof.communication.connectors.impl.ConnectorImpl#getConnectorType <em>Connector Type</em>}</li>
 *   <li>{@link ucof.communication.connectors.impl.ConnectorImpl#getLineType <em>Line Type</em>}</li>
 *   <li>{@link ucof.communication.connectors.impl.ConnectorImpl#getConnectionPin <em>Connection Pin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends SuperIdentifierTypeImpl implements Connector {
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
	 * The default value of the '{@link #getConnectorType() <em>Connector Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECTOR_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectorType() <em>Connector Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorType()
	 * @generated
	 * @ordered
	 */
	protected String connectorType = CONNECTOR_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineType() <em>Line Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineType()
	 * @generated
	 * @ordered
	 */
	protected static final LineType LINE_TYPE_EDEFAULT = LineType.NOT_SET;

	/**
	 * The cached value of the '{@link #getLineType() <em>Line Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineType()
	 * @generated
	 * @ordered
	 */
	protected LineType lineType = LINE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnectionPin() <em>Connection Pin</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionPin()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectionPin> connectionPin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConnectorsPackage.Literals.CONNECTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConnectorsPackage.CONNECTOR__DOCUMENTATION, oldDocumentation, documentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConnectorsPackage.CONNECTOR__MODIFIED, oldModified, modified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConnectorsPackage.CONNECTOR__MODIFIER, oldModifier, modifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConnectorsPackage.CONNECTOR__TRACE_LINK, oldTraceLink, traceLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConnectorsPackage.CONNECTOR__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConnectorsPackage.CONNECTOR__CREATOR, oldCreator, creator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConnectorsPackage.CONNECTOR__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConnectorType() {
		return connectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectorType(String newConnectorType) {
		String oldConnectorType = connectorType;
		connectorType = newConnectorType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConnectorsPackage.CONNECTOR__CONNECTOR_TYPE, oldConnectorType, connectorType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineType getLineType() {
		return lineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineType(LineType newLineType) {
		LineType oldLineType = lineType;
		lineType = newLineType == null ? LINE_TYPE_EDEFAULT : newLineType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConnectorsPackage.CONNECTOR__LINE_TYPE, oldLineType, lineType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectionPin> getConnectionPin() {
		if (connectionPin == null) {
			connectionPin = new EObjectContainmentEList<ConnectionPin>(ConnectionPin.class, this, ConnectorsPackage.CONNECTOR__CONNECTION_PIN);
		}
		return connectionPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConnectorsPackage.CONNECTOR__CONNECTION_PIN:
				return ((InternalEList<?>)getConnectionPin()).basicRemove(otherEnd, msgs);
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
			case ConnectorsPackage.CONNECTOR__DOCUMENTATION:
				return getDocumentation();
			case ConnectorsPackage.CONNECTOR__MODIFIED:
				return getModified();
			case ConnectorsPackage.CONNECTOR__MODIFIER:
				return getModifier();
			case ConnectorsPackage.CONNECTOR__TRACE_LINK:
				return getTraceLink();
			case ConnectorsPackage.CONNECTOR__CREATED:
				return getCreated();
			case ConnectorsPackage.CONNECTOR__CREATOR:
				return getCreator();
			case ConnectorsPackage.CONNECTOR__VERSION:
				return getVersion();
			case ConnectorsPackage.CONNECTOR__CONNECTOR_TYPE:
				return getConnectorType();
			case ConnectorsPackage.CONNECTOR__LINE_TYPE:
				return getLineType();
			case ConnectorsPackage.CONNECTOR__CONNECTION_PIN:
				return getConnectionPin();
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
			case ConnectorsPackage.CONNECTOR__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case ConnectorsPackage.CONNECTOR__MODIFIED:
				setModified((Date)newValue);
				return;
			case ConnectorsPackage.CONNECTOR__MODIFIER:
				setModifier((String)newValue);
				return;
			case ConnectorsPackage.CONNECTOR__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case ConnectorsPackage.CONNECTOR__CREATED:
				setCreated((Date)newValue);
				return;
			case ConnectorsPackage.CONNECTOR__CREATOR:
				setCreator((String)newValue);
				return;
			case ConnectorsPackage.CONNECTOR__VERSION:
				setVersion((Float)newValue);
				return;
			case ConnectorsPackage.CONNECTOR__CONNECTOR_TYPE:
				setConnectorType((String)newValue);
				return;
			case ConnectorsPackage.CONNECTOR__LINE_TYPE:
				setLineType((LineType)newValue);
				return;
			case ConnectorsPackage.CONNECTOR__CONNECTION_PIN:
				getConnectionPin().clear();
				getConnectionPin().addAll((Collection<? extends ConnectionPin>)newValue);
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
			case ConnectorsPackage.CONNECTOR__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case ConnectorsPackage.CONNECTOR__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case ConnectorsPackage.CONNECTOR__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case ConnectorsPackage.CONNECTOR__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case ConnectorsPackage.CONNECTOR__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case ConnectorsPackage.CONNECTOR__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case ConnectorsPackage.CONNECTOR__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ConnectorsPackage.CONNECTOR__CONNECTOR_TYPE:
				setConnectorType(CONNECTOR_TYPE_EDEFAULT);
				return;
			case ConnectorsPackage.CONNECTOR__LINE_TYPE:
				setLineType(LINE_TYPE_EDEFAULT);
				return;
			case ConnectorsPackage.CONNECTOR__CONNECTION_PIN:
				getConnectionPin().clear();
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
			case ConnectorsPackage.CONNECTOR__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case ConnectorsPackage.CONNECTOR__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case ConnectorsPackage.CONNECTOR__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case ConnectorsPackage.CONNECTOR__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case ConnectorsPackage.CONNECTOR__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case ConnectorsPackage.CONNECTOR__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case ConnectorsPackage.CONNECTOR__VERSION:
				return version != VERSION_EDEFAULT;
			case ConnectorsPackage.CONNECTOR__CONNECTOR_TYPE:
				return CONNECTOR_TYPE_EDEFAULT == null ? connectorType != null : !CONNECTOR_TYPE_EDEFAULT.equals(connectorType);
			case ConnectorsPackage.CONNECTOR__LINE_TYPE:
				return lineType != LINE_TYPE_EDEFAULT;
			case ConnectorsPackage.CONNECTOR__CONNECTION_PIN:
				return connectionPin != null && !connectionPin.isEmpty();
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
				case ConnectorsPackage.CONNECTOR__DOCUMENTATION: return EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;
				case ConnectorsPackage.CONNECTOR__MODIFIED: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;
				case ConnectorsPackage.CONNECTOR__MODIFIER: return EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;
				case ConnectorsPackage.CONNECTOR__TRACE_LINK: return EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;
				case ConnectorsPackage.CONNECTOR__CREATED: return EtypesPackage.SUPER_TRACKING_TYPE__CREATED;
				case ConnectorsPackage.CONNECTOR__CREATOR: return EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;
				case ConnectorsPackage.CONNECTOR__VERSION: return EtypesPackage.SUPER_TRACKING_TYPE__VERSION;
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
				case EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION: return ConnectorsPackage.CONNECTOR__DOCUMENTATION;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED: return ConnectorsPackage.CONNECTOR__MODIFIED;
				case EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER: return ConnectorsPackage.CONNECTOR__MODIFIER;
				case EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK: return ConnectorsPackage.CONNECTOR__TRACE_LINK;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATED: return ConnectorsPackage.CONNECTOR__CREATED;
				case EtypesPackage.SUPER_TRACKING_TYPE__CREATOR: return ConnectorsPackage.CONNECTOR__CREATOR;
				case EtypesPackage.SUPER_TRACKING_TYPE__VERSION: return ConnectorsPackage.CONNECTOR__VERSION;
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
		result.append(", connectorType: ");
		result.append(connectorType);
		result.append(", lineType: ");
		result.append(lineType);
		result.append(')');
		return result.toString();
	}

} //ConnectorImpl
