/**
 */
package targets.avip.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import targets.avip.AvipPackage;
import targets.avip.SuperAnaloguePortType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Super Analogue Port Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.avip.impl.SuperAnaloguePortTypeImpl#getMin_rev_v <em>Min rev v</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SuperAnaloguePortTypeImpl extends SuperWiredPortTypeImpl implements SuperAnaloguePortType {
	/**
	 * The default value of the '{@link #getMin_rev_v() <em>Min rev v</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_rev_v()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_REV_V_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMin_rev_v() <em>Min rev v</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_rev_v()
	 * @generated
	 * @ordered
	 */
	protected float min_rev_v = MIN_REV_V_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperAnaloguePortTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AvipPackage.Literals.SUPER_ANALOGUE_PORT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMin_rev_v() {
		return min_rev_v;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin_rev_v(float newMin_rev_v) {
		float oldMin_rev_v = min_rev_v;
		min_rev_v = newMin_rev_v;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.SUPER_ANALOGUE_PORT_TYPE__MIN_REV_V, oldMin_rev_v, min_rev_v));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AvipPackage.SUPER_ANALOGUE_PORT_TYPE__MIN_REV_V:
				return getMin_rev_v();
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
			case AvipPackage.SUPER_ANALOGUE_PORT_TYPE__MIN_REV_V:
				setMin_rev_v((Float)newValue);
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
			case AvipPackage.SUPER_ANALOGUE_PORT_TYPE__MIN_REV_V:
				setMin_rev_v(MIN_REV_V_EDEFAULT);
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
			case AvipPackage.SUPER_ANALOGUE_PORT_TYPE__MIN_REV_V:
				return min_rev_v != MIN_REV_V_EDEFAULT;
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
		result.append(" (min_rev_v: ");
		result.append(min_rev_v);
		result.append(')');
		return result.toString();
	}

} //SuperAnaloguePortTypeImpl
