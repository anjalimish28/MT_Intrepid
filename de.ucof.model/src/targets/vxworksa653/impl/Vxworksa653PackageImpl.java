/**
 */
package targets.vxworksa653.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import targets.TargetsPackage;

import targets.a653capabletarget.A653capabletargetPackage;

import targets.a653capabletarget.impl.A653capabletargetPackageImpl;

import targets.avip.AvipPackage;
import targets.avip.impl.AvipPackageImpl;
import targets.configdesk.ConfigdeskPackage;

import targets.configdesk.dSpaceArinc825.DSpaceArinc825Package;

import targets.configdesk.dSpaceArinc825.impl.DSpaceArinc825PackageImpl;

import targets.configdesk.ethernet.EthernetPackage;

import targets.configdesk.ethernet.impl.EthernetPackageImpl;

import targets.configdesk.impl.ConfigdeskPackageImpl;

import targets.configdesk.wired.WiredPackage;

import targets.configdesk.wired.impl.WiredPackageImpl;

import targets.impl.TargetsPackageImpl;

import targets.matlab.MatlabPackage;

import targets.matlab.impl.MatlabPackageImpl;

import targets.tricore299a653p4.Tricore299a653p4Package;

import targets.tricore299a653p4.impl.Tricore299a653p4PackageImpl;

import targets.vxworksa653.SimulatedDevices;
import targets.vxworksa653.SimulatedDevicesList;
import targets.vxworksa653.SuperVxWorksAssignmentSpecificationType;
import targets.vxworksa653.VxWorksA653;
import targets.vxworksa653.Vxworksa653Factory;
import targets.vxworksa653.Vxworksa653Package;

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
public class Vxworksa653PackageImpl extends EPackageImpl implements Vxworksa653Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vxWorksA653EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superVxWorksAssignmentSpecificationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simulatedDevicesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum simulatedDevicesListEEnum = null;

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
	 * @see targets.vxworksa653.Vxworksa653Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Vxworksa653PackageImpl() {
		super(eNS_URI, Vxworksa653Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Vxworksa653Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Vxworksa653Package init() {
		if (isInited) return (Vxworksa653Package)EPackage.Registry.INSTANCE.getEPackage(Vxworksa653Package.eNS_URI);

		// Obtain or create and register package
		Object registeredVxworksa653Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Vxworksa653PackageImpl theVxworksa653Package = registeredVxworksa653Package instanceof Vxworksa653PackageImpl ? (Vxworksa653PackageImpl)registeredVxworksa653Package : new Vxworksa653PackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AssignmentsPackage.eNS_URI);
		AssignmentsPackageImpl theAssignmentsPackage = (AssignmentsPackageImpl)(registeredPackage instanceof AssignmentsPackageImpl ? registeredPackage : AssignmentsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DatabasePackage.eNS_URI);
		DatabasePackageImpl theDatabasePackage = (DatabasePackageImpl)(registeredPackage instanceof DatabasePackageImpl ? registeredPackage : DatabasePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TargetsPackage.eNS_URI);
		TargetsPackageImpl theTargetsPackage = (TargetsPackageImpl)(registeredPackage instanceof TargetsPackageImpl ? registeredPackage : TargetsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ConfigdeskPackage.eNS_URI);
		ConfigdeskPackageImpl theConfigdeskPackage = (ConfigdeskPackageImpl)(registeredPackage instanceof ConfigdeskPackageImpl ? registeredPackage : ConfigdeskPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DSpaceArinc825Package.eNS_URI);
		DSpaceArinc825PackageImpl theDSpaceArinc825Package = (DSpaceArinc825PackageImpl)(registeredPackage instanceof DSpaceArinc825PackageImpl ? registeredPackage : DSpaceArinc825Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EthernetPackage.eNS_URI);
		EthernetPackageImpl theEthernetPackage = (EthernetPackageImpl)(registeredPackage instanceof EthernetPackageImpl ? registeredPackage : EthernetPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(WiredPackage.eNS_URI);
		WiredPackageImpl theWiredPackage = (WiredPackageImpl)(registeredPackage instanceof WiredPackageImpl ? registeredPackage : WiredPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Tricore299a653p4Package.eNS_URI);
		Tricore299a653p4PackageImpl theTricore299a653p4Package = (Tricore299a653p4PackageImpl)(registeredPackage instanceof Tricore299a653p4PackageImpl ? registeredPackage : Tricore299a653p4Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MatlabPackage.eNS_URI);
		MatlabPackageImpl theMatlabPackage = (MatlabPackageImpl)(registeredPackage instanceof MatlabPackageImpl ? registeredPackage : MatlabPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(A653capabletargetPackage.eNS_URI);
		A653capabletargetPackageImpl theA653capabletargetPackage = (A653capabletargetPackageImpl)(registeredPackage instanceof A653capabletargetPackageImpl ? registeredPackage : A653capabletargetPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AvipPackage.eNS_URI);
		AvipPackageImpl theAvipPackage = (AvipPackageImpl)(registeredPackage instanceof AvipPackageImpl ? registeredPackage : AvipPackage.eINSTANCE);

		// Create package meta-data objects
		theVxworksa653Package.createPackageContents();
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
		theAssignmentsPackage.createPackageContents();
		theDatabasePackage.createPackageContents();
		theTargetsPackage.createPackageContents();
		theConfigdeskPackage.createPackageContents();
		theDSpaceArinc825Package.createPackageContents();
		theEthernetPackage.createPackageContents();
		theWiredPackage.createPackageContents();
		theTricore299a653p4Package.createPackageContents();
		theMatlabPackage.createPackageContents();
		theA653capabletargetPackage.createPackageContents();
		theAvipPackage.createPackageContents();

		// Initialize created meta-data
		theVxworksa653Package.initializePackageContents();
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
		theAssignmentsPackage.initializePackageContents();
		theDatabasePackage.initializePackageContents();
		theTargetsPackage.initializePackageContents();
		theConfigdeskPackage.initializePackageContents();
		theDSpaceArinc825Package.initializePackageContents();
		theEthernetPackage.initializePackageContents();
		theWiredPackage.initializePackageContents();
		theTricore299a653p4Package.initializePackageContents();
		theMatlabPackage.initializePackageContents();
		theA653capabletargetPackage.initializePackageContents();
		theAvipPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVxworksa653Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Vxworksa653Package.eNS_URI, theVxworksa653Package);
		return theVxworksa653Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVxWorksA653() {
		return vxWorksA653EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperVxWorksAssignmentSpecificationType() {
		return superVxWorksAssignmentSpecificationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimulatedDevices() {
		return simulatedDevicesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulatedDevices_SimulatedDevices() {
		return (EAttribute)simulatedDevicesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSimulatedDevicesList() {
		return simulatedDevicesListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vxworksa653Factory getVxworksa653Factory() {
		return (Vxworksa653Factory)getEFactoryInstance();
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
		vxWorksA653EClass = createEClass(VX_WORKS_A653);

		superVxWorksAssignmentSpecificationTypeEClass = createEClass(SUPER_VX_WORKS_ASSIGNMENT_SPECIFICATION_TYPE);

		simulatedDevicesEClass = createEClass(SIMULATED_DEVICES);
		createEAttribute(simulatedDevicesEClass, SIMULATED_DEVICES__SIMULATED_DEVICES);

		// Create enums
		simulatedDevicesListEEnum = createEEnum(SIMULATED_DEVICES_LIST);
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
		TargetsPackage theTargetsPackage = (TargetsPackage)EPackage.Registry.INSTANCE.getEPackage(TargetsPackage.eNS_URI);
		A653capabletargetPackage theA653capabletargetPackage = (A653capabletargetPackage)EPackage.Registry.INSTANCE.getEPackage(A653capabletargetPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		vxWorksA653EClass.getESuperTypes().add(theTargetsPackage.getHardwareInformation());
		vxWorksA653EClass.getESuperTypes().add(theA653capabletargetPackage.getSuperA653CapableTargetType());
		vxWorksA653EClass.getESuperTypes().add(theTargetsPackage.getSuperTargetType());
		superVxWorksAssignmentSpecificationTypeEClass.getESuperTypes().add(theTargetsPackage.getSuperAssignmentSpecificationType());
		simulatedDevicesEClass.getESuperTypes().add(this.getSuperVxWorksAssignmentSpecificationType());

		// Initialize classes, features, and operations; add parameters
		initEClass(vxWorksA653EClass, VxWorksA653.class, "VxWorksA653", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(superVxWorksAssignmentSpecificationTypeEClass, SuperVxWorksAssignmentSpecificationType.class, "SuperVxWorksAssignmentSpecificationType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simulatedDevicesEClass, SimulatedDevices.class, "SimulatedDevices", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimulatedDevices_SimulatedDevices(), this.getSimulatedDevicesList(), "simulatedDevices", null, 0, -1, SimulatedDevices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(simulatedDevicesListEEnum, SimulatedDevicesList.class, "SimulatedDevicesList");
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.NOT_SET);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.LAW);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.RST);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.PAMU);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.I2C0);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.I2C1);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.I2C2);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.I2C3);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.ESPI);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.ESDHC);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.USB0);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.USB1);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.UART0);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.UART0POLL);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.UART1);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.UART1POLL);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.UART2);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.UART2POLL);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.UART3);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.UART3POLL);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.PCIE1);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.PCIE2);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.PCIE3);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.PCIE4);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.RIO);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.SATA0);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.SATA1);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.DMA0);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.DMA1);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.QMAN);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.BMAN);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.PORTAL0);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.PORTAL1);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.PORTAL2);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.PORTAL3);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.PORTAL4);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.PORTAL5);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.PORTAL6);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.PORTAL7);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.PORTAL8);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.PORTAL9);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.FMAN);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.MEMAC0);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.MEMAC1);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.MEMAC2);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.MEMAC3);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.MEMAC4);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.MEMAC5);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.MEMAC8);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.MEMAC9);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.MDIO0);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.MDIO1);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.MPIC_CPU_PRIVATE);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.MPIC);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.PIC_TIMER_A);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.PIC_TIMER_B);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.DCFG);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.GPIO0);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.GPIO1);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.GPIO2);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.GPIO3);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.QIXIS);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.NVRAM);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.VXNVRAM);
		addEEnumLiteral(simulatedDevicesListEEnum, SimulatedDevicesList.MDIO_SHARED);
	}

} //Vxworksa653PackageImpl
