/**
 */
package ucof.assignments.database.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ucof.assignments.database.DatabasePackage;
import ucof.assignments.database.MessageToTargetAssignment;
import ucof.assignments.database.MessageToTargetAssignmentSet;

import ucof.assignments.impl.SuperAssignmentSetTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message To Target Assignment Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.assignments.database.impl.MessageToTargetAssignmentSetImpl#getMessageToTargetAssignment <em>Message To Target Assignment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageToTargetAssignmentSetImpl extends SuperAssignmentSetTypeImpl implements MessageToTargetAssignmentSet {
	/**
	 * The cached value of the '{@link #getMessageToTargetAssignment() <em>Message To Target Assignment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageToTargetAssignment()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageToTargetAssignment> messageToTargetAssignment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageToTargetAssignmentSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatabasePackage.Literals.MESSAGE_TO_TARGET_ASSIGNMENT_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageToTargetAssignment> getMessageToTargetAssignment() {
		if (messageToTargetAssignment == null) {
			messageToTargetAssignment = new EObjectContainmentEList<MessageToTargetAssignment>(MessageToTargetAssignment.class, this, DatabasePackage.MESSAGE_TO_TARGET_ASSIGNMENT_SET__MESSAGE_TO_TARGET_ASSIGNMENT);
		}
		return messageToTargetAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatabasePackage.MESSAGE_TO_TARGET_ASSIGNMENT_SET__MESSAGE_TO_TARGET_ASSIGNMENT:
				return ((InternalEList<?>)getMessageToTargetAssignment()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatabasePackage.MESSAGE_TO_TARGET_ASSIGNMENT_SET__MESSAGE_TO_TARGET_ASSIGNMENT:
				return getMessageToTargetAssignment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DatabasePackage.MESSAGE_TO_TARGET_ASSIGNMENT_SET__MESSAGE_TO_TARGET_ASSIGNMENT:
				getMessageToTargetAssignment().clear();
				getMessageToTargetAssignment().addAll((Collection<? extends MessageToTargetAssignment>)newValue);
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
			case DatabasePackage.MESSAGE_TO_TARGET_ASSIGNMENT_SET__MESSAGE_TO_TARGET_ASSIGNMENT:
				getMessageToTargetAssignment().clear();
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
			case DatabasePackage.MESSAGE_TO_TARGET_ASSIGNMENT_SET__MESSAGE_TO_TARGET_ASSIGNMENT:
				return messageToTargetAssignment != null && !messageToTargetAssignment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MessageToTargetAssignmentSetImpl
