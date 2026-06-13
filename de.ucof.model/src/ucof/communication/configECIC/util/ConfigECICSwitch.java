/**
 */
package ucof.communication.configECIC.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperSetType;
import ucof.common.etypes.SuperTrackingType;

import ucof.communication.configECIC.*;

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
 * @see ucof.communication.configECIC.ConfigECICPackage
 * @generated
 */
public class ConfigECICSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConfigECICPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigECICSwitch() {
		if (modelPackage == null) {
			modelPackage = ConfigECICPackage.eINSTANCE;
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
			case ConfigECICPackage.ED247_CONFIGURATIONS: {
				ED247Configurations ed247Configurations = (ED247Configurations)theEObject;
				T result = caseED247Configurations(ed247Configurations);
				if (result == null) result = caseSuperIdentifierType(ed247Configurations);
				if (result == null) result = caseSuperTrackingType(ed247Configurations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigECICPackage.ED247_CONFIGURATION: {
				ED247Configuration ed247Configuration = (ED247Configuration)theEObject;
				T result = caseED247Configuration(ed247Configuration);
				if (result == null) result = caseSuperSetType(ed247Configuration);
				if (result == null) result = caseSuperIdentifierType(ed247Configuration);
				if (result == null) result = caseSuperTrackingType(ed247Configuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigECICPackage.FILE_PRODUCER: {
				FileProducer fileProducer = (FileProducer)theEObject;
				T result = caseFileProducer(fileProducer);
				if (result == null) result = caseSuperIdentifierType(fileProducer);
				if (result == null) result = caseSuperTrackingType(fileProducer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigECICPackage.CHANNELS: {
				Channels channels = (Channels)theEObject;
				T result = caseChannels(channels);
				if (result == null) result = caseSuperIdentifierType(channels);
				if (result == null) result = caseSuperTrackingType(channels);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigECICPackage.CHANNEL: {
				Channel channel = (Channel)theEObject;
				T result = caseChannel(channel);
				if (result == null) result = caseSuperIdentifierType(channel);
				if (result == null) result = caseSuperTrackingType(channel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigECICPackage.COM_INTERFACE: {
				ComInterface comInterface = (ComInterface)theEObject;
				T result = caseComInterface(comInterface);
				if (result == null) result = caseSuperIdentifierType(comInterface);
				if (result == null) result = caseSuperTrackingType(comInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigECICPackage.UDP_SOCKETS: {
				UDPSockets udpSockets = (UDPSockets)theEObject;
				T result = caseUDPSockets(udpSockets);
				if (result == null) result = caseSuperIdentifierType(udpSockets);
				if (result == null) result = caseSuperTrackingType(udpSockets);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigECICPackage.UDP_SOCKET: {
				UDPSocket udpSocket = (UDPSocket)theEObject;
				T result = caseUDPSocket(udpSocket);
				if (result == null) result = caseSuperIdentifierType(udpSocket);
				if (result == null) result = caseSuperTrackingType(udpSocket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigECICPackage.SRC_DIRECTION_EXTENSION: {
				srcDirectionExtension srcDirectionExtension = (srcDirectionExtension)theEObject;
				T result = casesrcDirectionExtension(srcDirectionExtension);
				if (result == null) result = caseSuperIdentifierType(srcDirectionExtension);
				if (result == null) result = caseSuperTrackingType(srcDirectionExtension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigECICPackage.HEADER: {
				Header header = (Header)theEObject;
				T result = caseHeader(header);
				if (result == null) result = caseSuperIdentifierType(header);
				if (result == null) result = caseSuperTrackingType(header);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ED247 Configurations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ED247 Configurations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseED247Configurations(ED247Configurations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ED247 Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ED247 Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseED247Configuration(ED247Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Producer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Producer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileProducer(FileProducer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channels</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channels</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChannels(Channels object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChannel(Channel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Com Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Com Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComInterface(ComInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UDP Sockets</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UDP Sockets</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUDPSockets(UDPSockets object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UDP Socket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UDP Socket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUDPSocket(UDPSocket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>src Direction Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>src Direction Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesrcDirectionExtension(srcDirectionExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeader(Header object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Super Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperSetType(SuperSetType object) {
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

} //ConfigECICSwitch
