/**
 */
package targets.configdesk.wired;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see targets.configdesk.wired.WiredPackage
 * @generated
 */
public interface WiredFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WiredFactory eINSTANCE = targets.configdesk.wired.impl.WiredFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Analogues</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analogues</em>'.
	 * @generated
	 */
	Analogues createAnalogues();

	/**
	 * Returns a new object of class '<em>Analogue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analogue</em>'.
	 * @generated
	 */
	Analogue createAnalogue();

	/**
	 * Returns a new object of class '<em>Digitals</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Digitals</em>'.
	 * @generated
	 */
	Digitals createDigitals();

	/**
	 * Returns a new object of class '<em>Digital</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Digital</em>'.
	 * @generated
	 */
	Digital createDigital();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WiredPackage getWiredPackage();

} //WiredFactory
