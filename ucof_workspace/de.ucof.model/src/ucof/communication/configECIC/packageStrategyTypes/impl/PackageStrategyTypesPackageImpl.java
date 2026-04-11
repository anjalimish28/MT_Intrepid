/**
 */
package ucof.communication.configECIC.packageStrategyTypes.impl;

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
import ucof.communication.configECIC.ConfigECICPackage;

import ucof.communication.configECIC.impl.ConfigECICPackageImpl;

import ucof.communication.configECIC.packageStrategyTypes.A429PacketStrategy;
import ucof.communication.configECIC.packageStrategyTypes.A664PacketStrategy;
import ucof.communication.configECIC.packageStrategyTypes.A825PacketStrategy;
import ucof.communication.configECIC.packageStrategyTypes.ANAPacketStrategy;
import ucof.communication.configECIC.packageStrategyTypes.DISPacketStrategy;
import ucof.communication.configECIC.packageStrategyTypes.ETHPacketStrategy;
import ucof.communication.configECIC.packageStrategyTypes.Frame;
import ucof.communication.configECIC.packageStrategyTypes.Frames;
import ucof.communication.configECIC.packageStrategyTypes.Gap;
import ucof.communication.configECIC.packageStrategyTypes.LLCType;
import ucof.communication.configECIC.packageStrategyTypes.NADPacketStrategy;
import ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesFactory;
import ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesPackage;
import ucof.communication.configECIC.packageStrategyTypes.SuperPacketStrategyType;
import ucof.communication.configECIC.packageStrategyTypes.TriggerWord;
import ucof.communication.configECIC.packageStrategyTypes.TriggerWords;

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
public class PackageStrategyTypesPackageImpl extends EPackageImpl implements PackageStrategyTypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superPacketStrategyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass a429PacketStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass a825PacketStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass a664PacketStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ethPacketStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disPacketStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anaPacketStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nadPacketStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerWordsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerWordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass llcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass framesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum llcTypeEEnum = null;

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
	 * @see ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PackageStrategyTypesPackageImpl() {
		super(eNS_URI, PackageStrategyTypesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PackageStrategyTypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PackageStrategyTypesPackage init() {
		if (isInited) return (PackageStrategyTypesPackage)EPackage.Registry.INSTANCE.getEPackage(PackageStrategyTypesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPackageStrategyTypesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PackageStrategyTypesPackageImpl thePackageStrategyTypesPackage = registeredPackageStrategyTypesPackage instanceof PackageStrategyTypesPackageImpl ? (PackageStrategyTypesPackageImpl)registeredPackageStrategyTypesPackage : new PackageStrategyTypesPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ConfigECICPackage.eNS_URI);
		ConfigECICPackageImpl theConfigECICPackage = (ConfigECICPackageImpl)(registeredPackage instanceof ConfigECICPackageImpl ? registeredPackage : ConfigECICPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StreamTypesPackage.eNS_URI);
		StreamTypesPackageImpl theStreamTypesPackage = (StreamTypesPackageImpl)(registeredPackage instanceof StreamTypesPackageImpl ? registeredPackage : StreamTypesPackage.eINSTANCE);
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
		thePackageStrategyTypesPackage.createPackageContents();
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
		theConfigECICPackage.createPackageContents();
		theStreamTypesPackage.createPackageContents();
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
		thePackageStrategyTypesPackage.initializePackageContents();
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
		theConfigECICPackage.initializePackageContents();
		theStreamTypesPackage.initializePackageContents();
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
		thePackageStrategyTypesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PackageStrategyTypesPackage.eNS_URI, thePackageStrategyTypesPackage);
		return thePackageStrategyTypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperPacketStrategyType() {
		return superPacketStrategyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSuperPacketStrategyType_PeriodNs() {
		return (EAttribute)superPacketStrategyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getA429PacketStrategy() {
		return a429PacketStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA429PacketStrategy_Direction() {
		return (EAttribute)a429PacketStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getA429PacketStrategy_Gap() {
		return (EReference)a429PacketStrategyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getA429PacketStrategy_TriggerWords() {
		return (EReference)a429PacketStrategyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getA825PacketStrategy() {
		return a825PacketStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getA825PacketStrategy_Frames() {
		return (EReference)a825PacketStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getA664PacketStrategy() {
		return a664PacketStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getETHPacketStrategy() {
		return ethPacketStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDISPacketStrategy() {
		return disPacketStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDISPacketStrategy_ResetPeriodicTimer() {
		return (EAttribute)disPacketStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getANAPacketStrategy() {
		return anaPacketStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNADPacketStrategy() {
		return nadPacketStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGap() {
		return gapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGap_DurationNs() {
		return (EAttribute)gapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGap_ResetPeriodicTimer() {
		return (EAttribute)gapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriggerWords() {
		return triggerWordsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriggerWords_TriggerWord() {
		return (EReference)triggerWordsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriggerWord() {
		return triggerWordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriggerWord_Label() {
		return (EAttribute)triggerWordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriggerWord_SDI() {
		return (EAttribute)triggerWordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriggerWord_ResetPeriodicTimer() {
		return (EAttribute)triggerWordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrame() {
		return frameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrame_A825ID() {
		return (EAttribute)frameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrame_ResetPeriodicTimer() {
		return (EAttribute)frameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLLC() {
		return llcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLLC_LLC() {
		return (EAttribute)llcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLLC_ResetPeriodicTimer() {
		return (EAttribute)llcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrames() {
		return framesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrames_Frame() {
		return (EReference)framesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrames_LLC() {
		return (EReference)framesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLLCType() {
		return llcTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageStrategyTypesFactory getPackageStrategyTypesFactory() {
		return (PackageStrategyTypesFactory)getEFactoryInstance();
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
		superPacketStrategyTypeEClass = createEClass(SUPER_PACKET_STRATEGY_TYPE);
		createEAttribute(superPacketStrategyTypeEClass, SUPER_PACKET_STRATEGY_TYPE__PERIOD_NS);

		a429PacketStrategyEClass = createEClass(A429_PACKET_STRATEGY);
		createEAttribute(a429PacketStrategyEClass, A429_PACKET_STRATEGY__DIRECTION);
		createEReference(a429PacketStrategyEClass, A429_PACKET_STRATEGY__GAP);
		createEReference(a429PacketStrategyEClass, A429_PACKET_STRATEGY__TRIGGER_WORDS);

		a825PacketStrategyEClass = createEClass(A825_PACKET_STRATEGY);
		createEReference(a825PacketStrategyEClass, A825_PACKET_STRATEGY__FRAMES);

		a664PacketStrategyEClass = createEClass(A664_PACKET_STRATEGY);

		ethPacketStrategyEClass = createEClass(ETH_PACKET_STRATEGY);

		disPacketStrategyEClass = createEClass(DIS_PACKET_STRATEGY);
		createEAttribute(disPacketStrategyEClass, DIS_PACKET_STRATEGY__RESET_PERIODIC_TIMER);

		anaPacketStrategyEClass = createEClass(ANA_PACKET_STRATEGY);

		nadPacketStrategyEClass = createEClass(NAD_PACKET_STRATEGY);

		gapEClass = createEClass(GAP);
		createEAttribute(gapEClass, GAP__DURATION_NS);
		createEAttribute(gapEClass, GAP__RESET_PERIODIC_TIMER);

		triggerWordsEClass = createEClass(TRIGGER_WORDS);
		createEReference(triggerWordsEClass, TRIGGER_WORDS__TRIGGER_WORD);

		triggerWordEClass = createEClass(TRIGGER_WORD);
		createEAttribute(triggerWordEClass, TRIGGER_WORD__LABEL);
		createEAttribute(triggerWordEClass, TRIGGER_WORD__SDI);
		createEAttribute(triggerWordEClass, TRIGGER_WORD__RESET_PERIODIC_TIMER);

		frameEClass = createEClass(FRAME);
		createEAttribute(frameEClass, FRAME__A825ID);
		createEAttribute(frameEClass, FRAME__RESET_PERIODIC_TIMER);

		llcEClass = createEClass(LLC);
		createEAttribute(llcEClass, LLC__LLC);
		createEAttribute(llcEClass, LLC__RESET_PERIODIC_TIMER);

		framesEClass = createEClass(FRAMES);
		createEReference(framesEClass, FRAMES__FRAME);
		createEReference(framesEClass, FRAMES__LLC);

		// Create enums
		llcTypeEEnum = createEEnum(LLC_TYPE);
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
		EtypesPackage theEtypesPackage = (EtypesPackage)EPackage.Registry.INSTANCE.getEPackage(EtypesPackage.eNS_URI);
		EdataPackage theEdataPackage = (EdataPackage)EPackage.Registry.INSTANCE.getEPackage(EdataPackage.eNS_URI);
		EnumsPackage theEnumsPackage = (EnumsPackage)EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		superPacketStrategyTypeEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		superPacketStrategyTypeEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());
		a429PacketStrategyEClass.getESuperTypes().add(this.getSuperPacketStrategyType());
		a825PacketStrategyEClass.getESuperTypes().add(this.getSuperPacketStrategyType());
		a664PacketStrategyEClass.getESuperTypes().add(this.getSuperPacketStrategyType());
		ethPacketStrategyEClass.getESuperTypes().add(this.getSuperPacketStrategyType());
		disPacketStrategyEClass.getESuperTypes().add(this.getSuperPacketStrategyType());
		anaPacketStrategyEClass.getESuperTypes().add(this.getSuperPacketStrategyType());
		nadPacketStrategyEClass.getESuperTypes().add(this.getSuperPacketStrategyType());
		gapEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		gapEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());
		triggerWordsEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		triggerWordsEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());
		triggerWordEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		triggerWordEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());
		frameEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		frameEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());
		llcEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		llcEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());
		framesEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		framesEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());

		// Initialize classes, features, and operations; add parameters
		initEClass(superPacketStrategyTypeEClass, SuperPacketStrategyType.class, "SuperPacketStrategyType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSuperPacketStrategyType_PeriodNs(), theEdataPackage.getPositiveIntType(), "PeriodNs", "0", 0, 1, SuperPacketStrategyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(a429PacketStrategyEClass, A429PacketStrategy.class, "A429PacketStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getA429PacketStrategy_Direction(), theEnumsPackage.getSingleDirectionType(), "Direction", null, 0, 1, A429PacketStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getA429PacketStrategy_Gap(), this.getGap(), null, "Gap", null, 0, 1, A429PacketStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getA429PacketStrategy_TriggerWords(), this.getTriggerWords(), null, "TriggerWords", null, 0, -1, A429PacketStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(a825PacketStrategyEClass, A825PacketStrategy.class, "A825PacketStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getA825PacketStrategy_Frames(), this.getFrames(), null, "Frames", null, 0, 1, A825PacketStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(a664PacketStrategyEClass, A664PacketStrategy.class, "A664PacketStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ethPacketStrategyEClass, ETHPacketStrategy.class, "ETHPacketStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(disPacketStrategyEClass, DISPacketStrategy.class, "DISPacketStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDISPacketStrategy_ResetPeriodicTimer(), theEnumsPackage.getYesNoType(), "ResetPeriodicTimer", null, 0, 1, DISPacketStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anaPacketStrategyEClass, ANAPacketStrategy.class, "ANAPacketStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nadPacketStrategyEClass, NADPacketStrategy.class, "NADPacketStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gapEClass, Gap.class, "Gap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGap_DurationNs(), theEdataPackage.getPositiveIntType(), "DurationNs", null, 0, 1, Gap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGap_ResetPeriodicTimer(), theEnumsPackage.getYesNoType(), "ResetPeriodicTimer", null, 0, 1, Gap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerWordsEClass, TriggerWords.class, "TriggerWords", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTriggerWords_TriggerWord(), this.getTriggerWord(), null, "TriggerWord", null, 0, -1, TriggerWords.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerWordEClass, TriggerWord.class, "TriggerWord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTriggerWord_Label(), ecorePackage.getEString(), "Label", null, 0, 1, TriggerWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTriggerWord_SDI(), theEnumsPackage.getSDITypes(), "SDI", null, 0, 1, TriggerWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTriggerWord_ResetPeriodicTimer(), theEnumsPackage.getYesNoType(), "ResetPeriodicTimer", null, 0, 1, TriggerWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(frameEClass, Frame.class, "Frame", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFrame_A825ID(), ecorePackage.getEString(), "A825ID", null, 0, 1, Frame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrame_ResetPeriodicTimer(), theEnumsPackage.getYesNoType(), "ResetPeriodicTimer", null, 0, 1, Frame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(llcEClass, ucof.communication.configECIC.packageStrategyTypes.LLC.class, "LLC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLLC_LLC(), this.getLLCType(), "LLC", null, 0, 1, ucof.communication.configECIC.packageStrategyTypes.LLC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLLC_ResetPeriodicTimer(), theEnumsPackage.getYesNoType(), "ResetPeriodicTimer", null, 0, 1, ucof.communication.configECIC.packageStrategyTypes.LLC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(framesEClass, Frames.class, "Frames", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFrames_Frame(), this.getFrame(), null, "Frame", null, 0, 1, Frames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFrames_LLC(), this.getLLC(), null, "LLC", null, 0, 1, Frames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(llcTypeEEnum, LLCType.class, "LLCType");
		addEEnumLiteral(llcTypeEEnum, LLCType.NOT_SET);
		addEEnumLiteral(llcTypeEEnum, LLCType.ZERO);
		addEEnumLiteral(llcTypeEEnum, LLCType.ONE);
		addEEnumLiteral(llcTypeEEnum, LLCType.TWO);
		addEEnumLiteral(llcTypeEEnum, LLCType.THREE);
		addEEnumLiteral(llcTypeEEnum, LLCType.FOUR);
		addEEnumLiteral(llcTypeEEnum, LLCType.FIVE);
		addEEnumLiteral(llcTypeEEnum, LLCType.SIX);
		addEEnumLiteral(llcTypeEEnum, LLCType.SEVEN);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (llcTypeEEnum,
		   source,
		   new String[] {
			   "name", "SDITypes"
		   });
	}

} //PackageStrategyTypesPackageImpl
