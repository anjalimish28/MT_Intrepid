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
import ucof.assignments.SWPortToHWPortAssignment;
import ucof.assignments.SWPortToHWPortAssignmentSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SW Port To HW Port Assignment Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.assignments.impl.SWPortToHWPortAssignmentSetImpl#getSwPortToHWPortAssignment <em>Sw Port To HW Port Assignment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SWPortToHWPortAssignmentSetImpl extends SuperAssignmentSetTypeImpl implements SWPortToHWPortAssignmentSet {
	/**
	 * The cached value of the '{@link #getSwPortToHWPortAssignment() <em>Sw Port To HW Port Assignment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwPortToHWPortAssignment()
	 * @generated
	 * @ordered
	 */
	protected EList<SWPortToHWPortAssignment> swPortToHWPortAssignment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SWPortToHWPortAssignmentSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssignmentsPackage.Literals.SW_PORT_TO_HW_PORT_ASSIGNMENT_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SWPortToHWPortAssignment> getSwPortToHWPortAssignment() {
		if (swPortToHWPortAssignment == null) {
			swPortToHWPortAssignment = new EObjectContainmentEList<SWPortToHWPortAssignment>(SWPortToHWPortAssignment.class, this, AssignmentsPackage.SW_PORT_TO_HW_PORT_ASSIGNMENT_SET__SW_PORT_TO_HW_PORT_ASSIGNMENT);
		}
		return swPortToHWPortAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssignmentsPackage.SW_PORT_TO_HW_PORT_ASSIGNMENT_SET__SW_PORT_TO_HW_PORT_ASSIGNMENT:
				return ((InternalEList<?>)getSwPortToHWPortAssignment()).basicRemove(otherEnd, msgs);
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
			case AssignmentsPackage.SW_PORT_TO_HW_PORT_ASSIGNMENT_SET__SW_PORT_TO_HW_PORT_ASSIGNMENT:
				return getSwPortToHWPortAssignment();
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
			case AssignmentsPackage.SW_PORT_TO_HW_PORT_ASSIGNMENT_SET__SW_PORT_TO_HW_PORT_ASSIGNMENT:
				getSwPortToHWPortAssignment().clear();
				getSwPortToHWPortAssignment().addAll((Collection<? extends SWPortToHWPortAssignment>)newValue);
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
			case AssignmentsPackage.SW_PORT_TO_HW_PORT_ASSIGNMENT_SET__SW_PORT_TO_HW_PORT_ASSIGNMENT:
				getSwPortToHWPortAssignment().clear();
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
			case AssignmentsPackage.SW_PORT_TO_HW_PORT_ASSIGNMENT_SET__SW_PORT_TO_HW_PORT_ASSIGNMENT:
				return swPortToHWPortAssignment != null && !swPortToHWPortAssignment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SWPortToHWPortAssignmentSetImpl
