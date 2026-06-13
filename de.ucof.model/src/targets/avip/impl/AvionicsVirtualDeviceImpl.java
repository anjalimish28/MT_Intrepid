/**
 */
package targets.avip.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import targets.avip.AVDPorts;
import targets.avip.AVDSchedulerExtension;
import targets.avip.AvionicsVirtualDevice;
import targets.avip.AvipPackage;
import targets.impl.SuperTargetTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Avionics Virtual Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.avip.impl.AvionicsVirtualDeviceImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link targets.avip.impl.AvionicsVirtualDeviceImpl#getScheduleExtension <em>Schedule Extension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AvionicsVirtualDeviceImpl extends SuperTargetTypeImpl implements AvionicsVirtualDevice {
	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected AVDPorts ports;
	/**
	 * The cached value of the '{@link #getScheduleExtension() <em>Schedule Extension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleExtension()
	 * @generated
	 * @ordered
	 */
	protected AVDSchedulerExtension scheduleExtension;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvionicsVirtualDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AvipPackage.Literals.AVIONICS_VIRTUAL_DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AVDPorts getPorts() {
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPorts(AVDPorts newPorts, NotificationChain msgs) {
		AVDPorts oldPorts = ports;
		ports = newPorts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AvipPackage.AVIONICS_VIRTUAL_DEVICE__PORTS, oldPorts, newPorts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPorts(AVDPorts newPorts) {
		if (newPorts != ports) {
			NotificationChain msgs = null;
			if (ports != null)
				msgs = ((InternalEObject)ports).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AvipPackage.AVIONICS_VIRTUAL_DEVICE__PORTS, null, msgs);
			if (newPorts != null)
				msgs = ((InternalEObject)newPorts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AvipPackage.AVIONICS_VIRTUAL_DEVICE__PORTS, null, msgs);
			msgs = basicSetPorts(newPorts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.AVIONICS_VIRTUAL_DEVICE__PORTS, newPorts, newPorts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AVDSchedulerExtension getScheduleExtension() {
		return scheduleExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduleExtension(AVDSchedulerExtension newScheduleExtension, NotificationChain msgs) {
		AVDSchedulerExtension oldScheduleExtension = scheduleExtension;
		scheduleExtension = newScheduleExtension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AvipPackage.AVIONICS_VIRTUAL_DEVICE__SCHEDULE_EXTENSION, oldScheduleExtension, newScheduleExtension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduleExtension(AVDSchedulerExtension newScheduleExtension) {
		if (newScheduleExtension != scheduleExtension) {
			NotificationChain msgs = null;
			if (scheduleExtension != null)
				msgs = ((InternalEObject)scheduleExtension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AvipPackage.AVIONICS_VIRTUAL_DEVICE__SCHEDULE_EXTENSION, null, msgs);
			if (newScheduleExtension != null)
				msgs = ((InternalEObject)newScheduleExtension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AvipPackage.AVIONICS_VIRTUAL_DEVICE__SCHEDULE_EXTENSION, null, msgs);
			msgs = basicSetScheduleExtension(newScheduleExtension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.AVIONICS_VIRTUAL_DEVICE__SCHEDULE_EXTENSION, newScheduleExtension, newScheduleExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AvipPackage.AVIONICS_VIRTUAL_DEVICE__PORTS:
				return basicSetPorts(null, msgs);
			case AvipPackage.AVIONICS_VIRTUAL_DEVICE__SCHEDULE_EXTENSION:
				return basicSetScheduleExtension(null, msgs);
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
			case AvipPackage.AVIONICS_VIRTUAL_DEVICE__PORTS:
				return getPorts();
			case AvipPackage.AVIONICS_VIRTUAL_DEVICE__SCHEDULE_EXTENSION:
				return getScheduleExtension();
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
			case AvipPackage.AVIONICS_VIRTUAL_DEVICE__PORTS:
				setPorts((AVDPorts)newValue);
				return;
			case AvipPackage.AVIONICS_VIRTUAL_DEVICE__SCHEDULE_EXTENSION:
				setScheduleExtension((AVDSchedulerExtension)newValue);
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
			case AvipPackage.AVIONICS_VIRTUAL_DEVICE__PORTS:
				setPorts((AVDPorts)null);
				return;
			case AvipPackage.AVIONICS_VIRTUAL_DEVICE__SCHEDULE_EXTENSION:
				setScheduleExtension((AVDSchedulerExtension)null);
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
			case AvipPackage.AVIONICS_VIRTUAL_DEVICE__PORTS:
				return ports != null;
			case AvipPackage.AVIONICS_VIRTUAL_DEVICE__SCHEDULE_EXTENSION:
				return scheduleExtension != null;
		}
		return super.eIsSet(featureID);
	}

} //AvionicsVirtualDeviceImpl
