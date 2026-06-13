/**
 */
package targets.sheild;

import org.eclipse.emf.common.util.EList;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>sheild Ports</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.sheild.sheildPorts#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see targets.sheild.SheildPackage#getsheildPorts()
 * @model
 * @generated
 */
public interface sheildPorts extends SuperTrackingType, SuperIdentifierType {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link targets.sheild.sheildPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see targets.sheild.SheildPackage#getsheildPorts_Port()
	 * @model containment="true"
	 * @generated
	 */
	EList<sheildPort> getPort();

} // sheildPorts
