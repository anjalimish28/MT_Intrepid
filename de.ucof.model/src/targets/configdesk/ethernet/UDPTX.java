/**
 */
package targets.configdesk.ethernet;

import org.eclipse.emf.common.util.EList;

import targets.configdesk.dSpaceArinc825.ModelAccessiblePortsTX;

import ucof.common.enums.booleanType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UDPTX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.configdesk.ethernet.UDPTX#getModelAccessiblePorts <em>Model Accessible Ports</em>}</li>
 *   <li>{@link targets.configdesk.ethernet.UDPTX#getVariableVectorSize <em>Variable Vector Size</em>}</li>
 * </ul>
 *
 * @see targets.configdesk.ethernet.EthernetPackage#getUDPTX()
 * @model
 * @generated
 */
public interface UDPTX extends UDPConnection {
	/**
	 * Returns the value of the '<em><b>Model Accessible Ports</b></em>' attribute list.
	 * The list contents are of type {@link targets.configdesk.dSpaceArinc825.ModelAccessiblePortsTX}.
	 * The literals are from the enumeration {@link targets.configdesk.dSpaceArinc825.ModelAccessiblePortsTX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Accessible Ports</em>' attribute list.
	 * @see targets.configdesk.dSpaceArinc825.ModelAccessiblePortsTX
	 * @see targets.configdesk.ethernet.EthernetPackage#getUDPTX_ModelAccessiblePorts()
	 * @model
	 * @generated
	 */
	EList<ModelAccessiblePortsTX> getModelAccessiblePorts();

	/**
	 * Returns the value of the '<em><b>Variable Vector Size</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.booleanType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Vector Size</em>' attribute.
	 * @see ucof.common.enums.booleanType
	 * @see #setVariableVectorSize(booleanType)
	 * @see targets.configdesk.ethernet.EthernetPackage#getUDPTX_VariableVectorSize()
	 * @model
	 * @generated
	 */
	booleanType getVariableVectorSize();

	/**
	 * Sets the value of the '{@link targets.configdesk.ethernet.UDPTX#getVariableVectorSize <em>Variable Vector Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Vector Size</em>' attribute.
	 * @see ucof.common.enums.booleanType
	 * @see #getVariableVectorSize()
	 * @generated
	 */
	void setVariableVectorSize(booleanType value);

} // UDPTX
