/**
 */
package ucof.devices.devicetypes.a653components;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a memory region for the module
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.devicetypes.a653components.MemoryRegion#getSize <em>Size</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.MemoryRegion#getAddress <em>Address</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.MemoryRegion#getAccessRights <em>Access Rights</em>}</li>
 * </ul>
 *
 * @see ucof.devices.devicetypes.a653components.A653componentsPackage#getMemoryRegion()
 * @model
 * @generated
 */
public interface MemoryRegion extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Size of the memory region in bytes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(String)
	 * @see ucof.devices.devicetypes.a653components.A653componentsPackage#getMemoryRegion_Size()
	 * @model dataType="ucof.common.edata.DecOrHexValueType"
	 * @generated
	 */
	String getSize();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.MemoryRegion#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start address of the memory region
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see ucof.devices.devicetypes.a653components.A653componentsPackage#getMemoryRegion_Address()
	 * @model dataType="ucof.common.edata.DecOrHexValueType"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.MemoryRegion#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Access Rights</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Access right of the memory region
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access Rights</em>' attribute.
	 * @see #setAccessRights(String)
	 * @see ucof.devices.devicetypes.a653components.A653componentsPackage#getMemoryRegion_AccessRights()
	 * @model
	 * @generated
	 */
	String getAccessRights();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.MemoryRegion#getAccessRights <em>Access Rights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Rights</em>' attribute.
	 * @see #getAccessRights()
	 * @generated
	 */
	void setAccessRights(String value);

} // MemoryRegion
