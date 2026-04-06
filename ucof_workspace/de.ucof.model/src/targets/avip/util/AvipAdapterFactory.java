/**
 */
package targets.avip.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import targets.SuperAssignmentSpecificationType;
import targets.SuperClassExtensionType;
import targets.SuperTargetType;
import targets.avip.*;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see targets.avip.AvipPackage
 * @generated
 */
public class AvipAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AvipPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvipAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AvipPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvipSwitch<Adapter> modelSwitch =
		new AvipSwitch<Adapter>() {
			@Override
			public Adapter caseAvionicsVirtualDevice(AvionicsVirtualDevice object) {
				return createAvionicsVirtualDeviceAdapter();
			}
			@Override
			public Adapter caseAVDPorts(AVDPorts object) {
				return createAVDPortsAdapter();
			}
			@Override
			public Adapter caseSuperAVDPortType(SuperAVDPortType object) {
				return createSuperAVDPortTypeAdapter();
			}
			@Override
			public Adapter caseFunctionalData(FunctionalData object) {
				return createFunctionalDataAdapter();
			}
			@Override
			public Adapter caseSuperWiredPortType(SuperWiredPortType object) {
				return createSuperWiredPortTypeAdapter();
			}
			@Override
			public Adapter caseSuperAnaloguePortType(SuperAnaloguePortType object) {
				return createSuperAnaloguePortTypeAdapter();
			}
			@Override
			public Adapter caseAnalogueInput(AnalogueInput object) {
				return createAnalogueInputAdapter();
			}
			@Override
			public Adapter caseAnalogueOutput(AnalogueOutput object) {
				return createAnalogueOutputAdapter();
			}
			@Override
			public Adapter caseDiscreteInput(DiscreteInput object) {
				return createDiscreteInputAdapter();
			}
			@Override
			public Adapter caseDiscreteOutput(DiscreteOutput object) {
				return createDiscreteOutputAdapter();
			}
			@Override
			public Adapter caseXTalk(XTalk object) {
				return createXTalkAdapter();
			}
			@Override
			public Adapter caseA429(A429 object) {
				return createA429Adapter();
			}
			@Override
			public Adapter caseA664(A664 object) {
				return createA664Adapter();
			}
			@Override
			public Adapter caseCAN(CAN object) {
				return createCANAdapter();
			}
			@Override
			public Adapter caseMEM(MEM object) {
				return createMEMAdapter();
			}
			@Override
			public Adapter caseV_RTD(V_RTD object) {
				return createV_RTDAdapter();
			}
			@Override
			public Adapter casePortUserConfiguration(PortUserConfiguration object) {
				return createPortUserConfigurationAdapter();
			}
			@Override
			public Adapter caseAVDSchedulerExtension(AVDSchedulerExtension object) {
				return createAVDSchedulerExtensionAdapter();
			}
			@Override
			public Adapter caseSignalExtensions(SignalExtensions object) {
				return createSignalExtensionsAdapter();
			}
			@Override
			public Adapter caseSignalExtension(SignalExtension object) {
				return createSignalExtensionAdapter();
			}
			@Override
			public Adapter caseMEMPortIDExtension(MEMPortIDExtension object) {
				return createMEMPortIDExtensionAdapter();
			}
			@Override
			public Adapter caseSuperIdentifierType(SuperIdentifierType object) {
				return createSuperIdentifierTypeAdapter();
			}
			@Override
			public Adapter caseSuperTrackingType(SuperTrackingType object) {
				return createSuperTrackingTypeAdapter();
			}
			@Override
			public Adapter caseSuperTargetType(SuperTargetType object) {
				return createSuperTargetTypeAdapter();
			}
			@Override
			public Adapter caseSuperClassExtensionType(SuperClassExtensionType object) {
				return createSuperClassExtensionTypeAdapter();
			}
			@Override
			public Adapter caseSuperAssignmentSpecificationType(SuperAssignmentSpecificationType object) {
				return createSuperAssignmentSpecificationTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link targets.avip.AvionicsVirtualDevice <em>Avionics Virtual Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.avip.AvionicsVirtualDevice
	 * @generated
	 */
	public Adapter createAvionicsVirtualDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.avip.AVDPorts <em>AVD Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.avip.AVDPorts
	 * @generated
	 */
	public Adapter createAVDPortsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.avip.SuperAVDPortType <em>Super AVD Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.avip.SuperAVDPortType
	 * @generated
	 */
	public Adapter createSuperAVDPortTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.avip.FunctionalData <em>Functional Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.avip.FunctionalData
	 * @generated
	 */
	public Adapter createFunctionalDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.avip.SuperWiredPortType <em>Super Wired Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.avip.SuperWiredPortType
	 * @generated
	 */
	public Adapter createSuperWiredPortTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.avip.SuperAnaloguePortType <em>Super Analogue Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.avip.SuperAnaloguePortType
	 * @generated
	 */
	public Adapter createSuperAnaloguePortTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.avip.AnalogueInput <em>Analogue Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.avip.AnalogueInput
	 * @generated
	 */
	public Adapter createAnalogueInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.avip.AnalogueOutput <em>Analogue Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.avip.AnalogueOutput
	 * @generated
	 */
	public Adapter createAnalogueOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.avip.DiscreteInput <em>Discrete Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.avip.DiscreteInput
	 * @generated
	 */
	public Adapter createDiscreteInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.avip.DiscreteOutput <em>Discrete Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.avip.DiscreteOutput
	 * @generated
	 */
	public Adapter createDiscreteOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.avip.XTalk <em>XTalk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.avip.XTalk
	 * @generated
	 */
	public Adapter createXTalkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.avip.A429 <em>A429</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.avip.A429
	 * @generated
	 */
	public Adapter createA429Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.avip.A664 <em>A664</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.avip.A664
	 * @generated
	 */
	public Adapter createA664Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.avip.CAN <em>CAN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.avip.CAN
	 * @generated
	 */
	public Adapter createCANAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.avip.MEM <em>MEM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.avip.MEM
	 * @generated
	 */
	public Adapter createMEMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.avip.V_RTD <em>VRTD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.avip.V_RTD
	 * @generated
	 */
	public Adapter createV_RTDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.avip.PortUserConfiguration <em>Port User Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.avip.PortUserConfiguration
	 * @generated
	 */
	public Adapter createPortUserConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.avip.AVDSchedulerExtension <em>AVD Scheduler Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.avip.AVDSchedulerExtension
	 * @generated
	 */
	public Adapter createAVDSchedulerExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.avip.SignalExtensions <em>Signal Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.avip.SignalExtensions
	 * @generated
	 */
	public Adapter createSignalExtensionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.avip.SignalExtension <em>Signal Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.avip.SignalExtension
	 * @generated
	 */
	public Adapter createSignalExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.avip.MEMPortIDExtension <em>MEM Port ID Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.avip.MEMPortIDExtension
	 * @generated
	 */
	public Adapter createMEMPortIDExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.common.etypes.SuperIdentifierType <em>Super Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.common.etypes.SuperIdentifierType
	 * @generated
	 */
	public Adapter createSuperIdentifierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.common.etypes.SuperTrackingType <em>Super Tracking Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.common.etypes.SuperTrackingType
	 * @generated
	 */
	public Adapter createSuperTrackingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.SuperTargetType <em>Super Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.SuperTargetType
	 * @generated
	 */
	public Adapter createSuperTargetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.SuperClassExtensionType <em>Super Class Extension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.SuperClassExtensionType
	 * @generated
	 */
	public Adapter createSuperClassExtensionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.SuperAssignmentSpecificationType <em>Super Assignment Specification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.SuperAssignmentSpecificationType
	 * @generated
	 */
	public Adapter createSuperAssignmentSpecificationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AvipAdapterFactory
