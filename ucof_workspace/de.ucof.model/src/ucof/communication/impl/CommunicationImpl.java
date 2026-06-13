/**
 */
package ucof.communication.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.SuperIdentifierType;

import ucof.common.etypes.impl.SuperTrackingTypeImpl;

import ucof.communication.Communication;
import ucof.communication.CommunicationPackage;
import ucof.communication.Database;

import ucof.communication.comDevices.CommunicationDevices;

import ucof.communication.configECIC.ED247Configurations;

import ucof.communication.connectors.Connectors;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.impl.CommunicationImpl#getId <em>Id</em>}</li>
 *   <li>{@link ucof.communication.impl.CommunicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link ucof.communication.impl.CommunicationImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link ucof.communication.impl.CommunicationImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link ucof.communication.impl.CommunicationImpl#getEd247Configurations <em>Ed247 Configurations</em>}</li>
 *   <li>{@link ucof.communication.impl.CommunicationImpl#getCommunicationDevices <em>Communication Devices</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationImpl extends SuperTrackingTypeImpl implements Communication {
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
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected Database database;

	/**
	 * The cached value of the '{@link #getConnectors() <em>Connectors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectors()
	 * @generated
	 * @ordered
	 */
	protected Connectors connectors;

	/**
	 * The cached value of the '{@link #getEd247Configurations() <em>Ed247 Configurations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEd247Configurations()
	 * @generated
	 * @ordered
	 */
	protected ED247Configurations ed247Configurations;

	/**
	 * The cached value of the '{@link #getCommunicationDevices() <em>Communication Devices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationDevices> communicationDevices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationPackage.Literals.COMMUNICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database getDatabase() {
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabase(Database newDatabase, NotificationChain msgs) {
		Database oldDatabase = database;
		database = newDatabase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION__DATABASE, oldDatabase, newDatabase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabase(Database newDatabase) {
		if (newDatabase != database) {
			NotificationChain msgs = null;
			if (database != null)
				msgs = ((InternalEObject)database).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommunicationPackage.COMMUNICATION__DATABASE, null, msgs);
			if (newDatabase != null)
				msgs = ((InternalEObject)newDatabase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommunicationPackage.COMMUNICATION__DATABASE, null, msgs);
			msgs = basicSetDatabase(newDatabase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION__DATABASE, newDatabase, newDatabase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connectors getConnectors() {
		return connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectors(Connectors newConnectors, NotificationChain msgs) {
		Connectors oldConnectors = connectors;
		connectors = newConnectors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION__CONNECTORS, oldConnectors, newConnectors);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectors(Connectors newConnectors) {
		if (newConnectors != connectors) {
			NotificationChain msgs = null;
			if (connectors != null)
				msgs = ((InternalEObject)connectors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommunicationPackage.COMMUNICATION__CONNECTORS, null, msgs);
			if (newConnectors != null)
				msgs = ((InternalEObject)newConnectors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommunicationPackage.COMMUNICATION__CONNECTORS, null, msgs);
			msgs = basicSetConnectors(newConnectors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION__CONNECTORS, newConnectors, newConnectors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ED247Configurations getEd247Configurations() {
		return ed247Configurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEd247Configurations(ED247Configurations newEd247Configurations, NotificationChain msgs) {
		ED247Configurations oldEd247Configurations = ed247Configurations;
		ed247Configurations = newEd247Configurations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION__ED247_CONFIGURATIONS, oldEd247Configurations, newEd247Configurations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEd247Configurations(ED247Configurations newEd247Configurations) {
		if (newEd247Configurations != ed247Configurations) {
			NotificationChain msgs = null;
			if (ed247Configurations != null)
				msgs = ((InternalEObject)ed247Configurations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommunicationPackage.COMMUNICATION__ED247_CONFIGURATIONS, null, msgs);
			if (newEd247Configurations != null)
				msgs = ((InternalEObject)newEd247Configurations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommunicationPackage.COMMUNICATION__ED247_CONFIGURATIONS, null, msgs);
			msgs = basicSetEd247Configurations(newEd247Configurations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION__ED247_CONFIGURATIONS, newEd247Configurations, newEd247Configurations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationDevices> getCommunicationDevices() {
		if (communicationDevices == null) {
			communicationDevices = new EObjectContainmentEList<CommunicationDevices>(CommunicationDevices.class, this, CommunicationPackage.COMMUNICATION__COMMUNICATION_DEVICES);
		}
		return communicationDevices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommunicationPackage.COMMUNICATION__DATABASE:
				return basicSetDatabase(null, msgs);
			case CommunicationPackage.COMMUNICATION__CONNECTORS:
				return basicSetConnectors(null, msgs);
			case CommunicationPackage.COMMUNICATION__ED247_CONFIGURATIONS:
				return basicSetEd247Configurations(null, msgs);
			case CommunicationPackage.COMMUNICATION__COMMUNICATION_DEVICES:
				return ((InternalEList<?>)getCommunicationDevices()).basicRemove(otherEnd, msgs);
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
			case CommunicationPackage.COMMUNICATION__ID:
				return getId();
			case CommunicationPackage.COMMUNICATION__NAME:
				return getName();
			case CommunicationPackage.COMMUNICATION__DATABASE:
				return getDatabase();
			case CommunicationPackage.COMMUNICATION__CONNECTORS:
				return getConnectors();
			case CommunicationPackage.COMMUNICATION__ED247_CONFIGURATIONS:
				return getEd247Configurations();
			case CommunicationPackage.COMMUNICATION__COMMUNICATION_DEVICES:
				return getCommunicationDevices();
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
			case CommunicationPackage.COMMUNICATION__ID:
				setId((String)newValue);
				return;
			case CommunicationPackage.COMMUNICATION__NAME:
				setName((String)newValue);
				return;
			case CommunicationPackage.COMMUNICATION__DATABASE:
				setDatabase((Database)newValue);
				return;
			case CommunicationPackage.COMMUNICATION__CONNECTORS:
				setConnectors((Connectors)newValue);
				return;
			case CommunicationPackage.COMMUNICATION__ED247_CONFIGURATIONS:
				setEd247Configurations((ED247Configurations)newValue);
				return;
			case CommunicationPackage.COMMUNICATION__COMMUNICATION_DEVICES:
				getCommunicationDevices().clear();
				getCommunicationDevices().addAll((Collection<? extends CommunicationDevices>)newValue);
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
			case CommunicationPackage.COMMUNICATION__ID:
				setId(ID_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION__DATABASE:
				setDatabase((Database)null);
				return;
			case CommunicationPackage.COMMUNICATION__CONNECTORS:
				setConnectors((Connectors)null);
				return;
			case CommunicationPackage.COMMUNICATION__ED247_CONFIGURATIONS:
				setEd247Configurations((ED247Configurations)null);
				return;
			case CommunicationPackage.COMMUNICATION__COMMUNICATION_DEVICES:
				getCommunicationDevices().clear();
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
			case CommunicationPackage.COMMUNICATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CommunicationPackage.COMMUNICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CommunicationPackage.COMMUNICATION__DATABASE:
				return database != null;
			case CommunicationPackage.COMMUNICATION__CONNECTORS:
				return connectors != null;
			case CommunicationPackage.COMMUNICATION__ED247_CONFIGURATIONS:
				return ed247Configurations != null;
			case CommunicationPackage.COMMUNICATION__COMMUNICATION_DEVICES:
				return communicationDevices != null && !communicationDevices.isEmpty();
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
				case CommunicationPackage.COMMUNICATION__ID: return EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;
				case CommunicationPackage.COMMUNICATION__NAME: return EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;
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
				case EtypesPackage.SUPER_IDENTIFIER_TYPE__ID: return CommunicationPackage.COMMUNICATION__ID;
				case EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME: return CommunicationPackage.COMMUNICATION__NAME;
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
		result.append(')');
		return result.toString();
	}

} //CommunicationImpl
