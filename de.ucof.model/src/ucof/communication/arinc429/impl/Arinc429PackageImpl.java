/**
 */
package ucof.communication.arinc429.impl;

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
import targets.vxworksa653.Vxworksa653Package;
import targets.vxworksa653.impl.Vxworksa653PackageImpl;
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

import ucof.communication.arinc429.A429Bus;
import ucof.communication.arinc429.A429Message;
import ucof.communication.arinc429.A429SignalSpecification;
import ucof.communication.arinc429.Arinc429Factory;
import ucof.communication.arinc429.Arinc429Package;
import ucof.communication.arinc429.CodingTypes;
import ucof.communication.arinc429.ParityTypes;
import ucof.communication.arinc429.SSMTypes;

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
public class Arinc429PackageImpl extends EPackageImpl implements Arinc429Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass a429BusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass a429MessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass a429SignalSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parityTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum codingTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ssmTypesEEnum = null;

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
	 * @see ucof.communication.arinc429.Arinc429Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Arinc429PackageImpl() {
		super(eNS_URI, Arinc429Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Arinc429Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Arinc429Package init() {
		if (isInited) return (Arinc429Package)EPackage.Registry.INSTANCE.getEPackage(Arinc429Package.eNS_URI);

		// Obtain or create and register package
		Object registeredArinc429Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Arinc429PackageImpl theArinc429Package = registeredArinc429Package instanceof Arinc429PackageImpl ? (Arinc429PackageImpl)registeredArinc429Package : new Arinc429PackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Vxworksa653Package.eNS_URI);
		Vxworksa653PackageImpl theVxworksa653Package = (Vxworksa653PackageImpl)(registeredPackage instanceof Vxworksa653PackageImpl ? registeredPackage : Vxworksa653Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AvipPackage.eNS_URI);
		AvipPackageImpl theAvipPackage = (AvipPackageImpl)(registeredPackage instanceof AvipPackageImpl ? registeredPackage : AvipPackage.eINSTANCE);

		// Create package meta-data objects
		theArinc429Package.createPackageContents();
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
		theVxworksa653Package.createPackageContents();
		theAvipPackage.createPackageContents();

		// Initialize created meta-data
		theArinc429Package.initializePackageContents();
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
		theVxworksa653Package.initializePackageContents();
		theAvipPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArinc429Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Arinc429Package.eNS_URI, theArinc429Package);
		return theArinc429Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getA429Bus() {
		return a429BusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA429Bus_ParityType() {
		return (EAttribute)a429BusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getA429Message() {
		return a429MessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA429Message_Sdi() {
		return (EAttribute)a429MessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA429Message_A429Label() {
		return (EAttribute)a429MessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA429Message_A429SSM() {
		return (EAttribute)a429MessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA429Message_LabelNumber() {
		return (EAttribute)a429MessageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getA429SignalSpecification() {
		return a429SignalSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA429SignalSpecification_CodingType() {
		return (EAttribute)a429SignalSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA429SignalSpecification_FieldLength() {
		return (EAttribute)a429SignalSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParityTypes() {
		return parityTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCodingTypes() {
		return codingTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSSMTypes() {
		return ssmTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arinc429Factory getArinc429Factory() {
		return (Arinc429Factory)getEFactoryInstance();
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
		a429BusEClass = createEClass(A429_BUS);
		createEAttribute(a429BusEClass, A429_BUS__PARITY_TYPE);

		a429MessageEClass = createEClass(A429_MESSAGE);
		createEAttribute(a429MessageEClass, A429_MESSAGE__SDI);
		createEAttribute(a429MessageEClass, A429_MESSAGE__A429_LABEL);
		createEAttribute(a429MessageEClass, A429_MESSAGE__A429_SSM);
		createEAttribute(a429MessageEClass, A429_MESSAGE__LABEL_NUMBER);

		a429SignalSpecificationEClass = createEClass(A429_SIGNAL_SPECIFICATION);
		createEAttribute(a429SignalSpecificationEClass, A429_SIGNAL_SPECIFICATION__CODING_TYPE);
		createEAttribute(a429SignalSpecificationEClass, A429_SIGNAL_SPECIFICATION__FIELD_LENGTH);

		// Create enums
		parityTypesEEnum = createEEnum(PARITY_TYPES);
		codingTypesEEnum = createEEnum(CODING_TYPES);
		ssmTypesEEnum = createEEnum(SSM_TYPES);
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
		CommunicationPackage theCommunicationPackage = (CommunicationPackage)EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI);
		EnumsPackage theEnumsPackage = (EnumsPackage)EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI);
		EtypesPackage theEtypesPackage = (EtypesPackage)EPackage.Registry.INSTANCE.getEPackage(EtypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		a429BusEClass.getESuperTypes().add(theCommunicationPackage.getSuperCommunicationInterfaceType());
		a429MessageEClass.getESuperTypes().add(theCommunicationPackage.getSuperMessageType());
		a429SignalSpecificationEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());
		a429SignalSpecificationEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());

		// Initialize classes, features, and operations; add parameters
		initEClass(a429BusEClass, A429Bus.class, "A429Bus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getA429Bus_ParityType(), this.getParityTypes(), "parityType", null, 0, 1, A429Bus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(a429MessageEClass, A429Message.class, "A429Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getA429Message_Sdi(), theEnumsPackage.getSDITypes(), "sdi", null, 0, 1, A429Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getA429Message_A429Label(), this.getSSMTypes(), "a429Label", null, 0, 1, A429Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getA429Message_A429SSM(), ecorePackage.getEString(), "a429SSM", null, 0, 1, A429Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getA429Message_LabelNumber(), ecorePackage.getEInt(), "labelNumber", null, 0, 1, A429Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(a429SignalSpecificationEClass, A429SignalSpecification.class, "A429SignalSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getA429SignalSpecification_CodingType(), this.getCodingTypes(), "codingType", null, 0, 1, A429SignalSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getA429SignalSpecification_FieldLength(), ecorePackage.getEInt(), "fieldLength", null, 0, 1, A429SignalSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(parityTypesEEnum, ParityTypes.class, "ParityTypes");
		addEEnumLiteral(parityTypesEEnum, ParityTypes.NOT_SET);
		addEEnumLiteral(parityTypesEEnum, ParityTypes.HIGH);
		addEEnumLiteral(parityTypesEEnum, ParityTypes.LOW);

		initEEnum(codingTypesEEnum, CodingTypes.class, "CodingTypes");
		addEEnumLiteral(codingTypesEEnum, CodingTypes.NOT_SET);
		addEEnumLiteral(codingTypesEEnum, CodingTypes.BNR);
		addEEnumLiteral(codingTypesEEnum, CodingTypes.BCD);

		initEEnum(ssmTypesEEnum, SSMTypes.class, "SSMTypes");
		addEEnumLiteral(ssmTypesEEnum, SSMTypes.NOT_SET);
		addEEnumLiteral(ssmTypesEEnum, SSMTypes.PLUS_NORTH_EAST_RIGHT_TO_ABOVE);
		addEEnumLiteral(ssmTypesEEnum, SSMTypes.NO_COMPUTED_DATA);
		addEEnumLiteral(ssmTypesEEnum, SSMTypes.FUNCTIONAL_TEST);
		addEEnumLiteral(ssmTypesEEnum, SSMTypes.MINUS_SOUTH_WEST_LEFT_FROM_BELOW);
		addEEnumLiteral(ssmTypesEEnum, SSMTypes.VERIFIED_DATA_NORMAL_OPERATION);
		addEEnumLiteral(ssmTypesEEnum, SSMTypes.FAILURE_WARNING);

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
		  (parityTypesEEnum,
		   source,
		   new String[] {
			   "name", "ParityTypes"
		   });
		addAnnotation
		  (codingTypesEEnum,
		   source,
		   new String[] {
			   "name", "CodingTypes"
		   });
		addAnnotation
		  (ssmTypesEEnum,
		   source,
		   new String[] {
			   "name", "SSMTypes"
		   });
		addAnnotation
		  (a429BusEClass,
		   source,
		   new String[] {
			   "kind", "elementOnly",
			   "name", "A429_BUS"
		   });
		addAnnotation
		  (a429MessageEClass,
		   source,
		   new String[] {
			   "kind", "elementOnly",
			   "name", "A429_MESSAGE"
		   });
		addAnnotation
		  (a429SignalSpecificationEClass,
		   source,
		   new String[] {
			   "kind", "elementOnly",
			   "name", "A429_DATA_FIELD"
		   });
	}

} //Arinc429PackageImpl
