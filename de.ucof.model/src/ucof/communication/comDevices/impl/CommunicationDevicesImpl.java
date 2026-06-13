/**
 */
package ucof.communication.comDevices.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ucof.common.etypes.impl.SuperSetTypeImpl;

import ucof.communication.comDevices.ComDevicesPackage;
import ucof.communication.comDevices.CommunicationDevices;
import ucof.communication.comDevices.SuperCommunicationDeviceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Devices</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.comDevices.impl.CommunicationDevicesImpl#getCommunicationDevice <em>Communication Device</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationDevicesImpl extends SuperSetTypeImpl implements CommunicationDevices {
	/**
	 * The cached value of the '{@link #getCommunicationDevice() <em>Communication Device</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationDevice()
	 * @generated
	 * @ordered
	 */
	protected EList<SuperCommunicationDeviceType> communicationDevice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationDevicesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComDevicesPackage.Literals.COMMUNICATION_DEVICES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SuperCommunicationDeviceType> getCommunicationDevice() {
		if (communicationDevice == null) {
			communicationDevice = new EObjectContainmentEList<SuperCommunicationDeviceType>(SuperCommunicationDeviceType.class, this, ComDevicesPackage.COMMUNICATION_DEVICES__COMMUNICATION_DEVICE);
		}
		return communicationDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComDevicesPackage.COMMUNICATION_DEVICES__COMMUNICATION_DEVICE:
				return ((InternalEList<?>)getCommunicationDevice()).basicRemove(otherEnd, msgs);
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
			case ComDevicesPackage.COMMUNICATION_DEVICES__COMMUNICATION_DEVICE:
				return getCommunicationDevice();
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
			case ComDevicesPackage.COMMUNICATION_DEVICES__COMMUNICATION_DEVICE:
				getCommunicationDevice().clear();
				getCommunicationDevice().addAll((Collection<? extends SuperCommunicationDeviceType>)newValue);
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
			case ComDevicesPackage.COMMUNICATION_DEVICES__COMMUNICATION_DEVICE:
				getCommunicationDevice().clear();
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
			case ComDevicesPackage.COMMUNICATION_DEVICES__COMMUNICATION_DEVICE:
				return communicationDevice != null && !communicationDevice.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CommunicationDevicesImpl
