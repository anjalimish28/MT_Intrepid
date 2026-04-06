/**
 */
package targets.RDC;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see targets.RDC.RDCPackage
 * @generated
 */
public interface RDCFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RDCFactory eINSTANCE = targets.RDC.impl.RDCFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>stm32f446re</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>stm32f446re</em>'.
	 * @generated
	 */
	stm32f446re createstm32f446re();

	/**
	 * Returns a new object of class '<em>stm Ports</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>stm Ports</em>'.
	 * @generated
	 */
	stmPorts createstmPorts();

	/**
	 * Returns a new object of class '<em>stm Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>stm Port</em>'.
	 * @generated
	 */
	stmPort createstmPort();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RDCPackage getRDCPackage();

} //RDCFactory
