/**
 */
package ucof.communication.configECIC.packageStrategyTypes;

import org.eclipse.emf.common.util.EList;

import ucof.common.enums.SingleDirectionType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>A429 Packet Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.A429PacketStrategy#getDirection <em>Direction</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.A429PacketStrategy#getGap <em>Gap</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.A429PacketStrategy#getTriggerWords <em>Trigger Words</em>}</li>
 * </ul>
 *
 * @see ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesPackage#getA429PacketStrategy()
 * @model
 * @generated
 */
public interface A429PacketStrategy extends SuperPacketStrategyType {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.SingleDirectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see ucof.common.enums.SingleDirectionType
	 * @see #setDirection(SingleDirectionType)
	 * @see ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesPackage#getA429PacketStrategy_Direction()
	 * @model
	 * @generated
	 */
	SingleDirectionType getDirection();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.packageStrategyTypes.A429PacketStrategy#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see ucof.common.enums.SingleDirectionType
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(SingleDirectionType value);

	/**
	 * Returns the value of the '<em><b>Gap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gap</em>' containment reference.
	 * @see #setGap(Gap)
	 * @see ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesPackage#getA429PacketStrategy_Gap()
	 * @model containment="true"
	 * @generated
	 */
	Gap getGap();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.packageStrategyTypes.A429PacketStrategy#getGap <em>Gap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gap</em>' containment reference.
	 * @see #getGap()
	 * @generated
	 */
	void setGap(Gap value);

	/**
	 * Returns the value of the '<em><b>Trigger Words</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.communication.configECIC.packageStrategyTypes.TriggerWords}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Words</em>' containment reference list.
	 * @see ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesPackage#getA429PacketStrategy_TriggerWords()
	 * @model containment="true"
	 * @generated
	 */
	EList<TriggerWords> getTriggerWords();

} // A429PacketStrategy
