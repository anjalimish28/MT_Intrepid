/**
 */
package ucof.communication.configECIC.packageStrategyTypes.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

import ucof.communication.configECIC.packageStrategyTypes.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ucof.communication.configECIC.packageStrategyTypes.PackageStrategyTypesPackage
 * @generated
 */
public class PackageStrategyTypesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PackageStrategyTypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageStrategyTypesSwitch() {
		if (modelPackage == null) {
			modelPackage = PackageStrategyTypesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PackageStrategyTypesPackage.SUPER_PACKET_STRATEGY_TYPE: {
				SuperPacketStrategyType superPacketStrategyType = (SuperPacketStrategyType)theEObject;
				T result = caseSuperPacketStrategyType(superPacketStrategyType);
				if (result == null) result = caseSuperIdentifierType(superPacketStrategyType);
				if (result == null) result = caseSuperTrackingType(superPacketStrategyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackageStrategyTypesPackage.A429_PACKET_STRATEGY: {
				A429PacketStrategy a429PacketStrategy = (A429PacketStrategy)theEObject;
				T result = caseA429PacketStrategy(a429PacketStrategy);
				if (result == null) result = caseSuperPacketStrategyType(a429PacketStrategy);
				if (result == null) result = caseSuperIdentifierType(a429PacketStrategy);
				if (result == null) result = caseSuperTrackingType(a429PacketStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackageStrategyTypesPackage.A825_PACKET_STRATEGY: {
				A825PacketStrategy a825PacketStrategy = (A825PacketStrategy)theEObject;
				T result = caseA825PacketStrategy(a825PacketStrategy);
				if (result == null) result = caseSuperPacketStrategyType(a825PacketStrategy);
				if (result == null) result = caseSuperIdentifierType(a825PacketStrategy);
				if (result == null) result = caseSuperTrackingType(a825PacketStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackageStrategyTypesPackage.A664_PACKET_STRATEGY: {
				A664PacketStrategy a664PacketStrategy = (A664PacketStrategy)theEObject;
				T result = caseA664PacketStrategy(a664PacketStrategy);
				if (result == null) result = caseSuperPacketStrategyType(a664PacketStrategy);
				if (result == null) result = caseSuperIdentifierType(a664PacketStrategy);
				if (result == null) result = caseSuperTrackingType(a664PacketStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackageStrategyTypesPackage.ETH_PACKET_STRATEGY: {
				ETHPacketStrategy ethPacketStrategy = (ETHPacketStrategy)theEObject;
				T result = caseETHPacketStrategy(ethPacketStrategy);
				if (result == null) result = caseSuperPacketStrategyType(ethPacketStrategy);
				if (result == null) result = caseSuperIdentifierType(ethPacketStrategy);
				if (result == null) result = caseSuperTrackingType(ethPacketStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackageStrategyTypesPackage.DIS_PACKET_STRATEGY: {
				DISPacketStrategy disPacketStrategy = (DISPacketStrategy)theEObject;
				T result = caseDISPacketStrategy(disPacketStrategy);
				if (result == null) result = caseSuperPacketStrategyType(disPacketStrategy);
				if (result == null) result = caseSuperIdentifierType(disPacketStrategy);
				if (result == null) result = caseSuperTrackingType(disPacketStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackageStrategyTypesPackage.ANA_PACKET_STRATEGY: {
				ANAPacketStrategy anaPacketStrategy = (ANAPacketStrategy)theEObject;
				T result = caseANAPacketStrategy(anaPacketStrategy);
				if (result == null) result = caseSuperPacketStrategyType(anaPacketStrategy);
				if (result == null) result = caseSuperIdentifierType(anaPacketStrategy);
				if (result == null) result = caseSuperTrackingType(anaPacketStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackageStrategyTypesPackage.NAD_PACKET_STRATEGY: {
				NADPacketStrategy nadPacketStrategy = (NADPacketStrategy)theEObject;
				T result = caseNADPacketStrategy(nadPacketStrategy);
				if (result == null) result = caseSuperPacketStrategyType(nadPacketStrategy);
				if (result == null) result = caseSuperIdentifierType(nadPacketStrategy);
				if (result == null) result = caseSuperTrackingType(nadPacketStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackageStrategyTypesPackage.GAP: {
				Gap gap = (Gap)theEObject;
				T result = caseGap(gap);
				if (result == null) result = caseSuperIdentifierType(gap);
				if (result == null) result = caseSuperTrackingType(gap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackageStrategyTypesPackage.TRIGGER_WORDS: {
				TriggerWords triggerWords = (TriggerWords)theEObject;
				T result = caseTriggerWords(triggerWords);
				if (result == null) result = caseSuperIdentifierType(triggerWords);
				if (result == null) result = caseSuperTrackingType(triggerWords);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackageStrategyTypesPackage.TRIGGER_WORD: {
				TriggerWord triggerWord = (TriggerWord)theEObject;
				T result = caseTriggerWord(triggerWord);
				if (result == null) result = caseSuperIdentifierType(triggerWord);
				if (result == null) result = caseSuperTrackingType(triggerWord);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackageStrategyTypesPackage.FRAME: {
				Frame frame = (Frame)theEObject;
				T result = caseFrame(frame);
				if (result == null) result = caseSuperIdentifierType(frame);
				if (result == null) result = caseSuperTrackingType(frame);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackageStrategyTypesPackage.LLC: {
				LLC llc = (LLC)theEObject;
				T result = caseLLC(llc);
				if (result == null) result = caseSuperIdentifierType(llc);
				if (result == null) result = caseSuperTrackingType(llc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackageStrategyTypesPackage.FRAMES: {
				Frames frames = (Frames)theEObject;
				T result = caseFrames(frames);
				if (result == null) result = caseSuperIdentifierType(frames);
				if (result == null) result = caseSuperTrackingType(frames);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Packet Strategy Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Packet Strategy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperPacketStrategyType(SuperPacketStrategyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>A429 Packet Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>A429 Packet Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseA429PacketStrategy(A429PacketStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>A825 Packet Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>A825 Packet Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseA825PacketStrategy(A825PacketStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>A664 Packet Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>A664 Packet Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseA664PacketStrategy(A664PacketStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ETH Packet Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ETH Packet Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseETHPacketStrategy(ETHPacketStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DIS Packet Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DIS Packet Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDISPacketStrategy(DISPacketStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ANA Packet Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ANA Packet Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseANAPacketStrategy(ANAPacketStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NAD Packet Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NAD Packet Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNADPacketStrategy(NADPacketStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gap</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gap</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGap(Gap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Words</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Words</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerWords(TriggerWords object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Word</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Word</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerWord(TriggerWord object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frame</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frame</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrame(Frame object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LLC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LLC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLLC(LLC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frames</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frames</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrames(Frames object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Identifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Identifier Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperIdentifierType(SuperIdentifierType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Tracking Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Tracking Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperTrackingType(SuperTrackingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PackageStrategyTypesSwitch
