/**
 */
package targets.cpn;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Can Driver Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targets.cpn.CanDriverConfig#getInterfaceID <em>Interface ID</em>}</li>
 *   <li>{@link targets.cpn.CanDriverConfig#getCanPeripheralInstance <em>Can Peripheral Instance</em>}</li>
 *   <li>{@link targets.cpn.CanDriverConfig#getOperatingMode <em>Operating Mode</em>}</li>
 *   <li>{@link targets.cpn.CanDriverConfig#isExtendedIdEnabled <em>Extended Id Enabled</em>}</li>
 *   <li>{@link targets.cpn.CanDriverConfig#getRingBufferSize <em>Ring Buffer Size</em>}</li>
 * </ul>
 *
 * @see targets.cpn.CpnPackage#getCanDriverConfig()
 * @model
 * @generated
 */
public interface CanDriverConfig extends SuperIdentifierType, SuperTrackingType {
	/**
	 * Returns the value of the '<em><b>Interface ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface ID</em>' attribute.
	 * @see #setInterfaceID(String)
	 * @see targets.cpn.CpnPackage#getCanDriverConfig_InterfaceID()
	 * @model dataType="ucof.common.edata.UUIDType"
	 * @generated
	 */
	String getInterfaceID();

	/**
	 * Sets the value of the '{@link targets.cpn.CanDriverConfig#getInterfaceID <em>Interface ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface ID</em>' attribute.
	 * @see #getInterfaceID()
	 * @generated
	 */
	void setInterfaceID(String value);

	/**
	 * Returns the value of the '<em><b>Can Peripheral Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Peripheral Instance</em>' attribute.
	 * @see #setCanPeripheralInstance(String)
	 * @see targets.cpn.CpnPackage#getCanDriverConfig_CanPeripheralInstance()
	 * @model
	 * @generated
	 */
	String getCanPeripheralInstance();

	/**
	 * Sets the value of the '{@link targets.cpn.CanDriverConfig#getCanPeripheralInstance <em>Can Peripheral Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Peripheral Instance</em>' attribute.
	 * @see #getCanPeripheralInstance()
	 * @generated
	 */
	void setCanPeripheralInstance(String value);

	/**
	 * Returns the value of the '<em><b>Operating Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link targets.cpn.CanOperatingMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operating Mode</em>' attribute.
	 * @see targets.cpn.CanOperatingMode
	 * @see #setOperatingMode(CanOperatingMode)
	 * @see targets.cpn.CpnPackage#getCanDriverConfig_OperatingMode()
	 * @model
	 * @generated
	 */
	CanOperatingMode getOperatingMode();

	/**
	 * Sets the value of the '{@link targets.cpn.CanDriverConfig#getOperatingMode <em>Operating Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operating Mode</em>' attribute.
	 * @see targets.cpn.CanOperatingMode
	 * @see #getOperatingMode()
	 * @generated
	 */
	void setOperatingMode(CanOperatingMode value);

	/**
	 * Returns the value of the '<em><b>Extended Id Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Id Enabled</em>' attribute.
	 * @see #setExtendedIdEnabled(boolean)
	 * @see targets.cpn.CpnPackage#getCanDriverConfig_ExtendedIdEnabled()
	 * @model
	 * @generated
	 */
	boolean isExtendedIdEnabled();

	/**
	 * Sets the value of the '{@link targets.cpn.CanDriverConfig#isExtendedIdEnabled <em>Extended Id Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Id Enabled</em>' attribute.
	 * @see #isExtendedIdEnabled()
	 * @generated
	 */
	void setExtendedIdEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Ring Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ring Buffer Size</em>' attribute.
	 * @see #setRingBufferSize(int)
	 * @see targets.cpn.CpnPackage#getCanDriverConfig_RingBufferSize()
	 * @model
	 * @generated
	 */
	int getRingBufferSize();

	/**
	 * Sets the value of the '{@link targets.cpn.CanDriverConfig#getRingBufferSize <em>Ring Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ring Buffer Size</em>' attribute.
	 * @see #getRingBufferSize()
	 * @generated
	 */
	void setRingBufferSize(int value);

} // CanDriverConfig
