/**
 */
package targets.MotorController;

import org.eclipse.emf.common.util.EList;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>escon Ports</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.MotorController.esconPorts#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see targets.MotorController.MotorControllerPackage#getesconPorts()
 * @model
 * @generated
 */
public interface esconPorts extends SuperTrackingType, SuperIdentifierType {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link targets.MotorController.esconPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see targets.MotorController.MotorControllerPackage#getesconPorts_Port()
	 * @model containment="true"
	 * @generated
	 */
	EList<esconPort> getPort();

} // esconPorts
