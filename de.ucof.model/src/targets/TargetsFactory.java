/**
 */
package targets;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see targets.TargetsPackage
 * @generated
 */
public interface TargetsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TargetsFactory eINSTANCE = targets.impl.TargetsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Targets</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Targets</em>'.
	 * @generated
	 */
	Targets createTargets();

	/**
	 * Returns a new object of class '<em>Attribute Datatype Conversion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Datatype Conversion</em>'.
	 * @generated
	 */
	AttributeDatatypeConversion createAttributeDatatypeConversion();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TargetsPackage getTargetsPackage();

} //TargetsFactory
