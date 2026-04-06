/**
 */
package targets.ADC.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import targets.ADC.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ADCFactoryImpl extends EFactoryImpl implements ADCFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ADCFactory init() {
		try {
			ADCFactory theADCFactory = (ADCFactory)EPackage.Registry.INSTANCE.getEFactory(ADCPackage.eNS_URI);
			if (theADCFactory != null) {
				return theADCFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ADCFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADCFactoryImpl() {
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
			case ADCPackage.ADS1115: return createads1115();
			case ADCPackage.ADC_PORTS: return createadcPorts();
			case ADCPackage.ADC_PORT: return createadcPort();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ads1115 createads1115() {
		ads1115Impl ads1115 = new ads1115Impl();
		return ads1115;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public adcPorts createadcPorts() {
		adcPortsImpl adcPorts = new adcPortsImpl();
		return adcPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public adcPort createadcPort() {
		adcPortImpl adcPort = new adcPortImpl();
		return adcPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADCPackage getADCPackage() {
		return (ADCPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ADCPackage getPackage() {
		return ADCPackage.eINSTANCE;
	}

} //ADCFactoryImpl
