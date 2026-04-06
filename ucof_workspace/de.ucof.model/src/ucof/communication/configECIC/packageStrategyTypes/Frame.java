/**
 */
package ucof.communication.configECIC.packageStrategyTypes;

import ucof.common.enums.YesNoType;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frame</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.Frame#getA825ID <em>A825ID</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.Frame#getResetPeriodicTimer <em>Reset Periodic Timer</em>}</li>
 * </ul>
 *
 * @see ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesPackage#getFrame()
 * @model
 * @generated
 */
public interface Frame extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>A825ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A825ID</em>' attribute.
	 * @see #setA825ID(String)
	 * @see ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesPackage#getFrame_A825ID()
	 * @model
	 * @generated
	 */
	String getA825ID();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.packageStrategyTypes.Frame#getA825ID <em>A825ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A825ID</em>' attribute.
	 * @see #getA825ID()
	 * @generated
	 */
	void setA825ID(String value);

	/**
	 * Returns the value of the '<em><b>Reset Periodic Timer</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.YesNoType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset Periodic Timer</em>' attribute.
	 * @see ucof.common.enums.YesNoType
	 * @see #setResetPeriodicTimer(YesNoType)
	 * @see ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesPackage#getFrame_ResetPeriodicTimer()
	 * @model
	 * @generated
	 */
	YesNoType getResetPeriodicTimer();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.packageStrategyTypes.Frame#getResetPeriodicTimer <em>Reset Periodic Timer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset Periodic Timer</em>' attribute.
	 * @see ucof.common.enums.YesNoType
	 * @see #getResetPeriodicTimer()
	 * @generated
	 */
	void setResetPeriodicTimer(YesNoType value);

} // Frame
