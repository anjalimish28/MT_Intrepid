/**
 */
package targets.tricore299a653p4.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import targets.HardwareInformation;
import targets.SuperAssignmentSpecificationType;
import targets.SuperIOHardwareType;
import targets.SuperTargetType;

import targets.a653capabletarget.SuperA653CapableTargetType;

import targets.tricore299a653p4.*;
import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see targets.tricore299a653p4.Tricore299a653p4Package
 * @generated
 */
public class Tricore299a653p4AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Tricore299a653p4Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tricore299a653p4AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Tricore299a653p4Package.eINSTANCE;
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
	protected Tricore299a653p4Switch<Adapter> modelSwitch =
		new Tricore299a653p4Switch<Adapter>() {
			@Override
			public Adapter caseTriCore299(TriCore299 object) {
				return createTriCore299Adapter();
			}
			@Override
			public Adapter caseSuperTriCore299IOHardwareType(SuperTriCore299IOHardwareType object) {
				return createSuperTriCore299IOHardwareTypeAdapter();
			}
			@Override
			public Adapter caseA825DriverConfiguration(A825DriverConfiguration object) {
				return createA825DriverConfigurationAdapter();
			}
			@Override
			public Adapter caseMessagePostBoxSpecifier(MessagePostBoxSpecifier object) {
				return createMessagePostBoxSpecifierAdapter();
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
			public Adapter caseSuperA653CapableTargetType(SuperA653CapableTargetType object) {
				return createSuperA653CapableTargetTypeAdapter();
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
			public Adapter caseSuperAssignmentSpecificationType(SuperAssignmentSpecificationType object) {
				return createSuperAssignmentSpecificationTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link targets.tricore299a653p4.TriCore299 <em>Tri Core299</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.tricore299a653p4.TriCore299
	 * @generated
	 */
	public Adapter createTriCore299Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.tricore299a653p4.SuperTriCore299IOHardwareType <em>Super Tri Core299 IO Hardware Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.tricore299a653p4.SuperTriCore299IOHardwareType
	 * @generated
	 */
	public Adapter createSuperTriCore299IOHardwareTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.tricore299a653p4.A825DriverConfiguration <em>A825 Driver Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.tricore299a653p4.A825DriverConfiguration
	 * @generated
	 */
	public Adapter createA825DriverConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.tricore299a653p4.MessagePostBoxSpecifier <em>Message Post Box Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.tricore299a653p4.MessagePostBoxSpecifier
	 * @generated
	 */
	public Adapter createMessagePostBoxSpecifierAdapter() {
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
	 * Creates a new adapter for an object of class '{@link targets.a653capabletarget.SuperA653CapableTargetType <em>Super A653 Capable Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.a653capabletarget.SuperA653CapableTargetType
	 * @generated
	 */
	public Adapter createSuperA653CapableTargetTypeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link targets.SuperAssignmentSpecificationType <em>Super Assignment Specification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.SuperAssignmentSpecificationType
	 * @generated
	 */
	public Adapter createSuperAssignmentSpecificationTypeAdapter() {
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

} //Tricore299a653p4AdapterFactory
