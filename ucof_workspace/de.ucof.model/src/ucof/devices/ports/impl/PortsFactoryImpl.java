/**
 */
package ucof.devices.ports.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ucof.devices.ports.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PortsFactoryImpl extends EFactoryImpl implements PortsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PortsFactory init() {
		try {
			PortsFactory thePortsFactory = (PortsFactory)EPackage.Registry.INSTANCE.getEFactory(PortsPackage.eNS_URI);
			if (thePortsFactory != null) {
				return thePortsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PortsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PortsPackage.PARTITION_PORTS: return createPartitionPorts();
			case PortsPackage.PROCESS_PORTS: return createProcessPorts();
			case PortsPackage.BLACKBOARD: return createBlackboard();
			case PortsPackage.BUFFER: return createBuffer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionPorts createPartitionPorts() {
		PartitionPortsImpl partitionPorts = new PartitionPortsImpl();
		return partitionPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessPorts createProcessPorts() {
		ProcessPortsImpl processPorts = new ProcessPortsImpl();
		return processPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Blackboard createBlackboard() {
		BlackboardImpl blackboard = new BlackboardImpl();
		return blackboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Buffer createBuffer() {
		BufferImpl buffer = new BufferImpl();
		return buffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortsPackage getPortsPackage() {
		return (PortsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PortsPackage getPackage() {
		return PortsPackage.eINSTANCE;
	}

} //PortsFactoryImpl
