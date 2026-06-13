/**
 */
package ucof.communication.arinc825;

import ucof.common.enums.booleanType;

import ucof.communication.SuperMessageType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>A825 Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.arinc825.A825Message#getDLC <em>DLC</em>}</li>
 *   <li>{@link ucof.communication.arinc825.A825Message#getCanID <em>Can ID</em>}</li>
 *   <li>{@link ucof.communication.arinc825.A825Message#getCanFD <em>Can FD</em>}</li>
 * </ul>
 *
 * @see ucof.communication.arinc825.Arinc825Package#getA825Message()
 * @model
 * @generated
 */
public interface A825Message extends SuperMessageType {
	/**
	 * Returns the value of the '<em><b>DLC</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.communication.arinc825.DLC}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DLC</em>' attribute.
	 * @see ucof.communication.arinc825.DLC
	 * @see #setDLC(DLC)
	 * @see ucof.communication.arinc825.Arinc825Package#getA825Message_DLC()
	 * @model
	 * @generated
	 */
	DLC getDLC();

	/**
	 * Sets the value of the '{@link ucof.communication.arinc825.A825Message#getDLC <em>DLC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DLC</em>' attribute.
	 * @see ucof.communication.arinc825.DLC
	 * @see #getDLC()
	 * @generated
	 */
	void setDLC(DLC value);

	/**
	 * Returns the value of the '<em><b>Can ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can ID</em>' attribute.
	 * @see #setCanID(String)
	 * @see ucof.communication.arinc825.Arinc825Package#getA825Message_CanID()
	 * @model dataType="ucof.common.edata.IdentifierValueType"
	 * @generated
	 */
	String getCanID();

	/**
	 * Sets the value of the '{@link ucof.communication.arinc825.A825Message#getCanID <em>Can ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can ID</em>' attribute.
	 * @see #getCanID()
	 * @generated
	 */
	void setCanID(String value);

	/**
	 * Returns the value of the '<em><b>Can FD</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.booleanType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can FD</em>' attribute.
	 * @see ucof.common.enums.booleanType
	 * @see #setCanFD(booleanType)
	 * @see ucof.communication.arinc825.Arinc825Package#getA825Message_CanFD()
	 * @model
	 * @generated
	 */
	booleanType getCanFD();

	/**
	 * Sets the value of the '{@link ucof.communication.arinc825.A825Message#getCanFD <em>Can FD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can FD</em>' attribute.
	 * @see ucof.common.enums.booleanType
	 * @see #getCanFD()
	 * @generated
	 */
	void setCanFD(booleanType value);

} // A825Message
