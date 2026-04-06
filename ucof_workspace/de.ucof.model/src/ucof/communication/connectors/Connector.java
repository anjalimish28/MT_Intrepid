/**
 */
package ucof.communication.connectors;

import org.eclipse.emf.common.util.EList;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.connectors.Connector#getConnectorType <em>Connector Type</em>}</li>
 *   <li>{@link ucof.communication.connectors.Connector#getLineType <em>Line Type</em>}</li>
 *   <li>{@link ucof.communication.connectors.Connector#getConnectionPin <em>Connection Pin</em>}</li>
 * </ul>
 *
 * @see ucof.communication.connectors.ConnectorsPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Connector Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Type</em>' attribute.
	 * @see #setConnectorType(String)
	 * @see ucof.communication.connectors.ConnectorsPackage#getConnector_ConnectorType()
	 * @model
	 * @generated
	 */
	String getConnectorType();

	/**
	 * Sets the value of the '{@link ucof.communication.connectors.Connector#getConnectorType <em>Connector Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector Type</em>' attribute.
	 * @see #getConnectorType()
	 * @generated
	 */
	void setConnectorType(String value);

	/**
	 * Returns the value of the '<em><b>Line Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.communication.connectors.LineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Type</em>' attribute.
	 * @see ucof.communication.connectors.LineType
	 * @see #setLineType(LineType)
	 * @see ucof.communication.connectors.ConnectorsPackage#getConnector_LineType()
	 * @model
	 * @generated
	 */
	LineType getLineType();

	/**
	 * Sets the value of the '{@link ucof.communication.connectors.Connector#getLineType <em>Line Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Type</em>' attribute.
	 * @see ucof.communication.connectors.LineType
	 * @see #getLineType()
	 * @generated
	 */
	void setLineType(LineType value);

	/**
	 * Returns the value of the '<em><b>Connection Pin</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.communication.connectors.ConnectionPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Pin</em>' containment reference list.
	 * @see ucof.communication.connectors.ConnectorsPackage#getConnector_ConnectionPin()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConnectionPin> getConnectionPin();

} // Connector
