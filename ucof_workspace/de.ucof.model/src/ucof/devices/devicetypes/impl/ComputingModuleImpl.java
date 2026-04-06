/**
 */
package ucof.devices.devicetypes.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucof.devices.devicetypes.ComputingModule;
import ucof.devices.devicetypes.DevicetypesPackage;

import ucof.devices.impl.SuperPlatformDeviceTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Computing Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucof.devices.devicetypes.impl.ComputingModuleImpl#getProcessorFamily <em>Processor Family</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.impl.ComputingModuleImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link ucof.devices.devicetypes.impl.ComputingModuleImpl#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComputingModuleImpl extends SuperPlatformDeviceTypeImpl implements ComputingModule {
	/**
	 * The default value of the '{@link #getProcessorFamily() <em>Processor Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorFamily()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCESSOR_FAMILY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessorFamily() <em>Processor Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorFamily()
	 * @generated
	 * @ordered
	 */
	protected String processorFamily = PROCESSOR_FAMILY_EDEFAULT;

	/**
	 * The default value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected static final String VENDOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected String vendor = VENDOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected String model = MODEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputingModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DevicetypesPackage.Literals.COMPUTING_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProcessorFamily() {
		return processorFamily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessorFamily(String newProcessorFamily) {
		String oldProcessorFamily = processorFamily;
		processorFamily = newProcessorFamily;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicetypesPackage.COMPUTING_MODULE__PROCESSOR_FAMILY, oldProcessorFamily, processorFamily));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVendor() {
		return vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVendor(String newVendor) {
		String oldVendor = vendor;
		vendor = newVendor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicetypesPackage.COMPUTING_MODULE__VENDOR, oldVendor, vendor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(String newModel) {
		String oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicetypesPackage.COMPUTING_MODULE__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DevicetypesPackage.COMPUTING_MODULE__PROCESSOR_FAMILY:
				return getProcessorFamily();
			case DevicetypesPackage.COMPUTING_MODULE__VENDOR:
				return getVendor();
			case DevicetypesPackage.COMPUTING_MODULE__MODEL:
				return getModel();
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
			case DevicetypesPackage.COMPUTING_MODULE__PROCESSOR_FAMILY:
				setProcessorFamily((String)newValue);
				return;
			case DevicetypesPackage.COMPUTING_MODULE__VENDOR:
				setVendor((String)newValue);
				return;
			case DevicetypesPackage.COMPUTING_MODULE__MODEL:
				setModel((String)newValue);
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
			case DevicetypesPackage.COMPUTING_MODULE__PROCESSOR_FAMILY:
				setProcessorFamily(PROCESSOR_FAMILY_EDEFAULT);
				return;
			case DevicetypesPackage.COMPUTING_MODULE__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case DevicetypesPackage.COMPUTING_MODULE__MODEL:
				setModel(MODEL_EDEFAULT);
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
			case DevicetypesPackage.COMPUTING_MODULE__PROCESSOR_FAMILY:
				return PROCESSOR_FAMILY_EDEFAULT == null ? processorFamily != null : !PROCESSOR_FAMILY_EDEFAULT.equals(processorFamily);
			case DevicetypesPackage.COMPUTING_MODULE__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case DevicetypesPackage.COMPUTING_MODULE__MODEL:
				return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
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
		result.append(" (processorFamily: ");
		result.append(processorFamily);
		result.append(", vendor: ");
		result.append(vendor);
		result.append(", model: ");
		result.append(model);
		result.append(')');
		return result.toString();
	}

} //ComputingModuleImpl
