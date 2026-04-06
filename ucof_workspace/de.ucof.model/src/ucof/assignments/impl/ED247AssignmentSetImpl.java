/**
 */
package ucof.assignments.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ucof.assignments.AssignmentsPackage;
import ucof.assignments.ED247Assignment;
import ucof.assignments.ED247AssignmentSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ED247 Assignment Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.assignments.impl.ED247AssignmentSetImpl#getEd247Assignment <em>Ed247 Assignment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ED247AssignmentSetImpl extends SuperAssignmentSetTypeImpl implements ED247AssignmentSet {
	/**
	 * The cached value of the '{@link #getEd247Assignment() <em>Ed247 Assignment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEd247Assignment()
	 * @generated
	 * @ordered
	 */
	protected EList<ED247Assignment> ed247Assignment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ED247AssignmentSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssignmentsPackage.Literals.ED247_ASSIGNMENT_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ED247Assignment> getEd247Assignment() {
		if (ed247Assignment == null) {
			ed247Assignment = new EObjectContainmentEList<ED247Assignment>(ED247Assignment.class, this, AssignmentsPackage.ED247_ASSIGNMENT_SET__ED247_ASSIGNMENT);
		}
		return ed247Assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssignmentsPackage.ED247_ASSIGNMENT_SET__ED247_ASSIGNMENT:
				return ((InternalEList<?>)getEd247Assignment()).basicRemove(otherEnd, msgs);
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
			case AssignmentsPackage.ED247_ASSIGNMENT_SET__ED247_ASSIGNMENT:
				return getEd247Assignment();
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
			case AssignmentsPackage.ED247_ASSIGNMENT_SET__ED247_ASSIGNMENT:
				getEd247Assignment().clear();
				getEd247Assignment().addAll((Collection<? extends ED247Assignment>)newValue);
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
			case AssignmentsPackage.ED247_ASSIGNMENT_SET__ED247_ASSIGNMENT:
				getEd247Assignment().clear();
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
			case AssignmentsPackage.ED247_ASSIGNMENT_SET__ED247_ASSIGNMENT:
				return ed247Assignment != null && !ed247Assignment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ED247AssignmentSetImpl
