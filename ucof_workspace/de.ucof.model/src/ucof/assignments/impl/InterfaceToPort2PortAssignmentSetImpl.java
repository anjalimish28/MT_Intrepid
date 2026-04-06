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
import ucof.assignments.InterfaceToPort2PortAssignment;
import ucof.assignments.InterfaceToPort2PortAssignmentSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface To Port2 Port Assignment Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.assignments.impl.InterfaceToPort2PortAssignmentSetImpl#getInterfaceToPortAssignment <em>Interface To Port Assignment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceToPort2PortAssignmentSetImpl extends SuperAssignmentSetTypeImpl implements InterfaceToPort2PortAssignmentSet {
	/**
	 * The cached value of the '{@link #getInterfaceToPortAssignment() <em>Interface To Port Assignment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceToPortAssignment()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceToPort2PortAssignment> interfaceToPortAssignment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceToPort2PortAssignmentSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssignmentsPackage.Literals.INTERFACE_TO_PORT2_PORT_ASSIGNMENT_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceToPort2PortAssignment> getInterfaceToPortAssignment() {
		if (interfaceToPortAssignment == null) {
			interfaceToPortAssignment = new EObjectContainmentEList<InterfaceToPort2PortAssignment>(InterfaceToPort2PortAssignment.class, this, AssignmentsPackage.INTERFACE_TO_PORT2_PORT_ASSIGNMENT_SET__INTERFACE_TO_PORT_ASSIGNMENT);
		}
		return interfaceToPortAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssignmentsPackage.INTERFACE_TO_PORT2_PORT_ASSIGNMENT_SET__INTERFACE_TO_PORT_ASSIGNMENT:
				return ((InternalEList<?>)getInterfaceToPortAssignment()).basicRemove(otherEnd, msgs);
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
			case AssignmentsPackage.INTERFACE_TO_PORT2_PORT_ASSIGNMENT_SET__INTERFACE_TO_PORT_ASSIGNMENT:
				return getInterfaceToPortAssignment();
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
			case AssignmentsPackage.INTERFACE_TO_PORT2_PORT_ASSIGNMENT_SET__INTERFACE_TO_PORT_ASSIGNMENT:
				getInterfaceToPortAssignment().clear();
				getInterfaceToPortAssignment().addAll((Collection<? extends InterfaceToPort2PortAssignment>)newValue);
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
			case AssignmentsPackage.INTERFACE_TO_PORT2_PORT_ASSIGNMENT_SET__INTERFACE_TO_PORT_ASSIGNMENT:
				getInterfaceToPortAssignment().clear();
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
			case AssignmentsPackage.INTERFACE_TO_PORT2_PORT_ASSIGNMENT_SET__INTERFACE_TO_PORT_ASSIGNMENT:
				return interfaceToPortAssignment != null && !interfaceToPortAssignment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterfaceToPort2PortAssignmentSetImpl
