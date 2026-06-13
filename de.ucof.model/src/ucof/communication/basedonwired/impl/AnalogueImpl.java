/**
 */
package ucof.communication.basedonwired.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.communication.basedonwired.Analogue;
import ucof.communication.basedonwired.BasedonwiredPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analogue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.basedonwired.impl.AnalogueImpl#getIncCountStepSize <em>Inc Count Step Size</em>}</li>
 *   <li>{@link ucof.communication.basedonwired.impl.AnalogueImpl#getDecCountStepSize <em>Dec Count Step Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalogueImpl extends WiredSuperImpl implements Analogue {
	/**
	 * The default value of the '{@link #getIncCountStepSize() <em>Inc Count Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncCountStepSize()
	 * @generated
	 * @ordered
	 */
	protected static final int INC_COUNT_STEP_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIncCountStepSize() <em>Inc Count Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncCountStepSize()
	 * @generated
	 * @ordered
	 */
	protected int incCountStepSize = INC_COUNT_STEP_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecCountStepSize() <em>Dec Count Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecCountStepSize()
	 * @generated
	 * @ordered
	 */
	protected static final int DEC_COUNT_STEP_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDecCountStepSize() <em>Dec Count Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecCountStepSize()
	 * @generated
	 * @ordered
	 */
	protected int decCountStepSize = DEC_COUNT_STEP_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalogueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasedonwiredPackage.Literals.ANALOGUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIncCountStepSize() {
		return incCountStepSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncCountStepSize(int newIncCountStepSize) {
		int oldIncCountStepSize = incCountStepSize;
		incCountStepSize = newIncCountStepSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasedonwiredPackage.ANALOGUE__INC_COUNT_STEP_SIZE, oldIncCountStepSize, incCountStepSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDecCountStepSize() {
		return decCountStepSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecCountStepSize(int newDecCountStepSize) {
		int oldDecCountStepSize = decCountStepSize;
		decCountStepSize = newDecCountStepSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasedonwiredPackage.ANALOGUE__DEC_COUNT_STEP_SIZE, oldDecCountStepSize, decCountStepSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasedonwiredPackage.ANALOGUE__INC_COUNT_STEP_SIZE:
				return getIncCountStepSize();
			case BasedonwiredPackage.ANALOGUE__DEC_COUNT_STEP_SIZE:
				return getDecCountStepSize();
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
			case BasedonwiredPackage.ANALOGUE__INC_COUNT_STEP_SIZE:
				setIncCountStepSize((Integer)newValue);
				return;
			case BasedonwiredPackage.ANALOGUE__DEC_COUNT_STEP_SIZE:
				setDecCountStepSize((Integer)newValue);
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
			case BasedonwiredPackage.ANALOGUE__INC_COUNT_STEP_SIZE:
				setIncCountStepSize(INC_COUNT_STEP_SIZE_EDEFAULT);
				return;
			case BasedonwiredPackage.ANALOGUE__DEC_COUNT_STEP_SIZE:
				setDecCountStepSize(DEC_COUNT_STEP_SIZE_EDEFAULT);
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
			case BasedonwiredPackage.ANALOGUE__INC_COUNT_STEP_SIZE:
				return incCountStepSize != INC_COUNT_STEP_SIZE_EDEFAULT;
			case BasedonwiredPackage.ANALOGUE__DEC_COUNT_STEP_SIZE:
				return decCountStepSize != DEC_COUNT_STEP_SIZE_EDEFAULT;
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
		result.append(" (incCountStepSize: ");
		result.append(incCountStepSize);
		result.append(", decCountStepSize: ");
		result.append(decCountStepSize);
		result.append(')');
		return result.toString();
	}

} //AnalogueImpl
