/**
 */
package ucof.communication.configECIC;

import ucof.common.etypes.SuperSetType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ED247 Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.ED247Configuration#getStandardRevision <em>Standard Revision</em>}</li>
 *   <li>{@link ucof.communication.configECIC.ED247Configuration#getComponentVersion <em>Component Version</em>}</li>
 *   <li>{@link ucof.communication.configECIC.ED247Configuration#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link ucof.communication.configECIC.ED247Configuration#getChannels <em>Channels</em>}</li>
 *   <li>{@link ucof.communication.configECIC.ED247Configuration#getFileProducer <em>File Producer</em>}</li>
 * </ul>
 *
 * @see ucof.communication.configECIC.ConfigECICPackage#getED247Configuration()
 * @model
 * @generated
 */
public interface ED247Configuration extends SuperSetType {
	/**
	 * Returns the value of the '<em><b>Standard Revision</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.communication.configECIC.StandardRevisionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Revision</em>' attribute.
	 * @see ucof.communication.configECIC.StandardRevisionType
	 * @see #setStandardRevision(StandardRevisionType)
	 * @see ucof.communication.configECIC.ConfigECICPackage#getED247Configuration_StandardRevision()
	 * @model
	 * @generated
	 */
	StandardRevisionType getStandardRevision();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.ED247Configuration#getStandardRevision <em>Standard Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Revision</em>' attribute.
	 * @see ucof.communication.configECIC.StandardRevisionType
	 * @see #getStandardRevision()
	 * @generated
	 */
	void setStandardRevision(StandardRevisionType value);

	/**
	 * Returns the value of the '<em><b>Component Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Version</em>' attribute.
	 * @see #setComponentVersion(String)
	 * @see ucof.communication.configECIC.ConfigECICPackage#getED247Configuration_ComponentVersion()
	 * @model
	 * @generated
	 */
	String getComponentVersion();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.ED247Configuration#getComponentVersion <em>Component Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Version</em>' attribute.
	 * @see #getComponentVersion()
	 * @generated
	 */
	void setComponentVersion(String value);

	/**
	 * Returns the value of the '<em><b>Component Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.communication.configECIC.ComponentTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Type</em>' attribute.
	 * @see ucof.communication.configECIC.ComponentTypeType
	 * @see #setComponentType(ComponentTypeType)
	 * @see ucof.communication.configECIC.ConfigECICPackage#getED247Configuration_ComponentType()
	 * @model
	 * @generated
	 */
	ComponentTypeType getComponentType();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.ED247Configuration#getComponentType <em>Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Type</em>' attribute.
	 * @see ucof.communication.configECIC.ComponentTypeType
	 * @see #getComponentType()
	 * @generated
	 */
	void setComponentType(ComponentTypeType value);

	/**
	 * Returns the value of the '<em><b>Channels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channels</em>' containment reference.
	 * @see #setChannels(Channels)
	 * @see ucof.communication.configECIC.ConfigECICPackage#getED247Configuration_Channels()
	 * @model containment="true"
	 * @generated
	 */
	Channels getChannels();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.ED247Configuration#getChannels <em>Channels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channels</em>' containment reference.
	 * @see #getChannels()
	 * @generated
	 */
	void setChannels(Channels value);

	/**
	 * Returns the value of the '<em><b>File Producer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Producer</em>' containment reference.
	 * @see #setFileProducer(FileProducer)
	 * @see ucof.communication.configECIC.ConfigECICPackage#getED247Configuration_FileProducer()
	 * @model containment="true"
	 * @generated
	 */
	FileProducer getFileProducer();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.ED247Configuration#getFileProducer <em>File Producer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Producer</em>' containment reference.
	 * @see #getFileProducer()
	 * @generated
	 */
	void setFileProducer(FileProducer value);

} // ED247Configuration
