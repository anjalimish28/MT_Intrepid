/**
 */
package targets.cantransceiver.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import targets.cantransceiver.CantransceiverPackage;
import targets.cantransceiver.canTransceiverPort;

import targets.impl.SuperHardwarePortTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>can Transceiver Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.cantransceiver.impl.canTransceiverPortImpl#getPinName <em>Pin Name</em>}</li>
 *   <li>{@link targets.cantransceiver.impl.canTransceiverPortImpl#getPinNumber <em>Pin Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class canTransceiverPortImpl extends SuperHardwarePortTypeImpl implements canTransceiverPort {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected canTransceiverPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CantransceiverPackage.Literals.CAN_TRANSCEIVER_PORT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CantransceiverPackage.CAN_TRANSCEIVER_PORT__PIN_NAME, oldPinName, pinName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CantransceiverPackage.CAN_TRANSCEIVER_PORT__PIN_NUMBER, oldPinNumber, pinNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CantransceiverPackage.CAN_TRANSCEIVER_PORT__PIN_NAME:
				return getPinName();
			case CantransceiverPackage.CAN_TRANSCEIVER_PORT__PIN_NUMBER:
				return getPinNumber();
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
			case CantransceiverPackage.CAN_TRANSCEIVER_PORT__PIN_NAME:
				setPinName((String)newValue);
				return;
			case CantransceiverPackage.CAN_TRANSCEIVER_PORT__PIN_NUMBER:
				setPinNumber((Integer)newValue);
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
			case CantransceiverPackage.CAN_TRANSCEIVER_PORT__PIN_NAME:
				setPinName(PIN_NAME_EDEFAULT);
				return;
			case CantransceiverPackage.CAN_TRANSCEIVER_PORT__PIN_NUMBER:
				setPinNumber(PIN_NUMBER_EDEFAULT);
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
			case CantransceiverPackage.CAN_TRANSCEIVER_PORT__PIN_NAME:
				return PIN_NAME_EDEFAULT == null ? pinName != null : !PIN_NAME_EDEFAULT.equals(pinName);
			case CantransceiverPackage.CAN_TRANSCEIVER_PORT__PIN_NUMBER:
				return pinNumber != PIN_NUMBER_EDEFAULT;
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
		result.append(')');
		return result.toString();
	}

} //canTransceiverPortImpl
