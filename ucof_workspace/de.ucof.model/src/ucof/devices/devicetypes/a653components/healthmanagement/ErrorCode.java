/**
 */
package ucof.devices.devicetypes.a653components.healthmanagement;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Error Code</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage#getErrorCode()
 * @model
 * @generated
 */
public enum ErrorCode implements Enumerator {
	/**
	 * The '<em><b>Not Set</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_SET_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_SET(0, "NotSet", "NotSet"),

	/**
	 * The '<em><b>Deadline Missed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEADLINE_MISSED_VALUE
	 * @generated
	 * @ordered
	 */
	DEADLINE_MISSED(1, "DeadlineMissed", "DeadlineMissed"),

	/**
	 * The '<em><b>Application Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_ERROR(2, "ApplicationError", "ApplicationError"),

	/**
	 * The '<em><b>Numeric Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMERIC_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	NUMERIC_ERROR(3, "NumericError", "NumericError"),

	/**
	 * The '<em><b>Illegal Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ILLEGAL_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	ILLEGAL_REQUEST(4, "IllegalRequest", "IllegalRequest"),

	/**
	 * The '<em><b>Stack Overflow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STACK_OVERFLOW_VALUE
	 * @generated
	 * @ordered
	 */
	STACK_OVERFLOW(5, "StackOverflow", "StackOverflow"),

	/**
	 * The '<em><b>Memory Violation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMORY_VIOLATION_VALUE
	 * @generated
	 * @ordered
	 */
	MEMORY_VIOLATION(6, "MemoryViolation", "MemoryViolation"),

	/**
	 * The '<em><b>Hardware Fault</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HARDWARE_FAULT_VALUE
	 * @generated
	 * @ordered
	 */
	HARDWARE_FAULT(7, "HardwareFault", "HardwareFault"),

	/**
	 * The '<em><b>Power Fail</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER_FAIL_VALUE
	 * @generated
	 * @ordered
	 */
	POWER_FAIL(8, "PowerFail", "PowerFail");

	/**
	 * The '<em><b>Not Set</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_SET
	 * @model name="NotSet"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_SET_VALUE = 0;

	/**
	 * The '<em><b>Deadline Missed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEADLINE_MISSED
	 * @model name="DeadlineMissed"
	 * @generated
	 * @ordered
	 */
	public static final int DEADLINE_MISSED_VALUE = 1;

	/**
	 * The '<em><b>Application Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_ERROR
	 * @model name="ApplicationError"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_ERROR_VALUE = 2;

	/**
	 * The '<em><b>Numeric Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMERIC_ERROR
	 * @model name="NumericError"
	 * @generated
	 * @ordered
	 */
	public static final int NUMERIC_ERROR_VALUE = 3;

	/**
	 * The '<em><b>Illegal Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ILLEGAL_REQUEST
	 * @model name="IllegalRequest"
	 * @generated
	 * @ordered
	 */
	public static final int ILLEGAL_REQUEST_VALUE = 4;

	/**
	 * The '<em><b>Stack Overflow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STACK_OVERFLOW
	 * @model name="StackOverflow"
	 * @generated
	 * @ordered
	 */
	public static final int STACK_OVERFLOW_VALUE = 5;

	/**
	 * The '<em><b>Memory Violation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMORY_VIOLATION
	 * @model name="MemoryViolation"
	 * @generated
	 * @ordered
	 */
	public static final int MEMORY_VIOLATION_VALUE = 6;

	/**
	 * The '<em><b>Hardware Fault</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HARDWARE_FAULT
	 * @model name="HardwareFault"
	 * @generated
	 * @ordered
	 */
	public static final int HARDWARE_FAULT_VALUE = 7;

	/**
	 * The '<em><b>Power Fail</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER_FAIL
	 * @model name="PowerFail"
	 * @generated
	 * @ordered
	 */
	public static final int POWER_FAIL_VALUE = 8;

	/**
	 * An array of all the '<em><b>Error Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ErrorCode[] VALUES_ARRAY =
		new ErrorCode[] {
			NOT_SET,
			DEADLINE_MISSED,
			APPLICATION_ERROR,
			NUMERIC_ERROR,
			ILLEGAL_REQUEST,
			STACK_OVERFLOW,
			MEMORY_VIOLATION,
			HARDWARE_FAULT,
			POWER_FAIL,
		};

	/**
	 * A public read-only list of all the '<em><b>Error Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ErrorCode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Error Code</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ErrorCode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ErrorCode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Error Code</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ErrorCode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ErrorCode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Error Code</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ErrorCode get(int value) {
		switch (value) {
			case NOT_SET_VALUE: return NOT_SET;
			case DEADLINE_MISSED_VALUE: return DEADLINE_MISSED;
			case APPLICATION_ERROR_VALUE: return APPLICATION_ERROR;
			case NUMERIC_ERROR_VALUE: return NUMERIC_ERROR;
			case ILLEGAL_REQUEST_VALUE: return ILLEGAL_REQUEST;
			case STACK_OVERFLOW_VALUE: return STACK_OVERFLOW;
			case MEMORY_VIOLATION_VALUE: return MEMORY_VIOLATION;
			case HARDWARE_FAULT_VALUE: return HARDWARE_FAULT;
			case POWER_FAIL_VALUE: return POWER_FAIL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ErrorCode(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ErrorCode
