/**
 */
package targets.configdesk.dSpaceArinc825.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import targets.configdesk.dSpaceArinc825.DSpaceArinc825Package;
import targets.configdesk.dSpaceArinc825.FeatureFrameAccess;

import ucof.common.enums.booleanType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Frame Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.configdesk.dSpaceArinc825.impl.FeatureFrameAccessImpl#getTriggerModelAccess <em>Trigger Model Access</em>}</li>
 *   <li>{@link targets.configdesk.dSpaceArinc825.impl.FeatureFrameAccessImpl#getLengthModelAccess <em>Length Model Access</em>}</li>
 *   <li>{@link targets.configdesk.dSpaceArinc825.impl.FeatureFrameAccessImpl#getRawDataModelAccess <em>Raw Data Model Access</em>}</li>
 *   <li>{@link targets.configdesk.dSpaceArinc825.impl.FeatureFrameAccessImpl#getIdentifierModelAccess <em>Identifier Model Access</em>}</li>
 *   <li>{@link targets.configdesk.dSpaceArinc825.impl.FeatureFrameAccessImpl#getExtendedAddressingModelAccess <em>Extended Addressing Model Access</em>}</li>
 *   <li>{@link targets.configdesk.dSpaceArinc825.impl.FeatureFrameAccessImpl#getCanFDFrameSupportModelAccess <em>Can FD Frame Support Model Access</em>}</li>
 *   <li>{@link targets.configdesk.dSpaceArinc825.impl.FeatureFrameAccessImpl#getBitRateSwitchModelAccess <em>Bit Rate Switch Model Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureFrameAccessImpl extends SuperFeatureTypeImpl implements FeatureFrameAccess {
	/**
	 * The default value of the '{@link #getTriggerModelAccess() <em>Trigger Model Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerModelAccess()
	 * @generated
	 * @ordered
	 */
	protected static final booleanType TRIGGER_MODEL_ACCESS_EDEFAULT = booleanType.NOT_SET;

	/**
	 * The cached value of the '{@link #getTriggerModelAccess() <em>Trigger Model Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerModelAccess()
	 * @generated
	 * @ordered
	 */
	protected booleanType triggerModelAccess = TRIGGER_MODEL_ACCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLengthModelAccess() <em>Length Model Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLengthModelAccess()
	 * @generated
	 * @ordered
	 */
	protected static final booleanType LENGTH_MODEL_ACCESS_EDEFAULT = booleanType.NOT_SET;

	/**
	 * The cached value of the '{@link #getLengthModelAccess() <em>Length Model Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLengthModelAccess()
	 * @generated
	 * @ordered
	 */
	protected booleanType lengthModelAccess = LENGTH_MODEL_ACCESS_EDEFAULT;

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
	 * The default value of the '{@link #getIdentifierModelAccess() <em>Identifier Model Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifierModelAccess()
	 * @generated
	 * @ordered
	 */
	protected static final booleanType IDENTIFIER_MODEL_ACCESS_EDEFAULT = booleanType.NOT_SET;

	/**
	 * The cached value of the '{@link #getIdentifierModelAccess() <em>Identifier Model Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifierModelAccess()
	 * @generated
	 * @ordered
	 */
	protected booleanType identifierModelAccess = IDENTIFIER_MODEL_ACCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtendedAddressingModelAccess() <em>Extended Addressing Model Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedAddressingModelAccess()
	 * @generated
	 * @ordered
	 */
	protected static final booleanType EXTENDED_ADDRESSING_MODEL_ACCESS_EDEFAULT = booleanType.NOT_SET;

	/**
	 * The cached value of the '{@link #getExtendedAddressingModelAccess() <em>Extended Addressing Model Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedAddressingModelAccess()
	 * @generated
	 * @ordered
	 */
	protected booleanType extendedAddressingModelAccess = EXTENDED_ADDRESSING_MODEL_ACCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCanFDFrameSupportModelAccess() <em>Can FD Frame Support Model Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanFDFrameSupportModelAccess()
	 * @generated
	 * @ordered
	 */
	protected static final booleanType CAN_FD_FRAME_SUPPORT_MODEL_ACCESS_EDEFAULT = booleanType.NOT_SET;

	/**
	 * The cached value of the '{@link #getCanFDFrameSupportModelAccess() <em>Can FD Frame Support Model Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanFDFrameSupportModelAccess()
	 * @generated
	 * @ordered
	 */
	protected booleanType canFDFrameSupportModelAccess = CAN_FD_FRAME_SUPPORT_MODEL_ACCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBitRateSwitchModelAccess() <em>Bit Rate Switch Model Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitRateSwitchModelAccess()
	 * @generated
	 * @ordered
	 */
	protected static final booleanType BIT_RATE_SWITCH_MODEL_ACCESS_EDEFAULT = booleanType.NOT_SET;

	/**
	 * The cached value of the '{@link #getBitRateSwitchModelAccess() <em>Bit Rate Switch Model Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitRateSwitchModelAccess()
	 * @generated
	 * @ordered
	 */
	protected booleanType bitRateSwitchModelAccess = BIT_RATE_SWITCH_MODEL_ACCESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureFrameAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DSpaceArinc825Package.Literals.FEATURE_FRAME_ACCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public booleanType getTriggerModelAccess() {
		return triggerModelAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerModelAccess(booleanType newTriggerModelAccess) {
		booleanType oldTriggerModelAccess = triggerModelAccess;
		triggerModelAccess = newTriggerModelAccess == null ? TRIGGER_MODEL_ACCESS_EDEFAULT : newTriggerModelAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSpaceArinc825Package.FEATURE_FRAME_ACCESS__TRIGGER_MODEL_ACCESS, oldTriggerModelAccess, triggerModelAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public booleanType getLengthModelAccess() {
		return lengthModelAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLengthModelAccess(booleanType newLengthModelAccess) {
		booleanType oldLengthModelAccess = lengthModelAccess;
		lengthModelAccess = newLengthModelAccess == null ? LENGTH_MODEL_ACCESS_EDEFAULT : newLengthModelAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSpaceArinc825Package.FEATURE_FRAME_ACCESS__LENGTH_MODEL_ACCESS, oldLengthModelAccess, lengthModelAccess));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DSpaceArinc825Package.FEATURE_FRAME_ACCESS__RAW_DATA_MODEL_ACCESS, oldRawDataModelAccess, rawDataModelAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public booleanType getIdentifierModelAccess() {
		return identifierModelAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifierModelAccess(booleanType newIdentifierModelAccess) {
		booleanType oldIdentifierModelAccess = identifierModelAccess;
		identifierModelAccess = newIdentifierModelAccess == null ? IDENTIFIER_MODEL_ACCESS_EDEFAULT : newIdentifierModelAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSpaceArinc825Package.FEATURE_FRAME_ACCESS__IDENTIFIER_MODEL_ACCESS, oldIdentifierModelAccess, identifierModelAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public booleanType getExtendedAddressingModelAccess() {
		return extendedAddressingModelAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedAddressingModelAccess(booleanType newExtendedAddressingModelAccess) {
		booleanType oldExtendedAddressingModelAccess = extendedAddressingModelAccess;
		extendedAddressingModelAccess = newExtendedAddressingModelAccess == null ? EXTENDED_ADDRESSING_MODEL_ACCESS_EDEFAULT : newExtendedAddressingModelAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSpaceArinc825Package.FEATURE_FRAME_ACCESS__EXTENDED_ADDRESSING_MODEL_ACCESS, oldExtendedAddressingModelAccess, extendedAddressingModelAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public booleanType getCanFDFrameSupportModelAccess() {
		return canFDFrameSupportModelAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanFDFrameSupportModelAccess(booleanType newCanFDFrameSupportModelAccess) {
		booleanType oldCanFDFrameSupportModelAccess = canFDFrameSupportModelAccess;
		canFDFrameSupportModelAccess = newCanFDFrameSupportModelAccess == null ? CAN_FD_FRAME_SUPPORT_MODEL_ACCESS_EDEFAULT : newCanFDFrameSupportModelAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSpaceArinc825Package.FEATURE_FRAME_ACCESS__CAN_FD_FRAME_SUPPORT_MODEL_ACCESS, oldCanFDFrameSupportModelAccess, canFDFrameSupportModelAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public booleanType getBitRateSwitchModelAccess() {
		return bitRateSwitchModelAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBitRateSwitchModelAccess(booleanType newBitRateSwitchModelAccess) {
		booleanType oldBitRateSwitchModelAccess = bitRateSwitchModelAccess;
		bitRateSwitchModelAccess = newBitRateSwitchModelAccess == null ? BIT_RATE_SWITCH_MODEL_ACCESS_EDEFAULT : newBitRateSwitchModelAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSpaceArinc825Package.FEATURE_FRAME_ACCESS__BIT_RATE_SWITCH_MODEL_ACCESS, oldBitRateSwitchModelAccess, bitRateSwitchModelAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DSpaceArinc825Package.FEATURE_FRAME_ACCESS__TRIGGER_MODEL_ACCESS:
				return getTriggerModelAccess();
			case DSpaceArinc825Package.FEATURE_FRAME_ACCESS__LENGTH_MODEL_ACCESS:
				return getLengthModelAccess();
			case DSpaceArinc825Package.FEATURE_FRAME_ACCESS__RAW_DATA_MODEL_ACCESS:
				return getRawDataModelAccess();
			case DSpaceArinc825Package.FEATURE_FRAME_ACCESS__IDENTIFIER_MODEL_ACCESS:
				return getIdentifierModelAccess();
			case DSpaceArinc825Package.FEATURE_FRAME_ACCESS__EXTENDED_ADDRESSING_MODEL_ACCESS:
				return getExtendedAddressingModelAccess();
			case DSpaceArinc825Package.FEATURE_FRAME_ACCESS__CAN_FD_FRAME_SUPPORT_MODEL_ACCESS:
				return getCanFDFrameSupportModelAccess();
			case DSpaceArinc825Package.FEATURE_FRAME_ACCESS__BIT_RATE_SWITCH_MODEL_ACCESS:
				return getBitRateSwitchModelAccess();
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
			case DSpaceArinc825Package.FEATURE_FRAME_ACCESS__TRIGGER_MODEL_ACCESS:
				setTriggerModelAccess((booleanType)newValue);
				return;
			case DSpaceArinc825Package.FEATURE_FRAME_ACCESS__LENGTH_MODEL_ACCESS:
				setLengthModelAccess((booleanType)newValue);
				return;
			case DSpaceArinc825Package.FEATURE_FRAME_ACCESS__RAW_DATA_MODEL_ACCESS:
				setRawDataModelAccess((booleanType)newValue);
				return;
			case DSpaceArinc825Package.FEATURE_FRAME_ACCESS__IDENTIFIER_MODEL_ACCESS:
				setIdentifierModelAccess((booleanType)newValue);
				return;
			case DSpaceArinc825Package.FEATURE_FRAME_ACCESS__EXTENDED_ADDRESSING_MODEL_ACCESS:
				setExtendedAddressingModelAccess((booleanType)newValue);
				return;
			case DSpaceArinc825Package.FEATURE_FRAME_ACCESS__CAN_FD_FRAME_SUPPORT_MODEL_ACCESS:
				setCanFDFrameSupportModelAccess((booleanType)newValue);
				return;
			case DSpaceArinc825Package.FEATURE_FRAME_ACCESS__BIT_RATE_SWITCH_MODEL_ACCESS:
				setBitRateSwitchModelAccess((booleanType)newValue);
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
			case DSpaceArinc825Package.FEATURE_FRAME_ACCESS__TRIGGER_MODEL_ACCESS:
				setTriggerModelAccess(TRIGGER_MODEL_ACCESS_EDEFAULT);
				return;
			case DSpaceArinc825Package.FEATURE_FRAME_ACCESS__LENGTH_MODEL_ACCESS:
				setLengthModelAccess(LENGTH_MODEL_ACCESS_EDEFAULT);
				return;
			case DSpaceArinc825Package.FEATURE_FRAME_ACCESS__RAW_DATA_MODEL_ACCESS:
				setRawDataModelAccess(RAW_DATA_MODEL_ACCESS_EDEFAULT);
				return;
			case DSpaceArinc825Package.FEATURE_FRAME_ACCESS__IDENTIFIER_MODEL_ACCESS:
				setIdentifierModelAccess(IDENTIFIER_MODEL_ACCESS_EDEFAULT);
				return;
			case DSpaceArinc825Package.FEATURE_FRAME_ACCESS__EXTENDED_ADDRESSING_MODEL_ACCESS:
				setExtendedAddressingModelAccess(EXTENDED_ADDRESSING_MODEL_ACCESS_EDEFAULT);
				return;
			case DSpaceArinc825Package.FEATURE_FRAME_ACCESS__CAN_FD_FRAME_SUPPORT_MODEL_ACCESS:
				setCanFDFrameSupportModelAccess(CAN_FD_FRAME_SUPPORT_MODEL_ACCESS_EDEFAULT);
				return;
			case DSpaceArinc825Package.FEATURE_FRAME_ACCESS__BIT_RATE_SWITCH_MODEL_ACCESS:
				setBitRateSwitchModelAccess(BIT_RATE_SWITCH_MODEL_ACCESS_EDEFAULT);
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
			case DSpaceArinc825Package.FEATURE_FRAME_ACCESS__TRIGGER_MODEL_ACCESS:
				return triggerModelAccess != TRIGGER_MODEL_ACCESS_EDEFAULT;
			case DSpaceArinc825Package.FEATURE_FRAME_ACCESS__LENGTH_MODEL_ACCESS:
				return lengthModelAccess != LENGTH_MODEL_ACCESS_EDEFAULT;
			case DSpaceArinc825Package.FEATURE_FRAME_ACCESS__RAW_DATA_MODEL_ACCESS:
				return rawDataModelAccess != RAW_DATA_MODEL_ACCESS_EDEFAULT;
			case DSpaceArinc825Package.FEATURE_FRAME_ACCESS__IDENTIFIER_MODEL_ACCESS:
				return identifierModelAccess != IDENTIFIER_MODEL_ACCESS_EDEFAULT;
			case DSpaceArinc825Package.FEATURE_FRAME_ACCESS__EXTENDED_ADDRESSING_MODEL_ACCESS:
				return extendedAddressingModelAccess != EXTENDED_ADDRESSING_MODEL_ACCESS_EDEFAULT;
			case DSpaceArinc825Package.FEATURE_FRAME_ACCESS__CAN_FD_FRAME_SUPPORT_MODEL_ACCESS:
				return canFDFrameSupportModelAccess != CAN_FD_FRAME_SUPPORT_MODEL_ACCESS_EDEFAULT;
			case DSpaceArinc825Package.FEATURE_FRAME_ACCESS__BIT_RATE_SWITCH_MODEL_ACCESS:
				return bitRateSwitchModelAccess != BIT_RATE_SWITCH_MODEL_ACCESS_EDEFAULT;
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
		result.append(" (triggerModelAccess: ");
		result.append(triggerModelAccess);
		result.append(", lengthModelAccess: ");
		result.append(lengthModelAccess);
		result.append(", rawDataModelAccess: ");
		result.append(rawDataModelAccess);
		result.append(", identifierModelAccess: ");
		result.append(identifierModelAccess);
		result.append(", extendedAddressingModelAccess: ");
		result.append(extendedAddressingModelAccess);
		result.append(", canFDFrameSupportModelAccess: ");
		result.append(canFDFrameSupportModelAccess);
		result.append(", bitRateSwitchModelAccess: ");
		result.append(bitRateSwitchModelAccess);
		result.append(')');
		return result.toString();
	}

} //FeatureFrameAccessImpl
