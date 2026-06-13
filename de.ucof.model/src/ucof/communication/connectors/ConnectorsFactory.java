/**
 */
package ucof.communication.connectors;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ucof.communication.connectors.ConnectorsPackage
 * @generated
 */
public interface ConnectorsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConnectorsFactory eINSTANCE = ucof.communication.connectors.impl.ConnectorsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Connectors</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connectors</em>'.
	 * @generated
	 */
	Connectors createConnectors();

	/**
	 * Returns a new object of class '<em>Connector Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector Group</em>'.
	 * @generated
	 */
	ConnectorGroup createConnectorGroup();

	/**
	 * Returns a new object of class '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector</em>'.
	 * @generated
	 */
	Connector createConnector();

	/**
	 * Returns a new object of class '<em>Connection Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Pin</em>'.
	 * @generated
	 */
	ConnectionPin createConnectionPin();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConnectorsPackage getConnectorsPackage();

} //ConnectorsFactory
