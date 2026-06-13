/**
 */
package ucof.devices.functions;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import ucof.common.etypes.EtypesPackage;

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
 * Container for functions that run on devices (on A653 modules these would be processes)
 * <!-- end-model-doc -->
 * @see ucof.devices.functions.FunctionsFactory
 * @model kind="package"
 * @generated
 */
public interface FunctionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "functions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://gitlab.com/ucof/ucof.de/model/v001/ucof/devices/functions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ucof.model.devices.functions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FunctionsPackage eINSTANCE = ucof.devices.functions.impl.FunctionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link ucof.devices.functions.impl.DeviceFunctionsImpl <em>Device Functions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.functions.impl.DeviceFunctionsImpl
	 * @see ucof.devices.functions.impl.FunctionsPackageImpl#getDeviceFunctions()
	 * @generated
	 */
	int DEVICE_FUNCTIONS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FUNCTIONS__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FUNCTIONS__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FUNCTIONS__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FUNCTIONS__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FUNCTIONS__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FUNCTIONS__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FUNCTIONS__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FUNCTIONS__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FUNCTIONS__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FUNCTIONS__FUNCTION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Device Functions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FUNCTIONS_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Device Functions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FUNCTIONS_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.devices.functions.impl.FunctionLinkImpl <em>Function Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.functions.impl.FunctionLinkImpl
	 * @see ucof.devices.functions.impl.FunctionsPackageImpl#getFunctionLink()
	 * @generated
	 */
	int FUNCTION_LINK = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_LINK__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_LINK__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_LINK__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_LINK__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_LINK__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_LINK__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_LINK__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_LINK__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_LINK__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Function File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_LINK__FUNCTION_FILE = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Function Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_LINK_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Function Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_LINK_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucof.devices.functions.impl.SuperFunctionTypeImpl <em>Super Function Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucof.devices.functions.impl.SuperFunctionTypeImpl
	 * @see ucof.devices.functions.impl.FunctionsPackageImpl#getSuperFunctionType()
	 * @generated
	 */
	int SUPER_FUNCTION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_FUNCTION_TYPE__ID = EtypesPackage.SUPER_IDENTIFIER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_FUNCTION_TYPE__NAME = EtypesPackage.SUPER_IDENTIFIER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_FUNCTION_TYPE__DOCUMENTATION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_FUNCTION_TYPE__MODIFIED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_FUNCTION_TYPE__MODIFIER = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_FUNCTION_TYPE__TRACE_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_FUNCTION_TYPE__CREATED = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_FUNCTION_TYPE__CREATOR = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_FUNCTION_TYPE__VERSION = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Function Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_FUNCTION_TYPE__FUNCTION_LINK = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Super Function Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_FUNCTION_TYPE_FEATURE_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Super Function Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_FUNCTION_TYPE_OPERATION_COUNT = EtypesPackage.SUPER_IDENTIFIER_TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ucof.devices.functions.DeviceFunctions <em>Device Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Functions</em>'.
	 * @see ucof.devices.functions.DeviceFunctions
	 * @generated
	 */
	EClass getDeviceFunctions();

	/**
	 * Returns the meta object for the containment reference list '{@link ucof.devices.functions.DeviceFunctions#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function</em>'.
	 * @see ucof.devices.functions.DeviceFunctions#getFunction()
	 * @see #getDeviceFunctions()
	 * @generated
	 */
	EReference getDeviceFunctions_Function();

	/**
	 * Returns the meta object for class '{@link ucof.devices.functions.FunctionLink <em>Function Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Link</em>'.
	 * @see ucof.devices.functions.FunctionLink
	 * @generated
	 */
	EClass getFunctionLink();

	/**
	 * Returns the meta object for the attribute '{@link ucof.devices.functions.FunctionLink#getFunctionFile <em>Function File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function File</em>'.
	 * @see ucof.devices.functions.FunctionLink#getFunctionFile()
	 * @see #getFunctionLink()
	 * @generated
	 */
	EAttribute getFunctionLink_FunctionFile();

	/**
	 * Returns the meta object for class '{@link ucof.devices.functions.SuperFunctionType <em>Super Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Function Type</em>'.
	 * @see ucof.devices.functions.SuperFunctionType
	 * @generated
	 */
	EClass getSuperFunctionType();

	/**
	 * Returns the meta object for the containment reference '{@link ucof.devices.functions.SuperFunctionType#getFunctionLink <em>Function Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function Link</em>'.
	 * @see ucof.devices.functions.SuperFunctionType#getFunctionLink()
	 * @see #getSuperFunctionType()
	 * @generated
	 */
	EReference getSuperFunctionType_FunctionLink();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FunctionsFactory getFunctionsFactory();

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
		 * The meta object literal for the '{@link ucof.devices.functions.impl.DeviceFunctionsImpl <em>Device Functions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.functions.impl.DeviceFunctionsImpl
		 * @see ucof.devices.functions.impl.FunctionsPackageImpl#getDeviceFunctions()
		 * @generated
		 */
		EClass DEVICE_FUNCTIONS = eINSTANCE.getDeviceFunctions();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_FUNCTIONS__FUNCTION = eINSTANCE.getDeviceFunctions_Function();

		/**
		 * The meta object literal for the '{@link ucof.devices.functions.impl.FunctionLinkImpl <em>Function Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.functions.impl.FunctionLinkImpl
		 * @see ucof.devices.functions.impl.FunctionsPackageImpl#getFunctionLink()
		 * @generated
		 */
		EClass FUNCTION_LINK = eINSTANCE.getFunctionLink();

		/**
		 * The meta object literal for the '<em><b>Function File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_LINK__FUNCTION_FILE = eINSTANCE.getFunctionLink_FunctionFile();

		/**
		 * The meta object literal for the '{@link ucof.devices.functions.impl.SuperFunctionTypeImpl <em>Super Function Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucof.devices.functions.impl.SuperFunctionTypeImpl
		 * @see ucof.devices.functions.impl.FunctionsPackageImpl#getSuperFunctionType()
		 * @generated
		 */
		EClass SUPER_FUNCTION_TYPE = eINSTANCE.getSuperFunctionType();

		/**
		 * The meta object literal for the '<em><b>Function Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_FUNCTION_TYPE__FUNCTION_LINK = eINSTANCE.getSuperFunctionType_FunctionLink();

	}

} //FunctionsPackage
