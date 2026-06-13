/**
 */
package targets.matlab.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import targets.matlab.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MatlabFactoryImpl extends EFactoryImpl implements MatlabFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MatlabFactory init() {
		try {
			MatlabFactory theMatlabFactory = (MatlabFactory)EPackage.Registry.INSTANCE.getEFactory(MatlabPackage.eNS_URI);
			if (theMatlabFactory != null) {
				return theMatlabFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MatlabFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatlabFactoryImpl() {
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
			case MatlabPackage.SIMULINK_PROJECT: return createSimulinkProject();
			case MatlabPackage.SIMULINK_BLOCK: return createSimulinkBlock();
			case MatlabPackage.SIMULINK_LIBRARY: return createSimulinkLibrary();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulinkProject createSimulinkProject() {
		SimulinkProjectImpl simulinkProject = new SimulinkProjectImpl();
		return simulinkProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulinkBlock createSimulinkBlock() {
		SimulinkBlockImpl simulinkBlock = new SimulinkBlockImpl();
		return simulinkBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulinkLibrary createSimulinkLibrary() {
		SimulinkLibraryImpl simulinkLibrary = new SimulinkLibraryImpl();
		return simulinkLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatlabPackage getMatlabPackage() {
		return (MatlabPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MatlabPackage getPackage() {
		return MatlabPackage.eINSTANCE;
	}

} //MatlabFactoryImpl
