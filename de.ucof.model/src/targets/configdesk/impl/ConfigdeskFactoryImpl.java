/**
 */
package targets.configdesk.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import targets.configdesk.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigdeskFactoryImpl extends EFactoryImpl implements ConfigdeskFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConfigdeskFactory init() {
		try {
			ConfigdeskFactory theConfigdeskFactory = (ConfigdeskFactory)EPackage.Registry.INSTANCE.getEFactory(ConfigdeskPackage.eNS_URI);
			if (theConfigdeskFactory != null) {
				return theConfigdeskFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConfigdeskFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigdeskFactoryImpl() {
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
			case ConfigdeskPackage.CONFIGURATION_DESK: return createConfigurationDesk();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationDesk createConfigurationDesk() {
		ConfigurationDeskImpl configurationDesk = new ConfigurationDeskImpl();
		return configurationDesk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigdeskPackage getConfigdeskPackage() {
		return (ConfigdeskPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConfigdeskPackage getPackage() {
		return ConfigdeskPackage.eINSTANCE;
	}

} //ConfigdeskFactoryImpl
