/**
 */
package ucof.communication.basedonethernet.arinc664.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.communication.basedonethernet.arinc664.A664VirtualLinkIn;
import ucof.communication.basedonethernet.arinc664.Arinc664Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>A664 Virtual Link In</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.basedonethernet.arinc664.impl.A664VirtualLinkInImpl#getMaxSkew <em>Max Skew</em>}</li>
 * </ul>
 *
 * @generated
 */
public class A664VirtualLinkInImpl extends A664VirtualLinkSuperImpl implements A664VirtualLinkIn {
	/**
	 * The default value of the '{@link #getMaxSkew() <em>Max Skew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSkew()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_SKEW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxSkew() <em>Max Skew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSkew()
	 * @generated
	 * @ordered
	 */
	protected String maxSkew = MAX_SKEW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected A664VirtualLinkInImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Arinc664Package.Literals.A664_VIRTUAL_LINK_IN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxSkew() {
		return maxSkew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxSkew(String newMaxSkew) {
		String oldMaxSkew = maxSkew;
		maxSkew = newMaxSkew;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Arinc664Package.A664_VIRTUAL_LINK_IN__MAX_SKEW, oldMaxSkew, maxSkew));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Arinc664Package.A664_VIRTUAL_LINK_IN__MAX_SKEW:
				return getMaxSkew();
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
			case Arinc664Package.A664_VIRTUAL_LINK_IN__MAX_SKEW:
				setMaxSkew((String)newValue);
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
			case Arinc664Package.A664_VIRTUAL_LINK_IN__MAX_SKEW:
				setMaxSkew(MAX_SKEW_EDEFAULT);
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
			case Arinc664Package.A664_VIRTUAL_LINK_IN__MAX_SKEW:
				return MAX_SKEW_EDEFAULT == null ? maxSkew != null : !MAX_SKEW_EDEFAULT.equals(maxSkew);
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
		result.append(" (maxSkew: ");
		result.append(maxSkew);
		result.append(')');
		return result.toString();
	}

} //A664VirtualLinkInImpl
