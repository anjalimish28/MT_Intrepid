/**
 */
package ucof.devices.devicetypes.a653components.healthmanagement;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Info Super</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Super Class for Error Actions in Module and Partition. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.ErrorInfoSuper#getErrorIdentifier <em>Error Identifier</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.healthmanagement.ErrorInfoSuper#getErrorDescription <em>Error Description</em>}</li>
 * </ul>
 *
 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage#getErrorInfoSuper()
 * @model
 * @generated
 */
public interface ErrorInfoSuper extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Error Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique error identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Identifier</em>' attribute.
	 * @see #setErrorIdentifier(String)
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage#getErrorInfoSuper_ErrorIdentifier()
	 * @model
	 * @generated
	 */
	String getErrorIdentifier();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.healthmanagement.ErrorInfoSuper#getErrorIdentifier <em>Error Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Identifier</em>' attribute.
	 * @see #getErrorIdentifier()
	 * @generated
	 */
	void setErrorIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Error Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the error.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Description</em>' attribute.
	 * @see #setErrorDescription(String)
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage#getErrorInfoSuper_ErrorDescription()
	 * @model
	 * @generated
	 */
	String getErrorDescription();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.healthmanagement.ErrorInfoSuper#getErrorDescription <em>Error Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Description</em>' attribute.
	 * @see #getErrorDescription()
	 * @generated
	 */
	void setErrorDescription(String value);

} // ErrorInfoSuper
