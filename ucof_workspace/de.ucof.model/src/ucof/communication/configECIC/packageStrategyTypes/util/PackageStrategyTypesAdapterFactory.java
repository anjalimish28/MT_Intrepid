/**
 */
package ucof.communication.configECIC.packageStrategyTypes.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

import ucof.communication.configECIC.packageStrategyTypes.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesPackage
 * @generated
 */
public class PackageStrategyTypesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PackageStrategyTypesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageStrategyTypesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PackageStrategyTypesPackage.eINSTANCE;
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
	protected PackageStrategyTypesSwitch<Adapter> modelSwitch =
		new PackageStrategyTypesSwitch<Adapter>() {
			@Override
			public Adapter caseSuperPacketStrategyType(SuperPacketStrategyType object) {
				return createSuperPacketStrategyTypeAdapter();
			}
			@Override
			public Adapter caseA429PacketStrategy(A429PacketStrategy object) {
				return createA429PacketStrategyAdapter();
			}
			@Override
			public Adapter caseA825PacketStrategy(A825PacketStrategy object) {
				return createA825PacketStrategyAdapter();
			}
			@Override
			public Adapter caseA664PacketStrategy(A664PacketStrategy object) {
				return createA664PacketStrategyAdapter();
			}
			@Override
			public Adapter caseETHPacketStrategy(ETHPacketStrategy object) {
				return createETHPacketStrategyAdapter();
			}
			@Override
			public Adapter caseDISPacketStrategy(DISPacketStrategy object) {
				return createDISPacketStrategyAdapter();
			}
			@Override
			public Adapter caseANAPacketStrategy(ANAPacketStrategy object) {
				return createANAPacketStrategyAdapter();
			}
			@Override
			public Adapter caseNADPacketStrategy(NADPacketStrategy object) {
				return createNADPacketStrategyAdapter();
			}
			@Override
			public Adapter caseGap(Gap object) {
				return createGapAdapter();
			}
			@Override
			public Adapter caseTriggerWords(TriggerWords object) {
				return createTriggerWordsAdapter();
			}
			@Override
			public Adapter caseTriggerWord(TriggerWord object) {
				return createTriggerWordAdapter();
			}
			@Override
			public Adapter caseFrame(Frame object) {
				return createFrameAdapter();
			}
			@Override
			public Adapter caseLLC(LLC object) {
				return createLLCAdapter();
			}
			@Override
			public Adapter caseFrames(Frames object) {
				return createFramesAdapter();
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
	 * Creates a new adapter for an object of class '{@link ucof.communication.configECIC.packageStrategyTypes.SuperPacketStrategyType <em>Super Packet Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.communication.configECIC.packageStrategyTypes.SuperPacketStrategyType
	 * @generated
	 */
	public Adapter createSuperPacketStrategyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.communication.configECIC.packageStrategyTypes.A429PacketStrategy <em>A429 Packet Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.communication.configECIC.packageStrategyTypes.A429PacketStrategy
	 * @generated
	 */
	public Adapter createA429PacketStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.communication.configECIC.packageStrategyTypes.A825PacketStrategy <em>A825 Packet Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.communication.configECIC.packageStrategyTypes.A825PacketStrategy
	 * @generated
	 */
	public Adapter createA825PacketStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.communication.configECIC.packageStrategyTypes.A664PacketStrategy <em>A664 Packet Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.communication.configECIC.packageStrategyTypes.A664PacketStrategy
	 * @generated
	 */
	public Adapter createA664PacketStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.communication.configECIC.packageStrategyTypes.ETHPacketStrategy <em>ETH Packet Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.communication.configECIC.packageStrategyTypes.ETHPacketStrategy
	 * @generated
	 */
	public Adapter createETHPacketStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.communication.configECIC.packageStrategyTypes.DISPacketStrategy <em>DIS Packet Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.communication.configECIC.packageStrategyTypes.DISPacketStrategy
	 * @generated
	 */
	public Adapter createDISPacketStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.communication.configECIC.packageStrategyTypes.ANAPacketStrategy <em>ANA Packet Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.communication.configECIC.packageStrategyTypes.ANAPacketStrategy
	 * @generated
	 */
	public Adapter createANAPacketStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.communication.configECIC.packageStrategyTypes.NADPacketStrategy <em>NAD Packet Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.communication.configECIC.packageStrategyTypes.NADPacketStrategy
	 * @generated
	 */
	public Adapter createNADPacketStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.communication.configECIC.packageStrategyTypes.Gap <em>Gap</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.communication.configECIC.packageStrategyTypes.Gap
	 * @generated
	 */
	public Adapter createGapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.communication.configECIC.packageStrategyTypes.TriggerWords <em>Trigger Words</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.communication.configECIC.packageStrategyTypes.TriggerWords
	 * @generated
	 */
	public Adapter createTriggerWordsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.communication.configECIC.packageStrategyTypes.TriggerWord <em>Trigger Word</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.communication.configECIC.packageStrategyTypes.TriggerWord
	 * @generated
	 */
	public Adapter createTriggerWordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.communication.configECIC.packageStrategyTypes.Frame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.communication.configECIC.packageStrategyTypes.Frame
	 * @generated
	 */
	public Adapter createFrameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.communication.configECIC.packageStrategyTypes.LLC <em>LLC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.communication.configECIC.packageStrategyTypes.LLC
	 * @generated
	 */
	public Adapter createLLCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucof.communication.configECIC.packageStrategyTypes.Frames <em>Frames</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucof.communication.configECIC.packageStrategyTypes.Frames
	 * @generated
	 */
	public Adapter createFramesAdapter() {
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

} //PackageStrategyTypesAdapterFactory
