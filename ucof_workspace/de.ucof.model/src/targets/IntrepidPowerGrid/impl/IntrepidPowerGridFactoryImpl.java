/**
 */
package targets.intrepidpowergrid.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import targets.intrepidpowergrid.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntrepidpowergridFactoryImpl extends EFactoryImpl implements IntrepidpowergridFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntrepidpowergridFactory init() {
		try {
			IntrepidpowergridFactory theIntrepidpowergridFactory = (IntrepidpowergridFactory)EPackage.Registry.INSTANCE.getEFactory(IntrepidpowergridPackage.eNS_URI);
			if (theIntrepidpowergridFactory != null) {
				return theIntrepidpowergridFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntrepidpowergridFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntrepidpowergridFactoryImpl() {
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
			case IntrepidpowergridPackage.INTREPID_ELECTRICAL_GRID: return createintrepidElectricalGrid();
			case IntrepidpowergridPackage.INTREPID_ELECTRICAL_INTERFACE: return createintrepidElectricalInterface();
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
	public IntrepidpowergridPackage getIntrepidpowergridPackage() {
		return (IntrepidpowergridPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IntrepidpowergridPackage getPackage() {
		return IntrepidpowergridPackage.eINSTANCE;
	}

} //IntrepidpowergridFactoryImpl
