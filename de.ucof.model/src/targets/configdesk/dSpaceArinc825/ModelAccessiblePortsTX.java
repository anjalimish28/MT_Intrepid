/**
 */
package targets.configdesk.dSpaceArinc825;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Model Accessible Ports TX</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see targets.configdesk.dSpaceArinc825.DSpaceArinc825Package#getModelAccessiblePortsTX()
 * @model
 * @generated
 */
public enum ModelAccessiblePortsTX implements Enumerator {
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
	 * The '<em><b>Max Vector Size</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAX_VECTOR_SIZE_VALUE
	 * @generated
	 * @ordered
	 */
	MAX_VECTOR_SIZE(2, "MaxVectorSize", "MaxVectorSize");

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
	 * The '<em><b>Max Vector Size</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAX_VECTOR_SIZE
	 * @model name="MaxVectorSize"
	 * @generated
	 * @ordered
	 */
	public static final int MAX_VECTOR_SIZE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Model Accessible Ports TX</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ModelAccessiblePortsTX[] VALUES_ARRAY =
		new ModelAccessiblePortsTX[] {
			NOT_SET,
			DATA_VECTOR,
			MAX_VECTOR_SIZE,
		};

	/**
	 * A public read-only list of all the '<em><b>Model Accessible Ports TX</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ModelAccessiblePortsTX> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Model Accessible Ports TX</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModelAccessiblePortsTX get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModelAccessiblePortsTX result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Model Accessible Ports TX</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModelAccessiblePortsTX getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModelAccessiblePortsTX result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Model Accessible Ports TX</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModelAccessiblePortsTX get(int value) {
		switch (value) {
			case NOT_SET_VALUE: return NOT_SET;
			case DATA_VECTOR_VALUE: return DATA_VECTOR;
			case MAX_VECTOR_SIZE_VALUE: return MAX_VECTOR_SIZE;
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
	private ModelAccessiblePortsTX(int value, String name, String literal) {
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
	
} //ModelAccessiblePortsTX
