/**
 */
package targets.powergrid;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>interface Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see targets.powergrid.PowergridPackage#getinterfaceType()
 * @model
 * @generated
 */
public enum interfaceType implements Enumerator {
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
	 * The '<em><b>Sink</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINK_VALUE
	 * @generated
	 * @ordered
	 */
	SINK(1, "sink", "sink"),

	/**
	 * The '<em><b>Source</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	SOURCE(2, "source", "source"),

	/**
	 * The '<em><b>Sink Source</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINK_SOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	SINK_SOURCE(3, "sinkSource", "sinkSource"),

	/**
	 * The '<em><b>Analog Reference</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANALOG_REFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	ANALOG_REFERENCE(4, "analogReference", "analogReference");

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
	 * The '<em><b>Sink</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINK
	 * @model name="sink"
	 * @generated
	 * @ordered
	 */
	public static final int SINK_VALUE = 1;

	/**
	 * The '<em><b>Source</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOURCE
	 * @model name="source"
	 * @generated
	 * @ordered
	 */
	public static final int SOURCE_VALUE = 2;

	/**
	 * The '<em><b>Sink Source</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINK_SOURCE
	 * @model name="sinkSource"
	 * @generated
	 * @ordered
	 */
	public static final int SINK_SOURCE_VALUE = 3;

	/**
	 * The '<em><b>Analog Reference</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANALOG_REFERENCE
	 * @model name="analogReference"
	 * @generated
	 * @ordered
	 */
	public static final int ANALOG_REFERENCE_VALUE = 4;

	/**
	 * An array of all the '<em><b>interface Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final interfaceType[] VALUES_ARRAY =
		new interfaceType[] {
			NOT_SET,
			SINK,
			SOURCE,
			SINK_SOURCE,
			ANALOG_REFERENCE,
		};

	/**
	 * A public read-only list of all the '<em><b>interface Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<interfaceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>interface Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static interfaceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			interfaceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>interface Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static interfaceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			interfaceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>interface Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static interfaceType get(int value) {
		switch (value) {
			case NOT_SET_VALUE: return NOT_SET;
			case SINK_VALUE: return SINK;
			case SOURCE_VALUE: return SOURCE;
			case SINK_SOURCE_VALUE: return SINK_SOURCE;
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
	private interfaceType(int value, String name, String literal) {
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
	
} //interfaceType
