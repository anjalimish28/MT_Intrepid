/**
 */
package targets.cpn;

import targets.SuperTargetType;

import targets.intrepidgateway.MsgBoxExtension;

import targets.powergrid.SuperPowerType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>va41620peb1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.cpn.va41620peb1#getPorts <em>Ports</em>}</li>
 *   <li>{@link targets.cpn.va41620peb1#getMsgBoxExtension <em>Msg Box Extension</em>}</li>
 *   <li>{@link targets.cpn.va41620peb1#getCanDriverConfig <em>Can Driver Config</em>}</li>
 * </ul>
 *
 * @see targets.cpn.CpnPackage#getva41620peb1()
 * @model
 * @generated
 */
public interface va41620peb1 extends SuperTargetType, SuperPowerType {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference.
	 * @see #setPorts(voragoPorts)
	 * @see targets.cpn.CpnPackage#getva41620peb1_Ports()
	 * @model containment="true"
	 * @generated
	 */
	voragoPorts getPorts();

	/**
	 * Sets the value of the '{@link targets.cpn.va41620peb1#getPorts <em>Ports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ports</em>' containment reference.
	 * @see #getPorts()
	 * @generated
	 */
	void setPorts(voragoPorts value);

	/**
	 * Returns the value of the '<em><b>Msg Box Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg Box Extension</em>' containment reference.
	 * @see #setMsgBoxExtension(MsgBoxExtension)
	 * @see targets.cpn.CpnPackage#getva41620peb1_MsgBoxExtension()
	 * @model containment="true"
	 * @generated
	 */
	MsgBoxExtension getMsgBoxExtension();

	/**
	 * Sets the value of the '{@link targets.cpn.va41620peb1#getMsgBoxExtension <em>Msg Box Extension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msg Box Extension</em>' containment reference.
	 * @see #getMsgBoxExtension()
	 * @generated
	 */
	void setMsgBoxExtension(MsgBoxExtension value);

	/**
	 * Returns the value of the '<em><b>Can Driver Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Driver Config</em>' containment reference.
	 * @see #setCanDriverConfig(CanDriverConfig)
	 * @see targets.cpn.CpnPackage#getva41620peb1_CanDriverConfig()
	 * @model containment="true"
	 * @generated
	 */
	CanDriverConfig getCanDriverConfig();

	/**
	 * Sets the value of the '{@link targets.cpn.va41620peb1#getCanDriverConfig <em>Can Driver Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Driver Config</em>' containment reference.
	 * @see #getCanDriverConfig()
	 * @generated
	 */
	void setCanDriverConfig(CanDriverConfig value);

} // va41620peb1
