/**
 */
package targets.avip;

import org.eclipse.emf.common.util.EList;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Added Signals</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.avip.AddedSignals#getSignal <em>Signal</em>}</li>
 * </ul>
 *
 * @see targets.avip.AvipPackage#getAddedSignals()
 * @model
 * @generated
 */
public interface AddedSignals extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Signal</b></em>' containment reference list.
	 * The list contents are of type {@link targets.avip.FunctionSignal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal</em>' containment reference list.
	 * @see targets.avip.AvipPackage#getAddedSignals_Signal()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionSignal> getSignal();

} // AddedSignals
