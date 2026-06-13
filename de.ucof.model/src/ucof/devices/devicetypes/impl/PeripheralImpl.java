/**
 */
package ucof.devices.devicetypes.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.devices.devicetypes.DevicetypesPackage;
import ucof.devices.devicetypes.Peripheral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Peripheral</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.devicetypes.impl.PeripheralImpl#getPeripheralType <em>Peripheral Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PeripheralImpl extends SuperA653ModuleTypeImpl implements Peripheral {
	/**
	 * The default value of the '{@link #getPeripheralType() <em>Peripheral Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeripheralType()
	 * @generated
	 * @ordered
	 */
	protected static final String PERIPHERAL_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPeripheralType() <em>Peripheral Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeripheralType()
	 * @generated
	 * @ordered
	 */
	protected String peripheralType = PERIPHERAL_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PeripheralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DevicetypesPackage.Literals.PERIPHERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPeripheralType() {
		return peripheralType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeripheralType(String newPeripheralType) {
		String oldPeripheralType = peripheralType;
		peripheralType = newPeripheralType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicetypesPackage.PERIPHERAL__PERIPHERAL_TYPE, oldPeripheralType, peripheralType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DevicetypesPackage.PERIPHERAL__PERIPHERAL_TYPE:
				return getPeripheralType();
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
			case DevicetypesPackage.PERIPHERAL__PERIPHERAL_TYPE:
				setPeripheralType((String)newValue);
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
			case DevicetypesPackage.PERIPHERAL__PERIPHERAL_TYPE:
				setPeripheralType(PERIPHERAL_TYPE_EDEFAULT);
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
			case DevicetypesPackage.PERIPHERAL__PERIPHERAL_TYPE:
				return PERIPHERAL_TYPE_EDEFAULT == null ? peripheralType != null : !PERIPHERAL_TYPE_EDEFAULT.equals(peripheralType);
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
		result.append(" (peripheralType: ");
		result.append(peripheralType);
		result.append(')');
		return result.toString();
	}

} //PeripheralImpl
