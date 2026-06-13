/**
 */
package ucof.common.enums;

import org.eclipse.emf.ecore.EEnum;
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
 * Container, including commonly used Enums
 * <!-- end-model-doc -->
 * @see ucof.common.enums.EnumsFactory
 * @model kind="package"
 * @generated
 */
public interface EnumsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "enums";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://gitlab.com/ucof/ucof.de/model/v001/ucof/common/enums";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ucof.model.common.enums";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnumsPackage eINSTANCE = ucof.common.enums.impl.EnumsPackageImpl.init();

	/**
	 * The meta object id for the '{@link ucof.common.enums.booleanType <em>boolean Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.common.enums.booleanType
	 * @see ucof.common.enums.impl.EnumsPackageImpl#getbooleanType()
	 * @generated
	 */
	int BOOLEAN_TYPE = 0;

	/**
	 * The meta object id for the '{@link ucof.common.enums.TargetDataType <em>Target Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.common.enums.TargetDataType
	 * @see ucof.common.enums.impl.EnumsPackageImpl#getTargetDataType()
	 * @generated
	 */
	int TARGET_DATA_TYPE = 1;

	/**
	 * The meta object id for the '{@link ucof.common.enums.MemoryAccessType <em>Memory Access Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.common.enums.MemoryAccessType
	 * @see ucof.common.enums.impl.EnumsPackageImpl#getMemoryAccessType()
	 * @generated
	 */
	int MEMORY_ACCESS_TYPE = 2;

	/**
	 * The meta object id for the '{@link ucof.common.enums.MemoryType <em>Memory Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.common.enums.MemoryType
	 * @see ucof.common.enums.impl.EnumsPackageImpl#getMemoryType()
	 * @generated
	 */
	int MEMORY_TYPE = 3;

	/**
	 * The meta object id for the '{@link ucof.common.enums.PortDirectionType <em>Port Direction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.common.enums.PortDirectionType
	 * @see ucof.common.enums.impl.EnumsPackageImpl#getPortDirectionType()
	 * @generated
	 */
	int PORT_DIRECTION_TYPE = 4;

	/**
	 * The meta object id for the '{@link ucof.common.enums.SingleDirectionType <em>Single Direction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.common.enums.SingleDirectionType
	 * @see ucof.common.enums.impl.EnumsPackageImpl#getSingleDirectionType()
	 * @generated
	 */
	int SINGLE_DIRECTION_TYPE = 5;

	/**
	 * The meta object id for the '{@link ucof.common.enums.YesNoType <em>Yes No Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.common.enums.YesNoType
	 * @see ucof.common.enums.impl.EnumsPackageImpl#getYesNoType()
	 * @generated
	 */
	int YES_NO_TYPE = 6;

	/**
	 * The meta object id for the '{@link ucof.common.enums.SDITypes <em>SDI Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.common.enums.SDITypes
	 * @see ucof.common.enums.impl.EnumsPackageImpl#getSDITypes()
	 * @generated
	 */
	int SDI_TYPES = 7;


	/**
	 * The meta object id for the '{@link ucof.common.enums.ImplementationType <em>Implementation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.common.enums.ImplementationType
	 * @see ucof.common.enums.impl.EnumsPackageImpl#getImplementationType()
	 * @generated
	 */
	int IMPLEMENTATION_TYPE = 8;


	/**
	 * Returns the meta object for enum '{@link ucof.common.enums.booleanType <em>boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>boolean Type</em>'.
	 * @see ucof.common.enums.booleanType
	 * @generated
	 */
	EEnum getbooleanType();

	/**
	 * Returns the meta object for enum '{@link ucof.common.enums.TargetDataType <em>Target Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Target Data Type</em>'.
	 * @see ucof.common.enums.TargetDataType
	 * @generated
	 */
	EEnum getTargetDataType();

	/**
	 * Returns the meta object for enum '{@link ucof.common.enums.MemoryAccessType <em>Memory Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Memory Access Type</em>'.
	 * @see ucof.common.enums.MemoryAccessType
	 * @generated
	 */
	EEnum getMemoryAccessType();

	/**
	 * Returns the meta object for enum '{@link ucof.common.enums.MemoryType <em>Memory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Memory Type</em>'.
	 * @see ucof.common.enums.MemoryType
	 * @generated
	 */
	EEnum getMemoryType();

	/**
	 * Returns the meta object for enum '{@link ucof.common.enums.PortDirectionType <em>Port Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Port Direction Type</em>'.
	 * @see ucof.common.enums.PortDirectionType
	 * @generated
	 */
	EEnum getPortDirectionType();

	/**
	 * Returns the meta object for enum '{@link ucof.common.enums.SingleDirectionType <em>Single Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Single Direction Type</em>'.
	 * @see ucof.common.enums.SingleDirectionType
	 * @generated
	 */
	EEnum getSingleDirectionType();

	/**
	 * Returns the meta object for enum '{@link ucof.common.enums.YesNoType <em>Yes No Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Yes No Type</em>'.
	 * @see ucof.common.enums.YesNoType
	 * @generated
	 */
	EEnum getYesNoType();

	/**
	 * Returns the meta object for enum '{@link ucof.common.enums.SDITypes <em>SDI Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SDI Types</em>'.
	 * @see ucof.common.enums.SDITypes
	 * @generated
	 */
	EEnum getSDITypes();

	/**
	 * Returns the meta object for enum '{@link ucof.common.enums.ImplementationType <em>Implementation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Implementation Type</em>'.
	 * @see ucof.common.enums.ImplementationType
	 * @generated
	 */
	EEnum getImplementationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EnumsFactory getEnumsFactory();

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
		 * The meta object literal for the '{@link ucof.common.enums.booleanType <em>boolean Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.common.enums.booleanType
		 * @see ucof.common.enums.impl.EnumsPackageImpl#getbooleanType()
		 * @generated
		 */
		EEnum BOOLEAN_TYPE = eINSTANCE.getbooleanType();

		/**
		 * The meta object literal for the '{@link ucof.common.enums.TargetDataType <em>Target Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.common.enums.TargetDataType
		 * @see ucof.common.enums.impl.EnumsPackageImpl#getTargetDataType()
		 * @generated
		 */
		EEnum TARGET_DATA_TYPE = eINSTANCE.getTargetDataType();

		/**
		 * The meta object literal for the '{@link ucof.common.enums.MemoryAccessType <em>Memory Access Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.common.enums.MemoryAccessType
		 * @see ucof.common.enums.impl.EnumsPackageImpl#getMemoryAccessType()
		 * @generated
		 */
		EEnum MEMORY_ACCESS_TYPE = eINSTANCE.getMemoryAccessType();

		/**
		 * The meta object literal for the '{@link ucof.common.enums.MemoryType <em>Memory Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.common.enums.MemoryType
		 * @see ucof.common.enums.impl.EnumsPackageImpl#getMemoryType()
		 * @generated
		 */
		EEnum MEMORY_TYPE = eINSTANCE.getMemoryType();

		/**
		 * The meta object literal for the '{@link ucof.common.enums.PortDirectionType <em>Port Direction Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.common.enums.PortDirectionType
		 * @see ucof.common.enums.impl.EnumsPackageImpl#getPortDirectionType()
		 * @generated
		 */
		EEnum PORT_DIRECTION_TYPE = eINSTANCE.getPortDirectionType();

		/**
		 * The meta object literal for the '{@link ucof.common.enums.SingleDirectionType <em>Single Direction Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.common.enums.SingleDirectionType
		 * @see ucof.common.enums.impl.EnumsPackageImpl#getSingleDirectionType()
		 * @generated
		 */
		EEnum SINGLE_DIRECTION_TYPE = eINSTANCE.getSingleDirectionType();

		/**
		 * The meta object literal for the '{@link ucof.common.enums.YesNoType <em>Yes No Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.common.enums.YesNoType
		 * @see ucof.common.enums.impl.EnumsPackageImpl#getYesNoType()
		 * @generated
		 */
		EEnum YES_NO_TYPE = eINSTANCE.getYesNoType();

		/**
		 * The meta object literal for the '{@link ucof.common.enums.SDITypes <em>SDI Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.common.enums.SDITypes
		 * @see ucof.common.enums.impl.EnumsPackageImpl#getSDITypes()
		 * @generated
		 */
		EEnum SDI_TYPES = eINSTANCE.getSDITypes();

		/**
		 * The meta object literal for the '{@link ucof.common.enums.ImplementationType <em>Implementation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.common.enums.ImplementationType
		 * @see ucof.common.enums.impl.EnumsPackageImpl#getImplementationType()
		 * @generated
		 */
		EEnum IMPLEMENTATION_TYPE = eINSTANCE.getImplementationType();

	}

} //EnumsPackage
