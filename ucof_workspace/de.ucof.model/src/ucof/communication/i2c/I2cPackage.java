/**
 */
package ucof.communication.i2c;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import ucof.common.etypes.EtypesPackage;

import ucof.communication.CommunicationPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Container for I2C (Inter-Integrated Circuit) bus interface elements. Based on NXP UM10204 Rev. 7.0 (1 October 2021). I2C is a synchronous, bidirectional, half-duplex serial bus using two lines: SDA (serial data) and SCL (serial clock). Rev. 7.0 updated terminology: 'master' is now 'controller', 'slave' is now 'target'. Reference: https://www.nxp.com/docs/en/user-guide/UM10204.pdf
 * <!-- end-model-doc -->
 * @see ucof.communication.i2c.I2cFactory
 * @model kind="package"
 * @generated
 */
public interface I2cPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "i2c";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://gitlab.com/ucof/ucof.de/model/v001/ucof/communication/i2c";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ucof.model.communication.i2c";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	I2cPackage eINSTANCE = ucof.communication.i2c.impl.I2cPackageImpl.init();

	/**
	 * The meta object id for the '{@link ucof.communication.i2c.impl.I2CBusImpl <em>I2C Bus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.i2c.impl.I2CBusImpl
	 * @see ucof.communication.i2c.impl.I2cPackageImpl#getI2CBus()
	 * @generated
	 */
	int I2C_BUS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_BUS__ID = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_BUS__NAME = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_BUS__DOCUMENTATION = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_BUS__MODIFIED = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_BUS__MODIFIER = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_BUS__TRACE_LINK = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_BUS__CREATED = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_BUS__CREATOR = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_BUS__VERSION = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Bus Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_BUS__BUS_MODE = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Address Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_BUS__ADDRESS_MODE = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pull Up Resistance Ohm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_BUS__PULL_UP_RESISTANCE_OHM = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Clock Stretching Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_BUS__CLOCK_STRETCHING_ENABLED = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Multi Controller Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_BUS__MULTI_CONTROLLER_ENABLED = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>I2C Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_BUS_FEATURE_COUNT = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>I2C Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_BUS_OPERATION_COUNT = CommunicationPackage.SUPER_COMMUNICATION_INTERFACE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.i2c.impl.I2CMessageImpl <em>I2C Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.i2c.impl.I2CMessageImpl
	 * @see ucof.communication.i2c.impl.I2cPackageImpl#getI2CMessage()
	 * @generated
	 */
	int I2C_MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_MESSAGE__ID = CommunicationPackage.SUPER_MESSAGE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_MESSAGE__NAME = CommunicationPackage.SUPER_MESSAGE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_MESSAGE__DOCUMENTATION = CommunicationPackage.SUPER_MESSAGE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_MESSAGE__MODIFIED = CommunicationPackage.SUPER_MESSAGE_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_MESSAGE__MODIFIER = CommunicationPackage.SUPER_MESSAGE_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_MESSAGE__TRACE_LINK = CommunicationPackage.SUPER_MESSAGE_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_MESSAGE__CREATED = CommunicationPackage.SUPER_MESSAGE_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_MESSAGE__CREATOR = CommunicationPackage.SUPER_MESSAGE_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_MESSAGE__VERSION = CommunicationPackage.SUPER_MESSAGE_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Target Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_MESSAGE__TARGET_ADDRESS = CommunicationPackage.SUPER_MESSAGE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_MESSAGE__DIRECTION = CommunicationPackage.SUPER_MESSAGE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Length Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_MESSAGE__DATA_LENGTH_BYTES = CommunicationPackage.SUPER_MESSAGE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Repeated Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_MESSAGE__REPEATED_START = CommunicationPackage.SUPER_MESSAGE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Register Pointer Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_MESSAGE__REGISTER_POINTER_BYTE = CommunicationPackage.SUPER_MESSAGE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Register Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_MESSAGE__REGISTER_SPECIFICATION = CommunicationPackage.SUPER_MESSAGE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>I2C Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_MESSAGE_FEATURE_COUNT = CommunicationPackage.SUPER_MESSAGE_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>I2C Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_MESSAGE_OPERATION_COUNT = CommunicationPackage.SUPER_MESSAGE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.i2c.impl.I2CRegisterSpecificationImpl <em>I2C Register Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.i2c.impl.I2CRegisterSpecificationImpl
	 * @see ucof.communication.i2c.impl.I2cPackageImpl#getI2CRegisterSpecification()
	 * @generated
	 */
	int I2C_REGISTER_SPECIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_REGISTER_SPECIFICATION__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_REGISTER_SPECIFICATION__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_REGISTER_SPECIFICATION__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_REGISTER_SPECIFICATION__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_REGISTER_SPECIFICATION__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_REGISTER_SPECIFICATION__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_REGISTER_SPECIFICATION__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_REGISTER_SPECIFICATION__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_REGISTER_SPECIFICATION__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Register Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_REGISTER_SPECIFICATION__REGISTER_NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Register Pointer Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_REGISTER_SPECIFICATION__REGISTER_POINTER_ADDRESS = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Register Width Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_REGISTER_SPECIFICATION__REGISTER_WIDTH_BITS = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_REGISTER_SPECIFICATION__DEFAULT_VALUE = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_REGISTER_SPECIFICATION__READ_ONLY = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>I2C Register Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_REGISTER_SPECIFICATION_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>I2C Register Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2C_REGISTER_SPECIFICATION_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.communication.i2c.I2CBusMode <em>I2C Bus Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.i2c.I2CBusMode
	 * @see ucof.communication.i2c.impl.I2cPackageImpl#getI2CBusMode()
	 * @generated
	 */
	int I2C_BUS_MODE = 3;

	/**
	 * The meta object id for the '{@link ucof.communication.i2c.I2CAddressMode <em>I2C Address Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.communication.i2c.I2CAddressMode
	 * @see ucof.communication.i2c.impl.I2cPackageImpl#getI2CAddressMode()
	 * @generated
	 */
	int I2C_ADDRESS_MODE = 4;


	/**
	 * Returns the meta object for class '{@link ucof.communication.i2c.I2CBus <em>I2C Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>I2C Bus</em>'.
	 * @see ucof.communication.i2c.I2CBus
	 * @generated
	 */
	EClass getI2CBus();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.i2c.I2CBus#getBusMode <em>Bus Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bus Mode</em>'.
	 * @see ucof.communication.i2c.I2CBus#getBusMode()
	 * @see #getI2CBus()
	 * @generated
	 */
	EAttribute getI2CBus_BusMode();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.i2c.I2CBus#getAddressMode <em>Address Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address Mode</em>'.
	 * @see ucof.communication.i2c.I2CBus#getAddressMode()
	 * @see #getI2CBus()
	 * @generated
	 */
	EAttribute getI2CBus_AddressMode();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.i2c.I2CBus#getPullUpResistanceOhm <em>Pull Up Resistance Ohm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pull Up Resistance Ohm</em>'.
	 * @see ucof.communication.i2c.I2CBus#getPullUpResistanceOhm()
	 * @see #getI2CBus()
	 * @generated
	 */
	EAttribute getI2CBus_PullUpResistanceOhm();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.i2c.I2CBus#getClockStretchingEnabled <em>Clock Stretching Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clock Stretching Enabled</em>'.
	 * @see ucof.communication.i2c.I2CBus#getClockStretchingEnabled()
	 * @see #getI2CBus()
	 * @generated
	 */
	EAttribute getI2CBus_ClockStretchingEnabled();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.i2c.I2CBus#getMultiControllerEnabled <em>Multi Controller Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Controller Enabled</em>'.
	 * @see ucof.communication.i2c.I2CBus#getMultiControllerEnabled()
	 * @see #getI2CBus()
	 * @generated
	 */
	EAttribute getI2CBus_MultiControllerEnabled();

	/**
	 * Returns the meta object for class '{@link ucof.communication.i2c.I2CMessage <em>I2C Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>I2C Message</em>'.
	 * @see ucof.communication.i2c.I2CMessage
	 * @generated
	 */
	EClass getI2CMessage();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.i2c.I2CMessage#getTargetAddress <em>Target Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Address</em>'.
	 * @see ucof.communication.i2c.I2CMessage#getTargetAddress()
	 * @see #getI2CMessage()
	 * @generated
	 */
	EAttribute getI2CMessage_TargetAddress();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.i2c.I2CMessage#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see ucof.communication.i2c.I2CMessage#getDirection()
	 * @see #getI2CMessage()
	 * @generated
	 */
	EAttribute getI2CMessage_Direction();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.i2c.I2CMessage#getDataLengthBytes <em>Data Length Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Length Bytes</em>'.
	 * @see ucof.communication.i2c.I2CMessage#getDataLengthBytes()
	 * @see #getI2CMessage()
	 * @generated
	 */
	EAttribute getI2CMessage_DataLengthBytes();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.i2c.I2CMessage#getRepeatedStart <em>Repeated Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeated Start</em>'.
	 * @see ucof.communication.i2c.I2CMessage#getRepeatedStart()
	 * @see #getI2CMessage()
	 * @generated
	 */
	EAttribute getI2CMessage_RepeatedStart();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.i2c.I2CMessage#getRegisterPointerByte <em>Register Pointer Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Register Pointer Byte</em>'.
	 * @see ucof.communication.i2c.I2CMessage#getRegisterPointerByte()
	 * @see #getI2CMessage()
	 * @generated
	 */
	EAttribute getI2CMessage_RegisterPointerByte();

	/**
	 * Returns the meta object for the containment reference '{@link ucof.communication.i2c.I2CMessage#getRegisterSpecification <em>Register Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Register Specification</em>'.
	 * @see ucof.communication.i2c.I2CMessage#getRegisterSpecification()
	 * @see #getI2CMessage()
	 * @generated
	 */
	EReference getI2CMessage_RegisterSpecification();

	/**
	 * Returns the meta object for class '{@link ucof.communication.i2c.I2CRegisterSpecification <em>I2C Register Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>I2C Register Specification</em>'.
	 * @see ucof.communication.i2c.I2CRegisterSpecification
	 * @generated
	 */
	EClass getI2CRegisterSpecification();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.i2c.I2CRegisterSpecification#getRegisterName <em>Register Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Register Name</em>'.
	 * @see ucof.communication.i2c.I2CRegisterSpecification#getRegisterName()
	 * @see #getI2CRegisterSpecification()
	 * @generated
	 */
	EAttribute getI2CRegisterSpecification_RegisterName();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.i2c.I2CRegisterSpecification#getRegisterPointerAddress <em>Register Pointer Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Register Pointer Address</em>'.
	 * @see ucof.communication.i2c.I2CRegisterSpecification#getRegisterPointerAddress()
	 * @see #getI2CRegisterSpecification()
	 * @generated
	 */
	EAttribute getI2CRegisterSpecification_RegisterPointerAddress();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.i2c.I2CRegisterSpecification#getRegisterWidthBits <em>Register Width Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Register Width Bits</em>'.
	 * @see ucof.communication.i2c.I2CRegisterSpecification#getRegisterWidthBits()
	 * @see #getI2CRegisterSpecification()
	 * @generated
	 */
	EAttribute getI2CRegisterSpecification_RegisterWidthBits();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.i2c.I2CRegisterSpecification#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see ucof.communication.i2c.I2CRegisterSpecification#getDefaultValue()
	 * @see #getI2CRegisterSpecification()
	 * @generated
	 */
	EAttribute getI2CRegisterSpecification_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link ucof.communication.i2c.I2CRegisterSpecification#getReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see ucof.communication.i2c.I2CRegisterSpecification#getReadOnly()
	 * @see #getI2CRegisterSpecification()
	 * @generated
	 */
	EAttribute getI2CRegisterSpecification_ReadOnly();

	/**
	 * Returns the meta object for enum '{@link ucof.communication.i2c.I2CBusMode <em>I2C Bus Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>I2C Bus Mode</em>'.
	 * @see ucof.communication.i2c.I2CBusMode
	 * @generated
	 */
	EEnum getI2CBusMode();

	/**
	 * Returns the meta object for enum '{@link ucof.communication.i2c.I2CAddressMode <em>I2C Address Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>I2C Address Mode</em>'.
	 * @see ucof.communication.i2c.I2CAddressMode
	 * @generated
	 */
	EEnum getI2CAddressMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	I2cFactory getI2cFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ucof.communication.i2c.impl.I2CBusImpl <em>I2C Bus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.i2c.impl.I2CBusImpl
		 * @see ucof.communication.i2c.impl.I2cPackageImpl#getI2CBus()
		 * @generated
		 */
		EClass I2C_BUS = eINSTANCE.getI2CBus();

		/**
		 * The meta object literal for the '<em><b>Bus Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute I2C_BUS__BUS_MODE = eINSTANCE.getI2CBus_BusMode();

		/**
		 * The meta object literal for the '<em><b>Address Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute I2C_BUS__ADDRESS_MODE = eINSTANCE.getI2CBus_AddressMode();

		/**
		 * The meta object literal for the '<em><b>Pull Up Resistance Ohm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute I2C_BUS__PULL_UP_RESISTANCE_OHM = eINSTANCE.getI2CBus_PullUpResistanceOhm();

		/**
		 * The meta object literal for the '<em><b>Clock Stretching Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute I2C_BUS__CLOCK_STRETCHING_ENABLED = eINSTANCE.getI2CBus_ClockStretchingEnabled();

		/**
		 * The meta object literal for the '<em><b>Multi Controller Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute I2C_BUS__MULTI_CONTROLLER_ENABLED = eINSTANCE.getI2CBus_MultiControllerEnabled();

		/**
		 * The meta object literal for the '{@link ucof.communication.i2c.impl.I2CMessageImpl <em>I2C Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.i2c.impl.I2CMessageImpl
		 * @see ucof.communication.i2c.impl.I2cPackageImpl#getI2CMessage()
		 * @generated
		 */
		EClass I2C_MESSAGE = eINSTANCE.getI2CMessage();

		/**
		 * The meta object literal for the '<em><b>Target Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute I2C_MESSAGE__TARGET_ADDRESS = eINSTANCE.getI2CMessage_TargetAddress();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute I2C_MESSAGE__DIRECTION = eINSTANCE.getI2CMessage_Direction();

		/**
		 * The meta object literal for the '<em><b>Data Length Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute I2C_MESSAGE__DATA_LENGTH_BYTES = eINSTANCE.getI2CMessage_DataLengthBytes();

		/**
		 * The meta object literal for the '<em><b>Repeated Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute I2C_MESSAGE__REPEATED_START = eINSTANCE.getI2CMessage_RepeatedStart();

		/**
		 * The meta object literal for the '<em><b>Register Pointer Byte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute I2C_MESSAGE__REGISTER_POINTER_BYTE = eINSTANCE.getI2CMessage_RegisterPointerByte();

		/**
		 * The meta object literal for the '<em><b>Register Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference I2C_MESSAGE__REGISTER_SPECIFICATION = eINSTANCE.getI2CMessage_RegisterSpecification();

		/**
		 * The meta object literal for the '{@link ucof.communication.i2c.impl.I2CRegisterSpecificationImpl <em>I2C Register Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.i2c.impl.I2CRegisterSpecificationImpl
		 * @see ucof.communication.i2c.impl.I2cPackageImpl#getI2CRegisterSpecification()
		 * @generated
		 */
		EClass I2C_REGISTER_SPECIFICATION = eINSTANCE.getI2CRegisterSpecification();

		/**
		 * The meta object literal for the '<em><b>Register Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute I2C_REGISTER_SPECIFICATION__REGISTER_NAME = eINSTANCE.getI2CRegisterSpecification_RegisterName();

		/**
		 * The meta object literal for the '<em><b>Register Pointer Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute I2C_REGISTER_SPECIFICATION__REGISTER_POINTER_ADDRESS = eINSTANCE.getI2CRegisterSpecification_RegisterPointerAddress();

		/**
		 * The meta object literal for the '<em><b>Register Width Bits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute I2C_REGISTER_SPECIFICATION__REGISTER_WIDTH_BITS = eINSTANCE.getI2CRegisterSpecification_RegisterWidthBits();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute I2C_REGISTER_SPECIFICATION__DEFAULT_VALUE = eINSTANCE.getI2CRegisterSpecification_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute I2C_REGISTER_SPECIFICATION__READ_ONLY = eINSTANCE.getI2CRegisterSpecification_ReadOnly();

		/**
		 * The meta object literal for the '{@link ucof.communication.i2c.I2CBusMode <em>I2C Bus Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.i2c.I2CBusMode
		 * @see ucof.communication.i2c.impl.I2cPackageImpl#getI2CBusMode()
		 * @generated
		 */
		EEnum I2C_BUS_MODE = eINSTANCE.getI2CBusMode();

		/**
		 * The meta object literal for the '{@link ucof.communication.i2c.I2CAddressMode <em>I2C Address Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.communication.i2c.I2CAddressMode
		 * @see ucof.communication.i2c.impl.I2cPackageImpl#getI2CAddressMode()
		 * @generated
		 */
		EEnum I2C_ADDRESS_MODE = eINSTANCE.getI2CAddressMode();

	}

} //I2cPackage
