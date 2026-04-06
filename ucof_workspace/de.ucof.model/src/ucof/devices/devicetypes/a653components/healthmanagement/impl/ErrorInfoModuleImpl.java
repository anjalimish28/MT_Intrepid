/**
 */
package ucof.devices.devicetypes.a653components.healthmanagement.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.devices.devicetypes.a653components.healthmanagement.ErrorInfoModule;
import ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage;
import ucof.devices.devicetypes.a653components.healthmanagement.ModuleRecoveryAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Info Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.impl.ErrorInfoModuleImpl#getModuleRecoveryAction <em>Module Recovery Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErrorInfoModuleImpl extends ErrorInfoSuperImpl implements ErrorInfoModule {
	/**
	 * The cached value of the '{@link #getModuleRecoveryAction() <em>Module Recovery Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleRecoveryAction()
	 * @generated
	 * @ordered
	 */
	protected ModuleRecoveryAction moduleRecoveryAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorInfoModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HealthmanagementPackage.Literals.ERROR_INFO_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleRecoveryAction getModuleRecoveryAction() {
		return moduleRecoveryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModuleRecoveryAction(ModuleRecoveryAction newModuleRecoveryAction, NotificationChain msgs) {
		ModuleRecoveryAction oldModuleRecoveryAction = moduleRecoveryAction;
		moduleRecoveryAction = newModuleRecoveryAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.ERROR_INFO_MODULE__MODULE_RECOVERY_ACTION, oldModuleRecoveryAction, newModuleRecoveryAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleRecoveryAction(ModuleRecoveryAction newModuleRecoveryAction) {
		if (newModuleRecoveryAction != moduleRecoveryAction) {
			NotificationChain msgs = null;
			if (moduleRecoveryAction != null)
				msgs = ((InternalEObject)moduleRecoveryAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HealthmanagementPackage.ERROR_INFO_MODULE__MODULE_RECOVERY_ACTION, null, msgs);
			if (newModuleRecoveryAction != null)
				msgs = ((InternalEObject)newModuleRecoveryAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HealthmanagementPackage.ERROR_INFO_MODULE__MODULE_RECOVERY_ACTION, null, msgs);
			msgs = basicSetModuleRecoveryAction(newModuleRecoveryAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HealthmanagementPackage.ERROR_INFO_MODULE__MODULE_RECOVERY_ACTION, newModuleRecoveryAction, newModuleRecoveryAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HealthmanagementPackage.ERROR_INFO_MODULE__MODULE_RECOVERY_ACTION:
				return basicSetModuleRecoveryAction(null, msgs);
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
			case HealthmanagementPackage.ERROR_INFO_MODULE__MODULE_RECOVERY_ACTION:
				return getModuleRecoveryAction();
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
			case HealthmanagementPackage.ERROR_INFO_MODULE__MODULE_RECOVERY_ACTION:
				setModuleRecoveryAction((ModuleRecoveryAction)newValue);
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
			case HealthmanagementPackage.ERROR_INFO_MODULE__MODULE_RECOVERY_ACTION:
				setModuleRecoveryAction((ModuleRecoveryAction)null);
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
			case HealthmanagementPackage.ERROR_INFO_MODULE__MODULE_RECOVERY_ACTION:
				return moduleRecoveryAction != null;
		}
		return super.eIsSet(featureID);
	}

} //ErrorInfoModuleImpl
