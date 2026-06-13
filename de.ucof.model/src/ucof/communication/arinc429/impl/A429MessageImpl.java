/**
 */
package ucof.communication.arinc429.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.common.enums.SDITypes;

import ucof.communication.arinc429.A429Message;
import ucof.communication.arinc429.Arinc429Package;
import ucof.communication.arinc429.SSMTypes;

import ucof.communication.impl.SuperMessageTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>A429 Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.communication.arinc429.impl.A429MessageImpl#getSdi <em>Sdi</em>}</li>
 *   <li>{@link ucof.communication.arinc429.impl.A429MessageImpl#getA429Label <em>A429 Label</em>}</li>
 *   <li>{@link ucof.communication.arinc429.impl.A429MessageImpl#getA429SSM <em>A429SSM</em>}</li>
 *   <li>{@link ucof.communication.arinc429.impl.A429MessageImpl#getLabelNumber <em>Label Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class A429MessageImpl extends SuperMessageTypeImpl implements A429Message {
	/**
	 * The default value of the '{@link #getSdi() <em>Sdi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSdi()
	 * @generated
	 * @ordered
	 */
	protected static final SDITypes SDI_EDEFAULT = SDITypes.NOT_SET;

	/**
	 * The cached value of the '{@link #getSdi() <em>Sdi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSdi()
	 * @generated
	 * @ordered
	 */
	protected SDITypes sdi = SDI_EDEFAULT;

	/**
	 * The default value of the '{@link #getA429Label() <em>A429 Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA429Label()
	 * @generated
	 * @ordered
	 */
	protected static final SSMTypes A429_LABEL_EDEFAULT = SSMTypes.NOT_SET;

	/**
	 * The cached value of the '{@link #getA429Label() <em>A429 Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA429Label()
	 * @generated
	 * @ordered
	 */
	protected SSMTypes a429Label = A429_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getA429SSM() <em>A429SSM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA429SSM()
	 * @generated
	 * @ordered
	 */
	protected static final String A429_SSM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getA429SSM() <em>A429SSM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA429SSM()
	 * @generated
	 * @ordered
	 */
	protected String a429SSM = A429_SSM_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabelNumber() <em>Label Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int LABEL_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLabelNumber() <em>Label Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelNumber()
	 * @generated
	 * @ordered
	 */
	protected int labelNumber = LABEL_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected A429MessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Arinc429Package.Literals.A429_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDITypes getSdi() {
		return sdi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSdi(SDITypes newSdi) {
		SDITypes oldSdi = sdi;
		sdi = newSdi == null ? SDI_EDEFAULT : newSdi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Arinc429Package.A429_MESSAGE__SDI, oldSdi, sdi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSMTypes getA429Label() {
		return a429Label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setA429Label(SSMTypes newA429Label) {
		SSMTypes oldA429Label = a429Label;
		a429Label = newA429Label == null ? A429_LABEL_EDEFAULT : newA429Label;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Arinc429Package.A429_MESSAGE__A429_LABEL, oldA429Label, a429Label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getA429SSM() {
		return a429SSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setA429SSM(String newA429SSM) {
		String oldA429SSM = a429SSM;
		a429SSM = newA429SSM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Arinc429Package.A429_MESSAGE__A429_SSM, oldA429SSM, a429SSM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLabelNumber() {
		return labelNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelNumber(int newLabelNumber) {
		int oldLabelNumber = labelNumber;
		labelNumber = newLabelNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Arinc429Package.A429_MESSAGE__LABEL_NUMBER, oldLabelNumber, labelNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Arinc429Package.A429_MESSAGE__SDI:
				return getSdi();
			case Arinc429Package.A429_MESSAGE__A429_LABEL:
				return getA429Label();
			case Arinc429Package.A429_MESSAGE__A429_SSM:
				return getA429SSM();
			case Arinc429Package.A429_MESSAGE__LABEL_NUMBER:
				return getLabelNumber();
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
			case Arinc429Package.A429_MESSAGE__SDI:
				setSdi((SDITypes)newValue);
				return;
			case Arinc429Package.A429_MESSAGE__A429_LABEL:
				setA429Label((SSMTypes)newValue);
				return;
			case Arinc429Package.A429_MESSAGE__A429_SSM:
				setA429SSM((String)newValue);
				return;
			case Arinc429Package.A429_MESSAGE__LABEL_NUMBER:
				setLabelNumber((Integer)newValue);
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
			case Arinc429Package.A429_MESSAGE__SDI:
				setSdi(SDI_EDEFAULT);
				return;
			case Arinc429Package.A429_MESSAGE__A429_LABEL:
				setA429Label(A429_LABEL_EDEFAULT);
				return;
			case Arinc429Package.A429_MESSAGE__A429_SSM:
				setA429SSM(A429_SSM_EDEFAULT);
				return;
			case Arinc429Package.A429_MESSAGE__LABEL_NUMBER:
				setLabelNumber(LABEL_NUMBER_EDEFAULT);
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
			case Arinc429Package.A429_MESSAGE__SDI:
				return sdi != SDI_EDEFAULT;
			case Arinc429Package.A429_MESSAGE__A429_LABEL:
				return a429Label != A429_LABEL_EDEFAULT;
			case Arinc429Package.A429_MESSAGE__A429_SSM:
				return A429_SSM_EDEFAULT == null ? a429SSM != null : !A429_SSM_EDEFAULT.equals(a429SSM);
			case Arinc429Package.A429_MESSAGE__LABEL_NUMBER:
				return labelNumber != LABEL_NUMBER_EDEFAULT;
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
		result.append(" (sdi: ");
		result.append(sdi);
		result.append(", a429Label: ");
		result.append(a429Label);
		result.append(", a429SSM: ");
		result.append(a429SSM);
		result.append(", labelNumber: ");
		result.append(labelNumber);
		result.append(')');
		return result.toString();
	}

} //A429MessageImpl
