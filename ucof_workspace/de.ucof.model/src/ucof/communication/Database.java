/**
 */
package ucof.communication;

import org.eclipse.emf.common.util.EList;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contains all information regarding interfaces, messages, paylaods and signals
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.Database#getCommunicationSet <em>Communication Set</em>}</li>
 * </ul>
 *
 * @see ucof.communication.CommunicationPackage#getDatabase()
 * @model
 * @generated
 */
public interface Database extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Communication Set</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.communication.CommunicationSetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Set</em>' containment reference list.
	 * @see ucof.communication.CommunicationPackage#getDatabase_CommunicationSet()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommunicationSetType> getCommunicationSet();

} // Database
