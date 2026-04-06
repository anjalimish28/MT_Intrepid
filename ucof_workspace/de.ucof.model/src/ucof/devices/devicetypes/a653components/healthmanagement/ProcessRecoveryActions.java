/**
 */
package ucof.devices.devicetypes.a653components.healthmanagement;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Process Recovery Actions</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ucof.devices.devicetypes.a653components.healthmanagement.HealthmanagementPackage#getProcessRecoveryActions()
 * @model
 * @generated
 */
public enum ProcessRecoveryActions implements Enumerator {
	/**
	 * The '<em><b>Not Set</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_SET_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_SET(0, "NotSet", "NotSet"),

	/**
	 * The '<em><b>Ignore And Log</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IGNORE_AND_LOG_VALUE
	 * @generated
	 * @ordered
	 */
	IGNORE_AND_LOG(1, "IgnoreAndLog", "IgnoreAndLog"),

	/**
	 * The '<em><b>Ignore NTimes Before Action</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IGNORE_NTIMES_BEFORE_ACTION_VALUE
	 * @generated
	 * @ordered
	 */
	IGNORE_NTIMES_BEFORE_ACTION(2, "IgnoreNTimesBeforeAction", "IgnoreNTimesBeforeAction"),

	/**
	 * The '<em><b>Stop And Reinitialize From Entry Address</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOP_AND_REINITIALIZE_FROM_ENTRY_ADDRESS_VALUE
	 * @generated
	 * @ordered
	 */
	STOP_AND_REINITIALIZE_FROM_ENTRY_ADDRESS(3, "StopAndReinitializeFromEntryAddress", "StopAndReinitializeFromEntryAddress"),

	/**
	 * The '<em><b>Stop Process And Start Other Process</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOP_PROCESS_AND_START_OTHER_PROCESS_VALUE
	 * @generated
	 * @ordered
	 */
	STOP_PROCESS_AND_START_OTHER_PROCESS(4, "StopProcessAndStartOtherProcess", "StopProcessAndStartOtherProcess"),

	/**
	 * The '<em><b>Stop Process</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOP_PROCESS_VALUE
	 * @generated
	 * @ordered
	 */
	STOP_PROCESS(5, "StopProcess", "StopProcess"),

	/**
	 * The '<em><b>Partition Cold Restart</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTITION_COLD_RESTART_VALUE
	 * @generated
	 * @ordered
	 */
	PARTITION_COLD_RESTART(6, "PartitionColdRestart", "PartitionColdRestart"),

	/**
	 * The '<em><b>Partition Warm Restart</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTITION_WARM_RESTART_VALUE
	 * @generated
	 * @ordered
	 */
	PARTITION_WARM_RESTART(7, "PartitionWarmRestart", "PartitionWarmRestart"),

	/**
	 * The '<em><b>Partition Set Idle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTITION_SET_IDLE_VALUE
	 * @generated
	 * @ordered
	 */
	PARTITION_SET_IDLE(8, "PartitionSetIdle", "PartitionSetIdle");

	/**
	 * The '<em><b>Not Set</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_SET
	 * @model name="NotSet"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_SET_VALUE = 0;

	/**
	 * The '<em><b>Ignore And Log</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IGNORE_AND_LOG
	 * @model name="IgnoreAndLog"
	 * @generated
	 * @ordered
	 */
	public static final int IGNORE_AND_LOG_VALUE = 1;

	/**
	 * The '<em><b>Ignore NTimes Before Action</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IGNORE_NTIMES_BEFORE_ACTION
	 * @model name="IgnoreNTimesBeforeAction"
	 * @generated
	 * @ordered
	 */
	public static final int IGNORE_NTIMES_BEFORE_ACTION_VALUE = 2;

	/**
	 * The '<em><b>Stop And Reinitialize From Entry Address</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOP_AND_REINITIALIZE_FROM_ENTRY_ADDRESS
	 * @model name="StopAndReinitializeFromEntryAddress"
	 * @generated
	 * @ordered
	 */
	public static final int STOP_AND_REINITIALIZE_FROM_ENTRY_ADDRESS_VALUE = 3;

	/**
	 * The '<em><b>Stop Process And Start Other Process</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOP_PROCESS_AND_START_OTHER_PROCESS
	 * @model name="StopProcessAndStartOtherProcess"
	 * @generated
	 * @ordered
	 */
	public static final int STOP_PROCESS_AND_START_OTHER_PROCESS_VALUE = 4;

	/**
	 * The '<em><b>Stop Process</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOP_PROCESS
	 * @model name="StopProcess"
	 * @generated
	 * @ordered
	 */
	public static final int STOP_PROCESS_VALUE = 5;

	/**
	 * The '<em><b>Partition Cold Restart</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTITION_COLD_RESTART
	 * @model name="PartitionColdRestart"
	 * @generated
	 * @ordered
	 */
	public static final int PARTITION_COLD_RESTART_VALUE = 6;

	/**
	 * The '<em><b>Partition Warm Restart</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTITION_WARM_RESTART
	 * @model name="PartitionWarmRestart"
	 * @generated
	 * @ordered
	 */
	public static final int PARTITION_WARM_RESTART_VALUE = 7;

	/**
	 * The '<em><b>Partition Set Idle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTITION_SET_IDLE
	 * @model name="PartitionSetIdle"
	 * @generated
	 * @ordered
	 */
	public static final int PARTITION_SET_IDLE_VALUE = 8;

	/**
	 * An array of all the '<em><b>Process Recovery Actions</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProcessRecoveryActions[] VALUES_ARRAY =
		new ProcessRecoveryActions[] {
			NOT_SET,
			IGNORE_AND_LOG,
			IGNORE_NTIMES_BEFORE_ACTION,
			STOP_AND_REINITIALIZE_FROM_ENTRY_ADDRESS,
			STOP_PROCESS_AND_START_OTHER_PROCESS,
			STOP_PROCESS,
			PARTITION_COLD_RESTART,
			PARTITION_WARM_RESTART,
			PARTITION_SET_IDLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Process Recovery Actions</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProcessRecoveryActions> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Process Recovery Actions</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProcessRecoveryActions get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProcessRecoveryActions result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Process Recovery Actions</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProcessRecoveryActions getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProcessRecoveryActions result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Process Recovery Actions</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProcessRecoveryActions get(int value) {
		switch (value) {
			case NOT_SET_VALUE: return NOT_SET;
			case IGNORE_AND_LOG_VALUE: return IGNORE_AND_LOG;
			case IGNORE_NTIMES_BEFORE_ACTION_VALUE: return IGNORE_NTIMES_BEFORE_ACTION;
			case STOP_AND_REINITIALIZE_FROM_ENTRY_ADDRESS_VALUE: return STOP_AND_REINITIALIZE_FROM_ENTRY_ADDRESS;
			case STOP_PROCESS_AND_START_OTHER_PROCESS_VALUE: return STOP_PROCESS_AND_START_OTHER_PROCESS;
			case STOP_PROCESS_VALUE: return STOP_PROCESS;
			case PARTITION_COLD_RESTART_VALUE: return PARTITION_COLD_RESTART;
			case PARTITION_WARM_RESTART_VALUE: return PARTITION_WARM_RESTART;
			case PARTITION_SET_IDLE_VALUE: return PARTITION_SET_IDLE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ProcessRecoveryActions(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ProcessRecoveryActions
