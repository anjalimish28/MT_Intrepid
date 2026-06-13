/**
 */
package targets.adc;

import org.eclipse.emf.common.util.EList;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>adc Ports</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.adc.adcPorts#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see targets.adc.AdcPackage#getadcPorts()
 * @model
 * @generated
 */
public interface adcPorts extends SuperTrackingType, SuperIdentifierType {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link targets.adc.adcPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see targets.adc.AdcPackage#getadcPorts_Port()
	 * @model containment="true"
	 * @generated
	 */
	EList<adcPort> getPort();

} // adcPorts
