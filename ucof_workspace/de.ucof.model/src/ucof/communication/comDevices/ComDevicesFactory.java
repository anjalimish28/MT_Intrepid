/**
 */
package ucof.communication.comDevices;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ucof.communication.comDevices.ComDevicesPackage
 * @generated
 */
public interface ComDevicesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComDevicesFactory eINSTANCE = ucof.communication.comDevices.impl.ComDevicesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Communication Devices</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Devices</em>'.
	 * @generated
	 */
	CommunicationDevices createCommunicationDevices();

	/**
	 * Returns a new object of class '<em>ED247 Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ED247 Gateway</em>'.
	 * @generated
	 */
	ED247Gateway createED247Gateway();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComDevicesPackage getComDevicesPackage();

} //ComDevicesFactory
