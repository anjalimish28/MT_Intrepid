/**
 */
package ucof.assignments.database.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ucof.assignments.database.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatabaseFactoryImpl extends EFactoryImpl implements DatabaseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatabaseFactory init() {
		try {
			DatabaseFactory theDatabaseFactory = (DatabaseFactory)EPackage.Registry.INSTANCE.getEFactory(DatabasePackage.eNS_URI);
			if (theDatabaseFactory != null) {
				return theDatabaseFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DatabaseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseFactoryImpl() {
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
			case DatabasePackage.SIGNAL_TO_TARGET_ASSIGNMENT_SET: return createSignalToTargetAssignmentSet();
			case DatabasePackage.SIGNAL_TO_TARGET_ASSIGNMENT: return createSignalToTargetAssignment();
			case DatabasePackage.PAYLOAD_TO_TARGET_ASSIGNMENT_SET: return createPayloadToTargetAssignmentSet();
			case DatabasePackage.PAYLOAD_TO_TARGET_ASSIGNMENT: return createPayloadToTargetAssignment();
			case DatabasePackage.MESSAGE_TO_TARGET_ASSIGNMENT_SET: return createMessageToTargetAssignmentSet();
			case DatabasePackage.MESSAGE_TO_TARGET_ASSIGNMENT: return createMessageToTargetAssignment();
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
			case DatabasePackage.SIGNAL_TARGETS:
				return createsignalTargetsFromString(eDataType, initialValue);
			case DatabasePackage.PAYLOAD_TARGETS:
				return createpayloadTargetsFromString(eDataType, initialValue);
			case DatabasePackage.MESSAGE_TARGETS:
				return createmessageTargetsFromString(eDataType, initialValue);
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
			case DatabasePackage.SIGNAL_TARGETS:
				return convertsignalTargetsToString(eDataType, instanceValue);
			case DatabasePackage.PAYLOAD_TARGETS:
				return convertpayloadTargetsToString(eDataType, instanceValue);
			case DatabasePackage.MESSAGE_TARGETS:
				return convertmessageTargetsToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalToTargetAssignmentSet createSignalToTargetAssignmentSet() {
		SignalToTargetAssignmentSetImpl signalToTargetAssignmentSet = new SignalToTargetAssignmentSetImpl();
		return signalToTargetAssignmentSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalToTargetAssignment createSignalToTargetAssignment() {
		SignalToTargetAssignmentImpl signalToTargetAssignment = new SignalToTargetAssignmentImpl();
		return signalToTargetAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayloadToTargetAssignmentSet createPayloadToTargetAssignmentSet() {
		PayloadToTargetAssignmentSetImpl payloadToTargetAssignmentSet = new PayloadToTargetAssignmentSetImpl();
		return payloadToTargetAssignmentSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayloadToTargetAssignment createPayloadToTargetAssignment() {
		PayloadToTargetAssignmentImpl payloadToTargetAssignment = new PayloadToTargetAssignmentImpl();
		return payloadToTargetAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageToTargetAssignmentSet createMessageToTargetAssignmentSet() {
		MessageToTargetAssignmentSetImpl messageToTargetAssignmentSet = new MessageToTargetAssignmentSetImpl();
		return messageToTargetAssignmentSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageToTargetAssignment createMessageToTargetAssignment() {
		MessageToTargetAssignmentImpl messageToTargetAssignment = new MessageToTargetAssignmentImpl();
		return messageToTargetAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public signalTargets createsignalTargetsFromString(EDataType eDataType, String initialValue) {
		signalTargets result = signalTargets.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertsignalTargetsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public payloadTargets createpayloadTargetsFromString(EDataType eDataType, String initialValue) {
		payloadTargets result = payloadTargets.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertpayloadTargetsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public messageTargets createmessageTargetsFromString(EDataType eDataType, String initialValue) {
		messageTargets result = messageTargets.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertmessageTargetsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabasePackage getDatabasePackage() {
		return (DatabasePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DatabasePackage getPackage() {
		return DatabasePackage.eINSTANCE;
	}

} //DatabaseFactoryImpl
