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
import ucof.assignments.DeviceToImplementationAssignment;
import ucof.assignments.DeviceToImplementationAssignmentSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device To Implementation Assignment Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.assignments.impl.DeviceToImplementationAssignmentSetImpl#getDeviceToImplementationAssignment <em>Device To Implementation Assignment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceToImplementationAssignmentSetImpl extends SuperAssignmentSetTypeImpl implements DeviceToImplementationAssignmentSet {
	/**
	 * The cached value of the '{@link #getDeviceToImplementationAssignment() <em>Device To Implementation Assignment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceToImplementationAssignment()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceToImplementationAssignment> deviceToImplementationAssignment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceToImplementationAssignmentSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssignmentsPackage.Literals.DEVICE_TO_IMPLEMENTATION_ASSIGNMENT_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceToImplementationAssignment> getDeviceToImplementationAssignment() {
		if (deviceToImplementationAssignment == null) {
			deviceToImplementationAssignment = new EObjectContainmentEList<DeviceToImplementationAssignment>(DeviceToImplementationAssignment.class, this, AssignmentsPackage.DEVICE_TO_IMPLEMENTATION_ASSIGNMENT_SET__DEVICE_TO_IMPLEMENTATION_ASSIGNMENT);
		}
		return deviceToImplementationAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssignmentsPackage.DEVICE_TO_IMPLEMENTATION_ASSIGNMENT_SET__DEVICE_TO_IMPLEMENTATION_ASSIGNMENT:
				return ((InternalEList<?>)getDeviceToImplementationAssignment()).basicRemove(otherEnd, msgs);
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
			case AssignmentsPackage.DEVICE_TO_IMPLEMENTATION_ASSIGNMENT_SET__DEVICE_TO_IMPLEMENTATION_ASSIGNMENT:
				return getDeviceToImplementationAssignment();
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
			case AssignmentsPackage.DEVICE_TO_IMPLEMENTATION_ASSIGNMENT_SET__DEVICE_TO_IMPLEMENTATION_ASSIGNMENT:
				getDeviceToImplementationAssignment().clear();
				getDeviceToImplementationAssignment().addAll((Collection<? extends DeviceToImplementationAssignment>)newValue);
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
			case AssignmentsPackage.DEVICE_TO_IMPLEMENTATION_ASSIGNMENT_SET__DEVICE_TO_IMPLEMENTATION_ASSIGNMENT:
				getDeviceToImplementationAssignment().clear();
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
			case AssignmentsPackage.DEVICE_TO_IMPLEMENTATION_ASSIGNMENT_SET__DEVICE_TO_IMPLEMENTATION_ASSIGNMENT:
				return deviceToImplementationAssignment != null && !deviceToImplementationAssignment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeviceToImplementationAssignmentSetImpl
