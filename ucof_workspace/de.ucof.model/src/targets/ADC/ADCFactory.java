/**
 */
package targets.adc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see targets.adc.AdcPackage
 * @generated
 */
public interface AdcFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdcFactory eINSTANCE = targets.adc.impl.AdcFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>ads1115</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ads1115</em>'.
	 * @generated
	 */
	ads1115 createads1115();

	/**
	 * Returns a new object of class '<em>adc Ports</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>adc Ports</em>'.
	 * @generated
	 */
	adcPorts createadcPorts();

	/**
	 * Returns a new object of class '<em>adc Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>adc Port</em>'.
	 * @generated
	 */
	adcPort createadcPort();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AdcPackage getAdcPackage();

} //AdcFactory
