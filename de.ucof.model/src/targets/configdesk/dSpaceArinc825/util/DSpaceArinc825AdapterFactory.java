/**
 */
package targets.configdesk.dSpaceArinc825.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import targets.SuperClassExtensionType;
import targets.SuperIOHardwareType;

import targets.configdesk.SuperConfigurationDeskIOHardwareType;

import targets.configdesk.dSpaceArinc825.*;
import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see targets.configdesk.dSpaceArinc825.DSpaceArinc825Package
 * @generated
 */
public class DSpaceArinc825AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DSpaceArinc825Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSpaceArinc825AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DSpaceArinc825Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSpaceArinc825Switch<Adapter> modelSwitch =
		new DSpaceArinc825Switch<Adapter>() {
			@Override
			public Adapter caseA825Configuration(A825Configuration object) {
				return createA825ConfigurationAdapter();
			}
			@Override
			public Adapter caseSuperConfigurationDeskA825StatusExtensionType(SuperConfigurationDeskA825StatusExtensionType object) {
				return createSuperConfigurationDeskA825StatusExtensionTypeAdapter();
			}
			@Override
			public Adapter caseSignalModelAccessStatus(SignalModelAccessStatus object) {
				return createSignalModelAccessStatusAdapter();
			}
			@Override
			public Adapter caseSuperFeatureType(SuperFeatureType object) {
				return createSuperFeatureTypeAdapter();
			}
			@Override
			public Adapter caseFeatureTrigger(FeatureTrigger object) {
				return createFeatureTriggerAdapter();
			}
			@Override
			public Adapter caseFeatureCyclicTimingControl(FeatureCyclicTimingControl object) {
				return createFeatureCyclicTimingControlAdapter();
			}
			@Override
			public Adapter caseFeatureRawData(FeatureRawData object) {
				return createFeatureRawDataAdapter();
			}
			@Override
			public Adapter caseFeatureEnable(FeatureEnable object) {
				return createFeatureEnableAdapter();
			}
			@Override
			public Adapter caseFeatureFrameAccess(FeatureFrameAccess object) {
				return createFeatureFrameAccessAdapter();
			}
			@Override
			public Adapter caseSuperIdentifierType(SuperIdentifierType object) {
				return createSuperIdentifierTypeAdapter();
			}
			@Override
			public Adapter caseSuperTrackingType(SuperTrackingType object) {
				return createSuperTrackingTypeAdapter();
			}
			@Override
			public Adapter caseSuperIOHardwareType(SuperIOHardwareType object) {
				return createSuperIOHardwareTypeAdapter();
			}
			@Override
			public Adapter caseSuperConfigurationDeskIOHardwareType(SuperConfigurationDeskIOHardwareType object) {
				return createSuperConfigurationDeskIOHardwareTypeAdapter();
			}
			@Override
			public Adapter caseSuperClassExtensionType(SuperClassExtensionType object) {
				return createSuperClassExtensionTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link targets.configdesk.dSpaceArinc825.A825Configuration <em>A825 Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.configdesk.dSpaceArinc825.A825Configuration
	 * @generated
	 */
	public Adapter createA825ConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.configdesk.dSpaceArinc825.SuperConfigurationDeskA825StatusExtensionType <em>Super Configuration Desk A825 Status Extension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.configdesk.dSpaceArinc825.SuperConfigurationDeskA825StatusExtensionType
	 * @generated
	 */
	public Adapter createSuperConfigurationDeskA825StatusExtensionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.configdesk.dSpaceArinc825.SignalModelAccessStatus <em>Signal Model Access Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.configdesk.dSpaceArinc825.SignalModelAccessStatus
	 * @generated
	 */
	public Adapter createSignalModelAccessStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.configdesk.dSpaceArinc825.SuperFeatureType <em>Super Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.configdesk.dSpaceArinc825.SuperFeatureType
	 * @generated
	 */
	public Adapter createSuperFeatureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.configdesk.dSpaceArinc825.FeatureTrigger <em>Feature Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.configdesk.dSpaceArinc825.FeatureTrigger
	 * @generated
	 */
	public Adapter createFeatureTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.configdesk.dSpaceArinc825.FeatureCyclicTimingControl <em>Feature Cyclic Timing Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.configdesk.dSpaceArinc825.FeatureCyclicTimingControl
	 * @generated
	 */
	public Adapter createFeatureCyclicTimingControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.configdesk.dSpaceArinc825.FeatureRawData <em>Feature Raw Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.configdesk.dSpaceArinc825.FeatureRawData
	 * @generated
	 */
	public Adapter createFeatureRawDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.configdesk.dSpaceArinc825.FeatureEnable <em>Feature Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.configdesk.dSpaceArinc825.FeatureEnable
	 * @generated
	 */
	public Adapter createFeatureEnableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.configdesk.dSpaceArinc825.FeatureFrameAccess <em>Feature Frame Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.configdesk.dSpaceArinc825.FeatureFrameAccess
	 * @generated
	 */
	public Adapter createFeatureFrameAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.common.etypes.SuperIdentifierType <em>Super Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.common.etypes.SuperIdentifierType
	 * @generated
	 */
	public Adapter createSuperIdentifierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.common.etypes.SuperTrackingType <em>Super Tracking Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.common.etypes.SuperTrackingType
	 * @generated
	 */
	public Adapter createSuperTrackingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.SuperIOHardwareType <em>Super IO Hardware Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.SuperIOHardwareType
	 * @generated
	 */
	public Adapter createSuperIOHardwareTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.configdesk.SuperConfigurationDeskIOHardwareType <em>Super Configuration Desk IO Hardware Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.configdesk.SuperConfigurationDeskIOHardwareType
	 * @generated
	 */
	public Adapter createSuperConfigurationDeskIOHardwareTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.SuperClassExtensionType <em>Super Class Extension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.SuperClassExtensionType
	 * @generated
	 */
	public Adapter createSuperClassExtensionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DSpaceArinc825AdapterFactory
