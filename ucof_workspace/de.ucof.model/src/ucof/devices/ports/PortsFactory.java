/**
 */
package ucof.devices.ports;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ucof.devices.ports.PortsPackage
 * @generated
 */
public interface PortsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PortsFactory eINSTANCE = ucof.devices.ports.impl.PortsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Partition Ports</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partition Ports</em>'.
	 * @generated
	 */
	PartitionPorts createPartitionPorts();

	/**
	 * Returns a new object of class '<em>Process Ports</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Ports</em>'.
	 * @generated
	 */
	ProcessPorts createProcessPorts();

	/**
	 * Returns a new object of class '<em>Blackboard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blackboard</em>'.
	 * @generated
	 */
	Blackboard createBlackboard();

	/**
	 * Returns a new object of class '<em>Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Buffer</em>'.
	 * @generated
	 */
	Buffer createBuffer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PortsPackage getPortsPackage();

} //PortsFactory
