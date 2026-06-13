/**
 */
package ucof.assignments.database.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.assignments.database.DatabasePackage;
import ucof.assignments.database.SignalToTargetAssignment;
import ucof.assignments.database.signalTargets;

import ucof.assignments.impl.SuperAssignmentTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal To Target Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.assignments.database.impl.SignalToTargetAssignmentImpl#getStartBit <em>Start Bit</em>}</li>
 *   <li>{@link ucof.assignments.database.impl.SignalToTargetAssignmentImpl#getAssignmentTargetType <em>Assignment Target Type</em>}</li>
 *   <li>{@link ucof.assignments.database.impl.SignalToTargetAssignmentImpl#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignalToTargetAssignmentImpl extends SuperAssignmentTypeImpl implements SignalToTargetAssignment {
	/**
	 * The default value of the '{@link #getStartBit() <em>Start Bit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartBit()
	 * @generated
	 * @ordered
	 */
	protected static final int START_BIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStartBit() <em>Start Bit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartBit()
	 * @generated
	 * @ordered
	 */
	protected int startBit = START_BIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssignmentTargetType() <em>Assignment Target Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignmentTargetType()
	 * @generated
	 * @ordered
	 */
	protected static final signalTargets ASSIGNMENT_TARGET_TYPE_EDEFAULT = signalTargets.NOT_SET;

	/**
	 * The cached value of the '{@link #getAssignmentTargetType() <em>Assignment Target Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignmentTargetType()
	 * @generated
	 * @ordered
	 */
	protected signalTargets assignmentTargetType = ASSIGNMENT_TARGET_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected static final float INITIAL_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected float initialValue = INITIAL_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalToTargetAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatabasePackage.Literals.SIGNAL_TO_TARGET_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStartBit() {
		return startBit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartBit(int newStartBit) {
		int oldStartBit = startBit;
		startBit = newStartBit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.SIGNAL_TO_TARGET_ASSIGNMENT__START_BIT, oldStartBit, startBit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public signalTargets getAssignmentTargetType() {
		return assignmentTargetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignmentTargetType(signalTargets newAssignmentTargetType) {
		signalTargets oldAssignmentTargetType = assignmentTargetType;
		assignmentTargetType = newAssignmentTargetType == null ? ASSIGNMENT_TARGET_TYPE_EDEFAULT : newAssignmentTargetType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.SIGNAL_TO_TARGET_ASSIGNMENT__ASSIGNMENT_TARGET_TYPE, oldAssignmentTargetType, assignmentTargetType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getInitialValue() {
		return initialValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialValue(float newInitialValue) {
		float oldInitialValue = initialValue;
		initialValue = newInitialValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.SIGNAL_TO_TARGET_ASSIGNMENT__INITIAL_VALUE, oldInitialValue, initialValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatabasePackage.SIGNAL_TO_TARGET_ASSIGNMENT__START_BIT:
				return getStartBit();
			case DatabasePackage.SIGNAL_TO_TARGET_ASSIGNMENT__ASSIGNMENT_TARGET_TYPE:
				return getAssignmentTargetType();
			case DatabasePackage.SIGNAL_TO_TARGET_ASSIGNMENT__INITIAL_VALUE:
				return getInitialValue();
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
			case DatabasePackage.SIGNAL_TO_TARGET_ASSIGNMENT__START_BIT:
				setStartBit((Integer)newValue);
				return;
			case DatabasePackage.SIGNAL_TO_TARGET_ASSIGNMENT__ASSIGNMENT_TARGET_TYPE:
				setAssignmentTargetType((signalTargets)newValue);
				return;
			case DatabasePackage.SIGNAL_TO_TARGET_ASSIGNMENT__INITIAL_VALUE:
				setInitialValue((Float)newValue);
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
			case DatabasePackage.SIGNAL_TO_TARGET_ASSIGNMENT__START_BIT:
				setStartBit(START_BIT_EDEFAULT);
				return;
			case DatabasePackage.SIGNAL_TO_TARGET_ASSIGNMENT__ASSIGNMENT_TARGET_TYPE:
				setAssignmentTargetType(ASSIGNMENT_TARGET_TYPE_EDEFAULT);
				return;
			case DatabasePackage.SIGNAL_TO_TARGET_ASSIGNMENT__INITIAL_VALUE:
				setInitialValue(INITIAL_VALUE_EDEFAULT);
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
			case DatabasePackage.SIGNAL_TO_TARGET_ASSIGNMENT__START_BIT:
				return startBit != START_BIT_EDEFAULT;
			case DatabasePackage.SIGNAL_TO_TARGET_ASSIGNMENT__ASSIGNMENT_TARGET_TYPE:
				return assignmentTargetType != ASSIGNMENT_TARGET_TYPE_EDEFAULT;
			case DatabasePackage.SIGNAL_TO_TARGET_ASSIGNMENT__INITIAL_VALUE:
				return initialValue != INITIAL_VALUE_EDEFAULT;
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
		result.append(" (startBit: ");
		result.append(startBit);
		result.append(", assignmentTargetType: ");
		result.append(assignmentTargetType);
		result.append(", initialValue: ");
		result.append(initialValue);
		result.append(')');
		return result.toString();
	}

} //SignalToTargetAssignmentImpl
