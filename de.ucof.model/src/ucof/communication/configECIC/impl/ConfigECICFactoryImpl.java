/**
 */
package ucof.communication.configECIC.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ucof.communication.configECIC.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigECICFactoryImpl extends EFactoryImpl implements ConfigECICFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConfigECICFactory init() {
		try {
			ConfigECICFactory theConfigECICFactory = (ConfigECICFactory)EPackage.Registry.INSTANCE.getEFactory(ConfigECICPackage.eNS_URI);
			if (theConfigECICFactory != null) {
				return theConfigECICFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConfigECICFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigECICFactoryImpl() {
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
			case ConfigECICPackage.ED247_CONFIGURATIONS: return createED247Configurations();
			case ConfigECICPackage.ED247_CONFIGURATION: return createED247Configuration();
			case ConfigECICPackage.FILE_PRODUCER: return createFileProducer();
			case ConfigECICPackage.CHANNELS: return createChannels();
			case ConfigECICPackage.CHANNEL: return createChannel();
			case ConfigECICPackage.COM_INTERFACE: return createComInterface();
			case ConfigECICPackage.UDP_SOCKETS: return createUDPSockets();
			case ConfigECICPackage.UDP_SOCKET: return createUDPSocket();
			case ConfigECICPackage.SRC_DIRECTION_EXTENSION: return createsrcDirectionExtension();
			case ConfigECICPackage.HEADER: return createHeader();
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
			case ConfigECICPackage.STANDARD_REVISION_TYPE:
				return createStandardRevisionTypeFromString(eDataType, initialValue);
			case ConfigECICPackage.COMPONENT_TYPE_TYPE:
				return createComponentTypeTypeFromString(eDataType, initialValue);
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
			case ConfigECICPackage.STANDARD_REVISION_TYPE:
				return convertStandardRevisionTypeToString(eDataType, instanceValue);
			case ConfigECICPackage.COMPONENT_TYPE_TYPE:
				return convertComponentTypeTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ED247Configurations createED247Configurations() {
		ED247ConfigurationsImpl ed247Configurations = new ED247ConfigurationsImpl();
		return ed247Configurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ED247Configuration createED247Configuration() {
		ED247ConfigurationImpl ed247Configuration = new ED247ConfigurationImpl();
		return ed247Configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileProducer createFileProducer() {
		FileProducerImpl fileProducer = new FileProducerImpl();
		return fileProducer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channels createChannels() {
		ChannelsImpl channels = new ChannelsImpl();
		return channels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel createChannel() {
		ChannelImpl channel = new ChannelImpl();
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComInterface createComInterface() {
		ComInterfaceImpl comInterface = new ComInterfaceImpl();
		return comInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UDPSockets createUDPSockets() {
		UDPSocketsImpl udpSockets = new UDPSocketsImpl();
		return udpSockets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UDPSocket createUDPSocket() {
		UDPSocketImpl udpSocket = new UDPSocketImpl();
		return udpSocket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public srcDirectionExtension createsrcDirectionExtension() {
		srcDirectionExtensionImpl srcDirectionExtension = new srcDirectionExtensionImpl();
		return srcDirectionExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Header createHeader() {
		HeaderImpl header = new HeaderImpl();
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardRevisionType createStandardRevisionTypeFromString(EDataType eDataType, String initialValue) {
		StandardRevisionType result = StandardRevisionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStandardRevisionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentTypeType createComponentTypeTypeFromString(EDataType eDataType, String initialValue) {
		ComponentTypeType result = ComponentTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComponentTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigECICPackage getConfigECICPackage() {
		return (ConfigECICPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConfigECICPackage getPackage() {
		return ConfigECICPackage.eINSTANCE;
	}

} //ConfigECICFactoryImpl
