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
import ucof.assignments.InterfaceToHardwareAssignment;
import ucof.assignments.InterfaceToHardwareAssignmentSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface To Hardware Assignment Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.assignments.impl.InterfaceToHardwareAssignmentSetImpl#getInterfaceToHardwareAssignment <em>Interface To Hardware Assignment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceToHardwareAssignmentSetImpl extends SuperAssignmentSetTypeImpl implements InterfaceToHardwareAssignmentSet {
	/**
	 * The cached value of the '{@link #getInterfaceToHardwareAssignment() <em>Interface To Hardware Assignment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceToHardwareAssignment()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceToHardwareAssignment> interfaceToHardwareAssignment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceToHardwareAssignmentSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssignmentsPackage.Literals.INTERFACE_TO_HARDWARE_ASSIGNMENT_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceToHardwareAssignment> getInterfaceToHardwareAssignment() {
		if (interfaceToHardwareAssignment == null) {
			interfaceToHardwareAssignment = new EObjectContainmentEList<InterfaceToHardwareAssignment>(InterfaceToHardwareAssignment.class, this, AssignmentsPackage.INTERFACE_TO_HARDWARE_ASSIGNMENT_SET__INTERFACE_TO_HARDWARE_ASSIGNMENT);
		}
		return interfaceToHardwareAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssignmentsPackage.INTERFACE_TO_HARDWARE_ASSIGNMENT_SET__INTERFACE_TO_HARDWARE_ASSIGNMENT:
				return ((InternalEList<?>)getInterfaceToHardwareAssignment()).basicRemove(otherEnd, msgs);
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
			case AssignmentsPackage.INTERFACE_TO_HARDWARE_ASSIGNMENT_SET__INTERFACE_TO_HARDWARE_ASSIGNMENT:
				return getInterfaceToHardwareAssignment();
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
			case AssignmentsPackage.INTERFACE_TO_HARDWARE_ASSIGNMENT_SET__INTERFACE_TO_HARDWARE_ASSIGNMENT:
				getInterfaceToHardwareAssignment().clear();
				getInterfaceToHardwareAssignment().addAll((Collection<? extends InterfaceToHardwareAssignment>)newValue);
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
			case AssignmentsPackage.INTERFACE_TO_HARDWARE_ASSIGNMENT_SET__INTERFACE_TO_HARDWARE_ASSIGNMENT:
				getInterfaceToHardwareAssignment().clear();
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
			case AssignmentsPackage.INTERFACE_TO_HARDWARE_ASSIGNMENT_SET__INTERFACE_TO_HARDWARE_ASSIGNMENT:
				return interfaceToHardwareAssignment != null && !interfaceToHardwareAssignment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterfaceToHardwareAssignmentSetImpl
