/**
 */
package ucof.common.etypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sampling Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Sampling Port where new messages overwrite old entries. Always only holds one message
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.common.etypes.SamplingPort#getRefreshPeriodORTransmissionRate <em>Refresh Period OR Transmission Rate</em>}</li>
 * </ul>
 *
 * @see ucof.common.etypes.EtypesPackage#getSamplingPort()
 * @model
 * @generated
 */
public interface SamplingPort extends SuperInterCommunicationPortType {
	/**
	 * Returns the value of the '<em><b>Refresh Period OR Transmission Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows O/S to control whether correct messages arrive at a specified rate in the port, regardless of receive request rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Refresh Period OR Transmission Rate</em>' attribute.
	 * @see #setRefreshPeriodORTransmissionRate(String)
	 * @see ucof.common.etypes.EtypesPackage#getSamplingPort_RefreshPeriodORTransmissionRate()
	 * @model dataType="ucof.common.edata.DecOrHexValueType"
	 * @generated
	 */
	String getRefreshPeriodORTransmissionRate();

	/**
	 * Sets the value of the '{@link ucof.common.etypes.SamplingPort#getRefreshPeriodORTransmissionRate <em>Refresh Period OR Transmission Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refresh Period OR Transmission Rate</em>' attribute.
	 * @see #getRefreshPeriodORTransmissionRate()
	 * @generated
	 */
	void setRefreshPeriodORTransmissionRate(String value);

} // SamplingPort
