/**
 */
package ucof.communication.arinc825;

import ucof.communication.SuperCommunicationInterfaceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>A825 Bus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.arinc825.A825Bus#getBaudRate <em>Baud Rate</em>}</li>
 * </ul>
 *
 * @see ucof.communication.arinc825.Arinc825Package#getA825Bus()
 * @model extendedMetaData="kind='elementOnly' name='CAN_BUS'"
 * @generated
 */
public interface A825Bus extends SuperCommunicationInterfaceType {
	/**
	 * Returns the value of the '<em><b>Baud Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baud Rate</em>' attribute.
	 * @see #setBaudRate(int)
	 * @see ucof.communication.arinc825.Arinc825Package#getA825Bus_BaudRate()
	 * @model
	 * @generated
	 */
	int getBaudRate();

	/**
	 * Sets the value of the '{@link ucof.communication.arinc825.A825Bus#getBaudRate <em>Baud Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Baud Rate</em>' attribute.
	 * @see #getBaudRate()
	 * @generated
	 */
	void setBaudRate(int value);

} // A825Bus
