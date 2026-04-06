/**
 */
package targets.configdesk.ethernet;

import org.eclipse.emf.common.util.EList;

import targets.configdesk.dSpaceArinc825.ModelAccessiblePortsRX;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UDPRX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.configdesk.ethernet.UDPRX#getModelAccessiblePorts <em>Model Accessible Ports</em>}</li>
 * </ul>
 *
 * @see targets.configdesk.ethernet.EthernetPackage#getUDPRX()
 * @model
 * @generated
 */
public interface UDPRX extends UDPConnection {
	/**
	 * Returns the value of the '<em><b>Model Accessible Ports</b></em>' attribute list.
	 * The list contents are of type {@link targets.configdesk.dSpaceArinc825.ModelAccessiblePortsRX}.
	 * The literals are from the enumeration {@link targets.configdesk.dSpaceArinc825.ModelAccessiblePortsRX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Accessible Ports</em>' attribute list.
	 * @see targets.configdesk.dSpaceArinc825.ModelAccessiblePortsRX
	 * @see targets.configdesk.ethernet.EthernetPackage#getUDPRX_ModelAccessiblePorts()
	 * @model
	 * @generated
	 */
	EList<ModelAccessiblePortsRX> getModelAccessiblePorts();

} // UDPRX
