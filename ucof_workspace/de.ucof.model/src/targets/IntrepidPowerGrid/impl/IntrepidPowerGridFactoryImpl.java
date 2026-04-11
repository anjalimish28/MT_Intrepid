/**
 */
package targets.IntrepidPowerGrid.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import targets.IntrepidPowerGrid.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntrepidPowerGridFactoryImpl extends EFactoryImpl implements IntrepidPowerGridFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntrepidPowerGridFactory init() {
		try {
			IntrepidPowerGridFactory theIntrepidPowerGridFactory = (IntrepidPowerGridFactory)EPackage.Registry.INSTANCE.getEFactory(IntrepidPowerGridPackage.eNS_URI);
			if (theIntrepidPowerGridFactory != null) {
				return theIntrepidPowerGridFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntrepidPowerGridFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntrepidPowerGridFactoryImpl() {
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
			case IntrepidPowerGridPackage.INTREPID_ELECTRICAL_GRID: return createintrepidElectricalGrid();
			case IntrepidPowerGridPackage.INTREPID_ELECTRICAL_INTERFACE: return createintrepidElectricalInterface();
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
	public IntrepidPowerGridPackage getIntrepidPowerGridPackage() {
		return (IntrepidPowerGridPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IntrepidPowerGridPackage getPackage() {
		return IntrepidPowerGridPackage.eINSTANCE;
	}

} //IntrepidPowerGridFactoryImpl
