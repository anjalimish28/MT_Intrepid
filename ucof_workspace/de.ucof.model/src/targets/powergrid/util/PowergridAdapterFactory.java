/**
 */
package targets.powergrid.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import targets.powergrid.*;

import ucof.assignments.SuperAssignmentType;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see targets.powergrid.PowergridPackage
 * @generated
 */
public class PowergridAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PowergridPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowergridAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PowergridPackage.eINSTANCE;
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
	protected PowergridSwitch<Adapter> modelSwitch =
		new PowergridSwitch<Adapter>() {
			@Override
			public Adapter caseSuperPowerType(SuperPowerType object) {
				return createSuperPowerTypeAdapter();
			}
			@Override
			public Adapter caseEletrcialInterfaces(EletrcialInterfaces object) {
				return createEletrcialInterfacesAdapter();
			}
			@Override
			public Adapter caseSuperElectricalInterfaceType(SuperElectricalInterfaceType object) {
				return createSuperElectricalInterfaceTypeAdapter();
			}
			@Override
			public Adapter caseSuperElectricalGridType(SuperElectricalGridType object) {
				return createSuperElectricalGridTypeAdapter();
			}
			@Override
			public Adapter casePowerConnectionSet(PowerConnectionSet object) {
				return createPowerConnectionSetAdapter();
			}
			@Override
			public Adapter casePowerConnection(PowerConnection object) {
				return createPowerConnectionAdapter();
			}
			@Override
			public Adapter caseElectricalPowerGridSet(ElectricalPowerGridSet object) {
				return createElectricalPowerGridSetAdapter();
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
			public Adapter caseSuperAssignmentType(SuperAssignmentType object) {
				return createSuperAssignmentTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link targets.powergrid.SuperPowerType <em>Super Power Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.powergrid.SuperPowerType
	 * @generated
	 */
	public Adapter createSuperPowerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.powergrid.EletrcialInterfaces <em>Eletrcial Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.powergrid.EletrcialInterfaces
	 * @generated
	 */
	public Adapter createEletrcialInterfacesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.powergrid.SuperElectricalInterfaceType <em>Super Electrical Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.powergrid.SuperElectricalInterfaceType
	 * @generated
	 */
	public Adapter createSuperElectricalInterfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.powergrid.SuperElectricalGridType <em>Super Electrical Grid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.powergrid.SuperElectricalGridType
	 * @generated
	 */
	public Adapter createSuperElectricalGridTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.powergrid.PowerConnectionSet <em>Power Connection Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.powergrid.PowerConnectionSet
	 * @generated
	 */
	public Adapter createPowerConnectionSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.powergrid.PowerConnection <em>Power Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.powergrid.PowerConnection
	 * @generated
	 */
	public Adapter createPowerConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link targets.powergrid.ElectricalPowerGridSet <em>Electrical Power Grid Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see targets.powergrid.ElectricalPowerGridSet
	 * @generated
	 */
	public Adapter createElectricalPowerGridSetAdapter() {
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
	 * Creates a new adapter for an object of class '{@link ucof.assignments.SuperAssignmentType <em>Super Assignment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.assignments.SuperAssignmentType
	 * @generated
	 */
	public Adapter createSuperAssignmentTypeAdapter() {
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

} //PowergridAdapterFactory
