/**
 */
package targets.cpn;

import org.eclipse.emf.common.util.EList;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>vorago Ports</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.cpn.voragoPorts#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see targets.cpn.CpnPackage#getvoragoPorts()
 * @model
 * @generated
 */
public interface voragoPorts extends SuperTrackingType, SuperIdentifierType {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link targets.cpn.voragoPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see targets.cpn.CpnPackage#getvoragoPorts_Port()
	 * @model containment="true"
	 * @generated
	 */
	EList<voragoPort> getPort();

} // voragoPorts
