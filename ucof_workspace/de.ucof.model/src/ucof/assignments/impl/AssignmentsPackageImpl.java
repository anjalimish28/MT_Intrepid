/**
 */
package ucof.assignments.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import targets.TargetsPackage;

import targets.adc.AdcPackage;

import targets.adc.impl.AdcPackageImpl;

import targets.cantransceiver.CantransceiverPackage;

import targets.cantransceiver.impl.CantransceiverPackageImpl;

import targets.cpn.CpnPackage;

import targets.cpn.impl.CpnPackageImpl;

import targets.hallsensor.HallsensorPackage;

import targets.hallsensor.impl.HallsensorPackageImpl;

import targets.impl.TargetsPackageImpl;

import targets.intrepidgateway.IntrepidgatewayPackage;

import targets.intrepidgateway.impl.IntrepidgatewayPackageImpl;

import targets.intrepidpowergrid.IntrepidpowergridPackage;

import targets.intrepidpowergrid.impl.IntrepidpowergridPackageImpl;

import targets.motorcontroller.MotorcontrollerPackage;

import targets.motorcontroller.impl.MotorcontrollerPackageImpl;

import targets.powergrid.PowergridPackage;

import targets.powergrid.impl.PowergridPackageImpl;

import targets.rdc.RdcPackage;

import targets.rdc.impl.RdcPackageImpl;

import targets.sheild.SheildPackage;

import targets.sheild.impl.SheildPackageImpl;

import ucof.UcofPackage;

import ucof.assignments.Assignments;
import ucof.assignments.AssignmentsFactory;
import ucof.assignments.AssignmentsPackage;
import ucof.assignments.DeviceToImplementationAssignment;
import ucof.assignments.DeviceToImplementationAssignmentSet;
import ucof.assignments.ED247Assignment;
import ucof.assignments.ED247AssignmentSet;
import ucof.assignments.InterfaceToHardwareAssignment;
import ucof.assignments.InterfaceToHardwareAssignmentSet;
import ucof.assignments.InterfaceToPort2PortAssignment;
import ucof.assignments.InterfaceToPort2PortAssignmentSet;
import ucof.assignments.PortToPortAssignment;
import ucof.assignments.PortToPortAssignmentSet;
import ucof.assignments.SWPortToHWPortAssignment;
import ucof.assignments.SWPortToHWPortAssignmentSet;
import ucof.assignments.SuperAssignmentSetType;
import ucof.assignments.SuperAssignmentType;
import ucof.assignments.UDPSocketExtension;

import ucof.assignments.database.DatabasePackage;

import ucof.assignments.database.impl.DatabasePackageImpl;

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

import ucof.devices.ports.PortsPackage;

import ucof.devices.ports.impl.PortsPackageImpl;

import ucof.impl.UcofPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssignmentsPackageImpl extends EPackageImpl implements AssignmentsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superAssignmentSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superAssignmentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceToPort2PortAssignmentSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceToPort2PortAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceToImplementationAssignmentSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceToImplementationAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceToHardwareAssignmentSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceToHardwareAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portToPortAssignmentSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portToPortAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ed247AssignmentSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ed247AssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass udpSocketExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swPortToHWPortAssignmentSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swPortToHWPortAssignmentEClass = null;

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
	 * @see ucof.assignments.AssignmentsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AssignmentsPackageImpl() {
		super(eNS_URI, AssignmentsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AssignmentsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AssignmentsPackage init() {
		if (isInited) return (AssignmentsPackage)EPackage.Registry.INSTANCE.getEPackage(AssignmentsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAssignmentsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AssignmentsPackageImpl theAssignmentsPackage = registeredAssignmentsPackage instanceof AssignmentsPackageImpl ? (AssignmentsPackageImpl)registeredAssignmentsPackage : new AssignmentsPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PackageStrategyTypesPackage.eNS_URI);
		PackageStrategyTypesPackageImpl thePackageStrategyTypesPackage = (PackageStrategyTypesPackageImpl)(registeredPackage instanceof PackageStrategyTypesPackageImpl ? registeredPackage : PackageStrategyTypesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ComDevicesPackage.eNS_URI);
		ComDevicesPackageImpl theComDevicesPackage = (ComDevicesPackageImpl)(registeredPackage instanceof ComDevicesPackageImpl ? registeredPackage : ComDevicesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(I2cPackage.eNS_URI);
		I2cPackageImpl theI2cPackage = (I2cPackageImpl)(registeredPackage instanceof I2cPackageImpl ? registeredPackage : I2cPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DatabasePackage.eNS_URI);
		DatabasePackageImpl theDatabasePackage = (DatabasePackageImpl)(registeredPackage instanceof DatabasePackageImpl ? registeredPackage : DatabasePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TargetsPackage.eNS_URI);
		TargetsPackageImpl theTargetsPackage = (TargetsPackageImpl)(registeredPackage instanceof TargetsPackageImpl ? registeredPackage : TargetsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PowergridPackage.eNS_URI);
		PowergridPackageImpl thePowergridPackage = (PowergridPackageImpl)(registeredPackage instanceof PowergridPackageImpl ? registeredPackage : PowergridPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RdcPackage.eNS_URI);
		RdcPackageImpl theRdcPackage = (RdcPackageImpl)(registeredPackage instanceof RdcPackageImpl ? registeredPackage : RdcPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AdcPackage.eNS_URI);
		AdcPackageImpl theAdcPackage = (AdcPackageImpl)(registeredPackage instanceof AdcPackageImpl ? registeredPackage : AdcPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SheildPackage.eNS_URI);
		SheildPackageImpl theSheildPackage = (SheildPackageImpl)(registeredPackage instanceof SheildPackageImpl ? registeredPackage : SheildPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MotorcontrollerPackage.eNS_URI);
		MotorcontrollerPackageImpl theMotorcontrollerPackage = (MotorcontrollerPackageImpl)(registeredPackage instanceof MotorcontrollerPackageImpl ? registeredPackage : MotorcontrollerPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CantransceiverPackage.eNS_URI);
		CantransceiverPackageImpl theCantransceiverPackage = (CantransceiverPackageImpl)(registeredPackage instanceof CantransceiverPackageImpl ? registeredPackage : CantransceiverPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(HallsensorPackage.eNS_URI);
		HallsensorPackageImpl theHallsensorPackage = (HallsensorPackageImpl)(registeredPackage instanceof HallsensorPackageImpl ? registeredPackage : HallsensorPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CpnPackage.eNS_URI);
		CpnPackageImpl theCpnPackage = (CpnPackageImpl)(registeredPackage instanceof CpnPackageImpl ? registeredPackage : CpnPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(IntrepidpowergridPackage.eNS_URI);
		IntrepidpowergridPackageImpl theIntrepidpowergridPackage = (IntrepidpowergridPackageImpl)(registeredPackage instanceof IntrepidpowergridPackageImpl ? registeredPackage : IntrepidpowergridPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(IntrepidgatewayPackage.eNS_URI);
		IntrepidgatewayPackageImpl theIntrepidgatewayPackage = (IntrepidgatewayPackageImpl)(registeredPackage instanceof IntrepidgatewayPackageImpl ? registeredPackage : IntrepidgatewayPackage.eINSTANCE);

		// Create package meta-data objects
		theAssignmentsPackage.createPackageContents();
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
		thePackageStrategyTypesPackage.createPackageContents();
		theComDevicesPackage.createPackageContents();
		theI2cPackage.createPackageContents();
		theDatabasePackage.createPackageContents();
		theTargetsPackage.createPackageContents();
		thePowergridPackage.createPackageContents();
		theRdcPackage.createPackageContents();
		theAdcPackage.createPackageContents();
		theSheildPackage.createPackageContents();
		theMotorcontrollerPackage.createPackageContents();
		theCantransceiverPackage.createPackageContents();
		theHallsensorPackage.createPackageContents();
		theCpnPackage.createPackageContents();
		theIntrepidpowergridPackage.createPackageContents();
		theIntrepidgatewayPackage.createPackageContents();

		// Initialize created meta-data
		theAssignmentsPackage.initializePackageContents();
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
		thePackageStrategyTypesPackage.initializePackageContents();
		theComDevicesPackage.initializePackageContents();
		theI2cPackage.initializePackageContents();
		theDatabasePackage.initializePackageContents();
		theTargetsPackage.initializePackageContents();
		thePowergridPackage.initializePackageContents();
		theRdcPackage.initializePackageContents();
		theAdcPackage.initializePackageContents();
		theSheildPackage.initializePackageContents();
		theMotorcontrollerPackage.initializePackageContents();
		theCantransceiverPackage.initializePackageContents();
		theHallsensorPackage.initializePackageContents();
		theCpnPackage.initializePackageContents();
		theIntrepidpowergridPackage.initializePackageContents();
		theIntrepidgatewayPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAssignmentsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AssignmentsPackage.eNS_URI, theAssignmentsPackage);
		return theAssignmentsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignments() {
		return assignmentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignments_AssignmentSet() {
		return (EReference)assignmentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperAssignmentSetType() {
		return superAssignmentSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperAssignmentType() {
		return superAssignmentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSuperAssignmentType_SourceID() {
		return (EAttribute)superAssignmentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSuperAssignmentType_TargetID() {
		return (EAttribute)superAssignmentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceToPort2PortAssignmentSet() {
		return interfaceToPort2PortAssignmentSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceToPort2PortAssignmentSet_InterfaceToPortAssignment() {
		return (EReference)interfaceToPort2PortAssignmentSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceToPort2PortAssignment() {
		return interfaceToPort2PortAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceToImplementationAssignmentSet() {
		return deviceToImplementationAssignmentSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceToImplementationAssignmentSet_DeviceToImplementationAssignment() {
		return (EReference)deviceToImplementationAssignmentSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceToImplementationAssignment() {
		return deviceToImplementationAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceToHardwareAssignmentSet() {
		return interfaceToHardwareAssignmentSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceToHardwareAssignmentSet_InterfaceToHardwareAssignment() {
		return (EReference)interfaceToHardwareAssignmentSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceToHardwareAssignment() {
		return interfaceToHardwareAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortToPortAssignmentSet() {
		return portToPortAssignmentSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortToPortAssignmentSet_PortToPortAssignment() {
		return (EReference)portToPortAssignmentSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortToPortAssignment() {
		return portToPortAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortToPortAssignment_TransmissionRate() {
		return (EAttribute)portToPortAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortToPortAssignment_RefreshRate() {
		return (EAttribute)portToPortAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getED247AssignmentSet() {
		return ed247AssignmentSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getED247AssignmentSet_Ed247Assignment() {
		return (EReference)ed247AssignmentSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getED247Assignment() {
		return ed247AssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getED247Assignment_UdpSocketExtension() {
		return (EReference)ed247AssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUDPSocketExtension() {
		return udpSocketExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUDPSocketExtension_PortSelection() {
		return (EAttribute)udpSocketExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUDPSocketExtension_IpAdress() {
		return (EAttribute)udpSocketExtensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUDPSocketExtension_Port() {
		return (EAttribute)udpSocketExtensionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSWPortToHWPortAssignmentSet() {
		return swPortToHWPortAssignmentSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSWPortToHWPortAssignmentSet_SwPortToHWPortAssignment() {
		return (EReference)swPortToHWPortAssignmentSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSWPortToHWPortAssignment() {
		return swPortToHWPortAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentsFactory getAssignmentsFactory() {
		return (AssignmentsFactory)getEFactoryInstance();
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
		assignmentsEClass = createEClass(ASSIGNMENTS);
		createEReference(assignmentsEClass, ASSIGNMENTS__ASSIGNMENT_SET);

		superAssignmentSetTypeEClass = createEClass(SUPER_ASSIGNMENT_SET_TYPE);

		superAssignmentTypeEClass = createEClass(SUPER_ASSIGNMENT_TYPE);
		createEAttribute(superAssignmentTypeEClass, SUPER_ASSIGNMENT_TYPE__SOURCE_ID);
		createEAttribute(superAssignmentTypeEClass, SUPER_ASSIGNMENT_TYPE__TARGET_ID);

		interfaceToPort2PortAssignmentSetEClass = createEClass(INTERFACE_TO_PORT2_PORT_ASSIGNMENT_SET);
		createEReference(interfaceToPort2PortAssignmentSetEClass, INTERFACE_TO_PORT2_PORT_ASSIGNMENT_SET__INTERFACE_TO_PORT_ASSIGNMENT);

		interfaceToPort2PortAssignmentEClass = createEClass(INTERFACE_TO_PORT2_PORT_ASSIGNMENT);

		deviceToImplementationAssignmentSetEClass = createEClass(DEVICE_TO_IMPLEMENTATION_ASSIGNMENT_SET);
		createEReference(deviceToImplementationAssignmentSetEClass, DEVICE_TO_IMPLEMENTATION_ASSIGNMENT_SET__DEVICE_TO_IMPLEMENTATION_ASSIGNMENT);

		deviceToImplementationAssignmentEClass = createEClass(DEVICE_TO_IMPLEMENTATION_ASSIGNMENT);

		interfaceToHardwareAssignmentSetEClass = createEClass(INTERFACE_TO_HARDWARE_ASSIGNMENT_SET);
		createEReference(interfaceToHardwareAssignmentSetEClass, INTERFACE_TO_HARDWARE_ASSIGNMENT_SET__INTERFACE_TO_HARDWARE_ASSIGNMENT);

		interfaceToHardwareAssignmentEClass = createEClass(INTERFACE_TO_HARDWARE_ASSIGNMENT);

		portToPortAssignmentSetEClass = createEClass(PORT_TO_PORT_ASSIGNMENT_SET);
		createEReference(portToPortAssignmentSetEClass, PORT_TO_PORT_ASSIGNMENT_SET__PORT_TO_PORT_ASSIGNMENT);

		portToPortAssignmentEClass = createEClass(PORT_TO_PORT_ASSIGNMENT);
		createEAttribute(portToPortAssignmentEClass, PORT_TO_PORT_ASSIGNMENT__TRANSMISSION_RATE);
		createEAttribute(portToPortAssignmentEClass, PORT_TO_PORT_ASSIGNMENT__REFRESH_RATE);

		ed247AssignmentSetEClass = createEClass(ED247_ASSIGNMENT_SET);
		createEReference(ed247AssignmentSetEClass, ED247_ASSIGNMENT_SET__ED247_ASSIGNMENT);

		ed247AssignmentEClass = createEClass(ED247_ASSIGNMENT);
		createEReference(ed247AssignmentEClass, ED247_ASSIGNMENT__UDP_SOCKET_EXTENSION);

		udpSocketExtensionEClass = createEClass(UDP_SOCKET_EXTENSION);
		createEAttribute(udpSocketExtensionEClass, UDP_SOCKET_EXTENSION__PORT_SELECTION);
		createEAttribute(udpSocketExtensionEClass, UDP_SOCKET_EXTENSION__IP_ADRESS);
		createEAttribute(udpSocketExtensionEClass, UDP_SOCKET_EXTENSION__PORT);

		swPortToHWPortAssignmentSetEClass = createEClass(SW_PORT_TO_HW_PORT_ASSIGNMENT_SET);
		createEReference(swPortToHWPortAssignmentSetEClass, SW_PORT_TO_HW_PORT_ASSIGNMENT_SET__SW_PORT_TO_HW_PORT_ASSIGNMENT);

		swPortToHWPortAssignmentEClass = createEClass(SW_PORT_TO_HW_PORT_ASSIGNMENT);
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
		DatabasePackage theDatabasePackage = (DatabasePackage)EPackage.Registry.INSTANCE.getEPackage(DatabasePackage.eNS_URI);
		EtypesPackage theEtypesPackage = (EtypesPackage)EPackage.Registry.INSTANCE.getEPackage(EtypesPackage.eNS_URI);
		EdataPackage theEdataPackage = (EdataPackage)EPackage.Registry.INSTANCE.getEPackage(EdataPackage.eNS_URI);
		EnumsPackage theEnumsPackage = (EnumsPackage)EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theDatabasePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		assignmentsEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		assignmentsEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());
		superAssignmentSetTypeEClass.getESuperTypes().add(theEtypesPackage.getSuperSetType());
		superAssignmentTypeEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		superAssignmentTypeEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());
		interfaceToPort2PortAssignmentSetEClass.getESuperTypes().add(this.getSuperAssignmentSetType());
		interfaceToPort2PortAssignmentEClass.getESuperTypes().add(this.getSuperAssignmentType());
		deviceToImplementationAssignmentSetEClass.getESuperTypes().add(this.getSuperAssignmentSetType());
		deviceToImplementationAssignmentEClass.getESuperTypes().add(this.getSuperAssignmentType());
		interfaceToHardwareAssignmentSetEClass.getESuperTypes().add(this.getSuperAssignmentSetType());
		interfaceToHardwareAssignmentEClass.getESuperTypes().add(this.getSuperAssignmentType());
		portToPortAssignmentSetEClass.getESuperTypes().add(this.getSuperAssignmentSetType());
		portToPortAssignmentEClass.getESuperTypes().add(this.getSuperAssignmentType());
		ed247AssignmentSetEClass.getESuperTypes().add(this.getSuperAssignmentSetType());
		ed247AssignmentEClass.getESuperTypes().add(this.getSuperAssignmentType());
		udpSocketExtensionEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		udpSocketExtensionEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());
		swPortToHWPortAssignmentSetEClass.getESuperTypes().add(this.getSuperAssignmentSetType());
		swPortToHWPortAssignmentEClass.getESuperTypes().add(this.getSuperAssignmentType());

		// Initialize classes, features, and operations; add parameters
		initEClass(assignmentsEClass, Assignments.class, "Assignments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssignments_AssignmentSet(), this.getSuperAssignmentSetType(), null, "assignmentSet", null, 0, -1, Assignments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(superAssignmentSetTypeEClass, SuperAssignmentSetType.class, "SuperAssignmentSetType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(superAssignmentTypeEClass, SuperAssignmentType.class, "SuperAssignmentType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSuperAssignmentType_SourceID(), theEdataPackage.getUUIDType(), "sourceID", null, 0, 1, SuperAssignmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSuperAssignmentType_TargetID(), theEdataPackage.getUUIDType(), "targetID", null, 0, 1, SuperAssignmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceToPort2PortAssignmentSetEClass, InterfaceToPort2PortAssignmentSet.class, "InterfaceToPort2PortAssignmentSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceToPort2PortAssignmentSet_InterfaceToPortAssignment(), this.getInterfaceToPort2PortAssignment(), null, "interfaceToPortAssignment", null, 0, -1, InterfaceToPort2PortAssignmentSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceToPort2PortAssignmentEClass, InterfaceToPort2PortAssignment.class, "InterfaceToPort2PortAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deviceToImplementationAssignmentSetEClass, DeviceToImplementationAssignmentSet.class, "DeviceToImplementationAssignmentSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceToImplementationAssignmentSet_DeviceToImplementationAssignment(), this.getDeviceToImplementationAssignment(), null, "deviceToImplementationAssignment", null, 0, -1, DeviceToImplementationAssignmentSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceToImplementationAssignmentEClass, DeviceToImplementationAssignment.class, "DeviceToImplementationAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interfaceToHardwareAssignmentSetEClass, InterfaceToHardwareAssignmentSet.class, "InterfaceToHardwareAssignmentSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceToHardwareAssignmentSet_InterfaceToHardwareAssignment(), this.getInterfaceToHardwareAssignment(), null, "interfaceToHardwareAssignment", null, 0, -1, InterfaceToHardwareAssignmentSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceToHardwareAssignmentEClass, InterfaceToHardwareAssignment.class, "InterfaceToHardwareAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portToPortAssignmentSetEClass, PortToPortAssignmentSet.class, "PortToPortAssignmentSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortToPortAssignmentSet_PortToPortAssignment(), this.getPortToPortAssignment(), null, "portToPortAssignment", null, 0, -1, PortToPortAssignmentSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portToPortAssignmentEClass, PortToPortAssignment.class, "PortToPortAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPortToPortAssignment_TransmissionRate(), ecorePackage.getEFloat(), "transmissionRate", null, 0, 1, PortToPortAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortToPortAssignment_RefreshRate(), ecorePackage.getEFloat(), "refreshRate", null, 0, 1, PortToPortAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ed247AssignmentSetEClass, ED247AssignmentSet.class, "ED247AssignmentSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getED247AssignmentSet_Ed247Assignment(), this.getED247Assignment(), null, "ed247Assignment", null, 0, -1, ED247AssignmentSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ed247AssignmentEClass, ED247Assignment.class, "ED247Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getED247Assignment_UdpSocketExtension(), this.getUDPSocketExtension(), null, "udpSocketExtension", null, 0, 2, ED247Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(udpSocketExtensionEClass, UDPSocketExtension.class, "UDPSocketExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUDPSocketExtension_PortSelection(), theEnumsPackage.getSingleDirectionType(), "portSelection", null, 0, 1, UDPSocketExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUDPSocketExtension_IpAdress(), theEdataPackage.getIPAddressType(), "ipAdress", null, 0, 1, UDPSocketExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUDPSocketExtension_Port(), theEdataPackage.getPortType(), "port", null, 0, 1, UDPSocketExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swPortToHWPortAssignmentSetEClass, SWPortToHWPortAssignmentSet.class, "SWPortToHWPortAssignmentSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSWPortToHWPortAssignmentSet_SwPortToHWPortAssignment(), this.getSWPortToHWPortAssignment(), null, "swPortToHWPortAssignment", null, 0, -1, SWPortToHWPortAssignmentSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swPortToHWPortAssignmentEClass, SWPortToHWPortAssignment.class, "SWPortToHWPortAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //AssignmentsPackageImpl
