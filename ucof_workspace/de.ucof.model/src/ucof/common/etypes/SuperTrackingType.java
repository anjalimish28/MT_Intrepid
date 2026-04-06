/**
 */
package ucof.common.etypes;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super Tracking Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Super Class for traceability attributes, i.e. creation and modification info
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.common.etypes.SuperTrackingType#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link ucof.common.etypes.SuperTrackingType#getModified <em>Modified</em>}</li>
 *   <li>{@link ucof.common.etypes.SuperTrackingType#getModifier <em>Modifier</em>}</li>
 *   <li>{@link ucof.common.etypes.SuperTrackingType#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link ucof.common.etypes.SuperTrackingType#getCreated <em>Created</em>}</li>
 *   <li>{@link ucof.common.etypes.SuperTrackingType#getCreator <em>Creator</em>}</li>
 *   <li>{@link ucof.common.etypes.SuperTrackingType#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see ucof.common.etypes.EtypesPackage#getSuperTrackingType()
 * @model abstract="true"
 * @generated
 */
public interface SuperTrackingType extends EObject {
	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A textual documentation of this model element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see ucof.common.etypes.EtypesPackage#getSuperTrackingType_Documentation()
	 * @model default=""
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link ucof.common.etypes.SuperTrackingType#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * Returns the value of the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date of the last modification. This should be set automatically.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modified</em>' attribute.
	 * @see #setModified(Date)
	 * @see ucof.common.etypes.EtypesPackage#getSuperTrackingType_Modified()
	 * @model
	 * @generated
	 */
	Date getModified();

	/**
	 * Sets the value of the '{@link ucof.common.etypes.SuperTrackingType#getModified <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified</em>' attribute.
	 * @see #getModified()
	 * @generated
	 */
	void setModified(Date value);

	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the user who last modified the element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modifier</em>' attribute.
	 * @see #setModifier(String)
	 * @see ucof.common.etypes.EtypesPackage#getSuperTrackingType_Modifier()
	 * @model
	 * @generated
	 */
	String getModifier();

	/**
	 * Sets the value of the '{@link ucof.common.etypes.SuperTrackingType#getModifier <em>Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modifier</em>' attribute.
	 * @see #getModifier()
	 * @generated
	 */
	void setModifier(String value);

	/**
	 * Returns the value of the '<em><b>Trace Link</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A textual traceable link. For instance the requirement id.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trace Link</em>' attribute.
	 * @see #setTraceLink(String)
	 * @see ucof.common.etypes.EtypesPackage#getSuperTrackingType_TraceLink()
	 * @model default=""
	 * @generated
	 */
	String getTraceLink();

	/**
	 * Sets the value of the '{@link ucof.common.etypes.SuperTrackingType#getTraceLink <em>Trace Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Link</em>' attribute.
	 * @see #getTraceLink()
	 * @generated
	 */
	void setTraceLink(String value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' attribute.
	 * @see #setCreated(Date)
	 * @see ucof.common.etypes.EtypesPackage#getSuperTrackingType_Created()
	 * @model
	 * @generated
	 */
	Date getCreated();

	/**
	 * Sets the value of the '{@link ucof.common.etypes.SuperTrackingType#getCreated <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' attribute.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(Date value);

	/**
	 * Returns the value of the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creator</em>' attribute.
	 * @see #setCreator(String)
	 * @see ucof.common.etypes.EtypesPackage#getSuperTrackingType_Creator()
	 * @model
	 * @generated
	 */
	String getCreator();

	/**
	 * Sets the value of the '{@link ucof.common.etypes.SuperTrackingType#getCreator <em>Creator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creator</em>' attribute.
	 * @see #getCreator()
	 * @generated
	 */
	void setCreator(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(float)
	 * @see ucof.common.etypes.EtypesPackage#getSuperTrackingType_Version()
	 * @model
	 * @generated
	 */
	float getVersion();

	/**
	 * Sets the value of the '{@link ucof.common.etypes.SuperTrackingType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(float value);

} // SuperTrackingType
