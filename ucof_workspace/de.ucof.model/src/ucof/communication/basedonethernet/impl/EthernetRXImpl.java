/**
 */
package ucof.communication.basedonethernet.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.communication.basedonethernet.BasedonethernetPackage;
import ucof.communication.basedonethernet.EthernetRX;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ethernet RX</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.basedonethernet.impl.EthernetRXImpl#getSourcePort <em>Source Port</em>}</li>
 *   <li>{@link ucof.communication.basedonethernet.impl.EthernetRXImpl#getSourceIP <em>Source IP</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EthernetRXImpl extends SuperEthernetMessageTypeImpl implements EthernetRX {
	/**
	 * The default value of the '{@link #getSourcePort() <em>Source Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePort()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SOURCE_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourcePort() <em>Source Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePort()
	 * @generated
	 * @ordered
	 */
	protected Integer sourcePort = SOURCE_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceIP() <em>Source IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceIP()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceIP() <em>Source IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceIP()
	 * @generated
	 * @ordered
	 */
	protected String sourceIP = SOURCE_IP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EthernetRXImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasedonethernetPackage.Literals.ETHERNET_RX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSourcePort() {
		return sourcePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcePort(Integer newSourcePort) {
		Integer oldSourcePort = sourcePort;
		sourcePort = newSourcePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasedonethernetPackage.ETHERNET_RX__SOURCE_PORT, oldSourcePort, sourcePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceIP() {
		return sourceIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceIP(String newSourceIP) {
		String oldSourceIP = sourceIP;
		sourceIP = newSourceIP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasedonethernetPackage.ETHERNET_RX__SOURCE_IP, oldSourceIP, sourceIP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasedonethernetPackage.ETHERNET_RX__SOURCE_PORT:
				return getSourcePort();
			case BasedonethernetPackage.ETHERNET_RX__SOURCE_IP:
				return getSourceIP();
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
			case BasedonethernetPackage.ETHERNET_RX__SOURCE_PORT:
				setSourcePort((Integer)newValue);
				return;
			case BasedonethernetPackage.ETHERNET_RX__SOURCE_IP:
				setSourceIP((String)newValue);
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
			case BasedonethernetPackage.ETHERNET_RX__SOURCE_PORT:
				setSourcePort(SOURCE_PORT_EDEFAULT);
				return;
			case BasedonethernetPackage.ETHERNET_RX__SOURCE_IP:
				setSourceIP(SOURCE_IP_EDEFAULT);
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
			case BasedonethernetPackage.ETHERNET_RX__SOURCE_PORT:
				return SOURCE_PORT_EDEFAULT == null ? sourcePort != null : !SOURCE_PORT_EDEFAULT.equals(sourcePort);
			case BasedonethernetPackage.ETHERNET_RX__SOURCE_IP:
				return SOURCE_IP_EDEFAULT == null ? sourceIP != null : !SOURCE_IP_EDEFAULT.equals(sourceIP);
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
		result.append(" (sourcePort: ");
		result.append(sourcePort);
		result.append(", sourceIP: ");
		result.append(sourceIP);
		result.append(')');
		return result.toString();
	}

} //EthernetRXImpl
