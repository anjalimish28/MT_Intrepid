/**
 */
package ucof.communication.basedonethernet.arinc664.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.communication.basedonethernet.arinc664.A664Bus;
import ucof.communication.basedonethernet.arinc664.A664VirtualLinkSuper;
import ucof.communication.basedonethernet.arinc664.Arinc664Package;

import ucof.communication.basedonethernet.impl.EthernetPortImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>A664 Bus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.impl.A664BusImpl#getVirtualLink <em>Virtual Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class A664BusImpl extends EthernetPortImpl implements A664Bus {
	/**
	 * The cached value of the '{@link #getVirtualLink() <em>Virtual Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualLink()
	 * @generated
	 * @ordered
	 */
	protected A664VirtualLinkSuper virtualLink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected A664BusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Arinc664Package.Literals.A664_BUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A664VirtualLinkSuper getVirtualLink() {
		return virtualLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVirtualLink(A664VirtualLinkSuper newVirtualLink, NotificationChain msgs) {
		A664VirtualLinkSuper oldVirtualLink = virtualLink;
		virtualLink = newVirtualLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Arinc664Package.A664_BUS__VIRTUAL_LINK, oldVirtualLink, newVirtualLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtualLink(A664VirtualLinkSuper newVirtualLink) {
		if (newVirtualLink != virtualLink) {
			NotificationChain msgs = null;
			if (virtualLink != null)
				msgs = ((InternalEObject)virtualLink).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Arinc664Package.A664_BUS__VIRTUAL_LINK, null, msgs);
			if (newVirtualLink != null)
				msgs = ((InternalEObject)newVirtualLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Arinc664Package.A664_BUS__VIRTUAL_LINK, null, msgs);
			msgs = basicSetVirtualLink(newVirtualLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Arinc664Package.A664_BUS__VIRTUAL_LINK, newVirtualLink, newVirtualLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Arinc664Package.A664_BUS__VIRTUAL_LINK:
				return basicSetVirtualLink(null, msgs);
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
			case Arinc664Package.A664_BUS__VIRTUAL_LINK:
				return getVirtualLink();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Arinc664Package.A664_BUS__VIRTUAL_LINK:
				setVirtualLink((A664VirtualLinkSuper)newValue);
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
			case Arinc664Package.A664_BUS__VIRTUAL_LINK:
				setVirtualLink((A664VirtualLinkSuper)null);
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
			case Arinc664Package.A664_BUS__VIRTUAL_LINK:
				return virtualLink != null;
		}
		return super.eIsSet(featureID);
	}

} //A664BusImpl
