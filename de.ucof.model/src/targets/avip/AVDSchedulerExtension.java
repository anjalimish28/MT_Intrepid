/**
 */
package targets.avip;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AVD Scheduler Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.avip.AVDSchedulerExtension#getMif_duration <em>Mif duration</em>}</li>
 *   <li>{@link targets.avip.AVDSchedulerExtension#getMaf_duration <em>Maf duration</em>}</li>
 *   <li>{@link targets.avip.AVDSchedulerExtension#getScheduler_id <em>Scheduler id</em>}</li>
 *   <li>{@link targets.avip.AVDSchedulerExtension#getScheduler_name <em>Scheduler name</em>}</li>
 * </ul>
 *
 * @see targets.avip.AvipPackage#getAVDSchedulerExtension()
 * @model
 * @generated
 */
public interface AVDSchedulerExtension extends SuperIdentifierType, SuperTrackingType {

	/**
	 * Returns the value of the '<em><b>Mif duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mif duration</em>' attribute.
	 * @see #setMif_duration(int)
	 * @see targets.avip.AvipPackage#getAVDSchedulerExtension_Mif_duration()
	 * @model
	 * @generated
	 */
	int getMif_duration();

	/**
	 * Sets the value of the '{@link targets.avip.AVDSchedulerExtension#getMif_duration <em>Mif duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mif duration</em>' attribute.
	 * @see #getMif_duration()
	 * @generated
	 */
	void setMif_duration(int value);

	/**
	 * Returns the value of the '<em><b>Maf duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maf duration</em>' attribute.
	 * @see #setMaf_duration(int)
	 * @see targets.avip.AvipPackage#getAVDSchedulerExtension_Maf_duration()
	 * @model
	 * @generated
	 */
	int getMaf_duration();

	/**
	 * Sets the value of the '{@link targets.avip.AVDSchedulerExtension#getMaf_duration <em>Maf duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maf duration</em>' attribute.
	 * @see #getMaf_duration()
	 * @generated
	 */
	void setMaf_duration(int value);

	/**
	 * Returns the value of the '<em><b>Scheduler id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduler id</em>' attribute.
	 * @see #setScheduler_id(String)
	 * @see targets.avip.AvipPackage#getAVDSchedulerExtension_Scheduler_id()
	 * @model
	 * @generated
	 */
	String getScheduler_id();

	/**
	 * Sets the value of the '{@link targets.avip.AVDSchedulerExtension#getScheduler_id <em>Scheduler id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduler id</em>' attribute.
	 * @see #getScheduler_id()
	 * @generated
	 */
	void setScheduler_id(String value);

	/**
	 * Returns the value of the '<em><b>Scheduler name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduler name</em>' attribute.
	 * @see #setScheduler_name(String)
	 * @see targets.avip.AvipPackage#getAVDSchedulerExtension_Scheduler_name()
	 * @model
	 * @generated
	 */
	String getScheduler_name();

	/**
	 * Sets the value of the '{@link targets.avip.AVDSchedulerExtension#getScheduler_name <em>Scheduler name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduler name</em>' attribute.
	 * @see #getScheduler_name()
	 * @generated
	 */
	void setScheduler_name(String value);
} // AVDSchedulerExtension
