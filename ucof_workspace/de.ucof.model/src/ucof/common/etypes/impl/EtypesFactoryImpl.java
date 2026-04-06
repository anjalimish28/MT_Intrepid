/**
 */
package ucof.common.etypes.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ucof.common.etypes.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EtypesFactoryImpl extends EFactoryImpl implements EtypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EtypesFactory init() {
		try {
			EtypesFactory theEtypesFactory = (EtypesFactory)EPackage.Registry.INSTANCE.getEFactory(EtypesPackage.eNS_URI);
			if (theEtypesFactory != null) {
				return theEtypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EtypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtypesFactoryImpl() {
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
			case EtypesPackage.MEMORY: return createMemory();
			case EtypesPackage.MEMORY_REQUIREMENT: return createMemoryRequirement();
			case EtypesPackage.DEVICE_PORTS: return createDevicePorts();
			case EtypesPackage.SAMPLING_PORT: return createSamplingPort();
			case EtypesPackage.QUEUING_PORT: return createQueuingPort();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Memory createMemory() {
		MemoryImpl memory = new MemoryImpl();
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryRequirement createMemoryRequirement() {
		MemoryRequirementImpl memoryRequirement = new MemoryRequirementImpl();
		return memoryRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevicePorts createDevicePorts() {
		DevicePortsImpl devicePorts = new DevicePortsImpl();
		return devicePorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SamplingPort createSamplingPort() {
		SamplingPortImpl samplingPort = new SamplingPortImpl();
		return samplingPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueuingPort createQueuingPort() {
		QueuingPortImpl queuingPort = new QueuingPortImpl();
		return queuingPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtypesPackage getEtypesPackage() {
		return (EtypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EtypesPackage getPackage() {
		return EtypesPackage.eINSTANCE;
	}

} //EtypesFactoryImpl
