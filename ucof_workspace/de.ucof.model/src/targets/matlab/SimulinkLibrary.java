/**
 */
package targets.matlab;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simulink Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.matlab.SimulinkLibrary#getLibraryLink <em>Library Link</em>}</li>
 * </ul>
 *
 * @see targets.matlab.MatlabPackage#getSimulinkLibrary()
 * @model
 * @generated
 */
public interface SimulinkLibrary extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Library Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library Link</em>' attribute.
	 * @see #setLibraryLink(String)
	 * @see targets.matlab.MatlabPackage#getSimulinkLibrary_LibraryLink()
	 * @model
	 * @generated
	 */
	String getLibraryLink();

	/**
	 * Sets the value of the '{@link targets.matlab.SimulinkLibrary#getLibraryLink <em>Library Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library Link</em>' attribute.
	 * @see #getLibraryLink()
	 * @generated
	 */
	void setLibraryLink(String value);

} // SimulinkLibrary
