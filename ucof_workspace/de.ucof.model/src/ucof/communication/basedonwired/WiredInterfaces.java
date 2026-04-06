/**
 */
package ucof.communication.basedonwired;

import org.eclipse.emf.common.util.EList;

import ucof.communication.SuperCommunicationInterfaceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wired Interfaces</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.basedonwired.WiredInterfaces#getWiredInterface <em>Wired Interface</em>}</li>
 * </ul>
 *
 * @see ucof.communication.basedonwired.BasedonwiredPackage#getWiredInterfaces()
 * @model
 * @generated
 */
public interface WiredInterfaces extends SuperCommunicationInterfaceType {
	/**
	 * Returns the value of the '<em><b>Wired Interface</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.communication.basedonwired.WiredSuper}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wired Interface</em>' containment reference list.
	 * @see ucof.communication.basedonwired.BasedonwiredPackage#getWiredInterfaces_WiredInterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<WiredSuper> getWiredInterface();

} // WiredInterfaces
