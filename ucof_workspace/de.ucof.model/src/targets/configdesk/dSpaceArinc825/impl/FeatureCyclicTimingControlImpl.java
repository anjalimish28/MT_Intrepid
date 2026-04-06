/**
 */
package targets.configdesk.dSpaceArinc825.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import targets.configdesk.dSpaceArinc825.DSpaceArinc825Package;
import targets.configdesk.dSpaceArinc825.FeatureCyclicTimingControl;

import ucof.common.enums.booleanType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Cyclic Timing Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.configdesk.dSpaceArinc825.impl.FeatureCyclicTimingControlImpl#getControlPeriodModelAccess <em>Control Period Model Access</em>}</li>
 *   <li>{@link targets.configdesk.dSpaceArinc825.impl.FeatureCyclicTimingControlImpl#getControlOffsetModelAccess <em>Control Offset Model Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureCyclicTimingControlImpl extends SuperFeatureTypeImpl implements FeatureCyclicTimingControl {
	/**
	 * The default value of the '{@link #getControlPeriodModelAccess() <em>Control Period Model Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlPeriodModelAccess()
	 * @generated
	 * @ordered
	 */
	protected static final booleanType CONTROL_PERIOD_MODEL_ACCESS_EDEFAULT = booleanType.NOT_SET;

	/**
	 * The cached value of the '{@link #getControlPeriodModelAccess() <em>Control Period Model Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlPeriodModelAccess()
	 * @generated
	 * @ordered
	 */
	protected booleanType controlPeriodModelAccess = CONTROL_PERIOD_MODEL_ACCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getControlOffsetModelAccess() <em>Control Offset Model Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlOffsetModelAccess()
	 * @generated
	 * @ordered
	 */
	protected static final booleanType CONTROL_OFFSET_MODEL_ACCESS_EDEFAULT = booleanType.NOT_SET;

	/**
	 * The cached value of the '{@link #getControlOffsetModelAccess() <em>Control Offset Model Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlOffsetModelAccess()
	 * @generated
	 * @ordered
	 */
	protected booleanType controlOffsetModelAccess = CONTROL_OFFSET_MODEL_ACCESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureCyclicTimingControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DSpaceArinc825Package.Literals.FEATURE_CYCLIC_TIMING_CONTROL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public booleanType getControlPeriodModelAccess() {
		return controlPeriodModelAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlPeriodModelAccess(booleanType newControlPeriodModelAccess) {
		booleanType oldControlPeriodModelAccess = controlPeriodModelAccess;
		controlPeriodModelAccess = newControlPeriodModelAccess == null ? CONTROL_PERIOD_MODEL_ACCESS_EDEFAULT : newControlPeriodModelAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSpaceArinc825Package.FEATURE_CYCLIC_TIMING_CONTROL__CONTROL_PERIOD_MODEL_ACCESS, oldControlPeriodModelAccess, controlPeriodModelAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public booleanType getControlOffsetModelAccess() {
		return controlOffsetModelAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlOffsetModelAccess(booleanType newControlOffsetModelAccess) {
		booleanType oldControlOffsetModelAccess = controlOffsetModelAccess;
		controlOffsetModelAccess = newControlOffsetModelAccess == null ? CONTROL_OFFSET_MODEL_ACCESS_EDEFAULT : newControlOffsetModelAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSpaceArinc825Package.FEATURE_CYCLIC_TIMING_CONTROL__CONTROL_OFFSET_MODEL_ACCESS, oldControlOffsetModelAccess, controlOffsetModelAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DSpaceArinc825Package.FEATURE_CYCLIC_TIMING_CONTROL__CONTROL_PERIOD_MODEL_ACCESS:
				return getControlPeriodModelAccess();
			case DSpaceArinc825Package.FEATURE_CYCLIC_TIMING_CONTROL__CONTROL_OFFSET_MODEL_ACCESS:
				return getControlOffsetModelAccess();
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
			case DSpaceArinc825Package.FEATURE_CYCLIC_TIMING_CONTROL__CONTROL_PERIOD_MODEL_ACCESS:
				setControlPeriodModelAccess((booleanType)newValue);
				return;
			case DSpaceArinc825Package.FEATURE_CYCLIC_TIMING_CONTROL__CONTROL_OFFSET_MODEL_ACCESS:
				setControlOffsetModelAccess((booleanType)newValue);
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
			case DSpaceArinc825Package.FEATURE_CYCLIC_TIMING_CONTROL__CONTROL_PERIOD_MODEL_ACCESS:
				setControlPeriodModelAccess(CONTROL_PERIOD_MODEL_ACCESS_EDEFAULT);
				return;
			case DSpaceArinc825Package.FEATURE_CYCLIC_TIMING_CONTROL__CONTROL_OFFSET_MODEL_ACCESS:
				setControlOffsetModelAccess(CONTROL_OFFSET_MODEL_ACCESS_EDEFAULT);
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
			case DSpaceArinc825Package.FEATURE_CYCLIC_TIMING_CONTROL__CONTROL_PERIOD_MODEL_ACCESS:
				return controlPeriodModelAccess != CONTROL_PERIOD_MODEL_ACCESS_EDEFAULT;
			case DSpaceArinc825Package.FEATURE_CYCLIC_TIMING_CONTROL__CONTROL_OFFSET_MODEL_ACCESS:
				return controlOffsetModelAccess != CONTROL_OFFSET_MODEL_ACCESS_EDEFAULT;
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
		result.append(" (controlPeriodModelAccess: ");
		result.append(controlPeriodModelAccess);
		result.append(", controlOffsetModelAccess: ");
		result.append(controlOffsetModelAccess);
		result.append(')');
		return result.toString();
	}

} //FeatureCyclicTimingControlImpl
