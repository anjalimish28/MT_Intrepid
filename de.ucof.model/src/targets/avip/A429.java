/**
 */
package targets.avip;

import ucof.common.enums.SingleDirectionType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>A429</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.avip.A429#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see targets.avip.AvipPackage#getA429()
 * @model
 * @generated
 */
public interface A429 extends SuperAVDPortType {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link ucof.common.enums.SingleDirectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see ucof.common.enums.SingleDirectionType
	 * @see #setDirection(SingleDirectionType)
	 * @see targets.avip.AvipPackage#getA429_Direction()
	 * @model
	 * @generated
	 */
	SingleDirectionType getDirection();

	/**
	 * Sets the value of the '{@link targets.avip.A429#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see ucof.common.enums.SingleDirectionType
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(SingleDirectionType value);

} // A429
