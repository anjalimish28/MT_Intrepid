/**
 */
package targets.matlab;

import org.eclipse.emf.common.util.EList;

import targets.SuperTargetType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simulink Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.matlab.SimulinkProject#getSimulinkBlock <em>Simulink Block</em>}</li>
 *   <li>{@link targets.matlab.SimulinkProject#getSimulinkLibrary <em>Simulink Library</em>}</li>
 *   <li>{@link targets.matlab.SimulinkProject#getSampleTime <em>Sample Time</em>}</li>
 * </ul>
 *
 * @see targets.matlab.MatlabPackage#getSimulinkProject()
 * @model
 * @generated
 */
public interface SimulinkProject extends SuperTargetType {
	/**
	 * Returns the value of the '<em><b>Simulink Block</b></em>' containment reference list.
	 * The list contents are of type {@link targets.matlab.SimulinkBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulink Block</em>' containment reference list.
	 * @see targets.matlab.MatlabPackage#getSimulinkProject_SimulinkBlock()
	 * @model containment="true"
	 * @generated
	 */
	EList<SimulinkBlock> getSimulinkBlock();

	/**
	 * Returns the value of the '<em><b>Simulink Library</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulink Library</em>' containment reference.
	 * @see #setSimulinkLibrary(SimulinkLibrary)
	 * @see targets.matlab.MatlabPackage#getSimulinkProject_SimulinkLibrary()
	 * @model containment="true"
	 * @generated
	 */
	SimulinkLibrary getSimulinkLibrary();

	/**
	 * Sets the value of the '{@link targets.matlab.SimulinkProject#getSimulinkLibrary <em>Simulink Library</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simulink Library</em>' containment reference.
	 * @see #getSimulinkLibrary()
	 * @generated
	 */
	void setSimulinkLibrary(SimulinkLibrary value);

	/**
	 * Returns the value of the '<em><b>Sample Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sample Time</em>' attribute.
	 * @see #setSampleTime(float)
	 * @see targets.matlab.MatlabPackage#getSimulinkProject_SampleTime()
	 * @model
	 * @generated
	 */
	float getSampleTime();

	/**
	 * Sets the value of the '{@link targets.matlab.SimulinkProject#getSampleTime <em>Sample Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sample Time</em>' attribute.
	 * @see #getSampleTime()
	 * @generated
	 */
	void setSampleTime(float value);

} // SimulinkProject
