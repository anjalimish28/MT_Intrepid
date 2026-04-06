/**
 */
package targets.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import targets.ResistorInfo;
import targets.TargetsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resistor Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.impl.ResistorInfoImpl#getResistanceOhm <em>Resistance Ohm</em>}</li>
 *   <li>{@link targets.impl.ResistorInfoImpl#getResistorPartNumber <em>Resistor Part Number</em>}</li>
 *   <li>{@link targets.impl.ResistorInfoImpl#getMountLocation <em>Mount Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResistorInfoImpl extends SuperAssignmentSpecificationTypeImpl implements ResistorInfo {
	/**
	 * The default value of the '{@link #getResistanceOhm() <em>Resistance Ohm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResistanceOhm()
	 * @generated
	 * @ordered
	 */
	protected static final int RESISTANCE_OHM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getResistanceOhm() <em>Resistance Ohm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResistanceOhm()
	 * @generated
	 * @ordered
	 */
	protected int resistanceOhm = RESISTANCE_OHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getResistorPartNumber() <em>Resistor Part Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResistorPartNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String RESISTOR_PART_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResistorPartNumber() <em>Resistor Part Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResistorPartNumber()
	 * @generated
	 * @ordered
	 */
	protected String resistorPartNumber = RESISTOR_PART_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMountLocation() <em>Mount Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String MOUNT_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMountLocation() <em>Mount Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountLocation()
	 * @generated
	 * @ordered
	 */
	protected String mountLocation = MOUNT_LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResistorInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetsPackage.Literals.RESISTOR_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getResistanceOhm() {
		return resistanceOhm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResistanceOhm(int newResistanceOhm) {
		int oldResistanceOhm = resistanceOhm;
		resistanceOhm = newResistanceOhm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetsPackage.RESISTOR_INFO__RESISTANCE_OHM, oldResistanceOhm, resistanceOhm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResistorPartNumber() {
		return resistorPartNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResistorPartNumber(String newResistorPartNumber) {
		String oldResistorPartNumber = resistorPartNumber;
		resistorPartNumber = newResistorPartNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetsPackage.RESISTOR_INFO__RESISTOR_PART_NUMBER, oldResistorPartNumber, resistorPartNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMountLocation() {
		return mountLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMountLocation(String newMountLocation) {
		String oldMountLocation = mountLocation;
		mountLocation = newMountLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetsPackage.RESISTOR_INFO__MOUNT_LOCATION, oldMountLocation, mountLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TargetsPackage.RESISTOR_INFO__RESISTANCE_OHM:
				return getResistanceOhm();
			case TargetsPackage.RESISTOR_INFO__RESISTOR_PART_NUMBER:
				return getResistorPartNumber();
			case TargetsPackage.RESISTOR_INFO__MOUNT_LOCATION:
				return getMountLocation();
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
			case TargetsPackage.RESISTOR_INFO__RESISTANCE_OHM:
				setResistanceOhm((Integer)newValue);
				return;
			case TargetsPackage.RESISTOR_INFO__RESISTOR_PART_NUMBER:
				setResistorPartNumber((String)newValue);
				return;
			case TargetsPackage.RESISTOR_INFO__MOUNT_LOCATION:
				setMountLocation((String)newValue);
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
			case TargetsPackage.RESISTOR_INFO__RESISTANCE_OHM:
				setResistanceOhm(RESISTANCE_OHM_EDEFAULT);
				return;
			case TargetsPackage.RESISTOR_INFO__RESISTOR_PART_NUMBER:
				setResistorPartNumber(RESISTOR_PART_NUMBER_EDEFAULT);
				return;
			case TargetsPackage.RESISTOR_INFO__MOUNT_LOCATION:
				setMountLocation(MOUNT_LOCATION_EDEFAULT);
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
			case TargetsPackage.RESISTOR_INFO__RESISTANCE_OHM:
				return resistanceOhm != RESISTANCE_OHM_EDEFAULT;
			case TargetsPackage.RESISTOR_INFO__RESISTOR_PART_NUMBER:
				return RESISTOR_PART_NUMBER_EDEFAULT == null ? resistorPartNumber != null : !RESISTOR_PART_NUMBER_EDEFAULT.equals(resistorPartNumber);
			case TargetsPackage.RESISTOR_INFO__MOUNT_LOCATION:
				return MOUNT_LOCATION_EDEFAULT == null ? mountLocation != null : !MOUNT_LOCATION_EDEFAULT.equals(mountLocation);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (resistanceOhm: ");
		result.append(resistanceOhm);
		result.append(", resistorPartNumber: ");
		result.append(resistorPartNumber);
		result.append(", mountLocation: ");
		result.append(mountLocation);
		result.append(')');
		return result.toString();
	}

} //ResistorInfoImpl
