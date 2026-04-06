/**
 */
package ucof.communication.configECIC.packageStrategyTypes;

import ucof.common.enums.YesNoType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DIS Packet Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.DISPacketStrategy#getResetPeriodicTimer <em>Reset Periodic Timer</em>}</li>
 * </ul>
 *
 * @see ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesPackage#getDISPacketStrategy()
 * @model
 * @generated
 */
public interface DISPacketStrategy extends SuperPacketStrategyType {
	/**
	 * Returns the value of the '<em><b>Reset Periodic Timer</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.YesNoType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset Periodic Timer</em>' attribute.
	 * @see ucof.common.enums.YesNoType
	 * @see #setResetPeriodicTimer(YesNoType)
	 * @see ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesPackage#getDISPacketStrategy_ResetPeriodicTimer()
	 * @model
	 * @generated
	 */
	YesNoType getResetPeriodicTimer();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.packageStrategyTypes.DISPacketStrategy#getResetPeriodicTimer <em>Reset Periodic Timer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset Periodic Timer</em>' attribute.
	 * @see ucof.common.enums.YesNoType
	 * @see #getResetPeriodicTimer()
	 * @generated
	 */
	void setResetPeriodicTimer(YesNoType value);

} // DISPacketStrategy
