/**
 */
package targets.configdesk.dSpaceArinc825.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import targets.configdesk.dSpaceArinc825.DSpaceArinc825Package;
import targets.configdesk.dSpaceArinc825.FeatureRawData;

import ucof.common.enums.booleanType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Raw Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.configdesk.dSpaceArinc825.impl.FeatureRawDataImpl#getRawDataModelAccess <em>Raw Data Model Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureRawDataImpl extends SuperFeatureTypeImpl implements FeatureRawData {
	/**
	 * The default value of the '{@link #getRawDataModelAccess() <em>Raw Data Model Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRawDataModelAccess()
	 * @generated
	 * @ordered
	 */
	protected static final booleanType RAW_DATA_MODEL_ACCESS_EDEFAULT = booleanType.NOT_SET;

	/**
	 * The cached value of the '{@link #getRawDataModelAccess() <em>Raw Data Model Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRawDataModelAccess()
	 * @generated
	 * @ordered
	 */
	protected booleanType rawDataModelAccess = RAW_DATA_MODEL_ACCESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureRawDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DSpaceArinc825Package.Literals.FEATURE_RAW_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public booleanType getRawDataModelAccess() {
		return rawDataModelAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRawDataModelAccess(booleanType newRawDataModelAccess) {
		booleanType oldRawDataModelAccess = rawDataModelAccess;
		rawDataModelAccess = newRawDataModelAccess == null ? RAW_DATA_MODEL_ACCESS_EDEFAULT : newRawDataModelAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSpaceArinc825Package.FEATURE_RAW_DATA__RAW_DATA_MODEL_ACCESS, oldRawDataModelAccess, rawDataModelAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DSpaceArinc825Package.FEATURE_RAW_DATA__RAW_DATA_MODEL_ACCESS:
				return getRawDataModelAccess();
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
			case DSpaceArinc825Package.FEATURE_RAW_DATA__RAW_DATA_MODEL_ACCESS:
				setRawDataModelAccess((booleanType)newValue);
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
			case DSpaceArinc825Package.FEATURE_RAW_DATA__RAW_DATA_MODEL_ACCESS:
				setRawDataModelAccess(RAW_DATA_MODEL_ACCESS_EDEFAULT);
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
			case DSpaceArinc825Package.FEATURE_RAW_DATA__RAW_DATA_MODEL_ACCESS:
				return rawDataModelAccess != RAW_DATA_MODEL_ACCESS_EDEFAULT;
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
		result.append(" (rawDataModelAccess: ");
		result.append(rawDataModelAccess);
		result.append(')');
		return result.toString();
	}

} //FeatureRawDataImpl
