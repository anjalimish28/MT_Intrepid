/**
 */
package targets.avip;

import org.eclipse.emf.common.util.EList;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Extensions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.avip.SignalExtensions#getSignalExtension <em>Signal Extension</em>}</li>
 * </ul>
 *
 * @see targets.avip.AvipPackage#getSignalExtensions()
 * @model
 * @generated
 */
public interface SignalExtensions extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Signal Extension</b></em>' containment reference list.
	 * The list contents are of type {@link targets.avip.SignalExtension}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Extension</em>' containment reference list.
	 * @see targets.avip.AvipPackage#getSignalExtensions_SignalExtension()
	 * @model containment="true"
	 * @generated
	 */
	EList<SignalExtension> getSignalExtension();

} // SignalExtensions
