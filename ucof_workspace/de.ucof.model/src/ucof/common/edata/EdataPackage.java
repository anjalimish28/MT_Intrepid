/**
 */
package ucof.common.edata;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

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
 * Container, includes commonly used data definitions
 * <!-- end-model-doc -->
 * @see ucof.common.edata.EdataFactory
 * @model kind="package"
 * @generated
 */
public interface EdataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "edata";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://gitlab.com/ucof/ucof.de/model/v001/ucof/common/edata";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ucof.model.common.edata";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EdataPackage eINSTANCE = ucof.common.edata.impl.EdataPackageImpl.init();

	/**
	 * The meta object id for the '<em>Dec Or Hex Value Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see ucof.common.edata.impl.EdataPackageImpl#getDecOrHexValueType()
	 * @generated
	 */
	int DEC_OR_HEX_VALUE_TYPE = 0;

	/**
	 * The meta object id for the '<em>Hex Address Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see ucof.common.edata.impl.EdataPackageImpl#getHexAddressType()
	 * @generated
	 */
	int HEX_ADDRESS_TYPE = 1;

	/**
	 * The meta object id for the '<em>Identifier Value Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see ucof.common.edata.impl.EdataPackageImpl#getIdentifierValueType()
	 * @generated
	 */
	int IDENTIFIER_VALUE_TYPE = 2;

	/**
	 * The meta object id for the '<em>UUID Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see ucof.common.edata.impl.EdataPackageImpl#getUUIDType()
	 * @generated
	 */
	int UUID_TYPE = 3;

	/**
	 * The meta object id for the '<em>IP Address Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see ucof.common.edata.impl.EdataPackageImpl#getIPAddressType()
	 * @generated
	 */
	int IP_ADDRESS_TYPE = 4;

	/**
	 * The meta object id for the '<em>Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see ucof.common.edata.impl.EdataPackageImpl#getNameType()
	 * @generated
	 */
	int NAME_TYPE = 5;

	/**
	 * The meta object id for the '<em>Port Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see ucof.common.edata.impl.EdataPackageImpl#getPortType()
	 * @generated
	 */
	int PORT_TYPE = 6;

	/**
	 * The meta object id for the '<em>Positive Int Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see ucof.common.edata.impl.EdataPackageImpl#getPositiveIntType()
	 * @generated
	 */
	int POSITIVE_INT_TYPE = 7;

	/**
	 * The meta object id for the '<em>MAC Address Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see ucof.common.edata.impl.EdataPackageImpl#getMACAddressType()
	 * @generated
	 */
	int MAC_ADDRESS_TYPE = 8;

	/**
	 * The meta object id for the '<em>Ether Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see ucof.common.edata.impl.EdataPackageImpl#getEtherType()
	 * @generated
	 */
	int ETHER_TYPE = 9;


	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Dec Or Hex Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A653: Allows hex and decimal numbers. Hex start 0x
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Dec Or Hex Value Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='DEC_OR_HEX_VALUE_TYPE' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='([+-]{0,1}[0-9]+|[+-]{0,1}0x[0-9a-fA-F]+)?'"
	 * @generated
	 */
	EDataType getDecOrHexValueType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Hex Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hex Address Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='HexAddressType' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='0x[0-9A-Fa-f]+|[0-9]+'"
	 * @generated
	 */
	EDataType getHexAddressType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Identifier Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A653/RCE/RPC: Restricts identifiers to hex or decimal numbers.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Identifier Value Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='IDENTIFIER_VALUE_TYPE' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[+-]{0,1}[0-9]+|[+-]{0,1}0x[0-9a-fA-F]+'"
	 * @generated
	 */
	EDataType getIdentifierValueType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>UUID Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * for UUIDs
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>UUID Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='UUID_TYPE' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}'"
	 * @generated
	 */
	EDataType getUUIDType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>IP Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IP Address Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='IP_ADDRESS_TYPE' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='(([^.])|([0-9]{1,3}\\.){3}[0-9]{1,3})?'"
	 * @generated
	 */
	EDataType getIPAddressType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A653: A 1..30 character string.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='NAME_TYPE' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' maxLength='30'"
	 * @generated
	 */
	EDataType getNameType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Port Type</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="name='PORT_TYPE' baseType='http://www.eclipse.org/emf/2003/XMLType#int:Object' minInclusive='0' maxInclusive='65535'"
	 * @generated
	 */
	EDataType getPortType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Positive Int Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Positive Int Type</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="name='POSITIVE_INTEGER_TYPE' baseType='http://www.eclipse.org/emf/2003/XMLType#int:Object' minInclusive='0'"
	 * @generated
	 */
	EDataType getPositiveIntType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>MAC Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>MAC Address Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='MAC_ADDRESS_TYPE' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[0-9A-Fa-f]{2}:[0-9A-Fa-f]{2}:[0-9A-Fa-f]{2}:[0-9A-Fa-f]{2}:[0-9A-Fa-f]{2}:[0-9A-Fa-f]{2}'"
	 * @generated
	 */
	EDataType getMACAddressType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Ether Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ether Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ETHER_TYPE' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='0x[0-9A-Fa-f]{4}'"
	 * @generated
	 */
	EDataType getEtherType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EdataFactory getEdataFactory();

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
		 * The meta object literal for the '<em>Dec Or Hex Value Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see ucof.common.edata.impl.EdataPackageImpl#getDecOrHexValueType()
		 * @generated
		 */
		EDataType DEC_OR_HEX_VALUE_TYPE = eINSTANCE.getDecOrHexValueType();

		/**
		 * The meta object literal for the '<em>Hex Address Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see ucof.common.edata.impl.EdataPackageImpl#getHexAddressType()
		 * @generated
		 */
		EDataType HEX_ADDRESS_TYPE = eINSTANCE.getHexAddressType();

		/**
		 * The meta object literal for the '<em>Identifier Value Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see ucof.common.edata.impl.EdataPackageImpl#getIdentifierValueType()
		 * @generated
		 */
		EDataType IDENTIFIER_VALUE_TYPE = eINSTANCE.getIdentifierValueType();

		/**
		 * The meta object literal for the '<em>UUID Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see ucof.common.edata.impl.EdataPackageImpl#getUUIDType()
		 * @generated
		 */
		EDataType UUID_TYPE = eINSTANCE.getUUIDType();

		/**
		 * The meta object literal for the '<em>IP Address Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see ucof.common.edata.impl.EdataPackageImpl#getIPAddressType()
		 * @generated
		 */
		EDataType IP_ADDRESS_TYPE = eINSTANCE.getIPAddressType();

		/**
		 * The meta object literal for the '<em>Name Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see ucof.common.edata.impl.EdataPackageImpl#getNameType()
		 * @generated
		 */
		EDataType NAME_TYPE = eINSTANCE.getNameType();

		/**
		 * The meta object literal for the '<em>Port Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see ucof.common.edata.impl.EdataPackageImpl#getPortType()
		 * @generated
		 */
		EDataType PORT_TYPE = eINSTANCE.getPortType();

		/**
		 * The meta object literal for the '<em>Positive Int Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see ucof.common.edata.impl.EdataPackageImpl#getPositiveIntType()
		 * @generated
		 */
		EDataType POSITIVE_INT_TYPE = eINSTANCE.getPositiveIntType();

		/**
		 * The meta object literal for the '<em>MAC Address Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see ucof.common.edata.impl.EdataPackageImpl#getMACAddressType()
		 * @generated
		 */
		EDataType MAC_ADDRESS_TYPE = eINSTANCE.getMACAddressType();

		/**
		 * The meta object literal for the '<em>Ether Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see ucof.common.edata.impl.EdataPackageImpl#getEtherType()
		 * @generated
		 */
		EDataType ETHER_TYPE = eINSTANCE.getEtherType();

	}

} //EdataPackage
