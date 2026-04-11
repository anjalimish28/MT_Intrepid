/**
 */
package targets.CCDPU.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import targets.CCDPU.CCDPUPackage;
import targets.CCDPU.va41620peb1;
import targets.CCDPU.voragoPorts;

import targets.impl.SuperTargetTypeImpl;
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
 *   <li>{@link targets.CCDPU.impl.va41620peb1Impl#getElectricalInterfaces <em>Electrical Interfaces</em>}</li>
 *   <li>{@link targets.CCDPU.impl.va41620peb1Impl#getPorts <em>Ports</em>}</li>
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
		return CCDPUPackage.Literals.VA41620PEB1;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CCDPUPackage.VA41620PEB1__ELECTRICAL_INTERFACES, oldElectricalInterfaces, newElectricalInterfaces);
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
				msgs = ((InternalEObject)electricalInterfaces).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CCDPUPackage.VA41620PEB1__ELECTRICAL_INTERFACES, null, msgs);
			if (newElectricalInterfaces != null)
				msgs = ((InternalEObject)newElectricalInterfaces).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CCDPUPackage.VA41620PEB1__ELECTRICAL_INTERFACES, null, msgs);
			msgs = basicSetElectricalInterfaces(newElectricalInterfaces, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCDPUPackage.VA41620PEB1__ELECTRICAL_INTERFACES, newElectricalInterfaces, newElectricalInterfaces));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CCDPUPackage.VA41620PEB1__PORTS, oldPorts, newPorts);
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
				msgs = ((InternalEObject)ports).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CCDPUPackage.VA41620PEB1__PORTS, null, msgs);
			if (newPorts != null)
				msgs = ((InternalEObject)newPorts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CCDPUPackage.VA41620PEB1__PORTS, null, msgs);
			msgs = basicSetPorts(newPorts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CCDPUPackage.VA41620PEB1__PORTS, newPorts, newPorts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CCDPUPackage.VA41620PEB1__ELECTRICAL_INTERFACES:
				return basicSetElectricalInterfaces(null, msgs);
			case CCDPUPackage.VA41620PEB1__PORTS:
				return basicSetPorts(null, msgs);
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
			case CCDPUPackage.VA41620PEB1__ELECTRICAL_INTERFACES:
				return getElectricalInterfaces();
			case CCDPUPackage.VA41620PEB1__PORTS:
				return getPorts();
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
			case CCDPUPackage.VA41620PEB1__ELECTRICAL_INTERFACES:
				setElectricalInterfaces((EletrcialInterfaces)newValue);
				return;
			case CCDPUPackage.VA41620PEB1__PORTS:
				setPorts((voragoPorts)newValue);
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
			case CCDPUPackage.VA41620PEB1__ELECTRICAL_INTERFACES:
				setElectricalInterfaces((EletrcialInterfaces)null);
				return;
			case CCDPUPackage.VA41620PEB1__PORTS:
				setPorts((voragoPorts)null);
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
			case CCDPUPackage.VA41620PEB1__ELECTRICAL_INTERFACES:
				return electricalInterfaces != null;
			case CCDPUPackage.VA41620PEB1__PORTS:
				return ports != null;
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
				case CCDPUPackage.VA41620PEB1__ELECTRICAL_INTERFACES: return PowergridPackage.SUPER_POWER_TYPE__ELECTRICAL_INTERFACES;
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
				case PowergridPackage.SUPER_POWER_TYPE__ELECTRICAL_INTERFACES: return CCDPUPackage.VA41620PEB1__ELECTRICAL_INTERFACES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //va41620peb1Impl
