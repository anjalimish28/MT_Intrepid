/**
 */
package targets.avip;

import targets.SuperClassExtensionType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.avip.SignalExtension#getFunction <em>Function</em>}</li>
 *   <li>{@link targets.avip.SignalExtension#getAssociatedLineName <em>Associated Line Name</em>}</li>
 * </ul>
 *
 * @see targets.avip.AvipPackage#getSignalExtension()
 * @model
 * @generated
 */
public interface SignalExtension extends SuperClassExtensionType {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see #setFunction(String)
	 * @see targets.avip.AvipPackage#getSignalExtension_Function()
	 * @model
	 * @generated
	 */
	String getFunction();

	/**
	 * Sets the value of the '{@link targets.avip.SignalExtension#getFunction <em>Function</em>}' attribute.
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
	 * @see targets.avip.AvipPackage#getSignalExtension_AssociatedLineName()
	 * @model
	 * @generated
	 */
	String getAssociatedLineName();

	/**
	 * Sets the value of the '{@link targets.avip.SignalExtension#getAssociatedLineName <em>Associated Line Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associated Line Name</em>' attribute.
	 * @see #getAssociatedLineName()
	 * @generated
	 */
	void setAssociatedLineName(String value);

} // SignalExtension
