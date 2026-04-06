/**
 */
package targets.configdesk.dSpaceArinc825;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Model Accessible Ports RX</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see targets.configdesk.dSpaceArinc825.DSpaceArinc825Package#getModelAccessiblePortsRX()
 * @model
 * @generated
 */
public enum ModelAccessiblePortsRX implements Enumerator {
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
	 * The '<em><b>Data Vector</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_VECTOR_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_VECTOR(1, "DataVector", "DataVector"),

	/**
	 * The '<em><b>Vector Size</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VECTOR_SIZE_VALUE
	 * @generated
	 * @ordered
	 */
	VECTOR_SIZE(2, "VectorSize", "VectorSize"),

	/**
	 * The '<em><b>Source IP Address</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOURCE_IP_ADDRESS_VALUE
	 * @generated
	 * @ordered
	 */
	SOURCE_IP_ADDRESS(3, "SourceIPAddress", "SourceIPAddress"),

	/**
	 * The '<em><b>Source Port</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOURCE_PORT_VALUE
	 * @generated
	 * @ordered
	 */
	SOURCE_PORT(4, "SourcePort", "SourcePort");

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
	 * The '<em><b>Data Vector</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_VECTOR
	 * @model name="DataVector"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_VECTOR_VALUE = 1;

	/**
	 * The '<em><b>Vector Size</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VECTOR_SIZE
	 * @model name="VectorSize"
	 * @generated
	 * @ordered
	 */
	public static final int VECTOR_SIZE_VALUE = 2;

	/**
	 * The '<em><b>Source IP Address</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOURCE_IP_ADDRESS
	 * @model name="SourceIPAddress"
	 * @generated
	 * @ordered
	 */
	public static final int SOURCE_IP_ADDRESS_VALUE = 3;

	/**
	 * The '<em><b>Source Port</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOURCE_PORT
	 * @model name="SourcePort"
	 * @generated
	 * @ordered
	 */
	public static final int SOURCE_PORT_VALUE = 4;

	/**
	 * An array of all the '<em><b>Model Accessible Ports RX</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ModelAccessiblePortsRX[] VALUES_ARRAY =
		new ModelAccessiblePortsRX[] {
			NOT_SET,
			DATA_VECTOR,
			VECTOR_SIZE,
			SOURCE_IP_ADDRESS,
			SOURCE_PORT,
		};

	/**
	 * A public read-only list of all the '<em><b>Model Accessible Ports RX</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ModelAccessiblePortsRX> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Model Accessible Ports RX</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModelAccessiblePortsRX get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModelAccessiblePortsRX result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Model Accessible Ports RX</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModelAccessiblePortsRX getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModelAccessiblePortsRX result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Model Accessible Ports RX</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModelAccessiblePortsRX get(int value) {
		switch (value) {
			case NOT_SET_VALUE: return NOT_SET;
			case DATA_VECTOR_VALUE: return DATA_VECTOR;
			case VECTOR_SIZE_VALUE: return VECTOR_SIZE;
			case SOURCE_IP_ADDRESS_VALUE: return SOURCE_IP_ADDRESS;
			case SOURCE_PORT_VALUE: return SOURCE_PORT;
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
	private ModelAccessiblePortsRX(int value, String name, String literal) {
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
	
} //ModelAccessiblePortsRX
