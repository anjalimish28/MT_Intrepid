/**
 */
package ucof.assignments.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ucof.assignments.AssignmentsPackage;
import ucof.assignments.PortToPortAssignment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port To Port Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.assignments.impl.PortToPortAssignmentImpl#getTransmissionRate <em>Transmission Rate</em>}</li>
 *   <li>{@link ucof.assignments.impl.PortToPortAssignmentImpl#getRefreshRate <em>Refresh Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortToPortAssignmentImpl extends SuperAssignmentTypeImpl implements PortToPortAssignment {
	/**
	 * The default value of the '{@link #getTransmissionRate() <em>Transmission Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionRate()
	 * @generated
	 * @ordered
	 */
	protected static final float TRANSMISSION_RATE_EDEFAULT = 0.0F;
	/**
	 * The cached value of the '{@link #getTransmissionRate() <em>Transmission Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionRate()
	 * @generated
	 * @ordered
	 */
	protected float transmissionRate = TRANSMISSION_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRefreshRate() <em>Refresh Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshRate()
	 * @generated
	 * @ordered
	 */
	protected static final float REFRESH_RATE_EDEFAULT = 0.0F;
	/**
	 * The cached value of the '{@link #getRefreshRate() <em>Refresh Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshRate()
	 * @generated
	 * @ordered
	 */
	protected float refreshRate = REFRESH_RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortToPortAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssignmentsPackage.Literals.PORT_TO_PORT_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTransmissionRate() {
		return transmissionRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransmissionRate(float newTransmissionRate) {
		float oldTransmissionRate = transmissionRate;
		transmissionRate = newTransmissionRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssignmentsPackage.PORT_TO_PORT_ASSIGNMENT__TRANSMISSION_RATE, oldTransmissionRate, transmissionRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRefreshRate() {
		return refreshRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefreshRate(float newRefreshRate) {
		float oldRefreshRate = refreshRate;
		refreshRate = newRefreshRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssignmentsPackage.PORT_TO_PORT_ASSIGNMENT__REFRESH_RATE, oldRefreshRate, refreshRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssignmentsPackage.PORT_TO_PORT_ASSIGNMENT__TRANSMISSION_RATE:
				return getTransmissionRate();
			case AssignmentsPackage.PORT_TO_PORT_ASSIGNMENT__REFRESH_RATE:
				return getRefreshRate();
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
			case AssignmentsPackage.PORT_TO_PORT_ASSIGNMENT__TRANSMISSION_RATE:
				setTransmissionRate((Float)newValue);
				return;
			case AssignmentsPackage.PORT_TO_PORT_ASSIGNMENT__REFRESH_RATE:
				setRefreshRate((Float)newValue);
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
			case AssignmentsPackage.PORT_TO_PORT_ASSIGNMENT__TRANSMISSION_RATE:
				setTransmissionRate(TRANSMISSION_RATE_EDEFAULT);
				return;
			case AssignmentsPackage.PORT_TO_PORT_ASSIGNMENT__REFRESH_RATE:
				setRefreshRate(REFRESH_RATE_EDEFAULT);
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
			case AssignmentsPackage.PORT_TO_PORT_ASSIGNMENT__TRANSMISSION_RATE:
				return transmissionRate != TRANSMISSION_RATE_EDEFAULT;
			case AssignmentsPackage.PORT_TO_PORT_ASSIGNMENT__REFRESH_RATE:
				return refreshRate != REFRESH_RATE_EDEFAULT;
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
		result.append(" (transmissionRate: ");
		result.append(transmissionRate);
		result.append(", refreshRate: ");
		result.append(refreshRate);
		result.append(')');
		return result.toString();
	}

} //PortToPortAssignmentImpl
