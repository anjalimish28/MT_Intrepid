/**
 */
package ucof.devices.devicetypes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ucof.devices.devicetypes.DevicetypesPackage
 * @generated
 */
public interface DevicetypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DevicetypesFactory eINSTANCE = ucof.devices.devicetypes.impl.DevicetypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>A653P1 Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>A653P1 Module</em>'.
	 * @generated
	 */
	A653P1Module createA653P1Module();

	/**
	 * Returns a new object of class '<em>A653P4 Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>A653P4 Module</em>'.
	 * @generated
	 */
	A653P4Module createA653P4Module();

	/**
	 * Returns a new object of class '<em>IO Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IO Module</em>'.
	 * @generated
	 */
	IOModule createIOModule();

	/**
	 * Returns a new object of class '<em>Peripheral</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Peripheral</em>'.
	 * @generated
	 */
	Peripheral createPeripheral();

	/**
	 * Returns a new object of class '<em>A664 Switch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>A664 Switch</em>'.
	 * @generated
	 */
	A664Switch createA664Switch();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DevicetypesPackage getDevicetypesPackage();

} //DevicetypesFactory
