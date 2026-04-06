/**
 */
package ucof.communication.configECIC;

import ucof.common.enums.YesNoType;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.Header#getEnable <em>Enable</em>}</li>
 *   <li>{@link ucof.communication.configECIC.Header#getTransportTimestamp <em>Transport Timestamp</em>}</li>
 * </ul>
 *
 * @see ucof.communication.configECIC.ConfigECICPackage#getHeader()
 * @model
 * @generated
 */
public interface Header extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Enable</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.YesNoType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable</em>' attribute.
	 * @see ucof.common.enums.YesNoType
	 * @see #setEnable(YesNoType)
	 * @see ucof.communication.configECIC.ConfigECICPackage#getHeader_Enable()
	 * @model
	 * @generated
	 */
	YesNoType getEnable();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.Header#getEnable <em>Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable</em>' attribute.
	 * @see ucof.common.enums.YesNoType
	 * @see #getEnable()
	 * @generated
	 */
	void setEnable(YesNoType value);

	/**
	 * Returns the value of the '<em><b>Transport Timestamp</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.YesNoType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport Timestamp</em>' attribute.
	 * @see ucof.common.enums.YesNoType
	 * @see #setTransportTimestamp(YesNoType)
	 * @see ucof.communication.configECIC.ConfigECICPackage#getHeader_TransportTimestamp()
	 * @model
	 * @generated
	 */
	YesNoType getTransportTimestamp();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.Header#getTransportTimestamp <em>Transport Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Timestamp</em>' attribute.
	 * @see ucof.common.enums.YesNoType
	 * @see #getTransportTimestamp()
	 * @generated
	 */
	void setTransportTimestamp(YesNoType value);

} // Header
