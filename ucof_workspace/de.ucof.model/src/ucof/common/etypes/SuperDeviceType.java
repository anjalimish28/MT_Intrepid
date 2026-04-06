/**
 */
package ucof.common.etypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super Device Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract general device type
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.common.etypes.SuperDeviceType#getConfigurationLink <em>Configuration Link</em>}</li>
 *   <li>{@link ucof.common.etypes.SuperDeviceType#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see ucof.common.etypes.EtypesPackage#getSuperDeviceType()
 * @model abstract="true"
 * @generated
 */
public interface SuperDeviceType extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Configuration Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Externally linked configuration possible, should be avoided though
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Configuration Link</em>' attribute.
	 * @see #setConfigurationLink(String)
	 * @see ucof.common.etypes.EtypesPackage#getSuperDeviceType_ConfigurationLink()
	 * @model
	 * @generated
	 */
	String getConfigurationLink();

	/**
	 * Sets the value of the '{@link ucof.common.etypes.SuperDeviceType#getConfigurationLink <em>Configuration Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Link</em>' attribute.
	 * @see #getConfigurationLink()
	 * @generated
	 */
	void setConfigurationLink(String value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * I/O with which device communicates with other devices
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference.
	 * @see #setPorts(DevicePorts)
	 * @see ucof.common.etypes.EtypesPackage#getSuperDeviceType_Ports()
	 * @model containment="true"
	 * @generated
	 */
	DevicePorts getPorts();

	/**
	 * Sets the value of the '{@link ucof.common.etypes.SuperDeviceType#getPorts <em>Ports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ports</em>' containment reference.
	 * @see #getPorts()
	 * @generated
	 */
	void setPorts(DevicePorts value);

} // SuperDeviceType
