/**
 */
package ucof.devices.ports.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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

import ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage;

import ucof.devices.devicetypes.a653components.healthmanagement.impl.HealthmanagementPackageImpl;

import ucof.devices.devicetypes.a653components.impl.A653componentsPackageImpl;

import ucof.devices.devicetypes.impl.DevicetypesPackageImpl;

import ucof.devices.functions.FunctionsPackage;

import ucof.devices.functions.impl.FunctionsPackageImpl;

import ucof.devices.functions.routing.RoutingPackage;

import ucof.devices.functions.routing.impl.RoutingPackageImpl;

import ucof.devices.impl.DevicesPackageImpl;

import ucof.devices.ports.Blackboard;
import ucof.devices.ports.Buffer;
import ucof.devices.ports.PartitionPorts;
import ucof.devices.ports.PortsFactory;
import ucof.devices.ports.PortsPackage;
import ucof.devices.ports.ProcessPorts;
import ucof.devices.ports.SuperIntraCommunicationPortType;
import ucof.impl.UcofPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PortsPackageImpl extends EPackageImpl implements PortsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processPortsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superIntraCommunicationPortTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partitionPortsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blackboardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bufferEClass = null;

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
	 * @see ucof.devices.ports.PortsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PortsPackageImpl() {
		super(eNS_URI, PortsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PortsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PortsPackage init() {
		if (isInited) return (PortsPackage)EPackage.Registry.INSTANCE.getEPackage(PortsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPortsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PortsPackageImpl thePortsPackage = registeredPortsPackage instanceof PortsPackageImpl ? (PortsPackageImpl)registeredPortsPackage : new PortsPackageImpl();

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
		thePortsPackage.createPackageContents();
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
		thePortsPackage.initializePackageContents();
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
		thePortsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PortsPackage.eNS_URI, thePortsPackage);
		return thePortsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessPorts() {
		return processPortsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessPorts_Port() {
		return (EReference)processPortsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperIntraCommunicationPortType() {
		return superIntraCommunicationPortTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartitionPorts() {
		return partitionPortsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartitionPorts_Port() {
		return (EReference)partitionPortsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlackboard() {
		return blackboardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuffer() {
		return bufferEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuffer_MaxNumberOfMessages() {
		return (EAttribute)bufferEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortsFactory getPortsFactory() {
		return (PortsFactory)getEFactoryInstance();
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
		partitionPortsEClass = createEClass(PARTITION_PORTS);
		createEReference(partitionPortsEClass, PARTITION_PORTS__PORT);

		processPortsEClass = createEClass(PROCESS_PORTS);
		createEReference(processPortsEClass, PROCESS_PORTS__PORT);

		superIntraCommunicationPortTypeEClass = createEClass(SUPER_INTRA_COMMUNICATION_PORT_TYPE);

		blackboardEClass = createEClass(BLACKBOARD);

		bufferEClass = createEClass(BUFFER);
		createEAttribute(bufferEClass, BUFFER__MAX_NUMBER_OF_MESSAGES);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		partitionPortsEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());
		partitionPortsEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		processPortsEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());
		processPortsEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		superIntraCommunicationPortTypeEClass.getESuperTypes().add(theEtypesPackage.getSuperPortType());
		blackboardEClass.getESuperTypes().add(this.getSuperIntraCommunicationPortType());
		bufferEClass.getESuperTypes().add(this.getSuperIntraCommunicationPortType());

		// Initialize classes, features, and operations; add parameters
		initEClass(partitionPortsEClass, PartitionPorts.class, "PartitionPorts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartitionPorts_Port(), theEtypesPackage.getSuperInterCommunicationPortType(), null, "port", null, 0, -1, PartitionPorts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processPortsEClass, ProcessPorts.class, "ProcessPorts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessPorts_Port(), this.getSuperIntraCommunicationPortType(), null, "port", null, 0, -1, ProcessPorts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(superIntraCommunicationPortTypeEClass, SuperIntraCommunicationPortType.class, "SuperIntraCommunicationPortType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blackboardEClass, Blackboard.class, "Blackboard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bufferEClass, Buffer.class, "Buffer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBuffer_MaxNumberOfMessages(), theEdataPackage.getDecOrHexValueType(), "maxNumberOfMessages", null, 0, 1, Buffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //PortsPackageImpl
