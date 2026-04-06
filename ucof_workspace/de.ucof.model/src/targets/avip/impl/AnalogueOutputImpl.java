/**
 */
package targets.avip.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import targets.avip.AnalogueOutput;
import targets.avip.AvipPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analogue Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.avip.impl.AnalogueOutputImpl#getAo_voltage_cmd_ac_max <em>Ao voltage cmd ac max</em>}</li>
 *   <li>{@link targets.avip.impl.AnalogueOutputImpl#getAo_voltage_cmd_ac_min <em>Ao voltage cmd ac min</em>}</li>
 *   <li>{@link targets.avip.impl.AnalogueOutputImpl#getAo_voltage_cmd_dc_max <em>Ao voltage cmd dc max</em>}</li>
 *   <li>{@link targets.avip.impl.AnalogueOutputImpl#getAo_voltage_cmd_dc_min <em>Ao voltage cmd dc min</em>}</li>
 *   <li>{@link targets.avip.impl.AnalogueOutputImpl#getAo_voltage_cmd_max <em>Ao voltage cmd max</em>}</li>
 *   <li>{@link targets.avip.impl.AnalogueOutputImpl#getAo_voltage_cmd_min <em>Ao voltage cmd min</em>}</li>
 *   <li>{@link targets.avip.impl.AnalogueOutputImpl#getOver_current_threshold <em>Over current threshold</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalogueOutputImpl extends SuperAnaloguePortTypeImpl implements AnalogueOutput {
	/**
	 * The default value of the '{@link #getAo_voltage_cmd_ac_max() <em>Ao voltage cmd ac max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAo_voltage_cmd_ac_max()
	 * @generated
	 * @ordered
	 */
	protected static final float AO_VOLTAGE_CMD_AC_MAX_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAo_voltage_cmd_ac_max() <em>Ao voltage cmd ac max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAo_voltage_cmd_ac_max()
	 * @generated
	 * @ordered
	 */
	protected float ao_voltage_cmd_ac_max = AO_VOLTAGE_CMD_AC_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getAo_voltage_cmd_ac_min() <em>Ao voltage cmd ac min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAo_voltage_cmd_ac_min()
	 * @generated
	 * @ordered
	 */
	protected static final float AO_VOLTAGE_CMD_AC_MIN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAo_voltage_cmd_ac_min() <em>Ao voltage cmd ac min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAo_voltage_cmd_ac_min()
	 * @generated
	 * @ordered
	 */
	protected float ao_voltage_cmd_ac_min = AO_VOLTAGE_CMD_AC_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getAo_voltage_cmd_dc_max() <em>Ao voltage cmd dc max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAo_voltage_cmd_dc_max()
	 * @generated
	 * @ordered
	 */
	protected static final float AO_VOLTAGE_CMD_DC_MAX_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAo_voltage_cmd_dc_max() <em>Ao voltage cmd dc max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAo_voltage_cmd_dc_max()
	 * @generated
	 * @ordered
	 */
	protected float ao_voltage_cmd_dc_max = AO_VOLTAGE_CMD_DC_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getAo_voltage_cmd_dc_min() <em>Ao voltage cmd dc min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAo_voltage_cmd_dc_min()
	 * @generated
	 * @ordered
	 */
	protected static final float AO_VOLTAGE_CMD_DC_MIN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAo_voltage_cmd_dc_min() <em>Ao voltage cmd dc min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAo_voltage_cmd_dc_min()
	 * @generated
	 * @ordered
	 */
	protected float ao_voltage_cmd_dc_min = AO_VOLTAGE_CMD_DC_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getAo_voltage_cmd_max() <em>Ao voltage cmd max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAo_voltage_cmd_max()
	 * @generated
	 * @ordered
	 */
	protected static final float AO_VOLTAGE_CMD_MAX_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAo_voltage_cmd_max() <em>Ao voltage cmd max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAo_voltage_cmd_max()
	 * @generated
	 * @ordered
	 */
	protected float ao_voltage_cmd_max = AO_VOLTAGE_CMD_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getAo_voltage_cmd_min() <em>Ao voltage cmd min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAo_voltage_cmd_min()
	 * @generated
	 * @ordered
	 */
	protected static final float AO_VOLTAGE_CMD_MIN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAo_voltage_cmd_min() <em>Ao voltage cmd min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAo_voltage_cmd_min()
	 * @generated
	 * @ordered
	 */
	protected float ao_voltage_cmd_min = AO_VOLTAGE_CMD_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getOver_current_threshold() <em>Over current threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOver_current_threshold()
	 * @generated
	 * @ordered
	 */
	protected static final float OVER_CURRENT_THRESHOLD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getOver_current_threshold() <em>Over current threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOver_current_threshold()
	 * @generated
	 * @ordered
	 */
	protected float over_current_threshold = OVER_CURRENT_THRESHOLD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalogueOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AvipPackage.Literals.ANALOGUE_OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAo_voltage_cmd_ac_max() {
		return ao_voltage_cmd_ac_max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAo_voltage_cmd_ac_max(float newAo_voltage_cmd_ac_max) {
		float oldAo_voltage_cmd_ac_max = ao_voltage_cmd_ac_max;
		ao_voltage_cmd_ac_max = newAo_voltage_cmd_ac_max;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_AC_MAX, oldAo_voltage_cmd_ac_max, ao_voltage_cmd_ac_max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAo_voltage_cmd_ac_min() {
		return ao_voltage_cmd_ac_min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAo_voltage_cmd_ac_min(float newAo_voltage_cmd_ac_min) {
		float oldAo_voltage_cmd_ac_min = ao_voltage_cmd_ac_min;
		ao_voltage_cmd_ac_min = newAo_voltage_cmd_ac_min;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_AC_MIN, oldAo_voltage_cmd_ac_min, ao_voltage_cmd_ac_min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAo_voltage_cmd_dc_max() {
		return ao_voltage_cmd_dc_max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAo_voltage_cmd_dc_max(float newAo_voltage_cmd_dc_max) {
		float oldAo_voltage_cmd_dc_max = ao_voltage_cmd_dc_max;
		ao_voltage_cmd_dc_max = newAo_voltage_cmd_dc_max;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_DC_MAX, oldAo_voltage_cmd_dc_max, ao_voltage_cmd_dc_max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAo_voltage_cmd_dc_min() {
		return ao_voltage_cmd_dc_min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAo_voltage_cmd_dc_min(float newAo_voltage_cmd_dc_min) {
		float oldAo_voltage_cmd_dc_min = ao_voltage_cmd_dc_min;
		ao_voltage_cmd_dc_min = newAo_voltage_cmd_dc_min;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_DC_MIN, oldAo_voltage_cmd_dc_min, ao_voltage_cmd_dc_min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAo_voltage_cmd_max() {
		return ao_voltage_cmd_max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAo_voltage_cmd_max(float newAo_voltage_cmd_max) {
		float oldAo_voltage_cmd_max = ao_voltage_cmd_max;
		ao_voltage_cmd_max = newAo_voltage_cmd_max;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_MAX, oldAo_voltage_cmd_max, ao_voltage_cmd_max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAo_voltage_cmd_min() {
		return ao_voltage_cmd_min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAo_voltage_cmd_min(float newAo_voltage_cmd_min) {
		float oldAo_voltage_cmd_min = ao_voltage_cmd_min;
		ao_voltage_cmd_min = newAo_voltage_cmd_min;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_MIN, oldAo_voltage_cmd_min, ao_voltage_cmd_min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getOver_current_threshold() {
		return over_current_threshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOver_current_threshold(float newOver_current_threshold) {
		float oldOver_current_threshold = over_current_threshold;
		over_current_threshold = newOver_current_threshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.ANALOGUE_OUTPUT__OVER_CURRENT_THRESHOLD, oldOver_current_threshold, over_current_threshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AvipPackage.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_AC_MAX:
				return getAo_voltage_cmd_ac_max();
			case AvipPackage.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_AC_MIN:
				return getAo_voltage_cmd_ac_min();
			case AvipPackage.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_DC_MAX:
				return getAo_voltage_cmd_dc_max();
			case AvipPackage.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_DC_MIN:
				return getAo_voltage_cmd_dc_min();
			case AvipPackage.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_MAX:
				return getAo_voltage_cmd_max();
			case AvipPackage.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_MIN:
				return getAo_voltage_cmd_min();
			case AvipPackage.ANALOGUE_OUTPUT__OVER_CURRENT_THRESHOLD:
				return getOver_current_threshold();
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
			case AvipPackage.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_AC_MAX:
				setAo_voltage_cmd_ac_max((Float)newValue);
				return;
			case AvipPackage.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_AC_MIN:
				setAo_voltage_cmd_ac_min((Float)newValue);
				return;
			case AvipPackage.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_DC_MAX:
				setAo_voltage_cmd_dc_max((Float)newValue);
				return;
			case AvipPackage.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_DC_MIN:
				setAo_voltage_cmd_dc_min((Float)newValue);
				return;
			case AvipPackage.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_MAX:
				setAo_voltage_cmd_max((Float)newValue);
				return;
			case AvipPackage.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_MIN:
				setAo_voltage_cmd_min((Float)newValue);
				return;
			case AvipPackage.ANALOGUE_OUTPUT__OVER_CURRENT_THRESHOLD:
				setOver_current_threshold((Float)newValue);
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
			case AvipPackage.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_AC_MAX:
				setAo_voltage_cmd_ac_max(AO_VOLTAGE_CMD_AC_MAX_EDEFAULT);
				return;
			case AvipPackage.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_AC_MIN:
				setAo_voltage_cmd_ac_min(AO_VOLTAGE_CMD_AC_MIN_EDEFAULT);
				return;
			case AvipPackage.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_DC_MAX:
				setAo_voltage_cmd_dc_max(AO_VOLTAGE_CMD_DC_MAX_EDEFAULT);
				return;
			case AvipPackage.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_DC_MIN:
				setAo_voltage_cmd_dc_min(AO_VOLTAGE_CMD_DC_MIN_EDEFAULT);
				return;
			case AvipPackage.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_MAX:
				setAo_voltage_cmd_max(AO_VOLTAGE_CMD_MAX_EDEFAULT);
				return;
			case AvipPackage.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_MIN:
				setAo_voltage_cmd_min(AO_VOLTAGE_CMD_MIN_EDEFAULT);
				return;
			case AvipPackage.ANALOGUE_OUTPUT__OVER_CURRENT_THRESHOLD:
				setOver_current_threshold(OVER_CURRENT_THRESHOLD_EDEFAULT);
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
			case AvipPackage.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_AC_MAX:
				return ao_voltage_cmd_ac_max != AO_VOLTAGE_CMD_AC_MAX_EDEFAULT;
			case AvipPackage.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_AC_MIN:
				return ao_voltage_cmd_ac_min != AO_VOLTAGE_CMD_AC_MIN_EDEFAULT;
			case AvipPackage.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_DC_MAX:
				return ao_voltage_cmd_dc_max != AO_VOLTAGE_CMD_DC_MAX_EDEFAULT;
			case AvipPackage.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_DC_MIN:
				return ao_voltage_cmd_dc_min != AO_VOLTAGE_CMD_DC_MIN_EDEFAULT;
			case AvipPackage.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_MAX:
				return ao_voltage_cmd_max != AO_VOLTAGE_CMD_MAX_EDEFAULT;
			case AvipPackage.ANALOGUE_OUTPUT__AO_VOLTAGE_CMD_MIN:
				return ao_voltage_cmd_min != AO_VOLTAGE_CMD_MIN_EDEFAULT;
			case AvipPackage.ANALOGUE_OUTPUT__OVER_CURRENT_THRESHOLD:
				return over_current_threshold != OVER_CURRENT_THRESHOLD_EDEFAULT;
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
		result.append(" (ao_voltage_cmd_ac_max: ");
		result.append(ao_voltage_cmd_ac_max);
		result.append(", ao_voltage_cmd_ac_min: ");
		result.append(ao_voltage_cmd_ac_min);
		result.append(", ao_voltage_cmd_dc_max: ");
		result.append(ao_voltage_cmd_dc_max);
		result.append(", ao_voltage_cmd_dc_min: ");
		result.append(ao_voltage_cmd_dc_min);
		result.append(", ao_voltage_cmd_max: ");
		result.append(ao_voltage_cmd_max);
		result.append(", ao_voltage_cmd_min: ");
		result.append(ao_voltage_cmd_min);
		result.append(", over_current_threshold: ");
		result.append(over_current_threshold);
		result.append(')');
		return result.toString();
	}

} //AnalogueOutputImpl
