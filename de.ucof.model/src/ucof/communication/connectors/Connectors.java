/**
 */
package ucof.communication.connectors;

import org.eclipse.emf.common.util.EList;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connectors</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.connectors.Connectors#getConnectorGroup <em>Connector Group</em>}</li>
 * </ul>
 *
 * @see ucof.communication.connectors.ConnectorsPackage#getConnectors()
 * @model
 * @generated
 */
public interface Connectors extends SuperTrackingType, SuperIdentifierType {
	/**
	 * Returns the value of the '<em><b>Connector Group</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.communication.connectors.ConnectorGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Group</em>' containment reference list.
	 * @see ucof.communication.connectors.ConnectorsPackage#getConnectors_ConnectorGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConnectorGroup> getConnectorGroup();

} // Connectors
