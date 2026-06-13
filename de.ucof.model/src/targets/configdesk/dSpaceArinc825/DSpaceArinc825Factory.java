/**
 */
package targets.configdesk.dSpaceArinc825;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see targets.configdesk.dSpaceArinc825.DSpaceArinc825Package
 * @generated
 */
public interface DSpaceArinc825Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DSpaceArinc825Factory eINSTANCE = targets.configdesk.dSpaceArinc825.impl.DSpaceArinc825FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>A825 Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>A825 Configuration</em>'.
	 * @generated
	 */
	A825Configuration createA825Configuration();

	/**
	 * Returns a new object of class '<em>Signal Model Access Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal Model Access Status</em>'.
	 * @generated
	 */
	SignalModelAccessStatus createSignalModelAccessStatus();

	/**
	 * Returns a new object of class '<em>Feature Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Trigger</em>'.
	 * @generated
	 */
	FeatureTrigger createFeatureTrigger();

	/**
	 * Returns a new object of class '<em>Feature Cyclic Timing Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Cyclic Timing Control</em>'.
	 * @generated
	 */
	FeatureCyclicTimingControl createFeatureCyclicTimingControl();

	/**
	 * Returns a new object of class '<em>Feature Raw Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Raw Data</em>'.
	 * @generated
	 */
	FeatureRawData createFeatureRawData();

	/**
	 * Returns a new object of class '<em>Feature Enable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Enable</em>'.
	 * @generated
	 */
	FeatureEnable createFeatureEnable();

	/**
	 * Returns a new object of class '<em>Feature Frame Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Frame Access</em>'.
	 * @generated
	 */
	FeatureFrameAccess createFeatureFrameAccess();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DSpaceArinc825Package getDSpaceArinc825Package();

} //DSpaceArinc825Factory
