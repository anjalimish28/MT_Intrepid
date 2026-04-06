/**
 */
package ucof.devices.devicetypes.a653components;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ucof.devices.devicetypes.a653components.A653componentsPackage
 * @generated
 */
public interface A653componentsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	A653componentsFactory eINSTANCE = ucof.devices.devicetypes.a653components.impl.A653componentsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Module Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Schedule</em>'.
	 * @generated
	 */
	ModuleSchedule createModuleSchedule();

	/**
	 * Returns a new object of class '<em>Memory Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory Region</em>'.
	 * @generated
	 */
	MemoryRegion createMemoryRegion();

	/**
	 * Returns a new object of class '<em>Partition Time Window</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partition Time Window</em>'.
	 * @generated
	 */
	PartitionTimeWindow createPartitionTimeWindow();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	A653componentsPackage getA653componentsPackage();

} //A653componentsFactory
