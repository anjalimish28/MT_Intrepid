/**
 */
package ucof.common.etypes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super Identifier Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Super Class used in every class for setting identifier (UUID format) and name 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.common.etypes.SuperIdentifierType#getId <em>Id</em>}</li>
 *   <li>{@link ucof.common.etypes.SuperIdentifierType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ucof.common.etypes.EtypesPackage#getSuperIdentifierType()
 * @model abstract="true"
 * @generated
 */
public interface SuperIdentifierType extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A global unique identifier string for every model element. This id is used as a reference between model elements
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see ucof.common.etypes.EtypesPackage#getSuperIdentifierType_Id()
	 * @model id="true" dataType="ucof.common.edata.UUIDType" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link ucof.common.etypes.SuperIdentifierType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string for the name of the element as shown in textual or graphical representations of the model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ucof.common.etypes.EtypesPackage#getSuperIdentifierType_Name()
	 * @model dataType="ucof.common.edata.NameType"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ucof.common.etypes.SuperIdentifierType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SuperIdentifierType
