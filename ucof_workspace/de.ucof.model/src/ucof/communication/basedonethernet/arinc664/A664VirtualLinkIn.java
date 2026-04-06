/**
 */
package ucof.communication.basedonethernet.arinc664;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>A664 Virtual Link In</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.A664VirtualLinkIn#getMaxSkew <em>Max Skew</em>}</li>
 * </ul>
 *
 * @see ucof.communication.basedonethernet.arinc664.Arinc664Package#getA664VirtualLinkIn()
 * @model
 * @generated
 */
public interface A664VirtualLinkIn extends A664VirtualLinkSuper {
	/**
	 * Returns the value of the '<em><b>Max Skew</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Skew</em>' attribute.
	 * @see #setMaxSkew(String)
	 * @see ucof.communication.basedonethernet.arinc664.Arinc664Package#getA664VirtualLinkIn_MaxSkew()
	 * @model dataType="ucof.common.edata.DecOrHexValueType"
	 * @generated
	 */
	String getMaxSkew();

	/**
	 * Sets the value of the '{@link ucof.communication.basedonethernet.arinc664.A664VirtualLinkIn#getMaxSkew <em>Max Skew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Skew</em>' attribute.
	 * @see #getMaxSkew()
	 * @generated
	 */
	void setMaxSkew(String value);

} // A664VirtualLinkIn
