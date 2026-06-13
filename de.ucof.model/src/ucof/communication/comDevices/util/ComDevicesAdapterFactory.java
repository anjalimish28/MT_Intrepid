/**
 */
package ucof.communication.comDevices.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ucof.common.etypes.SuperDeviceType;
import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperSetType;
import ucof.common.etypes.SuperTrackingType;

import ucof.communication.comDevices.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ucof.communication.comDevices.ComDevicesPackage
 * @generated
 */
public class ComDevicesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ComDevicesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComDevicesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ComDevicesPackage.eINSTANCE;
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
	protected ComDevicesSwitch<Adapter> modelSwitch =
		new ComDevicesSwitch<Adapter>() {
			@Override
			public Adapter caseCommunicationDevices(CommunicationDevices object) {
				return createCommunicationDevicesAdapter();
			}
			@Override
			public Adapter caseSuperCommunicationDeviceType(SuperCommunicationDeviceType object) {
				return createSuperCommunicationDeviceTypeAdapter();
			}
			@Override
			public Adapter caseED247Gateway(ED247Gateway object) {
				return createED247GatewayAdapter();
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
			public Adapter caseSuperDeviceType(SuperDeviceType object) {
				return createSuperDeviceTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link ucof.communication.comDevices.CommunicationDevices <em>Communication Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.communication.comDevices.CommunicationDevices
	 * @generated
	 */
	public Adapter createCommunicationDevicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.communication.comDevices.SuperCommunicationDeviceType <em>Super Communication Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.communication.comDevices.SuperCommunicationDeviceType
	 * @generated
	 */
	public Adapter createSuperCommunicationDeviceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.communication.comDevices.ED247Gateway <em>ED247 Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.communication.comDevices.ED247Gateway
	 * @generated
	 */
	public Adapter createED247GatewayAdapter() {
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
	 * Creates a new adapter for an object of class '{@link ucof.common.etypes.SuperDeviceType <em>Super Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.common.etypes.SuperDeviceType
	 * @generated
	 */
	public Adapter createSuperDeviceTypeAdapter() {
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

} //ComDevicesAdapterFactory
