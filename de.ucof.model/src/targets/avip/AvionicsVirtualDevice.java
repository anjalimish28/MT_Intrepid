/**
 */
package targets.avip;

import targets.SuperTargetType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Avionics Virtual Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.avip.AvionicsVirtualDevice#getPorts <em>Ports</em>}</li>
 *   <li>{@link targets.avip.AvionicsVirtualDevice#getScheduleExtension <em>Schedule Extension</em>}</li>
 * </ul>
 *
 * @see targets.avip.AvipPackage#getAvionicsVirtualDevice()
 * @model
 * @generated
 */
public interface AvionicsVirtualDevice extends SuperTargetType {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference.
	 * @see #setPorts(AVDPorts)
	 * @see targets.avip.AvipPackage#getAvionicsVirtualDevice_Ports()
	 * @model containment="true"
	 * @generated
	 */
	AVDPorts getPorts();

	/**
	 * Sets the value of the '{@link targets.avip.AvionicsVirtualDevice#getPorts <em>Ports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ports</em>' containment reference.
	 * @see #getPorts()
	 * @generated
	 */
	void setPorts(AVDPorts value);

	/**
	 * Returns the value of the '<em><b>Schedule Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Extension</em>' containment reference.
	 * @see #setScheduleExtension(AVDSchedulerExtension)
	 * @see targets.avip.AvipPackage#getAvionicsVirtualDevice_ScheduleExtension()
	 * @model containment="true"
	 * @generated
	 */
	AVDSchedulerExtension getScheduleExtension();

	/**
	 * Sets the value of the '{@link targets.avip.AvionicsVirtualDevice#getScheduleExtension <em>Schedule Extension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Extension</em>' containment reference.
	 * @see #getScheduleExtension()
	 * @generated
	 */
	void setScheduleExtension(AVDSchedulerExtension value);

} // AvionicsVirtualDevice
