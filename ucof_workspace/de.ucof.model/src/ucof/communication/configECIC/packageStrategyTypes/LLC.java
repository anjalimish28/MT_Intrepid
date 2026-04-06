/**
 */
package ucof.communication.configECIC.packageStrategyTypes;

import ucof.common.enums.YesNoType;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LLC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.LLC#getLLC <em>LLC</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.LLC#getResetPeriodicTimer <em>Reset Periodic Timer</em>}</li>
 * </ul>
 *
 * @see ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesPackage#getLLC()
 * @model
 * @generated
 */
public interface LLC extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>LLC</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.communication.configECIC.packageStrategyTypes.LLCType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LLC</em>' attribute.
	 * @see ucof.communication.configECIC.packageStrategyTypes.LLCType
	 * @see #setLLC(LLCType)
	 * @see ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesPackage#getLLC_LLC()
	 * @model
	 * @generated
	 */
	LLCType getLLC();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.packageStrategyTypes.LLC#getLLC <em>LLC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LLC</em>' attribute.
	 * @see ucof.communication.configECIC.packageStrategyTypes.LLCType
	 * @see #getLLC()
	 * @generated
	 */
	void setLLC(LLCType value);

	/**
	 * Returns the value of the '<em><b>Reset Periodic Timer</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.YesNoType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset Periodic Timer</em>' attribute.
	 * @see ucof.common.enums.YesNoType
	 * @see #setResetPeriodicTimer(YesNoType)
	 * @see ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesPackage#getLLC_ResetPeriodicTimer()
	 * @model
	 * @generated
	 */
	YesNoType getResetPeriodicTimer();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.packageStrategyTypes.LLC#getResetPeriodicTimer <em>Reset Periodic Timer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset Periodic Timer</em>' attribute.
	 * @see ucof.common.enums.YesNoType
	 * @see #getResetPeriodicTimer()
	 * @generated
	 */
	void setResetPeriodicTimer(YesNoType value);

} // LLC
