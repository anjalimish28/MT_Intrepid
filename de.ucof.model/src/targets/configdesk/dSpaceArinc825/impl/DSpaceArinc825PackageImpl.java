/**
 */
package targets.configdesk.dSpaceArinc825.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import targets.TargetsPackage;

import targets.a653capabletarget.A653capabletargetPackage;

import targets.a653capabletarget.impl.A653capabletargetPackageImpl;

import targets.avip.AvipPackage;
import targets.avip.impl.AvipPackageImpl;
import targets.configdesk.ConfigdeskPackage;

import targets.configdesk.dSpaceArinc825.A825Configuration;
import targets.configdesk.dSpaceArinc825.DSpaceArinc825Factory;
import targets.configdesk.dSpaceArinc825.DSpaceArinc825Package;
import targets.configdesk.dSpaceArinc825.FeatureCyclicTimingControl;
import targets.configdesk.dSpaceArinc825.FeatureEnable;
import targets.configdesk.dSpaceArinc825.FeatureFrameAccess;
import targets.configdesk.dSpaceArinc825.FeatureRawData;
import targets.configdesk.dSpaceArinc825.FeatureTrigger;
import targets.configdesk.dSpaceArinc825.ModelAccess;
import targets.configdesk.dSpaceArinc825.ModelAccessiblePortsRX;
import targets.configdesk.dSpaceArinc825.ModelAccessiblePortsTX;
import targets.configdesk.dSpaceArinc825.ModelPortBlockStructure;
import targets.configdesk.dSpaceArinc825.SignalModelAccessStatus;
import targets.configdesk.dSpaceArinc825.SuperConfigurationDeskA825StatusExtensionType;
import targets.configdesk.dSpaceArinc825.SuperFeatureType;

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
public class DSpaceArinc825PackageImpl extends EPackageImpl implements DSpaceArinc825Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass a825ConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superConfigurationDeskA825StatusExtensionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalModelAccessStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superFeatureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureCyclicTimingControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureRawDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEnableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureFrameAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modelAccessEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modelAccessiblePortsRXEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modelAccessiblePortsTXEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modelPortBlockStructureEEnum = null;

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
	 * @see targets.configdesk.dSpaceArinc825.DSpaceArinc825Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DSpaceArinc825PackageImpl() {
		super(eNS_URI, DSpaceArinc825Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DSpaceArinc825Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DSpaceArinc825Package init() {
		if (isInited) return (DSpaceArinc825Package)EPackage.Registry.INSTANCE.getEPackage(DSpaceArinc825Package.eNS_URI);

		// Obtain or create and register package
		Object registeredDSpaceArinc825Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		DSpaceArinc825PackageImpl theDSpaceArinc825Package = registeredDSpaceArinc825Package instanceof DSpaceArinc825PackageImpl ? (DSpaceArinc825PackageImpl)registeredDSpaceArinc825Package : new DSpaceArinc825PackageImpl();

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
		theDSpaceArinc825Package.createPackageContents();
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
		theEthernetPackage.createPackageContents();
		theWiredPackage.createPackageContents();
		theTricore299a653p4Package.createPackageContents();
		theMatlabPackage.createPackageContents();
		theA653capabletargetPackage.createPackageContents();
		theVxworksa653Package.createPackageContents();
		theAvipPackage.createPackageContents();

		// Initialize created meta-data
		theDSpaceArinc825Package.initializePackageContents();
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
		theEthernetPackage.initializePackageContents();
		theWiredPackage.initializePackageContents();
		theTricore299a653p4Package.initializePackageContents();
		theMatlabPackage.initializePackageContents();
		theA653capabletargetPackage.initializePackageContents();
		theVxworksa653Package.initializePackageContents();
		theAvipPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDSpaceArinc825Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DSpaceArinc825Package.eNS_URI, theDSpaceArinc825Package);
		return theDSpaceArinc825Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getA825Configuration() {
		return a825ConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA825Configuration_ChannelName() {
		return (EAttribute)a825ConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA825Configuration_Terminated() {
		return (EAttribute)a825ConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA825Configuration_AssignedChannelSet() {
		return (EAttribute)a825ConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA825Configuration_CanChannel() {
		return (EAttribute)a825ConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA825Configuration_ModelAccess() {
		return (EAttribute)a825ConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA825Configuration_ModelPortBlockStructure() {
		return (EAttribute)a825ConfigurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA825Configuration_ECU() {
		return (EAttribute)a825ConfigurationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getA825Configuration_StatusExtension() {
		return (EReference)a825ConfigurationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperConfigurationDeskA825StatusExtensionType() {
		return superConfigurationDeskA825StatusExtensionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalModelAccessStatus() {
		return signalModelAccessStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignalModelAccessStatus_ModelAccessEnabled() {
		return (EAttribute)signalModelAccessStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperFeatureType() {
		return superFeatureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureTrigger() {
		return featureTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureTrigger_Trigger() {
		return (EAttribute)featureTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureCyclicTimingControl() {
		return featureCyclicTimingControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureCyclicTimingControl_ControlPeriodModelAccess() {
		return (EAttribute)featureCyclicTimingControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureCyclicTimingControl_ControlOffsetModelAccess() {
		return (EAttribute)featureCyclicTimingControlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureRawData() {
		return featureRawDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureRawData_RawDataModelAccess() {
		return (EAttribute)featureRawDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureEnable() {
		return featureEnableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureEnable_EnableModelAccess() {
		return (EAttribute)featureEnableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureFrameAccess() {
		return featureFrameAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureFrameAccess_TriggerModelAccess() {
		return (EAttribute)featureFrameAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureFrameAccess_LengthModelAccess() {
		return (EAttribute)featureFrameAccessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureFrameAccess_RawDataModelAccess() {
		return (EAttribute)featureFrameAccessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureFrameAccess_IdentifierModelAccess() {
		return (EAttribute)featureFrameAccessEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureFrameAccess_ExtendedAddressingModelAccess() {
		return (EAttribute)featureFrameAccessEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureFrameAccess_CanFDFrameSupportModelAccess() {
		return (EAttribute)featureFrameAccessEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureFrameAccess_BitRateSwitchModelAccess() {
		return (EAttribute)featureFrameAccessEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModelAccess() {
		return modelAccessEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModelAccessiblePortsRX() {
		return modelAccessiblePortsRXEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModelAccessiblePortsTX() {
		return modelAccessiblePortsTXEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModelPortBlockStructure() {
		return modelPortBlockStructureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSpaceArinc825Factory getDSpaceArinc825Factory() {
		return (DSpaceArinc825Factory)getEFactoryInstance();
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
		a825ConfigurationEClass = createEClass(A825_CONFIGURATION);
		createEAttribute(a825ConfigurationEClass, A825_CONFIGURATION__CHANNEL_NAME);
		createEAttribute(a825ConfigurationEClass, A825_CONFIGURATION__TERMINATED);
		createEAttribute(a825ConfigurationEClass, A825_CONFIGURATION__ASSIGNED_CHANNEL_SET);
		createEAttribute(a825ConfigurationEClass, A825_CONFIGURATION__CAN_CHANNEL);
		createEAttribute(a825ConfigurationEClass, A825_CONFIGURATION__MODEL_ACCESS);
		createEAttribute(a825ConfigurationEClass, A825_CONFIGURATION__MODEL_PORT_BLOCK_STRUCTURE);
		createEAttribute(a825ConfigurationEClass, A825_CONFIGURATION__ECU);
		createEReference(a825ConfigurationEClass, A825_CONFIGURATION__STATUS_EXTENSION);

		superConfigurationDeskA825StatusExtensionTypeEClass = createEClass(SUPER_CONFIGURATION_DESK_A825_STATUS_EXTENSION_TYPE);

		signalModelAccessStatusEClass = createEClass(SIGNAL_MODEL_ACCESS_STATUS);
		createEAttribute(signalModelAccessStatusEClass, SIGNAL_MODEL_ACCESS_STATUS__MODEL_ACCESS_ENABLED);

		superFeatureTypeEClass = createEClass(SUPER_FEATURE_TYPE);

		featureTriggerEClass = createEClass(FEATURE_TRIGGER);
		createEAttribute(featureTriggerEClass, FEATURE_TRIGGER__TRIGGER);

		featureCyclicTimingControlEClass = createEClass(FEATURE_CYCLIC_TIMING_CONTROL);
		createEAttribute(featureCyclicTimingControlEClass, FEATURE_CYCLIC_TIMING_CONTROL__CONTROL_PERIOD_MODEL_ACCESS);
		createEAttribute(featureCyclicTimingControlEClass, FEATURE_CYCLIC_TIMING_CONTROL__CONTROL_OFFSET_MODEL_ACCESS);

		featureRawDataEClass = createEClass(FEATURE_RAW_DATA);
		createEAttribute(featureRawDataEClass, FEATURE_RAW_DATA__RAW_DATA_MODEL_ACCESS);

		featureEnableEClass = createEClass(FEATURE_ENABLE);
		createEAttribute(featureEnableEClass, FEATURE_ENABLE__ENABLE_MODEL_ACCESS);

		featureFrameAccessEClass = createEClass(FEATURE_FRAME_ACCESS);
		createEAttribute(featureFrameAccessEClass, FEATURE_FRAME_ACCESS__TRIGGER_MODEL_ACCESS);
		createEAttribute(featureFrameAccessEClass, FEATURE_FRAME_ACCESS__LENGTH_MODEL_ACCESS);
		createEAttribute(featureFrameAccessEClass, FEATURE_FRAME_ACCESS__RAW_DATA_MODEL_ACCESS);
		createEAttribute(featureFrameAccessEClass, FEATURE_FRAME_ACCESS__IDENTIFIER_MODEL_ACCESS);
		createEAttribute(featureFrameAccessEClass, FEATURE_FRAME_ACCESS__EXTENDED_ADDRESSING_MODEL_ACCESS);
		createEAttribute(featureFrameAccessEClass, FEATURE_FRAME_ACCESS__CAN_FD_FRAME_SUPPORT_MODEL_ACCESS);
		createEAttribute(featureFrameAccessEClass, FEATURE_FRAME_ACCESS__BIT_RATE_SWITCH_MODEL_ACCESS);

		// Create enums
		modelAccessEEnum = createEEnum(MODEL_ACCESS);
		modelAccessiblePortsRXEEnum = createEEnum(MODEL_ACCESSIBLE_PORTS_RX);
		modelAccessiblePortsTXEEnum = createEEnum(MODEL_ACCESSIBLE_PORTS_TX);
		modelPortBlockStructureEEnum = createEEnum(MODEL_PORT_BLOCK_STRUCTURE);
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
		ConfigdeskPackage theConfigdeskPackage = (ConfigdeskPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigdeskPackage.eNS_URI);
		EnumsPackage theEnumsPackage = (EnumsPackage)EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI);
		TargetsPackage theTargetsPackage = (TargetsPackage)EPackage.Registry.INSTANCE.getEPackage(TargetsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		a825ConfigurationEClass.getESuperTypes().add(theConfigdeskPackage.getSuperConfigurationDeskIOHardwareType());
		superConfigurationDeskA825StatusExtensionTypeEClass.getESuperTypes().add(theTargetsPackage.getSuperClassExtensionType());
		signalModelAccessStatusEClass.getESuperTypes().add(this.getSuperConfigurationDeskA825StatusExtensionType());
		superFeatureTypeEClass.getESuperTypes().add(this.getSuperConfigurationDeskA825StatusExtensionType());
		featureTriggerEClass.getESuperTypes().add(this.getSuperFeatureType());
		featureCyclicTimingControlEClass.getESuperTypes().add(this.getSuperFeatureType());
		featureRawDataEClass.getESuperTypes().add(this.getSuperFeatureType());
		featureEnableEClass.getESuperTypes().add(this.getSuperFeatureType());
		featureFrameAccessEClass.getESuperTypes().add(this.getSuperFeatureType());

		// Initialize classes, features, and operations; add parameters
		initEClass(a825ConfigurationEClass, A825Configuration.class, "A825Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getA825Configuration_ChannelName(), ecorePackage.getEString(), "channelName", null, 0, 1, A825Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getA825Configuration_Terminated(), theEnumsPackage.getbooleanType(), "terminated", null, 0, 1, A825Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getA825Configuration_AssignedChannelSet(), ecorePackage.getEString(), "assignedChannelSet", null, 0, 1, A825Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getA825Configuration_CanChannel(), ecorePackage.getEString(), "canChannel", null, 0, 1, A825Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getA825Configuration_ModelAccess(), this.getModelAccess(), "modelAccess", null, 0, 1, A825Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getA825Configuration_ModelPortBlockStructure(), this.getModelPortBlockStructure(), "modelPortBlockStructure", null, 0, 1, A825Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getA825Configuration_ECU(), ecorePackage.getEString(), "eCU", null, 0, 1, A825Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getA825Configuration_StatusExtension(), this.getSuperConfigurationDeskA825StatusExtensionType(), null, "statusExtension", null, 0, -1, A825Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(superConfigurationDeskA825StatusExtensionTypeEClass, SuperConfigurationDeskA825StatusExtensionType.class, "SuperConfigurationDeskA825StatusExtensionType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(signalModelAccessStatusEClass, SignalModelAccessStatus.class, "SignalModelAccessStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignalModelAccessStatus_ModelAccessEnabled(), theEnumsPackage.getbooleanType(), "modelAccessEnabled", null, 0, 1, SignalModelAccessStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(superFeatureTypeEClass, SuperFeatureType.class, "SuperFeatureType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureTriggerEClass, FeatureTrigger.class, "FeatureTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureTrigger_Trigger(), theEnumsPackage.getbooleanType(), "trigger", null, 0, 1, FeatureTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureCyclicTimingControlEClass, FeatureCyclicTimingControl.class, "FeatureCyclicTimingControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureCyclicTimingControl_ControlPeriodModelAccess(), theEnumsPackage.getbooleanType(), "controlPeriodModelAccess", null, 0, 1, FeatureCyclicTimingControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureCyclicTimingControl_ControlOffsetModelAccess(), theEnumsPackage.getbooleanType(), "controlOffsetModelAccess", null, 0, 1, FeatureCyclicTimingControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureRawDataEClass, FeatureRawData.class, "FeatureRawData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureRawData_RawDataModelAccess(), theEnumsPackage.getbooleanType(), "rawDataModelAccess", null, 0, 1, FeatureRawData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureEnableEClass, FeatureEnable.class, "FeatureEnable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureEnable_EnableModelAccess(), theEnumsPackage.getbooleanType(), "enableModelAccess", null, 0, 1, FeatureEnable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureFrameAccessEClass, FeatureFrameAccess.class, "FeatureFrameAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureFrameAccess_TriggerModelAccess(), theEnumsPackage.getbooleanType(), "triggerModelAccess", null, 0, 1, FeatureFrameAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureFrameAccess_LengthModelAccess(), theEnumsPackage.getbooleanType(), "lengthModelAccess", null, 0, 1, FeatureFrameAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureFrameAccess_RawDataModelAccess(), theEnumsPackage.getbooleanType(), "rawDataModelAccess", null, 0, 1, FeatureFrameAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureFrameAccess_IdentifierModelAccess(), theEnumsPackage.getbooleanType(), "identifierModelAccess", null, 0, 1, FeatureFrameAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureFrameAccess_ExtendedAddressingModelAccess(), theEnumsPackage.getbooleanType(), "extendedAddressingModelAccess", null, 0, 1, FeatureFrameAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureFrameAccess_CanFDFrameSupportModelAccess(), theEnumsPackage.getbooleanType(), "canFDFrameSupportModelAccess", null, 0, 1, FeatureFrameAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureFrameAccess_BitRateSwitchModelAccess(), theEnumsPackage.getbooleanType(), "bitRateSwitchModelAccess", null, 0, 1, FeatureFrameAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(modelAccessEEnum, ModelAccess.class, "ModelAccess");
		addEEnumLiteral(modelAccessEEnum, ModelAccess.NOT_SET);
		addEEnumLiteral(modelAccessEEnum, ModelAccess.ENABLED);
		addEEnumLiteral(modelAccessEEnum, ModelAccess.DISABLED);

		initEEnum(modelAccessiblePortsRXEEnum, ModelAccessiblePortsRX.class, "ModelAccessiblePortsRX");
		addEEnumLiteral(modelAccessiblePortsRXEEnum, ModelAccessiblePortsRX.NOT_SET);
		addEEnumLiteral(modelAccessiblePortsRXEEnum, ModelAccessiblePortsRX.DATA_VECTOR);
		addEEnumLiteral(modelAccessiblePortsRXEEnum, ModelAccessiblePortsRX.VECTOR_SIZE);
		addEEnumLiteral(modelAccessiblePortsRXEEnum, ModelAccessiblePortsRX.SOURCE_IP_ADDRESS);
		addEEnumLiteral(modelAccessiblePortsRXEEnum, ModelAccessiblePortsRX.SOURCE_PORT);

		initEEnum(modelAccessiblePortsTXEEnum, ModelAccessiblePortsTX.class, "ModelAccessiblePortsTX");
		addEEnumLiteral(modelAccessiblePortsTXEEnum, ModelAccessiblePortsTX.NOT_SET);
		addEEnumLiteral(modelAccessiblePortsTXEEnum, ModelAccessiblePortsTX.DATA_VECTOR);
		addEEnumLiteral(modelAccessiblePortsTXEEnum, ModelAccessiblePortsTX.MAX_VECTOR_SIZE);

		initEEnum(modelPortBlockStructureEEnum, ModelPortBlockStructure.class, "ModelPortBlockStructure");
		addEEnumLiteral(modelPortBlockStructureEEnum, ModelPortBlockStructure.NOT_SET);
		addEEnumLiteral(modelPortBlockStructureEEnum, ModelPortBlockStructure.UNGROUPED);
		addEEnumLiteral(modelPortBlockStructureEEnum, ModelPortBlockStructure.GROUPED);
	}

} //DSpaceArinc825PackageImpl
