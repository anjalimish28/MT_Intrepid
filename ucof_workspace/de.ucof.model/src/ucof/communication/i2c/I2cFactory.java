/**
 */
package ucof.communication.i2c;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ucof.communication.i2c.I2cPackage
 * @generated
 */
public interface I2cFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	I2cFactory eINSTANCE = ucof.communication.i2c.impl.I2cFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>I2C Bus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>I2C Bus</em>'.
	 * @generated
	 */
	I2CBus createI2CBus();

	/**
	 * Returns a new object of class '<em>I2C Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>I2C Message</em>'.
	 * @generated
	 */
	I2CMessage createI2CMessage();

	/**
	 * Returns a new object of class '<em>I2C Register Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>I2C Register Specification</em>'.
	 * @generated
	 */
	I2CRegisterSpecification createI2CRegisterSpecification();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	I2cPackage getI2cPackage();

} //I2cFactory
