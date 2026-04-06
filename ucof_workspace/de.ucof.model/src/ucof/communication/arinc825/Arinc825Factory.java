/**
 */
package ucof.communication.arinc825;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ucof.communication.arinc825.Arinc825Package
 * @generated
 */
public interface Arinc825Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Arinc825Factory eINSTANCE = ucof.communication.arinc825.impl.Arinc825FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>A825 Bus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>A825 Bus</em>'.
	 * @generated
	 */
	A825Bus createA825Bus();

	/**
	 * Returns a new object of class '<em>A825 Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>A825 Message</em>'.
	 * @generated
	 */
	A825Message createA825Message();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Arinc825Package getArinc825Package();

} //Arinc825Factory
