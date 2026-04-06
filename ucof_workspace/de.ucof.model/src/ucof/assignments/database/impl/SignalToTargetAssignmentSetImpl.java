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
import ucof.assignments.database.SignalToTargetAssignment;
import ucof.assignments.database.SignalToTargetAssignmentSet;

import ucof.assignments.impl.SuperAssignmentSetTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal To Target Assignment Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.assignments.database.impl.SignalToTargetAssignmentSetImpl#getSignalToTargetAssignment <em>Signal To Target Assignment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignalToTargetAssignmentSetImpl extends SuperAssignmentSetTypeImpl implements SignalToTargetAssignmentSet {
	/**
	 * The cached value of the '{@link #getSignalToTargetAssignment() <em>Signal To Target Assignment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalToTargetAssignment()
	 * @generated
	 * @ordered
	 */
	protected EList<SignalToTargetAssignment> signalToTargetAssignment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalToTargetAssignmentSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatabasePackage.Literals.SIGNAL_TO_TARGET_ASSIGNMENT_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SignalToTargetAssignment> getSignalToTargetAssignment() {
		if (signalToTargetAssignment == null) {
			signalToTargetAssignment = new EObjectContainmentEList<SignalToTargetAssignment>(SignalToTargetAssignment.class, this, DatabasePackage.SIGNAL_TO_TARGET_ASSIGNMENT_SET__SIGNAL_TO_TARGET_ASSIGNMENT);
		}
		return signalToTargetAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatabasePackage.SIGNAL_TO_TARGET_ASSIGNMENT_SET__SIGNAL_TO_TARGET_ASSIGNMENT:
				return ((InternalEList<?>)getSignalToTargetAssignment()).basicRemove(otherEnd, msgs);
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
			case DatabasePackage.SIGNAL_TO_TARGET_ASSIGNMENT_SET__SIGNAL_TO_TARGET_ASSIGNMENT:
				return getSignalToTargetAssignment();
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
			case DatabasePackage.SIGNAL_TO_TARGET_ASSIGNMENT_SET__SIGNAL_TO_TARGET_ASSIGNMENT:
				getSignalToTargetAssignment().clear();
				getSignalToTargetAssignment().addAll((Collection<? extends SignalToTargetAssignment>)newValue);
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
			case DatabasePackage.SIGNAL_TO_TARGET_ASSIGNMENT_SET__SIGNAL_TO_TARGET_ASSIGNMENT:
				getSignalToTargetAssignment().clear();
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
			case DatabasePackage.SIGNAL_TO_TARGET_ASSIGNMENT_SET__SIGNAL_TO_TARGET_ASSIGNMENT:
				return signalToTargetAssignment != null && !signalToTargetAssignment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SignalToTargetAssignmentSetImpl
