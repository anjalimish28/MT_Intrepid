/**
 */
package ucof.devices.devicetypes;

import ucof.devices.SuperPlatformDeviceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computing Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ComputingModule represents a generic processing unit that executes software and performs control, data processing, and communication tasks within the system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.devicetypes.ComputingModule#getProcessorFamily <em>Processor Family</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.ComputingModule#getVendor <em>Vendor</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.ComputingModule#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see ucof.devices.devicetypes.DevicetypesPackage#getComputingModule()
 * @model
 * @generated
 */
public interface ComputingModule extends SuperPlatformDeviceType {
	/**
	 * Returns the value of the '<em><b>Processor Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor Family</em>' attribute.
	 * @see #setProcessorFamily(String)
	 * @see ucof.devices.devicetypes.DevicetypesPackage#getComputingModule_ProcessorFamily()
	 * @model
	 * @generated
	 */
	String getProcessorFamily();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.ComputingModule#getProcessorFamily <em>Processor Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor Family</em>' attribute.
	 * @see #getProcessorFamily()
	 * @generated
	 */
	void setProcessorFamily(String value);

	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor</em>' attribute.
	 * @see #setVendor(String)
	 * @see ucof.devices.devicetypes.DevicetypesPackage#getComputingModule_Vendor()
	 * @model
	 * @generated
	 */
	String getVendor();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.ComputingModule#getVendor <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor</em>' attribute.
	 * @see #getVendor()
	 * @generated
	 */
	void setVendor(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see ucof.devices.devicetypes.DevicetypesPackage#getComputingModule_Model()
	 * @model
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.ComputingModule#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

} // ComputingModule
