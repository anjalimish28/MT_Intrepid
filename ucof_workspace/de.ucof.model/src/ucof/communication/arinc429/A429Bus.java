/**
 */
package ucof.communication.arinc429;

import ucof.communication.SuperCommunicationInterfaceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>A429 Bus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.arinc429.A429Bus#getParityType <em>Parity Type</em>}</li>
 * </ul>
 *
 * @see ucof.communication.arinc429.Arinc429Package#getA429Bus()
 * @model extendedMetaData="kind='elementOnly' name='A429_BUS'"
 * @generated
 */
public interface A429Bus extends SuperCommunicationInterfaceType {
	/**
	 * Returns the value of the '<em><b>Parity Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.communication.arinc429.ParityTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parity Type</em>' attribute.
	 * @see ucof.communication.arinc429.ParityTypes
	 * @see #setParityType(ParityTypes)
	 * @see ucof.communication.arinc429.Arinc429Package#getA429Bus_ParityType()
	 * @model
	 * @generated
	 */
	ParityTypes getParityType();

	/**
	 * Sets the value of the '{@link ucof.communication.arinc429.A429Bus#getParityType <em>Parity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parity Type</em>' attribute.
	 * @see ucof.communication.arinc429.ParityTypes
	 * @see #getParityType()
	 * @generated
	 */
	void setParityType(ParityTypes value);

} // A429Bus
