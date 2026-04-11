/**
 */
package targets.powergrid.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import targets.powergrid.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PowergridFactoryImpl extends EFactoryImpl implements PowergridFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PowergridFactory init() {
		try {
			PowergridFactory thePowergridFactory = (PowergridFactory)EPackage.Registry.INSTANCE.getEFactory(PowergridPackage.eNS_URI);
			if (thePowergridFactory != null) {
				return thePowergridFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PowergridFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowergridFactoryImpl() {
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
			case PowergridPackage.ELETRCIAL_INTERFACES: return createEletrcialInterfaces();
			case PowergridPackage.POWER_CONNECTION_SET: return createPowerConnectionSet();
			case PowergridPackage.POWER_CONNECTION: return createPowerConnection();
			case PowergridPackage.ELECTRICAL_POWER_GRID_SET: return createElectricalPowerGridSet();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PowergridPackage.INTERFACE_TYPE:
				return createinterfaceTypeFromString(eDataType, initialValue);
			case PowergridPackage.GRID_TYPE:
				return creategridTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PowergridPackage.INTERFACE_TYPE:
				return convertinterfaceTypeToString(eDataType, instanceValue);
			case PowergridPackage.GRID_TYPE:
				return convertgridTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EletrcialInterfaces createEletrcialInterfaces() {
		EletrcialInterfacesImpl eletrcialInterfaces = new EletrcialInterfacesImpl();
		return eletrcialInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerConnectionSet createPowerConnectionSet() {
		PowerConnectionSetImpl powerConnectionSet = new PowerConnectionSetImpl();
		return powerConnectionSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerConnection createPowerConnection() {
		PowerConnectionImpl powerConnection = new PowerConnectionImpl();
		return powerConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricalPowerGridSet createElectricalPowerGridSet() {
		ElectricalPowerGridSetImpl electricalPowerGridSet = new ElectricalPowerGridSetImpl();
		return electricalPowerGridSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interfaceType createinterfaceTypeFromString(EDataType eDataType, String initialValue) {
		interfaceType result = interfaceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertinterfaceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gridType creategridTypeFromString(EDataType eDataType, String initialValue) {
		gridType result = gridType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertgridTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowergridPackage getPowergridPackage() {
		return (PowergridPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PowergridPackage getPackage() {
		return PowergridPackage.eINSTANCE;
	}

} //PowergridFactoryImpl
