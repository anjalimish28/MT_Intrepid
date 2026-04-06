/**
 */
package ucof.communication;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payload Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.PayloadSet#getPayload <em>Payload</em>}</li>
 * </ul>
 *
 * @see ucof.communication.CommunicationPackage#getPayloadSet()
 * @model
 * @generated
 */
public interface PayloadSet extends CommunicationSetType {
	/**
	 * Returns the value of the '<em><b>Payload</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.communication.Payload}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payload</em>' containment reference list.
	 * @see ucof.communication.CommunicationPackage#getPayloadSet_Payload()
	 * @model containment="true"
	 * @generated
	 */
	EList<Payload> getPayload();

} // PayloadSet
