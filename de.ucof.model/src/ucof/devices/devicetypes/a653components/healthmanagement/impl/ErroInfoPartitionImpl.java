/**
 */
package ucof.devices.devicetypes.a653components.healthmanagement.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.devices.devicetypes.a653components.healthmanagement.ErroInfoPartition;
import ucof.devices.devicetypes.a653components.healthmanagement.ErrorLevelPartition;
import ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage;
import ucof.devices.devicetypes.a653components.healthmanagement.PartitionProcessLevelAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Erro Info Partition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.ErroInfoPartitionImpl#getErrorLevel <em>Error Level</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.ErroInfoPartitionImpl#getRecoveryAction <em>Recovery Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErroInfoPartitionImpl extends ErrorInfoSuperImpl implements ErroInfoPartition {
	/**
	 * The default value of the '{@link #getErrorLevel() <em>Error Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorLevel()
	 * @generated
	 * @ordered
	 */
	protected static final ErrorLevelPartition ERROR_LEVEL_EDEFAULT = ErrorLevelPartition.NOT_SET;

	/**
	 * The cached value of the '{@link #getErrorLevel() <em>Error Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorLevel()
	 * @generated
	 * @ordered
	 */
	protected ErrorLevelPartition errorLevel = ERROR_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRecoveryAction() <em>Recovery Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecoveryAction()
	 * @generated
	 * @ordered
	 */
	protected PartitionProcessLevelAction recoveryAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErroInfoPartitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HealthmanagementPackage.Literals.ERRO_INFO_PARTITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorLevelPartition getErrorLevel() {
		return errorLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorLevel(ErrorLevelPartition newErrorLevel) {
		ErrorLevelPartition oldErrorLevel = errorLevel;
		errorLevel = newErrorLevel == null ? ERROR_LEVEL_EDEFAULT : newErrorLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.ERRO_INFO_PARTITION__ERROR_LEVEL, oldErrorLevel, errorLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionProcessLevelAction getRecoveryAction() {
		return recoveryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecoveryAction(PartitionProcessLevelAction newRecoveryAction, NotificationChain msgs) {
		PartitionProcessLevelAction oldRecoveryAction = recoveryAction;
		recoveryAction = newRecoveryAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.ERRO_INFO_PARTITION__RECOVERY_ACTION, oldRecoveryAction, newRecoveryAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecoveryAction(PartitionProcessLevelAction newRecoveryAction) {
		if (newRecoveryAction != recoveryAction) {
			NotificationChain msgs = null;
			if (recoveryAction != null)
				msgs = ((InternalEObject)recoveryAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HealthmanagementPackage.ERRO_INFO_PARTITION__RECOVERY_ACTION, null, msgs);
			if (newRecoveryAction != null)
				msgs = ((InternalEObject)newRecoveryAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HealthmanagementPackage.ERRO_INFO_PARTITION__RECOVERY_ACTION, null, msgs);
			msgs = basicSetRecoveryAction(newRecoveryAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.ERRO_INFO_PARTITION__RECOVERY_ACTION, newRecoveryAction, newRecoveryAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HealthmanagementPackage.ERRO_INFO_PARTITION__RECOVERY_ACTION:
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
			case HealthmanagementPackage.ERRO_INFO_PARTITION__ERROR_LEVEL:
				return getErrorLevel();
			case HealthmanagementPackage.ERRO_INFO_PARTITION__RECOVERY_ACTION:
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
			case HealthmanagementPackage.ERRO_INFO_PARTITION__ERROR_LEVEL:
				setErrorLevel((ErrorLevelPartition)newValue);
				return;
			case HealthmanagementPackage.ERRO_INFO_PARTITION__RECOVERY_ACTION:
				setRecoveryAction((PartitionProcessLevelAction)newValue);
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
			case HealthmanagementPackage.ERRO_INFO_PARTITION__ERROR_LEVEL:
				setErrorLevel(ERROR_LEVEL_EDEFAULT);
				return;
			case HealthmanagementPackage.ERRO_INFO_PARTITION__RECOVERY_ACTION:
				setRecoveryAction((PartitionProcessLevelAction)null);
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
			case HealthmanagementPackage.ERRO_INFO_PARTITION__ERROR_LEVEL:
				return errorLevel != ERROR_LEVEL_EDEFAULT;
			case HealthmanagementPackage.ERRO_INFO_PARTITION__RECOVERY_ACTION:
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

} //ErroInfoPartitionImpl
