/**
 */
package targets.matlab;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see targets.matlab.MatlabPackage
 * @generated
 */
public interface MatlabFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MatlabFactory eINSTANCE = targets.matlab.impl.MatlabFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Simulink Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simulink Project</em>'.
	 * @generated
	 */
	SimulinkProject createSimulinkProject();

	/**
	 * Returns a new object of class '<em>Simulink Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simulink Block</em>'.
	 * @generated
	 */
	SimulinkBlock createSimulinkBlock();

	/**
	 * Returns a new object of class '<em>Simulink Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simulink Library</em>'.
	 * @generated
	 */
	SimulinkLibrary createSimulinkLibrary();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MatlabPackage getMatlabPackage();

} //MatlabFactory
