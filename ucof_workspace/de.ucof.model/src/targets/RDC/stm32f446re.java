/**
 */
package targets.rdc;

import targets.SuperTargetType;

import targets.intrepidgateway.MsgBoxExtension;

import targets.powergrid.SuperPowerType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>stm32f446re</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.rdc.stm32f446re#getSize <em>Size</em>}</li>
 *   <li>{@link targets.rdc.stm32f446re#getPorts <em>Ports</em>}</li>
 *   <li>{@link targets.rdc.stm32f446re#getStmTimingConfig <em>Stm Timing Config</em>}</li>
 *   <li>{@link targets.rdc.stm32f446re#getMsgBoxExtension <em>Msg Box Extension</em>}</li>
 * </ul>
 *
 * @see targets.rdc.RdcPackage#getstm32f446re()
 * @model
 * @generated
 */
public interface stm32f446re extends SuperPowerType, SuperTargetType {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(String)
	 * @see targets.rdc.RdcPackage#getstm32f446re_Size()
	 * @model
	 * @generated
	 */
	String getSize();

	/**
	 * Sets the value of the '{@link targets.rdc.stm32f446re#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(String value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference.
	 * @see #setPorts(stmPorts)
	 * @see targets.rdc.RdcPackage#getstm32f446re_Ports()
	 * @model containment="true"
	 * @generated
	 */
	stmPorts getPorts();

	/**
	 * Sets the value of the '{@link targets.rdc.stm32f446re#getPorts <em>Ports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ports</em>' containment reference.
	 * @see #getPorts()
	 * @generated
	 */
	void setPorts(stmPorts value);

	/**
	 * Returns the value of the '<em><b>Stm Timing Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stm Timing Config</em>' containment reference.
	 * @see #setStmTimingConfig(stmTimingConfig)
	 * @see targets.rdc.RdcPackage#getstm32f446re_StmTimingConfig()
	 * @model containment="true"
	 * @generated
	 */
	stmTimingConfig getStmTimingConfig();

	/**
	 * Sets the value of the '{@link targets.rdc.stm32f446re#getStmTimingConfig <em>Stm Timing Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stm Timing Config</em>' containment reference.
	 * @see #getStmTimingConfig()
	 * @generated
	 */
	void setStmTimingConfig(stmTimingConfig value);

	/**
	 * Returns the value of the '<em><b>Msg Box Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg Box Extension</em>' containment reference.
	 * @see #setMsgBoxExtension(MsgBoxExtension)
	 * @see targets.rdc.RdcPackage#getstm32f446re_MsgBoxExtension()
	 * @model containment="true"
	 * @generated
	 */
	MsgBoxExtension getMsgBoxExtension();

	/**
	 * Sets the value of the '{@link targets.rdc.stm32f446re#getMsgBoxExtension <em>Msg Box Extension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msg Box Extension</em>' containment reference.
	 * @see #getMsgBoxExtension()
	 * @generated
	 */
	void setMsgBoxExtension(MsgBoxExtension value);

} // stm32f446re
