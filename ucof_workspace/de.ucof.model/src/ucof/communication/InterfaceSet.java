/**
 */
package ucof.communication;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contains interface information
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.InterfaceSet#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see ucof.communication.CommunicationPackage#getInterfaceSet()
 * @model extendedMetaData="kind='elementOnly' name='Connections'"
 * @generated
 */
public interface InterfaceSet extends CommunicationSetType {
	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.communication.SuperCommunicationInterfaceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference list.
	 * @see ucof.communication.CommunicationPackage#getInterfaceSet_Interface()
	 * @model containment="true"
	 * @generated
	 */
	EList<SuperCommunicationInterfaceType> getInterface();

} // InterfaceSet
