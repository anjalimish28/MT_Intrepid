/**
 */
package targets.avip;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see targets.avip.AvipPackage
 * @generated
 */
public interface AvipFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AvipFactory eINSTANCE = targets.avip.impl.AvipFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Avionics Virtual Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Avionics Virtual Device</em>'.
	 * @generated
	 */
	AvionicsVirtualDevice createAvionicsVirtualDevice();

	/**
	 * Returns a new object of class '<em>AVD Ports</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AVD Ports</em>'.
	 * @generated
	 */
	AVDPorts createAVDPorts();

	/**
	 * Returns a new object of class '<em>Functional Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Data</em>'.
	 * @generated
	 */
	FunctionalData createFunctionalData();

	/**
	 * Returns a new object of class '<em>Analogue Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analogue Input</em>'.
	 * @generated
	 */
	AnalogueInput createAnalogueInput();

	/**
	 * Returns a new object of class '<em>Analogue Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analogue Output</em>'.
	 * @generated
	 */
	AnalogueOutput createAnalogueOutput();

	/**
	 * Returns a new object of class '<em>Discrete Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discrete Input</em>'.
	 * @generated
	 */
	DiscreteInput createDiscreteInput();

	/**
	 * Returns a new object of class '<em>Discrete Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discrete Output</em>'.
	 * @generated
	 */
	DiscreteOutput createDiscreteOutput();

	/**
	 * Returns a new object of class '<em>XTalk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XTalk</em>'.
	 * @generated
	 */
	XTalk createXTalk();

	/**
	 * Returns a new object of class '<em>A429</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>A429</em>'.
	 * @generated
	 */
	A429 createA429();

	/**
	 * Returns a new object of class '<em>A664</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>A664</em>'.
	 * @generated
	 */
	A664 createA664();

	/**
	 * Returns a new object of class '<em>CAN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CAN</em>'.
	 * @generated
	 */
	CAN createCAN();

	/**
	 * Returns a new object of class '<em>MEM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MEM</em>'.
	 * @generated
	 */
	MEM createMEM();

	/**
	 * Returns a new object of class '<em>VRTD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VRTD</em>'.
	 * @generated
	 */
	V_RTD createV_RTD();

	/**
	 * Returns a new object of class '<em>Port User Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port User Configuration</em>'.
	 * @generated
	 */
	PortUserConfiguration createPortUserConfiguration();

	/**
	 * Returns a new object of class '<em>AVD Scheduler Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AVD Scheduler Extension</em>'.
	 * @generated
	 */
	AVDSchedulerExtension createAVDSchedulerExtension();

	/**
	 * Returns a new object of class '<em>Signal Extensions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal Extensions</em>'.
	 * @generated
	 */
	SignalExtensions createSignalExtensions();

	/**
	 * Returns a new object of class '<em>Signal Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal Extension</em>'.
	 * @generated
	 */
	SignalExtension createSignalExtension();

	/**
	 * Returns a new object of class '<em>MEM Port ID Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MEM Port ID Extension</em>'.
	 * @generated
	 */
	MEMPortIDExtension createMEMPortIDExtension();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AvipPackage getAvipPackage();

} //AvipFactory
