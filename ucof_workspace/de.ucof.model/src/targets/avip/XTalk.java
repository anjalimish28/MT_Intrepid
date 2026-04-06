/**
 */
package targets.avip;

import ucof.common.enums.SingleDirectionType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XTalk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.avip.XTalk#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see targets.avip.AvipPackage#getXTalk()
 * @model
 * @generated
 */
public interface XTalk extends SuperAVDPortType {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.SingleDirectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see ucof.common.enums.SingleDirectionType
	 * @see #setDirection(SingleDirectionType)
	 * @see targets.avip.AvipPackage#getXTalk_Direction()
	 * @model
	 * @generated
	 */
	SingleDirectionType getDirection();

	/**
	 * Sets the value of the '{@link targets.avip.XTalk#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see ucof.common.enums.SingleDirectionType
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(SingleDirectionType value);

} // XTalk
