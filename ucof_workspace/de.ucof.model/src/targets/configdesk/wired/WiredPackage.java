/**
 */
package targets.configdesk.wired;

import org.eclipse.emf.ecore.EClass;
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
 * @see targets.configdesk.wired.WiredFactory
 * @model kind="package"
 * @generated
 */
public interface WiredPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wired";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://gitlab.com/ucof/ucof.de/model/v001/ucof/targets/wired";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.ucof.model.targets.configdesk.wired";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WiredPackage eINSTANCE = targets.configdesk.wired.impl.WiredPackageImpl.init();

	/**
	 * The meta object id for the '{@link targets.configdesk.wired.impl.AnaloguesImpl <em>Analogues</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.configdesk.wired.impl.AnaloguesImpl
	 * @see targets.configdesk.wired.impl.WiredPackageImpl#getAnalogues()
	 * @generated
	 */
	int ANALOGUES = 0;

	/**
	 * The number of structural features of the '<em>Analogues</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Analogues</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link targets.configdesk.wired.impl.AnalogueImpl <em>Analogue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.configdesk.wired.impl.AnalogueImpl
	 * @see targets.configdesk.wired.impl.WiredPackageImpl#getAnalogue()
	 * @generated
	 */
	int ANALOGUE = 1;

	/**
	 * The number of structural features of the '<em>Analogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Analogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALOGUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link targets.configdesk.wired.impl.DigitalsImpl <em>Digitals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.configdesk.wired.impl.DigitalsImpl
	 * @see targets.configdesk.wired.impl.WiredPackageImpl#getDigitals()
	 * @generated
	 */
	int DIGITALS = 2;

	/**
	 * The number of structural features of the '<em>Digitals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITALS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Digitals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITALS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link targets.configdesk.wired.impl.DigitalImpl <em>Digital</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see targets.configdesk.wired.impl.DigitalImpl
	 * @see targets.configdesk.wired.impl.WiredPackageImpl#getDigital()
	 * @generated
	 */
	int DIGITAL = 3;

	/**
	 * The number of structural features of the '<em>Digital</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Digital</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link targets.configdesk.wired.Analogues <em>Analogues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analogues</em>'.
	 * @see targets.configdesk.wired.Analogues
	 * @generated
	 */
	EClass getAnalogues();

	/**
	 * Returns the meta object for class '{@link targets.configdesk.wired.Analogue <em>Analogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analogue</em>'.
	 * @see targets.configdesk.wired.Analogue
	 * @generated
	 */
	EClass getAnalogue();

	/**
	 * Returns the meta object for class '{@link targets.configdesk.wired.Digitals <em>Digitals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digitals</em>'.
	 * @see targets.configdesk.wired.Digitals
	 * @generated
	 */
	EClass getDigitals();

	/**
	 * Returns the meta object for class '{@link targets.configdesk.wired.Digital <em>Digital</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital</em>'.
	 * @see targets.configdesk.wired.Digital
	 * @generated
	 */
	EClass getDigital();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WiredFactory getWiredFactory();

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
		 * The meta object literal for the '{@link targets.configdesk.wired.impl.AnaloguesImpl <em>Analogues</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.configdesk.wired.impl.AnaloguesImpl
		 * @see targets.configdesk.wired.impl.WiredPackageImpl#getAnalogues()
		 * @generated
		 */
		EClass ANALOGUES = eINSTANCE.getAnalogues();

		/**
		 * The meta object literal for the '{@link targets.configdesk.wired.impl.AnalogueImpl <em>Analogue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.configdesk.wired.impl.AnalogueImpl
		 * @see targets.configdesk.wired.impl.WiredPackageImpl#getAnalogue()
		 * @generated
		 */
		EClass ANALOGUE = eINSTANCE.getAnalogue();

		/**
		 * The meta object literal for the '{@link targets.configdesk.wired.impl.DigitalsImpl <em>Digitals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.configdesk.wired.impl.DigitalsImpl
		 * @see targets.configdesk.wired.impl.WiredPackageImpl#getDigitals()
		 * @generated
		 */
		EClass DIGITALS = eINSTANCE.getDigitals();

		/**
		 * The meta object literal for the '{@link targets.configdesk.wired.impl.DigitalImpl <em>Digital</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see targets.configdesk.wired.impl.DigitalImpl
		 * @see targets.configdesk.wired.impl.WiredPackageImpl#getDigital()
		 * @generated
		 */
		EClass DIGITAL = eINSTANCE.getDigital();

	}

} //WiredPackage
