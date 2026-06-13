/**
 */
package targets.avip.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import targets.avip.AnalogueInput;
import targets.avip.AvipPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analogue Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.avip.impl.AnalogueInputImpl#getAi_voltage_max <em>Ai voltage max</em>}</li>
 *   <li>{@link targets.avip.impl.AnalogueInputImpl#getAi_voltage_max_vac_filtered <em>Ai voltage max vac filtered</em>}</li>
 *   <li>{@link targets.avip.impl.AnalogueInputImpl#getAi_voltage_max_vdc_filtered <em>Ai voltage max vdc filtered</em>}</li>
 *   <li>{@link targets.avip.impl.AnalogueInputImpl#getAi_voltage_min <em>Ai voltage min</em>}</li>
 *   <li>{@link targets.avip.impl.AnalogueInputImpl#getAi_voltage_min_vdc_filtered <em>Ai voltage min vdc filtered</em>}</li>
 *   <li>{@link targets.avip.impl.AnalogueInputImpl#getMin_ai_frequency <em>Min ai frequency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalogueInputImpl extends SuperAnaloguePortTypeImpl implements AnalogueInput {
	/**
	 * The default value of the '{@link #getAi_voltage_max() <em>Ai voltage max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAi_voltage_max()
	 * @generated
	 * @ordered
	 */
	protected static final float AI_VOLTAGE_MAX_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAi_voltage_max() <em>Ai voltage max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAi_voltage_max()
	 * @generated
	 * @ordered
	 */
	protected float ai_voltage_max = AI_VOLTAGE_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getAi_voltage_max_vac_filtered() <em>Ai voltage max vac filtered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAi_voltage_max_vac_filtered()
	 * @generated
	 * @ordered
	 */
	protected static final float AI_VOLTAGE_MAX_VAC_FILTERED_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAi_voltage_max_vac_filtered() <em>Ai voltage max vac filtered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAi_voltage_max_vac_filtered()
	 * @generated
	 * @ordered
	 */
	protected float ai_voltage_max_vac_filtered = AI_VOLTAGE_MAX_VAC_FILTERED_EDEFAULT;

	/**
	 * The default value of the '{@link #getAi_voltage_max_vdc_filtered() <em>Ai voltage max vdc filtered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAi_voltage_max_vdc_filtered()
	 * @generated
	 * @ordered
	 */
	protected static final float AI_VOLTAGE_MAX_VDC_FILTERED_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAi_voltage_max_vdc_filtered() <em>Ai voltage max vdc filtered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAi_voltage_max_vdc_filtered()
	 * @generated
	 * @ordered
	 */
	protected float ai_voltage_max_vdc_filtered = AI_VOLTAGE_MAX_VDC_FILTERED_EDEFAULT;

	/**
	 * The default value of the '{@link #getAi_voltage_min() <em>Ai voltage min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAi_voltage_min()
	 * @generated
	 * @ordered
	 */
	protected static final float AI_VOLTAGE_MIN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAi_voltage_min() <em>Ai voltage min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAi_voltage_min()
	 * @generated
	 * @ordered
	 */
	protected float ai_voltage_min = AI_VOLTAGE_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getAi_voltage_min_vdc_filtered() <em>Ai voltage min vdc filtered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAi_voltage_min_vdc_filtered()
	 * @generated
	 * @ordered
	 */
	protected static final float AI_VOLTAGE_MIN_VDC_FILTERED_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAi_voltage_min_vdc_filtered() <em>Ai voltage min vdc filtered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAi_voltage_min_vdc_filtered()
	 * @generated
	 * @ordered
	 */
	protected float ai_voltage_min_vdc_filtered = AI_VOLTAGE_MIN_VDC_FILTERED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin_ai_frequency() <em>Min ai frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_ai_frequency()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_AI_FREQUENCY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMin_ai_frequency() <em>Min ai frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_ai_frequency()
	 * @generated
	 * @ordered
	 */
	protected float min_ai_frequency = MIN_AI_FREQUENCY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalogueInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AvipPackage.Literals.ANALOGUE_INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAi_voltage_max() {
		return ai_voltage_max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAi_voltage_max(float newAi_voltage_max) {
		float oldAi_voltage_max = ai_voltage_max;
		ai_voltage_max = newAi_voltage_max;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.ANALOGUE_INPUT__AI_VOLTAGE_MAX, oldAi_voltage_max, ai_voltage_max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAi_voltage_max_vac_filtered() {
		return ai_voltage_max_vac_filtered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAi_voltage_max_vac_filtered(float newAi_voltage_max_vac_filtered) {
		float oldAi_voltage_max_vac_filtered = ai_voltage_max_vac_filtered;
		ai_voltage_max_vac_filtered = newAi_voltage_max_vac_filtered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.ANALOGUE_INPUT__AI_VOLTAGE_MAX_VAC_FILTERED, oldAi_voltage_max_vac_filtered, ai_voltage_max_vac_filtered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAi_voltage_max_vdc_filtered() {
		return ai_voltage_max_vdc_filtered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAi_voltage_max_vdc_filtered(float newAi_voltage_max_vdc_filtered) {
		float oldAi_voltage_max_vdc_filtered = ai_voltage_max_vdc_filtered;
		ai_voltage_max_vdc_filtered = newAi_voltage_max_vdc_filtered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.ANALOGUE_INPUT__AI_VOLTAGE_MAX_VDC_FILTERED, oldAi_voltage_max_vdc_filtered, ai_voltage_max_vdc_filtered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAi_voltage_min() {
		return ai_voltage_min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAi_voltage_min(float newAi_voltage_min) {
		float oldAi_voltage_min = ai_voltage_min;
		ai_voltage_min = newAi_voltage_min;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.ANALOGUE_INPUT__AI_VOLTAGE_MIN, oldAi_voltage_min, ai_voltage_min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAi_voltage_min_vdc_filtered() {
		return ai_voltage_min_vdc_filtered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAi_voltage_min_vdc_filtered(float newAi_voltage_min_vdc_filtered) {
		float oldAi_voltage_min_vdc_filtered = ai_voltage_min_vdc_filtered;
		ai_voltage_min_vdc_filtered = newAi_voltage_min_vdc_filtered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.ANALOGUE_INPUT__AI_VOLTAGE_MIN_VDC_FILTERED, oldAi_voltage_min_vdc_filtered, ai_voltage_min_vdc_filtered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMin_ai_frequency() {
		return min_ai_frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin_ai_frequency(float newMin_ai_frequency) {
		float oldMin_ai_frequency = min_ai_frequency;
		min_ai_frequency = newMin_ai_frequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.ANALOGUE_INPUT__MIN_AI_FREQUENCY, oldMin_ai_frequency, min_ai_frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AvipPackage.ANALOGUE_INPUT__AI_VOLTAGE_MAX:
				return getAi_voltage_max();
			case AvipPackage.ANALOGUE_INPUT__AI_VOLTAGE_MAX_VAC_FILTERED:
				return getAi_voltage_max_vac_filtered();
			case AvipPackage.ANALOGUE_INPUT__AI_VOLTAGE_MAX_VDC_FILTERED:
				return getAi_voltage_max_vdc_filtered();
			case AvipPackage.ANALOGUE_INPUT__AI_VOLTAGE_MIN:
				return getAi_voltage_min();
			case AvipPackage.ANALOGUE_INPUT__AI_VOLTAGE_MIN_VDC_FILTERED:
				return getAi_voltage_min_vdc_filtered();
			case AvipPackage.ANALOGUE_INPUT__MIN_AI_FREQUENCY:
				return getMin_ai_frequency();
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
			case AvipPackage.ANALOGUE_INPUT__AI_VOLTAGE_MAX:
				setAi_voltage_max((Float)newValue);
				return;
			case AvipPackage.ANALOGUE_INPUT__AI_VOLTAGE_MAX_VAC_FILTERED:
				setAi_voltage_max_vac_filtered((Float)newValue);
				return;
			case AvipPackage.ANALOGUE_INPUT__AI_VOLTAGE_MAX_VDC_FILTERED:
				setAi_voltage_max_vdc_filtered((Float)newValue);
				return;
			case AvipPackage.ANALOGUE_INPUT__AI_VOLTAGE_MIN:
				setAi_voltage_min((Float)newValue);
				return;
			case AvipPackage.ANALOGUE_INPUT__AI_VOLTAGE_MIN_VDC_FILTERED:
				setAi_voltage_min_vdc_filtered((Float)newValue);
				return;
			case AvipPackage.ANALOGUE_INPUT__MIN_AI_FREQUENCY:
				setMin_ai_frequency((Float)newValue);
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
			case AvipPackage.ANALOGUE_INPUT__AI_VOLTAGE_MAX:
				setAi_voltage_max(AI_VOLTAGE_MAX_EDEFAULT);
				return;
			case AvipPackage.ANALOGUE_INPUT__AI_VOLTAGE_MAX_VAC_FILTERED:
				setAi_voltage_max_vac_filtered(AI_VOLTAGE_MAX_VAC_FILTERED_EDEFAULT);
				return;
			case AvipPackage.ANALOGUE_INPUT__AI_VOLTAGE_MAX_VDC_FILTERED:
				setAi_voltage_max_vdc_filtered(AI_VOLTAGE_MAX_VDC_FILTERED_EDEFAULT);
				return;
			case AvipPackage.ANALOGUE_INPUT__AI_VOLTAGE_MIN:
				setAi_voltage_min(AI_VOLTAGE_MIN_EDEFAULT);
				return;
			case AvipPackage.ANALOGUE_INPUT__AI_VOLTAGE_MIN_VDC_FILTERED:
				setAi_voltage_min_vdc_filtered(AI_VOLTAGE_MIN_VDC_FILTERED_EDEFAULT);
				return;
			case AvipPackage.ANALOGUE_INPUT__MIN_AI_FREQUENCY:
				setMin_ai_frequency(MIN_AI_FREQUENCY_EDEFAULT);
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
			case AvipPackage.ANALOGUE_INPUT__AI_VOLTAGE_MAX:
				return ai_voltage_max != AI_VOLTAGE_MAX_EDEFAULT;
			case AvipPackage.ANALOGUE_INPUT__AI_VOLTAGE_MAX_VAC_FILTERED:
				return ai_voltage_max_vac_filtered != AI_VOLTAGE_MAX_VAC_FILTERED_EDEFAULT;
			case AvipPackage.ANALOGUE_INPUT__AI_VOLTAGE_MAX_VDC_FILTERED:
				return ai_voltage_max_vdc_filtered != AI_VOLTAGE_MAX_VDC_FILTERED_EDEFAULT;
			case AvipPackage.ANALOGUE_INPUT__AI_VOLTAGE_MIN:
				return ai_voltage_min != AI_VOLTAGE_MIN_EDEFAULT;
			case AvipPackage.ANALOGUE_INPUT__AI_VOLTAGE_MIN_VDC_FILTERED:
				return ai_voltage_min_vdc_filtered != AI_VOLTAGE_MIN_VDC_FILTERED_EDEFAULT;
			case AvipPackage.ANALOGUE_INPUT__MIN_AI_FREQUENCY:
				return min_ai_frequency != MIN_AI_FREQUENCY_EDEFAULT;
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
		result.append(" (ai_voltage_max: ");
		result.append(ai_voltage_max);
		result.append(", ai_voltage_max_vac_filtered: ");
		result.append(ai_voltage_max_vac_filtered);
		result.append(", ai_voltage_max_vdc_filtered: ");
		result.append(ai_voltage_max_vdc_filtered);
		result.append(", ai_voltage_min: ");
		result.append(ai_voltage_min);
		result.append(", ai_voltage_min_vdc_filtered: ");
		result.append(ai_voltage_min_vdc_filtered);
		result.append(", min_ai_frequency: ");
		result.append(min_ai_frequency);
		result.append(')');
		return result.toString();
	}

} //AnalogueInputImpl
