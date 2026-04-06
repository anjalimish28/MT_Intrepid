/**
 */
package targets.avip.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import targets.avip.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AvipFactoryImpl extends EFactoryImpl implements AvipFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AvipFactory init() {
		try {
			AvipFactory theAvipFactory = (AvipFactory)EPackage.Registry.INSTANCE.getEFactory(AvipPackage.eNS_URI);
			if (theAvipFactory != null) {
				return theAvipFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AvipFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvipFactoryImpl() {
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
			case AvipPackage.AVIONICS_VIRTUAL_DEVICE: return createAvionicsVirtualDevice();
			case AvipPackage.AVD_PORTS: return createAVDPorts();
			case AvipPackage.FUNCTIONAL_DATA: return createFunctionalData();
			case AvipPackage.ANALOGUE_INPUT: return createAnalogueInput();
			case AvipPackage.ANALOGUE_OUTPUT: return createAnalogueOutput();
			case AvipPackage.DISCRETE_INPUT: return createDiscreteInput();
			case AvipPackage.DISCRETE_OUTPUT: return createDiscreteOutput();
			case AvipPackage.XTALK: return createXTalk();
			case AvipPackage.A429: return createA429();
			case AvipPackage.A664: return createA664();
			case AvipPackage.CAN: return createCAN();
			case AvipPackage.MEM: return createMEM();
			case AvipPackage.VRTD: return createV_RTD();
			case AvipPackage.PORT_USER_CONFIGURATION: return createPortUserConfiguration();
			case AvipPackage.AVD_SCHEDULER_EXTENSION: return createAVDSchedulerExtension();
			case AvipPackage.SIGNAL_EXTENSIONS: return createSignalExtensions();
			case AvipPackage.SIGNAL_EXTENSION: return createSignalExtension();
			case AvipPackage.MEM_PORT_ID_EXTENSION: return createMEMPortIDExtension();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AvipPackage.CONNECTOR_NAME_TYPE:
				return createConnectorNameTypeFromString(eDataType, initialValue);
			case AvipPackage.CONNECTOR_PIN_NAME_TYPE:
				return createConnectorPinNameTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AvipPackage.CONNECTOR_NAME_TYPE:
				return convertConnectorNameTypeToString(eDataType, instanceValue);
			case AvipPackage.CONNECTOR_PIN_NAME_TYPE:
				return convertConnectorPinNameTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvionicsVirtualDevice createAvionicsVirtualDevice() {
		AvionicsVirtualDeviceImpl avionicsVirtualDevice = new AvionicsVirtualDeviceImpl();
		return avionicsVirtualDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AVDPorts createAVDPorts() {
		AVDPortsImpl avdPorts = new AVDPortsImpl();
		return avdPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalData createFunctionalData() {
		FunctionalDataImpl functionalData = new FunctionalDataImpl();
		return functionalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueInput createAnalogueInput() {
		AnalogueInputImpl analogueInput = new AnalogueInputImpl();
		return analogueInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogueOutput createAnalogueOutput() {
		AnalogueOutputImpl analogueOutput = new AnalogueOutputImpl();
		return analogueOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteInput createDiscreteInput() {
		DiscreteInputImpl discreteInput = new DiscreteInputImpl();
		return discreteInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteOutput createDiscreteOutput() {
		DiscreteOutputImpl discreteOutput = new DiscreteOutputImpl();
		return discreteOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XTalk createXTalk() {
		XTalkImpl xTalk = new XTalkImpl();
		return xTalk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A429 createA429() {
		A429Impl a429 = new A429Impl();
		return a429;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A664 createA664() {
		A664Impl a664 = new A664Impl();
		return a664;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAN createCAN() {
		CANImpl can = new CANImpl();
		return can;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MEM createMEM() {
		MEMImpl mem = new MEMImpl();
		return mem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V_RTD createV_RTD() {
		V_RTDImpl v_RTD = new V_RTDImpl();
		return v_RTD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortUserConfiguration createPortUserConfiguration() {
		PortUserConfigurationImpl portUserConfiguration = new PortUserConfigurationImpl();
		return portUserConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AVDSchedulerExtension createAVDSchedulerExtension() {
		AVDSchedulerExtensionImpl avdSchedulerExtension = new AVDSchedulerExtensionImpl();
		return avdSchedulerExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalExtensions createSignalExtensions() {
		SignalExtensionsImpl signalExtensions = new SignalExtensionsImpl();
		return signalExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalExtension createSignalExtension() {
		SignalExtensionImpl signalExtension = new SignalExtensionImpl();
		return signalExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MEMPortIDExtension createMEMPortIDExtension() {
		MEMPortIDExtensionImpl memPortIDExtension = new MEMPortIDExtensionImpl();
		return memPortIDExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createConnectorNameTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectorNameTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createConnectorPinNameTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectorPinNameTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvipPackage getAvipPackage() {
		return (AvipPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AvipPackage getPackage() {
		return AvipPackage.eINSTANCE;
	}

} //AvipFactoryImpl
