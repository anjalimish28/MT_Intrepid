/**
 */
package targets.configdesk.ethernet.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import targets.configdesk.dSpaceArinc825.ModelAccessiblePortsTX;

import targets.configdesk.ethernet.EthernetPackage;
import targets.configdesk.ethernet.UDPTX;

import ucof.common.enums.booleanType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UDPTX</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targets.configdesk.ethernet.impl.UDPTXImpl#getModelAccessiblePorts <em>Model Accessible Ports</em>}</li>
 *   <li>{@link targets.configdesk.ethernet.impl.UDPTXImpl#getVariableVectorSize <em>Variable Vector Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UDPTXImpl extends UDPConnectionImpl implements UDPTX {
	/**
	 * The cached value of the '{@link #getModelAccessiblePorts() <em>Model Accessible Ports</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelAccessiblePorts()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelAccessiblePortsTX> modelAccessiblePorts;

	/**
	 * The default value of the '{@link #getVariableVectorSize() <em>Variable Vector Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableVectorSize()
	 * @generated
	 * @ordered
	 */
	protected static final booleanType VARIABLE_VECTOR_SIZE_EDEFAULT = booleanType.NOT_SET;

	/**
	 * The cached value of the '{@link #getVariableVectorSize() <em>Variable Vector Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableVectorSize()
	 * @generated
	 * @ordered
	 */
	protected booleanType variableVectorSize = VARIABLE_VECTOR_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UDPTXImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EthernetPackage.Literals.UDPTX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelAccessiblePortsTX> getModelAccessiblePorts() {
		if (modelAccessiblePorts == null) {
			modelAccessiblePorts = new EDataTypeUniqueEList<ModelAccessiblePortsTX>(ModelAccessiblePortsTX.class, this, EthernetPackage.UDPTX__MODEL_ACCESSIBLE_PORTS);
		}
		return modelAccessiblePorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public booleanType getVariableVectorSize() {
		return variableVectorSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableVectorSize(booleanType newVariableVectorSize) {
		booleanType oldVariableVectorSize = variableVectorSize;
		variableVectorSize = newVariableVectorSize == null ? VARIABLE_VECTOR_SIZE_EDEFAULT : newVariableVectorSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EthernetPackage.UDPTX__VARIABLE_VECTOR_SIZE, oldVariableVectorSize, variableVectorSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EthernetPackage.UDPTX__MODEL_ACCESSIBLE_PORTS:
				return getModelAccessiblePorts();
			case EthernetPackage.UDPTX__VARIABLE_VECTOR_SIZE:
				return getVariableVectorSize();
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
			case EthernetPackage.UDPTX__MODEL_ACCESSIBLE_PORTS:
				getModelAccessiblePorts().clear();
				getModelAccessiblePorts().addAll((Collection<? extends ModelAccessiblePortsTX>)newValue);
				return;
			case EthernetPackage.UDPTX__VARIABLE_VECTOR_SIZE:
				setVariableVectorSize((booleanType)newValue);
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
			case EthernetPackage.UDPTX__MODEL_ACCESSIBLE_PORTS:
				getModelAccessiblePorts().clear();
				return;
			case EthernetPackage.UDPTX__VARIABLE_VECTOR_SIZE:
				setVariableVectorSize(VARIABLE_VECTOR_SIZE_EDEFAULT);
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
			case EthernetPackage.UDPTX__MODEL_ACCESSIBLE_PORTS:
				return modelAccessiblePorts != null && !modelAccessiblePorts.isEmpty();
			case EthernetPackage.UDPTX__VARIABLE_VECTOR_SIZE:
				return variableVectorSize != VARIABLE_VECTOR_SIZE_EDEFAULT;
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
		result.append(", variableVectorSize: ");
		result.append(variableVectorSize);
		result.append(')');
		return result.toString();
	}

} //UDPTXImpl
