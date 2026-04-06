/**
 */
package ucof.devices.devicetypes.a653components.healthmanagement.impl;

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
import targets.MotorController.MotorControllerPackage;
import targets.MotorController.impl.MotorControllerPackageImpl;
import targets.PowerRail.PowerRailPackage;
import targets.PowerRail.impl.PowerRailPackageImpl;
import targets.RDC.RDCPackage;
import targets.RDC.impl.RDCPackageImpl;
import targets.Sheild.SheildPackage;
import targets.Sheild.impl.SheildPackageImpl;
import targets.TargetsPackage;
import targets.impl.TargetsPackageImpl;
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
import ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesPackage;
import ucof.communication.configECIC.packageStrategyTypes.impl.PackageStrategyTypesPackageImpl;
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

import ucof.devices.devicetypes.a653components.healthmanagement.ErroInfoPartition;
import ucof.devices.devicetypes.a653components.healthmanagement.ErrorCode;
import ucof.devices.devicetypes.a653components.healthmanagement.ErrorInfoModule;
import ucof.devices.devicetypes.a653components.healthmanagement.ErrorInfoMultiPartition;
import ucof.devices.devicetypes.a653components.healthmanagement.ErrorInfoSuper;
import ucof.devices.devicetypes.a653components.healthmanagement.ErrorLevelModule;
import ucof.devices.devicetypes.a653components.healthmanagement.ErrorLevelPartition;
import ucof.devices.devicetypes.a653components.healthmanagement.HMTable;
import ucof.devices.devicetypes.a653components.healthmanagement.HealthManagement;
import ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementFactory;
import ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage;
import ucof.devices.devicetypes.a653components.healthmanagement.ModulePartitionLevelAction;
import ucof.devices.devicetypes.a653components.healthmanagement.ModuleRecoveryAction;
import ucof.devices.devicetypes.a653components.healthmanagement.ModuleRecoveryActions;
import ucof.devices.devicetypes.a653components.healthmanagement.ModuleTable;
import ucof.devices.devicetypes.a653components.healthmanagement.MultiPartitionTable;
import ucof.devices.devicetypes.a653components.healthmanagement.MultiPartitionTables;
import ucof.devices.devicetypes.a653components.healthmanagement.PartitionProcessLevelAction;
import ucof.devices.devicetypes.a653components.healthmanagement.PartitionRecoveryAction;
import ucof.devices.devicetypes.a653components.healthmanagement.PartitionRecoveryActions;
import ucof.devices.devicetypes.a653components.healthmanagement.ProcessRecoveryActions;
import ucof.devices.devicetypes.a653components.healthmanagement.ProcessRevoceryAction;

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
public class HealthmanagementPackageImpl extends EPackageImpl implements HealthmanagementPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthManagementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiPartitionTablesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiPartitionTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hmTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorInfoSuperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorInfoModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erroInfoPartitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorInfoMultiPartitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modulePartitionLevelActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partitionProcessLevelActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleRecoveryActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partitionRecoveryActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processRevoceryActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum errorCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum errorLevelPartitionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum errorLevelModuleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum moduleRecoveryActionsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum partitionRecoveryActionsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum processRecoveryActionsEEnum = null;

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
	 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HealthmanagementPackageImpl() {
		super(eNS_URI, HealthmanagementFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HealthmanagementPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HealthmanagementPackage init() {
		if (isInited) return (HealthmanagementPackage)EPackage.Registry.INSTANCE.getEPackage(HealthmanagementPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredHealthmanagementPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		HealthmanagementPackageImpl theHealthmanagementPackage = registeredHealthmanagementPackage instanceof HealthmanagementPackageImpl ? (HealthmanagementPackageImpl)registeredHealthmanagementPackage : new HealthmanagementPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PowerRailPackage.eNS_URI);
		PowerRailPackageImpl thePowerRailPackage = (PowerRailPackageImpl)(registeredPackage instanceof PowerRailPackageImpl ? registeredPackage : PowerRailPackage.eINSTANCE);

		// Create package meta-data objects
		theHealthmanagementPackage.createPackageContents();
		theUcofPackage.createPackageContents();
		theEnumsPackage.createPackageContents();
		theEtypesPackage.createPackageContents();
		theEdataPackage.createPackageContents();
		theDevicesPackage.createPackageContents();
		theDevicetypesPackage.createPackageContents();
		theA653componentsPackage.createPackageContents();
		theA653partitionPackage.createPackageContents();
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
		thePackageStrategyTypesPackage.createPackageContents();
		theComDevicesPackage.createPackageContents();
		theI2cPackage.createPackageContents();
		theAssignmentsPackage.createPackageContents();
		theDatabasePackage.createPackageContents();
		theTargetsPackage.createPackageContents();
		theRDCPackage.createPackageContents();
		theADCPackage.createPackageContents();
		theSheildPackage.createPackageContents();
		theMotorControllerPackage.createPackageContents();
		theCanTransceiverPackage.createPackageContents();
		theHallSensorPackage.createPackageContents();
		theCCDPUPackage.createPackageContents();
		thePowerRailPackage.createPackageContents();

		// Initialize created meta-data
		theHealthmanagementPackage.initializePackageContents();
		theUcofPackage.initializePackageContents();
		theEnumsPackage.initializePackageContents();
		theEtypesPackage.initializePackageContents();
		theEdataPackage.initializePackageContents();
		theDevicesPackage.initializePackageContents();
		theDevicetypesPackage.initializePackageContents();
		theA653componentsPackage.initializePackageContents();
		theA653partitionPackage.initializePackageContents();
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
		thePackageStrategyTypesPackage.initializePackageContents();
		theComDevicesPackage.initializePackageContents();
		theI2cPackage.initializePackageContents();
		theAssignmentsPackage.initializePackageContents();
		theDatabasePackage.initializePackageContents();
		theTargetsPackage.initializePackageContents();
		theRDCPackage.initializePackageContents();
		theADCPackage.initializePackageContents();
		theSheildPackage.initializePackageContents();
		theMotorControllerPackage.initializePackageContents();
		theCanTransceiverPackage.initializePackageContents();
		theHallSensorPackage.initializePackageContents();
		theCCDPUPackage.initializePackageContents();
		thePowerRailPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHealthmanagementPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HealthmanagementPackage.eNS_URI, theHealthmanagementPackage);
		return theHealthmanagementPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHealthManagement() {
		return healthManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthManagement_ModuleTable() {
		return (EReference)healthManagementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthManagement_MultiPartitionTables() {
		return (EReference)healthManagementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleTable() {
		return moduleTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleTable_StateDescription() {
		return (EAttribute)moduleTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleTable_StateID() {
		return (EAttribute)moduleTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleTable_ErrorInfo() {
		return (EReference)moduleTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiPartitionTables() {
		return multiPartitionTablesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiPartitionTables_MultiPartitionTable() {
		return (EReference)multiPartitionTablesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiPartitionTable() {
		return multiPartitionTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiPartitionTable_TableID() {
		return (EAttribute)multiPartitionTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiPartitionTable_TableName() {
		return (EAttribute)multiPartitionTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiPartitionTable_ErrorInfo() {
		return (EReference)multiPartitionTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHMTable() {
		return hmTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHMTable_TableIdentifier() {
		return (EAttribute)hmTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHMTable_TableName() {
		return (EAttribute)hmTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHMTable_MultiPartitionHMTableNameRef() {
		return (EReference)hmTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHMTable_ErrorInfo() {
		return (EReference)hmTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorInfoSuper() {
		return errorInfoSuperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorInfoSuper_ErrorIdentifier() {
		return (EAttribute)errorInfoSuperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorInfoSuper_ErrorDescription() {
		return (EAttribute)errorInfoSuperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorInfoModule() {
		return errorInfoModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorInfoModule_ModuleRecoveryAction() {
		return (EReference)errorInfoModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErroInfoPartition() {
		return erroInfoPartitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErroInfoPartition_ErrorLevel() {
		return (EAttribute)erroInfoPartitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErroInfoPartition_RecoveryAction() {
		return (EReference)erroInfoPartitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorInfoMultiPartition() {
		return errorInfoMultiPartitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorInfoMultiPartition_ErrorLevel() {
		return (EAttribute)errorInfoMultiPartitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorInfoMultiPartition_RecoveryAction() {
		return (EReference)errorInfoMultiPartitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModulePartitionLevelAction() {
		return modulePartitionLevelActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartitionProcessLevelAction() {
		return partitionProcessLevelActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleRecoveryAction() {
		return moduleRecoveryActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleRecoveryAction_RecoveryAction() {
		return (EAttribute)moduleRecoveryActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartitionRecoveryAction() {
		return partitionRecoveryActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartitionRecoveryAction_RecoveryAction() {
		return (EAttribute)partitionRecoveryActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessRevoceryAction() {
		return processRevoceryActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessRevoceryAction_ErrorCode() {
		return (EAttribute)processRevoceryActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessRevoceryAction_RecoveryAction() {
		return (EAttribute)processRevoceryActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getErrorCode() {
		return errorCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getErrorLevelPartition() {
		return errorLevelPartitionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getErrorLevelModule() {
		return errorLevelModuleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModuleRecoveryActions() {
		return moduleRecoveryActionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPartitionRecoveryActions() {
		return partitionRecoveryActionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcessRecoveryActions() {
		return processRecoveryActionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthmanagementFactory getHealthmanagementFactory() {
		return (HealthmanagementFactory)getEFactoryInstance();
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
		healthManagementEClass = createEClass(HEALTH_MANAGEMENT);
		createEReference(healthManagementEClass, HEALTH_MANAGEMENT__MODULE_TABLE);
		createEReference(healthManagementEClass, HEALTH_MANAGEMENT__MULTI_PARTITION_TABLES);

		moduleTableEClass = createEClass(MODULE_TABLE);
		createEAttribute(moduleTableEClass, MODULE_TABLE__STATE_DESCRIPTION);
		createEAttribute(moduleTableEClass, MODULE_TABLE__STATE_ID);
		createEReference(moduleTableEClass, MODULE_TABLE__ERROR_INFO);

		multiPartitionTablesEClass = createEClass(MULTI_PARTITION_TABLES);
		createEReference(multiPartitionTablesEClass, MULTI_PARTITION_TABLES__MULTI_PARTITION_TABLE);

		multiPartitionTableEClass = createEClass(MULTI_PARTITION_TABLE);
		createEAttribute(multiPartitionTableEClass, MULTI_PARTITION_TABLE__TABLE_ID);
		createEAttribute(multiPartitionTableEClass, MULTI_PARTITION_TABLE__TABLE_NAME);
		createEReference(multiPartitionTableEClass, MULTI_PARTITION_TABLE__ERROR_INFO);

		hmTableEClass = createEClass(HM_TABLE);
		createEAttribute(hmTableEClass, HM_TABLE__TABLE_IDENTIFIER);
		createEAttribute(hmTableEClass, HM_TABLE__TABLE_NAME);
		createEReference(hmTableEClass, HM_TABLE__MULTI_PARTITION_HM_TABLE_NAME_REF);
		createEReference(hmTableEClass, HM_TABLE__ERROR_INFO);

		errorInfoSuperEClass = createEClass(ERROR_INFO_SUPER);
		createEAttribute(errorInfoSuperEClass, ERROR_INFO_SUPER__ERROR_IDENTIFIER);
		createEAttribute(errorInfoSuperEClass, ERROR_INFO_SUPER__ERROR_DESCRIPTION);

		errorInfoModuleEClass = createEClass(ERROR_INFO_MODULE);
		createEReference(errorInfoModuleEClass, ERROR_INFO_MODULE__MODULE_RECOVERY_ACTION);

		erroInfoPartitionEClass = createEClass(ERRO_INFO_PARTITION);
		createEAttribute(erroInfoPartitionEClass, ERRO_INFO_PARTITION__ERROR_LEVEL);
		createEReference(erroInfoPartitionEClass, ERRO_INFO_PARTITION__RECOVERY_ACTION);

		errorInfoMultiPartitionEClass = createEClass(ERROR_INFO_MULTI_PARTITION);
		createEAttribute(errorInfoMultiPartitionEClass, ERROR_INFO_MULTI_PARTITION__ERROR_LEVEL);
		createEReference(errorInfoMultiPartitionEClass, ERROR_INFO_MULTI_PARTITION__RECOVERY_ACTION);

		modulePartitionLevelActionEClass = createEClass(MODULE_PARTITION_LEVEL_ACTION);

		partitionProcessLevelActionEClass = createEClass(PARTITION_PROCESS_LEVEL_ACTION);

		moduleRecoveryActionEClass = createEClass(MODULE_RECOVERY_ACTION);
		createEAttribute(moduleRecoveryActionEClass, MODULE_RECOVERY_ACTION__RECOVERY_ACTION);

		partitionRecoveryActionEClass = createEClass(PARTITION_RECOVERY_ACTION);
		createEAttribute(partitionRecoveryActionEClass, PARTITION_RECOVERY_ACTION__RECOVERY_ACTION);

		processRevoceryActionEClass = createEClass(PROCESS_REVOCERY_ACTION);
		createEAttribute(processRevoceryActionEClass, PROCESS_REVOCERY_ACTION__ERROR_CODE);
		createEAttribute(processRevoceryActionEClass, PROCESS_REVOCERY_ACTION__RECOVERY_ACTION);

		// Create enums
		errorCodeEEnum = createEEnum(ERROR_CODE);
		errorLevelPartitionEEnum = createEEnum(ERROR_LEVEL_PARTITION);
		errorLevelModuleEEnum = createEEnum(ERROR_LEVEL_MODULE);
		moduleRecoveryActionsEEnum = createEEnum(MODULE_RECOVERY_ACTIONS);
		partitionRecoveryActionsEEnum = createEEnum(PARTITION_RECOVERY_ACTIONS);
		processRecoveryActionsEEnum = createEEnum(PROCESS_RECOVERY_ACTIONS);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		healthManagementEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		healthManagementEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());
		moduleTableEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		moduleTableEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());
		multiPartitionTablesEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		multiPartitionTablesEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());
		multiPartitionTableEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		multiPartitionTableEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());
		hmTableEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		hmTableEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());
		errorInfoSuperEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		errorInfoSuperEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());
		errorInfoModuleEClass.getESuperTypes().add(this.getErrorInfoSuper());
		erroInfoPartitionEClass.getESuperTypes().add(this.getErrorInfoSuper());
		errorInfoMultiPartitionEClass.getESuperTypes().add(this.getErrorInfoSuper());
		modulePartitionLevelActionEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		modulePartitionLevelActionEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());
		partitionProcessLevelActionEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		partitionProcessLevelActionEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());
		moduleRecoveryActionEClass.getESuperTypes().add(this.getModulePartitionLevelAction());
		partitionRecoveryActionEClass.getESuperTypes().add(this.getPartitionProcessLevelAction());
		partitionRecoveryActionEClass.getESuperTypes().add(this.getModulePartitionLevelAction());
		processRevoceryActionEClass.getESuperTypes().add(this.getPartitionProcessLevelAction());

		// Initialize classes, features, and operations; add parameters
		initEClass(healthManagementEClass, HealthManagement.class, "HealthManagement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHealthManagement_ModuleTable(), this.getModuleTable(), null, "moduleTable", null, 0, 1, HealthManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHealthManagement_MultiPartitionTables(), this.getMultiPartitionTables(), null, "multiPartitionTables", null, 0, 1, HealthManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleTableEClass, ModuleTable.class, "ModuleTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModuleTable_StateDescription(), ecorePackage.getEString(), "stateDescription", null, 0, 1, ModuleTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleTable_StateID(), ecorePackage.getEString(), "stateID", null, 0, 1, ModuleTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleTable_ErrorInfo(), this.getErrorInfoModule(), null, "errorInfo", null, 0, -1, ModuleTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiPartitionTablesEClass, MultiPartitionTables.class, "MultiPartitionTables", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiPartitionTables_MultiPartitionTable(), this.getMultiPartitionTable(), null, "multiPartitionTable", null, 0, -1, MultiPartitionTables.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiPartitionTableEClass, MultiPartitionTable.class, "MultiPartitionTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiPartitionTable_TableID(), ecorePackage.getEString(), "tableID", null, 0, 1, MultiPartitionTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiPartitionTable_TableName(), ecorePackage.getEString(), "tableName", null, 0, 1, MultiPartitionTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiPartitionTable_ErrorInfo(), this.getErrorInfoMultiPartition(), null, "errorInfo", null, 0, -1, MultiPartitionTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hmTableEClass, HMTable.class, "HMTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHMTable_TableIdentifier(), ecorePackage.getEString(), "tableIdentifier", null, 0, 1, HMTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHMTable_TableName(), ecorePackage.getEString(), "tableName", null, 0, 1, HMTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHMTable_MultiPartitionHMTableNameRef(), this.getMultiPartitionTable(), null, "multiPartitionHMTableNameRef", null, 0, 1, HMTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHMTable_ErrorInfo(), this.getErroInfoPartition(), null, "errorInfo", null, 0, -1, HMTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorInfoSuperEClass, ErrorInfoSuper.class, "ErrorInfoSuper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getErrorInfoSuper_ErrorIdentifier(), ecorePackage.getEString(), "errorIdentifier", null, 0, 1, ErrorInfoSuper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getErrorInfoSuper_ErrorDescription(), ecorePackage.getEString(), "errorDescription", null, 0, 1, ErrorInfoSuper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorInfoModuleEClass, ErrorInfoModule.class, "ErrorInfoModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErrorInfoModule_ModuleRecoveryAction(), this.getModuleRecoveryAction(), null, "moduleRecoveryAction", null, 0, 1, ErrorInfoModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(erroInfoPartitionEClass, ErroInfoPartition.class, "ErroInfoPartition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getErroInfoPartition_ErrorLevel(), this.getErrorLevelPartition(), "errorLevel", null, 0, 1, ErroInfoPartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getErroInfoPartition_RecoveryAction(), this.getPartitionProcessLevelAction(), null, "recoveryAction", null, 0, 1, ErroInfoPartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorInfoMultiPartitionEClass, ErrorInfoMultiPartition.class, "ErrorInfoMultiPartition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getErrorInfoMultiPartition_ErrorLevel(), this.getErrorLevelModule(), "errorLevel", null, 0, 1, ErrorInfoMultiPartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getErrorInfoMultiPartition_RecoveryAction(), this.getModulePartitionLevelAction(), null, "recoveryAction", null, 0, 1, ErrorInfoMultiPartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modulePartitionLevelActionEClass, ModulePartitionLevelAction.class, "ModulePartitionLevelAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(partitionProcessLevelActionEClass, PartitionProcessLevelAction.class, "PartitionProcessLevelAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moduleRecoveryActionEClass, ModuleRecoveryAction.class, "ModuleRecoveryAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModuleRecoveryAction_RecoveryAction(), this.getModuleRecoveryActions(), "recoveryAction", null, 0, 1, ModuleRecoveryAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partitionRecoveryActionEClass, PartitionRecoveryAction.class, "PartitionRecoveryAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartitionRecoveryAction_RecoveryAction(), this.getPartitionRecoveryActions(), "recoveryAction", null, 0, 1, PartitionRecoveryAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processRevoceryActionEClass, ProcessRevoceryAction.class, "ProcessRevoceryAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessRevoceryAction_ErrorCode(), this.getErrorCode(), "errorCode", null, 0, 1, ProcessRevoceryAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessRevoceryAction_RecoveryAction(), this.getProcessRecoveryActions(), "recoveryAction", null, 0, 1, ProcessRevoceryAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(errorCodeEEnum, ErrorCode.class, "ErrorCode");
		addEEnumLiteral(errorCodeEEnum, ErrorCode.NOT_SET);
		addEEnumLiteral(errorCodeEEnum, ErrorCode.DEADLINE_MISSED);
		addEEnumLiteral(errorCodeEEnum, ErrorCode.APPLICATION_ERROR);
		addEEnumLiteral(errorCodeEEnum, ErrorCode.NUMERIC_ERROR);
		addEEnumLiteral(errorCodeEEnum, ErrorCode.ILLEGAL_REQUEST);
		addEEnumLiteral(errorCodeEEnum, ErrorCode.STACK_OVERFLOW);
		addEEnumLiteral(errorCodeEEnum, ErrorCode.MEMORY_VIOLATION);
		addEEnumLiteral(errorCodeEEnum, ErrorCode.HARDWARE_FAULT);
		addEEnumLiteral(errorCodeEEnum, ErrorCode.POWER_FAIL);

		initEEnum(errorLevelPartitionEEnum, ErrorLevelPartition.class, "ErrorLevelPartition");
		addEEnumLiteral(errorLevelPartitionEEnum, ErrorLevelPartition.NOT_SET);
		addEEnumLiteral(errorLevelPartitionEEnum, ErrorLevelPartition.PARTITION);
		addEEnumLiteral(errorLevelPartitionEEnum, ErrorLevelPartition.PROCESS);

		initEEnum(errorLevelModuleEEnum, ErrorLevelModule.class, "ErrorLevelModule");
		addEEnumLiteral(errorLevelModuleEEnum, ErrorLevelModule.NOT_SET);
		addEEnumLiteral(errorLevelModuleEEnum, ErrorLevelModule.MODULE);
		addEEnumLiteral(errorLevelModuleEEnum, ErrorLevelModule.PARTITION);

		initEEnum(moduleRecoveryActionsEEnum, ModuleRecoveryActions.class, "ModuleRecoveryActions");
		addEEnumLiteral(moduleRecoveryActionsEEnum, ModuleRecoveryActions.NOT_SET);
		addEEnumLiteral(moduleRecoveryActionsEEnum, ModuleRecoveryActions.IGNORE);
		addEEnumLiteral(moduleRecoveryActionsEEnum, ModuleRecoveryActions.SHUTDOWN_MODULE);
		addEEnumLiteral(moduleRecoveryActionsEEnum, ModuleRecoveryActions.RESET_MODULE);
		addEEnumLiteral(moduleRecoveryActionsEEnum, ModuleRecoveryActions.CUSTOM);

		initEEnum(partitionRecoveryActionsEEnum, PartitionRecoveryActions.class, "PartitionRecoveryActions");
		addEEnumLiteral(partitionRecoveryActionsEEnum, PartitionRecoveryActions.NOT_SET);
		addEEnumLiteral(partitionRecoveryActionsEEnum, PartitionRecoveryActions.IGNORE);
		addEEnumLiteral(partitionRecoveryActionsEEnum, PartitionRecoveryActions.IDLE);
		addEEnumLiteral(partitionRecoveryActionsEEnum, PartitionRecoveryActions.WARM_RESTART);
		addEEnumLiteral(partitionRecoveryActionsEEnum, PartitionRecoveryActions.COLD_RESTART);

		initEEnum(processRecoveryActionsEEnum, ProcessRecoveryActions.class, "ProcessRecoveryActions");
		addEEnumLiteral(processRecoveryActionsEEnum, ProcessRecoveryActions.NOT_SET);
		addEEnumLiteral(processRecoveryActionsEEnum, ProcessRecoveryActions.IGNORE_AND_LOG);
		addEEnumLiteral(processRecoveryActionsEEnum, ProcessRecoveryActions.IGNORE_NTIMES_BEFORE_ACTION);
		addEEnumLiteral(processRecoveryActionsEEnum, ProcessRecoveryActions.STOP_AND_REINITIALIZE_FROM_ENTRY_ADDRESS);
		addEEnumLiteral(processRecoveryActionsEEnum, ProcessRecoveryActions.STOP_PROCESS_AND_START_OTHER_PROCESS);
		addEEnumLiteral(processRecoveryActionsEEnum, ProcessRecoveryActions.STOP_PROCESS);
		addEEnumLiteral(processRecoveryActionsEEnum, ProcessRecoveryActions.PARTITION_COLD_RESTART);
		addEEnumLiteral(processRecoveryActionsEEnum, ProcessRecoveryActions.PARTITION_WARM_RESTART);
		addEEnumLiteral(processRecoveryActionsEEnum, ProcessRecoveryActions.PARTITION_SET_IDLE);
	}

} //HealthmanagementPackageImpl
