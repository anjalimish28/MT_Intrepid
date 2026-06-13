/**
 */
package targets.adc;

import targets.SuperTargetType;

import targets.powergrid.SuperPowerType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ads1115</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.adc.ads1115#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see targets.adc.AdcPackage#getads1115()
 * @model
 * @generated
 */
public interface ads1115 extends SuperTargetType, SuperPowerType {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference.
	 * @see #setPorts(adcPorts)
	 * @see targets.adc.AdcPackage#getads1115_Ports()
	 * @model containment="true"
	 * @generated
	 */
	adcPorts getPorts();

	/**
	 * Sets the value of the '{@link targets.adc.ads1115#getPorts <em>Ports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ports</em>' containment reference.
	 * @see #getPorts()
	 * @generated
	 */
	void setPorts(adcPorts value);

} // ads1115
