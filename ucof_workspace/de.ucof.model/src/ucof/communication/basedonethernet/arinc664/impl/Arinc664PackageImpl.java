/**
 */
package ucof.communication.basedonethernet.arinc664.impl;

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

import ucof.communication.basedonethernet.arinc664.A664Bus;
import ucof.communication.basedonethernet.arinc664.A664Message;
import ucof.communication.basedonethernet.arinc664.A664VirtualLinkIn;
import ucof.communication.basedonethernet.arinc664.A664VirtualLinkOut;
import ucof.communication.basedonethernet.arinc664.A664VirtualLinkSuper;
import ucof.communication.basedonethernet.arinc664.Arinc664Factory;
import ucof.communication.basedonethernet.arinc664.Arinc664Package;

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
public class Arinc664PackageImpl extends EPackageImpl implements Arinc664Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass a664BusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass a664VirtualLinkSuperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass a664VirtualLinkInEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass a664VirtualLinkOutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass a664MessageEClass = null;

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
	 * @see ucof.communication.basedonethernet.arinc664.Arinc664Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Arinc664PackageImpl() {
		super(eNS_URI, Arinc664Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Arinc664Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Arinc664Package init() {
		if (isInited) return (Arinc664Package)EPackage.Registry.INSTANCE.getEPackage(Arinc664Package.eNS_URI);

		// Obtain or create and register package
		Object registeredArinc664Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Arinc664PackageImpl theArinc664Package = registeredArinc664Package instanceof Arinc664PackageImpl ? (Arinc664PackageImpl)registeredArinc664Package : new Arinc664PackageImpl();

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
		theArinc664Package.createPackageContents();
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
		theArinc664Package.initializePackageContents();
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
		theArinc664Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Arinc664Package.eNS_URI, theArinc664Package);
		return theArinc664Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getA664Bus() {
		return a664BusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getA664Bus_VirtualLink() {
		return (EReference)a664BusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getA664VirtualLinkSuper() {
		return a664VirtualLinkSuperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getA664VirtualLinkIn() {
		return a664VirtualLinkInEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA664VirtualLinkIn_MaxSkew() {
		return (EAttribute)a664VirtualLinkInEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getA664VirtualLinkOut() {
		return a664VirtualLinkOutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA664VirtualLinkOut_BAG() {
		return (EAttribute)a664VirtualLinkOutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA664VirtualLinkOut_MaxFrameSize() {
		return (EAttribute)a664VirtualLinkOutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA664VirtualLinkOut_OverSampling() {
		return (EAttribute)a664VirtualLinkOutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA664VirtualLinkOut_Phase() {
		return (EAttribute)a664VirtualLinkOutEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getA664Message() {
		return a664MessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA664Message_DestinationMAC() {
		return (EAttribute)a664MessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA664Message_SourceMAC() {
		return (EAttribute)a664MessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA664Message_EtherType() {
		return (EAttribute)a664MessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA664Message_SourceIP() {
		return (EAttribute)a664MessageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA664Message_DestinationIP() {
		return (EAttribute)a664MessageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA664Message_DestinationPort() {
		return (EAttribute)a664MessageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA664Message_SourcePort() {
		return (EAttribute)a664MessageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA664Message_TTL() {
		return (EAttribute)a664MessageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA664Message_Protocol() {
		return (EAttribute)a664MessageEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA664Message_EthernetIdentification() {
		return (EAttribute)a664MessageEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA664Message_FlagsAndFragmentOffset() {
		return (EAttribute)a664MessageEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA664Message_VersionAndIHL() {
		return (EAttribute)a664MessageEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA664Message_TypeOfService() {
		return (EAttribute)a664MessageEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA664Message_VirtualLink() {
		return (EAttribute)a664MessageEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA664Message_VirtualLinkOffset() {
		return (EAttribute)a664MessageEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arinc664Factory getArinc664Factory() {
		return (Arinc664Factory)getEFactoryInstance();
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
		a664BusEClass = createEClass(A664_BUS);
		createEReference(a664BusEClass, A664_BUS__VIRTUAL_LINK);

		a664VirtualLinkSuperEClass = createEClass(A664_VIRTUAL_LINK_SUPER);

		a664VirtualLinkInEClass = createEClass(A664_VIRTUAL_LINK_IN);
		createEAttribute(a664VirtualLinkInEClass, A664_VIRTUAL_LINK_IN__MAX_SKEW);

		a664VirtualLinkOutEClass = createEClass(A664_VIRTUAL_LINK_OUT);
		createEAttribute(a664VirtualLinkOutEClass, A664_VIRTUAL_LINK_OUT__BAG);
		createEAttribute(a664VirtualLinkOutEClass, A664_VIRTUAL_LINK_OUT__MAX_FRAME_SIZE);
		createEAttribute(a664VirtualLinkOutEClass, A664_VIRTUAL_LINK_OUT__OVER_SAMPLING);
		createEAttribute(a664VirtualLinkOutEClass, A664_VIRTUAL_LINK_OUT__PHASE);

		a664MessageEClass = createEClass(A664_MESSAGE);
		createEAttribute(a664MessageEClass, A664_MESSAGE__DESTINATION_MAC);
		createEAttribute(a664MessageEClass, A664_MESSAGE__SOURCE_MAC);
		createEAttribute(a664MessageEClass, A664_MESSAGE__ETHER_TYPE);
		createEAttribute(a664MessageEClass, A664_MESSAGE__SOURCE_IP);
		createEAttribute(a664MessageEClass, A664_MESSAGE__DESTINATION_IP);
		createEAttribute(a664MessageEClass, A664_MESSAGE__DESTINATION_PORT);
		createEAttribute(a664MessageEClass, A664_MESSAGE__SOURCE_PORT);
		createEAttribute(a664MessageEClass, A664_MESSAGE__TTL);
		createEAttribute(a664MessageEClass, A664_MESSAGE__PROTOCOL);
		createEAttribute(a664MessageEClass, A664_MESSAGE__ETHERNET_IDENTIFICATION);
		createEAttribute(a664MessageEClass, A664_MESSAGE__FLAGS_AND_FRAGMENT_OFFSET);
		createEAttribute(a664MessageEClass, A664_MESSAGE__VERSION_AND_IHL);
		createEAttribute(a664MessageEClass, A664_MESSAGE__TYPE_OF_SERVICE);
		createEAttribute(a664MessageEClass, A664_MESSAGE__VIRTUAL_LINK);
		createEAttribute(a664MessageEClass, A664_MESSAGE__VIRTUAL_LINK_OFFSET);
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
		BasedonethernetPackage theBasedonethernetPackage = (BasedonethernetPackage)EPackage.Registry.INSTANCE.getEPackage(BasedonethernetPackage.eNS_URI);
		EtypesPackage theEtypesPackage = (EtypesPackage)EPackage.Registry.INSTANCE.getEPackage(EtypesPackage.eNS_URI);
		EdataPackage theEdataPackage = (EdataPackage)EPackage.Registry.INSTANCE.getEPackage(EdataPackage.eNS_URI);
		CommunicationPackage theCommunicationPackage = (CommunicationPackage)EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		a664BusEClass.getESuperTypes().add(theBasedonethernetPackage.getEthernetPort());
		a664VirtualLinkSuperEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		a664VirtualLinkSuperEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());
		a664VirtualLinkInEClass.getESuperTypes().add(this.getA664VirtualLinkSuper());
		a664VirtualLinkOutEClass.getESuperTypes().add(this.getA664VirtualLinkSuper());
		a664MessageEClass.getESuperTypes().add(theCommunicationPackage.getSuperMessageType());

		// Initialize classes, features, and operations; add parameters
		initEClass(a664BusEClass, A664Bus.class, "A664Bus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getA664Bus_VirtualLink(), this.getA664VirtualLinkSuper(), null, "virtualLink", null, 0, 1, A664Bus.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(a664VirtualLinkSuperEClass, A664VirtualLinkSuper.class, "A664VirtualLinkSuper", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(a664VirtualLinkInEClass, A664VirtualLinkIn.class, "A664VirtualLinkIn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getA664VirtualLinkIn_MaxSkew(), theEdataPackage.getDecOrHexValueType(), "maxSkew", null, 0, 1, A664VirtualLinkIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(a664VirtualLinkOutEClass, A664VirtualLinkOut.class, "A664VirtualLinkOut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getA664VirtualLinkOut_BAG(), theEdataPackage.getDecOrHexValueType(), "bAG", null, 0, 1, A664VirtualLinkOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getA664VirtualLinkOut_MaxFrameSize(), theEdataPackage.getDecOrHexValueType(), "maxFrameSize", null, 0, 1, A664VirtualLinkOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getA664VirtualLinkOut_OverSampling(), theEdataPackage.getDecOrHexValueType(), "overSampling", null, 0, 1, A664VirtualLinkOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getA664VirtualLinkOut_Phase(), theEdataPackage.getDecOrHexValueType(), "phase", null, 0, 1, A664VirtualLinkOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(a664MessageEClass, A664Message.class, "A664Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getA664Message_DestinationMAC(), theEdataPackage.getMACAddressType(), "destinationMAC", null, 0, 1, A664Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getA664Message_SourceMAC(), theEdataPackage.getMACAddressType(), "sourceMAC", null, 0, 1, A664Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getA664Message_EtherType(), theEdataPackage.getEtherType(), "etherType", null, 0, 1, A664Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getA664Message_SourceIP(), theEdataPackage.getIPAddressType(), "sourceIP", null, 0, 1, A664Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getA664Message_DestinationIP(), theEdataPackage.getIPAddressType(), "destinationIP", null, 0, 1, A664Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getA664Message_DestinationPort(), theEdataPackage.getPortType(), "destinationPort", null, 0, 1, A664Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getA664Message_SourcePort(), theEdataPackage.getPortType(), "sourcePort", null, 0, 1, A664Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getA664Message_TTL(), theEdataPackage.getPositiveIntType(), "TTL", null, 0, 1, A664Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getA664Message_Protocol(), theEdataPackage.getPositiveIntType(), "Protocol", null, 0, 1, A664Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getA664Message_EthernetIdentification(), theEdataPackage.getPositiveIntType(), "ethernetIdentification", null, 0, 1, A664Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getA664Message_FlagsAndFragmentOffset(), theEdataPackage.getPositiveIntType(), "flagsAndFragmentOffset", null, 0, 1, A664Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getA664Message_VersionAndIHL(), theEdataPackage.getPositiveIntType(), "versionAndIHL", null, 0, 1, A664Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getA664Message_TypeOfService(), theEdataPackage.getPositiveIntType(), "typeOfService", null, 0, 1, A664Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getA664Message_VirtualLink(), theEdataPackage.getPositiveIntType(), "virtualLink", null, 0, 1, A664Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getA664Message_VirtualLinkOffset(), theEdataPackage.getPositiveIntType(), "virtualLinkOffset", null, 0, 1, A664Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //Arinc664PackageImpl
