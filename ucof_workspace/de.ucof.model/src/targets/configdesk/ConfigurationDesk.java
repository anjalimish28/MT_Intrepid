/**
 */
package targets.configdesk;

import org.eclipse.emf.common.util.EList;

import targets.HardwareInformation;
import targets.SuperTargetType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Desk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.configdesk.ConfigurationDesk#getConfigurationDeskIOHardware <em>Configuration Desk IO Hardware</em>}</li>
 *   <li>{@link targets.configdesk.ConfigurationDesk#getModelTopologyName <em>Model Topology Name</em>}</li>
 *   <li>{@link targets.configdesk.ConfigurationDesk#getApplicationName <em>Application Name</em>}</li>
 * </ul>
 *
 * @see targets.configdesk.ConfigdeskPackage#getConfigurationDesk()
 * @model
 * @generated
 */
public interface ConfigurationDesk extends HardwareInformation, SuperTargetType {
	/**
	 * Returns the value of the '<em><b>Configuration Desk IO Hardware</b></em>' containment reference list.
	 * The list contents are of type {@link targets.configdesk.SuperConfigurationDeskIOHardwareType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Desk IO Hardware</em>' containment reference list.
	 * @see targets.configdesk.ConfigdeskPackage#getConfigurationDesk_ConfigurationDeskIOHardware()
	 * @model containment="true"
	 * @generated
	 */
	EList<SuperConfigurationDeskIOHardwareType> getConfigurationDeskIOHardware();

	/**
	 * Returns the value of the '<em><b>Model Topology Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Topology Name</em>' attribute.
	 * @see #setModelTopologyName(String)
	 * @see targets.configdesk.ConfigdeskPackage#getConfigurationDesk_ModelTopologyName()
	 * @model
	 * @generated
	 */
	String getModelTopologyName();

	/**
	 * Sets the value of the '{@link targets.configdesk.ConfigurationDesk#getModelTopologyName <em>Model Topology Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Topology Name</em>' attribute.
	 * @see #getModelTopologyName()
	 * @generated
	 */
	void setModelTopologyName(String value);

	/**
	 * Returns the value of the '<em><b>Application Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Name</em>' attribute.
	 * @see #setApplicationName(String)
	 * @see targets.configdesk.ConfigdeskPackage#getConfigurationDesk_ApplicationName()
	 * @model
	 * @generated
	 */
	String getApplicationName();

	/**
	 * Sets the value of the '{@link targets.configdesk.ConfigurationDesk#getApplicationName <em>Application Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Name</em>' attribute.
	 * @see #getApplicationName()
	 * @generated
	 */
	void setApplicationName(String value);

} // ConfigurationDesk
