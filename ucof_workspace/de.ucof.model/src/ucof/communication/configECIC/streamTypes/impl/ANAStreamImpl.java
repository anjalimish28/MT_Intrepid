/**
 */
package ucof.communication.configECIC.streamTypes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.common.enums.SingleDirectionType;

import ucof.communication.configECIC.packageStrategyTypes.ANAPacketStrategy;

import ucof.communication.configECIC.streamTypes.ANAStream;
import ucof.communication.configECIC.streamTypes.StreamTypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ANA Stream</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.streamTypes.impl.ANAStreamImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link ucof.communication.configECIC.streamTypes.impl.ANAStreamImpl#getSampleMaxSizeBytes <em>Sample Max Size Bytes</em>}</li>
 *   <li>{@link ucof.communication.configECIC.streamTypes.impl.ANAStreamImpl#getAnaPacketStrategy <em>Ana Packet Strategy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ANAStreamImpl extends SuperStreamTypeImpl implements ANAStream {
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
	 * The cached value of the '{@link #getAnaPacketStrategy() <em>Ana Packet Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnaPacketStrategy()
	 * @generated
	 * @ordered
	 */
	protected ANAPacketStrategy anaPacketStrategy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ANAStreamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StreamTypesPackage.Literals.ANA_STREAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamTypesPackage.ANA_STREAM__DIRECTION, oldDirection, direction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamTypesPackage.ANA_STREAM__SAMPLE_MAX_SIZE_BYTES, oldSampleMaxSizeBytes, sampleMaxSizeBytes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ANAPacketStrategy getAnaPacketStrategy() {
		return anaPacketStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnaPacketStrategy(ANAPacketStrategy newAnaPacketStrategy, NotificationChain msgs) {
		ANAPacketStrategy oldAnaPacketStrategy = anaPacketStrategy;
		anaPacketStrategy = newAnaPacketStrategy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StreamTypesPackage.ANA_STREAM__ANA_PACKET_STRATEGY, oldAnaPacketStrategy, newAnaPacketStrategy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnaPacketStrategy(ANAPacketStrategy newAnaPacketStrategy) {
		if (newAnaPacketStrategy != anaPacketStrategy) {
			NotificationChain msgs = null;
			if (anaPacketStrategy != null)
				msgs = ((InternalEObject)anaPacketStrategy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StreamTypesPackage.ANA_STREAM__ANA_PACKET_STRATEGY, null, msgs);
			if (newAnaPacketStrategy != null)
				msgs = ((InternalEObject)newAnaPacketStrategy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StreamTypesPackage.ANA_STREAM__ANA_PACKET_STRATEGY, null, msgs);
			msgs = basicSetAnaPacketStrategy(newAnaPacketStrategy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamTypesPackage.ANA_STREAM__ANA_PACKET_STRATEGY, newAnaPacketStrategy, newAnaPacketStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StreamTypesPackage.ANA_STREAM__ANA_PACKET_STRATEGY:
				return basicSetAnaPacketStrategy(null, msgs);
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
			case StreamTypesPackage.ANA_STREAM__DIRECTION:
				return getDirection();
			case StreamTypesPackage.ANA_STREAM__SAMPLE_MAX_SIZE_BYTES:
				return getSampleMaxSizeBytes();
			case StreamTypesPackage.ANA_STREAM__ANA_PACKET_STRATEGY:
				return getAnaPacketStrategy();
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
			case StreamTypesPackage.ANA_STREAM__DIRECTION:
				setDirection((SingleDirectionType)newValue);
				return;
			case StreamTypesPackage.ANA_STREAM__SAMPLE_MAX_SIZE_BYTES:
				setSampleMaxSizeBytes((Integer)newValue);
				return;
			case StreamTypesPackage.ANA_STREAM__ANA_PACKET_STRATEGY:
				setAnaPacketStrategy((ANAPacketStrategy)newValue);
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
			case StreamTypesPackage.ANA_STREAM__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case StreamTypesPackage.ANA_STREAM__SAMPLE_MAX_SIZE_BYTES:
				setSampleMaxSizeBytes(SAMPLE_MAX_SIZE_BYTES_EDEFAULT);
				return;
			case StreamTypesPackage.ANA_STREAM__ANA_PACKET_STRATEGY:
				setAnaPacketStrategy((ANAPacketStrategy)null);
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
			case StreamTypesPackage.ANA_STREAM__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case StreamTypesPackage.ANA_STREAM__SAMPLE_MAX_SIZE_BYTES:
				return SAMPLE_MAX_SIZE_BYTES_EDEFAULT == null ? sampleMaxSizeBytes != null : !SAMPLE_MAX_SIZE_BYTES_EDEFAULT.equals(sampleMaxSizeBytes);
			case StreamTypesPackage.ANA_STREAM__ANA_PACKET_STRATEGY:
				return anaPacketStrategy != null;
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

} //ANAStreamImpl
