/**
 */
package ucof.communication.basedonethernet.arinc664;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>A664 Virtual Link Out</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.A664VirtualLinkOut#getBAG <em>BAG</em>}</li>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.A664VirtualLinkOut#getMaxFrameSize <em>Max Frame Size</em>}</li>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.A664VirtualLinkOut#getOverSampling <em>Over Sampling</em>}</li>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.A664VirtualLinkOut#getPhase <em>Phase</em>}</li>
 * </ul>
 *
 * @see ucof.communication.basedonethernet.arinc664.Arinc664Package#getA664VirtualLinkOut()
 * @model
 * @generated
 */
public interface A664VirtualLinkOut extends A664VirtualLinkSuper {
	/**
	 * Returns the value of the '<em><b>BAG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BAG</em>' attribute.
	 * @see #setBAG(String)
	 * @see ucof.communication.basedonethernet.arinc664.Arinc664Package#getA664VirtualLinkOut_BAG()
	 * @model dataType="ucof.common.edata.DecOrHexValueType"
	 * @generated
	 */
	String getBAG();

	/**
	 * Sets the value of the '{@link ucof.communication.basedonethernet.arinc664.A664VirtualLinkOut#getBAG <em>BAG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BAG</em>' attribute.
	 * @see #getBAG()
	 * @generated
	 */
	void setBAG(String value);

	/**
	 * Returns the value of the '<em><b>Max Frame Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Frame Size</em>' attribute.
	 * @see #setMaxFrameSize(String)
	 * @see ucof.communication.basedonethernet.arinc664.Arinc664Package#getA664VirtualLinkOut_MaxFrameSize()
	 * @model dataType="ucof.common.edata.DecOrHexValueType"
	 * @generated
	 */
	String getMaxFrameSize();

	/**
	 * Sets the value of the '{@link ucof.communication.basedonethernet.arinc664.A664VirtualLinkOut#getMaxFrameSize <em>Max Frame Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Frame Size</em>' attribute.
	 * @see #getMaxFrameSize()
	 * @generated
	 */
	void setMaxFrameSize(String value);

	/**
	 * Returns the value of the '<em><b>Over Sampling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Over Sampling</em>' attribute.
	 * @see #setOverSampling(String)
	 * @see ucof.communication.basedonethernet.arinc664.Arinc664Package#getA664VirtualLinkOut_OverSampling()
	 * @model dataType="ucof.common.edata.DecOrHexValueType"
	 * @generated
	 */
	String getOverSampling();

	/**
	 * Sets the value of the '{@link ucof.communication.basedonethernet.arinc664.A664VirtualLinkOut#getOverSampling <em>Over Sampling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Over Sampling</em>' attribute.
	 * @see #getOverSampling()
	 * @generated
	 */
	void setOverSampling(String value);

	/**
	 * Returns the value of the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase</em>' attribute.
	 * @see #setPhase(String)
	 * @see ucof.communication.basedonethernet.arinc664.Arinc664Package#getA664VirtualLinkOut_Phase()
	 * @model dataType="ucof.common.edata.DecOrHexValueType"
	 * @generated
	 */
	String getPhase();

	/**
	 * Sets the value of the '{@link ucof.communication.basedonethernet.arinc664.A664VirtualLinkOut#getPhase <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase</em>' attribute.
	 * @see #getPhase()
	 * @generated
	 */
	void setPhase(String value);

} // A664VirtualLinkOut
