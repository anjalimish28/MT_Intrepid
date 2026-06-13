/**
 */
package ucof.common.etypes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ucof.common.etypes.EtypesPackage
 * @generated
 */
public interface EtypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EtypesFactory eINSTANCE = ucof.common.etypes.impl.EtypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Memory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory</em>'.
	 * @generated
	 */
	Memory createMemory();

	/**
	 * Returns a new object of class '<em>Memory Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory Requirement</em>'.
	 * @generated
	 */
	MemoryRequirement createMemoryRequirement();

	/**
	 * Returns a new object of class '<em>Device Ports</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Ports</em>'.
	 * @generated
	 */
	DevicePorts createDevicePorts();

	/**
	 * Returns a new object of class '<em>Sampling Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sampling Port</em>'.
	 * @generated
	 */
	SamplingPort createSamplingPort();

	/**
	 * Returns a new object of class '<em>Queuing Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Queuing Port</em>'.
	 * @generated
	 */
	QueuingPort createQueuingPort();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EtypesPackage getEtypesPackage();

} //EtypesFactory
