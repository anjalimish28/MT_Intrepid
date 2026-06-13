/**
 */
package ucof.assignments.database.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ucof.assignments.SuperAssignmentSetType;
import ucof.assignments.SuperAssignmentType;

import ucof.assignments.database.*;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperSetType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ucof.assignments.database.DatabasePackage
 * @generated
 */
public class DatabaseAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DatabasePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DatabasePackage.eINSTANCE;
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
	protected DatabaseSwitch<Adapter> modelSwitch =
		new DatabaseSwitch<Adapter>() {
			@Override
			public Adapter caseSignalToTargetAssignmentSet(SignalToTargetAssignmentSet object) {
				return createSignalToTargetAssignmentSetAdapter();
			}
			@Override
			public Adapter caseSignalToTargetAssignment(SignalToTargetAssignment object) {
				return createSignalToTargetAssignmentAdapter();
			}
			@Override
			public Adapter casePayloadToTargetAssignmentSet(PayloadToTargetAssignmentSet object) {
				return createPayloadToTargetAssignmentSetAdapter();
			}
			@Override
			public Adapter casePayloadToTargetAssignment(PayloadToTargetAssignment object) {
				return createPayloadToTargetAssignmentAdapter();
			}
			@Override
			public Adapter caseMessageToTargetAssignmentSet(MessageToTargetAssignmentSet object) {
				return createMessageToTargetAssignmentSetAdapter();
			}
			@Override
			public Adapter caseMessageToTargetAssignment(MessageToTargetAssignment object) {
				return createMessageToTargetAssignmentAdapter();
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
			public Adapter caseSuperSetType(SuperSetType object) {
				return createSuperSetTypeAdapter();
			}
			@Override
			public Adapter caseSuperAssignmentSetType(SuperAssignmentSetType object) {
				return createSuperAssignmentSetTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link ucof.assignments.database.SignalToTargetAssignmentSet <em>Signal To Target Assignment Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.assignments.database.SignalToTargetAssignmentSet
	 * @generated
	 */
	public Adapter createSignalToTargetAssignmentSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.assignments.database.SignalToTargetAssignment <em>Signal To Target Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.assignments.database.SignalToTargetAssignment
	 * @generated
	 */
	public Adapter createSignalToTargetAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.assignments.database.PayloadToTargetAssignmentSet <em>Payload To Target Assignment Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.assignments.database.PayloadToTargetAssignmentSet
	 * @generated
	 */
	public Adapter createPayloadToTargetAssignmentSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.assignments.database.PayloadToTargetAssignment <em>Payload To Target Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.assignments.database.PayloadToTargetAssignment
	 * @generated
	 */
	public Adapter createPayloadToTargetAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.assignments.database.MessageToTargetAssignmentSet <em>Message To Target Assignment Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.assignments.database.MessageToTargetAssignmentSet
	 * @generated
	 */
	public Adapter createMessageToTargetAssignmentSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.assignments.database.MessageToTargetAssignment <em>Message To Target Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.assignments.database.MessageToTargetAssignment
	 * @generated
	 */
	public Adapter createMessageToTargetAssignmentAdapter() {
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
	 * Creates a new adapter for an object of class '{@link ucof.common.etypes.SuperSetType <em>Super Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.common.etypes.SuperSetType
	 * @generated
	 */
	public Adapter createSuperSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.assignments.SuperAssignmentSetType <em>Super Assignment Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.assignments.SuperAssignmentSetType
	 * @generated
	 */
	public Adapter createSuperAssignmentSetTypeAdapter() {
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

} //DatabaseAdapterFactory
