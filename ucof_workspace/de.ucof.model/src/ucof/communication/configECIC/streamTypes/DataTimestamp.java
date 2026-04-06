/**
 */
package ucof.communication.configECIC.streamTypes;

import ucof.common.enums.YesNoType;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Timestamp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.streamTypes.DataTimestamp#getEnable <em>Enable</em>}</li>
 *   <li>{@link ucof.communication.configECIC.streamTypes.DataTimestamp#getSampleDataTimestampOffset <em>Sample Data Timestamp Offset</em>}</li>
 * </ul>
 *
 * @see ucof.communication.configECIC.streamTypes.StreamTypesPackage#getDataTimestamp()
 * @model
 * @generated
 */
public interface DataTimestamp extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Enable</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.YesNoType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable</em>' attribute.
	 * @see ucof.common.enums.YesNoType
	 * @see #setEnable(YesNoType)
	 * @see ucof.communication.configECIC.streamTypes.StreamTypesPackage#getDataTimestamp_Enable()
	 * @model
	 * @generated
	 */
	YesNoType getEnable();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.streamTypes.DataTimestamp#getEnable <em>Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable</em>' attribute.
	 * @see ucof.common.enums.YesNoType
	 * @see #getEnable()
	 * @generated
	 */
	void setEnable(YesNoType value);

	/**
	 * Returns the value of the '<em><b>Sample Data Timestamp Offset</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.YesNoType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sample Data Timestamp Offset</em>' attribute.
	 * @see ucof.common.enums.YesNoType
	 * @see #setSampleDataTimestampOffset(YesNoType)
	 * @see ucof.communication.configECIC.streamTypes.StreamTypesPackage#getDataTimestamp_SampleDataTimestampOffset()
	 * @model
	 * @generated
	 */
	YesNoType getSampleDataTimestampOffset();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.streamTypes.DataTimestamp#getSampleDataTimestampOffset <em>Sample Data Timestamp Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sample Data Timestamp Offset</em>' attribute.
	 * @see ucof.common.enums.YesNoType
	 * @see #getSampleDataTimestampOffset()
	 * @generated
	 */
	void setSampleDataTimestampOffset(YesNoType value);

} // DataTimestamp
