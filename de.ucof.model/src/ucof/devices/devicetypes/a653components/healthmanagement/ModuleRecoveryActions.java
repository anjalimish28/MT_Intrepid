/**
 */
package ucof.devices.devicetypes.a653components.healthmanagement;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Module Recovery Actions</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage#getModuleRecoveryActions()
 * @model
 * @generated
 */
public enum ModuleRecoveryActions implements Enumerator {
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
	 * The '<em><b>Ignore</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IGNORE_VALUE
	 * @generated
	 * @ordered
	 */
	IGNORE(1, "Ignore", "Ignore"),

	/**
	 * The '<em><b>Shutdown Module</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHUTDOWN_MODULE_VALUE
	 * @generated
	 * @ordered
	 */
	SHUTDOWN_MODULE(2, "ShutdownModule", "ShutdownModule"),

	/**
	 * The '<em><b>Reset Module</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESET_MODULE_VALUE
	 * @generated
	 * @ordered
	 */
	RESET_MODULE(3, "ResetModule", "ResetModule"),

	/**
	 * The '<em><b>Custom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM(4, "Custom", "Custom");

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
	 * The '<em><b>Ignore</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IGNORE
	 * @model name="Ignore"
	 * @generated
	 * @ordered
	 */
	public static final int IGNORE_VALUE = 1;

	/**
	 * The '<em><b>Shutdown Module</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHUTDOWN_MODULE
	 * @model name="ShutdownModule"
	 * @generated
	 * @ordered
	 */
	public static final int SHUTDOWN_MODULE_VALUE = 2;

	/**
	 * The '<em><b>Reset Module</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESET_MODULE
	 * @model name="ResetModule"
	 * @generated
	 * @ordered
	 */
	public static final int RESET_MODULE_VALUE = 3;

	/**
	 * The '<em><b>Custom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM
	 * @model name="Custom"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM_VALUE = 4;

	/**
	 * An array of all the '<em><b>Module Recovery Actions</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ModuleRecoveryActions[] VALUES_ARRAY =
		new ModuleRecoveryActions[] {
			NOT_SET,
			IGNORE,
			SHUTDOWN_MODULE,
			RESET_MODULE,
			CUSTOM,
		};

	/**
	 * A public read-only list of all the '<em><b>Module Recovery Actions</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ModuleRecoveryActions> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Module Recovery Actions</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModuleRecoveryActions get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModuleRecoveryActions result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Module Recovery Actions</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModuleRecoveryActions getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModuleRecoveryActions result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Module Recovery Actions</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModuleRecoveryActions get(int value) {
		switch (value) {
			case NOT_SET_VALUE: return NOT_SET;
			case IGNORE_VALUE: return IGNORE;
			case SHUTDOWN_MODULE_VALUE: return SHUTDOWN_MODULE;
			case RESET_MODULE_VALUE: return RESET_MODULE;
			case CUSTOM_VALUE: return CUSTOM;
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
	private ModuleRecoveryActions(int value, String name, String literal) {
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
	
} //ModuleRecoveryActions
