/**
 */
package targets.configdesk.ethernet.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import targets.configdesk.dSpaceArinc825.ModelAccessiblePortsRX;

import targets.configdesk.ethernet.EthernetPackage;
import targets.configdesk.ethernet.UDPRX;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UDPRX</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.configdesk.ethernet.impl.UDPRXImpl#getModelAccessiblePorts <em>Model Accessible Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UDPRXImpl extends UDPConnectionImpl implements UDPRX {
	/**
	 * The cached value of the '{@link #getModelAccessiblePorts() <em>Model Accessible Ports</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelAccessiblePorts()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelAccessiblePortsRX> modelAccessiblePorts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UDPRXImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EthernetPackage.Literals.UDPRX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelAccessiblePortsRX> getModelAccessiblePorts() {
		if (modelAccessiblePorts == null) {
			modelAccessiblePorts = new EDataTypeUniqueEList<ModelAccessiblePortsRX>(ModelAccessiblePortsRX.class, this, EthernetPackage.UDPRX__MODEL_ACCESSIBLE_PORTS);
		}
		return modelAccessiblePorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EthernetPackage.UDPRX__MODEL_ACCESSIBLE_PORTS:
				return getModelAccessiblePorts();
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
			case EthernetPackage.UDPRX__MODEL_ACCESSIBLE_PORTS:
				getModelAccessiblePorts().clear();
				getModelAccessiblePorts().addAll((Collection<? extends ModelAccessiblePortsRX>)newValue);
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
			case EthernetPackage.UDPRX__MODEL_ACCESSIBLE_PORTS:
				getModelAccessiblePorts().clear();
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
			case EthernetPackage.UDPRX__MODEL_ACCESSIBLE_PORTS:
				return modelAccessiblePorts != null && !modelAccessiblePorts.isEmpty();
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
		result.append(" (modelAccessiblePorts: ");
		result.append(modelAccessiblePorts);
		result.append(')');
		return result.toString();
	}

} //UDPRXImpl
