/**
 */
package ucof.communication.basedonethernet.arinc664;

import ucof.communication.basedonethernet.EthernetPort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>A664 Bus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.A664Bus#getVirtualLink <em>Virtual Link</em>}</li>
 * </ul>
 *
 * @see ucof.communication.basedonethernet.arinc664.Arinc664Package#getA664Bus()
 * @model
 * @generated
 */
public interface A664Bus extends EthernetPort {
	/**
	 * Returns the value of the '<em><b>Virtual Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Link</em>' containment reference.
	 * @see #setVirtualLink(A664VirtualLinkSuper)
	 * @see ucof.communication.basedonethernet.arinc664.Arinc664Package#getA664Bus_VirtualLink()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	A664VirtualLinkSuper getVirtualLink();

	/**
	 * Sets the value of the '{@link ucof.communication.basedonethernet.arinc664.A664Bus#getVirtualLink <em>Virtual Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Link</em>' containment reference.
	 * @see #getVirtualLink()
	 * @generated
	 */
	void setVirtualLink(A664VirtualLinkSuper value);

} // A664Bus
