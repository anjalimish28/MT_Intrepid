/**
 */
package targets.avip;

import ucof.common.enums.booleanType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discrete Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.avip.DiscreteInput#getHpp <em>Hpp</em>}</li>
 *   <li>{@link targets.avip.DiscreteInput#getHpp_port <em>Hpp port</em>}</li>
 *   <li>{@link targets.avip.DiscreteInput#getMax_polarisation_voltage <em>Max polarisation voltage</em>}</li>
 *   <li>{@link targets.avip.DiscreteInput#getMax_voltage_gnd <em>Max voltage gnd</em>}</li>
 *   <li>{@link targets.avip.DiscreteInput#getMin_voltage_gnd <em>Min voltage gnd</em>}</li>
 *   <li>{@link targets.avip.DiscreteInput#getMax_voltage_opn <em>Max voltage opn</em>}</li>
 *   <li>{@link targets.avip.DiscreteInput#getMin_voltage_opn <em>Min voltage opn</em>}</li>
 *   <li>{@link targets.avip.DiscreteInput#getPolarisation_failure_dematuration_duration <em>Polarisation failure dematuration duration</em>}</li>
 *   <li>{@link targets.avip.DiscreteInput#getPolarisation_failure_maturation_duration <em>Polarisation failure maturation duration</em>}</li>
 * </ul>
 *
 * @see targets.avip.AvipPackage#getDiscreteInput()
 * @model
 * @generated
 */
public interface DiscreteInput extends SuperWiredPortType {
	/**
	 * Returns the value of the '<em><b>Hpp</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.booleanType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hpp</em>' attribute.
	 * @see ucof.common.enums.booleanType
	 * @see #setHpp(booleanType)
	 * @see targets.avip.AvipPackage#getDiscreteInput_Hpp()
	 * @model
	 * @generated
	 */
	booleanType getHpp();

	/**
	 * Sets the value of the '{@link targets.avip.DiscreteInput#getHpp <em>Hpp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hpp</em>' attribute.
	 * @see ucof.common.enums.booleanType
	 * @see #getHpp()
	 * @generated
	 */
	void setHpp(booleanType value);

	/**
	 * Returns the value of the '<em><b>Hpp port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hpp port</em>' attribute.
	 * @see #setHpp_port(float)
	 * @see targets.avip.AvipPackage#getDiscreteInput_Hpp_port()
	 * @model
	 * @generated
	 */
	float getHpp_port();

	/**
	 * Sets the value of the '{@link targets.avip.DiscreteInput#getHpp_port <em>Hpp port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hpp port</em>' attribute.
	 * @see #getHpp_port()
	 * @generated
	 */
	void setHpp_port(float value);

	/**
	 * Returns the value of the '<em><b>Max polarisation voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max polarisation voltage</em>' attribute.
	 * @see #setMax_polarisation_voltage(float)
	 * @see targets.avip.AvipPackage#getDiscreteInput_Max_polarisation_voltage()
	 * @model
	 * @generated
	 */
	float getMax_polarisation_voltage();

	/**
	 * Sets the value of the '{@link targets.avip.DiscreteInput#getMax_polarisation_voltage <em>Max polarisation voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max polarisation voltage</em>' attribute.
	 * @see #getMax_polarisation_voltage()
	 * @generated
	 */
	void setMax_polarisation_voltage(float value);

	/**
	 * Returns the value of the '<em><b>Max voltage gnd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max voltage gnd</em>' attribute.
	 * @see #setMax_voltage_gnd(float)
	 * @see targets.avip.AvipPackage#getDiscreteInput_Max_voltage_gnd()
	 * @model
	 * @generated
	 */
	float getMax_voltage_gnd();

	/**
	 * Sets the value of the '{@link targets.avip.DiscreteInput#getMax_voltage_gnd <em>Max voltage gnd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max voltage gnd</em>' attribute.
	 * @see #getMax_voltage_gnd()
	 * @generated
	 */
	void setMax_voltage_gnd(float value);

	/**
	 * Returns the value of the '<em><b>Min voltage gnd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min voltage gnd</em>' attribute.
	 * @see #setMin_voltage_gnd(float)
	 * @see targets.avip.AvipPackage#getDiscreteInput_Min_voltage_gnd()
	 * @model
	 * @generated
	 */
	float getMin_voltage_gnd();

	/**
	 * Sets the value of the '{@link targets.avip.DiscreteInput#getMin_voltage_gnd <em>Min voltage gnd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min voltage gnd</em>' attribute.
	 * @see #getMin_voltage_gnd()
	 * @generated
	 */
	void setMin_voltage_gnd(float value);

	/**
	 * Returns the value of the '<em><b>Max voltage opn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max voltage opn</em>' attribute.
	 * @see #setMax_voltage_opn(float)
	 * @see targets.avip.AvipPackage#getDiscreteInput_Max_voltage_opn()
	 * @model
	 * @generated
	 */
	float getMax_voltage_opn();

	/**
	 * Sets the value of the '{@link targets.avip.DiscreteInput#getMax_voltage_opn <em>Max voltage opn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max voltage opn</em>' attribute.
	 * @see #getMax_voltage_opn()
	 * @generated
	 */
	void setMax_voltage_opn(float value);

	/**
	 * Returns the value of the '<em><b>Min voltage opn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min voltage opn</em>' attribute.
	 * @see #setMin_voltage_opn(float)
	 * @see targets.avip.AvipPackage#getDiscreteInput_Min_voltage_opn()
	 * @model
	 * @generated
	 */
	float getMin_voltage_opn();

	/**
	 * Sets the value of the '{@link targets.avip.DiscreteInput#getMin_voltage_opn <em>Min voltage opn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min voltage opn</em>' attribute.
	 * @see #getMin_voltage_opn()
	 * @generated
	 */
	void setMin_voltage_opn(float value);

	/**
	 * Returns the value of the '<em><b>Polarisation failure dematuration duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polarisation failure dematuration duration</em>' attribute.
	 * @see #setPolarisation_failure_dematuration_duration(int)
	 * @see targets.avip.AvipPackage#getDiscreteInput_Polarisation_failure_dematuration_duration()
	 * @model
	 * @generated
	 */
	int getPolarisation_failure_dematuration_duration();

	/**
	 * Sets the value of the '{@link targets.avip.DiscreteInput#getPolarisation_failure_dematuration_duration <em>Polarisation failure dematuration duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polarisation failure dematuration duration</em>' attribute.
	 * @see #getPolarisation_failure_dematuration_duration()
	 * @generated
	 */
	void setPolarisation_failure_dematuration_duration(int value);

	/**
	 * Returns the value of the '<em><b>Polarisation failure maturation duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polarisation failure maturation duration</em>' attribute.
	 * @see #setPolarisation_failure_maturation_duration(int)
	 * @see targets.avip.AvipPackage#getDiscreteInput_Polarisation_failure_maturation_duration()
	 * @model
	 * @generated
	 */
	int getPolarisation_failure_maturation_duration();

	/**
	 * Sets the value of the '{@link targets.avip.DiscreteInput#getPolarisation_failure_maturation_duration <em>Polarisation failure maturation duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polarisation failure maturation duration</em>' attribute.
	 * @see #getPolarisation_failure_maturation_duration()
	 * @generated
	 */
	void setPolarisation_failure_maturation_duration(int value);

} // DiscreteInput
