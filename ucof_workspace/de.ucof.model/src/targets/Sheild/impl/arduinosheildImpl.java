/**
 */
package targets.Sheild.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import targets.Sheild.SheildPackage;
import targets.Sheild.arduinosheild;
import targets.Sheild.sheildPorts;

import targets.SuperAssignmentSpecificationType;
import targets.SuperIOHardwareType;
import targets.TargetsPackage;
import targets.impl.SuperTargetTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>arduinosheild</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.Sheild.impl.arduinosheildImpl#getAssignmentSpecification <em>Assignment Specification</em>}</li>
 *   <li>{@link targets.Sheild.impl.arduinosheildImpl#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class arduinosheildImpl extends SuperTargetTypeImpl implements arduinosheild {
	/**
	 * The cached value of the '{@link #getAssignmentSpecification() <em>Assignment Specification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignmentSpecification()
	 * @generated
	 * @ordered
	 */
	protected EList<SuperAssignmentSpecificationType> assignmentSpecification;
	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected sheildPorts ports;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected arduinosheildImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SheildPackage.Literals.ARDUINOSHEILD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SuperAssignmentSpecificationType> getAssignmentSpecification() {
		if (assignmentSpecification == null) {
			assignmentSpecification = new EObjectContainmentEList<SuperAssignmentSpecificationType>(SuperAssignmentSpecificationType.class, this, SheildPackage.ARDUINOSHEILD__ASSIGNMENT_SPECIFICATION);
		}
		return assignmentSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sheildPorts getPorts() {
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPorts(sheildPorts newPorts, NotificationChain msgs) {
		sheildPorts oldPorts = ports;
		ports = newPorts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SheildPackage.ARDUINOSHEILD__PORTS, oldPorts, newPorts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPorts(sheildPorts newPorts) {
		if (newPorts != ports) {
			NotificationChain msgs = null;
			if (ports != null)
				msgs = ((InternalEObject)ports).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SheildPackage.ARDUINOSHEILD__PORTS, null, msgs);
			if (newPorts != null)
				msgs = ((InternalEObject)newPorts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SheildPackage.ARDUINOSHEILD__PORTS, null, msgs);
			msgs = basicSetPorts(newPorts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SheildPackage.ARDUINOSHEILD__PORTS, newPorts, newPorts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SheildPackage.ARDUINOSHEILD__ASSIGNMENT_SPECIFICATION:
				return ((InternalEList<?>)getAssignmentSpecification()).basicRemove(otherEnd, msgs);
			case SheildPackage.ARDUINOSHEILD__PORTS:
				return basicSetPorts(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SheildPackage.ARDUINOSHEILD__ASSIGNMENT_SPECIFICATION:
				return getAssignmentSpecification();
			case SheildPackage.ARDUINOSHEILD__PORTS:
				return getPorts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SheildPackage.ARDUINOSHEILD__ASSIGNMENT_SPECIFICATION:
				getAssignmentSpecification().clear();
				getAssignmentSpecification().addAll((Collection<? extends SuperAssignmentSpecificationType>)newValue);
				return;
			case SheildPackage.ARDUINOSHEILD__PORTS:
				setPorts((sheildPorts)newValue);
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
			case SheildPackage.ARDUINOSHEILD__ASSIGNMENT_SPECIFICATION:
				getAssignmentSpecification().clear();
				return;
			case SheildPackage.ARDUINOSHEILD__PORTS:
				setPorts((sheildPorts)null);
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
			case SheildPackage.ARDUINOSHEILD__ASSIGNMENT_SPECIFICATION:
				return assignmentSpecification != null && !assignmentSpecification.isEmpty();
			case SheildPackage.ARDUINOSHEILD__PORTS:
				return ports != null;
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
		if (baseClass == SuperIOHardwareType.class) {
			switch (derivedFeatureID) {
				case SheildPackage.ARDUINOSHEILD__ASSIGNMENT_SPECIFICATION: return TargetsPackage.SUPER_IO_HARDWARE_TYPE__ASSIGNMENT_SPECIFICATION;
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
		if (baseClass == SuperIOHardwareType.class) {
			switch (baseFeatureID) {
				case TargetsPackage.SUPER_IO_HARDWARE_TYPE__ASSIGNMENT_SPECIFICATION: return SheildPackage.ARDUINOSHEILD__ASSIGNMENT_SPECIFICATION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //arduinosheildImpl
