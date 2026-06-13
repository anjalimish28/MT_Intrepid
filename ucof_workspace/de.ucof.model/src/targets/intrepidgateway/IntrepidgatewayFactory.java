/**
 */
package targets.intrepidgateway;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see targets.intrepidgateway.IntrepidgatewayPackage
 * @generated
 */
public interface IntrepidgatewayFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntrepidgatewayFactory eINSTANCE = targets.intrepidgateway.impl.IntrepidgatewayFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Msg Box Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Msg Box Extension</em>'.
	 * @generated
	 */
	MsgBoxExtension createMsgBoxExtension();

	/**
	 * Returns a new object of class '<em>Can Mailbox Address Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Can Mailbox Address Filter</em>'.
	 * @generated
	 */
	CanMailboxAddressFilter createCanMailboxAddressFilter();

	/**
	 * Returns a new object of class '<em>Can Mailbox Out Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Can Mailbox Out Slot</em>'.
	 * @generated
	 */
	CanMailboxOutSlot createCanMailboxOutSlot();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IntrepidgatewayPackage getIntrepidgatewayPackage();

} //IntrepidgatewayFactory
