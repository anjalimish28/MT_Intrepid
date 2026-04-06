/**
 */
package targets;

import org.eclipse.emf.common.util.EList;
import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Targets</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.Targets#getTargetConfiguration <em>Target Configuration</em>}</li>
 * </ul>
 *
 * @see targets.TargetsPackage#getTargets()
 * @model
 * @generated
 */
public interface Targets extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Target Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link targets.SuperTargetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Configuration</em>' containment reference list.
	 * @see targets.TargetsPackage#getTargets_TargetConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	EList<SuperTargetType> getTargetConfiguration();

} // Targets
