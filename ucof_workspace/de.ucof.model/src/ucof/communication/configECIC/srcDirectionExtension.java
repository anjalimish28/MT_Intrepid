/**
 */
package ucof.communication.configECIC;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>src Direction Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.srcDirectionExtension#getIpAdress <em>Ip Adress</em>}</li>
 *   <li>{@link ucof.communication.configECIC.srcDirectionExtension#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see ucof.communication.configECIC.ConfigECICPackage#getsrcDirectionExtension()
 * @model
 * @generated
 */
public interface srcDirectionExtension extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Ip Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip Adress</em>' attribute.
	 * @see #setIpAdress(String)
	 * @see ucof.communication.configECIC.ConfigECICPackage#getsrcDirectionExtension_IpAdress()
	 * @model dataType="ucof.common.edata.IPAddressType"
	 * @generated
	 */
	String getIpAdress();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.srcDirectionExtension#getIpAdress <em>Ip Adress</em>}' attribute.
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
	 * @see ucof.communication.configECIC.ConfigECICPackage#getsrcDirectionExtension_Port()
	 * @model dataType="ucof.common.edata.PortType"
	 * @generated
	 */
	Integer getPort();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.srcDirectionExtension#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Integer value);

} // srcDirectionExtension
