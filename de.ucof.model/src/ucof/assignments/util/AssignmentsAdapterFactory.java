/**
 */
package ucof.assignments.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ucof.assignments.*;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperSetType;
import ucof.common.etypes.SuperTrackingType;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ucof.assignments.AssignmentsPackage
 * @generated
 */
public class AssignmentsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AssignmentsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AssignmentsPackage.eINSTANCE;
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
	protected AssignmentsSwitch<Adapter> modelSwitch =
		new AssignmentsSwitch<Adapter>() {
			@Override
			public Adapter caseAssignments(Assignments object) {
				return createAssignmentsAdapter();
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
			public Adapter caseInterfaceToPort2PortAssignmentSet(InterfaceToPort2PortAssignmentSet object) {
				return createInterfaceToPort2PortAssignmentSetAdapter();
			}
			@Override
			public Adapter caseInterfaceToPort2PortAssignment(InterfaceToPort2PortAssignment object) {
				return createInterfaceToPort2PortAssignmentAdapter();
			}
			@Override
			public Adapter caseDeviceToImplementationAssignmentSet(DeviceToImplementationAssignmentSet object) {
				return createDeviceToImplementationAssignmentSetAdapter();
			}
			@Override
			public Adapter caseDeviceToImplementationAssignment(DeviceToImplementationAssignment object) {
				return createDeviceToImplementationAssignmentAdapter();
			}
			@Override
			public Adapter caseInterfaceToHardwareAssignmentSet(InterfaceToHardwareAssignmentSet object) {
				return createInterfaceToHardwareAssignmentSetAdapter();
			}
			@Override
			public Adapter caseInterfaceToHardwareAssignment(InterfaceToHardwareAssignment object) {
				return createInterfaceToHardwareAssignmentAdapter();
			}
			@Override
			public Adapter casePortToPortAssignmentSet(PortToPortAssignmentSet object) {
				return createPortToPortAssignmentSetAdapter();
			}
			@Override
			public Adapter casePortToPortAssignment(PortToPortAssignment object) {
				return createPortToPortAssignmentAdapter();
			}
			@Override
			public Adapter caseED247AssignmentSet(ED247AssignmentSet object) {
				return createED247AssignmentSetAdapter();
			}
			@Override
			public Adapter caseED247Assignment(ED247Assignment object) {
				return createED247AssignmentAdapter();
			}
			@Override
			public Adapter caseUDPSocketExtension(UDPSocketExtension object) {
				return createUDPSocketExtensionAdapter();
			}
			@Override
			public Adapter caseSWPortToHWPortAssignmentSet(SWPortToHWPortAssignmentSet object) {
				return createSWPortToHWPortAssignmentSetAdapter();
			}
			@Override
			public Adapter caseSWPortToHWPortAssignment(SWPortToHWPortAssignment object) {
				return createSWPortToHWPortAssignmentAdapter();
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
	 * Creates a new adapter for an object of class '{@link ucof.assignments.Assignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.assignments.Assignments
	 * @generated
	 */
	public Adapter createAssignmentsAdapter() {
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
	 * Creates a new adapter for an object of class '{@link ucof.assignments.InterfaceToPort2PortAssignmentSet <em>Interface To Port2 Port Assignment Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.assignments.InterfaceToPort2PortAssignmentSet
	 * @generated
	 */
	public Adapter createInterfaceToPort2PortAssignmentSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.assignments.InterfaceToPort2PortAssignment <em>Interface To Port2 Port Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.assignments.InterfaceToPort2PortAssignment
	 * @generated
	 */
	public Adapter createInterfaceToPort2PortAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.assignments.DeviceToImplementationAssignmentSet <em>Device To Implementation Assignment Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.assignments.DeviceToImplementationAssignmentSet
	 * @generated
	 */
	public Adapter createDeviceToImplementationAssignmentSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.assignments.DeviceToImplementationAssignment <em>Device To Implementation Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.assignments.DeviceToImplementationAssignment
	 * @generated
	 */
	public Adapter createDeviceToImplementationAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.assignments.InterfaceToHardwareAssignmentSet <em>Interface To Hardware Assignment Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.assignments.InterfaceToHardwareAssignmentSet
	 * @generated
	 */
	public Adapter createInterfaceToHardwareAssignmentSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.assignments.InterfaceToHardwareAssignment <em>Interface To Hardware Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.assignments.InterfaceToHardwareAssignment
	 * @generated
	 */
	public Adapter createInterfaceToHardwareAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.assignments.PortToPortAssignmentSet <em>Port To Port Assignment Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.assignments.PortToPortAssignmentSet
	 * @generated
	 */
	public Adapter createPortToPortAssignmentSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.assignments.PortToPortAssignment <em>Port To Port Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.assignments.PortToPortAssignment
	 * @generated
	 */
	public Adapter createPortToPortAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.assignments.ED247AssignmentSet <em>ED247 Assignment Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.assignments.ED247AssignmentSet
	 * @generated
	 */
	public Adapter createED247AssignmentSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.assignments.ED247Assignment <em>ED247 Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.assignments.ED247Assignment
	 * @generated
	 */
	public Adapter createED247AssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.assignments.UDPSocketExtension <em>UDP Socket Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.assignments.UDPSocketExtension
	 * @generated
	 */
	public Adapter createUDPSocketExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.assignments.SWPortToHWPortAssignmentSet <em>SW Port To HW Port Assignment Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.assignments.SWPortToHWPortAssignmentSet
	 * @generated
	 */
	public Adapter createSWPortToHWPortAssignmentSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.assignments.SWPortToHWPortAssignment <em>SW Port To HW Port Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.assignments.SWPortToHWPortAssignment
	 * @generated
	 */
	public Adapter createSWPortToHWPortAssignmentAdapter() {
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

} //AssignmentsAdapterFactory
