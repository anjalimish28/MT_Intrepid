/**
 */
package ucof.communication.configECIC.packageStrategyTypes;

import ucof.common.enums.YesNoType;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gap</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.Gap#getDurationNs <em>Duration Ns</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.Gap#getResetPeriodicTimer <em>Reset Periodic Timer</em>}</li>
 * </ul>
 *
 * @see ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesPackage#getGap()
 * @model
 * @generated
 */
public interface Gap extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Duration Ns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration Ns</em>' attribute.
	 * @see #setDurationNs(Integer)
	 * @see ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesPackage#getGap_DurationNs()
	 * @model dataType="ucof.common.edata.PositiveIntType"
	 * @generated
	 */
	Integer getDurationNs();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.packageStrategyTypes.Gap#getDurationNs <em>Duration Ns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Ns</em>' attribute.
	 * @see #getDurationNs()
	 * @generated
	 */
	void setDurationNs(Integer value);

	/**
	 * Returns the value of the '<em><b>Reset Periodic Timer</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.YesNoType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset Periodic Timer</em>' attribute.
	 * @see ucof.common.enums.YesNoType
	 * @see #setResetPeriodicTimer(YesNoType)
	 * @see ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesPackage#getGap_ResetPeriodicTimer()
	 * @model
	 * @generated
	 */
	YesNoType getResetPeriodicTimer();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.packageStrategyTypes.Gap#getResetPeriodicTimer <em>Reset Periodic Timer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset Periodic Timer</em>' attribute.
	 * @see ucof.common.enums.YesNoType
	 * @see #getResetPeriodicTimer()
	 * @generated
	 */
	void setResetPeriodicTimer(YesNoType value);

} // Gap
