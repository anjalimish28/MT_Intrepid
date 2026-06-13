/**
 */
package targets.avip;

import ucof.communication.Signal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.avip.FunctionSignal#getFunction <em>Function</em>}</li>
 *   <li>{@link targets.avip.FunctionSignal#getAssociatedLineName <em>Associated Line Name</em>}</li>
 * </ul>
 *
 * @see targets.avip.AvipPackage#getFunctionSignal()
 * @model
 * @generated
 */
public interface FunctionSignal extends Signal {

	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see #setFunction(String)
	 * @see targets.avip.AvipPackage#getFunctionSignal_Function()
	 * @model
	 * @generated
	 */
	String getFunction();

	/**
	 * Sets the value of the '{@link targets.avip.FunctionSignal#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(String value);

	/**
	 * Returns the value of the '<em><b>Associated Line Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated Line Name</em>' attribute.
	 * @see #setAssociatedLineName(String)
	 * @see targets.avip.AvipPackage#getFunctionSignal_AssociatedLineName()
	 * @model
	 * @generated
	 */
	String getAssociatedLineName();

	/**
	 * Sets the value of the '{@link targets.avip.FunctionSignal#getAssociatedLineName <em>Associated Line Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associated Line Name</em>' attribute.
	 * @see #getAssociatedLineName()
	 * @generated
	 */
	void setAssociatedLineName(String value);
} // FunctionSignal
