/**
 */
package targets.avip.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import targets.avip.AvipPackage;
import targets.avip.MEMPortIDExtension;

import targets.impl.SuperAssignmentSpecificationTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MEM Port ID Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.avip.impl.MEMPortIDExtensionImpl#getPortID <em>Port ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MEMPortIDExtensionImpl extends SuperAssignmentSpecificationTypeImpl implements MEMPortIDExtension {
	/**
	 * The default value of the '{@link #getPortID() <em>Port ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortID()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPortID() <em>Port ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortID()
	 * @generated
	 * @ordered
	 */
	protected int portID = PORT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MEMPortIDExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AvipPackage.Literals.MEM_PORT_ID_EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPortID() {
		return portID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortID(int newPortID) {
		int oldPortID = portID;
		portID = newPortID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.MEM_PORT_ID_EXTENSION__PORT_ID, oldPortID, portID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AvipPackage.MEM_PORT_ID_EXTENSION__PORT_ID:
				return getPortID();
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
			case AvipPackage.MEM_PORT_ID_EXTENSION__PORT_ID:
				setPortID((Integer)newValue);
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
			case AvipPackage.MEM_PORT_ID_EXTENSION__PORT_ID:
				setPortID(PORT_ID_EDEFAULT);
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
			case AvipPackage.MEM_PORT_ID_EXTENSION__PORT_ID:
				return portID != PORT_ID_EDEFAULT;
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
		result.append(" (portID: ");
		result.append(portID);
		result.append(')');
		return result.toString();
	}

} //MEMPortIDExtensionImpl
