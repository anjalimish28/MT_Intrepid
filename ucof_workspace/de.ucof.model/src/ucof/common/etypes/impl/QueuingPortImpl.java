/**
 */
package ucof.common.etypes.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.QueuingPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Queuing Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.common.etypes.impl.QueuingPortImpl#getMaxNumberOfMessages <em>Max Number Of Messages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueuingPortImpl extends SuperInterCommunicationPortTypeImpl implements QueuingPort {
	/**
	 * The default value of the '{@link #getMaxNumberOfMessages() <em>Max Number Of Messages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumberOfMessages()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_NUMBER_OF_MESSAGES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxNumberOfMessages() <em>Max Number Of Messages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumberOfMessages()
	 * @generated
	 * @ordered
	 */
	protected String maxNumberOfMessages = MAX_NUMBER_OF_MESSAGES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueuingPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EtypesPackage.Literals.QUEUING_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxNumberOfMessages() {
		return maxNumberOfMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxNumberOfMessages(String newMaxNumberOfMessages) {
		String oldMaxNumberOfMessages = maxNumberOfMessages;
		maxNumberOfMessages = newMaxNumberOfMessages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtypesPackage.QUEUING_PORT__MAX_NUMBER_OF_MESSAGES, oldMaxNumberOfMessages, maxNumberOfMessages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EtypesPackage.QUEUING_PORT__MAX_NUMBER_OF_MESSAGES:
				return getMaxNumberOfMessages();
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
			case EtypesPackage.QUEUING_PORT__MAX_NUMBER_OF_MESSAGES:
				setMaxNumberOfMessages((String)newValue);
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
			case EtypesPackage.QUEUING_PORT__MAX_NUMBER_OF_MESSAGES:
				setMaxNumberOfMessages(MAX_NUMBER_OF_MESSAGES_EDEFAULT);
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
			case EtypesPackage.QUEUING_PORT__MAX_NUMBER_OF_MESSAGES:
				return MAX_NUMBER_OF_MESSAGES_EDEFAULT == null ? maxNumberOfMessages != null : !MAX_NUMBER_OF_MESSAGES_EDEFAULT.equals(maxNumberOfMessages);
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
		result.append(" (maxNumberOfMessages: ");
		result.append(maxNumberOfMessages);
		result.append(')');
		return result.toString();
	}

} //QueuingPortImpl
