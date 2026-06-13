/**
 */
package targets.configdesk.dSpaceArinc825.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import targets.SuperClassExtensionType;
import targets.SuperIOHardwareType;

import targets.configdesk.SuperConfigurationDeskIOHardwareType;

import targets.configdesk.dSpaceArinc825.*;
import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see targets.configdesk.dSpaceArinc825.DSpaceArinc825Package
 * @generated
 */
public class DSpaceArinc825Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DSpaceArinc825Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSpaceArinc825Switch() {
		if (modelPackage == null) {
			modelPackage = DSpaceArinc825Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DSpaceArinc825Package.A825_CONFIGURATION: {
				A825Configuration a825Configuration = (A825Configuration)theEObject;
				T result = caseA825Configuration(a825Configuration);
				if (result == null) result = caseSuperConfigurationDeskIOHardwareType(a825Configuration);
				if (result == null) result = caseSuperIOHardwareType(a825Configuration);
				if (result == null) result = caseSuperIdentifierType(a825Configuration);
				if (result == null) result = caseSuperTrackingType(a825Configuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSpaceArinc825Package.SUPER_CONFIGURATION_DESK_A825_STATUS_EXTENSION_TYPE: {
				SuperConfigurationDeskA825StatusExtensionType superConfigurationDeskA825StatusExtensionType = (SuperConfigurationDeskA825StatusExtensionType)theEObject;
				T result = caseSuperConfigurationDeskA825StatusExtensionType(superConfigurationDeskA825StatusExtensionType);
				if (result == null) result = caseSuperClassExtensionType(superConfigurationDeskA825StatusExtensionType);
				if (result == null) result = caseSuperIdentifierType(superConfigurationDeskA825StatusExtensionType);
				if (result == null) result = caseSuperTrackingType(superConfigurationDeskA825StatusExtensionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSpaceArinc825Package.SIGNAL_MODEL_ACCESS_STATUS: {
				SignalModelAccessStatus signalModelAccessStatus = (SignalModelAccessStatus)theEObject;
				T result = caseSignalModelAccessStatus(signalModelAccessStatus);
				if (result == null) result = caseSuperConfigurationDeskA825StatusExtensionType(signalModelAccessStatus);
				if (result == null) result = caseSuperClassExtensionType(signalModelAccessStatus);
				if (result == null) result = caseSuperIdentifierType(signalModelAccessStatus);
				if (result == null) result = caseSuperTrackingType(signalModelAccessStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSpaceArinc825Package.SUPER_FEATURE_TYPE: {
				SuperFeatureType superFeatureType = (SuperFeatureType)theEObject;
				T result = caseSuperFeatureType(superFeatureType);
				if (result == null) result = caseSuperConfigurationDeskA825StatusExtensionType(superFeatureType);
				if (result == null) result = caseSuperClassExtensionType(superFeatureType);
				if (result == null) result = caseSuperIdentifierType(superFeatureType);
				if (result == null) result = caseSuperTrackingType(superFeatureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSpaceArinc825Package.FEATURE_TRIGGER: {
				FeatureTrigger featureTrigger = (FeatureTrigger)theEObject;
				T result = caseFeatureTrigger(featureTrigger);
				if (result == null) result = caseSuperFeatureType(featureTrigger);
				if (result == null) result = caseSuperConfigurationDeskA825StatusExtensionType(featureTrigger);
				if (result == null) result = caseSuperClassExtensionType(featureTrigger);
				if (result == null) result = caseSuperIdentifierType(featureTrigger);
				if (result == null) result = caseSuperTrackingType(featureTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSpaceArinc825Package.FEATURE_CYCLIC_TIMING_CONTROL: {
				FeatureCyclicTimingControl featureCyclicTimingControl = (FeatureCyclicTimingControl)theEObject;
				T result = caseFeatureCyclicTimingControl(featureCyclicTimingControl);
				if (result == null) result = caseSuperFeatureType(featureCyclicTimingControl);
				if (result == null) result = caseSuperConfigurationDeskA825StatusExtensionType(featureCyclicTimingControl);
				if (result == null) result = caseSuperClassExtensionType(featureCyclicTimingControl);
				if (result == null) result = caseSuperIdentifierType(featureCyclicTimingControl);
				if (result == null) result = caseSuperTrackingType(featureCyclicTimingControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSpaceArinc825Package.FEATURE_RAW_DATA: {
				FeatureRawData featureRawData = (FeatureRawData)theEObject;
				T result = caseFeatureRawData(featureRawData);
				if (result == null) result = caseSuperFeatureType(featureRawData);
				if (result == null) result = caseSuperConfigurationDeskA825StatusExtensionType(featureRawData);
				if (result == null) result = caseSuperClassExtensionType(featureRawData);
				if (result == null) result = caseSuperIdentifierType(featureRawData);
				if (result == null) result = caseSuperTrackingType(featureRawData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSpaceArinc825Package.FEATURE_ENABLE: {
				FeatureEnable featureEnable = (FeatureEnable)theEObject;
				T result = caseFeatureEnable(featureEnable);
				if (result == null) result = caseSuperFeatureType(featureEnable);
				if (result == null) result = caseSuperConfigurationDeskA825StatusExtensionType(featureEnable);
				if (result == null) result = caseSuperClassExtensionType(featureEnable);
				if (result == null) result = caseSuperIdentifierType(featureEnable);
				if (result == null) result = caseSuperTrackingType(featureEnable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSpaceArinc825Package.FEATURE_FRAME_ACCESS: {
				FeatureFrameAccess featureFrameAccess = (FeatureFrameAccess)theEObject;
				T result = caseFeatureFrameAccess(featureFrameAccess);
				if (result == null) result = caseSuperFeatureType(featureFrameAccess);
				if (result == null) result = caseSuperConfigurationDeskA825StatusExtensionType(featureFrameAccess);
				if (result == null) result = caseSuperClassExtensionType(featureFrameAccess);
				if (result == null) result = caseSuperIdentifierType(featureFrameAccess);
				if (result == null) result = caseSuperTrackingType(featureFrameAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>A825 Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>A825 Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseA825Configuration(A825Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Configuration Desk A825 Status Extension Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Configuration Desk A825 Status Extension Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperConfigurationDeskA825StatusExtensionType(SuperConfigurationDeskA825StatusExtensionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Model Access Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Model Access Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalModelAccessStatus(SignalModelAccessStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Feature Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Feature Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperFeatureType(SuperFeatureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureTrigger(FeatureTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Cyclic Timing Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Cyclic Timing Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureCyclicTimingControl(FeatureCyclicTimingControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Raw Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Raw Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureRawData(FeatureRawData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Enable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Enable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureEnable(FeatureEnable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Frame Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Frame Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureFrameAccess(FeatureFrameAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Identifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Identifier Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperIdentifierType(SuperIdentifierType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Tracking Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Tracking Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperTrackingType(SuperTrackingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super IO Hardware Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super IO Hardware Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperIOHardwareType(SuperIOHardwareType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Configuration Desk IO Hardware Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Configuration Desk IO Hardware Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperConfigurationDeskIOHardwareType(SuperConfigurationDeskIOHardwareType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Class Extension Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Class Extension Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperClassExtensionType(SuperClassExtensionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DSpaceArinc825Switch
