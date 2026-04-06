/**
 */
package ucof.communication.arinc825.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.communication.arinc825.A825Bus;
import ucof.communication.arinc825.Arinc825Package;

import ucof.communication.impl.SuperCommunicationInterfaceTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>A825 Bus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.arinc825.impl.A825BusImpl#getBaudRate <em>Baud Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class A825BusImpl extends SuperCommunicationInterfaceTypeImpl implements A825Bus {
	/**
	 * The default value of the '{@link #getBaudRate() <em>Baud Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaudRate()
	 * @generated
	 * @ordered
	 */
	protected static final int BAUD_RATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBaudRate() <em>Baud Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaudRate()
	 * @generated
	 * @ordered
	 */
	protected int baudRate = BAUD_RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected A825BusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Arinc825Package.Literals.A825_BUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBaudRate() {
		return baudRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaudRate(int newBaudRate) {
		int oldBaudRate = baudRate;
		baudRate = newBaudRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Arinc825Package.A825_BUS__BAUD_RATE, oldBaudRate, baudRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Arinc825Package.A825_BUS__BAUD_RATE:
				return getBaudRate();
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
			case Arinc825Package.A825_BUS__BAUD_RATE:
				setBaudRate((Integer)newValue);
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
			case Arinc825Package.A825_BUS__BAUD_RATE:
				setBaudRate(BAUD_RATE_EDEFAULT);
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
			case Arinc825Package.A825_BUS__BAUD_RATE:
				return baudRate != BAUD_RATE_EDEFAULT;
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
		result.append(" (baudRate: ");
		result.append(baudRate);
		result.append(')');
		return result.toString();
	}

} //A825BusImpl
