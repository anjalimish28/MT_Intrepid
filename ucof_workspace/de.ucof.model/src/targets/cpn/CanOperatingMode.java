/**
 */
package targets.cpn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Can Operating Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see targets.cpn.CpnPackage#getCanOperatingMode()
 * @model
 * @generated
 */
public enum CanOperatingMode implements Enumerator {
	/**
	 * The '<em><b>NORMAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMAL_VALUE
	 * @generated
	 * @ordered
	 */
	NORMAL(0, "NORMAL", "NORMAL"),

	/**
	 * The '<em><b>LOOPBACK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOOPBACK_VALUE
	 * @generated
	 * @ordered
	 */
	LOOPBACK(1, "LOOPBACK", "LOOPBACK"),

	/**
	 * The '<em><b>SILENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SILENT_VALUE
	 * @generated
	 * @ordered
	 */
	SILENT(2, "SILENT", "SILENT"),

	/**
	 * The '<em><b>DIAGNOSTIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIAGNOSTIC_VALUE
	 * @generated
	 * @ordered
	 */
	DIAGNOSTIC(3, "DIAGNOSTIC", "DIAGNOSTIC");

	/**
	 * The '<em><b>NORMAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_VALUE = 0;

	/**
	 * The '<em><b>LOOPBACK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOOPBACK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOOPBACK_VALUE = 1;

	/**
	 * The '<em><b>SILENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SILENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SILENT_VALUE = 2;

	/**
	 * The '<em><b>DIAGNOSTIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIAGNOSTIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSTIC_VALUE = 3;

	/**
	 * An array of all the '<em><b>Can Operating Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CanOperatingMode[] VALUES_ARRAY =
		new CanOperatingMode[] {
			NORMAL,
			LOOPBACK,
			SILENT,
			DIAGNOSTIC,
		};

	/**
	 * A public read-only list of all the '<em><b>Can Operating Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CanOperatingMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Can Operating Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CanOperatingMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CanOperatingMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Can Operating Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CanOperatingMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CanOperatingMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Can Operating Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CanOperatingMode get(int value) {
		switch (value) {
			case NORMAL_VALUE: return NORMAL;
			case LOOPBACK_VALUE: return LOOPBACK;
			case SILENT_VALUE: return SILENT;
			case DIAGNOSTIC_VALUE: return DIAGNOSTIC;
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
	private CanOperatingMode(int value, String name, String literal) {
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
	
} //CanOperatingMode
