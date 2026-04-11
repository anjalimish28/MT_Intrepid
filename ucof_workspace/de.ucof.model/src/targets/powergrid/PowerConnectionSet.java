/**
 */
package targets.powergrid;

import org.eclipse.emf.common.util.EList;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Connection Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.powergrid.PowerConnectionSet#getPowerConnection <em>Power Connection</em>}</li>
 * </ul>
 *
 * @see targets.powergrid.PowergridPackage#getPowerConnectionSet()
 * @model
 * @generated
 */
public interface PowerConnectionSet extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Power Connection</b></em>' containment reference list.
	 * The list contents are of type {@link targets.powergrid.PowerConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Connection</em>' containment reference list.
	 * @see targets.powergrid.PowergridPackage#getPowerConnectionSet_PowerConnection()
	 * @model containment="true"
	 * @generated
	 */
	EList<PowerConnection> getPowerConnection();

} // PowerConnectionSet
