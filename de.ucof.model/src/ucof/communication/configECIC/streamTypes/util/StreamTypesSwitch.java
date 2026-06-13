/**
 */
package ucof.communication.configECIC.streamTypes.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

import ucof.communication.configECIC.streamTypes.*;

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
 * @see ucof.communication.configECIC.streamTypes.StreamTypesPackage
 * @generated
 */
public class StreamTypesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StreamTypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamTypesSwitch() {
		if (modelPackage == null) {
			modelPackage = StreamTypesPackage.eINSTANCE;
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
			case StreamTypesPackage.SUPER_STREAM_TYPE: {
				SuperStreamType superStreamType = (SuperStreamType)theEObject;
				T result = caseSuperStreamType(superStreamType);
				if (result == null) result = caseSuperIdentifierType(superStreamType);
				if (result == null) result = caseSuperTrackingType(superStreamType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StreamTypesPackage.A429_STREAM: {
				A429Stream a429Stream = (A429Stream)theEObject;
				T result = caseA429Stream(a429Stream);
				if (result == null) result = caseSuperStreamType(a429Stream);
				if (result == null) result = caseSuperIdentifierType(a429Stream);
				if (result == null) result = caseSuperTrackingType(a429Stream);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StreamTypesPackage.A825_STREAM: {
				A825Stream a825Stream = (A825Stream)theEObject;
				T result = caseA825Stream(a825Stream);
				if (result == null) result = caseSuperStreamType(a825Stream);
				if (result == null) result = caseSuperIdentifierType(a825Stream);
				if (result == null) result = caseSuperTrackingType(a825Stream);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StreamTypesPackage.A664_STREAM: {
				A664Stream a664Stream = (A664Stream)theEObject;
				T result = caseA664Stream(a664Stream);
				if (result == null) result = caseSuperStreamType(a664Stream);
				if (result == null) result = caseSuperIdentifierType(a664Stream);
				if (result == null) result = caseSuperTrackingType(a664Stream);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StreamTypesPackage.ETH_STREAM: {
				ETHStream ethStream = (ETHStream)theEObject;
				T result = caseETHStream(ethStream);
				if (result == null) result = caseSuperStreamType(ethStream);
				if (result == null) result = caseSuperIdentifierType(ethStream);
				if (result == null) result = caseSuperTrackingType(ethStream);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StreamTypesPackage.DIS_STREAM: {
				DISStream disStream = (DISStream)theEObject;
				T result = caseDISStream(disStream);
				if (result == null) result = caseSuperStreamType(disStream);
				if (result == null) result = caseSuperIdentifierType(disStream);
				if (result == null) result = caseSuperTrackingType(disStream);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StreamTypesPackage.ANA_STREAM: {
				ANAStream anaStream = (ANAStream)theEObject;
				T result = caseANAStream(anaStream);
				if (result == null) result = caseSuperStreamType(anaStream);
				if (result == null) result = caseSuperIdentifierType(anaStream);
				if (result == null) result = caseSuperTrackingType(anaStream);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StreamTypesPackage.NAD_STREAM: {
				NADStream nadStream = (NADStream)theEObject;
				T result = caseNADStream(nadStream);
				if (result == null) result = caseSuperStreamType(nadStream);
				if (result == null) result = caseSuperIdentifierType(nadStream);
				if (result == null) result = caseSuperTrackingType(nadStream);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StreamTypesPackage.DATA_TIMESTAMP: {
				DataTimestamp dataTimestamp = (DataTimestamp)theEObject;
				T result = caseDataTimestamp(dataTimestamp);
				if (result == null) result = caseSuperIdentifierType(dataTimestamp);
				if (result == null) result = caseSuperTrackingType(dataTimestamp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Stream Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Stream Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperStreamType(SuperStreamType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>A429 Stream</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>A429 Stream</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseA429Stream(A429Stream object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>A825 Stream</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>A825 Stream</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseA825Stream(A825Stream object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>A664 Stream</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>A664 Stream</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseA664Stream(A664Stream object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ETH Stream</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ETH Stream</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseETHStream(ETHStream object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DIS Stream</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DIS Stream</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDISStream(DISStream object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ANA Stream</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ANA Stream</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseANAStream(ANAStream object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NAD Stream</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NAD Stream</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNADStream(NADStream object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Timestamp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Timestamp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTimestamp(DataTimestamp object) {
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

} //StreamTypesSwitch
