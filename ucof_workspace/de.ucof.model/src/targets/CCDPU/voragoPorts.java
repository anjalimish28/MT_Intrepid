/**
 */
package targets.CCDPU;

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
 *   <li>{@link targets.CCDPU.voragoPorts#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see targets.CCDPU.CCDPUPackage#getvoragoPorts()
 * @model
 * @generated
 */
public interface voragoPorts extends SuperTrackingType, SuperIdentifierType {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link targets.CCDPU.voragoPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see targets.CCDPU.CCDPUPackage#getvoragoPorts_Port()
	 * @model containment="true"
	 * @generated
	 */
	EList<voragoPort> getPort();

} // voragoPorts
