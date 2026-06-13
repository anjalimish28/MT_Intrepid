/**
 */
package ucof.communication.basedonethernet.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.communication.basedonethernet.BasedonethernetPackage;
import ucof.communication.basedonethernet.EthernetTX;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ethernet TX</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.basedonethernet.impl.EthernetTXImpl#getDestinationIP <em>Destination IP</em>}</li>
 *   <li>{@link ucof.communication.basedonethernet.impl.EthernetTXImpl#getDestinationPort <em>Destination Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EthernetTXImpl extends SuperEthernetMessageTypeImpl implements EthernetTX {
	/**
	 * The default value of the '{@link #getDestinationIP() <em>Destination IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationIP()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestinationIP() <em>Destination IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationIP()
	 * @generated
	 * @ordered
	 */
	protected String destinationIP = DESTINATION_IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestinationPort() <em>Destination Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationPort()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DESTINATION_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestinationPort() <em>Destination Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationPort()
	 * @generated
	 * @ordered
	 */
	protected Integer destinationPort = DESTINATION_PORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EthernetTXImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasedonethernetPackage.Literals.ETHERNET_TX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestinationIP() {
		return destinationIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationIP(String newDestinationIP) {
		String oldDestinationIP = destinationIP;
		destinationIP = newDestinationIP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasedonethernetPackage.ETHERNET_TX__DESTINATION_IP, oldDestinationIP, destinationIP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDestinationPort() {
		return destinationPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationPort(Integer newDestinationPort) {
		Integer oldDestinationPort = destinationPort;
		destinationPort = newDestinationPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasedonethernetPackage.ETHERNET_TX__DESTINATION_PORT, oldDestinationPort, destinationPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasedonethernetPackage.ETHERNET_TX__DESTINATION_IP:
				return getDestinationIP();
			case BasedonethernetPackage.ETHERNET_TX__DESTINATION_PORT:
				return getDestinationPort();
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
			case BasedonethernetPackage.ETHERNET_TX__DESTINATION_IP:
				setDestinationIP((String)newValue);
				return;
			case BasedonethernetPackage.ETHERNET_TX__DESTINATION_PORT:
				setDestinationPort((Integer)newValue);
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
			case BasedonethernetPackage.ETHERNET_TX__DESTINATION_IP:
				setDestinationIP(DESTINATION_IP_EDEFAULT);
				return;
			case BasedonethernetPackage.ETHERNET_TX__DESTINATION_PORT:
				setDestinationPort(DESTINATION_PORT_EDEFAULT);
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
			case BasedonethernetPackage.ETHERNET_TX__DESTINATION_IP:
				return DESTINATION_IP_EDEFAULT == null ? destinationIP != null : !DESTINATION_IP_EDEFAULT.equals(destinationIP);
			case BasedonethernetPackage.ETHERNET_TX__DESTINATION_PORT:
				return DESTINATION_PORT_EDEFAULT == null ? destinationPort != null : !DESTINATION_PORT_EDEFAULT.equals(destinationPort);
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
		result.append(" (destinationIP: ");
		result.append(destinationIP);
		result.append(", destinationPort: ");
		result.append(destinationPort);
		result.append(')');
		return result.toString();
	}

} //EthernetTXImpl
