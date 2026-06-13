/**
 */
package ucof.communication.configECIC;

import org.eclipse.emf.common.util.EList;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

import ucof.communication.configECIC.streamTypes.SuperStreamType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.Channel#getFrameFormat <em>Frame Format</em>}</li>
 *   <li>{@link ucof.communication.configECIC.Channel#getComInterface <em>Com Interface</em>}</li>
 *   <li>{@link ucof.communication.configECIC.Channel#getHeader <em>Header</em>}</li>
 *   <li>{@link ucof.communication.configECIC.Channel#getStream <em>Stream</em>}</li>
 * </ul>
 *
 * @see ucof.communication.configECIC.ConfigECICPackage#getChannel()
 * @model
 * @generated
 */
public interface Channel extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Frame Format</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.communication.configECIC.StandardRevisionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame Format</em>' attribute.
	 * @see ucof.communication.configECIC.StandardRevisionType
	 * @see #setFrameFormat(StandardRevisionType)
	 * @see ucof.communication.configECIC.ConfigECICPackage#getChannel_FrameFormat()
	 * @model
	 * @generated
	 */
	StandardRevisionType getFrameFormat();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.Channel#getFrameFormat <em>Frame Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame Format</em>' attribute.
	 * @see ucof.communication.configECIC.StandardRevisionType
	 * @see #getFrameFormat()
	 * @generated
	 */
	void setFrameFormat(StandardRevisionType value);

	/**
	 * Returns the value of the '<em><b>Com Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Com Interface</em>' containment reference.
	 * @see #setComInterface(ComInterface)
	 * @see ucof.communication.configECIC.ConfigECICPackage#getChannel_ComInterface()
	 * @model containment="true"
	 * @generated
	 */
	ComInterface getComInterface();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.Channel#getComInterface <em>Com Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Com Interface</em>' containment reference.
	 * @see #getComInterface()
	 * @generated
	 */
	void setComInterface(ComInterface value);

	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(Header)
	 * @see ucof.communication.configECIC.ConfigECICPackage#getChannel_Header()
	 * @model containment="true"
	 * @generated
	 */
	Header getHeader();

	/**
	 * Sets the value of the '{@link ucof.communication.configECIC.Channel#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(Header value);

	/**
	 * Returns the value of the '<em><b>Stream</b></em>' containment reference list.
	 * The list contents are of type {@link ucof.communication.configECIC.streamTypes.SuperStreamType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stream</em>' containment reference list.
	 * @see ucof.communication.configECIC.ConfigECICPackage#getChannel_Stream()
	 * @model containment="true"
	 * @generated
	 */
	EList<SuperStreamType> getStream();

} // Channel
