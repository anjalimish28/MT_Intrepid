/**
 */
package ucof.communication.arinc429.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.common.etypes.EtypesPackage;
import ucof.common.etypes.SuperIdentifierType;

import ucof.common.etypes.impl.SuperTrackingTypeImpl;

import ucof.communication.arinc429.A429SignalSpecification;
import ucof.communication.arinc429.Arinc429Package;
import ucof.communication.arinc429.CodingTypes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>A429 Signal Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.arinc429.impl.A429SignalSpecificationImpl#getId <em>Id</em>}</li>
 *   <li>{@link ucof.communication.arinc429.impl.A429SignalSpecificationImpl#getName <em>Name</em>}</li>
 *   <li>{@link ucof.communication.arinc429.impl.A429SignalSpecificationImpl#getCodingType <em>Coding Type</em>}</li>
 *   <li>{@link ucof.communication.arinc429.impl.A429SignalSpecificationImpl#getFieldLength <em>Field Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class A429SignalSpecificationImpl extends SuperTrackingTypeImpl implements A429SignalSpecification {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodingType() <em>Coding Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodingType()
	 * @generated
	 * @ordered
	 */
	protected static final CodingTypes CODING_TYPE_EDEFAULT = CodingTypes.NOT_SET;

	/**
	 * The cached value of the '{@link #getCodingType() <em>Coding Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodingType()
	 * @generated
	 * @ordered
	 */
	protected CodingTypes codingType = CODING_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFieldLength() <em>Field Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldLength()
	 * @generated
	 * @ordered
	 */
	protected static final int FIELD_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFieldLength() <em>Field Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldLength()
	 * @generated
	 * @ordered
	 */
	protected int fieldLength = FIELD_LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected A429SignalSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Arinc429Package.Literals.A429_SIGNAL_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Arinc429Package.A429_SIGNAL_SPECIFICATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Arinc429Package.A429_SIGNAL_SPECIFICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodingTypes getCodingType() {
		return codingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodingType(CodingTypes newCodingType) {
		CodingTypes oldCodingType = codingType;
		codingType = newCodingType == null ? CODING_TYPE_EDEFAULT : newCodingType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Arinc429Package.A429_SIGNAL_SPECIFICATION__CODING_TYPE, oldCodingType, codingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFieldLength() {
		return fieldLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldLength(int newFieldLength) {
		int oldFieldLength = fieldLength;
		fieldLength = newFieldLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Arinc429Package.A429_SIGNAL_SPECIFICATION__FIELD_LENGTH, oldFieldLength, fieldLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Arinc429Package.A429_SIGNAL_SPECIFICATION__ID:
				return getId();
			case Arinc429Package.A429_SIGNAL_SPECIFICATION__NAME:
				return getName();
			case Arinc429Package.A429_SIGNAL_SPECIFICATION__CODING_TYPE:
				return getCodingType();
			case Arinc429Package.A429_SIGNAL_SPECIFICATION__FIELD_LENGTH:
				return getFieldLength();
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
			case Arinc429Package.A429_SIGNAL_SPECIFICATION__ID:
				setId((String)newValue);
				return;
			case Arinc429Package.A429_SIGNAL_SPECIFICATION__NAME:
				setName((String)newValue);
				return;
			case Arinc429Package.A429_SIGNAL_SPECIFICATION__CODING_TYPE:
				setCodingType((CodingTypes)newValue);
				return;
			case Arinc429Package.A429_SIGNAL_SPECIFICATION__FIELD_LENGTH:
				setFieldLength((Integer)newValue);
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
			case Arinc429Package.A429_SIGNAL_SPECIFICATION__ID:
				setId(ID_EDEFAULT);
				return;
			case Arinc429Package.A429_SIGNAL_SPECIFICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Arinc429Package.A429_SIGNAL_SPECIFICATION__CODING_TYPE:
				setCodingType(CODING_TYPE_EDEFAULT);
				return;
			case Arinc429Package.A429_SIGNAL_SPECIFICATION__FIELD_LENGTH:
				setFieldLength(FIELD_LENGTH_EDEFAULT);
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
			case Arinc429Package.A429_SIGNAL_SPECIFICATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Arinc429Package.A429_SIGNAL_SPECIFICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Arinc429Package.A429_SIGNAL_SPECIFICATION__CODING_TYPE:
				return codingType != CODING_TYPE_EDEFAULT;
			case Arinc429Package.A429_SIGNAL_SPECIFICATION__FIELD_LENGTH:
				return fieldLength != FIELD_LENGTH_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SuperIdentifierType.class) {
			switch (derivedFeatureID) {
				case Arinc429Package.A429_SIGNAL_SPECIFICATION__ID: return EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;
				case Arinc429Package.A429_SIGNAL_SPECIFICATION__NAME: return EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SuperIdentifierType.class) {
			switch (baseFeatureID) {
				case EtypesPackage.SUPER_IDENTIFIER_TYPE__ID: return Arinc429Package.A429_SIGNAL_SPECIFICATION__ID;
				case EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME: return Arinc429Package.A429_SIGNAL_SPECIFICATION__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", codingType: ");
		result.append(codingType);
		result.append(", fieldLength: ");
		result.append(fieldLength);
		result.append(')');
		return result.toString();
	}

} //A429SignalSpecificationImpl
