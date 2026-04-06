/**
 */
package targets.matlab.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import targets.impl.SuperTargetTypeImpl;

import targets.matlab.MatlabPackage;
import targets.matlab.SimulinkBlock;
import targets.matlab.SimulinkLibrary;
import targets.matlab.SimulinkProject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simulink Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.matlab.impl.SimulinkProjectImpl#getSimulinkBlock <em>Simulink Block</em>}</li>
 *   <li>{@link targets.matlab.impl.SimulinkProjectImpl#getSimulinkLibrary <em>Simulink Library</em>}</li>
 *   <li>{@link targets.matlab.impl.SimulinkProjectImpl#getSampleTime <em>Sample Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimulinkProjectImpl extends SuperTargetTypeImpl implements SimulinkProject {
	/**
	 * The cached value of the '{@link #getSimulinkBlock() <em>Simulink Block</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulinkBlock()
	 * @generated
	 * @ordered
	 */
	protected EList<SimulinkBlock> simulinkBlock;

	/**
	 * The cached value of the '{@link #getSimulinkLibrary() <em>Simulink Library</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulinkLibrary()
	 * @generated
	 * @ordered
	 */
	protected SimulinkLibrary simulinkLibrary;

	/**
	 * The default value of the '{@link #getSampleTime() <em>Sample Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleTime()
	 * @generated
	 * @ordered
	 */
	protected static final float SAMPLE_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSampleTime() <em>Sample Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleTime()
	 * @generated
	 * @ordered
	 */
	protected float sampleTime = SAMPLE_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimulinkProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MatlabPackage.Literals.SIMULINK_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimulinkBlock> getSimulinkBlock() {
		if (simulinkBlock == null) {
			simulinkBlock = new EObjectContainmentEList<SimulinkBlock>(SimulinkBlock.class, this, MatlabPackage.SIMULINK_PROJECT__SIMULINK_BLOCK);
		}
		return simulinkBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulinkLibrary getSimulinkLibrary() {
		return simulinkLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimulinkLibrary(SimulinkLibrary newSimulinkLibrary, NotificationChain msgs) {
		SimulinkLibrary oldSimulinkLibrary = simulinkLibrary;
		simulinkLibrary = newSimulinkLibrary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MatlabPackage.SIMULINK_PROJECT__SIMULINK_LIBRARY, oldSimulinkLibrary, newSimulinkLibrary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimulinkLibrary(SimulinkLibrary newSimulinkLibrary) {
		if (newSimulinkLibrary != simulinkLibrary) {
			NotificationChain msgs = null;
			if (simulinkLibrary != null)
				msgs = ((InternalEObject)simulinkLibrary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MatlabPackage.SIMULINK_PROJECT__SIMULINK_LIBRARY, null, msgs);
			if (newSimulinkLibrary != null)
				msgs = ((InternalEObject)newSimulinkLibrary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MatlabPackage.SIMULINK_PROJECT__SIMULINK_LIBRARY, null, msgs);
			msgs = basicSetSimulinkLibrary(newSimulinkLibrary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatlabPackage.SIMULINK_PROJECT__SIMULINK_LIBRARY, newSimulinkLibrary, newSimulinkLibrary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSampleTime() {
		return sampleTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSampleTime(float newSampleTime) {
		float oldSampleTime = sampleTime;
		sampleTime = newSampleTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatlabPackage.SIMULINK_PROJECT__SAMPLE_TIME, oldSampleTime, sampleTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MatlabPackage.SIMULINK_PROJECT__SIMULINK_BLOCK:
				return ((InternalEList<?>)getSimulinkBlock()).basicRemove(otherEnd, msgs);
			case MatlabPackage.SIMULINK_PROJECT__SIMULINK_LIBRARY:
				return basicSetSimulinkLibrary(null, msgs);
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
			case MatlabPackage.SIMULINK_PROJECT__SIMULINK_BLOCK:
				return getSimulinkBlock();
			case MatlabPackage.SIMULINK_PROJECT__SIMULINK_LIBRARY:
				return getSimulinkLibrary();
			case MatlabPackage.SIMULINK_PROJECT__SAMPLE_TIME:
				return getSampleTime();
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
			case MatlabPackage.SIMULINK_PROJECT__SIMULINK_BLOCK:
				getSimulinkBlock().clear();
				getSimulinkBlock().addAll((Collection<? extends SimulinkBlock>)newValue);
				return;
			case MatlabPackage.SIMULINK_PROJECT__SIMULINK_LIBRARY:
				setSimulinkLibrary((SimulinkLibrary)newValue);
				return;
			case MatlabPackage.SIMULINK_PROJECT__SAMPLE_TIME:
				setSampleTime((Float)newValue);
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
			case MatlabPackage.SIMULINK_PROJECT__SIMULINK_BLOCK:
				getSimulinkBlock().clear();
				return;
			case MatlabPackage.SIMULINK_PROJECT__SIMULINK_LIBRARY:
				setSimulinkLibrary((SimulinkLibrary)null);
				return;
			case MatlabPackage.SIMULINK_PROJECT__SAMPLE_TIME:
				setSampleTime(SAMPLE_TIME_EDEFAULT);
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
			case MatlabPackage.SIMULINK_PROJECT__SIMULINK_BLOCK:
				return simulinkBlock != null && !simulinkBlock.isEmpty();
			case MatlabPackage.SIMULINK_PROJECT__SIMULINK_LIBRARY:
				return simulinkLibrary != null;
			case MatlabPackage.SIMULINK_PROJECT__SAMPLE_TIME:
				return sampleTime != SAMPLE_TIME_EDEFAULT;
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
		result.append(" (sampleTime: ");
		result.append(sampleTime);
		result.append(')');
		return result.toString();
	}

} //SimulinkProjectImpl
