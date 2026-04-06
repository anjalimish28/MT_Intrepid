/**
 */
package ucof.communication.i2c.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.common.enums.booleanType;

import ucof.communication.i2c.I2CAddressMode;
import ucof.communication.i2c.I2CBus;
import ucof.communication.i2c.I2CBusMode;
import ucof.communication.i2c.I2cPackage;

import ucof.communication.impl.SuperCommunicationInterfaceTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>I2C Bus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.i2c.impl.I2CBusImpl#getBusMode <em>Bus Mode</em>}</li>
 *   <li>{@link ucof.communication.i2c.impl.I2CBusImpl#getAddressMode <em>Address Mode</em>}</li>
 *   <li>{@link ucof.communication.i2c.impl.I2CBusImpl#getPullUpResistanceOhm <em>Pull Up Resistance Ohm</em>}</li>
 *   <li>{@link ucof.communication.i2c.impl.I2CBusImpl#getClockStretchingEnabled <em>Clock Stretching Enabled</em>}</li>
 *   <li>{@link ucof.communication.i2c.impl.I2CBusImpl#getMultiControllerEnabled <em>Multi Controller Enabled</em>}</li>
 * </ul>
 *
 * @generated
 */
public class I2CBusImpl extends SuperCommunicationInterfaceTypeImpl implements I2CBus {
	/**
	 * The default value of the '{@link #getBusMode() <em>Bus Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusMode()
	 * @generated
	 * @ordered
	 */
	protected static final I2CBusMode BUS_MODE_EDEFAULT = I2CBusMode.NOT_SET;

	/**
	 * The cached value of the '{@link #getBusMode() <em>Bus Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusMode()
	 * @generated
	 * @ordered
	 */
	protected I2CBusMode busMode = BUS_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddressMode() <em>Address Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressMode()
	 * @generated
	 * @ordered
	 */
	protected static final I2CAddressMode ADDRESS_MODE_EDEFAULT = I2CAddressMode.NOT_SET;

	/**
	 * The cached value of the '{@link #getAddressMode() <em>Address Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressMode()
	 * @generated
	 * @ordered
	 */
	protected I2CAddressMode addressMode = ADDRESS_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPullUpResistanceOhm() <em>Pull Up Resistance Ohm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPullUpResistanceOhm()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PULL_UP_RESISTANCE_OHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPullUpResistanceOhm() <em>Pull Up Resistance Ohm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPullUpResistanceOhm()
	 * @generated
	 * @ordered
	 */
	protected Integer pullUpResistanceOhm = PULL_UP_RESISTANCE_OHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getClockStretchingEnabled() <em>Clock Stretching Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockStretchingEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final booleanType CLOCK_STRETCHING_ENABLED_EDEFAULT = booleanType.NOT_SET;

	/**
	 * The cached value of the '{@link #getClockStretchingEnabled() <em>Clock Stretching Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockStretchingEnabled()
	 * @generated
	 * @ordered
	 */
	protected booleanType clockStretchingEnabled = CLOCK_STRETCHING_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiControllerEnabled() <em>Multi Controller Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiControllerEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final booleanType MULTI_CONTROLLER_ENABLED_EDEFAULT = booleanType.NOT_SET;

	/**
	 * The cached value of the '{@link #getMultiControllerEnabled() <em>Multi Controller Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiControllerEnabled()
	 * @generated
	 * @ordered
	 */
	protected booleanType multiControllerEnabled = MULTI_CONTROLLER_ENABLED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected I2CBusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return I2cPackage.Literals.I2C_BUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public I2CBusMode getBusMode() {
		return busMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusMode(I2CBusMode newBusMode) {
		I2CBusMode oldBusMode = busMode;
		busMode = newBusMode == null ? BUS_MODE_EDEFAULT : newBusMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, I2cPackage.I2C_BUS__BUS_MODE, oldBusMode, busMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public I2CAddressMode getAddressMode() {
		return addressMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressMode(I2CAddressMode newAddressMode) {
		I2CAddressMode oldAddressMode = addressMode;
		addressMode = newAddressMode == null ? ADDRESS_MODE_EDEFAULT : newAddressMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, I2cPackage.I2C_BUS__ADDRESS_MODE, oldAddressMode, addressMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPullUpResistanceOhm() {
		return pullUpResistanceOhm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPullUpResistanceOhm(Integer newPullUpResistanceOhm) {
		Integer oldPullUpResistanceOhm = pullUpResistanceOhm;
		pullUpResistanceOhm = newPullUpResistanceOhm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, I2cPackage.I2C_BUS__PULL_UP_RESISTANCE_OHM, oldPullUpResistanceOhm, pullUpResistanceOhm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public booleanType getClockStretchingEnabled() {
		return clockStretchingEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClockStretchingEnabled(booleanType newClockStretchingEnabled) {
		booleanType oldClockStretchingEnabled = clockStretchingEnabled;
		clockStretchingEnabled = newClockStretchingEnabled == null ? CLOCK_STRETCHING_ENABLED_EDEFAULT : newClockStretchingEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, I2cPackage.I2C_BUS__CLOCK_STRETCHING_ENABLED, oldClockStretchingEnabled, clockStretchingEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public booleanType getMultiControllerEnabled() {
		return multiControllerEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiControllerEnabled(booleanType newMultiControllerEnabled) {
		booleanType oldMultiControllerEnabled = multiControllerEnabled;
		multiControllerEnabled = newMultiControllerEnabled == null ? MULTI_CONTROLLER_ENABLED_EDEFAULT : newMultiControllerEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, I2cPackage.I2C_BUS__MULTI_CONTROLLER_ENABLED, oldMultiControllerEnabled, multiControllerEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case I2cPackage.I2C_BUS__BUS_MODE:
				return getBusMode();
			case I2cPackage.I2C_BUS__ADDRESS_MODE:
				return getAddressMode();
			case I2cPackage.I2C_BUS__PULL_UP_RESISTANCE_OHM:
				return getPullUpResistanceOhm();
			case I2cPackage.I2C_BUS__CLOCK_STRETCHING_ENABLED:
				return getClockStretchingEnabled();
			case I2cPackage.I2C_BUS__MULTI_CONTROLLER_ENABLED:
				return getMultiControllerEnabled();
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
			case I2cPackage.I2C_BUS__BUS_MODE:
				setBusMode((I2CBusMode)newValue);
				return;
			case I2cPackage.I2C_BUS__ADDRESS_MODE:
				setAddressMode((I2CAddressMode)newValue);
				return;
			case I2cPackage.I2C_BUS__PULL_UP_RESISTANCE_OHM:
				setPullUpResistanceOhm((Integer)newValue);
				return;
			case I2cPackage.I2C_BUS__CLOCK_STRETCHING_ENABLED:
				setClockStretchingEnabled((booleanType)newValue);
				return;
			case I2cPackage.I2C_BUS__MULTI_CONTROLLER_ENABLED:
				setMultiControllerEnabled((booleanType)newValue);
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
			case I2cPackage.I2C_BUS__BUS_MODE:
				setBusMode(BUS_MODE_EDEFAULT);
				return;
			case I2cPackage.I2C_BUS__ADDRESS_MODE:
				setAddressMode(ADDRESS_MODE_EDEFAULT);
				return;
			case I2cPackage.I2C_BUS__PULL_UP_RESISTANCE_OHM:
				setPullUpResistanceOhm(PULL_UP_RESISTANCE_OHM_EDEFAULT);
				return;
			case I2cPackage.I2C_BUS__CLOCK_STRETCHING_ENABLED:
				setClockStretchingEnabled(CLOCK_STRETCHING_ENABLED_EDEFAULT);
				return;
			case I2cPackage.I2C_BUS__MULTI_CONTROLLER_ENABLED:
				setMultiControllerEnabled(MULTI_CONTROLLER_ENABLED_EDEFAULT);
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
			case I2cPackage.I2C_BUS__BUS_MODE:
				return busMode != BUS_MODE_EDEFAULT;
			case I2cPackage.I2C_BUS__ADDRESS_MODE:
				return addressMode != ADDRESS_MODE_EDEFAULT;
			case I2cPackage.I2C_BUS__PULL_UP_RESISTANCE_OHM:
				return PULL_UP_RESISTANCE_OHM_EDEFAULT == null ? pullUpResistanceOhm != null : !PULL_UP_RESISTANCE_OHM_EDEFAULT.equals(pullUpResistanceOhm);
			case I2cPackage.I2C_BUS__CLOCK_STRETCHING_ENABLED:
				return clockStretchingEnabled != CLOCK_STRETCHING_ENABLED_EDEFAULT;
			case I2cPackage.I2C_BUS__MULTI_CONTROLLER_ENABLED:
				return multiControllerEnabled != MULTI_CONTROLLER_ENABLED_EDEFAULT;
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
		result.append(" (busMode: ");
		result.append(busMode);
		result.append(", addressMode: ");
		result.append(addressMode);
		result.append(", pullUpResistanceOhm: ");
		result.append(pullUpResistanceOhm);
		result.append(", clockStretchingEnabled: ");
		result.append(clockStretchingEnabled);
		result.append(", multiControllerEnabled: ");
		result.append(multiControllerEnabled);
		result.append(')');
		return result.toString();
	}

} //I2CBusImpl
