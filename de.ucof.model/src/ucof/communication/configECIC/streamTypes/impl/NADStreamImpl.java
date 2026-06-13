/**
 */
package ucof.communication.configECIC.streamTypes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.common.enums.SingleDirectionType;

import ucof.communication.configECIC.packageStrategyTypes.NADPacketStrategy;

import ucof.communication.configECIC.streamTypes.NADStream;
import ucof.communication.configECIC.streamTypes.StreamTypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NAD Stream</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.streamTypes.impl.NADStreamImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link ucof.communication.configECIC.streamTypes.impl.NADStreamImpl#getSampleMaxSizeBytes <em>Sample Max Size Bytes</em>}</li>
 *   <li>{@link ucof.communication.configECIC.streamTypes.impl.NADStreamImpl#getNadPacketStrategy <em>Nad Packet Strategy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NADStreamImpl extends SuperStreamTypeImpl implements NADStream {
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
	protected static final Integer SAMPLE_MAX_SIZE_BYTES_EDEFAULT = new Integer(0);

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
	 * The cached value of the '{@link #getNadPacketStrategy() <em>Nad Packet Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNadPacketStrategy()
	 * @generated
	 * @ordered
	 */
	protected NADPacketStrategy nadPacketStrategy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NADStreamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StreamTypesPackage.Literals.NAD_STREAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamTypesPackage.NAD_STREAM__DIRECTION, oldDirection, direction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamTypesPackage.NAD_STREAM__SAMPLE_MAX_SIZE_BYTES, oldSampleMaxSizeBytes, sampleMaxSizeBytes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NADPacketStrategy getNadPacketStrategy() {
		return nadPacketStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNadPacketStrategy(NADPacketStrategy newNadPacketStrategy, NotificationChain msgs) {
		NADPacketStrategy oldNadPacketStrategy = nadPacketStrategy;
		nadPacketStrategy = newNadPacketStrategy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StreamTypesPackage.NAD_STREAM__NAD_PACKET_STRATEGY, oldNadPacketStrategy, newNadPacketStrategy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNadPacketStrategy(NADPacketStrategy newNadPacketStrategy) {
		if (newNadPacketStrategy != nadPacketStrategy) {
			NotificationChain msgs = null;
			if (nadPacketStrategy != null)
				msgs = ((InternalEObject)nadPacketStrategy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StreamTypesPackage.NAD_STREAM__NAD_PACKET_STRATEGY, null, msgs);
			if (newNadPacketStrategy != null)
				msgs = ((InternalEObject)newNadPacketStrategy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StreamTypesPackage.NAD_STREAM__NAD_PACKET_STRATEGY, null, msgs);
			msgs = basicSetNadPacketStrategy(newNadPacketStrategy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamTypesPackage.NAD_STREAM__NAD_PACKET_STRATEGY, newNadPacketStrategy, newNadPacketStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StreamTypesPackage.NAD_STREAM__NAD_PACKET_STRATEGY:
				return basicSetNadPacketStrategy(null, msgs);
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
			case StreamTypesPackage.NAD_STREAM__DIRECTION:
				return getDirection();
			case StreamTypesPackage.NAD_STREAM__SAMPLE_MAX_SIZE_BYTES:
				return getSampleMaxSizeBytes();
			case StreamTypesPackage.NAD_STREAM__NAD_PACKET_STRATEGY:
				return getNadPacketStrategy();
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
			case StreamTypesPackage.NAD_STREAM__DIRECTION:
				setDirection((SingleDirectionType)newValue);
				return;
			case StreamTypesPackage.NAD_STREAM__SAMPLE_MAX_SIZE_BYTES:
				setSampleMaxSizeBytes((Integer)newValue);
				return;
			case StreamTypesPackage.NAD_STREAM__NAD_PACKET_STRATEGY:
				setNadPacketStrategy((NADPacketStrategy)newValue);
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
			case StreamTypesPackage.NAD_STREAM__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case StreamTypesPackage.NAD_STREAM__SAMPLE_MAX_SIZE_BYTES:
				setSampleMaxSizeBytes(SAMPLE_MAX_SIZE_BYTES_EDEFAULT);
				return;
			case StreamTypesPackage.NAD_STREAM__NAD_PACKET_STRATEGY:
				setNadPacketStrategy((NADPacketStrategy)null);
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
			case StreamTypesPackage.NAD_STREAM__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case StreamTypesPackage.NAD_STREAM__SAMPLE_MAX_SIZE_BYTES:
				return SAMPLE_MAX_SIZE_BYTES_EDEFAULT == null ? sampleMaxSizeBytes != null : !SAMPLE_MAX_SIZE_BYTES_EDEFAULT.equals(sampleMaxSizeBytes);
			case StreamTypesPackage.NAD_STREAM__NAD_PACKET_STRATEGY:
				return nadPacketStrategy != null;
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
		result.append(')');
		return result.toString();
	}

} //NADStreamImpl
