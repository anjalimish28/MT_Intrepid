/**
 */
package ucof.assignments;

import ucof.common.enums.SingleDirectionType;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UDP Socket Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.assignments.UDPSocketExtension#getPortSelection <em>Port Selection</em>}</li>
 *   <li>{@link ucof.assignments.UDPSocketExtension#getIpAdress <em>Ip Adress</em>}</li>
 *   <li>{@link ucof.assignments.UDPSocketExtension#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see ucof.assignments.AssignmentsPackage#getUDPSocketExtension()
 * @model
 * @generated
 */
public interface UDPSocketExtension extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Port Selection</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.SingleDirectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Selection</em>' attribute.
	 * @see ucof.common.enums.SingleDirectionType
	 * @see #setPortSelection(SingleDirectionType)
	 * @see ucof.assignments.AssignmentsPackage#getUDPSocketExtension_PortSelection()
	 * @model
	 * @generated
	 */
	SingleDirectionType getPortSelection();

	/**
	 * Sets the value of the '{@link ucof.assignments.UDPSocketExtension#getPortSelection <em>Port Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Selection</em>' attribute.
	 * @see ucof.common.enums.SingleDirectionType
	 * @see #getPortSelection()
	 * @generated
	 */
	void setPortSelection(SingleDirectionType value);

	/**
	 * Returns the value of the '<em><b>Ip Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip Adress</em>' attribute.
	 * @see #setIpAdress(String)
	 * @see ucof.assignments.AssignmentsPackage#getUDPSocketExtension_IpAdress()
	 * @model dataType="ucof.common.edata.IPAddressType"
	 * @generated
	 */
	String getIpAdress();

	/**
	 * Sets the value of the '{@link ucof.assignments.UDPSocketExtension#getIpAdress <em>Ip Adress</em>}' attribute.
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
	 * @see ucof.assignments.AssignmentsPackage#getUDPSocketExtension_Port()
	 * @model dataType="ucof.common.edata.PortType"
	 * @generated
	 */
	Integer getPort();

	/**
	 * Sets the value of the '{@link ucof.assignments.UDPSocketExtension#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Integer value);

} // UDPSocketExtension
