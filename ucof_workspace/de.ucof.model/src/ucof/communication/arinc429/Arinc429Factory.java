/**
 */
package ucof.communication.arinc429;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ucof.communication.arinc429.Arinc429Package
 * @generated
 */
public interface Arinc429Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Arinc429Factory eINSTANCE = ucof.communication.arinc429.impl.Arinc429FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>A429 Bus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>A429 Bus</em>'.
	 * @generated
	 */
	A429Bus createA429Bus();

	/**
	 * Returns a new object of class '<em>A429 Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>A429 Message</em>'.
	 * @generated
	 */
	A429Message createA429Message();

	/**
	 * Returns a new object of class '<em>A429 Signal Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>A429 Signal Specification</em>'.
	 * @generated
	 */
	A429SignalSpecification createA429SignalSpecification();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Arinc429Package getArinc429Package();

} //Arinc429Factory
