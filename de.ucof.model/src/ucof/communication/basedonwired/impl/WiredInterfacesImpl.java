/**
 */
package ucof.communication.basedonwired.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ucof.communication.basedonwired.BasedonwiredPackage;
import ucof.communication.basedonwired.WiredInterfaces;
import ucof.communication.basedonwired.WiredSuper;

import ucof.communication.impl.SuperCommunicationInterfaceTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wired Interfaces</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.basedonwired.impl.WiredInterfacesImpl#getWiredInterface <em>Wired Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WiredInterfacesImpl extends SuperCommunicationInterfaceTypeImpl implements WiredInterfaces {
	/**
	 * The cached value of the '{@link #getWiredInterface() <em>Wired Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWiredInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<WiredSuper> wiredInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WiredInterfacesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasedonwiredPackage.Literals.WIRED_INTERFACES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WiredSuper> getWiredInterface() {
		if (wiredInterface == null) {
			wiredInterface = new EObjectContainmentEList<WiredSuper>(WiredSuper.class, this, BasedonwiredPackage.WIRED_INTERFACES__WIRED_INTERFACE);
		}
		return wiredInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasedonwiredPackage.WIRED_INTERFACES__WIRED_INTERFACE:
				return ((InternalEList<?>)getWiredInterface()).basicRemove(otherEnd, msgs);
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
			case BasedonwiredPackage.WIRED_INTERFACES__WIRED_INTERFACE:
				return getWiredInterface();
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
			case BasedonwiredPackage.WIRED_INTERFACES__WIRED_INTERFACE:
				getWiredInterface().clear();
				getWiredInterface().addAll((Collection<? extends WiredSuper>)newValue);
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
			case BasedonwiredPackage.WIRED_INTERFACES__WIRED_INTERFACE:
				getWiredInterface().clear();
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
			case BasedonwiredPackage.WIRED_INTERFACES__WIRED_INTERFACE:
				return wiredInterface != null && !wiredInterface.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WiredInterfacesImpl
