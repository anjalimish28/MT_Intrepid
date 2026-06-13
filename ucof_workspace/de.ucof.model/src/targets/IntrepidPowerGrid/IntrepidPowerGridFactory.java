/**
 */
package targets.intrepidpowergrid;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see targets.intrepidpowergrid.IntrepidpowergridPackage
 * @generated
 */
public interface IntrepidpowergridFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntrepidpowergridFactory eINSTANCE = targets.intrepidpowergrid.impl.IntrepidpowergridFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>intrepid Electrical Grid</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>intrepid Electrical Grid</em>'.
	 * @generated
	 */
	intrepidElectricalGrid createintrepidElectricalGrid();

	/**
	 * Returns a new object of class '<em>intrepid Electrical Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>intrepid Electrical Interface</em>'.
	 * @generated
	 */
	intrepidElectricalInterface createintrepidElectricalInterface();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IntrepidpowergridPackage getIntrepidpowergridPackage();

} //IntrepidpowergridFactory
