/**
 */
package targets.configdesk.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import targets.HardwareInformation;
import targets.SuperIOHardwareType;
import targets.SuperTargetType;

import targets.configdesk.*;
import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see targets.configdesk.ConfigdeskPackage
 * @generated
 */
public class ConfigdeskAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConfigdeskPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigdeskAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ConfigdeskPackage.eINSTANCE;
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
	protected ConfigdeskSwitch<Adapter> modelSwitch =
		new ConfigdeskSwitch<Adapter>() {
			@Override
			public Adapter caseConfigurationDesk(ConfigurationDesk object) {
				return createConfigurationDeskAdapter();
			}
			@Override
			public Adapter caseSuperConfigurationDeskIOHardwareType(SuperConfigurationDeskIOHardwareType object) {
				return createSuperConfigurationDeskIOHardwareTypeAdapter();
			}
			@Override
			public Adapter caseHardwareInformation(HardwareInformation object) {
				return createHardwareInformationAdapter();
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
			public Adapter caseSuperTargetType(SuperTargetType object) {
				return createSuperTargetTypeAdapter();
			}
			@Override
			public Adapter caseSuperIOHardwareType(SuperIOHardwareType object) {
				return createSuperIOHardwareTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link targets.configdesk.ConfigurationDesk <em>Configuration Desk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.configdesk.ConfigurationDesk
	 * @generated
	 */
	public Adapter createConfigurationDeskAdapter() {
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
	 * Creates a new adapter for an object of class '{@link targets.HardwareInformation <em>Hardware Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.HardwareInformation
	 * @generated
	 */
	public Adapter createHardwareInformationAdapter() {
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
	 * Creates a new adapter for an object of class '{@link targets.SuperTargetType <em>Super Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.SuperTargetType
	 * @generated
	 */
	public Adapter createSuperTargetTypeAdapter() {
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

} //ConfigdeskAdapterFactory
