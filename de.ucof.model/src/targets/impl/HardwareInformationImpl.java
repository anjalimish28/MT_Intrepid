/**
 */
package targets.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import targets.HardwareInformation;
import targets.TargetsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.impl.HardwareInformationImpl#getHardwareTopologyName <em>Hardware Topology Name</em>}</li>
 *   <li>{@link targets.impl.HardwareInformationImpl#getNameOfHardwareSystem <em>Name Of Hardware System</em>}</li>
 *   <li>{@link targets.impl.HardwareInformationImpl#getIPAddressOfHardwareSystem <em>IP Address Of Hardware System</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class HardwareInformationImpl extends MinimalEObjectImpl.Container implements HardwareInformation {
	/**
	 * The default value of the '{@link #getHardwareTopologyName() <em>Hardware Topology Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareTopologyName()
	 * @generated
	 * @ordered
	 */
	protected static final String HARDWARE_TOPOLOGY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHardwareTopologyName() <em>Hardware Topology Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareTopologyName()
	 * @generated
	 * @ordered
	 */
	protected String hardwareTopologyName = HARDWARE_TOPOLOGY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameOfHardwareSystem() <em>Name Of Hardware System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameOfHardwareSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_OF_HARDWARE_SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameOfHardwareSystem() <em>Name Of Hardware System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameOfHardwareSystem()
	 * @generated
	 * @ordered
	 */
	protected String nameOfHardwareSystem = NAME_OF_HARDWARE_SYSTEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getIPAddressOfHardwareSystem() <em>IP Address Of Hardware System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPAddressOfHardwareSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_ADDRESS_OF_HARDWARE_SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIPAddressOfHardwareSystem() <em>IP Address Of Hardware System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPAddressOfHardwareSystem()
	 * @generated
	 * @ordered
	 */
	protected String iPAddressOfHardwareSystem = IP_ADDRESS_OF_HARDWARE_SYSTEM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetsPackage.Literals.HARDWARE_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHardwareTopologyName() {
		return hardwareTopologyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHardwareTopologyName(String newHardwareTopologyName) {
		String oldHardwareTopologyName = hardwareTopologyName;
		hardwareTopologyName = newHardwareTopologyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetsPackage.HARDWARE_INFORMATION__HARDWARE_TOPOLOGY_NAME, oldHardwareTopologyName, hardwareTopologyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameOfHardwareSystem() {
		return nameOfHardwareSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameOfHardwareSystem(String newNameOfHardwareSystem) {
		String oldNameOfHardwareSystem = nameOfHardwareSystem;
		nameOfHardwareSystem = newNameOfHardwareSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetsPackage.HARDWARE_INFORMATION__NAME_OF_HARDWARE_SYSTEM, oldNameOfHardwareSystem, nameOfHardwareSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIPAddressOfHardwareSystem() {
		return iPAddressOfHardwareSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIPAddressOfHardwareSystem(String newIPAddressOfHardwareSystem) {
		String oldIPAddressOfHardwareSystem = iPAddressOfHardwareSystem;
		iPAddressOfHardwareSystem = newIPAddressOfHardwareSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetsPackage.HARDWARE_INFORMATION__IP_ADDRESS_OF_HARDWARE_SYSTEM, oldIPAddressOfHardwareSystem, iPAddressOfHardwareSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TargetsPackage.HARDWARE_INFORMATION__HARDWARE_TOPOLOGY_NAME:
				return getHardwareTopologyName();
			case TargetsPackage.HARDWARE_INFORMATION__NAME_OF_HARDWARE_SYSTEM:
				return getNameOfHardwareSystem();
			case TargetsPackage.HARDWARE_INFORMATION__IP_ADDRESS_OF_HARDWARE_SYSTEM:
				return getIPAddressOfHardwareSystem();
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
			case TargetsPackage.HARDWARE_INFORMATION__HARDWARE_TOPOLOGY_NAME:
				setHardwareTopologyName((String)newValue);
				return;
			case TargetsPackage.HARDWARE_INFORMATION__NAME_OF_HARDWARE_SYSTEM:
				setNameOfHardwareSystem((String)newValue);
				return;
			case TargetsPackage.HARDWARE_INFORMATION__IP_ADDRESS_OF_HARDWARE_SYSTEM:
				setIPAddressOfHardwareSystem((String)newValue);
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
			case TargetsPackage.HARDWARE_INFORMATION__HARDWARE_TOPOLOGY_NAME:
				setHardwareTopologyName(HARDWARE_TOPOLOGY_NAME_EDEFAULT);
				return;
			case TargetsPackage.HARDWARE_INFORMATION__NAME_OF_HARDWARE_SYSTEM:
				setNameOfHardwareSystem(NAME_OF_HARDWARE_SYSTEM_EDEFAULT);
				return;
			case TargetsPackage.HARDWARE_INFORMATION__IP_ADDRESS_OF_HARDWARE_SYSTEM:
				setIPAddressOfHardwareSystem(IP_ADDRESS_OF_HARDWARE_SYSTEM_EDEFAULT);
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
			case TargetsPackage.HARDWARE_INFORMATION__HARDWARE_TOPOLOGY_NAME:
				return HARDWARE_TOPOLOGY_NAME_EDEFAULT == null ? hardwareTopologyName != null : !HARDWARE_TOPOLOGY_NAME_EDEFAULT.equals(hardwareTopologyName);
			case TargetsPackage.HARDWARE_INFORMATION__NAME_OF_HARDWARE_SYSTEM:
				return NAME_OF_HARDWARE_SYSTEM_EDEFAULT == null ? nameOfHardwareSystem != null : !NAME_OF_HARDWARE_SYSTEM_EDEFAULT.equals(nameOfHardwareSystem);
			case TargetsPackage.HARDWARE_INFORMATION__IP_ADDRESS_OF_HARDWARE_SYSTEM:
				return IP_ADDRESS_OF_HARDWARE_SYSTEM_EDEFAULT == null ? iPAddressOfHardwareSystem != null : !IP_ADDRESS_OF_HARDWARE_SYSTEM_EDEFAULT.equals(iPAddressOfHardwareSystem);
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
		result.append(" (hardwareTopologyName: ");
		result.append(hardwareTopologyName);
		result.append(", nameOfHardwareSystem: ");
		result.append(nameOfHardwareSystem);
		result.append(", iPAddressOfHardwareSystem: ");
		result.append(iPAddressOfHardwareSystem);
		result.append(')');
		return result.toString();
	}

} //HardwareInformationImpl
