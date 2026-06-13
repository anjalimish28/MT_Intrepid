/**
 */
package ucof.communication.arinc429;

import ucof.common.enums.SDITypes;

import ucof.communication.SuperMessageType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>A429 Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.arinc429.A429Message#getSdi <em>Sdi</em>}</li>
 *   <li>{@link ucof.communication.arinc429.A429Message#getA429Label <em>A429 Label</em>}</li>
 *   <li>{@link ucof.communication.arinc429.A429Message#getA429SSM <em>A429SSM</em>}</li>
 *   <li>{@link ucof.communication.arinc429.A429Message#getLabelNumber <em>Label Number</em>}</li>
 * </ul>
 *
 * @see ucof.communication.arinc429.Arinc429Package#getA429Message()
 * @model extendedMetaData="kind='elementOnly' name='A429_MESSAGE'"
 * @generated
 */
public interface A429Message extends SuperMessageType {
	/**
	 * Returns the value of the '<em><b>Sdi</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.SDITypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sdi</em>' attribute.
	 * @see ucof.common.enums.SDITypes
	 * @see #setSdi(SDITypes)
	 * @see ucof.communication.arinc429.Arinc429Package#getA429Message_Sdi()
	 * @model
	 * @generated
	 */
	SDITypes getSdi();

	/**
	 * Sets the value of the '{@link ucof.communication.arinc429.A429Message#getSdi <em>Sdi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sdi</em>' attribute.
	 * @see ucof.common.enums.SDITypes
	 * @see #getSdi()
	 * @generated
	 */
	void setSdi(SDITypes value);

	/**
	 * Returns the value of the '<em><b>A429 Label</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.communication.arinc429.SSMTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A429 Label</em>' attribute.
	 * @see ucof.communication.arinc429.SSMTypes
	 * @see #setA429Label(SSMTypes)
	 * @see ucof.communication.arinc429.Arinc429Package#getA429Message_A429Label()
	 * @model
	 * @generated
	 */
	SSMTypes getA429Label();

	/**
	 * Sets the value of the '{@link ucof.communication.arinc429.A429Message#getA429Label <em>A429 Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A429 Label</em>' attribute.
	 * @see ucof.communication.arinc429.SSMTypes
	 * @see #getA429Label()
	 * @generated
	 */
	void setA429Label(SSMTypes value);

	/**
	 * Returns the value of the '<em><b>A429SSM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A429SSM</em>' attribute.
	 * @see #setA429SSM(String)
	 * @see ucof.communication.arinc429.Arinc429Package#getA429Message_A429SSM()
	 * @model
	 * @generated
	 */
	String getA429SSM();

	/**
	 * Sets the value of the '{@link ucof.communication.arinc429.A429Message#getA429SSM <em>A429SSM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A429SSM</em>' attribute.
	 * @see #getA429SSM()
	 * @generated
	 */
	void setA429SSM(String value);

	/**
	 * Returns the value of the '<em><b>Label Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Number</em>' attribute.
	 * @see #setLabelNumber(int)
	 * @see ucof.communication.arinc429.Arinc429Package#getA429Message_LabelNumber()
	 * @model
	 * @generated
	 */
	int getLabelNumber();

	/**
	 * Sets the value of the '{@link ucof.communication.arinc429.A429Message#getLabelNumber <em>Label Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Number</em>' attribute.
	 * @see #getLabelNumber()
	 * @generated
	 */
	void setLabelNumber(int value);

} // A429Message
