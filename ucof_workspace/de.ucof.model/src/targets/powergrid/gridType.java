/**
 */
package targets.powergrid;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>grid Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see targets.powergrid.PowergridPackage#getgridType()
 * @model
 * @generated
 */
public enum gridType implements Enumerator {
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
	 * The '<em><b>Supply</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPPLY_VALUE
	 * @generated
	 * @ordered
	 */
	SUPPLY(1, "Supply", "Supply"),

	/**
	 * The '<em><b>Ground</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROUND_VALUE
	 * @generated
	 * @ordered
	 */
	GROUND(2, "Ground", "Ground"),

	/**
	 * The '<em><b>Analog Reference</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANALOG_REFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	ANALOG_REFERENCE(3, "analogReference", "analogReference");

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
	 * The '<em><b>Supply</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPPLY
	 * @model name="Supply"
	 * @generated
	 * @ordered
	 */
	public static final int SUPPLY_VALUE = 1;

	/**
	 * The '<em><b>Ground</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROUND
	 * @model name="Ground"
	 * @generated
	 * @ordered
	 */
	public static final int GROUND_VALUE = 2;

	/**
	 * The '<em><b>Analog Reference</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANALOG_REFERENCE
	 * @model name="analogReference"
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_REFERENCE_VALUE = 3;

	/**
	 * An array of all the '<em><b>grid Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final gridType[] VALUES_ARRAY =
		new gridType[] {
			NOT_SET,
			SUPPLY,
			GROUND,
			ANALOG_REFERENCE,
		};

	/**
	 * A public read-only list of all the '<em><b>grid Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<gridType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>grid Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static gridType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			gridType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>grid Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static gridType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			gridType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>grid Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static gridType get(int value) {
		switch (value) {
			case NOT_SET_VALUE: return NOT_SET;
			case SUPPLY_VALUE: return SUPPLY;
			case GROUND_VALUE: return GROUND;
			case ANALOG_REFERENCE_VALUE: return ANALOG_REFERENCE;
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
	private gridType(int value, String name, String literal) {
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
	
} //gridType
