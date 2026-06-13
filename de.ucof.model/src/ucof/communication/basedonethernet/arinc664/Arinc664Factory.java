/**
 */
package ucof.communication.basedonethernet.arinc664;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ucof.communication.basedonethernet.arinc664.Arinc664Package
 * @generated
 */
public interface Arinc664Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Arinc664Factory eINSTANCE = ucof.communication.basedonethernet.arinc664.impl.Arinc664FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>A664 Bus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>A664 Bus</em>'.
	 * @generated
	 */
	A664Bus createA664Bus();

	/**
	 * Returns a new object of class '<em>A664 Virtual Link In</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>A664 Virtual Link In</em>'.
	 * @generated
	 */
	A664VirtualLinkIn createA664VirtualLinkIn();

	/**
	 * Returns a new object of class '<em>A664 Virtual Link Out</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>A664 Virtual Link Out</em>'.
	 * @generated
	 */
	A664VirtualLinkOut createA664VirtualLinkOut();

	/**
	 * Returns a new object of class '<em>A664 Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>A664 Message</em>'.
	 * @generated
	 */
	A664Message createA664Message();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Arinc664Package getArinc664Package();

} //Arinc664Factory
