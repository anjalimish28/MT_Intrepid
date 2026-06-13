/**
 */
package targets.cpn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import targets.cpn.CanDriverConfig;
import targets.cpn.CpnPackage;
import targets.cpn.va41620peb1;
import targets.cpn.voragoPorts;

import targets.impl.SuperTargetTypeImpl;

import targets.intrepidgateway.MsgBoxExtension;

import targets.powergrid.EletrcialInterfaces;
import targets.powergrid.PowergridPackage;
import targets.powergrid.SuperPowerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>va41620peb1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.cpn.impl.va41620peb1Impl#getElectricalInterfaces <em>Electrical Interfaces</em>}</li>
 *   <li>{@link targets.cpn.impl.va41620peb1Impl#getPorts <em>Ports</em>}</li>
 *   <li>{@link targets.cpn.impl.va41620peb1Impl#getMsgBoxExtension <em>Msg Box Extension</em>}</li>
 *   <li>{@link targets.cpn.impl.va41620peb1Impl#getCanDriverConfig <em>Can Driver Config</em>}</li>
 * </ul>
 *
 * @generated
 */
public class va41620peb1Impl extends SuperTargetTypeImpl implements va41620peb1 {
	/**
	 * The cached value of the '{@link #getElectricalInterfaces() <em>Electrical Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectricalInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EletrcialInterfaces electricalInterfaces;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected voragoPorts ports;

	/**
	 * The cached value of the '{@link #getMsgBoxExtension() <em>Msg Box Extension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsgBoxExtension()
	 * @generated
	 * @ordered
	 */
	protected MsgBoxExtension msgBoxExtension;

	/**
	 * The cached value of the '{@link #getCanDriverConfig() <em>Can Driver Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanDriverConfig()
	 * @generated
	 * @ordered
	 */
	protected CanDriverConfig canDriverConfig;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected va41620peb1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpnPackage.Literals.VA41620PEB1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EletrcialInterfaces getElectricalInterfaces() {
		return electricalInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElectricalInterfaces(EletrcialInterfaces newElectricalInterfaces, NotificationChain msgs) {
		EletrcialInterfaces oldElectricalInterfaces = electricalInterfaces;
		electricalInterfaces = newElectricalInterfaces;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CpnPackage.VA41620PEB1__ELECTRICAL_INTERFACES, oldElectricalInterfaces, newElectricalInterfaces);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElectricalInterfaces(EletrcialInterfaces newElectricalInterfaces) {
		if (newElectricalInterfaces != electricalInterfaces) {
			NotificationChain msgs = null;
			if (electricalInterfaces != null)
				msgs = ((InternalEObject)electricalInterfaces).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CpnPackage.VA41620PEB1__ELECTRICAL_INTERFACES, null, msgs);
			if (newElectricalInterfaces != null)
				msgs = ((InternalEObject)newElectricalInterfaces).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CpnPackage.VA41620PEB1__ELECTRICAL_INTERFACES, null, msgs);
			msgs = basicSetElectricalInterfaces(newElectricalInterfaces, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpnPackage.VA41620PEB1__ELECTRICAL_INTERFACES, newElectricalInterfaces, newElectricalInterfaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public voragoPorts getPorts() {
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPorts(voragoPorts newPorts, NotificationChain msgs) {
		voragoPorts oldPorts = ports;
		ports = newPorts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CpnPackage.VA41620PEB1__PORTS, oldPorts, newPorts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPorts(voragoPorts newPorts) {
		if (newPorts != ports) {
			NotificationChain msgs = null;
			if (ports != null)
				msgs = ((InternalEObject)ports).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CpnPackage.VA41620PEB1__PORTS, null, msgs);
			if (newPorts != null)
				msgs = ((InternalEObject)newPorts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CpnPackage.VA41620PEB1__PORTS, null, msgs);
			msgs = basicSetPorts(newPorts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpnPackage.VA41620PEB1__PORTS, newPorts, newPorts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MsgBoxExtension getMsgBoxExtension() {
		return msgBoxExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMsgBoxExtension(MsgBoxExtension newMsgBoxExtension, NotificationChain msgs) {
		MsgBoxExtension oldMsgBoxExtension = msgBoxExtension;
		msgBoxExtension = newMsgBoxExtension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CpnPackage.VA41620PEB1__MSG_BOX_EXTENSION, oldMsgBoxExtension, newMsgBoxExtension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMsgBoxExtension(MsgBoxExtension newMsgBoxExtension) {
		if (newMsgBoxExtension != msgBoxExtension) {
			NotificationChain msgs = null;
			if (msgBoxExtension != null)
				msgs = ((InternalEObject)msgBoxExtension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CpnPackage.VA41620PEB1__MSG_BOX_EXTENSION, null, msgs);
			if (newMsgBoxExtension != null)
				msgs = ((InternalEObject)newMsgBoxExtension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CpnPackage.VA41620PEB1__MSG_BOX_EXTENSION, null, msgs);
			msgs = basicSetMsgBoxExtension(newMsgBoxExtension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpnPackage.VA41620PEB1__MSG_BOX_EXTENSION, newMsgBoxExtension, newMsgBoxExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanDriverConfig getCanDriverConfig() {
		return canDriverConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCanDriverConfig(CanDriverConfig newCanDriverConfig, NotificationChain msgs) {
		CanDriverConfig oldCanDriverConfig = canDriverConfig;
		canDriverConfig = newCanDriverConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CpnPackage.VA41620PEB1__CAN_DRIVER_CONFIG, oldCanDriverConfig, newCanDriverConfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanDriverConfig(CanDriverConfig newCanDriverConfig) {
		if (newCanDriverConfig != canDriverConfig) {
			NotificationChain msgs = null;
			if (canDriverConfig != null)
				msgs = ((InternalEObject)canDriverConfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CpnPackage.VA41620PEB1__CAN_DRIVER_CONFIG, null, msgs);
			if (newCanDriverConfig != null)
				msgs = ((InternalEObject)newCanDriverConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CpnPackage.VA41620PEB1__CAN_DRIVER_CONFIG, null, msgs);
			msgs = basicSetCanDriverConfig(newCanDriverConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpnPackage.VA41620PEB1__CAN_DRIVER_CONFIG, newCanDriverConfig, newCanDriverConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CpnPackage.VA41620PEB1__ELECTRICAL_INTERFACES:
				return basicSetElectricalInterfaces(null, msgs);
			case CpnPackage.VA41620PEB1__PORTS:
				return basicSetPorts(null, msgs);
			case CpnPackage.VA41620PEB1__MSG_BOX_EXTENSION:
				return basicSetMsgBoxExtension(null, msgs);
			case CpnPackage.VA41620PEB1__CAN_DRIVER_CONFIG:
				return basicSetCanDriverConfig(null, msgs);
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
			case CpnPackage.VA41620PEB1__ELECTRICAL_INTERFACES:
				return getElectricalInterfaces();
			case CpnPackage.VA41620PEB1__PORTS:
				return getPorts();
			case CpnPackage.VA41620PEB1__MSG_BOX_EXTENSION:
				return getMsgBoxExtension();
			case CpnPackage.VA41620PEB1__CAN_DRIVER_CONFIG:
				return getCanDriverConfig();
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
			case CpnPackage.VA41620PEB1__ELECTRICAL_INTERFACES:
				setElectricalInterfaces((EletrcialInterfaces)newValue);
				return;
			case CpnPackage.VA41620PEB1__PORTS:
				setPorts((voragoPorts)newValue);
				return;
			case CpnPackage.VA41620PEB1__MSG_BOX_EXTENSION:
				setMsgBoxExtension((MsgBoxExtension)newValue);
				return;
			case CpnPackage.VA41620PEB1__CAN_DRIVER_CONFIG:
				setCanDriverConfig((CanDriverConfig)newValue);
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
			case CpnPackage.VA41620PEB1__ELECTRICAL_INTERFACES:
				setElectricalInterfaces((EletrcialInterfaces)null);
				return;
			case CpnPackage.VA41620PEB1__PORTS:
				setPorts((voragoPorts)null);
				return;
			case CpnPackage.VA41620PEB1__MSG_BOX_EXTENSION:
				setMsgBoxExtension((MsgBoxExtension)null);
				return;
			case CpnPackage.VA41620PEB1__CAN_DRIVER_CONFIG:
				setCanDriverConfig((CanDriverConfig)null);
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
			case CpnPackage.VA41620PEB1__ELECTRICAL_INTERFACES:
				return electricalInterfaces != null;
			case CpnPackage.VA41620PEB1__PORTS:
				return ports != null;
			case CpnPackage.VA41620PEB1__MSG_BOX_EXTENSION:
				return msgBoxExtension != null;
			case CpnPackage.VA41620PEB1__CAN_DRIVER_CONFIG:
				return canDriverConfig != null;
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
		if (baseClass == SuperPowerType.class) {
			switch (derivedFeatureID) {
				case CpnPackage.VA41620PEB1__ELECTRICAL_INTERFACES: return PowergridPackage.SUPER_POWER_TYPE__ELECTRICAL_INTERFACES;
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
		if (baseClass == SuperPowerType.class) {
			switch (baseFeatureID) {
				case PowergridPackage.SUPER_POWER_TYPE__ELECTRICAL_INTERFACES: return CpnPackage.VA41620PEB1__ELECTRICAL_INTERFACES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //va41620peb1Impl
