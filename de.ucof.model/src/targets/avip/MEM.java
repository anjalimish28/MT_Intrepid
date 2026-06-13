/**
 */
package targets.avip;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MEM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.avip.MEM#getMemPortIDExtension <em>Mem Port ID Extension</em>}</li>
 * </ul>
 *
 * @see targets.avip.AvipPackage#getMEM()
 * @model
 * @generated
 */
public interface MEM extends SuperAVDPortType {

	/**
	 * Returns the value of the '<em><b>Mem Port ID Extension</b></em>' containment reference list.
	 * The list contents are of type {@link targets.avip.MEMPortIDExtension}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mem Port ID Extension</em>' containment reference list.
	 * @see targets.avip.AvipPackage#getMEM_MemPortIDExtension()
	 * @model containment="true"
	 * @generated
	 */
	EList<MEMPortIDExtension> getMemPortIDExtension();
} // MEM
