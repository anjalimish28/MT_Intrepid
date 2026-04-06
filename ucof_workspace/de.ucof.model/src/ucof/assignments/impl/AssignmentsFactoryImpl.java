/**
 */
package ucof.assignments.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ucof.assignments.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssignmentsFactoryImpl extends EFactoryImpl implements AssignmentsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AssignmentsFactory init() {
		try {
			AssignmentsFactory theAssignmentsFactory = (AssignmentsFactory)EPackage.Registry.INSTANCE.getEFactory(AssignmentsPackage.eNS_URI);
			if (theAssignmentsFactory != null) {
				return theAssignmentsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AssignmentsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AssignmentsPackage.ASSIGNMENTS: return createAssignments();
			case AssignmentsPackage.INTERFACE_TO_PORT2_PORT_ASSIGNMENT_SET: return createInterfaceToPort2PortAssignmentSet();
			case AssignmentsPackage.INTERFACE_TO_PORT2_PORT_ASSIGNMENT: return createInterfaceToPort2PortAssignment();
			case AssignmentsPackage.DEVICE_TO_IMPLEMENTATION_ASSIGNMENT_SET: return createDeviceToImplementationAssignmentSet();
			case AssignmentsPackage.DEVICE_TO_IMPLEMENTATION_ASSIGNMENT: return createDeviceToImplementationAssignment();
			case AssignmentsPackage.INTERFACE_TO_HARDWARE_ASSIGNMENT_SET: return createInterfaceToHardwareAssignmentSet();
			case AssignmentsPackage.INTERFACE_TO_HARDWARE_ASSIGNMENT: return createInterfaceToHardwareAssignment();
			case AssignmentsPackage.PORT_TO_PORT_ASSIGNMENT_SET: return createPortToPortAssignmentSet();
			case AssignmentsPackage.PORT_TO_PORT_ASSIGNMENT: return createPortToPortAssignment();
			case AssignmentsPackage.ED247_ASSIGNMENT_SET: return createED247AssignmentSet();
			case AssignmentsPackage.ED247_ASSIGNMENT: return createED247Assignment();
			case AssignmentsPackage.UDP_SOCKET_EXTENSION: return createUDPSocketExtension();
			case AssignmentsPackage.SW_PORT_TO_HW_PORT_ASSIGNMENT_SET: return createSWPortToHWPortAssignmentSet();
			case AssignmentsPackage.SW_PORT_TO_HW_PORT_ASSIGNMENT: return createSWPortToHWPortAssignment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignments createAssignments() {
		AssignmentsImpl assignments = new AssignmentsImpl();
		return assignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceToPort2PortAssignmentSet createInterfaceToPort2PortAssignmentSet() {
		InterfaceToPort2PortAssignmentSetImpl interfaceToPort2PortAssignmentSet = new InterfaceToPort2PortAssignmentSetImpl();
		return interfaceToPort2PortAssignmentSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceToPort2PortAssignment createInterfaceToPort2PortAssignment() {
		InterfaceToPort2PortAssignmentImpl interfaceToPort2PortAssignment = new InterfaceToPort2PortAssignmentImpl();
		return interfaceToPort2PortAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceToImplementationAssignmentSet createDeviceToImplementationAssignmentSet() {
		DeviceToImplementationAssignmentSetImpl deviceToImplementationAssignmentSet = new DeviceToImplementationAssignmentSetImpl();
		return deviceToImplementationAssignmentSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceToImplementationAssignment createDeviceToImplementationAssignment() {
		DeviceToImplementationAssignmentImpl deviceToImplementationAssignment = new DeviceToImplementationAssignmentImpl();
		return deviceToImplementationAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceToHardwareAssignmentSet createInterfaceToHardwareAssignmentSet() {
		InterfaceToHardwareAssignmentSetImpl interfaceToHardwareAssignmentSet = new InterfaceToHardwareAssignmentSetImpl();
		return interfaceToHardwareAssignmentSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceToHardwareAssignment createInterfaceToHardwareAssignment() {
		InterfaceToHardwareAssignmentImpl interfaceToHardwareAssignment = new InterfaceToHardwareAssignmentImpl();
		return interfaceToHardwareAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortToPortAssignmentSet createPortToPortAssignmentSet() {
		PortToPortAssignmentSetImpl portToPortAssignmentSet = new PortToPortAssignmentSetImpl();
		return portToPortAssignmentSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortToPortAssignment createPortToPortAssignment() {
		PortToPortAssignmentImpl portToPortAssignment = new PortToPortAssignmentImpl();
		return portToPortAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ED247AssignmentSet createED247AssignmentSet() {
		ED247AssignmentSetImpl ed247AssignmentSet = new ED247AssignmentSetImpl();
		return ed247AssignmentSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ED247Assignment createED247Assignment() {
		ED247AssignmentImpl ed247Assignment = new ED247AssignmentImpl();
		return ed247Assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UDPSocketExtension createUDPSocketExtension() {
		UDPSocketExtensionImpl udpSocketExtension = new UDPSocketExtensionImpl();
		return udpSocketExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SWPortToHWPortAssignmentSet createSWPortToHWPortAssignmentSet() {
		SWPortToHWPortAssignmentSetImpl swPortToHWPortAssignmentSet = new SWPortToHWPortAssignmentSetImpl();
		return swPortToHWPortAssignmentSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SWPortToHWPortAssignment createSWPortToHWPortAssignment() {
		SWPortToHWPortAssignmentImpl swPortToHWPortAssignment = new SWPortToHWPortAssignmentImpl();
		return swPortToHWPortAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentsPackage getAssignmentsPackage() {
		return (AssignmentsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AssignmentsPackage getPackage() {
		return AssignmentsPackage.eINSTANCE;
	}

} //AssignmentsFactoryImpl
