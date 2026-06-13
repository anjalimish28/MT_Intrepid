/**
 */
package ucof.communication.configECIC.packageStrategyTypes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ucof.common.enums.SingleDirectionType;

import ucof.communication.configECIC.packageStrategyTypes.A429PacketStrategy;
import ucof.communication.configECIC.packageStrategyTypes.Gap;
import ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesPackage;
import ucof.communication.configECIC.packageStrategyTypes.TriggerWords;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>A429 Packet Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.impl.A429PacketStrategyImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.impl.A429PacketStrategyImpl#getGap <em>Gap</em>}</li>
 *   <li>{@link ucof.communication.configECIC.packageStrategyTypes.impl.A429PacketStrategyImpl#getTriggerWords <em>Trigger Words</em>}</li>
 * </ul>
 *
 * @generated
 */
public class A429PacketStrategyImpl extends SuperPacketStrategyTypeImpl implements A429PacketStrategy {
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
	 * The cached value of the '{@link #getGap() <em>Gap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGap()
	 * @generated
	 * @ordered
	 */
	protected Gap gap;

	/**
	 * The cached value of the '{@link #getTriggerWords() <em>Trigger Words</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerWords()
	 * @generated
	 * @ordered
	 */
	protected EList<TriggerWords> triggerWords;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected A429PacketStrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PackageStrategyTypesPackage.Literals.A429_PACKET_STRATEGY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PackageStrategyTypesPackage.A429_PACKET_STRATEGY__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gap getGap() {
		return gap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGap(Gap newGap, NotificationChain msgs) {
		Gap oldGap = gap;
		gap = newGap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackageStrategyTypesPackage.A429_PACKET_STRATEGY__GAP, oldGap, newGap);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGap(Gap newGap) {
		if (newGap != gap) {
			NotificationChain msgs = null;
			if (gap != null)
				msgs = ((InternalEObject)gap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackageStrategyTypesPackage.A429_PACKET_STRATEGY__GAP, null, msgs);
			if (newGap != null)
				msgs = ((InternalEObject)newGap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackageStrategyTypesPackage.A429_PACKET_STRATEGY__GAP, null, msgs);
			msgs = basicSetGap(newGap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackageStrategyTypesPackage.A429_PACKET_STRATEGY__GAP, newGap, newGap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TriggerWords> getTriggerWords() {
		if (triggerWords == null) {
			triggerWords = new EObjectContainmentEList<TriggerWords>(TriggerWords.class, this, PackageStrategyTypesPackage.A429_PACKET_STRATEGY__TRIGGER_WORDS);
		}
		return triggerWords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PackageStrategyTypesPackage.A429_PACKET_STRATEGY__GAP:
				return basicSetGap(null, msgs);
			case PackageStrategyTypesPackage.A429_PACKET_STRATEGY__TRIGGER_WORDS:
				return ((InternalEList<?>)getTriggerWords()).basicRemove(otherEnd, msgs);
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
			case PackageStrategyTypesPackage.A429_PACKET_STRATEGY__DIRECTION:
				return getDirection();
			case PackageStrategyTypesPackage.A429_PACKET_STRATEGY__GAP:
				return getGap();
			case PackageStrategyTypesPackage.A429_PACKET_STRATEGY__TRIGGER_WORDS:
				return getTriggerWords();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PackageStrategyTypesPackage.A429_PACKET_STRATEGY__DIRECTION:
				setDirection((SingleDirectionType)newValue);
				return;
			case PackageStrategyTypesPackage.A429_PACKET_STRATEGY__GAP:
				setGap((Gap)newValue);
				return;
			case PackageStrategyTypesPackage.A429_PACKET_STRATEGY__TRIGGER_WORDS:
				getTriggerWords().clear();
				getTriggerWords().addAll((Collection<? extends TriggerWords>)newValue);
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
			case PackageStrategyTypesPackage.A429_PACKET_STRATEGY__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case PackageStrategyTypesPackage.A429_PACKET_STRATEGY__GAP:
				setGap((Gap)null);
				return;
			case PackageStrategyTypesPackage.A429_PACKET_STRATEGY__TRIGGER_WORDS:
				getTriggerWords().clear();
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
			case PackageStrategyTypesPackage.A429_PACKET_STRATEGY__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case PackageStrategyTypesPackage.A429_PACKET_STRATEGY__GAP:
				return gap != null;
			case PackageStrategyTypesPackage.A429_PACKET_STRATEGY__TRIGGER_WORDS:
				return triggerWords != null && !triggerWords.isEmpty();
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
		result.append(" (Direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //A429PacketStrategyImpl
