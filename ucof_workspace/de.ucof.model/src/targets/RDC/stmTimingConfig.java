/**
 */
package targets.rdc;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>stm Timing Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.rdc.stmTimingConfig#getRateDriverFrequencyHz <em>Rate Driver Frequency Hz</em>}</li>
 *   <li>{@link targets.rdc.stmTimingConfig#getRateGroupDivisor1 <em>Rate Group Divisor1</em>}</li>
 *   <li>{@link targets.rdc.stmTimingConfig#getRateGroupDivisor2 <em>Rate Group Divisor2</em>}</li>
 *   <li>{@link targets.rdc.stmTimingConfig#getRateGroupDivisor3 <em>Rate Group Divisor3</em>}</li>
 *   <li>{@link targets.rdc.stmTimingConfig#getRateGroupDefaultOffset <em>Rate Group Default Offset</em>}</li>
 *   <li>{@link targets.rdc.stmTimingConfig#getPwmResolutionBits <em>Pwm Resolution Bits</em>}</li>
 *   <li>{@link targets.rdc.stmTimingConfig#getRateDriverFrequencyHzSize <em>Rate Driver Frequency Hz Size</em>}</li>
 *   <li>{@link targets.rdc.stmTimingConfig#getRateGroupDivisor1Size <em>Rate Group Divisor1 Size</em>}</li>
 *   <li>{@link targets.rdc.stmTimingConfig#getRateGroupDivisor2Size <em>Rate Group Divisor2 Size</em>}</li>
 *   <li>{@link targets.rdc.stmTimingConfig#getRateGroupDivisor3Size <em>Rate Group Divisor3 Size</em>}</li>
 *   <li>{@link targets.rdc.stmTimingConfig#getRateGroupDefaultOffsetSize <em>Rate Group Default Offset Size</em>}</li>
 *   <li>{@link targets.rdc.stmTimingConfig#getPwmResolutionBitsSize <em>Pwm Resolution Bits Size</em>}</li>
 * </ul>
 *
 * @see targets.rdc.RdcPackage#getstmTimingConfig()
 * @model
 * @generated
 */
public interface stmTimingConfig extends SuperTrackingType, SuperIdentifierType {
	/**
	 * Returns the value of the '<em><b>Rate Driver Frequency Hz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate Driver Frequency Hz</em>' attribute.
	 * @see #setRateDriverFrequencyHz(int)
	 * @see targets.rdc.RdcPackage#getstmTimingConfig_RateDriverFrequencyHz()
	 * @model
	 * @generated
	 */
	int getRateDriverFrequencyHz();

	/**
	 * Sets the value of the '{@link targets.rdc.stmTimingConfig#getRateDriverFrequencyHz <em>Rate Driver Frequency Hz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Driver Frequency Hz</em>' attribute.
	 * @see #getRateDriverFrequencyHz()
	 * @generated
	 */
	void setRateDriverFrequencyHz(int value);

	/**
	 * Returns the value of the '<em><b>Rate Group Divisor1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate Group Divisor1</em>' attribute.
	 * @see #setRateGroupDivisor1(int)
	 * @see targets.rdc.RdcPackage#getstmTimingConfig_RateGroupDivisor1()
	 * @model
	 * @generated
	 */
	int getRateGroupDivisor1();

	/**
	 * Sets the value of the '{@link targets.rdc.stmTimingConfig#getRateGroupDivisor1 <em>Rate Group Divisor1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Group Divisor1</em>' attribute.
	 * @see #getRateGroupDivisor1()
	 * @generated
	 */
	void setRateGroupDivisor1(int value);

	/**
	 * Returns the value of the '<em><b>Rate Group Divisor2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate Group Divisor2</em>' attribute.
	 * @see #setRateGroupDivisor2(int)
	 * @see targets.rdc.RdcPackage#getstmTimingConfig_RateGroupDivisor2()
	 * @model
	 * @generated
	 */
	int getRateGroupDivisor2();

	/**
	 * Sets the value of the '{@link targets.rdc.stmTimingConfig#getRateGroupDivisor2 <em>Rate Group Divisor2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Group Divisor2</em>' attribute.
	 * @see #getRateGroupDivisor2()
	 * @generated
	 */
	void setRateGroupDivisor2(int value);

	/**
	 * Returns the value of the '<em><b>Rate Group Divisor3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate Group Divisor3</em>' attribute.
	 * @see #setRateGroupDivisor3(int)
	 * @see targets.rdc.RdcPackage#getstmTimingConfig_RateGroupDivisor3()
	 * @model
	 * @generated
	 */
	int getRateGroupDivisor3();

	/**
	 * Sets the value of the '{@link targets.rdc.stmTimingConfig#getRateGroupDivisor3 <em>Rate Group Divisor3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Group Divisor3</em>' attribute.
	 * @see #getRateGroupDivisor3()
	 * @generated
	 */
	void setRateGroupDivisor3(int value);

	/**
	 * Returns the value of the '<em><b>Rate Group Default Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate Group Default Offset</em>' attribute.
	 * @see #setRateGroupDefaultOffset(int)
	 * @see targets.rdc.RdcPackage#getstmTimingConfig_RateGroupDefaultOffset()
	 * @model
	 * @generated
	 */
	int getRateGroupDefaultOffset();

	/**
	 * Sets the value of the '{@link targets.rdc.stmTimingConfig#getRateGroupDefaultOffset <em>Rate Group Default Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Group Default Offset</em>' attribute.
	 * @see #getRateGroupDefaultOffset()
	 * @generated
	 */
	void setRateGroupDefaultOffset(int value);

	/**
	 * Returns the value of the '<em><b>Pwm Resolution Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pwm Resolution Bits</em>' attribute.
	 * @see #setPwmResolutionBits(int)
	 * @see targets.rdc.RdcPackage#getstmTimingConfig_PwmResolutionBits()
	 * @model
	 * @generated
	 */
	int getPwmResolutionBits();

	/**
	 * Sets the value of the '{@link targets.rdc.stmTimingConfig#getPwmResolutionBits <em>Pwm Resolution Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pwm Resolution Bits</em>' attribute.
	 * @see #getPwmResolutionBits()
	 * @generated
	 */
	void setPwmResolutionBits(int value);

	/**
	 * Returns the value of the '<em><b>Rate Driver Frequency Hz Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate Driver Frequency Hz Size</em>' attribute.
	 * @see #setRateDriverFrequencyHzSize(String)
	 * @see targets.rdc.RdcPackage#getstmTimingConfig_RateDriverFrequencyHzSize()
	 * @model
	 * @generated
	 */
	String getRateDriverFrequencyHzSize();

	/**
	 * Sets the value of the '{@link targets.rdc.stmTimingConfig#getRateDriverFrequencyHzSize <em>Rate Driver Frequency Hz Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Driver Frequency Hz Size</em>' attribute.
	 * @see #getRateDriverFrequencyHzSize()
	 * @generated
	 */
	void setRateDriverFrequencyHzSize(String value);

	/**
	 * Returns the value of the '<em><b>Rate Group Divisor1 Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate Group Divisor1 Size</em>' attribute.
	 * @see #setRateGroupDivisor1Size(String)
	 * @see targets.rdc.RdcPackage#getstmTimingConfig_RateGroupDivisor1Size()
	 * @model
	 * @generated
	 */
	String getRateGroupDivisor1Size();

	/**
	 * Sets the value of the '{@link targets.rdc.stmTimingConfig#getRateGroupDivisor1Size <em>Rate Group Divisor1 Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Group Divisor1 Size</em>' attribute.
	 * @see #getRateGroupDivisor1Size()
	 * @generated
	 */
	void setRateGroupDivisor1Size(String value);

	/**
	 * Returns the value of the '<em><b>Rate Group Divisor2 Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate Group Divisor2 Size</em>' attribute.
	 * @see #setRateGroupDivisor2Size(String)
	 * @see targets.rdc.RdcPackage#getstmTimingConfig_RateGroupDivisor2Size()
	 * @model
	 * @generated
	 */
	String getRateGroupDivisor2Size();

	/**
	 * Sets the value of the '{@link targets.rdc.stmTimingConfig#getRateGroupDivisor2Size <em>Rate Group Divisor2 Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Group Divisor2 Size</em>' attribute.
	 * @see #getRateGroupDivisor2Size()
	 * @generated
	 */
	void setRateGroupDivisor2Size(String value);

	/**
	 * Returns the value of the '<em><b>Rate Group Divisor3 Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate Group Divisor3 Size</em>' attribute.
	 * @see #setRateGroupDivisor3Size(String)
	 * @see targets.rdc.RdcPackage#getstmTimingConfig_RateGroupDivisor3Size()
	 * @model
	 * @generated
	 */
	String getRateGroupDivisor3Size();

	/**
	 * Sets the value of the '{@link targets.rdc.stmTimingConfig#getRateGroupDivisor3Size <em>Rate Group Divisor3 Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Group Divisor3 Size</em>' attribute.
	 * @see #getRateGroupDivisor3Size()
	 * @generated
	 */
	void setRateGroupDivisor3Size(String value);

	/**
	 * Returns the value of the '<em><b>Rate Group Default Offset Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate Group Default Offset Size</em>' attribute.
	 * @see #setRateGroupDefaultOffsetSize(String)
	 * @see targets.rdc.RdcPackage#getstmTimingConfig_RateGroupDefaultOffsetSize()
	 * @model
	 * @generated
	 */
	String getRateGroupDefaultOffsetSize();

	/**
	 * Sets the value of the '{@link targets.rdc.stmTimingConfig#getRateGroupDefaultOffsetSize <em>Rate Group Default Offset Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Group Default Offset Size</em>' attribute.
	 * @see #getRateGroupDefaultOffsetSize()
	 * @generated
	 */
	void setRateGroupDefaultOffsetSize(String value);

	/**
	 * Returns the value of the '<em><b>Pwm Resolution Bits Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pwm Resolution Bits Size</em>' attribute.
	 * @see #setPwmResolutionBitsSize(String)
	 * @see targets.rdc.RdcPackage#getstmTimingConfig_PwmResolutionBitsSize()
	 * @model
	 * @generated
	 */
	String getPwmResolutionBitsSize();

	/**
	 * Sets the value of the '{@link targets.rdc.stmTimingConfig#getPwmResolutionBitsSize <em>Pwm Resolution Bits Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pwm Resolution Bits Size</em>' attribute.
	 * @see #getPwmResolutionBitsSize()
	 * @generated
	 */
	void setPwmResolutionBitsSize(String value);

} // stmTimingConfig
