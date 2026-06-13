/**
 */
package targets.rdc.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import targets.rdc.RdcPackage;
import targets.rdc.stmTimingConfig;

import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.impl.SuperTrackingTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>stm Timing Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.rdc.impl.stmTimingConfigImpl#getId <em>Id</em>}</li>
 *   <li>{@link targets.rdc.impl.stmTimingConfigImpl#getName <em>Name</em>}</li>
 *   <li>{@link targets.rdc.impl.stmTimingConfigImpl#getRateDriverFrequencyHz <em>Rate Driver Frequency Hz</em>}</li>
 *   <li>{@link targets.rdc.impl.stmTimingConfigImpl#getRateGroupDivisor1 <em>Rate Group Divisor1</em>}</li>
 *   <li>{@link targets.rdc.impl.stmTimingConfigImpl#getRateGroupDivisor2 <em>Rate Group Divisor2</em>}</li>
 *   <li>{@link targets.rdc.impl.stmTimingConfigImpl#getRateGroupDivisor3 <em>Rate Group Divisor3</em>}</li>
 *   <li>{@link targets.rdc.impl.stmTimingConfigImpl#getRateGroupDefaultOffset <em>Rate Group Default Offset</em>}</li>
 *   <li>{@link targets.rdc.impl.stmTimingConfigImpl#getPwmResolutionBits <em>Pwm Resolution Bits</em>}</li>
 *   <li>{@link targets.rdc.impl.stmTimingConfigImpl#getRateDriverFrequencyHzSize <em>Rate Driver Frequency Hz Size</em>}</li>
 *   <li>{@link targets.rdc.impl.stmTimingConfigImpl#getRateGroupDivisor1Size <em>Rate Group Divisor1 Size</em>}</li>
 *   <li>{@link targets.rdc.impl.stmTimingConfigImpl#getRateGroupDivisor2Size <em>Rate Group Divisor2 Size</em>}</li>
 *   <li>{@link targets.rdc.impl.stmTimingConfigImpl#getRateGroupDivisor3Size <em>Rate Group Divisor3 Size</em>}</li>
 *   <li>{@link targets.rdc.impl.stmTimingConfigImpl#getRateGroupDefaultOffsetSize <em>Rate Group Default Offset Size</em>}</li>
 *   <li>{@link targets.rdc.impl.stmTimingConfigImpl#getPwmResolutionBitsSize <em>Pwm Resolution Bits Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class stmTimingConfigImpl extends SuperTrackingTypeImpl implements stmTimingConfig {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRateDriverFrequencyHz() <em>Rate Driver Frequency Hz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateDriverFrequencyHz()
	 * @generated
	 * @ordered
	 */
	protected static final int RATE_DRIVER_FREQUENCY_HZ_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRateDriverFrequencyHz() <em>Rate Driver Frequency Hz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateDriverFrequencyHz()
	 * @generated
	 * @ordered
	 */
	protected int rateDriverFrequencyHz = RATE_DRIVER_FREQUENCY_HZ_EDEFAULT;

	/**
	 * The default value of the '{@link #getRateGroupDivisor1() <em>Rate Group Divisor1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateGroupDivisor1()
	 * @generated
	 * @ordered
	 */
	protected static final int RATE_GROUP_DIVISOR1_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRateGroupDivisor1() <em>Rate Group Divisor1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateGroupDivisor1()
	 * @generated
	 * @ordered
	 */
	protected int rateGroupDivisor1 = RATE_GROUP_DIVISOR1_EDEFAULT;

	/**
	 * The default value of the '{@link #getRateGroupDivisor2() <em>Rate Group Divisor2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateGroupDivisor2()
	 * @generated
	 * @ordered
	 */
	protected static final int RATE_GROUP_DIVISOR2_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRateGroupDivisor2() <em>Rate Group Divisor2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateGroupDivisor2()
	 * @generated
	 * @ordered
	 */
	protected int rateGroupDivisor2 = RATE_GROUP_DIVISOR2_EDEFAULT;

	/**
	 * The default value of the '{@link #getRateGroupDivisor3() <em>Rate Group Divisor3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateGroupDivisor3()
	 * @generated
	 * @ordered
	 */
	protected static final int RATE_GROUP_DIVISOR3_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRateGroupDivisor3() <em>Rate Group Divisor3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateGroupDivisor3()
	 * @generated
	 * @ordered
	 */
	protected int rateGroupDivisor3 = RATE_GROUP_DIVISOR3_EDEFAULT;

	/**
	 * The default value of the '{@link #getRateGroupDefaultOffset() <em>Rate Group Default Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateGroupDefaultOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int RATE_GROUP_DEFAULT_OFFSET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRateGroupDefaultOffset() <em>Rate Group Default Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateGroupDefaultOffset()
	 * @generated
	 * @ordered
	 */
	protected int rateGroupDefaultOffset = RATE_GROUP_DEFAULT_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getPwmResolutionBits() <em>Pwm Resolution Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPwmResolutionBits()
	 * @generated
	 * @ordered
	 */
	protected static final int PWM_RESOLUTION_BITS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPwmResolutionBits() <em>Pwm Resolution Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPwmResolutionBits()
	 * @generated
	 * @ordered
	 */
	protected int pwmResolutionBits = PWM_RESOLUTION_BITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRateDriverFrequencyHzSize() <em>Rate Driver Frequency Hz Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateDriverFrequencyHzSize()
	 * @generated
	 * @ordered
	 */
	protected static final String RATE_DRIVER_FREQUENCY_HZ_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRateDriverFrequencyHzSize() <em>Rate Driver Frequency Hz Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateDriverFrequencyHzSize()
	 * @generated
	 * @ordered
	 */
	protected String rateDriverFrequencyHzSize = RATE_DRIVER_FREQUENCY_HZ_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRateGroupDivisor1Size() <em>Rate Group Divisor1 Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateGroupDivisor1Size()
	 * @generated
	 * @ordered
	 */
	protected static final String RATE_GROUP_DIVISOR1_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRateGroupDivisor1Size() <em>Rate Group Divisor1 Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateGroupDivisor1Size()
	 * @generated
	 * @ordered
	 */
	protected String rateGroupDivisor1Size = RATE_GROUP_DIVISOR1_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRateGroupDivisor2Size() <em>Rate Group Divisor2 Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateGroupDivisor2Size()
	 * @generated
	 * @ordered
	 */
	protected static final String RATE_GROUP_DIVISOR2_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRateGroupDivisor2Size() <em>Rate Group Divisor2 Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateGroupDivisor2Size()
	 * @generated
	 * @ordered
	 */
	protected String rateGroupDivisor2Size = RATE_GROUP_DIVISOR2_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRateGroupDivisor3Size() <em>Rate Group Divisor3 Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateGroupDivisor3Size()
	 * @generated
	 * @ordered
	 */
	protected static final String RATE_GROUP_DIVISOR3_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRateGroupDivisor3Size() <em>Rate Group Divisor3 Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateGroupDivisor3Size()
	 * @generated
	 * @ordered
	 */
	protected String rateGroupDivisor3Size = RATE_GROUP_DIVISOR3_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRateGroupDefaultOffsetSize() <em>Rate Group Default Offset Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateGroupDefaultOffsetSize()
	 * @generated
	 * @ordered
	 */
	protected static final String RATE_GROUP_DEFAULT_OFFSET_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRateGroupDefaultOffsetSize() <em>Rate Group Default Offset Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateGroupDefaultOffsetSize()
	 * @generated
	 * @ordered
	 */
	protected String rateGroupDefaultOffsetSize = RATE_GROUP_DEFAULT_OFFSET_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPwmResolutionBitsSize() <em>Pwm Resolution Bits Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPwmResolutionBitsSize()
	 * @generated
	 * @ordered
	 */
	protected static final String PWM_RESOLUTION_BITS_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPwmResolutionBitsSize() <em>Pwm Resolution Bits Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPwmResolutionBitsSize()
	 * @generated
	 * @ordered
	 */
	protected String pwmResolutionBitsSize = PWM_RESOLUTION_BITS_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected stmTimingConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdcPackage.Literals.STM_TIMING_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdcPackage.STM_TIMING_CONFIG__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdcPackage.STM_TIMING_CONFIG__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRateDriverFrequencyHz() {
		return rateDriverFrequencyHz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRateDriverFrequencyHz(int newRateDriverFrequencyHz) {
		int oldRateDriverFrequencyHz = rateDriverFrequencyHz;
		rateDriverFrequencyHz = newRateDriverFrequencyHz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdcPackage.STM_TIMING_CONFIG__RATE_DRIVER_FREQUENCY_HZ, oldRateDriverFrequencyHz, rateDriverFrequencyHz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRateGroupDivisor1() {
		return rateGroupDivisor1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRateGroupDivisor1(int newRateGroupDivisor1) {
		int oldRateGroupDivisor1 = rateGroupDivisor1;
		rateGroupDivisor1 = newRateGroupDivisor1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR1, oldRateGroupDivisor1, rateGroupDivisor1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRateGroupDivisor2() {
		return rateGroupDivisor2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRateGroupDivisor2(int newRateGroupDivisor2) {
		int oldRateGroupDivisor2 = rateGroupDivisor2;
		rateGroupDivisor2 = newRateGroupDivisor2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR2, oldRateGroupDivisor2, rateGroupDivisor2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRateGroupDivisor3() {
		return rateGroupDivisor3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRateGroupDivisor3(int newRateGroupDivisor3) {
		int oldRateGroupDivisor3 = rateGroupDivisor3;
		rateGroupDivisor3 = newRateGroupDivisor3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR3, oldRateGroupDivisor3, rateGroupDivisor3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRateGroupDefaultOffset() {
		return rateGroupDefaultOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRateGroupDefaultOffset(int newRateGroupDefaultOffset) {
		int oldRateGroupDefaultOffset = rateGroupDefaultOffset;
		rateGroupDefaultOffset = newRateGroupDefaultOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DEFAULT_OFFSET, oldRateGroupDefaultOffset, rateGroupDefaultOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPwmResolutionBits() {
		return pwmResolutionBits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPwmResolutionBits(int newPwmResolutionBits) {
		int oldPwmResolutionBits = pwmResolutionBits;
		pwmResolutionBits = newPwmResolutionBits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdcPackage.STM_TIMING_CONFIG__PWM_RESOLUTION_BITS, oldPwmResolutionBits, pwmResolutionBits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRateDriverFrequencyHzSize() {
		return rateDriverFrequencyHzSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRateDriverFrequencyHzSize(String newRateDriverFrequencyHzSize) {
		String oldRateDriverFrequencyHzSize = rateDriverFrequencyHzSize;
		rateDriverFrequencyHzSize = newRateDriverFrequencyHzSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdcPackage.STM_TIMING_CONFIG__RATE_DRIVER_FREQUENCY_HZ_SIZE, oldRateDriverFrequencyHzSize, rateDriverFrequencyHzSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRateGroupDivisor1Size() {
		return rateGroupDivisor1Size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRateGroupDivisor1Size(String newRateGroupDivisor1Size) {
		String oldRateGroupDivisor1Size = rateGroupDivisor1Size;
		rateGroupDivisor1Size = newRateGroupDivisor1Size;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR1_SIZE, oldRateGroupDivisor1Size, rateGroupDivisor1Size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRateGroupDivisor2Size() {
		return rateGroupDivisor2Size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRateGroupDivisor2Size(String newRateGroupDivisor2Size) {
		String oldRateGroupDivisor2Size = rateGroupDivisor2Size;
		rateGroupDivisor2Size = newRateGroupDivisor2Size;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR2_SIZE, oldRateGroupDivisor2Size, rateGroupDivisor2Size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRateGroupDivisor3Size() {
		return rateGroupDivisor3Size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRateGroupDivisor3Size(String newRateGroupDivisor3Size) {
		String oldRateGroupDivisor3Size = rateGroupDivisor3Size;
		rateGroupDivisor3Size = newRateGroupDivisor3Size;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR3_SIZE, oldRateGroupDivisor3Size, rateGroupDivisor3Size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRateGroupDefaultOffsetSize() {
		return rateGroupDefaultOffsetSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRateGroupDefaultOffsetSize(String newRateGroupDefaultOffsetSize) {
		String oldRateGroupDefaultOffsetSize = rateGroupDefaultOffsetSize;
		rateGroupDefaultOffsetSize = newRateGroupDefaultOffsetSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DEFAULT_OFFSET_SIZE, oldRateGroupDefaultOffsetSize, rateGroupDefaultOffsetSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPwmResolutionBitsSize() {
		return pwmResolutionBitsSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPwmResolutionBitsSize(String newPwmResolutionBitsSize) {
		String oldPwmResolutionBitsSize = pwmResolutionBitsSize;
		pwmResolutionBitsSize = newPwmResolutionBitsSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdcPackage.STM_TIMING_CONFIG__PWM_RESOLUTION_BITS_SIZE, oldPwmResolutionBitsSize, pwmResolutionBitsSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RdcPackage.STM_TIMING_CONFIG__ID:
				return getId();
			case RdcPackage.STM_TIMING_CONFIG__NAME:
				return getName();
			case RdcPackage.STM_TIMING_CONFIG__RATE_DRIVER_FREQUENCY_HZ:
				return getRateDriverFrequencyHz();
			case RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR1:
				return getRateGroupDivisor1();
			case RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR2:
				return getRateGroupDivisor2();
			case RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR3:
				return getRateGroupDivisor3();
			case RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DEFAULT_OFFSET:
				return getRateGroupDefaultOffset();
			case RdcPackage.STM_TIMING_CONFIG__PWM_RESOLUTION_BITS:
				return getPwmResolutionBits();
			case RdcPackage.STM_TIMING_CONFIG__RATE_DRIVER_FREQUENCY_HZ_SIZE:
				return getRateDriverFrequencyHzSize();
			case RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR1_SIZE:
				return getRateGroupDivisor1Size();
			case RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR2_SIZE:
				return getRateGroupDivisor2Size();
			case RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR3_SIZE:
				return getRateGroupDivisor3Size();
			case RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DEFAULT_OFFSET_SIZE:
				return getRateGroupDefaultOffsetSize();
			case RdcPackage.STM_TIMING_CONFIG__PWM_RESOLUTION_BITS_SIZE:
				return getPwmResolutionBitsSize();
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
			case RdcPackage.STM_TIMING_CONFIG__ID:
				setId((String)newValue);
				return;
			case RdcPackage.STM_TIMING_CONFIG__NAME:
				setName((String)newValue);
				return;
			case RdcPackage.STM_TIMING_CONFIG__RATE_DRIVER_FREQUENCY_HZ:
				setRateDriverFrequencyHz((Integer)newValue);
				return;
			case RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR1:
				setRateGroupDivisor1((Integer)newValue);
				return;
			case RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR2:
				setRateGroupDivisor2((Integer)newValue);
				return;
			case RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR3:
				setRateGroupDivisor3((Integer)newValue);
				return;
			case RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DEFAULT_OFFSET:
				setRateGroupDefaultOffset((Integer)newValue);
				return;
			case RdcPackage.STM_TIMING_CONFIG__PWM_RESOLUTION_BITS:
				setPwmResolutionBits((Integer)newValue);
				return;
			case RdcPackage.STM_TIMING_CONFIG__RATE_DRIVER_FREQUENCY_HZ_SIZE:
				setRateDriverFrequencyHzSize((String)newValue);
				return;
			case RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR1_SIZE:
				setRateGroupDivisor1Size((String)newValue);
				return;
			case RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR2_SIZE:
				setRateGroupDivisor2Size((String)newValue);
				return;
			case RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR3_SIZE:
				setRateGroupDivisor3Size((String)newValue);
				return;
			case RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DEFAULT_OFFSET_SIZE:
				setRateGroupDefaultOffsetSize((String)newValue);
				return;
			case RdcPackage.STM_TIMING_CONFIG__PWM_RESOLUTION_BITS_SIZE:
				setPwmResolutionBitsSize((String)newValue);
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
			case RdcPackage.STM_TIMING_CONFIG__ID:
				setId(ID_EDEFAULT);
				return;
			case RdcPackage.STM_TIMING_CONFIG__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RdcPackage.STM_TIMING_CONFIG__RATE_DRIVER_FREQUENCY_HZ:
				setRateDriverFrequencyHz(RATE_DRIVER_FREQUENCY_HZ_EDEFAULT);
				return;
			case RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR1:
				setRateGroupDivisor1(RATE_GROUP_DIVISOR1_EDEFAULT);
				return;
			case RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR2:
				setRateGroupDivisor2(RATE_GROUP_DIVISOR2_EDEFAULT);
				return;
			case RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR3:
				setRateGroupDivisor3(RATE_GROUP_DIVISOR3_EDEFAULT);
				return;
			case RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DEFAULT_OFFSET:
				setRateGroupDefaultOffset(RATE_GROUP_DEFAULT_OFFSET_EDEFAULT);
				return;
			case RdcPackage.STM_TIMING_CONFIG__PWM_RESOLUTION_BITS:
				setPwmResolutionBits(PWM_RESOLUTION_BITS_EDEFAULT);
				return;
			case RdcPackage.STM_TIMING_CONFIG__RATE_DRIVER_FREQUENCY_HZ_SIZE:
				setRateDriverFrequencyHzSize(RATE_DRIVER_FREQUENCY_HZ_SIZE_EDEFAULT);
				return;
			case RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR1_SIZE:
				setRateGroupDivisor1Size(RATE_GROUP_DIVISOR1_SIZE_EDEFAULT);
				return;
			case RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR2_SIZE:
				setRateGroupDivisor2Size(RATE_GROUP_DIVISOR2_SIZE_EDEFAULT);
				return;
			case RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR3_SIZE:
				setRateGroupDivisor3Size(RATE_GROUP_DIVISOR3_SIZE_EDEFAULT);
				return;
			case RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DEFAULT_OFFSET_SIZE:
				setRateGroupDefaultOffsetSize(RATE_GROUP_DEFAULT_OFFSET_SIZE_EDEFAULT);
				return;
			case RdcPackage.STM_TIMING_CONFIG__PWM_RESOLUTION_BITS_SIZE:
				setPwmResolutionBitsSize(PWM_RESOLUTION_BITS_SIZE_EDEFAULT);
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
			case RdcPackage.STM_TIMING_CONFIG__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case RdcPackage.STM_TIMING_CONFIG__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RdcPackage.STM_TIMING_CONFIG__RATE_DRIVER_FREQUENCY_HZ:
				return rateDriverFrequencyHz != RATE_DRIVER_FREQUENCY_HZ_EDEFAULT;
			case RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR1:
				return rateGroupDivisor1 != RATE_GROUP_DIVISOR1_EDEFAULT;
			case RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR2:
				return rateGroupDivisor2 != RATE_GROUP_DIVISOR2_EDEFAULT;
			case RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR3:
				return rateGroupDivisor3 != RATE_GROUP_DIVISOR3_EDEFAULT;
			case RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DEFAULT_OFFSET:
				return rateGroupDefaultOffset != RATE_GROUP_DEFAULT_OFFSET_EDEFAULT;
			case RdcPackage.STM_TIMING_CONFIG__PWM_RESOLUTION_BITS:
				return pwmResolutionBits != PWM_RESOLUTION_BITS_EDEFAULT;
			case RdcPackage.STM_TIMING_CONFIG__RATE_DRIVER_FREQUENCY_HZ_SIZE:
				return RATE_DRIVER_FREQUENCY_HZ_SIZE_EDEFAULT == null ? rateDriverFrequencyHzSize != null : !RATE_DRIVER_FREQUENCY_HZ_SIZE_EDEFAULT.equals(rateDriverFrequencyHzSize);
			case RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR1_SIZE:
				return RATE_GROUP_DIVISOR1_SIZE_EDEFAULT == null ? rateGroupDivisor1Size != null : !RATE_GROUP_DIVISOR1_SIZE_EDEFAULT.equals(rateGroupDivisor1Size);
			case RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR2_SIZE:
				return RATE_GROUP_DIVISOR2_SIZE_EDEFAULT == null ? rateGroupDivisor2Size != null : !RATE_GROUP_DIVISOR2_SIZE_EDEFAULT.equals(rateGroupDivisor2Size);
			case RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DIVISOR3_SIZE:
				return RATE_GROUP_DIVISOR3_SIZE_EDEFAULT == null ? rateGroupDivisor3Size != null : !RATE_GROUP_DIVISOR3_SIZE_EDEFAULT.equals(rateGroupDivisor3Size);
			case RdcPackage.STM_TIMING_CONFIG__RATE_GROUP_DEFAULT_OFFSET_SIZE:
				return RATE_GROUP_DEFAULT_OFFSET_SIZE_EDEFAULT == null ? rateGroupDefaultOffsetSize != null : !RATE_GROUP_DEFAULT_OFFSET_SIZE_EDEFAULT.equals(rateGroupDefaultOffsetSize);
			case RdcPackage.STM_TIMING_CONFIG__PWM_RESOLUTION_BITS_SIZE:
				return PWM_RESOLUTION_BITS_SIZE_EDEFAULT == null ? pwmResolutionBitsSize != null : !PWM_RESOLUTION_BITS_SIZE_EDEFAULT.equals(pwmResolutionBitsSize);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SuperIdentifierType.class) {
			switch (derivedFeatureID) {
				case RdcPackage.STM_TIMING_CONFIG__ID: return EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;
				case RdcPackage.STM_TIMING_CONFIG__NAME: return EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SuperIdentifierType.class) {
			switch (baseFeatureID) {
				case EtypesPackage.SUPER_IDENTIFIER_TYPE__ID: return RdcPackage.STM_TIMING_CONFIG__ID;
				case EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME: return RdcPackage.STM_TIMING_CONFIG__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", rateDriverFrequencyHz: ");
		result.append(rateDriverFrequencyHz);
		result.append(", rateGroupDivisor1: ");
		result.append(rateGroupDivisor1);
		result.append(", rateGroupDivisor2: ");
		result.append(rateGroupDivisor2);
		result.append(", rateGroupDivisor3: ");
		result.append(rateGroupDivisor3);
		result.append(", rateGroupDefaultOffset: ");
		result.append(rateGroupDefaultOffset);
		result.append(", pwmResolutionBits: ");
		result.append(pwmResolutionBits);
		result.append(", rateDriverFrequencyHzSize: ");
		result.append(rateDriverFrequencyHzSize);
		result.append(", rateGroupDivisor1Size: ");
		result.append(rateGroupDivisor1Size);
		result.append(", rateGroupDivisor2Size: ");
		result.append(rateGroupDivisor2Size);
		result.append(", rateGroupDivisor3Size: ");
		result.append(rateGroupDivisor3Size);
		result.append(", rateGroupDefaultOffsetSize: ");
		result.append(rateGroupDefaultOffsetSize);
		result.append(", pwmResolutionBitsSize: ");
		result.append(pwmResolutionBitsSize);
		result.append(')');
		return result.toString();
	}

} //stmTimingConfigImpl
