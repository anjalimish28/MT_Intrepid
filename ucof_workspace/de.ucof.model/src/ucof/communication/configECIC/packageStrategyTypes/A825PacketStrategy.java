/**
 */
package ucof.communication.configECIC.packageStrategyTypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>A825 Packet Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.A825PacketStrategy#getFrames <em>Frames</em>}</li>
 * </ul>
 *
 * @see ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesPackage#getA825PacketStrategy()
 * @model
 * @generated
 */
public interface A825PacketStrategy extends SuperPacketStrategyType {
	/**
	 * Returns the value of the '<em><b>Frames</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frames</em>' containment reference.
	 * @see #setFrames(Frames)
	 * @see ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesPackage#getA825PacketStrategy_Frames()
	 * @model containment="true"
	 * @generated
	 */
	Frames getFrames();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.packageStrategyTypes.A825PacketStrategy#getFrames <em>Frames</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frames</em>' containment reference.
	 * @see #getFrames()
	 * @generated
	 */
	void setFrames(Frames value);

} // A825PacketStrategy
