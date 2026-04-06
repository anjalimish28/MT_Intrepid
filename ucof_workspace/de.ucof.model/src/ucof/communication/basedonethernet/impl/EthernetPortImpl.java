/**
 */
package ucof.communication.basedonethernet.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.communication.basedonethernet.BasedonethernetPackage;
import ucof.communication.basedonethernet.EthernetPort;

import ucof.communication.impl.SuperCommunicationInterfaceTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ethernet Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.basedonethernet.impl.EthernetPortImpl#getIPAddress <em>IP Address</em>}</li>
 *   <li>{@link ucof.communication.basedonethernet.impl.EthernetPortImpl#getSubnetMask <em>Subnet Mask</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EthernetPortImpl extends SuperCommunicationInterfaceTypeImpl implements EthernetPort {
	/**
	 * The default value of the '{@link #getIPAddress() <em>IP Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIPAddress() <em>IP Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPAddress()
	 * @generated
	 * @ordered
	 */
	protected String iPAddress = IP_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubnetMask() <em>Subnet Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetMask()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBNET_MASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubnetMask() <em>Subnet Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetMask()
	 * @generated
	 * @ordered
	 */
	protected String subnetMask = SUBNET_MASK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EthernetPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasedonethernetPackage.Literals.ETHERNET_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIPAddress() {
		return iPAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIPAddress(String newIPAddress) {
		String oldIPAddress = iPAddress;
		iPAddress = newIPAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasedonethernetPackage.ETHERNET_PORT__IP_ADDRESS, oldIPAddress, iPAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubnetMask() {
		return subnetMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubnetMask(String newSubnetMask) {
		String oldSubnetMask = subnetMask;
		subnetMask = newSubnetMask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasedonethernetPackage.ETHERNET_PORT__SUBNET_MASK, oldSubnetMask, subnetMask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasedonethernetPackage.ETHERNET_PORT__IP_ADDRESS:
				return getIPAddress();
			case BasedonethernetPackage.ETHERNET_PORT__SUBNET_MASK:
				return getSubnetMask();
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
			case BasedonethernetPackage.ETHERNET_PORT__IP_ADDRESS:
				setIPAddress((String)newValue);
				return;
			case BasedonethernetPackage.ETHERNET_PORT__SUBNET_MASK:
				setSubnetMask((String)newValue);
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
			case BasedonethernetPackage.ETHERNET_PORT__IP_ADDRESS:
				setIPAddress(IP_ADDRESS_EDEFAULT);
				return;
			case BasedonethernetPackage.ETHERNET_PORT__SUBNET_MASK:
				setSubnetMask(SUBNET_MASK_EDEFAULT);
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
			case BasedonethernetPackage.ETHERNET_PORT__IP_ADDRESS:
				return IP_ADDRESS_EDEFAULT == null ? iPAddress != null : !IP_ADDRESS_EDEFAULT.equals(iPAddress);
			case BasedonethernetPackage.ETHERNET_PORT__SUBNET_MASK:
				return SUBNET_MASK_EDEFAULT == null ? subnetMask != null : !SUBNET_MASK_EDEFAULT.equals(subnetMask);
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
		result.append(" (iPAddress: ");
		result.append(iPAddress);
		result.append(", subnetMask: ");
		result.append(subnetMask);
		result.append(')');
		return result.toString();
	}

} //EthernetPortImpl
