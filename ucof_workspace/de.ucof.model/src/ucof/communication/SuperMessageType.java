/**
 */
package ucof.communication;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super Message Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Super type for all messages, independent of interfaces >> message transports a payload, which contains signal >> message is whole frame, including header etc.
 * <!-- end-model-doc -->
 *
 *
 * @see ucof.communication.CommunicationPackage#getSuperMessageType()
 * @model abstract="true"
 *        extendedMetaData="kind='elementOnly' name='MESSAGE'"
 * @generated
 */
public interface SuperMessageType extends SuperIdentifierType, SuperTrackingType {
} // SuperMessageType
