/**
 */
package ucof.communication.basedonwired;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ucof.communication.basedonwired.BasedonwiredPackage
 * @generated
 */
public interface BasedonwiredFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasedonwiredFactory eINSTANCE = ucof.communication.basedonwired.impl.BasedonwiredFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Wired Interfaces</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wired Interfaces</em>'.
	 * @generated
	 */
	WiredInterfaces createWiredInterfaces();

	/**
	 * Returns a new object of class '<em>Analogue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analogue</em>'.
	 * @generated
	 */
	Analogue createAnalogue();

	/**
	 * Returns a new object of class '<em>Discrete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discrete</em>'.
	 * @generated
	 */
	Discrete createDiscrete();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BasedonwiredPackage getBasedonwiredPackage();

} //BasedonwiredFactory
