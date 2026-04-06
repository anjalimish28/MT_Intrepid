/**
 */
package ucof.communication.i2c;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>I2C Bus Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * I2C bus speed mode as defined in UM10204 Rev.7.0, Section 5. Standard/Fast/FastModePlus/HighSpeed are bidirectional (open-drain). UltraFast is unidirectional push-pull (WRITE only, no ACK).
 * <!-- end-model-doc -->
 * @see ucof.communication.i2c.I2cPackage#getI2CBusMode()
 * @model
 * @generated
 */
public enum I2CBusMode implements Enumerator {
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
	 * The '<em><b>Standard</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Standard-mode (Sm): up to 100 kbit/s. UM10204 Section 3.1.
	 * <!-- end-model-doc -->
	 * @see #STANDARD_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARD(1, "Standard", "Standard_100kbps"),

	/**
	 * The '<em><b>Fast Mode</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fast-mode (Fm): up to 400 kbit/s. Downward-compatible with Sm. UM10204 Section 5.1.
	 * <!-- end-model-doc -->
	 * @see #FAST_MODE_VALUE
	 * @generated
	 * @ordered
	 */
	FAST_MODE(2, "FastMode", "FastMode_400kbps"),

	/**
	 * The '<em><b>Fast Mode Plus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fast-mode Plus (Fm+): up to 1 Mbit/s. Increased drive strength x10. UM10204 Section 5.2.
	 * <!-- end-model-doc -->
	 * @see #FAST_MODE_PLUS_VALUE
	 * @generated
	 * @ordered
	 */
	FAST_MODE_PLUS(3, "FastModePlus", "FastModePlus_1Mbps"),

	/**
	 * The '<em><b>High Speed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * High-speed mode (Hs-mode): up to 3.4 Mbit/s. Requires Hs-mode controller code. UM10204 Section 5.3.
	 * <!-- end-model-doc -->
	 * @see #HIGH_SPEED_VALUE
	 * @generated
	 * @ordered
	 */
	HIGH_SPEED(4, "HighSpeed", "HighSpeed_3400kbps"),

	/**
	 * The '<em><b>Ultra Fast</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ultra Fast-mode (UFm): up to 5 Mbit/s. UNIDIRECTIONAL (write only). Uses push-pull drivers on USDA/USCL (not open-drain). ACK/NACK not used. Not compatible with Sm/Fm/Fm+/Hs. I2CMessage.direction MUST be Out when this mode is selected. UM10204 Section 3.2.
	 * <!-- end-model-doc -->
	 * @see #ULTRA_FAST_VALUE
	 * @generated
	 * @ordered
	 */
	ULTRA_FAST(5, "UltraFast", "UltraFast_5Mbps");

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
	 * The '<em><b>Standard</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Standard-mode (Sm): up to 100 kbit/s. UM10204 Section 3.1.
	 * <!-- end-model-doc -->
	 * @see #STANDARD
	 * @model name="Standard" literal="Standard_100kbps"
	 * @generated
	 * @ordered
	 */
	public static final int STANDARD_VALUE = 1;

	/**
	 * The '<em><b>Fast Mode</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fast-mode (Fm): up to 400 kbit/s. Downward-compatible with Sm. UM10204 Section 5.1.
	 * <!-- end-model-doc -->
	 * @see #FAST_MODE
	 * @model name="FastMode" literal="FastMode_400kbps"
	 * @generated
	 * @ordered
	 */
	public static final int FAST_MODE_VALUE = 2;

	/**
	 * The '<em><b>Fast Mode Plus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fast-mode Plus (Fm+): up to 1 Mbit/s. Increased drive strength x10. UM10204 Section 5.2.
	 * <!-- end-model-doc -->
	 * @see #FAST_MODE_PLUS
	 * @model name="FastModePlus" literal="FastModePlus_1Mbps"
	 * @generated
	 * @ordered
	 */
	public static final int FAST_MODE_PLUS_VALUE = 3;

	/**
	 * The '<em><b>High Speed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * High-speed mode (Hs-mode): up to 3.4 Mbit/s. Requires Hs-mode controller code. UM10204 Section 5.3.
	 * <!-- end-model-doc -->
	 * @see #HIGH_SPEED
	 * @model name="HighSpeed" literal="HighSpeed_3400kbps"
	 * @generated
	 * @ordered
	 */
	public static final int HIGH_SPEED_VALUE = 4;

	/**
	 * The '<em><b>Ultra Fast</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ultra Fast-mode (UFm): up to 5 Mbit/s. UNIDIRECTIONAL (write only). Uses push-pull drivers on USDA/USCL (not open-drain). ACK/NACK not used. Not compatible with Sm/Fm/Fm+/Hs. I2CMessage.direction MUST be Out when this mode is selected. UM10204 Section 3.2.
	 * <!-- end-model-doc -->
	 * @see #ULTRA_FAST
	 * @model name="UltraFast" literal="UltraFast_5Mbps"
	 * @generated
	 * @ordered
	 */
	public static final int ULTRA_FAST_VALUE = 5;

	/**
	 * An array of all the '<em><b>I2C Bus Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final I2CBusMode[] VALUES_ARRAY =
		new I2CBusMode[] {
			NOT_SET,
			STANDARD,
			FAST_MODE,
			FAST_MODE_PLUS,
			HIGH_SPEED,
			ULTRA_FAST,
		};

	/**
	 * A public read-only list of all the '<em><b>I2C Bus Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<I2CBusMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>I2C Bus Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static I2CBusMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			I2CBusMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>I2C Bus Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static I2CBusMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			I2CBusMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>I2C Bus Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static I2CBusMode get(int value) {
		switch (value) {
			case NOT_SET_VALUE: return NOT_SET;
			case STANDARD_VALUE: return STANDARD;
			case FAST_MODE_VALUE: return FAST_MODE;
			case FAST_MODE_PLUS_VALUE: return FAST_MODE_PLUS;
			case HIGH_SPEED_VALUE: return HIGH_SPEED;
			case ULTRA_FAST_VALUE: return ULTRA_FAST;
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
	private I2CBusMode(int value, String name, String literal) {
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
	
} //I2CBusMode
