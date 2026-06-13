/**
 */
package ucof.devices.functions.routing.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ucof.devices.functions.impl.SuperFunctionTypeImpl;

import ucof.devices.functions.routing.PayloadRouting;
import ucof.devices.functions.routing.Routing;
import ucof.devices.functions.routing.RoutingPackage;
import ucof.devices.functions.routing.SignalRouting;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Routing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.functions.routing.impl.RoutingImpl#getPayloadRouting <em>Payload Routing</em>}</li>
 *   <li>{@link ucof.devices.functions.routing.impl.RoutingImpl#getSignalRouting <em>Signal Routing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoutingImpl extends SuperFunctionTypeImpl implements Routing {
	/**
	 * The cached value of the '{@link #getPayloadRouting() <em>Payload Routing</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayloadRouting()
	 * @generated
	 * @ordered
	 */
	protected EList<PayloadRouting> payloadRouting;

	/**
	 * The cached value of the '{@link #getSignalRouting() <em>Signal Routing</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalRouting()
	 * @generated
	 * @ordered
	 */
	protected EList<SignalRouting> signalRouting;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoutingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoutingPackage.Literals.ROUTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PayloadRouting> getPayloadRouting() {
		if (payloadRouting == null) {
			payloadRouting = new EObjectContainmentEList<PayloadRouting>(PayloadRouting.class, this, RoutingPackage.ROUTING__PAYLOAD_ROUTING);
		}
		return payloadRouting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SignalRouting> getSignalRouting() {
		if (signalRouting == null) {
			signalRouting = new EObjectContainmentEList<SignalRouting>(SignalRouting.class, this, RoutingPackage.ROUTING__SIGNAL_ROUTING);
		}
		return signalRouting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RoutingPackage.ROUTING__PAYLOAD_ROUTING:
				return ((InternalEList<?>)getPayloadRouting()).basicRemove(otherEnd, msgs);
			case RoutingPackage.ROUTING__SIGNAL_ROUTING:
				return ((InternalEList<?>)getSignalRouting()).basicRemove(otherEnd, msgs);
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
			case RoutingPackage.ROUTING__PAYLOAD_ROUTING:
				return getPayloadRouting();
			case RoutingPackage.ROUTING__SIGNAL_ROUTING:
				return getSignalRouting();
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
			case RoutingPackage.ROUTING__PAYLOAD_ROUTING:
				getPayloadRouting().clear();
				getPayloadRouting().addAll((Collection<? extends PayloadRouting>)newValue);
				return;
			case RoutingPackage.ROUTING__SIGNAL_ROUTING:
				getSignalRouting().clear();
				getSignalRouting().addAll((Collection<? extends SignalRouting>)newValue);
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
			case RoutingPackage.ROUTING__PAYLOAD_ROUTING:
				getPayloadRouting().clear();
				return;
			case RoutingPackage.ROUTING__SIGNAL_ROUTING:
				getSignalRouting().clear();
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
			case RoutingPackage.ROUTING__PAYLOAD_ROUTING:
				return payloadRouting != null && !payloadRouting.isEmpty();
			case RoutingPackage.ROUTING__SIGNAL_ROUTING:
				return signalRouting != null && !signalRouting.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RoutingImpl
