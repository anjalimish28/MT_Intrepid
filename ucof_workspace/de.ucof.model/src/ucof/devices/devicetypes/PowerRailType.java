/**
 */
package ucof.devices.devicetypes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Power Rail Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ucof.devices.devicetypes.DevicetypesPackage#getPowerRailType()
 * @model
 * @generated
 */
public enum PowerRailType implements Enumerator {
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
	 * The '<em><b>VCC 3V3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VCC_3V3_VALUE
	 * @generated
	 * @ordered
	 */
	VCC_3V3(1, "VCC_3V3", "VCC_3V3"),

	/**
	 * The '<em><b>VCC 5V</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VCC_5V_VALUE
	 * @generated
	 * @ordered
	 */
	VCC_5V(2, "VCC_5V", "VCC_5V"),

	/**
	 * The '<em><b>GND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GND_VALUE
	 * @generated
	 * @ordered
	 */
	GND(3, "GND", "GND");

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
	 * The '<em><b>VCC 3V3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VCC_3V3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VCC_3V3_VALUE = 1;

	/**
	 * The '<em><b>VCC 5V</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VCC_5V
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VCC_5V_VALUE = 2;

	/**
	 * The '<em><b>GND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GND_VALUE = 3;

	/**
	 * An array of all the '<em><b>Power Rail Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PowerRailType[] VALUES_ARRAY =
		new PowerRailType[] {
			NOT_SET,
			VCC_3V3,
			VCC_5V,
			GND,
		};

	/**
	 * A public read-only list of all the '<em><b>Power Rail Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PowerRailType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Power Rail Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PowerRailType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PowerRailType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Power Rail Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PowerRailType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PowerRailType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Power Rail Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PowerRailType get(int value) {
		switch (value) {
			case NOT_SET_VALUE: return NOT_SET;
			case VCC_3V3_VALUE: return VCC_3V3;
			case VCC_5V_VALUE: return VCC_5V;
			case GND_VALUE: return GND;
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
	private PowerRailType(int value, String name, String literal) {
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
	
} //PowerRailType
