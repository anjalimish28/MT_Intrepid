/**
 */
package ucof.communication.i2c.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.common.enums.SingleDirectionType;
import ucof.common.enums.booleanType;

import ucof.communication.i2c.I2CMessage;
import ucof.communication.i2c.I2CRegisterSpecification;
import ucof.communication.i2c.I2cPackage;

import ucof.communication.impl.SuperMessageTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>I2C Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.i2c.impl.I2CMessageImpl#getTargetAddress <em>Target Address</em>}</li>
 *   <li>{@link ucof.communication.i2c.impl.I2CMessageImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link ucof.communication.i2c.impl.I2CMessageImpl#getDataLengthBytes <em>Data Length Bytes</em>}</li>
 *   <li>{@link ucof.communication.i2c.impl.I2CMessageImpl#getRepeatedStart <em>Repeated Start</em>}</li>
 *   <li>{@link ucof.communication.i2c.impl.I2CMessageImpl#getRegisterPointerByte <em>Register Pointer Byte</em>}</li>
 *   <li>{@link ucof.communication.i2c.impl.I2CMessageImpl#getRegisterSpecification <em>Register Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class I2CMessageImpl extends SuperMessageTypeImpl implements I2CMessage {
	/**
	 * The default value of the '{@link #getTargetAddress() <em>Target Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetAddress() <em>Target Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetAddress()
	 * @generated
	 * @ordered
	 */
	protected String targetAddress = TARGET_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final SingleDirectionType DIRECTION_EDEFAULT = SingleDirectionType.NOT_SET;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected SingleDirectionType direction = DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataLengthBytes() <em>Data Length Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataLengthBytes()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DATA_LENGTH_BYTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataLengthBytes() <em>Data Length Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataLengthBytes()
	 * @generated
	 * @ordered
	 */
	protected Integer dataLengthBytes = DATA_LENGTH_BYTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepeatedStart() <em>Repeated Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatedStart()
	 * @generated
	 * @ordered
	 */
	protected static final booleanType REPEATED_START_EDEFAULT = booleanType.NOT_SET;

	/**
	 * The cached value of the '{@link #getRepeatedStart() <em>Repeated Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatedStart()
	 * @generated
	 * @ordered
	 */
	protected booleanType repeatedStart = REPEATED_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegisterPointerByte() <em>Register Pointer Byte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterPointerByte()
	 * @generated
	 * @ordered
	 */
	protected static final String REGISTER_POINTER_BYTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegisterPointerByte() <em>Register Pointer Byte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterPointerByte()
	 * @generated
	 * @ordered
	 */
	protected String registerPointerByte = REGISTER_POINTER_BYTE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRegisterSpecification() <em>Register Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterSpecification()
	 * @generated
	 * @ordered
	 */
	protected I2CRegisterSpecification registerSpecification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected I2CMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return I2cPackage.Literals.I2C_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetAddress() {
		return targetAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetAddress(String newTargetAddress) {
		String oldTargetAddress = targetAddress;
		targetAddress = newTargetAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, I2cPackage.I2C_MESSAGE__TARGET_ADDRESS, oldTargetAddress, targetAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleDirectionType getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(SingleDirectionType newDirection) {
		SingleDirectionType oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, I2cPackage.I2C_MESSAGE__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDataLengthBytes() {
		return dataLengthBytes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataLengthBytes(Integer newDataLengthBytes) {
		Integer oldDataLengthBytes = dataLengthBytes;
		dataLengthBytes = newDataLengthBytes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, I2cPackage.I2C_MESSAGE__DATA_LENGTH_BYTES, oldDataLengthBytes, dataLengthBytes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public booleanType getRepeatedStart() {
		return repeatedStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeatedStart(booleanType newRepeatedStart) {
		booleanType oldRepeatedStart = repeatedStart;
		repeatedStart = newRepeatedStart == null ? REPEATED_START_EDEFAULT : newRepeatedStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, I2cPackage.I2C_MESSAGE__REPEATED_START, oldRepeatedStart, repeatedStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegisterPointerByte() {
		return registerPointerByte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisterPointerByte(String newRegisterPointerByte) {
		String oldRegisterPointerByte = registerPointerByte;
		registerPointerByte = newRegisterPointerByte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, I2cPackage.I2C_MESSAGE__REGISTER_POINTER_BYTE, oldRegisterPointerByte, registerPointerByte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public I2CRegisterSpecification getRegisterSpecification() {
		return registerSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegisterSpecification(I2CRegisterSpecification newRegisterSpecification, NotificationChain msgs) {
		I2CRegisterSpecification oldRegisterSpecification = registerSpecification;
		registerSpecification = newRegisterSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, I2cPackage.I2C_MESSAGE__REGISTER_SPECIFICATION, oldRegisterSpecification, newRegisterSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisterSpecification(I2CRegisterSpecification newRegisterSpecification) {
		if (newRegisterSpecification != registerSpecification) {
			NotificationChain msgs = null;
			if (registerSpecification != null)
				msgs = ((InternalEObject)registerSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - I2cPackage.I2C_MESSAGE__REGISTER_SPECIFICATION, null, msgs);
			if (newRegisterSpecification != null)
				msgs = ((InternalEObject)newRegisterSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - I2cPackage.I2C_MESSAGE__REGISTER_SPECIFICATION, null, msgs);
			msgs = basicSetRegisterSpecification(newRegisterSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, I2cPackage.I2C_MESSAGE__REGISTER_SPECIFICATION, newRegisterSpecification, newRegisterSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case I2cPackage.I2C_MESSAGE__REGISTER_SPECIFICATION:
				return basicSetRegisterSpecification(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case I2cPackage.I2C_MESSAGE__TARGET_ADDRESS:
				return getTargetAddress();
			case I2cPackage.I2C_MESSAGE__DIRECTION:
				return getDirection();
			case I2cPackage.I2C_MESSAGE__DATA_LENGTH_BYTES:
				return getDataLengthBytes();
			case I2cPackage.I2C_MESSAGE__REPEATED_START:
				return getRepeatedStart();
			case I2cPackage.I2C_MESSAGE__REGISTER_POINTER_BYTE:
				return getRegisterPointerByte();
			case I2cPackage.I2C_MESSAGE__REGISTER_SPECIFICATION:
				return getRegisterSpecification();
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
			case I2cPackage.I2C_MESSAGE__TARGET_ADDRESS:
				setTargetAddress((String)newValue);
				return;
			case I2cPackage.I2C_MESSAGE__DIRECTION:
				setDirection((SingleDirectionType)newValue);
				return;
			case I2cPackage.I2C_MESSAGE__DATA_LENGTH_BYTES:
				setDataLengthBytes((Integer)newValue);
				return;
			case I2cPackage.I2C_MESSAGE__REPEATED_START:
				setRepeatedStart((booleanType)newValue);
				return;
			case I2cPackage.I2C_MESSAGE__REGISTER_POINTER_BYTE:
				setRegisterPointerByte((String)newValue);
				return;
			case I2cPackage.I2C_MESSAGE__REGISTER_SPECIFICATION:
				setRegisterSpecification((I2CRegisterSpecification)newValue);
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
			case I2cPackage.I2C_MESSAGE__TARGET_ADDRESS:
				setTargetAddress(TARGET_ADDRESS_EDEFAULT);
				return;
			case I2cPackage.I2C_MESSAGE__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case I2cPackage.I2C_MESSAGE__DATA_LENGTH_BYTES:
				setDataLengthBytes(DATA_LENGTH_BYTES_EDEFAULT);
				return;
			case I2cPackage.I2C_MESSAGE__REPEATED_START:
				setRepeatedStart(REPEATED_START_EDEFAULT);
				return;
			case I2cPackage.I2C_MESSAGE__REGISTER_POINTER_BYTE:
				setRegisterPointerByte(REGISTER_POINTER_BYTE_EDEFAULT);
				return;
			case I2cPackage.I2C_MESSAGE__REGISTER_SPECIFICATION:
				setRegisterSpecification((I2CRegisterSpecification)null);
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
			case I2cPackage.I2C_MESSAGE__TARGET_ADDRESS:
				return TARGET_ADDRESS_EDEFAULT == null ? targetAddress != null : !TARGET_ADDRESS_EDEFAULT.equals(targetAddress);
			case I2cPackage.I2C_MESSAGE__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case I2cPackage.I2C_MESSAGE__DATA_LENGTH_BYTES:
				return DATA_LENGTH_BYTES_EDEFAULT == null ? dataLengthBytes != null : !DATA_LENGTH_BYTES_EDEFAULT.equals(dataLengthBytes);
			case I2cPackage.I2C_MESSAGE__REPEATED_START:
				return repeatedStart != REPEATED_START_EDEFAULT;
			case I2cPackage.I2C_MESSAGE__REGISTER_POINTER_BYTE:
				return REGISTER_POINTER_BYTE_EDEFAULT == null ? registerPointerByte != null : !REGISTER_POINTER_BYTE_EDEFAULT.equals(registerPointerByte);
			case I2cPackage.I2C_MESSAGE__REGISTER_SPECIFICATION:
				return registerSpecification != null;
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
		result.append(" (targetAddress: ");
		result.append(targetAddress);
		result.append(", direction: ");
		result.append(direction);
		result.append(", dataLengthBytes: ");
		result.append(dataLengthBytes);
		result.append(", repeatedStart: ");
		result.append(repeatedStart);
		result.append(", registerPointerByte: ");
		result.append(registerPointerByte);
		result.append(')');
		return result.toString();
	}

} //I2CMessageImpl
