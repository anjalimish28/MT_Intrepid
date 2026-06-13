/**
 */
package targets.avip;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analogue Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.avip.AnalogueInput#getAi_voltage_max <em>Ai voltage max</em>}</li>
 *   <li>{@link targets.avip.AnalogueInput#getAi_voltage_max_vac_filtered <em>Ai voltage max vac filtered</em>}</li>
 *   <li>{@link targets.avip.AnalogueInput#getAi_voltage_max_vdc_filtered <em>Ai voltage max vdc filtered</em>}</li>
 *   <li>{@link targets.avip.AnalogueInput#getAi_voltage_min <em>Ai voltage min</em>}</li>
 *   <li>{@link targets.avip.AnalogueInput#getAi_voltage_min_vdc_filtered <em>Ai voltage min vdc filtered</em>}</li>
 *   <li>{@link targets.avip.AnalogueInput#getMin_ai_frequency <em>Min ai frequency</em>}</li>
 * </ul>
 *
 * @see targets.avip.AvipPackage#getAnalogueInput()
 * @model
 * @generated
 */
public interface AnalogueInput extends SuperAnaloguePortType {
	/**
	 * Returns the value of the '<em><b>Ai voltage max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ai voltage max</em>' attribute.
	 * @see #setAi_voltage_max(float)
	 * @see targets.avip.AvipPackage#getAnalogueInput_Ai_voltage_max()
	 * @model
	 * @generated
	 */
	float getAi_voltage_max();

	/**
	 * Sets the value of the '{@link targets.avip.AnalogueInput#getAi_voltage_max <em>Ai voltage max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ai voltage max</em>' attribute.
	 * @see #getAi_voltage_max()
	 * @generated
	 */
	void setAi_voltage_max(float value);

	/**
	 * Returns the value of the '<em><b>Ai voltage max vac filtered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ai voltage max vac filtered</em>' attribute.
	 * @see #setAi_voltage_max_vac_filtered(float)
	 * @see targets.avip.AvipPackage#getAnalogueInput_Ai_voltage_max_vac_filtered()
	 * @model
	 * @generated
	 */
	float getAi_voltage_max_vac_filtered();

	/**
	 * Sets the value of the '{@link targets.avip.AnalogueInput#getAi_voltage_max_vac_filtered <em>Ai voltage max vac filtered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ai voltage max vac filtered</em>' attribute.
	 * @see #getAi_voltage_max_vac_filtered()
	 * @generated
	 */
	void setAi_voltage_max_vac_filtered(float value);

	/**
	 * Returns the value of the '<em><b>Ai voltage max vdc filtered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ai voltage max vdc filtered</em>' attribute.
	 * @see #setAi_voltage_max_vdc_filtered(float)
	 * @see targets.avip.AvipPackage#getAnalogueInput_Ai_voltage_max_vdc_filtered()
	 * @model
	 * @generated
	 */
	float getAi_voltage_max_vdc_filtered();

	/**
	 * Sets the value of the '{@link targets.avip.AnalogueInput#getAi_voltage_max_vdc_filtered <em>Ai voltage max vdc filtered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ai voltage max vdc filtered</em>' attribute.
	 * @see #getAi_voltage_max_vdc_filtered()
	 * @generated
	 */
	void setAi_voltage_max_vdc_filtered(float value);

	/**
	 * Returns the value of the '<em><b>Ai voltage min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ai voltage min</em>' attribute.
	 * @see #setAi_voltage_min(float)
	 * @see targets.avip.AvipPackage#getAnalogueInput_Ai_voltage_min()
	 * @model
	 * @generated
	 */
	float getAi_voltage_min();

	/**
	 * Sets the value of the '{@link targets.avip.AnalogueInput#getAi_voltage_min <em>Ai voltage min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ai voltage min</em>' attribute.
	 * @see #getAi_voltage_min()
	 * @generated
	 */
	void setAi_voltage_min(float value);

	/**
	 * Returns the value of the '<em><b>Ai voltage min vdc filtered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ai voltage min vdc filtered</em>' attribute.
	 * @see #setAi_voltage_min_vdc_filtered(float)
	 * @see targets.avip.AvipPackage#getAnalogueInput_Ai_voltage_min_vdc_filtered()
	 * @model
	 * @generated
	 */
	float getAi_voltage_min_vdc_filtered();

	/**
	 * Sets the value of the '{@link targets.avip.AnalogueInput#getAi_voltage_min_vdc_filtered <em>Ai voltage min vdc filtered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ai voltage min vdc filtered</em>' attribute.
	 * @see #getAi_voltage_min_vdc_filtered()
	 * @generated
	 */
	void setAi_voltage_min_vdc_filtered(float value);

	/**
	 * Returns the value of the '<em><b>Min ai frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min ai frequency</em>' attribute.
	 * @see #setMin_ai_frequency(float)
	 * @see targets.avip.AvipPackage#getAnalogueInput_Min_ai_frequency()
	 * @model
	 * @generated
	 */
	float getMin_ai_frequency();

	/**
	 * Sets the value of the '{@link targets.avip.AnalogueInput#getMin_ai_frequency <em>Min ai frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min ai frequency</em>' attribute.
	 * @see #getMin_ai_frequency()
	 * @generated
	 */
	void setMin_ai_frequency(float value);

} // AnalogueInput
