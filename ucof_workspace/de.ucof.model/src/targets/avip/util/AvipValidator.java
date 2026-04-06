/**
 */
package targets.avip.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import targets.avip.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see targets.avip.AvipPackage
 * @generated
 */
public class AvipValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AvipValidator INSTANCE = new AvipValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "targets.avip";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvipValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return AvipPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case AvipPackage.AVIONICS_VIRTUAL_DEVICE:
				return validateAvionicsVirtualDevice((AvionicsVirtualDevice)value, diagnostics, context);
			case AvipPackage.AVD_PORTS:
				return validateAVDPorts((AVDPorts)value, diagnostics, context);
			case AvipPackage.SUPER_AVD_PORT_TYPE:
				return validateSuperAVDPortType((SuperAVDPortType)value, diagnostics, context);
			case AvipPackage.FUNCTIONAL_DATA:
				return validateFunctionalData((FunctionalData)value, diagnostics, context);
			case AvipPackage.SUPER_WIRED_PORT_TYPE:
				return validateSuperWiredPortType((SuperWiredPortType)value, diagnostics, context);
			case AvipPackage.SUPER_ANALOGUE_PORT_TYPE:
				return validateSuperAnaloguePortType((SuperAnaloguePortType)value, diagnostics, context);
			case AvipPackage.ANALOGUE_INPUT:
				return validateAnalogueInput((AnalogueInput)value, diagnostics, context);
			case AvipPackage.ANALOGUE_OUTPUT:
				return validateAnalogueOutput((AnalogueOutput)value, diagnostics, context);
			case AvipPackage.DISCRETE_INPUT:
				return validateDiscreteInput((DiscreteInput)value, diagnostics, context);
			case AvipPackage.DISCRETE_OUTPUT:
				return validateDiscreteOutput((DiscreteOutput)value, diagnostics, context);
			case AvipPackage.XTALK:
				return validateXTalk((XTalk)value, diagnostics, context);
			case AvipPackage.A429:
				return validateA429((A429)value, diagnostics, context);
			case AvipPackage.A664:
				return validateA664((A664)value, diagnostics, context);
			case AvipPackage.CAN:
				return validateCAN((CAN)value, diagnostics, context);
			case AvipPackage.MEM:
				return validateMEM((MEM)value, diagnostics, context);
			case AvipPackage.VRTD:
				return validateV_RTD((V_RTD)value, diagnostics, context);
			case AvipPackage.PORT_USER_CONFIGURATION:
				return validatePortUserConfiguration((PortUserConfiguration)value, diagnostics, context);
			case AvipPackage.AVD_SCHEDULER_EXTENSION:
				return validateAVDSchedulerExtension((AVDSchedulerExtension)value, diagnostics, context);
			case AvipPackage.SIGNAL_EXTENSIONS:
				return validateSignalExtensions((SignalExtensions)value, diagnostics, context);
			case AvipPackage.SIGNAL_EXTENSION:
				return validateSignalExtension((SignalExtension)value, diagnostics, context);
			case AvipPackage.MEM_PORT_ID_EXTENSION:
				return validateMEMPortIDExtension((MEMPortIDExtension)value, diagnostics, context);
			case AvipPackage.CONNECTOR_NAME_TYPE:
				return validateConnectorNameType((String)value, diagnostics, context);
			case AvipPackage.CONNECTOR_PIN_NAME_TYPE:
				return validateConnectorPinNameType((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAvionicsVirtualDevice(AvionicsVirtualDevice avionicsVirtualDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(avionicsVirtualDevice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAVDPorts(AVDPorts avdPorts, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(avdPorts, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSuperAVDPortType(SuperAVDPortType superAVDPortType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(superAVDPortType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalData(FunctionalData functionalData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionalData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSuperWiredPortType(SuperWiredPortType superWiredPortType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(superWiredPortType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSuperAnaloguePortType(SuperAnaloguePortType superAnaloguePortType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(superAnaloguePortType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnalogueInput(AnalogueInput analogueInput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(analogueInput, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnalogueOutput(AnalogueOutput analogueOutput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(analogueOutput, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteInput(DiscreteInput discreteInput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(discreteInput, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteOutput(DiscreteOutput discreteOutput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(discreteOutput, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXTalk(XTalk xTalk, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xTalk, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateA429(A429 a429, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(a429, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateA664(A664 a664, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(a664, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCAN(CAN can, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(can, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMEM(MEM mem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateV_RTD(V_RTD v_RTD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(v_RTD, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortUserConfiguration(PortUserConfiguration portUserConfiguration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(portUserConfiguration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAVDSchedulerExtension(AVDSchedulerExtension avdSchedulerExtension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(avdSchedulerExtension, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalExtensions(SignalExtensions signalExtensions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signalExtensions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalExtension(SignalExtension signalExtension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signalExtension, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMEMPortIDExtension(MEMPortIDExtension memPortIDExtension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(memPortIDExtension, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorNameType(String connectorNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateConnectorNameType_Pattern(connectorNameType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateConnectorNameType_Pattern
	 */
	public static final  PatternMatcher [][] CONNECTOR_NAME_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("^[A-Z]{2}$\n")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Connector Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorNameType_Pattern(String connectorNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(AvipPackage.Literals.CONNECTOR_NAME_TYPE, connectorNameType, CONNECTOR_NAME_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorPinNameType(String connectorPinNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateConnectorPinNameType_Pattern(connectorPinNameType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateConnectorPinNameType_Pattern
	 */
	public static final  PatternMatcher [][] CONNECTOR_PIN_NAME_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("^[0-9]{2}$")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Connector Pin Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorPinNameType_Pattern(String connectorPinNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(AvipPackage.Literals.CONNECTOR_PIN_NAME_TYPE, connectorPinNameType, CONNECTOR_PIN_NAME_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //AvipValidator
