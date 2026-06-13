/**
 */
package ucof.devices.devicetypes.a653components;

import ucof.common.enums.booleanType;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partition Time Window</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An uninterrupted interval of execution time provided to a partition within a partition schedule. The interval is defined by Partition Time Window Duration and Partition Time Window Offset
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.devicetypes.a653components.PartitionTimeWindow#getDuration <em>Duration</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.PartitionTimeWindow#getOffset <em>Offset</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.PartitionTimeWindow#getPeriodicProcessingStart <em>Periodic Processing Start</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.a653components.PartitionTimeWindow#getPartitionOrPortID <em>Partition Or Port ID</em>}</li>
 * </ul>
 *
 * @see ucof.devices.devicetypes.a653components.A653componentsPackage#getPartitionTimeWindow()
 * @model
 * @generated
 */
public interface PartitionTimeWindow extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the duration of the window in nanoseconds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(String)
	 * @see ucof.devices.devicetypes.a653components.A653componentsPackage#getPartitionTimeWindow_Duration()
	 * @model dataType="ucof.common.edata.DecOrHexValueType"
	 * @generated
	 */
	String getDuration();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.PartitionTimeWindow#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(String value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines from the start of the Major Frame when the time window is released in nanoseconds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(String)
	 * @see ucof.devices.devicetypes.a653components.A653componentsPackage#getPartitionTimeWindow_Offset()
	 * @model dataType="ucof.common.edata.DecOrHexValueType"
	 * @generated
	 */
	String getOffset();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.PartitionTimeWindow#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(String value);

	/**
	 * Returns the value of the '<em><b>Periodic Processing Start</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.booleanType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A point in a partition schedule aligned to the beginning of a partition's window where the partition's periodic process scheduling is permitted to start.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Periodic Processing Start</em>' attribute.
	 * @see ucof.common.enums.booleanType
	 * @see #setPeriodicProcessingStart(booleanType)
	 * @see ucof.devices.devicetypes.a653components.A653componentsPackage#getPartitionTimeWindow_PeriodicProcessingStart()
	 * @model
	 * @generated
	 */
	booleanType getPeriodicProcessingStart();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.PartitionTimeWindow#getPeriodicProcessingStart <em>Periodic Processing Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Periodic Processing Start</em>' attribute.
	 * @see ucof.common.enums.booleanType
	 * @see #getPeriodicProcessingStart()
	 * @generated
	 */
	void setPeriodicProcessingStart(booleanType value);

	/**
	 * Returns the value of the '<em><b>Partition Or Port ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partition Or Port ID</em>' attribute.
	 * @see #setPartitionOrPortID(String)
	 * @see ucof.devices.devicetypes.a653components.A653componentsPackage#getPartitionTimeWindow_PartitionOrPortID()
	 * @model dataType="ucof.common.edata.UUIDType"
	 * @generated
	 */
	String getPartitionOrPortID();

	/**
	 * Sets the value of the '{@link ucof.devices.devicetypes.a653components.PartitionTimeWindow#getPartitionOrPortID <em>Partition Or Port ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partition Or Port ID</em>' attribute.
	 * @see #getPartitionOrPortID()
	 * @generated
	 */
	void setPartitionOrPortID(String value);

} // PartitionTimeWindow
