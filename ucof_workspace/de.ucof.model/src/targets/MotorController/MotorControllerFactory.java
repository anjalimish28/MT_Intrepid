/**
 */
package targets.motorcontroller;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see targets.motorcontroller.MotorcontrollerPackage
 * @generated
 */
public interface MotorcontrollerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MotorcontrollerFactory eINSTANCE = targets.motorcontroller.impl.MotorcontrollerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>escon409510</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>escon409510</em>'.
	 * @generated
	 */
	escon409510 createescon409510();

	/**
	 * Returns a new object of class '<em>escon Ports</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>escon Ports</em>'.
	 * @generated
	 */
	esconPorts createesconPorts();

	/**
	 * Returns a new object of class '<em>escon Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>escon Port</em>'.
	 * @generated
	 */
	esconPort createesconPort();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MotorcontrollerPackage getMotorcontrollerPackage();

} //MotorcontrollerFactory
