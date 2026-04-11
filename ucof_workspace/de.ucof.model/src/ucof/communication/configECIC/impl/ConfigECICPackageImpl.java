/**
 */
package ucof.communication.configECIC.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import targets.ADC.ADCPackage;
import targets.ADC.impl.ADCPackageImpl;
import targets.CCDPU.CCDPUPackage;
import targets.CCDPU.impl.CCDPUPackageImpl;
import targets.CanTransceiver.CanTransceiverPackage;
import targets.CanTransceiver.impl.CanTransceiverPackageImpl;
import targets.HallSensor.HallSensorPackage;
import targets.HallSensor.impl.HallSensorPackageImpl;
import targets.IntrepidPowerGrid.IntrepidPowerGridPackage;
import targets.IntrepidPowerGrid.impl.IntrepidPowerGridPackageImpl;
import targets.MotorController.MotorControllerPackage;
import targets.MotorController.impl.MotorControllerPackageImpl;
import targets.RDC.RDCPackage;
import targets.RDC.impl.RDCPackageImpl;
import targets.Sheild.SheildPackage;
import targets.Sheild.impl.SheildPackageImpl;
import targets.TargetsPackage;
import targets.impl.TargetsPackageImpl;
import targets.powergrid.PowergridPackage;
import targets.powergrid.impl.PowergridPackageImpl;
import ucof.UcofPackage;

import ucof.assignments.AssignmentsPackage;

import ucof.assignments.database.DatabasePackage;

import ucof.assignments.database.impl.DatabasePackageImpl;

import ucof.assignments.impl.AssignmentsPackageImpl;

import ucof.common.edata.EdataPackage;

import ucof.common.edata.impl.EdataPackageImpl;

import ucof.common.enums.EnumsPackage;

import ucof.common.enums.impl.EnumsPackageImpl;

import ucof.common.etypes.EtypesPackage;

import ucof.common.etypes.impl.EtypesPackageImpl;

import ucof.communication.CommunicationPackage;

import ucof.communication.arinc429.Arinc429Package;

import ucof.communication.arinc429.impl.Arinc429PackageImpl;

import ucof.communication.arinc825.Arinc825Package;

import ucof.communication.arinc825.impl.Arinc825PackageImpl;

import ucof.communication.basedonethernet.BasedonethernetPackage;

import ucof.communication.basedonethernet.arinc664.Arinc664Package;

import ucof.communication.basedonethernet.arinc664.impl.Arinc664PackageImpl;

import ucof.communication.basedonethernet.impl.BasedonethernetPackageImpl;

import ucof.communication.basedonwired.BasedonwiredPackage;

import ucof.communication.basedonwired.impl.BasedonwiredPackageImpl;

import ucof.communication.comDevices.ComDevicesPackage;
import ucof.communication.comDevices.impl.ComDevicesPackageImpl;
import ucof.communication.configECIC.Channel;
import ucof.communication.configECIC.Channels;
import ucof.communication.configECIC.ComInterface;
import ucof.communication.configECIC.ComponentTypeType;
import ucof.communication.configECIC.ConfigECICFactory;
import ucof.communication.configECIC.ConfigECICPackage;
import ucof.communication.configECIC.ED247Configuration;
import ucof.communication.configECIC.ED247Configurations;
import ucof.communication.configECIC.FileProducer;
import ucof.communication.configECIC.Header;
import ucof.communication.configECIC.StandardRevisionType;
import ucof.communication.configECIC.UDPSocket;
import ucof.communication.configECIC.UDPSockets;

import ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesPackage;

import ucof.communication.configECIC.packageStrategyTypes.impl.PackageStrategyTypesPackageImpl;

import ucof.communication.configECIC.srcDirectionExtension;

import ucof.communication.configECIC.streamTypes.StreamTypesPackage;

import ucof.communication.configECIC.streamTypes.impl.StreamTypesPackageImpl;

import ucof.communication.connectors.ConnectorsPackage;

import ucof.communication.connectors.impl.ConnectorsPackageImpl;

import ucof.communication.i2c.I2cPackage;
import ucof.communication.i2c.impl.I2cPackageImpl;
import ucof.communication.impl.CommunicationPackageImpl;

import ucof.devices.DevicesPackage;

import ucof.devices.devicetypes.DevicetypesPackage;

import ucof.devices.devicetypes.a653components.A653componentsPackage;

import ucof.devices.devicetypes.a653components.a653partition.A653partitionPackage;

import ucof.devices.devicetypes.a653components.a653partition.impl.A653partitionPackageImpl;

import ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage;

import ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl;

import ucof.devices.devicetypes.a653components.impl.A653componentsPackageImpl;

import ucof.devices.devicetypes.impl.DevicetypesPackageImpl;

import ucof.devices.functions.FunctionsPackage;

import ucof.devices.functions.impl.FunctionsPackageImpl;

import ucof.devices.functions.routing.RoutingPackage;

import ucof.devices.functions.routing.impl.RoutingPackageImpl;

import ucof.devices.impl.DevicesPackageImpl;

import ucof.devices.ports.PortsPackage;

import ucof.devices.ports.impl.PortsPackageImpl;

import ucof.impl.UcofPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigECICPackageImpl extends EPackageImpl implements ConfigECICPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ed247ConfigurationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ed247ConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileProducerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass udpSocketsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass udpSocketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcDirectionExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum standardRevisionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum componentTypeTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ucof.communication.configECIC.ConfigECICPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConfigECICPackageImpl() {
		super(eNS_URI, ConfigECICFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ConfigECICPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConfigECICPackage init() {
		if (isInited) return (ConfigECICPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigECICPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredConfigECICPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ConfigECICPackageImpl theConfigECICPackage = registeredConfigECICPackage instanceof ConfigECICPackageImpl ? (ConfigECICPackageImpl)registeredConfigECICPackage : new ConfigECICPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UcofPackage.eNS_URI);
		UcofPackageImpl theUcofPackage = (UcofPackageImpl)(registeredPackage instanceof UcofPackageImpl ? registeredPackage : UcofPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI);
		EnumsPackageImpl theEnumsPackage = (EnumsPackageImpl)(registeredPackage instanceof EnumsPackageImpl ? registeredPackage : EnumsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EtypesPackage.eNS_URI);
		EtypesPackageImpl theEtypesPackage = (EtypesPackageImpl)(registeredPackage instanceof EtypesPackageImpl ? registeredPackage : EtypesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EdataPackage.eNS_URI);
		EdataPackageImpl theEdataPackage = (EdataPackageImpl)(registeredPackage instanceof EdataPackageImpl ? registeredPackage : EdataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DevicesPackage.eNS_URI);
		DevicesPackageImpl theDevicesPackage = (DevicesPackageImpl)(registeredPackage instanceof DevicesPackageImpl ? registeredPackage : DevicesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DevicetypesPackage.eNS_URI);
		DevicetypesPackageImpl theDevicetypesPackage = (DevicetypesPackageImpl)(registeredPackage instanceof DevicetypesPackageImpl ? registeredPackage : DevicetypesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(A653componentsPackage.eNS_URI);
		A653componentsPackageImpl theA653componentsPackage = (A653componentsPackageImpl)(registeredPackage instanceof A653componentsPackageImpl ? registeredPackage : A653componentsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(A653partitionPackage.eNS_URI);
		A653partitionPackageImpl theA653partitionPackage = (A653partitionPackageImpl)(registeredPackage instanceof A653partitionPackageImpl ? registeredPackage : A653partitionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(HealthmanagementPackage.eNS_URI);
		HealthmanagementPackageImpl theHealthmanagementPackage = (HealthmanagementPackageImpl)(registeredPackage instanceof HealthmanagementPackageImpl ? registeredPackage : HealthmanagementPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI);
		FunctionsPackageImpl theFunctionsPackage = (FunctionsPackageImpl)(registeredPackage instanceof FunctionsPackageImpl ? registeredPackage : FunctionsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RoutingPackage.eNS_URI);
		RoutingPackageImpl theRoutingPackage = (RoutingPackageImpl)(registeredPackage instanceof RoutingPackageImpl ? registeredPackage : RoutingPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PortsPackage.eNS_URI);
		PortsPackageImpl thePortsPackage = (PortsPackageImpl)(registeredPackage instanceof PortsPackageImpl ? registeredPackage : PortsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI);
		CommunicationPackageImpl theCommunicationPackage = (CommunicationPackageImpl)(registeredPackage instanceof CommunicationPackageImpl ? registeredPackage : CommunicationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Arinc429Package.eNS_URI);
		Arinc429PackageImpl theArinc429Package = (Arinc429PackageImpl)(registeredPackage instanceof Arinc429PackageImpl ? registeredPackage : Arinc429Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Arinc825Package.eNS_URI);
		Arinc825PackageImpl theArinc825Package = (Arinc825PackageImpl)(registeredPackage instanceof Arinc825PackageImpl ? registeredPackage : Arinc825Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BasedonethernetPackage.eNS_URI);
		BasedonethernetPackageImpl theBasedonethernetPackage = (BasedonethernetPackageImpl)(registeredPackage instanceof BasedonethernetPackageImpl ? registeredPackage : BasedonethernetPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Arinc664Package.eNS_URI);
		Arinc664PackageImpl theArinc664Package = (Arinc664PackageImpl)(registeredPackage instanceof Arinc664PackageImpl ? registeredPackage : Arinc664Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BasedonwiredPackage.eNS_URI);
		BasedonwiredPackageImpl theBasedonwiredPackage = (BasedonwiredPackageImpl)(registeredPackage instanceof BasedonwiredPackageImpl ? registeredPackage : BasedonwiredPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ConnectorsPackage.eNS_URI);
		ConnectorsPackageImpl theConnectorsPackage = (ConnectorsPackageImpl)(registeredPackage instanceof ConnectorsPackageImpl ? registeredPackage : ConnectorsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StreamTypesPackage.eNS_URI);
		StreamTypesPackageImpl theStreamTypesPackage = (StreamTypesPackageImpl)(registeredPackage instanceof StreamTypesPackageImpl ? registeredPackage : StreamTypesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PackageStrategyTypesPackage.eNS_URI);
		PackageStrategyTypesPackageImpl thePackageStrategyTypesPackage = (PackageStrategyTypesPackageImpl)(registeredPackage instanceof PackageStrategyTypesPackageImpl ? registeredPackage : PackageStrategyTypesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ComDevicesPackage.eNS_URI);
		ComDevicesPackageImpl theComDevicesPackage = (ComDevicesPackageImpl)(registeredPackage instanceof ComDevicesPackageImpl ? registeredPackage : ComDevicesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(I2cPackage.eNS_URI);
		I2cPackageImpl theI2cPackage = (I2cPackageImpl)(registeredPackage instanceof I2cPackageImpl ? registeredPackage : I2cPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AssignmentsPackage.eNS_URI);
		AssignmentsPackageImpl theAssignmentsPackage = (AssignmentsPackageImpl)(registeredPackage instanceof AssignmentsPackageImpl ? registeredPackage : AssignmentsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DatabasePackage.eNS_URI);
		DatabasePackageImpl theDatabasePackage = (DatabasePackageImpl)(registeredPackage instanceof DatabasePackageImpl ? registeredPackage : DatabasePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TargetsPackage.eNS_URI);
		TargetsPackageImpl theTargetsPackage = (TargetsPackageImpl)(registeredPackage instanceof TargetsPackageImpl ? registeredPackage : TargetsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PowergridPackage.eNS_URI);
		PowergridPackageImpl thePowergridPackage = (PowergridPackageImpl)(registeredPackage instanceof PowergridPackageImpl ? registeredPackage : PowergridPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RDCPackage.eNS_URI);
		RDCPackageImpl theRDCPackage = (RDCPackageImpl)(registeredPackage instanceof RDCPackageImpl ? registeredPackage : RDCPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ADCPackage.eNS_URI);
		ADCPackageImpl theADCPackage = (ADCPackageImpl)(registeredPackage instanceof ADCPackageImpl ? registeredPackage : ADCPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SheildPackage.eNS_URI);
		SheildPackageImpl theSheildPackage = (SheildPackageImpl)(registeredPackage instanceof SheildPackageImpl ? registeredPackage : SheildPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MotorControllerPackage.eNS_URI);
		MotorControllerPackageImpl theMotorControllerPackage = (MotorControllerPackageImpl)(registeredPackage instanceof MotorControllerPackageImpl ? registeredPackage : MotorControllerPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CanTransceiverPackage.eNS_URI);
		CanTransceiverPackageImpl theCanTransceiverPackage = (CanTransceiverPackageImpl)(registeredPackage instanceof CanTransceiverPackageImpl ? registeredPackage : CanTransceiverPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(HallSensorPackage.eNS_URI);
		HallSensorPackageImpl theHallSensorPackage = (HallSensorPackageImpl)(registeredPackage instanceof HallSensorPackageImpl ? registeredPackage : HallSensorPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CCDPUPackage.eNS_URI);
		CCDPUPackageImpl theCCDPUPackage = (CCDPUPackageImpl)(registeredPackage instanceof CCDPUPackageImpl ? registeredPackage : CCDPUPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(IntrepidPowerGridPackage.eNS_URI);
		IntrepidPowerGridPackageImpl theIntrepidPowerGridPackage = (IntrepidPowerGridPackageImpl)(registeredPackage instanceof IntrepidPowerGridPackageImpl ? registeredPackage : IntrepidPowerGridPackage.eINSTANCE);

		// Create package meta-data objects
		theConfigECICPackage.createPackageContents();
		theUcofPackage.createPackageContents();
		theEnumsPackage.createPackageContents();
		theEtypesPackage.createPackageContents();
		theEdataPackage.createPackageContents();
		theDevicesPackage.createPackageContents();
		theDevicetypesPackage.createPackageContents();
		theA653componentsPackage.createPackageContents();
		theA653partitionPackage.createPackageContents();
		theHealthmanagementPackage.createPackageContents();
		theFunctionsPackage.createPackageContents();
		theRoutingPackage.createPackageContents();
		thePortsPackage.createPackageContents();
		theCommunicationPackage.createPackageContents();
		theArinc429Package.createPackageContents();
		theArinc825Package.createPackageContents();
		theBasedonethernetPackage.createPackageContents();
		theArinc664Package.createPackageContents();
		theBasedonwiredPackage.createPackageContents();
		theConnectorsPackage.createPackageContents();
		theStreamTypesPackage.createPackageContents();
		thePackageStrategyTypesPackage.createPackageContents();
		theComDevicesPackage.createPackageContents();
		theI2cPackage.createPackageContents();
		theAssignmentsPackage.createPackageContents();
		theDatabasePackage.createPackageContents();
		theTargetsPackage.createPackageContents();
		thePowergridPackage.createPackageContents();
		theRDCPackage.createPackageContents();
		theADCPackage.createPackageContents();
		theSheildPackage.createPackageContents();
		theMotorControllerPackage.createPackageContents();
		theCanTransceiverPackage.createPackageContents();
		theHallSensorPackage.createPackageContents();
		theCCDPUPackage.createPackageContents();
		theIntrepidPowerGridPackage.createPackageContents();

		// Initialize created meta-data
		theConfigECICPackage.initializePackageContents();
		theUcofPackage.initializePackageContents();
		theEnumsPackage.initializePackageContents();
		theEtypesPackage.initializePackageContents();
		theEdataPackage.initializePackageContents();
		theDevicesPackage.initializePackageContents();
		theDevicetypesPackage.initializePackageContents();
		theA653componentsPackage.initializePackageContents();
		theA653partitionPackage.initializePackageContents();
		theHealthmanagementPackage.initializePackageContents();
		theFunctionsPackage.initializePackageContents();
		theRoutingPackage.initializePackageContents();
		thePortsPackage.initializePackageContents();
		theCommunicationPackage.initializePackageContents();
		theArinc429Package.initializePackageContents();
		theArinc825Package.initializePackageContents();
		theBasedonethernetPackage.initializePackageContents();
		theArinc664Package.initializePackageContents();
		theBasedonwiredPackage.initializePackageContents();
		theConnectorsPackage.initializePackageContents();
		theStreamTypesPackage.initializePackageContents();
		thePackageStrategyTypesPackage.initializePackageContents();
		theComDevicesPackage.initializePackageContents();
		theI2cPackage.initializePackageContents();
		theAssignmentsPackage.initializePackageContents();
		theDatabasePackage.initializePackageContents();
		theTargetsPackage.initializePackageContents();
		thePowergridPackage.initializePackageContents();
		theRDCPackage.initializePackageContents();
		theADCPackage.initializePackageContents();
		theSheildPackage.initializePackageContents();
		theMotorControllerPackage.initializePackageContents();
		theCanTransceiverPackage.initializePackageContents();
		theHallSensorPackage.initializePackageContents();
		theCCDPUPackage.initializePackageContents();
		theIntrepidPowerGridPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConfigECICPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConfigECICPackage.eNS_URI, theConfigECICPackage);
		return theConfigECICPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getED247Configurations() {
		return ed247ConfigurationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getED247Configurations_Ed247Configuration() {
		return (EReference)ed247ConfigurationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getED247Configuration() {
		return ed247ConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getED247Configuration_StandardRevision() {
		return (EAttribute)ed247ConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getED247Configuration_ComponentVersion() {
		return (EAttribute)ed247ConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getED247Configuration_ComponentType() {
		return (EAttribute)ed247ConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getED247Configuration_Channels() {
		return (EReference)ed247ConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getED247Configuration_FileProducer() {
		return (EReference)ed247ConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileProducer() {
		return fileProducerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannels() {
		return channelsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannels_Channel() {
		return (EReference)channelsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannel() {
		return channelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannel_FrameFormat() {
		return (EAttribute)channelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannel_ComInterface() {
		return (EReference)channelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannel_Header() {
		return (EReference)channelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannel_Stream() {
		return (EReference)channelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComInterface() {
		return comInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComInterface_UdpSockets() {
		return (EReference)comInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUDPSockets() {
		return udpSocketsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUDPSockets_UdpSocket() {
		return (EReference)udpSocketsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUDPSocket() {
		return udpSocketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUDPSocket_MulticastInterfaceIP() {
		return (EAttribute)udpSocketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUDPSocket_MulticastTTL() {
		return (EAttribute)udpSocketEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUDPSocket_SrcDirectionExtension() {
		return (EReference)udpSocketEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUDPSocket_Direction() {
		return (EAttribute)udpSocketEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUDPSocket_IpAdress() {
		return (EAttribute)udpSocketEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUDPSocket_Port() {
		return (EAttribute)udpSocketEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getsrcDirectionExtension() {
		return srcDirectionExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getsrcDirectionExtension_IpAdress() {
		return (EAttribute)srcDirectionExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getsrcDirectionExtension_Port() {
		return (EAttribute)srcDirectionExtensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeader() {
		return headerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeader_Enable() {
		return (EAttribute)headerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeader_TransportTimestamp() {
		return (EAttribute)headerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStandardRevisionType() {
		return standardRevisionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComponentTypeType() {
		return componentTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigECICFactory getConfigECICFactory() {
		return (ConfigECICFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		ed247ConfigurationsEClass = createEClass(ED247_CONFIGURATIONS);
		createEReference(ed247ConfigurationsEClass, ED247_CONFIGURATIONS__ED247_CONFIGURATION);

		ed247ConfigurationEClass = createEClass(ED247_CONFIGURATION);
		createEAttribute(ed247ConfigurationEClass, ED247_CONFIGURATION__STANDARD_REVISION);
		createEAttribute(ed247ConfigurationEClass, ED247_CONFIGURATION__COMPONENT_VERSION);
		createEAttribute(ed247ConfigurationEClass, ED247_CONFIGURATION__COMPONENT_TYPE);
		createEReference(ed247ConfigurationEClass, ED247_CONFIGURATION__CHANNELS);
		createEReference(ed247ConfigurationEClass, ED247_CONFIGURATION__FILE_PRODUCER);

		fileProducerEClass = createEClass(FILE_PRODUCER);

		channelsEClass = createEClass(CHANNELS);
		createEReference(channelsEClass, CHANNELS__CHANNEL);

		channelEClass = createEClass(CHANNEL);
		createEAttribute(channelEClass, CHANNEL__FRAME_FORMAT);
		createEReference(channelEClass, CHANNEL__COM_INTERFACE);
		createEReference(channelEClass, CHANNEL__HEADER);
		createEReference(channelEClass, CHANNEL__STREAM);

		comInterfaceEClass = createEClass(COM_INTERFACE);
		createEReference(comInterfaceEClass, COM_INTERFACE__UDP_SOCKETS);

		udpSocketsEClass = createEClass(UDP_SOCKETS);
		createEReference(udpSocketsEClass, UDP_SOCKETS__UDP_SOCKET);

		udpSocketEClass = createEClass(UDP_SOCKET);
		createEAttribute(udpSocketEClass, UDP_SOCKET__MULTICAST_INTERFACE_IP);
		createEAttribute(udpSocketEClass, UDP_SOCKET__MULTICAST_TTL);
		createEReference(udpSocketEClass, UDP_SOCKET__SRC_DIRECTION_EXTENSION);
		createEAttribute(udpSocketEClass, UDP_SOCKET__DIRECTION);
		createEAttribute(udpSocketEClass, UDP_SOCKET__IP_ADRESS);
		createEAttribute(udpSocketEClass, UDP_SOCKET__PORT);

		srcDirectionExtensionEClass = createEClass(SRC_DIRECTION_EXTENSION);
		createEAttribute(srcDirectionExtensionEClass, SRC_DIRECTION_EXTENSION__IP_ADRESS);
		createEAttribute(srcDirectionExtensionEClass, SRC_DIRECTION_EXTENSION__PORT);

		headerEClass = createEClass(HEADER);
		createEAttribute(headerEClass, HEADER__ENABLE);
		createEAttribute(headerEClass, HEADER__TRANSPORT_TIMESTAMP);

		// Create enums
		standardRevisionTypeEEnum = createEEnum(STANDARD_REVISION_TYPE);
		componentTypeTypeEEnum = createEEnum(COMPONENT_TYPE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		StreamTypesPackage theStreamTypesPackage = (StreamTypesPackage)EPackage.Registry.INSTANCE.getEPackage(StreamTypesPackage.eNS_URI);
		PackageStrategyTypesPackage thePackageStrategyTypesPackage = (PackageStrategyTypesPackage)EPackage.Registry.INSTANCE.getEPackage(PackageStrategyTypesPackage.eNS_URI);
		EtypesPackage theEtypesPackage = (EtypesPackage)EPackage.Registry.INSTANCE.getEPackage(EtypesPackage.eNS_URI);
		EdataPackage theEdataPackage = (EdataPackage)EPackage.Registry.INSTANCE.getEPackage(EdataPackage.eNS_URI);
		EnumsPackage theEnumsPackage = (EnumsPackage)EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theStreamTypesPackage);
		getESubpackages().add(thePackageStrategyTypesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ed247ConfigurationsEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		ed247ConfigurationsEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());
		ed247ConfigurationEClass.getESuperTypes().add(theEtypesPackage.getSuperSetType());
		fileProducerEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		fileProducerEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());
		channelsEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		channelsEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());
		channelEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		channelEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());
		comInterfaceEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		comInterfaceEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());
		udpSocketsEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		udpSocketsEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());
		udpSocketEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		udpSocketEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());
		srcDirectionExtensionEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		srcDirectionExtensionEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());
		headerEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		headerEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());

		// Initialize classes, features, and operations; add parameters
		initEClass(ed247ConfigurationsEClass, ED247Configurations.class, "ED247Configurations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getED247Configurations_Ed247Configuration(), this.getED247Configuration(), null, "ed247Configuration", null, 0, -1, ED247Configurations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ed247ConfigurationEClass, ED247Configuration.class, "ED247Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getED247Configuration_StandardRevision(), this.getStandardRevisionType(), "standardRevision", null, 0, 1, ED247Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getED247Configuration_ComponentVersion(), ecorePackage.getEString(), "componentVersion", null, 0, 1, ED247Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getED247Configuration_ComponentType(), this.getComponentTypeType(), "componentType", null, 0, 1, ED247Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getED247Configuration_Channels(), this.getChannels(), null, "channels", null, 0, 1, ED247Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getED247Configuration_FileProducer(), this.getFileProducer(), null, "fileProducer", null, 0, 1, ED247Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileProducerEClass, FileProducer.class, "FileProducer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(channelsEClass, Channels.class, "Channels", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChannels_Channel(), this.getChannel(), null, "channel", null, 0, -1, Channels.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(channelEClass, Channel.class, "Channel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChannel_FrameFormat(), this.getStandardRevisionType(), "frameFormat", null, 0, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannel_ComInterface(), this.getComInterface(), null, "comInterface", null, 0, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannel_Header(), this.getHeader(), null, "header", null, 0, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannel_Stream(), theStreamTypesPackage.getSuperStreamType(), null, "stream", null, 0, -1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comInterfaceEClass, ComInterface.class, "ComInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComInterface_UdpSockets(), this.getUDPSockets(), null, "udpSockets", null, 0, 1, ComInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(udpSocketsEClass, UDPSockets.class, "UDPSockets", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUDPSockets_UdpSocket(), this.getUDPSocket(), null, "udpSocket", null, 0, -1, UDPSockets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(udpSocketEClass, UDPSocket.class, "UDPSocket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUDPSocket_MulticastInterfaceIP(), theEdataPackage.getIPAddressType(), "multicastInterfaceIP", null, 0, 1, UDPSocket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUDPSocket_MulticastTTL(), ecorePackage.getEInt(), "multicastTTL", null, 0, 1, UDPSocket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUDPSocket_SrcDirectionExtension(), this.getsrcDirectionExtension(), null, "srcDirectionExtension", null, 0, 2, UDPSocket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUDPSocket_Direction(), theEnumsPackage.getPortDirectionType(), "direction", null, 0, 1, UDPSocket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUDPSocket_IpAdress(), theEdataPackage.getIPAddressType(), "ipAdress", null, 0, 1, UDPSocket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUDPSocket_Port(), theEdataPackage.getPortType(), "port", null, 0, 1, UDPSocket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(srcDirectionExtensionEClass, srcDirectionExtension.class, "srcDirectionExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getsrcDirectionExtension_IpAdress(), theEdataPackage.getIPAddressType(), "ipAdress", null, 0, 1, srcDirectionExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getsrcDirectionExtension_Port(), theEdataPackage.getPortType(), "port", null, 0, 1, srcDirectionExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(headerEClass, Header.class, "Header", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHeader_Enable(), theEnumsPackage.getYesNoType(), "enable", null, 0, 1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeader_TransportTimestamp(), theEnumsPackage.getYesNoType(), "transportTimestamp", null, 0, 1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(standardRevisionTypeEEnum, StandardRevisionType.class, "StandardRevisionType");
		addEEnumLiteral(standardRevisionTypeEEnum, StandardRevisionType.NOT_SET);
		addEEnumLiteral(standardRevisionTypeEEnum, StandardRevisionType.A);

		initEEnum(componentTypeTypeEEnum, ComponentTypeType.class, "ComponentTypeType");
		addEEnumLiteral(componentTypeTypeEEnum, ComponentTypeType.NOT_SET);
		addEEnumLiteral(componentTypeTypeEEnum, ComponentTypeType.VIRTUAL);
		addEEnumLiteral(componentTypeTypeEEnum, ComponentTypeType.BRIDGE);
	}

} //ConfigECICPackageImpl
