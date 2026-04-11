/**
 */
package targets.powergrid.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import targets.powergrid.PowerConnection;
import targets.powergrid.PowergridPackage;

import ucof.assignments.impl.SuperAssignmentTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.powergrid.impl.PowerConnectionImpl#getResistance <em>Resistance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerConnectionImpl extends SuperAssignmentTypeImpl implements PowerConnection {
	/**
	 * The default value of the '{@link #getResistance() <em>Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResistance()
	 * @generated
	 * @ordered
	 */
	protected static final double RESISTANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getResistance() <em>Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResistance()
	 * @generated
	 * @ordered
	 */
	protected double resistance = RESISTANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PowergridPackage.Literals.POWER_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getResistance() {
		return resistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResistance(double newResistance) {
		double oldResistance = resistance;
		resistance = newResistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PowergridPackage.POWER_CONNECTION__RESISTANCE, oldResistance, resistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PowergridPackage.POWER_CONNECTION__RESISTANCE:
				return getResistance();
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
			case PowergridPackage.POWER_CONNECTION__RESISTANCE:
				setResistance((Double)newValue);
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
			case PowergridPackage.POWER_CONNECTION__RESISTANCE:
				setResistance(RESISTANCE_EDEFAULT);
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
			case PowergridPackage.POWER_CONNECTION__RESISTANCE:
				return resistance != RESISTANCE_EDEFAULT;
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
		result.append(" (resistance: ");
		result.append(resistance);
		result.append(')');
		return result.toString();
	}

} //PowerConnectionImpl
