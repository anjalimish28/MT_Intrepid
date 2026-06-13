/**
 */
package targets.cpn;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see targets.cpn.CpnPackage
 * @generated
 */
public interface CpnFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CpnFactory eINSTANCE = targets.cpn.impl.CpnFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>va41620peb1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>va41620peb1</em>'.
	 * @generated
	 */
	va41620peb1 createva41620peb1();

	/**
	 * Returns a new object of class '<em>vorago Ports</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>vorago Ports</em>'.
	 * @generated
	 */
	voragoPorts createvoragoPorts();

	/**
	 * Returns a new object of class '<em>vorago Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>vorago Port</em>'.
	 * @generated
	 */
	voragoPort createvoragoPort();

	/**
	 * Returns a new object of class '<em>Can Driver Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Can Driver Config</em>'.
	 * @generated
	 */
	CanDriverConfig createCanDriverConfig();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CpnPackage getCpnPackage();

} //CpnFactory
