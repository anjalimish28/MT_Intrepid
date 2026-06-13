/**
 */
package targets.rdc;

import org.eclipse.emf.common.util.EList;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>stm Ports</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.rdc.stmPorts#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see targets.rdc.RdcPackage#getstmPorts()
 * @model
 * @generated
 */
public interface stmPorts extends SuperTrackingType, SuperIdentifierType {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link targets.rdc.stmPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see targets.rdc.RdcPackage#getstmPorts_Port()
	 * @model containment="true"
	 * @generated
	 */
	EList<stmPort> getPort();

} // stmPorts
