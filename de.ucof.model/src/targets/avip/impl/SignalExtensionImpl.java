/**
 */
package targets.avip.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import targets.avip.AvipPackage;
import targets.avip.SignalExtension;

import targets.impl.SuperClassExtensionTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.avip.impl.SignalExtensionImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link targets.avip.impl.SignalExtensionImpl#getAssociatedLineName <em>Associated Line Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignalExtensionImpl extends SuperClassExtensionTypeImpl implements SignalExtension {
	/**
	 * The default value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected String function = FUNCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssociatedLineName() <em>Associated Line Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedLineName()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSOCIATED_LINE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssociatedLineName() <em>Associated Line Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedLineName()
	 * @generated
	 * @ordered
	 */
	protected String associatedLineName = ASSOCIATED_LINE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AvipPackage.Literals.SIGNAL_EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(String newFunction) {
		String oldFunction = function;
		function = newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.SIGNAL_EXTENSION__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssociatedLineName() {
		return associatedLineName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociatedLineName(String newAssociatedLineName) {
		String oldAssociatedLineName = associatedLineName;
		associatedLineName = newAssociatedLineName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AvipPackage.SIGNAL_EXTENSION__ASSOCIATED_LINE_NAME, oldAssociatedLineName, associatedLineName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AvipPackage.SIGNAL_EXTENSION__FUNCTION:
				return getFunction();
			case AvipPackage.SIGNAL_EXTENSION__ASSOCIATED_LINE_NAME:
				return getAssociatedLineName();
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
			case AvipPackage.SIGNAL_EXTENSION__FUNCTION:
				setFunction((String)newValue);
				return;
			case AvipPackage.SIGNAL_EXTENSION__ASSOCIATED_LINE_NAME:
				setAssociatedLineName((String)newValue);
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
			case AvipPackage.SIGNAL_EXTENSION__FUNCTION:
				setFunction(FUNCTION_EDEFAULT);
				return;
			case AvipPackage.SIGNAL_EXTENSION__ASSOCIATED_LINE_NAME:
				setAssociatedLineName(ASSOCIATED_LINE_NAME_EDEFAULT);
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
			case AvipPackage.SIGNAL_EXTENSION__FUNCTION:
				return FUNCTION_EDEFAULT == null ? function != null : !FUNCTION_EDEFAULT.equals(function);
			case AvipPackage.SIGNAL_EXTENSION__ASSOCIATED_LINE_NAME:
				return ASSOCIATED_LINE_NAME_EDEFAULT == null ? associatedLineName != null : !ASSOCIATED_LINE_NAME_EDEFAULT.equals(associatedLineName);
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
		result.append(" (function: ");
		result.append(function);
		result.append(", associatedLineName: ");
		result.append(associatedLineName);
		result.append(')');
		return result.toString();
	}

} //SignalExtensionImpl
