/**
 */
package ucof.communication.configECIC;

import org.eclipse.emf.common.util.EList;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ED247 Configurations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.ED247Configurations#getEd247Configuration <em>Ed247 Configuration</em>}</li>
 * </ul>
 *
 * @see ucof.communication.configECIC.ConfigECICPackage#getED247Configurations()
 * @model
 * @generated
 */
public interface ED247Configurations extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Ed247 Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.communication.configECIC.ED247Configuration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ed247 Configuration</em>' containment reference list.
	 * @see ucof.communication.configECIC.ConfigECICPackage#getED247Configurations_Ed247Configuration()
	 * @model containment="true"
	 * @generated
	 */
	EList<ED247Configuration> getEd247Configuration();

} // ED247Configurations
