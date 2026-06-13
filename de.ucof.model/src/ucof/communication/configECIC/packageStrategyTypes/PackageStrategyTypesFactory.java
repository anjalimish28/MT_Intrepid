/**
 */
package ucof.communication.configECIC.packageStrategyTypes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesPackage
 * @generated
 */
public interface PackageStrategyTypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PackageStrategyTypesFactory eINSTANCE = ucof.communication.configECIC.packageStrategyTypes.impl.PackageStrategyTypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>A429 Packet Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>A429 Packet Strategy</em>'.
	 * @generated
	 */
	A429PacketStrategy createA429PacketStrategy();

	/**
	 * Returns a new object of class '<em>A825 Packet Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>A825 Packet Strategy</em>'.
	 * @generated
	 */
	A825PacketStrategy createA825PacketStrategy();

	/**
	 * Returns a new object of class '<em>A664 Packet Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>A664 Packet Strategy</em>'.
	 * @generated
	 */
	A664PacketStrategy createA664PacketStrategy();

	/**
	 * Returns a new object of class '<em>ETH Packet Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ETH Packet Strategy</em>'.
	 * @generated
	 */
	ETHPacketStrategy createETHPacketStrategy();

	/**
	 * Returns a new object of class '<em>DIS Packet Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DIS Packet Strategy</em>'.
	 * @generated
	 */
	DISPacketStrategy createDISPacketStrategy();

	/**
	 * Returns a new object of class '<em>ANA Packet Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ANA Packet Strategy</em>'.
	 * @generated
	 */
	ANAPacketStrategy createANAPacketStrategy();

	/**
	 * Returns a new object of class '<em>NAD Packet Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NAD Packet Strategy</em>'.
	 * @generated
	 */
	NADPacketStrategy createNADPacketStrategy();

	/**
	 * Returns a new object of class '<em>Gap</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gap</em>'.
	 * @generated
	 */
	Gap createGap();

	/**
	 * Returns a new object of class '<em>Trigger Words</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger Words</em>'.
	 * @generated
	 */
	TriggerWords createTriggerWords();

	/**
	 * Returns a new object of class '<em>Trigger Word</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger Word</em>'.
	 * @generated
	 */
	TriggerWord createTriggerWord();

	/**
	 * Returns a new object of class '<em>Frame</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Frame</em>'.
	 * @generated
	 */
	Frame createFrame();

	/**
	 * Returns a new object of class '<em>LLC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LLC</em>'.
	 * @generated
	 */
	LLC createLLC();

	/**
	 * Returns a new object of class '<em>Frames</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Frames</em>'.
	 * @generated
	 */
	Frames createFrames();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PackageStrategyTypesPackage getPackageStrategyTypesPackage();

} //PackageStrategyTypesFactory
