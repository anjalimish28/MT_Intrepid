/**
 */
package ucof.communication.configECIC.streamTypes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.common.enums.YesNoType;

import ucof.communication.configECIC.packageStrategyTypes.A825PacketStrategy;

import ucof.communication.configECIC.streamTypes.A825Stream;
import ucof.communication.configECIC.streamTypes.StreamTypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>A825 Stream</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.streamTypes.impl.A825StreamImpl#getA825PacketStrategy <em>A825 Packet Strategy</em>}</li>
 *   <li>{@link ucof.communication.configECIC.streamTypes.impl.A825StreamImpl#getErrors <em>Errors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class A825StreamImpl extends SuperStreamTypeImpl implements A825Stream {
	/**
	 * The cached value of the '{@link #getA825PacketStrategy() <em>A825 Packet Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA825PacketStrategy()
	 * @generated
	 * @ordered
	 */
	protected A825PacketStrategy a825PacketStrategy;

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
	protected A825StreamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StreamTypesPackage.Literals.A825_STREAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A825PacketStrategy getA825PacketStrategy() {
		return a825PacketStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetA825PacketStrategy(A825PacketStrategy newA825PacketStrategy, NotificationChain msgs) {
		A825PacketStrategy oldA825PacketStrategy = a825PacketStrategy;
		a825PacketStrategy = newA825PacketStrategy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StreamTypesPackage.A825_STREAM__A825_PACKET_STRATEGY, oldA825PacketStrategy, newA825PacketStrategy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setA825PacketStrategy(A825PacketStrategy newA825PacketStrategy) {
		if (newA825PacketStrategy != a825PacketStrategy) {
			NotificationChain msgs = null;
			if (a825PacketStrategy != null)
				msgs = ((InternalEObject)a825PacketStrategy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StreamTypesPackage.A825_STREAM__A825_PACKET_STRATEGY, null, msgs);
			if (newA825PacketStrategy != null)
				msgs = ((InternalEObject)newA825PacketStrategy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StreamTypesPackage.A825_STREAM__A825_PACKET_STRATEGY, null, msgs);
			msgs = basicSetA825PacketStrategy(newA825PacketStrategy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamTypesPackage.A825_STREAM__A825_PACKET_STRATEGY, newA825PacketStrategy, newA825PacketStrategy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StreamTypesPackage.A825_STREAM__ERRORS, oldErrors, errors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StreamTypesPackage.A825_STREAM__A825_PACKET_STRATEGY:
				return basicSetA825PacketStrategy(null, msgs);
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
			case StreamTypesPackage.A825_STREAM__A825_PACKET_STRATEGY:
				return getA825PacketStrategy();
			case StreamTypesPackage.A825_STREAM__ERRORS:
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
			case StreamTypesPackage.A825_STREAM__A825_PACKET_STRATEGY:
				setA825PacketStrategy((A825PacketStrategy)newValue);
				return;
			case StreamTypesPackage.A825_STREAM__ERRORS:
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
			case StreamTypesPackage.A825_STREAM__A825_PACKET_STRATEGY:
				setA825PacketStrategy((A825PacketStrategy)null);
				return;
			case StreamTypesPackage.A825_STREAM__ERRORS:
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
			case StreamTypesPackage.A825_STREAM__A825_PACKET_STRATEGY:
				return a825PacketStrategy != null;
			case StreamTypesPackage.A825_STREAM__ERRORS:
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
		result.append(" (errors: ");
		result.append(errors);
		result.append(')');
		return result.toString();
	}

} //A825StreamImpl
