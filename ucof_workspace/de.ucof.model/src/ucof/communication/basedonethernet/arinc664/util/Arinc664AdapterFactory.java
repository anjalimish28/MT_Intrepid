/**
 */
package ucof.communication.basedonethernet.arinc664.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

import ucof.communication.SuperCommunicationInterfaceType;
import ucof.communication.SuperMessageType;

import ucof.communication.basedonethernet.EthernetPort;

import ucof.communication.basedonethernet.arinc664.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ucof.communication.basedonethernet.arinc664.Arinc664Package
 * @generated
 */
public class Arinc664AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Arinc664Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arinc664AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Arinc664Package.eINSTANCE;
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
	protected Arinc664Switch<Adapter> modelSwitch =
		new Arinc664Switch<Adapter>() {
			@Override
			public Adapter caseA664Bus(A664Bus object) {
				return createA664BusAdapter();
			}
			@Override
			public Adapter caseA664VirtualLinkSuper(A664VirtualLinkSuper object) {
				return createA664VirtualLinkSuperAdapter();
			}
			@Override
			public Adapter caseA664VirtualLinkIn(A664VirtualLinkIn object) {
				return createA664VirtualLinkInAdapter();
			}
			@Override
			public Adapter caseA664VirtualLinkOut(A664VirtualLinkOut object) {
				return createA664VirtualLinkOutAdapter();
			}
			@Override
			public Adapter caseA664Message(A664Message object) {
				return createA664MessageAdapter();
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
			public Adapter caseSuperCommunicationInterfaceType(SuperCommunicationInterfaceType object) {
				return createSuperCommunicationInterfaceTypeAdapter();
			}
			@Override
			public Adapter caseEthernetPort(EthernetPort object) {
				return createEthernetPortAdapter();
			}
			@Override
			public Adapter caseSuperMessageType(SuperMessageType object) {
				return createSuperMessageTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link ucof.communication.basedonethernet.arinc664.A664Bus <em>A664 Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.communication.basedonethernet.arinc664.A664Bus
	 * @generated
	 */
	public Adapter createA664BusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.communication.basedonethernet.arinc664.A664VirtualLinkSuper <em>A664 Virtual Link Super</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.communication.basedonethernet.arinc664.A664VirtualLinkSuper
	 * @generated
	 */
	public Adapter createA664VirtualLinkSuperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.communication.basedonethernet.arinc664.A664VirtualLinkIn <em>A664 Virtual Link In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.communication.basedonethernet.arinc664.A664VirtualLinkIn
	 * @generated
	 */
	public Adapter createA664VirtualLinkInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.communication.basedonethernet.arinc664.A664VirtualLinkOut <em>A664 Virtual Link Out</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.communication.basedonethernet.arinc664.A664VirtualLinkOut
	 * @generated
	 */
	public Adapter createA664VirtualLinkOutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.communication.basedonethernet.arinc664.A664Message <em>A664 Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.communication.basedonethernet.arinc664.A664Message
	 * @generated
	 */
	public Adapter createA664MessageAdapter() {
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
	 * Creates a new adapter for an object of class '{@link ucof.communication.SuperCommunicationInterfaceType <em>Super Communication Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.communication.SuperCommunicationInterfaceType
	 * @generated
	 */
	public Adapter createSuperCommunicationInterfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.communication.basedonethernet.EthernetPort <em>Ethernet Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.communication.basedonethernet.EthernetPort
	 * @generated
	 */
	public Adapter createEthernetPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.communication.SuperMessageType <em>Super Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.communication.SuperMessageType
	 * @generated
	 */
	public Adapter createSuperMessageTypeAdapter() {
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

} //Arinc664AdapterFactory
