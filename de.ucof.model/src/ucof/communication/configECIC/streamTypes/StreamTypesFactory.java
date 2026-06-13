/**
 */
package ucof.communication.configECIC.streamTypes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ucof.communication.configECIC.streamTypes.StreamTypesPackage
 * @generated
 */
public interface StreamTypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StreamTypesFactory eINSTANCE = ucof.communication.configECIC.streamTypes.impl.StreamTypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>A429 Stream</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>A429 Stream</em>'.
	 * @generated
	 */
	A429Stream createA429Stream();

	/**
	 * Returns a new object of class '<em>A825 Stream</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>A825 Stream</em>'.
	 * @generated
	 */
	A825Stream createA825Stream();

	/**
	 * Returns a new object of class '<em>A664 Stream</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>A664 Stream</em>'.
	 * @generated
	 */
	A664Stream createA664Stream();

	/**
	 * Returns a new object of class '<em>ETH Stream</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ETH Stream</em>'.
	 * @generated
	 */
	ETHStream createETHStream();

	/**
	 * Returns a new object of class '<em>DIS Stream</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DIS Stream</em>'.
	 * @generated
	 */
	DISStream createDISStream();

	/**
	 * Returns a new object of class '<em>ANA Stream</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ANA Stream</em>'.
	 * @generated
	 */
	ANAStream createANAStream();

	/**
	 * Returns a new object of class '<em>NAD Stream</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NAD Stream</em>'.
	 * @generated
	 */
	NADStream createNADStream();

	/**
	 * Returns a new object of class '<em>Data Timestamp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Timestamp</em>'.
	 * @generated
	 */
	DataTimestamp createDataTimestamp();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StreamTypesPackage getStreamTypesPackage();

} //StreamTypesFactory
