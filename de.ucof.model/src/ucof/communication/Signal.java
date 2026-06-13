/**
 */
package ucof.communication;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

import ucof.communication.arinc429.A429SignalSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Signal is the lowest definiable level for communication
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.Signal#getDataType <em>Data Type</em>}</li>
 *   <li>{@link ucof.communication.Signal#getSignedness <em>Signedness</em>}</li>
 *   <li>{@link ucof.communication.Signal#getBitLength <em>Bit Length</em>}</li>
 *   <li>{@link ucof.communication.Signal#getFactor <em>Factor</em>}</li>
 *   <li>{@link ucof.communication.Signal#getOffset <em>Offset</em>}</li>
 *   <li>{@link ucof.communication.Signal#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link ucof.communication.Signal#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link ucof.communication.Signal#getUnit <em>Unit</em>}</li>
 *   <li>{@link ucof.communication.Signal#getByteOrder <em>Byte Order</em>}</li>
 *   <li>{@link ucof.communication.Signal#getA429Specification <em>A429 Specification</em>}</li>
 * </ul>
 *
 * @see ucof.communication.CommunicationPackage#getSignal()
 * @model extendedMetaData="kind='elementOnly' name='SIGNAL'"
 * @generated
 */
public interface Signal extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.communication.DataTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see ucof.communication.DataTypes
	 * @see #setDataType(DataTypes)
	 * @see ucof.communication.CommunicationPackage#getSignal_DataType()
	 * @model
	 * @generated
	 */
	DataTypes getDataType();

	/**
	 * Sets the value of the '{@link ucof.communication.Signal#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see ucof.communication.DataTypes
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataTypes value);

	/**
	 * Returns the value of the '<em><b>Signedness</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.communication.SignedUnsigned}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signedness</em>' attribute.
	 * @see ucof.communication.SignedUnsigned
	 * @see #setSignedness(SignedUnsigned)
	 * @see ucof.communication.CommunicationPackage#getSignal_Signedness()
	 * @model
	 * @generated
	 */
	SignedUnsigned getSignedness();

	/**
	 * Sets the value of the '{@link ucof.communication.Signal#getSignedness <em>Signedness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signedness</em>' attribute.
	 * @see ucof.communication.SignedUnsigned
	 * @see #getSignedness()
	 * @generated
	 */
	void setSignedness(SignedUnsigned value);

	/**
	 * Returns the value of the '<em><b>Bit Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bit Length</em>' attribute.
	 * @see #setBitLength(int)
	 * @see ucof.communication.CommunicationPackage#getSignal_BitLength()
	 * @model
	 * @generated
	 */
	int getBitLength();

	/**
	 * Sets the value of the '{@link ucof.communication.Signal#getBitLength <em>Bit Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bit Length</em>' attribute.
	 * @see #getBitLength()
	 * @generated
	 */
	void setBitLength(int value);

	/**
	 * Returns the value of the '<em><b>Factor</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factor</em>' attribute.
	 * @see #setFactor(double)
	 * @see ucof.communication.CommunicationPackage#getSignal_Factor()
	 * @model default="0"
	 * @generated
	 */
	double getFactor();

	/**
	 * Sets the value of the '{@link ucof.communication.Signal#getFactor <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' attribute.
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(double value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(double)
	 * @see ucof.communication.CommunicationPackage#getSignal_Offset()
	 * @model
	 * @generated
	 */
	double getOffset();

	/**
	 * Sets the value of the '{@link ucof.communication.Signal#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(double value);

	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #setMinValue(double)
	 * @see ucof.communication.CommunicationPackage#getSignal_MinValue()
	 * @model
	 * @generated
	 */
	double getMinValue();

	/**
	 * Sets the value of the '{@link ucof.communication.Signal#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #getMinValue()
	 * @generated
	 */
	void setMinValue(double value);

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #setMaxValue(double)
	 * @see ucof.communication.CommunicationPackage#getSignal_MaxValue()
	 * @model
	 * @generated
	 */
	double getMaxValue();

	/**
	 * Sets the value of the '{@link ucof.communication.Signal#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(double value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see ucof.communication.CommunicationPackage#getSignal_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link ucof.communication.Signal#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Byte Order</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.communication.Endianess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte Order</em>' attribute.
	 * @see ucof.communication.Endianess
	 * @see #setByteOrder(Endianess)
	 * @see ucof.communication.CommunicationPackage#getSignal_ByteOrder()
	 * @model
	 * @generated
	 */
	Endianess getByteOrder();

	/**
	 * Sets the value of the '{@link ucof.communication.Signal#getByteOrder <em>Byte Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byte Order</em>' attribute.
	 * @see ucof.communication.Endianess
	 * @see #getByteOrder()
	 * @generated
	 */
	void setByteOrder(Endianess value);

	/**
	 * Returns the value of the '<em><b>A429 Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ARINC 429 signals requires additional information, which is added through the respective signal speicification
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>A429 Specification</em>' containment reference.
	 * @see #setA429Specification(A429SignalSpecification)
	 * @see ucof.communication.CommunicationPackage#getSignal_A429Specification()
	 * @model containment="true"
	 * @generated
	 */
	A429SignalSpecification getA429Specification();

	/**
	 * Sets the value of the '{@link ucof.communication.Signal#getA429Specification <em>A429 Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A429 Specification</em>' containment reference.
	 * @see #getA429Specification()
	 * @generated
	 */
	void setA429Specification(A429SignalSpecification value);

} // Signal
