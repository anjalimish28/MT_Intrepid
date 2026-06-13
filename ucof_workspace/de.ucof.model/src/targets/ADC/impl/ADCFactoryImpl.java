/**
 */
package targets.adc.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import targets.adc.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdcFactoryImpl extends EFactoryImpl implements AdcFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AdcFactory init() {
		try {
			AdcFactory theAdcFactory = (AdcFactory)EPackage.Registry.INSTANCE.getEFactory(AdcPackage.eNS_URI);
			if (theAdcFactory != null) {
				return theAdcFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AdcFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdcFactoryImpl() {
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
			case AdcPackage.ADS1115: return createads1115();
			case AdcPackage.ADC_PORTS: return createadcPorts();
			case AdcPackage.ADC_PORT: return createadcPort();
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
	public AdcPackage getAdcPackage() {
		return (AdcPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AdcPackage getPackage() {
		return AdcPackage.eINSTANCE;
	}

} //AdcFactoryImpl
