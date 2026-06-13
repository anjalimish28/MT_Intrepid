/**
 */
package targets.adc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import targets.TargetsPackage;

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
 * @see targets.adc.AdcFactory
 * @model kind="package"
 * @generated
 */
public interface AdcPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "adc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://gitlab.com/ucof/ucof.de/model/v001/ucof/targets/adc";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ucof.model.targets.adc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdcPackage eINSTANCE = targets.adc.impl.AdcPackageImpl.init();

	/**
	 * The meta object id for the '{@link targets.adc.impl.ads1115Impl <em>ads1115</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.adc.impl.ads1115Impl
	 * @see targets.adc.impl.AdcPackageImpl#getads1115()
	 * @generated
	 */
	int ADS1115 = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADS1115__ID = TargetsPackage.SUPER_TARGET_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADS1115__NAME = TargetsPackage.SUPER_TARGET_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADS1115__DOCUMENTATION = TargetsPackage.SUPER_TARGET_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADS1115__MODIFIED = TargetsPackage.SUPER_TARGET_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADS1115__MODIFIER = TargetsPackage.SUPER_TARGET_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADS1115__TRACE_LINK = TargetsPackage.SUPER_TARGET_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADS1115__CREATED = TargetsPackage.SUPER_TARGET_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADS1115__CREATOR = TargetsPackage.SUPER_TARGET_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADS1115__VERSION = TargetsPackage.SUPER_TARGET_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADS1115__PROJECT_NAME = TargetsPackage.SUPER_TARGET_TYPE__PROJECT_NAME;

	/**
	 * The feature id for the '<em><b>Electrical Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADS1115__ELECTRICAL_INTERFACES = TargetsPackage.SUPER_TARGET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADS1115__PORTS = TargetsPackage.SUPER_TARGET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ads1115</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADS1115_FEATURE_COUNT = TargetsPackage.SUPER_TARGET_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>ads1115</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADS1115_OPERATION_COUNT = TargetsPackage.SUPER_TARGET_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.adc.impl.adcPortsImpl <em>adc Ports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.adc.impl.adcPortsImpl
	 * @see targets.adc.impl.AdcPackageImpl#getadcPorts()
	 * @generated
	 */
	int ADC_PORTS = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADC_PORTS__DOCUMENTATION = EtypesPackage.SUPER_TRACKING_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADC_PORTS__MODIFIED = EtypesPackage.SUPER_TRACKING_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADC_PORTS__MODIFIER = EtypesPackage.SUPER_TRACKING_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADC_PORTS__TRACE_LINK = EtypesPackage.SUPER_TRACKING_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADC_PORTS__CREATED = EtypesPackage.SUPER_TRACKING_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADC_PORTS__CREATOR = EtypesPackage.SUPER_TRACKING_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADC_PORTS__VERSION = EtypesPackage.SUPER_TRACKING_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADC_PORTS__ID = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADC_PORTS__NAME = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADC_PORTS__PORT = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>adc Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADC_PORTS_FEATURE_COUNT = EtypesPackage.SUPER_TRACKING_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>adc Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADC_PORTS_OPERATION_COUNT = EtypesPackage.SUPER_TRACKING_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link targets.adc.impl.adcPortImpl <em>adc Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.adc.impl.adcPortImpl
	 * @see targets.adc.impl.AdcPackageImpl#getadcPort()
	 * @generated
	 */
	int ADC_PORT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADC_PORT__ID = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADC_PORT__NAME = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADC_PORT__DOCUMENTATION = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADC_PORT__MODIFIED = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADC_PORT__MODIFIER = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__MODIFIER;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADC_PORT__TRACE_LINK = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__TRACE_LINK;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADC_PORT__CREATED = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADC_PORT__CREATOR = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__CREATOR;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADC_PORT__VERSION = TargetsPackage.SUPER_HARDWARE_PORT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Min Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADC_PORT__MIN_VOLTAGE = TargetsPackage.SUPER_HARDWARE_PORT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADC_PORT__MAX_VOLTAGE = TargetsPackage.SUPER_HARDWARE_PORT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADC_PORT__TYPE = TargetsPackage.SUPER_HARDWARE_PORT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADC_PORT__PIN_NAME = TargetsPackage.SUPER_HARDWARE_PORT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>adc Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADC_PORT_FEATURE_COUNT = TargetsPackage.SUPER_HARDWARE_PORT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>adc Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADC_PORT_OPERATION_COUNT = TargetsPackage.SUPER_HARDWARE_PORT_TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link targets.adc.ads1115 <em>ads1115</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ads1115</em>'.
	 * @see targets.adc.ads1115
	 * @generated
	 */
	EClass getads1115();

	/**
	 * Returns the meta object for the containment reference '{@link targets.adc.ads1115#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ports</em>'.
	 * @see targets.adc.ads1115#getPorts()
	 * @see #getads1115()
	 * @generated
	 */
	EReference getads1115_Ports();

	/**
	 * Returns the meta object for class '{@link targets.adc.adcPorts <em>adc Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>adc Ports</em>'.
	 * @see targets.adc.adcPorts
	 * @generated
	 */
	EClass getadcPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link targets.adc.adcPorts#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see targets.adc.adcPorts#getPort()
	 * @see #getadcPorts()
	 * @generated
	 */
	EReference getadcPorts_Port();

	/**
	 * Returns the meta object for class '{@link targets.adc.adcPort <em>adc Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>adc Port</em>'.
	 * @see targets.adc.adcPort
	 * @generated
	 */
	EClass getadcPort();

	/**
	 * Returns the meta object for the attribute '{@link targets.adc.adcPort#getPinName <em>Pin Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin Name</em>'.
	 * @see targets.adc.adcPort#getPinName()
	 * @see #getadcPort()
	 * @generated
	 */
	EAttribute getadcPort_PinName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AdcFactory getAdcFactory();

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
		 * The meta object literal for the '{@link targets.adc.impl.ads1115Impl <em>ads1115</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.adc.impl.ads1115Impl
		 * @see targets.adc.impl.AdcPackageImpl#getads1115()
		 * @generated
		 */
		EClass ADS1115 = eINSTANCE.getads1115();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADS1115__PORTS = eINSTANCE.getads1115_Ports();

		/**
		 * The meta object literal for the '{@link targets.adc.impl.adcPortsImpl <em>adc Ports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.adc.impl.adcPortsImpl
		 * @see targets.adc.impl.AdcPackageImpl#getadcPorts()
		 * @generated
		 */
		EClass ADC_PORTS = eINSTANCE.getadcPorts();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADC_PORTS__PORT = eINSTANCE.getadcPorts_Port();

		/**
		 * The meta object literal for the '{@link targets.adc.impl.adcPortImpl <em>adc Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.adc.impl.adcPortImpl
		 * @see targets.adc.impl.AdcPackageImpl#getadcPort()
		 * @generated
		 */
		EClass ADC_PORT = eINSTANCE.getadcPort();

		/**
		 * The meta object literal for the '<em><b>Pin Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADC_PORT__PIN_NAME = eINSTANCE.getadcPort_PinName();

	}

} //AdcPackage
