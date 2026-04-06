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

import ucof.communication.configECIC.packageStrategyTypes.A429PacketStrategy;

import ucof.communication.configECIC.streamTypes.A429Stream;
import ucof.communication.configECIC.streamTypes.StreamTypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>A429 Stream</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.streamTypes.impl.A429StreamImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link ucof.communication.configECIC.streamTypes.impl.A429StreamImpl#getA429PacketStrategy <em>A429 Packet Strategy</em>}</li>
 *   <li>{@link ucof.communication.configECIC.streamTypes.impl.A429StreamImpl#getErrors <em>Errors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class A429StreamImpl extends SuperStreamTypeImpl implements A429Stream {
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
	 * The cached value of the '{@link #getA429PacketStrategy() <em>A429 Packet Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA429PacketStrategy()
	 * @generated
	 * @ordered
	 */
	protected A429PacketStrategy a429PacketStrategy;

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
	protected A429StreamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StreamTypesPackage.Literals.A429_STREAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamTypesPackage.A429_STREAM__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A429PacketStrategy getA429PacketStrategy() {
		return a429PacketStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetA429PacketStrategy(A429PacketStrategy newA429PacketStrategy, NotificationChain msgs) {
		A429PacketStrategy oldA429PacketStrategy = a429PacketStrategy;
		a429PacketStrategy = newA429PacketStrategy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StreamTypesPackage.A429_STREAM__A429_PACKET_STRATEGY, oldA429PacketStrategy, newA429PacketStrategy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setA429PacketStrategy(A429PacketStrategy newA429PacketStrategy) {
		if (newA429PacketStrategy != a429PacketStrategy) {
			NotificationChain msgs = null;
			if (a429PacketStrategy != null)
				msgs = ((InternalEObject)a429PacketStrategy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StreamTypesPackage.A429_STREAM__A429_PACKET_STRATEGY, null, msgs);
			if (newA429PacketStrategy != null)
				msgs = ((InternalEObject)newA429PacketStrategy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StreamTypesPackage.A429_STREAM__A429_PACKET_STRATEGY, null, msgs);
			msgs = basicSetA429PacketStrategy(newA429PacketStrategy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamTypesPackage.A429_STREAM__A429_PACKET_STRATEGY, newA429PacketStrategy, newA429PacketStrategy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamTypesPackage.A429_STREAM__ERRORS, oldErrors, errors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StreamTypesPackage.A429_STREAM__A429_PACKET_STRATEGY:
				return basicSetA429PacketStrategy(null, msgs);
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
			case StreamTypesPackage.A429_STREAM__DIRECTION:
				return getDirection();
			case StreamTypesPackage.A429_STREAM__A429_PACKET_STRATEGY:
				return getA429PacketStrategy();
			case StreamTypesPackage.A429_STREAM__ERRORS:
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
			case StreamTypesPackage.A429_STREAM__DIRECTION:
				setDirection((SingleDirectionType)newValue);
				return;
			case StreamTypesPackage.A429_STREAM__A429_PACKET_STRATEGY:
				setA429PacketStrategy((A429PacketStrategy)newValue);
				return;
			case StreamTypesPackage.A429_STREAM__ERRORS:
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
			case StreamTypesPackage.A429_STREAM__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case StreamTypesPackage.A429_STREAM__A429_PACKET_STRATEGY:
				setA429PacketStrategy((A429PacketStrategy)null);
				return;
			case StreamTypesPackage.A429_STREAM__ERRORS:
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
			case StreamTypesPackage.A429_STREAM__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case StreamTypesPackage.A429_STREAM__A429_PACKET_STRATEGY:
				return a429PacketStrategy != null;
			case StreamTypesPackage.A429_STREAM__ERRORS:
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
		result.append(", errors: ");
		result.append(errors);
		result.append(')');
		return result.toString();
	}

} //A429StreamImpl
