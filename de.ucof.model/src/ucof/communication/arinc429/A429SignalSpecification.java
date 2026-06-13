/**
 */
package ucof.communication.arinc429;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>A429 Signal Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.arinc429.A429SignalSpecification#getCodingType <em>Coding Type</em>}</li>
 *   <li>{@link ucof.communication.arinc429.A429SignalSpecification#getFieldLength <em>Field Length</em>}</li>
 * </ul>
 *
 * @see ucof.communication.arinc429.Arinc429Package#getA429SignalSpecification()
 * @model extendedMetaData="kind='elementOnly' name='A429_DATA_FIELD'"
 * @generated
 */
public interface A429SignalSpecification extends SuperTrackingType, SuperIdentifierType {
	/**
	 * Returns the value of the '<em><b>Coding Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.communication.arinc429.CodingTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coding Type</em>' attribute.
	 * @see ucof.communication.arinc429.CodingTypes
	 * @see #setCodingType(CodingTypes)
	 * @see ucof.communication.arinc429.Arinc429Package#getA429SignalSpecification_CodingType()
	 * @model
	 * @generated
	 */
	CodingTypes getCodingType();

	/**
	 * Sets the value of the '{@link ucof.communication.arinc429.A429SignalSpecification#getCodingType <em>Coding Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coding Type</em>' attribute.
	 * @see ucof.communication.arinc429.CodingTypes
	 * @see #getCodingType()
	 * @generated
	 */
	void setCodingType(CodingTypes value);

	/**
	 * Returns the value of the '<em><b>Field Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Length</em>' attribute.
	 * @see #setFieldLength(int)
	 * @see ucof.communication.arinc429.Arinc429Package#getA429SignalSpecification_FieldLength()
	 * @model
	 * @generated
	 */
	int getFieldLength();

	/**
	 * Sets the value of the '{@link ucof.communication.arinc429.A429SignalSpecification#getFieldLength <em>Field Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Length</em>' attribute.
	 * @see #getFieldLength()
	 * @generated
	 */
	void setFieldLength(int value);

} // A429SignalSpecification
