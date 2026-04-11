/**
 */
package targets.powergrid.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import targets.powergrid.EletrcialInterfaces;
import targets.powergrid.PowergridPackage;
import targets.powergrid.SuperPowerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Super Power Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.powergrid.impl.SuperPowerTypeImpl#getElectricalInterfaces <em>Electrical Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SuperPowerTypeImpl extends MinimalEObjectImpl.Container implements SuperPowerType {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperPowerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PowergridPackage.Literals.SUPER_POWER_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PowergridPackage.SUPER_POWER_TYPE__ELECTRICAL_INTERFACES, oldElectricalInterfaces, newElectricalInterfaces);
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
				msgs = ((InternalEObject)electricalInterfaces).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PowergridPackage.SUPER_POWER_TYPE__ELECTRICAL_INTERFACES, null, msgs);
			if (newElectricalInterfaces != null)
				msgs = ((InternalEObject)newElectricalInterfaces).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PowergridPackage.SUPER_POWER_TYPE__ELECTRICAL_INTERFACES, null, msgs);
			msgs = basicSetElectricalInterfaces(newElectricalInterfaces, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PowergridPackage.SUPER_POWER_TYPE__ELECTRICAL_INTERFACES, newElectricalInterfaces, newElectricalInterfaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PowergridPackage.SUPER_POWER_TYPE__ELECTRICAL_INTERFACES:
				return basicSetElectricalInterfaces(null, msgs);
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
			case PowergridPackage.SUPER_POWER_TYPE__ELECTRICAL_INTERFACES:
				return getElectricalInterfaces();
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
			case PowergridPackage.SUPER_POWER_TYPE__ELECTRICAL_INTERFACES:
				setElectricalInterfaces((EletrcialInterfaces)newValue);
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
			case PowergridPackage.SUPER_POWER_TYPE__ELECTRICAL_INTERFACES:
				setElectricalInterfaces((EletrcialInterfaces)null);
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
			case PowergridPackage.SUPER_POWER_TYPE__ELECTRICAL_INTERFACES:
				return electricalInterfaces != null;
		}
		return super.eIsSet(featureID);
	}

} //SuperPowerTypeImpl
