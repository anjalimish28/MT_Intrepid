/**
 */
package ucof.communication.configECIC;

import org.eclipse.emf.common.util.EList;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channels</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.Channels#getChannel <em>Channel</em>}</li>
 * </ul>
 *
 * @see ucof.communication.configECIC.ConfigECICPackage#getChannels()
 * @model
 * @generated
 */
public interface Channels extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Channel</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.communication.configECIC.Channel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel</em>' containment reference list.
	 * @see ucof.communication.configECIC.ConfigECICPackage#getChannels_Channel()
	 * @model containment="true"
	 * @generated
	 */
	EList<Channel> getChannel();

} // Channels
