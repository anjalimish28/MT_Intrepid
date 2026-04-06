/**
 */
package targets.PowerRail;

import org.eclipse.emf.common.util.EList;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>power Rail Ports</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.PowerRail.powerRailPorts#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see targets.PowerRail.PowerRailPackage#getpowerRailPorts()
 * @model
 * @generated
 */
public interface powerRailPorts extends SuperTrackingType, SuperIdentifierType {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link targets.PowerRail.powerRailPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see targets.PowerRail.PowerRailPackage#getpowerRailPorts_Port()
	 * @model containment="true"
	 * @generated
	 */
	EList<powerRailPort> getPort();

} // powerRailPorts
