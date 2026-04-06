/**
 */
package ucof.common.etypes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Memory Type, primarily used in A653 Operating Systems
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.common.etypes.Memory#getMemoryRequirements <em>Memory Requirements</em>}</li>
 * </ul>
 *
 * @see ucof.common.etypes.EtypesPackage#getMemory()
 * @model
 * @generated
 */
public interface Memory extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Memory Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.common.etypes.MemoryRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Requirements</em>' containment reference list.
	 * @see ucof.common.etypes.EtypesPackage#getMemory_MemoryRequirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<MemoryRequirement> getMemoryRequirements();

} // Memory
