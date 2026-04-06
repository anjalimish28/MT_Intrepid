/**
 */
package ucof.communication;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.MessageSet#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see ucof.communication.CommunicationPackage#getMessageSet()
 * @model extendedMetaData="kind='elementOnly' name='Messages'"
 * @generated
 */
public interface MessageSet extends CommunicationSetType {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.communication.SuperMessageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' containment reference list.
	 * @see ucof.communication.CommunicationPackage#getMessageSet_Message()
	 * @model containment="true"
	 * @generated
	 */
	EList<SuperMessageType> getMessage();

} // MessageSet
