/**
 */
package ucof.communication.configECIC.streamTypes.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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

import ucof.communication.configECIC.streamTypes.A429Stream;
import ucof.communication.configECIC.streamTypes.A664Stream;
import ucof.communication.configECIC.streamTypes.A825Stream;
import ucof.communication.configECIC.streamTypes.ANAStream;
import ucof.communication.configECIC.streamTypes.DISStream;
import ucof.communication.configECIC.streamTypes.DataTimestamp;
import ucof.communication.configECIC.streamTypes.ETHStream;
import ucof.communication.configECIC.streamTypes.NADStream;
import ucof.communication.configECIC.streamTypes.StreamTypesFactory;
import ucof.communication.configECIC.streamTypes.StreamTypesPackage;
import ucof.communication.configECIC.streamTypes.SuperStreamType;

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
public class StreamTypesPackageImpl extends EPackageImpl implements StreamTypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superStreamTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass a429StreamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass a825StreamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass a664StreamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ethStreamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disStreamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anaStreamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nadStreamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTimestampEClass = null;

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
	 * @see ucof.communication.configECIC.streamTypes.StreamTypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StreamTypesPackageImpl() {
		super(eNS_URI, StreamTypesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StreamTypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StreamTypesPackage init() {
		if (isInited) return (StreamTypesPackage)EPackage.Registry.INSTANCE.getEPackage(StreamTypesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStreamTypesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StreamTypesPackageImpl theStreamTypesPackage = registeredStreamTypesPackage instanceof StreamTypesPackageImpl ? (StreamTypesPackageImpl)registeredStreamTypesPackage : new StreamTypesPackageImpl();

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
		theStreamTypesPackage.createPackageContents();
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
		theStreamTypesPackage.initializePackageContents();
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
		theStreamTypesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StreamTypesPackage.eNS_URI, theStreamTypesPackage);
		return theStreamTypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperStreamType() {
		return superStreamTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSuperStreamType_SampleMaxNumber() {
		return (EAttribute)superStreamTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSuperStreamType_Icd() {
		return (EAttribute)superStreamTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuperStreamType_DataTimestamp() {
		return (EReference)superStreamTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getA429Stream() {
		return a429StreamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA429Stream_Direction() {
		return (EAttribute)a429StreamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getA429Stream_A429PacketStrategy() {
		return (EReference)a429StreamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA429Stream_Errors() {
		return (EAttribute)a429StreamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getA825Stream() {
		return a825StreamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getA825Stream_A825PacketStrategy() {
		return (EReference)a825StreamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA825Stream_Errors() {
		return (EAttribute)a825StreamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getA664Stream() {
		return a664StreamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA664Stream_Direction() {
		return (EAttribute)a664StreamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA664Stream_SampleMaxSizeBytes() {
		return (EAttribute)a664StreamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getA664Stream_A664PacketStrategy() {
		return (EReference)a664StreamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA664Stream_Errors() {
		return (EAttribute)a664StreamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getETHStream() {
		return ethStreamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getETHStream_Direction() {
		return (EAttribute)ethStreamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getETHStream_SampleMaxSizeBytes() {
		return (EAttribute)ethStreamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getETHStream_EthPacketStrategy() {
		return (EReference)ethStreamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getETHStream_Errors() {
		return (EAttribute)ethStreamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDISStream() {
		return disStreamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDISStream_Direction() {
		return (EAttribute)disStreamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDISStream_SampleMaxSizeBytes() {
		return (EAttribute)disStreamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDISStream_DisPacketStrategy() {
		return (EReference)disStreamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getANAStream() {
		return anaStreamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getANAStream_Direction() {
		return (EAttribute)anaStreamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getANAStream_SampleMaxSizeBytes() {
		return (EAttribute)anaStreamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getANAStream_AnaPacketStrategy() {
		return (EReference)anaStreamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNADStream() {
		return nadStreamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNADStream_Direction() {
		return (EAttribute)nadStreamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNADStream_SampleMaxSizeBytes() {
		return (EAttribute)nadStreamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNADStream_NadPacketStrategy() {
		return (EReference)nadStreamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTimestamp() {
		return dataTimestampEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTimestamp_Enable() {
		return (EAttribute)dataTimestampEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTimestamp_SampleDataTimestampOffset() {
		return (EAttribute)dataTimestampEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamTypesFactory getStreamTypesFactory() {
		return (StreamTypesFactory)getEFactoryInstance();
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
		superStreamTypeEClass = createEClass(SUPER_STREAM_TYPE);
		createEAttribute(superStreamTypeEClass, SUPER_STREAM_TYPE__SAMPLE_MAX_NUMBER);
		createEAttribute(superStreamTypeEClass, SUPER_STREAM_TYPE__ICD);
		createEReference(superStreamTypeEClass, SUPER_STREAM_TYPE__DATA_TIMESTAMP);

		a429StreamEClass = createEClass(A429_STREAM);
		createEAttribute(a429StreamEClass, A429_STREAM__DIRECTION);
		createEReference(a429StreamEClass, A429_STREAM__A429_PACKET_STRATEGY);
		createEAttribute(a429StreamEClass, A429_STREAM__ERRORS);

		a825StreamEClass = createEClass(A825_STREAM);
		createEReference(a825StreamEClass, A825_STREAM__A825_PACKET_STRATEGY);
		createEAttribute(a825StreamEClass, A825_STREAM__ERRORS);

		a664StreamEClass = createEClass(A664_STREAM);
		createEAttribute(a664StreamEClass, A664_STREAM__DIRECTION);
		createEAttribute(a664StreamEClass, A664_STREAM__SAMPLE_MAX_SIZE_BYTES);
		createEReference(a664StreamEClass, A664_STREAM__A664_PACKET_STRATEGY);
		createEAttribute(a664StreamEClass, A664_STREAM__ERRORS);

		ethStreamEClass = createEClass(ETH_STREAM);
		createEAttribute(ethStreamEClass, ETH_STREAM__DIRECTION);
		createEAttribute(ethStreamEClass, ETH_STREAM__SAMPLE_MAX_SIZE_BYTES);
		createEReference(ethStreamEClass, ETH_STREAM__ETH_PACKET_STRATEGY);
		createEAttribute(ethStreamEClass, ETH_STREAM__ERRORS);

		disStreamEClass = createEClass(DIS_STREAM);
		createEAttribute(disStreamEClass, DIS_STREAM__DIRECTION);
		createEAttribute(disStreamEClass, DIS_STREAM__SAMPLE_MAX_SIZE_BYTES);
		createEReference(disStreamEClass, DIS_STREAM__DIS_PACKET_STRATEGY);

		anaStreamEClass = createEClass(ANA_STREAM);
		createEAttribute(anaStreamEClass, ANA_STREAM__DIRECTION);
		createEAttribute(anaStreamEClass, ANA_STREAM__SAMPLE_MAX_SIZE_BYTES);
		createEReference(anaStreamEClass, ANA_STREAM__ANA_PACKET_STRATEGY);

		nadStreamEClass = createEClass(NAD_STREAM);
		createEAttribute(nadStreamEClass, NAD_STREAM__DIRECTION);
		createEAttribute(nadStreamEClass, NAD_STREAM__SAMPLE_MAX_SIZE_BYTES);
		createEReference(nadStreamEClass, NAD_STREAM__NAD_PACKET_STRATEGY);

		dataTimestampEClass = createEClass(DATA_TIMESTAMP);
		createEAttribute(dataTimestampEClass, DATA_TIMESTAMP__ENABLE);
		createEAttribute(dataTimestampEClass, DATA_TIMESTAMP__SAMPLE_DATA_TIMESTAMP_OFFSET);
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
		PackageStrategyTypesPackage thePackageStrategyTypesPackage = (PackageStrategyTypesPackage)EPackage.Registry.INSTANCE.getEPackage(PackageStrategyTypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		superStreamTypeEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		superStreamTypeEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());
		a429StreamEClass.getESuperTypes().add(this.getSuperStreamType());
		a825StreamEClass.getESuperTypes().add(this.getSuperStreamType());
		a664StreamEClass.getESuperTypes().add(this.getSuperStreamType());
		ethStreamEClass.getESuperTypes().add(this.getSuperStreamType());
		disStreamEClass.getESuperTypes().add(this.getSuperStreamType());
		anaStreamEClass.getESuperTypes().add(this.getSuperStreamType());
		nadStreamEClass.getESuperTypes().add(this.getSuperStreamType());
		dataTimestampEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		dataTimestampEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());

		// Initialize classes, features, and operations; add parameters
		initEClass(superStreamTypeEClass, SuperStreamType.class, "SuperStreamType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSuperStreamType_SampleMaxNumber(), theEdataPackage.getPositiveIntType(), "sampleMaxNumber", "1", 0, 1, SuperStreamType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSuperStreamType_Icd(), ecorePackage.getEString(), "icd", null, 0, 1, SuperStreamType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSuperStreamType_DataTimestamp(), this.getDataTimestamp(), null, "dataTimestamp", null, 0, 1, SuperStreamType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(a429StreamEClass, A429Stream.class, "A429Stream", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getA429Stream_Direction(), theEnumsPackage.getSingleDirectionType(), "direction", null, 0, 1, A429Stream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getA429Stream_A429PacketStrategy(), thePackageStrategyTypesPackage.getA429PacketStrategy(), null, "a429PacketStrategy", null, 0, 1, A429Stream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getA429Stream_Errors(), theEnumsPackage.getYesNoType(), "errors", null, 0, 1, A429Stream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(a825StreamEClass, A825Stream.class, "A825Stream", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getA825Stream_A825PacketStrategy(), thePackageStrategyTypesPackage.getA825PacketStrategy(), null, "a825PacketStrategy", null, 0, 1, A825Stream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getA825Stream_Errors(), theEnumsPackage.getYesNoType(), "errors", null, 0, 1, A825Stream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(a664StreamEClass, A664Stream.class, "A664Stream", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getA664Stream_Direction(), theEnumsPackage.getSingleDirectionType(), "direction", null, 0, 1, A664Stream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getA664Stream_SampleMaxSizeBytes(), theEdataPackage.getPositiveIntType(), "sampleMaxSizeBytes", "1471", 0, 1, A664Stream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getA664Stream_A664PacketStrategy(), thePackageStrategyTypesPackage.getA664PacketStrategy(), null, "a664PacketStrategy", null, 0, 1, A664Stream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getA664Stream_Errors(), theEnumsPackage.getYesNoType(), "errors", null, 0, 1, A664Stream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ethStreamEClass, ETHStream.class, "ETHStream", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getETHStream_Direction(), theEnumsPackage.getSingleDirectionType(), "direction", null, 0, 1, ETHStream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getETHStream_SampleMaxSizeBytes(), theEdataPackage.getPositiveIntType(), "sampleMaxSizeBytes", "0", 0, 1, ETHStream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getETHStream_EthPacketStrategy(), thePackageStrategyTypesPackage.getETHPacketStrategy(), null, "ethPacketStrategy", null, 0, 1, ETHStream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getETHStream_Errors(), theEnumsPackage.getYesNoType(), "errors", null, 0, 1, ETHStream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(disStreamEClass, DISStream.class, "DISStream", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDISStream_Direction(), theEnumsPackage.getSingleDirectionType(), "direction", null, 0, 1, DISStream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDISStream_SampleMaxSizeBytes(), theEdataPackage.getPositiveIntType(), "sampleMaxSizeBytes", "0", 0, 1, DISStream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDISStream_DisPacketStrategy(), thePackageStrategyTypesPackage.getDISPacketStrategy(), null, "disPacketStrategy", null, 0, 1, DISStream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anaStreamEClass, ANAStream.class, "ANAStream", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getANAStream_Direction(), theEnumsPackage.getSingleDirectionType(), "direction", null, 0, 1, ANAStream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getANAStream_SampleMaxSizeBytes(), theEdataPackage.getPositiveIntType(), "sampleMaxSizeBytes", "0", 0, 1, ANAStream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getANAStream_AnaPacketStrategy(), thePackageStrategyTypesPackage.getANAPacketStrategy(), null, "anaPacketStrategy", null, 0, 1, ANAStream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nadStreamEClass, NADStream.class, "NADStream", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNADStream_Direction(), theEnumsPackage.getSingleDirectionType(), "direction", null, 0, 1, NADStream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNADStream_SampleMaxSizeBytes(), theEdataPackage.getPositiveIntType(), "sampleMaxSizeBytes", "0", 0, 1, NADStream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNADStream_NadPacketStrategy(), thePackageStrategyTypesPackage.getNADPacketStrategy(), null, "nadPacketStrategy", null, 0, 1, NADStream.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTimestampEClass, DataTimestamp.class, "DataTimestamp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataTimestamp_Enable(), theEnumsPackage.getYesNoType(), "enable", null, 0, 1, DataTimestamp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTimestamp_SampleDataTimestampOffset(), theEnumsPackage.getYesNoType(), "sampleDataTimestampOffset", null, 0, 1, DataTimestamp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //StreamTypesPackageImpl
