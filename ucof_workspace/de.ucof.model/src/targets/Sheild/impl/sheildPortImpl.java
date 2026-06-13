/**
 */
package targets.sheild.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import targets.impl.SuperHardwarePortTypeImpl;

import targets.powergrid.PowergridPackage;
import targets.powergrid.SuperElectricalInterfaceType;
import targets.powergrid.interfaceType;

import targets.sheild.SheildPackage;
import targets.sheild.sheildPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>sheild Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.sheild.impl.sheildPortImpl#getMinVoltage <em>Min Voltage</em>}</li>
 *   <li>{@link targets.sheild.impl.sheildPortImpl#getMaxVoltage <em>Max Voltage</em>}</li>
 *   <li>{@link targets.sheild.impl.sheildPortImpl#getType <em>Type</em>}</li>
 *   <li>{@link targets.sheild.impl.sheildPortImpl#getPinName <em>Pin Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class sheildPortImpl extends SuperHardwarePortTypeImpl implements sheildPort {
	/**
	 * The default value of the '{@link #getMinVoltage() <em>Min Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_VOLTAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinVoltage() <em>Min Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinVoltage()
	 * @generated
	 * @ordered
	 */
	protected double minVoltage = MIN_VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxVoltage() <em>Max Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_VOLTAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxVoltage() <em>Max Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxVoltage()
	 * @generated
	 * @ordered
	 */
	protected double maxVoltage = MAX_VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final interfaceType TYPE_EDEFAULT = interfaceType.NOT_SET;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected interfaceType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPinName() <em>Pin Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinName()
	 * @generated
	 * @ordered
	 */
	protected static final String PIN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPinName() <em>Pin Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinName()
	 * @generated
	 * @ordered
	 */
	protected String pinName = PIN_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected sheildPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SheildPackage.Literals.SHEILD_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinVoltage() {
		return minVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinVoltage(double newMinVoltage) {
		double oldMinVoltage = minVoltage;
		minVoltage = newMinVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SheildPackage.SHEILD_PORT__MIN_VOLTAGE, oldMinVoltage, minVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxVoltage() {
		return maxVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxVoltage(double newMaxVoltage) {
		double oldMaxVoltage = maxVoltage;
		maxVoltage = newMaxVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SheildPackage.SHEILD_PORT__MAX_VOLTAGE, oldMaxVoltage, maxVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interfaceType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(interfaceType newType) {
		interfaceType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SheildPackage.SHEILD_PORT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPinName() {
		return pinName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPinName(String newPinName) {
		String oldPinName = pinName;
		pinName = newPinName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SheildPackage.SHEILD_PORT__PIN_NAME, oldPinName, pinName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SheildPackage.SHEILD_PORT__MIN_VOLTAGE:
				return getMinVoltage();
			case SheildPackage.SHEILD_PORT__MAX_VOLTAGE:
				return getMaxVoltage();
			case SheildPackage.SHEILD_PORT__TYPE:
				return getType();
			case SheildPackage.SHEILD_PORT__PIN_NAME:
				return getPinName();
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
			case SheildPackage.SHEILD_PORT__MIN_VOLTAGE:
				setMinVoltage((Double)newValue);
				return;
			case SheildPackage.SHEILD_PORT__MAX_VOLTAGE:
				setMaxVoltage((Double)newValue);
				return;
			case SheildPackage.SHEILD_PORT__TYPE:
				setType((interfaceType)newValue);
				return;
			case SheildPackage.SHEILD_PORT__PIN_NAME:
				setPinName((String)newValue);
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
			case SheildPackage.SHEILD_PORT__MIN_VOLTAGE:
				setMinVoltage(MIN_VOLTAGE_EDEFAULT);
				return;
			case SheildPackage.SHEILD_PORT__MAX_VOLTAGE:
				setMaxVoltage(MAX_VOLTAGE_EDEFAULT);
				return;
			case SheildPackage.SHEILD_PORT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SheildPackage.SHEILD_PORT__PIN_NAME:
				setPinName(PIN_NAME_EDEFAULT);
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
			case SheildPackage.SHEILD_PORT__MIN_VOLTAGE:
				return minVoltage != MIN_VOLTAGE_EDEFAULT;
			case SheildPackage.SHEILD_PORT__MAX_VOLTAGE:
				return maxVoltage != MAX_VOLTAGE_EDEFAULT;
			case SheildPackage.SHEILD_PORT__TYPE:
				return type != TYPE_EDEFAULT;
			case SheildPackage.SHEILD_PORT__PIN_NAME:
				return PIN_NAME_EDEFAULT == null ? pinName != null : !PIN_NAME_EDEFAULT.equals(pinName);
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
		if (baseClass == SuperElectricalInterfaceType.class) {
			switch (derivedFeatureID) {
				case SheildPackage.SHEILD_PORT__MIN_VOLTAGE: return PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__MIN_VOLTAGE;
				case SheildPackage.SHEILD_PORT__MAX_VOLTAGE: return PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__MAX_VOLTAGE;
				case SheildPackage.SHEILD_PORT__TYPE: return PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__TYPE;
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
		if (baseClass == SuperElectricalInterfaceType.class) {
			switch (baseFeatureID) {
				case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__MIN_VOLTAGE: return SheildPackage.SHEILD_PORT__MIN_VOLTAGE;
				case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__MAX_VOLTAGE: return SheildPackage.SHEILD_PORT__MAX_VOLTAGE;
				case PowergridPackage.SUPER_ELECTRICAL_INTERFACE_TYPE__TYPE: return SheildPackage.SHEILD_PORT__TYPE;
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
		result.append(" (minVoltage: ");
		result.append(minVoltage);
		result.append(", maxVoltage: ");
		result.append(maxVoltage);
		result.append(", type: ");
		result.append(type);
		result.append(", pinName: ");
		result.append(pinName);
		result.append(')');
		return result.toString();
	}

} //sheildPortImpl
