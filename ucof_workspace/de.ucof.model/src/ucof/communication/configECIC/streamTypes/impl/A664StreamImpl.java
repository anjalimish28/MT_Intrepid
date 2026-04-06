/**
 */
package ucof.communication.configECIC.streamTypes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.common.enums.SingleDirectionType;
import ucof.common.enums.YesNoType;

import ucof.communication.configECIC.packageStrategyTypes.A664PacketStrategy;

import ucof.communication.configECIC.streamTypes.A664Stream;
import ucof.communication.configECIC.streamTypes.StreamTypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>A664 Stream</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.streamTypes.impl.A664StreamImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link ucof.communication.configECIC.streamTypes.impl.A664StreamImpl#getSampleMaxSizeBytes <em>Sample Max Size Bytes</em>}</li>
 *   <li>{@link ucof.communication.configECIC.streamTypes.impl.A664StreamImpl#getA664PacketStrategy <em>A664 Packet Strategy</em>}</li>
 *   <li>{@link ucof.communication.configECIC.streamTypes.impl.A664StreamImpl#getErrors <em>Errors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class A664StreamImpl extends SuperStreamTypeImpl implements A664Stream {
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
	 * The default value of the '{@link #getSampleMaxSizeBytes() <em>Sample Max Size Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleMaxSizeBytes()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SAMPLE_MAX_SIZE_BYTES_EDEFAULT = new Integer(1471);

	/**
	 * The cached value of the '{@link #getSampleMaxSizeBytes() <em>Sample Max Size Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleMaxSizeBytes()
	 * @generated
	 * @ordered
	 */
	protected Integer sampleMaxSizeBytes = SAMPLE_MAX_SIZE_BYTES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getA664PacketStrategy() <em>A664 Packet Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA664PacketStrategy()
	 * @generated
	 * @ordered
	 */
	protected A664PacketStrategy a664PacketStrategy;

	/**
	 * The default value of the '{@link #getErrors() <em>Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrors()
	 * @generated
	 * @ordered
	 */
	protected static final YesNoType ERRORS_EDEFAULT = YesNoType.NOT_SET;

	/**
	 * The cached value of the '{@link #getErrors() <em>Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrors()
	 * @generated
	 * @ordered
	 */
	protected YesNoType errors = ERRORS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected A664StreamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StreamTypesPackage.Literals.A664_STREAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamTypesPackage.A664_STREAM__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSampleMaxSizeBytes() {
		return sampleMaxSizeBytes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSampleMaxSizeBytes(Integer newSampleMaxSizeBytes) {
		Integer oldSampleMaxSizeBytes = sampleMaxSizeBytes;
		sampleMaxSizeBytes = newSampleMaxSizeBytes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamTypesPackage.A664_STREAM__SAMPLE_MAX_SIZE_BYTES, oldSampleMaxSizeBytes, sampleMaxSizeBytes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A664PacketStrategy getA664PacketStrategy() {
		return a664PacketStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetA664PacketStrategy(A664PacketStrategy newA664PacketStrategy, NotificationChain msgs) {
		A664PacketStrategy oldA664PacketStrategy = a664PacketStrategy;
		a664PacketStrategy = newA664PacketStrategy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StreamTypesPackage.A664_STREAM__A664_PACKET_STRATEGY, oldA664PacketStrategy, newA664PacketStrategy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setA664PacketStrategy(A664PacketStrategy newA664PacketStrategy) {
		if (newA664PacketStrategy != a664PacketStrategy) {
			NotificationChain msgs = null;
			if (a664PacketStrategy != null)
				msgs = ((InternalEObject)a664PacketStrategy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StreamTypesPackage.A664_STREAM__A664_PACKET_STRATEGY, null, msgs);
			if (newA664PacketStrategy != null)
				msgs = ((InternalEObject)newA664PacketStrategy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StreamTypesPackage.A664_STREAM__A664_PACKET_STRATEGY, null, msgs);
			msgs = basicSetA664PacketStrategy(newA664PacketStrategy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamTypesPackage.A664_STREAM__A664_PACKET_STRATEGY, newA664PacketStrategy, newA664PacketStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YesNoType getErrors() {
		return errors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrors(YesNoType newErrors) {
		YesNoType oldErrors = errors;
		errors = newErrors == null ? ERRORS_EDEFAULT : newErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamTypesPackage.A664_STREAM__ERRORS, oldErrors, errors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StreamTypesPackage.A664_STREAM__A664_PACKET_STRATEGY:
				return basicSetA664PacketStrategy(null, msgs);
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
			case StreamTypesPackage.A664_STREAM__DIRECTION:
				return getDirection();
			case StreamTypesPackage.A664_STREAM__SAMPLE_MAX_SIZE_BYTES:
				return getSampleMaxSizeBytes();
			case StreamTypesPackage.A664_STREAM__A664_PACKET_STRATEGY:
				return getA664PacketStrategy();
			case StreamTypesPackage.A664_STREAM__ERRORS:
				return getErrors();
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
			case StreamTypesPackage.A664_STREAM__DIRECTION:
				setDirection((SingleDirectionType)newValue);
				return;
			case StreamTypesPackage.A664_STREAM__SAMPLE_MAX_SIZE_BYTES:
				setSampleMaxSizeBytes((Integer)newValue);
				return;
			case StreamTypesPackage.A664_STREAM__A664_PACKET_STRATEGY:
				setA664PacketStrategy((A664PacketStrategy)newValue);
				return;
			case StreamTypesPackage.A664_STREAM__ERRORS:
				setErrors((YesNoType)newValue);
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
			case StreamTypesPackage.A664_STREAM__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case StreamTypesPackage.A664_STREAM__SAMPLE_MAX_SIZE_BYTES:
				setSampleMaxSizeBytes(SAMPLE_MAX_SIZE_BYTES_EDEFAULT);
				return;
			case StreamTypesPackage.A664_STREAM__A664_PACKET_STRATEGY:
				setA664PacketStrategy((A664PacketStrategy)null);
				return;
			case StreamTypesPackage.A664_STREAM__ERRORS:
				setErrors(ERRORS_EDEFAULT);
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
			case StreamTypesPackage.A664_STREAM__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case StreamTypesPackage.A664_STREAM__SAMPLE_MAX_SIZE_BYTES:
				return SAMPLE_MAX_SIZE_BYTES_EDEFAULT == null ? sampleMaxSizeBytes != null : !SAMPLE_MAX_SIZE_BYTES_EDEFAULT.equals(sampleMaxSizeBytes);
			case StreamTypesPackage.A664_STREAM__A664_PACKET_STRATEGY:
				return a664PacketStrategy != null;
			case StreamTypesPackage.A664_STREAM__ERRORS:
				return errors != ERRORS_EDEFAULT;
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
		result.append(" (direction: ");
		result.append(direction);
		result.append(", sampleMaxSizeBytes: ");
		result.append(sampleMaxSizeBytes);
		result.append(", errors: ");
		result.append(errors);
		result.append(')');
		return result.toString();
	}

} //A664StreamImpl
