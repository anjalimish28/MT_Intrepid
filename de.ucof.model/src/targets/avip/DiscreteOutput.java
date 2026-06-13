/**
 */
package targets.avip;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discrete Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.avip.DiscreteOutput#getClose_volt_margin <em>Close volt margin</em>}</li>
 *   <li>{@link targets.avip.DiscreteOutput#getInternal_pull_up_voltage <em>Internal pull up voltage</em>}</li>
 *   <li>{@link targets.avip.DiscreteOutput#getMax_v_case_gnd_conn <em>Max vcase gnd conn</em>}</li>
 *   <li>{@link targets.avip.DiscreteOutput#getNormal_load_resistance <em>Normal load resistance</em>}</li>
 *   <li>{@link targets.avip.DiscreteOutput#getNormal_load_voltage <em>Normal load voltage</em>}</li>
 *   <li>{@link targets.avip.DiscreteOutput#getOver_current_fault_maturation_duration <em>Over current fault maturation duration</em>}</li>
 *   <li>{@link targets.avip.DiscreteOutput#getOverload_current_threshold <em>Overload current threshold</em>}</li>
 *   <li>{@link targets.avip.DiscreteOutput#getShort_circuit_current_threshold <em>Short circuit current threshold</em>}</li>
 *   <li>{@link targets.avip.DiscreteOutput#getSoft_over_current_fault_maturation_duration <em>Soft over current fault maturation duration</em>}</li>
 * </ul>
 *
 * @see targets.avip.AvipPackage#getDiscreteOutput()
 * @model
 * @generated
 */
public interface DiscreteOutput extends SuperWiredPortType {
	/**
	 * Returns the value of the '<em><b>Close volt margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Close volt margin</em>' attribute.
	 * @see #setClose_volt_margin(float)
	 * @see targets.avip.AvipPackage#getDiscreteOutput_Close_volt_margin()
	 * @model
	 * @generated
	 */
	float getClose_volt_margin();

	/**
	 * Sets the value of the '{@link targets.avip.DiscreteOutput#getClose_volt_margin <em>Close volt margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Close volt margin</em>' attribute.
	 * @see #getClose_volt_margin()
	 * @generated
	 */
	void setClose_volt_margin(float value);

	/**
	 * Returns the value of the '<em><b>Internal pull up voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal pull up voltage</em>' attribute.
	 * @see #setInternal_pull_up_voltage(float)
	 * @see targets.avip.AvipPackage#getDiscreteOutput_Internal_pull_up_voltage()
	 * @model
	 * @generated
	 */
	float getInternal_pull_up_voltage();

	/**
	 * Sets the value of the '{@link targets.avip.DiscreteOutput#getInternal_pull_up_voltage <em>Internal pull up voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal pull up voltage</em>' attribute.
	 * @see #getInternal_pull_up_voltage()
	 * @generated
	 */
	void setInternal_pull_up_voltage(float value);

	/**
	 * Returns the value of the '<em><b>Max vcase gnd conn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max vcase gnd conn</em>' attribute.
	 * @see #setMax_v_case_gnd_conn(float)
	 * @see targets.avip.AvipPackage#getDiscreteOutput_Max_v_case_gnd_conn()
	 * @model
	 * @generated
	 */
	float getMax_v_case_gnd_conn();

	/**
	 * Sets the value of the '{@link targets.avip.DiscreteOutput#getMax_v_case_gnd_conn <em>Max vcase gnd conn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max vcase gnd conn</em>' attribute.
	 * @see #getMax_v_case_gnd_conn()
	 * @generated
	 */
	void setMax_v_case_gnd_conn(float value);

	/**
	 * Returns the value of the '<em><b>Normal load resistance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal load resistance</em>' attribute.
	 * @see #setNormal_load_resistance(float)
	 * @see targets.avip.AvipPackage#getDiscreteOutput_Normal_load_resistance()
	 * @model
	 * @generated
	 */
	float getNormal_load_resistance();

	/**
	 * Sets the value of the '{@link targets.avip.DiscreteOutput#getNormal_load_resistance <em>Normal load resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal load resistance</em>' attribute.
	 * @see #getNormal_load_resistance()
	 * @generated
	 */
	void setNormal_load_resistance(float value);

	/**
	 * Returns the value of the '<em><b>Normal load voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal load voltage</em>' attribute.
	 * @see #setNormal_load_voltage(float)
	 * @see targets.avip.AvipPackage#getDiscreteOutput_Normal_load_voltage()
	 * @model
	 * @generated
	 */
	float getNormal_load_voltage();

	/**
	 * Sets the value of the '{@link targets.avip.DiscreteOutput#getNormal_load_voltage <em>Normal load voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal load voltage</em>' attribute.
	 * @see #getNormal_load_voltage()
	 * @generated
	 */
	void setNormal_load_voltage(float value);

	/**
	 * Returns the value of the '<em><b>Over current fault maturation duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Over current fault maturation duration</em>' attribute.
	 * @see #setOver_current_fault_maturation_duration(int)
	 * @see targets.avip.AvipPackage#getDiscreteOutput_Over_current_fault_maturation_duration()
	 * @model
	 * @generated
	 */
	int getOver_current_fault_maturation_duration();

	/**
	 * Sets the value of the '{@link targets.avip.DiscreteOutput#getOver_current_fault_maturation_duration <em>Over current fault maturation duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Over current fault maturation duration</em>' attribute.
	 * @see #getOver_current_fault_maturation_duration()
	 * @generated
	 */
	void setOver_current_fault_maturation_duration(int value);

	/**
	 * Returns the value of the '<em><b>Overload current threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overload current threshold</em>' attribute.
	 * @see #setOverload_current_threshold(float)
	 * @see targets.avip.AvipPackage#getDiscreteOutput_Overload_current_threshold()
	 * @model
	 * @generated
	 */
	float getOverload_current_threshold();

	/**
	 * Sets the value of the '{@link targets.avip.DiscreteOutput#getOverload_current_threshold <em>Overload current threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overload current threshold</em>' attribute.
	 * @see #getOverload_current_threshold()
	 * @generated
	 */
	void setOverload_current_threshold(float value);

	/**
	 * Returns the value of the '<em><b>Short circuit current threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short circuit current threshold</em>' attribute.
	 * @see #setShort_circuit_current_threshold(float)
	 * @see targets.avip.AvipPackage#getDiscreteOutput_Short_circuit_current_threshold()
	 * @model
	 * @generated
	 */
	float getShort_circuit_current_threshold();

	/**
	 * Sets the value of the '{@link targets.avip.DiscreteOutput#getShort_circuit_current_threshold <em>Short circuit current threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short circuit current threshold</em>' attribute.
	 * @see #getShort_circuit_current_threshold()
	 * @generated
	 */
	void setShort_circuit_current_threshold(float value);

	/**
	 * Returns the value of the '<em><b>Soft over current fault maturation duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soft over current fault maturation duration</em>' attribute.
	 * @see #setSoft_over_current_fault_maturation_duration(int)
	 * @see targets.avip.AvipPackage#getDiscreteOutput_Soft_over_current_fault_maturation_duration()
	 * @model
	 * @generated
	 */
	int getSoft_over_current_fault_maturation_duration();

	/**
	 * Sets the value of the '{@link targets.avip.DiscreteOutput#getSoft_over_current_fault_maturation_duration <em>Soft over current fault maturation duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soft over current fault maturation duration</em>' attribute.
	 * @see #getSoft_over_current_fault_maturation_duration()
	 * @generated
	 */
	void setSoft_over_current_fault_maturation_duration(int value);

} // DiscreteOutput
