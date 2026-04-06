/**
 */
package ucof.communication.configECIC.packageStrategyTypes;

import ucof.common.enums.SDITypes;
import ucof.common.enums.YesNoType;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger Word</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.TriggerWord#getLabel <em>Label</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.TriggerWord#getSDI <em>SDI</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.TriggerWord#getResetPeriodicTimer <em>Reset Periodic Timer</em>}</li>
 * </ul>
 *
 * @see ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesPackage#getTriggerWord()
 * @model
 * @generated
 */
public interface TriggerWord extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesPackage#getTriggerWord_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.packageStrategyTypes.TriggerWord#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>SDI</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.SDITypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SDI</em>' attribute.
	 * @see ucof.common.enums.SDITypes
	 * @see #setSDI(SDITypes)
	 * @see ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesPackage#getTriggerWord_SDI()
	 * @model
	 * @generated
	 */
	SDITypes getSDI();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.packageStrategyTypes.TriggerWord#getSDI <em>SDI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SDI</em>' attribute.
	 * @see ucof.common.enums.SDITypes
	 * @see #getSDI()
	 * @generated
	 */
	void setSDI(SDITypes value);

	/**
	 * Returns the value of the '<em><b>Reset Periodic Timer</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.YesNoType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset Periodic Timer</em>' attribute.
	 * @see ucof.common.enums.YesNoType
	 * @see #setResetPeriodicTimer(YesNoType)
	 * @see ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesPackage#getTriggerWord_ResetPeriodicTimer()
	 * @model
	 * @generated
	 */
	YesNoType getResetPeriodicTimer();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.packageStrategyTypes.TriggerWord#getResetPeriodicTimer <em>Reset Periodic Timer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset Periodic Timer</em>' attribute.
	 * @see ucof.common.enums.YesNoType
	 * @see #getResetPeriodicTimer()
	 * @generated
	 */
	void setResetPeriodicTimer(YesNoType value);

} // TriggerWord
