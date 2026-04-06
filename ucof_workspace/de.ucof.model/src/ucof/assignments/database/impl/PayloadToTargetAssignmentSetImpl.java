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
import ucof.assignments.database.PayloadToTargetAssignment;
import ucof.assignments.database.PayloadToTargetAssignmentSet;

import ucof.assignments.impl.SuperAssignmentSetTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payload To Target Assignment Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.assignments.database.impl.PayloadToTargetAssignmentSetImpl#getPayloadToTargetAssignment <em>Payload To Target Assignment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PayloadToTargetAssignmentSetImpl extends SuperAssignmentSetTypeImpl implements PayloadToTargetAssignmentSet {
	/**
	 * The cached value of the '{@link #getPayloadToTargetAssignment() <em>Payload To Target Assignment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayloadToTargetAssignment()
	 * @generated
	 * @ordered
	 */
	protected EList<PayloadToTargetAssignment> payloadToTargetAssignment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PayloadToTargetAssignmentSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatabasePackage.Literals.PAYLOAD_TO_TARGET_ASSIGNMENT_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PayloadToTargetAssignment> getPayloadToTargetAssignment() {
		if (payloadToTargetAssignment == null) {
			payloadToTargetAssignment = new EObjectContainmentEList<PayloadToTargetAssignment>(PayloadToTargetAssignment.class, this, DatabasePackage.PAYLOAD_TO_TARGET_ASSIGNMENT_SET__PAYLOAD_TO_TARGET_ASSIGNMENT);
		}
		return payloadToTargetAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatabasePackage.PAYLOAD_TO_TARGET_ASSIGNMENT_SET__PAYLOAD_TO_TARGET_ASSIGNMENT:
				return ((InternalEList<?>)getPayloadToTargetAssignment()).basicRemove(otherEnd, msgs);
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
			case DatabasePackage.PAYLOAD_TO_TARGET_ASSIGNMENT_SET__PAYLOAD_TO_TARGET_ASSIGNMENT:
				return getPayloadToTargetAssignment();
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
			case DatabasePackage.PAYLOAD_TO_TARGET_ASSIGNMENT_SET__PAYLOAD_TO_TARGET_ASSIGNMENT:
				getPayloadToTargetAssignment().clear();
				getPayloadToTargetAssignment().addAll((Collection<? extends PayloadToTargetAssignment>)newValue);
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
			case DatabasePackage.PAYLOAD_TO_TARGET_ASSIGNMENT_SET__PAYLOAD_TO_TARGET_ASSIGNMENT:
				getPayloadToTargetAssignment().clear();
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
			case DatabasePackage.PAYLOAD_TO_TARGET_ASSIGNMENT_SET__PAYLOAD_TO_TARGET_ASSIGNMENT:
				return payloadToTargetAssignment != null && !payloadToTargetAssignment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PayloadToTargetAssignmentSetImpl
