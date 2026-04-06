/**
 */
package ucof.devices.devicetypes.a653components.healthmanagement.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.devices.devicetypes.a653components.healthmanagement.ErrorInfoMultiPartition;
import ucof.devices.devicetypes.a653components.healthmanagement.ErrorLevelModule;
import ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage;
import ucof.devices.devicetypes.a653components.healthmanagement.ModulePartitionLevelAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Info Multi Partition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.ErrorInfoMultiPartitionImpl#getErrorLevel <em>Error Level</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.ErrorInfoMultiPartitionImpl#getRecoveryAction <em>Recovery Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErrorInfoMultiPartitionImpl extends ErrorInfoSuperImpl implements ErrorInfoMultiPartition {
	/**
	 * The default value of the '{@link #getErrorLevel() <em>Error Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorLevel()
	 * @generated
	 * @ordered
	 */
	protected static final ErrorLevelModule ERROR_LEVEL_EDEFAULT = ErrorLevelModule.NOT_SET;

	/**
	 * The cached value of the '{@link #getErrorLevel() <em>Error Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorLevel()
	 * @generated
	 * @ordered
	 */
	protected ErrorLevelModule errorLevel = ERROR_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRecoveryAction() <em>Recovery Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecoveryAction()
	 * @generated
	 * @ordered
	 */
	protected ModulePartitionLevelAction recoveryAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorInfoMultiPartitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HealthmanagementPackage.Literals.ERROR_INFO_MULTI_PARTITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorLevelModule getErrorLevel() {
		return errorLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorLevel(ErrorLevelModule newErrorLevel) {
		ErrorLevelModule oldErrorLevel = errorLevel;
		errorLevel = newErrorLevel == null ? ERROR_LEVEL_EDEFAULT : newErrorLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.ERROR_INFO_MULTI_PARTITION__ERROR_LEVEL, oldErrorLevel, errorLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModulePartitionLevelAction getRecoveryAction() {
		return recoveryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecoveryAction(ModulePartitionLevelAction newRecoveryAction, NotificationChain msgs) {
		ModulePartitionLevelAction oldRecoveryAction = recoveryAction;
		recoveryAction = newRecoveryAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.ERROR_INFO_MULTI_PARTITION__RECOVERY_ACTION, oldRecoveryAction, newRecoveryAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecoveryAction(ModulePartitionLevelAction newRecoveryAction) {
		if (newRecoveryAction != recoveryAction) {
			NotificationChain msgs = null;
			if (recoveryAction != null)
				msgs = ((InternalEObject)recoveryAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HealthmanagementPackage.ERROR_INFO_MULTI_PARTITION__RECOVERY_ACTION, null, msgs);
			if (newRecoveryAction != null)
				msgs = ((InternalEObject)newRecoveryAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HealthmanagementPackage.ERROR_INFO_MULTI_PARTITION__RECOVERY_ACTION, null, msgs);
			msgs = basicSetRecoveryAction(newRecoveryAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.ERROR_INFO_MULTI_PARTITION__RECOVERY_ACTION, newRecoveryAction, newRecoveryAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HealthmanagementPackage.ERROR_INFO_MULTI_PARTITION__RECOVERY_ACTION:
				return basicSetRecoveryAction(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HealthmanagementPackage.ERROR_INFO_MULTI_PARTITION__ERROR_LEVEL:
				return getErrorLevel();
			case HealthmanagementPackage.ERROR_INFO_MULTI_PARTITION__RECOVERY_ACTION:
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
			case HealthmanagementPackage.ERROR_INFO_MULTI_PARTITION__ERROR_LEVEL:
				setErrorLevel((ErrorLevelModule)newValue);
				return;
			case HealthmanagementPackage.ERROR_INFO_MULTI_PARTITION__RECOVERY_ACTION:
				setRecoveryAction((ModulePartitionLevelAction)newValue);
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
			case HealthmanagementPackage.ERROR_INFO_MULTI_PARTITION__ERROR_LEVEL:
				setErrorLevel(ERROR_LEVEL_EDEFAULT);
				return;
			case HealthmanagementPackage.ERROR_INFO_MULTI_PARTITION__RECOVERY_ACTION:
				setRecoveryAction((ModulePartitionLevelAction)null);
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
			case HealthmanagementPackage.ERROR_INFO_MULTI_PARTITION__ERROR_LEVEL:
				return errorLevel != ERROR_LEVEL_EDEFAULT;
			case HealthmanagementPackage.ERROR_INFO_MULTI_PARTITION__RECOVERY_ACTION:
				return recoveryAction != null;
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
		result.append(" (errorLevel: ");
		result.append(errorLevel);
		result.append(')');
		return result.toString();
	}

} //ErrorInfoMultiPartitionImpl
