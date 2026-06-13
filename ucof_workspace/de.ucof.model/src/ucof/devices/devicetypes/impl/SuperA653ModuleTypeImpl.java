/**
 */
package ucof.devices.devicetypes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.devices.devicetypes.DevicetypesPackage;
import ucof.devices.devicetypes.SuperA653ModuleType;

import ucof.devices.devicetypes.a653components.ModuleSchedule;

import ucof.devices.devicetypes.a653components.a653partition.ModulePartitions;

import ucof.devices.devicetypes.a653components.healthmanagement.HealthManagement;

import ucof.devices.impl.SuperPlatformDeviceTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Super A653 Module Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.devicetypes.impl.SuperA653ModuleTypeImpl#getHealthManagement <em>Health Management</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.impl.SuperA653ModuleTypeImpl#getModuleSchedule <em>Module Schedule</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.impl.SuperA653ModuleTypeImpl#getPartitions <em>Partitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SuperA653ModuleTypeImpl extends SuperPlatformDeviceTypeImpl implements SuperA653ModuleType {
	/**
	 * The cached value of the '{@link #getHealthManagement() <em>Health Management</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthManagement()
	 * @generated
	 * @ordered
	 */
	protected HealthManagement healthManagement;

	/**
	 * The cached value of the '{@link #getModuleSchedule() <em>Module Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleSchedule()
	 * @generated
	 * @ordered
	 */
	protected ModuleSchedule moduleSchedule;

	/**
	 * The cached value of the '{@link #getPartitions() <em>Partitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitions()
	 * @generated
	 * @ordered
	 */
	protected ModulePartitions partitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperA653ModuleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DevicetypesPackage.Literals.SUPER_A653_MODULE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthManagement getHealthManagement() {
		return healthManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHealthManagement(HealthManagement newHealthManagement, NotificationChain msgs) {
		HealthManagement oldHealthManagement = healthManagement;
		healthManagement = newHealthManagement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DevicetypesPackage.SUPER_A653_MODULE_TYPE__HEALTH_MANAGEMENT, oldHealthManagement, newHealthManagement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHealthManagement(HealthManagement newHealthManagement) {
		if (newHealthManagement != healthManagement) {
			NotificationChain msgs = null;
			if (healthManagement != null)
				msgs = ((InternalEObject)healthManagement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DevicetypesPackage.SUPER_A653_MODULE_TYPE__HEALTH_MANAGEMENT, null, msgs);
			if (newHealthManagement != null)
				msgs = ((InternalEObject)newHealthManagement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DevicetypesPackage.SUPER_A653_MODULE_TYPE__HEALTH_MANAGEMENT, null, msgs);
			msgs = basicSetHealthManagement(newHealthManagement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicetypesPackage.SUPER_A653_MODULE_TYPE__HEALTH_MANAGEMENT, newHealthManagement, newHealthManagement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleSchedule getModuleSchedule() {
		return moduleSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModuleSchedule(ModuleSchedule newModuleSchedule, NotificationChain msgs) {
		ModuleSchedule oldModuleSchedule = moduleSchedule;
		moduleSchedule = newModuleSchedule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DevicetypesPackage.SUPER_A653_MODULE_TYPE__MODULE_SCHEDULE, oldModuleSchedule, newModuleSchedule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleSchedule(ModuleSchedule newModuleSchedule) {
		if (newModuleSchedule != moduleSchedule) {
			NotificationChain msgs = null;
			if (moduleSchedule != null)
				msgs = ((InternalEObject)moduleSchedule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DevicetypesPackage.SUPER_A653_MODULE_TYPE__MODULE_SCHEDULE, null, msgs);
			if (newModuleSchedule != null)
				msgs = ((InternalEObject)newModuleSchedule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DevicetypesPackage.SUPER_A653_MODULE_TYPE__MODULE_SCHEDULE, null, msgs);
			msgs = basicSetModuleSchedule(newModuleSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicetypesPackage.SUPER_A653_MODULE_TYPE__MODULE_SCHEDULE, newModuleSchedule, newModuleSchedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModulePartitions getPartitions() {
		return partitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartitions(ModulePartitions newPartitions, NotificationChain msgs) {
		ModulePartitions oldPartitions = partitions;
		partitions = newPartitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DevicetypesPackage.SUPER_A653_MODULE_TYPE__PARTITIONS, oldPartitions, newPartitions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartitions(ModulePartitions newPartitions) {
		if (newPartitions != partitions) {
			NotificationChain msgs = null;
			if (partitions != null)
				msgs = ((InternalEObject)partitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DevicetypesPackage.SUPER_A653_MODULE_TYPE__PARTITIONS, null, msgs);
			if (newPartitions != null)
				msgs = ((InternalEObject)newPartitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DevicetypesPackage.SUPER_A653_MODULE_TYPE__PARTITIONS, null, msgs);
			msgs = basicSetPartitions(newPartitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicetypesPackage.SUPER_A653_MODULE_TYPE__PARTITIONS, newPartitions, newPartitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DevicetypesPackage.SUPER_A653_MODULE_TYPE__HEALTH_MANAGEMENT:
				return basicSetHealthManagement(null, msgs);
			case DevicetypesPackage.SUPER_A653_MODULE_TYPE__MODULE_SCHEDULE:
				return basicSetModuleSchedule(null, msgs);
			case DevicetypesPackage.SUPER_A653_MODULE_TYPE__PARTITIONS:
				return basicSetPartitions(null, msgs);
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
			case DevicetypesPackage.SUPER_A653_MODULE_TYPE__HEALTH_MANAGEMENT:
				return getHealthManagement();
			case DevicetypesPackage.SUPER_A653_MODULE_TYPE__MODULE_SCHEDULE:
				return getModuleSchedule();
			case DevicetypesPackage.SUPER_A653_MODULE_TYPE__PARTITIONS:
				return getPartitions();
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
			case DevicetypesPackage.SUPER_A653_MODULE_TYPE__HEALTH_MANAGEMENT:
				setHealthManagement((HealthManagement)newValue);
				return;
			case DevicetypesPackage.SUPER_A653_MODULE_TYPE__MODULE_SCHEDULE:
				setModuleSchedule((ModuleSchedule)newValue);
				return;
			case DevicetypesPackage.SUPER_A653_MODULE_TYPE__PARTITIONS:
				setPartitions((ModulePartitions)newValue);
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
			case DevicetypesPackage.SUPER_A653_MODULE_TYPE__HEALTH_MANAGEMENT:
				setHealthManagement((HealthManagement)null);
				return;
			case DevicetypesPackage.SUPER_A653_MODULE_TYPE__MODULE_SCHEDULE:
				setModuleSchedule((ModuleSchedule)null);
				return;
			case DevicetypesPackage.SUPER_A653_MODULE_TYPE__PARTITIONS:
				setPartitions((ModulePartitions)null);
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
			case DevicetypesPackage.SUPER_A653_MODULE_TYPE__HEALTH_MANAGEMENT:
				return healthManagement != null;
			case DevicetypesPackage.SUPER_A653_MODULE_TYPE__MODULE_SCHEDULE:
				return moduleSchedule != null;
			case DevicetypesPackage.SUPER_A653_MODULE_TYPE__PARTITIONS:
				return partitions != null;
		}
		return super.eIsSet(featureID);
	}

} //SuperA653ModuleTypeImpl
