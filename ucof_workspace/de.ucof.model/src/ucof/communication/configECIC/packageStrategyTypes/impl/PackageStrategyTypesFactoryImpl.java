/**
 */
package ucof.communication.configECIC.packageStrategyTypes.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ucof.communication.configECIC.packageStrategyTypes.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageStrategyTypesFactoryImpl extends EFactoryImpl implements PackageStrategyTypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PackageStrategyTypesFactory init() {
		try {
			PackageStrategyTypesFactory thePackageStrategyTypesFactory = (PackageStrategyTypesFactory)EPackage.Registry.INSTANCE.getEFactory(PackageStrategyTypesPackage.eNS_URI);
			if (thePackageStrategyTypesFactory != null) {
				return thePackageStrategyTypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PackageStrategyTypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageStrategyTypesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PackageStrategyTypesPackage.A429_PACKET_STRATEGY: return createA429PacketStrategy();
			case PackageStrategyTypesPackage.A825_PACKET_STRATEGY: return createA825PacketStrategy();
			case PackageStrategyTypesPackage.A664_PACKET_STRATEGY: return createA664PacketStrategy();
			case PackageStrategyTypesPackage.ETH_PACKET_STRATEGY: return createETHPacketStrategy();
			case PackageStrategyTypesPackage.DIS_PACKET_STRATEGY: return createDISPacketStrategy();
			case PackageStrategyTypesPackage.ANA_PACKET_STRATEGY: return createANAPacketStrategy();
			case PackageStrategyTypesPackage.NAD_PACKET_STRATEGY: return createNADPacketStrategy();
			case PackageStrategyTypesPackage.GAP: return createGap();
			case PackageStrategyTypesPackage.TRIGGER_WORDS: return createTriggerWords();
			case PackageStrategyTypesPackage.TRIGGER_WORD: return createTriggerWord();
			case PackageStrategyTypesPackage.FRAME: return createFrame();
			case PackageStrategyTypesPackage.LLC: return createLLC();
			case PackageStrategyTypesPackage.FRAMES: return createFrames();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PackageStrategyTypesPackage.LLC_TYPE:
				return createLLCTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PackageStrategyTypesPackage.LLC_TYPE:
				return convertLLCTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A429PacketStrategy createA429PacketStrategy() {
		A429PacketStrategyImpl a429PacketStrategy = new A429PacketStrategyImpl();
		return a429PacketStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A825PacketStrategy createA825PacketStrategy() {
		A825PacketStrategyImpl a825PacketStrategy = new A825PacketStrategyImpl();
		return a825PacketStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A664PacketStrategy createA664PacketStrategy() {
		A664PacketStrategyImpl a664PacketStrategy = new A664PacketStrategyImpl();
		return a664PacketStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETHPacketStrategy createETHPacketStrategy() {
		ETHPacketStrategyImpl ethPacketStrategy = new ETHPacketStrategyImpl();
		return ethPacketStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DISPacketStrategy createDISPacketStrategy() {
		DISPacketStrategyImpl disPacketStrategy = new DISPacketStrategyImpl();
		return disPacketStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ANAPacketStrategy createANAPacketStrategy() {
		ANAPacketStrategyImpl anaPacketStrategy = new ANAPacketStrategyImpl();
		return anaPacketStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NADPacketStrategy createNADPacketStrategy() {
		NADPacketStrategyImpl nadPacketStrategy = new NADPacketStrategyImpl();
		return nadPacketStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gap createGap() {
		GapImpl gap = new GapImpl();
		return gap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerWords createTriggerWords() {
		TriggerWordsImpl triggerWords = new TriggerWordsImpl();
		return triggerWords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerWord createTriggerWord() {
		TriggerWordImpl triggerWord = new TriggerWordImpl();
		return triggerWord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Frame createFrame() {
		FrameImpl frame = new FrameImpl();
		return frame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LLC createLLC() {
		LLCImpl llc = new LLCImpl();
		return llc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Frames createFrames() {
		FramesImpl frames = new FramesImpl();
		return frames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LLCType createLLCTypeFromString(EDataType eDataType, String initialValue) {
		LLCType result = LLCType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLLCTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageStrategyTypesPackage getPackageStrategyTypesPackage() {
		return (PackageStrategyTypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PackageStrategyTypesPackage getPackage() {
		return PackageStrategyTypesPackage.eINSTANCE;
	}

} //PackageStrategyTypesFactoryImpl
