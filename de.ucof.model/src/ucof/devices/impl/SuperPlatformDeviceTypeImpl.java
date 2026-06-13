/**
 */
package ucof.devices.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.common.enums.ImplementationType;

import ucof.common.etypes.impl.SuperDeviceTypeImpl;

import ucof.devices.DevicesPackage;
import ucof.devices.SuperPlatformDeviceType;

import ucof.devices.functions.DeviceFunctions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Super Platform Device Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.impl.SuperPlatformDeviceTypeImpl#getDeviceFunctions <em>Device Functions</em>}</li>
 *   <li>{@link ucof.devices.impl.SuperPlatformDeviceTypeImpl#getImplementationType <em>Implementation Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SuperPlatformDeviceTypeImpl extends SuperDeviceTypeImpl implements SuperPlatformDeviceType {
	/**
	 * The cached value of the '{@link #getDeviceFunctions() <em>Device Functions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceFunctions()
	 * @generated
	 * @ordered
	 */
	protected DeviceFunctions deviceFunctions;

	/**
	 * The default value of the '{@link #getImplementationType() <em>Implementation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationType()
	 * @generated
	 * @ordered
	 */
	protected static final ImplementationType IMPLEMENTATION_TYPE_EDEFAULT = ImplementationType.NOT_SET;

	/**
	 * The cached value of the '{@link #getImplementationType() <em>Implementation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationType()
	 * @generated
	 * @ordered
	 */
	protected ImplementationType implementationType = IMPLEMENTATION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperPlatformDeviceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DevicesPackage.Literals.SUPER_PLATFORM_DEVICE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceFunctions getDeviceFunctions() {
		return deviceFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceFunctions(DeviceFunctions newDeviceFunctions, NotificationChain msgs) {
		DeviceFunctions oldDeviceFunctions = deviceFunctions;
		deviceFunctions = newDeviceFunctions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DevicesPackage.SUPER_PLATFORM_DEVICE_TYPE__DEVICE_FUNCTIONS, oldDeviceFunctions, newDeviceFunctions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceFunctions(DeviceFunctions newDeviceFunctions) {
		if (newDeviceFunctions != deviceFunctions) {
			NotificationChain msgs = null;
			if (deviceFunctions != null)
				msgs = ((InternalEObject)deviceFunctions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DevicesPackage.SUPER_PLATFORM_DEVICE_TYPE__DEVICE_FUNCTIONS, null, msgs);
			if (newDeviceFunctions != null)
				msgs = ((InternalEObject)newDeviceFunctions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DevicesPackage.SUPER_PLATFORM_DEVICE_TYPE__DEVICE_FUNCTIONS, null, msgs);
			msgs = basicSetDeviceFunctions(newDeviceFunctions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.SUPER_PLATFORM_DEVICE_TYPE__DEVICE_FUNCTIONS, newDeviceFunctions, newDeviceFunctions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationType getImplementationType() {
		return implementationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationType(ImplementationType newImplementationType) {
		ImplementationType oldImplementationType = implementationType;
		implementationType = newImplementationType == null ? IMPLEMENTATION_TYPE_EDEFAULT : newImplementationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicesPackage.SUPER_PLATFORM_DEVICE_TYPE__IMPLEMENTATION_TYPE, oldImplementationType, implementationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DevicesPackage.SUPER_PLATFORM_DEVICE_TYPE__DEVICE_FUNCTIONS:
				return basicSetDeviceFunctions(null, msgs);
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
			case DevicesPackage.SUPER_PLATFORM_DEVICE_TYPE__DEVICE_FUNCTIONS:
				return getDeviceFunctions();
			case DevicesPackage.SUPER_PLATFORM_DEVICE_TYPE__IMPLEMENTATION_TYPE:
				return getImplementationType();
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
			case DevicesPackage.SUPER_PLATFORM_DEVICE_TYPE__DEVICE_FUNCTIONS:
				setDeviceFunctions((DeviceFunctions)newValue);
				return;
			case DevicesPackage.SUPER_PLATFORM_DEVICE_TYPE__IMPLEMENTATION_TYPE:
				setImplementationType((ImplementationType)newValue);
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
			case DevicesPackage.SUPER_PLATFORM_DEVICE_TYPE__DEVICE_FUNCTIONS:
				setDeviceFunctions((DeviceFunctions)null);
				return;
			case DevicesPackage.SUPER_PLATFORM_DEVICE_TYPE__IMPLEMENTATION_TYPE:
				setImplementationType(IMPLEMENTATION_TYPE_EDEFAULT);
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
			case DevicesPackage.SUPER_PLATFORM_DEVICE_TYPE__DEVICE_FUNCTIONS:
				return deviceFunctions != null;
			case DevicesPackage.SUPER_PLATFORM_DEVICE_TYPE__IMPLEMENTATION_TYPE:
				return implementationType != IMPLEMENTATION_TYPE_EDEFAULT;
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
		result.append(" (implementationType: ");
		result.append(implementationType);
		result.append(')');
		return result.toString();
	}

} //SuperPlatformDeviceTypeImpl
