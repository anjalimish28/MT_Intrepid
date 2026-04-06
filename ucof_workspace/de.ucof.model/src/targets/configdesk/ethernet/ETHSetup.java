/**
 */
package targets.configdesk.ethernet;

import org.eclipse.emf.common.util.EList;

import targets.configdesk.SuperConfigurationDeskIOHardwareType;

import ucof.communication.basedonethernet.EthernetPort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ETH Setup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.configdesk.ethernet.ETHSetup#getChannelSet <em>Channel Set</em>}</li>
 *   <li>{@link targets.configdesk.ethernet.ETHSetup#getChannel <em>Channel</em>}</li>
 *   <li>{@link targets.configdesk.ethernet.ETHSetup#getModelAccessiblePorts <em>Model Accessible Ports</em>}</li>
 *   <li>{@link targets.configdesk.ethernet.ETHSetup#getEthernetPort <em>Ethernet Port</em>}</li>
 *   <li>{@link targets.configdesk.ethernet.ETHSetup#getUDPConnection <em>UDP Connection</em>}</li>
 * </ul>
 *
 * @see targets.configdesk.ethernet.EthernetPackage#getETHSetup()
 * @model
 * @generated
 */
public interface ETHSetup extends SuperConfigurationDeskIOHardwareType {
	/**
	 * Returns the value of the '<em><b>Channel Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel Set</em>' attribute.
	 * @see #setChannelSet(String)
	 * @see targets.configdesk.ethernet.EthernetPackage#getETHSetup_ChannelSet()
	 * @model
	 * @generated
	 */
	String getChannelSet();

	/**
	 * Sets the value of the '{@link targets.configdesk.ethernet.ETHSetup#getChannelSet <em>Channel Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel Set</em>' attribute.
	 * @see #getChannelSet()
	 * @generated
	 */
	void setChannelSet(String value);

	/**
	 * Returns the value of the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel</em>' attribute.
	 * @see #setChannel(String)
	 * @see targets.configdesk.ethernet.EthernetPackage#getETHSetup_Channel()
	 * @model
	 * @generated
	 */
	String getChannel();

	/**
	 * Sets the value of the '{@link targets.configdesk.ethernet.ETHSetup#getChannel <em>Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel</em>' attribute.
	 * @see #getChannel()
	 * @generated
	 */
	void setChannel(String value);

	/**
	 * Returns the value of the '<em><b>Model Accessible Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Accessible Ports</em>' attribute.
	 * @see #setModelAccessiblePorts(String)
	 * @see targets.configdesk.ethernet.EthernetPackage#getETHSetup_ModelAccessiblePorts()
	 * @model
	 * @generated
	 */
	String getModelAccessiblePorts();

	/**
	 * Sets the value of the '{@link targets.configdesk.ethernet.ETHSetup#getModelAccessiblePorts <em>Model Accessible Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Accessible Ports</em>' attribute.
	 * @see #getModelAccessiblePorts()
	 * @generated
	 */
	void setModelAccessiblePorts(String value);

	/**
	 * Returns the value of the '<em><b>Ethernet Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ethernet Port</em>' reference.
	 * @see #setEthernetPort(EthernetPort)
	 * @see targets.configdesk.ethernet.EthernetPackage#getETHSetup_EthernetPort()
	 * @model
	 * @generated
	 */
	EthernetPort getEthernetPort();

	/**
	 * Sets the value of the '{@link targets.configdesk.ethernet.ETHSetup#getEthernetPort <em>Ethernet Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ethernet Port</em>' reference.
	 * @see #getEthernetPort()
	 * @generated
	 */
	void setEthernetPort(EthernetPort value);

	/**
	 * Returns the value of the '<em><b>UDP Connection</b></em>' containment reference list.
	 * The list contents are of type {@link targets.configdesk.ethernet.UDPConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UDP Connection</em>' containment reference list.
	 * @see targets.configdesk.ethernet.EthernetPackage#getETHSetup_UDPConnection()
	 * @model containment="true"
	 * @generated
	 */
	EList<UDPConnection> getUDPConnection();

} // ETHSetup
