/**
 */
package ucof.communication.configECIC.packageStrategyTypes;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super Packet Strategy Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.SuperPacketStrategyType#getPeriodNs <em>Period Ns</em>}</li>
 * </ul>
 *
 * @see ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesPackage#getSuperPacketStrategyType()
 * @model abstract="true"
 * @generated
 */
public interface SuperPacketStrategyType extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Period Ns</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period Ns</em>' attribute.
	 * @see #setPeriodNs(Integer)
	 * @see ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesPackage#getSuperPacketStrategyType_PeriodNs()
	 * @model default="0" dataType="ucof.common.edata.PositiveIntType"
	 * @generated
	 */
	Integer getPeriodNs();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.packageStrategyTypes.SuperPacketStrategyType#getPeriodNs <em>Period Ns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period Ns</em>' attribute.
	 * @see #getPeriodNs()
	 * @generated
	 */
	void setPeriodNs(Integer value);

} // SuperPacketStrategyType
