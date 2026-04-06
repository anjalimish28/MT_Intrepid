/**
 */
package targets.vxworksa653.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import targets.vxworksa653.SimulatedDevices;
import targets.vxworksa653.SimulatedDevicesList;
import targets.vxworksa653.Vxworksa653Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simulated Devices</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.vxworksa653.impl.SimulatedDevicesImpl#getSimulatedDevices <em>Simulated Devices</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimulatedDevicesImpl extends SuperVxWorksAssignmentSpecificationTypeImpl implements SimulatedDevices {
	/**
	 * The cached value of the '{@link #getSimulatedDevices() <em>Simulated Devices</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulatedDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<SimulatedDevicesList> simulatedDevices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimulatedDevicesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Vxworksa653Package.Literals.SIMULATED_DEVICES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimulatedDevicesList> getSimulatedDevices() {
		if (simulatedDevices == null) {
			simulatedDevices = new EDataTypeUniqueEList<SimulatedDevicesList>(SimulatedDevicesList.class, this, Vxworksa653Package.SIMULATED_DEVICES__SIMULATED_DEVICES);
		}
		return simulatedDevices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Vxworksa653Package.SIMULATED_DEVICES__SIMULATED_DEVICES:
				return getSimulatedDevices();
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
			case Vxworksa653Package.SIMULATED_DEVICES__SIMULATED_DEVICES:
				getSimulatedDevices().clear();
				getSimulatedDevices().addAll((Collection<? extends SimulatedDevicesList>)newValue);
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
			case Vxworksa653Package.SIMULATED_DEVICES__SIMULATED_DEVICES:
				getSimulatedDevices().clear();
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
			case Vxworksa653Package.SIMULATED_DEVICES__SIMULATED_DEVICES:
				return simulatedDevices != null && !simulatedDevices.isEmpty();
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
		result.append(" (simulatedDevices: ");
		result.append(simulatedDevices);
		result.append(')');
		return result.toString();
	}

} //SimulatedDevicesImpl
