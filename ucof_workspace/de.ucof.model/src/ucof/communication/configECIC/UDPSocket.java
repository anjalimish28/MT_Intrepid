/**
 */
package ucof.communication.configECIC;

import org.eclipse.emf.common.util.EList;

import ucof.common.enums.PortDirectionType;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UDP Socket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.UDPSocket#getMulticastInterfaceIP <em>Multicast Interface IP</em>}</li>
 *   <li>{@link ucof.communication.configECIC.UDPSocket#getMulticastTTL <em>Multicast TTL</em>}</li>
 *   <li>{@link ucof.communication.configECIC.UDPSocket#getSrcDirectionExtension <em>Src Direction Extension</em>}</li>
 *   <li>{@link ucof.communication.configECIC.UDPSocket#getDirection <em>Direction</em>}</li>
 *   <li>{@link ucof.communication.configECIC.UDPSocket#getIpAdress <em>Ip Adress</em>}</li>
 *   <li>{@link ucof.communication.configECIC.UDPSocket#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see ucof.communication.configECIC.ConfigECICPackage#getUDPSocket()
 * @model
 * @generated
 */
public interface UDPSocket extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Multicast Interface IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multicast Interface IP</em>' attribute.
	 * @see #setMulticastInterfaceIP(String)
	 * @see ucof.communication.configECIC.ConfigECICPackage#getUDPSocket_MulticastInterfaceIP()
	 * @model dataType="ucof.common.edata.IPAddressType"
	 * @generated
	 */
	String getMulticastInterfaceIP();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.UDPSocket#getMulticastInterfaceIP <em>Multicast Interface IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multicast Interface IP</em>' attribute.
	 * @see #getMulticastInterfaceIP()
	 * @generated
	 */
	void setMulticastInterfaceIP(String value);

	/**
	 * Returns the value of the '<em><b>Multicast TTL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multicast TTL</em>' attribute.
	 * @see #setMulticastTTL(int)
	 * @see ucof.communication.configECIC.ConfigECICPackage#getUDPSocket_MulticastTTL()
	 * @model
	 * @generated
	 */
	int getMulticastTTL();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.UDPSocket#getMulticastTTL <em>Multicast TTL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multicast TTL</em>' attribute.
	 * @see #getMulticastTTL()
	 * @generated
	 */
	void setMulticastTTL(int value);

	/**
	 * Returns the value of the '<em><b>Src Direction Extension</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.communication.configECIC.srcDirectionExtension}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src Direction Extension</em>' containment reference list.
	 * @see ucof.communication.configECIC.ConfigECICPackage#getUDPSocket_SrcDirectionExtension()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<srcDirectionExtension> getSrcDirectionExtension();

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.PortDirectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see ucof.common.enums.PortDirectionType
	 * @see #setDirection(PortDirectionType)
	 * @see ucof.communication.configECIC.ConfigECICPackage#getUDPSocket_Direction()
	 * @model
	 * @generated
	 */
	PortDirectionType getDirection();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.UDPSocket#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see ucof.common.enums.PortDirectionType
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(PortDirectionType value);

	/**
	 * Returns the value of the '<em><b>Ip Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip Adress</em>' attribute.
	 * @see #setIpAdress(String)
	 * @see ucof.communication.configECIC.ConfigECICPackage#getUDPSocket_IpAdress()
	 * @model dataType="ucof.common.edata.IPAddressType"
	 * @generated
	 */
	String getIpAdress();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.UDPSocket#getIpAdress <em>Ip Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip Adress</em>' attribute.
	 * @see #getIpAdress()
	 * @generated
	 */
	void setIpAdress(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(Integer)
	 * @see ucof.communication.configECIC.ConfigECICPackage#getUDPSocket_Port()
	 * @model dataType="ucof.common.edata.PortType"
	 * @generated
	 */
	Integer getPort();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.UDPSocket#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Integer value);

} // UDPSocket
