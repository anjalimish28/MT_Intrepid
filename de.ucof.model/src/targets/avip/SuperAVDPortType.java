/**
 */
package targets.avip;

import org.eclipse.emf.common.util.EList;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super AVD Port Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.avip.SuperAVDPortType#getConnectorName <em>Connector Name</em>}</li>
 *   <li>{@link targets.avip.SuperAVDPortType#getConnectorPinName <em>Connector Pin Name</em>}</li>
 *   <li>{@link targets.avip.SuperAVDPortType#getIf_id <em>If id</em>}</li>
 *   <li>{@link targets.avip.SuperAVDPortType#getFunctionalData <em>Functional Data</em>}</li>
 *   <li>{@link targets.avip.SuperAVDPortType#getPortUserConfiguration <em>Port User Configuration</em>}</li>
 *   <li>{@link targets.avip.SuperAVDPortType#getSignalExtensions <em>Signal Extensions</em>}</li>
 * </ul>
 *
 * @see targets.avip.AvipPackage#getSuperAVDPortType()
 * @model abstract="true"
 * @generated
 */
public interface SuperAVDPortType extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Connector Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Name</em>' attribute.
	 * @see #setConnectorName(String)
	 * @see targets.avip.AvipPackage#getSuperAVDPortType_ConnectorName()
	 * @model dataType="targets.avip.ConnectorNameType"
	 * @generated
	 */
	String getConnectorName();

	/**
	 * Sets the value of the '{@link targets.avip.SuperAVDPortType#getConnectorName <em>Connector Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector Name</em>' attribute.
	 * @see #getConnectorName()
	 * @generated
	 */
	void setConnectorName(String value);

	/**
	 * Returns the value of the '<em><b>Connector Pin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Pin Name</em>' attribute.
	 * @see #setConnectorPinName(String)
	 * @see targets.avip.AvipPackage#getSuperAVDPortType_ConnectorPinName()
	 * @model dataType="targets.avip.ConnectorPinNameType"
	 * @generated
	 */
	String getConnectorPinName();

	/**
	 * Sets the value of the '{@link targets.avip.SuperAVDPortType#getConnectorPinName <em>Connector Pin Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector Pin Name</em>' attribute.
	 * @see #getConnectorPinName()
	 * @generated
	 */
	void setConnectorPinName(String value);

	/**
	 * Returns the value of the '<em><b>If id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If id</em>' attribute.
	 * @see #setIf_id(int)
	 * @see targets.avip.AvipPackage#getSuperAVDPortType_If_id()
	 * @model
	 * @generated
	 */
	int getIf_id();

	/**
	 * Sets the value of the '{@link targets.avip.SuperAVDPortType#getIf_id <em>If id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If id</em>' attribute.
	 * @see #getIf_id()
	 * @generated
	 */
	void setIf_id(int value);

	/**
	 * Returns the value of the '<em><b>Functional Data</b></em>' containment reference list.
	 * The list contents are of type {@link targets.avip.FunctionalData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional Data</em>' containment reference list.
	 * @see targets.avip.AvipPackage#getSuperAVDPortType_FunctionalData()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionalData> getFunctionalData();

	/**
	 * Returns the value of the '<em><b>Port User Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link targets.avip.PortUserConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port User Configuration</em>' containment reference list.
	 * @see targets.avip.AvipPackage#getSuperAVDPortType_PortUserConfiguration()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortUserConfiguration> getPortUserConfiguration();

	/**
	 * Returns the value of the '<em><b>Signal Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Extensions</em>' containment reference.
	 * @see #setSignalExtensions(SignalExtensions)
	 * @see targets.avip.AvipPackage#getSuperAVDPortType_SignalExtensions()
	 * @model containment="true"
	 * @generated
	 */
	SignalExtensions getSignalExtensions();

	/**
	 * Sets the value of the '{@link targets.avip.SuperAVDPortType#getSignalExtensions <em>Signal Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Extensions</em>' containment reference.
	 * @see #getSignalExtensions()
	 * @generated
	 */
	void setSignalExtensions(SignalExtensions value);

} // SuperAVDPortType
