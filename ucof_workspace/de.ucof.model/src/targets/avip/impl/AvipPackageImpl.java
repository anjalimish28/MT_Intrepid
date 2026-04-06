/**
 */
package targets.avip.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import targets.TargetsPackage;

import targets.a653capabletarget.A653capabletargetPackage;

import targets.a653capabletarget.impl.A653capabletargetPackageImpl;

import targets.avip.AVDPorts;
import targets.avip.AVDSchedulerExtension;
import targets.avip.AnalogueInput;
import targets.avip.AnalogueOutput;
import targets.avip.AvionicsVirtualDevice;
import targets.avip.AvipFactory;
import targets.avip.AvipPackage;
import targets.avip.DiscreteInput;
import targets.avip.DiscreteOutput;
import targets.avip.FunctionalData;
import targets.avip.MEMPortIDExtension;
import targets.avip.PortUserConfiguration;
import targets.avip.SignalExtension;
import targets.avip.SignalExtensions;
import targets.avip.SuperAVDPortType;
import targets.avip.SuperAnaloguePortType;
import targets.avip.SuperWiredPortType;
import targets.avip.V_RTD;
import targets.avip.XTalk;

import targets.avip.util.AvipValidator;

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
public class AvipPackageImpl extends EPackageImpl implements AvipPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avionicsVirtualDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avdPortsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superAVDPortTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superWiredPortTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superAnaloguePortTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analogueInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analogueOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discreteInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discreteOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xTalkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass a429EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass a664EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass canEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass v_RTDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portUserConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avdSchedulerExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalExtensionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memPortIDExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType connectorNameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType connectorPinNameTypeEDataType = null;

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
	 * @see targets.avip.AvipPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AvipPackageImpl() {
		super(eNS_URI, AvipFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AvipPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AvipPackage init() {
		if (isInited) return (AvipPackage)EPackage.Registry.INSTANCE.getEPackage(AvipPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAvipPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AvipPackageImpl theAvipPackage = registeredAvipPackage instanceof AvipPackageImpl ? (AvipPackageImpl)registeredAvipPackage : new AvipPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Vxworksa653Package.eNS_URI);
		Vxworksa653PackageImpl theVxworksa653Package = (Vxworksa653PackageImpl)(registeredPackage instanceof Vxworksa653PackageImpl ? registeredPackage : Vxworksa653Package.eINSTANCE);

		// Create package meta-data objects
		theAvipPackage.createPackageContents();
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
		theVxworksa653Package.createPackageContents();

		// Initialize created meta-data
		theAvipPackage.initializePackageContents();
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
		theVxworksa653Package.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theAvipPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return AvipValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theAvipPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AvipPackage.eNS_URI, theAvipPackage);
		return theAvipPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvionicsVirtualDevice() {
		return avionicsVirtualDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAvionicsVirtualDevice_Ports() {
		return (EReference)avionicsVirtualDeviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAvionicsVirtualDevice_ScheduleExtension() {
		return (EReference)avionicsVirtualDeviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAVDPorts() {
		return avdPortsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAVDPorts_Port() {
		return (EReference)avdPortsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperAVDPortType() {
		return superAVDPortTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSuperAVDPortType_ConnectorName() {
		return (EAttribute)superAVDPortTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSuperAVDPortType_ConnectorPinName() {
		return (EAttribute)superAVDPortTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSuperAVDPortType_If_id() {
		return (EAttribute)superAVDPortTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuperAVDPortType_FunctionalData() {
		return (EReference)superAVDPortTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuperAVDPortType_PortUserConfiguration() {
		return (EReference)superAVDPortTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuperAVDPortType_SignalExtensions() {
		return (EReference)superAVDPortTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalData() {
		return functionalDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionalData_Direction() {
		return (EAttribute)functionalDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionalData_If_signal() {
		return (EAttribute)functionalDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionalData_Param_type() {
		return (EAttribute)functionalDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionalData_Param_length() {
		return (EAttribute)functionalDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperWiredPortType() {
		return superWiredPortTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSuperWiredPortType_Max_rev_v() {
		return (EAttribute)superWiredPortTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperAnaloguePortType() {
		return superAnaloguePortTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSuperAnaloguePortType_Min_rev_v() {
		return (EAttribute)superAnaloguePortTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalogueInput() {
		return analogueInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalogueInput_Ai_voltage_max() {
		return (EAttribute)analogueInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalogueInput_Ai_voltage_max_vac_filtered() {
		return (EAttribute)analogueInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalogueInput_Ai_voltage_max_vdc_filtered() {
		return (EAttribute)analogueInputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalogueInput_Ai_voltage_min() {
		return (EAttribute)analogueInputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalogueInput_Ai_voltage_min_vdc_filtered() {
		return (EAttribute)analogueInputEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalogueInput_Min_ai_frequency() {
		return (EAttribute)analogueInputEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalogueOutput() {
		return analogueOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalogueOutput_Ao_voltage_cmd_ac_max() {
		return (EAttribute)analogueOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalogueOutput_Ao_voltage_cmd_ac_min() {
		return (EAttribute)analogueOutputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalogueOutput_Ao_voltage_cmd_dc_max() {
		return (EAttribute)analogueOutputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalogueOutput_Ao_voltage_cmd_dc_min() {
		return (EAttribute)analogueOutputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalogueOutput_Ao_voltage_cmd_max() {
		return (EAttribute)analogueOutputEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalogueOutput_Ao_voltage_cmd_min() {
		return (EAttribute)analogueOutputEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalogueOutput_Over_current_threshold() {
		return (EAttribute)analogueOutputEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscreteInput() {
		return discreteInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscreteInput_Hpp() {
		return (EAttribute)discreteInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscreteInput_Hpp_port() {
		return (EAttribute)discreteInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscreteInput_Max_polarisation_voltage() {
		return (EAttribute)discreteInputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscreteInput_Max_voltage_gnd() {
		return (EAttribute)discreteInputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscreteInput_Min_voltage_gnd() {
		return (EAttribute)discreteInputEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscreteInput_Max_voltage_opn() {
		return (EAttribute)discreteInputEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscreteInput_Min_voltage_opn() {
		return (EAttribute)discreteInputEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscreteInput_Polarisation_failure_dematuration_duration() {
		return (EAttribute)discreteInputEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscreteInput_Polarisation_failure_maturation_duration() {
		return (EAttribute)discreteInputEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscreteOutput() {
		return discreteOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscreteOutput_Close_volt_margin() {
		return (EAttribute)discreteOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscreteOutput_Internal_pull_up_voltage() {
		return (EAttribute)discreteOutputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscreteOutput_Max_v_case_gnd_conn() {
		return (EAttribute)discreteOutputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscreteOutput_Normal_load_resistance() {
		return (EAttribute)discreteOutputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscreteOutput_Normal_load_voltage() {
		return (EAttribute)discreteOutputEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscreteOutput_Over_current_fault_maturation_duration() {
		return (EAttribute)discreteOutputEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscreteOutput_Overload_current_threshold() {
		return (EAttribute)discreteOutputEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscreteOutput_Short_circuit_current_threshold() {
		return (EAttribute)discreteOutputEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscreteOutput_Soft_over_current_fault_maturation_duration() {
		return (EAttribute)discreteOutputEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXTalk() {
		return xTalkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXTalk_Direction() {
		return (EAttribute)xTalkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getA429() {
		return a429EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA429_Direction() {
		return (EAttribute)a429EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getA664() {
		return a664EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCAN() {
		return canEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMEM() {
		return memEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMEM_MemPortIDExtension() {
		return (EReference)memEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getV_RTD() {
		return v_RTDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortUserConfiguration() {
		return portUserConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortUserConfiguration_Line_function() {
		return (EAttribute)portUserConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortUserConfiguration_Special_param_1() {
		return (EAttribute)portUserConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortUserConfiguration_Special_param_2() {
		return (EAttribute)portUserConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortUserConfiguration_Special_param_3() {
		return (EAttribute)portUserConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortUserConfiguration_Special_param_4() {
		return (EAttribute)portUserConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortUserConfiguration_Special_param_5() {
		return (EAttribute)portUserConfigurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortUserConfiguration_Init_default() {
		return (EAttribute)portUserConfigurationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortUserConfiguration_Loss_of_command() {
		return (EAttribute)portUserConfigurationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortUserConfiguration_Nb_allowed_resets() {
		return (EAttribute)portUserConfigurationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortUserConfiguration_Reset_wait_time() {
		return (EAttribute)portUserConfigurationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAVDSchedulerExtension() {
		return avdSchedulerExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAVDSchedulerExtension_Mif_duration() {
		return (EAttribute)avdSchedulerExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAVDSchedulerExtension_Maf_duration() {
		return (EAttribute)avdSchedulerExtensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAVDSchedulerExtension_Scheduler_id() {
		return (EAttribute)avdSchedulerExtensionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAVDSchedulerExtension_Scheduler_name() {
		return (EAttribute)avdSchedulerExtensionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalExtensions() {
		return signalExtensionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalExtensions_SignalExtension() {
		return (EReference)signalExtensionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalExtension() {
		return signalExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignalExtension_Function() {
		return (EAttribute)signalExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignalExtension_AssociatedLineName() {
		return (EAttribute)signalExtensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMEMPortIDExtension() {
		return memPortIDExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMEMPortIDExtension_PortID() {
		return (EAttribute)memPortIDExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConnectorNameType() {
		return connectorNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConnectorPinNameType() {
		return connectorPinNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvipFactory getAvipFactory() {
		return (AvipFactory)getEFactoryInstance();
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
		avionicsVirtualDeviceEClass = createEClass(AVIONICS_VIRTUAL_DEVICE);
		createEReference(avionicsVirtualDeviceEClass, AVIONICS_VIRTUAL_DEVICE__PORTS);
		createEReference(avionicsVirtualDeviceEClass, AVIONICS_VIRTUAL_DEVICE__SCHEDULE_EXTENSION);

		avdPortsEClass = createEClass(AVD_PORTS);
		createEReference(avdPortsEClass, AVD_PORTS__PORT);

		superAVDPortTypeEClass = createEClass(SUPER_AVD_PORT_TYPE);
		createEAttribute(superAVDPortTypeEClass, SUPER_AVD_PORT_TYPE__CONNECTOR_NAME);
		createEAttribute(superAVDPortTypeEClass, SUPER_AVD_PORT_TYPE__CONNECTOR_PIN_NAME);
		createEAttribute(superAVDPortTypeEClass, SUPER_AVD_PORT_TYPE__IF_ID);
		createEReference(superAVDPortTypeEClass, SUPER_AVD_PORT_TYPE__FUNCTIONAL_DATA);
		createEReference(superAVDPortTypeEClass, SUPER_AVD_PORT_TYPE__PORT_USER_CONFIGURATION);
		createEReference(superAVDPortTypeEClass, SUPER_AVD_PORT_TYPE__SIGNAL_EXTENSIONS);

		functionalDataEClass = createEClass(FUNCTIONAL_DATA);
		createEAttribute(functionalDataEClass, FUNCTIONAL_DATA__DIRECTION);
		createEAttribute(functionalDataEClass, FUNCTIONAL_DATA__IF_SIGNAL);
		createEAttribute(functionalDataEClass, FUNCTIONAL_DATA__PARAM_TYPE);
		createEAttribute(functionalDataEClass, FUNCTIONAL_DATA__PARAM_LENGTH);

		superWiredPortTypeEClass = createEClass(SUPER_WIRED_PORT_TYPE);
		createEAttribute(superWiredPortTypeEClass, SUPER_WIRED_PORT_TYPE__MAX_REV_V);

		superAnaloguePortTypeEClass = createEClass(SUPER_ANALOGUE_PORT_TYPE);
		createEAttribute(superAnaloguePortTypeEClass, SUPER_ANALOGUE_PORT_TYPE__MIN_REV_V);

		analogueInputEClass = createEClass(ANALOGUE_INPUT);
		createEAttribute(analogueInputEClass, ANALOGUE_INPUT__AI_VOLTAGE_MAX);
		createEAttribute(analogueInputEClass, ANALOGUE_INPUT__AI_VOLTAGE_MAX_VAC_FILTERED);
		createEAttribute(analogueInputEClass, ANALOGUE_INPUT__AI_VOLTAGE_MAX_VDC_FILTERED);
		createEAttribute(analogueInputEClass, ANALOGUE_INPUT__AI_VOLTAGE_MIN);
		createEAttribute(analogueInputEClass, ANALOGUE_INPUT__AI_VOLTAGE_MIN_VDC_FILTERED);
		createEAttribute(analogueInputEClass, ANALOGUE_INPUT__MIN_AI_FREQUENCY);

		analogueOutputEClass = createEClass(ANALOGUE_OUTPUT);
		createEAttribute(analogueOutputEClass, ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_AC_MAX);
		createEAttribute(analogueOutputEClass, ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_AC_MIN);
		createEAttribute(analogueOutputEClass, ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_DC_MAX);
		createEAttribute(analogueOutputEClass, ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_DC_MIN);
		createEAttribute(analogueOutputEClass, ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_MAX);
		createEAttribute(analogueOutputEClass, ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_MIN);
		createEAttribute(analogueOutputEClass, ANALOGUE_OUTPUT__OVER_CURRENT_THRESHOLD);

		discreteInputEClass = createEClass(DISCRETE_INPUT);
		createEAttribute(discreteInputEClass, DISCRETE_INPUT__HPP);
		createEAttribute(discreteInputEClass, DISCRETE_INPUT__HPP_PORT);
		createEAttribute(discreteInputEClass, DISCRETE_INPUT__MAX_POLARISATION_VOLTAGE);
		createEAttribute(discreteInputEClass, DISCRETE_INPUT__MAX_VOLTAGE_GND);
		createEAttribute(discreteInputEClass, DISCRETE_INPUT__MIN_VOLTAGE_GND);
		createEAttribute(discreteInputEClass, DISCRETE_INPUT__MAX_VOLTAGE_OPN);
		createEAttribute(discreteInputEClass, DISCRETE_INPUT__MIN_VOLTAGE_OPN);
		createEAttribute(discreteInputEClass, DISCRETE_INPUT__POLARISATION_FAILURE_DEMATURATION_DURATION);
		createEAttribute(discreteInputEClass, DISCRETE_INPUT__POLARISATION_FAILURE_MATURATION_DURATION);

		discreteOutputEClass = createEClass(DISCRETE_OUTPUT);
		createEAttribute(discreteOutputEClass, DISCRETE_OUTPUT__CLOSE_VOLT_MARGIN);
		createEAttribute(discreteOutputEClass, DISCRETE_OUTPUT__INTERNAL_PULL_UP_VOLTAGE);
		createEAttribute(discreteOutputEClass, DISCRETE_OUTPUT__MAX_VCASE_GND_CONN);
		createEAttribute(discreteOutputEClass, DISCRETE_OUTPUT__NORMAL_LOAD_RESISTANCE);
		createEAttribute(discreteOutputEClass, DISCRETE_OUTPUT__NORMAL_LOAD_VOLTAGE);
		createEAttribute(discreteOutputEClass, DISCRETE_OUTPUT__OVER_CURRENT_FAULT_MATURATION_DURATION);
		createEAttribute(discreteOutputEClass, DISCRETE_OUTPUT__OVERLOAD_CURRENT_THRESHOLD);
		createEAttribute(discreteOutputEClass, DISCRETE_OUTPUT__SHORT_CIRCUIT_CURRENT_THRESHOLD);
		createEAttribute(discreteOutputEClass, DISCRETE_OUTPUT__SOFT_OVER_CURRENT_FAULT_MATURATION_DURATION);

		xTalkEClass = createEClass(XTALK);
		createEAttribute(xTalkEClass, XTALK__DIRECTION);

		a429EClass = createEClass(A429);
		createEAttribute(a429EClass, A429__DIRECTION);

		a664EClass = createEClass(A664);

		canEClass = createEClass(CAN);

		memEClass = createEClass(MEM);
		createEReference(memEClass, MEM__MEM_PORT_ID_EXTENSION);

		v_RTDEClass = createEClass(VRTD);

		portUserConfigurationEClass = createEClass(PORT_USER_CONFIGURATION);
		createEAttribute(portUserConfigurationEClass, PORT_USER_CONFIGURATION__LINE_FUNCTION);
		createEAttribute(portUserConfigurationEClass, PORT_USER_CONFIGURATION__SPECIAL_PARAM_1);
		createEAttribute(portUserConfigurationEClass, PORT_USER_CONFIGURATION__SPECIAL_PARAM_2);
		createEAttribute(portUserConfigurationEClass, PORT_USER_CONFIGURATION__SPECIAL_PARAM_3);
		createEAttribute(portUserConfigurationEClass, PORT_USER_CONFIGURATION__SPECIAL_PARAM_4);
		createEAttribute(portUserConfigurationEClass, PORT_USER_CONFIGURATION__SPECIAL_PARAM_5);
		createEAttribute(portUserConfigurationEClass, PORT_USER_CONFIGURATION__INIT_DEFAULT);
		createEAttribute(portUserConfigurationEClass, PORT_USER_CONFIGURATION__LOSS_OF_COMMAND);
		createEAttribute(portUserConfigurationEClass, PORT_USER_CONFIGURATION__NB_ALLOWED_RESETS);
		createEAttribute(portUserConfigurationEClass, PORT_USER_CONFIGURATION__RESET_WAIT_TIME);

		avdSchedulerExtensionEClass = createEClass(AVD_SCHEDULER_EXTENSION);
		createEAttribute(avdSchedulerExtensionEClass, AVD_SCHEDULER_EXTENSION__MIF_DURATION);
		createEAttribute(avdSchedulerExtensionEClass, AVD_SCHEDULER_EXTENSION__MAF_DURATION);
		createEAttribute(avdSchedulerExtensionEClass, AVD_SCHEDULER_EXTENSION__SCHEDULER_ID);
		createEAttribute(avdSchedulerExtensionEClass, AVD_SCHEDULER_EXTENSION__SCHEDULER_NAME);

		signalExtensionsEClass = createEClass(SIGNAL_EXTENSIONS);
		createEReference(signalExtensionsEClass, SIGNAL_EXTENSIONS__SIGNAL_EXTENSION);

		signalExtensionEClass = createEClass(SIGNAL_EXTENSION);
		createEAttribute(signalExtensionEClass, SIGNAL_EXTENSION__FUNCTION);
		createEAttribute(signalExtensionEClass, SIGNAL_EXTENSION__ASSOCIATED_LINE_NAME);

		memPortIDExtensionEClass = createEClass(MEM_PORT_ID_EXTENSION);
		createEAttribute(memPortIDExtensionEClass, MEM_PORT_ID_EXTENSION__PORT_ID);

		// Create data types
		connectorNameTypeEDataType = createEDataType(CONNECTOR_NAME_TYPE);
		connectorPinNameTypeEDataType = createEDataType(CONNECTOR_PIN_NAME_TYPE);
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
		EtypesPackage theEtypesPackage = (EtypesPackage)EPackage.Registry.INSTANCE.getEPackage(EtypesPackage.eNS_URI);
		EnumsPackage theEnumsPackage = (EnumsPackage)EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		avionicsVirtualDeviceEClass.getESuperTypes().add(theTargetsPackage.getSuperTargetType());
		avdPortsEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		avdPortsEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());
		superAVDPortTypeEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		superAVDPortTypeEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());
		functionalDataEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		functionalDataEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());
		superWiredPortTypeEClass.getESuperTypes().add(this.getSuperAVDPortType());
		superAnaloguePortTypeEClass.getESuperTypes().add(this.getSuperWiredPortType());
		analogueInputEClass.getESuperTypes().add(this.getSuperAnaloguePortType());
		analogueOutputEClass.getESuperTypes().add(this.getSuperAnaloguePortType());
		discreteInputEClass.getESuperTypes().add(this.getSuperWiredPortType());
		discreteOutputEClass.getESuperTypes().add(this.getSuperWiredPortType());
		xTalkEClass.getESuperTypes().add(this.getSuperAVDPortType());
		a429EClass.getESuperTypes().add(this.getSuperAVDPortType());
		a664EClass.getESuperTypes().add(this.getSuperAVDPortType());
		canEClass.getESuperTypes().add(this.getSuperAVDPortType());
		memEClass.getESuperTypes().add(this.getSuperAVDPortType());
		v_RTDEClass.getESuperTypes().add(this.getSuperAVDPortType());
		portUserConfigurationEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		portUserConfigurationEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());
		avdSchedulerExtensionEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		avdSchedulerExtensionEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());
		signalExtensionsEClass.getESuperTypes().add(theEtypesPackage.getSuperIdentifierType());
		signalExtensionsEClass.getESuperTypes().add(theEtypesPackage.getSuperTrackingType());
		signalExtensionEClass.getESuperTypes().add(theTargetsPackage.getSuperClassExtensionType());
		memPortIDExtensionEClass.getESuperTypes().add(theTargetsPackage.getSuperAssignmentSpecificationType());

		// Initialize classes, features, and operations; add parameters
		initEClass(avionicsVirtualDeviceEClass, AvionicsVirtualDevice.class, "AvionicsVirtualDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAvionicsVirtualDevice_Ports(), this.getAVDPorts(), null, "ports", null, 0, 1, AvionicsVirtualDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAvionicsVirtualDevice_ScheduleExtension(), this.getAVDSchedulerExtension(), null, "scheduleExtension", null, 0, 1, AvionicsVirtualDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(avdPortsEClass, AVDPorts.class, "AVDPorts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAVDPorts_Port(), this.getSuperAVDPortType(), null, "port", null, 0, -1, AVDPorts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(superAVDPortTypeEClass, SuperAVDPortType.class, "SuperAVDPortType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSuperAVDPortType_ConnectorName(), this.getConnectorNameType(), "ConnectorName", null, 0, 1, SuperAVDPortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSuperAVDPortType_ConnectorPinName(), this.getConnectorPinNameType(), "ConnectorPinName", null, 0, 1, SuperAVDPortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSuperAVDPortType_If_id(), ecorePackage.getEInt(), "if_id", null, 0, 1, SuperAVDPortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSuperAVDPortType_FunctionalData(), this.getFunctionalData(), null, "functionalData", null, 0, -1, SuperAVDPortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSuperAVDPortType_PortUserConfiguration(), this.getPortUserConfiguration(), null, "portUserConfiguration", null, 0, -1, SuperAVDPortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSuperAVDPortType_SignalExtensions(), this.getSignalExtensions(), null, "signalExtensions", null, 0, 1, SuperAVDPortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionalDataEClass, FunctionalData.class, "FunctionalData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionalData_Direction(), theEnumsPackage.getSingleDirectionType(), "direction", null, 0, 1, FunctionalData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionalData_If_signal(), ecorePackage.getEString(), "if_signal", null, 0, 1, FunctionalData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionalData_Param_type(), ecorePackage.getEString(), "param_type", null, 0, 1, FunctionalData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionalData_Param_length(), ecorePackage.getEInt(), "param_length", null, 0, 1, FunctionalData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(superWiredPortTypeEClass, SuperWiredPortType.class, "SuperWiredPortType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSuperWiredPortType_Max_rev_v(), ecorePackage.getEFloat(), "max_rev_v", null, 0, 1, SuperWiredPortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(superAnaloguePortTypeEClass, SuperAnaloguePortType.class, "SuperAnaloguePortType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSuperAnaloguePortType_Min_rev_v(), ecorePackage.getEFloat(), "min_rev_v", null, 0, 1, SuperAnaloguePortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analogueInputEClass, AnalogueInput.class, "AnalogueInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnalogueInput_Ai_voltage_max(), ecorePackage.getEFloat(), "ai_voltage_max", null, 0, 1, AnalogueInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalogueInput_Ai_voltage_max_vac_filtered(), ecorePackage.getEFloat(), "ai_voltage_max_vac_filtered", null, 0, 1, AnalogueInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalogueInput_Ai_voltage_max_vdc_filtered(), ecorePackage.getEFloat(), "ai_voltage_max_vdc_filtered", null, 0, 1, AnalogueInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalogueInput_Ai_voltage_min(), ecorePackage.getEFloat(), "ai_voltage_min", null, 0, 1, AnalogueInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalogueInput_Ai_voltage_min_vdc_filtered(), ecorePackage.getEFloat(), "ai_voltage_min_vdc_filtered", null, 0, 1, AnalogueInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalogueInput_Min_ai_frequency(), ecorePackage.getEFloat(), "min_ai_frequency", null, 0, 1, AnalogueInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analogueOutputEClass, AnalogueOutput.class, "AnalogueOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnalogueOutput_Ao_voltage_cmd_ac_max(), ecorePackage.getEFloat(), "ao_voltage_cmd_ac_max", null, 0, 1, AnalogueOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalogueOutput_Ao_voltage_cmd_ac_min(), ecorePackage.getEFloat(), "ao_voltage_cmd_ac_min", null, 0, 1, AnalogueOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalogueOutput_Ao_voltage_cmd_dc_max(), ecorePackage.getEFloat(), "ao_voltage_cmd_dc_max", null, 0, 1, AnalogueOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalogueOutput_Ao_voltage_cmd_dc_min(), ecorePackage.getEFloat(), "ao_voltage_cmd_dc_min", null, 0, 1, AnalogueOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalogueOutput_Ao_voltage_cmd_max(), ecorePackage.getEFloat(), "ao_voltage_cmd_max", null, 0, 1, AnalogueOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalogueOutput_Ao_voltage_cmd_min(), ecorePackage.getEFloat(), "ao_voltage_cmd_min", null, 0, 1, AnalogueOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalogueOutput_Over_current_threshold(), ecorePackage.getEFloat(), "over_current_threshold", null, 0, 1, AnalogueOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(discreteInputEClass, DiscreteInput.class, "DiscreteInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscreteInput_Hpp(), theEnumsPackage.getbooleanType(), "hpp", null, 0, 1, DiscreteInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscreteInput_Hpp_port(), ecorePackage.getEFloat(), "hpp_port", null, 0, 1, DiscreteInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscreteInput_Max_polarisation_voltage(), ecorePackage.getEFloat(), "max_polarisation_voltage", null, 0, 1, DiscreteInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscreteInput_Max_voltage_gnd(), ecorePackage.getEFloat(), "max_voltage_gnd", null, 0, 1, DiscreteInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscreteInput_Min_voltage_gnd(), ecorePackage.getEFloat(), "min_voltage_gnd", null, 0, 1, DiscreteInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscreteInput_Max_voltage_opn(), ecorePackage.getEFloat(), "max_voltage_opn", null, 0, 1, DiscreteInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscreteInput_Min_voltage_opn(), ecorePackage.getEFloat(), "min_voltage_opn", null, 0, 1, DiscreteInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscreteInput_Polarisation_failure_dematuration_duration(), ecorePackage.getEInt(), "polarisation_failure_dematuration_duration", null, 0, 1, DiscreteInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscreteInput_Polarisation_failure_maturation_duration(), ecorePackage.getEInt(), "polarisation_failure_maturation_duration", null, 0, 1, DiscreteInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(discreteOutputEClass, DiscreteOutput.class, "DiscreteOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscreteOutput_Close_volt_margin(), ecorePackage.getEFloat(), "close_volt_margin", null, 0, 1, DiscreteOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscreteOutput_Internal_pull_up_voltage(), ecorePackage.getEFloat(), "internal_pull_up_voltage", null, 0, 1, DiscreteOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscreteOutput_Max_v_case_gnd_conn(), ecorePackage.getEFloat(), "max_v_case_gnd_conn", null, 0, 1, DiscreteOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscreteOutput_Normal_load_resistance(), ecorePackage.getEFloat(), "normal_load_resistance", null, 0, 1, DiscreteOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscreteOutput_Normal_load_voltage(), ecorePackage.getEFloat(), "normal_load_voltage", null, 0, 1, DiscreteOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscreteOutput_Over_current_fault_maturation_duration(), ecorePackage.getEInt(), "over_current_fault_maturation_duration", null, 0, 1, DiscreteOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscreteOutput_Overload_current_threshold(), ecorePackage.getEFloat(), "overload_current_threshold", null, 0, 1, DiscreteOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscreteOutput_Short_circuit_current_threshold(), ecorePackage.getEFloat(), "short_circuit_current_threshold", null, 0, 1, DiscreteOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscreteOutput_Soft_over_current_fault_maturation_duration(), ecorePackage.getEInt(), "soft_over_current_fault_maturation_duration", null, 0, 1, DiscreteOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xTalkEClass, XTalk.class, "XTalk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXTalk_Direction(), theEnumsPackage.getSingleDirectionType(), "direction", null, 0, 1, XTalk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(a429EClass, targets.avip.A429.class, "A429", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getA429_Direction(), theEnumsPackage.getSingleDirectionType(), "direction", null, 0, 1, targets.avip.A429.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(a664EClass, targets.avip.A664.class, "A664", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(canEClass, targets.avip.CAN.class, "CAN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(memEClass, targets.avip.MEM.class, "MEM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMEM_MemPortIDExtension(), this.getMEMPortIDExtension(), null, "memPortIDExtension", null, 0, -1, targets.avip.MEM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(v_RTDEClass, V_RTD.class, "V_RTD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portUserConfigurationEClass, PortUserConfiguration.class, "PortUserConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPortUserConfiguration_Line_function(), ecorePackage.getEString(), "line_function", null, 0, 1, PortUserConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortUserConfiguration_Special_param_1(), ecorePackage.getEString(), "special_param_1", null, 0, 1, PortUserConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortUserConfiguration_Special_param_2(), ecorePackage.getEString(), "special_param_2", null, 0, 1, PortUserConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortUserConfiguration_Special_param_3(), ecorePackage.getEString(), "special_param_3", null, 0, 1, PortUserConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortUserConfiguration_Special_param_4(), ecorePackage.getEString(), "special_param_4", null, 0, 1, PortUserConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortUserConfiguration_Special_param_5(), ecorePackage.getEString(), "special_param_5", null, 0, 1, PortUserConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortUserConfiguration_Init_default(), ecorePackage.getEString(), "init_default", null, 0, 1, PortUserConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortUserConfiguration_Loss_of_command(), ecorePackage.getEString(), "loss_of_command", null, 0, 1, PortUserConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortUserConfiguration_Nb_allowed_resets(), ecorePackage.getEString(), "nb_allowed_resets", null, 0, 1, PortUserConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortUserConfiguration_Reset_wait_time(), ecorePackage.getEString(), "reset_wait_time", null, 0, 1, PortUserConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(avdSchedulerExtensionEClass, AVDSchedulerExtension.class, "AVDSchedulerExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAVDSchedulerExtension_Mif_duration(), ecorePackage.getEInt(), "mif_duration", null, 0, 1, AVDSchedulerExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAVDSchedulerExtension_Maf_duration(), ecorePackage.getEInt(), "maf_duration", null, 0, 1, AVDSchedulerExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAVDSchedulerExtension_Scheduler_id(), ecorePackage.getEString(), "scheduler_id", null, 0, 1, AVDSchedulerExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAVDSchedulerExtension_Scheduler_name(), ecorePackage.getEString(), "scheduler_name", null, 0, 1, AVDSchedulerExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalExtensionsEClass, SignalExtensions.class, "SignalExtensions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignalExtensions_SignalExtension(), this.getSignalExtension(), null, "signalExtension", null, 0, -1, SignalExtensions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalExtensionEClass, SignalExtension.class, "SignalExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignalExtension_Function(), ecorePackage.getEString(), "function", null, 0, 1, SignalExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignalExtension_AssociatedLineName(), ecorePackage.getEString(), "associatedLineName", null, 0, 1, SignalExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memPortIDExtensionEClass, MEMPortIDExtension.class, "MEMPortIDExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMEMPortIDExtension_PortID(), ecorePackage.getEInt(), "portID", null, 0, 1, MEMPortIDExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(connectorNameTypeEDataType, String.class, "ConnectorNameType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(connectorPinNameTypeEDataType, String.class, "ConnectorPinNameType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (connectorNameTypeEDataType,
		   source,
		   new String[] {
			   "name", "CONNECTOR_NAME_TYPE",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "pattern", "^[A-Z]{2}$\n"
		   });
		addAnnotation
		  (connectorPinNameTypeEDataType,
		   source,
		   new String[] {
			   "name", "CONNECTOR_PIN_NAME_TYPE",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "pattern", "^[0-9]{2}$"
		   });
	}

} //AvipPackageImpl
