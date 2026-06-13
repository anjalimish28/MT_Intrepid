/**
 */
package targets.avip.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import targets.avip.AvipPackage;
import targets.avip.DiscreteInput;

import ucof.common.enums.booleanType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discrete Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.avip.impl.DiscreteInputImpl#getHpp <em>Hpp</em>}</li>
 *   <li>{@link targets.avip.impl.DiscreteInputImpl#getHpp_port <em>Hpp port</em>}</li>
 *   <li>{@link targets.avip.impl.DiscreteInputImpl#getMax_polarisation_voltage <em>Max polarisation voltage</em>}</li>
 *   <li>{@link targets.avip.impl.DiscreteInputImpl#getMax_voltage_gnd <em>Max voltage gnd</em>}</li>
 *   <li>{@link targets.avip.impl.DiscreteInputImpl#getMin_voltage_gnd <em>Min voltage gnd</em>}</li>
 *   <li>{@link targets.avip.impl.DiscreteInputImpl#getMax_voltage_opn <em>Max voltage opn</em>}</li>
 *   <li>{@link targets.avip.impl.DiscreteInputImpl#getMin_voltage_opn <em>Min voltage opn</em>}</li>
 *   <li>{@link targets.avip.impl.DiscreteInputImpl#getPolarisation_failure_dematuration_duration <em>Polarisation failure dematuration duration</em>}</li>
 *   <li>{@link targets.avip.impl.DiscreteInputImpl#getPolarisation_failure_maturation_duration <em>Polarisation failure maturation duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiscreteInputImpl extends SuperWiredPortTypeImpl implements DiscreteInput {
	/**
	 * The default value of the '{@link #getHpp() <em>Hpp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHpp()
	 * @generated
	 * @ordered
	 */
	protected static final booleanType HPP_EDEFAULT = booleanType.NOT_SET;

	/**
	 * The cached value of the '{@link #getHpp() <em>Hpp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHpp()
	 * @generated
	 * @ordered
	 */
	protected booleanType hpp = HPP_EDEFAULT;

	/**
	 * The default value of the '{@link #getHpp_port() <em>Hpp port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHpp_port()
	 * @generated
	 * @ordered
	 */
	protected static final float HPP_PORT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHpp_port() <em>Hpp port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHpp_port()
	 * @generated
	 * @ordered
	 */
	protected float hpp_port = HPP_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax_polarisation_voltage() <em>Max polarisation voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_polarisation_voltage()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_POLARISATION_VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMax_polarisation_voltage() <em>Max polarisation voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_polarisation_voltage()
	 * @generated
	 * @ordered
	 */
	protected float max_polarisation_voltage = MAX_POLARISATION_VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax_voltage_gnd() <em>Max voltage gnd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_voltage_gnd()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_VOLTAGE_GND_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMax_voltage_gnd() <em>Max voltage gnd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_voltage_gnd()
	 * @generated
	 * @ordered
	 */
	protected float max_voltage_gnd = MAX_VOLTAGE_GND_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin_voltage_gnd() <em>Min voltage gnd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_voltage_gnd()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_VOLTAGE_GND_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMin_voltage_gnd() <em>Min voltage gnd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_voltage_gnd()
	 * @generated
	 * @ordered
	 */
	protected float min_voltage_gnd = MIN_VOLTAGE_GND_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax_voltage_opn() <em>Max voltage opn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_voltage_opn()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_VOLTAGE_OPN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMax_voltage_opn() <em>Max voltage opn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_voltage_opn()
	 * @generated
	 * @ordered
	 */
	protected float max_voltage_opn = MAX_VOLTAGE_OPN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin_voltage_opn() <em>Min voltage opn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_voltage_opn()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_VOLTAGE_OPN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMin_voltage_opn() <em>Min voltage opn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_voltage_opn()
	 * @generated
	 * @ordered
	 */
	protected float min_voltage_opn = MIN_VOLTAGE_OPN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPolarisation_failure_dematuration_duration() <em>Polarisation failure dematuration duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolarisation_failure_dematuration_duration()
	 * @generated
	 * @ordered
	 */
	protected static final int POLARISATION_FAILURE_DEMATURATION_DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPolarisation_failure_dematuration_duration() <em>Polarisation failure dematuration duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolarisation_failure_dematuration_duration()
	 * @generated
	 * @ordered
	 */
	protected int polarisation_failure_dematuration_duration = POLARISATION_FAILURE_DEMATURATION_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPolarisation_failure_maturation_duration() <em>Polarisation failure maturation duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolarisation_failure_maturation_duration()
	 * @generated
	 * @ordered
	 */
	protected static final int POLARISATION_FAILURE_MATURATION_DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPolarisation_failure_maturation_duration() <em>Polarisation failure maturation duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolarisation_failure_maturation_duration()
	 * @generated
	 * @ordered
	 */
	protected int polarisation_failure_maturation_duration = POLARISATION_FAILURE_MATURATION_DURATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscreteInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AvipPackage.Literals.DISCRETE_INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public booleanType getHpp() {
		return hpp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHpp(booleanType newHpp) {
		booleanType oldHpp = hpp;
		hpp = newHpp == null ? HPP_EDEFAULT : newHpp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.DISCRETE_INPUT__HPP, oldHpp, hpp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHpp_port() {
		return hpp_port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHpp_port(float newHpp_port) {
		float oldHpp_port = hpp_port;
		hpp_port = newHpp_port;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.DISCRETE_INPUT__HPP_PORT, oldHpp_port, hpp_port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMax_polarisation_voltage() {
		return max_polarisation_voltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax_polarisation_voltage(float newMax_polarisation_voltage) {
		float oldMax_polarisation_voltage = max_polarisation_voltage;
		max_polarisation_voltage = newMax_polarisation_voltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.DISCRETE_INPUT__MAX_POLARISATION_VOLTAGE, oldMax_polarisation_voltage, max_polarisation_voltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMax_voltage_gnd() {
		return max_voltage_gnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax_voltage_gnd(float newMax_voltage_gnd) {
		float oldMax_voltage_gnd = max_voltage_gnd;
		max_voltage_gnd = newMax_voltage_gnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.DISCRETE_INPUT__MAX_VOLTAGE_GND, oldMax_voltage_gnd, max_voltage_gnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMin_voltage_gnd() {
		return min_voltage_gnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin_voltage_gnd(float newMin_voltage_gnd) {
		float oldMin_voltage_gnd = min_voltage_gnd;
		min_voltage_gnd = newMin_voltage_gnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.DISCRETE_INPUT__MIN_VOLTAGE_GND, oldMin_voltage_gnd, min_voltage_gnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMax_voltage_opn() {
		return max_voltage_opn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax_voltage_opn(float newMax_voltage_opn) {
		float oldMax_voltage_opn = max_voltage_opn;
		max_voltage_opn = newMax_voltage_opn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.DISCRETE_INPUT__MAX_VOLTAGE_OPN, oldMax_voltage_opn, max_voltage_opn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMin_voltage_opn() {
		return min_voltage_opn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin_voltage_opn(float newMin_voltage_opn) {
		float oldMin_voltage_opn = min_voltage_opn;
		min_voltage_opn = newMin_voltage_opn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.DISCRETE_INPUT__MIN_VOLTAGE_OPN, oldMin_voltage_opn, min_voltage_opn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPolarisation_failure_dematuration_duration() {
		return polarisation_failure_dematuration_duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolarisation_failure_dematuration_duration(int newPolarisation_failure_dematuration_duration) {
		int oldPolarisation_failure_dematuration_duration = polarisation_failure_dematuration_duration;
		polarisation_failure_dematuration_duration = newPolarisation_failure_dematuration_duration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.DISCRETE_INPUT__POLARISATION_FAILURE_DEMATURATION_DURATION, oldPolarisation_failure_dematuration_duration, polarisation_failure_dematuration_duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPolarisation_failure_maturation_duration() {
		return polarisation_failure_maturation_duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolarisation_failure_maturation_duration(int newPolarisation_failure_maturation_duration) {
		int oldPolarisation_failure_maturation_duration = polarisation_failure_maturation_duration;
		polarisation_failure_maturation_duration = newPolarisation_failure_maturation_duration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.DISCRETE_INPUT__POLARISATION_FAILURE_MATURATION_DURATION, oldPolarisation_failure_maturation_duration, polarisation_failure_maturation_duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AvipPackage.DISCRETE_INPUT__HPP:
				return getHpp();
			case AvipPackage.DISCRETE_INPUT__HPP_PORT:
				return getHpp_port();
			case AvipPackage.DISCRETE_INPUT__MAX_POLARISATION_VOLTAGE:
				return getMax_polarisation_voltage();
			case AvipPackage.DISCRETE_INPUT__MAX_VOLTAGE_GND:
				return getMax_voltage_gnd();
			case AvipPackage.DISCRETE_INPUT__MIN_VOLTAGE_GND:
				return getMin_voltage_gnd();
			case AvipPackage.DISCRETE_INPUT__MAX_VOLTAGE_OPN:
				return getMax_voltage_opn();
			case AvipPackage.DISCRETE_INPUT__MIN_VOLTAGE_OPN:
				return getMin_voltage_opn();
			case AvipPackage.DISCRETE_INPUT__POLARISATION_FAILURE_DEMATURATION_DURATION:
				return getPolarisation_failure_dematuration_duration();
			case AvipPackage.DISCRETE_INPUT__POLARISATION_FAILURE_MATURATION_DURATION:
				return getPolarisation_failure_maturation_duration();
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
			case AvipPackage.DISCRETE_INPUT__HPP:
				setHpp((booleanType)newValue);
				return;
			case AvipPackage.DISCRETE_INPUT__HPP_PORT:
				setHpp_port((Float)newValue);
				return;
			case AvipPackage.DISCRETE_INPUT__MAX_POLARISATION_VOLTAGE:
				setMax_polarisation_voltage((Float)newValue);
				return;
			case AvipPackage.DISCRETE_INPUT__MAX_VOLTAGE_GND:
				setMax_voltage_gnd((Float)newValue);
				return;
			case AvipPackage.DISCRETE_INPUT__MIN_VOLTAGE_GND:
				setMin_voltage_gnd((Float)newValue);
				return;
			case AvipPackage.DISCRETE_INPUT__MAX_VOLTAGE_OPN:
				setMax_voltage_opn((Float)newValue);
				return;
			case AvipPackage.DISCRETE_INPUT__MIN_VOLTAGE_OPN:
				setMin_voltage_opn((Float)newValue);
				return;
			case AvipPackage.DISCRETE_INPUT__POLARISATION_FAILURE_DEMATURATION_DURATION:
				setPolarisation_failure_dematuration_duration((Integer)newValue);
				return;
			case AvipPackage.DISCRETE_INPUT__POLARISATION_FAILURE_MATURATION_DURATION:
				setPolarisation_failure_maturation_duration((Integer)newValue);
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
			case AvipPackage.DISCRETE_INPUT__HPP:
				setHpp(HPP_EDEFAULT);
				return;
			case AvipPackage.DISCRETE_INPUT__HPP_PORT:
				setHpp_port(HPP_PORT_EDEFAULT);
				return;
			case AvipPackage.DISCRETE_INPUT__MAX_POLARISATION_VOLTAGE:
				setMax_polarisation_voltage(MAX_POLARISATION_VOLTAGE_EDEFAULT);
				return;
			case AvipPackage.DISCRETE_INPUT__MAX_VOLTAGE_GND:
				setMax_voltage_gnd(MAX_VOLTAGE_GND_EDEFAULT);
				return;
			case AvipPackage.DISCRETE_INPUT__MIN_VOLTAGE_GND:
				setMin_voltage_gnd(MIN_VOLTAGE_GND_EDEFAULT);
				return;
			case AvipPackage.DISCRETE_INPUT__MAX_VOLTAGE_OPN:
				setMax_voltage_opn(MAX_VOLTAGE_OPN_EDEFAULT);
				return;
			case AvipPackage.DISCRETE_INPUT__MIN_VOLTAGE_OPN:
				setMin_voltage_opn(MIN_VOLTAGE_OPN_EDEFAULT);
				return;
			case AvipPackage.DISCRETE_INPUT__POLARISATION_FAILURE_DEMATURATION_DURATION:
				setPolarisation_failure_dematuration_duration(POLARISATION_FAILURE_DEMATURATION_DURATION_EDEFAULT);
				return;
			case AvipPackage.DISCRETE_INPUT__POLARISATION_FAILURE_MATURATION_DURATION:
				setPolarisation_failure_maturation_duration(POLARISATION_FAILURE_MATURATION_DURATION_EDEFAULT);
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
			case AvipPackage.DISCRETE_INPUT__HPP:
				return hpp != HPP_EDEFAULT;
			case AvipPackage.DISCRETE_INPUT__HPP_PORT:
				return hpp_port != HPP_PORT_EDEFAULT;
			case AvipPackage.DISCRETE_INPUT__MAX_POLARISATION_VOLTAGE:
				return max_polarisation_voltage != MAX_POLARISATION_VOLTAGE_EDEFAULT;
			case AvipPackage.DISCRETE_INPUT__MAX_VOLTAGE_GND:
				return max_voltage_gnd != MAX_VOLTAGE_GND_EDEFAULT;
			case AvipPackage.DISCRETE_INPUT__MIN_VOLTAGE_GND:
				return min_voltage_gnd != MIN_VOLTAGE_GND_EDEFAULT;
			case AvipPackage.DISCRETE_INPUT__MAX_VOLTAGE_OPN:
				return max_voltage_opn != MAX_VOLTAGE_OPN_EDEFAULT;
			case AvipPackage.DISCRETE_INPUT__MIN_VOLTAGE_OPN:
				return min_voltage_opn != MIN_VOLTAGE_OPN_EDEFAULT;
			case AvipPackage.DISCRETE_INPUT__POLARISATION_FAILURE_DEMATURATION_DURATION:
				return polarisation_failure_dematuration_duration != POLARISATION_FAILURE_DEMATURATION_DURATION_EDEFAULT;
			case AvipPackage.DISCRETE_INPUT__POLARISATION_FAILURE_MATURATION_DURATION:
				return polarisation_failure_maturation_duration != POLARISATION_FAILURE_MATURATION_DURATION_EDEFAULT;
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
		result.append(" (hpp: ");
		result.append(hpp);
		result.append(", hpp_port: ");
		result.append(hpp_port);
		result.append(", max_polarisation_voltage: ");
		result.append(max_polarisation_voltage);
		result.append(", max_voltage_gnd: ");
		result.append(max_voltage_gnd);
		result.append(", min_voltage_gnd: ");
		result.append(min_voltage_gnd);
		result.append(", max_voltage_opn: ");
		result.append(max_voltage_opn);
		result.append(", min_voltage_opn: ");
		result.append(min_voltage_opn);
		result.append(", polarisation_failure_dematuration_duration: ");
		result.append(polarisation_failure_dematuration_duration);
		result.append(", polarisation_failure_maturation_duration: ");
		result.append(polarisation_failure_maturation_duration);
		result.append(')');
		return result.toString();
	}

} //DiscreteInputImpl
