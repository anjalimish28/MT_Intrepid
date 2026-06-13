/**
 */
package ucof.assignments.database.impl;

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

import targets.powergrid.PowergridPackage;

import targets.powergrid.impl.PowergridPackageImpl;

import targets.rdc.RdcPackage;

import targets.rdc.impl.RdcPackageImpl;

import targets.sheild.SheildPackage;

import targets.sheild.impl.SheildPackageImpl;

import ucof.UcofPackage;

import ucof.assignments.AssignmentsPackage;

import ucof.assignments.database.DatabaseFactory;
import ucof.assignments.database.DatabasePackage;
import ucof.assignments.database.MessageToTargetAssignment;
import ucof.assignments.database.MessageToTargetAssignmentSet;
import ucof.assignments.database.PayloadToTargetAssignment;
import ucof.assignments.database.PayloadToTargetAssignmentSet;
import ucof.assignments.database.SignalToTargetAssignment;
import ucof.assignments.database.SignalToTargetAssignmentSet;
import ucof.assignments.database.messageTargets;
import ucof.assignments.database.payloadTargets;
import ucof.assignments.database.signalTargets;

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
public class DatabasePackageImpl extends EPackageImpl implements DatabasePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalToTargetAssignmentSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalToTargetAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass payloadToTargetAssignmentSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass payloadToTargetAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageToTargetAssignmentSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageToTargetAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum signalTargetsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum payloadTargetsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageTargetsEEnum = null;

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
	 * @see ucof.assignments.database.DatabasePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatabasePackageImpl() {
		super(eNS_URI, DatabaseFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DatabasePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatabasePackage init() {
		if (isInited) return (DatabasePackage)EPackage.Registry.INSTANCE.getEPackage(DatabasePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDatabasePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DatabasePackageImpl theDatabasePackage = registeredDatabasePackage instanceof DatabasePackageImpl ? (DatabasePackageImpl)registeredDatabasePackage : new DatabasePackageImpl();

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
		theDatabasePackage.createPackageContents();
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
		theDatabasePackage.initializePackageContents();
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
		theDatabasePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatabasePackage.eNS_URI, theDatabasePackage);
		return theDatabasePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalToTargetAssignmentSet() {
		return signalToTargetAssignmentSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalToTargetAssignmentSet_SignalToTargetAssignment() {
		return (EReference)signalToTargetAssignmentSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalToTargetAssignment() {
		return signalToTargetAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignalToTargetAssignment_StartBit() {
		return (EAttribute)signalToTargetAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignalToTargetAssignment_AssignmentTargetType() {
		return (EAttribute)signalToTargetAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignalToTargetAssignment_InitialValue() {
		return (EAttribute)signalToTargetAssignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPayloadToTargetAssignmentSet() {
		return payloadToTargetAssignmentSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPayloadToTargetAssignmentSet_PayloadToTargetAssignment() {
		return (EReference)payloadToTargetAssignmentSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPayloadToTargetAssignment() {
		return payloadToTargetAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPayloadToTargetAssignment_AssignmentTargetType() {
		return (EAttribute)payloadToTargetAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageToTargetAssignmentSet() {
		return messageToTargetAssignmentSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageToTargetAssignmentSet_MessageToTargetAssignment() {
		return (EReference)messageToTargetAssignmentSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageToTargetAssignment() {
		return messageToTargetAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageToTargetAssignment_AssignmentTargetType() {
		return (EAttribute)messageToTargetAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getsignalTargets() {
		return signalTargetsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getpayloadTargets() {
		return payloadTargetsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getmessageTargets() {
		return messageTargetsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseFactory getDatabaseFactory() {
		return (DatabaseFactory)getEFactoryInstance();
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
		signalToTargetAssignmentSetEClass = createEClass(SIGNAL_TO_TARGET_ASSIGNMENT_SET);
		createEReference(signalToTargetAssignmentSetEClass, SIGNAL_TO_TARGET_ASSIGNMENT_SET__SIGNAL_TO_TARGET_ASSIGNMENT);

		signalToTargetAssignmentEClass = createEClass(SIGNAL_TO_TARGET_ASSIGNMENT);
		createEAttribute(signalToTargetAssignmentEClass, SIGNAL_TO_TARGET_ASSIGNMENT__START_BIT);
		createEAttribute(signalToTargetAssignmentEClass, SIGNAL_TO_TARGET_ASSIGNMENT__ASSIGNMENT_TARGET_TYPE);
		createEAttribute(signalToTargetAssignmentEClass, SIGNAL_TO_TARGET_ASSIGNMENT__INITIAL_VALUE);

		payloadToTargetAssignmentSetEClass = createEClass(PAYLOAD_TO_TARGET_ASSIGNMENT_SET);
		createEReference(payloadToTargetAssignmentSetEClass, PAYLOAD_TO_TARGET_ASSIGNMENT_SET__PAYLOAD_TO_TARGET_ASSIGNMENT);

		payloadToTargetAssignmentEClass = createEClass(PAYLOAD_TO_TARGET_ASSIGNMENT);
		createEAttribute(payloadToTargetAssignmentEClass, PAYLOAD_TO_TARGET_ASSIGNMENT__ASSIGNMENT_TARGET_TYPE);

		messageToTargetAssignmentSetEClass = createEClass(MESSAGE_TO_TARGET_ASSIGNMENT_SET);
		createEReference(messageToTargetAssignmentSetEClass, MESSAGE_TO_TARGET_ASSIGNMENT_SET__MESSAGE_TO_TARGET_ASSIGNMENT);

		messageToTargetAssignmentEClass = createEClass(MESSAGE_TO_TARGET_ASSIGNMENT);
		createEAttribute(messageToTargetAssignmentEClass, MESSAGE_TO_TARGET_ASSIGNMENT__ASSIGNMENT_TARGET_TYPE);

		// Create enums
		signalTargetsEEnum = createEEnum(SIGNAL_TARGETS);
		payloadTargetsEEnum = createEEnum(PAYLOAD_TARGETS);
		messageTargetsEEnum = createEEnum(MESSAGE_TARGETS);
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
		AssignmentsPackage theAssignmentsPackage = (AssignmentsPackage)EPackage.Registry.INSTANCE.getEPackage(AssignmentsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		signalToTargetAssignmentSetEClass.getESuperTypes().add(theAssignmentsPackage.getSuperAssignmentSetType());
		signalToTargetAssignmentEClass.getESuperTypes().add(theAssignmentsPackage.getSuperAssignmentType());
		payloadToTargetAssignmentSetEClass.getESuperTypes().add(theAssignmentsPackage.getSuperAssignmentSetType());
		payloadToTargetAssignmentEClass.getESuperTypes().add(theAssignmentsPackage.getSuperAssignmentType());
		messageToTargetAssignmentSetEClass.getESuperTypes().add(theAssignmentsPackage.getSuperAssignmentSetType());
		messageToTargetAssignmentEClass.getESuperTypes().add(theAssignmentsPackage.getSuperAssignmentType());

		// Initialize classes, features, and operations; add parameters
		initEClass(signalToTargetAssignmentSetEClass, SignalToTargetAssignmentSet.class, "SignalToTargetAssignmentSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignalToTargetAssignmentSet_SignalToTargetAssignment(), this.getSignalToTargetAssignment(), null, "signalToTargetAssignment", null, 0, -1, SignalToTargetAssignmentSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalToTargetAssignmentEClass, SignalToTargetAssignment.class, "SignalToTargetAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignalToTargetAssignment_StartBit(), ecorePackage.getEInt(), "startBit", null, 0, 1, SignalToTargetAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignalToTargetAssignment_AssignmentTargetType(), this.getsignalTargets(), "assignmentTargetType", null, 0, 1, SignalToTargetAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignalToTargetAssignment_InitialValue(), ecorePackage.getEFloat(), "initialValue", null, 0, 1, SignalToTargetAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(payloadToTargetAssignmentSetEClass, PayloadToTargetAssignmentSet.class, "PayloadToTargetAssignmentSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPayloadToTargetAssignmentSet_PayloadToTargetAssignment(), this.getPayloadToTargetAssignment(), null, "payloadToTargetAssignment", null, 0, -1, PayloadToTargetAssignmentSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(payloadToTargetAssignmentEClass, PayloadToTargetAssignment.class, "PayloadToTargetAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPayloadToTargetAssignment_AssignmentTargetType(), this.getpayloadTargets(), "assignmentTargetType", null, 0, 1, PayloadToTargetAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageToTargetAssignmentSetEClass, MessageToTargetAssignmentSet.class, "MessageToTargetAssignmentSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessageToTargetAssignmentSet_MessageToTargetAssignment(), this.getMessageToTargetAssignment(), null, "messageToTargetAssignment", null, 0, -1, MessageToTargetAssignmentSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageToTargetAssignmentEClass, MessageToTargetAssignment.class, "MessageToTargetAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessageToTargetAssignment_AssignmentTargetType(), this.getmessageTargets(), "assignmentTargetType", null, 0, 1, MessageToTargetAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(signalTargetsEEnum, signalTargets.class, "signalTargets");
		addEEnumLiteral(signalTargetsEEnum, signalTargets.NOT_SET);
		addEEnumLiteral(signalTargetsEEnum, signalTargets.PORT2_PORT);
		addEEnumLiteral(signalTargetsEEnum, signalTargets.INTERFACE);
		addEEnumLiteral(signalTargetsEEnum, signalTargets.MESSAGE);
		addEEnumLiteral(signalTargetsEEnum, signalTargets.PAYLOAD);
		addEEnumLiteral(signalTargetsEEnum, signalTargets.DISSTREAM);
		addEEnumLiteral(signalTargetsEEnum, signalTargets.ANA_STREAM);
		addEEnumLiteral(signalTargetsEEnum, signalTargets.NAD_STREAM);
		addEEnumLiteral(signalTargetsEEnum, signalTargets.HW_PORT);

		initEEnum(payloadTargetsEEnum, payloadTargets.class, "payloadTargets");
		addEEnumLiteral(payloadTargetsEEnum, payloadTargets.NOT_SET);
		addEEnumLiteral(payloadTargetsEEnum, payloadTargets.PORT2_PORT);
		addEEnumLiteral(payloadTargetsEEnum, payloadTargets.INTERFACE);
		addEEnumLiteral(payloadTargetsEEnum, payloadTargets.MESSAGE);
		addEEnumLiteral(payloadTargetsEEnum, payloadTargets.HW_PORT);

		initEEnum(messageTargetsEEnum, messageTargets.class, "messageTargets");
		addEEnumLiteral(messageTargetsEEnum, messageTargets.NOT_SET);
		addEEnumLiteral(messageTargetsEEnum, messageTargets.PORT2_PORT);
		addEEnumLiteral(messageTargetsEEnum, messageTargets.INTERFACE);
		addEEnumLiteral(messageTargetsEEnum, messageTargets.HW_PORT);
	}

} //DatabasePackageImpl
