/**
 */
package ucof.devices.ports;

import ucof.common.enums.PortDirectionType;
import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super Port Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Super port type, used for all port elements
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.ports.SuperPortType#getMaxMessageSize <em>Max Message Size</em>}</li>
 *   <li>{@link ucof.devices.ports.SuperPortType#getPortDirection <em>Port Direction</em>}</li>
 * </ul>
 *
 * @see ucof.devices.ports.PortsPackage#getSuperPortType()
 * @model abstract="true"
 * @generated
 */
public interface SuperPortType extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Max Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum message size for the port in bytes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Message Size</em>' attribute.
	 * @see #setMaxMessageSize(String)
	 * @see ucof.devices.ports.PortsPackage#getSuperPortType_MaxMessageSize()
	 * @model dataType="ucof.common.edata.DecOrHexValueType"
	 * @generated
	 */
	String getMaxMessageSize();

	/**
	 * Sets the value of the '{@link ucof.devices.ports.SuperPortType#getMaxMessageSize <em>Max Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Message Size</em>' attribute.
	 * @see #getMaxMessageSize()
	 * @generated
	 */
	void setMaxMessageSize(String value);

	/**
	 * Returns the value of the '<em><b>Port Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.PortDirectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The direction of informationflow from/to port
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Direction</em>' attribute.
	 * @see ucof.common.enums.PortDirectionType
	 * @see #setPortDirection(PortDirectionType)
	 * @see ucof.devices.ports.PortsPackage#getSuperPortType_PortDirection()
	 * @model
	 * @generated
	 */
	PortDirectionType getPortDirection();

	/**
	 * Sets the value of the '{@link ucof.devices.ports.SuperPortType#getPortDirection <em>Port Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Direction</em>' attribute.
	 * @see ucof.common.enums.PortDirectionType
	 * @see #getPortDirection()
	 * @generated
	 */
	void setPortDirection(PortDirectionType value);

} // SuperPortType
