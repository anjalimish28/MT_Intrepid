/**
 */
package ucof.communication.i2c;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>I2C Address Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Target address width. UM10204 Rev.7.0, Sections 3.1.10 and 3.1.11. 7-bit is mandatory for all modes; 10-bit is optional. Devices with both address widths can co-exist on the same bus.
 * <!-- end-model-doc -->
 * @see ucof.communication.i2c.I2cPackage#getI2CAddressMode()
 * @model
 * @generated
 */
public enum I2CAddressMode implements Enumerator {
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
	 * The '<em><b>Bit7</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 7-bit addressing (mandatory). 128 total addresses. Two reserved groups: 0000 XXX and 1111 XXX (Table 4). 112 usable addresses. UM10204 Section 3.1.10.
	 * <!-- end-model-doc -->
	 * @see #BIT7_VALUE
	 * @generated
	 * @ordered
	 */
	BIT7(1, "Bit7", "Bit7"),

	/**
	 * The '<em><b>Bit10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 10-bit addressing (optional). First byte prefix: 1111 0XX. Not widely used. UM10204 Section 3.1.11. Not supported in UFm read operations.
	 * <!-- end-model-doc -->
	 * @see #BIT10_VALUE
	 * @generated
	 * @ordered
	 */
	BIT10(2, "Bit10", "Bit10");

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
	 * The '<em><b>Bit7</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 7-bit addressing (mandatory). 128 total addresses. Two reserved groups: 0000 XXX and 1111 XXX (Table 4). 112 usable addresses. UM10204 Section 3.1.10.
	 * <!-- end-model-doc -->
	 * @see #BIT7
	 * @model name="Bit7"
	 * @generated
	 * @ordered
	 */
	public static final int BIT7_VALUE = 1;

	/**
	 * The '<em><b>Bit10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 10-bit addressing (optional). First byte prefix: 1111 0XX. Not widely used. UM10204 Section 3.1.11. Not supported in UFm read operations.
	 * <!-- end-model-doc -->
	 * @see #BIT10
	 * @model name="Bit10"
	 * @generated
	 * @ordered
	 */
	public static final int BIT10_VALUE = 2;

	/**
	 * An array of all the '<em><b>I2C Address Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final I2CAddressMode[] VALUES_ARRAY =
		new I2CAddressMode[] {
			NOT_SET,
			BIT7,
			BIT10,
		};

	/**
	 * A public read-only list of all the '<em><b>I2C Address Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<I2CAddressMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>I2C Address Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static I2CAddressMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			I2CAddressMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>I2C Address Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static I2CAddressMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			I2CAddressMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>I2C Address Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static I2CAddressMode get(int value) {
		switch (value) {
			case NOT_SET_VALUE: return NOT_SET;
			case BIT7_VALUE: return BIT7;
			case BIT10_VALUE: return BIT10;
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
	private I2CAddressMode(int value, String name, String literal) {
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
	
} //I2CAddressMode
