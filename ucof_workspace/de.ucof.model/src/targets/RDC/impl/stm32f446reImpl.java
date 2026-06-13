/**
 */
package targets.rdc.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import targets.SuperTargetType;
import targets.TargetsPackage;
import targets.intrepidgateway.MsgBoxExtension;
import targets.powergrid.impl.SuperPowerTypeImpl;
import targets.rdc.RdcPackage;
import targets.rdc.stm32f446re;
import targets.rdc.stmPorts;
import targets.rdc.stmTimingConfig;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>stm32f446re</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.rdc.impl.stm32f446reImpl#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link targets.rdc.impl.stm32f446reImpl#getSize <em>Size</em>}</li>
 *   <li>{@link targets.rdc.impl.stm32f446reImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link targets.rdc.impl.stm32f446reImpl#getStmTimingConfig <em>Stm Timing Config</em>}</li>
 *   <li>{@link targets.rdc.impl.stm32f446reImpl#getMsgBoxExtension <em>Msg Box Extension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class stm32f446reImpl extends SuperPowerTypeImpl implements stm32f446re {
	/**
	 * The default value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected String projectName = PROJECT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final String SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected String size = SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected stmPorts ports;

	/**
	 * The cached value of the '{@link #getStmTimingConfig() <em>Stm Timing Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStmTimingConfig()
	 * @generated
	 * @ordered
	 */
	protected stmTimingConfig stmTimingConfig;

	/**
	 * The cached value of the '{@link #getMsgBoxExtension() <em>Msg Box Extension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsgBoxExtension()
	 * @generated
	 * @ordered
	 */
	protected MsgBoxExtension msgBoxExtension;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected stm32f446reImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdcPackage.Literals.STM32F446RE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectName(String newProjectName) {
		String oldProjectName = projectName;
		projectName = newProjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdcPackage.STM32F446RE__PROJECT_NAME, oldProjectName, projectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(String newSize) {
		String oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdcPackage.STM32F446RE__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public stmPorts getPorts() {
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPorts(stmPorts newPorts, NotificationChain msgs) {
		stmPorts oldPorts = ports;
		ports = newPorts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdcPackage.STM32F446RE__PORTS, oldPorts, newPorts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPorts(stmPorts newPorts) {
		if (newPorts != ports) {
			NotificationChain msgs = null;
			if (ports != null)
				msgs = ((InternalEObject)ports).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RdcPackage.STM32F446RE__PORTS, null, msgs);
			if (newPorts != null)
				msgs = ((InternalEObject)newPorts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RdcPackage.STM32F446RE__PORTS, null, msgs);
			msgs = basicSetPorts(newPorts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdcPackage.STM32F446RE__PORTS, newPorts, newPorts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public stmTimingConfig getStmTimingConfig() {
		return stmTimingConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStmTimingConfig(stmTimingConfig newStmTimingConfig, NotificationChain msgs) {
		stmTimingConfig oldStmTimingConfig = stmTimingConfig;
		stmTimingConfig = newStmTimingConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdcPackage.STM32F446RE__STM_TIMING_CONFIG, oldStmTimingConfig, newStmTimingConfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStmTimingConfig(stmTimingConfig newStmTimingConfig) {
		if (newStmTimingConfig != stmTimingConfig) {
			NotificationChain msgs = null;
			if (stmTimingConfig != null)
				msgs = ((InternalEObject)stmTimingConfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RdcPackage.STM32F446RE__STM_TIMING_CONFIG, null, msgs);
			if (newStmTimingConfig != null)
				msgs = ((InternalEObject)newStmTimingConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RdcPackage.STM32F446RE__STM_TIMING_CONFIG, null, msgs);
			msgs = basicSetStmTimingConfig(newStmTimingConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdcPackage.STM32F446RE__STM_TIMING_CONFIG, newStmTimingConfig, newStmTimingConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MsgBoxExtension getMsgBoxExtension() {
		return msgBoxExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMsgBoxExtension(MsgBoxExtension newMsgBoxExtension, NotificationChain msgs) {
		MsgBoxExtension oldMsgBoxExtension = msgBoxExtension;
		msgBoxExtension = newMsgBoxExtension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdcPackage.STM32F446RE__MSG_BOX_EXTENSION, oldMsgBoxExtension, newMsgBoxExtension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMsgBoxExtension(MsgBoxExtension newMsgBoxExtension) {
		if (newMsgBoxExtension != msgBoxExtension) {
			NotificationChain msgs = null;
			if (msgBoxExtension != null)
				msgs = ((InternalEObject)msgBoxExtension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RdcPackage.STM32F446RE__MSG_BOX_EXTENSION, null, msgs);
			if (newMsgBoxExtension != null)
				msgs = ((InternalEObject)newMsgBoxExtension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RdcPackage.STM32F446RE__MSG_BOX_EXTENSION, null, msgs);
			msgs = basicSetMsgBoxExtension(newMsgBoxExtension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdcPackage.STM32F446RE__MSG_BOX_EXTENSION, newMsgBoxExtension, newMsgBoxExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdcPackage.STM32F446RE__PORTS:
				return basicSetPorts(null, msgs);
			case RdcPackage.STM32F446RE__STM_TIMING_CONFIG:
				return basicSetStmTimingConfig(null, msgs);
			case RdcPackage.STM32F446RE__MSG_BOX_EXTENSION:
				return basicSetMsgBoxExtension(null, msgs);
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
			case RdcPackage.STM32F446RE__PROJECT_NAME:
				return getProjectName();
			case RdcPackage.STM32F446RE__SIZE:
				return getSize();
			case RdcPackage.STM32F446RE__PORTS:
				return getPorts();
			case RdcPackage.STM32F446RE__STM_TIMING_CONFIG:
				return getStmTimingConfig();
			case RdcPackage.STM32F446RE__MSG_BOX_EXTENSION:
				return getMsgBoxExtension();
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
			case RdcPackage.STM32F446RE__PROJECT_NAME:
				setProjectName((String)newValue);
				return;
			case RdcPackage.STM32F446RE__SIZE:
				setSize((String)newValue);
				return;
			case RdcPackage.STM32F446RE__PORTS:
				setPorts((stmPorts)newValue);
				return;
			case RdcPackage.STM32F446RE__STM_TIMING_CONFIG:
				setStmTimingConfig((stmTimingConfig)newValue);
				return;
			case RdcPackage.STM32F446RE__MSG_BOX_EXTENSION:
				setMsgBoxExtension((MsgBoxExtension)newValue);
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
			case RdcPackage.STM32F446RE__PROJECT_NAME:
				setProjectName(PROJECT_NAME_EDEFAULT);
				return;
			case RdcPackage.STM32F446RE__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case RdcPackage.STM32F446RE__PORTS:
				setPorts((stmPorts)null);
				return;
			case RdcPackage.STM32F446RE__STM_TIMING_CONFIG:
				setStmTimingConfig((stmTimingConfig)null);
				return;
			case RdcPackage.STM32F446RE__MSG_BOX_EXTENSION:
				setMsgBoxExtension((MsgBoxExtension)null);
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
			case RdcPackage.STM32F446RE__PROJECT_NAME:
				return PROJECT_NAME_EDEFAULT == null ? projectName != null : !PROJECT_NAME_EDEFAULT.equals(projectName);
			case RdcPackage.STM32F446RE__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
			case RdcPackage.STM32F446RE__PORTS:
				return ports != null;
			case RdcPackage.STM32F446RE__STM_TIMING_CONFIG:
				return stmTimingConfig != null;
			case RdcPackage.STM32F446RE__MSG_BOX_EXTENSION:
				return msgBoxExtension != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SuperTargetType.class) {
			switch (derivedFeatureID) {
				case RdcPackage.STM32F446RE__PROJECT_NAME: return TargetsPackage.SUPER_TARGET_TYPE__PROJECT_NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SuperTargetType.class) {
			switch (baseFeatureID) {
				case TargetsPackage.SUPER_TARGET_TYPE__PROJECT_NAME: return RdcPackage.STM32F446RE__PROJECT_NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (projectName: ");
		result.append(projectName);
		result.append(", size: ");
		result.append(size);
		result.append(')');
		return result.toString();
	}

} //stm32f446reImpl
