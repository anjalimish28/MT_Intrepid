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
import ucof.assignments.UDPSocketExtension;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ED247 Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.assignments.impl.ED247AssignmentImpl#getUdpSocketExtension <em>Udp Socket Extension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ED247AssignmentImpl extends SuperAssignmentTypeImpl implements ED247Assignment {
	/**
	 * The cached value of the '{@link #getUdpSocketExtension() <em>Udp Socket Extension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUdpSocketExtension()
	 * @generated
	 * @ordered
	 */
	protected EList<UDPSocketExtension> udpSocketExtension;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ED247AssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssignmentsPackage.Literals.ED247_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UDPSocketExtension> getUdpSocketExtension() {
		if (udpSocketExtension == null) {
			udpSocketExtension = new EObjectContainmentEList<UDPSocketExtension>(UDPSocketExtension.class, this, AssignmentsPackage.ED247_ASSIGNMENT__UDP_SOCKET_EXTENSION);
		}
		return udpSocketExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssignmentsPackage.ED247_ASSIGNMENT__UDP_SOCKET_EXTENSION:
				return ((InternalEList<?>)getUdpSocketExtension()).basicRemove(otherEnd, msgs);
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
			case AssignmentsPackage.ED247_ASSIGNMENT__UDP_SOCKET_EXTENSION:
				return getUdpSocketExtension();
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
			case AssignmentsPackage.ED247_ASSIGNMENT__UDP_SOCKET_EXTENSION:
				getUdpSocketExtension().clear();
				getUdpSocketExtension().addAll((Collection<? extends UDPSocketExtension>)newValue);
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
			case AssignmentsPackage.ED247_ASSIGNMENT__UDP_SOCKET_EXTENSION:
				getUdpSocketExtension().clear();
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
			case AssignmentsPackage.ED247_ASSIGNMENT__UDP_SOCKET_EXTENSION:
				return udpSocketExtension != null && !udpSocketExtension.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ED247AssignmentImpl
