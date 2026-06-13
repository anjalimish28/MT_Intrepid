/**
 */
package targets.hallsensor;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see targets.hallsensor.HallsensorPackage
 * @generated
 */
public interface HallsensorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HallsensorFactory eINSTANCE = targets.hallsensor.impl.HallsensorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>mts360</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>mts360</em>'.
	 * @generated
	 */
	mts360 createmts360();

	/**
	 * Returns a new object of class '<em>hall Ports</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>hall Ports</em>'.
	 * @generated
	 */
	hallPorts createhallPorts();

	/**
	 * Returns a new object of class '<em>hall Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>hall Port</em>'.
	 * @generated
	 */
	hallPort createhallPort();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HallsensorPackage getHallsensorPackage();

} //HallsensorFactory
