/**
 */
package ucof.common.etypes;

import ucof.common.enums.PortDirectionType;

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
 *   <li>{@link ucof.common.etypes.SuperPortType#getMaxMessageSize <em>Max Message Size</em>}</li>
 *   <li>{@link ucof.common.etypes.SuperPortType#getPortDirection <em>Port Direction</em>}</li>
 * </ul>
 *
 * @see ucof.common.etypes.EtypesPackage#getSuperPortType()
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
	 * @see ucof.common.etypes.EtypesPackage#getSuperPortType_MaxMessageSize()
	 * @model dataType="ucof.common.edata.DecOrHexValueType"
	 * @generated
	 */
	String getMaxMessageSize();

	/**
	 * Sets the value of the '{@link ucof.common.etypes.SuperPortType#getMaxMessageSize <em>Max Message Size</em>}' attribute.
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
	 * @see ucof.common.etypes.EtypesPackage#getSuperPortType_PortDirection()
	 * @model
	 * @generated
	 */
	PortDirectionType getPortDirection();

	/**
	 * Sets the value of the '{@link ucof.common.etypes.SuperPortType#getPortDirection <em>Port Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Direction</em>' attribute.
	 * @see ucof.common.enums.PortDirectionType
	 * @see #getPortDirection()
	 * @generated
	 */
	void setPortDirection(PortDirectionType value);

} // SuperPortType
