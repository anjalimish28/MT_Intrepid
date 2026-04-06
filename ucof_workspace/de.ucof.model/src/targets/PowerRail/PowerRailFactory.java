/**
 */
package targets.PowerRail;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see targets.PowerRail.PowerRailPackage
 * @generated
 */
public interface PowerRailFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PowerRailFactory eINSTANCE = targets.PowerRail.impl.PowerRailFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>power Rail Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>power Rail Target</em>'.
	 * @generated
	 */
	powerRailTarget createpowerRailTarget();

	/**
	 * Returns a new object of class '<em>power Rail Ports</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>power Rail Ports</em>'.
	 * @generated
	 */
	powerRailPorts createpowerRailPorts();

	/**
	 * Returns a new object of class '<em>power Rail Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>power Rail Port</em>'.
	 * @generated
	 */
	powerRailPort createpowerRailPort();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PowerRailPackage getPowerRailPackage();

} //PowerRailFactory
