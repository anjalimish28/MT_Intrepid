/**
 */
package targets.rdc.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import targets.impl.SuperHardwarePortTypeImpl;

import targets.rdc.RdcPackage;
import targets.rdc.stmPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>stm Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.rdc.impl.stmPortImpl#getPinName <em>Pin Name</em>}</li>
 *   <li>{@link targets.rdc.impl.stmPortImpl#getPinNumber <em>Pin Number</em>}</li>
 *   <li>{@link targets.rdc.impl.stmPortImpl#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class stmPortImpl extends SuperHardwarePortTypeImpl implements stmPort {
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
	 * The default value of the '{@link #getPinNumber() <em>Pin Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int PIN_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPinNumber() <em>Pin Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinNumber()
	 * @generated
	 * @ordered
	 */
	protected int pinNumber = PIN_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final String SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected String size = SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected stmPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdcPackage.Literals.STM_PORT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RdcPackage.STM_PORT__PIN_NAME, oldPinName, pinName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPinNumber() {
		return pinNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPinNumber(int newPinNumber) {
		int oldPinNumber = pinNumber;
		pinNumber = newPinNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdcPackage.STM_PORT__PIN_NUMBER, oldPinNumber, pinNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(String newSize) {
		String oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdcPackage.STM_PORT__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RdcPackage.STM_PORT__PIN_NAME:
				return getPinName();
			case RdcPackage.STM_PORT__PIN_NUMBER:
				return getPinNumber();
			case RdcPackage.STM_PORT__SIZE:
				return getSize();
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
			case RdcPackage.STM_PORT__PIN_NAME:
				setPinName((String)newValue);
				return;
			case RdcPackage.STM_PORT__PIN_NUMBER:
				setPinNumber((Integer)newValue);
				return;
			case RdcPackage.STM_PORT__SIZE:
				setSize((String)newValue);
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
			case RdcPackage.STM_PORT__PIN_NAME:
				setPinName(PIN_NAME_EDEFAULT);
				return;
			case RdcPackage.STM_PORT__PIN_NUMBER:
				setPinNumber(PIN_NUMBER_EDEFAULT);
				return;
			case RdcPackage.STM_PORT__SIZE:
				setSize(SIZE_EDEFAULT);
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
			case RdcPackage.STM_PORT__PIN_NAME:
				return PIN_NAME_EDEFAULT == null ? pinName != null : !PIN_NAME_EDEFAULT.equals(pinName);
			case RdcPackage.STM_PORT__PIN_NUMBER:
				return pinNumber != PIN_NUMBER_EDEFAULT;
			case RdcPackage.STM_PORT__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
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
		result.append(" (pinName: ");
		result.append(pinName);
		result.append(", pinNumber: ");
		result.append(pinNumber);
		result.append(", size: ");
		result.append(size);
		result.append(')');
		return result.toString();
	}

} //stmPortImpl
