/**
 */
package targets.configdesk.dSpaceArinc825.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import targets.configdesk.dSpaceArinc825.DSpaceArinc825Package;
import targets.configdesk.dSpaceArinc825.SignalModelAccessStatus;

import ucof.common.enums.booleanType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Model Access Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.configdesk.dSpaceArinc825.impl.SignalModelAccessStatusImpl#getModelAccessEnabled <em>Model Access Enabled</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignalModelAccessStatusImpl extends SuperConfigurationDeskA825StatusExtensionTypeImpl implements SignalModelAccessStatus {
	/**
	 * The default value of the '{@link #getModelAccessEnabled() <em>Model Access Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelAccessEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final booleanType MODEL_ACCESS_ENABLED_EDEFAULT = booleanType.NOT_SET;

	/**
	 * The cached value of the '{@link #getModelAccessEnabled() <em>Model Access Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelAccessEnabled()
	 * @generated
	 * @ordered
	 */
	protected booleanType modelAccessEnabled = MODEL_ACCESS_ENABLED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalModelAccessStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DSpaceArinc825Package.Literals.SIGNAL_MODEL_ACCESS_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public booleanType getModelAccessEnabled() {
		return modelAccessEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelAccessEnabled(booleanType newModelAccessEnabled) {
		booleanType oldModelAccessEnabled = modelAccessEnabled;
		modelAccessEnabled = newModelAccessEnabled == null ? MODEL_ACCESS_ENABLED_EDEFAULT : newModelAccessEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSpaceArinc825Package.SIGNAL_MODEL_ACCESS_STATUS__MODEL_ACCESS_ENABLED, oldModelAccessEnabled, modelAccessEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DSpaceArinc825Package.SIGNAL_MODEL_ACCESS_STATUS__MODEL_ACCESS_ENABLED:
				return getModelAccessEnabled();
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
			case DSpaceArinc825Package.SIGNAL_MODEL_ACCESS_STATUS__MODEL_ACCESS_ENABLED:
				setModelAccessEnabled((booleanType)newValue);
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
			case DSpaceArinc825Package.SIGNAL_MODEL_ACCESS_STATUS__MODEL_ACCESS_ENABLED:
				setModelAccessEnabled(MODEL_ACCESS_ENABLED_EDEFAULT);
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
			case DSpaceArinc825Package.SIGNAL_MODEL_ACCESS_STATUS__MODEL_ACCESS_ENABLED:
				return modelAccessEnabled != MODEL_ACCESS_ENABLED_EDEFAULT;
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
		result.append(" (modelAccessEnabled: ");
		result.append(modelAccessEnabled);
		result.append(')');
		return result.toString();
	}

} //SignalModelAccessStatusImpl
