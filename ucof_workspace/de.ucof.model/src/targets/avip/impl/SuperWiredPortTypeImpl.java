/**
 */
package targets.avip.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import targets.avip.AvipPackage;
import targets.avip.SuperWiredPortType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Super Wired Port Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.avip.impl.SuperWiredPortTypeImpl#getMax_rev_v <em>Max rev v</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SuperWiredPortTypeImpl extends SuperAVDPortTypeImpl implements SuperWiredPortType {
	/**
	 * The default value of the '{@link #getMax_rev_v() <em>Max rev v</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_rev_v()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_REV_V_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMax_rev_v() <em>Max rev v</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_rev_v()
	 * @generated
	 * @ordered
	 */
	protected float max_rev_v = MAX_REV_V_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperWiredPortTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AvipPackage.Literals.SUPER_WIRED_PORT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMax_rev_v() {
		return max_rev_v;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax_rev_v(float newMax_rev_v) {
		float oldMax_rev_v = max_rev_v;
		max_rev_v = newMax_rev_v;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.SUPER_WIRED_PORT_TYPE__MAX_REV_V, oldMax_rev_v, max_rev_v));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AvipPackage.SUPER_WIRED_PORT_TYPE__MAX_REV_V:
				return getMax_rev_v();
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
			case AvipPackage.SUPER_WIRED_PORT_TYPE__MAX_REV_V:
				setMax_rev_v((Float)newValue);
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
			case AvipPackage.SUPER_WIRED_PORT_TYPE__MAX_REV_V:
				setMax_rev_v(MAX_REV_V_EDEFAULT);
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
			case AvipPackage.SUPER_WIRED_PORT_TYPE__MAX_REV_V:
				return max_rev_v != MAX_REV_V_EDEFAULT;
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
		result.append(" (max_rev_v: ");
		result.append(max_rev_v);
		result.append(')');
		return result.toString();
	}

} //SuperWiredPortTypeImpl
