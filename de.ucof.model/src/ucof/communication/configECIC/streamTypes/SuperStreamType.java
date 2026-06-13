/**
 */
package ucof.communication.configECIC.streamTypes;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super Stream Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.streamTypes.SuperStreamType#getSampleMaxNumber <em>Sample Max Number</em>}</li>
 *   <li>{@link ucof.communication.configECIC.streamTypes.SuperStreamType#getIcd <em>Icd</em>}</li>
 *   <li>{@link ucof.communication.configECIC.streamTypes.SuperStreamType#getDataTimestamp <em>Data Timestamp</em>}</li>
 * </ul>
 *
 * @see ucof.communication.configECIC.streamTypes.StreamTypesPackage#getSuperStreamType()
 * @model abstract="true"
 * @generated
 */
public interface SuperStreamType extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Sample Max Number</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sample Max Number</em>' attribute.
	 * @see #setSampleMaxNumber(Integer)
	 * @see ucof.communication.configECIC.streamTypes.StreamTypesPackage#getSuperStreamType_SampleMaxNumber()
	 * @model default="1" dataType="ucof.common.edata.PositiveIntType"
	 * @generated
	 */
	Integer getSampleMaxNumber();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.streamTypes.SuperStreamType#getSampleMaxNumber <em>Sample Max Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sample Max Number</em>' attribute.
	 * @see #getSampleMaxNumber()
	 * @generated
	 */
	void setSampleMaxNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>Icd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icd</em>' attribute.
	 * @see #setIcd(String)
	 * @see ucof.communication.configECIC.streamTypes.StreamTypesPackage#getSuperStreamType_Icd()
	 * @model
	 * @generated
	 */
	String getIcd();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.streamTypes.SuperStreamType#getIcd <em>Icd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icd</em>' attribute.
	 * @see #getIcd()
	 * @generated
	 */
	void setIcd(String value);

	/**
	 * Returns the value of the '<em><b>Data Timestamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Timestamp</em>' containment reference.
	 * @see #setDataTimestamp(DataTimestamp)
	 * @see ucof.communication.configECIC.streamTypes.StreamTypesPackage#getSuperStreamType_DataTimestamp()
	 * @model containment="true"
	 * @generated
	 */
	DataTimestamp getDataTimestamp();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.streamTypes.SuperStreamType#getDataTimestamp <em>Data Timestamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Timestamp</em>' containment reference.
	 * @see #getDataTimestamp()
	 * @generated
	 */
	void setDataTimestamp(DataTimestamp value);

} // SuperStreamType
