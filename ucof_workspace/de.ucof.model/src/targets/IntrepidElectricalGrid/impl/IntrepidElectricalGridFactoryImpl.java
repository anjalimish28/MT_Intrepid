/**
 */
package targets.IntrepidElectricalGrid.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import targets.IntrepidElectricalGrid.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntrepidElectricalGridFactoryImpl extends EFactoryImpl implements IntrepidElectricalGridFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntrepidElectricalGridFactory init() {
		try {
			IntrepidElectricalGridFactory theIntrepidElectricalGridFactory = (IntrepidElectricalGridFactory)EPackage.Registry.INSTANCE.getEFactory(IntrepidElectricalGridPackage.eNS_URI);
			if (theIntrepidElectricalGridFactory != null) {
				return theIntrepidElectricalGridFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntrepidElectricalGridFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntrepidElectricalGridFactoryImpl() {
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
			case IntrepidElectricalGridPackage.INTREPID_ELECTRICAL_GRID: return createintrepidElectricalGrid();
			case IntrepidElectricalGridPackage.INTREPID_ELECTRICAL_INTERFACE: return createintrepidElectricalInterface();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public intrepidElectricalGrid createintrepidElectricalGrid() {
		intrepidElectricalGridImpl intrepidElectricalGrid = new intrepidElectricalGridImpl();
		return intrepidElectricalGrid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public intrepidElectricalInterface createintrepidElectricalInterface() {
		intrepidElectricalInterfaceImpl intrepidElectricalInterface = new intrepidElectricalInterfaceImpl();
		return intrepidElectricalInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntrepidElectricalGridPackage getIntrepidElectricalGridPackage() {
		return (IntrepidElectricalGridPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IntrepidElectricalGridPackage getPackage() {
		return IntrepidElectricalGridPackage.eINSTANCE;
	}

} //IntrepidElectricalGridFactoryImpl
