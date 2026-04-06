/**
 */
package targets.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import targets.AttributeDatatypeConversion;
import targets.TargetsPackage;

import ucof.common.enums.TargetDataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Datatype Conversion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.impl.AttributeDatatypeConversionImpl#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link targets.impl.AttributeDatatypeConversionImpl#getTargetDataType <em>Target Data Type</em>}</li>
 *   <li>{@link targets.impl.AttributeDatatypeConversionImpl#getValuePrefix <em>Value Prefix</em>}</li>
 *   <li>{@link targets.impl.AttributeDatatypeConversionImpl#getValuePostfix <em>Value Postfix</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeDatatypeConversionImpl extends SuperAssignmentSpecificationTypeImpl implements AttributeDatatypeConversion {
	/**
	 * The default value of the '{@link #getAttributeName() <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeName()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributeName() <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeName()
	 * @generated
	 * @ordered
	 */
	protected String attributeName = ATTRIBUTE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetDataType() <em>Target Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDataType()
	 * @generated
	 * @ordered
	 */
	protected static final TargetDataType TARGET_DATA_TYPE_EDEFAULT = TargetDataType.NOT_SET;

	/**
	 * The cached value of the '{@link #getTargetDataType() <em>Target Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDataType()
	 * @generated
	 * @ordered
	 */
	protected TargetDataType targetDataType = TARGET_DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValuePrefix() <em>Value Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuePrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValuePrefix() <em>Value Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuePrefix()
	 * @generated
	 * @ordered
	 */
	protected String valuePrefix = VALUE_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getValuePostfix() <em>Value Postfix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuePostfix()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_POSTFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValuePostfix() <em>Value Postfix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuePostfix()
	 * @generated
	 * @ordered
	 */
	protected String valuePostfix = VALUE_POSTFIX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeDatatypeConversionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetsPackage.Literals.ATTRIBUTE_DATATYPE_CONVERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttributeName() {
		return attributeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeName(String newAttributeName) {
		String oldAttributeName = attributeName;
		attributeName = newAttributeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetsPackage.ATTRIBUTE_DATATYPE_CONVERSION__ATTRIBUTE_NAME, oldAttributeName, attributeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetDataType getTargetDataType() {
		return targetDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetDataType(TargetDataType newTargetDataType) {
		TargetDataType oldTargetDataType = targetDataType;
		targetDataType = newTargetDataType == null ? TARGET_DATA_TYPE_EDEFAULT : newTargetDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetsPackage.ATTRIBUTE_DATATYPE_CONVERSION__TARGET_DATA_TYPE, oldTargetDataType, targetDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValuePrefix() {
		return valuePrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValuePrefix(String newValuePrefix) {
		String oldValuePrefix = valuePrefix;
		valuePrefix = newValuePrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetsPackage.ATTRIBUTE_DATATYPE_CONVERSION__VALUE_PREFIX, oldValuePrefix, valuePrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValuePostfix() {
		return valuePostfix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValuePostfix(String newValuePostfix) {
		String oldValuePostfix = valuePostfix;
		valuePostfix = newValuePostfix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetsPackage.ATTRIBUTE_DATATYPE_CONVERSION__VALUE_POSTFIX, oldValuePostfix, valuePostfix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TargetsPackage.ATTRIBUTE_DATATYPE_CONVERSION__ATTRIBUTE_NAME:
				return getAttributeName();
			case TargetsPackage.ATTRIBUTE_DATATYPE_CONVERSION__TARGET_DATA_TYPE:
				return getTargetDataType();
			case TargetsPackage.ATTRIBUTE_DATATYPE_CONVERSION__VALUE_PREFIX:
				return getValuePrefix();
			case TargetsPackage.ATTRIBUTE_DATATYPE_CONVERSION__VALUE_POSTFIX:
				return getValuePostfix();
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
			case TargetsPackage.ATTRIBUTE_DATATYPE_CONVERSION__ATTRIBUTE_NAME:
				setAttributeName((String)newValue);
				return;
			case TargetsPackage.ATTRIBUTE_DATATYPE_CONVERSION__TARGET_DATA_TYPE:
				setTargetDataType((TargetDataType)newValue);
				return;
			case TargetsPackage.ATTRIBUTE_DATATYPE_CONVERSION__VALUE_PREFIX:
				setValuePrefix((String)newValue);
				return;
			case TargetsPackage.ATTRIBUTE_DATATYPE_CONVERSION__VALUE_POSTFIX:
				setValuePostfix((String)newValue);
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
			case TargetsPackage.ATTRIBUTE_DATATYPE_CONVERSION__ATTRIBUTE_NAME:
				setAttributeName(ATTRIBUTE_NAME_EDEFAULT);
				return;
			case TargetsPackage.ATTRIBUTE_DATATYPE_CONVERSION__TARGET_DATA_TYPE:
				setTargetDataType(TARGET_DATA_TYPE_EDEFAULT);
				return;
			case TargetsPackage.ATTRIBUTE_DATATYPE_CONVERSION__VALUE_PREFIX:
				setValuePrefix(VALUE_PREFIX_EDEFAULT);
				return;
			case TargetsPackage.ATTRIBUTE_DATATYPE_CONVERSION__VALUE_POSTFIX:
				setValuePostfix(VALUE_POSTFIX_EDEFAULT);
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
			case TargetsPackage.ATTRIBUTE_DATATYPE_CONVERSION__ATTRIBUTE_NAME:
				return ATTRIBUTE_NAME_EDEFAULT == null ? attributeName != null : !ATTRIBUTE_NAME_EDEFAULT.equals(attributeName);
			case TargetsPackage.ATTRIBUTE_DATATYPE_CONVERSION__TARGET_DATA_TYPE:
				return targetDataType != TARGET_DATA_TYPE_EDEFAULT;
			case TargetsPackage.ATTRIBUTE_DATATYPE_CONVERSION__VALUE_PREFIX:
				return VALUE_PREFIX_EDEFAULT == null ? valuePrefix != null : !VALUE_PREFIX_EDEFAULT.equals(valuePrefix);
			case TargetsPackage.ATTRIBUTE_DATATYPE_CONVERSION__VALUE_POSTFIX:
				return VALUE_POSTFIX_EDEFAULT == null ? valuePostfix != null : !VALUE_POSTFIX_EDEFAULT.equals(valuePostfix);
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
		result.append(" (attributeName: ");
		result.append(attributeName);
		result.append(", targetDataType: ");
		result.append(targetDataType);
		result.append(", valuePrefix: ");
		result.append(valuePrefix);
		result.append(", valuePostfix: ");
		result.append(valuePostfix);
		result.append(')');
		return result.toString();
	}

} //AttributeDatatypeConversionImpl
