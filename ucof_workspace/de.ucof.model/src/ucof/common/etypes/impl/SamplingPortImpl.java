/**
 */
package ucof.common.etypes.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.SamplingPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sampling Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.common.etypes.impl.SamplingPortImpl#getRefreshPeriodORTransmissionRate <em>Refresh Period OR Transmission Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SamplingPortImpl extends SuperInterCommunicationPortTypeImpl implements SamplingPort {
	/**
	 * The default value of the '{@link #getRefreshPeriodORTransmissionRate() <em>Refresh Period OR Transmission Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshPeriodORTransmissionRate()
	 * @generated
	 * @ordered
	 */
	protected static final String REFRESH_PERIOD_OR_TRANSMISSION_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefreshPeriodORTransmissionRate() <em>Refresh Period OR Transmission Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshPeriodORTransmissionRate()
	 * @generated
	 * @ordered
	 */
	protected String refreshPeriodORTransmissionRate = REFRESH_PERIOD_OR_TRANSMISSION_RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SamplingPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EtypesPackage.Literals.SAMPLING_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefreshPeriodORTransmissionRate() {
		return refreshPeriodORTransmissionRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefreshPeriodORTransmissionRate(String newRefreshPeriodORTransmissionRate) {
		String oldRefreshPeriodORTransmissionRate = refreshPeriodORTransmissionRate;
		refreshPeriodORTransmissionRate = newRefreshPeriodORTransmissionRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtypesPackage.SAMPLING_PORT__REFRESH_PERIOD_OR_TRANSMISSION_RATE, oldRefreshPeriodORTransmissionRate, refreshPeriodORTransmissionRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EtypesPackage.SAMPLING_PORT__REFRESH_PERIOD_OR_TRANSMISSION_RATE:
				return getRefreshPeriodORTransmissionRate();
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
			case EtypesPackage.SAMPLING_PORT__REFRESH_PERIOD_OR_TRANSMISSION_RATE:
				setRefreshPeriodORTransmissionRate((String)newValue);
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
			case EtypesPackage.SAMPLING_PORT__REFRESH_PERIOD_OR_TRANSMISSION_RATE:
				setRefreshPeriodORTransmissionRate(REFRESH_PERIOD_OR_TRANSMISSION_RATE_EDEFAULT);
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
			case EtypesPackage.SAMPLING_PORT__REFRESH_PERIOD_OR_TRANSMISSION_RATE:
				return REFRESH_PERIOD_OR_TRANSMISSION_RATE_EDEFAULT == null ? refreshPeriodORTransmissionRate != null : !REFRESH_PERIOD_OR_TRANSMISSION_RATE_EDEFAULT.equals(refreshPeriodORTransmissionRate);
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
		result.append(" (refreshPeriodORTransmissionRate: ");
		result.append(refreshPeriodORTransmissionRate);
		result.append(')');
		return result.toString();
	}

} //SamplingPortImpl
