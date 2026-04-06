/**
 */
package ucof.assignments.database;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ucof.assignments.database.DatabasePackage
 * @generated
 */
public interface DatabaseFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatabaseFactory eINSTANCE = ucof.assignments.database.impl.DatabaseFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Signal To Target Assignment Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal To Target Assignment Set</em>'.
	 * @generated
	 */
	SignalToTargetAssignmentSet createSignalToTargetAssignmentSet();

	/**
	 * Returns a new object of class '<em>Signal To Target Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal To Target Assignment</em>'.
	 * @generated
	 */
	SignalToTargetAssignment createSignalToTargetAssignment();

	/**
	 * Returns a new object of class '<em>Payload To Target Assignment Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payload To Target Assignment Set</em>'.
	 * @generated
	 */
	PayloadToTargetAssignmentSet createPayloadToTargetAssignmentSet();

	/**
	 * Returns a new object of class '<em>Payload To Target Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payload To Target Assignment</em>'.
	 * @generated
	 */
	PayloadToTargetAssignment createPayloadToTargetAssignment();

	/**
	 * Returns a new object of class '<em>Message To Target Assignment Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message To Target Assignment Set</em>'.
	 * @generated
	 */
	MessageToTargetAssignmentSet createMessageToTargetAssignmentSet();

	/**
	 * Returns a new object of class '<em>Message To Target Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message To Target Assignment</em>'.
	 * @generated
	 */
	MessageToTargetAssignment createMessageToTargetAssignment();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DatabasePackage getDatabasePackage();

} //DatabaseFactory
