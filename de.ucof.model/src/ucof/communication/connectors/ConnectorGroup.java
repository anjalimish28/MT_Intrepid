/**
 */
package ucof.communication.connectors;

import org.eclipse.emf.common.util.EList;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.connectors.ConnectorGroup#getConnector <em>Connector</em>}</li>
 * </ul>
 *
 * @see ucof.communication.connectors.ConnectorsPackage#getConnectorGroup()
 * @model
 * @generated
 */
public interface ConnectorGroup extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Connector</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.communication.connectors.Connector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' containment reference list.
	 * @see ucof.communication.connectors.ConnectorsPackage#getConnectorGroup_Connector()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connector> getConnector();

} // ConnectorGroup
