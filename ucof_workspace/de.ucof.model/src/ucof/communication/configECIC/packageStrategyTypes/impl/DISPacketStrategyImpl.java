/**
 */
package ucof.communication.configECIC.packageStrategyTypes.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.common.enums.YesNoType;

import ucof.communication.configECIC.packageStrategyTypes.DISPacketStrategy;
import ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DIS Packet Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.impl.DISPacketStrategyImpl#getResetPeriodicTimer <em>Reset Periodic Timer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DISPacketStrategyImpl extends SuperPacketStrategyTypeImpl implements DISPacketStrategy {
	/**
	 * The default value of the '{@link #getResetPeriodicTimer() <em>Reset Periodic Timer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetPeriodicTimer()
	 * @generated
	 * @ordered
	 */
	protected static final YesNoType RESET_PERIODIC_TIMER_EDEFAULT = YesNoType.NOT_SET;

	/**
	 * The cached value of the '{@link #getResetPeriodicTimer() <em>Reset Periodic Timer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetPeriodicTimer()
	 * @generated
	 * @ordered
	 */
	protected YesNoType resetPeriodicTimer = RESET_PERIODIC_TIMER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DISPacketStrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PackageStrategyTypesPackage.Literals.DIS_PACKET_STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YesNoType getResetPeriodicTimer() {
		return resetPeriodicTimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResetPeriodicTimer(YesNoType newResetPeriodicTimer) {
		YesNoType oldResetPeriodicTimer = resetPeriodicTimer;
		resetPeriodicTimer = newResetPeriodicTimer == null ? RESET_PERIODIC_TIMER_EDEFAULT : newResetPeriodicTimer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackageStrategyTypesPackage.DIS_PACKET_STRATEGY__RESET_PERIODIC_TIMER, oldResetPeriodicTimer, resetPeriodicTimer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PackageStrategyTypesPackage.DIS_PACKET_STRATEGY__RESET_PERIODIC_TIMER:
				return getResetPeriodicTimer();
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
			case PackageStrategyTypesPackage.DIS_PACKET_STRATEGY__RESET_PERIODIC_TIMER:
				setResetPeriodicTimer((YesNoType)newValue);
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
			case PackageStrategyTypesPackage.DIS_PACKET_STRATEGY__RESET_PERIODIC_TIMER:
				setResetPeriodicTimer(RESET_PERIODIC_TIMER_EDEFAULT);
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
			case PackageStrategyTypesPackage.DIS_PACKET_STRATEGY__RESET_PERIODIC_TIMER:
				return resetPeriodicTimer != RESET_PERIODIC_TIMER_EDEFAULT;
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
		result.append(" (ResetPeriodicTimer: ");
		result.append(resetPeriodicTimer);
		result.append(')');
		return result.toString();
	}

} //DISPacketStrategyImpl
