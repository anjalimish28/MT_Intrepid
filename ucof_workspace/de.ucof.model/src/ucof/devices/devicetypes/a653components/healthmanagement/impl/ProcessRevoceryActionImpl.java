/**
 */
package ucof.devices.devicetypes.a653components.healthmanagement.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.devices.devicetypes.a653components.healthmanagement.ErrorCode;
import ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage;
import ucof.devices.devicetypes.a653components.healthmanagement.ProcessRecoveryActions;
import ucof.devices.devicetypes.a653components.healthmanagement.ProcessRevoceryAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Revocery Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.ProcessRevoceryActionImpl#getErrorCode <em>Error Code</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.ProcessRevoceryActionImpl#getRecoveryAction <em>Recovery Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessRevoceryActionImpl extends PartitionProcessLevelActionImpl implements ProcessRevoceryAction {
	/**
	 * The default value of the '{@link #getErrorCode() <em>Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorCode()
	 * @generated
	 * @ordered
	 */
	protected static final ErrorCode ERROR_CODE_EDEFAULT = ErrorCode.NOT_SET;

	/**
	 * The cached value of the '{@link #getErrorCode() <em>Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorCode()
	 * @generated
	 * @ordered
	 */
	protected ErrorCode errorCode = ERROR_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecoveryAction() <em>Recovery Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecoveryAction()
	 * @generated
	 * @ordered
	 */
	protected static final ProcessRecoveryActions RECOVERY_ACTION_EDEFAULT = ProcessRecoveryActions.NOT_SET;

	/**
	 * The cached value of the '{@link #getRecoveryAction() <em>Recovery Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecoveryAction()
	 * @generated
	 * @ordered
	 */
	protected ProcessRecoveryActions recoveryAction = RECOVERY_ACTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessRevoceryActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HealthmanagementPackage.Literals.PROCESS_REVOCERY_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorCode getErrorCode() {
		return errorCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorCode(ErrorCode newErrorCode) {
		ErrorCode oldErrorCode = errorCode;
		errorCode = newErrorCode == null ? ERROR_CODE_EDEFAULT : newErrorCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.PROCESS_REVOCERY_ACTION__ERROR_CODE, oldErrorCode, errorCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessRecoveryActions getRecoveryAction() {
		return recoveryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecoveryAction(ProcessRecoveryActions newRecoveryAction) {
		ProcessRecoveryActions oldRecoveryAction = recoveryAction;
		recoveryAction = newRecoveryAction == null ? RECOVERY_ACTION_EDEFAULT : newRecoveryAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.PROCESS_REVOCERY_ACTION__RECOVERY_ACTION, oldRecoveryAction, recoveryAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HealthmanagementPackage.PROCESS_REVOCERY_ACTION__ERROR_CODE:
				return getErrorCode();
			case HealthmanagementPackage.PROCESS_REVOCERY_ACTION__RECOVERY_ACTION:
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
			case HealthmanagementPackage.PROCESS_REVOCERY_ACTION__ERROR_CODE:
				setErrorCode((ErrorCode)newValue);
				return;
			case HealthmanagementPackage.PROCESS_REVOCERY_ACTION__RECOVERY_ACTION:
				setRecoveryAction((ProcessRecoveryActions)newValue);
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
			case HealthmanagementPackage.PROCESS_REVOCERY_ACTION__ERROR_CODE:
				setErrorCode(ERROR_CODE_EDEFAULT);
				return;
			case HealthmanagementPackage.PROCESS_REVOCERY_ACTION__RECOVERY_ACTION:
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
			case HealthmanagementPackage.PROCESS_REVOCERY_ACTION__ERROR_CODE:
				return errorCode != ERROR_CODE_EDEFAULT;
			case HealthmanagementPackage.PROCESS_REVOCERY_ACTION__RECOVERY_ACTION:
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
		result.append(" (errorCode: ");
		result.append(errorCode);
		result.append(", recoveryAction: ");
		result.append(recoveryAction);
		result.append(')');
		return result.toString();
	}

} //ProcessRevoceryActionImpl
