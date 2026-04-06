/**
 */
package ucof.devices.devicetypes.a653components.a653partition;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Criticality</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ucof.devices.devicetypes.a653components.a653partition.A653partitionPackage#getCriticality()
 * @model
 * @generated
 */
public enum Criticality implements Enumerator {
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
	 * The '<em><b>Level A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL_A_VALUE
	 * @generated
	 * @ordered
	 */
	LEVEL_A(1, "LevelA", "LevelA"),

	/**
	 * The '<em><b>Level B</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL_B_VALUE
	 * @generated
	 * @ordered
	 */
	LEVEL_B(2, "LevelB", "LevelB"),

	/**
	 * The '<em><b>Level C</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL_C_VALUE
	 * @generated
	 * @ordered
	 */
	LEVEL_C(3, "LevelC", "LevelC"),

	/**
	 * The '<em><b>Level D</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL_D_VALUE
	 * @generated
	 * @ordered
	 */
	LEVEL_D(4, "LevelD", "LevelD"),

	/**
	 * The '<em><b>Level E</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL_E_VALUE
	 * @generated
	 * @ordered
	 */
	LEVEL_E(5, "LevelE", "LevelE");

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
	 * The '<em><b>Level A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL_A
	 * @model name="LevelA"
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL_A_VALUE = 1;

	/**
	 * The '<em><b>Level B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL_B
	 * @model name="LevelB"
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL_B_VALUE = 2;

	/**
	 * The '<em><b>Level C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL_C
	 * @model name="LevelC"
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL_C_VALUE = 3;

	/**
	 * The '<em><b>Level D</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL_D
	 * @model name="LevelD"
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL_D_VALUE = 4;

	/**
	 * The '<em><b>Level E</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL_E
	 * @model name="LevelE"
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL_E_VALUE = 5;

	/**
	 * An array of all the '<em><b>Criticality</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Criticality[] VALUES_ARRAY =
		new Criticality[] {
			NOT_SET,
			LEVEL_A,
			LEVEL_B,
			LEVEL_C,
			LEVEL_D,
			LEVEL_E,
		};

	/**
	 * A public read-only list of all the '<em><b>Criticality</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Criticality> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Criticality</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Criticality get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Criticality result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Criticality</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Criticality getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Criticality result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Criticality</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Criticality get(int value) {
		switch (value) {
			case NOT_SET_VALUE: return NOT_SET;
			case LEVEL_A_VALUE: return LEVEL_A;
			case LEVEL_B_VALUE: return LEVEL_B;
			case LEVEL_C_VALUE: return LEVEL_C;
			case LEVEL_D_VALUE: return LEVEL_D;
			case LEVEL_E_VALUE: return LEVEL_E;
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
	private Criticality(int value, String name, String literal) {
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
	
} //Criticality
