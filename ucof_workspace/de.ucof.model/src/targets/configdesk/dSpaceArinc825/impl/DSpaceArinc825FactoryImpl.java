/**
 */
package targets.configdesk.dSpaceArinc825.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import targets.configdesk.dSpaceArinc825.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DSpaceArinc825FactoryImpl extends EFactoryImpl implements DSpaceArinc825Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DSpaceArinc825Factory init() {
		try {
			DSpaceArinc825Factory theDSpaceArinc825Factory = (DSpaceArinc825Factory)EPackage.Registry.INSTANCE.getEFactory(DSpaceArinc825Package.eNS_URI);
			if (theDSpaceArinc825Factory != null) {
				return theDSpaceArinc825Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DSpaceArinc825FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSpaceArinc825FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DSpaceArinc825Package.A825_CONFIGURATION: return createA825Configuration();
			case DSpaceArinc825Package.SIGNAL_MODEL_ACCESS_STATUS: return createSignalModelAccessStatus();
			case DSpaceArinc825Package.FEATURE_TRIGGER: return createFeatureTrigger();
			case DSpaceArinc825Package.FEATURE_CYCLIC_TIMING_CONTROL: return createFeatureCyclicTimingControl();
			case DSpaceArinc825Package.FEATURE_RAW_DATA: return createFeatureRawData();
			case DSpaceArinc825Package.FEATURE_ENABLE: return createFeatureEnable();
			case DSpaceArinc825Package.FEATURE_FRAME_ACCESS: return createFeatureFrameAccess();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DSpaceArinc825Package.MODEL_ACCESS:
				return createModelAccessFromString(eDataType, initialValue);
			case DSpaceArinc825Package.MODEL_ACCESSIBLE_PORTS_RX:
				return createModelAccessiblePortsRXFromString(eDataType, initialValue);
			case DSpaceArinc825Package.MODEL_ACCESSIBLE_PORTS_TX:
				return createModelAccessiblePortsTXFromString(eDataType, initialValue);
			case DSpaceArinc825Package.MODEL_PORT_BLOCK_STRUCTURE:
				return createModelPortBlockStructureFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DSpaceArinc825Package.MODEL_ACCESS:
				return convertModelAccessToString(eDataType, instanceValue);
			case DSpaceArinc825Package.MODEL_ACCESSIBLE_PORTS_RX:
				return convertModelAccessiblePortsRXToString(eDataType, instanceValue);
			case DSpaceArinc825Package.MODEL_ACCESSIBLE_PORTS_TX:
				return convertModelAccessiblePortsTXToString(eDataType, instanceValue);
			case DSpaceArinc825Package.MODEL_PORT_BLOCK_STRUCTURE:
				return convertModelPortBlockStructureToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A825Configuration createA825Configuration() {
		A825ConfigurationImpl a825Configuration = new A825ConfigurationImpl();
		return a825Configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalModelAccessStatus createSignalModelAccessStatus() {
		SignalModelAccessStatusImpl signalModelAccessStatus = new SignalModelAccessStatusImpl();
		return signalModelAccessStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureTrigger createFeatureTrigger() {
		FeatureTriggerImpl featureTrigger = new FeatureTriggerImpl();
		return featureTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureCyclicTimingControl createFeatureCyclicTimingControl() {
		FeatureCyclicTimingControlImpl featureCyclicTimingControl = new FeatureCyclicTimingControlImpl();
		return featureCyclicTimingControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureRawData createFeatureRawData() {
		FeatureRawDataImpl featureRawData = new FeatureRawDataImpl();
		return featureRawData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureEnable createFeatureEnable() {
		FeatureEnableImpl featureEnable = new FeatureEnableImpl();
		return featureEnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureFrameAccess createFeatureFrameAccess() {
		FeatureFrameAccessImpl featureFrameAccess = new FeatureFrameAccessImpl();
		return featureFrameAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAccess createModelAccessFromString(EDataType eDataType, String initialValue) {
		ModelAccess result = ModelAccess.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModelAccessToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAccessiblePortsRX createModelAccessiblePortsRXFromString(EDataType eDataType, String initialValue) {
		ModelAccessiblePortsRX result = ModelAccessiblePortsRX.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModelAccessiblePortsRXToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAccessiblePortsTX createModelAccessiblePortsTXFromString(EDataType eDataType, String initialValue) {
		ModelAccessiblePortsTX result = ModelAccessiblePortsTX.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModelAccessiblePortsTXToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelPortBlockStructure createModelPortBlockStructureFromString(EDataType eDataType, String initialValue) {
		ModelPortBlockStructure result = ModelPortBlockStructure.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModelPortBlockStructureToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSpaceArinc825Package getDSpaceArinc825Package() {
		return (DSpaceArinc825Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DSpaceArinc825Package getPackage() {
		return DSpaceArinc825Package.eINSTANCE;
	}

} //DSpaceArinc825FactoryImpl
