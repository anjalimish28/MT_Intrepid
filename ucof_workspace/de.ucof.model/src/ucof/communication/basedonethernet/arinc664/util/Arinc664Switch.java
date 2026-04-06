/**
 */
package ucof.communication.basedonethernet.arinc664.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ucof.common.etypes.SuperIdentifierType;
import ucof.common.etypes.SuperTrackingType;

import ucof.communication.SuperCommunicationInterfaceType;

import ucof.communication.SuperMessageType;
import ucof.communication.basedonethernet.EthernetPort;

import ucof.communication.basedonethernet.arinc664.*;

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
 * @see ucof.communication.basedonethernet.arinc664.Arinc664Package
 * @generated
 */
public class Arinc664Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Arinc664Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arinc664Switch() {
		if (modelPackage == null) {
			modelPackage = Arinc664Package.eINSTANCE;
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
			case Arinc664Package.A664_BUS: {
				A664Bus a664Bus = (A664Bus)theEObject;
				T result = caseA664Bus(a664Bus);
				if (result == null) result = caseEthernetPort(a664Bus);
				if (result == null) result = caseSuperCommunicationInterfaceType(a664Bus);
				if (result == null) result = caseSuperIdentifierType(a664Bus);
				if (result == null) result = caseSuperTrackingType(a664Bus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Arinc664Package.A664_VIRTUAL_LINK_SUPER: {
				A664VirtualLinkSuper a664VirtualLinkSuper = (A664VirtualLinkSuper)theEObject;
				T result = caseA664VirtualLinkSuper(a664VirtualLinkSuper);
				if (result == null) result = caseSuperIdentifierType(a664VirtualLinkSuper);
				if (result == null) result = caseSuperTrackingType(a664VirtualLinkSuper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Arinc664Package.A664_VIRTUAL_LINK_IN: {
				A664VirtualLinkIn a664VirtualLinkIn = (A664VirtualLinkIn)theEObject;
				T result = caseA664VirtualLinkIn(a664VirtualLinkIn);
				if (result == null) result = caseA664VirtualLinkSuper(a664VirtualLinkIn);
				if (result == null) result = caseSuperIdentifierType(a664VirtualLinkIn);
				if (result == null) result = caseSuperTrackingType(a664VirtualLinkIn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Arinc664Package.A664_VIRTUAL_LINK_OUT: {
				A664VirtualLinkOut a664VirtualLinkOut = (A664VirtualLinkOut)theEObject;
				T result = caseA664VirtualLinkOut(a664VirtualLinkOut);
				if (result == null) result = caseA664VirtualLinkSuper(a664VirtualLinkOut);
				if (result == null) result = caseSuperIdentifierType(a664VirtualLinkOut);
				if (result == null) result = caseSuperTrackingType(a664VirtualLinkOut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Arinc664Package.A664_MESSAGE: {
				A664Message a664Message = (A664Message)theEObject;
				T result = caseA664Message(a664Message);
				if (result == null) result = caseSuperMessageType(a664Message);
				if (result == null) result = caseSuperIdentifierType(a664Message);
				if (result == null) result = caseSuperTrackingType(a664Message);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>A664 Bus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>A664 Bus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseA664Bus(A664Bus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>A664 Virtual Link Super</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>A664 Virtual Link Super</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseA664VirtualLinkSuper(A664VirtualLinkSuper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>A664 Virtual Link In</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>A664 Virtual Link In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseA664VirtualLinkIn(A664VirtualLinkIn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>A664 Virtual Link Out</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>A664 Virtual Link Out</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseA664VirtualLinkOut(A664VirtualLinkOut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>A664 Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>A664 Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseA664Message(A664Message object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Super Communication Interface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Communication Interface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperCommunicationInterfaceType(SuperCommunicationInterfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ethernet Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ethernet Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEthernetPort(EthernetPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Message Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Message Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperMessageType(SuperMessageType object) {
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

} //Arinc664Switch
