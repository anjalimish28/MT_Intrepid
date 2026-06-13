/**
 */
package ucof.communication.basedonwired.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ucof.communication.basedonwired.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasedonwiredFactoryImpl extends EFactoryImpl implements BasedonwiredFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasedonwiredFactory init() {
		try {
			BasedonwiredFactory theBasedonwiredFactory = (BasedonwiredFactory)EPackage.Registry.INSTANCE.getEFactory(BasedonwiredPackage.eNS_URI);
			if (theBasedonwiredFactory != null) {
				return theBasedonwiredFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BasedonwiredFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasedonwiredFactoryImpl() {
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
			case BasedonwiredPackage.WIRED_INTERFACES: return createWiredInterfaces();
			case BasedonwiredPackage.ANALOGUE: return createAnalogue();
			case BasedonwiredPackage.DISCRETE: return createDiscrete();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiredInterfaces createWiredInterfaces() {
		WiredInterfacesImpl wiredInterfaces = new WiredInterfacesImpl();
		return wiredInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Analogue createAnalogue() {
		AnalogueImpl analogue = new AnalogueImpl();
		return analogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Discrete createDiscrete() {
		DiscreteImpl discrete = new DiscreteImpl();
		return discrete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasedonwiredPackage getBasedonwiredPackage() {
		return (BasedonwiredPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BasedonwiredPackage getPackage() {
		return BasedonwiredPackage.eINSTANCE;
	}

} //BasedonwiredFactoryImpl
