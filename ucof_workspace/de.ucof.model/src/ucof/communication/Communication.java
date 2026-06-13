/**
 */
package ucof.communication;

import org.eclipse.emf.common.util.EList;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

import ucof.communication.comDevices.CommunicationDevices;

import ucof.communication.configECIC.ED247Configurations;

import ucof.communication.connectors.Connectors;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container for all communication elements
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.Communication#getDatabase <em>Database</em>}</li>
 *   <li>{@link ucof.communication.Communication#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link ucof.communication.Communication#getEd247Configurations <em>Ed247 Configurations</em>}</li>
 *   <li>{@link ucof.communication.Communication#getCommunicationDevices <em>Communication Devices</em>}</li>
 * </ul>
 *
 * @see ucof.communication.CommunicationPackage#getCommunication()
 * @model
 * @generated
 */
public interface Communication extends SuperTrackingType, SuperIdentifierType {
	/**
	 * Returns the value of the '<em><b>Database</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' containment reference.
	 * @see #setDatabase(Database)
	 * @see ucof.communication.CommunicationPackage#getCommunication_Database()
	 * @model containment="true"
	 * @generated
	 */
	Database getDatabase();

	/**
	 * Sets the value of the '{@link ucof.communication.Communication#getDatabase <em>Database</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database</em>' containment reference.
	 * @see #getDatabase()
	 * @generated
	 */
	void setDatabase(Database value);

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference.
	 * @see #setConnectors(Connectors)
	 * @see ucof.communication.CommunicationPackage#getCommunication_Connectors()
	 * @model containment="true"
	 * @generated
	 */
	Connectors getConnectors();

	/**
	 * Sets the value of the '{@link ucof.communication.Communication#getConnectors <em>Connectors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectors</em>' containment reference.
	 * @see #getConnectors()
	 * @generated
	 */
	void setConnectors(Connectors value);

	/**
	 * Returns the value of the '<em><b>Ed247 Configurations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ed247 Configurations</em>' containment reference.
	 * @see #setEd247Configurations(ED247Configurations)
	 * @see ucof.communication.CommunicationPackage#getCommunication_Ed247Configurations()
	 * @model containment="true"
	 * @generated
	 */
	ED247Configurations getEd247Configurations();

	/**
	 * Sets the value of the '{@link ucof.communication.Communication#getEd247Configurations <em>Ed247 Configurations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ed247 Configurations</em>' containment reference.
	 * @see #getEd247Configurations()
	 * @generated
	 */
	void setEd247Configurations(ED247Configurations value);

	/**
	 * Returns the value of the '<em><b>Communication Devices</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.communication.comDevices.CommunicationDevices}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Devices</em>' containment reference list.
	 * @see ucof.communication.CommunicationPackage#getCommunication_CommunicationDevices()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommunicationDevices> getCommunicationDevices();

} // Communication
