/**
 */
package ucof.common.etypes;

import ucof.common.enums.MemoryAccessType;
import ucof.common.enums.MemoryType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Memory Requirements Type i.e., defining memory parameters, primarily used in A653 Operating Systems
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.common.etypes.MemoryRequirement#getAccess <em>Access</em>}</li>
 *   <li>{@link ucof.common.etypes.MemoryRequirement#getMemoryType <em>Memory Type</em>}</li>
 *   <li>{@link ucof.common.etypes.MemoryRequirement#getSize <em>Size</em>}</li>
 *   <li>{@link ucof.common.etypes.MemoryRequirement#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @see ucof.common.etypes.EtypesPackage#getMemoryRequirement()
 * @model
 * @generated
 */
public interface MemoryRequirement extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Access</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.MemoryAccessType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' attribute.
	 * @see ucof.common.enums.MemoryAccessType
	 * @see #setAccess(MemoryAccessType)
	 * @see ucof.common.etypes.EtypesPackage#getMemoryRequirement_Access()
	 * @model
	 * @generated
	 */
	MemoryAccessType getAccess();

	/**
	 * Sets the value of the '{@link ucof.common.etypes.MemoryRequirement#getAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' attribute.
	 * @see ucof.common.enums.MemoryAccessType
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(MemoryAccessType value);

	/**
	 * Returns the value of the '<em><b>Memory Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.MemoryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Type</em>' attribute.
	 * @see ucof.common.enums.MemoryType
	 * @see #setMemoryType(MemoryType)
	 * @see ucof.common.etypes.EtypesPackage#getMemoryRequirement_MemoryType()
	 * @model
	 * @generated
	 */
	MemoryType getMemoryType();

	/**
	 * Sets the value of the '{@link ucof.common.etypes.MemoryRequirement#getMemoryType <em>Memory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Type</em>' attribute.
	 * @see ucof.common.enums.MemoryType
	 * @see #getMemoryType()
	 * @generated
	 */
	void setMemoryType(MemoryType value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(String)
	 * @see ucof.common.etypes.EtypesPackage#getMemoryRequirement_Size()
	 * @model dataType="ucof.common.edata.DecOrHexValueType"
	 * @generated
	 */
	String getSize();

	/**
	 * Sets the value of the '{@link ucof.common.etypes.MemoryRequirement#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see ucof.common.etypes.EtypesPackage#getMemoryRequirement_Address()
	 * @model dataType="ucof.common.edata.HexAddressType"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link ucof.common.etypes.MemoryRequirement#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

} // MemoryRequirement
