/**
 */
package ucof.communication;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.SignalSet#getSignal <em>Signal</em>}</li>
 * </ul>
 *
 * @see ucof.communication.CommunicationPackage#getSignalSet()
 * @model extendedMetaData="kind='elementOnly' name='Signals'"
 * @generated
 */
public interface SignalSet extends CommunicationSetType {
	/**
	 * Returns the value of the '<em><b>Signal</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.communication.Signal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal</em>' containment reference list.
	 * @see ucof.communication.CommunicationPackage#getSignalSet_Signal()
	 * @model containment="true"
	 * @generated
	 */
	EList<Signal> getSignal();

} // SignalSet
