/**
 */
package ucof.assignments.database;

import ucof.assignments.SuperAssignmentType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal To Target Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.assignments.database.SignalToTargetAssignment#getStartBit <em>Start Bit</em>}</li>
 *   <li>{@link ucof.assignments.database.SignalToTargetAssignment#getAssignmentTargetType <em>Assignment Target Type</em>}</li>
 *   <li>{@link ucof.assignments.database.SignalToTargetAssignment#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 *
 * @see ucof.assignments.database.DatabasePackage#getSignalToTargetAssignment()
 * @model
 * @generated
 */
public interface SignalToTargetAssignment extends SuperAssignmentType {
	/**
	 * Returns the value of the '<em><b>Start Bit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Bit</em>' attribute.
	 * @see #setStartBit(int)
	 * @see ucof.assignments.database.DatabasePackage#getSignalToTargetAssignment_StartBit()
	 * @model
	 * @generated
	 */
	int getStartBit();

	/**
	 * Sets the value of the '{@link ucof.assignments.database.SignalToTargetAssignment#getStartBit <em>Start Bit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Bit</em>' attribute.
	 * @see #getStartBit()
	 * @generated
	 */
	void setStartBit(int value);

	/**
	 * Returns the value of the '<em><b>Assignment Target Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.assignments.database.signalTargets}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment Target Type</em>' attribute.
	 * @see ucof.assignments.database.signalTargets
	 * @see #setAssignmentTargetType(signalTargets)
	 * @see ucof.assignments.database.DatabasePackage#getSignalToTargetAssignment_AssignmentTargetType()
	 * @model
	 * @generated
	 */
	signalTargets getAssignmentTargetType();

	/**
	 * Sets the value of the '{@link ucof.assignments.database.SignalToTargetAssignment#getAssignmentTargetType <em>Assignment Target Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignment Target Type</em>' attribute.
	 * @see ucof.assignments.database.signalTargets
	 * @see #getAssignmentTargetType()
	 * @generated
	 */
	void setAssignmentTargetType(signalTargets value);

	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute.
	 * @see #setInitialValue(float)
	 * @see ucof.assignments.database.DatabasePackage#getSignalToTargetAssignment_InitialValue()
	 * @model
	 * @generated
	 */
	float getInitialValue();

	/**
	 * Sets the value of the '{@link ucof.assignments.database.SignalToTargetAssignment#getInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(float value);

} // SignalToTargetAssignment
