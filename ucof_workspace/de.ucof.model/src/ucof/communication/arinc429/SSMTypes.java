/**
 */
package ucof.communication.arinc429;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SSM Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ucof.communication.arinc429.Arinc429Package#getSSMTypes()
 * @model extendedMetaData="name='SSMTypes'"
 * @generated
 */
public enum SSMTypes implements Enumerator {
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
	 * The '<em><b>Plus North East Right To Above</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLUS_NORTH_EAST_RIGHT_TO_ABOVE_VALUE
	 * @generated
	 * @ordered
	 */
	PLUS_NORTH_EAST_RIGHT_TO_ABOVE(1, "Plus_North_East_Right_To_Above", "Plus_North_East_Right_To_Above"),

	/**
	 * The '<em><b>No Computed Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_COMPUTED_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	NO_COMPUTED_DATA(2, "No_Computed_Data", "No_Computed_Data"),

	/**
	 * The '<em><b>Functional Test</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTIONAL_TEST_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTIONAL_TEST(3, "Functional_Test", "Functional_Test"),

	/**
	 * The '<em><b>Minus South West Left From Below</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINUS_SOUTH_WEST_LEFT_FROM_BELOW_VALUE
	 * @generated
	 * @ordered
	 */
	MINUS_SOUTH_WEST_LEFT_FROM_BELOW(4, "Minus_South_West_Left_From_Below", "Minus_South_West_Left_From_Below"),

	/**
	 * The '<em><b>Verified Data Normal Operation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERIFIED_DATA_NORMAL_OPERATION_VALUE
	 * @generated
	 * @ordered
	 */
	VERIFIED_DATA_NORMAL_OPERATION(5, "Verified_Data_Normal_Operation", "Verified_Data_Normal_Operation"),

	/**
	 * The '<em><b>Failure Warning</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAILURE_WARNING_VALUE
	 * @generated
	 * @ordered
	 */
	FAILURE_WARNING(6, "Failure_Warning", "Failure_Warning");

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
	 * The '<em><b>Plus North East Right To Above</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLUS_NORTH_EAST_RIGHT_TO_ABOVE
	 * @model name="Plus_North_East_Right_To_Above"
	 * @generated
	 * @ordered
	 */
	public static final int PLUS_NORTH_EAST_RIGHT_TO_ABOVE_VALUE = 1;

	/**
	 * The '<em><b>No Computed Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_COMPUTED_DATA
	 * @model name="No_Computed_Data"
	 * @generated
	 * @ordered
	 */
	public static final int NO_COMPUTED_DATA_VALUE = 2;

	/**
	 * The '<em><b>Functional Test</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTIONAL_TEST
	 * @model name="Functional_Test"
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTIONAL_TEST_VALUE = 3;

	/**
	 * The '<em><b>Minus South West Left From Below</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINUS_SOUTH_WEST_LEFT_FROM_BELOW
	 * @model name="Minus_South_West_Left_From_Below"
	 * @generated
	 * @ordered
	 */
	public static final int MINUS_SOUTH_WEST_LEFT_FROM_BELOW_VALUE = 4;

	/**
	 * The '<em><b>Verified Data Normal Operation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERIFIED_DATA_NORMAL_OPERATION
	 * @model name="Verified_Data_Normal_Operation"
	 * @generated
	 * @ordered
	 */
	public static final int VERIFIED_DATA_NORMAL_OPERATION_VALUE = 5;

	/**
	 * The '<em><b>Failure Warning</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAILURE_WARNING
	 * @model name="Failure_Warning"
	 * @generated
	 * @ordered
	 */
	public static final int FAILURE_WARNING_VALUE = 6;

	/**
	 * An array of all the '<em><b>SSM Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SSMTypes[] VALUES_ARRAY =
		new SSMTypes[] {
			NOT_SET,
			PLUS_NORTH_EAST_RIGHT_TO_ABOVE,
			NO_COMPUTED_DATA,
			FUNCTIONAL_TEST,
			MINUS_SOUTH_WEST_LEFT_FROM_BELOW,
			VERIFIED_DATA_NORMAL_OPERATION,
			FAILURE_WARNING,
		};

	/**
	 * A public read-only list of all the '<em><b>SSM Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SSMTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SSM Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SSMTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SSMTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SSM Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SSMTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SSMTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SSM Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SSMTypes get(int value) {
		switch (value) {
			case NOT_SET_VALUE: return NOT_SET;
			case PLUS_NORTH_EAST_RIGHT_TO_ABOVE_VALUE: return PLUS_NORTH_EAST_RIGHT_TO_ABOVE;
			case NO_COMPUTED_DATA_VALUE: return NO_COMPUTED_DATA;
			case FUNCTIONAL_TEST_VALUE: return FUNCTIONAL_TEST;
			case MINUS_SOUTH_WEST_LEFT_FROM_BELOW_VALUE: return MINUS_SOUTH_WEST_LEFT_FROM_BELOW;
			case VERIFIED_DATA_NORMAL_OPERATION_VALUE: return VERIFIED_DATA_NORMAL_OPERATION;
			case FAILURE_WARNING_VALUE: return FAILURE_WARNING;
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
	private SSMTypes(int value, String name, String literal) {
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
	
} //SSMTypes
