/**
 */
package targets.configdesk.ethernet;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see targets.configdesk.ethernet.EthernetPackage
 * @generated
 */
public interface EthernetFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EthernetFactory eINSTANCE = targets.configdesk.ethernet.impl.EthernetFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>ETH Setup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ETH Setup</em>'.
	 * @generated
	 */
	ETHSetup createETHSetup();

	/**
	 * Returns a new object of class '<em>UDPTX</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UDPTX</em>'.
	 * @generated
	 */
	UDPTX createUDPTX();

	/**
	 * Returns a new object of class '<em>UDPRX</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UDPRX</em>'.
	 * @generated
	 */
	UDPRX createUDPRX();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EthernetPackage getEthernetPackage();

} //EthernetFactory
