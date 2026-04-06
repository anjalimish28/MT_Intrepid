/**
 */
package ucof.common.etypes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Super type for sets, sets can be used for grouping a large number of objects
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.common.etypes.SuperSetType#getSetname <em>Setname</em>}</li>
 * </ul>
 *
 * @see ucof.common.etypes.EtypesPackage#getSuperSetType()
 * @model abstract="true"
 * @generated
 */
public interface SuperSetType extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Setname</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setname</em>' attribute list.
	 * @see ucof.common.etypes.EtypesPackage#getSuperSetType_Setname()
	 * @model
	 * @generated
	 */
	EList<String> getSetname();

} // SuperSetType
