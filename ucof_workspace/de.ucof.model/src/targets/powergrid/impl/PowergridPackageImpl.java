/**
 */
package targets.powergrid.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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

import targets.powergrid.ElectricalPowerGridSet;
import targets.powergrid.EletrcialInterfaces;
import targets.powergrid.PowerConnection;
import targets.powergrid.PowerConnectionSet;
import targets.powergrid.PowergridFactory;
import targets.powergrid.PowergridPackage;
import targets.powergrid.SuperElectricalGridType;
import targets.powergrid.SuperElectricalInterfaceType;
import targets.powergrid.SuperPowerType;
import targets.powergrid.gridType;
import targets.powergrid.interfaceType;

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
public class PowergridPackageImpl extends EPackageImpl implements PowergridPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superPowerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eletrcialInterfacesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superElectricalInterfaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superElectricalGridTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerConnectionSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass electricalPowerGridSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum interfaceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gridTypeEEnum = null;

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
	 * @see targets.powergrid.PowergridPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PowergridPackageImpl() {
		super(eNS_URI, PowergridFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PowergridPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PowergridPackage init() {
		if (isInited) return (PowergridPackage)EPackage.Registry.INSTANCE.getEPackage(PowergridPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPowergridPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PowergridPackageImpl thePowergridPackage = registeredPowergridPackage instanceof PowergridPackageImpl ? (PowergridPackageImpl)registeredPowergridPackage : new PowergridPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AssignmentsPackage.eNS_URI);
		AssignmentsPackageImpl theAssignmentsPackage = (AssignmentsPackageImpl)(registeredPackage instanceof AssignmentsPackageImpl ? registeredPackage : AssignmentsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DatabasePackage.eNS_URI);
		DatabasePackageImpl theDatabasePackage = (DatabasePackageImpl)(registeredPackage instanceof DatabasePackageImpl ? registeredPackage : DatabasePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TargetsPackage.eNS_URI);
		TargetsPackageImpl theTargetsPackage = (TargetsPackageImpl)(registeredPackage instanceof TargetsPackageImpl ? registeredPackage : TargetsPackage.eINSTANCE);
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
		thePowergridPackage.createPackageContents();
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
		theAssignmentsPackage.createPackageContents();
		theDatabasePackage.createPackageContents();
		theTargetsPackage.createPackageContents();
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
		thePowergridPackage.initializePackageContents();
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
		theAssignmentsPackage.initializePackageContents();
		theDatabasePackage.initializePackageContents();
		theTargetsPackage.initializePackageContents();
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
		thePowergridPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PowergridPackage.eNS_URI, thePowergridPackage);
		return thePowergridPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperPowerType() {
		return superPowerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuperPowerType_ElectricalInterfaces() {
		return (EReference)superPowerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEletrcialInterfaces() {
		return eletrcialInterfacesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEletrcialInterfaces_ElectricalInterface() {
		return (EReference)eletrcialInterfacesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperElectricalInterfaceType() {
		return superElectricalInterfaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSuperElectricalInterfaceType_MinVoltage() {
		return (EAttribute)superElectricalInterfaceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSuperElectricalInterfaceType_MaxVoltage() {
		return (EAttribute)superElectricalInterfaceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSuperElectricalInterfaceType_Type() {
		return (EAttribute)superElectricalInterfaceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperElectricalGridType() {
		return superElectricalGridTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSuperElectricalGridType_DefinedVoltage() {
		return (EAttribute)superElectricalGridTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSuperElectricalGridType_NominalVoltage() {
		return (EAttribute)superElectricalGridTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerConnectionSet() {
		return powerConnectionSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerConnectionSet_PowerConnection() {
		return (EReference)powerConnectionSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerConnection() {
		return powerConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerConnection_Resistance() {
		return (EAttribute)powerConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElectricalPowerGridSet() {
		return electricalPowerGridSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElectricalPowerGridSet_ElectricalGrid() {
		return (EReference)electricalPowerGridSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getinterfaceType() {
		return interfaceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getgridType() {
		return gridTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowergridFactory getPowergridFactory() {
		return (PowergridFactory)getEFactoryInstance();
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
		superPowerTypeEClass = createEClass(SUPER_POWER_TYPE);
		createEReference(superPowerTypeEClass, SUPER_POWER_TYPE__ELECTRICAL_INTERFACES);

		eletrcialInterfacesEClass = createEClass(ELETRCIAL_INTERFACES);
		createEReference(eletrcialInterfacesEClass, ELETRCIAL_INTERFACES__ELECTRICAL_INTERFACE);

		superElectricalInterfaceTypeEClass = createEClass(SUPER_ELECTRICAL_INTERFACE_TYPE);
		createEAttribute(superElectricalInterfaceTypeEClass, SUPER_ELECTRICAL_INTERFACE_TYPE__MIN_VOLTAGE);
		createEAttribute(superElectricalInterfaceTypeEClass, SUPER_ELECTRICAL_INTERFACE_TYPE__MAX_VOLTAGE);
		createEAttribute(superElectricalInterfaceTypeEClass, SUPER_ELECTRICAL_INTERFACE_TYPE__TYPE);

		superElectricalGridTypeEClass = createEClass(SUPER_ELECTRICAL_GRID_TYPE);
		createEAttribute(superElectricalGridTypeEClass, SUPER_ELECTRICAL_GRID_TYPE__DEFINED_VOLTAGE);
		createEAttribute(superElectricalGridTypeEClass, SUPER_ELECTRICAL_GRID_TYPE__NOMINAL_VOLTAGE);

		powerConnectionSetEClass = createEClass(POWER_CONNECTION_SET);
		createEReference(powerConnectionSetEClass, POWER_CONNECTION_SET__POWER_CONNECTION);

		powerConnectionEClass = createEClass(POWER_CONNECTION);
		createEAttribute(powerConnectionEClass, POWER_CONNECTION__RESISTANCE);

		electricalPowerGridSetEClass = createEClass(ELECTRICAL_POWER_GRID_SET);
		createEReference(electricalPowerGridSetEClass, ELECTRICAL_POWER_GRID_SET__ELECTRICAL_GRID);

		// Create enums
		interfaceTypeEEnum = createEEnum(INTERFACE_TYPE);
		gridTypeEEnum = createEEnum(GRID_TYPE);
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
		EnumsPackage theEnumsPackage = (EnumsPackage)EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI);
		AssignmentsPackage theAssignmentsPackage = (AssignmentsPackage)EPackage.Registry.INSTANCE.getEPackage(AssignmentsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		superPowerTypeEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		superPowerTypeEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());
		eletrcialInterfacesEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		eletrcialInterfacesEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());
		superElectricalInterfaceTypeEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		superElectricalInterfaceTypeEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());
		superElectricalGridTypeEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		superElectricalGridTypeEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());
		powerConnectionSetEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		powerConnectionSetEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());
		powerConnectionEClass.getESuperTypes().add(theAssignmentsPackage.getSuperAssignmentType());
		electricalPowerGridSetEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		electricalPowerGridSetEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());

		// Initialize classes, features, and operations; add parameters
		initEClass(superPowerTypeEClass, SuperPowerType.class, "SuperPowerType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSuperPowerType_ElectricalInterfaces(), this.getEletrcialInterfaces(), null, "electricalInterfaces", null, 0, 1, SuperPowerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eletrcialInterfacesEClass, EletrcialInterfaces.class, "EletrcialInterfaces", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEletrcialInterfaces_ElectricalInterface(), this.getSuperElectricalInterfaceType(), null, "electricalInterface", null, 0, -1, EletrcialInterfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(superElectricalInterfaceTypeEClass, SuperElectricalInterfaceType.class, "SuperElectricalInterfaceType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSuperElectricalInterfaceType_MinVoltage(), ecorePackage.getEDouble(), "minVoltage", null, 0, 1, SuperElectricalInterfaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSuperElectricalInterfaceType_MaxVoltage(), ecorePackage.getEDouble(), "maxVoltage", null, 0, 1, SuperElectricalInterfaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSuperElectricalInterfaceType_Type(), this.getinterfaceType(), "type", null, 0, 1, SuperElectricalInterfaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(superElectricalGridTypeEClass, SuperElectricalGridType.class, "SuperElectricalGridType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSuperElectricalGridType_DefinedVoltage(), theEnumsPackage.getbooleanType(), "definedVoltage", null, 0, 1, SuperElectricalGridType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSuperElectricalGridType_NominalVoltage(), ecorePackage.getEDouble(), "nominalVoltage", null, 0, 1, SuperElectricalGridType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(powerConnectionSetEClass, PowerConnectionSet.class, "PowerConnectionSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPowerConnectionSet_PowerConnection(), this.getPowerConnection(), null, "powerConnection", null, 0, -1, PowerConnectionSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(powerConnectionEClass, PowerConnection.class, "PowerConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPowerConnection_Resistance(), ecorePackage.getEDouble(), "resistance", null, 0, 1, PowerConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(electricalPowerGridSetEClass, ElectricalPowerGridSet.class, "ElectricalPowerGridSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElectricalPowerGridSet_ElectricalGrid(), this.getSuperElectricalGridType(), null, "electricalGrid", null, 0, -1, ElectricalPowerGridSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(interfaceTypeEEnum, interfaceType.class, "interfaceType");
		addEEnumLiteral(interfaceTypeEEnum, interfaceType.NOT_SET);
		addEEnumLiteral(interfaceTypeEEnum, interfaceType.SINK);
		addEEnumLiteral(interfaceTypeEEnum, interfaceType.SOURCE);
		addEEnumLiteral(interfaceTypeEEnum, interfaceType.SINK_SOURCE);
		addEEnumLiteral(interfaceTypeEEnum, interfaceType.ANALOG_REFERENCE);

		initEEnum(gridTypeEEnum, gridType.class, "gridType");
		addEEnumLiteral(gridTypeEEnum, gridType.NOT_SET);
		addEEnumLiteral(gridTypeEEnum, gridType.SUPPLY);
		addEEnumLiteral(gridTypeEEnum, gridType.GROUND);
		addEEnumLiteral(gridTypeEEnum, gridType.ANALOG_REFERENCE);
	}

} //PowergridPackageImpl
