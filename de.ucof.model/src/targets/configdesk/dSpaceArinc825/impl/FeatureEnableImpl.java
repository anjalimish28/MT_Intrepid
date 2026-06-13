/**
 */
package targets.configdesk.dSpaceArinc825.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import targets.configdesk.dSpaceArinc825.DSpaceArinc825Package;
import targets.configdesk.dSpaceArinc825.FeatureEnable;

import ucof.common.enums.booleanType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Enable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.configdesk.dSpaceArinc825.impl.FeatureEnableImpl#getEnableModelAccess <em>Enable Model Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureEnableImpl extends SuperFeatureTypeImpl implements FeatureEnable {
	/**
	 * The default value of the '{@link #getEnableModelAccess() <em>Enable Model Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableModelAccess()
	 * @generated
	 * @ordered
	 */
	protected static final booleanType ENABLE_MODEL_ACCESS_EDEFAULT = booleanType.NOT_SET;

	/**
	 * The cached value of the '{@link #getEnableModelAccess() <em>Enable Model Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableModelAccess()
	 * @generated
	 * @ordered
	 */
	protected booleanType enableModelAccess = ENABLE_MODEL_ACCESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureEnableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DSpaceArinc825Package.Literals.FEATURE_ENABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public booleanType getEnableModelAccess() {
		return enableModelAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableModelAccess(booleanType newEnableModelAccess) {
		booleanType oldEnableModelAccess = enableModelAccess;
		enableModelAccess = newEnableModelAccess == null ? ENABLE_MODEL_ACCESS_EDEFAULT : newEnableModelAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSpaceArinc825Package.FEATURE_ENABLE__ENABLE_MODEL_ACCESS, oldEnableModelAccess, enableModelAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DSpaceArinc825Package.FEATURE_ENABLE__ENABLE_MODEL_ACCESS:
				return getEnableModelAccess();
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
			case DSpaceArinc825Package.FEATURE_ENABLE__ENABLE_MODEL_ACCESS:
				setEnableModelAccess((booleanType)newValue);
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
			case DSpaceArinc825Package.FEATURE_ENABLE__ENABLE_MODEL_ACCESS:
				setEnableModelAccess(ENABLE_MODEL_ACCESS_EDEFAULT);
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
			case DSpaceArinc825Package.FEATURE_ENABLE__ENABLE_MODEL_ACCESS:
				return enableModelAccess != ENABLE_MODEL_ACCESS_EDEFAULT;
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
		result.append(" (enableModelAccess: ");
		result.append(enableModelAccess);
		result.append(')');
		return result.toString();
	}

} //FeatureEnableImpl
