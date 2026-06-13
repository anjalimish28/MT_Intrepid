/**
 */
package ucof.communication.arinc825.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.common.enums.booleanType;

import ucof.communication.arinc825.A825Message;
import ucof.communication.arinc825.Arinc825Package;
import ucof.communication.arinc825.DLC;

import ucof.communication.impl.SuperMessageTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>A825 Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.arinc825.impl.A825MessageImpl#getDLC <em>DLC</em>}</li>
 *   <li>{@link ucof.communication.arinc825.impl.A825MessageImpl#getCanID <em>Can ID</em>}</li>
 *   <li>{@link ucof.communication.arinc825.impl.A825MessageImpl#getCanFD <em>Can FD</em>}</li>
 * </ul>
 *
 * @generated
 */
public class A825MessageImpl extends SuperMessageTypeImpl implements A825Message {
	/**
	 * The default value of the '{@link #getDLC() <em>DLC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDLC()
	 * @generated
	 * @ordered
	 */
	protected static final DLC DLC_EDEFAULT = DLC.NOT_SET;

	/**
	 * The cached value of the '{@link #getDLC() <em>DLC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDLC()
	 * @generated
	 * @ordered
	 */
	protected DLC dLC = DLC_EDEFAULT;

	/**
	 * The default value of the '{@link #getCanID() <em>Can ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanID()
	 * @generated
	 * @ordered
	 */
	protected static final String CAN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCanID() <em>Can ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanID()
	 * @generated
	 * @ordered
	 */
	protected String canID = CAN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCanFD() <em>Can FD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanFD()
	 * @generated
	 * @ordered
	 */
	protected static final booleanType CAN_FD_EDEFAULT = booleanType.NOT_SET;

	/**
	 * The cached value of the '{@link #getCanFD() <em>Can FD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanFD()
	 * @generated
	 * @ordered
	 */
	protected booleanType canFD = CAN_FD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected A825MessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Arinc825Package.Literals.A825_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DLC getDLC() {
		return dLC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDLC(DLC newDLC) {
		DLC oldDLC = dLC;
		dLC = newDLC == null ? DLC_EDEFAULT : newDLC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Arinc825Package.A825_MESSAGE__DLC, oldDLC, dLC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCanID() {
		return canID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanID(String newCanID) {
		String oldCanID = canID;
		canID = newCanID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Arinc825Package.A825_MESSAGE__CAN_ID, oldCanID, canID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public booleanType getCanFD() {
		return canFD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanFD(booleanType newCanFD) {
		booleanType oldCanFD = canFD;
		canFD = newCanFD == null ? CAN_FD_EDEFAULT : newCanFD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Arinc825Package.A825_MESSAGE__CAN_FD, oldCanFD, canFD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Arinc825Package.A825_MESSAGE__DLC:
				return getDLC();
			case Arinc825Package.A825_MESSAGE__CAN_ID:
				return getCanID();
			case Arinc825Package.A825_MESSAGE__CAN_FD:
				return getCanFD();
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
			case Arinc825Package.A825_MESSAGE__DLC:
				setDLC((DLC)newValue);
				return;
			case Arinc825Package.A825_MESSAGE__CAN_ID:
				setCanID((String)newValue);
				return;
			case Arinc825Package.A825_MESSAGE__CAN_FD:
				setCanFD((booleanType)newValue);
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
			case Arinc825Package.A825_MESSAGE__DLC:
				setDLC(DLC_EDEFAULT);
				return;
			case Arinc825Package.A825_MESSAGE__CAN_ID:
				setCanID(CAN_ID_EDEFAULT);
				return;
			case Arinc825Package.A825_MESSAGE__CAN_FD:
				setCanFD(CAN_FD_EDEFAULT);
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
			case Arinc825Package.A825_MESSAGE__DLC:
				return dLC != DLC_EDEFAULT;
			case Arinc825Package.A825_MESSAGE__CAN_ID:
				return CAN_ID_EDEFAULT == null ? canID != null : !CAN_ID_EDEFAULT.equals(canID);
			case Arinc825Package.A825_MESSAGE__CAN_FD:
				return canFD != CAN_FD_EDEFAULT;
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
		result.append(" (dLC: ");
		result.append(dLC);
		result.append(", canID: ");
		result.append(canID);
		result.append(", canFD: ");
		result.append(canFD);
		result.append(')');
		return result.toString();
	}

} //A825MessageImpl
