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
import ucof.assignments.PortToPortAssignment;
import ucof.assignments.PortToPortAssignmentSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port To Port Assignment Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.assignments.impl.PortToPortAssignmentSetImpl#getPortToPortAssignment <em>Port To Port Assignment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortToPortAssignmentSetImpl extends SuperAssignmentSetTypeImpl implements PortToPortAssignmentSet {
	/**
	 * The cached value of the '{@link #getPortToPortAssignment() <em>Port To Port Assignment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortToPortAssignment()
	 * @generated
	 * @ordered
	 */
	protected EList<PortToPortAssignment> portToPortAssignment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortToPortAssignmentSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssignmentsPackage.Literals.PORT_TO_PORT_ASSIGNMENT_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortToPortAssignment> getPortToPortAssignment() {
		if (portToPortAssignment == null) {
			portToPortAssignment = new EObjectContainmentEList<PortToPortAssignment>(PortToPortAssignment.class, this, AssignmentsPackage.PORT_TO_PORT_ASSIGNMENT_SET__PORT_TO_PORT_ASSIGNMENT);
		}
		return portToPortAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssignmentsPackage.PORT_TO_PORT_ASSIGNMENT_SET__PORT_TO_PORT_ASSIGNMENT:
				return ((InternalEList<?>)getPortToPortAssignment()).basicRemove(otherEnd, msgs);
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
			case AssignmentsPackage.PORT_TO_PORT_ASSIGNMENT_SET__PORT_TO_PORT_ASSIGNMENT:
				return getPortToPortAssignment();
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
			case AssignmentsPackage.PORT_TO_PORT_ASSIGNMENT_SET__PORT_TO_PORT_ASSIGNMENT:
				getPortToPortAssignment().clear();
				getPortToPortAssignment().addAll((Collection<? extends PortToPortAssignment>)newValue);
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
			case AssignmentsPackage.PORT_TO_PORT_ASSIGNMENT_SET__PORT_TO_PORT_ASSIGNMENT:
				getPortToPortAssignment().clear();
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
			case AssignmentsPackage.PORT_TO_PORT_ASSIGNMENT_SET__PORT_TO_PORT_ASSIGNMENT:
				return portToPortAssignment != null && !portToPortAssignment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PortToPortAssignmentSetImpl
