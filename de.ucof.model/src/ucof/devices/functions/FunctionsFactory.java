/**
 */
package ucof.devices.functions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ucof.devices.functions.FunctionsPackage
 * @generated
 */
public interface FunctionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FunctionsFactory eINSTANCE = ucof.devices.functions.impl.FunctionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Device Functions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Functions</em>'.
	 * @generated
	 */
	DeviceFunctions createDeviceFunctions();

	/**
	 * Returns a new object of class '<em>Function Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Link</em>'.
	 * @generated
	 */
	FunctionLink createFunctionLink();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FunctionsPackage getFunctionsPackage();

} //FunctionsFactory
