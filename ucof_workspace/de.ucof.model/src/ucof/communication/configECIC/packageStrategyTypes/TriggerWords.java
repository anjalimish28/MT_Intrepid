/**
 */
package ucof.communication.configECIC.packageStrategyTypes;

import org.eclipse.emf.common.util.EList;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger Words</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.TriggerWords#getTriggerWord <em>Trigger Word</em>}</li>
 * </ul>
 *
 * @see ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesPackage#getTriggerWords()
 * @model
 * @generated
 */
public interface TriggerWords extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Trigger Word</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.communication.configECIC.packageStrategyTypes.TriggerWord}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Word</em>' containment reference list.
	 * @see ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesPackage#getTriggerWords_TriggerWord()
	 * @model containment="true"
	 * @generated
	 */
	EList<TriggerWord> getTriggerWord();

} // TriggerWords
