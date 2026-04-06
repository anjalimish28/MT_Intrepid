/**
 */
package targets.CCDPU;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see targets.CCDPU.CCDPUPackage
 * @generated
 */
public interface CCDPUFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CCDPUFactory eINSTANCE = targets.CCDPU.impl.CCDPUFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>va41620peb1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>va41620peb1</em>'.
	 * @generated
	 */
	va41620peb1 createva41620peb1();

	/**
	 * Returns a new object of class '<em>vorago Ports</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>vorago Ports</em>'.
	 * @generated
	 */
	voragoPorts createvoragoPorts();

	/**
	 * Returns a new object of class '<em>vorago Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>vorago Port</em>'.
	 * @generated
	 */
	voragoPort createvoragoPort();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CCDPUPackage getCCDPUPackage();

} //CCDPUFactory
