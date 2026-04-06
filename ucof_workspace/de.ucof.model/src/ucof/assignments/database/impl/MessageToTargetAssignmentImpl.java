/**
 */
package ucof.assignments.database.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.assignments.database.DatabasePackage;
import ucof.assignments.database.MessageToTargetAssignment;
import ucof.assignments.database.messageTargets;

import ucof.assignments.impl.SuperAssignmentTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message To Target Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.assignments.database.impl.MessageToTargetAssignmentImpl#getAssignmentTargetType <em>Assignment Target Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageToTargetAssignmentImpl extends SuperAssignmentTypeImpl implements MessageToTargetAssignment {
	/**
	 * The default value of the '{@link #getAssignmentTargetType() <em>Assignment Target Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignmentTargetType()
	 * @generated
	 * @ordered
	 */
	protected static final messageTargets ASSIGNMENT_TARGET_TYPE_EDEFAULT = messageTargets.NOT_SET;

	/**
	 * The cached value of the '{@link #getAssignmentTargetType() <em>Assignment Target Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignmentTargetType()
	 * @generated
	 * @ordered
	 */
	protected messageTargets assignmentTargetType = ASSIGNMENT_TARGET_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageToTargetAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatabasePackage.Literals.MESSAGE_TO_TARGET_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public messageTargets getAssignmentTargetType() {
		return assignmentTargetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignmentTargetType(messageTargets newAssignmentTargetType) {
		messageTargets oldAssignmentTargetType = assignmentTargetType;
		assignmentTargetType = newAssignmentTargetType == null ? ASSIGNMENT_TARGET_TYPE_EDEFAULT : newAssignmentTargetType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.MESSAGE_TO_TARGET_ASSIGNMENT__ASSIGNMENT_TARGET_TYPE, oldAssignmentTargetType, assignmentTargetType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatabasePackage.MESSAGE_TO_TARGET_ASSIGNMENT__ASSIGNMENT_TARGET_TYPE:
				return getAssignmentTargetType();
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
			case DatabasePackage.MESSAGE_TO_TARGET_ASSIGNMENT__ASSIGNMENT_TARGET_TYPE:
				setAssignmentTargetType((messageTargets)newValue);
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
			case DatabasePackage.MESSAGE_TO_TARGET_ASSIGNMENT__ASSIGNMENT_TARGET_TYPE:
				setAssignmentTargetType(ASSIGNMENT_TARGET_TYPE_EDEFAULT);
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
			case DatabasePackage.MESSAGE_TO_TARGET_ASSIGNMENT__ASSIGNMENT_TARGET_TYPE:
				return assignmentTargetType != ASSIGNMENT_TARGET_TYPE_EDEFAULT;
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
		result.append(" (assignmentTargetType: ");
		result.append(assignmentTargetType);
		result.append(')');
		return result.toString();
	}

} //MessageToTargetAssignmentImpl
