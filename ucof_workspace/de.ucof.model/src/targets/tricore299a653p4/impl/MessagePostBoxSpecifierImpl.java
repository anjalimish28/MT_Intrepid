/**
 */
package targets.tricore299a653p4.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import targets.impl.SuperAssignmentSpecificationTypeImpl;

import targets.tricore299a653p4.MessagePostBoxSpecifier;
import targets.tricore299a653p4.Tricore299a653p4Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Post Box Specifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.tricore299a653p4.impl.MessagePostBoxSpecifierImpl#getPostBox <em>Post Box</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessagePostBoxSpecifierImpl extends SuperAssignmentSpecificationTypeImpl implements MessagePostBoxSpecifier {
	/**
	 * The default value of the '{@link #getPostBox() <em>Post Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostBox()
	 * @generated
	 * @ordered
	 */
	protected static final int POST_BOX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPostBox() <em>Post Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostBox()
	 * @generated
	 * @ordered
	 */
	protected int postBox = POST_BOX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessagePostBoxSpecifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tricore299a653p4Package.Literals.MESSAGE_POST_BOX_SPECIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPostBox() {
		return postBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostBox(int newPostBox) {
		int oldPostBox = postBox;
		postBox = newPostBox;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tricore299a653p4Package.MESSAGE_POST_BOX_SPECIFIER__POST_BOX, oldPostBox, postBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Tricore299a653p4Package.MESSAGE_POST_BOX_SPECIFIER__POST_BOX:
				return getPostBox();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Tricore299a653p4Package.MESSAGE_POST_BOX_SPECIFIER__POST_BOX:
				setPostBox((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Tricore299a653p4Package.MESSAGE_POST_BOX_SPECIFIER__POST_BOX:
				setPostBox(POST_BOX_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Tricore299a653p4Package.MESSAGE_POST_BOX_SPECIFIER__POST_BOX:
				return postBox != POST_BOX_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (postBox: ");
		result.append(postBox);
		result.append(')');
		return result.toString();
	}

} //MessagePostBoxSpecifierImpl
