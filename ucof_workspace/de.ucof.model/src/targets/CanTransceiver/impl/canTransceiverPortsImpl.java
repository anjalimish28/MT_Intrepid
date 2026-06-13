/**
 */
package targets.cantransceiver.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import targets.cantransceiver.CantransceiverPackage;
import targets.cantransceiver.canTransceiverPort;
import targets.cantransceiver.canTransceiverPorts;

import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.SuperIdentifierType;

import ucof.common.etypes.impl.SuperTrackingTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>can Transceiver Ports</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.cantransceiver.impl.canTransceiverPortsImpl#getId <em>Id</em>}</li>
 *   <li>{@link targets.cantransceiver.impl.canTransceiverPortsImpl#getName <em>Name</em>}</li>
 *   <li>{@link targets.cantransceiver.impl.canTransceiverPortsImpl#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class canTransceiverPortsImpl extends SuperTrackingTypeImpl implements canTransceiverPorts {
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
	 * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EList<canTransceiverPort> port;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected canTransceiverPortsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CantransceiverPackage.Literals.CAN_TRANSCEIVER_PORTS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CantransceiverPackage.CAN_TRANSCEIVER_PORTS__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CantransceiverPackage.CAN_TRANSCEIVER_PORTS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<canTransceiverPort> getPort() {
		if (port == null) {
			port = new EObjectContainmentEList<canTransceiverPort>(canTransceiverPort.class, this, CantransceiverPackage.CAN_TRANSCEIVER_PORTS__PORT);
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CantransceiverPackage.CAN_TRANSCEIVER_PORTS__PORT:
				return ((InternalEList<?>)getPort()).basicRemove(otherEnd, msgs);
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
			case CantransceiverPackage.CAN_TRANSCEIVER_PORTS__ID:
				return getId();
			case CantransceiverPackage.CAN_TRANSCEIVER_PORTS__NAME:
				return getName();
			case CantransceiverPackage.CAN_TRANSCEIVER_PORTS__PORT:
				return getPort();
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
			case CantransceiverPackage.CAN_TRANSCEIVER_PORTS__ID:
				setId((String)newValue);
				return;
			case CantransceiverPackage.CAN_TRANSCEIVER_PORTS__NAME:
				setName((String)newValue);
				return;
			case CantransceiverPackage.CAN_TRANSCEIVER_PORTS__PORT:
				getPort().clear();
				getPort().addAll((Collection<? extends canTransceiverPort>)newValue);
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
			case CantransceiverPackage.CAN_TRANSCEIVER_PORTS__ID:
				setId(ID_EDEFAULT);
				return;
			case CantransceiverPackage.CAN_TRANSCEIVER_PORTS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CantransceiverPackage.CAN_TRANSCEIVER_PORTS__PORT:
				getPort().clear();
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
			case CantransceiverPackage.CAN_TRANSCEIVER_PORTS__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CantransceiverPackage.CAN_TRANSCEIVER_PORTS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CantransceiverPackage.CAN_TRANSCEIVER_PORTS__PORT:
				return port != null && !port.isEmpty();
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
				case CantransceiverPackage.CAN_TRANSCEIVER_PORTS__ID: return EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;
				case CantransceiverPackage.CAN_TRANSCEIVER_PORTS__NAME: return EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;
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
				case EtypesPackage.SUPER_IDENTIFIER_TYPE__ID: return CantransceiverPackage.CAN_TRANSCEIVER_PORTS__ID;
				case EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME: return CantransceiverPackage.CAN_TRANSCEIVER_PORTS__NAME;
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

} //canTransceiverPortsImpl
