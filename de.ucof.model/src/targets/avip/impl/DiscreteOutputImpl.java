/**
 */
package targets.avip.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import targets.avip.AvipPackage;
import targets.avip.DiscreteOutput;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discrete Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.avip.impl.DiscreteOutputImpl#getClose_volt_margin <em>Close volt margin</em>}</li>
 *   <li>{@link targets.avip.impl.DiscreteOutputImpl#getInternal_pull_up_voltage <em>Internal pull up voltage</em>}</li>
 *   <li>{@link targets.avip.impl.DiscreteOutputImpl#getMax_v_case_gnd_conn <em>Max vcase gnd conn</em>}</li>
 *   <li>{@link targets.avip.impl.DiscreteOutputImpl#getNormal_load_resistance <em>Normal load resistance</em>}</li>
 *   <li>{@link targets.avip.impl.DiscreteOutputImpl#getNormal_load_voltage <em>Normal load voltage</em>}</li>
 *   <li>{@link targets.avip.impl.DiscreteOutputImpl#getOver_current_fault_maturation_duration <em>Over current fault maturation duration</em>}</li>
 *   <li>{@link targets.avip.impl.DiscreteOutputImpl#getOverload_current_threshold <em>Overload current threshold</em>}</li>
 *   <li>{@link targets.avip.impl.DiscreteOutputImpl#getShort_circuit_current_threshold <em>Short circuit current threshold</em>}</li>
 *   <li>{@link targets.avip.impl.DiscreteOutputImpl#getSoft_over_current_fault_maturation_duration <em>Soft over current fault maturation duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiscreteOutputImpl extends SuperWiredPortTypeImpl implements DiscreteOutput {
	/**
	 * The default value of the '{@link #getClose_volt_margin() <em>Close volt margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClose_volt_margin()
	 * @generated
	 * @ordered
	 */
	protected static final float CLOSE_VOLT_MARGIN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getClose_volt_margin() <em>Close volt margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClose_volt_margin()
	 * @generated
	 * @ordered
	 */
	protected float close_volt_margin = CLOSE_VOLT_MARGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getInternal_pull_up_voltage() <em>Internal pull up voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternal_pull_up_voltage()
	 * @generated
	 * @ordered
	 */
	protected static final float INTERNAL_PULL_UP_VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getInternal_pull_up_voltage() <em>Internal pull up voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternal_pull_up_voltage()
	 * @generated
	 * @ordered
	 */
	protected float internal_pull_up_voltage = INTERNAL_PULL_UP_VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax_v_case_gnd_conn() <em>Max vcase gnd conn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_v_case_gnd_conn()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_VCASE_GND_CONN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMax_v_case_gnd_conn() <em>Max vcase gnd conn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_v_case_gnd_conn()
	 * @generated
	 * @ordered
	 */
	protected float max_v_case_gnd_conn = MAX_VCASE_GND_CONN_EDEFAULT;

	/**
	 * The default value of the '{@link #getNormal_load_resistance() <em>Normal load resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormal_load_resistance()
	 * @generated
	 * @ordered
	 */
	protected static final float NORMAL_LOAD_RESISTANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNormal_load_resistance() <em>Normal load resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormal_load_resistance()
	 * @generated
	 * @ordered
	 */
	protected float normal_load_resistance = NORMAL_LOAD_RESISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNormal_load_voltage() <em>Normal load voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormal_load_voltage()
	 * @generated
	 * @ordered
	 */
	protected static final float NORMAL_LOAD_VOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNormal_load_voltage() <em>Normal load voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormal_load_voltage()
	 * @generated
	 * @ordered
	 */
	protected float normal_load_voltage = NORMAL_LOAD_VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOver_current_fault_maturation_duration() <em>Over current fault maturation duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOver_current_fault_maturation_duration()
	 * @generated
	 * @ordered
	 */
	protected static final int OVER_CURRENT_FAULT_MATURATION_DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOver_current_fault_maturation_duration() <em>Over current fault maturation duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOver_current_fault_maturation_duration()
	 * @generated
	 * @ordered
	 */
	protected int over_current_fault_maturation_duration = OVER_CURRENT_FAULT_MATURATION_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOverload_current_threshold() <em>Overload current threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverload_current_threshold()
	 * @generated
	 * @ordered
	 */
	protected static final float OVERLOAD_CURRENT_THRESHOLD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getOverload_current_threshold() <em>Overload current threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverload_current_threshold()
	 * @generated
	 * @ordered
	 */
	protected float overload_current_threshold = OVERLOAD_CURRENT_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getShort_circuit_current_threshold() <em>Short circuit current threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShort_circuit_current_threshold()
	 * @generated
	 * @ordered
	 */
	protected static final float SHORT_CIRCUIT_CURRENT_THRESHOLD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getShort_circuit_current_threshold() <em>Short circuit current threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShort_circuit_current_threshold()
	 * @generated
	 * @ordered
	 */
	protected float short_circuit_current_threshold = SHORT_CIRCUIT_CURRENT_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getSoft_over_current_fault_maturation_duration() <em>Soft over current fault maturation duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoft_over_current_fault_maturation_duration()
	 * @generated
	 * @ordered
	 */
	protected static final int SOFT_OVER_CURRENT_FAULT_MATURATION_DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSoft_over_current_fault_maturation_duration() <em>Soft over current fault maturation duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoft_over_current_fault_maturation_duration()
	 * @generated
	 * @ordered
	 */
	protected int soft_over_current_fault_maturation_duration = SOFT_OVER_CURRENT_FAULT_MATURATION_DURATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscreteOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AvipPackage.Literals.DISCRETE_OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getClose_volt_margin() {
		return close_volt_margin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClose_volt_margin(float newClose_volt_margin) {
		float oldClose_volt_margin = close_volt_margin;
		close_volt_margin = newClose_volt_margin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.DISCRETE_OUTPUT__CLOSE_VOLT_MARGIN, oldClose_volt_margin, close_volt_margin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getInternal_pull_up_voltage() {
		return internal_pull_up_voltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternal_pull_up_voltage(float newInternal_pull_up_voltage) {
		float oldInternal_pull_up_voltage = internal_pull_up_voltage;
		internal_pull_up_voltage = newInternal_pull_up_voltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.DISCRETE_OUTPUT__INTERNAL_PULL_UP_VOLTAGE, oldInternal_pull_up_voltage, internal_pull_up_voltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMax_v_case_gnd_conn() {
		return max_v_case_gnd_conn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax_v_case_gnd_conn(float newMax_v_case_gnd_conn) {
		float oldMax_v_case_gnd_conn = max_v_case_gnd_conn;
		max_v_case_gnd_conn = newMax_v_case_gnd_conn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.DISCRETE_OUTPUT__MAX_VCASE_GND_CONN, oldMax_v_case_gnd_conn, max_v_case_gnd_conn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNormal_load_resistance() {
		return normal_load_resistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormal_load_resistance(float newNormal_load_resistance) {
		float oldNormal_load_resistance = normal_load_resistance;
		normal_load_resistance = newNormal_load_resistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.DISCRETE_OUTPUT__NORMAL_LOAD_RESISTANCE, oldNormal_load_resistance, normal_load_resistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNormal_load_voltage() {
		return normal_load_voltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormal_load_voltage(float newNormal_load_voltage) {
		float oldNormal_load_voltage = normal_load_voltage;
		normal_load_voltage = newNormal_load_voltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.DISCRETE_OUTPUT__NORMAL_LOAD_VOLTAGE, oldNormal_load_voltage, normal_load_voltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOver_current_fault_maturation_duration() {
		return over_current_fault_maturation_duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOver_current_fault_maturation_duration(int newOver_current_fault_maturation_duration) {
		int oldOver_current_fault_maturation_duration = over_current_fault_maturation_duration;
		over_current_fault_maturation_duration = newOver_current_fault_maturation_duration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.DISCRETE_OUTPUT__OVER_CURRENT_FAULT_MATURATION_DURATION, oldOver_current_fault_maturation_duration, over_current_fault_maturation_duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getOverload_current_threshold() {
		return overload_current_threshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverload_current_threshold(float newOverload_current_threshold) {
		float oldOverload_current_threshold = overload_current_threshold;
		overload_current_threshold = newOverload_current_threshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.DISCRETE_OUTPUT__OVERLOAD_CURRENT_THRESHOLD, oldOverload_current_threshold, overload_current_threshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getShort_circuit_current_threshold() {
		return short_circuit_current_threshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShort_circuit_current_threshold(float newShort_circuit_current_threshold) {
		float oldShort_circuit_current_threshold = short_circuit_current_threshold;
		short_circuit_current_threshold = newShort_circuit_current_threshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.DISCRETE_OUTPUT__SHORT_CIRCUIT_CURRENT_THRESHOLD, oldShort_circuit_current_threshold, short_circuit_current_threshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSoft_over_current_fault_maturation_duration() {
		return soft_over_current_fault_maturation_duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoft_over_current_fault_maturation_duration(int newSoft_over_current_fault_maturation_duration) {
		int oldSoft_over_current_fault_maturation_duration = soft_over_current_fault_maturation_duration;
		soft_over_current_fault_maturation_duration = newSoft_over_current_fault_maturation_duration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.DISCRETE_OUTPUT__SOFT_OVER_CURRENT_FAULT_MATURATION_DURATION, oldSoft_over_current_fault_maturation_duration, soft_over_current_fault_maturation_duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AvipPackage.DISCRETE_OUTPUT__CLOSE_VOLT_MARGIN:
				return getClose_volt_margin();
			case AvipPackage.DISCRETE_OUTPUT__INTERNAL_PULL_UP_VOLTAGE:
				return getInternal_pull_up_voltage();
			case AvipPackage.DISCRETE_OUTPUT__MAX_VCASE_GND_CONN:
				return getMax_v_case_gnd_conn();
			case AvipPackage.DISCRETE_OUTPUT__NORMAL_LOAD_RESISTANCE:
				return getNormal_load_resistance();
			case AvipPackage.DISCRETE_OUTPUT__NORMAL_LOAD_VOLTAGE:
				return getNormal_load_voltage();
			case AvipPackage.DISCRETE_OUTPUT__OVER_CURRENT_FAULT_MATURATION_DURATION:
				return getOver_current_fault_maturation_duration();
			case AvipPackage.DISCRETE_OUTPUT__OVERLOAD_CURRENT_THRESHOLD:
				return getOverload_current_threshold();
			case AvipPackage.DISCRETE_OUTPUT__SHORT_CIRCUIT_CURRENT_THRESHOLD:
				return getShort_circuit_current_threshold();
			case AvipPackage.DISCRETE_OUTPUT__SOFT_OVER_CURRENT_FAULT_MATURATION_DURATION:
				return getSoft_over_current_fault_maturation_duration();
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
			case AvipPackage.DISCRETE_OUTPUT__CLOSE_VOLT_MARGIN:
				setClose_volt_margin((Float)newValue);
				return;
			case AvipPackage.DISCRETE_OUTPUT__INTERNAL_PULL_UP_VOLTAGE:
				setInternal_pull_up_voltage((Float)newValue);
				return;
			case AvipPackage.DISCRETE_OUTPUT__MAX_VCASE_GND_CONN:
				setMax_v_case_gnd_conn((Float)newValue);
				return;
			case AvipPackage.DISCRETE_OUTPUT__NORMAL_LOAD_RESISTANCE:
				setNormal_load_resistance((Float)newValue);
				return;
			case AvipPackage.DISCRETE_OUTPUT__NORMAL_LOAD_VOLTAGE:
				setNormal_load_voltage((Float)newValue);
				return;
			case AvipPackage.DISCRETE_OUTPUT__OVER_CURRENT_FAULT_MATURATION_DURATION:
				setOver_current_fault_maturation_duration((Integer)newValue);
				return;
			case AvipPackage.DISCRETE_OUTPUT__OVERLOAD_CURRENT_THRESHOLD:
				setOverload_current_threshold((Float)newValue);
				return;
			case AvipPackage.DISCRETE_OUTPUT__SHORT_CIRCUIT_CURRENT_THRESHOLD:
				setShort_circuit_current_threshold((Float)newValue);
				return;
			case AvipPackage.DISCRETE_OUTPUT__SOFT_OVER_CURRENT_FAULT_MATURATION_DURATION:
				setSoft_over_current_fault_maturation_duration((Integer)newValue);
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
			case AvipPackage.DISCRETE_OUTPUT__CLOSE_VOLT_MARGIN:
				setClose_volt_margin(CLOSE_VOLT_MARGIN_EDEFAULT);
				return;
			case AvipPackage.DISCRETE_OUTPUT__INTERNAL_PULL_UP_VOLTAGE:
				setInternal_pull_up_voltage(INTERNAL_PULL_UP_VOLTAGE_EDEFAULT);
				return;
			case AvipPackage.DISCRETE_OUTPUT__MAX_VCASE_GND_CONN:
				setMax_v_case_gnd_conn(MAX_VCASE_GND_CONN_EDEFAULT);
				return;
			case AvipPackage.DISCRETE_OUTPUT__NORMAL_LOAD_RESISTANCE:
				setNormal_load_resistance(NORMAL_LOAD_RESISTANCE_EDEFAULT);
				return;
			case AvipPackage.DISCRETE_OUTPUT__NORMAL_LOAD_VOLTAGE:
				setNormal_load_voltage(NORMAL_LOAD_VOLTAGE_EDEFAULT);
				return;
			case AvipPackage.DISCRETE_OUTPUT__OVER_CURRENT_FAULT_MATURATION_DURATION:
				setOver_current_fault_maturation_duration(OVER_CURRENT_FAULT_MATURATION_DURATION_EDEFAULT);
				return;
			case AvipPackage.DISCRETE_OUTPUT__OVERLOAD_CURRENT_THRESHOLD:
				setOverload_current_threshold(OVERLOAD_CURRENT_THRESHOLD_EDEFAULT);
				return;
			case AvipPackage.DISCRETE_OUTPUT__SHORT_CIRCUIT_CURRENT_THRESHOLD:
				setShort_circuit_current_threshold(SHORT_CIRCUIT_CURRENT_THRESHOLD_EDEFAULT);
				return;
			case AvipPackage.DISCRETE_OUTPUT__SOFT_OVER_CURRENT_FAULT_MATURATION_DURATION:
				setSoft_over_current_fault_maturation_duration(SOFT_OVER_CURRENT_FAULT_MATURATION_DURATION_EDEFAULT);
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
			case AvipPackage.DISCRETE_OUTPUT__CLOSE_VOLT_MARGIN:
				return close_volt_margin != CLOSE_VOLT_MARGIN_EDEFAULT;
			case AvipPackage.DISCRETE_OUTPUT__INTERNAL_PULL_UP_VOLTAGE:
				return internal_pull_up_voltage != INTERNAL_PULL_UP_VOLTAGE_EDEFAULT;
			case AvipPackage.DISCRETE_OUTPUT__MAX_VCASE_GND_CONN:
				return max_v_case_gnd_conn != MAX_VCASE_GND_CONN_EDEFAULT;
			case AvipPackage.DISCRETE_OUTPUT__NORMAL_LOAD_RESISTANCE:
				return normal_load_resistance != NORMAL_LOAD_RESISTANCE_EDEFAULT;
			case AvipPackage.DISCRETE_OUTPUT__NORMAL_LOAD_VOLTAGE:
				return normal_load_voltage != NORMAL_LOAD_VOLTAGE_EDEFAULT;
			case AvipPackage.DISCRETE_OUTPUT__OVER_CURRENT_FAULT_MATURATION_DURATION:
				return over_current_fault_maturation_duration != OVER_CURRENT_FAULT_MATURATION_DURATION_EDEFAULT;
			case AvipPackage.DISCRETE_OUTPUT__OVERLOAD_CURRENT_THRESHOLD:
				return overload_current_threshold != OVERLOAD_CURRENT_THRESHOLD_EDEFAULT;
			case AvipPackage.DISCRETE_OUTPUT__SHORT_CIRCUIT_CURRENT_THRESHOLD:
				return short_circuit_current_threshold != SHORT_CIRCUIT_CURRENT_THRESHOLD_EDEFAULT;
			case AvipPackage.DISCRETE_OUTPUT__SOFT_OVER_CURRENT_FAULT_MATURATION_DURATION:
				return soft_over_current_fault_maturation_duration != SOFT_OVER_CURRENT_FAULT_MATURATION_DURATION_EDEFAULT;
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
		result.append(" (close_volt_margin: ");
		result.append(close_volt_margin);
		result.append(", internal_pull_up_voltage: ");
		result.append(internal_pull_up_voltage);
		result.append(", max_v_case_gnd_conn: ");
		result.append(max_v_case_gnd_conn);
		result.append(", normal_load_resistance: ");
		result.append(normal_load_resistance);
		result.append(", normal_load_voltage: ");
		result.append(normal_load_voltage);
		result.append(", over_current_fault_maturation_duration: ");
		result.append(over_current_fault_maturation_duration);
		result.append(", overload_current_threshold: ");
		result.append(overload_current_threshold);
		result.append(", short_circuit_current_threshold: ");
		result.append(short_circuit_current_threshold);
		result.append(", soft_over_current_fault_maturation_duration: ");
		result.append(soft_over_current_fault_maturation_duration);
		result.append(')');
		return result.toString();
	}

} //DiscreteOutputImpl
