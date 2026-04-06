/**
 */
package ucof.communication.basedonethernet;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ucof.communication.basedonethernet.BasedonethernetPackage
 * @generated
 */
public interface BasedonethernetFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasedonethernetFactory eINSTANCE = ucof.communication.basedonethernet.impl.BasedonethernetFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ethernet Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ethernet Port</em>'.
	 * @generated
	 */
	EthernetPort createEthernetPort();

	/**
	 * Returns a new object of class '<em>Ethernet TX</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ethernet TX</em>'.
	 * @generated
	 */
	EthernetTX createEthernetTX();

	/**
	 * Returns a new object of class '<em>Ethernet RX</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ethernet RX</em>'.
	 * @generated
	 */
	EthernetRX createEthernetRX();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BasedonethernetPackage getBasedonethernetPackage();

} //BasedonethernetFactory
