/**
 */
package ucof.communication.basedonwired;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analogue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.basedonwired.Analogue#getIncCountStepSize <em>Inc Count Step Size</em>}</li>
 *   <li>{@link ucof.communication.basedonwired.Analogue#getDecCountStepSize <em>Dec Count Step Size</em>}</li>
 * </ul>
 *
 * @see ucof.communication.basedonwired.BasedonwiredPackage#getAnalogue()
 * @model
 * @generated
 */
public interface Analogue extends WiredSuper {
	/**
	 * Returns the value of the '<em><b>Inc Count Step Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inc Count Step Size</em>' attribute.
	 * @see #setIncCountStepSize(int)
	 * @see ucof.communication.basedonwired.BasedonwiredPackage#getAnalogue_IncCountStepSize()
	 * @model
	 * @generated
	 */
	int getIncCountStepSize();

	/**
	 * Sets the value of the '{@link ucof.communication.basedonwired.Analogue#getIncCountStepSize <em>Inc Count Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inc Count Step Size</em>' attribute.
	 * @see #getIncCountStepSize()
	 * @generated
	 */
	void setIncCountStepSize(int value);

	/**
	 * Returns the value of the '<em><b>Dec Count Step Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dec Count Step Size</em>' attribute.
	 * @see #setDecCountStepSize(int)
	 * @see ucof.communication.basedonwired.BasedonwiredPackage#getAnalogue_DecCountStepSize()
	 * @model
	 * @generated
	 */
	int getDecCountStepSize();

	/**
	 * Sets the value of the '{@link ucof.communication.basedonwired.Analogue#getDecCountStepSize <em>Dec Count Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dec Count Step Size</em>' attribute.
	 * @see #getDecCountStepSize()
	 * @generated
	 */
	void setDecCountStepSize(int value);

} // Analogue
