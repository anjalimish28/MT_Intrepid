/**
 */
package ucof.common.edata.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import ucof.common.edata.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see ucof.common.edata.EdataPackage
 * @generated
 */
public class EdataValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EdataValidator INSTANCE = new EdataValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "ucof.common.edata";

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
	public EdataValidator() {
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
	  return EdataPackage.eINSTANCE;
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
			case EdataPackage.DEC_OR_HEX_VALUE_TYPE:
				return validateDecOrHexValueType((String)value, diagnostics, context);
			case EdataPackage.HEX_ADDRESS_TYPE:
				return validateHexAddressType((String)value, diagnostics, context);
			case EdataPackage.IDENTIFIER_VALUE_TYPE:
				return validateIdentifierValueType((String)value, diagnostics, context);
			case EdataPackage.UUID_TYPE:
				return validateUUIDType((String)value, diagnostics, context);
			case EdataPackage.IP_ADDRESS_TYPE:
				return validateIPAddressType((String)value, diagnostics, context);
			case EdataPackage.NAME_TYPE:
				return validateNameType((String)value, diagnostics, context);
			case EdataPackage.PORT_TYPE:
				return validatePortType((Integer)value, diagnostics, context);
			case EdataPackage.POSITIVE_INT_TYPE:
				return validatePositiveIntType((Integer)value, diagnostics, context);
			case EdataPackage.MAC_ADDRESS_TYPE:
				return validateMACAddressType((String)value, diagnostics, context);
			case EdataPackage.ETHER_TYPE:
				return validateEtherType((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecOrHexValueType(String decOrHexValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDecOrHexValueType_Pattern(decOrHexValueType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDecOrHexValueType_Pattern
	 */
	public static final  PatternMatcher [][] DEC_OR_HEX_VALUE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([+-]{0,1}[0-9]+|[+-]{0,1}0x[0-9a-fA-F]+)?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Dec Or Hex Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecOrHexValueType_Pattern(String decOrHexValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(EdataPackage.Literals.DEC_OR_HEX_VALUE_TYPE, decOrHexValueType, DEC_OR_HEX_VALUE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHexAddressType(String hexAddressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateHexAddressType_Pattern(hexAddressType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateHexAddressType_Pattern
	 */
	public static final  PatternMatcher [][] HEX_ADDRESS_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("0x[0-9A-Fa-f]+|[0-9]+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Hex Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHexAddressType_Pattern(String hexAddressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(EdataPackage.Literals.HEX_ADDRESS_TYPE, hexAddressType, HEX_ADDRESS_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifierValueType(String identifierValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIdentifierValueType_Pattern(identifierValueType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIdentifierValueType_Pattern
	 */
	public static final  PatternMatcher [][] IDENTIFIER_VALUE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[+-]{0,1}[0-9]+|[+-]{0,1}0x[0-9a-fA-F]+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Identifier Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifierValueType_Pattern(String identifierValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(EdataPackage.Literals.IDENTIFIER_VALUE_TYPE, identifierValueType, IDENTIFIER_VALUE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUUIDType(String uuidType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUUIDType_Pattern(uuidType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUUIDType_Pattern
	 */
	public static final  PatternMatcher [][] UUID_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>UUID Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUUIDType_Pattern(String uuidType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(EdataPackage.Literals.UUID_TYPE, uuidType, UUID_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIPAddressType(String ipAddressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIPAddressType_Pattern(ipAddressType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIPAddressType_Pattern
	 */
	public static final  PatternMatcher [][] IP_ADDRESS_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(([^.])|([0-9]{1,3}\\.){3}[0-9]{1,3})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>IP Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIPAddressType_Pattern(String ipAddressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(EdataPackage.Literals.IP_ADDRESS_TYPE, ipAddressType, IP_ADDRESS_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameType(String nameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNameType_MinLength(nameType, diagnostics, context);
		if (result || diagnostics != null) result &= validateNameType_MaxLength(nameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameType_MinLength(String nameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = nameType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(EdataPackage.Literals.NAME_TYPE, nameType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameType_MaxLength(String nameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = nameType.length();
		boolean result = length <= 30;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(EdataPackage.Literals.NAME_TYPE, nameType, length, 30, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortType(Integer portType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePortType_Min(portType, diagnostics, context);
		if (result || diagnostics != null) result &= validatePortType_Max(portType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePortType_Min
	 */
	public static final Integer PORT_TYPE__MIN__VALUE = new Integer(0);

	/**
	 * Validates the Min constraint of '<em>Port Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortType_Min(Integer portType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = portType.compareTo(PORT_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(EdataPackage.Literals.PORT_TYPE, portType, PORT_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePortType_Max
	 */
	public static final Integer PORT_TYPE__MAX__VALUE = new Integer(65535);

	/**
	 * Validates the Max constraint of '<em>Port Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortType_Max(Integer portType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = portType.compareTo(PORT_TYPE__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(EdataPackage.Literals.PORT_TYPE, portType, PORT_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveIntType(Integer positiveIntType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePositiveIntType_Min(positiveIntType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePositiveIntType_Min
	 */
	public static final Integer POSITIVE_INT_TYPE__MIN__VALUE = new Integer(0);

	/**
	 * Validates the Min constraint of '<em>Positive Int Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveIntType_Min(Integer positiveIntType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = positiveIntType.compareTo(POSITIVE_INT_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(EdataPackage.Literals.POSITIVE_INT_TYPE, positiveIntType, POSITIVE_INT_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMACAddressType(String macAddressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMACAddressType_Pattern(macAddressType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateMACAddressType_Pattern
	 */
	public static final  PatternMatcher [][] MAC_ADDRESS_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9A-Fa-f]{2}:[0-9A-Fa-f]{2}:[0-9A-Fa-f]{2}:[0-9A-Fa-f]{2}:[0-9A-Fa-f]{2}:[0-9A-Fa-f]{2}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>MAC Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMACAddressType_Pattern(String macAddressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(EdataPackage.Literals.MAC_ADDRESS_TYPE, macAddressType, MAC_ADDRESS_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEtherType(String etherType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateEtherType_Pattern(etherType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateEtherType_Pattern
	 */
	public static final  PatternMatcher [][] ETHER_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("0x[0-9A-Fa-f]{4}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Ether Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEtherType_Pattern(String etherType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(EdataPackage.Literals.ETHER_TYPE, etherType, ETHER_TYPE__PATTERN__VALUES, diagnostics, context);
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

} //EdataValidator
