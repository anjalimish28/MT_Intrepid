/**
 */
package targets.sheild;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see targets.sheild.SheildPackage
 * @generated
 */
public interface SheildFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SheildFactory eINSTANCE = targets.sheild.impl.SheildFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>arduinosheild</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>arduinosheild</em>'.
	 * @generated
	 */
	arduinosheild createarduinosheild();

	/**
	 * Returns a new object of class '<em>sheild Ports</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>sheild Ports</em>'.
	 * @generated
	 */
	sheildPorts createsheildPorts();

	/**
	 * Returns a new object of class '<em>sheild Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>sheild Port</em>'.
	 * @generated
	 */
	sheildPort createsheildPort();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SheildPackage getSheildPackage();

} //SheildFactory
