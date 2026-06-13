/**
 */
package ucof.communication.arinc429.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.communication.arinc429.A429Bus;
import ucof.communication.arinc429.Arinc429Package;
import ucof.communication.arinc429.ParityTypes;

import ucof.communication.impl.SuperCommunicationInterfaceTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>A429 Bus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.arinc429.impl.A429BusImpl#getParityType <em>Parity Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class A429BusImpl extends SuperCommunicationInterfaceTypeImpl implements A429Bus {
	/**
	 * The default value of the '{@link #getParityType() <em>Parity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParityType()
	 * @generated
	 * @ordered
	 */
	protected static final ParityTypes PARITY_TYPE_EDEFAULT = ParityTypes.NOT_SET;

	/**
	 * The cached value of the '{@link #getParityType() <em>Parity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParityType()
	 * @generated
	 * @ordered
	 */
	protected ParityTypes parityType = PARITY_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected A429BusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Arinc429Package.Literals.A429_BUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParityTypes getParityType() {
		return parityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParityType(ParityTypes newParityType) {
		ParityTypes oldParityType = parityType;
		parityType = newParityType == null ? PARITY_TYPE_EDEFAULT : newParityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Arinc429Package.A429_BUS__PARITY_TYPE, oldParityType, parityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Arinc429Package.A429_BUS__PARITY_TYPE:
				return getParityType();
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
			case Arinc429Package.A429_BUS__PARITY_TYPE:
				setParityType((ParityTypes)newValue);
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
			case Arinc429Package.A429_BUS__PARITY_TYPE:
				setParityType(PARITY_TYPE_EDEFAULT);
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
			case Arinc429Package.A429_BUS__PARITY_TYPE:
				return parityType != PARITY_TYPE_EDEFAULT;
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
		result.append(" (parityType: ");
		result.append(parityType);
		result.append(')');
		return result.toString();
	}

} //A429BusImpl
