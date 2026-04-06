/**
 */
package targets.CanTransceiver;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see targets.CanTransceiver.CanTransceiverPackage
 * @generated
 */
public interface CanTransceiverFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CanTransceiverFactory eINSTANCE = targets.CanTransceiver.impl.CanTransceiverFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>sn65hvd230</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>sn65hvd230</em>'.
	 * @generated
	 */
	sn65hvd230 createsn65hvd230();

	/**
	 * Returns a new object of class '<em>can Transceiver Ports</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>can Transceiver Ports</em>'.
	 * @generated
	 */
	canTransceiverPorts createcanTransceiverPorts();

	/**
	 * Returns a new object of class '<em>can Transceiver Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>can Transceiver Port</em>'.
	 * @generated
	 */
	canTransceiverPort createcanTransceiverPort();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CanTransceiverPackage getCanTransceiverPackage();

} //CanTransceiverFactory
