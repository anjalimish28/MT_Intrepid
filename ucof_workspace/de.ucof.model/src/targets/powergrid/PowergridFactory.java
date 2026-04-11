/**
 */
package targets.powergrid;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see targets.powergrid.PowergridPackage
 * @generated
 */
public interface PowergridFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PowergridFactory eINSTANCE = targets.powergrid.impl.PowergridFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Eletrcial Interfaces</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eletrcial Interfaces</em>'.
	 * @generated
	 */
	EletrcialInterfaces createEletrcialInterfaces();

	/**
	 * Returns a new object of class '<em>Power Connection Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Power Connection Set</em>'.
	 * @generated
	 */
	PowerConnectionSet createPowerConnectionSet();

	/**
	 * Returns a new object of class '<em>Power Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Power Connection</em>'.
	 * @generated
	 */
	PowerConnection createPowerConnection();

	/**
	 * Returns a new object of class '<em>Electrical Power Grid Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Electrical Power Grid Set</em>'.
	 * @generated
	 */
	ElectricalPowerGridSet createElectricalPowerGridSet();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PowergridPackage getPowergridPackage();

} //PowergridFactory
