/**
 */
package ucof.assignments;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ucof.assignments.AssignmentsPackage
 * @generated
 */
public interface AssignmentsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AssignmentsFactory eINSTANCE = ucof.assignments.impl.AssignmentsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Assignments</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignments</em>'.
	 * @generated
	 */
	Assignments createAssignments();

	/**
	 * Returns a new object of class '<em>Interface To Port2 Port Assignment Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface To Port2 Port Assignment Set</em>'.
	 * @generated
	 */
	InterfaceToPort2PortAssignmentSet createInterfaceToPort2PortAssignmentSet();

	/**
	 * Returns a new object of class '<em>Interface To Port2 Port Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface To Port2 Port Assignment</em>'.
	 * @generated
	 */
	InterfaceToPort2PortAssignment createInterfaceToPort2PortAssignment();

	/**
	 * Returns a new object of class '<em>Device To Implementation Assignment Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device To Implementation Assignment Set</em>'.
	 * @generated
	 */
	DeviceToImplementationAssignmentSet createDeviceToImplementationAssignmentSet();

	/**
	 * Returns a new object of class '<em>Device To Implementation Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device To Implementation Assignment</em>'.
	 * @generated
	 */
	DeviceToImplementationAssignment createDeviceToImplementationAssignment();

	/**
	 * Returns a new object of class '<em>Interface To Hardware Assignment Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface To Hardware Assignment Set</em>'.
	 * @generated
	 */
	InterfaceToHardwareAssignmentSet createInterfaceToHardwareAssignmentSet();

	/**
	 * Returns a new object of class '<em>Interface To Hardware Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface To Hardware Assignment</em>'.
	 * @generated
	 */
	InterfaceToHardwareAssignment createInterfaceToHardwareAssignment();

	/**
	 * Returns a new object of class '<em>Port To Port Assignment Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port To Port Assignment Set</em>'.
	 * @generated
	 */
	PortToPortAssignmentSet createPortToPortAssignmentSet();

	/**
	 * Returns a new object of class '<em>Port To Port Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port To Port Assignment</em>'.
	 * @generated
	 */
	PortToPortAssignment createPortToPortAssignment();

	/**
	 * Returns a new object of class '<em>ED247 Assignment Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ED247 Assignment Set</em>'.
	 * @generated
	 */
	ED247AssignmentSet createED247AssignmentSet();

	/**
	 * Returns a new object of class '<em>ED247 Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ED247 Assignment</em>'.
	 * @generated
	 */
	ED247Assignment createED247Assignment();

	/**
	 * Returns a new object of class '<em>UDP Socket Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UDP Socket Extension</em>'.
	 * @generated
	 */
	UDPSocketExtension createUDPSocketExtension();

	/**
	 * Returns a new object of class '<em>SW Port To HW Port Assignment Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SW Port To HW Port Assignment Set</em>'.
	 * @generated
	 */
	SWPortToHWPortAssignmentSet createSWPortToHWPortAssignmentSet();

	/**
	 * Returns a new object of class '<em>SW Port To HW Port Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SW Port To HW Port Assignment</em>'.
	 * @generated
	 */
	SWPortToHWPortAssignment createSWPortToHWPortAssignment();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AssignmentsPackage getAssignmentsPackage();

} //AssignmentsFactory
