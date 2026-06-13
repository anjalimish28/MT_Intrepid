/**
 */
package targets.intrepidgateway;

import org.eclipse.emf.common.util.EList;
import targets.SuperClassExtensionType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Msg Box Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.intrepidgateway.MsgBoxExtension#getNumOfOutgoingMailboxes <em>Num Of Outgoing Mailboxes</em>}</li>
 *   <li>{@link targets.intrepidgateway.MsgBoxExtension#getNumOfIncomingMailboxes <em>Num Of Incoming Mailboxes</em>}</li>
 *   <li>{@link targets.intrepidgateway.MsgBoxExtension#getSmallBufferSize <em>Small Buffer Size</em>}</li>
 *   <li>{@link targets.intrepidgateway.MsgBoxExtension#getSmallBufferCount <em>Small Buffer Count</em>}</li>
 *   <li>{@link targets.intrepidgateway.MsgBoxExtension#getMediumBufferSize <em>Medium Buffer Size</em>}</li>
 *   <li>{@link targets.intrepidgateway.MsgBoxExtension#getMediumBufferCount <em>Medium Buffer Count</em>}</li>
 *   <li>{@link targets.intrepidgateway.MsgBoxExtension#getBigBufferSize <em>Big Buffer Size</em>}</li>
 *   <li>{@link targets.intrepidgateway.MsgBoxExtension#getBigBufferCount <em>Big Buffer Count</em>}</li>
 *   <li>{@link targets.intrepidgateway.MsgBoxExtension#getNodeAddr <em>Node Addr</em>}</li>
 *   <li>{@link targets.intrepidgateway.MsgBoxExtension#getNodeAddressSymbol <em>Node Address Symbol</em>}</li>
 *   <li>{@link targets.intrepidgateway.MsgBoxExtension#getIncomingDestinationFilter <em>Incoming Destination Filter</em>}</li>
 *   <li>{@link targets.intrepidgateway.MsgBoxExtension#getSenderSourceFilter <em>Sender Source Filter</em>}</li>
 *   <li>{@link targets.intrepidgateway.MsgBoxExtension#getOutgoingMailboxSlot <em>Outgoing Mailbox Slot</em>}</li>
 * </ul>
 *
 * @see targets.intrepidgateway.IntrepidgatewayPackage#getMsgBoxExtension()
 * @model
 * @generated
 */
public interface MsgBoxExtension extends SuperClassExtensionType {
	/**
	 * Returns the value of the '<em><b>Num Of Outgoing Mailboxes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Of Outgoing Mailboxes</em>' attribute.
	 * @see #setNumOfOutgoingMailboxes(int)
	 * @see targets.intrepidgateway.IntrepidgatewayPackage#getMsgBoxExtension_NumOfOutgoingMailboxes()
	 * @model
	 * @generated
	 */
	int getNumOfOutgoingMailboxes();

	/**
	 * Sets the value of the '{@link targets.intrepidgateway.MsgBoxExtension#getNumOfOutgoingMailboxes <em>Num Of Outgoing Mailboxes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Of Outgoing Mailboxes</em>' attribute.
	 * @see #getNumOfOutgoingMailboxes()
	 * @generated
	 */
	void setNumOfOutgoingMailboxes(int value);

	/**
	 * Returns the value of the '<em><b>Num Of Incoming Mailboxes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Of Incoming Mailboxes</em>' attribute.
	 * @see #setNumOfIncomingMailboxes(int)
	 * @see targets.intrepidgateway.IntrepidgatewayPackage#getMsgBoxExtension_NumOfIncomingMailboxes()
	 * @model
	 * @generated
	 */
	int getNumOfIncomingMailboxes();

	/**
	 * Sets the value of the '{@link targets.intrepidgateway.MsgBoxExtension#getNumOfIncomingMailboxes <em>Num Of Incoming Mailboxes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Of Incoming Mailboxes</em>' attribute.
	 * @see #getNumOfIncomingMailboxes()
	 * @generated
	 */
	void setNumOfIncomingMailboxes(int value);

	/**
	 * Returns the value of the '<em><b>Small Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Small Buffer Size</em>' attribute.
	 * @see #setSmallBufferSize(int)
	 * @see targets.intrepidgateway.IntrepidgatewayPackage#getMsgBoxExtension_SmallBufferSize()
	 * @model
	 * @generated
	 */
	int getSmallBufferSize();

	/**
	 * Sets the value of the '{@link targets.intrepidgateway.MsgBoxExtension#getSmallBufferSize <em>Small Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Small Buffer Size</em>' attribute.
	 * @see #getSmallBufferSize()
	 * @generated
	 */
	void setSmallBufferSize(int value);

	/**
	 * Returns the value of the '<em><b>Small Buffer Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Small Buffer Count</em>' attribute.
	 * @see #setSmallBufferCount(int)
	 * @see targets.intrepidgateway.IntrepidgatewayPackage#getMsgBoxExtension_SmallBufferCount()
	 * @model
	 * @generated
	 */
	int getSmallBufferCount();

	/**
	 * Sets the value of the '{@link targets.intrepidgateway.MsgBoxExtension#getSmallBufferCount <em>Small Buffer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Small Buffer Count</em>' attribute.
	 * @see #getSmallBufferCount()
	 * @generated
	 */
	void setSmallBufferCount(int value);

	/**
	 * Returns the value of the '<em><b>Medium Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medium Buffer Size</em>' attribute.
	 * @see #setMediumBufferSize(int)
	 * @see targets.intrepidgateway.IntrepidgatewayPackage#getMsgBoxExtension_MediumBufferSize()
	 * @model
	 * @generated
	 */
	int getMediumBufferSize();

	/**
	 * Sets the value of the '{@link targets.intrepidgateway.MsgBoxExtension#getMediumBufferSize <em>Medium Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medium Buffer Size</em>' attribute.
	 * @see #getMediumBufferSize()
	 * @generated
	 */
	void setMediumBufferSize(int value);

	/**
	 * Returns the value of the '<em><b>Medium Buffer Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medium Buffer Count</em>' attribute.
	 * @see #setMediumBufferCount(int)
	 * @see targets.intrepidgateway.IntrepidgatewayPackage#getMsgBoxExtension_MediumBufferCount()
	 * @model
	 * @generated
	 */
	int getMediumBufferCount();

	/**
	 * Sets the value of the '{@link targets.intrepidgateway.MsgBoxExtension#getMediumBufferCount <em>Medium Buffer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medium Buffer Count</em>' attribute.
	 * @see #getMediumBufferCount()
	 * @generated
	 */
	void setMediumBufferCount(int value);

	/**
	 * Returns the value of the '<em><b>Big Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Big Buffer Size</em>' attribute.
	 * @see #setBigBufferSize(int)
	 * @see targets.intrepidgateway.IntrepidgatewayPackage#getMsgBoxExtension_BigBufferSize()
	 * @model
	 * @generated
	 */
	int getBigBufferSize();

	/**
	 * Sets the value of the '{@link targets.intrepidgateway.MsgBoxExtension#getBigBufferSize <em>Big Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Big Buffer Size</em>' attribute.
	 * @see #getBigBufferSize()
	 * @generated
	 */
	void setBigBufferSize(int value);

	/**
	 * Returns the value of the '<em><b>Big Buffer Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Big Buffer Count</em>' attribute.
	 * @see #setBigBufferCount(int)
	 * @see targets.intrepidgateway.IntrepidgatewayPackage#getMsgBoxExtension_BigBufferCount()
	 * @model
	 * @generated
	 */
	int getBigBufferCount();

	/**
	 * Sets the value of the '{@link targets.intrepidgateway.MsgBoxExtension#getBigBufferCount <em>Big Buffer Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Big Buffer Count</em>' attribute.
	 * @see #getBigBufferCount()
	 * @generated
	 */
	void setBigBufferCount(int value);

	/**
	 * Returns the value of the '<em><b>Node Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Addr</em>' attribute.
	 * @see #setNodeAddr(int)
	 * @see targets.intrepidgateway.IntrepidgatewayPackage#getMsgBoxExtension_NodeAddr()
	 * @model
	 * @generated
	 */
	int getNodeAddr();

	/**
	 * Sets the value of the '{@link targets.intrepidgateway.MsgBoxExtension#getNodeAddr <em>Node Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Addr</em>' attribute.
	 * @see #getNodeAddr()
	 * @generated
	 */
	void setNodeAddr(int value);

	/**
	 * Returns the value of the '<em><b>Node Address Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Address Symbol</em>' attribute.
	 * @see #setNodeAddressSymbol(String)
	 * @see targets.intrepidgateway.IntrepidgatewayPackage#getMsgBoxExtension_NodeAddressSymbol()
	 * @model
	 * @generated
	 */
	String getNodeAddressSymbol();

	/**
	 * Sets the value of the '{@link targets.intrepidgateway.MsgBoxExtension#getNodeAddressSymbol <em>Node Address Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Address Symbol</em>' attribute.
	 * @see #getNodeAddressSymbol()
	 * @generated
	 */
	void setNodeAddressSymbol(String value);

	/**
	 * Returns the value of the '<em><b>Incoming Destination Filter</b></em>' containment reference list.
	 * The list contents are of type {@link targets.intrepidgateway.CanMailboxAddressFilter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Destination Filter</em>' containment reference list.
	 * @see targets.intrepidgateway.IntrepidgatewayPackage#getMsgBoxExtension_IncomingDestinationFilter()
	 * @model containment="true"
	 * @generated
	 */
	EList<CanMailboxAddressFilter> getIncomingDestinationFilter();

	/**
	 * Returns the value of the '<em><b>Sender Source Filter</b></em>' containment reference list.
	 * The list contents are of type {@link targets.intrepidgateway.CanMailboxAddressFilter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender Source Filter</em>' containment reference list.
	 * @see targets.intrepidgateway.IntrepidgatewayPackage#getMsgBoxExtension_SenderSourceFilter()
	 * @model containment="true"
	 * @generated
	 */
	EList<CanMailboxAddressFilter> getSenderSourceFilter();

	/**
	 * Returns the value of the '<em><b>Outgoing Mailbox Slot</b></em>' containment reference list.
	 * The list contents are of type {@link targets.intrepidgateway.CanMailboxOutSlot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Mailbox Slot</em>' containment reference list.
	 * @see targets.intrepidgateway.IntrepidgatewayPackage#getMsgBoxExtension_OutgoingMailboxSlot()
	 * @model containment="true"
	 * @generated
	 */
	EList<CanMailboxOutSlot> getOutgoingMailboxSlot();

} // MsgBoxExtension
