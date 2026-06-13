/**
 */
package ucof.assignments.database;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>payload Targets</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ucof.assignments.database.DatabasePackage#getpayloadTargets()
 * @model
 * @generated
 */
public enum payloadTargets implements Enumerator {
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
	 * The '<em><b>Port2 Port</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PORT2_PORT_VALUE
	 * @generated
	 * @ordered
	 */
	PORT2_PORT(1, "Port2Port", "Port2Port"),

	/**
	 * The '<em><b>Interface</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERFACE_VALUE
	 * @generated
	 * @ordered
	 */
	INTERFACE(2, "Interface", "Interface"),

	/**
	 * The '<em><b>Message</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MESSAGE_VALUE
	 * @generated
	 * @ordered
	 */
	MESSAGE(3, "Message", "Message"),

	/**
	 * The '<em><b>HW Port</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HW_PORT_VALUE
	 * @generated
	 * @ordered
	 */
	HW_PORT(4, "HWPort", "HWPort");

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
	 * The '<em><b>Port2 Port</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PORT2_PORT
	 * @model name="Port2Port"
	 * @generated
	 * @ordered
	 */
	public static final int PORT2_PORT_VALUE = 1;

	/**
	 * The '<em><b>Interface</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERFACE
	 * @model name="Interface"
	 * @generated
	 * @ordered
	 */
	public static final int INTERFACE_VALUE = 2;

	/**
	 * The '<em><b>Message</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MESSAGE
	 * @model name="Message"
	 * @generated
	 * @ordered
	 */
	public static final int MESSAGE_VALUE = 3;

	/**
	 * The '<em><b>HW Port</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HW_PORT
	 * @model name="HWPort"
	 * @generated
	 * @ordered
	 */
	public static final int HW_PORT_VALUE = 4;

	/**
	 * An array of all the '<em><b>payload Targets</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final payloadTargets[] VALUES_ARRAY =
		new payloadTargets[] {
			NOT_SET,
			PORT2_PORT,
			INTERFACE,
			MESSAGE,
			HW_PORT,
		};

	/**
	 * A public read-only list of all the '<em><b>payload Targets</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<payloadTargets> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>payload Targets</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static payloadTargets get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			payloadTargets result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>payload Targets</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static payloadTargets getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			payloadTargets result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>payload Targets</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static payloadTargets get(int value) {
		switch (value) {
			case NOT_SET_VALUE: return NOT_SET;
			case PORT2_PORT_VALUE: return PORT2_PORT;
			case INTERFACE_VALUE: return INTERFACE;
			case MESSAGE_VALUE: return MESSAGE;
			case HW_PORT_VALUE: return HW_PORT;
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
	private payloadTargets(int value, String name, String literal) {
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
	
} //payloadTargets
