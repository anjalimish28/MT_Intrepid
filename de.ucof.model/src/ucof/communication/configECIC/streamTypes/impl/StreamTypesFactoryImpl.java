/**
 */
package ucof.communication.configECIC.streamTypes.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ucof.communication.configECIC.streamTypes.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StreamTypesFactoryImpl extends EFactoryImpl implements StreamTypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StreamTypesFactory init() {
		try {
			StreamTypesFactory theStreamTypesFactory = (StreamTypesFactory)EPackage.Registry.INSTANCE.getEFactory(StreamTypesPackage.eNS_URI);
			if (theStreamTypesFactory != null) {
				return theStreamTypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StreamTypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamTypesFactoryImpl() {
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
			case StreamTypesPackage.A429_STREAM: return createA429Stream();
			case StreamTypesPackage.A825_STREAM: return createA825Stream();
			case StreamTypesPackage.A664_STREAM: return createA664Stream();
			case StreamTypesPackage.ETH_STREAM: return createETHStream();
			case StreamTypesPackage.DIS_STREAM: return createDISStream();
			case StreamTypesPackage.ANA_STREAM: return createANAStream();
			case StreamTypesPackage.NAD_STREAM: return createNADStream();
			case StreamTypesPackage.DATA_TIMESTAMP: return createDataTimestamp();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A429Stream createA429Stream() {
		A429StreamImpl a429Stream = new A429StreamImpl();
		return a429Stream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A825Stream createA825Stream() {
		A825StreamImpl a825Stream = new A825StreamImpl();
		return a825Stream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public A664Stream createA664Stream() {
		A664StreamImpl a664Stream = new A664StreamImpl();
		return a664Stream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETHStream createETHStream() {
		ETHStreamImpl ethStream = new ETHStreamImpl();
		return ethStream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DISStream createDISStream() {
		DISStreamImpl disStream = new DISStreamImpl();
		return disStream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ANAStream createANAStream() {
		ANAStreamImpl anaStream = new ANAStreamImpl();
		return anaStream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NADStream createNADStream() {
		NADStreamImpl nadStream = new NADStreamImpl();
		return nadStream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTimestamp createDataTimestamp() {
		DataTimestampImpl dataTimestamp = new DataTimestampImpl();
		return dataTimestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamTypesPackage getStreamTypesPackage() {
		return (StreamTypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StreamTypesPackage getPackage() {
		return StreamTypesPackage.eINSTANCE;
	}

} //StreamTypesFactoryImpl
