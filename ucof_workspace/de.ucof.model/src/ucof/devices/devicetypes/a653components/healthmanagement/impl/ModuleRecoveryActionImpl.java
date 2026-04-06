/**
 */
package ucof.devices.devicetypes.a653components.healthmanagement.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage;
import ucof.devices.devicetypes.a653components.healthmanagement.ModuleRecoveryAction;
import ucof.devices.devicetypes.a653components.healthmanagement.ModuleRecoveryActions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Recovery Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.ModuleRecoveryActionImpl#getRecoveryAction <em>Recovery Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleRecoveryActionImpl extends ModulePartitionLevelActionImpl implements ModuleRecoveryAction {
	/**
	 * The default value of the '{@link #getRecoveryAction() <em>Recovery Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecoveryAction()
	 * @generated
	 * @ordered
	 */
	protected static final ModuleRecoveryActions RECOVERY_ACTION_EDEFAULT = ModuleRecoveryActions.NOT_SET;

	/**
	 * The cached value of the '{@link #getRecoveryAction() <em>Recovery Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecoveryAction()
	 * @generated
	 * @ordered
	 */
	protected ModuleRecoveryActions recoveryAction = RECOVERY_ACTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleRecoveryActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HealthmanagementPackage.Literals.MODULE_RECOVERY_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleRecoveryActions getRecoveryAction() {
		return recoveryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecoveryAction(ModuleRecoveryActions newRecoveryAction) {
		ModuleRecoveryActions oldRecoveryAction = recoveryAction;
		recoveryAction = newRecoveryAction == null ? RECOVERY_ACTION_EDEFAULT : newRecoveryAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.MODULE_RECOVERY_ACTION__RECOVERY_ACTION, oldRecoveryAction, recoveryAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HealthmanagementPackage.MODULE_RECOVERY_ACTION__RECOVERY_ACTION:
				return getRecoveryAction();
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
			case HealthmanagementPackage.MODULE_RECOVERY_ACTION__RECOVERY_ACTION:
				setRecoveryAction((ModuleRecoveryActions)newValue);
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
			case HealthmanagementPackage.MODULE_RECOVERY_ACTION__RECOVERY_ACTION:
				setRecoveryAction(RECOVERY_ACTION_EDEFAULT);
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
			case HealthmanagementPackage.MODULE_RECOVERY_ACTION__RECOVERY_ACTION:
				return recoveryAction != RECOVERY_ACTION_EDEFAULT;
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
		result.append(" (recoveryAction: ");
		result.append(recoveryAction);
		result.append(')');
		return result.toString();
	}

} //ModuleRecoveryActionImpl
