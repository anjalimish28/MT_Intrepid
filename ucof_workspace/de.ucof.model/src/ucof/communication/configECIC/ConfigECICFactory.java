/**
 */
package ucof.communication.configECIC;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ucof.communication.configECIC.ConfigECICPackage
 * @generated
 */
public interface ConfigECICFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigECICFactory eINSTANCE = ucof.communication.configECIC.impl.ConfigECICFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>ED247 Configurations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ED247 Configurations</em>'.
	 * @generated
	 */
	ED247Configurations createED247Configurations();

	/**
	 * Returns a new object of class '<em>ED247 Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ED247 Configuration</em>'.
	 * @generated
	 */
	ED247Configuration createED247Configuration();

	/**
	 * Returns a new object of class '<em>File Producer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Producer</em>'.
	 * @generated
	 */
	FileProducer createFileProducer();

	/**
	 * Returns a new object of class '<em>Channels</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Channels</em>'.
	 * @generated
	 */
	Channels createChannels();

	/**
	 * Returns a new object of class '<em>Channel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Channel</em>'.
	 * @generated
	 */
	Channel createChannel();

	/**
	 * Returns a new object of class '<em>Com Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Com Interface</em>'.
	 * @generated
	 */
	ComInterface createComInterface();

	/**
	 * Returns a new object of class '<em>UDP Sockets</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UDP Sockets</em>'.
	 * @generated
	 */
	UDPSockets createUDPSockets();

	/**
	 * Returns a new object of class '<em>UDP Socket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UDP Socket</em>'.
	 * @generated
	 */
	UDPSocket createUDPSocket();

	/**
	 * Returns a new object of class '<em>src Direction Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>src Direction Extension</em>'.
	 * @generated
	 */
	srcDirectionExtension createsrcDirectionExtension();

	/**
	 * Returns a new object of class '<em>Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Header</em>'.
	 * @generated
	 */
	Header createHeader();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConfigECICPackage getConfigECICPackage();

} //ConfigECICFactory
